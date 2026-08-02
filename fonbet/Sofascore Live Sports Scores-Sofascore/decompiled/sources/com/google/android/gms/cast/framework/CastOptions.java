package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.eko;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class CastOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CastOptions> CREATOR;
    public static final zzj s = new zzj(false);
    public static final zzl t = new zzl(0);
    public static final CastMediaOptions u;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final LaunchOptions d;
    public final boolean e;
    public final CastMediaOptions f;
    public final boolean g;
    public final double h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final zzj o;
    public zzl p;
    public final boolean q;
    public final boolean r;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public String a;
        public boolean c;
        public final ArrayList b = new ArrayList();
        public final LaunchOptions d = new LaunchOptions();
        public boolean e = true;
        public final eko f = eko.a;
        public boolean g = true;
        public final double h = 0.05000000074505806d;
        public boolean i = false;
        public final ArrayList j = new ArrayList();
        public final boolean k = true;

        public final CastOptions a() {
            CastMediaOptions castMediaOptions = CastOptions.u;
            this.f.getClass();
            if (castMediaOptions == null) {
                yhk.s("use Optional.orNull() instead of Optional.or(null)");
                return null;
            }
            zzj zzjVar = CastOptions.s;
            if (zzjVar == null) {
                yhk.s("use Optional.orNull() instead of Optional.or(null)");
                return null;
            }
            zzl zzlVar = CastOptions.t;
            if (zzlVar == null) {
                yhk.s("use Optional.orNull() instead of Optional.or(null)");
                return null;
            }
            return new CastOptions(this.a, this.b, this.c, this.d, this.e, castMediaOptions, this.g, this.h, false, false, this.i, this.j, this.k, false, zzjVar, zzlVar, false, false);
        }
    }

    static {
        CastMediaOptions.Builder builder = new CastMediaOptions.Builder();
        builder.b = false;
        builder.a = null;
        u = new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, builder.a, false, builder.b);
        CREATOR = new zzn();
    }

    public CastOptions(String str, ArrayList arrayList, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, zzj zzjVar, zzl zzlVar, boolean z9, boolean z10) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z;
        this.d = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.e = z2;
        this.f = castMediaOptions;
        this.g = z3;
        this.h = d;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = arrayList2;
        this.m = z7;
        this.n = z8;
        this.o = zzjVar;
        this.p = zzlVar;
        this.q = z9;
        this.r = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s2 = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.o(parcel, 3, Collections.unmodifiableList(this.b));
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        SafeParcelWriter.r(parcel, 9, 8);
        parcel.writeDouble(this.h);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(this.j ? 1 : 0);
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(this.k ? 1 : 0);
        SafeParcelWriter.o(parcel, 13, Collections.unmodifiableList(this.l));
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(this.m ? 1 : 0);
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(0);
        SafeParcelWriter.r(parcel, 16, 4);
        parcel.writeInt(this.n ? 1 : 0);
        SafeParcelWriter.l(parcel, 17, this.o, i, false);
        SafeParcelWriter.l(parcel, 18, this.p, i, false);
        SafeParcelWriter.r(parcel, 19, 4);
        parcel.writeInt(this.q ? 1 : 0);
        SafeParcelWriter.r(parcel, 20, 4);
        parcel.writeInt(this.r ? 1 : 0);
        SafeParcelWriter.t(parcel, s2);
    }
}
