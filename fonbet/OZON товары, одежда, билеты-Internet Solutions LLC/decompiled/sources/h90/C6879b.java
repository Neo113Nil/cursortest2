package h90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.models.NotificationSecureBody;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.FintechNotificationServiceInteractorImpl", f = "FintechNotificationServiceInteractorImpl.kt", l = {232, 538, 232}, m = "getSecureNotification")
/* renamed from: h90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6879b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6881d f65133d;

    /* renamed from: e, reason: collision with root package name */
    k90.b f65134e;

    /* renamed from: f, reason: collision with root package name */
    String f65135f;

    /* renamed from: g, reason: collision with root package name */
    String f65136g;

    /* renamed from: h, reason: collision with root package name */
    NotificationSecureBody f65137h;

    /* renamed from: i, reason: collision with root package name */
    String f65138i;

    /* renamed from: j, reason: collision with root package name */
    String f65139j;

    /* renamed from: k, reason: collision with root package name */
    int f65140k;

    /* renamed from: l, reason: collision with root package name */
    int f65141l;

    /* renamed from: m, reason: collision with root package name */
    int f65142m;

    /* renamed from: n, reason: collision with root package name */
    long f65143n;

    /* renamed from: o, reason: collision with root package name */
    long f65144o;

    /* renamed from: p, reason: collision with root package name */
    /* synthetic */ Object f65145p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ C6881d f65146q;

    /* renamed from: r, reason: collision with root package name */
    int f65147r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6879b(C6881d c6881d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65146q = c6881d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f65145p = obj;
        this.f65147r |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f65146q.i(null, null, this);
        return i11;
    }
}
