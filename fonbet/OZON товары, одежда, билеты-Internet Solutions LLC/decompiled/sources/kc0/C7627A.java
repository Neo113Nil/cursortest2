package kc0;

import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.w0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kc0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7627A extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7645c f71194d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7645c f71195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7627A(C7645c c7645c, C7645c c7645c2) {
        super(c7645c, null);
        this.f71194d = c7645c;
        this.f71195e = c7645c2;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        androidx.activity.M requireActivity = this.f71194d.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type ru.ozon.id.nativeauth.di.DiModuleProvider");
        Bc0.b i11 = ((Bc0.c) requireActivity).h().i();
        String string = this.f71195e.requireArguments().getString("screen_id_args_key");
        if (string != null) {
            return i11.d(handle, string);
        }
        throw new IllegalStateException("Use Fragment.newInstance");
    }
}
