package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import Bi.b;
import D40.d;
import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ=\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001b\u0010\u001d\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000bR\u001b\u0010 \u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000bR\u001b\u0010#\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\b¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderFirstFloorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "createBackButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createSubtitle", "createRightButton", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "onBack", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "backButton$delegate", "LSc/j;", "getBackButton", "backButton", "title$delegate", "getTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle$delegate", "getSubtitle", "subtitle", "rightButton$delegate", "getRightButton", "rightButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormHeaderFirstFloorView extends ConstraintLayout {

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backButton;

    /* renamed from: rightButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightButton;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormHeaderFirstFloorView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backButton = DelegatesKt.lazyUnsafe(new SelectionFormHeaderFirstFloorView$special$$inlined$lazyView$1(this, this));
        this.title = DelegatesKt.lazyUnsafe(new SelectionFormHeaderFirstFloorView$special$$inlined$lazyView$2(this, this));
        this.subtitle = DelegatesKt.lazyUnsafe(new SelectionFormHeaderFirstFloorView$special$$inlined$lazyView$3(this, this));
        this.rightButton = DelegatesKt.lazyUnsafe(new SelectionFormHeaderFirstFloorView$special$$inlined$lazyView$4(this, this));
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_6(), dimens.getDP_3(), dimens.getDP_6(), dimens.getDP_8());
        setBackground(ContextExtKt.createRoundRectShape$default(context, dimens.getDPF_24(), CornersConfig.BOTTOM, UniColors.LAYER_FLOOR_1.getResId(), 0, null, 24, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View createBackButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.selectionFormHeaderBackButton, -2, -2);
        c11.f41656t = 0;
        c11.f41636i = 0;
        c11.f41642l = 0;
        iconButtonV3View.setLayoutParams(c11);
        return iconButtonV3View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View createRightButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.selectionFormHeaderRightButton, -2, -2);
        c11.f41658v = 0;
        c11.f41636i = 0;
        c11.f41642l = 0;
        iconButtonV3View.setLayoutParams(c11);
        return iconButtonV3View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createSubtitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.selectionFormHeaderSubtitle, 0, -2);
        d11.f41655s = R$id.selectionFormHeaderBackButton;
        d11.f41657u = R$id.selectionFormHeaderRightButton;
        d11.f41638j = R$id.selectionFormHeaderTitle;
        d11.f41642l = 0;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createTitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.selectionFormHeaderTitle, 0, -2);
        d11.f41655s = R$id.selectionFormHeaderBackButton;
        d11.f41657u = R$id.selectionFormHeaderRightButton;
        d11.f41636i = 0;
        d11.f41640k = R$id.selectionFormHeaderSubtitle;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final IconButtonV3View getBackButton() {
        return (IconButtonV3View) this.backButton.getValue();
    }

    private final IconButtonV3View getRightButton() {
        return (IconButtonV3View) this.rightButton.getValue();
    }

    private final TextAtomV2View getSubtitle() {
        return (TextAtomV2View) this.subtitle.getValue();
    }

    private final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue();
    }

    public final void bind(@NotNull SelectionFormHeaderVO vo, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function1<? super AtomAction, Unit> onBack) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        TextHolderKt.bindOrGone$default(getTitle(), vo.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitle(), vo.getSubtitle(), null, 2, null);
        IconButtonV3HolderKt.bind(getBackButton(), vo.getBackButton(), onBack);
        IconButtonV3HolderKt.bindOrGone(getRightButton(), vo.getRightButton(), onAction);
    }
}
