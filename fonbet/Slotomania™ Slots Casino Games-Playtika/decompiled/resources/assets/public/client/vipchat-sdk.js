/*!  
    VIP chat SDK
    Version: 0.3.2
    Build time: Mon, 11 May 2026 09:56:18 GMT  
*/
var vipChatSdk = (function (exports) {
    'use strict';

    class UnreadMessagesState {
        constructor(count = 0) {
            this.count = count;
        }
    }

    exports.LogLevel = void 0;
    (function (LogLevel) {
        LogLevel[LogLevel["None"] = 0] = "None";
        LogLevel[LogLevel["Debug"] = 1] = "Debug";
        LogLevel[LogLevel["Info"] = 2] = "Info";
        LogLevel[LogLevel["Warning"] = 3] = "Warning";
        LogLevel[LogLevel["Error"] = 4] = "Error";
    })(exports.LogLevel || (exports.LogLevel = {}));

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

    var header;
    (function (header) {
        (function (UserAgent) {
            UserAgent.Key = 'user-agent';
        })(header.UserAgent || (header.UserAgent = {}));
        (function (CacheControl) {
            CacheControl.Key = 'cache-control';
        })(header.CacheControl || (header.CacheControl = {}));
        (function (Accept) {
            Accept.Key = 'accept';
        })(header.Accept || (header.Accept = {}));
        (function (ContentType) {
            ContentType.Key = 'content-type';
        })(header.ContentType || (header.ContentType = {}));
        (function (ContentEncoding) {
            ContentEncoding.Key = 'content-encoding';
        })(header.ContentEncoding || (header.ContentEncoding = {}));
        (function (AcceptEncoding) {
            AcceptEncoding.Key = 'accept-encoding';
        })(header.AcceptEncoding || (header.AcceptEncoding = {}));
    })(header || (header = {}));

    var setErrorPrototype = function (thisArg, proto) {
        if (typeof Object.setPrototypeOf === 'function') {
            Object.setPrototypeOf(thisArg, proto);
        }
        else {
            thisArg.__proto__ = proto;
        }
    };

    var __extends$f = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var ArgumentError = (function (_super) {
        __extends$f(ArgumentError, _super);
        function ArgumentError(message) {
            var _this = _super.call(this, message) || this;
            setErrorPrototype(_this, ArgumentError.prototype);
            return _this;
        }
        return ArgumentError;
    }(Error));

    var __extends$e = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var NullArgumentError = (function (_super) {
        __extends$e(NullArgumentError, _super);
        function NullArgumentError(argName, message) {
            var _this = _super.call(this, "The argument ".concat(argName, " is null or undefined.").concat(message != null ? " ".concat(message) : '')) || this;
            _this.argName = argName;
            setErrorPrototype(_this, NullArgumentError.prototype);
            return _this;
        }
        return NullArgumentError;
    }(ArgumentError));

    var Arg = (function () {
        function Arg() {
        }
        Arg.notNullOrUndefined = function (arg, argName) {
            if (argName == null) {
                throw new NullArgumentError('argName');
            }
            if (arg == null) {
                throw new NullArgumentError(argName);
            }
        };
        Arg.notNullOrWhitespace = function (arg, argName) {
            Arg.notNullOrUndefined(argName, 'argName');
            Arg.notNullOrUndefined(arg, argName);
            if (arg === '' || !arg.trim()) {
                throw new ArgumentError("The argument ".concat(argName, " is a string with whitespace."));
            }
        };
        Arg.number = function (arg, argName) {
            Arg.notNullOrWhitespace(argName, 'argName');
            Arg.notNullOrUndefined(arg, argName);
            if (typeof arg !== 'number') {
                throw new ArgumentError("The argument ".concat(argName, " is not a valid number."));
            }
        };
        Arg.numberFiniteNotNaN = function (arg, argName) {
            Arg.notNullOrWhitespace(argName, 'argName');
            Arg.notNullOrUndefined(arg, argName);
            Arg.number(arg, argName);
            if (Number.isNaN(arg)) {
                throw new ArgumentError("The argument ".concat(argName, " is a NaN (not a number) number."));
            }
            if (!Number.isFinite(arg)) {
                throw new ArgumentError("The argument ".concat(argName, " is not a finite number."));
            }
        };
        Arg.numberSafeInteger = function (arg, argName) {
            Arg.numberFiniteNotNaN(arg, argName);
            if (arg > Number.MAX_SAFE_INTEGER || arg < Number.MIN_SAFE_INTEGER) {
                throw new ArgumentError("The argument ".concat(argName, " is outside the range of a safe integer."));
            }
        };
        Arg.numberGreaterThan = function (value, arg, argName) {
            Arg.numberFiniteNotNaN(value, 'value');
            Arg.notNullOrWhitespace(argName, 'argName');
            Arg.notNullOrUndefined(arg, argName);
            Arg.number(arg, argName);
            if (arg <= value || Number.isNaN(arg)) {
                throw new ArgumentError("The argument ".concat(argName, " must be greater than ").concat(value, " and not NaN."));
            }
        };
        Arg.isFunction = function (arg, argName) {
            Arg.notNullOrUndefined(arg, argName);
            Arg.notNullOrWhitespace(argName, 'argName');
            if (typeof arg !== 'function') {
                throw new ArgumentError("The argument ".concat(argName, " is not a function."));
            }
        };
        Arg.instanceOf = function (arg, argName, ctor) {
            Arg.notNullOrWhitespace(argName, 'argName');
            Arg.notNullOrUndefined(arg, argName);
            if (!(arg instanceof ctor)) {
                throw new ArgumentError("The argument ".concat(argName, " is not instance of ").concat(ctor.name));
            }
        };
        return Arg;
    }());

    var LineEnding;
    (function (LineEnding) {
        LineEnding[LineEnding["None"] = 0] = "None";
        LineEnding[LineEnding["CR"] = 1] = "CR";
        LineEnding[LineEnding["LF"] = 2] = "LF";
        LineEnding[LineEnding["CRLF"] = 3] = "CRLF";
    })(LineEnding || (LineEnding = {}));
    function getLineEnding(lineEndingType) {
        switch (lineEndingType) {
            case LineEnding.None:
                return '';
            case LineEnding.CRLF:
                return '\r\n';
            case LineEnding.LF:
                return '\n';
            case LineEnding.CR:
                return '\r';
            default:
                throw new Error('Unknown line ending is provided.');
        }
    }

    var ArrayJoinStringBuilder = (function () {
        function ArrayJoinStringBuilder(lineEnding) {
            if (lineEnding === void 0) { lineEnding = LineEnding.LF; }
            this.lineEnding = lineEnding;
            this.values = [];
            this.lineEndingString = getLineEnding(this.lineEnding);
        }
        ArrayJoinStringBuilder.prototype.append = function (value) {
            if (!value) {
                return;
            }
            this.values.push(value);
        };
        ArrayJoinStringBuilder.prototype.appendLine = function (value) {
            this.append(value);
            this.append(this.lineEndingString);
        };
        ArrayJoinStringBuilder.prototype.toString = function () {
            return this.values.join('');
        };
        return ArrayJoinStringBuilder;
    }());

    ((function () {
        function FixedStringBuilderPool() {
        }
        Object.defineProperty(FixedStringBuilderPool, "stringBuilder", {
            set: function (ctor) {
                FixedStringBuilderPool.StringBuilderCtor = ctor;
            },
            enumerable: false,
            configurable: true
        });
        FixedStringBuilderPool.get = function () {
            return new FixedStringBuilderPool.StringBuilderCtor();
        };
        FixedStringBuilderPool.return = function (sb) {
        };
        FixedStringBuilderPool.StringBuilderCtor = ArrayJoinStringBuilder;
        return FixedStringBuilderPool;
    })());

    var CancellationToken = (function () {
        function CancellationToken(syncExecutor, asyncExecutor) {
            this.syncExecutor = syncExecutor;
            this.asyncExecutor = asyncExecutor;
            Arg.notNullOrUndefined(syncExecutor, 'syncExecutor');
            Arg.notNullOrUndefined(asyncExecutor, 'asyncExecutor');
        }
        Object.defineProperty(CancellationToken.prototype, "onCancel", {
            get: function () {
                return this.asyncExecutor();
            },
            enumerable: false,
            configurable: true
        });
        CancellationToken.prototype.throwIfRequested = function () {
            this.syncExecutor();
        };
        return CancellationToken;
    }());

    var __extends$d = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var OperationCancelledException = (function (_super) {
        __extends$d(OperationCancelledException, _super);
        function OperationCancelledException(message) {
            var _this = _super.call(this, message) || this;
            setErrorPrototype(_this, OperationCancelledException.prototype);
            return _this;
        }
        return OperationCancelledException;
    }(Error));

    var CancellationState;
    (function (CancellationState) {
        CancellationState[CancellationState["Pending"] = 0] = "Pending";
        CancellationState[CancellationState["Cancelled"] = 1] = "Cancelled";
    })(CancellationState || (CancellationState = {}));
    ((function () {
        function CancellationTokenSource() {
            var _this = this;
            this.tokens = [];
            this.internalState = CancellationState.Pending;
            this.internalPromise = new Promise(function (resolve) {
                _this.resolve = resolve;
            });
        }
        Object.defineProperty(CancellationTokenSource.prototype, "state", {
            get: function () {
                return this.internalState;
            },
            enumerable: false,
            configurable: true
        });
        Object.defineProperty(CancellationTokenSource.prototype, "token", {
            get: function () {
                var _this = this;
                var newToken = new CancellationToken(function () { return _this.executorSync(); }, function () { return _this.internalPromise; });
                this.tokens.push(newToken);
                return newToken;
            },
            enumerable: false,
            configurable: true
        });
        CancellationTokenSource.prototype.cancel = function () {
            if (this.internalState === CancellationState.Pending) {
                this.internalState = CancellationState.Cancelled;
                this.resolve(new OperationCancelledException('Cancellation requested asynchronously by the token source'));
            }
        };
        CancellationTokenSource.prototype.executorSync = function () {
            if (this.internalState === CancellationState.Cancelled) {
                throw new OperationCancelledException('Cancellation requested synchronously by the token source');
            }
        };
        return CancellationTokenSource;
    })());

    var __read$1 = (undefined && undefined.__read) || function (o, n) {
        var m = typeof Symbol === "function" && o[Symbol.iterator];
        if (!m) return o;
        var i = m.call(o), r, ar = [], e;
        try {
            while ((n === void 0 || n-- > 0) && !(r = i.next()).done) ar.push(r.value);
        }
        catch (error) { e = { error: error }; }
        finally {
            try {
                if (r && !r.done && (m = i["return"])) m.call(i);
            }
            finally { if (e) throw e.error; }
        }
        return ar;
    };
    var __spreadArray = (undefined && undefined.__spreadArray) || function (to, from, pack) {
        if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
            if (ar || !(i in from)) {
                if (!ar) ar = Array.prototype.slice.call(from, 0, i);
                ar[i] = from[i];
            }
        }
        return to.concat(ar || Array.prototype.slice.call(from));
    };
    var __values$1 = (undefined && undefined.__values) || function(o) {
        var s = typeof Symbol === "function" && Symbol.iterator, m = s && o[s], i = 0;
        if (m) return m.call(o);
        if (o && typeof o.length === "number") return {
            next: function () {
                if (o && i >= o.length) o = void 0;
                return { value: o && o[i++], done: !o };
            }
        };
        throw new TypeError(s ? "Object is not iterable." : "Symbol.iterator is not defined.");
    };
    var HttpHeaders = (function () {
        function HttpHeaders(entries) {
            if (entries == null) {
                this.entriesInternal = new Map();
                this.entriesLowerCased = new Map();
            }
            else {
                this.entriesInternal = entries;
                this.entriesLowerCased = new Map(__spreadArray([], __read$1(this.entriesInternal), false).map(function (_a) {
                    var _b = __read$1(_a, 2), k = _b[0], v = _b[1];
                    return [k.toLowerCase(), v.map(function (x) { return x.toLowerCase(); })];
                }));
            }
        }
        Object.defineProperty(HttpHeaders.prototype, "entries", {
            get: function () {
                return this.entriesInternal;
            },
            enumerable: false,
            configurable: true
        });
        HttpHeaders.prototype.get = function (headerName) {
            var e_1, _a;
            Arg.notNullOrWhitespace(headerName, 'headerName');
            var headerNameLowered = headerName.toLowerCase();
            try {
                for (var _b = __values$1(this.entriesInternal), _c = _b.next(); !_c.done; _c = _b.next()) {
                    var _d = __read$1(_c.value, 2), headerNameValue = _d[0], headerValue = _d[1];
                    if (headerNameValue.toLowerCase() === headerNameLowered) {
                        return headerValue;
                    }
                }
            }
            catch (e_1_1) { e_1 = { error: e_1_1 }; }
            finally {
                try {
                    if (_c && !_c.done && (_a = _b.return)) _a.call(_b);
                }
                finally { if (e_1) throw e_1.error; }
            }
            return [];
        };
        HttpHeaders.prototype.getLowered = function (headerName) {
            var _a;
            Arg.notNullOrWhitespace(headerName, 'headerName');
            return (_a = this.entriesLowerCased.get(headerName.toLowerCase())) !== null && _a !== void 0 ? _a : [];
        };
        HttpHeaders.prototype.add = function (headerName, headerValue) {
            Arg.notNullOrUndefined(headerName, 'headerName');
            if (!Array.isArray(headerValue)) {
                Arg.notNullOrUndefined(headerValue, 'headerValue');
                this.entriesInternal.set(headerName, [headerValue]);
                this.entriesLowerCased.set(headerName.toLowerCase(), [
                    headerValue.toLowerCase(),
                ]);
            }
            else {
                this.entriesInternal.set(headerName, headerValue);
                this.entriesLowerCased.set(headerName.toLowerCase(), headerValue.map(function (x) { return x.toLowerCase(); }));
            }
        };
        HttpHeaders.prototype.addMany = function (headers) {
            var e_2, _a;
            Arg.notNullOrUndefined(headers, 'headers');
            try {
                for (var headers_1 = __values$1(headers), headers_1_1 = headers_1.next(); !headers_1_1.done; headers_1_1 = headers_1.next()) {
                    var _b = __read$1(headers_1_1.value, 2), headerName = _b[0], headerValue = _b[1];
                    this.add(headerName, headerValue);
                }
            }
            catch (e_2_1) { e_2 = { error: e_2_1 }; }
            finally {
                try {
                    if (headers_1_1 && !headers_1_1.done && (_a = headers_1.return)) _a.call(headers_1);
                }
                finally { if (e_2) throw e_2.error; }
            }
        };
        HttpHeaders.prototype.contains = function (headerName) {
            var e_3, _a;
            Arg.notNullOrWhitespace(headerName, 'headerName');
            var headerNameLowered = headerName.toLowerCase();
            var hasHeader = false;
            try {
                for (var _b = __values$1(this.entriesLowerCased), _c = _b.next(); !_c.done; _c = _b.next()) {
                    var _d = __read$1(_c.value, 1), headerNameValue = _d[0];
                    if (headerNameValue === headerNameLowered) {
                        hasHeader = true;
                        break;
                    }
                }
            }
            catch (e_3_1) { e_3 = { error: e_3_1 }; }
            finally {
                try {
                    if (_c && !_c.done && (_a = _b.return)) _a.call(_b);
                }
                finally { if (e_3) throw e_3.error; }
            }
            return hasHeader;
        };
        HttpHeaders.prototype.containsPartialValue = function (headerName, subString) {
            Arg.notNullOrWhitespace(headerName, 'headerName');
            Arg.notNullOrWhitespace(subString, 'subString');
            if (headerName == null || headerName.length === 0 || subString == null || subString.length === 0) {
                return false;
            }
            var header = this.getLowered(headerName.toLowerCase());
            if (header == null || header.length === 0) {
                return false;
            }
            subString = subString.toLowerCase();
            for (var i = 0; i < header.length; i++) {
                if (header[i].indexOf(subString) > -1) {
                    return true;
                }
            }
            return false;
        };
        return HttpHeaders;
    }());

    var HttpBackend = (function () {
        function HttpBackend() {
        }
        return HttpBackend;
    }());

    var HttpRequest = (function () {
        function HttpRequest(url, method, headers, body, cacheControl) {
            Arg.notNullOrWhitespace(url, 'url');
            Arg.notNullOrWhitespace(method, 'method');
            this.url = url;
            this.method = method;
            this.headers = headers !== null && headers !== void 0 ? headers : new HttpHeaders();
            this.body = body;
            this.cacheControl = cacheControl;
        }
        return HttpRequest;
    }());

    var __awaiter$8 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$6 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var AutoRequestResolver = function (request) { return __awaiter$8(void 0, void 0, void 0, function () {
        return __generator$6(this, function (_a) {
            if (!request.headers.contains(header.ContentType.Key)) {
                if (typeof request.body === 'string') {
                    request.headers.add(header.ContentType.Key, "text/plain");
                }
                else if (request.body instanceof ArrayBuffer) {
                    request.headers.add(header.ContentType.Key, "application/octet-stream");
                }
                else if (request.body != null) {
                    request.headers.add(header.ContentType.Key, "application/json");
                    request = new HttpRequest(request.url, request.method, request.headers, JSON.stringify(request.body), request.cacheControl);
                }
            }
            return [2, request];
        });
    }); };

    var HttpResponse = (function () {
        function HttpResponse(headers, statusCode) {
            Arg.notNullOrUndefined(headers, 'headers');
            Arg.numberFiniteNotNaN(statusCode, 'statusCode');
            this.headers = headers;
            this.status = statusCode;
        }
        return HttpResponse;
    }());

    var __extends$c = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpContentResponse = (function (_super) {
        __extends$c(HttpContentResponse, _super);
        function HttpContentResponse(headers, statusCode, content) {
            var _this = _super.call(this, headers, statusCode) || this;
            _this.content = content;
            return _this;
        }
        return HttpContentResponse;
    }(HttpResponse));

    var __awaiter$7 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$5 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var ArrayBufferContentResolver = function (response) { return __awaiter$7(void 0, void 0, void 0, function () {
        var content;
        return __generator$5(this, function (_a) {
            switch (_a.label) {
                case 0: return [4, response.arrayBuffer()];
                case 1:
                    content = _a.sent();
                    return [2, new HttpContentResponse(response.headers, response.status, content)];
            }
        });
    }); };
    var BlobContentResolver = function (response) { return __awaiter$7(void 0, void 0, void 0, function () {
        var content;
        return __generator$5(this, function (_a) {
            switch (_a.label) {
                case 0: return [4, response.blob()];
                case 1:
                    content = _a.sent();
                    return [2, new HttpContentResponse(response.headers, response.status, content)];
            }
        });
    }); };
    var JsonContentResolver = function (response) { return __awaiter$7(void 0, void 0, void 0, function () {
        var content;
        return __generator$5(this, function (_a) {
            switch (_a.label) {
                case 0: return [4, response.json()];
                case 1:
                    content = _a.sent();
                    return [2, new HttpContentResponse(response.headers, response.status, content)];
            }
        });
    }); };
    var StringContentResolver = function (response) { return __awaiter$7(void 0, void 0, void 0, function () {
        var content;
        return __generator$5(this, function (_a) {
            switch (_a.label) {
                case 0: return [4, response.text()];
                case 1:
                    content = _a.sent();
                    return [2, new HttpContentResponse(response.headers, response.status, content)];
            }
        });
    }); };

    var __extends$b = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpClientError = (function (_super) {
        __extends$b(HttpClientError, _super);
        function HttpClientError(message, innerError) {
            var _this = _super.call(this, message) || this;
            setErrorPrototype(_this, HttpClientError.prototype);
            _this.innerError = innerError;
            return _this;
        }
        return HttpClientError;
    }(Error));

    var __extends$a = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpResponseError = (function (_super) {
        __extends$a(HttpResponseError, _super);
        function HttpResponseError(message, response, innerError) {
            var _this = _super.call(this, message, innerError) || this;
            setErrorPrototype(_this, HttpResponseError.prototype);
            _this.response = response;
            return _this;
        }
        return HttpResponseError;
    }(HttpClientError));

    var __extends$9 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpResponseContentReadError = (function (_super) {
        __extends$9(HttpResponseContentReadError, _super);
        function HttpResponseContentReadError(message, response, innerError) {
            var _this = _super.call(this, message, response, innerError) || this;
            setErrorPrototype(_this, HttpResponseContentReadError.prototype);
            return _this;
        }
        return HttpResponseContentReadError;
    }(HttpResponseError));

    var __extends$8 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpRequestError = (function (_super) {
        __extends$8(HttpRequestError, _super);
        function HttpRequestError(message, request, innerError) {
            var _this = _super.call(this, message, innerError) || this;
            setErrorPrototype(_this, HttpRequestError.prototype);
            _this.request = request;
            return _this;
        }
        return HttpRequestError;
    }(HttpClientError));

    var __assign$1 = (undefined && undefined.__assign) || function () {
        __assign$1 = Object.assign || function(t) {
            for (var s, i = 1, n = arguments.length; i < n; i++) {
                s = arguments[i];
                for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                    t[p] = s[p];
            }
            return t;
        };
        return __assign$1.apply(this, arguments);
    };
    var __awaiter$6 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$4 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var HttpClient = (function () {
        function HttpClient(backend) {
            this.backend = backend;
            Arg.notNullOrUndefined(backend, 'backend');
        }
        HttpClient.prototype.request = function (request, options) {
            var _a;
            return __awaiter$6(this, void 0, void 0, function () {
                var requestResolver, resolvedRequest, e_1, response, e_2, responseResolver, e_3;
                return __generator$4(this, function (_b) {
                    switch (_b.label) {
                        case 0:
                            Arg.notNullOrUndefined(request, 'request');
                            Arg.notNullOrUndefined(options, 'options');
                            Arg.notNullOrUndefined(options.responseContentResolver, 'options.responseContentResolver');
                            requestResolver = (_a = options.requestResolver) !== null && _a !== void 0 ? _a : AutoRequestResolver;
                            _b.label = 1;
                        case 1:
                            _b.trys.push([1, 3, , 4]);
                            return [4, requestResolver(request)];
                        case 2:
                            resolvedRequest = _b.sent();
                            return [3, 4];
                        case 3:
                            e_1 = _b.sent();
                            throw new HttpRequestError('Unable to resolve request.', request, e_1);
                        case 4:
                            _b.trys.push([4, 6, , 7]);
                            return [4, this.backend.handle(resolvedRequest, options)];
                        case 5:
                            response = _b.sent();
                            return [3, 7];
                        case 6:
                            e_2 = _b.sent();
                            if (e_2 instanceof HttpClientError ||
                                e_2 instanceof HttpResponseError ||
                                e_2 instanceof HttpResponseContentReadError ||
                                e_2 instanceof OperationCancelledException) {
                                throw e_2;
                            }
                            throw new HttpClientError('Unexpected http backend error', e_2);
                        case 7:
                            responseResolver = options.responseContentResolver;
                            _b.label = 8;
                        case 8:
                            _b.trys.push([8, 10, , 11]);
                            return [4, responseResolver(response)];
                        case 9: return [2, _b.sent()];
                        case 10:
                            e_3 = _b.sent();
                            if (e_3 instanceof HttpResponseContentReadError) {
                                throw e_3;
                            }
                            throw new HttpResponseError('Unable to resolve response', response, e_3);
                        case 11: return [2];
                    }
                });
            });
        };
        HttpClient.prototype.requestString = function (request, options) {
            return __awaiter$6(this, void 0, void 0, function () {
                return __generator$4(this, function (_a) {
                    return [2, this.request(request, __assign$1(__assign$1({}, options), { responseContentResolver: StringContentResolver }))];
                });
            });
        };
        HttpClient.prototype.requestArrayBuffer = function (request, options) {
            return __awaiter$6(this, void 0, void 0, function () {
                return __generator$4(this, function (_a) {
                    return [2, this.request(request, __assign$1(__assign$1({}, options), { responseContentResolver: ArrayBufferContentResolver }))];
                });
            });
        };
        HttpClient.prototype.requestJson = function (request, options) {
            return __awaiter$6(this, void 0, void 0, function () {
                return __generator$4(this, function (_a) {
                    return [2, this.request(request, __assign$1(__assign$1({}, options), { responseContentResolver: JsonContentResolver }))];
                });
            });
        };
        HttpClient.prototype.requestBlob = function (request, options) {
            return __awaiter$6(this, void 0, void 0, function () {
                return __generator$4(this, function (_a) {
                    return [2, this.request(request, __assign$1(__assign$1({}, options), { responseContentResolver: BlobContentResolver }))];
                });
            });
        };
        return HttpClient;
    }());

    var __extends$7 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var HttpBackendResponse = (function (_super) {
        __extends$7(HttpBackendResponse, _super);
        function HttpBackendResponse() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        return HttpBackendResponse;
    }(HttpResponse));

    var __values = (undefined && undefined.__values) || function(o) {
        var s = typeof Symbol === "function" && Symbol.iterator, m = s && o[s], i = 0;
        if (m) return m.call(o);
        if (o && typeof o.length === "number") return {
            next: function () {
                if (o && i >= o.length) o = void 0;
                return { value: o && o[i++], done: !o };
            }
        };
        throw new TypeError(s ? "Object is not iterable." : "Symbol.iterator is not defined.");
    };
    var __read = (undefined && undefined.__read) || function (o, n) {
        var m = typeof Symbol === "function" && o[Symbol.iterator];
        if (!m) return o;
        var i = m.call(o), r, ar = [], e;
        try {
            while ((n === void 0 || n-- > 0) && !(r = i.next()).done) ar.push(r.value);
        }
        catch (error) { e = { error: error }; }
        finally {
            try {
                if (r && !r.done && (m = i["return"])) m.call(i);
            }
            finally { if (e) throw e.error; }
        }
        return ar;
    };
    function fromFetchHeaders(headers) {
        var e_1, _a;
        Arg.notNullOrUndefined(headers, 'headers');
        var headersMap = new Map();
        try {
            for (var _b = __values(headers.entries()), _c = _b.next(); !_c.done; _c = _b.next()) {
                var _d = __read(_c.value, 2), headerName = _d[0], headerValue = _d[1];
                if ((headerValue === null || headerValue === void 0 ? void 0 : headerValue.indexOf(',')) > -1) {
                    headersMap.set(headerName, headerValue.split(',').map(function (v) { return v.trim(); }));
                }
                else {
                    headersMap.set(headerName, [headerValue]);
                }
            }
        }
        catch (e_1_1) { e_1 = { error: e_1_1 }; }
        finally {
            try {
                if (_c && !_c.done && (_a = _b.return)) _a.call(_b);
            }
            finally { if (e_1) throw e_1.error; }
        }
        return new HttpHeaders(headersMap);
    }
    function toFetchHeaders(headers) {
        var e_2, _a;
        Arg.notNullOrUndefined(headers, 'headers');
        var fetchHeaders = new Headers();
        try {
            for (var _b = __values(headers.entries), _c = _b.next(); !_c.done; _c = _b.next()) {
                var _d = __read(_c.value, 2), headerName = _d[0], headerValue = _d[1];
                if (headerValue.length > 1) {
                    fetchHeaders.set(headerName, headerValue.join());
                }
                else {
                    fetchHeaders.set(headerName, headerValue[0]);
                }
            }
        }
        catch (e_2_1) { e_2 = { error: e_2_1 }; }
        finally {
            try {
                if (_c && !_c.done && (_a = _b.return)) _a.call(_b);
            }
            finally { if (e_2) throw e_2.error; }
        }
        return fetchHeaders;
    }

    var __extends$6 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var __awaiter$5 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$3 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var FetchHttpResponse = (function (_super) {
        __extends$6(FetchHttpResponse, _super);
        function FetchHttpResponse(response) {
            var _this = this;
            Arg.notNullOrUndefined(response, 'response');
            var headers = fromFetchHeaders(response.headers);
            _this = _super.call(this, headers, response.status) || this;
            _this.response = response;
            return _this;
        }
        FetchHttpResponse.prototype.text = function () {
            return __awaiter$5(this, void 0, void 0, function () {
                var e_1;
                return __generator$3(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            _a.trys.push([0, 2, , 3]);
                            return [4, this.response.text()];
                        case 1: return [2, _a.sent()];
                        case 2:
                            e_1 = _a.sent();
                            throw new HttpResponseContentReadError('Unable to read the content (text) of the response.', this, e_1);
                        case 3: return [2];
                    }
                });
            });
        };
        FetchHttpResponse.prototype.json = function () {
            return __awaiter$5(this, void 0, void 0, function () {
                var e_2;
                return __generator$3(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            _a.trys.push([0, 2, , 3]);
                            return [4, this.response.json()];
                        case 1: return [2, _a.sent()];
                        case 2:
                            e_2 = _a.sent();
                            throw new HttpResponseContentReadError('Unable to read the content (JSON) of the response.', this, e_2);
                        case 3: return [2];
                    }
                });
            });
        };
        FetchHttpResponse.prototype.arrayBuffer = function () {
            return __awaiter$5(this, void 0, void 0, function () {
                var e_3;
                return __generator$3(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            _a.trys.push([0, 2, , 3]);
                            return [4, this.response.arrayBuffer()];
                        case 1: return [2, _a.sent()];
                        case 2:
                            e_3 = _a.sent();
                            throw new HttpResponseContentReadError('Unable to read the content (ArrayBuffer) of the response.', this, e_3);
                        case 3: return [2];
                    }
                });
            });
        };
        FetchHttpResponse.prototype.blob = function () {
            return __awaiter$5(this, void 0, void 0, function () {
                var e_4;
                return __generator$3(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            _a.trys.push([0, 2, , 3]);
                            return [4, this.response.blob()];
                        case 1: return [2, _a.sent()];
                        case 2:
                            e_4 = _a.sent();
                            throw new HttpResponseContentReadError('Unable to read the content (Blob) of the response.', this, e_4);
                        case 3: return [2];
                    }
                });
            });
        };
        return FetchHttpResponse;
    }(HttpBackendResponse));

    var __extends$5 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var __awaiter$4 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$2 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    ((function (_super) {
        __extends$5(FetchHttpBackend, _super);
        function FetchHttpBackend() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        FetchHttpBackend.prototype.handle = function (request, options) {
            return __awaiter$4(this, void 0, void 0, function () {
                var method, url, cacheControl, body, headers, signal, controller_1, requestInit, response;
                return __generator$2(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            method = request.method, url = request.url, cacheControl = request.cacheControl, body = request.body;
                            headers = toFetchHeaders(request.headers);
                            if (options.cancellationToken != null) {
                                controller_1 = new AbortController();
                                signal = controller_1.signal;
                                options.cancellationToken.onCancel.finally(function () { return controller_1.abort(); });
                            }
                            requestInit = {
                                method: method,
                                headers: headers,
                                signal: signal,
                            };
                            if (cacheControl) {
                                requestInit.cache = cacheControl;
                            }
                            if (body != null) {
                                requestInit.body = body;
                            }
                            return [4, fetch(url, requestInit)];
                        case 1:
                            response = _a.sent();
                            return [2, new FetchHttpResponse(response)];
                    }
                });
            });
        };
        return FetchHttpBackend;
    })(HttpBackend));

    function setXHRHeaders(xhr, headers) {
        headers.entries.forEach(function (values, key) {
            values.forEach(function (value) { return xhr.setRequestHeader(key, value); });
        });
    }
    function fromXHRHeaders(xhr) {
        var headers = new HttpHeaders();
        var data = xhr.getAllResponseHeaders();
        var lines = data.split(/[\r\n]+/);
        lines.forEach(function (line) {
            if (line !== '') {
                var parts = line.trim().split(':');
                var key_1 = parts.shift();
                var values = parts.join(':').split(';');
                values.forEach(function (value) {
                    headers.add(key_1, value);
                });
            }
        });
        return headers;
    }

    var __extends$4 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var __awaiter$3 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator$1 = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var XHRHttpResponse = (function (_super) {
        __extends$4(XHRHttpResponse, _super);
        function XHRHttpResponse(xhr) {
            var _this = this;
            Arg.notNullOrUndefined(xhr, 'xhr');
            var headers = fromXHRHeaders(xhr);
            _this = _super.call(this, headers, xhr.status) || this;
            _this.xhr = xhr;
            return _this;
        }
        XHRHttpResponse.prototype.text = function () {
            return __awaiter$3(this, void 0, void 0, function () {
                return __generator$1(this, function (_a) {
                    try {
                        return [2, this.xhr.responseText];
                    }
                    catch (e) {
                        throw new HttpResponseContentReadError('Unable to read the content (text) of the response.', this, e);
                    }
                    return [2];
                });
            });
        };
        XHRHttpResponse.prototype.json = function () {
            return __awaiter$3(this, void 0, void 0, function () {
                return __generator$1(this, function (_a) {
                    try {
                        return [2, JSON.parse(this.xhr.responseText)];
                    }
                    catch (e) {
                        throw new HttpResponseContentReadError('Unable to read the content (JSON) of the response.', this, e);
                    }
                    return [2];
                });
            });
        };
        XHRHttpResponse.prototype.arrayBuffer = function () {
            return __awaiter$3(this, void 0, void 0, function () {
                var response;
                return __generator$1(this, function (_a) {
                    response = this.xhr.response;
                    if (!(response instanceof ArrayBuffer)) {
                        throw new HttpResponseContentReadError('Unable to read the content (ArrayBuffer) of the response', response);
                    }
                    return [2, response];
                });
            });
        };
        XHRHttpResponse.prototype.blob = function () {
            return __awaiter$3(this, void 0, void 0, function () {
                var response;
                return __generator$1(this, function (_a) {
                    response = this.xhr.response;
                    if (!(response instanceof Blob)) {
                        throw new HttpResponseContentReadError('Unable to read the content (ArrayBuffer) of the response', response);
                    }
                    return [2, response];
                });
            });
        };
        return XHRHttpResponse;
    }(HttpBackendResponse));

    var __extends$3 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var __awaiter$2 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    var __generator = (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };
    var XHRHttpBackend = (function (_super) {
        __extends$3(XHRHttpBackend, _super);
        function XHRHttpBackend() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        XHRHttpBackend.prototype.handle = function (request, options) {
            return __awaiter$2(this, void 0, void 0, function () {
                var cacheControl, method, url, headers, body, xhr;
                return __generator(this, function (_a) {
                    switch (_a.label) {
                        case 0:
                            cacheControl = request.cacheControl, method = request.method, url = request.url, headers = request.headers;
                            body = request.body;
                            xhr = new XMLHttpRequest();
                            if (options.cancellationToken != null) {
                                options.cancellationToken.onCancel.finally(function () {
                                    xhr.abort();
                                });
                            }
                            xhr.open(method, url);
                            if (cacheControl != null) {
                                xhr.setRequestHeader(header.CacheControl.Key, cacheControl);
                            }
                            if (headers != null) {
                                setXHRHeaders(xhr, headers);
                            }
                            return [4, new Promise(function (resolve, reject) {
                                    xhr.onload = function () {
                                        resolve();
                                    };
                                    xhr.onerror = function () {
                                        reject(new HttpClientError("Request XHR error: ".concat(xhr.status, ", ").concat(xhr.statusText)));
                                    };
                                    xhr.onabort = function () {
                                        reject(new DOMException('The user aborted a request.', 'AbortError'));
                                    };
                                    try {
                                        xhr.send(body);
                                    }
                                    catch (e) {
                                        reject(new HttpClientError("Request XHR error: ".concat(xhr.status, ", ").concat(xhr.statusText, ", ").concat(e)));
                                    }
                                })];
                        case 1:
                            _a.sent();
                            return [2, new XHRHttpResponse(xhr)];
                    }
                });
            });
        };
        return XHRHttpBackend;
    }(HttpBackend));

    (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };

    (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    var __assign = (undefined && undefined.__assign) || function () {
        __assign = Object.assign || function(t) {
            for (var s, i = 1, n = arguments.length; i < n; i++) {
                s = arguments[i];
                for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                    t[p] = s[p];
            }
            return t;
        };
        return __assign.apply(this, arguments);
    };
    (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };

    var commonjsGlobal = typeof globalThis !== 'undefined' ? globalThis : typeof window !== 'undefined' ? window : typeof global !== 'undefined' ? global : typeof self !== 'undefined' ? self : {};

    var dist = {};

    var Semaphore = {};

    (function (exports) {
    	var __awaiter = (commonjsGlobal && commonjsGlobal.__awaiter) || function (thisArg, _arguments, P, generator) {
    	    return new (P || (P = Promise))(function (resolve, reject) {
    	        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
    	        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
    	        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
    	        step((generator = generator.apply(thisArg, _arguments || [])).next());
    	    });
    	};
    	var __generator = (commonjsGlobal && commonjsGlobal.__generator) || function (thisArg, body) {
    	    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t;
    	    return { next: verb(0), "throw": verb(1), "return": verb(2) };
    	    function verb(n) { return function (v) { return step([n, v]); }; }
    	    function step(op) {
    	        if (f) throw new TypeError("Generator is already executing.");
    	        while (_) try {
    	            if (f = 1, y && (t = y[op[0] & 2 ? "return" : op[0] ? "throw" : "next"]) && !(t = t.call(y, op[1])).done) return t;
    	            if (y = 0, t) op = [0, t.value];
    	            switch (op[0]) {
    	                case 0: case 1: t = op; break;
    	                case 4: _.label++; return { value: op[1], done: false };
    	                case 5: _.label++; y = op[1]; op = [0]; continue;
    	                case 7: op = _.ops.pop(); _.trys.pop(); continue;
    	                default:
    	                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
    	                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
    	                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
    	                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
    	                    if (t[2]) _.ops.pop();
    	                    _.trys.pop(); continue;
    	            }
    	            op = body.call(thisArg, _);
    	        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
    	        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    	    }
    	};
    	exports.__esModule = true;
    	/** Class representing a semaphore
    	 * Semaphores are initialized with a number of permits that get aquired and released
    	 * over the lifecycle of the Semaphore. These permits limit the number of simultaneous
    	 * executions of the code that the Semaphore synchronizes. Functions can wait and stop
    	 * executing until a permit becomes available.
    	 *
    	 * Locks that only allow one execution of a critical section are a special case of
    	 * Semaphores. To construct a lock, initialize a Semaphore with a permit count of 1.
    	 *
    	 * This Semaphore class is implemented with the help of promises that get returned
    	 * by functions that wait for permits to become available. This makes it possible
    	 * to use async/await to synchronize your code.
    	 */
    	var Semaphore = (function () {
    	    /**
    	     * Creates a semaphore.
    	     * @param permits  The number of permits, i.e. things being allowed to run in parallel.
    	     * To create a lock that only lets one thing run at a time, set this to 1.
    	     * This number can also be negative.
    	     */
    	    function Semaphore(permits) {
    	        this.promiseResolverQueue = [];
    	        this.permits = permits;
    	    }
    	    /**
    	     * Returns the number of available permits.
    	     * @returns  The number of available permits.
    	     */
    	    Semaphore.prototype.getPermits = function () {
    	        return this.permits;
    	    };
    	    /**
    	     * Returns a promise used to wait for a permit to become available. This method should be awaited on.
    	     * @returns  A promise that gets resolved when execution is allowed to proceed.
    	     */
    	    Semaphore.prototype.wait = function () {
    	        return __awaiter(this, void 0, void 0, function () {
    	            var _this = this;
    	            return __generator(this, function (_a) {
    	                if (this.permits > 0) {
    	                    this.permits -= 1;
    	                    return [2 /*return*/, Promise.resolve(true)];
    	                }
    	                // If there is no permit available, we return a promise that resolves once the semaphore gets
    	                // signaled enough times that permits is equal to one.
    	                return [2 /*return*/, new Promise(function (resolver) { return _this.promiseResolverQueue.push(resolver); })];
    	            });
    	        });
    	    };
    	    /**
    	     * Alias for {@linkcode Semaphore.wait}.
    	     * @returns  A promise that gets resolved when execution is allowed to proceed.
    	     */
    	    Semaphore.prototype.acquire = function () {
    	        return __awaiter(this, void 0, void 0, function () {
    	            return __generator(this, function (_a) {
    	                return [2 /*return*/, this.wait()];
    	            });
    	        });
    	    };
    	    /**
    	     * Same as {@linkcode Semaphore.wait} except the promise returned gets resolved with false if no
    	     * permit becomes available in time.
    	     * @param milliseconds  The time spent waiting before the wait is aborted. This is a lower bound,
    	     * don't rely on it being precise.
    	     * @returns  A promise that gets resolved with true when execution is allowed to proceed or
    	     * false if the time given elapses before a permit becomes available.
    	     */
    	    Semaphore.prototype.waitFor = function (milliseconds) {
    	        return __awaiter(this, void 0, void 0, function () {
    	            var _this = this;
    	            var resolver, promise;
    	            return __generator(this, function (_a) {
    	                if (this.permits > 0) {
    	                    this.permits -= 1;
    	                    return [2 /*return*/, Promise.resolve(true)];
    	                }
    	                resolver = function (b) { return void (0); };
    	                promise = new Promise(function (r) {
    	                    resolver = r;
    	                });
    	                // The saved resolver gets added to our list of promise resolvers so that it gets a chance
    	                // to be resolved as a result of a call to signal().
    	                this.promiseResolverQueue.push(resolver);
    	                setTimeout(function () {
    	                    // We have to remove the promise resolver from our list. Resolving it twice would not be
    	                    // an issue but signal() always takes the next resolver from the queue and resolves it which
    	                    // would swallow a permit if we didn't remove it.
    	                    var index = _this.promiseResolverQueue.indexOf(resolver);
    	                    if (index !== -1) {
    	                        _this.promiseResolverQueue.splice(index, 1);
    	                    }
    	                    // false because the wait was unsuccessful.
    	                    resolver(false);
    	                }, milliseconds);
    	                return [2 /*return*/, promise];
    	            });
    	        });
    	    };
    	    /**
    	     * Synchronous function that tries to acquire a permit and returns true if successful, false otherwise.
    	     * @returns  Whether a permit could be acquired.
    	     */
    	    Semaphore.prototype.tryAcquire = function () {
    	        if (this.permits > 0) {
    	            this.permits -= 1;
    	            return true;
    	        }
    	        return false;
    	    };
    	    /**
    	     * Acquires all permits that are currently available and returns the number of acquired permits.
    	     * @returns  Number of acquired permits.
    	     */
    	    Semaphore.prototype.drainPermits = function () {
    	        if (this.permits > 0) {
    	            var permitCount = this.permits;
    	            this.permits = 0;
    	            return permitCount;
    	        }
    	        return 0;
    	    };
    	    /**
    	     * Increases the number of permits by one. If there are other functions waiting, one of them will
    	     * continue to execute in a future iteration of the event loop.
    	     */
    	    Semaphore.prototype.signal = function () {
    	        this.permits += 1;
    	        if (this.permits > 1 && this.promiseResolverQueue.length > 0) {
    	            throw new Error('this.permits should never be > 0 when there is someone waiting.');
    	        }
    	        else if (this.permits === 1 && this.promiseResolverQueue.length > 0) {
    	            // If there is someone else waiting, immediately consume the permit that was released
    	            // at the beginning of this function and let the waiting function resume.
    	            this.permits -= 1;
    	            var nextResolver = this.promiseResolverQueue.shift();
    	            if (nextResolver) {
    	                nextResolver(true);
    	            }
    	        }
    	    };
    	    /**
    	     * Alias for {@linkcode Semaphore.signal}.
    	     */
    	    Semaphore.prototype.release = function () {
    	        this.signal();
    	    };
    	    /**
    	     * Schedules func to be called once a permit becomes available.
    	     * Returns a promise that resolves to the return value of func.
    	     * @typeparam T  The return type of func.
    	     * @param func  The function to be executed.
    	     * @return  A promise that gets resolved with the return value of the function.
    	     */
    	    Semaphore.prototype.execute = function (func) {
    	        return __awaiter(this, void 0, void 0, function () {
    	            return __generator(this, function (_a) {
    	                switch (_a.label) {
    	                    case 0: return [4 /*yield*/, this.wait()];
    	                    case 1:
    	                        _a.sent();
    	                        _a.label = 2;
    	                    case 2:
    	                        _a.trys.push([2, , 4, 5]);
    	                        return [4 /*yield*/, func()];
    	                    case 3: return [2 /*return*/, _a.sent()];
    	                    case 4:
    	                        this.signal();
    	                        return [7 /*endfinally*/];
    	                    case 5: return [2 /*return*/];
    	                }
    	            });
    	        });
    	    };
    	    return Semaphore;
    	}());
    	exports["default"] = Semaphore;
    } (Semaphore));

    var Lock$1 = {};

    var __extends$2 = (commonjsGlobal && commonjsGlobal.__extends) || (function () {
        var extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return function (d, b) {
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    Lock$1.__esModule = true;
    var Semaphore_1 = Semaphore;
    /**
     * A lock that can be used to synchronize critical sections in your code.
     * For more details on how to use this class, please view the documentation
     * of the Semaphore class from which Lock inherits.
     */
    var Lock = (function (_super) {
        __extends$2(Lock, _super);
        /**
         * Creates a lock.
         */
        function Lock() {
            return _super.call(this, 1) || this;
        }
        return Lock;
    }(Semaphore_1["default"]));
    Lock$1.Lock = Lock;

    (function (exports) {
    	function __export(m) {
    	    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
    	}
    	exports.__esModule = true;
    	var Semaphore_1 = Semaphore;
    	exports["default"] = Semaphore_1["default"];
    	__export(Lock$1);
    } (dist));

    (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    (undefined && undefined.__generator) || function (thisArg, body) {
        var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
        return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
        function verb(n) { return function (v) { return step([n, v]); }; }
        function step(op) {
            if (f) throw new TypeError("Generator is already executing.");
            while (_) try {
                if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
                if (y = 0, t) op = [op[0] & 2, t.value];
                switch (op[0]) {
                    case 0: case 1: t = op; break;
                    case 4: _.label++; return { value: op[1], done: false };
                    case 5: _.label++; y = op[1]; op = [0]; continue;
                    case 7: op = _.ops.pop(); _.trys.pop(); continue;
                    default:
                        if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                        if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                        if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                        if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                        if (t[2]) _.ops.pop();
                        _.trys.pop(); continue;
                }
                op = body.call(thisArg, _);
            } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
            if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
        }
    };

    var ProgressiveDelayRetryPolicy = (function () {
        function ProgressiveDelayRetryPolicy(attemptLimit, baseDelayMs) {
            this.attemptLimit = attemptLimit;
            this.baseDelayMs = baseDelayMs;
            Arg.numberFiniteNotNaN(attemptLimit, 'attemptLimit');
            Arg.numberGreaterThan(0, attemptLimit, 'attemptLimit');
            Arg.numberFiniteNotNaN(baseDelayMs, 'baseDelayMs');
            Arg.numberGreaterThan(0, baseDelayMs, 'baseDelayMs');
        }
        ProgressiveDelayRetryPolicy.prototype.delayDelta = function (attempt) {
            return this.baseDelayMs * (1 << attempt);
        };
        ProgressiveDelayRetryPolicy.prototype.isAttemptLimitReached = function (attempt) {
            return attempt >= this.attemptLimit;
        };
        return ProgressiveDelayRetryPolicy;
    }());

    var __extends$1 = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    ((function (_super) {
        __extends$1(ServerErrorsRetryPolicy, _super);
        function ServerErrorsRetryPolicy(attemptLimit, baseDelayMs) {
            if (attemptLimit === void 0) { attemptLimit = ServerErrorsRetryPolicy.DefaultAttemptLimit; }
            if (baseDelayMs === void 0) { baseDelayMs = ServerErrorsRetryPolicy.DefaultBaseDelayMs; }
            return _super.call(this, attemptLimit, baseDelayMs) || this;
        }
        ServerErrorsRetryPolicy.prototype.retryOnResponse = function (response, attempt) {
            return !_super.prototype.isAttemptLimitReached.call(this, attempt) && response.status > 499 && response.status < 600;
        };
        ServerErrorsRetryPolicy.prototype.retryOnError = function (error, attempt) {
            return false;
        };
        ServerErrorsRetryPolicy.DefaultAttemptLimit = 3;
        ServerErrorsRetryPolicy.DefaultBaseDelayMs = 100;
        return ServerErrorsRetryPolicy;
    })(ProgressiveDelayRetryPolicy));

    var __extends = (undefined && undefined.__extends) || (function () {
        var extendStatics = function (d, b) {
            extendStatics = Object.setPrototypeOf ||
                ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
                function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
            return extendStatics(d, b);
        };
        return function (d, b) {
            if (typeof b !== "function" && b !== null)
                throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
            extendStatics(d, b);
            function __() { this.constructor = d; }
            d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
        };
    })();
    ((function (_super) {
        __extends(NoResponseRetryPolicy, _super);
        function NoResponseRetryPolicy(attemptLimit, baseDelayMs) {
            if (attemptLimit === void 0) { attemptLimit = NoResponseRetryPolicy.DefaultAttemptLimit; }
            if (baseDelayMs === void 0) { baseDelayMs = NoResponseRetryPolicy.DefaultBaseDelayMs; }
            return _super.call(this, attemptLimit, baseDelayMs) || this;
        }
        NoResponseRetryPolicy.prototype.retryOnResponse = function (response, attempt) {
            return false;
        };
        NoResponseRetryPolicy.prototype.retryOnError = function (error, attempt) {
            return !_super.prototype.isAttemptLimitReached.call(this, attempt) && error != null && error instanceof HttpResponseContentReadError;
        };
        NoResponseRetryPolicy.DefaultAttemptLimit = 3;
        NoResponseRetryPolicy.DefaultBaseDelayMs = 100;
        return NoResponseRetryPolicy;
    })(ProgressiveDelayRetryPolicy));

    /**
     * Represents a general SDK error
     */
    class VipChatError extends Error {
        constructor(message, innerError) {
            super(message);
            this.innerError = innerError;
        }
    }

    /**
     * Represents a general error indicating that something went wrong on the back end
     */
    class ServiceVipChatError extends VipChatError {
        constructor(statusCode, response) {
            super(`The response is not successful, status: ${statusCode}.`);
            this.statusCode = statusCode;
            this.response = response;
        }
    }

    /**
     * Represents an error indicating that something went wrong on the VIP chat back end
     */
    class ChatServiceVipChatError extends ServiceVipChatError {
        constructor(statusCode, response) {
            super(statusCode, response);
            this.statusCode = statusCode;
            this.response = response;
        }
    }

    const SESSION_TOKEN = 'sessionToken';
    const POPUP = 'popupId';
    const API_GATEWAY_URL = 'apiGatewayUrl';
    const MIN_TIMER_PERIOD_MS = 30000;
    const UNREAD_COUNT_EVENT_TYPE = 'infra.chat.unread.count.user.message.notification.feature.vip-chat';

    function getSessionToken(sessionToken) {
        if (typeof sessionToken === 'string') {
            return sessionToken;
        }
        if (typeof sessionToken === 'function') {
            return sessionToken();
        }
        throw Error("Can't get session token");
    }

    var __awaiter$1 = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    class ServiceHttpClient {
        constructor(hostUrl, sessionToken) {
            this.hostUrl = hostUrl;
            this.sessionToken = sessionToken;
            this.httpClient = new HttpClient(new XHRHttpBackend());
        }
        getUnreadMessages() {
            return __awaiter$1(this, void 0, void 0, function* () {
                const url = `${this.hostUrl}/vip-chat/public/v1/players/me/chats`;
                return this.sendGet(url);
            });
        }
        getChatStatus() {
            return __awaiter$1(this, void 0, void 0, function* () {
                const url = `${this.hostUrl}/vip-chat/public/v1/players/me/chats/status`;
                return this.sendGet(url);
            });
        }
        sendGet(url) {
            return __awaiter$1(this, void 0, void 0, function* () {
                try {
                    const httpHeaders = new HttpHeaders();
                    httpHeaders.add(SESSION_TOKEN, getSessionToken(this.sessionToken));
                    const httpRequest = new HttpRequest(url, 'GET', httpHeaders);
                    const response = yield this.httpClient.requestJson(httpRequest);
                    return ServiceHttpClient.parseJsonResponse(response);
                }
                catch (e) {
                    const error = e;
                    Log.error(error.message, e);
                    throw error;
                }
            });
        }
        static parseJsonResponse(response) {
            switch (response.status) {
                case 400:
                // eslint-disable-next-line no-fallthrough
                case 500:
                    throw new ChatServiceVipChatError(response.status, response.content);
                case 200:
                    return response.content;
                default:
                    throw new ServiceVipChatError(response.status, response.content);
            }
        }
    }

    /**
     * Represents an error indicating that something went wrong while initializing the SDK
     */
    class InitializeVipChatError extends VipChatError {
        constructor(innerError) {
            super('Failed to initialize VipChat.', innerError);
            this.innerError = innerError;
        }
    }

    /**
     * Represents an error indicating that something went wrong while updating the number of unread messages
     */
    class UpdateUnreadMessagesVipChatError extends VipChatError {
        constructor(innerError) {
            super('Failed to update unread messages.', innerError);
        }
    }

    function assertUnreachable(value) {
        throw new Error(`Didn't expect to have ${value}`);
    }

    class UrlBuilder {
        constructor(baseUrl) {
            this.params = new Map();
            this.baseUrl = baseUrl.endsWith('/') ? baseUrl : `${baseUrl}/`;
        }
        withParam(key, value) {
            this.params.set(key, value);
            return this;
        }
        withParams(queryParams) {
            // eslint-disable-next-line no-restricted-syntax
            for (const [key, value] of queryParams.entries()) {
                this.withParam(key, value);
            }
            return this;
        }
        getUrl() {
            if (this.params.size === 0) {
                return this.baseUrl;
            }
            let result = this.baseUrl;
            let index = 0;
            // eslint-disable-next-line no-restricted-syntax
            for (const [key, value] of this.params.entries()) {
                result += index === 0 ? '?' : '&';
                result += `${encodeURIComponent(key)}=${encodeURIComponent(value)}`;
                index += 1;
            }
            return result;
        }
    }

    class UriResolver {
        constructor(baseUrl, sessionToken, apiGatewayUrl) {
            this.baseUrl = baseUrl;
            this.sessionToken = sessionToken;
            this.apiGatewayUrl = apiGatewayUrl;
        }
        getUrl(...args) {
            const urlBuilder = new UrlBuilder(this.baseUrl);
            urlBuilder.withParam(SESSION_TOKEN, getSessionToken(this.sessionToken));
            urlBuilder.withParam(API_GATEWAY_URL, this.apiGatewayUrl);
            switch (args.length) {
                case 1: {
                    urlBuilder.withParams(args[0]);
                    break;
                }
                case 2: {
                    urlBuilder.withParam(POPUP, args[0]);
                    urlBuilder.withParams(args[1]);
                    break;
                }
                default:
                    assertUnreachable(args);
            }
            return urlBuilder.getUrl();
        }
    }

    function getChatContainer(chatContainer) {
        if (typeof chatContainer === 'string') {
            const htmlElement = document.querySelector(chatContainer);
            if (htmlElement === null) {
                throw new VipChatError(`Element not found (document.querySelector('${chatContainer}')).`);
            }
            return htmlElement;
        }
        if (chatContainer instanceof HTMLElement) {
            return chatContainer;
        }
        return document.body;
    }

    /**
     * Represents an error indicating that something went wrong when trying to open a chat application in an iframe.
     */
    class ClientAppVipChatError extends VipChatError {
    }

    var ActionType;
    (function (ActionType) {
        ActionType["HIDE_CLOSE_BUTTON"] = "HIDE_CLOSE_BUTTON";
        ActionType["DEEPLINK_CLICK"] = "DEEPLINK_CLICK";
    })(ActionType || (ActionType = {}));
    var ExitCodes;
    (function (ExitCodes) {
        ExitCodes["USER_CANCELED"] = "USER_CANCELED";
        ExitCodes["NOT_AVAILABLE"] = "NOT_AVAILABLE";
    })(ExitCodes || (ExitCodes = {}));

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

    class HtmlFrameHelper {
        constructor(templateOptions) {
            this.templateOptions = templateOptions;
        }
        createCloseButton() {
            var _a;
            const closeButton = document.createElement('a');
            const svg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
            closeButton.append(svg);
            svg.outerHTML = '<svg viewBox="64 64 896 896" focusable="false" data-icon="close" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M563.8 512l262.5-312.9c4.4-5.2.7-13.1-6.1-13.1h-79.8c-4.7 0-9.2 2.1-12.3 5.7L511.6 449.8 295.1 191.7c-3-3.6-7.5-5.7-12.3-5.7H203c-6.8 0-10.5 7.9-6.1 13.1L459.4 512 196.9 824.9A7.95 7.95 0 00203 838h79.8c4.7 0 9.2-2.1 12.3-5.7l216.5-258.1 216.5 258.1c3 3.6 7.5 5.7 12.3 5.7h79.8c6.8 0 10.5-7.9 6.1-13.1L563.8 512z"></path></svg>';
            closeButton.setAttribute('style', 'position:absolute;cursor:pointer;display:block;right:10px;top:12px;color:black;font-size:20px;');
            return HtmlFrameHelper.getActualHtmlElement(closeButton, (_a = this.templateOptions) === null || _a === void 0 ? void 0 : _a.onCloseButtonTemplate);
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
        createFrameView() {
            var _a, _b;
            const frameContainer = HtmlFrameHelper.getActualHtmlElement(HtmlFrameHelper.getDivElement(HtmlFrameHelper.FRAME_CONTAINER_STYLE), (_a = this.templateOptions) === null || _a === void 0 ? void 0 : _a.onFrameContainerTemplate);
            const iframeContainer = HtmlFrameHelper.getActualHtmlElement(HtmlFrameHelper.getDivElement(HtmlFrameHelper.IFRAME_CONTAINER_STYLE), (_b = this.templateOptions) === null || _b === void 0 ? void 0 : _b.onIframeContainerTemplate);
            blockClickThrough(frameContainer);
            frameContainer.appendChild(iframeContainer);
            return { frameContainer, iframeContainer };
        }
        static getDivElement(containerStyle) {
            const parent = document.createElement('div');
            parent.setAttribute('style', containerStyle);
            return parent;
        }
        static createIFrameElement(url) {
            const iframe = document.createElement('iframe');
            iframe.setAttribute('style', 'width:100%;height:100%;border-width:0px;visibility:hidden;');
            iframe.src = url;
            return iframe;
        }
    }
    HtmlFrameHelper.FRAME_CONTAINER_STYLE = 'position:absolute; top:0px; left:0px; width:100%; height:100%; padding:0px; margin:0px; background-color: rgba(0,0,0,0.8);';
    HtmlFrameHelper.IFRAME_CONTAINER_STYLE = 'position:absolute; width:70%; height:70%; margin:auto; top:15%; left:15%;';

    class Frame {
        constructor(url, onErrorCallback) {
            this.url = url;
            this.onErrorCallback = onErrorCallback;
            this.iframeElement = null;
        }
        get element() {
            if (this.iframeElement === null) {
                this.iframeElement = HtmlFrameHelper.createIFrameElement(this.url);
                this.iframeElement.onerror = this.onErrorCallback;
            }
            return this.iframeElement;
        }
        show() {
            this.element.style.visibility = 'visible';
        }
    }

    class FrameController {
        constructor(url, chatContainer, onFrameClosed, closeChat, templateOptions) {
            this.chatContainer = chatContainer;
            this.onFrameClosed = onFrameClosed;
            this.closeChat = closeChat;
            this.templateOptions = templateOptions;
            this.frame = new Frame(url, this.onIFrameError.bind(this));
            this.htmlHelper = new HtmlFrameHelper(this.templateOptions);
            this.onMessageReceived = this.onMessageReceived.bind(this);
            this.onCloseButtonClicked = this.onCloseButtonClicked.bind(this);
            const containers = this.htmlHelper.createFrameView();
            this.frameContainer = containers.frameContainer;
            this.iframeContainer = containers.iframeContainer;
            this.closeButton = this.htmlHelper.createCloseButton();
        }
        get isOpened() {
            return this.chatContainer.contains(this.frameContainer);
        }
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
        closeFrame() {
            this.close();
            this.resolve();
        }
        close() {
            window.removeEventListener('message', this.onMessageReceived);
            this.removeCloseButton();
            this.removeFrameView();
            this.onFrameClosed();
        }
        onIFrameError(error) {
            Log.debug('Received the error from iframe', error);
            this.close();
            this.reject(new ClientAppVipChatError('Iframe error when loading chat.', error));
        }
        onMessageReceived(message) {
            if (this.frame === null || this.frame.url.indexOf(message.origin) !== 0) {
                // ignore messages from other frames
                return;
            }
            const frameMessage = message.data;
            Log.debug('Received message from iframe', frameMessage);
            if (frameMessage.action === ActionType.HIDE_CLOSE_BUTTON) {
                this.removeCloseButton();
                this.frame.show();
            }
            if (frameMessage.action === ActionType.DEEPLINK_CLICK &&
                typeof frameMessage.payload === 'string' &&
                this.templateOptions &&
                this.templateOptions.onDeeplinkClick) {
                this.templateOptions.onDeeplinkClick(frameMessage.payload, this.closeChat);
            }
            // eslint-disable-next-line default-case
            switch (frameMessage.exitCode) {
                case ExitCodes.USER_CANCELED: {
                    this.closeFrame();
                    break;
                }
                case ExitCodes.NOT_AVAILABLE: {
                    this.close();
                    this.reject(new ClientAppVipChatError("Vip chat isn't available."));
                    break;
                }
            }
        }
        removeCloseButton() {
            this.closeButton.removeEventListener('click', this.onCloseButtonClicked);
            this.closeButton.remove();
        }
        appendCloseButton() {
            this.closeButton.addEventListener('click', this.onCloseButtonClicked);
            this.iframeContainer.append(this.closeButton);
        }
        onCloseButtonClicked() {
            this.closeFrame();
        }
        appendFrameView() {
            this.chatContainer.append(this.frameContainer);
            this.iframeContainer.append(this.frame.element);
        }
        removeFrameView() {
            this.frameContainer.remove();
        }
    }

    /**
     * Represents an error indicating that something went wrong while working with opened chat
     */
    class OpenFrameVipChatError extends VipChatError {
        constructor(innerError) {
            super('Failed to open vip chat.', innerError);
        }
    }

    /**
     * Represents an error indicating that something went wrong when closing an opened chat
     */
    class CloseFrameVipChatError extends VipChatError {
        constructor(innerError) {
            super('Failed to close vip chat.', innerError);
        }
    }

    var __awaiter = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {
        function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
        return new (P || (P = Promise))(function (resolve, reject) {
            function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
            function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
            function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
            step((generator = generator.apply(thisArg, _arguments || [])).next());
        });
    };
    class VipChatService {
        /**
         * Instantiate VipChat SDK
         * @param vipChatOptions VipChat options
         */
        constructor(vipChatOptions) {
            var _a;
            this.vipChatOptions = vipChatOptions;
            this.unreadMessagesState = new UnreadMessagesState();
            this.isInitialized = false;
            this.intervalHandler = null;
            this.messagingUnreadCountSubscriptionToken = null;
            this.lastUnreadCountServerTs = 0;
            this.uriResolver = new UriResolver(this.vipChatOptions.chatUrl, this.vipChatOptions.sessionToken, this.vipChatOptions.hostUrl);
            this.frameController = null;
            this.vipChatOptions.timerPeriod = Math.max((_a = this.vipChatOptions.timerPeriod) !== null && _a !== void 0 ? _a : MIN_TIMER_PERIOD_MS, MIN_TIMER_PERIOD_MS);
            this.httpClient = new ServiceHttpClient(this.vipChatOptions.hostUrl, this.vipChatOptions.sessionToken);
            if (this.vipChatOptions.logHandler !== undefined) {
                Log.handler = this.vipChatOptions.logHandler;
            }
        }
        get isOpened() {
            var _a, _b;
            return (_b = (_a = this.frameController) === null || _a === void 0 ? void 0 : _a.isOpened) !== null && _b !== void 0 ? _b : false;
        }
        get useMessageSubscription() {
            return (typeof this.vipChatOptions.messageSubscribe === 'function' &&
                this.vipChatOptions.forceHttpPolling !== true);
        }
        /**
         * Unread messages state object
         */
        get unreadMessages() {
            return this.unreadMessagesState;
        }
        throwIfVipChatIsNotInitialized() {
            if (this.isInitialized === false) {
                Log.error('Vip chat must be initialized first.');
                throw new VipChatError('Vip chat must be initialized first.');
            }
        }
        /**
         * Open web chat application for user
         * @param extraQueryParams Extra query params for vip chat
         * @param chatContainer Container for chat
         * @returns Promise will be resolved when the chat is closed
         */
        open(extraQueryParams, chatContainer) {
            return this.openFrame(null, extraQueryParams, chatContainer);
        }
        /**
         * Open web chat application for user using popId
         * @param popId Pop id determines what page would be processed by VipChat
         * @param extraQueryParams Extra query params for vip chat
         * @param chatContainer Container for chat
         * @returns Promise will be resolved when the chat is closed
         */
        openWithPopId(popId, extraQueryParams, chatContainer) {
            return this.openFrame(popId, extraQueryParams, chatContainer);
        }
        openFrame(popId, extraQueryParams, chatContainer) {
            var _a;
            return __awaiter(this, void 0, void 0, function* () {
                try {
                    this.throwIfVipChatIsNotInitialized();
                    if (this.isOpened) {
                        Log.error('Vip chat is already opened.');
                        throw new VipChatError('Vip chat is already opened.');
                    }
                    let url;
                    if (popId !== null) {
                        url = this.uriResolver.getUrl(popId, extraQueryParams !== undefined ? extraQueryParams : new Map());
                    }
                    else {
                        url = this.uriResolver.getUrl(extraQueryParams !== undefined ? extraQueryParams : new Map());
                    }
                    Log.info(`Trying to show vip chat. Dialog url: ${url}`);
                    this.frameController = new FrameController(url, getChatContainer(chatContainer), this.updateUnreadMessagesState.bind(this), this.close.bind(this), this.vipChatOptions);
                    yield this.frameController.openFrame();
                    Log.info('Vip chat has been closed.');
                }
                catch (e) {
                    const error = new OpenFrameVipChatError(e);
                    Log.error(error.message);
                    throw error;
                }
                finally {
                    (_a = this.vipChatOptions.onChatFrameClosed) === null || _a === void 0 ? void 0 : _a.call(this);
                }
            });
        }
        /**
         * Initialize VipChat SDK
         */
        initialize() {
            var _a;
            return __awaiter(this, void 0, void 0, function* () {
                Log.info('Start initialization.');
                try {
                    if (this.isInitialized) {
                        throw new VipChatError('Vip chat is already initialized.');
                    }
                    try {
                        const chatStatus = yield this.httpClient.getChatStatus();
                        if (!chatStatus.isChatExist || chatStatus.isBlocked) { // TODO: In future for the case when we will reuse the chat for LucyBot we need to add the check for the chat type
                            Log.info('Chat is not active. Decline chat creation');
                            return;
                        }
                    }
                    catch (e) {
                        Log.error('Error during chat status check', e);
                        return;
                    }
                    yield this.updateUnreadMessagesState();
                    if (this.useMessageSubscription) {
                        this.subscribeToUnreadCountEvents();
                    }
                    else {
                        this.startUnreadMessagesStateMonitoringLoop();
                    }
                    this.isInitialized = true;
                }
                catch (e) {
                    const error = new InitializeVipChatError(e);
                    Log.error(error.message);
                    throw error;
                }
                (_a = this.vipChatOptions.onInitialized) === null || _a === void 0 ? void 0 : _a.call(this);
                Log.info('Initialization completed successfully.');
            });
        }
        subscribeToUnreadCountEvents() {
            const { messageSubscribe } = this.vipChatOptions;
            if (typeof messageSubscribe !== 'function') {
                return;
            }
            Log.info('Subscribing to unread count messaging events.');
            this.messagingUnreadCountSubscriptionToken = messageSubscribe(UNREAD_COUNT_EVENT_TYPE, (event) => {
                this.handleUnreadCountEvent(event);
            });
        }
        handleUnreadCountEvent(event) {
            if (this.isOpened) {
                return;
            }
            if (event.serverTs <= this.lastUnreadCountServerTs) {
                Log.info(`Ignoring stale unread count event (serverTs=${event.serverTs}, last=${this.lastUnreadCountServerTs}).`);
                return;
            }
            this.lastUnreadCountServerTs = event.serverTs;
            if (this.unreadMessagesState.count !== event.unreadCount) {
                Log.info(`Unread count changed via messaging event: ${this.unreadMessagesState.count} -> ${event.unreadCount}.`);
                this.unreadMessagesState = new UnreadMessagesState(event.unreadCount);
                this.onUnreadMessagesStateChanged(this.unreadMessagesState);
            }
        }
        startUnreadMessagesStateMonitoringLoop() {
            if (this.intervalHandler !== null) {
                throw new VipChatError('It is not possible to run the loop more than once.');
            }
            this.intervalHandler = setInterval(this.updateUnreadMessagesByTimer.bind(this), this.vipChatOptions.timerPeriod);
        }
        updateUnreadMessagesByTimer() {
            return __awaiter(this, void 0, void 0, function* () {
                try {
                    yield this.updateUnreadMessagesState();
                }
                catch (e) {
                    if (typeof this.vipChatOptions.onUpdateUnreadMessagesByTimerError === 'function') {
                        this.vipChatOptions.onUpdateUnreadMessagesByTimerError(e);
                    }
                    else {
                        throw e;
                    }
                }
            });
        }
        updateUnreadMessagesState() {
            var _a, _b, _c, _d;
            return __awaiter(this, void 0, void 0, function* () {
                if (this.isOpened) {
                    return;
                }
                Log.info('Trying to update the number of unread messages.');
                (_a = this.vipChatOptions.onUpdateUnreadMessagesStarted) === null || _a === void 0 ? void 0 : _a.call(this);
                try {
                    const unreadMessageResponse = yield this.httpClient.getUnreadMessages();
                    if (unreadMessageResponse.serverTs > this.lastUnreadCountServerTs) {
                        this.lastUnreadCountServerTs = unreadMessageResponse.serverTs;
                    }
                    const messagesCount = (_c = (_b = unreadMessageResponse.unread) === null || _b === void 0 ? void 0 : _b.messagesCount) !== null && _c !== void 0 ? _c : 0;
                    if (this.unreadMessagesState.count !== messagesCount) {
                        this.unreadMessagesState = new UnreadMessagesState(messagesCount);
                        this.onUnreadMessagesStateChanged(this.unreadMessagesState);
                    }
                }
                catch (e) {
                    const error = new UpdateUnreadMessagesVipChatError(e);
                    Log.error(error.message);
                    throw error;
                }
                finally {
                    (_d = this.vipChatOptions.onUpdateUnreadMessagesEnded) === null || _d === void 0 ? void 0 : _d.call(this);
                }
                Log.info('The number of unread messages has been successfully updated.');
            });
        }
        /**
         * Cleanup
         */
        dispose() {
            this.throwIfVipChatIsNotInitialized();
            if (this.intervalHandler !== null) {
                clearInterval(this.intervalHandler);
            }
            if (this.messagingUnreadCountSubscriptionToken !== null) {
                this.messagingUnreadCountSubscriptionToken.unsubscribe();
                this.messagingUnreadCountSubscriptionToken = null;
                Log.info('Unsubscribed from unread count messaging events.');
            }
        }
        onUnreadMessagesStateChanged(newUnreadMessagesState) {
            var _a;
            (_a = this.vipChatOptions.onUnreadMessagesStateChanged) === null || _a === void 0 ? void 0 : _a.call(this, newUnreadMessagesState);
        }
        /**
         * Force close web chat
         */
        close() {
            var _a;
            try {
                this.throwIfVipChatIsNotInitialized();
                if ((_a = this.frameController) === null || _a === void 0 ? void 0 : _a.isOpened) {
                    Log.info('Trying to close vip chat.');
                    this.frameController.closeFrame();
                    Log.info('Vip chat has been successfully closed.');
                }
            }
            catch (e) {
                const error = new CloseFrameVipChatError(e);
                Log.error(error.message);
                throw error;
            }
        }
    }

    exports.ChatServiceVipChatError = ChatServiceVipChatError;
    exports.ClientAppVipChatError = ClientAppVipChatError;
    exports.CloseFrameVipChatError = CloseFrameVipChatError;
    exports.InitializeVipChatError = InitializeVipChatError;
    exports.OpenFrameVipChatError = OpenFrameVipChatError;
    exports.ServiceVipChatError = ServiceVipChatError;
    exports.UnreadMessagesState = UnreadMessagesState;
    exports.UpdateUnreadMessagesVipChatError = UpdateUnreadMessagesVipChatError;
    exports.VipChatError = VipChatError;
    exports.VipChatService = VipChatService;

    Object.defineProperty(exports, '__esModule', { value: true });

    return exports;

})({});
