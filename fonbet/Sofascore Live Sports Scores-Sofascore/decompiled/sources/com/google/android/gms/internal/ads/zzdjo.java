package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdjo {
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public zzfhc o;

    public final void a(zzdds zzddsVar, Executor executor) {
        this.i.add(new zzdlo(zzddsVar, executor));
    }

    public final void b(AppEventListener appEventListener, Executor executor) {
        this.k.add(new zzdlo(appEventListener, executor));
    }

    public final void c(zzdlw zzdlwVar, Executor executor) {
        this.d.add(new zzdlo(zzdlwVar, executor));
    }

    public final void d(zzdgv zzdgvVar, Executor executor) {
        this.b.add(new zzdlo(zzdgvVar, executor));
    }
}
