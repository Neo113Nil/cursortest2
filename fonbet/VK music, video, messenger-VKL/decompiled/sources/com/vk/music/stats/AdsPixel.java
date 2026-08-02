package com.vk.music.stats;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdsPixel.kt */
/* loaded from: classes3.dex */
public abstract class AdsPixel extends Serializer.StreamParcelableAdapter {
    public boolean b;

    /* compiled from: AdsPixel.kt */
    public static final class Completed extends AdsPixel {
        public static final Serializer.c<Completed> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Completed> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Completed a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new Completed(H, H2, H3 != null ? H3 : "");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed(String str, String str2, String str3) {
            super(str, str2, str3, null);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return epx.f(this.c, completed.c) && epx.f(this.d, completed.d) && epx.f(this.e, completed.e);
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getType() {
            return this.d;
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(this.c.hashCode() * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Completed(url=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", key=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String zb() {
            return this.e;
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class Reached extends AdsPixel {
        public static final Serializer.c<Reached> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;
        public final long f;
        public final boolean g;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Reached> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Reached a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new Reached(H, H2, H3 != null ? H3 : "", serializer.w(), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reached[i];
            }
        }

        public Reached(String str, String str2, String str3, long j, boolean z) {
            super(str, str2, str3, null);
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = j;
            this.g = z;
        }

        @Override // com.vk.music.stats.AdsPixel, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.Y(this.f);
            serializer.L(this.g ? (byte) 1 : (byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reached)) {
                return false;
            }
            Reached reached = (Reached) obj;
            return epx.f(this.c, reached.c) && epx.f(this.d, reached.d) && epx.f(this.e, reached.e) && this.f == reached.f && this.g == reached.g;
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getType() {
            return this.d;
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + bh10.a(urd0.a(urd0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Reached(url=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", key=");
            sb.append(this.e);
            sb.append(", time=");
            sb.append(this.f);
            sb.append(", isTimeInPercents=");
            return q0.a(sb, this.g, ')');
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String zb() {
            return this.e;
        }
    }

    /* compiled from: AdsPixel.kt */
    public static abstract class Secondary extends AdsPixel {
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: AdsPixel.kt */
        public static final class Error extends Secondary {
            public static final Serializer.c<Error> CREATOR = new a();
            public final String f;
            public final String g;
            public final String h;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Error> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Error a(Serializer serializer) {
                    String H = serializer.H();
                    if (H == null) {
                        H = "";
                    }
                    String H2 = serializer.H();
                    if (H2 == null) {
                        H2 = "";
                    }
                    String H3 = serializer.H();
                    return new Error(H, H2, H3 != null ? H3 : "");
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Error[i];
                }
            }

            public Error(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.f = str;
                this.g = str2;
                this.h = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return epx.f(this.f, error.f) && epx.f(this.g, error.g) && epx.f(this.h, error.h);
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getType() {
                return this.g;
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getUrl() {
                return this.f;
            }

            public final int hashCode() {
                return this.h.hashCode() + urd0.a(this.f.hashCode() * 31, 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(url=");
                sb.append(this.f);
                sb.append(", type=");
                sb.append(this.g);
                sb.append(", key=");
                return ho8.a(sb, this.h, ')');
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String zb() {
                return this.h;
            }
        }

        /* compiled from: AdsPixel.kt */
        public static final class Paused extends Secondary {
            public static final Serializer.c<Paused> CREATOR = new a();
            public final String f;
            public final String g;
            public final String h;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Paused> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Paused a(Serializer serializer) {
                    String H = serializer.H();
                    if (H == null) {
                        H = "";
                    }
                    String H2 = serializer.H();
                    if (H2 == null) {
                        H2 = "";
                    }
                    String H3 = serializer.H();
                    return new Paused(H, H2, H3 != null ? H3 : "");
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Paused[i];
                }
            }

            public Paused(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.f = str;
                this.g = str2;
                this.h = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Paused)) {
                    return false;
                }
                Paused paused = (Paused) obj;
                return epx.f(this.f, paused.f) && epx.f(this.g, paused.g) && epx.f(this.h, paused.h);
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getType() {
                return this.g;
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getUrl() {
                return this.f;
            }

            public final int hashCode() {
                return this.h.hashCode() + urd0.a(this.f.hashCode() * 31, 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Paused(url=");
                sb.append(this.f);
                sb.append(", type=");
                sb.append(this.g);
                sb.append(", key=");
                return ho8.a(sb, this.h, ')');
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String zb() {
                return this.h;
            }
        }

        /* compiled from: AdsPixel.kt */
        public static final class Resumed extends Secondary {
            public static final Serializer.c<Resumed> CREATOR = new a();
            public final String f;
            public final String g;
            public final String h;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Resumed> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Resumed a(Serializer serializer) {
                    String H = serializer.H();
                    if (H == null) {
                        H = "";
                    }
                    String H2 = serializer.H();
                    if (H2 == null) {
                        H2 = "";
                    }
                    String H3 = serializer.H();
                    return new Resumed(H, H2, H3 != null ? H3 : "");
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Resumed[i];
                }
            }

            public Resumed(String str, String str2, String str3) {
                super(str, str2, str3, null);
                this.f = str;
                this.g = str2;
                this.h = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Resumed)) {
                    return false;
                }
                Resumed resumed = (Resumed) obj;
                return epx.f(this.f, resumed.f) && epx.f(this.g, resumed.g) && epx.f(this.h, resumed.h);
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getType() {
                return this.g;
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String getUrl() {
                return this.f;
            }

            public final int hashCode() {
                return this.h.hashCode() + urd0.a(this.f.hashCode() * 31, 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Resumed(url=");
                sb.append(this.f);
                sb.append(", type=");
                sb.append(this.g);
                sb.append(", key=");
                return ho8.a(sb, this.h, ')');
            }

            @Override // com.vk.music.stats.AdsPixel.Secondary, com.vk.music.stats.AdsPixel
            public final String zb() {
                return this.h;
            }
        }

        public Secondary(String str, String str2, String str3, zcl zclVar) {
            super(str, str2, str3, null);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // com.vk.music.stats.AdsPixel
        public String getType() {
            return this.d;
        }

        @Override // com.vk.music.stats.AdsPixel
        public String getUrl() {
            return this.c;
        }

        @Override // com.vk.music.stats.AdsPixel
        public String zb() {
            return this.e;
        }
    }

    /* compiled from: AdsPixel.kt */
    public static final class Started extends AdsPixel {
        public static final Serializer.c<Started> CREATOR = new a();
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Started> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Started a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new Started(H, H2, H3 != null ? H3 : "");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Started[i];
            }
        }

        public Started(String str, String str2, String str3) {
            super(str, str2, str3, null);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Started)) {
                return false;
            }
            Started started = (Started) obj;
            return epx.f(this.c, started.c) && epx.f(this.d, started.d) && epx.f(this.e, started.e);
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getType() {
            return this.d;
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String getUrl() {
            return this.c;
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(this.c.hashCode() * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Started(url=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", key=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // com.vk.music.stats.AdsPixel
        public final String zb() {
            return this.e;
        }
    }

    public AdsPixel(String str, String str2, String str3, zcl zclVar) {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(getUrl());
        serializer.j0(getType());
        serializer.j0(zb());
    }

    public abstract String getType();

    public abstract String getUrl();

    public abstract String zb();
}
