package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;

/* compiled from: AndroidGenerateByteStringId.kt */
/* loaded from: classes14.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    public ByteString invoke() {
        return ProtobufExtensionsKt.toByteString(UUID.randomUUID());
    }
}
