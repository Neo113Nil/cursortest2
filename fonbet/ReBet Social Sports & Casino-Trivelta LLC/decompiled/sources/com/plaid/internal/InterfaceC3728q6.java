package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3728q6 {

    /* renamed from: com.plaid.internal.q6$a */
    public static final class a implements InterfaceC3728q6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final AbstractC3782w7 f41003a;

        public a(@NotNull AbstractC3782w7 twilioVerifySnaException) {
            Intrinsics.checkNotNullParameter(twilioVerifySnaException, "twilioVerifySnaException");
            this.f41003a = twilioVerifySnaException;
        }

        @NotNull
        public final AbstractC3782w7 a() {
            return this.f41003a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f41003a, ((a) obj).f41003a);
        }

        public final int hashCode() {
            return this.f41003a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Fail(twilioVerifySnaException=" + this.f41003a + ')';
        }
    }

    /* renamed from: com.plaid.internal.q6$b */
    public static final class b implements InterfaceC3728q6 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final C3645h4 f41004a;

        public b(@NotNull C3645h4 networkRequestResult) {
            Intrinsics.checkNotNullParameter(networkRequestResult, "networkRequestResult");
            this.f41004a = networkRequestResult;
        }

        @NotNull
        public final C3645h4 a() {
            return this.f41004a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f41004a, ((b) obj).f41004a);
        }

        public final int hashCode() {
            return this.f41004a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(networkRequestResult=" + this.f41004a + ')';
        }
    }
}
