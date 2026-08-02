package com.braze.models.inappmessage;

import android.graphics.Color;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.managers.m0;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB+\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageSlideup;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/braze/managers/m0;", "brazeManager", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;)V", "Lcom/braze/enums/inappmessage/SlideFrom;", "slideFrom", "", "chevronColor", "(Lorg/json/JSONObject;Lcom/braze/managers/m0;Lcom/braze/enums/inappmessage/SlideFrom;I)V", "", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "Lcom/braze/enums/inappmessage/SlideFrom;", "getSlideFrom", "()Lcom/braze/enums/inappmessage/SlideFrom;", "setSlideFrom", "(Lcom/braze/enums/inappmessage/SlideFrom;)V", "I", "getChevronColor", "()I", "setChevronColor", "(I)V", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    private static final String CHEVRON_COLOR = "close_btn_color";
    private static final String SLIDE_FROM = "slide_from";
    private int chevronColor;
    private SlideFrom slideFrom;

    public InAppMessageSlideup() {
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        setMessageTextAlign(TextAlign.START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$2() {
        return "Error creating JSON.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        Integer num;
        super.enableDarkTheme();
        com.braze.models.theme.a inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, new Function0() { // from class: com.braze.models.inappmessage.InAppMessageSlideup$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String enableDarkTheme$lambda$0;
                    enableDarkTheme$lambda$0 = InAppMessageSlideup.enableDarkTheme$lambda$0();
                    return enableDarkTheme$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        Integer num2 = inAppMessageDarkThemeWrapper.c;
        if ((num2 != null && num2.intValue() == -1) || (num = inAppMessageDarkThemeWrapper.c) == null) {
            return;
        }
        this.chevronColor = num.intValue();
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
    public JSONObject getJsonKey() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jsonKey = super.getJsonKey();
        try {
            jsonKey.put(SLIDE_FROM, this.slideFrom.toString());
            jsonKey.put(CHEVRON_COLOR, this.chevronColor);
            jsonKey.put("type", getMessageType().name());
            return jsonKey;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.inappmessage.InAppMessageSlideup$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$2;
                    forJsonPut$lambda$2 = InAppMessageSlideup.forJsonPut$lambda$2();
                    return forJsonPut$lambda$2;
                }
            }, 4, (Object) null);
            return jsonKey;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jsonObject, m0 brazeManager) {
        this(jsonObject, brazeManager, (SlideFrom) JsonUtils.optEnum(jsonObject, SLIDE_FROM, SlideFrom.class, SlideFrom.BOTTOM), jsonObject.optInt(CHEVRON_COLOR));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    private InAppMessageSlideup(JSONObject jSONObject, m0 m0Var, SlideFrom slideFrom, int i) {
        super(jSONObject, m0Var);
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
