package bo.app;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.SdkFlavor;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0004\u0012\u0006\u0010b\u001a\u00020^\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bc\u0010dJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\u0002`\rH\u0016J\u0010\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013\"\u0004\b\t\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\t\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\n\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0014R$\u0010 \u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0014R$\u0010$\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\n\u0010&\"\u0004\b\t\u0010'R$\u0010(\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0014R$\u0010+\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0012\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0014R$\u0010/\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b\t\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b-\u00107\"\u0004\b\t\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b\u001f\u0010C\"\u0004\b\t\u0010DR$\u0010E\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0012\u001a\u0004\bF\u0010\u0013\"\u0004\b<\u0010\u0014R0\u0010J\u001a\u0010\u0012\u0004\u0012\u00020H\u0018\u00010Gj\u0004\u0018\u0001`I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\b\t\u0010NR\u001a\u0010P\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010TR\u001a\u0010V\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b\"\u0010TR\u001c\u0010]\u001a\u0004\u0018\u00010X8VX\u0096\u0004¢\u0006\f\u0012\u0004\b[\u0010\\\u001a\u0004\bY\u0010ZR\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lbo/app/s;", "Lbo/app/t4;", "Lbo/app/a2;", "Lbo/app/h2;", "internalPublisher", "externalPublisher", "Lbo/app/o2;", "responseError", "", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "", "toString", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "requestInitiationTime", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "deviceId", "o", "apiKey", "n", "f", "sdkVersion", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "g", "Lbo/app/k0;", "device", "Lbo/app/k0;", "()Lbo/app/k0;", "(Lbo/app/k0;)V", "hostAppVersion", "q", "c", "hostAppSemanticVersionCode", "p", "e", "Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Lcom/braze/enums/SdkFlavor;", "(Lcom/braze/enums/SdkFlavor;)V", "Lbo/app/y3;", "outboundUser", "Lbo/app/y3;", "()Lbo/app/y3;", "(Lbo/app/y3;)V", "Lbo/app/x3;", "outboundRespondWith", "Lbo/app/x3;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Lbo/app/x3;", "setOutboundRespondWith", "(Lbo/app/x3;)V", "Lbo/app/k;", "customEvents", "Lbo/app/k;", "()Lbo/app/k;", "(Lbo/app/k;)V", "sdkAuthSignature", "k", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "Lcom/braze/enums/MetadataTags;", "sdkMetadata", "Ljava/util/EnumSet;", "i", "()Ljava/util/EnumSet;", "(Ljava/util/EnumSet;)V", "Lbo/app/w1;", "backoffStateProvider", "Lbo/app/w1;", "m", "()Lbo/app/w1;", "()Z", "containsNoNewData", "doesSendOptionalData", "Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "getPayload$annotations", "()V", "payload", "Lbo/app/a5;", "h", "()Lbo/app/a5;", TypedValues.AttributesType.S_TARGET, "requestTarget", "<init>", "(Lbo/app/a5;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public abstract class s extends t4 implements a2 {
    public static final a r = new a(null);
    private String b;
    private Long c;
    private String d;
    private String e;
    private String f;
    private k0 g;
    private String h;
    private String i;
    private SdkFlavor j;
    private y3 k;
    private x3 l;
    private bo.app.k m;
    private String n;
    private EnumSet<BrazeSdkMetadata> o;
    private final w1 p;
    private final boolean q;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\f\u0010\u0004\u0012\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u0012\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lbo/app/s$a;", "", "", "API_KEY_REQUEST_PARAMETER_KEY", "Ljava/lang/String;", "ATTRIBUTES_OBJECT_KEY", "", "BACKOFF_DURATION", "J", "BRAZE_API_KEY_REQUEST_HEADER", "getBRAZE_API_KEY_REQUEST_HEADER$annotations", "()V", "BRAZE_DATA_REQUEST_HEADER", "getBRAZE_DATA_REQUEST_HEADER$annotations", "BRAZE_REQUEST_HEADER_ENABLED_VALUE", "getBRAZE_REQUEST_HEADER_ENABLED_VALUE$annotations", "BRAZE_SDK_AUTH_TOKEN_HEADER", "getBRAZE_SDK_AUTH_TOKEN_HEADER$annotations", "DEVICE_ID_REQUEST_PARAMETER_KEY", "DEVICE_KEY", "EVENTS_ARRAY_KEY", "HOST_APP_SEMANTIC_VERSION_CODE_KEY", "HOST_APP_VERSION_PARAMETER_KEY", "REQUEST_INITIATION_TIMESTAMP_REQUEST_PARAMETER_KEY", "RESPOND_WITH_KEY", "SDK_FLAVOR_KEY", "SDK_METADATA_KEY", "SDK_VERSION_REQUEST_PARAMETER_KEY", "USER_ID_KEY", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Error occurred while executing Braze request: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        public static final e b = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                        !! WARNING !!                         **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus(">> API key    : ", s.this.getE());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus(">> Request Uri: ", s.this.h());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ s(a5 a5Var, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(a5Var, (i2 & 2) != 0 ? null : str);
    }

    @Override // bo.app.a2
    /* renamed from: a, reason: from getter */
    public String getB() {
        return this.b;
    }

    @Override // bo.app.m2
    public boolean a(o2 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        return false;
    }

    @Override // bo.app.a2
    public void b(String str) {
        this.d = str;
    }

    @Override // bo.app.a2
    public void c(String str) {
        this.h = str;
    }

    /* renamed from: d, reason: from getter */
    public x3 getS() {
        return this.l;
    }

    @Override // bo.app.a2
    public void e(String str) {
        this.i = str;
    }

    @Override // bo.app.a2
    public void f(String str) {
        this.e = str;
    }

    @Override // bo.app.a2
    public void g(String str) {
        this.f = str;
    }

    @Override // bo.app.m2
    public a5 h() {
        return new a5(Braze.INSTANCE.getApiEndpoint(this.a.getB()));
    }

    @Override // bo.app.a2
    public EnumSet<BrazeSdkMetadata> i() {
        return this.o;
    }

    @Override // bo.app.a2
    /* renamed from: j, reason: from getter */
    public Long getC() {
        return this.c;
    }

    @Override // bo.app.a2
    /* renamed from: k, reason: from getter */
    public String getN() {
        return this.n;
    }

    public JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getD() != null) {
                jSONObject.put("device_id", getD());
            }
            if (getC() != null) {
                jSONObject.put(Globalization.TIME, getC());
            }
            if (getE() != null) {
                jSONObject.put("api_key", getE());
            }
            if (getF() != null) {
                jSONObject.put("sdk_version", getF());
            }
            if (getH() != null) {
                jSONObject.put(App.JsonKeys.APP_VERSION, getH());
            }
            String i2 = getI();
            if (i2 != null && !StringsKt.isBlank(i2)) {
                jSONObject.put("app_version_code", getI());
            }
            k0 g2 = getG();
            if (g2 != null && !g2.getC()) {
                jSONObject.put("device", g2.getC());
            }
            y3 k2 = getK();
            if (k2 != null && !k2.getC()) {
                jSONObject.put("attributes", k2.getJsonObject());
            }
            bo.app.k m = getM();
            if (m != null && !m.getC()) {
                jSONObject.put("events", JsonUtils.constructJsonArray(m.b()));
            }
            SdkFlavor j2 = getJ();
            if (j2 != null) {
                jSONObject.put("sdk_flavor", j2.getJsonKey());
            }
            EnumSet<BrazeSdkMetadata> i3 = i();
            if (i3 == null) {
                return jSONObject;
            }
            jSONObject.put("sdk_metadata", BrazeSdkMetadata.INSTANCE.a(i3));
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, l.b);
            return null;
        }
    }

    @Override // bo.app.m2
    /* renamed from: m, reason: from getter */
    public w1 getP() {
        return this.p;
    }

    /* renamed from: n, reason: from getter */
    public String getE() {
        return this.e;
    }

    /* renamed from: o, reason: from getter */
    public String getD() {
        return this.d;
    }

    /* renamed from: p, reason: from getter */
    public String getI() {
        return this.i;
    }

    /* renamed from: q, reason: from getter */
    public String getH() {
        return this.h;
    }

    /* renamed from: r, reason: from getter */
    public SdkFlavor getJ() {
        return this.j;
    }

    /* renamed from: s, reason: from getter */
    public String getF() {
        return this.f;
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(l()) + "\nto target: " + h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected s(a5 requestTarget, String str) {
        super(requestTarget);
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        this.b = str;
        this.p = new f1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
    }

    @Override // bo.app.a2
    public void a(String str) {
        this.b = str;
    }

    @Override // bo.app.a2
    /* renamed from: b, reason: from getter */
    public k0 getG() {
        return this.g;
    }

    /* renamed from: c */
    public boolean getV() {
        ArrayList<g2> arrayList = new ArrayList();
        arrayList.add(getG());
        arrayList.add(getK());
        arrayList.add(getM());
        for (g2 g2Var : arrayList) {
            if (g2Var != null && !g2Var.getC()) {
                return false;
            }
        }
        return true;
    }

    @Override // bo.app.a2
    public void d(String str) {
        this.n = str;
    }

    @Override // bo.app.a2
    /* renamed from: e, reason: from getter */
    public y3 getK() {
        return this.k;
    }

    @Override // bo.app.a2
    /* renamed from: f, reason: from getter */
    public bo.app.k getM() {
        return this.m;
    }

    /* renamed from: g, reason: from getter */
    public boolean getT() {
        return this.q;
    }

    @Override // bo.app.a2
    public void a(Long l2) {
        this.c = l2;
    }

    @Override // bo.app.m2
    public void b(h2 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        x3 s = getS();
        if (s != null && s.y()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            internalPublisher.a((h2) new h6(this), (Class<h2>) h6.class);
        }
        internalPublisher.a((h2) new u4(this), (Class<h2>) u4.class);
    }

    @Override // bo.app.a2
    public void a(k0 k0Var) {
        this.g = k0Var;
    }

    @Override // bo.app.a2
    public void a(SdkFlavor sdkFlavor) {
        this.j = sdkFlavor;
    }

    @Override // bo.app.a2
    public void a(y3 y3Var) {
        this.k = y3Var;
    }

    @Override // bo.app.a2
    public void a(bo.app.k kVar) {
        this.m = kVar;
    }

    @Override // bo.app.a2
    public void a(EnumSet<BrazeSdkMetadata> enumSet) {
        this.o = enumSet;
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher, h2 externalPublisher, o2 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        String a2 = responseError.getA();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new c(a2), 2, (Object) null);
        if (responseError instanceof h3) {
            internalPublisher.a((h2) responseError, (Class<h2>) h3.class);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, e.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, h.b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new i(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.b, 2, (Object) null);
        }
        if (responseError instanceof d5) {
            externalPublisher.a((h2) new BrazeSdkAuthenticationErrorEvent((d5) responseError), (Class<h2>) BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    @Override // bo.app.m2
    public void a(h2 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        x3 s = getS();
        if (s != null && s.y()) {
            internalPublisher.a((h2) new i6(this), (Class<h2>) i6.class);
        }
        internalPublisher.a((h2) new v4(this), (Class<h2>) v4.class);
    }

    public void a(Map<String, String> existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", getE());
        String n = getN();
        if (n == null || n.length() == 0) {
            return;
        }
        existingHeaders.put("X-Braze-Auth-Signature", getN());
    }
}
