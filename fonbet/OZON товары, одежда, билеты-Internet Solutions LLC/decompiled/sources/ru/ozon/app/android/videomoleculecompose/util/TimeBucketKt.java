package ru.ozon.app.android.videomoleculecompose.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"roundDownToTimeBucket", "", "bucketMs", "maxValue", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeBucketKt {
    public static final long roundDownToTimeBucket(long j11, long j12, long j13) {
        if (j12 <= 0) {
            if (j11 <= j13) {
                return j11;
            }
        } else if (j11 < j13) {
            long j14 = j11 % j12;
            return j11 - (j14 + (j12 & (((j14 ^ j12) & ((-j14) | j14)) >> 63)));
        }
        return j13;
    }
}
