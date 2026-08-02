package h90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.FintechNotificationServiceInteractorImpl", f = "FintechNotificationServiceInteractorImpl.kt", l = {94}, m = "getNotificationInternal")
/* renamed from: h90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6878a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6881d f65127d;

    /* renamed from: e, reason: collision with root package name */
    k90.b f65128e;

    /* renamed from: f, reason: collision with root package name */
    String f65129f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f65130g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C6881d f65131h;

    /* renamed from: i, reason: collision with root package name */
    int f65132i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6878a(C6881d c6881d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65131h = c6881d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f65130g = obj;
        this.f65132i |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f65131h.g(null, null, this);
        return g10;
    }
}
