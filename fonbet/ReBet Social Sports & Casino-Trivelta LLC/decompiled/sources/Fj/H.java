package Fj;

import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class H implements U.c {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f3726a;

    public H(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f3726a = provider;
    }

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Object obj = this.f3726a.get();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of zendesk.talk.android.internal.call.TalkCallViewModelFactory.create");
        return (Q) obj;
    }
}
