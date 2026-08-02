package com.google.mlkit.common.sdkinternal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import ti.C9876a;

/* loaded from: classes9.dex */
public final /* synthetic */ class C implements OnFailureListener, Ib.b {
    public static void a(C9876a c9876a, s10.f fVar) {
        c9876a.f99546a = fVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }
}
