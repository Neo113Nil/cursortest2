package com.vk.music.player.cache;

import xsna.shy;
import xsna.vu5;

/* compiled from: PrefetchConfig.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: PrefetchConfig.kt */
    /* renamed from: com.vk.music.player.cache.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1333a implements a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public C1333a() {
            this(0, 0, 0, 0, 0, 31);
        }

        @Override // com.vk.music.player.cache.a
        public final int a() {
            return this.b;
        }

        @Override // com.vk.music.player.cache.a
        public final int b() {
            return this.a;
        }

        @Override // com.vk.music.player.cache.a
        public final int c() {
            return this.d;
        }

        @Override // com.vk.music.player.cache.a
        public final int d() {
            return this.e;
        }

        @Override // com.vk.music.player.cache.a
        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1333a)) {
                return false;
            }
            C1333a c1333a = (C1333a) obj;
            return this.a == c1333a.a && this.b == c1333a.b && this.c == c1333a.c && this.d == c1333a.d && this.e == c1333a.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(prefetchTracksCount=");
            sb.append(this.a);
            sb.append(", cacheSizeMb=");
            sb.append(this.b);
            sb.append(", firstPhasePrefetchDurationSec=");
            sb.append(this.c);
            sb.append(", secondPhasePrefetchDurationMin=");
            sb.append(this.d);
            sb.append(", firstPhasePrefetchTracksCount=");
            return vu5.b(sb, this.e, ')');
        }

        public C1333a(int i, int i2, int i3, int i4, int i5, int i6) {
            i = (i6 & 1) != 0 ? 1 : i;
            i2 = (i6 & 2) != 0 ? 50 : i2;
            i3 = (i6 & 4) != 0 ? 5 : i3;
            i4 = (i6 & 8) != 0 ? 6 : i4;
            i5 = (i6 & 16) != 0 ? 1 : i5;
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* compiled from: PrefetchConfig.kt */
    public static final class b implements a {
        public static final b a = new b();

        @Override // com.vk.music.player.cache.a
        public final int a() {
            return 0;
        }

        @Override // com.vk.music.player.cache.a
        public final int b() {
            return 0;
        }

        @Override // com.vk.music.player.cache.a
        public final int c() {
            return 0;
        }

        @Override // com.vk.music.player.cache.a
        public final int d() {
            return 0;
        }

        @Override // com.vk.music.player.cache.a
        public final int e() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1843038541;
        }

        public final String toString() {
            return "Disabled";
        }
    }

    int a();

    int b();

    int c();

    int d();

    int e();
}
