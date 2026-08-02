package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonwidgets.databinding.WidgetCommonCurtainBinding;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.AtomsAdapter;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.CurtainItemsDecoration;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR'\u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/CurtainContentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/CurtainContentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetCommonCurtainBinding;", "viewBinding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/commonwidgets/databinding/WidgetCommonCurtainBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/CurtainContentVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/CurtainContentVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/commonwidgets/databinding/WidgetCommonCurtainBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/adapter/AtomsAdapter;", "adapter", "Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/adapter/AtomsAdapter;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainContentViewHolder extends k<CurtainContentVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final WidgetCommonCurtainBinding viewBinding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CurtainContentViewHolder(@NotNull WidgetCommonCurtainBinding viewBinding, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        LinearLayout constraintLayout = viewBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.viewBinding = viewBinding;
        this.refs = refs;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new CurtainContentViewHolder$actionHandler$2(this));
        AtomsAdapter atomsAdapter = new AtomsAdapter(getActionHandler());
        this.adapter = atomsAdapter;
        viewBinding.atomsRv.setAdapter(atomsAdapter);
        viewBinding.atomsRv.addItemDecoration(new CurtainItemsDecoration(0, 0, 3, null));
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CurtainContentVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Image pictureIv = this.viewBinding.pictureIv;
        Intrinsics.checkNotNullExpressionValue(pictureIv, "pictureIv");
        ImageHolderKt.bindOrGone$default(pictureIv, item.getImage(), null, 2, null);
        List<TextDTO> titles = item.getTitles();
        if (titles == null) {
            titles = K.f71697a;
        }
        List<ButtonV3DTO> buttons = item.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        this.adapter.submitList(C7714v.p0(buttons, titles));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CurtainContentVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CurtainContentViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
