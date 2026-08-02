package h90;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.FintechNotificationServiceInteractorImpl", f = "FintechNotificationServiceInteractorImpl.kt", l = {77}, m = "handleNotification")
/* renamed from: h90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6880c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    int f65148d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f65149e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6881d f65150f;

    /* renamed from: g, reason: collision with root package name */
    int f65151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6880c(C6881d c6881d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65150f = c6881d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65149e = obj;
        this.f65151g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f65150f.a(null, null, this);
    }
}
