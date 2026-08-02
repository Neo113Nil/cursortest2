package com.huawei.hms.health;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.client.Result;
import java.lang.reflect.Array;

/* loaded from: classes13.dex */
public abstract class aabr extends Result implements Parcelable {
    private static final String TAG = "EnhanceResult";

    public static class aab<T extends Parcelable> implements Parcelable.Creator<T> {
        private final Class<T> aab;

        public aab(Class<T> cls) {
            this.aab = cls;
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            com.huawei.hms.health.aab.aab("createFromParcel begin of").append(this.aab.getName());
            Parcelable aab = aabs.aab(this.aab, parcel);
            com.huawei.hms.health.aab.aab("createFromParcel end of").append(this.aab.getName());
            return aab;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return (Parcelable[]) Array.newInstance((Class<?>) this.aab, i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.huawei.hms.health.aab.aab("writeToParcel begin of ").append(getClass().getName());
        aabs.aab(this, parcel, i);
    }
}
