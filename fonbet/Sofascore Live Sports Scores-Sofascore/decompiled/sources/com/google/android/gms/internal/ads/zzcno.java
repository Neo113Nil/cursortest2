package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcno extends MutableContextWrapper {
    public Activity a;
    public Context b;
    public Context c;

    public final void a(Intent intent) {
        if (this.a == null) {
            intent.setFlags(268435456);
            this.b.startActivity(intent);
            return;
        }
        String valueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(valueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(valueOf);
        sb.append(" and requestCode: 236");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        this.a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = context instanceof Activity ? (Activity) context : null;
        this.c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.b.startActivity(intent);
        }
    }
}
