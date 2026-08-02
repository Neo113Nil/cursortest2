package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ozg0;
import xsna.xm01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class CastOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CastOptions> CREATOR;
    public static final zzk t = new zzk(false);
    public static final zzm u = new zzm(0);
    public static final CastMediaOptions v;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final LaunchOptions e;
    public final boolean f;
    public final CastMediaOptions g;
    public final boolean h;
    public final double i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final zzk p;
    public zzm q;
    public final boolean r;
    public final boolean s;

    static {
        new NotificationOptions.a().a();
        v = new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new xm01();
    }

    public CastOptions(String str, ArrayList arrayList, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, zzk zzkVar, zzm zzmVar, boolean z9, boolean z10) {
        this.b = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.c = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.d = z;
        this.e = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.f = z2;
        this.g = castMediaOptions;
        this.h = z3;
        this.i = d;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = arrayList2;
        this.n = z7;
        this.o = z8;
        this.p = zzkVar;
        this.q = zzmVar;
        this.r = z9;
        this.s = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.s(parcel, Collections.unmodifiableList(this.c), 3);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        ozg0.v(parcel, 9, 8);
        parcel.writeDouble(this.i);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(this.k ? 1 : 0);
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(this.l ? 1 : 0);
        ozg0.s(parcel, Collections.unmodifiableList(this.m), 13);
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(this.n ? 1 : 0);
        ozg0.v(parcel, 15, 4);
        parcel.writeInt(0);
        ozg0.v(parcel, 16, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ozg0.p(parcel, 17, this.p, i, false);
        ozg0.p(parcel, 18, this.q, i, false);
        ozg0.v(parcel, 19, 4);
        parcel.writeInt(this.r ? 1 : 0);
        ozg0.v(parcel, 20, 4);
        parcel.writeInt(this.s ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
