package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.an10;
import xsna.ao;
import xsna.c5g;
import xsna.e43;
import xsna.en;
import xsna.j5g;
import xsna.n8g;

/* compiled from: GradientParams.kt */
/* loaded from: classes17.dex */
public final class GradientParams implements Parcelable {
    public static final Parcelable.Creator<GradientParams> CREATOR = new b();
    public final List<GradientPointAndColorMultiplier> b;
    public final int[] c;
    public final float[] d;

    /* compiled from: GradientParams.kt */
    public static final class a {
        public static GradientParams a() {
            return new GradientParams(e43.l(new GradientPointAndColorMultiplier(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new GradientPointAndColorMultiplier(0.75f, 0.12f), new GradientPointAndColorMultiplier(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        }
    }

    /* compiled from: GradientParams.kt */
    public static final class b implements Parcelable.Creator<GradientParams> {
        @Override // android.os.Parcelable.Creator
        public final GradientParams createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GradientPointAndColorMultiplier.CREATOR, parcel, arrayList, i, 1);
            }
            return new GradientParams(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GradientParams[] newArray(int i) {
            return new GradientParams[i];
        }
    }

    public GradientParams(List<GradientPointAndColorMultiplier> list) {
        this.b = list;
        this.c = new int[list.size()];
        List<GradientPointAndColorMultiplier> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((GradientPointAndColorMultiplier) it.next()).b));
        }
        this.d = j5g.L0(arrayList);
    }

    public static void a(List list, int i, int[] iArr) throws IllegalArgumentException {
        if (list.size() != iArr.length) {
            throw new IllegalArgumentException("Multiplier size and result color size must be equals");
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            iArr[i2] = n8g.l(i, an10.b(Color.alpha(i) * ((GradientPointAndColorMultiplier) obj).c));
            i2 = i3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((GradientPointAndColorMultiplier) a2.next()).writeToParcel(parcel, i);
        }
    }
}
