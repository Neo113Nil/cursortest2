package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcd implements zzfdg {
    public final zzgdj a;
    public final zzgdj b;
    public final boolean c;
    public final boolean d;
    public final boolean e = false;
    public final boolean f;

    public zzfcd(zzgdj zzgdjVar, zzgdj zzgdjVar2, boolean z, boolean z2, boolean z3) {
        this.a = zzgdjVar;
        this.b = zzgdjVar2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r7 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.e4)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        r4 = r9.b;
        r5 = r4.a;
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.c);
        r1.putBoolean("paidv2_user_option_android", r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.g4)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.f4)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.d4)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r5 = r9.a;
        r6 = r5.a;
        r7 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.e) {
            return;
        }
        Bundle a = zzfml.a(bundle, "pii");
        boolean z = this.f;
        if (!z) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (z) {
        }
        if (a.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", a);
    }

    public zzfcd(boolean z) {
        this.f = z;
    }
}
