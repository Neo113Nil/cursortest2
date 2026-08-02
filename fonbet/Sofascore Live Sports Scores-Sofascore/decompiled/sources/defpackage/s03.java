package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s03 implements tti {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Spannable b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Spannable f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Spannable l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    public s03(Drawable drawable, Spannable spannable, int i, int i2, Drawable drawable2, Spannable spannable2, int i3, int i4, Context context, int i5, Spannable spannable3, int i6, int i7) {
        this.c = drawable;
        this.b = spannable;
        this.d = i;
        this.e = i2;
        this.g = drawable2;
        this.f = spannable2;
        this.h = i3;
        this.i = i4;
        this.j = context;
        this.k = i5;
        this.l = spannable3;
        this.m = i6;
        this.n = i7;
    }

    @Override // defpackage.tti
    public final void A(nr9 nr9Var) {
        int i = this.a;
        int i2 = this.n;
        int i3 = this.m;
        Spannable spannable = this.l;
        int i4 = this.k;
        Context context = this.j;
        switch (i) {
            case 0:
                Resources resources = context.getResources();
                resources.getClass();
                Drawable t = rfo.t(nr9Var, resources);
                t.setBounds(0, 0, i4, i4);
                spannable.setSpan(new rok(t), i3, i2, 33);
                break;
            default:
                Resources resources2 = context.getResources();
                resources2.getClass();
                Drawable t2 = rfo.t(nr9Var, resources2);
                t2.setBounds(0, 0, i4, i4);
                spannable.setSpan(new rok(t2), i3, i2, 33);
                break;
        }
    }

    @Override // defpackage.tti
    public final void D(nr9 nr9Var) {
        int i = this.a;
        int i2 = this.i;
        int i3 = this.h;
        Drawable drawable = this.g;
        Spannable spannable = this.f;
        switch (i) {
            case 0:
                if (drawable != null) {
                    spannable.setSpan(new rok(drawable), i3, i2, 33);
                    break;
                }
                break;
            default:
                spannable.setSpan(drawable != null ? new rok(drawable) : null, i3, i2, 33);
                break;
        }
    }

    @Override // defpackage.tti
    public final void t(nr9 nr9Var) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        Drawable drawable = this.c;
        Spannable spannable = this.b;
        switch (i) {
            case 0:
                if (drawable != null) {
                    spannable.setSpan(new rok(drawable), i3, i2, 33);
                    break;
                }
                break;
            default:
                spannable.setSpan(drawable != null ? new rok(drawable) : null, i3, i2, 33);
                break;
        }
    }

    public s03(Spannable spannable, Drawable drawable, int i, int i2, Spannable spannable2, Drawable drawable2, int i3, int i4, Context context, int i5, Spannable spannable3, int i6, int i7) {
        this.b = spannable;
        this.c = drawable;
        this.d = i;
        this.e = i2;
        this.f = spannable2;
        this.g = drawable2;
        this.h = i3;
        this.i = i4;
        this.j = context;
        this.k = i5;
        this.l = spannable3;
        this.m = i6;
        this.n = i7;
    }
}
