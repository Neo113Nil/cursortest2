package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/SharedStoreKeysInfoDto;", "", "selectedKeyInfo", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "unauthorizedKeys", "", "", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;Ljava/util/List;)V", "getSelectedKeyInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "getUnauthorizedKeys", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SharedStoreKeysInfoDto {
    private final CrossAppSelectedKeyDto selectedKeyInfo;
    private final List<String> unauthorizedKeys;

    public SharedStoreKeysInfoDto(CrossAppSelectedKeyDto crossAppSelectedKeyDto, List<String> list) {
        this.selectedKeyInfo = crossAppSelectedKeyDto;
        this.unauthorizedKeys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedStoreKeysInfoDto copy$default(SharedStoreKeysInfoDto sharedStoreKeysInfoDto, CrossAppSelectedKeyDto crossAppSelectedKeyDto, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            crossAppSelectedKeyDto = sharedStoreKeysInfoDto.selectedKeyInfo;
        }
        if ((i11 & 2) != 0) {
            list = sharedStoreKeysInfoDto.unauthorizedKeys;
        }
        return sharedStoreKeysInfoDto.copy(crossAppSelectedKeyDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CrossAppSelectedKeyDto getSelectedKeyInfo() {
        return this.selectedKeyInfo;
    }

    public final List<String> component2() {
        return this.unauthorizedKeys;
    }

    @NotNull
    public final SharedStoreKeysInfoDto copy(CrossAppSelectedKeyDto selectedKeyInfo, List<String> unauthorizedKeys) {
        return new SharedStoreKeysInfoDto(selectedKeyInfo, unauthorizedKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedStoreKeysInfoDto)) {
            return false;
        }
        SharedStoreKeysInfoDto sharedStoreKeysInfoDto = (SharedStoreKeysInfoDto) other;
        return Intrinsics.d(this.selectedKeyInfo, sharedStoreKeysInfoDto.selectedKeyInfo) && Intrinsics.d(this.unauthorizedKeys, sharedStoreKeysInfoDto.unauthorizedKeys);
    }

    public final CrossAppSelectedKeyDto getSelectedKeyInfo() {
        return this.selectedKeyInfo;
    }

    public final List<String> getUnauthorizedKeys() {
        return this.unauthorizedKeys;
    }

    public int hashCode() {
        CrossAppSelectedKeyDto crossAppSelectedKeyDto = this.selectedKeyInfo;
        int hashCode = (crossAppSelectedKeyDto == null ? 0 : crossAppSelectedKeyDto.hashCode()) * 31;
        List<String> list = this.unauthorizedKeys;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SharedStoreKeysInfoDto(selectedKeyInfo=" + this.selectedKeyInfo + ", unauthorizedKeys=" + this.unauthorizedKeys + ")";
    }
}
