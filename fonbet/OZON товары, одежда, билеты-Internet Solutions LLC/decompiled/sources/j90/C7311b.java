package j90;

import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.models.GetPushBodyResponse;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsBody;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsResponse;
import ru.ozon.fintech.notifications.network.FintechNotificationApi;

/* renamed from: j90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7311b implements InterfaceC7310a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FintechNotificationApi f69520a;

    public C7311b(@NotNull FintechNotificationApi fintechNotificationApi) {
        Intrinsics.checkNotNullParameter(fintechNotificationApi, "fintechNotificationApi");
        this.f69520a = fintechNotificationApi;
    }

    @Override // j90.InterfaceC7310a
    public final Object a(String str, String str2, @NotNull d<? super NotificationGwt3dsResponse> dVar) {
        return this.f69520a.encryptedPush(new NotificationGwt3dsBody(str, str2), dVar);
    }

    @Override // j90.InterfaceC7310a
    public final Object getPushBody(@NotNull String str, @NotNull d<? super GetPushBodyResponse> dVar) {
        return this.f69520a.getPushBody(str, dVar);
    }
}
