package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import defpackage.d1c;
import defpackage.ij3;
import defpackage.jvd;
import defpackage.lj3;
import defpackage.oi3;
import defpackage.rde;
import defpackage.sde;
import defpackage.wxf;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new d1c(15);
    public final String a;
    public final Timer b;
    public boolean c;

    public PerfSession(Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public static sde[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        sde[] sdeVarArr = new sde[list.size()];
        sde a = ((PerfSession) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            sde a2 = ((PerfSession) list.get(i)).a();
            if (z || !((PerfSession) list.get(i)).c) {
                sdeVarArr[i] = a2;
            } else {
                sdeVarArr[0] = a2;
                sdeVarArr[i] = a;
                z = true;
            }
        }
        if (!z) {
            sdeVarArr[0] = a;
        }
        return sdeVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (defpackage.oi3.p(r5) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PerfSession c(String str) {
        boolean z;
        lj3 lj3Var;
        double doubleValue;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new wxf(18));
        oi3 e = oi3.e();
        if (e.o()) {
            double random = Math.random();
            synchronized (lj3.class) {
                lj3Var = lj3.h;
                if (lj3Var == null) {
                    lj3Var = new lj3();
                    lj3.h = lj3Var;
                }
            }
            jvd i = e.i(lj3Var);
            if (i.b()) {
                doubleValue = ((Double) i.a()).doubleValue() / 100.0d;
            }
            jvd jvdVar = e.a.getDouble("fpr_vc_session_sampling_rate");
            if (jvdVar.b() && oi3.p(((Double) jvdVar.a()).doubleValue())) {
                e.c.e("com.google.firebase.perf.SessionSamplingRate", ((Double) jvdVar.a()).doubleValue());
                doubleValue = ((Double) jvdVar.a()).doubleValue();
            } else {
                jvd b = e.b(lj3Var);
                doubleValue = (b.b() && oi3.p(((Double) b.a()).doubleValue())) ? ((Double) b.a()).doubleValue() : e.a.isLastFetchFailed() ? 1.0E-5d : 0.01d;
            }
            if (random < doubleValue) {
                z = true;
                perfSession.c = z;
                return perfSession;
            }
        }
        z = false;
        perfSession.c = z;
        return perfSession;
    }

    public final sde a() {
        rde k = sde.k();
        k.j(this.a);
        if (this.c) {
            k.i();
        }
        return (sde) k.build();
    }

    public final boolean d() {
        ij3 ij3Var;
        long longValue;
        long a = this.b.a() / 60000000;
        oi3 e = oi3.e();
        e.getClass();
        synchronized (ij3.class) {
            ij3Var = ij3.h;
            if (ij3Var == null) {
                ij3Var = new ij3();
                ij3.h = ij3Var;
            }
        }
        jvd j = e.j(ij3Var);
        if (!j.b() || ((Long) j.a()).longValue() <= 0) {
            jvd jvdVar = e.a.getLong("fpr_session_max_duration_min");
            if (!jvdVar.b() || ((Long) jvdVar.a()).longValue() <= 0) {
                jvd c = e.c(ij3Var);
                longValue = (!c.b() || ((Long) c.a()).longValue() <= 0) ? 240L : ((Long) c.a()).longValue();
            } else {
                e.c.d(((Long) jvdVar.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                longValue = ((Long) jvdVar.a()).longValue();
            }
        } else {
            longValue = ((Long) j.a()).longValue();
        }
        return a > longValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public PerfSession(String str, wxf wxfVar) {
        this.c = false;
        this.a = str;
        this.b = new Timer();
    }
}
