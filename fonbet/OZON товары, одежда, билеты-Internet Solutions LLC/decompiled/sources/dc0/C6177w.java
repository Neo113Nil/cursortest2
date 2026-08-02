package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.CurrentUserRepository", f = "CurrentUserRepository.kt", l = {16}, m = "getUserData")
/* renamed from: dc0.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6177w extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6178x f61587d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f61588e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6178x f61589f;

    /* renamed from: g, reason: collision with root package name */
    int f61590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6177w(C6178x c6178x, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61589f = c6178x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61588e = obj;
        this.f61590g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61589f.a(this);
    }
}
