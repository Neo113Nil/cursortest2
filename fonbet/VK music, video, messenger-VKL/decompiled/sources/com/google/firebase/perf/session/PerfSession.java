package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.firebase.perf.v1.h;
import java.util.List;
import java.util.UUID;
import xsna.bvf;
import xsna.kt80;
import xsna.txi;
import xsna.yyi;

/* loaded from: classes13.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();
    public final String b;
    public final Timer c;
    public boolean d;

    public class a implements Parcelable.Creator<PerfSession> {
        @Override // android.os.Parcelable.Creator
        public final PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public PerfSession(String str, bvf bvfVar) {
        this.d = false;
        this.b = str;
        bvfVar.getClass();
        this.c = new Timer();
    }

    @Nullable
    public static h[] e(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        h[] hVarArr = new h[list.size()];
        h d = list.get(0).d();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            h d2 = list.get(i).d();
            if (z || !list.get(i).d) {
                hVarArr[i] = d2;
            } else {
                hVarArr[0] = d2;
                hVarArr[i] = d;
                z = true;
            }
        }
        if (!z) {
            hVarArr[0] = d;
        }
        return hVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (xsna.txi.p(r4) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PerfSession f() {
        boolean z;
        yyi yyiVar;
        float floatValue;
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new bvf());
        txi e = txi.e();
        if (e.o()) {
            double random = Math.random();
            synchronized (yyi.class) {
                try {
                    if (yyi.c == null) {
                        yyi.c = new yyi(0);
                    }
                    yyiVar = yyi.c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            kt80<Float> i = e.i(yyiVar);
            if (i.b()) {
                floatValue = i.a().floatValue() / 100.0f;
            }
            kt80<Float> kt80Var = e.a.getFloat("fpr_vc_session_sampling_rate");
            if (kt80Var.b() && txi.p(kt80Var.a().floatValue())) {
                e.c.d(kt80Var.a().floatValue(), "com.google.firebase.perf.SessionSamplingRate");
                floatValue = kt80Var.a().floatValue();
            } else {
                kt80<Float> b = e.b(yyiVar);
                floatValue = (b.b() && txi.p(b.a().floatValue())) ? b.a().floatValue() : 0.01f;
            }
            if (random < floatValue) {
                z = true;
                perfSession.d = z;
                return perfSession;
            }
        }
        z = false;
        perfSession.d = z;
        return perfSession;
    }

    public final h d() {
        h.c h = h.h();
        h.c(this.b);
        if (this.d) {
            h.b(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return h.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.c, 0);
    }

    public PerfSession(Parcel parcel) {
        this.d = false;
        this.b = parcel.readString();
        this.d = parcel.readByte() != 0;
        this.c = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
