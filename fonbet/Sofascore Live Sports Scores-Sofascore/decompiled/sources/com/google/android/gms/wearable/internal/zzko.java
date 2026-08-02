package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import defpackage.guo;
import defpackage.vlo;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzko extends zzgo {
    public ListenerHolder a;
    public final IntentFilter[] b;

    public zzko(IntentFilter[] intentFilterArr) {
        this.b = intentFilterArr;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void K1(DataHolder dataHolder) {
        dataHolder.close();
    }

    public final void S1() {
        ListenerHolder listenerHolder = this.a;
        if (listenerHolder != null) {
            listenerHolder.b = null;
        }
        this.a = null;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void X3(zzao zzaoVar) {
        ListenerHolder listenerHolder = this.a;
        if (listenerHolder != null) {
            listenerHolder.a.execute(new vlo(26, listenerHolder, new guo(zzaoVar)));
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final boolean b3(zzgk zzgkVar) {
        return false;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void c4(zzia zziaVar) {
        zziaVar.b.close();
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void I3(ArrayList arrayList) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void N3(zzl zzlVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void O0(zzib zzibVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void T(zzib zzibVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void i2(zzbq zzbqVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void s1(zzhk zzhkVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void u3(zzj zzjVar) {
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void k2(zzhk zzhkVar, zzgj zzgjVar) {
    }
}
