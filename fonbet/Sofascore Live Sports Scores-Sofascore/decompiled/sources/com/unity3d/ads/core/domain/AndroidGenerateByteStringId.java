package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGenerateByteStringId;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "<init>", "()V", "invoke", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    @NotNull
    public ByteString invoke() {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        return ProtobufExtensionsKt.toByteString(randomUUID);
    }
}
