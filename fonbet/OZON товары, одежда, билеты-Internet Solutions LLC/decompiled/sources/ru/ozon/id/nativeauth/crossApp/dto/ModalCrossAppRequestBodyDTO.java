package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;", "", "sharedStoreKeys", "", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSharedStoreKeyDto;", "challengeInfo", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "<init>", "(Ljava/util/List;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;)V", "getSharedStoreKeys", "()Ljava/util/List;", "getChallengeInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeInfoDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModalCrossAppRequestBodyDTO {
    private final CrossAppChallengeInfoDto challengeInfo;
    private final List<CrossAppSharedStoreKeyDto> sharedStoreKeys;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalCrossAppRequestBodyDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModalCrossAppRequestBodyDTO copy$default(ModalCrossAppRequestBodyDTO modalCrossAppRequestBodyDTO, List list, CrossAppChallengeInfoDto crossAppChallengeInfoDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = modalCrossAppRequestBodyDTO.sharedStoreKeys;
        }
        if ((i11 & 2) != 0) {
            crossAppChallengeInfoDto = modalCrossAppRequestBodyDTO.challengeInfo;
        }
        return modalCrossAppRequestBodyDTO.copy(list, crossAppChallengeInfoDto);
    }

    public final List<CrossAppSharedStoreKeyDto> component1() {
        return this.sharedStoreKeys;
    }

    /* renamed from: component2, reason: from getter */
    public final CrossAppChallengeInfoDto getChallengeInfo() {
        return this.challengeInfo;
    }

    @NotNull
    public final ModalCrossAppRequestBodyDTO copy(List<CrossAppSharedStoreKeyDto> sharedStoreKeys, CrossAppChallengeInfoDto challengeInfo) {
        return new ModalCrossAppRequestBodyDTO(sharedStoreKeys, challengeInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalCrossAppRequestBodyDTO)) {
            return false;
        }
        ModalCrossAppRequestBodyDTO modalCrossAppRequestBodyDTO = (ModalCrossAppRequestBodyDTO) other;
        return Intrinsics.d(this.sharedStoreKeys, modalCrossAppRequestBodyDTO.sharedStoreKeys) && Intrinsics.d(this.challengeInfo, modalCrossAppRequestBodyDTO.challengeInfo);
    }

    public final CrossAppChallengeInfoDto getChallengeInfo() {
        return this.challengeInfo;
    }

    public final List<CrossAppSharedStoreKeyDto> getSharedStoreKeys() {
        return this.sharedStoreKeys;
    }

    public int hashCode() {
        List<CrossAppSharedStoreKeyDto> list = this.sharedStoreKeys;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CrossAppChallengeInfoDto crossAppChallengeInfoDto = this.challengeInfo;
        return hashCode + (crossAppChallengeInfoDto != null ? crossAppChallengeInfoDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModalCrossAppRequestBodyDTO(sharedStoreKeys=" + this.sharedStoreKeys + ", challengeInfo=" + this.challengeInfo + ")";
    }

    public ModalCrossAppRequestBodyDTO(List<CrossAppSharedStoreKeyDto> list, CrossAppChallengeInfoDto crossAppChallengeInfoDto) {
        this.sharedStoreKeys = list;
        this.challengeInfo = crossAppChallengeInfoDto;
    }

    public /* synthetic */ ModalCrossAppRequestBodyDTO(List list, CrossAppChallengeInfoDto crossAppChallengeInfoDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : crossAppChallengeInfoDto);
    }
}
