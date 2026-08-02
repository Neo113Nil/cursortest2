package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.m;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes2.dex */
public abstract class i1 {

    class a implements OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            com.applovin.impl.sdk.m.a(new m.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.i1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i1.b(context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) {
        com.applovin.impl.sdk.m.a(v.b(context));
        if (q7.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
