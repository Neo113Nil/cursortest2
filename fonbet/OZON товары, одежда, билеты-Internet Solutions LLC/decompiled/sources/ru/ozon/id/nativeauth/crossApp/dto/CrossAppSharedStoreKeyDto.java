package ru.ozon.id.nativeauth.crossApp.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/CrossAppSharedStoreKeyDto;", "", "authPublicKey", "", "fromAppName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthPublicKey", "()Ljava/lang/String;", "getFromAppName", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossAppSharedStoreKeyDto {

    @NotNull
    private final String authPublicKey;

    @NotNull
    private final String fromAppName;

    public CrossAppSharedStoreKeyDto(@NotNull String authPublicKey, @NotNull String fromAppName) {
        Intrinsics.checkNotNullParameter(authPublicKey, "authPublicKey");
        Intrinsics.checkNotNullParameter(fromAppName, "fromAppName");
        this.authPublicKey = authPublicKey;
        this.fromAppName = fromAppName;
    }

    @NotNull
    public final String getAuthPublicKey() {
        return this.authPublicKey;
    }

    @NotNull
    public final String getFromAppName() {
        return this.fromAppName;
    }
}
