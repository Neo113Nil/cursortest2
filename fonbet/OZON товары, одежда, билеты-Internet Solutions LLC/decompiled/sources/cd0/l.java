package cd0;

import androidx.activity.M;
import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f56978d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f56979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, m mVar2) {
        super(mVar, null);
        this.f56978d = mVar;
        this.f56979e = mVar2;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        M requireActivity = this.f56978d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        Bc0.b i11 = ((Bc0.c) requireActivity).h().i();
        String string = this.f56979e.requireArguments().getString("screen_id_args_key");
        if (string != null) {
            return i11.k(handle, string);
        }
        throw new IllegalStateException("Use Fragment.newInstance");
    }
}
