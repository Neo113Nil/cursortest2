package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.LocalCookieDataSource", f = "LocalCookieDataSource.kt", l = {114}, m = "clear")
/* renamed from: dc0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6137A extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6144H f61454d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f61455e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6144H f61456f;

    /* renamed from: g, reason: collision with root package name */
    int f61457g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6137A(C6144H c6144h, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61456f = c6144h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61455e = obj;
        this.f61457g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61456f.c(this);
    }
}
