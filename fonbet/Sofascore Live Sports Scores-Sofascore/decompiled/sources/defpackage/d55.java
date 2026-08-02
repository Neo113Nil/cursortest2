package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d55 implements e48, zzdom {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public d55(kw9 kw9Var, igf igfVar, qsg qsgVar, zmf zmfVar, wu0 wu0Var, mjc mjcVar, z41 z41Var, lw9 lw9Var, String str) {
        this.b = kw9Var;
        this.c = igfVar;
        this.d = qsgVar;
        this.e = zmfVar;
        this.f = wu0Var;
        this.g = mjcVar;
        this.h = z41Var;
        this.i = lw9Var;
        this.j = str;
        this.a = false;
    }

    public static Task f(g0c g0cVar, gsg gsgVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        p0c p0cVar = new p0c(new l0c(new x0c(g0cVar, new c55(taskCompletionSource), un0.m), new q0c(new ji2(taskCompletionSource, 4)), 2), new c55(taskCompletionSource), 2);
        rha.x(gsgVar, "scheduler is null");
        cm5 cm5Var = new cm5(1);
        try {
            na3 na3Var = new na3(cm5Var);
            r55.e(cm5Var, na3Var);
            r55.c((cm5) na3Var.b, gsgVar.b(new vlo(17, na3Var, p0cVar)));
            return taskCompletionSource.getTask();
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            td4.w0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public Task a(d48 d48Var) {
        if (!((z41) this.h).s()) {
            d();
            return new TaskCompletionSource().getTask();
        }
        int i = 0;
        return f(new oa3(i, new oa3(i, e(), new sa3(new o3(17, this, d48Var), i)), new sa3(new b55(this, 1), i)).e(), ((qsg) this.d).a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean r20, android.content.Context r21, com.google.android.gms.internal.ads.zzdec r22) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = r0.h
            com.google.android.gms.internal.ads.zzbqk r1 = (com.google.android.gms.internal.ads.zzbqk) r1
            java.lang.Object r2 = r0.d
            com.google.android.gms.internal.ads.zzcgo r2 = (com.google.android.gms.internal.ads.zzcgo) r2
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhcy.k(r2)
            com.google.android.gms.internal.ads.zzdmy r2 = (com.google.android.gms.internal.ads.zzdmy) r2
            java.lang.Object r3 = r0.f
            r8 = r3
            com.google.android.gms.internal.ads.zzclm r8 = (com.google.android.gms.internal.ads.zzclm) r8
            r3 = 1
            r8.V(r3)
            com.google.android.gms.ads.internal.zzl r12 = new com.google.android.gms.ads.internal.zzl
            boolean r4 = r0.a
            r5 = 0
            if (r4 == 0) goto L26
            boolean r6 = r1.a(r5)
            r10 = r6
            goto L27
        L26:
            r10 = r5
        L27:
            com.google.android.gms.ads.internal.zzt.zzc()
            java.lang.Object r6 = r0.b
            android.content.Context r6 = (android.content.Context) r6
            boolean r11 = com.google.android.gms.ads.internal.util.zzs.zzL(r6)
            if (r4 == 0) goto L3b
            monitor-enter(r1)
            boolean r4 = r1.b     // Catch: java.lang.Throwable -> L42
            monitor-exit(r1)
            if (r4 == 0) goto L3e
            r5 = r3
        L3b:
            r9 = r12
            r12 = r5
            goto L45
        L3e:
            r9 = r12
            r12 = r5
            r5 = r3
            goto L45
        L42:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
        L45:
            if (r5 == 0) goto L50
            monitor-enter(r1)
            float r4 = r1.c     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)
        L4b:
            r13 = r4
            goto L52
        L4d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r0
        L50:
            r4 = 0
            goto L4b
        L52:
            java.lang.Object r1 = r0.e
            com.google.android.gms.internal.ads.zzfld r1 = (com.google.android.gms.internal.ads.zzfld) r1
            boolean r4 = r1.O
            r17 = 0
            r14 = -1
            r15 = r20
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r22 == 0) goto L67
            r22.q0()
        L67:
            com.google.android.gms.ads.internal.zzt.zzb()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdob r6 = r2.e()
            r12 = r9
            int r9 = r1.Q
            java.lang.Object r2 = r0.c
            r10 = r2
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r10
            java.lang.String r11 = r1.B
            com.google.android.gms.internal.ads.zzfli r2 = r1.s
            java.lang.String r13 = r2.b
            java.lang.String r14 = r2.a
            java.lang.Object r2 = r0.g
            com.google.android.gms.internal.ads.zzflw r2 = (com.google.android.gms.internal.ads.zzflw) r2
            boolean r1 = r1.b()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.i
            com.google.android.gms.internal.ads.zzelp r1 = (com.google.android.gms.internal.ads.zzelp) r1
        L8e:
            r17 = r1
            goto L93
        L91:
            r1 = 0
            goto L8e
        L93:
            java.lang.String r15 = r2.g
            java.lang.String r18 = r8.zzn()
            r5 = 0
            r7 = 0
            r16 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.j
            com.google.android.gms.internal.ads.zzeaj r0 = (com.google.android.gms.internal.ads.zzeaj) r0
            r1 = r21
            com.google.android.gms.ads.internal.overlay.zzn.zza(r1, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d55.b(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdec):void");
    }

    public Task c() {
        if (!((z41) this.h).s() || this.a) {
            d();
            return new TaskCompletionSource().getTask();
        }
        int i = 0;
        return f(new oa3(i, new oa3(i, e(), new sa3(new b55(this, i), i)), new sa3(new b55(this, 1), i)).e(), ((qsg) this.d).a);
    }

    public void d() {
        if (((lw9) this.i).b.b) {
            return;
        }
        ((z41) this.h).s();
    }

    public ma3 e() {
        String str = (String) ((lw9) this.i).b.c;
        kw9 kw9Var = (kw9) this.b;
        ni2 i = oi2.i();
        ((igf) this.c).getClass();
        i.h(System.currentTimeMillis());
        i.d(str);
        oi2 oi2Var = (oi2) i.build();
        x0c a = kw9Var.a();
        ri2 ri2Var = kw9.c;
        rha.x(ri2Var, "defaultItem is null");
        int i2 = 2;
        oa3 oa3Var = new oa3(i2, new l0c(a, g0c.a(ri2Var), 2), new o3(26, kw9Var, oi2Var));
        int i3 = 7;
        cp4 cp4Var = new cp4(i3);
        wxf wxfVar = un0.l;
        ab3 ab3Var = new ab3(oa3Var, cp4Var, wxfVar);
        int i4 = 8;
        ab3 a2 = ab3Var.a(new cp4(i4));
        if (!((String) this.j).equals("ON_FOREGROUND")) {
            return a2;
        }
        zmf zmfVar = (zmf) this.e;
        wu0 wu0Var = (wu0) this.f;
        x0c a3 = zmfVar.a();
        umf umfVar = zmf.d;
        rha.x(umfVar, "defaultItem is null");
        l0c l0cVar = new l0c(a3, g0c.a(umfVar), 2);
        int i5 = 0;
        return new oa3(i5, new sa3(new ab3(new oa3(i2, l0cVar, new xmf(zmfVar, wu0Var, i5)), new cp4(i3), wxfVar).a(new cp4(i4)), i2), a2);
    }

    public Task g(c48 c48Var) {
        if (!((z41) this.h).s()) {
            d();
            return new TaskCompletionSource().getTask();
        }
        sa3 sa3Var = new sa3(new o3(18, this, c48Var), 0);
        if (!this.a) {
            c();
        }
        return f(sa3Var.e(), ((qsg) this.d).a);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.e;
    }

    public d55(Context context, VersionInfoParcel versionInfoParcel, zzcgo zzcgoVar, zzfld zzfldVar, zzclm zzclmVar, zzflw zzflwVar, boolean z, zzbqk zzbqkVar, zzelp zzelpVar, zzeaj zzeajVar) {
        this.b = context;
        this.c = versionInfoParcel;
        this.d = zzcgoVar;
        this.e = zzfldVar;
        this.f = zzclmVar;
        this.g = zzflwVar;
        this.h = zzbqkVar;
        this.a = z;
        this.i = zzelpVar;
        this.j = zzeajVar;
    }
}
