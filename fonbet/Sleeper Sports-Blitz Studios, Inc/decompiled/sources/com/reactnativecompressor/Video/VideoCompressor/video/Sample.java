package com.reactnativecompressor.Video.VideoCompressor.video;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;

/* compiled from: Sample.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/video/Sample;", "", TypedValues.CycleType.S_WAVE_OFFSET, "", RRWebVideoEvent.JsonKeys.SIZE, "<init>", "(JJ)V", "getOffset", "()J", "setOffset", "(J)V", "getSize", "setSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Sample {
    private long offset;
    private long size;

    public static /* synthetic */ Sample copy$default(Sample sample, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sample.offset;
        }
        if ((i & 2) != 0) {
            j2 = sample.size;
        }
        return sample.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final Sample copy(long offset, long size) {
        return new Sample(offset, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sample)) {
            return false;
        }
        Sample sample = (Sample) other;
        return this.offset == sample.offset && this.size == sample.size;
    }

    public int hashCode() {
        return (Long.hashCode(this.offset) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "Sample(offset=" + this.offset + ", size=" + this.size + ")";
    }

    public Sample(long j, long j2) {
        this.offset = j;
        this.size = j2;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final void setOffset(long j) {
        this.offset = j;
    }

    public final void setSize(long j) {
        this.size = j;
    }
}
