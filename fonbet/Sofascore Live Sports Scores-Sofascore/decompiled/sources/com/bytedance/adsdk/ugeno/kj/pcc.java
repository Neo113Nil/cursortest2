package com.bytedance.adsdk.ugeno.kj;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc implements Parcelable {
    private final Parcelable sf;
    public static final pcc pcc = new pcc() { // from class: com.bytedance.adsdk.ugeno.kj.pcc.1
    };
    public static final Parcelable.Creator<pcc> CREATOR = new Parcelable.ClassLoaderCreator<pcc>() { // from class: com.bytedance.adsdk.ugeno.kj.pcc.2
        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return pcc.pcc;
            }
            a70.r("superState must be null");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc[] newArray(int i) {
            return new pcc[i];
        }
    };

    public pcc(Parcelable parcelable) {
        if (parcelable != null) {
            this.sf = parcelable == pcc ? null : parcelable;
        } else {
            a70.p("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable pcc() {
        return this.sf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.sf, i);
    }

    private pcc() {
        this.sf = null;
    }

    public pcc(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.sf = readParcelable == null ? pcc : readParcelable;
    }
}
