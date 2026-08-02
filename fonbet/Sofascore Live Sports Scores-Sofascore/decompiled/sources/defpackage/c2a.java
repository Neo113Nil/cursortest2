package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.cast.zzek;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c2a extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public c2a(zzftu zzftuVar) {
        this.a = 8;
        Objects.requireNonNull(zzftuVar);
        this.b = zzftuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 1:
                network.getClass();
                fdi fdiVar = ((had) obj).c;
                fdiVar.getClass();
                fdiVar.m(null, fbd.a);
                break;
            case 2:
            case 5:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((l2a) obj).z(network, true);
                break;
            case 4:
                kik.B().post(new wh0(this, z, 4));
                break;
            case 6:
                ((zzcfv) obj).p.set(true);
                break;
            case 7:
                break;
            case 8:
                zzftu zzftuVar = (zzftu) obj;
                zzftuVar.getClass();
                if (((Boolean) zzba.zzc().a(zzbjg.C)).booleanValue()) {
                    zzftuVar.a(true);
                    break;
                }
                break;
            case 9:
                ((zzfuj) obj).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 2:
                network.getClass();
                if (network.equals(((dbd) this.b).f.getActiveNetwork())) {
                    rik o = rik.o();
                    int i = cbd.a;
                    o.getClass();
                    dbd dbdVar = (dbd) this.b;
                    Object obj = dbdVar.e;
                    if (obj == null) {
                        obj = dbdVar.a();
                    }
                    bbd bbdVar = (bbd) obj;
                    dbd dbdVar2 = (dbd) this.b;
                    synchronized (dbdVar2.g) {
                        if (dbdVar2.h == z) {
                            return;
                        }
                        dbdVar2.h = z;
                        Unit unit = Unit.a;
                        ((dbd) this.b).b(new bbd(bbdVar.a, bbdVar.b, bbdVar.c, bbdVar.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                rik o = rik.o();
                int i = kbl.a;
                o.getClass();
                ((lsb) this.b).invoke(hn3.a);
                return;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                rik o2 = rik.o();
                int i2 = cbd.a;
                Objects.toString(networkCapabilities);
                o2.getClass();
                dbd dbdVar = (dbd) this.b;
                dbdVar.b(cbd.a(dbdVar.f, dbdVar.h));
                return;
            case 5:
                synchronized (zzbbj.class) {
                    ((zzbbj) this.b).a = networkCapabilities;
                }
                return;
            case 10:
                tfo tfoVar = (tfo) this.b;
                synchronized (tfoVar) {
                    tfoVar.c = networkCapabilities;
                }
                return;
            case 11:
                synchronized (hpo.class) {
                    ((hpo) this.b).a = networkCapabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 7:
                ((zzek) this.b).b(network, linkProperties);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z = false;
        switch (this.a) {
            case 0:
                network.getClass();
                rik o = rik.o();
                int i = kbl.a;
                o.getClass();
                ((lsb) this.b).invoke(new in3(7));
                return;
            case 1:
                network.getClass();
                fdi fdiVar = ((had) this.b).c;
                gbd gbdVar = gbd.a;
                fdiVar.getClass();
                fdiVar.m(null, gbdVar);
                return;
            case 2:
                network.getClass();
                rik o2 = rik.o();
                int i2 = cbd.a;
                o2.getClass();
                ((dbd) this.b).b(new bbd(false, false, false, false, false));
                return;
            case 3:
                ((l2a) this.b).z(network, false);
                return;
            case 4:
                kik.B().post(new wh0(this, z, 4));
                return;
            case 5:
                synchronized (zzbbj.class) {
                    ((zzbbj) this.b).a = null;
                }
                return;
            case 6:
                ((zzcfv) this.b).p.set(false);
                return;
            case 7:
                zzek zzekVar = (zzek) this.b;
                synchronized (zzekVar.h) {
                    try {
                        zzek.l.a("the network is lost", new Object[0]);
                        if (zzekVar.e.remove(network)) {
                            zzekVar.d.remove(network);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zzekVar.c();
                return;
            case 8:
                zzftu zzftuVar = (zzftu) this.b;
                zzftuVar.getClass();
                if (((Boolean) zzba.zzc().a(zzbjg.C)).booleanValue()) {
                    zzftuVar.a(false);
                    return;
                }
                return;
            case 9:
                ((zzfuj) this.b).b(false);
                return;
            case 10:
                tfo tfoVar = (tfo) this.b;
                synchronized (tfoVar) {
                    tfoVar.c = null;
                }
                return;
            default:
                synchronized (hpo.class) {
                    ((hpo) this.b).a = null;
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 1:
                fdi fdiVar = ((had) this.b).c;
                gbd gbdVar = gbd.a;
                fdiVar.getClass();
                fdiVar.m(null, gbdVar);
                return;
            case 7:
                zzek zzekVar = (zzek) this.b;
                synchronized (zzekVar.h) {
                    zzek.l.a("all networks are unavailable.", new Object[0]);
                    zzekVar.d.clear();
                    zzekVar.e.clear();
                }
                zzekVar.c();
                return;
            default:
                super.onUnavailable();
                return;
        }
    }

    public c2a(zzcfv zzcfvVar) {
        this.a = 6;
        Objects.requireNonNull(zzcfvVar);
        this.b = zzcfvVar;
    }

    public /* synthetic */ c2a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public c2a(zzfuj zzfujVar) {
        this.a = 9;
        Objects.requireNonNull(zzfujVar);
        this.b = zzfujVar;
    }

    public c2a(lsb lsbVar) {
        this.a = 0;
        this.b = lsbVar;
    }

    private final void a(Network network) {
    }
}
