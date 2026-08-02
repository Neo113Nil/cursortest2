package com.google.android.play.core.review;

import Na.f;
import Na.g;
import Oa.i;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public final String f36660d;

    public c(g gVar, TaskCompletionSource taskCompletionSource, String str) {
        super(gVar, new i("OnRequestInstallCallback"), taskCompletionSource);
        this.f36660d = str;
    }

    @Override // Na.f, Oa.h
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        this.f7981b.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
