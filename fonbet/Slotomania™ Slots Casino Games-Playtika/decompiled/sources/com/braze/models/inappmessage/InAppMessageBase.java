package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.b3;
import bo.app.c3;
import bo.app.e3;
import bo.app.w0;
import bo.app.x1;
import bo.app.z1;
import com.braze.Constants;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\n\b\u0010¢\u0006\u0005\b\u0093\u0001\u0010-B2\b\u0017\u0012\u0007\u0010\u0094\u0001\u001a\u00020\u0017\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\b\b\u0002\u0010t\u001a\u00020\t\u0012\b\b\u0002\u0010v\u001a\u00020\t¢\u0006\u0006\b\u0093\u0001\u0010\u0095\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u001c\u0010\u0016\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010&\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00104\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b4\u0010'\u0012\u0004\b7\u0010-\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R(\u00108\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b8\u0010'\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R\"\u0010=\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010E\u001a\u00020C2\u0006\u0010D\u001a\u00020C8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bg\u0010F\u001a\u0004\bh\u0010H\"\u0004\bi\u0010JR\"\u0010j\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bj\u0010F\u001a\u0004\bk\u0010H\"\u0004\bl\u0010JR\"\u0010m\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bm\u0010F\u001a\u0004\bn\u0010H\"\u0004\bo\u0010JR\"\u0010p\u001a\u00020C8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bp\u0010F\u001a\u0004\bq\u0010H\"\u0004\br\u0010JR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u0014\u0010w\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR$\u0010x\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010)R,\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010 ¨\u0006\u0098\u0001"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageBase;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "", "setClickBehavior", "Landroid/net/Uri;", "uri", "", "logImpression", "logClick", "onAfterClosed", "Lcom/braze/enums/inappmessage/InAppMessageFailureType;", "failureType", "logDisplayFailure", "enableDarkTheme", "", "", "getRemoteAssetPathsForPrefetch", "", "remotePathToLocalAssetMap", "setLocalPrefetchedAssetPaths", "Lorg/json/JSONObject;", "forJsonPut", "internalClickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "internalUri", "Landroid/net/Uri;", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "openUriInWebView", "Z", "getOpenUriInWebView", "()Z", "setOpenUriInWebView", "(Z)V", "getOpenUriInWebView$annotations", "()V", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "animateIn", "getAnimateIn", "setAnimateIn", "getAnimateIn$annotations", "animateOut", "getAnimateOut", "setAnimateOut", "getAnimateOut$annotations", "Lcom/braze/enums/inappmessage/DismissType;", "dismissType", "Lcom/braze/enums/inappmessage/DismissType;", "getDismissType", "()Lcom/braze/enums/inappmessage/DismissType;", "setDismissType", "(Lcom/braze/enums/inappmessage/DismissType;)V", "", "value", "durationInMilliseconds", "I", "getDurationInMilliseconds", "()I", "setDurationInMilliseconds", "(I)V", "Lcom/braze/enums/inappmessage/Orientation;", "orientation", "Lcom/braze/enums/inappmessage/Orientation;", "getOrientation", "()Lcom/braze/enums/inappmessage/Orientation;", "setOrientation", "(Lcom/braze/enums/inappmessage/Orientation;)V", "Lcom/braze/enums/inappmessage/CropType;", "cropType", "Lcom/braze/enums/inappmessage/CropType;", "getCropType", "()Lcom/braze/enums/inappmessage/CropType;", "setCropType", "(Lcom/braze/enums/inappmessage/CropType;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "messageTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getMessageTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "", "expirationTimestamp", "J", "getExpirationTimestamp", "()J", "setExpirationTimestamp", "(J)V", "iconBackgroundColor", "getIconBackgroundColor", "setIconBackgroundColor", "messageTextColor", "getMessageTextColor", "setMessageTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "getBackgroundColor", "setBackgroundColor", "iconColor", "getIconColor", "setIconColor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "impressionLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clickLogged", "displayFailureLogged", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "setJsonObject", "(Lorg/json/JSONObject;)V", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "getUri", "()Landroid/net/Uri;", "isControl", "Lbo/app/z1;", "brazeManager", "Lbo/app/z1;", "getBrazeManager", "()Lbo/app/z1;", "setBrazeManager", "(Lbo/app/z1;)V", "Lbo/app/e3;", "inAppMessageDarkThemeWrapper", "Lbo/app/e3;", "getInAppMessageDarkThemeWrapper", "()Lbo/app/e3;", "setInAppMessageDarkThemeWrapper", "(Lbo/app/e3;)V", "getTriggerId", "triggerId", "<init>", "json", "(Lorg/json/JSONObject;Lbo/app/z1;ZZ)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    protected static final String ANIMATE_IN = "animate_in";
    protected static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private z1 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private final AtomicBoolean displayFailureLogged;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private e3 inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private JSONObject jsonObject;
    private String message;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requested in-app message duration " + this.b + " is lower than the minimum of 999. Defaulting to 5000 milliseconds.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Set in-app message duration to " + this.b + " milliseconds.";
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
            return "Cannot apply dark theme with a null themes wrapper";
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
            return "Failed to construct json for in-app message";
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
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
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
            return "Cannot log an in-app message click because the BrazeManager is null.";
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
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logging click on in-app message";
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
            return "Trigger id not found (this is expected for test sends). Not logging in-app message display failure.";
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
            return "Cannot log an in-app message display failure because the BrazeManager is null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        public static final o b = new o();

        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        public static final q b = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        public static final r b = new r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        public static final s b = new s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        public static final t b = new t();

        t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        public static final u b = new u();

        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the message ClickAction to URI.";
        }
    }

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        this.extras = MapsKt.emptyMap();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.displayFailureLogged = new AtomicBoolean(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, z1 brazeManager) {
        this(json, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, z1 brazeManager, boolean z) {
        this(json, brazeManager, z, false, 8, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    public static /* synthetic */ void getAnimateIn$annotations() {
    }

    public static /* synthetic */ void getAnimateOut$annotations() {
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        e3 e3Var = this.inAppMessageDarkThemeWrapper;
        if (e3Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
            return;
        }
        if (e3Var == null) {
            return;
        }
        if (e3Var.getA() != null) {
            setBackgroundColor(e3Var.getA().intValue());
        }
        if (e3Var.getD() != null) {
            setIconColor(e3Var.getD().intValue());
        }
        if (e3Var.getE() != null) {
            setIconBackgroundColor(e3Var.getE().intValue());
        }
        if (e3Var.getB() != null) {
            setMessageTextColor(e3Var.getB().intValue());
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final z1 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getClickAction, reason: from getter */
    public ClickAction getInternalClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final e3 getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return CollectionsKt.emptyList();
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(TRIGGER_ID);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    /* renamed from: getUri, reason: from getter */
    public Uri getInternalUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean(IS_CONTROL);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            return false;
        }
        z1 z1Var = this.brazeManager;
        if (z1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g.b, 2, (Object) null);
            return false;
        }
        if (this.clickLogged.get() && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, h.b, 2, (Object) null);
            return false;
        }
        if (this.displayFailureLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, j.b, 2, (Object) null);
        x1 g2 = bo.app.j.h.g(triggerId);
        if (g2 != null) {
            z1Var.a(g2);
        }
        this.clickLogged.set(true);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logDisplayFailure(InAppMessageFailureType failureType) {
        Intrinsics.checkNotNullParameter(failureType, "failureType");
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.b, 3, (Object) null);
            return false;
        }
        z1 z1Var = this.brazeManager;
        if (z1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, l.b, 2, (Object) null);
            return false;
        }
        if (this.displayFailureLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, m.b, 2, (Object) null);
            return false;
        }
        if (this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, n.b, 2, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, o.b, 2, (Object) null);
            return false;
        }
        x1 a = bo.app.j.h.a(triggerId, failureType);
        if (a != null) {
            z1Var.a(a);
        }
        this.displayFailureLogged.set(true);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, p.b, 2, (Object) null);
            return false;
        }
        z1 z1Var = this.brazeManager;
        if (z1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.b, 2, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, r.b, 2, (Object) null);
            return false;
        }
        if (this.displayFailureLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, s.b, 2, (Object) null);
            return false;
        }
        x1 i2 = bo.app.j.h.i(triggerId);
        if (i2 != null) {
            z1Var.a(i2);
        }
        this.impressionLogged.set(true);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        z1 z1Var;
        String triggerId = getTriggerId();
        if (!this.clickLogged.get() || triggerId == null || triggerId.length() == 0 || (z1Var = this.brazeManager) == null) {
            return;
        }
        z1Var.a(new b3(triggerId));
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z) {
        this.animateIn = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z) {
        this.animateOut = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setBackgroundColor(int i2) {
        this.backgroundColor = i2;
    }

    public final void setBrazeManager(z1 z1Var) {
        this.brazeManager = z1Var;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        setClickBehavior(clickAction, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setCropType(CropType cropType) {
        Intrinsics.checkNotNullParameter(cropType, "<set-?>");
        this.cropType = cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDismissType(DismissType dismissType) {
        Intrinsics.checkNotNullParameter(dismissType, "<set-?>");
        this.dismissType = dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDurationInMilliseconds(int i2) {
        if (i2 < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(i2), 3, (Object) null);
        } else {
            this.durationInMilliseconds = i2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(i2), 3, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j2) {
        this.expirationTimestamp = j2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExtras(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extras = map;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIcon(String str) {
        this.icon = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconBackgroundColor(int i2) {
        this.iconBackgroundColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconColor(int i2) {
        this.iconColor = i2;
    }

    public final void setInAppMessageDarkThemeWrapper(e3 e3Var) {
        this.inAppMessageDarkThemeWrapper = e3Var;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.messageTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextColor(int i2) {
        this.messageTextColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOpenUriInWebView(boolean z) {
        this.openUriInWebView = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOrientation(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation = orientation;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonKey() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("message", getMessage());
                jSONObject.put("duration", getDurationInMilliseconds());
                jSONObject.putOpt(TRIGGER_ID, getTriggerId());
                jSONObject.putOpt(CLICK_ACTION, getInternalClickAction().toString());
                jSONObject.putOpt(DISMISS_TYPE, getDismissType().toString());
                if (getInternalUri() != null) {
                    jSONObject.put("uri", String.valueOf(getInternalUri()));
                }
                jSONObject.put(OPEN_URI_IN_WEBVIEW, getOpenUriInWebView());
                jSONObject.put(ANIMATE_IN, getAnimateIn());
                jSONObject.put(ANIMATE_OUT, getAnimateOut());
                jSONObject.put(BG_COLOR, getBackgroundColor());
                jSONObject.put(MESSAGE_TEXT_COLOR, getMessageTextColor());
                jSONObject.put(ICON_COLOR, getIconColor());
                jSONObject.put(ICON_BG_COLOR, getIconBackgroundColor());
                jSONObject.putOpt("icon", getIcon());
                jSONObject.putOpt(CROP_TYPE, getCropType().toString());
                jSONObject.putOpt("orientation", getOrientation().toString());
                jSONObject.putOpt(MESSAGE_TEXT_ALIGN, getMessageTextAlign().toString());
                jSONObject.putOpt(IS_CONTROL, Boolean.valueOf(isControl()));
                if (!getExtras().isEmpty()) {
                    jSONObject.put("extras", getExtras());
                    return jSONObject;
                }
            } catch (JSONException e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
            }
        }
        return jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction, Uri uri) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, t.b, 2, (Object) null);
            return;
        }
        if (uri != null && clickAction == ClickAction.URI) {
            this.internalClickAction = clickAction;
            this.internalUri = uri;
        } else if (clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, u.b, 2, (Object) null);
        } else {
            this.internalClickAction = clickAction;
            this.internalUri = null;
        }
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, z1 z1Var, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, z1Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    public InAppMessageBase(JSONObject json, z1 brazeManager, boolean z, boolean z2) {
        String upperCase;
        DismissType[] values;
        int length;
        String upperCase2;
        ClickAction[] values2;
        int length2;
        int i2;
        String upperCase3;
        Orientation[] values3;
        int length3;
        int i3;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.internalClickAction = ClickAction.NONE;
        this.extras = MapsKt.emptyMap();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        int i4 = 0;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.displayFailureLogged = new AtomicBoolean(false);
        this.jsonObject = json;
        this.brazeManager = brazeManager;
        setMessage(json.optString("message"));
        setAnimateIn(json.optBoolean(ANIMATE_IN, true));
        setAnimateOut(json.optBoolean(ANIMATE_OUT, true));
        setDurationInMilliseconds(json.optInt("duration"));
        setIcon(json.optString("icon"));
        try {
            w0 w0Var = w0.a;
            String string = json.getString("orientation");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
            values3 = Orientation.values();
            length3 = values3.length;
            i3 = 0;
        } catch (Exception unused) {
        }
        while (i3 < length3) {
            Orientation orientation2 = values3[i3];
            i3++;
            if (Intrinsics.areEqual(orientation2.name(), upperCase3)) {
                if (orientation2 != null) {
                    orientation = orientation2;
                }
                setOrientation(orientation);
                setOpenUriInWebView(json.optBoolean(OPEN_URI_IN_WEBVIEW, false));
                setIconBackgroundColor(json.optInt(ICON_BG_COLOR));
                setMessageTextColor(json.optInt(MESSAGE_TEXT_COLOR));
                setBackgroundColor(json.optInt(BG_COLOR));
                setIconColor(json.optInt(ICON_COLOR));
                this.impressionLogged.set(z);
                this.clickLogged.set(z2);
                setExtras(JsonUtils.convertJSONObjectToMap(json.optJSONObject("extras")));
                String optString = json.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    w0 w0Var2 = w0.a;
                    String string2 = json.getString(CLICK_ACTION);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    values2 = ClickAction.values();
                    length2 = values2.length;
                    i2 = 0;
                } catch (Exception unused2) {
                }
                while (i2 < length2) {
                    ClickAction clickAction2 = values2[i2];
                    i2++;
                    if (Intrinsics.areEqual(clickAction2.name(), upperCase2)) {
                        if (clickAction2 != null) {
                            clickAction = clickAction2;
                        }
                        if (clickAction == ClickAction.URI && optString != null && !StringsKt.isBlank(optString)) {
                            this.internalUri = Uri.parse(optString);
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            w0 w0Var3 = w0.a;
                            String string3 = json.getString(DISMISS_TYPE);
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            values = DismissType.values();
                            length = values.length;
                        } catch (Exception unused3) {
                        }
                        while (i4 < length) {
                            DismissType dismissType2 = values[i4];
                            i4++;
                            if (Intrinsics.areEqual(dismissType2.name(), upperCase)) {
                                if (dismissType2 != null) {
                                    dismissType = dismissType2;
                                }
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                this.inAppMessageDarkThemeWrapper = c3.a(json);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
