package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0801Hc implements InterfaceC1351b8 {
    public final /* synthetic */ AnonymousClass55 A00;

    public C0801Hc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1351b8
    public final void AE7(C1350b7 c1350b7) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c1350b7.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c1350b7.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
