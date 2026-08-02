package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormDisclaimer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerWidgetVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormDisclaimer/ReviewFormDisclaimerMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormDisclaimerViewMapper extends WidgetViewMapper2<ReviewFormComponent, DisclaimerDTO, ReviewFormDisclaimerVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ReviewFormDisclaimerWidgetVH> holderProducer = ReviewFormDisclaimerViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof DisclaimerDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReviewFormDisclaimerWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public DisclaimerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, 0, 14, null);
        disclaimerView.setId(R$id.reviewFormDisclaimer);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        marginLayoutParams.setMarginStart(dimens.getDP_8());
        marginLayoutParams.setMarginEnd(dimens.getDP_8());
        disclaimerView.setLayoutParams(marginLayoutParams);
        return disclaimerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReviewFormDisclaimerMapper getMapper() {
        return component().getDisclaimerMapper();
    }
}
