package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/StorageFileDto;", "", "imageUrl", "", "<init>", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StorageFileDto {
    public static final int $stable = 0;

    @b6h("url")
    @NotNull
    private final String imageUrl;

    public StorageFileDto(@NotNull String str) {
        str.getClass();
        this.imageUrl = str;
    }

    public static /* synthetic */ StorageFileDto copy$default(StorageFileDto storageFileDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storageFileDto.imageUrl;
        }
        return storageFileDto.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final StorageFileDto copy(@NotNull String imageUrl) {
        imageUrl.getClass();
        return new StorageFileDto(imageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StorageFileDto) && Intrinsics.c(this.imageUrl, ((StorageFileDto) other).imageUrl);
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return this.imageUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.q(new StringBuilder("StorageFileDto(imageUrl="), this.imageUrl, ')');
    }
}
