package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d implements c {
    public final com.moloco.sdk.acm.a a;
    public final Context b;

    public d(com.moloco.sdk.acm.a config, Context context) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = config;
        this.b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.c
    public void a() {
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Data a = e.a(MapsKt.mapOf(TuplesKt.to("url", this.a.g()), TuplesKt.to(com.moloco.sdk.acm.b.e, this.a.f().get(com.moloco.sdk.acm.b.e)), TuplesKt.to(com.moloco.sdk.acm.b.f, this.a.f().get(com.moloco.sdk.acm.b.f)), TuplesKt.to(com.moloco.sdk.acm.b.g, this.a.f().get(com.moloco.sdk.acm.b.g)), TuplesKt.to(com.moloco.sdk.acm.b.d, this.a.f().get(com.moloco.sdk.acm.b.d)), TuplesKt.to("osv", this.a.f().get("osv")), TuplesKt.to(com.moloco.sdk.acm.b.h, this.a.f().get(com.moloco.sdk.acm.b.h)), TuplesKt.to(com.moloco.sdk.acm.b.b, this.a.f().get(com.moloco.sdk.acm.b.b))));
        if (a == null) {
            return;
        }
        WorkManager.getInstance(this.b).enqueue(new OneTimeWorkRequest.Builder(DBRequestWorker.class).setConstraints(build).setInputData(a).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).build());
    }
}
