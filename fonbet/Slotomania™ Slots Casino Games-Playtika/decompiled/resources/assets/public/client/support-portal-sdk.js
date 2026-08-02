/*!  
    Support Portal SDK
    Version: 1.2.3
    Build time: Thu, 28 May 2026 19:47:31 GMT  
*/
var supportPortalSdk = (function (exports) {
  'use strict';

  /******************************************************************************
  Copyright (c) Microsoft Corporation.

  Permission to use, copy, modify, and/or distribute this software for any
  purpose with or without fee is hereby granted.

  THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
  REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
  AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
  INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
  LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
  OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
  PERFORMANCE OF THIS SOFTWARE.
  ***************************************************************************** */
  /* global Reflect, Promise, SuppressedError, Symbol, Iterator */


  function __awaiter(thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
  }

  typeof SuppressedError === "function" ? SuppressedError : function (error, suppressed, message) {
    var e = new Error(message);
    return e.name = "SuppressedError", e.error = error, e.suppressed = suppressed, e;
  };

  /**
   * Log levels for SDK logging
   */
  exports.LogLevel = void 0;
  (function (LogLevel) {
      LogLevel[LogLevel["None"] = 0] = "None";
      LogLevel[LogLevel["Debug"] = 1] = "Debug";
      LogLevel[LogLevel["Info"] = 2] = "Info";
      LogLevel[LogLevel["Warning"] = 3] = "Warning";
      LogLevel[LogLevel["Error"] = 4] = "Error";
  })(exports.LogLevel || (exports.LogLevel = {}));

  /**
   * Static logging utility class
   */
  class Log {
      static warning(message, ...args) {
          Log.logInternal(exports.LogLevel.Warning, message, ...args);
      }
      static info(message, ...args) {
          Log.logInternal(exports.LogLevel.Info, message, ...args);
      }
      static debug(message, ...args) {
          Log.logInternal(exports.LogLevel.Debug, message, ...args);
      }
      static error(message, ...args) {
          Log.logInternal(exports.LogLevel.Error, message, ...args);
      }
      static logInternal(logLevel, message, ...args) {
          if (Log.handler !== null)
              Log.handler.log(logLevel, message, ...args);
      }
  }
  Log.handler = null;

  /**
   * Represents a general Support Portal SDK error
   */
  class SupportPortalError extends Error {
      constructor(message, innerError) {
          super(message);
          this.innerError = innerError;
          this.name = 'SupportPortalError';
      }
  }

  /**
   * Represents an error indicating that something went wrong while initializing the SDK
   */
  class InitializeSupportPortalError extends SupportPortalError {
      constructor(innerError) {
          super('Failed to initialize Support Portal.', innerError);
          this.innerError = innerError;
          this.name = 'InitializeSupportPortalError';
      }
  }

  /**
   * Default params transport option
   */
  const DEFAULT_PARAMS_TRANSPORT = 'postMessage';

  /**
   * Get session token from string or function
   */
  function getSessionToken(sessionToken) {
      if (typeof sessionToken === 'string') {
          return sessionToken;
      }
      if (typeof sessionToken === 'function') {
          return sessionToken();
      }
      throw Error("Can't get session token");
  }

  // Query parameter constants
  const SESSION_TOKEN = 'sessionToken';
  const API_HOST = 'apiHost';
  const LANGUAGE = 'lang';
  const PARAMS_TRANSPORT = 'paramsTransport';
  const POPUP_ID = 'popupId';
  const RANDOM_SEED = 'rnd';

  /**
   * URL builder utility class
   */
  class UrlBuilder {
      constructor(baseUrl) {
          this.baseUrl = baseUrl;
          this.params = new Map();
      }
      withParam(key, value) {
          this.params.set(key, value);
          return this;
      }
      withParamIfNotNull(key, value) {
          if (value !== undefined && value !== null && value !== '') {
              this.params.set(key, value);
          }
          return this;
      }
      withParams(queryParams) {
          for (const [key, value] of queryParams.entries()) {
              this.withParam(key, value);
          }
          return this;
      }
      withParamsIfNotNull(queryParams) {
          if (queryParams) {
              for (const [key, value] of queryParams.entries()) {
                  this.withParamIfNotNull(key, value);
              }
          }
          return this;
      }
      getUrl() {
          if (this.params.size === 0) {
              return this.baseUrl;
          }
          let result = this.baseUrl;
          let index = 0;
          for (const [key, value] of this.params.entries()) {
              result += index === 0 ? '?' : '&';
              result += `${encodeURIComponent(key)}=${encodeURIComponent(value)}`;
              index += 1;
          }
          return result;
      }
  }

  /**
   * URI resolver for Support Portal URLs
   */
  class UriResolver {
      constructor(options) {
          var _a;
          this.options = options;
          this.paramsTransport = (_a = options.paramsTransport) !== null && _a !== void 0 ? _a : DEFAULT_PARAMS_TRANSPORT;
      }
      /**
       * Get URL with query parameters based on paramsTransport option
       */
      getUrl(popupId, extraQueryParams) {
          const urlBuilder = new UrlBuilder(this.options.portalUrl);
          // Always add random seed to prevent caching
          urlBuilder.withParam(RANDOM_SEED, this.generateRandomSeed());
          // If using URL parameters transport, add all params to URL
          if (this.paramsTransport === 'url') {
              urlBuilder.withParam(SESSION_TOKEN, getSessionToken(this.options.sessionToken));
              urlBuilder.withParam(API_HOST, this.options.apiGatewayUrl);
              urlBuilder.withParamIfNotNull(LANGUAGE, this.options.language);
              urlBuilder.withParam(PARAMS_TRANSPORT, this.paramsTransport);
              // Add custom parameters
              if (this.options.customParameters) {
                  urlBuilder.withParams(this.options.customParameters);
              }
          }
          else {
              // For postMessage transport, only add paramsTransport to URL
              urlBuilder.withParam(PARAMS_TRANSPORT, this.paramsTransport);
          }
          // Add popup ID if provided
          if (popupId) {
              urlBuilder.withParam(POPUP_ID, popupId);
          }
          // Add extra query params
          if (extraQueryParams) {
              urlBuilder.withParams(extraQueryParams);
          }
          return urlBuilder.getUrl();
      }
      /**
       * Generate random seed for cache busting
       */
      generateRandomSeed() {
          return Math.random().toString(36).substring(2, 15) +
              Math.random().toString(36).substring(2, 15);
      }
      /**
       * Check if parameters should be sent via postMessage
       */
      shouldSendParamsViaPostMessage() {
          return this.paramsTransport === 'postMessage';
      }
      /**
       * Get params transport option
       */
      getParamsTransport() {
          return this.paramsTransport;
      }
  }

  /**
   * Get HTML element from container parameter
   */
  function getPortalContainer(portalContainer) {
      if (typeof portalContainer === 'string') {
          const htmlElement = document.querySelector(portalContainer);
          if (htmlElement === null) {
              throw new SupportPortalError(`Element not found (document.querySelector('${portalContainer}')).`);
          }
          return htmlElement;
      }
      if (portalContainer instanceof HTMLElement) {
          return portalContainer;
      }
      return document.body;
  }

  /**
   * Represents an error from the client application/widget
   */
  class ClientAppSupportPortalError extends SupportPortalError {
      constructor(message, innerError) {
          super(message, innerError);
          this.name = 'ClientAppSupportPortalError';
      }
  }

  /**
   * Action types for messages between Widget and SDK
   */
  exports.ActionType = void 0;
  (function (ActionType) {
      // Widget -> SDK events
      ActionType["READY"] = "READY";
      ActionType["LOADED"] = "LOADED";
      ActionType["EXIT_CODE"] = "EXIT_CODE";
      ActionType["DEEPLINK_CLICK"] = "DEEPLINK_CLICK";
      ActionType["HIDE_CLOSE_BUTTON"] = "HIDE_CLOSE_BUTTON";
      ActionType["SHOW_CLOSE_BUTTON"] = "SHOW_CLOSE_BUTTON";
      ActionType["MINIMIZE"] = "MINIMIZE";
      // SDK -> Widget events
      ActionType["SET_PARAMS"] = "SET_PARAMS";
  })(exports.ActionType || (exports.ActionType = {}));
  /**
   * Constants for sender values
   */
  const WIDGET_SENDER = 'support-portal-widget';
  const SDK_SENDER = 'support-portal-sdk';
  // Type guards
  /**
   * Type guard to check if a value is a valid FrameMessage
   */
  function isFrameMessage(value) {
      return (typeof value === 'object' &&
          value !== null &&
          'action' in value &&
          'sender' in value &&
          typeof value.action === 'string' &&
          typeof value.sender === 'string');
  }
  /**
   * Type guard to check if a message is from the widget
   */
  function isWidgetMessage(value) {
      return isFrameMessage(value) && value.sender === WIDGET_SENDER;
  }
  /**
   * Type guard to check if a payload is an ExitCodePayload
   */
  function isExitCodePayload(value) {
      return (typeof value === 'object' &&
          value !== null &&
          'status' in value &&
          'code' in value &&
          typeof value.status === 'string' &&
          typeof value.code === 'number');
  }
  /**
   * Type guard to check if a payload is a DeeplinkPayload
   */
  function isDeeplinkPayload(value) {
      return (typeof value === 'object' &&
          value !== null &&
          'deeplink' in value &&
          typeof value.deeplink === 'string');
  }
  /**
   * Type guard to check if a payload is a MinimizePayload
   */
  function isMinimizePayload(value) {
      return (typeof value === 'object' &&
          value !== null &&
          'supportSessionId' in value &&
          'target' in value &&
          'endTime' in value &&
          typeof value.supportSessionId === 'string' &&
          typeof value.target === 'string' &&
          typeof value.endTime === 'number');
  }

  /**
   * Block click events from passing through to underlying elements
   */
  function blockClickThrough(elementArg) {
      const element = elementArg;
      const blockEvent = (e) => {
          e.stopPropagation();
      };
      element.onmousedown = blockEvent;
      element.onmouseenter = blockEvent;
      element.onmouseleave = blockEvent;
      element.onmousemove = blockEvent;
      element.onmouseout = blockEvent;
      element.onmouseover = blockEvent;
      element.onmouseup = blockEvent;
      element.ontouchcancel = blockEvent;
      element.ontouchend = blockEvent;
      element.ontouchmove = blockEvent;
      element.ontouchstart = blockEvent;
  }

  /**
   * HTML helper for creating frame UI elements
   */
  class HtmlFrameHelper {
      constructor(templateOptions) {
          this.templateOptions = templateOptions;
      }
      /**
       * Create close button element
       */
      createCloseButton() {
          var _a;
          const closeButton = document.createElement('a');
          const svg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
          closeButton.appendChild(svg);
          svg.outerHTML = '<svg viewBox="64 64 896 896" focusable="false" data-icon="close" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M563.8 512l262.5-312.9c4.4-5.2.7-13.1-6.1-13.1h-79.8c-4.7 0-9.2 2.1-12.3 5.7L511.6 449.8 295.1 191.7c-3-3.6-7.5-5.7-12.3-5.7H203c-6.8 0-10.5 7.9-6.1 13.1L459.4 512 196.9 824.9A7.95 7.95 0 00203 838h79.8c4.7 0 9.2-2.1 12.3-5.7l216.5-258.1 216.5 258.1c3 3.6 7.5 5.7 12.3 5.7h79.8c6.8 0 10.5-7.9 6.1-13.1L563.8 512z"></path></svg>';
          closeButton.setAttribute('style', 'position:absolute; cursor:pointer; display:flex; align-items:center; justify-content:center; ' +
              'right:12px; top:12px; color:#333; font-size:20px; width:32px; height:32px; ' +
              'background-color:rgba(255,255,255,0.9); border-radius:50%; transition:all 0.2s; z-index:10001;');
          // Add hover effects
          closeButton.onmouseenter = () => {
              closeButton.style.backgroundColor = 'rgba(0,0,0,0.1)';
              closeButton.style.transform = 'scale(1.1)';
          };
          closeButton.onmouseleave = () => {
              closeButton.style.backgroundColor = 'rgba(255,255,255,0.9)';
              closeButton.style.transform = 'scale(1)';
          };
          return HtmlFrameHelper.getActualHtmlElement(closeButton, (_a = this.templateOptions) === null || _a === void 0 ? void 0 : _a.onCloseButtonShow);
      }
      static getActualHtmlElement(currentElement, templateCallback) {
          if (templateCallback !== undefined) {
              const newElement = templateCallback(currentElement);
              if (newElement != null) {
                  return newElement;
              }
          }
          return currentElement;
      }
      /**
       * Create the frame view containers (overlay and portal window)
       */
      createFrameView() {
          var _a, _b;
          const overlayContainer = HtmlFrameHelper.getActualHtmlElement(HtmlFrameHelper.getDivElement(HtmlFrameHelper.OVERLAY_STYLE), (_a = this.templateOptions) === null || _a === void 0 ? void 0 : _a.onOverlayShow);
          const portalWindow = HtmlFrameHelper.getActualHtmlElement(HtmlFrameHelper.getDivElement(HtmlFrameHelper.PORTAL_WINDOW_STYLE), (_b = this.templateOptions) === null || _b === void 0 ? void 0 : _b.onPortalWindowShow);
          blockClickThrough(overlayContainer);
          overlayContainer.appendChild(portalWindow);
          return { overlayContainer, portalWindow };
      }
      static getDivElement(containerStyle) {
          const parent = document.createElement('div');
          parent.setAttribute('style', containerStyle);
          return parent;
      }
      /**
       * Create iframe element
       */
      static createIFrameElement(url) {
          const iframe = document.createElement('iframe');
          iframe.setAttribute('style', 'width:100%; height:100%; border-width:0px; visibility:hidden; border-radius:8px;');
          iframe.src = url;
          iframe.allow = 'clipboard-read; clipboard-write';
          return iframe;
      }
  }
  HtmlFrameHelper.OVERLAY_STYLE = 'position:fixed; top:0px; left:0px; width:100%; height:100%; ' +
      'padding:0px; margin:0px; background-color: rgba(0,0,0,0.8); z-index:9999;';
  HtmlFrameHelper.PORTAL_WINDOW_STYLE = 'position:absolute; width:90%; height:90%; max-width:900px; max-height:700px; ' +
      'margin:auto; top:50%; left:50%; transform:translate(-50%, -50%); ' +
      'background-color:#fff; border-radius:8px; overflow:hidden;';

  /**
   * Represents an iframe element for the Support Portal
   */
  class Frame {
      get element() {
          if (this.iframeElement === null) {
              this.iframeElement = HtmlFrameHelper.createIFrameElement(this.url);
              this.iframeElement.onerror = this.onErrorCallback;
          }
          return this.iframeElement;
      }
      constructor(url, onErrorCallback) {
          this.url = url;
          this.onErrorCallback = onErrorCallback;
          this.iframeElement = null;
      }
      /**
       * Make the iframe visible
       */
      show() {
          this.element.style.visibility = 'visible';
      }
      /**
       * Get the content window for postMessage
       */
      getContentWindow() {
          return this.element.contentWindow;
      }
  }

  /**
   * Controller for managing the Support Portal iframe
   */
  class FrameController {
      get isOpened() {
          return this.portalContainer.contains(this.overlayContainer);
      }
      constructor(url, portalContainer, callbacks, templateOptions) {
          this.portalContainer = portalContainer;
          this.callbacks = callbacks;
          this.templateOptions = templateOptions;
          this.setParamsPayload = null;
          this.isWidgetReady = false;
          this.frame = new Frame(url, this.onIFrameError.bind(this));
          this.htmlHelper = new HtmlFrameHelper(this.templateOptions);
          this.onMessageReceived = this.onMessageReceived.bind(this);
          this.onCloseButtonClicked = this.onCloseButtonClicked.bind(this);
          const containers = this.htmlHelper.createFrameView();
          this.overlayContainer = containers.overlayContainer;
          this.portalWindow = containers.portalWindow;
          this.closeButton = this.htmlHelper.createCloseButton();
      }
      setSupportPortalVisibility(visible) {
          var _a, _b;
          this.overlayContainer.style.visibility = visible ? 'visible' : 'hidden';
          (_b = (_a = this.callbacks).onFrameVisibilityChange) === null || _b === void 0 ? void 0 : _b.call(_a, visible);
      }
      /**
       * Set the params payload to be sent when widget is ready
       */
      setParamsToSend(payload) {
          this.setParamsPayload = payload;
          // If widget is already ready, send params immediately
          if (this.isWidgetReady) {
              this.sendSetParamsMessage();
          }
      }
      /**
       * Open the frame and return a promise that resolves when closed
       */
      openFrame() {
          const result = new Promise((resolve, reject) => {
              this.resolve = resolve;
              this.reject = reject;
          });
          window.addEventListener('message', this.onMessageReceived);
          this.appendFrameView();
          this.appendCloseButton();
          return result;
      }
      /**
       * Close the frame
       */
      closeFrame() {
          this.close();
          this.resolve();
      }
      close() {
          this.isWidgetReady = false;
          window.removeEventListener('message', this.onMessageReceived);
          this.removeCloseButton();
          this.removeFrameView();
          this.callbacks.onFrameClosed();
      }
      onIFrameError(error) {
          Log.debug('Received error from iframe', error);
          this.close();
          this.reject(new ClientAppSupportPortalError('Iframe error when loading portal.', error));
      }
      onMessageReceived(message) {
          var _a, _b;
          // Validate message source - must come from our iframe's content window
          // This is more precise than origin checking since we own the iframe
          if (message.source !== this.frame.getContentWindow()) {
              return; // Ignore messages from other sources
          }
          // Validate message structure using type guard
          if (!isFrameMessage(message.data)) {
              Log.debug('Received invalid message structure', message.data);
              return;
          }
          // Ignore messages from SDK itself (our own echoed messages)
          if (message.data.sender === SDK_SENDER) {
              return;
          }
          const frameMessage = message.data;
          Log.debug('Received message from iframe', frameMessage);
          switch (frameMessage.action) {
              case exports.ActionType.READY:
                  this.handleReadyMessage();
                  break;
              case exports.ActionType.LOADED:
                  this.handleLoadedMessage();
                  break;
              case exports.ActionType.EXIT_CODE:
                  if (isExitCodePayload(frameMessage.payload)) {
                      this.handleExitCodeMessage(frameMessage.payload);
                  }
                  else {
                      Log.error('Invalid EXIT_CODE payload', frameMessage.payload);
                  }
                  break;
              case exports.ActionType.DEEPLINK_CLICK:
                  if (isDeeplinkPayload(frameMessage.payload)) {
                      this.handleDeeplinkClickMessage(frameMessage.payload);
                  }
                  else {
                      Log.error('Invalid DEEPLINK_CLICK payload', frameMessage.payload);
                  }
                  break;
              case exports.ActionType.HIDE_CLOSE_BUTTON:
                  this.hideCloseButton();
                  break;
              case exports.ActionType.SHOW_CLOSE_BUTTON:
                  this.showCloseButton();
                  break;
              case exports.ActionType.MINIMIZE:
                  if (isMinimizePayload(frameMessage.payload)) {
                      this.handleMinimizeMessage(frameMessage.payload);
                  }
                  else {
                      Log.error('Invalid MINIMIZE payload', frameMessage.payload);
                  }
                  break;
              default: {
                  const source = message.source;
                  if (!source)
                      return;
                  (_b = (_a = this.callbacks).onWidgetMessage) === null || _b === void 0 ? void 0 : _b.call(_a, frameMessage, source);
                  break;
              }
          }
      }
      handleReadyMessage() {
          var _a, _b;
          Log.info('Widget is ready');
          this.isWidgetReady = true;
          this.hideCloseButton();
          this.frame.show();
          // Send SET_PARAMS if we have params to send
          if (this.setParamsPayload) {
              this.sendSetParamsMessage();
          }
          (_b = (_a = this.callbacks).onWidgetReady) === null || _b === void 0 ? void 0 : _b.call(_a);
      }
      handleLoadedMessage() {
          var _a, _b;
          Log.info('Widget has loaded');
          (_b = (_a = this.callbacks).onWidgetLoaded) === null || _b === void 0 ? void 0 : _b.call(_a);
      }
      handleExitCodeMessage(payload) {
          var _a, _b;
          Log.info(`Widget exit code: status=${payload.status}, code=${payload.code}, message=${payload.message}`);
          (_b = (_a = this.callbacks).onExitCode) === null || _b === void 0 ? void 0 : _b.call(_a, payload);
          // If exit code is 401 (invalid session), close immediately
          if (payload.code === 401) {
              Log.info('Received 401 exit code, closing portal');
              this.closeFrame();
              return;
          }
          // For other exit codes, close the frame
          if (payload.status === 'success' || payload.status === 'canceled' || payload.status === 'error') {
              this.closeFrame();
          }
      }
      handleDeeplinkClickMessage(payload) {
          var _a;
          Log.info(`Deeplink clicked: ${payload.deeplink}`);
          if ((_a = this.templateOptions) === null || _a === void 0 ? void 0 : _a.onDeeplinkClick) {
              this.templateOptions.onDeeplinkClick(payload.deeplink, this.callbacks.closePortal);
          }
      }
      sendSetParamsMessage() {
          if (!this.setParamsPayload) {
              return;
          }
          const message = {
              action: exports.ActionType.SET_PARAMS,
              sender: SDK_SENDER,
              payload: this.setParamsPayload,
          };
          Log.info('Sending SET_PARAMS message to widget');
          Log.debug('SET_PARAMS payload:', this.setParamsPayload);
          this.postMessage(message);
      }
      postMessage(message) {
          if (message.sender !== SDK_SENDER) {
              Log.error(`Message sender is not SDK. Cannot send message.`);
              return;
          }
          try {
              const contentWindow = this.frame.getContentWindow();
              if (contentWindow) {
                  // Post directly to our iframe - we own it and know its URL
                  contentWindow.postMessage(message, '*');
                  Log.info(`Message ${message.action} sent successfully`);
              }
              else {
                  Log.error(`Cannot send ${message.action}: contentWindow is null`);
              }
          }
          catch (error) {
              Log.error(`Failed to send ${message.action} message`, error);
          }
      }
      removeCloseButton() {
          var _a;
          this.closeButton.removeEventListener('click', this.onCloseButtonClicked);
          (_a = this.closeButton.parentNode) === null || _a === void 0 ? void 0 : _a.removeChild(this.closeButton);
      }
      appendCloseButton() {
          this.closeButton.addEventListener('click', this.onCloseButtonClicked);
          this.portalWindow.appendChild(this.closeButton);
      }
      onCloseButtonClicked() {
          this.closeFrame();
      }
      appendFrameView() {
          this.portalContainer.appendChild(this.overlayContainer);
          this.portalWindow.appendChild(this.frame.element);
      }
      removeFrameView() {
          var _a;
          (_a = this.overlayContainer.parentNode) === null || _a === void 0 ? void 0 : _a.removeChild(this.overlayContainer);
      }
      /**
       * Hide the close button (e.g., when widget requests it)
       */
      hideCloseButton() {
          this.closeButton.style.display = 'none';
      }
      /**
       * Show the close button
       */
      showCloseButton() {
          this.closeButton.style.display = 'flex';
      }
      handleMinimizeMessage(payload) {
          var _a, _b;
          Log.info(`Widget minimize requested: supportSessionId=${payload.supportSessionId}, target=${payload.target}, endTime=${payload.endTime}`);
          (_b = (_a = this.callbacks).onWidgetMinimized) === null || _b === void 0 ? void 0 : _b.call(_a, payload);
          this.closeFrame();
      }
  }

  /**
   * Represents an error indicating that something went wrong while opening the portal frame
   */
  class OpenFrameSupportPortalError extends SupportPortalError {
      constructor(innerError) {
          super('Failed to open Support Portal.', innerError);
          this.name = 'OpenFrameSupportPortalError';
      }
  }

  /**
   * Represents an error indicating that something went wrong while closing the portal
   */
  class CloseFrameSupportPortalError extends SupportPortalError {
      constructor(innerError) {
          super('Failed to close Support Portal.', innerError);
          this.name = 'CloseFrameSupportPortalError';
      }
  }

  /**
   * Support Portal SDK Service
   *
   * Enables seamless integration of the Support Portal into your game.
   * Provides a robust iframe-based interface with features like session management,
   * deeplink handling, and customizable UI.
   */
  class SupportPortalService {
      /**
       * Check if the portal is currently opened
       */
      get isOpened() {
          var _a, _b;
          return (_b = (_a = this.frameController) === null || _a === void 0 ? void 0 : _a.isOpened) !== null && _b !== void 0 ? _b : false;
      }
      /**
       * Instantiate Support Portal SDK
       * @param options Support Portal SDK options
       */
      constructor(options) {
          this.options = options;
          this.isInitialized = false;
          this.frameController = null;
          this.widgetMessageListeners = new Set();
          this.uriResolver = new UriResolver(this.options);
          if (this.options.logHandler !== undefined) {
              Log.handler = this.options.logHandler;
          }
      }
      throwIfNotInitialized() {
          if (this.isInitialized === false) {
              Log.error('Support Portal must be initialized first.');
              throw new SupportPortalError('Support Portal must be initialized first.');
          }
      }
      /**
       * Initialize the Support Portal SDK
       */
      initialize() {
          return __awaiter(this, void 0, void 0, function* () {
              var _a;
              Log.info('Start initialization.');
              try {
                  if (this.isInitialized) {
                      throw new SupportPortalError('Support Portal is already initialized.');
                  }
                  // Mark as initialized
                  this.isInitialized = true;
                  Log.info('Initialization completed successfully.');
              }
              catch (e) {
                  const error = new InitializeSupportPortalError(e);
                  Log.error(error.message);
                  throw error;
              }
              (_a = this.options.onInitialized) === null || _a === void 0 ? void 0 : _a.call(this);
          });
      }
      /**
       * Open the Support Portal
       * @param options Optional open options
       * @returns Promise that resolves when the portal is closed
       */
      open(options) {
          var _a;
          return this.openFrame((_a = options === null || options === void 0 ? void 0 : options.popupId) !== null && _a !== void 0 ? _a : null, options === null || options === void 0 ? void 0 : options.extraQueryParams, options === null || options === void 0 ? void 0 : options.portalContainer, options === null || options === void 0 ? void 0 : options.supportSessionId, options === null || options === void 0 ? void 0 : options.target);
      }
      setSupportPortalVisibility(visible) {
          if (this.frameController) {
              this.frameController.setSupportPortalVisibility(visible);
          }
          else if (visible) {
              throw new SupportPortalError('Support Portal is not initialized.');
          }
      }
      /**
       * Open the Support Portal with a specific popup ID
       * @param popupId Popup ID determines what page would be processed
       * @param extraQueryParams Extra query params for the portal
       * @param portalContainer Container for the portal
       * @returns Promise that resolves when the portal is closed
       */
      openWithPopupId(popupId, extraQueryParams, portalContainer, supportSessionId, target) {
          return this.openFrame(popupId, extraQueryParams, portalContainer, supportSessionId, target);
      }
      openFrame(popupId, extraQueryParams, portalContainer, supportSessionId, target) {
          return __awaiter(this, void 0, void 0, function* () {
              var _a;
              try {
                  this.throwIfNotInitialized();
                  if (this.isOpened) {
                      Log.error('Support Portal is already opened.');
                      throw new SupportPortalError('Support Portal is already opened.');
                  }
                  const url = this.uriResolver.getUrl(popupId, extraQueryParams !== null && extraQueryParams !== void 0 ? extraQueryParams : new Map());
                  Log.info(`Trying to show Support Portal. URL: ${url}`);
                  this.frameController = new FrameController(url, getPortalContainer(portalContainer), {
                      onFrameClosed: this.onFrameClosed.bind(this),
                      closePortal: this.close.bind(this),
                      onWidgetReady: this.onWidgetReady.bind(this),
                      onWidgetLoaded: this.onWidgetLoaded.bind(this),
                      onExitCode: this.onExitCode.bind(this),
                      onWidgetMinimized: this.onWidgetMinimized.bind(this),
                      onFrameVisibilityChange: this.onFrameVisibilityChange.bind(this),
                      onWidgetMessage: this.dispatchWidgetMessage.bind(this),
                  }, this.options);
                  // If using postMessage transport, prepare SET_PARAMS payload
                  if (this.uriResolver.shouldSendParamsViaPostMessage()) {
                      extraQueryParams = extraQueryParams !== null && extraQueryParams !== void 0 ? extraQueryParams : new Map();
                      extraQueryParams.set('widgetOpeningTriggeredAtUtc', Date.now());
                      const setParamsPayload = this.buildSetParamsPayload(extraQueryParams);
                      setParamsPayload.supportSessionId = supportSessionId;
                      setParamsPayload.target = target;
                      this.frameController.setParamsToSend(setParamsPayload);
                  }
                  yield this.frameController.openFrame();
                  Log.info('Support Portal has been closed.');
              }
              catch (e) {
                  const error = new OpenFrameSupportPortalError(e);
                  Log.error(error.message);
                  throw error;
              }
              finally {
                  (_a = this.options.onSupportPortalFrameClosed) === null || _a === void 0 ? void 0 : _a.call(this);
              }
          });
      }
      /**
       * Build SET_PARAMS payload for postMessage transport
       */
      buildSetParamsPayload(extraQueryParams) {
          var _a;
          const payload = {
              apiHost: this.options.apiGatewayUrl,
              sessionToken: getSessionToken(this.options.sessionToken),
              paramsTransport: (_a = this.options.paramsTransport) !== null && _a !== void 0 ? _a : DEFAULT_PARAMS_TRANSPORT,
          };
          if (this.options.language) {
              payload.lang = this.options.language;
          }
          // Add custom parameters
          if (this.options.customParameters) {
              for (const [key, value] of this.options.customParameters.entries()) {
                  payload[key] = value;
              }
          }
          // Add extra query params to payload as well
          if (extraQueryParams) {
              for (const [key, value] of extraQueryParams.entries()) {
                  payload[key] = value;
              }
          }
          return payload;
      }
      onFrameClosed() {
          Log.debug('Frame closed callback');
      }
      onWidgetReady() {
          var _a;
          Log.debug('Widget ready callback');
          (_a = this.options.onWidgetReady) === null || _a === void 0 ? void 0 : _a.call(this);
      }
      onWidgetLoaded() {
          var _a;
          Log.debug('Widget loaded callback');
          (_a = this.options.onWidgetLoaded) === null || _a === void 0 ? void 0 : _a.call(this);
      }
      onExitCode(payload) {
          var _a;
          Log.debug('Exit code callback', payload);
          (_a = this.options.onExitCode) === null || _a === void 0 ? void 0 : _a.call(this, payload);
      }
      onWidgetMinimized(payload) {
          var _a;
          Log.debug('Widget minimized callback', payload);
          (_a = this.options.onWidgetMinimized) === null || _a === void 0 ? void 0 : _a.call(this, payload);
      }
      onFrameVisibilityChange(visibility) {
          var _a;
          Log.debug('Frame visibility change callback', visibility);
          (_a = this.options.onFrameVisibilityChange) === null || _a === void 0 ? void 0 : _a.call(this, visibility);
      }
      dispatchWidgetMessage(message, source) {
          var _a;
          try {
              (_a = this.options.onWidgetMessage) === null || _a === void 0 ? void 0 : _a.call(this, message, source);
          }
          catch (e) {
              Log.error('onWidgetMessage callback threw', e);
          }
          for (const listener of this.widgetMessageListeners) {
              try {
                  listener.call(this, message, source);
              }
              catch (e) {
                  Log.error('subscribeWidgetMessages listener threw', e);
              }
          }
      }
      /**
       * Subscribe to incoming widget messages not handled by the SDK internally
       * (same stream as {@link SupportPortalSdkOptions.onWidgetMessage}).
       * @param listener Called with each message and the iframe's contentWindow that sent it.
       * @returns Unsubscribe function
       */
      subscribeWidgetMessages(listener) {
          this.widgetMessageListeners.add(listener);
          return () => {
              this.widgetMessageListeners.delete(listener);
          };
      }
      sendMessage(message) {
          if (!this.isOpened) {
              Log.info('Support Portal is not opened. Cannot send message.');
              return;
          }
          if (this.frameController) {
              this.frameController.postMessage(Object.assign(Object.assign({}, message), { sender: SDK_SENDER }));
          }
      }
      /**
       * Force close the Support Portal
       */
      close() {
          var _a;
          try {
              this.throwIfNotInitialized();
              if ((_a = this.frameController) === null || _a === void 0 ? void 0 : _a.isOpened) {
                  Log.info('Trying to close Support Portal.');
                  this.frameController.closeFrame();
                  Log.info('Support Portal has been successfully closed.');
              }
          }
          catch (e) {
              const error = new CloseFrameSupportPortalError(e);
              Log.error(error.message);
              throw error;
          }
      }
      /**
       * Cleanup and dispose of the SDK
       */
      dispose() {
          var _a;
          this.throwIfNotInitialized();
          if ((_a = this.frameController) === null || _a === void 0 ? void 0 : _a.isOpened) {
              this.close();
          }
          this.widgetMessageListeners.clear();
          this.isInitialized = false;
          Log.info('Support Portal SDK disposed.');
      }
  }

  exports.ClientAppSupportPortalError = ClientAppSupportPortalError;
  exports.CloseFrameSupportPortalError = CloseFrameSupportPortalError;
  exports.DEFAULT_PARAMS_TRANSPORT = DEFAULT_PARAMS_TRANSPORT;
  exports.InitializeSupportPortalError = InitializeSupportPortalError;
  exports.OpenFrameSupportPortalError = OpenFrameSupportPortalError;
  exports.SDK_SENDER = SDK_SENDER;
  exports.SupportPortalError = SupportPortalError;
  exports.SupportPortalService = SupportPortalService;
  exports.WIDGET_SENDER = WIDGET_SENDER;
  exports.isDeeplinkPayload = isDeeplinkPayload;
  exports.isExitCodePayload = isExitCodePayload;
  exports.isFrameMessage = isFrameMessage;
  exports.isMinimizePayload = isMinimizePayload;
  exports.isWidgetMessage = isWidgetMessage;

  return exports;

})({});
