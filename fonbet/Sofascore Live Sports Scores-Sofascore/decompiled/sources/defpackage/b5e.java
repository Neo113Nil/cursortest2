package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.results.view.PageIndicator$SavedState;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b5e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        PageIndicator$SavedState pageIndicator$SavedState = new PageIndicator$SavedState(parcel);
        pageIndicator$SavedState.a = parcel.readInt();
        return pageIndicator$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PageIndicator$SavedState[i];
    }
}
