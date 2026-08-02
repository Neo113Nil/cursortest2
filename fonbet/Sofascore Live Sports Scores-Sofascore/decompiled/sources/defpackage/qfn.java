package defpackage;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.wearable.WearableListenerService;
import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.internal.zzao;
import com.google.android.gms.wearable.internal.zzbq;
import com.google.android.gms.wearable.internal.zzgj;
import com.google.android.gms.wearable.internal.zzgk;
import com.google.android.gms.wearable.internal.zzgn;
import com.google.android.gms.wearable.internal.zzgo;
import com.google.android.gms.wearable.internal.zzgp;
import com.google.android.gms.wearable.internal.zzhk;
import com.google.android.gms.wearable.internal.zzia;
import com.google.android.gms.wearable.internal.zzib;
import com.google.android.gms.wearable.internal.zzj;
import com.google.android.gms.wearable.internal.zzkg;
import com.google.android.gms.wearable.internal.zzkp;
import com.google.android.gms.wearable.internal.zzl;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qfn extends zzgo {
    public final WeakReference a;
    public volatile int b = -1;

    public qfn(WearableListenerService wearableListenerService) {
        this.a = new WeakReference(wearableListenerService);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void I3(ArrayList arrayList) {
        Z1(new pyn(this, arrayList, false, 25), "onConnectedNodes", arrayList);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void K1(DataHolder dataHolder) {
        yuo yuoVar = new yuo(this, dataHolder, false, 11);
        try {
            String valueOf = String.valueOf(dataHolder);
            int i = dataHolder.h;
            StringBuilder sb = new StringBuilder(valueOf.length() + 7 + String.valueOf(i).length());
            sb.append(valueOf);
            sb.append(", rows=");
            sb.append(i);
            if (Z1(yuoVar, "onDataItemChanged", sb.toString())) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void N3(zzl zzlVar) {
        Z1(new b8n(this, zzlVar, 0), "onNotificationReceived", zzlVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void O0(zzib zzibVar) {
        Z1(new b8n(this, zzibVar, 3), "onPeerDisconnected", zzibVar);
    }

    public final WearableListenerService S1(String str) {
        WearableListenerService wearableListenerService = (WearableListenerService) this.a.get();
        if (wearableListenerService != null || !Log.isLoggable("WearableLS", 3)) {
            return wearableListenerService;
        }
        str.concat(": service reference no longer valid");
        return null;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void T(zzib zzibVar) {
        Z1(new b8n(this, zzibVar, 2), "onPeerConnected", zzibVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void X3(zzao zzaoVar) {
        Z1(new a8p(this, zzaoVar, false, 27), "onConnectedCapabilityChanged", zzaoVar);
    }

    public final boolean Z1(Runnable runnable, String str, Object obj) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("postEvent (");
        sb.append(str);
        sb.append(")");
        WearableListenerService S1 = S1(sb.toString());
        if (S1 != null) {
            if (Log.isLoggable("WearableLS", 3)) {
                String.format("%s: %s %s", str, S1.a, obj);
            }
            if (l2(S1)) {
                synchronized (S1.f) {
                    try {
                        if (S1.g) {
                            return false;
                        }
                        S1.b.post(runnable);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final boolean b3(zzgk zzgkVar) {
        zzgp zzgnVar;
        WearableListenerService S1 = S1("onGetService");
        if (S1 != null) {
            if (Log.isLoggable("WearableLS", 3)) {
                Objects.toString(S1.a);
            }
            if (l2(S1)) {
                try {
                    zzkg zzkgVar = new zzkg(S1.getPackageName());
                    qfn qfnVar = S1.c;
                    if (qfnVar == null) {
                        zzgnVar = null;
                    } else {
                        IInterface queryLocalInterface = qfnVar.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                        zzgnVar = queryLocalInterface instanceof zzgp ? (zzgp) queryLocalInterface : new zzgn(qfnVar);
                    }
                    Parcel S12 = zzgkVar.S1();
                    int i = zzc.a;
                    S12.writeInt(1);
                    zzkgVar.writeToParcel(S12, 0);
                    zzc.b(S12, zzgnVar);
                    zzgkVar.J(S12, 1);
                    return true;
                } catch (RemoteException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void c4(zzia zziaVar) {
        a8p a8pVar = new a8p(29, this, zziaVar);
        DataHolder dataHolder = zziaVar.b;
        int i = dataHolder.h;
        if (Z1(a8pVar, "onNodeMigrated", fn0.k(i, "DataHolder[rows=", U3.j.e, new StringBuilder(String.valueOf(i).length() + 17)))) {
            return;
        }
        dataHolder.close();
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void i2(zzbq zzbqVar) {
        Z1(new a(this, zzbqVar), "onChannelEvent", zzbqVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void k2(zzhk zzhkVar, zzgj zzgjVar) {
        if (Z1(new lv4(this, zzgjVar, zzhkVar), "onRequestReceived", zzhkVar)) {
            return;
        }
        try {
            zzgjVar.Z1(false, null);
        } catch (RemoteException unused) {
        }
    }

    public final boolean l2(WearableListenerService wearableListenerService) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.b) {
            return true;
        }
        if ((zzkp.a(wearableListenerService).b() && UidVerifier.b(wearableListenerService, callingUid, "com.google.android.wearable.app.cn")) || UidVerifier.a(callingUid, wearableListenerService)) {
            this.b = callingUid;
            return true;
        }
        new StringBuilder(String.valueOf(callingUid).length() + 46);
        return false;
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void s1(zzhk zzhkVar) {
        Z1(new vvo(this, zzhkVar, false, 9), "onMessageReceived", zzhkVar);
    }

    @Override // com.google.android.gms.wearable.internal.zzgp
    public final void u3(zzj zzjVar) {
        Z1(new b8n(this, zzjVar, 1), "onEntityUpdate", zzjVar);
    }
}
