package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;", "", "challengeInfo", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "deviceModel", "", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;Ljava/lang/String;)V", "getChallengeInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "getDeviceModel", "()Ljava/lang/String;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppChallengeRequestDto {
    private final CrossAppChallengeInfoDto challengeInfo;

    @NotNull
    private final String deviceModel;

    public CrossAppChallengeRequestDto(CrossAppChallengeInfoDto crossAppChallengeInfoDto, @NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.challengeInfo = crossAppChallengeInfoDto;
        this.deviceModel = deviceModel;
    }

    public final CrossAppChallengeInfoDto getChallengeInfo() {
        return this.challengeInfo;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }
}
