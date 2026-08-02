package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SlidingPaneLayout$SavedState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2613b;

    public SlidingPaneLayout$SavedState(Parcel parcel) {
        super(parcel, null);
        this.f2612a = parcel.readInt() != 0;
        this.f2613b = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f2612a ? 1 : 0);
        parcel.writeInt(this.f2613b);
    }
}
