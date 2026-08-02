package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5989b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5990c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f5991d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f5992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5993f = false;

    public a(int i5, int i10, Integer num, long j, long j6, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f5988a = i5;
        this.f5989b = i10;
        this.f5990c = num;
        this.f5991d = pendingIntent;
        this.f5992e = pendingIntent2;
    }

    public final PendingIntent a(n nVar) {
        PendingIntent pendingIntent;
        int i5 = nVar.f6018a;
        if (i5 == 0) {
            PendingIntent pendingIntent2 = this.f5992e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i5 != 1 || (pendingIntent = this.f5991d) == null) {
            return null;
        }
        return pendingIntent;
    }
}
