package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class K implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final M f15312a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull J j) {
        return MessageNano.toByteArray(this.f15312a.fromModel(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f15312a.fromModel((J) obj));
    }

    public K(@NotNull M m6) {
        this.f15312a = m6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(@NotNull byte[] bArr) {
        S s8;
        try {
            s8 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s8 = new S();
        }
        return this.f15312a.toModel(s8);
    }

    public /* synthetic */ K(M m6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new M(null, 1, null) : m6);
    }
}
