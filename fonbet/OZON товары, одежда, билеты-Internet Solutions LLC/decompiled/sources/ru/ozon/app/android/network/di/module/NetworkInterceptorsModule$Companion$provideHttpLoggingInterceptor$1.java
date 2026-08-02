package ru.ozon.app.android.network.di.module;

import Lm0.a;
import Sc.InterfaceC4003e;
import kotlin.Metadata;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import nf.C8590c;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class NetworkInterceptorsModule$Companion$provideHttpLoggingInterceptor$1 implements C8590c.b, InterfaceC7732n {
    final /* synthetic */ a.b $tmp0;

    NetworkInterceptorsModule$Companion$provideHttpLoggingInterceptor$1(a.b bVar) {
        this.$tmp0 = bVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C8590c.b) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7719a(1, this.$tmp0, a.b.class, "i", "i(Ljava/lang/String;[Ljava/lang/Object;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // nf.C8590c.b
    public final void log(String str) {
        this.$tmp0.i(str, new Object[0]);
    }
}
