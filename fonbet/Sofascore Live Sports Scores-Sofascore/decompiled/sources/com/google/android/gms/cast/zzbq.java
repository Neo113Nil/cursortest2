package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (c == 4) {
                num = SafeParcelReader.w(parcel, readInt);
            } else if (c == 5) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str3 = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, B);
        Pattern pattern = CastUtils.a;
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException unused) {
            }
            return new MediaError(str, j, num, str2, jSONObject);
        }
        jSONObject = null;
        return new MediaError(str, j, num, str2, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
