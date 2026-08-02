package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images;

import AS.a;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/images/HotelsRoomsListV5ImagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lcom/google/android/material/imageview/ShapeableImageView;", "view", "<init>", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", "", ImagesContract.URL, "", "bind", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "", "imageClickListener", "setupCallbacks", "(Lkotlin/jvm/functions/Function1;)V", "removeCallbacks", "()V", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5ImagesViewHolder extends RecyclerView.C {
    private Function1<? super Integer, Unit> imageClickListener;

    @NotNull
    private final ShapeableImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5ImagesViewHolder(@NotNull ShapeableImageView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HotelsRoomsListV5ImagesViewHolder hotelsRoomsListV5ImagesViewHolder, View view) {
        Function1<? super Integer, Unit> function1 = hotelsRoomsListV5ImagesViewHolder.imageClickListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(hotelsRoomsListV5ImagesViewHolder.getAdapterPosition()));
        }
    }

    public final void bind(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ImageViewExtKt.load$default(this.view, url, null, null, null, null, false, null, 126, null);
    }

    public final void removeCallbacks() {
        this.imageClickListener = null;
    }

    public final void setupCallbacks(@NotNull Function1<? super Integer, Unit> imageClickListener) {
        Intrinsics.checkNotNullParameter(imageClickListener, "imageClickListener");
        this.imageClickListener = imageClickListener;
    }
}
