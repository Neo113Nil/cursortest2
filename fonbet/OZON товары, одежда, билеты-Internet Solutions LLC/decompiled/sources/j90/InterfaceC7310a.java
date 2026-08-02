package j90;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.models.GetPushBodyResponse;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsResponse;

/* renamed from: j90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7310a {
    Object a(String str, String str2, @NotNull d<? super NotificationGwt3dsResponse> dVar);

    Object getPushBody(@NotNull String str, @NotNull d<? super GetPushBodyResponse> dVar);
}
