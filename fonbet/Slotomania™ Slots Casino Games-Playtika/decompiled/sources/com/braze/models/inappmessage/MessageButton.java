package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.l3;
import bo.app.w0;
import com.braze.Constants;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0017\u0018\u0000 :2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001;B\t\b\u0016¢\u0006\u0004\b4\u00105B\u001d\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b4\u00107Bc\b\u0012\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010(\u001a\u00020\u000e\u0012\b\b\u0001\u0010,\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010/\u001a\u00020\u000e¢\u0006\u0004\b4\u00109J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u000e8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u000e8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010+R\"\u0010/\u001a\u00020\u000e8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010+R\u0011\u00103\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001e¨\u0006<"}, d2 = {"Lcom/braze/models/inappmessage/MessageButton;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "", "enableDarkTheme", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "uri", "setClickBehavior", "forJsonPut", "jsonObject", "Lorg/json/JSONObject;", "", "<set-?>", "id", "I", "getId", "()I", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "openUriInWebview", "Z", "getOpenUriInWebview", "()Z", "setOpenUriInWebview", "(Z)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "getBackgroundColor", "setBackgroundColor", "(I)V", "textColor", "getTextColor", "setTextColor", "borderColor", "getBorderColor", "setBorderColor", "getStringId", "stringId", "<init>", "()V", "darkThemeObject", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "darkThemeJsonObject", "(Lorg/json/JSONObject;Lorg/json/JSONObject;ILcom/braze/enums/inappmessage/ClickAction;Ljava/lang/String;Ljava/lang/String;IIZI)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    private static final String BG_COLOR = "bg_color";
    private static final String BORDER_COLOR = "border_color";
    private static final String CLICK_ACTION = "click_action";
    private static final String ID = "id";
    private static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    private static final String TEXT = "text";
    private static final String TEXT_COLOR = "text_color";
    private static final String URI = "uri";
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private l3 darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "A non-null URI is required in order to set the button ClickAction to URI.";
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
            return "ClickAction of URI is required in order to set a non-null URI";
        }
    }

    public MessageButton() {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageButton(JSONObject jsonObject) {
        this(jsonObject, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
    }

    public static /* synthetic */ void setClickBehavior$default(MessageButton messageButton, ClickAction clickAction, Uri uri, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setClickBehavior");
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        messageButton.setClickBehavior(clickAction, uri);
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        l3 l3Var = this.darkTheme;
        if (l3Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (Function0) b.b, 6, (Object) null);
            return;
        }
        if (l3Var.getA() != null) {
            setBackgroundColor(l3Var.getA().intValue());
        }
        if (l3Var.getB() != null) {
            setTextColor(l3Var.getB().intValue());
        }
        if (l3Var.getC() != null) {
            setBorderColor(l3Var.getC().intValue());
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setClickBehavior(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        setClickBehavior$default(this, clickAction, null, 2, null);
    }

    public final void setClickBehavior(ClickAction clickAction, Uri uri) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        if (uri == null && clickAction == ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) c.b, 4, (Object) null);
        } else if (uri != null && clickAction != ClickAction.URI) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (Function0) d.b, 4, (Object) null);
        } else {
            this.clickAction = clickAction;
            this.uri = uri;
        }
    }

    public final void setOpenUriInWebview(boolean z) {
        this.openUriInWebview = z;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getB() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put(BORDER_COLOR, this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    public /* synthetic */ MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? null : jSONObject2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageButton(JSONObject jsonObject, JSONObject jSONObject) {
        this(jsonObject, jSONObject, r5, r6, r7, r8, jsonObject.optInt("bg_color"), jsonObject.optInt("text_color"), jsonObject.optBoolean("use_webview", false), jsonObject.optInt(BORDER_COLOR));
        ClickAction clickAction;
        String upperCase;
        ClickAction[] values;
        int length;
        int i;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        int optInt = jsonObject.optInt("id", -1);
        ClickAction clickAction2 = ClickAction.NEWS_FEED;
        try {
            w0 w0Var = w0.a;
            String string = jsonObject.getString("click_action");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            values = ClickAction.values();
            length = values.length;
            i = 0;
        } catch (Exception unused) {
        }
        while (i < length) {
            ClickAction clickAction3 = values[i];
            i++;
            if (Intrinsics.areEqual(clickAction3.name(), upperCase)) {
                if (clickAction3 == null) {
                    clickAction = clickAction2;
                    String optString = jsonObject.optString("uri");
                    String optString2 = jsonObject.optString("text");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(TEXT)");
                    return;
                }
                clickAction = clickAction3;
                String optString3 = jsonObject.optString("uri");
                String optString22 = jsonObject.optString("text");
                Intrinsics.checkNotNullExpressionValue(optString22, "jsonObject.optString(TEXT)");
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, ClickAction clickAction, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
        this.jsonObject = jSONObject;
        this.id = i;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !StringsKt.isBlank(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i2;
        this.textColor = i3;
        this.openUriInWebview = z;
        this.borderColor = i4;
        this.darkTheme = jSONObject2 == null ? null : new l3(jSONObject2);
    }
}
