package com.blaze.blazesdk.ads.ima.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.ads.models.ui.BlazeAdProvider;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.dmi;
import defpackage.w1l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b implements BlazeParcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String a;
    public final BlazeAdProvider b;
    public final Map c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            BlazeAdProvider valueOf = parcel.readInt() == 0 ? null : BlazeAdProvider.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = w1l.a(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new b(readString, valueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b(@NotNull String str, @Nullable BlazeAdProvider blazeAdProvider, @NotNull Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = blazeAdProvider;
        this.c = map;
    }

    public static b copy$default(b bVar, String str, BlazeAdProvider blazeAdProvider, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.a;
        }
        if ((i & 2) != 0) {
            blazeAdProvider = bVar.b;
        }
        if ((i & 4) != 0) {
            map = bVar.c;
        }
        bVar.getClass();
        str.getClass();
        map.getClass();
        return new b(str, blazeAdProvider, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.a, bVar.a) && this.b == bVar.b && Intrinsics.c(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        BlazeAdProvider blazeAdProvider = this.b;
        return this.c.hashCode() + ((hashCode + (blazeAdProvider == null ? 0 : blazeAdProvider.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImaModel(tag=");
        sb.append(this.a);
        sb.append(", adProvider=");
        sb.append(this.b);
        sb.append(", context=");
        return dmi.s(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        BlazeAdProvider blazeAdProvider = this.b;
        if (blazeAdProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(blazeAdProvider.name());
        }
        Map map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
