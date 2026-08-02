package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeResponseDto;", "", "status", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeStatusDto;", "notificationBar", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto;", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeStatusDto;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto;)V", "getStatus", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeStatusDto;", "getNotificationBar", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeNotificationDto;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeResponseDto {
    private final CrossAppChallengeNotificationDto notificationBar;

    @NotNull
    private final CrossAppChallengeStatusDto status;

    public CrossAppChallengeResponseDto(@NotNull CrossAppChallengeStatusDto status, CrossAppChallengeNotificationDto crossAppChallengeNotificationDto) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.notificationBar = crossAppChallengeNotificationDto;
    }

    public final CrossAppChallengeNotificationDto getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final CrossAppChallengeStatusDto getStatus() {
        return this.status;
    }
}
