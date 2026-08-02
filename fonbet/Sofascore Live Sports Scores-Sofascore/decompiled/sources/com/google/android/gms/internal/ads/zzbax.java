package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import defpackage.f2n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbax {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile zzgae d = null;
    public static volatile Random e = null;
    public final zzbcg a;
    public volatile Boolean b;

    public zzbax(zzbcg zzbcgVar) {
        this.a = zzbcgVar;
        zzbcgVar.b.execute(new f2n(this, 12));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            zzaxg D = zzaxk.D();
            String packageName = this.a.a.getPackageName();
            D.n();
            ((zzaxk) D.b).E(packageName);
            D.n();
            ((zzaxk) D.b).F(j);
            if (str != null) {
                D.n();
                ((zzaxk) D.b).I(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                D.n();
                ((zzaxk) D.b).G(stringWriter2);
                String name = exc.getClass().getName();
                D.n();
                ((zzaxk) D.b).H(name);
            }
            zzgae zzgaeVar = d;
            byte[] d2 = ((zzaxk) D.o()).d();
            zzgaeVar.getClass();
            zzgad zzgadVar = new zzgad(zzgaeVar, d2);
            zzgadVar.c = i;
            if (i2 != -1) {
                zzgadVar.b = i2;
            }
            zzgadVar.a();
        } catch (Exception unused) {
        }
    }
}
