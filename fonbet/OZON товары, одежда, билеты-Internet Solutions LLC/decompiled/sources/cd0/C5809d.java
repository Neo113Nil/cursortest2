package cd0;

import androidx.lifecycle.C5418g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel", f = "AuthViewModel.kt", l = {199, 204}, m = "continueVKIDAuthFlow")
/* renamed from: cd0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5809d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C5806a f56945d;

    /* renamed from: e, reason: collision with root package name */
    C5418g0 f56946e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f56947f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C5806a f56948g;

    /* renamed from: h, reason: collision with root package name */
    int f56949h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5809d(C5806a c5806a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f56948g = c5806a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object y02;
        this.f56947f = obj;
        this.f56949h |= LinearLayoutManager.INVALID_OFFSET;
        y02 = this.f56948g.y0(null, null, this);
        return y02;
    }
}
