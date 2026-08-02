package ru.ozon.app.android.storefront.stories.playstoriesv3.data;

import Cm.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/SystemElementsSetting;", "", "", "statusBarHeight", "bottomNavBarHeight", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusBarHeight", "setStatusBarHeight", "(I)V", "getBottomNavBarHeight", "setBottomNavBarHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SystemElementsSetting {
    private int bottomNavBarHeight;
    private int statusBarHeight;

    public SystemElementsSetting(int i11, int i12) {
        this.statusBarHeight = i11;
        this.bottomNavBarHeight = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemElementsSetting)) {
            return false;
        }
        SystemElementsSetting systemElementsSetting = (SystemElementsSetting) other;
        return this.statusBarHeight == systemElementsSetting.statusBarHeight && this.bottomNavBarHeight == systemElementsSetting.bottomNavBarHeight;
    }

    public final int getBottomNavBarHeight() {
        return this.bottomNavBarHeight;
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottomNavBarHeight) + (Integer.hashCode(this.statusBarHeight) * 31);
    }

    public final void setBottomNavBarHeight(int i11) {
        this.bottomNavBarHeight = i11;
    }

    public final void setStatusBarHeight(int i11) {
        this.statusBarHeight = i11;
    }

    @NotNull
    public String toString() {
        return e.c("SystemElementsSetting(statusBarHeight=", this.statusBarHeight, ", bottomNavBarHeight=", ")", this.bottomNavBarHeight);
    }
}
