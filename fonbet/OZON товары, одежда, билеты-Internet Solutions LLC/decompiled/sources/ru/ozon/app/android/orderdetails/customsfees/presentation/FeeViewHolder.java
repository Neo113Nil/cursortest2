package ru.ozon.app.android.orderdetails.customsfees.presentation;

import Dc0.n;
import Vg.d;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.orderdetails.databinding.WidgetFeeBinding;
import ru.ozon.app.android.orderdetails.molecule.images.presentation.ImagesDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetFeeBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetFeeBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetFeeBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "firstRowDelegate", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "secondRowDelegate", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeeViewHolder extends k<FeeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFeeBinding binding;

    @NotNull
    private final ImagesDelegate firstRowDelegate;

    @NotNull
    private final ImagesDelegate secondRowDelegate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Set<Class<CopyTextActionHandler>> SUPPORTED_ACTIONS = e0.h(CopyTextActionHandler.class);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeViewHolder$Companion;", "", "<init>", "()V", "SUPPORTED_ACTIONS", "", "Ljava/lang/Class;", "Lru/ozon/app/android/common/actionHandlers/CopyTextActionHandler;", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<CopyTextActionHandler>> getSUPPORTED_ACTIONS() {
            return FeeViewHolder.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeeViewHolder(@NotNull WidgetFeeBinding binding, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull AdultListDelegateProvider adultListDelegateProvider) {
        super(r3);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new FeeViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        ImagesView firstRowRv = binding.firstRowRv;
        Intrinsics.checkNotNullExpressionValue(firstRowRv, "firstRowRv");
        this.firstRowDelegate = new ImagesDelegate(this, firstRowRv, adultListDelegateProvider.get(), 4, FeeViewHolder$firstRowDelegate$1.INSTANCE);
        ImagesView secondRowRv = binding.secondRowRv;
        Intrinsics.checkNotNullExpressionValue(secondRowRv, "secondRowRv");
        this.secondRowDelegate = new ImagesDelegate(this, secondRowRv, adultListDelegateProvider.get(), 4, FeeViewHolder$secondRowDelegate$1.INSTANCE);
        binding.copyTextClickArea.setOnClickListener(new n(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FeeViewHolder feeViewHolder, View view) {
        AtomAction copyAction;
        FeeVO boundedData = feeViewHolder.getBoundedData();
        if (boundedData == null || (copyAction = boundedData.getCopyAction()) == null) {
            return;
        }
        feeViewHolder.actionHandler.invoke(copyAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeeVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFeeBinding widgetFeeBinding = this.binding;
        TextAtomV2View titleTav = widgetFeeBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone(titleTav, item.getTitle(), this.actionHandler);
        if (Build.VERSION.SDK_INT >= 29) {
            widgetFeeBinding.titleTav.setBreakStrategy(1);
        }
        TextAtomV2View copyTextTav = widgetFeeBinding.copyTextTav;
        Intrinsics.checkNotNullExpressionValue(copyTextTav, "copyTextTav");
        TextHolderKt.bindOrGone(copyTextTav, item.getCopyText(), this.actionHandler);
        IconView copyIconIv = widgetFeeBinding.copyIconIv;
        Intrinsics.checkNotNullExpressionValue(copyIconIv, "copyIconIv");
        IconHolderKt.bindOrGone(copyIconIv, item.getCopyIcon(), this.actionHandler);
        TextAtomV2View subtitleTav = widgetFeeBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        ButtonV3View buttonV = widgetFeeBinding.buttonV;
        Intrinsics.checkNotNullExpressionValue(buttonV, "buttonV");
        ButtonV3HolderKt.bindOrGone(buttonV, item.getButton(), this.actionHandler);
        this.firstRowDelegate.bind(item.getFirstRow());
        this.secondRowDelegate.bind(item.getSecondRow());
    }
}
