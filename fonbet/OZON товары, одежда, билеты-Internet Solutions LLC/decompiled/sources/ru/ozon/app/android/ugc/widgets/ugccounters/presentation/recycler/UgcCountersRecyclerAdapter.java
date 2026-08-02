package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler;

import Ej.b;
import Sc.o;
import WZ.t;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
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

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*Bm\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\"\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersRecyclerAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Item;", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "imageBlockClickAction", "LWZ/t;", "onBlockInVisibleBounds", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lkotlin/Function0;", "onImageLoadSuccessful", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "Lkotlin/jvm/functions/Function0;", "getOnImageLoadSuccessful", "()Lkotlin/jvm/functions/Function0;", "Landroid/graphics/drawable/ShapeDrawable;", "preCreationBgImageDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersRecyclerAdapter extends i<UgcCountersVO.Item, j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<AtomAction, PreloadVideoInfo, Unit> imageBlockClickAction;
    private final UgcCountersImagesPreCreationConfig imagesPreCreationConfig;

    @NotNull
    private final Function1<t, Unit> onBlockInVisibleBounds;

    @NotNull
    private final Function0<Unit> onImageLoadSuccessful;
    private final ShapeDrawable preCreationBgImageDrawable;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/recycler/UgcCountersRecyclerAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_UNKNOWN_BLOCK", "", "VIEW_TYPE_SINGLE_BLOCK", "VIEW_TYPE_DOUBLE_BLOCK", "VIEW_TYPE_IMAGE_BLOCK", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UgcCountersRecyclerAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super AtomAction, ? super PreloadVideoInfo, Unit> imageBlockClickAction, @NotNull Function1<? super t, Unit> onBlockInVisibleBounds, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig, @NotNull Function0<Unit> onImageLoadSuccessful) {
        super(new i.d<UgcCountersVO.Item>() { // from class: ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersRecyclerAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(UgcCountersVO.Item oldItem, UgcCountersVO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(UgcCountersVO.Item oldItem, UgcCountersVO.Item newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getBlock().getId() == newItem.getBlock().getId();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(imageBlockClickAction, "imageBlockClickAction");
        Intrinsics.checkNotNullParameter(onBlockInVisibleBounds, "onBlockInVisibleBounds");
        Intrinsics.checkNotNullParameter(onImageLoadSuccessful, "onImageLoadSuccessful");
        this.actionHandler = actionHandler;
        this.imageBlockClickAction = imageBlockClickAction;
        this.onBlockInVisibleBounds = onBlockInVisibleBounds;
        this.imagesPreCreationConfig = ugcCountersImagesPreCreationConfig;
        this.onImageLoadSuccessful = onImageLoadSuccessful;
        this.preCreationBgImageDrawable = ugcCountersImagesPreCreationConfig != null ? UgcCountersImageBlockView.INSTANCE.createPreCreationBgImageDrawable(ugcCountersImagesPreCreationConfig) : null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        UgcCountersVO.Block block = getItem(position).getBlock();
        if (block instanceof UgcCountersVO.Block.Single) {
            return 1;
        }
        if (block instanceof UgcCountersVO.Block.Double) {
            return 2;
        }
        if (block instanceof UgcCountersVO.Block.Images) {
            return 3;
        }
        if (block instanceof UgcCountersVO.Block.Expanding) {
            return -1;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        UgcCountersVO.Item item = getItem(position);
        if (holder instanceof UgcCountersSingleBlockItemViewHolder) {
            UgcCountersVO.Block block = item.getBlock();
            Intrinsics.g(block, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block.Single");
            ((UgcCountersSingleBlockItemViewHolder) holder).bind((UgcCountersVO.Block.Single) block);
        } else if (holder instanceof UgcCountersDoubleBlockItemViewHolder) {
            UgcCountersVO.Block block2 = item.getBlock();
            Intrinsics.g(block2, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block.Double");
            ((UgcCountersDoubleBlockItemViewHolder) holder).bind((UgcCountersVO.Block.Double) block2, item.getWidgetBackgroundColor());
        } else {
            if (!(holder instanceof UgcCountersImageBlockItemViewHolder)) {
                throw new IllegalArgumentException("Unknown holder = " + holder);
            }
            UgcCountersVO.Block block3 = item.getBlock();
            Intrinsics.g(block3, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block.Images");
            ((UgcCountersImageBlockItemViewHolder) holder).bind((UgcCountersVO.Block.Images) block3, item.getWidgetBackgroundColor(), this.onImageLoadSuccessful);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            return UgcCountersSingleBlockItemViewHolder.INSTANCE.createViewHolder(parent, this.actionHandler, this.onBlockInVisibleBounds);
        }
        if (viewType == 2) {
            return UgcCountersDoubleBlockItemViewHolder.INSTANCE.createViewHolder(parent, this.actionHandler, this.onBlockInVisibleBounds);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType = "));
        }
        return UgcCountersImageBlockItemViewHolder.INSTANCE.createViewHolder(parent, this.imageBlockClickAction, this.onBlockInVisibleBounds, this.preCreationBgImageDrawable, this.imagesPreCreationConfig);
    }
}
