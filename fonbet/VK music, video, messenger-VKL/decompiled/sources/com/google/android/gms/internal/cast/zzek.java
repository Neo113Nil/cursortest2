package com.google.android.gms.internal.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.anj;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzek implements zzeg {
    private static final o100 zzb = new o100("ConnectivityMonitor", null);
    public final Set zza;
    private final zzwo zzc;

    @Nullable
    private final ConnectivityManager zze;
    private boolean zzh;
    private final Context zzi;
    private final boolean zzk;
    private final BroadcastReceiver zzl;
    private final ConnectivityManager.NetworkCallback zzd = new zzeh(this);
    private final Map zzf = new HashMap();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();

    public zzek(Context context, zzwo zzwoVar) {
        this.zzk = Build.VERSION.SDK_INT >= 31;
        this.zzl = new zzei(this);
        this.zza = new HashSet();
        this.zzc = zzwoVar;
        this.zzi = context;
        this.zze = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final void zzc(Network network, LinkProperties linkProperties) {
        synchronized (this.zzj) {
            try {
                zzb.a("a new network is available", new Object[0]);
                Map map = this.zzf;
                if (map.containsKey(network)) {
                    this.zzg.remove(network);
                }
                map.put(network, linkProperties);
                this.zzg.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        zzf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        zzwo zzwoVar = this.zzc;
        if (zzwoVar == null) {
            return;
        }
        Set<zzef> set = this.zza;
        synchronized (set) {
            try {
                for (final zzef zzefVar : set) {
                    if (!zzwoVar.isShutdown()) {
                        zzwoVar.execute(new Runnable() { // from class: com.google.android.gms.internal.cast.zzej
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzek.this.zzb(zzefVar);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzeg
    public final void zza() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        zzb.a("Start monitoring connectivity changes", new Object[0]);
        if (this.zzh || (connectivityManager = this.zze) == null) {
            return;
        }
        Context context = this.zzi;
        if (anj.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                zzc(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.zzk) {
                addTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.zzl, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(addTransportType.build(), this.zzd);
            this.zzh = true;
        }
    }

    public final /* synthetic */ void zzb(zzef zzefVar) {
        boolean isEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        synchronized (this.zzj) {
            isEmpty = this.zzg.isEmpty();
        }
        if (!isEmpty && !this.zzk && (connectivityManager = this.zze) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            activeNetworkInfo.isConnected();
        }
        zzefVar.zza();
    }

    public final /* synthetic */ void zzd(Network network) {
        synchronized (this.zzj) {
            try {
                zzb.a("the network is lost", new Object[0]);
                if (this.zzg.remove(network)) {
                    this.zzf.remove(network);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzf();
    }

    public final /* synthetic */ void zze() {
        synchronized (this.zzj) {
            zzb.a("all networks are unavailable.", new Object[0]);
            this.zzf.clear();
            this.zzg.clear();
        }
        zzf();
    }
}
