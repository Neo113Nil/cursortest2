const WebViewTools = {};

  WebViewTools.Platform = Object.freeze({undefined: 0, Android: 1, iOS: 2});
  WebViewTools.getPlatform = function() {
    const userAgent = navigator?.userAgent || navigator?.vendor || window?.opera;
    if (/android/i.test(userAgent)) {
      return WebViewTools.Platform.Android;
    }
    if (/iPad|iPhone|iPod|AppleWebKit/.test(userAgent) && !window.MSStream) {
      return WebViewTools.Platform.iOS;
    }
    return WebViewTools.Platform.undefined;
  };

  function postMessageHandler(data, origin) {
    setTimeout(() => {
      const dataStringified = typeof data === "string" ? data : JSON.stringify(data);
      const platform = WebViewTools.getPlatform();
      if (platform === WebViewTools.Platform.iOS) {
        window.webkit?.messageHandlers?.postMessageListener?.postMessage(dataStringified);
      } else {
        WebApp.postMessage(dataStringified);
      }
    }, 50);
  }

  window.__main__ =  function (urlStringified) {
    try {
      const vipChatSettings = JSON.parse(urlStringified);
      const vipChatService = new vipChatSdk.VipChatService({
        chatUrl: vipChatSettings.chatUrl,
        hostUrl: vipChatSettings.hostUrl,
        timerPeriod: vipChatSettings.timerPeriod,
        sessionToken: () => vipChatSettings.authToken,
        onFrameContainerTemplate: (containerArg) => {
          const container = containerArg;
          container.style.position = 'fixed';
          container.style.background = 'transparent';
        },
        onIframeContainerTemplate: (containerArg) => {
          const container = containerArg;
          container.style.height = '100%';
          container.style.width = '100%';
          container.style.top = '0';
          container.style.left = '0';
        },
        onChatFrameClosed: () => {
          vipChatService.close();
          vipChatService.dispose();
          postMessageHandler('VipChatEvent.close');
        }
      });
      vipChatService.initialize()
        .then(() => {
          vipChatService.open();
        }).then(() => {
          postMessageHandler('*********** success vipChatService ***********');
        })
        .catch((error) => {
          console.log("Exception thrown when attempting to initialize or open vip chat page: " + error);
          postMessageHandler('VipChatEvent.error ' + error);
        });
    }
    catch (ex) {
      console.log("Exception thrown when attempting to initialize or open vip chat page: " + ex);
      postMessageHandler('VipChatEvent.error ' + ex);
    }
  }

  function onGetInitDataResponse(data) {
    setTimeout(() => window.__main__(data), 10);
  }

  window.displayFlashScreenshot = function () { };
  window.hideFlashScreenshot = function () { };
  window.activateTab = function () { };

  const platform = WebViewTools.getPlatform();
  if (platform === WebViewTools.Platform.iOS) {
    window.webkit?.messageHandlers?.getInitData?.postMessage({});
  } else {
    window.__main__(WebApp.getInitData());
  }
