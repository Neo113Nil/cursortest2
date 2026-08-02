package Z6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.RunnableC3011b;
import com.facebook.drawee.drawable.r;

/* loaded from: classes2.dex */
public abstract class c {
    public static Drawable a(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static e b(b bVar) {
        if (bVar.s() == null) {
            bVar.J(new e());
        }
        return bVar.s();
    }

    public static r c(TypedArray typedArray, int i10) {
        switch (typedArray.getInt(i10, -2)) {
            case -1:
                return null;
            case 0:
                return r.f30520a;
            case 1:
                return r.f30523d;
            case 2:
                return r.f30524e;
            case 3:
                return r.f30525f;
            case 4:
                return r.f30526g;
            case 5:
                return r.f30527h;
            case 6:
                return r.f30528i;
            case 7:
                return r.f30529j;
            case 8:
                return r.f30530k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static b d(Context context, AttributeSet attributeSet) {
        if (N7.b.d()) {
            N7.b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        b e10 = e(new b(context.getResources()), context, attributeSet);
        if (N7.b.d()) {
            N7.b.b();
        }
        return e10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c4, code lost:
    
        if (r13 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e4, code lost:
    
        if (r15 != false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b e(b bVar, Context context, AttributeSet attributeSet) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, S6.a.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                int i12 = 0;
                int i13 = 0;
                boolean z15 = true;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z20 = true;
                boolean z21 = true;
                boolean z22 = true;
                int i14 = 0;
                while (i13 < indexCount) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i13);
                        if (index == S6.a.f10602a) {
                            bVar.v(c(obtainStyledAttributes, index));
                        } else if (index == S6.a.f10608g) {
                            bVar.C(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10610i) {
                            bVar.E(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10612k) {
                            bVar.F(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10604c) {
                            bVar.y(obtainStyledAttributes.getInt(index, 0));
                        } else if (index == S6.a.f10599C) {
                            bVar.x(obtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == S6.a.f10609h) {
                            bVar.D(c(obtainStyledAttributes, index));
                        } else if (index == S6.a.f10614m) {
                            bVar.H(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10615n) {
                            bVar.I(c(obtainStyledAttributes, index));
                        } else if (index == S6.a.f10605d) {
                            bVar.z(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10606e) {
                            bVar.A(c(obtainStyledAttributes, index));
                        } else if (index == S6.a.f10613l) {
                            bVar.G(c(obtainStyledAttributes, index));
                        } else if (index == S6.a.f10611j) {
                            i12 = obtainStyledAttributes.getInteger(index, i12);
                        } else if (index == S6.a.f10603b) {
                            bVar.w(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10607f) {
                            bVar.B(a(context2, obtainStyledAttributes, index));
                        } else if (index == S6.a.f10616o) {
                            b(bVar).t(obtainStyledAttributes.getBoolean(index, false));
                        } else if (index == S6.a.f10626y) {
                            i14 = obtainStyledAttributes.getDimensionPixelSize(index, i14);
                        } else {
                            int i15 = i14;
                            if (index == S6.a.f10622u) {
                                z15 = obtainStyledAttributes.getBoolean(index, z15);
                            } else if (index == S6.a.f10623v) {
                                z17 = obtainStyledAttributes.getBoolean(index, z17);
                            } else if (index == S6.a.f10618q) {
                                z21 = obtainStyledAttributes.getBoolean(index, z21);
                            } else if (index == S6.a.f10619r) {
                                z19 = obtainStyledAttributes.getBoolean(index, z19);
                            } else if (index == S6.a.f10624w) {
                                z16 = obtainStyledAttributes.getBoolean(index, z16);
                            } else if (index == S6.a.f10621t) {
                                z18 = obtainStyledAttributes.getBoolean(index, z18);
                            } else if (index == S6.a.f10620s) {
                                z22 = obtainStyledAttributes.getBoolean(index, z22);
                            } else if (index == S6.a.f10617p) {
                                z20 = obtainStyledAttributes.getBoolean(index, z20);
                            } else if (index == S6.a.f10625x) {
                                i14 = i15;
                                b(bVar).q(obtainStyledAttributes.getColor(index, 0));
                            } else {
                                i14 = i15;
                                if (index == S6.a.f10598B) {
                                    b(bVar).n(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                } else if (index == S6.a.f10627z) {
                                    b(bVar).m(obtainStyledAttributes.getColor(index, 0));
                                } else if (index == S6.a.f10597A) {
                                    b(bVar).r(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    i13++;
                                    context2 = context;
                                }
                            }
                            i14 = i15;
                        }
                        i13++;
                        context2 = context;
                    } catch (Throwable th2) {
                        th = th2;
                        obtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z23 = false;
                obtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z14 = z15 && z18;
                    z10 = z17 && z16;
                    z11 = z19 && z22;
                    if (z21) {
                    }
                    z13 = z23;
                    i10 = i12;
                    z12 = z14;
                    i11 = i14;
                } else {
                    z14 = z15 && z16;
                    z10 = z17 && z18;
                    z11 = z19 && z20;
                    if (z21) {
                    }
                    z13 = z23;
                    i10 = i12;
                    z12 = z14;
                    i11 = i14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            z10 = true;
            i10 = 0;
            z11 = true;
            z12 = true;
            z13 = true;
            i11 = 0;
        }
        if (bVar.n() != null && i10 > 0) {
            bVar.F(new RunnableC3011b(bVar.n(), i10));
        }
        if (i11 > 0) {
            b(bVar).o(z12 ? i11 : 0.0f, z10 ? i11 : 0.0f, z11 ? i11 : 0.0f, z13 ? i11 : 0.0f);
        }
        return bVar;
    }
}
