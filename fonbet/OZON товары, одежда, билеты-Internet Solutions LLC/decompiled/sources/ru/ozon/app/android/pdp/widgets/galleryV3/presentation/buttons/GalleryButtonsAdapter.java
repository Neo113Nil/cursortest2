package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.PdpWidgetGalleryButtonBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryButtonsVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdpvideomolecule.R$drawable;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B1\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryButtonsVO;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function0;", "onClickFullScreen", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function0;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "Lkotlin/jvm/functions/Function0;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryButtonsAdapter extends t<GalleryButtonsVO, GalleryButtonViewHolder<GalleryButtonsVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function0<Unit> onClickFullScreen;

    @NotNull
    private final SoundController soundController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryButtonsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull SoundController soundController, @NotNull Function0<Unit> onClickFullScreen) {
        super(new i.d<GalleryButtonsVO>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(GalleryButtonsVO oldItem, GalleryButtonsVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(GalleryButtonsVO oldItem, GalleryButtonsVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(onClickFullScreen, "onClickFullScreen");
        this.actionHandler = actionHandler;
        this.soundController = soundController;
        this.onClickFullScreen = onClickFullScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull GalleryButtonViewHolder<GalleryButtonsVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryButtonsVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public GalleryButtonViewHolder<GalleryButtonsVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == GalleryButtonType.SOUND.ordinal()) {
            SoundController soundController = this.soundController;
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setId(R$id.soundControlView);
            Dimens dimens = Dimens.INSTANCE;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimens.getDP_32(), dimens.getDP_32());
            marginLayoutParams.bottomMargin = dimens.getDP_8();
            marginLayoutParams.rightMargin = dimens.getDP_16();
            imageView.setLayoutParams(marginLayoutParams);
            int dp_8 = dimens.getDP_8();
            imageView.setPadding(dp_8, dp_8, dp_8, dp_8);
            imageView.setBackground(C7232a.a(imageView.getContext(), R$drawable.pdp_video_molecule_button_bg));
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textLightKey)));
            return new GallerySoundButtonVH(imageView, soundController);
        }
        if (viewType != GalleryButtonType.FULL_VIEW.ordinal()) {
            PdpWidgetGalleryButtonBinding inflate = PdpWidgetGalleryButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new GalleryButtonVH(inflate, this.actionHandler);
        }
        Function0<Unit> function0 = this.onClickFullScreen;
        ImageView imageView2 = new ImageView(parent.getContext());
        imageView2.setId(R$id.fullScreenVideoBtn);
        Dimens dimens2 = Dimens.INSTANCE;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(dimens2.getDP_32(), dimens2.getDP_32());
        marginLayoutParams2.bottomMargin = dimens2.getDP_8();
        marginLayoutParams2.rightMargin = dimens2.getDP_16();
        imageView2.setLayoutParams(marginLayoutParams2);
        int dp_82 = dimens2.getDP_8();
        imageView2.setPadding(dp_82, dp_82, dp_82, dp_82);
        imageView2.setBackground(C7232a.a(imageView2.getContext(), R$drawable.pdp_video_molecule_button_bg));
        imageView2.setImageDrawable(C7232a.a(imageView2.getContext(), ru.ozon.uni.core.R$drawable.ic_s_full_screen));
        Context context2 = imageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(imageView2, Integer.valueOf(ThemeExtKt.themeColor(context2, R$attr.textLightKey)));
        return new GalleryFullViewButtonVH(imageView2, function0);
    }
}
