package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.f0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.y;
import androidx.appcompat.view.menu.z;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationBarPresenter implements z {

    /* renamed from: id, reason: collision with root package name */
    private int f5920id;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        };
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i5) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean collapseItemActionView(n nVar, p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean expandItemActionView(n nVar, p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public int getId() {
        return this.f5920id;
    }

    public b0 getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.z
    public void initForMenu(@NonNull Context context, @NonNull n nVar) {
        this.menuView.initialize(nVar);
    }

    @Override // androidx.appcompat.view.menu.z
    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.z
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.z
    public boolean onSubMenuSelected(f0 f0Var) {
        return false;
    }

    public void setId(int i5) {
        this.f5920id = i5;
    }

    public void setMenuView(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z5) {
        this.updateSuspended = z5;
    }

    @Override // androidx.appcompat.view.menu.z
    public void updateMenuView(boolean z5) {
        if (this.updateSuspended) {
            return;
        }
        if (z5) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public void setCallback(y yVar) {
    }

    @Override // androidx.appcompat.view.menu.z
    public void onCloseMenu(n nVar, boolean z5) {
    }
}
