package com.vk.stickers.settings;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.vu5;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public abstract class b implements kj50 {

    /* compiled from: StickerSettingsState.kt */
    public static final class a extends b {
        public static final a b = new a();
    }

    /* compiled from: StickerSettingsState.kt */
    /* renamed from: com.vk.stickers.settings.b$b, reason: collision with other inner class name */
    public static final class C1802b extends b {
        public static final C1802b b = new C1802b();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class c extends b {
        public static final c b = new c();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class d extends b {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EnableAnimations(value="), this.b, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class e extends b {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EnableSuggest(value="), this.b, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class f extends b {
        public static final f b = new f();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class g extends b {
        public final StickerStockItem b;

        public g(StickerStockItem stickerStockItem) {
            this.b = stickerStockItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenPack(pack=" + this.b + ')';
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class h extends b {
        public static final h b = new h();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class i extends b {
        public final VmojiAvatar b;

        public i(VmojiAvatar vmojiAvatar) {
            this.b = vmojiAvatar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenVmoji(vmojiAvatar=" + this.b + ')';
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class j extends b {
        public static final j b = new j();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class k extends b {
        public static final k b = new k();
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class l extends b {
        public final int b;
        public final int c;

        public l(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.b == lVar.b && this.c == lVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Reorder(oldPosition=");
            sb.append(this.b);
            sb.append(", newPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class m extends b {
        public final StickerStockItem b;
        public final boolean c;

        public m(StickerStockItem stickerStockItem, boolean z) {
            this.b = stickerStockItem;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && this.c == mVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetActive(pack=");
            sb.append(this.b);
            sb.append(", value=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class n extends b {
        public final boolean b;
        public final String c;

        public n(boolean z, String str) {
            this.b = z;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.b == nVar.b && epx.f(this.c, nVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowVmojiMenu(isVmojiActive=");
            sb.append(this.b);
            sb.append(", characterId=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
