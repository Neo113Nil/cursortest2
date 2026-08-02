package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l74 implements i72 {
    public static final l74 r = new l74("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final vp2 s = new vp2(28);
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    public l74(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            qx9.r(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public final j74 a() {
        j74 j74Var = new j74();
        j74Var.a = this.a;
        j74Var.b = this.d;
        j74Var.c = this.b;
        j74Var.d = this.c;
        j74Var.e = this.e;
        j74Var.f = this.f;
        j74Var.g = this.g;
        j74Var.h = this.h;
        j74Var.i = this.i;
        j74Var.j = this.n;
        j74Var.k = this.o;
        j74Var.l = this.j;
        j74Var.m = this.k;
        j74Var.n = this.l;
        j74Var.o = this.m;
        j74Var.p = this.p;
        j74Var.q = this.q;
        return j74Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l74.class == obj.getClass()) {
            l74 l74Var = (l74) obj;
            if (TextUtils.equals(this.a, l74Var.a) && this.b == l74Var.b && this.c == l74Var.c) {
                Bitmap bitmap = l74Var.d;
                Bitmap bitmap2 = this.d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.e == l74Var.e && this.f == l74Var.f && this.g == l74Var.g && this.h == l74Var.h && this.i == l74Var.i && this.j == l74Var.j && this.k == l74Var.k && this.l == l74Var.l && this.m == l74Var.m && this.n == l74Var.n && this.o == l74Var.o && this.p == l74Var.p && this.q == l74Var.q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }
}
