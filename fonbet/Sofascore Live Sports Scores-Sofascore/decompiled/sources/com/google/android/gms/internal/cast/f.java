package com.google.android.gms.internal.cast;

import defpackage.a70;
import defpackage.bgp;
import defpackage.ceo;
import defpackage.mdp;
import defpackage.mxn;
import defpackage.qep;
import defpackage.tbp;
import defpackage.ubf;
import defpackage.wcp;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f {
    public static final ubf a;

    static {
        int i = tbp.a;
        a = new ubf(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        zzyd zzydVar = (zzyd) obj;
        zzaae zzaaeVar = zzydVar.zzc;
        zzaae zzaaeVar2 = ((zzyd) obj2).zzc;
        zzaae zzaaeVar3 = zzaae.e;
        if (!zzaaeVar3.equals(zzaaeVar2)) {
            if (zzaaeVar3.equals(zzaaeVar)) {
                zzaaeVar.getClass();
                zzaaeVar2.getClass();
                int[] copyOf = Arrays.copyOf(zzaaeVar.a, 0);
                System.arraycopy(zzaaeVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(zzaaeVar.b, 0);
                System.arraycopy(zzaaeVar2.b, 0, copyOf2, 0, 0);
                zzaaeVar = new zzaae(copyOf, copyOf2, true);
            } else {
                zzaaeVar.getClass();
                if (!zzaaeVar2.equals(zzaaeVar3)) {
                    if (!zzaaeVar.d) {
                        a70.i();
                        return;
                    }
                    int[] iArr = zzaaeVar.a;
                    int length = iArr.length;
                    System.arraycopy(zzaaeVar2.a, 0, iArr, 0, 0);
                    System.arraycopy(zzaaeVar2.b, 0, zzaaeVar.b, 0, 0);
                }
            }
        }
        zzydVar.zzc = zzaaeVar;
    }

    public static void c(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzxpVar.g(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        zzxpVar.o(i3);
        while (i2 < list.size()) {
            zzxpVar.r(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void d(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof wcp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.e(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.p(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        wcp wcpVar = (wcp) list;
        if (!z) {
            while (i2 < wcpVar.c) {
                wcpVar.h(i2);
                zzxpVar.e(i, Float.floatToRawIntBits(wcpVar.b[i2]));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wcpVar.c; i6++) {
            wcpVar.h(i6);
            float f = wcpVar.b[i6];
            i5 += 4;
        }
        zzxpVar.o(i5);
        while (i2 < wcpVar.c) {
            wcpVar.h(i2);
            zzxpVar.p(Float.floatToRawIntBits(wcpVar.b[i2]));
            i2++;
        }
    }

    public static void e(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof qep)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.t(((Long) list.get(i4)).longValue());
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qep qepVar = (qep) list;
        if (!z) {
            while (i2 < qepVar.c) {
                zzxpVar.f(i, qepVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qepVar.c; i6++) {
            i5 += zzxp.t(qepVar.d(i6));
        }
        zzxpVar.o(i5);
        while (i2 < qepVar.c) {
            zzxpVar.q(qepVar.d(i2));
            i2++;
        }
    }

    public static void f(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof qep)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.f(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.t(((Long) list.get(i4)).longValue());
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qep qepVar = (qep) list;
        if (!z) {
            while (i2 < qepVar.c) {
                zzxpVar.f(i, qepVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qepVar.c; i6++) {
            i5 += zzxp.t(qepVar.d(i6));
        }
        zzxpVar.o(i5);
        while (i2 < qepVar.c) {
            zzxpVar.q(qepVar.d(i2));
            i2++;
        }
    }

    public static void g(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof qep)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzxpVar.f(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzxp.t((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzxpVar.q((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        qep qepVar = (qep) list;
        if (!z) {
            while (i2 < qepVar.c) {
                long d = qepVar.d(i2);
                zzxpVar.f(i, (d >> 63) ^ (d + d));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qepVar.c; i6++) {
            long d2 = qepVar.d(i6);
            i5 += zzxp.t((d2 >> 63) ^ (d2 + d2));
        }
        zzxpVar.o(i5);
        while (i2 < qepVar.c) {
            long d3 = qepVar.d(i2);
            zzxpVar.q((d3 >> 63) ^ (d3 + d3));
            i2++;
        }
    }

    public static void h(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof qep)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qep qepVar = (qep) list;
        if (!z) {
            while (i2 < qepVar.c) {
                zzxpVar.g(i, qepVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qepVar.c; i6++) {
            qepVar.d(i6);
            i5 += 8;
        }
        zzxpVar.o(i5);
        while (i2 < qepVar.c) {
            zzxpVar.r(qepVar.d(i2));
            i2++;
        }
    }

    public static void i(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof qep)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.g(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qep qepVar = (qep) list;
        if (!z) {
            while (i2 < qepVar.c) {
                zzxpVar.g(i, qepVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qepVar.c; i6++) {
            qepVar.d(i6);
            i5 += 8;
        }
        zzxpVar.o(i5);
        while (i2 < qepVar.c) {
            zzxpVar.r(qepVar.d(i2));
            i2++;
        }
    }

    public static void j(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.t(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                zzxpVar.c(i, mdpVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            i5 += zzxp.t(mdpVar.d(i6));
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            zzxpVar.n(mdpVar.d(i2));
            i2++;
        }
    }

    public static void k(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.s(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                zzxpVar.d(i, mdpVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            i5 += zzxp.s(mdpVar.d(i6));
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            zzxpVar.o(mdpVar.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzxpVar.d(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzxp.s((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzxpVar.o((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                int d = mdpVar.d(i2);
                zzxpVar.d(i, (d >> 31) ^ (d + d));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            int d2 = mdpVar.d(i6);
            i5 += zzxp.s((d2 >> 31) ^ (d2 + d2));
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            int d3 = mdpVar.d(i2);
            zzxpVar.o((d3 >> 31) ^ (d3 + d3));
            i2++;
        }
    }

    public static void m(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                zzxpVar.e(i, mdpVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            mdpVar.d(i6);
            i5 += 4;
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            zzxpVar.p(mdpVar.d(i2));
            i2++;
        }
    }

    public static void n(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                zzxpVar.e(i, mdpVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            mdpVar.d(i6);
            i5 += 4;
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            zzxpVar.p(mdpVar.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!(list instanceof mdp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzxpVar.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzxpVar.b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzxp.t(((Integer) list.get(i4)).intValue());
            }
            zzxpVar.o(i3);
            while (i2 < list.size()) {
                zzxpVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mdp mdpVar = (mdp) list;
        if (!z) {
            while (i2 < mdpVar.c) {
                zzxpVar.c(i, mdpVar.d(i2));
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < mdpVar.c; i6++) {
            i5 += zzxp.t(mdpVar.d(i6));
        }
        zzxpVar.o(i5);
        while (i2 < mdpVar.c) {
            zzxpVar.n(mdpVar.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, mxn mxnVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzxp zzxpVar = (zzxp) mxnVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzxpVar.h(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzxpVar.b(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        zzxpVar.o(i3);
        while (i2 < list.size()) {
            zzxpVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qep)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.t(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qep qepVar = (qep) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.t(qepVar.d(i));
            i++;
        }
        return i3;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qep)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.t(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        qep qepVar = (qep) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.t(qepVar.d(i));
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qep)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzxp.t((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        qep qepVar = (qep) list;
        int i3 = 0;
        while (i < size) {
            long d = qepVar.d(i);
            i3 += zzxp.t((d >> 63) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mdp)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.t(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mdp mdpVar = (mdp) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.t(mdpVar.d(i));
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mdp)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.t(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mdp mdpVar = (mdp) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.t(mdpVar.d(i));
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mdp)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzxp.s(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mdp mdpVar = (mdp) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzxp.s(mdpVar.d(i));
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mdp)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzxp.s((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        mdp mdpVar = (mdp) list;
        int i3 = 0;
        while (i < size) {
            int d = mdpVar.d(i);
            i3 += zzxp.s((d >> 31) ^ (d + d));
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzxp.s(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzxp.s(i << 3) + 8) * size;
    }

    public static int z(int i, Object obj, bgp bgpVar) {
        int i2 = i << 3;
        if (obj instanceof zzyt) {
            int s = zzxp.s(i2);
            int a2 = ((zzyt) obj).a();
            return ceo.j(a2, a2, s);
        }
        int s2 = zzxp.s(i2);
        int a3 = ((zzwz) obj).a(bgpVar);
        return ceo.j(a3, a3, s2);
    }
}
