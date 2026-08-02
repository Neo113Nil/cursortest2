package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.cell;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetNamedValueListCellBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellVO;", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListCellBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "", "bindName", "(Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellVO;)V", "bindValue", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/cell/NamedValueListCellVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NamedValueListCellViewHolder extends BindingWidgetViewHolder<NamedValueListCellVO, WidgetNamedValueListCellBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.cell.NamedValueListCellViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetNamedValueListCellBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetNamedValueListCellBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListCellBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetNamedValueListCellBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetNamedValueListCellBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NamedValueListCellViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    private final void bindName(NamedValueListCellVO item) {
        TextAtomV2View nameTav = getBinding().nameTav;
        Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
        TextHolderKt.bind$default(nameTav, item.getName(), null, 2, null);
    }

    private final void bindValue(NamedValueListCellVO item) {
        TextAtomV2View valueTav = getBinding().valueTav;
        Intrinsics.checkNotNullExpressionValue(valueTav, "valueTav");
        TextHolderKt.bindOrGone$default(valueTav, item.getValue(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NamedValueListCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindName(item);
        bindValue(item);
    }
}
