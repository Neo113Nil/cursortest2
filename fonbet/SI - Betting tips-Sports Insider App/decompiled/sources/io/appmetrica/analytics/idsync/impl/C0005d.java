package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005d implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f11862a;

    public C0005d(@NotNull C0006e c0006e) {
        this.f11862a = c0006e;
    }

    @NotNull
    public final byte[] a(@NotNull IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f11862a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f11862a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@NotNull byte[] bArr) {
        return this.f11862a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
