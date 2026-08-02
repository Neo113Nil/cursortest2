package com.vk.id.onetap.xml;

import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class OneTapAtrrUtilKt$getOneTapStyleConstructor$3 extends C7735q implements InterfaceC6511n<OneTapButtonCornersStyle, OneTapButtonSizeStyle, OneTapButtonElevationStyle, OneTapStyle.TransparentDark> {
    public static final OneTapAtrrUtilKt$getOneTapStyleConstructor$3 INSTANCE = new OneTapAtrrUtilKt$getOneTapStyleConstructor$3();

    OneTapAtrrUtilKt$getOneTapStyleConstructor$3() {
        super(3, OneTapStyle.TransparentDark.class, "<init>", "<init>(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public final OneTapStyle.TransparentDark invoke(OneTapButtonCornersStyle p02, OneTapButtonSizeStyle p12, OneTapButtonElevationStyle p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        return new OneTapStyle.TransparentDark(p02, p12, p22);
    }
}
