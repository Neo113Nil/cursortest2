package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069c7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0043b7 f13502a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0069c7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C0095d7 c0095d7) {
        return MessageNano.toByteArray(this.f13502a.fromModel(c0095d7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f13502a.fromModel((C0095d7) obj));
    }

    public C0069c7(@NotNull C0043b7 c0043b7) {
        this.f13502a = c0043b7;
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
    public final C0095d7 toModel(@Nullable byte[] bArr) {
        C0325m7 c0325m7;
        if (bArr != null) {
            try {
                c0325m7 = (C0325m7) MessageNano.mergeFrom(new C0325m7(), bArr);
            } catch (InvalidProtocolBufferNanoException unused) {
                c0325m7 = new C0325m7();
            }
        }
        c0325m7 = new C0325m7();
        return this.f13502a.toModel(c0325m7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0069c7(C0043b7 c0043b7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0043b7);
        if ((i5 & 1) != 0) {
            c0043b7 = new C0043b7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
