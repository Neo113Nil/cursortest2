package ru.ozon.app.android.ugc.widgets.selectionItemForm.disclaimer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00020\u0013j\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R2\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/disclaimer/SelectionFormDisclaimerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/disclaimer/SelectionFormDisclaimerVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/FrameLayout;", "createView", "(Landroid/view/ViewGroup;)Landroid/widget/FrameLayout;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/disclaimer/SelectionDisclaimerWidgetVH;", "holderProducer", "getHolderProducer", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormDisclaimerViewMapper extends WidgetViewMapper2<SelectionItemFormComponent, SelectionFormDisclaimerVO, SelectionFormDisclaimerVO> {

    @NotNull
    private final Function2<SelectionFormDisclaimerVO, d, List<SelectionFormDisclaimerVO>> mapper = SelectionFormDisclaimerViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, SelectionDisclaimerWidgetVH> holderProducer = SelectionFormDisclaimerViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SelectionFormDisclaimerVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SelectionDisclaimerWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SelectionFormDisclaimerVO, d, List<SelectionFormDisclaimerVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionItemFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionItemFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public FrameLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        frameLayout.setBackgroundColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View disclaimerView = new DisclaimerView(context2, null, 0, 0, 14, null);
        disclaimerView.setId(R$id.selectionFormDisclaimer);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        marginLayoutParams.setMarginStart(dimens.getDP_16());
        marginLayoutParams.setMarginEnd(dimens.getDP_16());
        disclaimerView.setLayoutParams(marginLayoutParams);
        frameLayout.addView(disclaimerView);
        return frameLayout;
    }
}
