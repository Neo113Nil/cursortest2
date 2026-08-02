package ru.ozon.app.android.gallery.preview;

import Il.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/gallery/preview/PreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "", "", "onPreviewClick", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getOnPreviewClick", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/gallery/preview/Photo360PreviewViewHolder;", "Lru/ozon/app/android/gallery/preview/PhotoPreviewViewHolder;", "Lru/ozon/app/android/gallery/preview/VideoPreviewViewHolder;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PreviewViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<Integer, Unit> onPreviewClick;

    public /* synthetic */ PreviewViewHolder(View view, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PreviewViewHolder previewViewHolder, View view) {
        previewViewHolder.onPreviewClick.invoke(Integer.valueOf(previewViewHolder.getAdapterPosition()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PreviewViewHolder(View view, Function1<? super Integer, Unit> function1) {
        super(view);
        this.onPreviewClick = function1;
        view.setOnClickListener(new a(this, 11));
    }
}
