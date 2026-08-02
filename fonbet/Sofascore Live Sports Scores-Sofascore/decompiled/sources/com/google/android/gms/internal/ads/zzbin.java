package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.msg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbin {
    public final Context a;

    public zzbin(Context context) {
        Preconditions.j(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a() {
        msg msgVar = msg.b;
        Context context = this.a;
        return ((Boolean) zzcb.zza(context, msgVar)).booleanValue() && Wrappers.a(context).a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean b(Intent intent) {
        Preconditions.j(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
