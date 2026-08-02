package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import com.google.android.material.badge.b;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes3.dex */
public class NavigationBarPresenter implements i {

    /* renamed from: a, reason: collision with root package name */
    public Aa.i f35568a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35569b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f35570c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f35571a;

        /* renamed from: b, reason: collision with root package name */
        public ParcelableSparseArray f35572b;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f35571a);
            parcel.writeParcelable(this.f35572b, 0);
        }

        public SavedState(Parcel parcel) {
            this.f35571a = parcel.readInt();
            this.f35572b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(e eVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean b(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f35568a.s(savedState.f35571a);
            this.f35568a.q(b.c(this.f35568a.getContext(), savedState.f35572b));
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable f() {
        SavedState savedState = new SavedState();
        savedState.f35571a = this.f35568a.getSelectedItemId();
        savedState.f35572b = b.d(this.f35568a.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        if (this.f35569b) {
            return;
        }
        if (z10) {
            this.f35568a.d();
        } else {
            this.f35568a.t();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.f35570c;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, e eVar) {
        this.f35568a.a(eVar);
    }

    public void k(int i10) {
        this.f35570c = i10;
    }

    public void l(Aa.i iVar) {
        this.f35568a = iVar;
    }

    public void m(boolean z10) {
        this.f35569b = z10;
    }
}
