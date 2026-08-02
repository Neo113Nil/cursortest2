package ru.ozon.app.android.widgets.designSystemAtoms.presentation;

import D90.c;
import Sc.o;
import android.R;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.platform.widgets.databinding.WidgetDsAtomsBinding;
import ru.ozon.app.android.widgets.designSystemAtoms.core.MarkStateDirty;
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DSAtomsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/i;", "container", "<init>", "(Landroid/view/View;Ll10/i;)V", "", "onItemClick", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/widgets/designSystemAtoms/presentation/DesignSystemAtomsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Ll10/i;", "getContainer", "()Ll10/i;", "Lru/ozon/app/android/platform/widgets/databinding/WidgetDsAtomsBinding;", "binding", "Lru/ozon/app/android/platform/widgets/databinding/WidgetDsAtomsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "widgetBackColor", "I", "transparentColor", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DSAtomsWidgetViewHolder extends k<DesignSystemAtomsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDsAtomsBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final View containerView;
    private final int transparentColor;
    private final int widgetBackColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DesignSystemAtomsDTO.AtomLayoutRule.values().length];
            try {
                iArr[DesignSystemAtomsDTO.AtomLayoutRule.ATOM_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignSystemAtomsDTO.AtomLayoutRule.WIDGET_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSAtomsWidgetViewHolder(@NotNull View containerView, @NotNull i container) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
        this.container = container;
        WidgetDsAtomsBinding bind = WidgetDsAtomsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new DSAtomsWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.widgetBackColor = a.getColor(getContext(), R$color.bg_accent_secondary);
        this.transparentColor = a.getColor(getContext(), R.color.transparent);
        SingleAtom singleAtom = bind.dsAtom;
        singleAtom.setOnClickListener(new c(this, 5));
        singleAtom.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick() {
        DesignSystemAtomsVO boundData = getBoundData();
        if ((boundData != null ? boundData.getAtom() : null) instanceof TagButtonDTO) {
            this.container.M().d(new MarkStateDirty(boundData.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DesignSystemAtomsVO item, @NotNull d info) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDsAtomsBinding widgetDsAtomsBinding = this.binding;
        int i12 = WhenMappings.$EnumSwitchMapping$0[item.getAtomLayoutRule().ordinal()];
        if (i12 == 1) {
            i11 = -2;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = -1;
        }
        widgetDsAtomsBinding.dsAtom.setLayoutParams(new FrameLayout.LayoutParams(i11, -2, 17));
        widgetDsAtomsBinding.atomContainer.setBackgroundColor(item.getShowWidgetBackground() ? this.widgetBackColor : this.transparentColor);
        widgetDsAtomsBinding.dsAtom.bind(item.getAtom(), true);
        widgetDsAtomsBinding.dsAtom.setOnAction(this.actionHandler);
    }
}
