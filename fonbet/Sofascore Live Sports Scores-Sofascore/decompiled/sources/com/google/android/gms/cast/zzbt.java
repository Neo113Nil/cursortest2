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
public final class zzbt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int readInt;
        int B = SafeParcelReader.B(parcel);
        double d = 0.0d;
        long j = 0;
        long j2 = 0;
        String str = null;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            double d2 = d;
            while (parcel.dataPosition() < B) {
                readInt = parcel.readInt();
                switch ((char) readInt) {
                    case 2:
                        mediaInfo = (MediaInfo) SafeParcelReader.h(parcel, readInt, MediaInfo.CREATOR);
                        break;
                    case 3:
                        mediaQueueData = (MediaQueueData) SafeParcelReader.h(parcel, readInt, MediaQueueData.CREATOR);
                        break;
                    case 4:
                        bool = SafeParcelReader.p(parcel, readInt);
                        break;
                    case 5:
                        j = SafeParcelReader.x(parcel, readInt);
                        break;
                    case 6:
                        break;
                    case 7:
                        jArr = SafeParcelReader.g(parcel, readInt);
                        break;
                    case '\b':
                        str = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\t':
                        str2 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\n':
                        str3 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case 11:
                        str4 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\f':
                        str5 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\r':
                        j2 = SafeParcelReader.x(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.A(parcel, readInt);
                        break;
                }
            }
            SafeParcelReader.n(parcel, B);
            Pattern pattern = CastUtils.a;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException unused) {
                }
                return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d2, jArr, jSONObject, str2, str3, str4, str5, j2);
            }
            jSONObject = null;
            return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d2, jArr, jSONObject, str2, str3, str4, str5, j2);
            d = SafeParcelReader.r(parcel, readInt);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
