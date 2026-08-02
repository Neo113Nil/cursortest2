package com.vk.core.compose.component.horizontal;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.asp;
import xsna.efj;
import xsna.iy5;
import xsna.k18;
import xsna.pco;
import xsna.pja0;
import xsna.rep;
import xsna.t9g0;
import xsna.vak0;
import xsna.wak0;
import xsna.wep;
import xsna.wzs;
import xsna.yq5;
import xsna.zak0;
import xsna.zrp;

/* compiled from: HorizontalListItem.kt */
/* loaded from: classes17.dex */
public abstract class HorizontalListItem$VisualContent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HorizontalListItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Avatar;
        public static final Type Picture;

        static {
            Type type = new Type("Picture", 0);
            Picture = type;
            Type type2 = new Type("Avatar", 1);
            Avatar = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class a {
        public static yq5 a(efj efjVar, iy5 iy5Var, k18 k18Var, int i, androidx.compose.runtime.a aVar, int i2, int i3) {
            efj efjVar2;
            if ((i3 & 2) != 0) {
                iy5Var = rep.a;
            }
            iy5 iy5Var2 = iy5Var;
            if ((i3 & 4) != 0) {
                k18Var = wep.a;
            }
            k18 k18Var2 = k18Var;
            if ((i3 & 8) != 0) {
                i = 0;
            }
            int i4 = i;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(220491964, i2, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.Avatar.invoke (HorizontalListItem.kt:97)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                efjVar2 = efjVar;
                yq5 yq5Var = new yq5(efjVar2, iy5Var2, k18Var2, i4, false);
                aVar.R(yq5Var);
                x = yq5Var;
            } else {
                efjVar2 = efjVar;
            }
            yq5 yq5Var2 = (yq5) x;
            ((zak0) yq5Var2.a).setValue(efjVar2);
            ((zak0) yq5Var2.b).setValue(iy5Var2);
            ((zak0) yq5Var2.c).setValue(k18Var2);
            ((wak0) yq5Var2.d).C(i4);
            ((zak0) yq5Var2.e).setValue(false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return yq5Var2;
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class b extends HorizontalListItem$VisualContent {
        public static final b a = new b();

        @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
        public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a M = aVar.M(766968781);
            int i2 = i & 1;
            if (M.t(i2, i2 != 0)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(766968781, i, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.Empty.Draw (HorizontalListItem.kt:37)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new wzs(j, i) { // from class: xsna.jev
                    public final /* synthetic */ long c;

                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(1);
                        HorizontalListItem$VisualContent.b.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class c {
        public static pja0 a(efj efjVar, androidx.compose.runtime.a aVar, int i, int i2) {
            rep repVar = rep.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1184333324, i, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.Picture.invoke (HorizontalListItem.kt:61)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new pja0(efjVar, repVar, false);
                aVar.R(x);
            }
            pja0 pja0Var = (pja0) x;
            ((zak0) pja0Var.a).setValue(efjVar);
            ((zak0) pja0Var.b).setValue(repVar);
            ((zak0) pja0Var.c).setValue(false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return pja0Var;
        }
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class d {
    }

    /* compiled from: HorizontalListItem.kt */
    public static final class e {
        public static t9g0 a(efj efjVar, float f, float f2, PictureRadius pictureRadius, iy5 iy5Var, androidx.compose.runtime.a aVar, int i, int i2) {
            efj efjVar2;
            float f3;
            if ((i2 & 4) != 0) {
                f2 = Float.NaN;
            }
            float f4 = f2;
            if ((i2 & 8) != 0) {
                pictureRadius = PictureRadius.Medium;
            }
            PictureRadius pictureRadius2 = pictureRadius;
            if ((i2 & 16) != 0) {
                iy5Var = rep.a;
            }
            iy5 iy5Var2 = iy5Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(332753861, i, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.ResizablePicture.invoke (HorizontalListItem.kt:78)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                efjVar2 = efjVar;
                f3 = f;
                t9g0 t9g0Var = new t9g0(efjVar2, f3, f4, pictureRadius2, iy5Var2);
                aVar.R(t9g0Var);
                x = t9g0Var;
            } else {
                efjVar2 = efjVar;
                f3 = f;
            }
            t9g0 t9g0Var2 = (t9g0) x;
            ((zak0) t9g0Var2.a).setValue(efjVar2);
            ((vak0) t9g0Var2.b).g(f3);
            ((zak0) t9g0Var2.c).setValue(new pco(f4));
            ((zak0) t9g0Var2.d).setValue(pictureRadius2);
            ((zak0) t9g0Var2.e).setValue(iy5Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return t9g0Var2;
        }
    }

    public abstract void a(int i, long j, androidx.compose.runtime.a aVar);
}
