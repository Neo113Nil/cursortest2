package Mj;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements U.c {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f7765a;

    public o(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f7765a = provider;
    }

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Object obj = this.f7765a.get();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of zendesk.talk.android.internal.call.setup.TalkCallSetupViewModelFactory.create");
        return (Q) obj;
    }
}
