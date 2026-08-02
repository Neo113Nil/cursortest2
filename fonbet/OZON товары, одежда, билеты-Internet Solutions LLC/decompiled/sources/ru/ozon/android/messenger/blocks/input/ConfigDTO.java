package ru.ozon.android.messenger.blocks.input;

import B0.C2454a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/input/ConfigDTO;", "", "acceptedMimeTypes", "", "maxFileSize", "", "maxFilesCount", "uploadUrl", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getAcceptedMimeTypes", "()Ljava/lang/String;", "getMaxFileSize", "()I", "getMaxFilesCount", "getUploadUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ConfigDTO {
    public static final int $stable = 0;

    @NotNull
    private final String acceptedMimeTypes;
    private final int maxFileSize;
    private final int maxFilesCount;

    @NotNull
    private final String uploadUrl;

    public ConfigDTO(@NotNull String acceptedMimeTypes, int i11, int i12, @NotNull String uploadUrl) {
        Intrinsics.checkNotNullParameter(acceptedMimeTypes, "acceptedMimeTypes");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        this.acceptedMimeTypes = acceptedMimeTypes;
        this.maxFileSize = i11;
        this.maxFilesCount = i12;
        this.uploadUrl = uploadUrl;
    }

    public static /* synthetic */ ConfigDTO copy$default(ConfigDTO configDTO, String str, int i11, int i12, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = configDTO.acceptedMimeTypes;
        }
        if ((i13 & 2) != 0) {
            i11 = configDTO.maxFileSize;
        }
        if ((i13 & 4) != 0) {
            i12 = configDTO.maxFilesCount;
        }
        if ((i13 & 8) != 0) {
            str2 = configDTO.uploadUrl;
        }
        return configDTO.copy(str, i11, i12, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAcceptedMimeTypes() {
        return this.acceptedMimeTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxFilesCount() {
        return this.maxFilesCount;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @NotNull
    public final ConfigDTO copy(@NotNull String acceptedMimeTypes, int maxFileSize, int maxFilesCount, @NotNull String uploadUrl) {
        Intrinsics.checkNotNullParameter(acceptedMimeTypes, "acceptedMimeTypes");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        return new ConfigDTO(acceptedMimeTypes, maxFileSize, maxFilesCount, uploadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigDTO)) {
            return false;
        }
        ConfigDTO configDTO = (ConfigDTO) other;
        return Intrinsics.d(this.acceptedMimeTypes, configDTO.acceptedMimeTypes) && this.maxFileSize == configDTO.maxFileSize && this.maxFilesCount == configDTO.maxFilesCount && Intrinsics.d(this.uploadUrl, configDTO.uploadUrl);
    }

    @NotNull
    public final String getAcceptedMimeTypes() {
        return this.acceptedMimeTypes;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getMaxFilesCount() {
        return this.maxFilesCount;
    }

    @NotNull
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        return this.uploadUrl.hashCode() + C2454a.a(this.maxFilesCount, C2454a.a(this.maxFileSize, this.acceptedMimeTypes.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.acceptedMimeTypes;
        int i11 = this.maxFileSize;
        int i12 = this.maxFilesCount;
        String str2 = this.uploadUrl;
        StringBuilder c11 = C3660k.c(i11, "ConfigDTO(acceptedMimeTypes=", str, ", maxFileSize=", ", maxFilesCount=");
        c11.append(i12);
        c11.append(", uploadUrl=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }
}
