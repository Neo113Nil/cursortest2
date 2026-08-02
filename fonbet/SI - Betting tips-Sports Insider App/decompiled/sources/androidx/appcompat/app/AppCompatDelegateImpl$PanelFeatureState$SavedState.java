package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public int f202a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f203b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f204c;

    public static AppCompatDelegateImpl$PanelFeatureState$SavedState a(Parcel parcel, ClassLoader classLoader) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.f202a = parcel.readInt();
        boolean z5 = parcel.readInt() == 1;
        appCompatDelegateImpl$PanelFeatureState$SavedState.f203b = z5;
        if (z5) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.f204c = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f202a);
        parcel.writeInt(this.f203b ? 1 : 0);
        if (this.f203b) {
            parcel.writeBundle(this.f204c);
        }
    }
}
