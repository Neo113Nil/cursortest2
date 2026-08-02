package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5Resources;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5SingleIconButtonBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\u00102\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ButtonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Button;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/BaseGalleryV5ButtonVH;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "initialPreCreationConfig", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "buttonsViewModelProvider", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "galleryResources", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;Lkotlin/jvm/functions/Function1;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/BaseGalleryV5ButtonVH;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/BaseGalleryV5ButtonVH;I)V", "", "buttons", "preCreationConfig", "submitList", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5Resources;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "buttonsViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5ButtonsAdapter extends t<GalleryV5VO.Button, BaseGalleryV5ButtonVH> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private GalleryV5OnboardingViewModel buttonsViewModel;

    @NotNull
    private final GalleryV5OnboardingViewModel buttonsViewModelProvider;

    @NotNull
    private final GalleryV5Resources galleryResources;

    @NotNull
    private GalleryV5PreCreationConfig preCreationConfig;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV5ButtonsAdapter(@NotNull GalleryV5PreCreationConfig initialPreCreationConfig, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV5OnboardingViewModel buttonsViewModelProvider, @NotNull GalleryV5Resources galleryResources, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<GalleryV5VO.Button>() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ButtonsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(GalleryV5VO.Button oldItem, GalleryV5VO.Button newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(GalleryV5VO.Button oldItem, GalleryV5VO.Button newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(initialPreCreationConfig, "initialPreCreationConfig");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(buttonsViewModelProvider, "buttonsViewModelProvider");
        Intrinsics.checkNotNullParameter(galleryResources, "galleryResources");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.buttonsViewModelProvider = buttonsViewModelProvider;
        this.galleryResources = galleryResources;
        this.actionHandler = actionHandler;
        this.preCreationConfig = initialPreCreationConfig;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    public final void submitList(List<GalleryV5VO.Button> buttons, @NotNull GalleryV5PreCreationConfig preCreationConfig) {
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        this.preCreationConfig = preCreationConfig;
        submitList(buttons);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseGalleryV5ButtonVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryV5VO.Button item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseGalleryV5ButtonVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        boolean z11 = false;
        if (viewType == GalleryV5VO.ButtonViewType.ON_BOARDING_ICON.ordinal()) {
            if (this.buttonsViewModel == null) {
                this.buttonsViewModel = this.buttonsViewModelProvider;
            }
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new GalleryV5OnBoardingButtonVH(new GalleryV5OnBoardingButtonView(context, this.galleryResources, false), new GalleryV5ButtonOnBoardingBinder(this.buttonsViewModel, this.tokenizedAnalytics, this.refs.getContainer().g(), this.galleryResources, this.preCreationConfig.getButtonsBg()));
        }
        if (viewType != GalleryV5VO.ButtonViewType.ON_BOARDING.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GalleryV5ImageButtonView galleryV5ImageButtonView = new GalleryV5ImageButtonView(context2, z11, 2, null);
            galleryV5ImageButtonView.setBackground(this.galleryResources.getBgRoundButtons());
            return new GalleryV5ButtonVH(galleryV5ImageButtonView, new GalleryV5SingleIconButtonBinder(this.galleryResources, this.preCreationConfig.getButtonsBg()));
        }
        if (this.buttonsViewModel == null) {
            this.buttonsViewModel = this.buttonsViewModelProvider;
        }
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        return new GalleryV5OnBoardingButtonVH(new GalleryV5OnBoardingButtonView(context3, this.galleryResources, true), new GalleryV5ButtonOnBoardingBinder(this.buttonsViewModel, this.tokenizedAnalytics, this.refs.getContainer().g(), this.galleryResources, this.preCreationConfig.getButtonsBg()));
    }
}
