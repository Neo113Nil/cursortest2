package com.vk.core.compose.component.defaults;

import com.vk.core.compose.generated.VkColorToken;
import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.l5g;
import xsna.zrp;

/* compiled from: VkContentBadgeDefaults.kt */
/* loaded from: classes17.dex */
public interface ContentBadgeAppearance {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkContentBadgeDefaults.kt */
    public static final class Design implements ContentBadgeAppearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Design[] $VALUES;
        public static final Design Accent;
        public static final Design Negative;
        public static final Design Neutral;
        public static final Design Overlay;
        public static final Design Positive;

        static {
            Design design = new Design("Accent", 0);
            Accent = design;
            Design design2 = new Design("Neutral", 1);
            Neutral = design2;
            Design design3 = new Design("Positive", 2);
            Positive = design3;
            Design design4 = new Design("Negative", 3);
            Negative = design4;
            Design design5 = new Design("Overlay", 4);
            Overlay = design5;
            Design[] designArr = {design, design2, design3, design4, design5};
            $VALUES = designArr;
            $ENTRIES = new asp(designArr);
        }

        public Design() {
            throw null;
        }

        public static zrp<Design> h() {
            return $ENTRIES;
        }

        public static Design valueOf(String str) {
            return (Design) Enum.valueOf(Design.class, str);
        }

        public static Design[] values() {
            return (Design[]) $VALUES.clone();
        }
    }

    /* compiled from: VkContentBadgeDefaults.kt */
    public static final class a implements ContentBadgeAppearance {
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;

        public a(int i, long j, long j2, long j3) {
            j3 = (i & 4) != 0 ? l5g.j : j3;
            boolean z = (i & 8) == 0;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l5g.d(this.b, aVar.b) && l5g.d(this.c, aVar.c) && l5g.d(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int i = l5g.l;
            return Boolean.hashCode(this.e) + bh10.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Custom(backgroundColor=");
            dn.h(this.b, ", contentColor=", sb);
            dn.h(this.c, ", borderColor=", sb);
            dn.h(this.d, ", hasBlur=", sb);
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: VkContentBadgeDefaults.kt */
    public static final class b implements ContentBadgeAppearance {
        public final VkColorToken b;
        public final VkColorToken c;
        public final VkColorToken d;

        public b(VkColorToken vkColorToken, VkColorToken vkColorToken2, VkColorToken vkColorToken3) {
            this.b = vkColorToken;
            this.c = vkColorToken2;
            this.d = vkColorToken3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "CustomTokens(backgroundToken=" + this.b + ", contentToken=" + this.c + ", borderToken=" + this.d + ')';
        }

        public /* synthetic */ b(VkColorToken vkColorToken, VkColorToken vkColorToken2) {
            this(vkColorToken, vkColorToken2, VkColorToken.Transparent);
        }
    }
}
