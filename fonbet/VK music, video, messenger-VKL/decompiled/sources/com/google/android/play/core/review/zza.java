package com.google.android.play.core.review;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
final class zza extends ReviewInfo {
    public final PendingIntent b;
    public final boolean c;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.b = pendingIntent;
        this.c = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent d() {
        return this.b;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.b.equals(reviewInfo.d()) && this.c == reviewInfo.e();
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.b.toString() + ", isNoOp=" + this.c + "}";
    }
}
