package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"createAdErrorInfo", "Lcom/moloco/sdk/publisher/MolocoAdError;", "adUnitId", "", "errorType", "Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MolocoAdErrorKt {
    @NotNull
    public static final MolocoAdError createAdErrorInfo(@NotNull String str, @NotNull MolocoAdError.ErrorType errorType) {
        str.getClass();
        errorType.getClass();
        return new MolocoAdError("Moloco", str, errorType, null, 8, null);
    }
}
