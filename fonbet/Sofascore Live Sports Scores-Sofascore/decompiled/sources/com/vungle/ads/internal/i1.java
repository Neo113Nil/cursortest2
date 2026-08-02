package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i1 extends xka implements Function0 {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.a = imageView;
        this.b = bitmap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setImageBitmap(this.b);
        return Unit.a;
    }
}
