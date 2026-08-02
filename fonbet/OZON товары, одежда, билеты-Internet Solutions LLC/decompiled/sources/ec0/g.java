package ec0;

import androidx.activity.M;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f62131d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f62132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, h hVar2) {
        super(hVar, null);
        this.f62131d = hVar;
        this.f62132e = hVar2;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        M requireActivity = this.f62131d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        Bc0.b i11 = ((Bc0.c) requireActivity).h().i();
        String string = this.f62132e.requireArguments().getString("screen_id_args_key");
        if (string != null) {
            return i11.h(handle, string);
        }
        throw new IllegalStateException("Use Fragment.newInstance");
    }
}
