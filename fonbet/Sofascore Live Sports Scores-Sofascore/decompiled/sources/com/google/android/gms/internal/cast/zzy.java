package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.m4n;
import defpackage.n1p;
import defpackage.nsa;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzy {
    public final zzj a;
    public final zzax b;
    public final String c;
    public m4n d;
    public final n1p e = new n1p(this, 2);

    public zzy(zzj zzjVar, zzax zzaxVar, String str) {
        this.a = zzjVar;
        this.b = zzaxVar;
        this.c = str;
    }

    public final void a(zzcs zzcsVar) {
        m4n b;
        int i = zzcsVar.e;
        if (i == 2 && this.d != null) {
            c();
        }
        if (i == 2) {
            b = new m4n(this.a, this.c);
            this.d = b;
        } else {
            b = b();
            this.d = b;
        }
        Preconditions.i(b);
        zzcsVar.d = b.h;
        b.b.add(zzcsVar);
    }

    public final m4n b() {
        if (this.d == null) {
            m4n m4nVar = new m4n(this.a, this.c);
            this.d = m4nVar;
            m4nVar.b(1);
        }
        return this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c() {
        long j;
        long j2;
        int i;
        m4n m4nVar = this.d;
        if (m4nVar != null) {
            CastSession castSession = m4nVar.j;
            if (castSession != null) {
                castSession.m = null;
                m4nVar.j = null;
            }
            long j3 = m4nVar.i;
            zzqq o = zzqr.o();
            o.b();
            ((zzqr) o.b).q(j3);
            String str = m4nVar.l;
            if (str != null) {
                o.b();
                ((zzqr) o.b).x(str);
            }
            zzur n = zzus.n();
            if (!TextUtils.isEmpty(m4nVar.n)) {
                String str2 = m4nVar.n;
                o.b();
                ((zzqr) o.b).r(str2);
                String str3 = m4nVar.n;
                n.b();
                ((zzus) n.b).o(str3);
            }
            if (!TextUtils.isEmpty(m4nVar.o)) {
                String str4 = m4nVar.o;
                n.b();
                ((zzus) n.b).p(str4);
            }
            if (!TextUtils.isEmpty(m4nVar.p)) {
                String str5 = m4nVar.p;
                n.b();
                ((zzus) n.b).q(str5);
            }
            if (!TextUtils.isEmpty(m4nVar.q)) {
                String str6 = m4nVar.q;
                n.b();
                ((zzus) n.b).r(str6);
            }
            if (!TextUtils.isEmpty(m4nVar.r)) {
                String str7 = m4nVar.r;
                n.b();
                ((zzus) n.b).s(str7);
            }
            if (!TextUtils.isEmpty(m4nVar.s)) {
                String str8 = m4nVar.s;
                n.b();
                ((zzus) n.b).v(str8);
            }
            int i2 = m4nVar.t;
            int i3 = 3;
            int i4 = 4;
            int i5 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? 1 : 6 : 5 : 4 : 3 : 2;
            n.b();
            ((zzus) n.b).w(i5);
            zzus zzusVar = (zzus) n.c();
            o.b();
            ((zzqr) o.b).D(zzusVar);
            zzqb n2 = zzqc.n();
            String str9 = m4n.w;
            n2.b();
            ((zzqc) n2.b).p(str9);
            String str10 = m4nVar.g;
            n2.b();
            ((zzqc) n2.b).o(str10);
            zzqc zzqcVar = (zzqc) n2.c();
            o.b();
            ((zzqr) o.b).B(zzqcVar);
            nsa nsaVar = m4nVar.a;
            zzqy n3 = zzqz.n();
            String str11 = (String) nsaVar.zza();
            if (str11 != null) {
                zzro n4 = zzrp.n();
                n4.b();
                ((zzrp) n4.b).o(str11);
                zzrp zzrpVar = (zzrp) n4.c();
                n3.b();
                ((zzqz) n3.b).o(zzrpVar);
            }
            String str12 = m4nVar.k;
            if (str12 != null) {
                try {
                    String replace = str12.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException unused) {
                    m4n.v.c("receiverSessionId %s is not valid for hash", str12);
                    j = 0;
                }
                j2 = 0;
                n3.b();
                ((zzqz) n3.b).p(j);
            } else {
                j2 = 0;
            }
            List<zzcs> list = m4nVar.b;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (zzcs zzcsVar : list) {
                    zzcsVar.getClass();
                    zzqw n5 = zzqx.n();
                    int i6 = zzcsVar.e;
                    n5.b();
                    ((zzqx) n5.b).s(i6);
                    int i7 = (int) (zzcsVar.b - zzcsVar.d);
                    n5.b();
                    ((zzqx) n5.b).r(i7);
                    n5.b();
                    ((zzqx) n5.b).o(i7);
                    Integer num = zzcsVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        n5.b();
                        ((zzqx) n5.b).p(intValue);
                    }
                    Boolean bool = zzcsVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        n5.b();
                        ((zzqx) n5.b).q(booleanValue);
                    }
                    arrayList.add((zzqx) n5.c());
                }
                n3.b();
                ((zzqz) n3.b).q(arrayList);
            }
            List list2 = m4nVar.c;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((zzac) it.next()).getClass();
                    zzrc n6 = zzrd.n();
                    n6.b();
                    ((zzrd) n6.b).o((int) (j2 - j2));
                    n6.b();
                    ((zzrd) n6.b).p(1);
                    arrayList2.add((zzrd) n6.c());
                }
                n3.b();
                ((zzqz) n3.b).s(arrayList2);
            }
            List<zzcq> list3 = m4nVar.d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (zzcq zzcqVar : list3) {
                    String str13 = zzcqVar.a;
                    zzqs n7 = zzqt.n();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i = 13;
                                break;
                            }
                            i = 1;
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i = 22;
                                break;
                            }
                            i = 1;
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i = 15;
                                break;
                            }
                            i = 1;
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i = 19;
                                break;
                            }
                            i = 1;
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i = 23;
                                break;
                            }
                            i = 1;
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i = 9;
                                break;
                            }
                            i = 1;
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i = 21;
                                break;
                            }
                            i = 1;
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i = 10;
                                break;
                            }
                            i = 1;
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i = 14;
                                break;
                            }
                            i = 1;
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i = 7;
                                break;
                            }
                            i = 1;
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i = 20;
                                break;
                            }
                            i = 1;
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i = 2;
                                break;
                            }
                            i = 1;
                            break;
                        case 3363353:
                            if (str13.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                                i = 8;
                                break;
                            }
                            i = 1;
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i = 3;
                                break;
                            }
                            i = 1;
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i = 6;
                                break;
                            }
                            i = 1;
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i = 5;
                                break;
                            }
                            i = 1;
                            break;
                        case 106440182:
                            if (str13.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                i = i4;
                                break;
                            }
                            i = 1;
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i = 18;
                                break;
                            }
                            i = 1;
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i = 16;
                                break;
                            }
                            i = 1;
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i = 12;
                                break;
                            }
                            i = 1;
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i = 11;
                                break;
                            }
                            i = 1;
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i = 17;
                                break;
                            }
                            i = 1;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    n7.b();
                    ((zzqt) n7.b).s(i);
                    int i8 = (int) zzcqVar.b;
                    n7.b();
                    ((zzqt) n7.b).o(i8);
                    int i9 = zzcqVar.c;
                    n7.b();
                    ((zzqt) n7.b).p(i9);
                    int i10 = (int) (zzcqVar.d - zzcqVar.f);
                    n7.b();
                    ((zzqt) n7.b).q(i10);
                    int i11 = (int) (zzcqVar.e - zzcqVar.f);
                    n7.b();
                    ((zzqt) n7.b).r(i11);
                    arrayList3.add((zzqt) n7.c());
                    i4 = 4;
                }
                n3.b();
                ((zzqz) n3.b).r(arrayList3);
            }
            if (m4nVar.m != null) {
                ArrayList arrayList4 = new ArrayList();
                zzt zztVar = m4nVar.m;
                int i12 = zztVar.a;
                zzqu n8 = zzqv.n();
                if (i12 == 1) {
                    i3 = 2;
                } else if (i12 != 2) {
                    i3 = i12 != 3 ? i12 != 4 ? 1 : 5 : 4;
                }
                n8.b();
                ((zzqv) n8.b).p(i3);
                int i13 = (int) (zztVar.b - zztVar.c);
                n8.b();
                ((zzqv) n8.b).o(i13);
                arrayList4.add((zzqv) n8.c());
                n3.b();
                ((zzqz) n3.b).w(arrayList4);
            }
            Map map = m4nVar.e;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (zzae zzaeVar : map.values()) {
                    zzaeVar.getClass();
                    zzra n9 = zzrb.n();
                    int i14 = zzaeVar.e;
                    n9.b();
                    ((zzrb) n9.b).r(i14);
                    int i15 = zzaeVar.d.get();
                    n9.b();
                    ((zzrb) n9.b).o(i15);
                    int i16 = (int) (zzaeVar.a - zzaeVar.c);
                    n9.b();
                    ((zzrb) n9.b).p(i16);
                    int i17 = (int) (zzaeVar.b - zzaeVar.c);
                    n9.b();
                    ((zzrb) n9.b).q(i17);
                    arrayList5.add((zzrb) n9.c());
                }
                n3.b();
                ((zzqz) n3.b).v(arrayList5);
            }
            int i18 = m4nVar.u;
            n3.b();
            ((zzqz) n3.b).x(i18);
            zzqz zzqzVar = (zzqz) n3.c();
            o.b();
            ((zzqr) o.b).A(zzqzVar);
            m4nVar.f.a((zzqr) o.c(), 233);
            this.d = null;
        }
    }
}
