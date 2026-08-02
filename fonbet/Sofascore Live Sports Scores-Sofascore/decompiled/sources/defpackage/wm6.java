package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wm6 {
    public final String a;
    public final Drawable b;
    public final String c;
    public final Integer d;
    public final Function0 e;

    public wm6(String str, Drawable drawable, String str2, Integer num, l31 l31Var, int i) {
        drawable = (i & 4) != 0 ? null : drawable;
        str2 = (i & 8) != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        l31Var = (i & 32) != 0 ? null : l31Var;
        this.a = str;
        this.b = drawable;
        this.c = str2;
        this.d = num;
        this.e = l31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm6)) {
            return false;
        }
        wm6 wm6Var = (wm6) obj;
        return Intrinsics.c(this.a, wm6Var.a) && Intrinsics.c(this.b, wm6Var.b) && Intrinsics.c(this.c, wm6Var.c) && Intrinsics.c(this.d, wm6Var.d) && Intrinsics.c(this.e, wm6Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Function0 function0 = this.e;
        return hashCode4 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FactsRowValue(text=");
        sb.append(this.a);
        sb.append(", startDrawable=null, endDrawable=");
        sb.append(this.b);
        sb.append(", flagAlpha2=");
        me4.o(this.d, this.c, ", textColor=", ", callback=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
