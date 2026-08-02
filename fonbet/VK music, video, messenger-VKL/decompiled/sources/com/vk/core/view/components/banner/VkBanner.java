package com.vk.core.view.components.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import androidx.compose.runtime.k;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.components.image.InteropPicture;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a16;
import xsna.asp;
import xsna.b16;
import xsna.beu0;
import xsna.blk;
import xsna.c16;
import xsna.d16;
import xsna.dko;
import xsna.efj;
import xsna.epx;
import xsna.fko;
import xsna.gko;
import xsna.gzs;
import xsna.i4;
import xsna.iah0;
import xsna.ipi;
import xsna.jai;
import xsna.l5g;
import xsna.lg90;
import xsna.q630;
import xsna.ra0;
import xsna.rlw;
import xsna.rpo0;
import xsna.rte0;
import xsna.s3q0;
import xsna.sdy;
import xsna.sf3;
import xsna.snx;
import xsna.tlo0;
import xsna.tlw;
import xsna.tp8;
import xsna.tq;
import xsna.vua0;
import xsna.wep;
import xsna.wh50;
import xsna.wnx;
import xsna.wzs;
import xsna.xl20;
import xsna.xnx;
import xsna.y7g;
import xsna.yfi0;
import xsna.z06;
import xsna.z190;
import xsna.zak0;
import xsna.zp8;
import xsna.zrp;

