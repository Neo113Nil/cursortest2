package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j1 extends xka implements Function1 {
    public final /* synthetic */ ImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ImageView imageView) {
        super(1);
        this.a = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        ImageView imageView = this.a;
        if (imageView != null) {
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new i1(imageView, bitmap));
        }
        return Unit.a;
    }
}
