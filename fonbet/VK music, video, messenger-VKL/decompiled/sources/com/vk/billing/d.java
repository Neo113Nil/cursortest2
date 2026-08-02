package com.vk.billing;

import android.app.Activity;
import com.vk.billing.StorePurchasesManager;
import java.util.ArrayList;
import xsna.ang;
import xsna.mge0;

/* compiled from: InternalPurchasesManager.kt */
/* loaded from: classes.dex */
public interface d {
    io.reactivex.rxjava3.disposables.c i(Activity activity, ArrayList arrayList, ang.a aVar, Boolean bool, Boolean bool2);

    io.reactivex.rxjava3.disposables.c j(Activity activity, StorePurchasesManager.a aVar, mge0 mge0Var);

    <D extends mge0> io.reactivex.rxjava3.disposables.c k(Activity activity, D d, StorePurchasesManager.a<D> aVar, Boolean bool, Boolean bool2);
}
