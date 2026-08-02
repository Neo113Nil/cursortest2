package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.a7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2326a7 {

    /* renamed from: com.ironsource.a7$a */
    public static final class a implements InterfaceC2326a7 {
        private final X6 a;

        public a(X6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.a = failure;
        }

        public final X6 a() {
            return this.a;
        }

        public final X6 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.a + ")";
        }

        public final a a(X6 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, X6 x6, int i, Object obj) {
            if ((i & 1) != 0) {
                x6 = aVar.a;
            }
            return aVar.a(x6);
        }

        @Override // com.ironsource.InterfaceC2326a7
        public void a(InterfaceC2344b7 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.a);
        }
    }

    default void a(InterfaceC2344b7 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
