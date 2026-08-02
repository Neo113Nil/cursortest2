package ru.ozon.app.android.fresh.navigation;

import A00.a;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/navigation/CatalogTabsEvent;", "LA00/a$J$a;", "Landroid/graphics/Rect;", "viewVisibleRect", "", "catalogueTabsConnectionTag", "<init>", "(Landroid/graphics/Rect;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Rect;", "getViewVisibleRect", "()Landroid/graphics/Rect;", "Ljava/lang/String;", "getCatalogueTabsConnectionTag", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTabsEvent implements a.J.InterfaceC0007a {
    private final String catalogueTabsConnectionTag;

    @NotNull
    private final Rect viewVisibleRect;

    public CatalogTabsEvent(@NotNull Rect viewVisibleRect, String str) {
        Intrinsics.checkNotNullParameter(viewVisibleRect, "viewVisibleRect");
        this.viewVisibleRect = viewVisibleRect;
        this.catalogueTabsConnectionTag = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTabsEvent)) {
            return false;
        }
        CatalogTabsEvent catalogTabsEvent = (CatalogTabsEvent) other;
        return Intrinsics.d(this.viewVisibleRect, catalogTabsEvent.viewVisibleRect) && Intrinsics.d(this.catalogueTabsConnectionTag, catalogTabsEvent.catalogueTabsConnectionTag);
    }

    public final String getCatalogueTabsConnectionTag() {
        return this.catalogueTabsConnectionTag;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        return this.viewVisibleRect;
    }

    public int hashCode() {
        int hashCode = this.viewVisibleRect.hashCode() * 31;
        String str = this.catalogueTabsConnectionTag;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CatalogTabsEvent(viewVisibleRect=" + this.viewVisibleRect + ", catalogueTabsConnectionTag=" + this.catalogueTabsConnectionTag + ")";
    }
}
