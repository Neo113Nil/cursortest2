package we;

import com.facebook.react.common.assets.ReactFontManager;
import io.agora.rtc2.Constants;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f67676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67677b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f67647c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final d f67649d = new d(1000, "Unknown error");

    /* renamed from: e, reason: collision with root package name */
    public static final d f67651e = new d(600, "No network connection");

    /* renamed from: f, reason: collision with root package name */
    public static final d f67653f = new d(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Mobilisten not initialised");

    /* renamed from: g, reason: collision with root package name */
    public static final d f67655g = new d(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWTHICKNESS, "Brand is offline and 'Hide widget when offline' is enabled");

    /* renamed from: h, reason: collision with root package name */
    public static final d f67657h = new d(502, "Brand is outside of business hours");

    /* renamed from: i, reason: collision with root package name */
    public static final d f67658i = new d(503, "Visitor Ip has been blocked");

    /* renamed from: j, reason: collision with root package name */
    public static final d f67659j = new d(504, "Widget not accessible to visitor");

    /* renamed from: k, reason: collision with root package name */
    public static final d f67660k = new d(505, "Brand is disabled");

    /* renamed from: l, reason: collision with root package name */
    public static final d f67661l = new d(506, "Chat is disabled");

    /* renamed from: m, reason: collision with root package name */
    public static final d f67662m = new d(507, "Knowledge base is disabled");

    /* renamed from: n, reason: collision with root package name */
    public static final d f67663n = new d(508, "Chat is disabled in offline mode");

    /* renamed from: o, reason: collision with root package name */
    public static final d f67664o = new d(509, "Past conversations disabled in brand settings");

    /* renamed from: p, reason: collision with root package name */
    public static final d f67665p = new d(510, "Tab input not received. ID provided.");

    /* renamed from: q, reason: collision with root package name */
    public static final d f67666q = new d(511, "Invalid resource ID");

    /* renamed from: r, reason: collision with root package name */
    public static final d f67667r = new d(512, "This initialisation is interrupted by another initialisation");

    /* renamed from: s, reason: collision with root package name */
    public static final d f67668s = new d(514, "Widget not accessible to visitor");

    /* renamed from: t, reason: collision with root package name */
    public static final d f67669t = new d(515, "Invalid app or access key");

    /* renamed from: u, reason: collision with root package name */
    public static final d f67670u = new d(ReactFontManager.TypefaceStyle.BOLD, "Invalid chat ID");

    /* renamed from: v, reason: collision with root package name */
    public static final d f67671v = new d(701, "Conversation already exists with the same chat ID");

    /* renamed from: w, reason: collision with root package name */
    public static final d f67672w = new d(Constants.AUDIO_MIXING_REASON_TOO_FREQUENT_CALL, "Parallel conversations are currently disabled. You cannot start a new chat while you have an ongoing one.");

    /* renamed from: x, reason: collision with root package name */
    public static final d f67673x = new d(Constants.AUDIO_MIXING_REASON_INTERRUPTED_EOF, "Waiting for user input to start chat as pre-chat form is enabled");

    /* renamed from: y, reason: collision with root package name */
    public static final d f67674y = new d(704, "Provided department is invalid. Please provide a valid one.");

    /* renamed from: z, reason: collision with root package name */
    public static final d f67675z = new d(705, "No bots available with widget interaction trigger");

    /* renamed from: A, reason: collision with root package name */
    public static final d f67619A = new d(706, "Bot trigger failed");

    /* renamed from: B, reason: collision with root package name */
    public static final d f67620B = new d(707, "Cannot start more than one chat in conversation form style, Please complete the form in the previous chat before initiating a new chat!");

    /* renamed from: C, reason: collision with root package name */
    public static final d f67621C = new d(709, "Unable to reopen the existing conversation as the Reopen configuration is disabled");

    /* renamed from: D, reason: collision with root package name */
    public static final d f67622D = new d(Constants.AUDIO_MIXING_STATE_PLAYING, "A chat is already being initiated. Please wait for the current chat to be initiated.");

    /* renamed from: E, reason: collision with root package name */
    public static final d f67623E = new d(Constants.AUDIO_MIXING_STATE_PAUSED, "Conversation is not available. Please check the conversation ID and try again.");

    /* renamed from: F, reason: collision with root package name */
    public static final d f67624F = new d(712, "InvokeJsApi cannot be triggered with this method, Please use ZohoSalesIQ.Tracking.setCustomAction(actionName) or ZohoSalesIQ.Visitor.performCustomAction(actionName)");

    /* renamed from: G, reason: collision with root package name */
    public static final d f67625G = new d(Constants.AUDIO_MIXING_STATE_STOPPED, "Trigger has already been scheduled");

    /* renamed from: H, reason: collision with root package name */
    public static final d f67626H = new d(Constants.AUDIO_MIXING_STATE_FAILED, "Trigger added to queue, Will be called after the LandedOnSite trigger is completed");

    /* renamed from: I, reason: collision with root package name */
    public static final d f67627I = new d(715, "Open chat already exists, Cannot create a new chat when custom chat Id is not provided.");

    /* renamed from: J, reason: collision with root package name */
    public static final d f67628J = new d(716, "No trigger available, Please configure the bot/intelligent trigger with the visitor action");

    /* renamed from: K, reason: collision with root package name */
    public static final d f67629K = new d(719, "Conversation data cannot be updated for local conversations, Please wait for the conversation to be created or continue with the update without waiting for the conversation to be created.");

    /* renamed from: L, reason: collision with root package name */
    public static final d f67630L = new d(720, "The data provider returned no data. Ensure a SalesIQConversationDataProvider is registered and returns a non-null value for the requested data type.");

    /* renamed from: M, reason: collision with root package name */
    public static final d f67631M = new d(6205, "Provided JWT Token has been Expired.");

    /* renamed from: N, reason: collision with root package name */
    public static final d f67632N = new d(2000, "Not a SalesIQ Notification");

    /* renamed from: O, reason: collision with root package name */
    public static final d f67633O = new d(6300, "Provided token belongs to another visitor, Please deinit and retry or provide a valid token.");

    /* renamed from: P, reason: collision with root package name */
    public static final d f67634P = new d(400, "Calls feature is disabled");

    /* renamed from: Q, reason: collision with root package name */
    public static final d f67635Q = new d(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION, "No call in progress");

    /* renamed from: R, reason: collision with root package name */
    public static final d f67636R = new d(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHSMILE, "Call is not available. Please check the call ID and try again.");

    /* renamed from: S, reason: collision with root package name */
    public static final d f67637S = new d(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP, "Call already in progress");

    /* renamed from: T, reason: collision with root package name */
    public static final d f67638T = new d(404, "Call not allowed for ended or missed conversation");

    /* renamed from: U, reason: collision with root package name */
    public static final d f67639U = new d(405, "Call not allowed for bot conversation");

    /* renamed from: V, reason: collision with root package name */
    public static final d f67640V = new d(406, "Call permission disabled for the connected operator");

    /* renamed from: W, reason: collision with root package name */
    public static final d f67641W = new d(407, "Recording consent declined");

    /* renamed from: X, reason: collision with root package name */
    public static final d f67642X = new d(408, "Chat consent declined");

    /* renamed from: Y, reason: collision with root package name */
    public static final d f67643Y = new d(409, "Active call displayed");

    /* renamed from: Z, reason: collision with root package name */
    public static final d f67644Z = new d(410, "Call failed with invalid department");

    /* renamed from: a0, reason: collision with root package name */
    public static final d f67645a0 = new d(411, "This chat has not been associated with any operator");

    /* renamed from: b0, reason: collision with root package name */
    public static final d f67646b0 = new d(412, "Call initiation failed with SDK");

    /* renamed from: c0, reason: collision with root package name */
    public static final d f67648c0 = new d(413, "Call offline consent declined");

    /* renamed from: d0, reason: collision with root package name */
    public static final d f67650d0 = new d(414, "Unable to initiate call");

    /* renamed from: e0, reason: collision with root package name */
    public static final d f67652e0 = new d(415, "Error on syncing forms");

    /* renamed from: f0, reason: collision with root package name */
    public static final d f67654f0 = new d(416, "Ended or missed call cannot be opened");

    /* renamed from: g0, reason: collision with root package name */
    public static final d f67656g0 = new d(417, "Call department not available, Please check the departments in SalesIQ settings");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends d {

        /* renamed from: h0, reason: collision with root package name */
        public final int f67678h0;

        /* renamed from: i0, reason: collision with root package name */
        public final String f67679i0;

        public b(int i10, String str) {
            super(i10, str);
            this.f67678h0 = i10;
            this.f67679i0 = str;
        }

        @Override // we.d
        public int a() {
            return this.f67678h0;
        }

        @Override // we.d
        public String b() {
            return this.f67679i0;
        }
    }

    public d(int i10, String str) {
        this.f67676a = i10;
        this.f67677b = str;
    }

    public int a() {
        return this.f67676a;
    }

    public String b() {
        return this.f67677b;
    }

    public String toString() {
        return "Error Code: " + a() + "\n\tErrorMessage: " + b();
    }
}
