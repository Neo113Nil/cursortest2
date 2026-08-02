package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthenticator", f = "CrossAppAuthenticator.kt", l = {288}, m = "login")
/* renamed from: nc0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8496g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8495f f76794d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f76795e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8495f f76796f;

    /* renamed from: g, reason: collision with root package name */
    int f76797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8496g(C8495f c8495f, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76796f = c8495f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f76795e = obj;
        this.f76797g |= LinearLayoutManager.INVALID_OFFSET;
        return C8495f.g(this.f76796f, null, this);
    }
}
