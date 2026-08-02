package ru.ozon.app.android.pdp.widgets.othersellers.presentation.footer;

import WZ.t;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetOtherSellersFooterBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/footer/OtherSellersFooterViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/footer/OtherSellersFooterVO;", "Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersFooterBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/othersellers/presentation/footer/OtherSellersFooterVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "itemsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellersFooterViewHolder extends BindingWidgetViewHolder<OtherSellersFooterVO, WidgetOtherSellersFooterBinding> {

    @NotNull
    private final View containerView;

    @NotNull
    private final AtomsAdapter itemsAdapter;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.othersellers.presentation.footer.OtherSellersFooterViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetOtherSellersFooterBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetOtherSellersFooterBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetOtherSellersFooterBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetOtherSellersFooterBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.othersellers.presentation.footer.OtherSellersFooterViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        AnonymousClass2() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction it) {
            t tokenizedEvent;
            Intrinsics.checkNotNullParameter(it, "it");
            OtherSellersFooterVO otherSellersFooterVO = (OtherSellersFooterVO) OtherSellersFooterViewHolder.this.getBoundedData();
            if (otherSellersFooterVO != null && (tokenizedEvent = otherSellersFooterVO.getTokenizedEvent()) != null) {
                TokenizedAnalyticsExtKt.processClickEvents(OtherSellersFooterViewHolder.this.getRefs().getTokenizedAnalytics(), tokenizedEvent);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherSellersFooterViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.itemsAdapter = atomsAdapter;
        atomsAdapter.setOnAction(new ActionHandler.Builder(refs, this).customAnalyticHandler(new AnonymousClass2()).buildHandler());
        FrameAtomsLayout frameAtomsLayout = getBinding().itemsFAL;
        frameAtomsLayout.setAdapter(atomsAdapter);
        Context context = frameAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameAtomsLayout.setDecorator(new OtherSellersFooterDecoration(context));
    }

    @NotNull
    public final ComposerReferences getRefs() {
        return this.refs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OtherSellersFooterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.itemsAdapter.bind(getContext(), C7714v.a0(item.getCellDefault()));
    }
}
