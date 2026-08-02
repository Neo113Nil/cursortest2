package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i7e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public i7e(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int g = o23.g(4.5f, -1, i);
        int g2 = o23.g(3.0f, -1, i);
        if (g != -1 && g2 != -1) {
            this.h = o23.k(-1, g);
            this.g = o23.k(-1, g2);
            this.f = true;
            return;
        }
        int g3 = o23.g(4.5f, -16777216, i);
        int g4 = o23.g(3.0f, -16777216, i);
        if (g3 == -1 || g4 == -1) {
            this.h = g != -1 ? o23.k(-1, g) : o23.k(-16777216, g3);
            this.g = g2 != -1 ? o23.k(-1, g2) : o23.k(-16777216, g4);
            this.f = true;
        } else {
            this.h = o23.k(-16777216, g3);
            this.g = o23.k(-16777216, g4);
            this.f = true;
        }
    }

    public final float[] b() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        o23.b(this.a, this.b, this.c, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i7e.class == obj.getClass()) {
            i7e i7eVar = (i7e) obj;
            if (this.e == i7eVar.e && this.d == i7eVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(i7e.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
