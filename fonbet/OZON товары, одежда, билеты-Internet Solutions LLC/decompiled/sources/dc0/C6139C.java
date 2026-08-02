package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.LocalCookieDataSource", f = "LocalCookieDataSource.kt", l = {124, 129}, m = "clearAuthCookiesOnSecondaryDomains")
/* renamed from: dc0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6139C extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6144H f61464d;

    /* renamed from: e, reason: collision with root package name */
    Set f61465e;

    /* renamed from: f, reason: collision with root package name */
    List f61466f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f61467g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C6144H f61468h;

    /* renamed from: i, reason: collision with root package name */
    int f61469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6139C(C6144H c6144h, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61468h = c6144h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61467g = obj;
        this.f61469i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f61468h.e(null, this);
    }
}
