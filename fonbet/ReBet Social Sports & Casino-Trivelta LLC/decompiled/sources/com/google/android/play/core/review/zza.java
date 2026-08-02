package com.google.android.play.core.review;

import android.app.PendingIntent;

/* loaded from: classes3.dex */
final class zza extends ReviewInfo {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f36661a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36662b;

    public zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f36661a = pendingIntent;
        this.f36662b = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f36661a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.f36662b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f36661a.equals(reviewInfo.a()) && this.f36662b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36661a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f36662b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f36661a.toString() + ", isNoOp=" + this.f36662b + "}";
    }
}
