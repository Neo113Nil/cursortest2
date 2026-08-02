package ru.ozon.id.nativeauth.crossApp.migration.data.model;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/migration/data/model/PublicKeyBindMobileResponseDto;", "", "authPublicKeys", "", "", "<init>", "(Ljava/util/List;)V", "getAuthPublicKeys", "()Ljava/util/List;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicKeyBindMobileResponseDto {
    private final List<String> authPublicKeys;

    public PublicKeyBindMobileResponseDto(List<String> list) {
        this.authPublicKeys = list;
    }

    public final List<String> getAuthPublicKeys() {
        return this.authPublicKeys;
    }
}
