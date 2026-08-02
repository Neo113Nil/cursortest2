package com.vk.utils.vectordrawable.internal.animatorparser;

import xsna.epx;
import xsna.ho8;
import xsna.vu5;
import xsna.xq;

/* compiled from: AnimatorValue.kt */
/* loaded from: classes6.dex */
public abstract class b<T> {

    /* compiled from: AnimatorValue.kt */
    public static final class a extends b<Integer> {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Color(value="), this.a, ')');
        }
    }

    /* compiled from: AnimatorValue.kt */
    /* renamed from: com.vk.utils.vectordrawable.internal.animatorparser.b$b, reason: collision with other inner class name */
    public static final class C1942b extends b<Float> {
        public final float a;

        public C1942b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1942b) && Float.compare(this.a, ((C1942b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("FloatNumber(value="));
        }
    }

    /* compiled from: AnimatorValue.kt */
    public static final class c extends b<Integer> {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("IntNumber(value="), this.a, ')');
        }
    }

    /* compiled from: AnimatorValue.kt */
    public static final class d extends b<String> {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Path(value="), this.a, ')');
        }
    }

    /* compiled from: AnimatorValue.kt */
    public static final class e extends b {
        public static final e a = new e();
    }
}
