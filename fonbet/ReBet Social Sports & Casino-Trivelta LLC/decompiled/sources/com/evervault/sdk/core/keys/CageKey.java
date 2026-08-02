package com.evervault.sdk.core.keys;

import com.evervault.sdk.core.utils.EcPointCompressKt;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/evervault/sdk/core/keys/CageKey;", "", "publicKey", "", "isDebugMode", "", "(Ljava/lang/String;Z)V", "ecdhP256Key", "ecdhP256KeyUncompressed", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getEcdhP256Key", "()Ljava/lang/String;", "getEcdhP256KeyUncompressed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CageKey {

    @NotNull
    private final String ecdhP256Key;

    @NotNull
    private final String ecdhP256KeyUncompressed;
    private final boolean isDebugMode;

    public CageKey(@NotNull String ecdhP256Key, @NotNull String ecdhP256KeyUncompressed, boolean z10) {
        Intrinsics.checkNotNullParameter(ecdhP256Key, "ecdhP256Key");
        Intrinsics.checkNotNullParameter(ecdhP256KeyUncompressed, "ecdhP256KeyUncompressed");
        this.ecdhP256Key = ecdhP256Key;
        this.ecdhP256KeyUncompressed = ecdhP256KeyUncompressed;
        this.isDebugMode = z10;
    }

    public static /* synthetic */ CageKey copy$default(CageKey cageKey, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cageKey.ecdhP256Key;
        }
        if ((i10 & 2) != 0) {
            str2 = cageKey.ecdhP256KeyUncompressed;
        }
        if ((i10 & 4) != 0) {
            z10 = cageKey.isDebugMode;
        }
        return cageKey.copy(str, str2, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEcdhP256Key() {
        return this.ecdhP256Key;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEcdhP256KeyUncompressed() {
        return this.ecdhP256KeyUncompressed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDebugMode() {
        return this.isDebugMode;
    }

    @NotNull
    public final CageKey copy(@NotNull String ecdhP256Key, @NotNull String ecdhP256KeyUncompressed, boolean isDebugMode) {
        Intrinsics.checkNotNullParameter(ecdhP256Key, "ecdhP256Key");
        Intrinsics.checkNotNullParameter(ecdhP256KeyUncompressed, "ecdhP256KeyUncompressed");
        return new CageKey(ecdhP256Key, ecdhP256KeyUncompressed, isDebugMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CageKey)) {
            return false;
        }
        CageKey cageKey = (CageKey) other;
        return Intrinsics.areEqual(this.ecdhP256Key, cageKey.ecdhP256Key) && Intrinsics.areEqual(this.ecdhP256KeyUncompressed, cageKey.ecdhP256KeyUncompressed) && this.isDebugMode == cageKey.isDebugMode;
    }

    @NotNull
    public final String getEcdhP256Key() {
        return this.ecdhP256Key;
    }

    @NotNull
    public final String getEcdhP256KeyUncompressed() {
        return this.ecdhP256KeyUncompressed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.ecdhP256Key.hashCode() * 31) + this.ecdhP256KeyUncompressed.hashCode()) * 31;
        boolean z10 = this.isDebugMode;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    @NotNull
    public String toString() {
        return "CageKey(ecdhP256Key=" + this.ecdhP256Key + ", ecdhP256KeyUncompressed=" + this.ecdhP256KeyUncompressed + ", isDebugMode=" + this.isDebugMode + ")";
    }

    public /* synthetic */ CageKey(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CageKey(@NotNull String publicKey, boolean z10) {
        this(Base64.encode$default(r1, EcPointCompressKt.ecPointCompress(Base64.decode$default(r1, publicKey, 0, 0, 6, (Object) null)), 0, 0, 6, null), publicKey, z10);
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Base64.Companion companion = Base64.INSTANCE;
    }
}
