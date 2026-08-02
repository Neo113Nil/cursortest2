package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.URI;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.LocalCookieDataSource", f = "LocalCookieDataSource.kt", l = {160}, m = "clearAllSso2Cookies")
/* renamed from: dc0.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6138B extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6144H f61458d;

    /* renamed from: e, reason: collision with root package name */
    URI f61459e;

    /* renamed from: f, reason: collision with root package name */
    List f61460f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f61461g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C6144H f61462h;

    /* renamed from: i, reason: collision with root package name */
    int f61463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6138B(C6144H c6144h, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61462h = c6144h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61461g = obj;
        this.f61463i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61462h.d(this);
    }
}
