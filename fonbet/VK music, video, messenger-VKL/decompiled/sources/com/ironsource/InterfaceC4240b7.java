package com.ironsource;

import xsna.epx;

/* renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4240b7 {

    /* renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC4240b7 {
        private final Y6 a;

        public a(Y6 y6) {
            this.a = y6;
        }

        public final Y6 a() {
            return this.a;
        }

        public final Y6 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.a + ")";
        }

        public final a a(Y6 y6) {
            return new a(y6);
        }

        public static /* synthetic */ a a(a aVar, Y6 y6, int i, Object obj) {
            if ((i & 1) != 0) {
                y6 = aVar.a;
            }
            return aVar.a(y6);
        }

        @Override // com.ironsource.InterfaceC4240b7
        public void a(InterfaceC4258c7 interfaceC4258c7) {
            interfaceC4258c7.a(this.a);
        }
    }

    default void a(InterfaceC4258c7 interfaceC4258c7) {
    }
}
