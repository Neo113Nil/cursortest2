package com.evervault.sdk.core.keys;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/evervault/sdk/core/keys/GeneratedSharedKey;", "", "generatedEcdhKey", "", "sharedKey", "([B[B)V", "getGeneratedEcdhKey", "()[B", "setGeneratedEcdhKey", "([B)V", "getSharedKey", "setSharedKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GeneratedSharedKey {

    @NotNull
    private byte[] generatedEcdhKey;

    @NotNull
    private byte[] sharedKey;

    public GeneratedSharedKey(@NotNull byte[] generatedEcdhKey, @NotNull byte[] sharedKey) {
        Intrinsics.checkNotNullParameter(generatedEcdhKey, "generatedEcdhKey");
        Intrinsics.checkNotNullParameter(sharedKey, "sharedKey");
        this.generatedEcdhKey = generatedEcdhKey;
        this.sharedKey = sharedKey;
    }

    public static /* synthetic */ GeneratedSharedKey copy$default(GeneratedSharedKey generatedSharedKey, byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = generatedSharedKey.generatedEcdhKey;
        }
        if ((i10 & 2) != 0) {
            bArr2 = generatedSharedKey.sharedKey;
        }
        return generatedSharedKey.copy(bArr, bArr2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final byte[] getGeneratedEcdhKey() {
        return this.generatedEcdhKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getSharedKey() {
        return this.sharedKey;
    }

    @NotNull
    public final GeneratedSharedKey copy(@NotNull byte[] generatedEcdhKey, @NotNull byte[] sharedKey) {
        Intrinsics.checkNotNullParameter(generatedEcdhKey, "generatedEcdhKey");
        Intrinsics.checkNotNullParameter(sharedKey, "sharedKey");
        return new GeneratedSharedKey(generatedEcdhKey, sharedKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || GeneratedSharedKey.class != other.getClass()) {
            return false;
        }
        GeneratedSharedKey generatedSharedKey = (GeneratedSharedKey) other;
        return Arrays.equals(this.generatedEcdhKey, generatedSharedKey.generatedEcdhKey) && Arrays.equals(this.sharedKey, generatedSharedKey.sharedKey);
    }

    @NotNull
    public final byte[] getGeneratedEcdhKey() {
        return this.generatedEcdhKey;
    }

    @NotNull
    public final byte[] getSharedKey() {
        return this.sharedKey;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.generatedEcdhKey) * 31) + Arrays.hashCode(this.sharedKey);
    }

    public final void setGeneratedEcdhKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.generatedEcdhKey = bArr;
    }

    public final void setSharedKey(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.sharedKey = bArr;
    }

    @NotNull
    public String toString() {
        return "GeneratedSharedKey(generatedEcdhKey=" + Arrays.toString(this.generatedEcdhKey) + ", sharedKey=" + Arrays.toString(this.sharedKey) + ")";
    }
}
