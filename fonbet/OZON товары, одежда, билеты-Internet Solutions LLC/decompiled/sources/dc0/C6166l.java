package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.AuthCookieHandler", f = "AuthCookieHandler.kt", l = {83, 90, 93, 100}, m = "onUserDataUpdateOnPrimaryDomain")
/* renamed from: dc0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6166l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6160f f61556d;

    /* renamed from: e, reason: collision with root package name */
    C6154S f61557e;

    /* renamed from: f, reason: collision with root package name */
    C6154S f61558f;

    /* renamed from: g, reason: collision with root package name */
    zb0.c f61559g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f61560h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C6160f f61561i;

    /* renamed from: j, reason: collision with root package name */
    int f61562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6166l(C6160f c6160f, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f61561i = c6160f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f61560h = obj;
        this.f61562j |= LinearLayoutManager.INVALID_OFFSET;
        return C6160f.c(this.f61561i, null, null, null, this);
    }
}
