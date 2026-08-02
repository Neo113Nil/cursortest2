package com.google.android.gms.internal.wearable;

import defpackage.zz0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e {
    public static zzfj a(Object obj) {
        zzdg zzdgVar = (zzdg) obj;
        zzfj zzfjVar = zzdgVar.zzc;
        if (zzfjVar != zzfj.f) {
            return zzfjVar;
        }
        zzfj zzfjVar2 = new zzfj(0, new int[8], new Object[8], true);
        zzdgVar.zzc = zzfjVar2;
        return zzfjVar2;
    }

    public static boolean b(int i, zz0 zz0Var, Object obj) {
        zzcj zzcjVar = (zzcj) zz0Var.e;
        int i2 = zz0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.h1(0);
            ((zzfj) obj).c(i3 << 3, Long.valueOf(zzcjVar.j()));
            return true;
        }
        if (i4 == 1) {
            zz0Var.h1(1);
            ((zzfj) obj).c((i3 << 3) | 1, Long.valueOf(zzcjVar.l()));
            return true;
        }
        if (i4 == 2) {
            ((zzfj) obj).c((i3 << 3) | 2, zz0Var.I1());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzdv("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                defpackage.zzl.y();
                return false;
            }
            zz0Var.h1(5);
            ((zzfj) obj).c(5 | (i3 << 3), Integer.valueOf(zzcjVar.m()));
            return true;
        }
        zzfj zzfjVar = new zzfj(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zz0Var.H1() != Integer.MAX_VALUE && b(i6, zz0Var, zzfjVar)) {
        }
        if ((i5 | 4) != zz0Var.b) {
            throw new zzdv("Protocol message end-group tag did not match expected tag.");
        }
        if (zzfjVar.e) {
            zzfjVar.e = false;
        }
        ((zzfj) obj).c(i5 | 3, zzfjVar);
        return true;
    }
}
