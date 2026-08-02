package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay;

import android.content.Context;
import android.view.View;
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
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getAtomsLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "atomsLayout", "ButtonsVerticalDecorator", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoButtonsWidgetViewHolder extends AbstractC6064a<MilesForBuyersModalInfoButtonsVO> {
    public static final int $stable = AtomsAdapter.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilesForBuyersModalInfoButtonsWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
    }

    private final VerticalAtomsLayout getAtomsLayout() {
        View view = getView();
        if (view instanceof VerticalAtomsLayout) {
            return (VerticalAtomsLayout) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.atomsAdapter.setOnAction(this.actionHandler);
        VerticalAtomsLayout atomsLayout = getAtomsLayout();
        if (atomsLayout != null) {
            atomsLayout.setAdapter(this.atomsAdapter);
            Context context = atomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsLayout.setDecorator(new ButtonsVerticalDecorator(context, 0, 2, null));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsWidgetViewHolder$ButtonsVerticalDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "margin", "", "<init>", "(Landroid/content/Context;I)V", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ButtonsVerticalDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int margin;

        public /* synthetic */ ButtonsVerticalDecorator(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i12 & 2) != 0 ? ResourceExtKt.toPx(8, context) : i11);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            setBottom(lp, this.margin);
            return lp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonsVerticalDecorator(@NotNull Context context, int i11) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.margin = i11;
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull MilesForBuyersModalInfoButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        VerticalAtomsLayout atomsLayout = getAtomsLayout();
        if (atomsLayout != null) {
            AtomsAdapter atomsAdapter = this.atomsAdapter;
            Context context = atomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, item.getButtons());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = atomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, item.getBackgroundColor());
            atomsLayout.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }
    }
}
