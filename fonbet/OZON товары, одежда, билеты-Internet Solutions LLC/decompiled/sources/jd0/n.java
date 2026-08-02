package jd0;

import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f69792d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7355h f69793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ComponentCallbacksC5392m componentCallbacksC5392m, C7355h c7355h) {
        super(componentCallbacksC5392m, null);
        this.f69792d = componentCallbacksC5392m;
        this.f69793e = c7355h;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        M requireActivity = this.f69792d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        return ((Bc0.c) requireActivity).h().i().m(this.f69793e.w());
    }
}