/* compiled from: VkBanner.kt */
/* loaded from: classes17.dex */
public class VkBanner extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBanner.kt */
    public static final class BackgroundMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BackgroundMode[] $VALUES;
        public static final BackgroundMode Dark;
        public static final BackgroundMode Light;

        static {
            BackgroundMode backgroundMode = new BackgroundMode("Dark", 0);
            Dark = backgroundMode;
            BackgroundMode backgroundMode2 = new BackgroundMode("Light", 1);
            Light = backgroundMode2;
            BackgroundMode[] backgroundModeArr = {backgroundMode, backgroundMode2};
            $VALUES = backgroundModeArr;
            $ENTRIES = new asp(backgroundModeArr);
        }

        public BackgroundMode() {
            throw null;
        }

        public static BackgroundMode valueOf(String str) {
            return (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
        }

        public static BackgroundMode[] values() {
            return (BackgroundMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkBanner.kt */
    public static abstract class a {

        /* compiled from: VkBanner.kt */
        /* renamed from: com.vk.core.view.components.banner.VkBanner$a$a, reason: collision with other inner class name */
        public static final class C0804a extends a {
            public final gzs<s3q0> a;

            public C0804a() {
                throw null;
            }

            public C0804a(ra0 ra0Var, int i) {
                this.a = (i & 1) != 0 ? null : ra0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0804a) && epx.f(this.a, ((C0804a) obj).a);
            }

            public final int hashCode() {
                gzs<s3q0> gzsVar = this.a;
                return (gzsVar == null ? 0 : gzsVar.hashCode()) * 961;
            }

            public final String toString() {
                return "Chevron(onClick=" + this.a + ", contentDescription=null, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkBanner.kt */
        public static final class b extends a {
            public final gzs<s3q0> a;
            public final tlo0 b;
            public final SemanticsConfiguration c;
            public final C0805a d;

            /* compiled from: VkBanner.kt */
            /* renamed from: com.vk.core.view.components.banner.VkBanner$a$b$a, reason: collision with other inner class name */
            public static final class C0805a {
                public final gko a;
                public final ipi b;

                public C0805a(gko gkoVar, ipi.a.C3070a c3070a) {
                    this.a = gkoVar;
                    this.b = c3070a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0805a)) {
                        return false;
                    }
                    C0805a c0805a = (C0805a) obj;
                    return epx.f(this.a, c0805a.a) && epx.f(this.b, c0805a.b);
                }

                public final int hashCode() {
                    int hashCode = Integer.hashCode(this.a.a) * 31;
                    ipi ipiVar = this.b;
                    return hashCode + (ipiVar == null ? 0 : ipiVar.hashCode());
                }

                public final String toString() {
                    return "Icon(icon=" + this.a + ", iconTint=" + this.b + ')';
                }
            }

            public b() {
                throw null;
            }

            public b(gzs gzsVar, tlo0.f fVar, com.vk.core.compose.component.semantics.a aVar, C0805a c0805a, int i) {
                fVar = (i & 2) != 0 ? null : fVar;
                aVar = (i & 4) != 0 ? null : aVar;
                c0805a = (i & 8) != 0 ? null : c0805a;
                this.a = gzsVar;
                this.b = fVar;
                this.c = aVar;
                this.d = c0805a;
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (!epx.f(this.a, bVar.a) || !epx.f(this.b, bVar.b)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = bVar.c;
                SemanticsConfiguration semanticsConfiguration2 = this.c;
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
                return f && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                gzs<s3q0> gzsVar = this.a;
                int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                tlo0 tlo0Var = this.b;
                int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.c;
                int hashCode3 = (hashCode2 + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode())) * 31;
                C0805a c0805a = this.d;
                return hashCode3 + (c0805a != null ? c0805a.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Dismiss(onClick=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                sb.append(this.b);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.c;
                sb.append((Object) (semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration)));
                sb.append(", icon=");
                sb.append(this.d);
                sb.append(')');
                return sb.toString();
            }
        }
    }

    /* compiled from: VkBanner.kt */
    public interface b {

        /* compiled from: VkBanner.kt */
        public static final class a implements b {
            public final int a;
            public final snx b;
            public final i4 c;

            public a() {
                throw null;
            }

            public a(snx snxVar, i4 i4Var) {
                this.a = iah0.a(48);
                this.b = snxVar;
                this.c = i4Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 961;
                i4 i4Var = this.c;
                return hashCode + (i4Var == null ? 0 : i4Var.hashCode());
            }

            public final String toString() {
                return "Avatar(contentSize=" + this.a + ", avatar=" + this.b + ", semanticsConfiguration=" + ((Object) "null") + ", onClick=" + this.c + ')';
            }
        }

        /* compiled from: VkBanner.kt */
        /* renamed from: com.vk.core.view.components.banner.VkBanner$b$b, reason: collision with other inner class name */
        public static final class C0806b implements b {
            public final dko a;
            public final ipi b;
            public final Size c;

            public C0806b(dko dkoVar, ipi ipiVar, Size size, int i) {
                ipiVar = (i & 2) != 0 ? null : ipiVar;
                size = (i & 4) != 0 ? null : size;
                this.a = dkoVar;
                this.b = ipiVar;
                this.c = size;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0806b)) {
                    return false;
                }
                C0806b c0806b = (C0806b) obj;
                return this.a.equals(c0806b.a) && epx.f(this.b, c0806b.b) && epx.f(this.c, c0806b.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                ipi ipiVar = this.b;
                int hashCode2 = (hashCode + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
                Size size = this.c;
                return (hashCode2 + (size != null ? size.hashCode() : 0)) * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconSize=" + this.c + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkBanner.kt */
        public static final class c implements b {
            public final int a;
            public final InteropPicture b;
            public final SemanticsConfiguration c;

            public c(int i, InteropPicture interopPicture, com.vk.core.compose.component.semantics.a aVar) {
                this.a = i;
                this.b = interopPicture;
                this.c = aVar;
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.a != cVar.a || !epx.f(this.b, cVar.b)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = cVar.c;
                SemanticsConfiguration semanticsConfiguration2 = this.c;
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
                return f;
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
                SemanticsConfiguration semanticsConfiguration = this.c;
                return hashCode + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Picture(contentSize=");
                sb.append(this.a);
                sb.append(", image=");
                sb.append(this.b);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.c;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }
        }
    }

    /* compiled from: VkBanner.kt */
    public static final class c {
        public final tlo0 a;
        public final gzs<s3q0> b;
        public final VkButton.Mode c;
        public final VkButton.Appearance d;
        public final VkButton.Size e;
        public final a f;
        public final SemanticsConfiguration g;

        /* compiled from: VkBanner.kt */
        public static final class a {
            public final gko a;

            public a(gko gkoVar) {
                this.a = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a) * 961;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconSize=null, iconTint=null)";
            }
        }

        public c() {
            throw null;
        }

        public c(tlo0 tlo0Var, gzs gzsVar, VkButton.Mode mode, VkButton.Appearance appearance, VkButton.Size size, a aVar, SemanticsConfiguration semanticsConfiguration, int i) {
            size = (i & 16) != 0 ? VkButton.Size.Medium : size;
            aVar = (i & 32) != 0 ? null : aVar;
            semanticsConfiguration = (i & 512) != 0 ? null : semanticsConfiguration;
            this.a = tlo0Var;
            this.b = gzsVar;
            this.c = mode;
            this.d = appearance;
            this.e = size;
            this.f = aVar;
            this.g = semanticsConfiguration;
        }

        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && epx.f(this.f, cVar.f)) {
                        SemanticsConfiguration semanticsConfiguration = cVar.g;
                        SemanticsConfiguration semanticsConfiguration2 = this.g;
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
            tlo0 tlo0Var = this.a;
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + sf3.a((tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31;
            a aVar = this.f;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 923521;
            SemanticsConfiguration semanticsConfiguration = this.g;
            return hashCode2 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(text=");
            sb.append(this.a);
            sb.append(", onClick=");
            sb.append(this.b);
            sb.append(", buttonMode=");
            sb.append(this.c);
            sb.append(", buttonAppearance=");
            sb.append(this.d);
            sb.append(", buttonSize=");
            sb.append(this.e);
            sb.append(", icon=");
            sb.append(this.f);
            sb.append(", trailingIcon=null, count=null, onClickLabel=null, semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.g;
            return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
        }
    }

    /* compiled from: VkBanner.kt */
    public interface d {
        c16 a();
    }

    /* compiled from: VkBanner.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackgroundMode.values().length];
            try {
                iArr[BackgroundMode.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackgroundMode.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static zp8 B(c cVar, androidx.compose.runtime.a aVar, int i) {
        lg90 a2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(690440835, i, -1, "com.vk.core.view.components.banner.VkBanner.buildMiddleButton (VkBanner.kt:156)");
        }
        zp8 zp8Var = null;
        if (cVar != null) {
            c.a aVar2 = cVar.f;
            aVar.K(324662291);
            String J = blk.J(cVar.a, aVar);
            ButtonSize b2 = tp8.b(cVar.e);
            ButtonStyle c2 = tp8.c(cVar.c);
            ButtonAppearance a3 = tp8.a(cVar.d);
            gzs<s3q0> gzsVar = cVar.b;
            gko gkoVar = aVar2 != null ? aVar2.a : null;
            if (gkoVar == null) {
                aVar.K(324948947);
                aVar.j();
                a2 = null;
            } else {
                aVar.K(2088692206);
                a2 = fko.a(gkoVar, aVar);
                aVar.j();
            }
            aVar.K(325007630);
            aVar.j();
            aVar.K(325070870);
            aVar.j();
            aVar.K(325168179);
            aVar.j();
            aVar.K(325242734);
            aVar.j();
            aVar.K(325321846);
            aVar.j();
            String I = blk.I(null, aVar);
            SemanticsConfiguration semanticsConfiguration = cVar.g;
            zp8Var = d16.a.C2697a.a(c2, a3, b2, J, a2, null, null, null, null, null, I, semanticsConfiguration == null ? null : semanticsConfiguration, gzsVar, aVar, 134250496, 24576, 0);
            aVar.j();
        } else {
            aVar.K(325491354);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zp8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    @Override // xsna.rpo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i, androidx.compose.runtime.a aVar) {
        Banner$BackgroundMode banner$BackgroundMode;
        lg90 lg90Var;
        lg90 lg90Var2;
        l5g l5gVar;
        z06 z06Var;
        lg90 a2;
        l5g l5gVar2;
        z06 a3;
        b before;
        b16 b16Var;
        b16 a4;
        PictureRadius pictureRadius;
        d fixed;
        SemanticsConfiguration semanticsConfiguration;
        androidx.compose.runtime.a aVar2 = aVar;
        aVar2.K(1353160470);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1353160470, 8, -1, "com.vk.core.view.components.banner.VkBanner.ThemedContent (VkBanner.kt:74)");
        }
        SemanticsConfiguration m84getSemanticsConfigurationtn9DF0s = m84getSemanticsConfigurationtn9DF0s();
        c16 c16Var = null;
        if (m84getSemanticsConfigurationtn9DF0s == null) {
            m84getSemanticsConfigurationtn9DF0s = null;
        }
        q630 b2 = com.vk.core.compose.component.semantics.b.b(q630.a.a, m84getSemanticsConfigurationtn9DF0s);
        int i2 = f.$EnumSwitchMapping$0[getBackgroundMode().ordinal()];
        if (i2 == 1) {
            banner$BackgroundMode = Banner$BackgroundMode.Dark;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            banner$BackgroundMode = Banner$BackgroundMode.Light;
        }
        Banner$BackgroundMode banner$BackgroundMode2 = banner$BackgroundMode;
        rlw backgroundImage = getBackgroundImage();
        if (backgroundImage == null) {
            aVar2.K(-559086304);
            aVar2.j();
            lg90Var = null;
        } else {
            aVar2.K(-987866367);
            lg90 a5 = tlw.a(backgroundImage, aVar2, 0);
            aVar2.j();
            lg90Var = a5;
        }
        rlw trailingImage = getTrailingImage();
        if (trailingImage == null) {
            aVar2.K(-559023808);
            aVar2.j();
            lg90Var2 = null;
        } else {
            aVar2.K(-987864351);
            lg90 a6 = tlw.a(trailingImage, aVar2, 0);
            aVar2.j();
            lg90Var2 = a6;
        }
        ipi backgroundColor = getBackgroundColor();
        if (backgroundColor == null) {
            aVar2.K(-558964133);
            aVar2.j();
            l5gVar = null;
        } else {
            aVar2.K(-987862426);
            long a7 = y7g.a(backgroundColor, aVar2);
            aVar2.j();
            l5gVar = new l5g(a7);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-379975220, 8, -1, "com.vk.core.view.components.banner.VkBanner.buildRight (VkBanner.kt:137)");
        }
        a after = getAfter();
        if (after instanceof a.C0804a) {
            aVar2.K(-83962702);
            a3 = z06.a.C4145a.a(((a.C0804a) after).a, blk.I(null, aVar2), null, aVar2, 3072, 0);
            aVar2.j();
        } else {
            if (!(after instanceof a.b)) {
                aVar2.K(1692678001);
                aVar2.j();
                z06Var = null;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(444745636, 8, -1, "com.vk.core.view.components.banner.VkBanner.buildLeft (VkBanner.kt:106)");
                }
                before = getBefore();
                if (!(before instanceof b.a)) {
                    aVar2.K(-556750669);
                    b.a aVar3 = (b.a) before;
                    snx snxVar = aVar3.b;
                    efj c2 = wnx.c(snxVar.a, aVar2);
                    float y = vua0.y(aVar3.a, aVar2);
                    ArrayList a8 = wnx.a(snxVar.b, aVar2);
                    wnx.b(aVar2);
                    z190 d2 = wnx.d(null, aVar2);
                    i4 i4Var = aVar3.c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1927370135, 12582912, -1, "com.vk.core.compose.component.banner.Banner.Before.Avatar.Companion.invoke (Banner.kt:391)");
                    }
                    a4 = sdy.s(c2, a8, y, wep.a, d2, i4Var, null, aVar, 6);
                    aVar2 = aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                } else if (before instanceof b.c) {
                    aVar2.K(-556322373);
                    b.c cVar = (b.c) before;
                    InteropPicture interopPicture = cVar.b;
                    efj c3 = wnx.c(interopPicture.a, aVar2);
                    float y2 = vua0.y(cVar.a, aVar2);
                    ArrayList a9 = wnx.a(interopPicture.b, aVar2);
                    int i3 = xnx.$EnumSwitchMapping$0[interopPicture.d.ordinal()];
                    if (i3 == 1) {
                        pictureRadius = PictureRadius.Small;
                    } else if (i3 == 2) {
                        pictureRadius = PictureRadius.Medium;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pictureRadius = PictureRadius.Large;
                    }
                    z190 d3 = wnx.d(interopPicture.c, aVar2);
                    SemanticsConfiguration semanticsConfiguration2 = cVar.c;
                    if (semanticsConfiguration2 == null) {
                        semanticsConfiguration2 = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1634104725, 12582912, -1, "com.vk.core.compose.component.banner.Banner.Before.Picture.Companion.invoke (Banner.kt:433)");
                    }
                    a4 = rte0.x(c3, a9, y2, d3, pictureRadius, semanticsConfiguration2, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                } else {
                    if (!(before instanceof b.C0806b)) {
                        aVar2.K(-555677543);
                        aVar2.j();
                        b16Var = null;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2133297873, 72, -1, "com.vk.core.view.components.banner.VkBanner.buildMiddle (VkBanner.kt:93)");
                        }
                        e middle = getMiddle();
                        String I = blk.I(middle != null ? middle.a : null, aVar2);
                        e middle2 = getMiddle();
                        String I2 = blk.I(middle2 != null ? middle2.b : null, aVar2);
                        e middle3 = getMiddle();
                        d16.c a10 = com.vk.core.view.components.banner.a.a(middle3 != null ? middle3.c : null, aVar2);
                        e middle4 = getMiddle();
                        SemanticsConfiguration semanticsConfiguration3 = (middle4 != null || (semanticsConfiguration = middle4.h) == null) ? null : semanticsConfiguration;
                        e middle5 = getMiddle();
                        zp8 B = B(middle5 != null ? middle5.d : null, aVar2, 64);
                        e middle6 = getMiddle();
                        zp8 B2 = B(middle6 != null ? middle6.e : null, aVar2, 64);
                        e middle7 = getMiddle();
                        zp8 B3 = B(middle7 != null ? middle7.f : null, aVar2, 64);
                        e middle8 = getMiddle();
                        wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = middle8 != null ? middle8.g : null;
                        androidx.compose.runtime.a aVar4 = aVar2;
                        xl20 a11 = d16.b.a(I, I2, a10, B, B2, B3, wzsVar, semanticsConfiguration3, aVar4, 100663296, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        fixed = getFixed();
                        if (fixed == null) {
                            aVar4.K(-558816480);
                        } else {
                            aVar4.K(-987857663);
                            c16Var = fixed.a();
                        }
                        aVar4.j();
                        beu0.a(a11, b2, lg90Var, lg90Var2, l5gVar, banner$BackgroundMode2, null, b16Var, z06Var, null, c16Var, getOnClick(), aVar, 4608, 0, 576);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar.j();
                    }
                    aVar2.K(-2096143270);
                    b.C0806b c0806b = (b.C0806b) before;
                    a4 = a16.a(fko.a(c0806b.a, aVar2), y7g.a(c0806b.b, aVar2), vua0.F(c0806b.c, aVar2), null, aVar2, 0);
                    aVar2.j();
                }
                b16Var = a4;
                if (androidx.compose.runtime.b.d()) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                e middle9 = getMiddle();
                String I3 = blk.I(middle9 != null ? middle9.a : null, aVar2);
                e middle22 = getMiddle();
                String I22 = blk.I(middle22 != null ? middle22.b : null, aVar2);
                e middle32 = getMiddle();
                d16.c a102 = com.vk.core.view.components.banner.a.a(middle32 != null ? middle32.c : null, aVar2);
                e middle42 = getMiddle();
                if (middle42 != null) {
                }
                e middle52 = getMiddle();
                zp8 B4 = B(middle52 != null ? middle52.d : null, aVar2, 64);
                e middle62 = getMiddle();
                zp8 B22 = B(middle62 != null ? middle62.e : null, aVar2, 64);
                e middle72 = getMiddle();
                zp8 B32 = B(middle72 != null ? middle72.f : null, aVar2, 64);
                e middle82 = getMiddle();
                wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar2 = middle82 != null ? middle82.g : null;
                androidx.compose.runtime.a aVar42 = aVar2;
                xl20 a112 = d16.b.a(I3, I22, a102, B4, B22, B32, wzsVar2, semanticsConfiguration3, aVar42, 100663296, 0);
                if (androidx.compose.runtime.b.d()) {
                }
                fixed = getFixed();
                if (fixed == null) {
                }
                aVar42.j();
                beu0.a(a112, b2, lg90Var, lg90Var2, l5gVar, banner$BackgroundMode2, null, b16Var, z06Var, null, c16Var, getOnClick(), aVar, 4608, 0, 576);
                if (androidx.compose.runtime.b.d()) {
                }
                aVar.j();
            }
            aVar2.K(-83955068);
            a.b bVar = (a.b) after;
            gzs<s3q0> gzsVar = bVar.a;
            a.b.C0805a c0805a = bVar.d;
            String I4 = blk.I(bVar.b, aVar2);
            SemanticsConfiguration semanticsConfiguration4 = bVar.c;
            if (semanticsConfiguration4 == null) {
                semanticsConfiguration4 = null;
            }
            gko gkoVar = c0805a != null ? c0805a.a : null;
            if (gkoVar == null) {
                aVar2.K(1692576042);
                aVar2.j();
                a2 = null;
            } else {
                aVar2.K(-83948105);
                a2 = fko.a(gkoVar, aVar2);
                aVar2.j();
            }
            ipi ipiVar = c0805a != null ? c0805a.b : null;
            if (ipiVar == null) {
                aVar2.K(1692633733);
                aVar2.j();
                l5gVar2 = null;
            } else {
                aVar2.K(-83946244);
                long a12 = y7g.a(ipiVar, aVar2);
                aVar2.j();
                l5gVar2 = new l5g(a12);
            }
            a3 = z06.b.a.a(gzsVar, I4, semanticsConfiguration4, a2, l5gVar2, null, aVar2, 1576960, 32);
            aVar2.j();
        }
        z06Var = a3;
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        before = getBefore();
        if (!(before instanceof b.a)) {
        }
        b16Var = a4;
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        e middle92 = getMiddle();
        String I32 = blk.I(middle92 != null ? middle92.a : null, aVar2);
        e middle222 = getMiddle();
        String I222 = blk.I(middle222 != null ? middle222.b : null, aVar2);
        e middle322 = getMiddle();
        d16.c a1022 = com.vk.core.view.components.banner.a.a(middle322 != null ? middle322.c : null, aVar2);
        e middle422 = getMiddle();
        if (middle422 != null) {
        }
        e middle522 = getMiddle();
        zp8 B42 = B(middle522 != null ? middle522.d : null, aVar2, 64);
        e middle622 = getMiddle();
        zp8 B222 = B(middle622 != null ? middle622.e : null, aVar2, 64);
        e middle722 = getMiddle();
        zp8 B322 = B(middle722 != null ? middle722.f : null, aVar2, 64);
        e middle822 = getMiddle();
        wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar22 = middle822 != null ? middle822.g : null;
        androidx.compose.runtime.a aVar422 = aVar2;
        xl20 a1122 = d16.b.a(I32, I222, a1022, B42, B222, B322, wzsVar22, semanticsConfiguration3, aVar422, 100663296, 0);
        if (androidx.compose.runtime.b.d()) {
        }
        fixed = getFixed();
        if (fixed == null) {
        }
        aVar422.j();
        beu0.a(a1122, b2, lg90Var, lg90Var2, l5gVar, banner$BackgroundMode2, null, b16Var, z06Var, null, c16Var, getOnClick(), aVar, 4608, 0, 576);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar.j();
    }

    public final a getAfter() {
        return (a) ((zak0) this.o).getValue();
    }

    public final ipi getBackgroundColor() {
        return (ipi) ((zak0) this.s).getValue();
    }

    public final rlw getBackgroundImage() {
        return (rlw) ((zak0) this.r).getValue();
    }

    public final BackgroundMode getBackgroundMode() {
        return (BackgroundMode) ((zak0) this.m).getValue();
    }

    public final b getBefore() {
        return (b) ((zak0) this.n).getValue();
    }

    public final d getFixed() {
        return (d) ((zak0) this.q).getValue();
    }

    public final e getMiddle() {
        return (e) ((zak0) this.p).getValue();
    }

    public final gzs<s3q0> getOnClick() {
        return (gzs) ((zak0) this.u).getValue();
    }

    /* renamed from: getSemanticsConfiguration-tn9DF0s, reason: not valid java name */
    public final SemanticsConfiguration m84getSemanticsConfigurationtn9DF0s() {
        yfi0 yfi0Var = (yfi0) ((zak0) this.v).getValue();
        if (yfi0Var != null) {
            return yfi0Var.a;
        }
        return null;
    }

    public final rlw getTrailingImage() {
        return (rlw) ((zak0) this.t).getValue();
    }

    public final void setAfter(a aVar) {
        ((zak0) this.o).setValue(aVar);
    }

    public final void setBackgroundColor(ipi ipiVar) {
        ((zak0) this.s).setValue(ipiVar);
    }

    public final void setBackgroundImage(rlw rlwVar) {
        ((zak0) this.r).setValue(rlwVar);
    }

    public final void setBackgroundMode(BackgroundMode backgroundMode) {
        ((zak0) this.m).setValue(backgroundMode);
    }

    public final void setBefore(b bVar) {
        ((zak0) this.n).setValue(bVar);
    }

    public final void setFixed(d dVar) {
        ((zak0) this.q).setValue(dVar);
    }

    public final void setMiddle(e eVar) {
        ((zak0) this.p).setValue(eVar);
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        ((zak0) this.u).setValue(gzsVar);
    }

    /* renamed from: setSemanticsConfiguration-lkKuBUQ, reason: not valid java name */
    public final void m85setSemanticsConfigurationlkKuBUQ(SemanticsConfiguration semanticsConfiguration) {
        ((zak0) this.v).setValue(semanticsConfiguration != null ? new yfi0(semanticsConfiguration) : null);
    }

    public final void setTrailingImage(rlw rlwVar) {
        ((zak0) this.t).setValue(rlwVar);
    }

    public VkBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.m = k.b(BackgroundMode.Light);
        this.n = k.b(null);
        this.o = k.b(null);
        this.p = k.b(null);
        this.q = k.b(null);
        this.r = k.b(null);
        this.s = k.b(null);
        this.t = k.b(null);
        this.u = k.b(null);
        this.v = k.b(null);
    }

    /* compiled from: VkBanner.kt */
    public static final class e {
        public final tlo0 a;
        public final tlo0 b;
        public final a c;
        public final c d;
        public final c e;
        public final c f;
        public final wzs<androidx.compose.runtime.a, Integer, s3q0> g;
        public final SemanticsConfiguration h;

        /* compiled from: VkBanner.kt */
        public interface a {

            /* compiled from: VkBanner.kt */
            /* renamed from: com.vk.core.view.components.banner.VkBanner$e$a$a, reason: collision with other inner class name */
            public static final class C0807a implements a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0807a)) {
                        return false;
                    }
                    ((C0807a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Expandable(text=null, isExpanded=false, onExpand=null, expandButtonText=null, maxCollapsedLines=0, collapseButtonText=null, showCollapseButton=false, onCollapse=null, expandButtonColor=null, collapseButtonColor=null, semanticsConfiguration=" + ((Object) "null") + ')';
                }
            }

            /* compiled from: VkBanner.kt */
            public static final class b implements a {
                public final tlo0 a;

                public b(tlo0 tlo0Var) {
                    this.a = tlo0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a.equals(((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode() * 31;
                }

                public final String toString() {
                    return "Plain(text=" + this.a + ", semanticsConfiguration=" + ((Object) "null") + ')';
                }
            }
        }

        public e() {
            throw null;
        }

        public e(tlo0 tlo0Var, tlo0 tlo0Var2, a aVar, c cVar, c cVar2, c cVar3, jai jaiVar, SemanticsConfiguration semanticsConfiguration) {
            this.a = tlo0Var;
            this.b = tlo0Var2;
            this.c = aVar;
            this.d = cVar;
            this.e = cVar2;
            this.f = cVar3;
            this.g = jaiVar;
            this.h = semanticsConfiguration;
        }

        public final boolean equals(Object obj) {
            boolean f;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!epx.f(this.a, eVar.a) || !epx.f(this.b, eVar.b) || !epx.f(this.c, eVar.c) || !epx.f(this.d, eVar.d) || !epx.f(this.e, eVar.e) || !epx.f(this.f, eVar.f) || !epx.f(this.g, eVar.g)) {
                return false;
            }
            SemanticsConfiguration semanticsConfiguration = eVar.h;
            SemanticsConfiguration semanticsConfiguration2 = this.h;
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
            return f;
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
            tlo0 tlo0Var2 = this.b;
            int hashCode2 = (hashCode + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
            a aVar = this.c;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            c cVar = this.d;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c cVar2 = this.e;
            int hashCode5 = (hashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            c cVar3 = this.f;
            int hashCode6 = (hashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.g;
            int hashCode7 = (hashCode6 + (wzsVar == null ? 0 : wzsVar.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration = this.h;
            return hashCode7 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Middle(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", button=");
            sb.append(this.d);
            sb.append(", secondButton=");
            sb.append(this.e);
            sb.append(", thirdButton=");
            sb.append(this.f);
            sb.append(", topContent=");
            sb.append(this.g);
            sb.append(", semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.h;
            return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
        }

        public e(tlo0 tlo0Var, tlo0 tlo0Var2, a.b bVar, c cVar, c cVar2, com.vk.core.compose.component.semantics.a aVar, int i) {
            this((i & 1) != 0 ? null : tlo0Var, (i & 2) != 0 ? null : tlo0Var2, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : cVar2, null, null, (i & 64) != 0 ? null : aVar);
        }
    }
}
