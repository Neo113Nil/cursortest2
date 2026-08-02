package com.vk.music.informer.mvi;

import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.nx40;
import xsna.tr;
import xsna.urd0;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: MusicPlayerInformerViewState.kt */
/* loaded from: classes3.dex */
public final class MusicPlayerInformerViewState implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicPlayerInformerViewState.kt */
    public static final class Icons {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Icons[] $VALUES;
        public static final Icons MERCH_ICON;
        public static final Icons TICKET_ICON;

        static {
            Icons icons = new Icons("TICKET_ICON", 0);
            TICKET_ICON = icons;
            Icons icons2 = new Icons("MERCH_ICON", 1);
            MERCH_ICON = icons2;
            Icons[] iconsArr = {icons, icons2};
            $VALUES = iconsArr;
            $ENTRIES = new asp(iconsArr);
        }

        public Icons() {
            throw null;
        }

        public static Icons valueOf(String str) {
            return (Icons) Enum.valueOf(Icons.class, str);
        }

        public static Icons[] values() {
            return (Icons[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicPlayerInformerViewState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final Icons c;

        public a(String str, String str2, Icons icons) {
            this.a = str;
            this.b = str2;
            this.c = icons;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "ArtistPromo(caption=" + this.a + ", url=" + this.b + ", icon=" + this.c + ')';
        }
    }

    /* compiled from: MusicPlayerInformerViewState.kt */
    public static final class b implements fm50<nx40> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(promo="), this.a, ')');
        }
    }

    /* compiled from: MusicPlayerInformerViewState.kt */
    public static final class c implements fm50<nx40> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 702760000;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public MusicPlayerInformerViewState(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
