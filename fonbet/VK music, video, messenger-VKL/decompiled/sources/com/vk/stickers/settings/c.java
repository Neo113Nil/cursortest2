package com.vk.stickers.settings;

import com.vk.dto.stickers.StickerStockItem;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.p6l0;
import xsna.xl50;

/* compiled from: StickerSettingsState.kt */
/* loaded from: classes6.dex */
public abstract class c implements xl50 {

    /* compiled from: StickerSettingsState.kt */
    public static final class a extends c {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("AnimationsEnabled(value="), this.b, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: StickerSettingsState.kt */
    /* renamed from: com.vk.stickers.settings.c$c, reason: collision with other inner class name */
    public static final class C1803c extends c {
        public final p6l0 b;

        public C1803c(p6l0 p6l0Var) {
            this.b = p6l0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1803c) && epx.f(this.b, ((C1803c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DataReady(data=" + this.b + ')';
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class d extends c {
        public final List<StickerStockItem> b;
        public final List<StickerStockItem> c;

        public d(List<StickerStockItem> list, List<StickerStockItem> list2) {
            this.b = list;
            this.c = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PacksUpdate(active=");
            sb.append(this.b);
            sb.append(", inactive=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class e extends c {
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
            return q0.a(new StringBuilder("SetVmojiActive(value="), this.b, ')');
        }
    }

    /* compiled from: StickerSettingsState.kt */
    public static final class f extends c {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SuggestsEnabled(value="), this.b, ')');
        }
    }
}
