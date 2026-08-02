package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import Pk0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/image/GalleryV5ZoomConfig;", "", "Lkotlin/Function1;", "", "", "isViewFullVisible", "", "onGalleryElementsVisible", "isSelect", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getOnGalleryElementsVisible", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV5ZoomConfig {
    private final boolean isSelect;

    @NotNull
    private final Function1<Integer, Boolean> isViewFullVisible;

    @NotNull
    private final Function1<Boolean, Unit> onGalleryElementsVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5ZoomConfig(@NotNull Function1<? super Integer, Boolean> isViewFullVisible, @NotNull Function1<? super Boolean, Unit> onGalleryElementsVisible, boolean z11) {
        Intrinsics.checkNotNullParameter(isViewFullVisible, "isViewFullVisible");
        Intrinsics.checkNotNullParameter(onGalleryElementsVisible, "onGalleryElementsVisible");
        this.isViewFullVisible = isViewFullVisible;
        this.onGalleryElementsVisible = onGalleryElementsVisible;
        this.isSelect = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV5ZoomConfig)) {
            return false;
        }
        GalleryV5ZoomConfig galleryV5ZoomConfig = (GalleryV5ZoomConfig) other;
        return Intrinsics.d(this.isViewFullVisible, galleryV5ZoomConfig.isViewFullVisible) && Intrinsics.d(this.onGalleryElementsVisible, galleryV5ZoomConfig.onGalleryElementsVisible) && this.isSelect == galleryV5ZoomConfig.isSelect;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        return this.onGalleryElementsVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelect) + ((this.onGalleryElementsVisible.hashCode() + (this.isViewFullVisible.hashCode() * 31)) * 31);
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final Function1<Integer, Boolean> isViewFullVisible() {
        return this.isViewFullVisible;
    }

    @NotNull
    public String toString() {
        Function1<Integer, Boolean> function1 = this.isViewFullVisible;
        Function1<Boolean, Unit> function12 = this.onGalleryElementsVisible;
        boolean z11 = this.isSelect;
        StringBuilder sb2 = new StringBuilder("GalleryV5ZoomConfig(isViewFullVisible=");
        sb2.append(function1);
        sb2.append(", onGalleryElementsVisible=");
        sb2.append(function12);
        sb2.append(", isSelect=");
        return a.a(")", sb2, z11);
    }
}
