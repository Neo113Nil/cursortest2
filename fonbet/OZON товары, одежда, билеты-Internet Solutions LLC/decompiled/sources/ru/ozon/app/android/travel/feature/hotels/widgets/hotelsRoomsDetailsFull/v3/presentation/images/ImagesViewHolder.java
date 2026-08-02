package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.images;

import Dc0.n;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v3/presentation/images/ImagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lcom/google/android/material/imageview/ShapeableImageView;", "view", "Lkotlin/Function1;", "", "", "imageClickListener", "<init>", "(Lcom/google/android/material/imageview/ShapeableImageView;Lkotlin/jvm/functions/Function1;)V", "", ImagesContract.URL, "bind", "(Ljava/lang/String;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagesViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<Integer, Unit> imageClickListener;

    @NotNull
    private final ShapeableImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImagesViewHolder(@NotNull ShapeableImageView view, @NotNull Function1<? super Integer, Unit> imageClickListener) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageClickListener, "imageClickListener");
        this.view = view;
        this.imageClickListener = imageClickListener;
        view.setOnClickListener(new n(this, 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ImagesViewHolder imagesViewHolder, View view) {
        imagesViewHolder.imageClickListener.invoke(Integer.valueOf(imagesViewHolder.getAdapterPosition()));
    }

    public final void bind(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ImageViewExtKt.load$default(this.view, url, null, null, null, null, false, null, 126, null);
    }
}
