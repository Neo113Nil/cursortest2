package com.vk.movika.sdk.base.model;

import xsna.qlb0;

/* loaded from: classes3.dex */
public abstract class t {
    public static final b Companion = new b();
    public static final a a = a.c;

    public static final class a extends d {
        public static final a c = new a(Long.MAX_VALUE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1964146155;
        }

        @Override // com.vk.movika.sdk.base.model.t.d
        public final String toString() {
            return "AnyPosition";
        }
    }

    public static final class b {
    }

    public static final class c extends t {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 148553898;
        }

        public final String toString() {
            return "SeekIsBlocked";
        }
    }

    public static class d extends t {
        public final long b;

        public d(long j) {
            this.b = j;
        }

        public String toString() {
            return qlb0.a(this.b, "SpecificPosition(position=", ")");
        }
    }
}
