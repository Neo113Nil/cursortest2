package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class A8 extends B8 implements ProtobufStateSerializer {
    public A8(@NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull AESEncrypter aESEncrypter) {
        super(protobufStateSerializer, aESEncrypter);
    }
}
