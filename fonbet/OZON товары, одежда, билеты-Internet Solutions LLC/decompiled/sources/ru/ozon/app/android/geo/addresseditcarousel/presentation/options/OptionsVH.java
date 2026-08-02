package ru.ozon.app.android.geo.addresseditcarousel.presentation.options;

import Aw.ViewOnClickListenerC2448a;
import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.AddressEditCarouselVO;
import ru.ozon.app.android.geo.databinding.ItemOptionWidgetAddresseditcarouselBinding;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/options/OptionsVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/geo/databinding/ItemOptionWidgetAddresseditcarouselBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lru/ozon/app/android/geo/databinding/ItemOptionWidgetAddresseditcarouselBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$Option;", "item", "bind", "(Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$Option;)V", "Lru/ozon/app/android/geo/databinding/ItemOptionWidgetAddresseditcarouselBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$Option;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "labelsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OptionsVH extends RecyclerView.C {

    @NotNull
    private final ItemOptionWidgetAddresseditcarouselBinding binding;
    private AddressEditCarouselVO.Option item;

    @NotNull
    private final AtomsAdapter labelsAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionsVH(@NotNull ItemOptionWidgetAddresseditcarouselBinding binding, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.binding = binding;
        this.onAction = onAction;
        Map map = null;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(Label.class, null, 2, 0 == true ? 1 : 0), new LabelAtom.Configuration(0, 0, 0, 0, null, null, null, null, R$style.TextStyle_Caption, 0, null, null, null, 7933, null))), map, null, null, 14, null);
        this.labelsAdapter = atomsAdapter;
        binding.clickHandle.setOnClickListener(new ViewOnClickListenerC2448a(this, 17));
        binding.labelsHAL.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OptionsVH optionsVH, View view) {
        AtomAction action;
        AddressEditCarouselVO.Option option = optionsVH.item;
        if (option == null || (action = option.getAction()) == null) {
            return;
        }
        optionsVH.onAction.invoke(action);
    }

    public final void bind(@NotNull AddressEditCarouselVO.Option item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemOptionWidgetAddresseditcarouselBinding itemOptionWidgetAddresseditcarouselBinding = this.binding;
        this.item = item;
        View clickHandle = itemOptionWidgetAddresseditcarouselBinding.clickHandle;
        Intrinsics.checkNotNullExpressionValue(clickHandle, "clickHandle");
        ClickableCiewKt.switchBluewaveRectRipple(clickHandle, item.getAction() != null);
        itemOptionWidgetAddresseditcarouselBinding.cellView.bind(item.getCell(), this.onAction);
        HorizontalScrollView labelsNSV = itemOptionWidgetAddresseditcarouselBinding.labelsNSV;
        Intrinsics.checkNotNullExpressionValue(labelsNSV, "labelsNSV");
        ViewExtKt.showOrGone(labelsNSV, Boolean.valueOf(item.getMarketingInfo() != null));
        AtomsAdapter atomsAdapter = this.labelsAdapter;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<Label> marketingInfo = item.getMarketingInfo();
        if (marketingInfo == null) {
            marketingInfo = K.f71697a;
        }
        atomsAdapter.bind(context, marketingInfo);
    }
}
