package com.vk.music.informer.mvi;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import defpackage.q0;
import xsna.epx;
import xsna.xl50;

/* compiled from: MusicPlayerInformerPath.kt */
/* loaded from: classes3.dex */
public interface h extends xl50 {

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class a implements h {
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
            return q0.a(new StringBuilder("AdChange(isAd="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class b implements h {
        public final ArtistArtistPromoDto b;

        public b(ArtistArtistPromoDto artistArtistPromoDto) {
            this.b = artistArtistPromoDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Data(data=" + this.b + ')';
        }
    }

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class c implements h {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 770208736;
        }

        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class d implements h {
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
            return q0.a(new StringBuilder("IsMusicScreenChange(isMusic="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class e implements h {
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
            return q0.a(new StringBuilder("StickyBannerVisibleChange(isVisible="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerInformerPath.kt */
    public static final class f implements h {
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
            return q0.a(new StringBuilder("SupportsHidingInformerOpenChange(isOpen="), this.b, ')');
        }
    }
}
