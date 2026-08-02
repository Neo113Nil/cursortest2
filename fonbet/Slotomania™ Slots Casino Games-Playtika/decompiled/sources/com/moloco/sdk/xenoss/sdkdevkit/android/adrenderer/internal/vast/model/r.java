package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class r {
    public static final int a = 0;

    public static final class a extends r {
        public static final int c = 0;
        public final int b;

        public a(int i) {
            super(null);
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            return "Percents(percents=" + this.b + ')';
        }

        public final a a(int i) {
            return new a(i);
        }

        public static /* synthetic */ a a(a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.b;
            }
            return aVar.a(i);
        }
    }

    public static final class b extends r {
        public static final int c = 0;
        public final long b;

        public b(long j) {
            super(null);
            this.b = j;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return Long.hashCode(this.b);
        }

        public String toString() {
            return "Time(millis=" + this.b + ')';
        }

        public final b a(long j) {
            return new b(j);
        }

        public static /* synthetic */ b a(b bVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bVar.b;
            }
            return bVar.a(j);
        }
    }

    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public r() {
    }
}
