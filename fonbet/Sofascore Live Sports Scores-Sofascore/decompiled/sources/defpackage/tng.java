package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tng {
    public final omg a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public w0d f;
    public w0d g;
    public boolean h;

    public tng(tng tngVar) {
        this.b = tngVar.b;
        this.c = tngVar.c;
        this.d = new Paint(tngVar.d);
        this.e = new Paint(tngVar.e);
        w0d w0dVar = tngVar.f;
        if (w0dVar != null) {
            this.f = new w0d(w0dVar);
        }
        w0d w0dVar2 = tngVar.g;
        if (w0dVar2 != null) {
            this.g = new w0d(w0dVar2);
        }
        this.h = tngVar.h;
        try {
            this.a = (omg) tngVar.a.clone();
        } catch (CloneNotSupportedException unused) {
            this.a = omg.a();
        }
    }

    public tng() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = omg.a();
    }
}
