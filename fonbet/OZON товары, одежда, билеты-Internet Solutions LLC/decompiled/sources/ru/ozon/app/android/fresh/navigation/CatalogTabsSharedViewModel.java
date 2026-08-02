package ru.ozon.app.android.fresh.navigation;

import He.b;
import android.graphics.Rect;
import androidx.lifecycle.w0;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "onCleared", "Landroid/graphics/Rect;", "viewVisibleRect", "", "catalogueTabsConnectionTag", "onWidgetVisibleAreaChanged", "(Landroid/graphics/Rect;Ljava/lang/String;)V", "Lze/h;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsEvent;", AppsFlyerProperties.CHANNEL, "Lze/h;", "getChannel", "()Lze/h;", "Lxe/M;", "newScope", "Lxe/M;", "getNewScope$annotations", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsSharedViewModel extends w0 {

    @NotNull
    private final h<CatalogTabsEvent> channel = k.a(0, 5, EnumC11113a.SUSPEND);

    @NotNull
    private final M newScope;

    public CatalogTabsSharedViewModel() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.newScope = N.a(b.f10879b.w(1).plus(X0.b()));
    }

    @NotNull
    public final h<CatalogTabsEvent> getChannel() {
        return this.channel;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        N.c(this.newScope, null);
    }

    public final void onWidgetVisibleAreaChanged(@NotNull Rect viewVisibleRect, String catalogueTabsConnectionTag) {
        Intrinsics.checkNotNullParameter(viewVisibleRect, "viewVisibleRect");
        C10727i.c(this.newScope, null, null, new CatalogTabsSharedViewModel$onWidgetVisibleAreaChanged$1(this, viewVisibleRect, catalogueTabsConnectionTag, null), 3);
    }
}
