package ru.ozon.app.android.gallery.preview;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.databinding.ItemGalleryPhoto360PreviewBinding;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/gallery/preview/Photo360PreviewViewHolder;", "Lru/ozon/app/android/gallery/preview/PreviewViewHolder;", "Lru/ozon/app/android/gallery/databinding/ItemGalleryPhoto360PreviewBinding;", "binding", "Lkotlin/Function0;", "", "selectedItem", "Lkotlin/Function1;", "", "onPreviewClick", "<init>", "(Lru/ozon/app/android/gallery/databinding/ItemGalleryPhoto360PreviewBinding;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/gallery/ItemVO$Photo360;", "item", "bind", "(Lru/ozon/app/android/gallery/ItemVO$Photo360;)V", "Lru/ozon/app/android/gallery/databinding/ItemGalleryPhoto360PreviewBinding;", "Lkotlin/jvm/functions/Function0;", "getSelectedItem", "()Lkotlin/jvm/functions/Function0;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Photo360PreviewViewHolder extends PreviewViewHolder {

    @NotNull
    private final ItemGalleryPhoto360PreviewBinding binding;

    @NotNull
    private final Function0<Integer> selectedItem;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Photo360PreviewViewHolder(@NotNull ItemGalleryPhoto360PreviewBinding binding, @NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onPreviewClick) {
        super(r0, onPreviewClick, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onPreviewClick, "onPreviewClick");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.selectedItem = selectedItem;
    }

    public final void bind(@NotNull ItemVO.Photo360 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.previewGroup.setSelected(this.selectedItem.invoke().intValue() == getAdapterPosition());
        this.binding.previewGroup.setActivated(item.getIsApparel());
    }
}
