package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation;

import En.ViewOnClickListenerC2972a;
import GZ.g;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalMobileBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation.AddLegalMobileVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalMobileBinding;", "binding", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalMobileBinding;LGZ/g;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalMobileBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter;", "adapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalMobileViewHolder extends k<AddLegalMobileVO> {

    @NotNull
    private final AddLegalMobileAdvantagesAdapter adapter;

    @NotNull
    private final WidgetAddLegalMobileBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddLegalMobileViewHolder(@NotNull WidgetAddLegalMobileBinding binding, @NotNull g router) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(router, "router");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        AddLegalMobileAdvantagesAdapter addLegalMobileAdvantagesAdapter = new AddLegalMobileAdvantagesAdapter();
        binding.advantagesRv.setAdapter(addLegalMobileAdvantagesAdapter);
        this.adapter = addLegalMobileAdvantagesAdapter;
        binding.addressTv.setOnClickListener(new ViewOnClickListenerC2972a(1, this, router));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AddLegalMobileViewHolder addLegalMobileViewHolder, g gVar, View view) {
        AddLegalMobileVO.InputVO input;
        String deeplink;
        AddLegalMobileVO boundedData = addLegalMobileViewHolder.getBoundedData();
        if (boundedData == null || (input = boundedData.getInput()) == null || (deeplink = input.getDeeplink()) == null) {
            return;
        }
        gVar.b(deeplink, 7831, U.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddLegalMobileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAddLegalMobileBinding widgetAddLegalMobileBinding = this.binding;
        TextAtomV2View titleTav = widgetAddLegalMobileBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomV2View subtitleTav = widgetAddLegalMobileBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bind$default(subtitleTav, item.getSubtitle(), null, 2, null);
        widgetAddLegalMobileBinding.addressTv.setText(item.getInput().getPlaceholder());
        if (item.getAdvantages().isEmpty()) {
            RecyclerView advantagesRv = widgetAddLegalMobileBinding.advantagesRv;
            Intrinsics.checkNotNullExpressionValue(advantagesRv, "advantagesRv");
            ViewExtKt.gone(advantagesRv);
        } else {
            this.adapter.submitList(item.getAdvantages());
            RecyclerView advantagesRv2 = widgetAddLegalMobileBinding.advantagesRv;
            Intrinsics.checkNotNullExpressionValue(advantagesRv2, "advantagesRv");
            ViewExtKt.show(advantagesRv2);
        }
    }
}
