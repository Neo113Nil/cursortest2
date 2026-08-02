package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ButtonStyle;
import com.socure.docv.capturesdk.models.ButtonStyleModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ButtonStyleMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ButtonStyleMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ButtonStyle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonStyleMapper implements Mapper<ButtonStyle, ButtonStyleModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ButtonStyle> list, Continuation<? super List<? extends ButtonStyleModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ButtonStyle buttonStyle, Continuation<? super ButtonStyleModel> continuation) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String color = buttonStyle != null ? buttonStyle.getColor() : null;
        if (color == null) {
            color = "";
        }
        String backgroundColor = buttonStyle != null ? buttonStyle.getBackgroundColor() : null;
        if (backgroundColor == null) {
            backgroundColor = "";
        }
        String fontSize = buttonStyle != null ? buttonStyle.getFontSize() : null;
        if (fontSize == null) {
            fontSize = "";
        }
        String fontWeight = buttonStyle != null ? buttonStyle.getFontWeight() : null;
        if (fontWeight == null) {
            fontWeight = "";
        }
        String borderRadius = buttonStyle != null ? buttonStyle.getBorderRadius() : null;
        if (borderRadius == null) {
            borderRadius = "";
        }
        String borderColor = buttonStyle != null ? buttonStyle.getBorderColor() : null;
        if (borderColor == null) {
            borderColor = "";
        }
        String borderWidth = buttonStyle != null ? buttonStyle.getBorderWidth() : null;
        if (borderWidth == null) {
            borderWidth = "";
        }
        String shadow = buttonStyle != null ? buttonStyle.getShadow() : null;
        if (shadow == null) {
            shadow = "";
        }
        String width = buttonStyle != null ? buttonStyle.getWidth() : null;
        if (width == null) {
            String str9 = shadow;
            str8 = "";
            str = backgroundColor;
            str2 = fontSize;
            str3 = fontWeight;
            str4 = borderRadius;
            str5 = borderColor;
            str6 = borderWidth;
            str7 = str9;
        } else {
            str = backgroundColor;
            str2 = fontSize;
            str3 = fontWeight;
            str4 = borderRadius;
            str5 = borderColor;
            str6 = borderWidth;
            str7 = shadow;
            str8 = width;
        }
        return new ButtonStyleModel(color, str, str2, str3, str4, str5, str6, str7, str8);
    }
}
