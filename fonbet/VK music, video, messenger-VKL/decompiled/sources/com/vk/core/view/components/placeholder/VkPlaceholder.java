package com.vk.core.view.components.placeholder;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import androidx.compose.runtime.k;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.button.VkButton;
import xsna.ad0;
import xsna.b8g;
import xsna.blk;
import xsna.bsa0;
import xsna.csa0;
import xsna.d6g;
import xsna.enr;
import xsna.epx;
import xsna.fko;
import xsna.gko;
import xsna.gzs;
import xsna.ipi;
import xsna.l52;
import xsna.l5g;
import xsna.ldv0;
import xsna.lg90;
import xsna.ozl;
import xsna.q630;
import xsna.qoy;
import xsna.r48;
import xsna.rlw;
import xsna.rpo0;
import xsna.s3q0;
import xsna.sf3;
import xsna.tlo0;
import xsna.tlw;
import xsna.tp8;
import xsna.tq;
import xsna.vl20;
import xsna.vua0;
import xsna.wh50;
import xsna.wkj;
import xsna.wng0;
import xsna.wra0;
import xsna.y48;
import xsna.y7g;
import xsna.yfi0;
import xsna.zak0;
import xsna.zra0;

/* compiled from: VkPlaceholder.kt */
@ozl
/* loaded from: classes17.dex */
public class VkPlaceholder extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;

    /* compiled from: VkPlaceholder.kt */
    public static final class a {
        public final C0854a a;
        public final C0854a b;
        public final C0854a c;

        /* compiled from: VkPlaceholder.kt */
        /* renamed from: com.vk.core.view.components.placeholder.VkPlaceholder$a$a, reason: collision with other inner class name */
        public static final class C0854a {
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final C0855a c;
            public final C0855a d;
            public final VkButton.Size e;
            public final VkButton.Mode f;
            public final VkButton.Appearance g;
            public final boolean h;
            public final SemanticsConfiguration i;

            /* compiled from: VkPlaceholder.kt */
            /* renamed from: com.vk.core.view.components.placeholder.VkPlaceholder$a$a$a, reason: collision with other inner class name */
            public static final class C0855a {
                public final gko a;
                public final b8g b;

                public C0855a(gko gkoVar, b8g b8gVar) {
                    this.a = gkoVar;
                    this.b = b8gVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0855a)) {
                        return false;
                    }
                    C0855a c0855a = (C0855a) obj;
                    return this.a.equals(c0855a.a) && this.b.equals(c0855a.b);
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 961);
                }

                public final String toString() {
                    return "Icon(icon=" + this.a + ", iconSize=null, iconTint=" + this.b + ')';
                }
            }

            public C0854a() {
                throw null;
            }

            public C0854a(tlo0 tlo0Var, gzs gzsVar, C0855a c0855a, C0855a c0855a2, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, com.vk.core.compose.component.semantics.a aVar, int i) {
                c0855a = (i & 4) != 0 ? null : c0855a;
                c0855a2 = (i & 8) != 0 ? null : c0855a2;
                size = (i & 64) != 0 ? VkButton.Size.Medium : size;
                mode = (i & 128) != 0 ? VkButton.Mode.Primary : mode;
                appearance = (i & 256) != 0 ? VkButton.Appearance.Accent : appearance;
                z = (i & 512) != 0 ? false : z;
                aVar = (i & 1024) != 0 ? null : aVar;
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = c0855a;
                this.d = c0855a2;
                this.e = size;
                this.f = mode;
                this.g = appearance;
                this.h = z;
                this.i = aVar;
            }

            public final boolean equals(Object obj) {
                boolean equals;
                if (this != obj) {
                    if (obj instanceof C0854a) {
                        C0854a c0854a = (C0854a) obj;
                        if (epx.f(this.a, c0854a.a) && epx.f(this.b, c0854a.b) && epx.f(this.c, c0854a.c) && epx.f(this.d, c0854a.d) && this.e == c0854a.e && this.f == c0854a.f && this.g == c0854a.g && this.h == c0854a.h) {
                            SemanticsConfiguration semanticsConfiguration = c0854a.i;
                            SemanticsConfiguration semanticsConfiguration2 = this.i;
                            if (semanticsConfiguration2 == null) {
                                if (semanticsConfiguration == null) {
                                    equals = true;
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            } else {
                                if (semanticsConfiguration != null) {
                                    equals = semanticsConfiguration2.equals(semanticsConfiguration);
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int a = sf3.a(this.a.hashCode() * 31, 31, this.b);
                C0855a c0855a = this.c;
                int hashCode = (a + (c0855a == null ? 0 : c0855a.hashCode())) * 31;
                C0855a c0855a2 = this.d;
                int b = qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (c0855a2 == null ? 0 : c0855a2.hashCode())) * 29791)) * 31)) * 31)) * 31, 31, this.h);
                SemanticsConfiguration semanticsConfiguration = this.i;
                return b + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(text=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", icon=");
                sb.append(this.c);
                sb.append(", trailingIcon=");
                sb.append(this.d);
                sb.append(", count=null, onClickLabel=null, buttonSize=");
                sb.append(this.e);
                sb.append(", buttonMode=");
                sb.append(this.f);
                sb.append(", buttonAppearance=");
                sb.append(this.g);
                sb.append(", stretched=");
                sb.append(this.h);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.i;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }
        }

        public /* synthetic */ a(C0854a c0854a, C0854a c0854a2, int i) {
            this(c0854a, (i & 2) != 0 ? null : c0854a2, (C0854a) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C0854a c0854a = this.b;
            int hashCode2 = (hashCode + (c0854a == null ? 0 : c0854a.hashCode())) * 31;
            C0854a c0854a2 = this.c;
            return hashCode2 + (c0854a2 != null ? c0854a2.hashCode() : 0);
        }

        public final String toString() {
            return "Bottom(firstButton=" + this.a + ", secondButton=" + this.b + ", thirdButton=" + this.c + ')';
        }

        public a(C0854a c0854a, C0854a c0854a2, C0854a c0854a3) {
            this.a = c0854a;
            this.b = c0854a2;
            this.c = c0854a3;
        }
    }

    /* compiled from: VkPlaceholder.kt */
    public interface c {

        /* compiled from: VkPlaceholder.kt */
        public static final class a implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "Avatar(contentSize=0, avatar=null, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class b implements c {
            public final gko a;
            public final ipi b;
            public final tlo0 c;

            public b(gko gkoVar, ipi ipiVar, tlo0.f fVar, int i) {
                ipiVar = (i & 2) != 0 ? null : ipiVar;
                fVar = (i & 8) != 0 ? null : fVar;
                this.a = gkoVar;
                this.b = ipiVar;
                this.c = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                ipi ipiVar = this.b;
                int hashCode2 = (hashCode + (ipiVar == null ? 0 : ipiVar.hashCode())) * 961;
                tlo0 tlo0Var = this.c;
                return (hashCode2 + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconSize=null, iconDescription=" + this.c + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkPlaceholder.kt */
        /* renamed from: com.vk.core.view.components.placeholder.VkPlaceholder$c$c, reason: collision with other inner class name */
        public static final class C0856c implements c {
            public final rlw a;
            public final Size b;
            public final ColorFilter c;
            public final Drawable d;
            public final wkj e;
            public final SemanticsConfiguration f;

            public C0856c(rlw rlwVar, Size size, PorterDuffColorFilter porterDuffColorFilter, wng0 wng0Var, com.vk.core.compose.component.semantics.a aVar, int i) {
                size = (i & 2) != 0 ? null : size;
                porterDuffColorFilter = (i & 4) != 0 ? null : porterDuffColorFilter;
                wng0Var = (i & 8) != 0 ? null : wng0Var;
                enr enrVar = (i & 32) != 0 ? null : wkj.a.f;
                aVar = (i & 64) != 0 ? null : aVar;
                this.a = rlwVar;
                this.b = size;
                this.c = porterDuffColorFilter;
                this.d = wng0Var;
                this.e = enrVar;
                this.f = aVar;
            }

            public final boolean equals(Object obj) {
                boolean equals;
                if (this != obj) {
                    if (obj instanceof C0856c) {
                        C0856c c0856c = (C0856c) obj;
                        if (this.a.equals(c0856c.a) && epx.f(this.b, c0856c.b) && epx.f(this.c, c0856c.c) && epx.f(this.d, c0856c.d) && epx.f(this.e, c0856c.e)) {
                            SemanticsConfiguration semanticsConfiguration = c0856c.f;
                            SemanticsConfiguration semanticsConfiguration2 = this.f;
                            if (semanticsConfiguration2 == null) {
                                if (semanticsConfiguration == null) {
                                    equals = true;
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            } else {
                                if (semanticsConfiguration != null) {
                                    equals = semanticsConfiguration2.equals(semanticsConfiguration);
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Size size = this.b;
                int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
                ColorFilter colorFilter = this.c;
                int hashCode3 = (hashCode2 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31;
                Drawable drawable = this.d;
                int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 961;
                wkj wkjVar = this.e;
                int hashCode5 = (hashCode4 + (wkjVar == null ? 0 : wkjVar.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.f;
                return hashCode5 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(image=");
                sb.append(this.a);
                sb.append(", imageSize=");
                sb.append(this.b);
                sb.append(", colorFilter=");
                sb.append(this.c);
                sb.append(", background=");
                sb.append(this.d);
                sb.append(", imageDescription=null, contentScale=");
                sb.append(this.e);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.f;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class d implements c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "Picture(contentSize=0, image=null, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }
    }

    public VkPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static r48 B(a.C0854a c0854a, androidx.compose.runtime.a aVar, int i) {
        lg90 a2;
        l5g l5gVar;
        lg90 a3;
        l5g l5gVar2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1006941017, i, -1, "com.vk.core.view.components.placeholder.VkPlaceholder.buildButton (VkPlaceholder.kt:162)");
        }
        tlo0 tlo0Var = c0854a.a;
        a.C0854a.C0855a c0855a = c0854a.d;
        a.C0854a.C0855a c0855a2 = c0854a.c;
        String J = blk.J(tlo0Var, aVar);
        ButtonSize b2 = tp8.b(c0854a.e);
        ButtonStyle c2 = tp8.c(c0854a.f);
        ButtonAppearance a4 = tp8.a(c0854a.g);
        gko gkoVar = c0855a2 != null ? c0855a2.a : null;
        if (gkoVar == null) {
            aVar.K(1728589725);
            aVar.j();
            a2 = null;
        } else {
            aVar.K(1302686948);
            a2 = fko.a(gkoVar, aVar);
            aVar.j();
        }
        b8g b8gVar = c0855a2 != null ? c0855a2.b : null;
        if (b8gVar == null) {
            aVar.K(1728646424);
            aVar.j();
            l5gVar = null;
        } else {
            aVar.K(1302688777);
            long a5 = y7g.a(b8gVar, aVar);
            aVar.j();
            l5gVar = new l5g(a5);
        }
        aVar.K(1728707680);
        aVar.j();
        gko gkoVar2 = c0855a != null ? c0855a.a : null;
        if (gkoVar2 == null) {
            aVar.K(1728801021);
            aVar.j();
            a3 = null;
        } else {
            aVar.K(1302693764);
            a3 = fko.a(gkoVar2, aVar);
            aVar.j();
        }
        b8g b8gVar2 = c0855a != null ? c0855a.b : null;
        if (b8gVar2 == null) {
            aVar.K(1728873592);
            aVar.j();
            l5gVar2 = null;
        } else {
            aVar.K(1302696105);
            long a6 = y7g.a(b8gVar2, aVar);
            aVar.j();
            l5gVar2 = new l5g(a6);
        }
        aVar.K(1728950720);
        aVar.j();
        String I = blk.I(null, aVar);
        boolean z = c0854a.h;
        gzs<s3q0> gzsVar = c0854a.b;
        SemanticsConfiguration semanticsConfiguration = c0854a.i;
        r48 a7 = wra0.a.C3954a.a(J, gzsVar, b2, c2, a4, false, a2, l5gVar, null, a3, l5gVar2, null, z, false, I, semanticsConfiguration == null ? null : semanticsConfiguration, aVar, 2097152, 12582920, 16416);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a7;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    @Override // xsna.rpo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i, androidx.compose.runtime.a aVar) {
        bsa0 bsa0Var;
        bsa0 s;
        b middle;
        vl20 vl20Var;
        a bottom;
        r48 r48Var;
        androidx.compose.runtime.a aVar2 = aVar;
        aVar2.K(-1328938533);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1328938533, 8, -1, "com.vk.core.view.components.placeholder.VkPlaceholder.ThemedContent (VkPlaceholder.kt:77)");
        }
        q630 modifier = getModifier();
        if (modifier == null) {
            modifier = q630.a.a;
        }
        SemanticsConfiguration m88getSemanticsConfigurationtn9DF0s = m88getSemanticsConfigurationtn9DF0s();
        y48 y48Var = null;
        r48 r48Var2 = null;
        if (m88getSemanticsConfigurationtn9DF0s == null) {
            m88getSemanticsConfigurationtn9DF0s = null;
        }
        q630 b2 = com.vk.core.compose.component.semantics.b.b(modifier, m88getSemanticsConfigurationtn9DF0s);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(434546949, 8, -1, "com.vk.core.view.components.placeholder.VkPlaceholder.buildTop (VkPlaceholder.kt:122)");
        }
        c top = getTop();
        if (top instanceof c.a) {
            aVar2.K(556837846);
            ((c.a) top).getClass();
            throw null;
        }
        if (top instanceof c.d) {
            aVar2.K(557201848);
            ((c.d) top).getClass();
            throw null;
        }
        if (top instanceof c.b) {
            aVar2.K(987817141);
            c.b bVar = (c.b) top;
            s = csa0.a(fko.a(bVar.a, aVar2), y7g.a(bVar.b, aVar2), vua0.F(null, aVar2), blk.I(bVar.c, aVar2), null, aVar2, 196616, 0);
            aVar2.j();
        } else {
            if (!(top instanceof c.C0856c)) {
                aVar2.K(558314840);
                aVar2.j();
                bsa0Var = null;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1596987855, 8, -1, "com.vk.core.view.components.placeholder.VkPlaceholder.buildMiddle (VkPlaceholder.kt:108)");
                }
                middle = getMiddle();
                if (middle == null) {
                    aVar2.K(-512346599);
                    String I = blk.I(middle.a, aVar2);
                    SemanticsConfiguration semanticsConfiguration = middle.b;
                    if (semanticsConfiguration == null) {
                        semanticsConfiguration = null;
                    }
                    String I2 = blk.I(middle.c, aVar2);
                    SemanticsConfiguration semanticsConfiguration2 = middle.d;
                    if (semanticsConfiguration2 == null) {
                        semanticsConfiguration2 = null;
                    }
                    vl20 a2 = zra0.a.a(I, semanticsConfiguration, I2, semanticsConfiguration2, aVar2, 196608, 8);
                    aVar2.j();
                    vl20Var = a2;
                } else {
                    aVar2.K(-511998036);
                    aVar2.j();
                    vl20Var = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(186161741, 72, -1, "com.vk.core.view.components.placeholder.VkPlaceholder.buildBottom (VkPlaceholder.kt:91)");
                }
                bottom = getBottom();
                if (bottom == null) {
                    aVar2.K(-1487189032);
                    r48 B = B(bottom.a, aVar2, 64);
                    a.C0854a c0854a = bottom.b;
                    if (c0854a != null) {
                        aVar2.K(-1487183610);
                        r48Var = B(c0854a, aVar2, 64);
                        aVar2.j();
                    } else {
                        aVar2.K(1142001264);
                        aVar2.j();
                        r48Var = null;
                    }
                    a.C0854a c0854a2 = bottom.c;
                    if (c0854a2 != null) {
                        aVar2.K(-1487177627);
                        r48Var2 = B(c0854a2, aVar2, 64);
                        aVar2.j();
                    } else {
                        aVar2.K(1142185776);
                        aVar2.j();
                    }
                    y48Var = wra0.b.a(B, r48Var, r48Var2, aVar2, 8);
                    aVar2.j();
                } else {
                    aVar2.K(1142243312);
                    aVar2.j();
                }
                y48 y48Var2 = y48Var;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ldv0.d(b2, bsa0Var, vl20Var, y48Var2, getMode(), getSize(), getWithPaddings(), aVar2, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            }
            aVar2.K(557902851);
            c.C0856c c0856c = (c.C0856c) top;
            lg90 a3 = tlw.a(c0856c.a, aVar2, 0);
            Drawable drawable = c0856c.d;
            ColorFilter colorFilter = c0856c.c;
            d6g a4 = colorFilter != null ? l52.a(colorFilter) : null;
            long F = vua0.F(c0856c.b, aVar2);
            String I3 = blk.I(null, aVar2);
            wkj wkjVar = c0856c.e;
            SemanticsConfiguration semanticsConfiguration3 = c0856c.f;
            if (semanticsConfiguration3 == null) {
                semanticsConfiguration3 = null;
            }
            s = ad0.s(a3, F, drawable, a4, I3, wkjVar, semanticsConfiguration3, aVar2, 0);
            aVar2 = aVar2;
            aVar2.j();
        }
        bsa0Var = s;
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        middle = getMiddle();
        if (middle == null) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        bottom = getBottom();
        if (bottom == null) {
        }
        y48 y48Var22 = y48Var;
        if (androidx.compose.runtime.b.d()) {
        }
        ldv0.d(b2, bsa0Var, vl20Var, y48Var22, getMode(), getSize(), getWithPaddings(), aVar2, 0, 0);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar2.j();
    }

    @Override // android.view.View
    public final a getBottom() {
        return (a) ((zak0) this.p).getValue();
    }

    public final b getMiddle() {
        return (b) ((zak0) this.o).getValue();
    }

    public final PlaceholderMode getMode() {
        return (PlaceholderMode) ((zak0) this.s).getValue();
    }

    public final q630 getModifier() {
        return (q630) ((zak0) this.m).getValue();
    }

    /* renamed from: getSemanticsConfiguration-tn9DF0s, reason: not valid java name */
    public final SemanticsConfiguration m88getSemanticsConfigurationtn9DF0s() {
        yfi0 yfi0Var = (yfi0) ((zak0) this.q).getValue();
        if (yfi0Var != null) {
            return yfi0Var.a;
        }
        return null;
    }

    public final PlaceholderSize getSize() {
        return (PlaceholderSize) ((zak0) this.t).getValue();
    }

    @Override // android.view.View
    public final c getTop() {
        return (c) ((zak0) this.n).getValue();
    }

    public final boolean getWithPaddings() {
        return ((Boolean) ((zak0) this.r).getValue()).booleanValue();
    }

    public final void setBottom(a aVar) {
        ((zak0) this.p).setValue(aVar);
    }

    public final void setMiddle(b bVar) {
        ((zak0) this.o).setValue(bVar);
    }

    public final void setMode(PlaceholderMode placeholderMode) {
        ((zak0) this.s).setValue(placeholderMode);
    }

    public final void setModifier(q630 q630Var) {
        ((zak0) this.m).setValue(q630Var);
    }

    /* renamed from: setSemanticsConfiguration-lkKuBUQ, reason: not valid java name */
    public final void m89setSemanticsConfigurationlkKuBUQ(SemanticsConfiguration semanticsConfiguration) {
        ((zak0) this.q).setValue(semanticsConfiguration != null ? new yfi0(semanticsConfiguration) : null);
    }

    public final void setSize(PlaceholderSize placeholderSize) {
        ((zak0) this.t).setValue(placeholderSize);
    }

    public final void setTop(c cVar) {
        ((zak0) this.n).setValue(cVar);
    }

    public final void setWithPaddings(boolean z) {
        ((zak0) this.r).setValue(Boolean.valueOf(z));
    }

    public VkPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = k.b(null);
        this.n = k.b(null);
        this.o = k.b(null);
        this.p = k.b(null);
        this.q = k.b(null);
        this.r = k.b(Boolean.TRUE);
        this.s = k.b(PlaceholderMode.Primary);
        this.t = k.b(PlaceholderSize.Large);
    }

    /* compiled from: VkPlaceholder.kt */
    public static final class b {
        public final tlo0 a;
        public final SemanticsConfiguration b;
        public final tlo0 c;
        public final SemanticsConfiguration d;

        public b(tlo0 tlo0Var, SemanticsConfiguration semanticsConfiguration, tlo0 tlo0Var2, SemanticsConfiguration semanticsConfiguration2) {
            this.a = tlo0Var;
            this.b = semanticsConfiguration;
            this.c = tlo0Var2;
            this.d = semanticsConfiguration2;
        }

        public final boolean equals(Object obj) {
            boolean f;
            boolean f2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!epx.f(this.a, bVar.a)) {
                return false;
            }
            SemanticsConfiguration semanticsConfiguration = bVar.b;
            SemanticsConfiguration semanticsConfiguration2 = this.b;
            if (semanticsConfiguration2 == null) {
                if (semanticsConfiguration == null) {
                    f = true;
                }
                f = false;
            } else {
                if (semanticsConfiguration != null) {
                    f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                }
                f = false;
            }
            if (!f || !epx.f(this.c, bVar.c)) {
                return false;
            }
            SemanticsConfiguration semanticsConfiguration3 = bVar.d;
            SemanticsConfiguration semanticsConfiguration4 = this.d;
            if (semanticsConfiguration4 == null) {
                if (semanticsConfiguration3 == null) {
                    f2 = true;
                }
                f2 = false;
            } else {
                if (semanticsConfiguration3 != null) {
                    f2 = epx.f(semanticsConfiguration4, semanticsConfiguration3);
                }
                f2 = false;
            }
            return f2;
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
            SemanticsConfiguration semanticsConfiguration = this.b;
            int hashCode2 = (hashCode + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode())) * 31;
            tlo0 tlo0Var2 = this.c;
            int hashCode3 = (hashCode2 + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration2 = this.d;
            return hashCode3 + (semanticsConfiguration2 != null ? semanticsConfiguration2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Middle(title=");
            sb.append(this.a);
            sb.append(", titleSemanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.b;
            sb.append((Object) (semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration)));
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", descriptionSemanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration2 = this.d;
            return tq.f(sb, semanticsConfiguration2 != null ? yfi0.a(semanticsConfiguration2) : "null", ')');
        }

        public /* synthetic */ b(tlo0 tlo0Var, tlo0 tlo0Var2, com.vk.core.compose.component.semantics.a aVar, int i) {
            this((i & 1) != 0 ? null : tlo0Var, (SemanticsConfiguration) null, tlo0Var2, (i & 8) != 0 ? null : aVar);
        }
    }
}
