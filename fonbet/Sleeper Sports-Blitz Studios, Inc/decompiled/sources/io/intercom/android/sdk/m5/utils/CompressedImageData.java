package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaCompression.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "", "uri", "Landroid/net/Uri;", "width", "", "height", RRWebVideoEvent.JsonKeys.SIZE, "", "<init>", "(Landroid/net/Uri;IIJ)V", "getUri", "()Landroid/net/Uri;", "getWidth", "()I", "getHeight", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class CompressedImageData {
    private final int height;
    private final long size;
    private final Uri uri;
    private final int width;

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uri = compressedImageData.uri;
        }
        if ((i3 & 2) != 0) {
            i = compressedImageData.width;
        }
        if ((i3 & 4) != 0) {
            i2 = compressedImageData.height;
        }
        if ((i3 & 8) != 0) {
            j = compressedImageData.size;
        }
        int i4 = i2;
        return compressedImageData.copy(uri, i, i4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final CompressedImageData copy(Uri uri, int width, int height, long size) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new CompressedImageData(uri, width, height, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) other;
        return Intrinsics.areEqual(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "CompressedImageData(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ')';
    }

    public CompressedImageData(Uri uri, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.width = i;
        this.height = i2;
        this.size = j;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }
}
