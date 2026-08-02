package ru.ozon.id.nativeauth.crossApp.autologin.data.dto;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppSelectedKeyDto;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDto;", "", "selectedKeyInfo", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "unauthorizedKeys", "", "", "<init>", "(Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;Ljava/util/List;)V", "getSelectedKeyInfo", "()Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSelectedKeyDto;", "getUnauthorizedKeys", "()Ljava/util/List;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InitAutologinResponseDto {
    private final CrossAppSelectedKeyDto selectedKeyInfo;
    private final List<String> unauthorizedKeys;

    public InitAutologinResponseDto(CrossAppSelectedKeyDto crossAppSelectedKeyDto, List<String> list) {
        this.selectedKeyInfo = crossAppSelectedKeyDto;
        this.unauthorizedKeys = list;
    }

    public final CrossAppSelectedKeyDto getSelectedKeyInfo() {
        return this.selectedKeyInfo;
    }

    public final List<String> getUnauthorizedKeys() {
        return this.unauthorizedKeys;
    }
}
