package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.AppTheme;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        AppTheme.Icon icon = null;
        AppTheme.Headline headline = null;
        AppTheme.Description description = null;
        AppTheme.CallToAction callToAction = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    icon = (AppTheme.Icon) SafeParcelReader.h(parcel, readInt, AppTheme.Icon.CREATOR);
                    break;
                case 7:
                    headline = (AppTheme.Headline) SafeParcelReader.h(parcel, readInt, AppTheme.Headline.CREATOR);
                    break;
                case '\b':
                    description = (AppTheme.Description) SafeParcelReader.h(parcel, readInt, AppTheme.Description.CREATOR);
                    break;
                case '\t':
                    callToAction = (AppTheme.CallToAction) SafeParcelReader.h(parcel, readInt, AppTheme.CallToAction.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        AppTheme appTheme = new AppTheme();
        appTheme.a = 0;
        appTheme.b = 0;
        appTheme.c = 0;
        appTheme.d = 0;
        appTheme.e = 0;
        appTheme.f = new AppTheme.Icon();
        appTheme.g = new AppTheme.Headline();
        appTheme.h = new AppTheme.Description();
        appTheme.i = new AppTheme.CallToAction();
        appTheme.a = i;
        appTheme.b = i2;
        appTheme.c = i3;
        appTheme.d = i4;
        appTheme.e = i5;
        if (icon == null) {
            icon = new AppTheme.Icon();
        }
        appTheme.f = icon;
        if (headline == null) {
            headline = new AppTheme.Headline();
        }
        appTheme.g = headline;
        if (description == null) {
            description = new AppTheme.Description();
        }
        appTheme.h = description;
        if (callToAction == null) {
            callToAction = new AppTheme.CallToAction();
        }
        appTheme.i = callToAction;
        return appTheme;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppTheme[i];
    }
}
