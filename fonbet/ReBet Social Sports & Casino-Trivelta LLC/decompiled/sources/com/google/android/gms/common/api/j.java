package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

/* loaded from: classes2.dex */
public class j extends b {
    public j(Status status) {
        super(status);
    }

    public PendingIntent a() {
        return getStatus().h();
    }

    public void b(Activity activity, int i10) {
        getStatus().m(activity, i10);
    }
}
