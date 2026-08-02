package ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetTravelModalPersonalManagerBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter.TravelModalPersonalManagerAdvantageAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.adapter.TravelModalPersonalManagerButtonsDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/TravelModalPersonalManagerVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelModalPersonalManagerBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelModalPersonalManagerBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/adapter/TravelModalPersonalManagerAdvantageAdapter;", "advantagesAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelModalPersonalManager/presentation/adapter/TravelModalPersonalManagerAdvantageAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelModalPersonalManagerWidgetViewHolder extends k<TravelModalPersonalManagerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelModalPersonalManagerAdvantageAdapter advantagesAdapter;

    @NotNull
    private final WidgetTravelModalPersonalManagerBinding binding;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelModalPersonalManagerWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        WidgetTravelModalPersonalManagerBinding bind = WidgetTravelModalPersonalManagerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        TravelModalPersonalManagerAdvantageAdapter travelModalPersonalManagerAdvantageAdapter = new TravelModalPersonalManagerAdvantageAdapter();
        this.advantagesAdapter = travelModalPersonalManagerAdvantageAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        RecyclerView recyclerView = bind.modalPersonalManagerContentListRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(travelModalPersonalManagerAdvantageAdapter);
        atomsAdapter.setOnAction(buildHandler);
        VerticalAtomsLayout verticalAtomsLayout = bind.modalPersonalManagerButtonsVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new TravelModalPersonalManagerButtonsDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelModalPersonalManagerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View modalPersonalManagerBackgroundView = this.binding.modalPersonalManagerBackgroundView;
        Intrinsics.checkNotNullExpressionValue(modalPersonalManagerBackgroundView, "modalPersonalManagerBackgroundView");
        modalPersonalManagerBackgroundView.setVisibility(item.getHasBackground() ? 0 : 8);
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getLogoBackgroundColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            View modalPersonalManagerBackgroundView2 = this.binding.modalPersonalManagerBackgroundView;
            Intrinsics.checkNotNullExpressionValue(modalPersonalManagerBackgroundView2, "modalPersonalManagerBackgroundView");
            ViewExtKt.setBackgroundTint(modalPersonalManagerBackgroundView2, intValue);
        }
        AppCompatImageView modalPersonalManagerLogoIV = this.binding.modalPersonalManagerLogoIV;
        Intrinsics.checkNotNullExpressionValue(modalPersonalManagerLogoIV, "modalPersonalManagerLogoIV");
        ImageViewExtKt.loadImageOrGone(modalPersonalManagerLogoIV, item.getLogo());
        TextAtomView modalPersonalManagerTitleTAV = this.binding.modalPersonalManagerTitleTAV;
        Intrinsics.checkNotNullExpressionValue(modalPersonalManagerTitleTAV, "modalPersonalManagerTitleTAV");
        TextAtomHolderKt.bind$default(modalPersonalManagerTitleTAV, item.getTitle(), null, 2, null);
        this.advantagesAdapter.setItems(item.getContentList());
        TextAtomView modalPersonalManagerNotificationTAV = this.binding.modalPersonalManagerNotificationTAV;
        Intrinsics.checkNotNullExpressionValue(modalPersonalManagerNotificationTAV, "modalPersonalManagerNotificationTAV");
        TextAtomHolderKt.bindOrGone$default(modalPersonalManagerNotificationTAV, item.getNotificationText(), null, 2, null);
        this.buttonsAdapter.bind(getContext(), item.getButtons());
    }
}
