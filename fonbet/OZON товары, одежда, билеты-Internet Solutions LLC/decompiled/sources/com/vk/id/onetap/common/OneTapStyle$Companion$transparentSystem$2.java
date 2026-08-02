package com.vk.id.onetap.common;

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
/* synthetic */ class OneTapStyle$Companion$transparentSystem$2 extends C7735q implements InterfaceC6511n<OneTapButtonCornersStyle, OneTapButtonSizeStyle, OneTapButtonElevationStyle, OneTapStyle.TransparentLight> {
    public static final OneTapStyle$Companion$transparentSystem$2 INSTANCE = new OneTapStyle$Companion$transparentSystem$2();

    OneTapStyle$Companion$transparentSystem$2() {
        super(3, OneTapStyle.TransparentLight.class, "<init>", "<init>(Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public final OneTapStyle.TransparentLight invoke(OneTapButtonCornersStyle p02, OneTapButtonSizeStyle p12, OneTapButtonElevationStyle p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        return new OneTapStyle.TransparentLight(p02, p12, p22);
    }
}
