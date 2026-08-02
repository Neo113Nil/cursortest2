package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images;

import Ez.ViewOnClickListenerC2978b;
import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesViewHolder;", "Ljk0/j;", "Lcom/google/android/material/imageview/ShapeableImageView;", "containerView", "<init>", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", "Lkotlin/Function0;", "", "callback", "setupCallback", "(Lkotlin/jvm/functions/Function0;)V", "removeCallback", "()V", "", "item", "bind", "(Ljava/lang/String;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2ImagesViewHolder extends j {

    @NotNull
    private final ShapeableImageView containerView;
    private Function0<Unit> onClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursRoomsListV2ImagesViewHolder(@NotNull ShapeableImageView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        containerView.setOnClickListener(new ViewOnClickListenerC2978b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ToursRoomsListV2ImagesViewHolder toursRoomsListV2ImagesViewHolder, View view) {
        Function0<Unit> function0 = toursRoomsListV2ImagesViewHolder.onClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.containerView, item, null, null, null, null, false, null, 126, null);
    }

    public final void removeCallback() {
        this.onClickListener = null;
    }

    public final void setupCallback(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onClickListener = callback;
    }
}
