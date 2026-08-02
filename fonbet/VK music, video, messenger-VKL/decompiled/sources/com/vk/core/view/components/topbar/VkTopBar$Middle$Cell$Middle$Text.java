package com.vk.core.view.components.topbar;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.asp;
import xsna.epx;
import xsna.gzs;
import xsna.oq;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.yfi0;
import xsna.zrp;

/* compiled from: VkTopBar.kt */
/* loaded from: classes17.dex */
public final class VkTopBar$Middle$Cell$Middle$Text {
    public final Title a;
    public final a b;

    /* compiled from: VkTopBar.kt */
    public static final class a {
        public final tlo0.h a;

        public a(String str) {
            this.a = oq.d(tlo0.Companion, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode() * 31;
        }

        public final String toString() {
            return "Subtitle(subtitle=" + this.a + ", semanticsConfiguration=" + ((Object) "null") + ')';
        }
    }

    public VkTopBar$Middle$Cell$Middle$Text(Title title, a aVar, int i) {
        aVar = (i & 2) != 0 ? null : aVar;
        this.a = title;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkTopBar$Middle$Cell$Middle$Text)) {
            return false;
        }
        VkTopBar$Middle$Cell$Middle$Text vkTopBar$Middle$Cell$Middle$Text = (VkTopBar$Middle$Cell$Middle$Text) obj;
        return this.a.equals(vkTopBar$Middle$Cell$Middle$Text.a) && epx.f(this.b, vkTopBar$Middle$Cell$Middle$Text.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
    }

    public final String toString() {
        return "Text(title=" + this.a + ", subtitle=" + this.b + ", semanticsConfiguration=" + ((Object) "null") + ')';
    }

    /* compiled from: VkTopBar.kt */
    public static final class Title {
        public final tlo0.h a;
        public final Overflow b;
        public final gzs<s3q0> c;
        public final a d;
        public final a e;
        public final SemanticsConfiguration f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkTopBar.kt */
        public static final class Overflow {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Overflow[] $VALUES;
            public static final Overflow Fade;
            public static final Overflow None;

            static {
                Overflow overflow = new Overflow("None", 0);
                None = overflow;
                Overflow overflow2 = new Overflow("Fade", 1);
                Fade = overflow2;
                Overflow[] overflowArr = {overflow, overflow2};
                $VALUES = overflowArr;
                $ENTRIES = new asp(overflowArr);
            }

            public Overflow() {
                throw null;
            }

            public static Overflow valueOf(String str) {
                return (Overflow) Enum.valueOf(Overflow.class, str);
            }

            public static Overflow[] values() {
                return (Overflow[]) $VALUES.clone();
            }
        }

        /* compiled from: VkTopBar.kt */
        public interface a {

            /* compiled from: VkTopBar.kt */
            /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text$Title$a$a, reason: collision with other inner class name */
            public static final class C0869a implements a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0869a)) {
                        return false;
                    }
                    ((C0869a) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return 0;
                }

                public final String toString() {
                    return "Dropdown(description=null)";
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class b implements a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    ((b) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Icon(icon=null, iconDescription=null)";
                }
            }
        }

        public Title() {
            throw null;
        }

        public Title(tlo0.h hVar, Overflow overflow, com.vk.core.compose.component.semantics.a aVar, int i) {
            overflow = (i & 2) != 0 ? Overflow.None : overflow;
            aVar = (i & 32) != 0 ? null : aVar;
            this.a = hVar;
            this.b = overflow;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = aVar;
        }

        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof Title) {
                    Title title = (Title) obj;
                    if (epx.f(this.a, title.a) && this.b == title.b && epx.f(this.c, title.c) && epx.f(this.d, title.d) && epx.f(this.e, title.e)) {
                        SemanticsConfiguration semanticsConfiguration = title.f;
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
            int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
            gzs<s3q0> gzsVar = this.c;
            int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
            a aVar = this.d;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.e;
            int hashCode4 = (hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration = this.f;
            return hashCode4 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(title=");
            sb.append(this.a);
            sb.append(", overflow=");
            sb.append(this.b);
            sb.append(", onClick=");
            sb.append(this.c);
            sb.append(", along=");
            sb.append(this.d);
            sb.append(", alongSecond=");
            sb.append(this.e);
            sb.append(", semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.f;
            return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
        }

        public Title(String str, Overflow overflow, int i) {
            this(oq.d(tlo0.Companion, str), (i & 2) != 0 ? Overflow.None : overflow, null, 32);
        }
    }
}
