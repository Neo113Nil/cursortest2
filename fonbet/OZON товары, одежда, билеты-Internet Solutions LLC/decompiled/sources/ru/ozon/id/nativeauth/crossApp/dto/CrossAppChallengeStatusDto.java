package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeStatusDto;", "", "isSuccess", "", "deeplink", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getDeeplink", "()Ljava/lang/String;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeStatusDto {
    private final String deeplink;
    private final boolean isSuccess;

    public CrossAppChallengeStatusDto(boolean z11, String str) {
        this.isSuccess = z11;
        this.deeplink = str;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }
}
