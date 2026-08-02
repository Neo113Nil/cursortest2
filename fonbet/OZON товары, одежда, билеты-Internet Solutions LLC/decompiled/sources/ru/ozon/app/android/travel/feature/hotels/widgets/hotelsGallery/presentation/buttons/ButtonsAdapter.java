package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.buttons;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import gk0.q;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function1;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonViewHolder;", "getItemViewType", "(I)I", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function1;", "ButtonsDiffUtilItemCallback", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonsAdapter extends i<HotelsGalleryVO.VideoButton, ButtonViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SoundController soundController;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonsAdapter$ButtonsDiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$VideoButton;)Z", "areContentsTheSame", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ButtonsDiffUtilItemCallback extends i.d<HotelsGalleryVO.VideoButton> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull HotelsGalleryVO.VideoButton oldItem, @NotNull HotelsGalleryVO.VideoButton newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull HotelsGalleryVO.VideoButton oldItem, @NotNull HotelsGalleryVO.VideoButton newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsAdapter(@NotNull J lifecycleOwner, @NotNull SoundController soundController, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new ButtonsDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.soundController = soundController;
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.hotelsGalleryButtonItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsGalleryVO.VideoButton videoButton = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(videoButton, "get(...)");
        holder.bind(videoButton);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        IconButtonV3View iconButtonV3View = (IconButtonV3View) b.a(IconButtonV3View.class, "type", q.f64554a, null);
        if (iconButtonV3View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        }
        return new ButtonViewHolder(iconButtonV3View, this.onAction, this.soundController);
    }
}
