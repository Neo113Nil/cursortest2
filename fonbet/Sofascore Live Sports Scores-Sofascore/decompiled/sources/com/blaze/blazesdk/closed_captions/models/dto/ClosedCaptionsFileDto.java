package com.blaze.blazesdk.closed_captions.models.dto;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsFileDto;", "", "url", "", "fileSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getUrl", "()Ljava/lang/String;", "getFileSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsFileDto;", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClosedCaptionsFileDto {
    public static final int $stable = 0;

    @b6h("fileSize")
    @Nullable
    private final Float fileSize;

    @b6h("url")
    @Nullable
    private final String url;

    public ClosedCaptionsFileDto(@Nullable String str, @Nullable Float f) {
        this.url = str;
        this.fileSize = f;
    }

    public static /* synthetic */ ClosedCaptionsFileDto copy$default(ClosedCaptionsFileDto closedCaptionsFileDto, String str, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closedCaptionsFileDto.url;
        }
        if ((i & 2) != 0) {
            f = closedCaptionsFileDto.fileSize;
        }
        return closedCaptionsFileDto.copy(str, f);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final ClosedCaptionsFileDto copy(@Nullable String url, @Nullable Float fileSize) {
        return new ClosedCaptionsFileDto(url, fileSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClosedCaptionsFileDto)) {
            return false;
        }
        ClosedCaptionsFileDto closedCaptionsFileDto = (ClosedCaptionsFileDto) other;
        return Intrinsics.c(this.url, closedCaptionsFileDto.url) && Intrinsics.c(this.fileSize, closedCaptionsFileDto.fileSize);
    }

    @Nullable
    public final Float getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.fileSize;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClosedCaptionsFileDto(url=" + this.url + ", fileSize=" + this.fileSize + ')';
    }
}
