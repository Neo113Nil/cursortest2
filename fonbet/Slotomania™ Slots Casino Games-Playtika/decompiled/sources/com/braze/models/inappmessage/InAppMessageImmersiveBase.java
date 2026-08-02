package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.b3;
import bo.app.c3;
import bo.app.e3;
import bo.app.j;
import bo.app.w0;
import bo.app.x1;
import bo.app.z1;
import com.braze.Constants;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\t\b\u0014¢\u0006\u0004\b;\u0010<B\u0019\b\u0016\u0012\u0006\u0010=\u001a\u00020\n\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b;\u0010@BI\b\u0012\u0012\u0006\u0010=\u001a\u00020\n\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010A\u001a\u000201¢\u0006\u0004\b;\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0018¨\u0006E"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "", "onAfterClosed", "enableDarkTheme", "Lorg/json/JSONObject;", "forJsonPut", "", "headerTextColor", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "closeButtonColor", "getCloseButtonColor", "setCloseButtonColor", "", InAppMessageImmersiveBase.HEADER, "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "<init>", "()V", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "messageTextAlign", "(Lorg/json/JSONObject;Lbo/app/z1;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    private static final String BUTTONS = "btns";
    private static final String CLOSE_BUTTON_COLOR = "close_btn_color";
    private static final String FRAME_COLOR = "frame_color";
    private static final String HEADER = "header";
    private static final String HEADER_TEXT_ALIGN = "text_align_header";
    private static final String HEADER_TEXT_COLOR = "header_text_color";
    private static final String IMAGE_STYLE = "image_style";
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

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
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
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
            return "Button click already logged for this message. Ignoring.";
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
            return "Cannot log a button click because the BrazeManager is null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Boolean;", "com/braze/support/JsonUtils$e"}, k = 3, mv = {1, 6, 0})
    public static final class f extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "it", Constants.BRAZE_PUSH_CONTENT_KEY, "(I)Ljava/lang/Object;", "com/braze/support/JsonUtils$f"}, k = 3, mv = {1, 6, 0})
    public static final class g extends Lambda implements Function1<Integer, JSONObject> {
        final /* synthetic */ JSONArray b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONArray jSONArray) {
            super(1);
            this.b = jSONArray;
        }

        public final JSONObject a(int i) {
            Object obj = this.b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.json.JSONObject] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return a(num.intValue());
        }
    }

    protected InAppMessageImmersiveBase() {
        this.headerTextColor = Color.parseColor(PredefinedUICustomizationColor.defaultOverlayColor);
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = CollectionsKt.emptyList();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        e3 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            return;
        }
        if (inAppMessageDarkThemeWrapper.getG() != null) {
            setFrameColor(inAppMessageDarkThemeWrapper.getG());
        }
        if (inAppMessageDarkThemeWrapper.getC() != null) {
            setCloseButtonColor(inAppMessageDarkThemeWrapper.getC().intValue());
        }
        if (inAppMessageDarkThemeWrapper.getF() != null) {
            setHeaderTextColor(inAppMessageDarkThemeWrapper.getF().intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public Integer getFrameColor() {
        return this.frameColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public String getHeader() {
        return this.header;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        z1 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, d.b, 2, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        x1 a = j.h.a(triggerId, messageButton);
        if (a != null) {
            brazeManager.a(a);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        z1 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || brazeManager == null) {
            return;
        }
        brazeManager.a(new b3(getTriggerId(), this.buttonIdClicked));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setCloseButtonColor(int i) {
        this.closeButtonColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeader(String str) {
        this.header = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.headerTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setHeaderTextColor(int i) {
        this.headerTextColor = i;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setImageStyle(ImageStyle imageStyle) {
        Intrinsics.checkNotNullParameter(imageStyle, "<set-?>");
        this.imageStyle = imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public void setMessageButtons(List<? extends MessageButton> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.messageButtons = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getJsonKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject == null) {
            jsonObject = super.getJsonKey();
            try {
                jsonObject.putOpt(HEADER, getHeader());
                jsonObject.put(HEADER_TEXT_COLOR, getHeaderTextColor());
                jsonObject.put(CLOSE_BUTTON_COLOR, getCloseButtonColor());
                jsonObject.putOpt(IMAGE_STYLE, getImageStyle().toString());
                jsonObject.putOpt(HEADER_TEXT_ALIGN, getHeaderTextAlign().toString());
                Integer frameColor = getFrameColor();
                if (frameColor != null) {
                    jsonObject.put(FRAME_COLOR, frameColor.intValue());
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<MessageButton> it = getMessageButtons().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().getJsonKey());
                }
                jsonObject.put(BUTTONS, jSONArray);
            } catch (JSONException unused) {
            }
        }
        return jsonObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c A[LOOP:3: B:37:0x0136->B:39:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InAppMessageImmersiveBase(JSONObject jsonObject, z1 brazeManager) {
        this(jsonObject, brazeManager, r16, r7, r5, r10, r11, r8);
        String str;
        TextAlign textAlign;
        int i;
        JSONArray optJSONArray;
        Iterator it;
        Iterator withIndex;
        String upperCase;
        TextAlign[] values;
        int length;
        int i2;
        String upperCase2;
        TextAlign[] values2;
        int length2;
        int i3;
        String upperCase3;
        ImageStyle[] values3;
        int length3;
        int i4;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String optString = jsonObject.optString(HEADER);
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(HEADER)");
        int optInt = jsonObject.optInt(HEADER_TEXT_COLOR);
        int optInt2 = jsonObject.optInt(CLOSE_BUTTON_COLOR);
        ImageStyle imageStyle = ImageStyle.TOP;
        try {
            w0 w0Var = w0.a;
            String string = jsonObject.getString(IMAGE_STYLE);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
            values3 = ImageStyle.values();
            length3 = values3.length;
            i4 = 0;
        } catch (Exception unused) {
        }
        while (i4 < length3) {
            ImageStyle imageStyle2 = values3[i4];
            i4++;
            if (Intrinsics.areEqual(imageStyle2.name(), upperCase3)) {
                if (imageStyle2 != null) {
                    imageStyle = imageStyle2;
                }
                TextAlign textAlign2 = TextAlign.CENTER;
                try {
                    w0 w0Var2 = w0.a;
                    String string2 = jsonObject.getString(HEADER_TEXT_ALIGN);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    values2 = TextAlign.values();
                    length2 = values2.length;
                    i3 = 0;
                } catch (Exception unused2) {
                    str = optString;
                }
                while (i3 < length2) {
                    TextAlign textAlign3 = values2[i3];
                    i3++;
                    str = optString;
                    if (Intrinsics.areEqual(textAlign3.name(), upperCase2)) {
                        if (textAlign3 != null) {
                            textAlign2 = textAlign3;
                        }
                        TextAlign textAlign4 = TextAlign.CENTER;
                        try {
                            w0 w0Var3 = w0.a;
                            String string3 = jsonObject.getString(InAppMessageBase.MESSAGE_TEXT_ALIGN);
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            values = TextAlign.values();
                            length = values.length;
                            i2 = 0;
                        } catch (Exception unused3) {
                        }
                        while (i2 < length) {
                            TextAlign textAlign5 = values[i2];
                            i2++;
                            if (Intrinsics.areEqual(textAlign5.name(), upperCase)) {
                                if (textAlign5 == null) {
                                    i = optInt2;
                                    textAlign = textAlign4;
                                    optJSONArray = jsonObject.optJSONArray(BUTTONS);
                                    JSONArray b2 = c3.b(jsonObject);
                                    ArrayList arrayList = new ArrayList();
                                    if (optJSONArray != null) {
                                        it = CollectionsKt.emptyList().iterator();
                                    } else {
                                        it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new f(optJSONArray)), new g(optJSONArray)).iterator();
                                    }
                                    withIndex = CollectionsKt.withIndex(it);
                                    while (withIndex.hasNext()) {
                                        IndexedValue indexedValue = (IndexedValue) withIndex.next();
                                        arrayList.add(new MessageButton((JSONObject) indexedValue.getValue(), b2.optJSONObject(indexedValue.getIndex())));
                                    }
                                    setMessageButtons(arrayList);
                                    return;
                                }
                                i = optInt2;
                                textAlign = textAlign5;
                                optJSONArray = jsonObject.optJSONArray(BUTTONS);
                                JSONArray b22 = c3.b(jsonObject);
                                ArrayList arrayList2 = new ArrayList();
                                if (optJSONArray != null) {
                                }
                                withIndex = CollectionsKt.withIndex(it);
                                while (withIndex.hasNext()) {
                                }
                                setMessageButtons(arrayList2);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    optString = str;
                }
                str = optString;
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, z1 z1Var, String str, int i, int i2, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, z1Var);
        this.headerTextColor = Color.parseColor(PredefinedUICustomizationColor.defaultOverlayColor);
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = CollectionsKt.emptyList();
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i);
        setCloseButtonColor(i2);
        if (jSONObject.has(FRAME_COLOR)) {
            setFrameColor(Integer.valueOf(jSONObject.optInt(FRAME_COLOR)));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
