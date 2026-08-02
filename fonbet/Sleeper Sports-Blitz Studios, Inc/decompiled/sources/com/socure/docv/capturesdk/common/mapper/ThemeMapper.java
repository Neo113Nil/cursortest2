package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Icon;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Primary;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.models.ButtonModel;
import com.socure.docv.capturesdk.models.IconModel;
import com.socure.docv.capturesdk.models.PrimaryModel;
import com.socure.docv.capturesdk.models.ThemeModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ThemeMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;", "Lcom/socure/docv/capturesdk/models/ThemeModel;", "buttonMapper", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "Lcom/socure/docv/capturesdk/models/ButtonModel;", "(Lcom/socure/docv/capturesdk/common/mapper/Mapper;)V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Theme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemeMapper implements Mapper<Theme, ThemeModel> {
    private final Mapper<Button, ButtonModel> buttonMapper;

    public ThemeMapper(Mapper<Button, ButtonModel> buttonMapper) {
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        this.buttonMapper = buttonMapper;
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends Theme> list, Continuation<? super List<? extends ThemeModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(Theme theme, Continuation<? super ThemeModel> continuation) {
        ThemeMapper$map$1 themeMapper$map$1;
        int i;
        String str;
        String backgroundColor;
        String str2;
        String str3;
        String str4;
        Primary primary;
        Primary primary2;
        Primary primary3;
        Primary primary4;
        Primary primary5;
        String successColor;
        String errorColor;
        Primary primary6;
        Icon icon;
        Primary primary7;
        Icon icon2;
        Primary primary8;
        Icon icon3;
        Primary primary9;
        Primary primary10;
        Theme theme2 = theme;
        if (continuation instanceof ThemeMapper$map$1) {
            themeMapper$map$1 = (ThemeMapper$map$1) continuation;
            if ((themeMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                themeMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = themeMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = themeMapper$map$1.label;
                str = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String color = (theme2 == null || (primary5 = theme2.getPrimary()) == null) ? null : primary5.getColor();
                    if (color == null) {
                        color = "";
                    }
                    backgroundColor = (theme2 == null || (primary4 = theme2.getPrimary()) == null) ? null : primary4.getBackgroundColor();
                    if (backgroundColor == null) {
                        backgroundColor = "";
                    }
                    String boundingBoxColor = (theme2 == null || (primary3 = theme2.getPrimary()) == null) ? null : primary3.getBoundingBoxColor();
                    if (boundingBoxColor == null) {
                        boundingBoxColor = "";
                    }
                    String fontFamily = (theme2 == null || (primary2 = theme2.getPrimary()) == null) ? null : primary2.getFontFamily();
                    if (fontFamily == null) {
                        fontFamily = "";
                    }
                    Mapper<Button, ButtonModel> mapper = this.buttonMapper;
                    Button button = (theme2 == null || (primary = theme2.getPrimary()) == null) ? null : primary.getButton();
                    themeMapper$map$1.L$0 = theme2;
                    themeMapper$map$1.L$1 = color;
                    themeMapper$map$1.L$2 = backgroundColor;
                    themeMapper$map$1.L$3 = boundingBoxColor;
                    themeMapper$map$1.L$4 = fontFamily;
                    themeMapper$map$1.label = 1;
                    Object map = mapper.map((Mapper<Button, ButtonModel>) button, (Continuation<? super ButtonModel>) themeMapper$map$1);
                    if (map == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = boundingBoxColor;
                    str3 = fontFamily;
                    str4 = color;
                    obj = map;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str5 = (String) themeMapper$map$1.L$4;
                    String str6 = (String) themeMapper$map$1.L$3;
                    backgroundColor = (String) themeMapper$map$1.L$2;
                    String str7 = (String) themeMapper$map$1.L$1;
                    Theme theme3 = (Theme) themeMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    str3 = str5;
                    theme2 = theme3;
                    str2 = str6;
                    str4 = str7;
                }
                String str8 = backgroundColor;
                ButtonModel buttonModel = (ButtonModel) obj;
                String progressBarColor = (theme2 != null || (primary10 = theme2.getPrimary()) == null) ? null : primary10.getProgressBarColor();
                String str9 = progressBarColor != null ? "" : progressBarColor;
                String imageThemeColor = (theme2 != null || (primary9 = theme2.getPrimary()) == null) ? null : primary9.getImageThemeColor();
                String str10 = imageThemeColor != null ? "" : imageThemeColor;
                successColor = (theme2 != null || (primary8 = theme2.getPrimary()) == null || (icon3 = primary8.getIcon()) == null) ? null : icon3.getSuccessColor();
                if (successColor == null) {
                    successColor = "";
                }
                errorColor = (theme2 != null || (primary7 = theme2.getPrimary()) == null || (icon2 = primary7.getIcon()) == null) ? null : icon2.getErrorColor();
                if (errorColor == null) {
                    errorColor = "";
                }
                if (theme2 != null && (primary6 = theme2.getPrimary()) != null && (icon = primary6.getIcon()) != null) {
                    str = icon.getInfoColor();
                }
                return new ThemeModel(new PrimaryModel(str4, str8, str2, str3, buttonModel, str9, str10, new IconModel(successColor, errorColor, str != null ? str : "")));
            }
        }
        themeMapper$map$1 = new ThemeMapper$map$1(this, continuation);
        Object obj2 = themeMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = themeMapper$map$1.label;
        str = null;
        if (i != 0) {
        }
        String str82 = backgroundColor;
        ButtonModel buttonModel2 = (ButtonModel) obj2;
        if (theme2 != null) {
        }
        if (progressBarColor != null) {
        }
        if (theme2 != null) {
        }
        if (imageThemeColor != null) {
        }
        if (theme2 != null) {
        }
        if (successColor == null) {
        }
        if (theme2 != null) {
        }
        if (errorColor == null) {
        }
        if (theme2 != null) {
            str = icon.getInfoColor();
        }
        return new ThemeModel(new PrimaryModel(str4, str82, str2, str3, buttonModel2, str9, str10, new IconModel(successColor, errorColor, str != null ? str : "")));
    }
}
