package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ji;

/* compiled from: KeylineState.java */
/* loaded from: classes13.dex */
public final class b {
    public final float a;
    public final List<C0118b> b;
    public final int c;
    public final int d;

    /* compiled from: KeylineState.java */
    public static final class a {
        public final float a;
        public final float b;
        public C0118b d;
        public C0118b e;
        public final ArrayList c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public int i = -1;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @NonNull
        public final void a(float f, float f2, float f3, boolean z, boolean z2) {
            float f4;
            float f5 = f3 / 2.0f;
            float f6 = f - f5;
            float f7 = f5 + f;
            float f8 = this.b;
            if (f7 > f8) {
                f4 = Math.abs(f7 - Math.max(f7 - f3, f8));
            } else {
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f4 = Math.abs(f6 - Math.min(f6 + f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            }
            b(f, f2, f3, z, z2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @NonNull
        public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            ArrayList arrayList = this.c;
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = arrayList.size();
            }
            C0118b c0118b = new C0118b(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.d == null) {
                    this.d = c0118b;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = c0118b;
                this.g = arrayList.size();
            } else {
                if (this.d == null && f3 < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && f3 > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = f3;
            arrayList.add(c0118b);
        }

        @NonNull
        public final void c(float f, float f2, float f3, int i, boolean z) {
            if (i <= 0 || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                a((i2 * f3) + f, f2, f3, z, false);
            }
        }

        @NonNull
        public final b d() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                float f = this.a;
                if (i >= size) {
                    return new b(f, arrayList, this.f, this.g);
                }
                C0118b c0118b = (C0118b) arrayList2.get(i);
                arrayList.add(new C0118b((i * f) + (this.d.b - (this.f * f)), c0118b.b, c0118b.c, c0118b.d, c0118b.e, c0118b.f, c0118b.g, c0118b.h));
                i++;
            }
        }
    }

    /* compiled from: KeylineState.java */
    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0118b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public C0118b(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public b(float f, ArrayList arrayList, int i, int i2) {
        this.a = f;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = i;
        this.d = i2;
    }

    public final C0118b a() {
        return this.b.get(this.c);
    }

    public final C0118b b() {
        return this.b.get(0);
    }

    public final C0118b c() {
        return this.b.get(this.d);
    }

    public final C0118b d() {
        return (C0118b) ji.a(1, this.b);
    }
}
