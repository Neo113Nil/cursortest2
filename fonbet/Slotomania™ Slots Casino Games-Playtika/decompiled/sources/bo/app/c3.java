package bo.app;

import bo.app.j;
import com.braze.Constants;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"", "inAppMessageJsonString", "Lbo/app/z1;", "brazeManager", "Lcom/braze/models/inappmessage/IInAppMessage;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lorg/json/JSONObject;", "inAppMessageJson", "Lbo/app/e3;", "Lorg/json/JSONArray;", "b", "", "", "c", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class c3 {
    private static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.FULL.ordinal()] = 1;
            iArr[MessageType.MODAL.ordinal()] = 2;
            iArr[MessageType.SLIDEUP.ordinal()] = 3;
            iArr[MessageType.HTML_FULL.ordinal()] = 4;
            iArr[MessageType.HTML.ordinal()] = 5;
            a = iArr;
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
            return "Deserializing control in-app message.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("In-app message type was unknown for in-app message: ", JsonUtils.getPrettyPrintedString(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Unknown in-app message type. Returning null: ", JsonUtils.getPrettyPrintedString(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONObject jSONObject) {
            super(0);
            this.b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(this.b) + ". Returning null.";
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
            return "In-app message string was blank.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to deserialize the in-app message string: ", this.b);
        }
    }

    public static final IInAppMessage a(String inAppMessageJsonString, z1 brazeManager) {
        Intrinsics.checkNotNullParameter(inAppMessageJsonString, "inAppMessageJsonString");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        if (StringsKt.isBlank(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, (Function0) f.b, 4, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(inAppMessageJsonString), brazeManager);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) new g(inAppMessageJsonString));
            return null;
        }
    }

    public static final JSONArray b(JSONObject inAppMessageJson) {
        JSONObject optJSONObject;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject optJSONObject2 = inAppMessageJson.optJSONObject("themes");
        JSONArray optJSONArray = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("dark")) == null) ? null : optJSONObject.optJSONArray("btns");
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    public static final boolean c(JSONObject inAppMessageJson) {
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        return inAppMessageJson.optBoolean(InAppMessageBase.IS_CONTROL, false);
    }

    private static final void b(JSONObject jSONObject, z1 z1Var) {
        String triggerId = jSONObject.optString(InAppMessageBase.TRIGGER_ID);
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        j.a aVar = j.h;
        Intrinsics.checkNotNullExpressionValue(triggerId, "triggerId");
        x1 a2 = aVar.a(triggerId, InAppMessageFailureType.UNKNOWN_MESSAGE_TYPE);
        if (a2 == null) {
            return;
        }
        z1Var.a(a2);
    }

    public static final IInAppMessage a(JSONObject inAppMessageJson, z1 brazeManager) {
        MessageType messageType;
        IInAppMessage inAppMessageFull;
        String upperCase;
        MessageType[] values;
        int length;
        int i;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            if (c(inAppMessageJson)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.D, (Throwable) null, (Function0) b.b, 4, (Object) null);
                return new InAppMessageControl(inAppMessageJson, brazeManager);
            }
            try {
                w0 w0Var = w0.a;
                String string = inAppMessageJson.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                values = MessageType.values();
                length = values.length;
                i = 0;
            } catch (Exception unused) {
                messageType = null;
            }
            while (i < length) {
                messageType = values[i];
                i++;
                if (Intrinsics.areEqual(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, (Function0) new c(inAppMessageJson), 4, (Object) null);
                        b(inAppMessageJson, brazeManager);
                        return null;
                    }
                    int i2 = a.a[messageType.ordinal()];
                    if (i2 == 1) {
                        inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
                    } else if (i2 == 2) {
                        inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
                    } else if (i2 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
                    } else if (i2 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
                    } else if (i2 == 5) {
                        inAppMessageFull = new InAppMessageHtml(inAppMessageJson, brazeManager);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, (Function0) new d(inAppMessageJson), 4, (Object) null);
                        b(inAppMessageJson, brazeManager);
                        return null;
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, (Throwable) e2, (Function0<String>) new e(inAppMessageJson));
            return null;
        }
    }

    public static final e3 a(JSONObject inAppMessageJson) {
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        JSONObject optJSONObject = inAppMessageJson.optJSONObject("themes");
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject("dark");
        if (optJSONObject2 == null) {
            return null;
        }
        return new e3(optJSONObject2);
    }
}
