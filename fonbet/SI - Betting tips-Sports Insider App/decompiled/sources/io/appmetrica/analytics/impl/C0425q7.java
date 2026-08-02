package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425q7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0400p7 f14503a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0425q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C0449r7 c0449r7) {
        return MessageNano.toByteArray(this.f14503a.fromModel(c0449r7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f14503a.fromModel((C0449r7) obj));
    }

    public C0425q7(@NotNull C0400p7 c0400p7) {
        this.f14503a = c0400p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0449r7 toModel(@Nullable byte[] bArr) {
        C0375o7 c0375o7;
        if (bArr != null) {
            try {
                c0375o7 = (C0375o7) MessageNano.mergeFrom(new C0375o7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0375o7 = new C0375o7();
            }
        }
        c0375o7 = new C0375o7();
        return this.f14503a.toModel(c0375o7);
    }

    public /* synthetic */ C0425q7(C0400p7 c0400p7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0400p7(null, 1, null) : c0400p7);
    }
}
