package ru.ozon.app.android.storefront.widgets.helpCert.ui;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.utils.UtilsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/ui/HelpCertView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefront/widgets/helpCert/ui/HelpCertVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/storefront/widgets/helpCert/ui/HelpCertVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/cell/CellView;", "cell$delegate", "LSc/j;", "getCell", "()Lru/ozon/uni/android/cell/CellView;", "cell", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button$delegate", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "description$delegate", "getDescription", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "description", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HelpCertView extends LinearLayout {

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j button;

    /* renamed from: cell$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cell;

    /* renamed from: description$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j description;

    public /* synthetic */ HelpCertView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ButtonV3View getButton() {
        return (ButtonV3View) this.button.getValue();
    }

    private final CellView getCell() {
        return (CellView) this.cell.getValue();
    }

    private final TextAtomV2View getDescription() {
        return (TextAtomV2View) this.description.getValue();
    }

    public final void bind(@NotNull HelpCertVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bindOrGone(getCell(), item.getCell(), actionHandler);
        ButtonV3HolderKt.bindOrGone(getButton(), item.getButton(), actionHandler);
        UtilsKt.updateHorizontalMarginIfNeeded(getButton(), item.getHorizontalOffset());
        TextHolderKt.bindOrGone$default(getDescription(), item.getDescription(), null, 2, null);
        TextViewExtKt.setTextCopyable(getDescription(), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCertView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cell = LazyUtilsKt.unsafeLazy(new HelpCertView$cell$2(this, context));
        this.button = LazyUtilsKt.unsafeLazy(new HelpCertView$button$2(this, context));
        this.description = LazyUtilsKt.unsafeLazy(new HelpCertView$description$2(this, context));
        setOrientation(1);
    }
}
