package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAutologinUseCase", f = "CrossAppAutologinUseCase.kt", l = {80, 84, 85, 86}, m = "autologinInitialRun")
/* renamed from: nc0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C8502m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    q f76815d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f76816e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f76817f;

    /* renamed from: g, reason: collision with root package name */
    int f76818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8502m(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76817f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f76816e = obj;
        this.f76818g |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f76817f.j(this);
        return j11;
    }
}
