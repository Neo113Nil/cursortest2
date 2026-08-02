package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y7j extends pea {
    public final /* synthetic */ Context g;
    public final /* synthetic */ TextPaint h;
    public final /* synthetic */ pea i;
    public final /* synthetic */ z7j j;

    public y7j(z7j z7jVar, Context context, TextPaint textPaint, pea peaVar) {
        this.j = z7jVar;
        this.g = context;
        this.h = textPaint;
        this.i = peaVar;
    }

    @Override // defpackage.pea
    public final void A(Typeface typeface, boolean z) {
        this.j.f(this.g, this.h, typeface);
        this.i.A(typeface, z);
    }

    @Override // defpackage.pea
    public final void z(int i) {
        this.i.z(i);
    }
}
