package com.evervault.sdk.core;

import com.twilio.voice.EventKeys;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/evervault/sdk/core/EncryptedData;", "", EventKeys.DATA, "", "keyIv", "([B[B)V", "getData", "()[B", "getKeyIv", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EncryptedData {

    @NotNull
    private final byte[] data;

    @NotNull
    private final byte[] keyIv;

    public EncryptedData(@NotNull byte[] data, @NotNull byte[] keyIv) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(keyIv, "keyIv");
        this.data = data;
        this.keyIv = keyIv;
    }

    public static /* synthetic */ EncryptedData copy$default(EncryptedData encryptedData, byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = encryptedData.data;
        }
        if ((i10 & 2) != 0) {
            bArr2 = encryptedData.keyIv;
        }
        return encryptedData.copy(bArr, bArr2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getKeyIv() {
        return this.keyIv;
    }

    @NotNull
    public final EncryptedData copy(@NotNull byte[] data, @NotNull byte[] keyIv) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(keyIv, "keyIv");
        return new EncryptedData(data, keyIv);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedData)) {
            return false;
        }
        EncryptedData encryptedData = (EncryptedData) other;
        return Intrinsics.areEqual(this.data, encryptedData.data) && Intrinsics.areEqual(this.keyIv, encryptedData.keyIv);
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final byte[] getKeyIv() {
        return this.keyIv;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.data) * 31) + Arrays.hashCode(this.keyIv);
    }

    @NotNull
    public String toString() {
        return "EncryptedData(data=" + Arrays.toString(this.data) + ", keyIv=" + Arrays.toString(this.keyIv) + ")";
    }
}
