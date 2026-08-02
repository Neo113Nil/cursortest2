package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Mf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f12593a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f12594b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f12595c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f12596d;

    public Mf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f12593a = str;
        this.f12594b = iBinaryDataHelper;
        this.f12595c = protobufStateSerializer;
        this.f12596d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f12594b.remove(this.f12593a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f12594b.get(this.f12593a);
            if (bArr != null && bArr.length != 0) {
                return this.f12596d.toModel((MessageNano) this.f12595c.toState(bArr));
            }
            return this.f12596d.toModel((MessageNano) this.f12595c.defaultValue());
        } catch (Throwable unused) {
            return this.f12596d.toModel((MessageNano) this.f12595c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f12594b.insert(this.f12593a, this.f12595c.toByteArray((MessageNano) this.f12596d.fromModel(obj)));
    }
}
