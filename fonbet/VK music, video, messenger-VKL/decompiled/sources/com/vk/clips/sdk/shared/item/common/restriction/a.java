package com.vk.clips.sdk.shared.item.common.restriction;

import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkRestrictionButton;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.item.common.restriction.b;
import xsna.bdg0;
import xsna.drm0;
import xsna.oy8;

/* compiled from: RestrictionOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class a extends oy8<bdg0, b> {
    @Override // xsna.oy8
    public final b b(bdg0 bdg0Var) {
        bdg0 bdg0Var2 = bdg0Var;
        SdkVideoRestriction sdkVideoRestriction = bdg0Var2.c;
        String str = bdg0Var2.b;
        if (!bdg0Var2.a) {
            return new b.C0673b(str);
        }
        SdkImages sdkImages = sdkVideoRestriction != null ? sdkVideoRestriction.l : null;
        b.c c0674b = sdkImages == null ? b.c.a.a : new b.c.C0674b(sdkImages);
        String str2 = sdkVideoRestriction != null ? sdkVideoRestriction.c : "";
        b.d c0675b = !drm0.N(str2) ? new b.d.C0675b(str2) : b.d.a.a;
        SdkRestrictionButton sdkRestrictionButton = sdkVideoRestriction != null ? sdkVideoRestriction.i : null;
        return new b.e(str, c0674b, c0675b, sdkRestrictionButton == null ? b.a.C0671a.a : new b.a.C0672b(sdkRestrictionButton.b));
    }
}
