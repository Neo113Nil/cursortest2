package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.a;
import com.google.android.material.internal.ParcelableSparseArray;
import xsna.mk5;
import xsna.ow50;
import xsna.rw50;
import xsna.zmp0;

/* loaded from: classes13.dex */
public final class NavigationBarPresenter implements j {
    public rw50 b;
    public boolean c;
    public int d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

        @Nullable
        public ParcelableSparseArray c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                savedState.c = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    @NonNull
    public final Parcelable b() {
        SavedState savedState = new SavedState();
        savedState.b = this.b.getSelectedItemId();
        SparseArray<a> badgeDrawables = this.b.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            a valueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(keyAt, valueAt != null ? valueAt.f.a : null);
        }
        savedState.c = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        mk5 mk5Var;
        if (this.c) {
            return;
        }
        if (z) {
            this.b.a();
            return;
        }
        rw50 rw50Var = this.b;
        f fVar = rw50Var.F;
        if (fVar == null || rw50Var.g == null) {
            return;
        }
        int size = fVar.f.size();
        if (size != rw50Var.g.length) {
            rw50Var.a();
            return;
        }
        int i = rw50Var.h;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = rw50Var.F.getItem(i2);
            if (item.isChecked()) {
                rw50Var.h = item.getItemId();
                rw50Var.i = i2;
            }
        }
        if (i != rw50Var.h && (mk5Var = rw50Var.b) != null) {
            zmp0.a(rw50Var, mk5Var);
        }
        boolean f = rw50.f(rw50Var.f, rw50Var.F.l().size());
        for (int i3 = 0; i3 < size; i3++) {
            rw50Var.E.c = true;
            rw50Var.g[i3].setLabelVisibilityMode(rw50Var.f);
            rw50Var.g[i3].setShifting(f);
            rw50Var.g[i3].c((h) rw50Var.F.getItem(i3));
            rw50Var.E.c = false;
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(@Nullable h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(@Nullable m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(@Nullable h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(@NonNull Context context, @NonNull f fVar) {
        this.b.F = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            rw50 rw50Var = this.b;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.b;
            int size = rw50Var.F.f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = rw50Var.F.getItem(i2);
                if (i == item.getItemId()) {
                    rw50Var.h = i;
                    rw50Var.i = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.b.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.c;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(keyAt, state != null ? new a(context, state) : null);
            }
            rw50 rw50Var2 = this.b;
            SparseArray<a> sparseArray2 = rw50Var2.t;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, (a) sparseArray.get(keyAt2));
                }
            }
            ow50[] ow50VarArr = rw50Var2.g;
            if (ow50VarArr != null) {
                for (ow50 ow50Var : ow50VarArr) {
                    a aVar = sparseArray2.get(ow50Var.getId());
                    if (aVar != null) {
                        ow50Var.setBadge(aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(@Nullable f fVar, boolean z) {
    }
}
