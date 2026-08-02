package com.evervault.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001*Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003Je\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/evervault/sdk/EncryptionConfig;", "", "publicKey", "", "cipherAlgorithm", "keyLength", "", "ivLength", "authTagLength", "publicHash", "evVersion", "maxFileSizeInMB", "maxFileSizeInBytes", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;II)V", "getAuthTagLength", "()I", "getCipherAlgorithm", "()Ljava/lang/String;", "getEvVersion", "getIvLength", "getKeyLength", "getMaxFileSizeInBytes", "getMaxFileSizeInMB", "getPublicHash", "getPublicKey", "setPublicKey", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Header", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EncryptionConfig {
    private final int authTagLength;

    @NotNull
    private final String cipherAlgorithm;

    @NotNull
    private final String evVersion;
    private final int ivLength;
    private final int keyLength;
    private final int maxFileSizeInBytes;
    private final int maxFileSizeInMB;

    @NotNull
    private final String publicHash;

    @Nullable
    private String publicKey;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/evervault/sdk/EncryptionConfig$Header;", "", "iss", "", "version", "", "(Ljava/lang/String;I)V", "getIss", "()Ljava/lang/String;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Header {

        @NotNull
        private final String iss;
        private final int version;

        public Header(@NotNull String iss, int i10) {
            Intrinsics.checkNotNullParameter(iss, "iss");
            this.iss = iss;
            this.version = i10;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.iss;
            }
            if ((i11 & 2) != 0) {
                i10 = header.version;
            }
            return header.copy(str, i10);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIss() {
            return this.iss;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @NotNull
        public final Header copy(@NotNull String iss, int version) {
            Intrinsics.checkNotNullParameter(iss, "iss");
            return new Header(iss, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.iss, header.iss) && this.version == header.version;
        }

        @NotNull
        public final String getIss() {
            return this.iss;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            return (this.iss.hashCode() * 31) + Integer.hashCode(this.version);
        }

        @NotNull
        public String toString() {
            return "Header(iss=" + this.iss + ", version=" + this.version + ")";
        }
    }

    public EncryptionConfig() {
        this(null, null, 0, 0, 0, null, null, 0, 0, 511, null);
    }

    public static /* synthetic */ EncryptionConfig copy$default(EncryptionConfig encryptionConfig, String str, String str2, int i10, int i11, int i12, String str3, String str4, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = encryptionConfig.publicKey;
        }
        if ((i15 & 2) != 0) {
            str2 = encryptionConfig.cipherAlgorithm;
        }
        if ((i15 & 4) != 0) {
            i10 = encryptionConfig.keyLength;
        }
        if ((i15 & 8) != 0) {
            i11 = encryptionConfig.ivLength;
        }
        if ((i15 & 16) != 0) {
            i12 = encryptionConfig.authTagLength;
        }
        if ((i15 & 32) != 0) {
            str3 = encryptionConfig.publicHash;
        }
        if ((i15 & 64) != 0) {
            str4 = encryptionConfig.evVersion;
        }
        if ((i15 & 128) != 0) {
            i13 = encryptionConfig.maxFileSizeInMB;
        }
        if ((i15 & 256) != 0) {
            i14 = encryptionConfig.maxFileSizeInBytes;
        }
        int i16 = i13;
        int i17 = i14;
        String str5 = str3;
        String str6 = str4;
        int i18 = i12;
        int i19 = i10;
        return encryptionConfig.copy(str, str2, i19, i11, i18, str5, str6, i16, i17);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCipherAlgorithm() {
        return this.cipherAlgorithm;
    }

    /* renamed from: component3, reason: from getter */
    public final int getKeyLength() {
        return this.keyLength;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIvLength() {
        return this.ivLength;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAuthTagLength() {
        return this.authTagLength;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPublicHash() {
        return this.publicHash;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getEvVersion() {
        return this.evVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMaxFileSizeInMB() {
        return this.maxFileSizeInMB;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxFileSizeInBytes() {
        return this.maxFileSizeInBytes;
    }

    @NotNull
    public final EncryptionConfig copy(@Nullable String publicKey, @NotNull String cipherAlgorithm, int keyLength, int ivLength, int authTagLength, @NotNull String publicHash, @NotNull String evVersion, int maxFileSizeInMB, int maxFileSizeInBytes) {
        Intrinsics.checkNotNullParameter(cipherAlgorithm, "cipherAlgorithm");
        Intrinsics.checkNotNullParameter(publicHash, "publicHash");
        Intrinsics.checkNotNullParameter(evVersion, "evVersion");
        return new EncryptionConfig(publicKey, cipherAlgorithm, keyLength, ivLength, authTagLength, publicHash, evVersion, maxFileSizeInMB, maxFileSizeInBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptionConfig)) {
            return false;
        }
        EncryptionConfig encryptionConfig = (EncryptionConfig) other;
        return Intrinsics.areEqual(this.publicKey, encryptionConfig.publicKey) && Intrinsics.areEqual(this.cipherAlgorithm, encryptionConfig.cipherAlgorithm) && this.keyLength == encryptionConfig.keyLength && this.ivLength == encryptionConfig.ivLength && this.authTagLength == encryptionConfig.authTagLength && Intrinsics.areEqual(this.publicHash, encryptionConfig.publicHash) && Intrinsics.areEqual(this.evVersion, encryptionConfig.evVersion) && this.maxFileSizeInMB == encryptionConfig.maxFileSizeInMB && this.maxFileSizeInBytes == encryptionConfig.maxFileSizeInBytes;
    }

    public final int getAuthTagLength() {
        return this.authTagLength;
    }

    @NotNull
    public final String getCipherAlgorithm() {
        return this.cipherAlgorithm;
    }

    @NotNull
    public final String getEvVersion() {
        return this.evVersion;
    }

    public final int getIvLength() {
        return this.ivLength;
    }

    public final int getKeyLength() {
        return this.keyLength;
    }

    public final int getMaxFileSizeInBytes() {
        return this.maxFileSizeInBytes;
    }

    public final int getMaxFileSizeInMB() {
        return this.maxFileSizeInMB;
    }

    @NotNull
    public final String getPublicHash() {
        return this.publicHash;
    }

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.publicKey;
        return ((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.cipherAlgorithm.hashCode()) * 31) + Integer.hashCode(this.keyLength)) * 31) + Integer.hashCode(this.ivLength)) * 31) + Integer.hashCode(this.authTagLength)) * 31) + this.publicHash.hashCode()) * 31) + this.evVersion.hashCode()) * 31) + Integer.hashCode(this.maxFileSizeInMB)) * 31) + Integer.hashCode(this.maxFileSizeInBytes);
    }

    public final void setPublicKey(@Nullable String str) {
        this.publicKey = str;
    }

    @NotNull
    public String toString() {
        return "EncryptionConfig(publicKey=" + this.publicKey + ", cipherAlgorithm=" + this.cipherAlgorithm + ", keyLength=" + this.keyLength + ", ivLength=" + this.ivLength + ", authTagLength=" + this.authTagLength + ", publicHash=" + this.publicHash + ", evVersion=" + this.evVersion + ", maxFileSizeInMB=" + this.maxFileSizeInMB + ", maxFileSizeInBytes=" + this.maxFileSizeInBytes + ")";
    }

    public EncryptionConfig(@Nullable String str, @NotNull String cipherAlgorithm, int i10, int i11, int i12, @NotNull String publicHash, @NotNull String evVersion, int i13, int i14) {
        Intrinsics.checkNotNullParameter(cipherAlgorithm, "cipherAlgorithm");
        Intrinsics.checkNotNullParameter(publicHash, "publicHash");
        Intrinsics.checkNotNullParameter(evVersion, "evVersion");
        this.publicKey = str;
        this.cipherAlgorithm = cipherAlgorithm;
        this.keyLength = i10;
        this.ivLength = i11;
        this.authTagLength = i12;
        this.publicHash = publicHash;
        this.evVersion = evVersion;
        this.maxFileSizeInMB = i13;
        this.maxFileSizeInBytes = i14;
    }

    public /* synthetic */ EncryptionConfig(String str, String str2, int i10, int i11, int i12, String str3, String str4, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? "aes-256-gcm" : str2, (i15 & 4) != 0 ? 32 : i10, (i15 & 8) != 0 ? 12 : i11, (i15 & 16) != 0 ? 128 : i12, (i15 & 32) != 0 ? "sha256" : str3, (i15 & 64) != 0 ? "NOC" : str4, (i15 & 128) != 0 ? 25 : i13, (i15 & 256) != 0 ? 26214400 : i14);
    }
}
