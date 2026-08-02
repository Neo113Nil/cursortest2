package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import A00.a;
import CG.b;
import Sc.InterfaceC4008j;
import WZ.l;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b!\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H$¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "LSc/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;LWZ/l;Ll10/b;LSc/j;)V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "aspectImage", "", "payload", "bindElement", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;Ljava/lang/Object;)V", "item", "bind", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "LWZ/l;", "Ll10/b;", "LSc/j;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AspectsV4BaseImageVH extends RecyclerView.C {

    @NotNull
    private final InterfaceC4008j<Function1<AtomAction, Unit>> actionHandler;
    private AspectsV4ImageVO.Variant aspectImage;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4BaseImageVH(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull InterfaceC7851b controller, @NotNull InterfaceC4008j<? extends Function1<? super AtomAction, Unit>> actionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.controller = controller;
        this.actionHandler = actionHandler;
        containerView.setOnClickListener(new b(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(AspectsV4BaseImageVH aspectsV4BaseImageVH, View view) {
        h.b bVar;
        AspectsV4ImageVO.Variant variant = aspectsV4BaseImageVH.aspectImage;
        if (variant != null) {
            if (variant.getIsSelected() && variant.getLabel() == null) {
                return;
            }
            AtomAction action = variant.getAction();
            if (action != null) {
                aspectsV4BaseImageVH.actionHandler.getValue().invoke(action);
            } else {
                InterfaceC7851b interfaceC7851b = aspectsV4BaseImageVH.controller;
                String refreshDeeplink = variant.getRefreshDeeplink();
                Integer rootScrollWidgetKey = variant.getRootScrollWidgetKey();
                l.a.b bVar2 = null;
                if (rootScrollWidgetKey != null) {
                    int intValue = rootScrollWidgetKey.intValue();
                    ViewParent parent = aspectsV4BaseImageVH.containerView.getParent();
                    if (!(parent instanceof RecyclerView)) {
                        parent = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) parent;
                    Integer valueOf = recyclerView != null ? Integer.valueOf((int) recyclerView.getY()) : null;
                    bVar = new h.b(new a.C.d(intValue, valueOf != null ? valueOf.intValue() : 0, 28, false), bVar2, 2);
                } else {
                    bVar = null;
                }
                InterfaceC7851b.a.a(interfaceC7851b, refreshDeeplink, null, null, bVar, 6);
            }
            TokenizedAnalyticsExtKt.processClickEvents(aspectsV4BaseImageVH.tokenizedAnalytics, variant.getTokenizedEvent());
        }
    }

    protected abstract void bind(@NotNull AspectsV4ImageVO.Variant item, Object payload);

    public final void bindElement(@NotNull AspectsV4ImageVO.Variant aspectImage, Object payload) {
        Intrinsics.checkNotNullParameter(aspectImage, "aspectImage");
        this.aspectImage = aspectImage;
        this.containerView.setSelected(aspectImage.getIsSelected());
        bind(aspectImage, payload);
    }
}
