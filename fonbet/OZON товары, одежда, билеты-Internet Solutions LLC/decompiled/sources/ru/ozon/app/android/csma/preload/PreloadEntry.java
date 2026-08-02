package ru.ozon.app.android.csma.preload;

import B0.C2454a;
import K00.b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/csma/preload/PreloadEntry;", "", "imageUrl", "", "width", "", "height", "<init>", "(Ljava/lang/String;II)V", "getImageUrl", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PreloadEntry {
    private final int height;

    @NotNull
    private final String imageUrl;
    private final int width;

    public PreloadEntry(@NotNull String imageUrl, int i11, int i12) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.width = i11;
        this.height = i12;
    }

    public static /* synthetic */ PreloadEntry copy$default(PreloadEntry preloadEntry, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = preloadEntry.imageUrl;
        }
        if ((i13 & 2) != 0) {
            i11 = preloadEntry.width;
        }
        if ((i13 & 4) != 0) {
            i12 = preloadEntry.height;
        }
        return preloadEntry.copy(str, i11, i12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final PreloadEntry copy(@NotNull String imageUrl, int width, int height) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new PreloadEntry(imageUrl, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreloadEntry)) {
            return false;
        }
        PreloadEntry preloadEntry = (PreloadEntry) other;
        return Intrinsics.d(this.imageUrl, preloadEntry.imageUrl) && this.width == preloadEntry.width && this.height == preloadEntry.height;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + C2454a.a(this.width, this.imageUrl.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        return b.e(this.height, ")", C3660k.c(this.width, "PreloadEntry(imageUrl=", str, ", width=", ", height="));
    }
}
