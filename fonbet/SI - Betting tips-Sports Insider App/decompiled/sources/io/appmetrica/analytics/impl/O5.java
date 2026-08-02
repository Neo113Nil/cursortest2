package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class O5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC0327m9 enumC0327m9;
        Bundle readBundle = parcel.readBundle(B6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i5 = readBundle.getInt("CounterReport.Source");
            EnumC0327m9[] values = EnumC0327m9.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC0327m9 = EnumC0327m9.NATIVE;
                    break;
                }
                enumC0327m9 = values[i10];
                if (enumC0327m9.f14257a == i5) {
                    break;
                }
                i10++;
            }
        } else {
            enumC0327m9 = null;
        }
        P5 p52 = new P5("", "", 0);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        p52.f12730d = readBundle.getInt("CounterReport.Type", -1);
        p52.f12731e = readBundle.getInt("CounterReport.CustomType");
        p52.f12728b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        p52.f12729c = readBundle.getString("CounterReport.Environment");
        p52.f12727a = readBundle.getString("CounterReport.Event");
        p52.f12732f = P5.a(readBundle);
        p52.f12733g = readBundle.getInt("CounterReport.TRUNCATED");
        p52.f12734h = readBundle.getString("CounterReport.ProfileID");
        p52.f12735i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        p52.j = readBundle.getLong("CounterReport.CreationTimestamp");
        p52.f12736k = EnumC0098da.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        p52.f12737l = enumC0327m9;
        p52.f12738m = readBundle.getBundle("CounterReport.Payload");
        p52.f12739n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        p52.f12740o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        p52.f12741p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return p52;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new P5[i5];
    }
}
