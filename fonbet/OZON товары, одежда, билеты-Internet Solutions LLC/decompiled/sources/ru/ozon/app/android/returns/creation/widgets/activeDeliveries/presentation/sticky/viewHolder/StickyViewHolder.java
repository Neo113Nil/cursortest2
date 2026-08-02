package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewHolder;

import Vg.d;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewHolder.StickyViewHolder;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewItem.StickyVI;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewHolder/StickyViewHolder;", "Ld20/a;", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewItem/StickyVI;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "containerView", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;Ll10/i;LVg/d;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewItem/StickyVI;)V", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Ll10/i;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyViewHolder extends AbstractC6064a<StickyVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final i container;

    @NotNull
    private final VerticalAtomsLayout containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float CORNER_RADIUS = UiExtKt.toPxF(24);
    private static final float CONTAINER_ELEVATION = UiExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewHolder/StickyViewHolder$Companion;", "", "<init>", "()V", "", "CORNER_RADIUS", "F", "getCORNER_RADIUS", "()F", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return StickyViewHolder.CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyViewHolder(@NotNull VerticalAtomsLayout containerView, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.containerView = containerView;
        this.container = container;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new StickyViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        containerView.setAdapter(atomsAdapter);
        containerView.setClipToOutline(true);
        containerView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewHolder.StickyViewHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                StickyViewHolder.Companion companion;
                StickyViewHolder.Companion companion2;
                StickyViewHolder.Companion companion3;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    companion = StickyViewHolder.Companion;
                    int corner_radius = (int) companion.getCORNER_RADIUS();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    companion2 = StickyViewHolder.Companion;
                    int corner_radius2 = height + ((int) companion2.getCORNER_RADIUS());
                    companion3 = StickyViewHolder.Companion;
                    outline.setRoundRect(0, corner_radius, width, corner_radius2, companion3.getCORNER_RADIUS());
                }
            }
        });
        containerView.setDecorator(new StickyAtomDecoration());
        containerView.setElevation(CONTAINER_ELEVATION);
        atomsAdapter.setOnAction(buildHandler);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        atomsAdapter.bind(L11, item.getButtons());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L12 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        Integer parseColor = styleParser.parseColor(L12, item.getBackgroundColor());
        if (parseColor != null) {
            this.containerView.setBackgroundColor(parseColor.intValue());
        }
    }
}
