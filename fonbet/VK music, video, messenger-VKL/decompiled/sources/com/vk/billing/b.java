package com.vk.billing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.billing.StorePurchasesManager;
import xsna.asu0;
import xsna.j27;
import xsna.v9j;

/* compiled from: GoogleStorePurchasesManagerImpl.kt */
/* loaded from: classes15.dex */
public final class b implements j27 {
    public final /* synthetic */ io.reactivex.rxjava3.subjects.f<StorePurchasesManager.BillingAvailabilityStatus> a;
    public final /* synthetic */ Context b;

    public b(io.reactivex.rxjava3.subjects.f fVar, Context context) {
        this.a = fVar;
        this.b = context;
    }

    @Override // xsna.j27
    public final void a() {
        StorePurchasesManager.BillingAvailabilityStatus billingAvailabilityStatus = this.b.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=")), 64) != null ? StorePurchasesManager.BillingAvailabilityStatus.NOT_AUTHORIZED : StorePurchasesManager.BillingAvailabilityStatus.NOT_AVAILABLE;
        io.reactivex.rxjava3.subjects.f<StorePurchasesManager.BillingAvailabilityStatus> fVar = this.a;
        fVar.onNext(billingAvailabilityStatus);
        fVar.onComplete();
    }

    @Override // xsna.j27
    public final void b() {
        asu0.a.getClass();
        asu0.j().submit(new v9j(2, this.a, this.b));
    }

    @Override // xsna.j27
    public final String getName() {
        return "createBillingAvailabilityObservable";
    }
}
