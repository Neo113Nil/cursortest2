package com.vk.clips.sdk.shared.item.common.restriction;

import com.vk.clips.sdk.models.SdkImages;
import xsna.epx;
import xsna.ho8;
import xsna.r3q0;

/* compiled from: RestrictionOverlayState.kt */
/* loaded from: classes17.dex */
public interface b extends r3q0 {

    /* compiled from: RestrictionOverlayState.kt */
    public interface a {

        /* compiled from: RestrictionOverlayState.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.common.restriction.b$a$a, reason: collision with other inner class name */
        public static final class C0671a implements a {
            public static final C0671a a = new C0671a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0671a);
            }

            public final int hashCode() {
                return 872008514;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: RestrictionOverlayState.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.common.restriction.b$a$b, reason: collision with other inner class name */
        public static final class C0672b implements a {
            public final String a;

            public C0672b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0672b) && epx.f(this.a, ((C0672b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Visible(text="), this.a, ')');
            }
        }
    }

    /* compiled from: RestrictionOverlayState.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.common.restriction.b$b, reason: collision with other inner class name */
    public static final class C0673b implements b {
        public final String a;

        public C0673b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0673b) && epx.f(this.a, ((C0673b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: RestrictionOverlayState.kt */
    public interface c {

        /* compiled from: RestrictionOverlayState.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1244306359;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: RestrictionOverlayState.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.common.restriction.b$c$b, reason: collision with other inner class name */
        public static final class C0674b implements c {
            public final SdkImages a;

            public C0674b(SdkImages sdkImages) {
                this.a = sdkImages;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0674b) && epx.f(this.a, ((C0674b) obj).a);
            }

            public final int hashCode() {
                SdkImages sdkImages = this.a;
                if (sdkImages == null) {
                    return 0;
                }
                return sdkImages.hashCode();
            }

            public final String toString() {
                return "Visible(image=" + this.a + ')';
            }
        }
    }

    /* compiled from: RestrictionOverlayState.kt */
    public interface d {

        /* compiled from: RestrictionOverlayState.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -538310154;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: RestrictionOverlayState.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.common.restriction.b$d$b, reason: collision with other inner class name */
        public static final class C0675b implements d {
            public final String a;

            public C0675b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0675b) && epx.f(this.a, ((C0675b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Visible(text="), this.a, ')');
            }
        }
    }

    /* compiled from: RestrictionOverlayState.kt */
    public static final class e implements b {
        public final String a;
        public final c b;
        public final d c;
        public final a d;

        public e(String str, c cVar, d dVar, a aVar) {
            this.a = str;
            this.b = cVar;
            this.c = dVar;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Visible(uniqueKey=" + this.a + ", iconState=" + this.b + ", titleState=" + this.c + ", buttonState=" + this.d + ')';
        }
    }
}
