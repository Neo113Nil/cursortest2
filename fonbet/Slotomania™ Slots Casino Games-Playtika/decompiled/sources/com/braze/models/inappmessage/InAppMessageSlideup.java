package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.e3;
import bo.app.z1;
import com.braze.Constants;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0018\u0010\u001dB+\b\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageSlideup;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "", "enableDarkTheme", "Lorg/json/JSONObject;", "forJsonPut", "Lcom/braze/enums/inappmessage/SlideFrom;", "slideFrom", "Lcom/braze/enums/inappmessage/SlideFrom;", "getSlideFrom", "()Lcom/braze/enums/inappmessage/SlideFrom;", "setSlideFrom", "(Lcom/braze/enums/inappmessage/SlideFrom;)V", "", "chevronColor", "I", "getChevronColor", "()I", "setChevronColor", "(I)V", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "<init>", "()V", "jsonObject", "Lbo/app/z1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/z1;)V", "(Lorg/json/JSONObject;Lbo/app/z1;Lcom/braze/enums/inappmessage/SlideFrom;I)V", k.M, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    private static final String CHEVRON_COLOR = "close_btn_color";
    private static final String SLIDE_FROM = "slide_from";
    private int chevronColor;
    private SlideFrom slideFrom;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
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
            return "Error creating JSON.";
        }
    }

    public InAppMessageSlideup() {
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        setMessageTextAlign(TextAlign.START);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        e3 inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, a.b, 2, (Object) null);
            return;
        }
        Integer c = inAppMessageDarkThemeWrapper.getC();
        if ((c != null && c.intValue() == -1) || inAppMessageDarkThemeWrapper.getC() == null) {
            return;
        }
        this.chevronColor = inAppMessageDarkThemeWrapper.getC().intValue();
    }

    public final int getChevronColor() {
        return this.chevronColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public final SlideFrom getSlideFrom() {
        return this.slideFrom;
    }

    public final void setChevronColor(int i) {
        this.chevronColor = i;
    }

    public final void setSlideFrom(SlideFrom slideFrom) {
        Intrinsics.checkNotNullParameter(slideFrom, "<set-?>");
        this.slideFrom = slideFrom;
    }

    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getJsonObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject == null) {
            jsonObject = super.getJsonObject();
            try {
                jsonObject.put(SLIDE_FROM, this.slideFrom.toString());
                jsonObject.put(CHEVRON_COLOR, this.chevronColor);
                jsonObject.put("type", getMessageType().name());
                return jsonObject;
            } catch (JSONException e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
            }
        }
        return jsonObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jsonObject, z1 brazeManager) {
        this(jsonObject, brazeManager, (SlideFrom) JsonUtils.optEnum(jsonObject, SLIDE_FROM, SlideFrom.class, SlideFrom.BOTTOM), jsonObject.optInt(CHEVRON_COLOR));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    private InAppMessageSlideup(JSONObject jSONObject, z1 z1Var, SlideFrom slideFrom, int i) {
        super(jSONObject, z1Var);
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        if (slideFrom != null) {
            this.slideFrom = slideFrom;
        }
        this.chevronColor = i;
        setCropType((CropType) JsonUtils.optEnum(jSONObject, InAppMessageBase.CROP_TYPE, CropType.class, CropType.FIT_CENTER));
        setMessageTextAlign((TextAlign) JsonUtils.optEnum(jSONObject, InAppMessageBase.MESSAGE_TEXT_ALIGN, TextAlign.class, TextAlign.START));
    }
}
