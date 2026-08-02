package com.vk.clips.viewer.impl.utils.performance;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import com.vk.clips.sdk.shared.api.utils.performance.StartScreenType;
import com.vk.metrics.logging.PerfLogger;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.f2f;
import xsna.i5s;
import xsna.mzp0;
import xsna.okh0;
import xsna.pzl;
import xsna.rzp0;
import xsna.zcl;

/* compiled from: ClipsScreenPerformanceReporter.kt */
/* loaded from: classes17.dex */
public final class ClipsScreenPerformanceReporter implements Parcelable, okh0 {
    public static final a CREATOR = new a();
    public final f2f b;
    public final UUID c;
    public boolean d;
    public long e;
    public StartScreenType f;
    public final mzp0 g;
    public ClipsScreenProductScoreReporter h;

    /* compiled from: ClipsScreenPerformanceReporter.kt */
    public static final class a implements Parcelable.Creator<ClipsScreenPerformanceReporter> {
        @Override // android.os.Parcelable.Creator
        public final ClipsScreenPerformanceReporter createFromParcel(Parcel parcel) {
            return new ClipsScreenPerformanceReporter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsScreenPerformanceReporter[] newArray(int i) {
            return new ClipsScreenPerformanceReporter[i];
        }
    }

    public ClipsScreenPerformanceReporter(mzp0 mzp0Var) {
        this.d = true;
        this.c = mzp0Var != null ? mzp0Var.Y0() : null;
        this.g = mzp0Var;
        this.b = mzp0Var != null ? new f2f() : null;
    }

    @Override // xsna.okh0
    public final void a(StartScreenType startScreenType) {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.k(startScreenType.h());
        }
        this.f = startScreenType;
    }

    public final void b(ClipsScreenProductScoreReporter clipsScreenProductScoreReporter) {
        this.h = clipsScreenProductScoreReporter;
    }

    @Override // xsna.okh0
    public final void d() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.okh0
    public final void e() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
    }

    @Override // xsna.okh0
    public final void f() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
    }

    @Override // xsna.okh0
    public final void g() {
        f2f f2fVar;
        String str;
        ClipsScreenProductScoreReporter clipsScreenProductScoreReporter = this.h;
        if (clipsScreenProductScoreReporter != null) {
            clipsScreenProductScoreReporter.g();
        }
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.d(null);
            mzp0Var.j();
        }
        StartScreenType startScreenType = this.f;
        if (startScreenType == null || (f2fVar = this.b) == null) {
            return;
        }
        long j = this.e;
        boolean z = this.d;
        PerfLogger perfLogger = f2fVar.a;
        if (f2fVar.b) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = z ? "" : "_warm";
        int i = f2f.a.$EnumSwitchMapping$0[startScreenType.ordinal()];
        if (i == 1) {
            str = "clips_tab_cache";
        } else if (i == 2) {
            str = "clips_tab_net";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "clips_fullscreen";
        }
        perfLogger.b(j, pzl.b(str, "_created", str2));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        perfLogger.b(elapsedRealtime, i5s.a(sb, "_displayed", str2));
        f2fVar.b = true;
    }

    @Override // xsna.okh0
    public final void i(long j, long j2) {
        f2f f2fVar = this.b;
        if (f2fVar != null) {
            PerfLogger perfLogger = f2fVar.a;
            perfLogger.b(j, "clips_inter_item_play_started");
            perfLogger.b(j2, "clips_inter_item_play_ended");
        }
    }

    public final void j() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    public final void k() {
        this.e = SystemClock.elapsedRealtime();
    }

    public final void l(boolean z) {
        this.d = z;
    }

    public final void n(View view) {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.e(view);
        }
    }

    public final void o() {
        mzp0 mzp0Var = this.g;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(String.valueOf(this.c));
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.e);
        ClipsScreenProductScoreReporter clipsScreenProductScoreReporter = this.h;
        if (clipsScreenProductScoreReporter != null) {
            clipsScreenProductScoreReporter.writeToParcel(parcel, i);
        }
    }

    public ClipsScreenPerformanceReporter(Parcel parcel, zcl zclVar) {
        mzp0 e;
        this.d = true;
        String readString = parcel.readString();
        UUID fromString = (readString == null || readString.length() == 0) ? null : UUID.fromString(readString);
        this.c = fromString;
        if (fromString == null) {
            e = null;
        } else {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            e = rzp0.e(fromString);
        }
        this.g = e;
        this.b = e != null ? new f2f() : null;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readLong();
        ClipsScreenProductScoreReporter.CREATOR.getClass();
        this.h = new ClipsScreenProductScoreReporter(parcel, (zcl) null);
    }
}
