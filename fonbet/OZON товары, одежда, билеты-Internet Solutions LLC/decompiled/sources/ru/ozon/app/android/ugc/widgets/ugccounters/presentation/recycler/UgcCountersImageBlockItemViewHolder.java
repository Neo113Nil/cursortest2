package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler;

import WZ.t;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersImageBlockView;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersImageBlockItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;", "imageBlockView", "Lkotlin/Function1;", "LWZ/t;", "", "onBlockInVisibleBounds", "<init>", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images;", "block", "", "widgetBackgroundColor", "Lkotlin/Function0;", "onImageLoadSuccessful", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "item", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersImageBlockItemViewHolder extends j {

    @NotNull
    private final UgcCountersImageBlockView imageBlockView;
    private UgcCountersVO.Block item;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00062\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersImageBlockItemViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "", "imageBlockClickAction", "Lkotlin/Function1;", "LWZ/t;", "onBlockInVisibleBounds", "Landroid/graphics/drawable/ShapeDrawable;", "preCreationBgImageDrawable", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersImageBlockItemViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroid/graphics/drawable/ShapeDrawable;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersImageBlockItemViewHolder;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UgcCountersImageBlockItemViewHolder createViewHolder(@NotNull ViewGroup parent, @NotNull Function2<? super AtomAction, ? super PreloadVideoInfo, Unit> imageBlockClickAction, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds, ShapeDrawable preCreationBgImageDrawable, UgcCountersImagesPreCreationConfig imagesPreCreationConfig) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(imageBlockClickAction, "imageBlockClickAction");
            Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new UgcCountersImageBlockItemViewHolder(new UgcCountersImageBlockView(context, imageBlockClickAction, imagesPreCreationConfig, preCreationBgImageDrawable), onBlockInVisibleBounds);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UgcCountersImageBlockItemViewHolder(@NotNull UgcCountersImageBlockView imageBlockView, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds) {
        super(imageBlockView);
        Intrinsics.checkNotNullParameter(imageBlockView, "imageBlockView");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        this.imageBlockView = imageBlockView;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
    }

    public final void bind(@NotNull UgcCountersVO.Block.Images block, @NotNull String widgetBackgroundColor, @NotNull Function0<Unit> onImageLoadSuccessful) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
        Intrinsics.checkNotNullParameter(onImageLoadSuccessful, "onImageLoadSuccessful");
        this.item = block;
        this.imageBlockView.bind(block, widgetBackgroundColor, onImageLoadSuccessful);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        Function1<t, Unit> function1 = this.onBlockInVisibleBounds;
        UgcCountersVO.Block block = this.item;
        function1.invoke(block != null ? block.getTokenizedEvent() : null);
    }
}
