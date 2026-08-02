package expo.modules.fetch;

import android.content.Context;
import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.net.URL;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* compiled from: ExpoFetchModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lexpo/modules/fetch/ExpoFetchModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", AnalyticsConstantsKt.KEY_CLIENT, "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "cookieHandler", "Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "getCookieHandler", "()Lcom/facebook/react/modules/network/ForwardingCookieHandler;", "cookieHandler$delegate", "cookieJarContainer", "Lcom/facebook/react/modules/network/CookieJarContainer;", "getCookieJarContainer", "()Lcom/facebook/react/modules/network/CookieJarContainer;", "cookieJarContainer$delegate", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "moduleCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getModuleCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "moduleCoroutineScope$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Companion", "expo_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExpoFetchModule extends Module {
    private static final String TAG = "ExpoFetchModule";

    /* renamed from: client$delegate, reason: from kotlin metadata */
    private final Lazy client = LazyKt.lazy(new Function0() { // from class: expo.modules.fetch.ExpoFetchModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OkHttpClient client_delegate$lambda$0;
            client_delegate$lambda$0 = ExpoFetchModule.client_delegate$lambda$0(ExpoFetchModule.this);
            return client_delegate$lambda$0;
        }
    });

    /* renamed from: cookieHandler$delegate, reason: from kotlin metadata */
    private final Lazy cookieHandler = LazyKt.lazy(new Function0() { // from class: expo.modules.fetch.ExpoFetchModule$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ForwardingCookieHandler cookieHandler_delegate$lambda$1;
            cookieHandler_delegate$lambda$1 = ExpoFetchModule.cookieHandler_delegate$lambda$1(ExpoFetchModule.this);
            return cookieHandler_delegate$lambda$1;
        }
    });

    /* renamed from: cookieJarContainer$delegate, reason: from kotlin metadata */
    private final Lazy cookieJarContainer = LazyKt.lazy(new Function0() { // from class: expo.modules.fetch.ExpoFetchModule$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CookieJarContainer cookieJarContainer_delegate$lambda$2;
            cookieJarContainer_delegate$lambda$2 = ExpoFetchModule.cookieJarContainer_delegate$lambda$2(ExpoFetchModule.this);
            return cookieJarContainer_delegate$lambda$2;
        }
    });

    /* renamed from: moduleCoroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy moduleCoroutineScope = LazyKt.lazy(new Function0() { // from class: expo.modules.fetch.ExpoFetchModule$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CoroutineScope moduleCoroutineScope_delegate$lambda$3;
            moduleCoroutineScope_delegate$lambda$3 = ExpoFetchModule.moduleCoroutineScope_delegate$lambda$3(ExpoFetchModule.this);
            return moduleCoroutineScope_delegate$lambda$3;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient getClient() {
        return (OkHttpClient) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient client_delegate$lambda$0(ExpoFetchModule expoFetchModule) {
        return OkHttpClientProvider.createClient(expoFetchModule.getReactContext()).newBuilder().addInterceptor(new OkHttpFileUrlInterceptor(expoFetchModule.getReactContext())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForwardingCookieHandler cookieHandler_delegate$lambda$1(ExpoFetchModule expoFetchModule) {
        return new ForwardingCookieHandler(expoFetchModule.getReactContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ForwardingCookieHandler getCookieHandler() {
        return (ForwardingCookieHandler) this.cookieHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CookieJarContainer cookieJarContainer_delegate$lambda$2(ExpoFetchModule expoFetchModule) {
        CookieJar cookieJar = expoFetchModule.getClient().cookieJar();
        Intrinsics.checkNotNull(cookieJar, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        return (CookieJarContainer) cookieJar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CookieJarContainer getCookieJarContainer() {
        return (CookieJarContainer) this.cookieJarContainer.getValue();
    }

    private final ReactContext getReactContext() {
        Context reactContext = getAppContext().getReactContext();
        ReactContext reactContext2 = reactContext instanceof ReactContext ? (ReactContext) reactContext : null;
        if (reactContext2 != null) {
            return reactContext2;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getModuleCoroutineScope() {
        return (CoroutineScope) this.moduleCoroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope moduleCoroutineScope_delegate$lambda$3(ExpoFetchModule expoFetchModule) {
        return CoroutineScopeKt.CoroutineScope(expoFetchModule.getAppContext().getModulesQueue().getCoroutineContext().plus(new CoroutineName("expo.modules.fetch.CoroutineScope")));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0153 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0188 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0cb4 A[Catch: all -> 0x0cc8, TRY_ENTER, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0749 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x069e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0389 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0381 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0304 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x033e A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x035f A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x040f A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01a1 A[Catch: all -> 0x0cc8, TRY_LEAVE, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x047d A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00fa A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x011b A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04eb A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0559 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05c8 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0636 A[Catch: all -> 0x0cc8, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07de A[Catch: all -> 0x0cc8, TRY_LEAVE, TryCatch #5 {all -> 0x0cc8, blocks: (B:3:0x0033, B:6:0x0082, B:11:0x012d, B:13:0x0153, B:14:0x016b, B:16:0x0188, B:17:0x0245, B:20:0x02e2, B:23:0x036e, B:25:0x0381, B:26:0x03d0, B:28:0x040f, B:29:0x0427, B:31:0x047d, B:32:0x0495, B:34:0x04eb, B:35:0x0503, B:37:0x0559, B:38:0x0571, B:40:0x05c8, B:41:0x05e0, B:43:0x0636, B:44:0x064e, B:47:0x0701, B:50:0x07ac, B:52:0x07de, B:57:0x0875, B:60:0x090c, B:62:0x0922, B:63:0x093a, B:66:0x09e0, B:69:0x0a67, B:72:0x0af0, B:119:0x0b3b, B:121:0x0b42, B:122:0x0b55, B:125:0x0b5c, B:128:0x0b69, B:129:0x0b61, B:74:0x0b6e, B:76:0x0b95, B:77:0x0c9a, B:81:0x0ba8, B:84:0x0c36, B:86:0x0c49, B:88:0x0c52, B:90:0x0c5a, B:91:0x0c62, B:93:0x0c6a, B:94:0x0c72, B:96:0x0c7a, B:97:0x0c82, B:99:0x0c8a, B:100:0x0c92, B:103:0x0bfe, B:105:0x0c05, B:106:0x0c1a, B:109:0x0c21, B:112:0x0c30, B:113:0x0c26, B:116:0x0bf4, B:132:0x0b31, B:135:0x0ab8, B:137:0x0abf, B:138:0x0ad4, B:141:0x0adb, B:144:0x0aea, B:145:0x0ae0, B:148:0x0aae, B:151:0x0a2f, B:153:0x0a36, B:154:0x0a4b, B:157:0x0a52, B:160:0x0a61, B:161:0x0a57, B:164:0x0a25, B:167:0x09a8, B:169:0x09af, B:170:0x09c4, B:173:0x09cb, B:176:0x09da, B:177:0x09d0, B:180:0x099e, B:183:0x08d4, B:185:0x08db, B:186:0x08f0, B:189:0x08f7, B:192:0x0906, B:193:0x08fc, B:196:0x08ca, B:199:0x083c, B:201:0x0843, B:202:0x0858, B:205:0x085f, B:208:0x086e, B:209:0x0864, B:212:0x0832, B:213:0x0cb4, B:214:0x0cbd, B:217:0x0774, B:219:0x077b, B:220:0x0790, B:223:0x0797, B:226:0x07a6, B:227:0x079c, B:230:0x076a, B:233:0x06c9, B:235:0x06d0, B:236:0x06e5, B:239:0x06ec, B:242:0x06fb, B:243:0x06f1, B:246:0x06bf, B:247:0x0389, B:249:0x0391, B:250:0x0399, B:252:0x03a1, B:253:0x03a9, B:255:0x03b1, B:256:0x03b9, B:258:0x03c1, B:259:0x03c9, B:265:0x0337, B:267:0x033e, B:268:0x0353, B:271:0x035a, B:274:0x0369, B:275:0x035f, B:278:0x032d, B:284:0x02aa, B:286:0x02b1, B:287:0x02c6, B:290:0x02cd, B:293:0x02dc, B:294:0x02d2, B:297:0x02a0, B:298:0x01a1, B:301:0x0234, B:304:0x01fc, B:306:0x0202, B:307:0x0217, B:310:0x021e, B:313:0x022d, B:314:0x0223, B:317:0x01f2, B:326:0x00f4, B:328:0x00fa, B:329:0x010f, B:332:0x0116, B:335:0x0125, B:336:0x011b, B:339:0x00ea, B:346:0x0cbe, B:347:0x0cc7, B:150:0x0a02, B:216:0x0749, B:182:0x08a9, B:134:0x0a8b, B:118:0x0b10, B:303:0x01d1, B:198:0x0811, B:102:0x0bd3, B:166:0x097d, B:232:0x069e, B:283:0x027f), top: B:2:0x0033, inners: #2, #6, #7, #9, #10, #11, #12, #13, #14, #15, #16 }] */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Class cls;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Object m13470constructorimpl;
        Throwable m13473exceptionOrNullimpl;
        TypeDescriptor typeDescriptor;
        ReturnType returnType;
        int i;
        ModuleDefinitionBuilder moduleDefinitionBuilder2;
        ClassComponentBuilder classComponentBuilder;
        Object m13470constructorimpl2;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AnyType anyType;
        Object m13470constructorimpl3;
        AnyType anyType2;
        ClassComponentBuilder classComponentBuilder2;
        Object m13470constructorimpl4;
        Object obj;
        Throwable m13473exceptionOrNullimpl2;
        TypeDescriptor typeDescriptor2;
        ReturnType returnType2;
        ReturnType returnType3;
        ReturnType returnType4;
        ReturnType returnType5;
        ReturnType returnType6;
        ReturnType returnType7;
        AnyType anyType3;
        Object m13470constructorimpl5;
        AnyType anyType4;
        Object m13470constructorimpl6;
        Module module;
        Object m13470constructorimpl7;
        Object obj2;
        Object m13470constructorimpl8;
        Object m13470constructorimpl9;
        Object m13470constructorimpl10;
        Object m13470constructorimpl11;
        Object m13470constructorimpl12;
        Object m13470constructorimpl13;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        ExpoFetchModule expoFetchModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (expoFetchModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = new ModuleDefinitionBuilder(expoFetchModule);
            moduleDefinitionBuilder3.Name("ExpoFetchModule");
            moduleDefinitionBuilder3.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CookieJarContainer cookieJarContainer;
                    ForwardingCookieHandler cookieHandler;
                    cookieJarContainer = ExpoFetchModule.this.getCookieJarContainer();
                    cookieHandler = ExpoFetchModule.this.getCookieHandler();
                    cookieJarContainer.setCookieJar(new JavaNetCookieJar(cookieHandler));
                }
            }));
            moduleDefinitionBuilder3.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ForwardingCookieHandler cookieHandler;
                    CookieJarContainer cookieJarContainer;
                    String str;
                    CoroutineScope moduleCoroutineScope;
                    cookieHandler = ExpoFetchModule.this.getCookieHandler();
                    cookieHandler.destroy();
                    cookieJarContainer = ExpoFetchModule.this.getCookieJarContainer();
                    cookieJarContainer.removeCookieJar();
                    try {
                        moduleCoroutineScope = ExpoFetchModule.this.getModuleCoroutineScope();
                        CoroutineScopeKt.cancel(moduleCoroutineScope, new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        str = ExpoFetchModule.TAG;
                        Log.e(str, "The scope does not have a job in it");
                    }
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder3;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NativeResponse.class);
            Module module2 = moduleDefinitionBuilder4.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext = module2.getAppContext();
            String simpleName = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
            if (anyType5 != null) {
                cls = byte[].class;
                moduleDefinitionBuilder = moduleDefinitionBuilder3;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    cls = byte[].class;
                    try {
                        moduleDefinitionBuilder = moduleDefinitionBuilder3;
                        try {
                            m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$Class$1
                                @Override // kotlin.jvm.functions.Function0
                                public final KType invoke() {
                                    return Reflection.typeOf(NativeResponse.class);
                                }
                            }));
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion2 = Result.INSTANCE;
                            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                            m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                            if (m13473exceptionOrNullimpl != null) {
                            }
                            if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                            }
                            typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                            if (typeDescriptor == null) {
                            }
                            anyType5 = new AnyType(typeDescriptor, null);
                            ClassComponentBuilder classComponentBuilder3 = new ClassComponentBuilder(appContext, simpleName, orCreateKotlinClass, anyType5, moduleDefinitionBuilder4.getConverters());
                            AnyType[] anyTypeArr = new AnyType[0];
                            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                            returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                            if (returnType == null) {
                            }
                            classComponentBuilder3.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    CoroutineScope moduleCoroutineScope;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AppContext appContext2 = ExpoFetchModule.this.getAppContext();
                                    moduleCoroutineScope = ExpoFetchModule.this.getModuleCoroutineScope();
                                    return new NativeResponse(appContext2, moduleCoroutineScope);
                                }
                            }));
                            ClassComponentBuilder classComponentBuilder4 = classComponentBuilder3;
                            if (Intrinsics.areEqual(NativeResponse.class, Promise.class)) {
                            }
                            classComponentBuilder4.getAsyncFunctions().put("startStreaming", untypedAsyncFunctionComponent);
                            ClassComponentBuilder classComponentBuilder5 = classComponentBuilder;
                            TypeConverterProvider converters = classComponentBuilder5.getConverters();
                            AnyType[] anyTypeArr2 = new AnyType[2];
                            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                            if (anyType == null) {
                            }
                            anyTypeArr2[0] = anyType;
                            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                            if (anyType2 != null) {
                            }
                            anyTypeArr2[i] = anyType2;
                            Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6
                                @Override // kotlin.jvm.functions.Function1
                                public final Unit invoke(Object[] objArr) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Object obj3 = objArr[0];
                                    ((NativeResponse) obj3).cancelStreaming();
                                    return Unit.INSTANCE;
                                }
                            };
                            classComponentBuilder2.getAsyncFunctions().put("cancelStreaming", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("cancelStreaming", anyTypeArr2, function1));
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "bodyUsed");
                            AnyType[] anyTypeArr3 = new AnyType[i];
                            anyTypeArr3[0] = new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null);
                            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
                            returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                            if (returnType2 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr3, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Boolean.valueOf(((NativeResponse) it[0]).getBodyUsed());
                                }
                            });
                            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
                            syncFunctionComponent.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
                            classComponentBuilder.getProperties().put("bodyUsed", propertyComponentBuilderWithThis);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "_rawHeaders");
                            AnyType[] anyTypeArr4 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
                            ReturnTypeProvider returnTypeProvider3 = ReturnTypeProvider.INSTANCE;
                            returnType3 = returnTypeProvider3.getTypes().get(Reflection.getOrCreateKotlinClass(List.class));
                            if (returnType3 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent("get", anyTypeArr4, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    List<Pair<String, String>> headers;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                    return (responseInit == null || (headers = responseInit.getHeaders()) == null) ? CollectionsKt.emptyList() : headers;
                                }
                            });
                            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
                            syncFunctionComponent2.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
                            classComponentBuilder.getProperties().put("_rawHeaders", propertyComponentBuilderWithThis2);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "status");
                            AnyType[] anyTypeArr5 = {new AnyType(propertyComponentBuilderWithThis3.getThisType(), null, 2, null)};
                            ReturnTypeProvider returnTypeProvider4 = ReturnTypeProvider.INSTANCE;
                            returnType4 = returnTypeProvider4.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
                            if (returnType4 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent3 = new SyncFunctionComponent("get", anyTypeArr5, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                    return Integer.valueOf(responseInit != null ? responseInit.getStatus() : -1);
                                }
                            });
                            syncFunctionComponent3.setOwnerType(propertyComponentBuilderWithThis3.getThisType());
                            syncFunctionComponent3.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis3.setGetter(syncFunctionComponent3);
                            classComponentBuilder.getProperties().put("status", propertyComponentBuilderWithThis3);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "statusText");
                            AnyType[] anyTypeArr6 = {new AnyType(propertyComponentBuilderWithThis4.getThisType(), null, 2, null)};
                            ReturnTypeProvider returnTypeProvider5 = ReturnTypeProvider.INSTANCE;
                            returnType5 = returnTypeProvider5.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                            if (returnType5 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent4 = new SyncFunctionComponent("get", anyTypeArr6, returnType5, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    String statusText;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                    return (responseInit == null || (statusText = responseInit.getStatusText()) == null) ? "" : statusText;
                                }
                            });
                            syncFunctionComponent4.setOwnerType(propertyComponentBuilderWithThis4.getThisType());
                            syncFunctionComponent4.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis4.setGetter(syncFunctionComponent4);
                            classComponentBuilder.getProperties().put("statusText", propertyComponentBuilderWithThis4);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis5 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "url");
                            AnyType[] anyTypeArr7 = {new AnyType(propertyComponentBuilderWithThis5.getThisType(), null, 2, null)};
                            ReturnTypeProvider returnTypeProvider6 = ReturnTypeProvider.INSTANCE;
                            returnType6 = returnTypeProvider6.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                            if (returnType6 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent5 = new SyncFunctionComponent("get", anyTypeArr7, returnType6, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    String url;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                    return (responseInit == null || (url = responseInit.getUrl()) == null) ? "" : url;
                                }
                            });
                            syncFunctionComponent5.setOwnerType(propertyComponentBuilderWithThis5.getThisType());
                            syncFunctionComponent5.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis5.setGetter(syncFunctionComponent5);
                            classComponentBuilder.getProperties().put("url", propertyComponentBuilderWithThis5);
                            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis6 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "redirected");
                            AnyType[] anyTypeArr8 = {new AnyType(propertyComponentBuilderWithThis6.getThisType(), null, 2, null)};
                            ReturnTypeProvider returnTypeProvider7 = ReturnTypeProvider.INSTANCE;
                            returnType7 = returnTypeProvider7.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                            if (returnType7 == null) {
                            }
                            SyncFunctionComponent syncFunctionComponent6 = new SyncFunctionComponent("get", anyTypeArr8, returnType7, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object[] it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                    return Boolean.valueOf(responseInit != null ? responseInit.getRedirected() : false);
                                }
                            });
                            syncFunctionComponent6.setOwnerType(propertyComponentBuilderWithThis6.getThisType());
                            syncFunctionComponent6.setCanTakeOwner(true);
                            propertyComponentBuilderWithThis6.setGetter(syncFunctionComponent6);
                            classComponentBuilder.getProperties().put("redirected", propertyComponentBuilderWithThis6);
                            ClassComponentBuilder classComponentBuilder6 = classComponentBuilder;
                            TypeConverterProvider converters2 = classComponentBuilder6.getConverters();
                            AnyType[] anyTypeArr9 = new AnyType[1];
                            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                            if (anyType3 == null) {
                            }
                            anyTypeArr9[0] = anyType3;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("arrayBuffer", anyTypeArr9, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, final Promise promise) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                    nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$10$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                            invoke2(responseState);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ResponseState it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            promise.resolve(new NativeArrayBuffer(NativeResponse.this.getSink().finalize(true)));
                                        }
                                    });
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            classComponentBuilder6.getAsyncFunctions().put("arrayBuffer", asyncFunctionWithPromiseComponent);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
                            ClassComponentBuilder classComponentBuilder7 = classComponentBuilder;
                            TypeConverterProvider converters3 = classComponentBuilder7.getConverters();
                            AnyType[] anyTypeArr10 = new AnyType[1];
                            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                            if (anyType4 == null) {
                            }
                            anyTypeArr10[0] = anyType4;
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("text", anyTypeArr10, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object[] objArr, final Promise promise) {
                                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                    Intrinsics.checkNotNullParameter(promise, "promise");
                                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                    nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$11$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                            invoke2(responseState);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ResponseState it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            byte[] array = NativeResponse.this.getSink().finalize(false).array();
                                            Intrinsics.checkNotNull(array);
                                            promise.resolve(new String(array, Charsets.UTF_8));
                                        }
                                    });
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                    invoke2(objArr, promise);
                                    return Unit.INSTANCE;
                                }
                            });
                            classComponentBuilder7.getAsyncFunctions().put("text", asyncFunctionWithPromiseComponent3);
                            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
                            moduleDefinitionBuilder2.getClassData().add(classComponentBuilder.buildClass());
                            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(NativeRequest.class);
                            module = moduleDefinitionBuilder5.getModule();
                            if (module != null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        moduleDefinitionBuilder = moduleDefinitionBuilder3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                        if (m13473exceptionOrNullimpl != null) {
                        }
                        if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        }
                        typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                        if (typeDescriptor == null) {
                        }
                        anyType5 = new AnyType(typeDescriptor, null);
                        ClassComponentBuilder classComponentBuilder32 = new ClassComponentBuilder(appContext, simpleName, orCreateKotlinClass, anyType5, moduleDefinitionBuilder4.getConverters());
                        AnyType[] anyTypeArr11 = new AnyType[0];
                        ReturnTypeProvider returnTypeProvider8 = ReturnTypeProvider.INSTANCE;
                        returnType = returnTypeProvider8.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
                        if (returnType == null) {
                        }
                        classComponentBuilder32.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr11, returnType, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                CoroutineScope moduleCoroutineScope;
                                Intrinsics.checkNotNullParameter(it, "it");
                                AppContext appContext2 = ExpoFetchModule.this.getAppContext();
                                moduleCoroutineScope = ExpoFetchModule.this.getModuleCoroutineScope();
                                return new NativeResponse(appContext2, moduleCoroutineScope);
                            }
                        }));
                        ClassComponentBuilder classComponentBuilder42 = classComponentBuilder32;
                        if (Intrinsics.areEqual(NativeResponse.class, Promise.class)) {
                        }
                        classComponentBuilder42.getAsyncFunctions().put("startStreaming", untypedAsyncFunctionComponent);
                        ClassComponentBuilder classComponentBuilder52 = classComponentBuilder;
                        TypeConverterProvider converters4 = classComponentBuilder52.getConverters();
                        AnyType[] anyTypeArr22 = new AnyType[2];
                        anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                        if (anyType == null) {
                        }
                        anyTypeArr22[0] = anyType;
                        anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                        if (anyType2 != null) {
                        }
                        anyTypeArr22[i] = anyType2;
                        Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Object obj3 = objArr[0];
                                ((NativeResponse) obj3).cancelStreaming();
                                return Unit.INSTANCE;
                            }
                        };
                        classComponentBuilder2.getAsyncFunctions().put("cancelStreaming", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12) : new UntypedAsyncFunctionComponent("cancelStreaming", anyTypeArr22, function12));
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis7 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "bodyUsed");
                        AnyType[] anyTypeArr32 = new AnyType[i];
                        anyTypeArr32[0] = new AnyType(propertyComponentBuilderWithThis7.getThisType(), null, 2, null);
                        ReturnTypeProvider returnTypeProvider22 = ReturnTypeProvider.INSTANCE;
                        returnType2 = returnTypeProvider22.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                        if (returnType2 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent7 = new SyncFunctionComponent("get", anyTypeArr32, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Boolean.valueOf(((NativeResponse) it[0]).getBodyUsed());
                            }
                        });
                        syncFunctionComponent7.setOwnerType(propertyComponentBuilderWithThis7.getThisType());
                        syncFunctionComponent7.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis7.setGetter(syncFunctionComponent7);
                        classComponentBuilder.getProperties().put("bodyUsed", propertyComponentBuilderWithThis7);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis22 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "_rawHeaders");
                        AnyType[] anyTypeArr42 = {new AnyType(propertyComponentBuilderWithThis22.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider32 = ReturnTypeProvider.INSTANCE;
                        returnType3 = returnTypeProvider32.getTypes().get(Reflection.getOrCreateKotlinClass(List.class));
                        if (returnType3 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent22 = new SyncFunctionComponent("get", anyTypeArr42, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                List<Pair<String, String>> headers;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (headers = responseInit.getHeaders()) == null) ? CollectionsKt.emptyList() : headers;
                            }
                        });
                        syncFunctionComponent22.setOwnerType(propertyComponentBuilderWithThis22.getThisType());
                        syncFunctionComponent22.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis22.setGetter(syncFunctionComponent22);
                        classComponentBuilder.getProperties().put("_rawHeaders", propertyComponentBuilderWithThis22);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis32 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "status");
                        AnyType[] anyTypeArr52 = {new AnyType(propertyComponentBuilderWithThis32.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider42 = ReturnTypeProvider.INSTANCE;
                        returnType4 = returnTypeProvider42.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
                        if (returnType4 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent32 = new SyncFunctionComponent("get", anyTypeArr52, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return Integer.valueOf(responseInit != null ? responseInit.getStatus() : -1);
                            }
                        });
                        syncFunctionComponent32.setOwnerType(propertyComponentBuilderWithThis32.getThisType());
                        syncFunctionComponent32.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis32.setGetter(syncFunctionComponent32);
                        classComponentBuilder.getProperties().put("status", propertyComponentBuilderWithThis32);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis42 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "statusText");
                        AnyType[] anyTypeArr62 = {new AnyType(propertyComponentBuilderWithThis42.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider52 = ReturnTypeProvider.INSTANCE;
                        returnType5 = returnTypeProvider52.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                        if (returnType5 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent42 = new SyncFunctionComponent("get", anyTypeArr62, returnType5, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                String statusText;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (statusText = responseInit.getStatusText()) == null) ? "" : statusText;
                            }
                        });
                        syncFunctionComponent42.setOwnerType(propertyComponentBuilderWithThis42.getThisType());
                        syncFunctionComponent42.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis42.setGetter(syncFunctionComponent42);
                        classComponentBuilder.getProperties().put("statusText", propertyComponentBuilderWithThis42);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis52 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "url");
                        AnyType[] anyTypeArr72 = {new AnyType(propertyComponentBuilderWithThis52.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider62 = ReturnTypeProvider.INSTANCE;
                        returnType6 = returnTypeProvider62.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                        if (returnType6 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent52 = new SyncFunctionComponent("get", anyTypeArr72, returnType6, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                String url;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (url = responseInit.getUrl()) == null) ? "" : url;
                            }
                        });
                        syncFunctionComponent52.setOwnerType(propertyComponentBuilderWithThis52.getThisType());
                        syncFunctionComponent52.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis52.setGetter(syncFunctionComponent52);
                        classComponentBuilder.getProperties().put("url", propertyComponentBuilderWithThis52);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis62 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "redirected");
                        AnyType[] anyTypeArr82 = {new AnyType(propertyComponentBuilderWithThis62.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider72 = ReturnTypeProvider.INSTANCE;
                        returnType7 = returnTypeProvider72.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                        if (returnType7 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent62 = new SyncFunctionComponent("get", anyTypeArr82, returnType7, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return Boolean.valueOf(responseInit != null ? responseInit.getRedirected() : false);
                            }
                        });
                        syncFunctionComponent62.setOwnerType(propertyComponentBuilderWithThis62.getThisType());
                        syncFunctionComponent62.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis62.setGetter(syncFunctionComponent62);
                        classComponentBuilder.getProperties().put("redirected", propertyComponentBuilderWithThis62);
                        ClassComponentBuilder classComponentBuilder62 = classComponentBuilder;
                        TypeConverterProvider converters22 = classComponentBuilder62.getConverters();
                        AnyType[] anyTypeArr92 = new AnyType[1];
                        anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                        if (anyType3 == null) {
                        }
                        anyTypeArr92[0] = anyType3;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("arrayBuffer", anyTypeArr92, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, final Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$10$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                        invoke2(responseState);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(ResponseState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        promise.resolve(new NativeArrayBuffer(NativeResponse.this.getSink().finalize(true)));
                                    }
                                });
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        classComponentBuilder62.getAsyncFunctions().put("arrayBuffer", asyncFunctionWithPromiseComponent5);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent22 = asyncFunctionWithPromiseComponent5;
                        ClassComponentBuilder classComponentBuilder72 = classComponentBuilder;
                        TypeConverterProvider converters32 = classComponentBuilder72.getConverters();
                        AnyType[] anyTypeArr102 = new AnyType[1];
                        anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                        if (anyType4 == null) {
                        }
                        anyTypeArr102[0] = anyType4;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent32 = new AsyncFunctionWithPromiseComponent("text", anyTypeArr102, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, final Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$11$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                        invoke2(responseState);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(ResponseState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        byte[] array = NativeResponse.this.getSink().finalize(false).array();
                                        Intrinsics.checkNotNull(array);
                                        promise.resolve(new String(array, Charsets.UTF_8));
                                    }
                                });
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        classComponentBuilder72.getAsyncFunctions().put("text", asyncFunctionWithPromiseComponent32);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent42 = asyncFunctionWithPromiseComponent32;
                        moduleDefinitionBuilder2.getClassData().add(classComponentBuilder.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder52 = moduleDefinitionBuilder;
                        KClass orCreateKotlinClass22 = Reflection.getOrCreateKotlinClass(NativeRequest.class);
                        module = moduleDefinitionBuilder52.getModule();
                        if (module != null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cls = byte[].class;
                }
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                }
                anyType5 = new AnyType(typeDescriptor, null);
            }
            ClassComponentBuilder classComponentBuilder322 = new ClassComponentBuilder(appContext, simpleName, orCreateKotlinClass, anyType5, moduleDefinitionBuilder4.getConverters());
            AnyType[] anyTypeArr112 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider82 = ReturnTypeProvider.INSTANCE;
            returnType = returnTypeProvider82.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
                returnTypeProvider82.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType);
            }
            classComponentBuilder322.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr112, returnType, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Constructor$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    CoroutineScope moduleCoroutineScope;
                    Intrinsics.checkNotNullParameter(it, "it");
                    AppContext appContext2 = ExpoFetchModule.this.getAppContext();
                    moduleCoroutineScope = ExpoFetchModule.this.getModuleCoroutineScope();
                    return new NativeResponse(appContext2, moduleCoroutineScope);
                }
            }));
            ClassComponentBuilder classComponentBuilder422 = classComponentBuilder322;
            if (Intrinsics.areEqual(NativeResponse.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("startStreaming", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((NativeResponse) promise).startStreaming();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
                moduleDefinitionBuilder2 = moduleDefinitionBuilder4;
                classComponentBuilder = classComponentBuilder322;
                i = 1;
            } else {
                TypeConverterProvider converters5 = classComponentBuilder422.getConverters();
                AnyType[] anyTypeArr12 = new AnyType[1];
                i = 1;
                moduleDefinitionBuilder2 = moduleDefinitionBuilder4;
                classComponentBuilder = classComponentBuilder322;
                AnyType anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                if (anyType6 == null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(NativeResponse.class);
                            }
                        }));
                    } catch (Throwable th4) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                    }
                    Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                        m13470constructorimpl2 = null;
                    }
                    TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl2;
                    if (typeDescriptor3 == null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                    }
                    anyType6 = new AnyType(typeDescriptor3, converters5);
                }
                anyTypeArr12[0] = anyType6;
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("startStreaming", anyTypeArr12, new Function1<Object[], byte[]>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final byte[] invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return ((NativeResponse) objArr[0]).startStreaming();
                    }
                });
            }
            classComponentBuilder422.getAsyncFunctions().put("startStreaming", untypedAsyncFunctionComponent);
            ClassComponentBuilder classComponentBuilder522 = classComponentBuilder;
            TypeConverterProvider converters42 = classComponentBuilder522.getConverters();
            AnyType[] anyTypeArr222 = new AnyType[2];
            anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
            if (anyType == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeResponse.class);
                        }
                    }));
                } catch (Throwable th5) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                }
                Object obj3 = m13470constructorimpl3;
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(obj3);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(obj3)) {
                    obj3 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) obj3;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                }
                anyType = new AnyType(typeDescriptor4, converters42);
            }
            anyTypeArr222[0] = anyType;
            anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 != null) {
                classComponentBuilder2 = classComponentBuilder522;
            } else {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    classComponentBuilder2 = classComponentBuilder522;
                    try {
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th6) {
                        th = th6;
                        Result.Companion companion8 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th));
                        obj = m13470constructorimpl4;
                        m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(obj);
                        if (m13473exceptionOrNullimpl2 != null) {
                        }
                        if (Result.m13476isFailureimpl(obj)) {
                        }
                        typeDescriptor2 = (TypeDescriptor) obj;
                        if (typeDescriptor2 != null) {
                        }
                        anyType2 = new AnyType(typeDescriptor2, converters42);
                        anyTypeArr222[i] = anyType2;
                        Function1<Object[], Unit> function122 = new Function1<Object[], Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function1
                            public final Unit invoke(Object[] objArr) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Object obj32 = objArr[0];
                                ((NativeResponse) obj32).cancelStreaming();
                                return Unit.INSTANCE;
                            }
                        };
                        classComponentBuilder2.getAsyncFunctions().put("cancelStreaming", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122) : new UntypedAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function122));
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis72 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "bodyUsed");
                        AnyType[] anyTypeArr322 = new AnyType[i];
                        anyTypeArr322[0] = new AnyType(propertyComponentBuilderWithThis72.getThisType(), null, 2, null);
                        ReturnTypeProvider returnTypeProvider222 = ReturnTypeProvider.INSTANCE;
                        returnType2 = returnTypeProvider222.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                        if (returnType2 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent72 = new SyncFunctionComponent("get", anyTypeArr322, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Boolean.valueOf(((NativeResponse) it[0]).getBodyUsed());
                            }
                        });
                        syncFunctionComponent72.setOwnerType(propertyComponentBuilderWithThis72.getThisType());
                        syncFunctionComponent72.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis72.setGetter(syncFunctionComponent72);
                        classComponentBuilder.getProperties().put("bodyUsed", propertyComponentBuilderWithThis72);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "_rawHeaders");
                        AnyType[] anyTypeArr422 = {new AnyType(propertyComponentBuilderWithThis222.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider322 = ReturnTypeProvider.INSTANCE;
                        returnType3 = returnTypeProvider322.getTypes().get(Reflection.getOrCreateKotlinClass(List.class));
                        if (returnType3 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent222 = new SyncFunctionComponent("get", anyTypeArr422, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                List<Pair<String, String>> headers;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (headers = responseInit.getHeaders()) == null) ? CollectionsKt.emptyList() : headers;
                            }
                        });
                        syncFunctionComponent222.setOwnerType(propertyComponentBuilderWithThis222.getThisType());
                        syncFunctionComponent222.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis222.setGetter(syncFunctionComponent222);
                        classComponentBuilder.getProperties().put("_rawHeaders", propertyComponentBuilderWithThis222);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis322 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "status");
                        AnyType[] anyTypeArr522 = {new AnyType(propertyComponentBuilderWithThis322.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider422 = ReturnTypeProvider.INSTANCE;
                        returnType4 = returnTypeProvider422.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
                        if (returnType4 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent322 = new SyncFunctionComponent("get", anyTypeArr522, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return Integer.valueOf(responseInit != null ? responseInit.getStatus() : -1);
                            }
                        });
                        syncFunctionComponent322.setOwnerType(propertyComponentBuilderWithThis322.getThisType());
                        syncFunctionComponent322.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis322.setGetter(syncFunctionComponent322);
                        classComponentBuilder.getProperties().put("status", propertyComponentBuilderWithThis322);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis422 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "statusText");
                        AnyType[] anyTypeArr622 = {new AnyType(propertyComponentBuilderWithThis422.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider522 = ReturnTypeProvider.INSTANCE;
                        returnType5 = returnTypeProvider522.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                        if (returnType5 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent422 = new SyncFunctionComponent("get", anyTypeArr622, returnType5, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                String statusText;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (statusText = responseInit.getStatusText()) == null) ? "" : statusText;
                            }
                        });
                        syncFunctionComponent422.setOwnerType(propertyComponentBuilderWithThis422.getThisType());
                        syncFunctionComponent422.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis422.setGetter(syncFunctionComponent422);
                        classComponentBuilder.getProperties().put("statusText", propertyComponentBuilderWithThis422);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis522 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "url");
                        AnyType[] anyTypeArr722 = {new AnyType(propertyComponentBuilderWithThis522.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider622 = ReturnTypeProvider.INSTANCE;
                        returnType6 = returnTypeProvider622.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
                        if (returnType6 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent522 = new SyncFunctionComponent("get", anyTypeArr722, returnType6, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                String url;
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return (responseInit == null || (url = responseInit.getUrl()) == null) ? "" : url;
                            }
                        });
                        syncFunctionComponent522.setOwnerType(propertyComponentBuilderWithThis522.getThisType());
                        syncFunctionComponent522.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis522.setGetter(syncFunctionComponent522);
                        classComponentBuilder.getProperties().put("url", propertyComponentBuilderWithThis522);
                        PropertyComponentBuilderWithThis propertyComponentBuilderWithThis622 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "redirected");
                        AnyType[] anyTypeArr822 = {new AnyType(propertyComponentBuilderWithThis622.getThisType(), null, 2, null)};
                        ReturnTypeProvider returnTypeProvider722 = ReturnTypeProvider.INSTANCE;
                        returnType7 = returnTypeProvider722.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
                        if (returnType7 == null) {
                        }
                        SyncFunctionComponent syncFunctionComponent622 = new SyncFunctionComponent("get", anyTypeArr822, returnType7, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object[] it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                                return Boolean.valueOf(responseInit != null ? responseInit.getRedirected() : false);
                            }
                        });
                        syncFunctionComponent622.setOwnerType(propertyComponentBuilderWithThis622.getThisType());
                        syncFunctionComponent622.setCanTakeOwner(true);
                        propertyComponentBuilderWithThis622.setGetter(syncFunctionComponent622);
                        classComponentBuilder.getProperties().put("redirected", propertyComponentBuilderWithThis622);
                        ClassComponentBuilder classComponentBuilder622 = classComponentBuilder;
                        TypeConverterProvider converters222 = classComponentBuilder622.getConverters();
                        AnyType[] anyTypeArr922 = new AnyType[1];
                        anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                        if (anyType3 == null) {
                        }
                        anyTypeArr922[0] = anyType3;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent52 = new AsyncFunctionWithPromiseComponent("arrayBuffer", anyTypeArr922, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, final Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$10$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                        invoke2(responseState);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(ResponseState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        promise.resolve(new NativeArrayBuffer(NativeResponse.this.getSink().finalize(true)));
                                    }
                                });
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        classComponentBuilder622.getAsyncFunctions().put("arrayBuffer", asyncFunctionWithPromiseComponent52);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent222 = asyncFunctionWithPromiseComponent52;
                        ClassComponentBuilder classComponentBuilder722 = classComponentBuilder;
                        TypeConverterProvider converters322 = classComponentBuilder722.getConverters();
                        AnyType[] anyTypeArr1022 = new AnyType[1];
                        anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
                        if (anyType4 == null) {
                        }
                        anyTypeArr1022[0] = anyType4;
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent322 = new AsyncFunctionWithPromiseComponent("text", anyTypeArr1022, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Object[] objArr, final Promise promise) {
                                Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                                Intrinsics.checkNotNullParameter(promise, "promise");
                                final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                                nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$11$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                                        invoke2(responseState);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(ResponseState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        byte[] array = NativeResponse.this.getSink().finalize(false).array();
                                        Intrinsics.checkNotNull(array);
                                        promise.resolve(new String(array, Charsets.UTF_8));
                                    }
                                });
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                                invoke2(objArr, promise);
                                return Unit.INSTANCE;
                            }
                        });
                        classComponentBuilder722.getAsyncFunctions().put("text", asyncFunctionWithPromiseComponent322);
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent422 = asyncFunctionWithPromiseComponent322;
                        moduleDefinitionBuilder2.getClassData().add(classComponentBuilder.buildClass());
                        ModuleDefinitionBuilder moduleDefinitionBuilder522 = moduleDefinitionBuilder;
                        KClass orCreateKotlinClass222 = Reflection.getOrCreateKotlinClass(NativeRequest.class);
                        module = moduleDefinitionBuilder522.getModule();
                        if (module != null) {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    classComponentBuilder2 = classComponentBuilder522;
                }
                obj = m13470constructorimpl4;
                m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(obj);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(obj)) {
                    obj = null;
                }
                typeDescriptor2 = (TypeDescriptor) obj;
                if (typeDescriptor2 != null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters42);
            }
            anyTypeArr222[i] = anyType2;
            Function1<Object[], Unit> function1222 = new Function1<Object[], Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj32 = objArr[0];
                    ((NativeResponse) obj32).cancelStreaming();
                    return Unit.INSTANCE;
                }
            };
            classComponentBuilder2.getAsyncFunctions().put("cancelStreaming", !Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222) : new UntypedAsyncFunctionComponent("cancelStreaming", anyTypeArr222, function1222));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis722 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "bodyUsed");
            AnyType[] anyTypeArr3222 = new AnyType[i];
            anyTypeArr3222[0] = new AnyType(propertyComponentBuilderWithThis722.getThisType(), null, 2, null);
            ReturnTypeProvider returnTypeProvider2222 = ReturnTypeProvider.INSTANCE;
            returnType2 = returnTypeProvider2222.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Boolean.class));
                returnTypeProvider2222.getTypes().put(Reflection.getOrCreateKotlinClass(Boolean.class), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent722 = new SyncFunctionComponent("get", anyTypeArr3222, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(((NativeResponse) it[0]).getBodyUsed());
                }
            });
            syncFunctionComponent722.setOwnerType(propertyComponentBuilderWithThis722.getThisType());
            syncFunctionComponent722.setCanTakeOwner(true);
            propertyComponentBuilderWithThis722.setGetter(syncFunctionComponent722);
            classComponentBuilder.getProperties().put("bodyUsed", propertyComponentBuilderWithThis722);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "_rawHeaders");
            AnyType[] anyTypeArr4222 = {new AnyType(propertyComponentBuilderWithThis2222.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider3222 = ReturnTypeProvider.INSTANCE;
            returnType3 = returnTypeProvider3222.getTypes().get(Reflection.getOrCreateKotlinClass(List.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(Reflection.getOrCreateKotlinClass(List.class));
                returnTypeProvider3222.getTypes().put(Reflection.getOrCreateKotlinClass(List.class), returnType3);
            }
            SyncFunctionComponent syncFunctionComponent2222 = new SyncFunctionComponent("get", anyTypeArr4222, returnType3, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    List<Pair<String, String>> headers;
                    Intrinsics.checkNotNullParameter(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (headers = responseInit.getHeaders()) == null) ? CollectionsKt.emptyList() : headers;
                }
            });
            syncFunctionComponent2222.setOwnerType(propertyComponentBuilderWithThis2222.getThisType());
            syncFunctionComponent2222.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2222.setGetter(syncFunctionComponent2222);
            classComponentBuilder.getProperties().put("_rawHeaders", propertyComponentBuilderWithThis2222);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "status");
            AnyType[] anyTypeArr5222 = {new AnyType(propertyComponentBuilderWithThis3222.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider4222 = ReturnTypeProvider.INSTANCE;
            returnType4 = returnTypeProvider4222.getTypes().get(Reflection.getOrCreateKotlinClass(Integer.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(Reflection.getOrCreateKotlinClass(Integer.class));
                returnTypeProvider4222.getTypes().put(Reflection.getOrCreateKotlinClass(Integer.class), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent3222 = new SyncFunctionComponent("get", anyTypeArr5222, returnType4, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return Integer.valueOf(responseInit != null ? responseInit.getStatus() : -1);
                }
            });
            syncFunctionComponent3222.setOwnerType(propertyComponentBuilderWithThis3222.getThisType());
            syncFunctionComponent3222.setCanTakeOwner(true);
            propertyComponentBuilderWithThis3222.setGetter(syncFunctionComponent3222);
            classComponentBuilder.getProperties().put("status", propertyComponentBuilderWithThis3222);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "statusText");
            AnyType[] anyTypeArr6222 = {new AnyType(propertyComponentBuilderWithThis4222.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider5222 = ReturnTypeProvider.INSTANCE;
            returnType5 = returnTypeProvider5222.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(Reflection.getOrCreateKotlinClass(String.class));
                returnTypeProvider5222.getTypes().put(Reflection.getOrCreateKotlinClass(String.class), returnType5);
            }
            SyncFunctionComponent syncFunctionComponent4222 = new SyncFunctionComponent("get", anyTypeArr6222, returnType5, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    String statusText;
                    Intrinsics.checkNotNullParameter(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (statusText = responseInit.getStatusText()) == null) ? "" : statusText;
                }
            });
            syncFunctionComponent4222.setOwnerType(propertyComponentBuilderWithThis4222.getThisType());
            syncFunctionComponent4222.setCanTakeOwner(true);
            propertyComponentBuilderWithThis4222.setGetter(syncFunctionComponent4222);
            classComponentBuilder.getProperties().put("statusText", propertyComponentBuilderWithThis4222);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis5222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "url");
            AnyType[] anyTypeArr7222 = {new AnyType(propertyComponentBuilderWithThis5222.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider6222 = ReturnTypeProvider.INSTANCE;
            returnType6 = returnTypeProvider6222.getTypes().get(Reflection.getOrCreateKotlinClass(String.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(Reflection.getOrCreateKotlinClass(String.class));
                returnTypeProvider6222.getTypes().put(Reflection.getOrCreateKotlinClass(String.class), returnType6);
            }
            SyncFunctionComponent syncFunctionComponent5222 = new SyncFunctionComponent("get", anyTypeArr7222, returnType6, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    String url;
                    Intrinsics.checkNotNullParameter(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return (responseInit == null || (url = responseInit.getUrl()) == null) ? "" : url;
                }
            });
            syncFunctionComponent5222.setOwnerType(propertyComponentBuilderWithThis5222.getThisType());
            syncFunctionComponent5222.setCanTakeOwner(true);
            propertyComponentBuilderWithThis5222.setGetter(syncFunctionComponent5222);
            classComponentBuilder.getProperties().put("url", propertyComponentBuilderWithThis5222);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis6222 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getTypeDescriptor(), "redirected");
            AnyType[] anyTypeArr8222 = {new AnyType(propertyComponentBuilderWithThis6222.getThisType(), null, 2, null)};
            ReturnTypeProvider returnTypeProvider7222 = ReturnTypeProvider.INSTANCE;
            returnType7 = returnTypeProvider7222.getTypes().get(Reflection.getOrCreateKotlinClass(Boolean.class));
            if (returnType7 == null) {
                returnType7 = new ReturnType(Reflection.getOrCreateKotlinClass(Boolean.class));
                returnTypeProvider7222.getTypes().put(Reflection.getOrCreateKotlinClass(Boolean.class), returnType7);
            }
            SyncFunctionComponent syncFunctionComponent6222 = new SyncFunctionComponent("get", anyTypeArr8222, returnType7, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$Property$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NativeResponseInit responseInit = ((NativeResponse) it[0]).getResponseInit();
                    return Boolean.valueOf(responseInit != null ? responseInit.getRedirected() : false);
                }
            });
            syncFunctionComponent6222.setOwnerType(propertyComponentBuilderWithThis6222.getThisType());
            syncFunctionComponent6222.setCanTakeOwner(true);
            propertyComponentBuilderWithThis6222.setGetter(syncFunctionComponent6222);
            classComponentBuilder.getProperties().put("redirected", propertyComponentBuilderWithThis6222);
            ClassComponentBuilder classComponentBuilder6222 = classComponentBuilder;
            TypeConverterProvider converters2222 = classComponentBuilder6222.getConverters();
            AnyType[] anyTypeArr9222 = new AnyType[1];
            anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeResponse.class);
                        }
                    }));
                } catch (Throwable th8) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th8));
                }
                Object obj4 = m13470constructorimpl5;
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(obj4);
                if (m13473exceptionOrNullimpl5 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl5);
                }
                if (Result.m13476isFailureimpl(obj4)) {
                    obj4 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) obj4;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                }
                anyType3 = new AnyType(typeDescriptor5, converters2222);
            }
            anyTypeArr9222[0] = anyType3;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent522 = new AsyncFunctionWithPromiseComponent("arrayBuffer", anyTypeArr9222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                    nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$10$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                            invoke2(responseState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ResponseState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            promise.resolve(new NativeArrayBuffer(NativeResponse.this.getSink().finalize(true)));
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            classComponentBuilder6222.getAsyncFunctions().put("arrayBuffer", asyncFunctionWithPromiseComponent522);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2222 = asyncFunctionWithPromiseComponent522;
            ClassComponentBuilder classComponentBuilder7222 = classComponentBuilder;
            TypeConverterProvider converters3222 = classComponentBuilder7222.getConverters();
            AnyType[] anyTypeArr10222 = new AnyType[1];
            anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
            if (anyType4 == null) {
                try {
                    Result.Companion companion11 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeResponse.class);
                        }
                    }));
                } catch (Throwable th9) {
                    Result.Companion companion12 = Result.INSTANCE;
                    m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th9));
                }
                Object obj5 = m13470constructorimpl6;
                Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(obj5);
                if (m13473exceptionOrNullimpl6 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl6);
                }
                if (Result.m13476isFailureimpl(obj5)) {
                    obj5 = null;
                }
                TypeDescriptor typeDescriptor6 = (TypeDescriptor) obj5;
                if (typeDescriptor6 == null) {
                    typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                }
                anyType4 = new AnyType(typeDescriptor6, converters3222);
            }
            anyTypeArr10222[0] = anyType4;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3222 = new AsyncFunctionWithPromiseComponent("text", anyTypeArr10222, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$17$$inlined$AsyncFunctionWithPromise$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    final NativeResponse nativeResponse = (NativeResponse) objArr[0];
                    nativeResponse.waitForStates(CollectionsKt.listOf(ResponseState.BODY_COMPLETED), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$3$11$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                            invoke2(responseState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ResponseState it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            byte[] array = NativeResponse.this.getSink().finalize(false).array();
                            Intrinsics.checkNotNull(array);
                            promise.resolve(new String(array, Charsets.UTF_8));
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            classComponentBuilder7222.getAsyncFunctions().put("text", asyncFunctionWithPromiseComponent3222);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4222 = asyncFunctionWithPromiseComponent3222;
            moduleDefinitionBuilder2.getClassData().add(classComponentBuilder.buildClass());
            ModuleDefinitionBuilder moduleDefinitionBuilder5222 = moduleDefinitionBuilder;
            KClass orCreateKotlinClass2222 = Reflection.getOrCreateKotlinClass(NativeRequest.class);
            module = moduleDefinitionBuilder5222.getModule();
            if (module != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            AppContext appContext2 = module.getAppContext();
            String simpleName2 = JvmClassMappingKt.getJavaClass(orCreateKotlinClass2222).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeRequest.class), false));
            if (anyType7 != null) {
                obj2 = null;
            } else {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeRequest", Reflection.getOrCreateKotlinClass(NativeRequest.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$$inlined$Class$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeRequest.class);
                        }
                    }));
                } catch (Throwable th10) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th10));
                }
                Object obj6 = m13470constructorimpl7;
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(obj6);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeRequest.class.getName(), m13473exceptionOrNullimpl7);
                }
                if (Result.m13476isFailureimpl(obj6)) {
                    obj6 = null;
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) obj6;
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeRequest.class));
                }
                obj2 = null;
                anyType7 = new AnyType(typeDescriptor7, null);
            }
            ClassComponentBuilder classComponentBuilder8 = new ClassComponentBuilder(appContext2, simpleName2, orCreateKotlinClass2222, anyType7, moduleDefinitionBuilder5222.getConverters());
            TypeConverterProvider converters6 = classComponentBuilder8.getConverters();
            AnyType[] anyTypeArr13 = new AnyType[1];
            AnyType anyType8 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeResponse.class), false));
            if (anyType8 == null) {
                try {
                    Result.Companion companion15 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeResponse", Reflection.getOrCreateKotlinClass(NativeResponse.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeResponse.class);
                        }
                    }));
                } catch (Throwable th11) {
                    Result.Companion companion16 = Result.INSTANCE;
                    m13470constructorimpl8 = Result.m13470constructorimpl(ResultKt.createFailure(th11));
                }
                Object obj7 = m13470constructorimpl8;
                Throwable m13473exceptionOrNullimpl8 = Result.m13473exceptionOrNullimpl(obj7);
                if (m13473exceptionOrNullimpl8 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeResponse.class.getName(), m13473exceptionOrNullimpl8);
                }
                if (Result.m13476isFailureimpl(obj7)) {
                    obj7 = obj2;
                }
                TypeDescriptor typeDescriptor8 = (TypeDescriptor) obj7;
                if (typeDescriptor8 == null) {
                    typeDescriptor8 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeResponse.class));
                }
                anyType8 = new AnyType(typeDescriptor8, converters6);
            }
            anyTypeArr13[0] = anyType8;
            ReturnTypeProvider returnTypeProvider9 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType8 = returnTypeProvider9.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
            if (returnType8 == null) {
                returnType8 = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
                returnTypeProvider9.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType8);
            }
            classComponentBuilder8.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr13, returnType8, new Function1<Object[], Object>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    return new NativeRequest(ExpoFetchModule.this.getAppContext(), (NativeResponse) objArr[0]);
                }
            }));
            ClassComponentBuilder classComponentBuilder9 = classComponentBuilder8;
            TypeConverterProvider converters7 = classComponentBuilder9.getConverters();
            AnyType[] anyTypeArr14 = new AnyType[4];
            AnyType anyType9 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeRequest.class), false));
            if (anyType9 == null) {
                try {
                    Result.Companion companion17 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeRequest", Reflection.getOrCreateKotlinClass(NativeRequest.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeRequest.class);
                        }
                    }));
                } catch (Throwable th12) {
                    Result.Companion companion18 = Result.INSTANCE;
                    m13470constructorimpl9 = Result.m13470constructorimpl(ResultKt.createFailure(th12));
                }
                Object obj8 = m13470constructorimpl9;
                Throwable m13473exceptionOrNullimpl9 = Result.m13473exceptionOrNullimpl(obj8);
                if (m13473exceptionOrNullimpl9 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeRequest.class.getName(), m13473exceptionOrNullimpl9);
                }
                if (Result.m13476isFailureimpl(obj8)) {
                    obj8 = obj2;
                }
                TypeDescriptor typeDescriptor9 = (TypeDescriptor) obj8;
                if (typeDescriptor9 == null) {
                    typeDescriptor9 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeRequest.class));
                }
                anyType9 = new AnyType(typeDescriptor9, converters7);
            }
            anyTypeArr14[0] = anyType9;
            AnyType anyType10 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(URL.class), false));
            if (anyType10 == null) {
                try {
                    Result.Companion companion19 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("java.net.URL", Reflection.getOrCreateKotlinClass(URL.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(URL.class);
                        }
                    }));
                } catch (Throwable th13) {
                    Result.Companion companion20 = Result.INSTANCE;
                    m13470constructorimpl10 = Result.m13470constructorimpl(ResultKt.createFailure(th13));
                }
                Object obj9 = m13470constructorimpl10;
                Throwable m13473exceptionOrNullimpl10 = Result.m13473exceptionOrNullimpl(obj9);
                if (m13473exceptionOrNullimpl10 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + URL.class.getName(), m13473exceptionOrNullimpl10);
                }
                if (Result.m13476isFailureimpl(obj9)) {
                    obj9 = obj2;
                }
                TypeDescriptor typeDescriptor10 = (TypeDescriptor) obj9;
                if (typeDescriptor10 == null) {
                    typeDescriptor10 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(URL.class));
                }
                anyType10 = new AnyType(typeDescriptor10, converters7);
            }
            anyTypeArr14[1] = anyType10;
            AnyType anyType11 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeRequestInit.class), false));
            if (anyType11 == null) {
                try {
                    Result.Companion companion21 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeRequestInit", Reflection.getOrCreateKotlinClass(NativeRequestInit.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(NativeRequestInit.class);
                        }
                    }));
                } catch (Throwable th14) {
                    Result.Companion companion23 = Result.INSTANCE;
                    m13470constructorimpl11 = Result.m13470constructorimpl(ResultKt.createFailure(th14));
                }
                Object obj10 = m13470constructorimpl11;
                Throwable m13473exceptionOrNullimpl11 = Result.m13473exceptionOrNullimpl(obj10);
                if (m13473exceptionOrNullimpl11 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + NativeRequestInit.class.getName(), m13473exceptionOrNullimpl11);
                }
                if (Result.m13476isFailureimpl(obj10)) {
                    obj10 = obj2;
                }
                TypeDescriptor typeDescriptor11 = (TypeDescriptor) obj10;
                if (typeDescriptor11 == null) {
                    typeDescriptor11 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeRequestInit.class));
                }
                anyType11 = new AnyType(typeDescriptor11, converters7);
            }
            anyTypeArr14[2] = anyType11;
            AnyType anyType12 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(cls), true));
            if (anyType12 == null) {
                try {
                    Result.Companion companion24 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.ByteArray", Reflection.getOrCreateKotlinClass(cls), true)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$4
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(byte[].class);
                        }
                    }));
                } catch (Throwable th15) {
                    Result.Companion companion25 = Result.INSTANCE;
                    m13470constructorimpl12 = Result.m13470constructorimpl(ResultKt.createFailure(th15));
                }
                Object obj11 = m13470constructorimpl12;
                Throwable m13473exceptionOrNullimpl12 = Result.m13473exceptionOrNullimpl(obj11);
                if (m13473exceptionOrNullimpl12 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + cls.getName(), m13473exceptionOrNullimpl12);
                }
                if (Result.m13476isFailureimpl(obj11)) {
                    obj11 = obj2;
                }
                TypeDescriptor typeDescriptor12 = (TypeDescriptor) obj11;
                if (typeDescriptor12 == null) {
                    typeDescriptor12 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(cls));
                }
                anyType12 = new AnyType(typeDescriptor12, converters7);
            }
            anyTypeArr14[3] = anyType12;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6 = new AsyncFunctionWithPromiseComponent("start", anyTypeArr14, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunctionWithPromise$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    OkHttpClient client;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj12 = objArr[0];
                    Object obj13 = objArr[1];
                    Object obj14 = objArr[2];
                    byte[] bArr = (byte[]) objArr[3];
                    final NativeRequest nativeRequest = (NativeRequest) obj12;
                    client = ExpoFetchModule.this.getClient();
                    nativeRequest.start(client, (URL) obj13, (NativeRequestInit) obj14, bArr);
                    nativeRequest.getResponse().waitForStates(CollectionsKt.listOf((Object[]) new ResponseState[]{ResponseState.RESPONSE_RECEIVED, ResponseState.ERROR_RECEIVED}), new Function1<ResponseState, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$1$4$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ResponseState responseState) {
                            invoke2(responseState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ResponseState state) {
                            FetchUnknownException fetchUnknownException;
                            Intrinsics.checkNotNullParameter(state, "state");
                            if (state == ResponseState.RESPONSE_RECEIVED) {
                                Promise.this.resolve();
                                return;
                            }
                            if (state == ResponseState.ERROR_RECEIVED) {
                                Promise promise2 = Promise.this;
                                Exception error = nativeRequest.getResponse().getError();
                                if (error == null) {
                                    fetchUnknownException = new FetchUnknownException();
                                } else {
                                    Exception exc = error;
                                    if (exc instanceof CodedException) {
                                        fetchUnknownException = (CodedException) exc;
                                    } else if (exc instanceof expo.modules.core.errors.CodedException) {
                                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) exc;
                                        fetchUnknownException = new CodedException(codedException.getCode(), codedException.getMessage(), codedException.getCause());
                                    } else {
                                        fetchUnknownException = new UnexpectedException(exc);
                                    }
                                }
                                promise2.reject(fetchUnknownException);
                            }
                        }
                    });
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            classComponentBuilder9.getAsyncFunctions().put("start", asyncFunctionWithPromiseComponent6);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent7 = asyncFunctionWithPromiseComponent6;
            ClassComponentBuilder classComponentBuilder10 = classComponentBuilder8;
            if (Intrinsics.areEqual(NativeRequest.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("cancel", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ((NativeRequest) promise).cancel();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters8 = classComponentBuilder10.getConverters();
                AnyType[] anyTypeArr15 = new AnyType[1];
                AnyType anyType13 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(NativeRequest.class), false));
                if (anyType13 == null) {
                    try {
                        Result.Companion companion26 = Result.INSTANCE;
                        m13470constructorimpl13 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.fetch.NativeRequest", Reflection.getOrCreateKotlinClass(NativeRequest.class), false)), new Function0<KType>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(NativeRequest.class);
                            }
                        }));
                    } catch (Throwable th16) {
                        Result.Companion companion27 = Result.INSTANCE;
                        m13470constructorimpl13 = Result.m13470constructorimpl(ResultKt.createFailure(th16));
                    }
                    Object obj12 = m13470constructorimpl13;
                    Throwable m13473exceptionOrNullimpl13 = Result.m13473exceptionOrNullimpl(obj12);
                    if (m13473exceptionOrNullimpl13 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + NativeRequest.class.getName(), m13473exceptionOrNullimpl13);
                    }
                    if (Result.m13476isFailureimpl(obj12)) {
                        obj12 = obj2;
                    }
                    TypeDescriptor typeDescriptor13 = (TypeDescriptor) obj12;
                    if (typeDescriptor13 == null) {
                        typeDescriptor13 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(NativeRequest.class));
                    }
                    anyType13 = new AnyType(typeDescriptor13, converters8);
                }
                anyTypeArr15[0] = anyType13;
                Function1<Object[], Unit> function13 = new Function1<Object[], Unit>() { // from class: expo.modules.fetch.ExpoFetchModule$definition$lambda$22$lambda$21$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ((NativeRequest) objArr[0]).cancel();
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancel", anyTypeArr15, function13) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancel", anyTypeArr15, function13) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancel", anyTypeArr15, function13) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancel", anyTypeArr15, function13) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancel", anyTypeArr15, function13) : new UntypedAsyncFunctionComponent("cancel", anyTypeArr15, function13);
            }
            classComponentBuilder10.getAsyncFunctions().put("cancel", intAsyncFunctionComponent);
            moduleDefinitionBuilder5222.getClassData().add(classComponentBuilder8.buildClass());
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
