package ru.ozon.app.android.cart.emptyCart.core.v2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2ViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "updateConstraints", "Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2VO;Lkotlin/jvm/functions/Function1;)V", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getDefaultLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "defaultLayoutParams", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyCartV2ViewGroup extends ConstraintLayout {
    private final AttributeSet attrs;

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2ViewGroup$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmptyCartV2ViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.title);
        addView(this.subtitle);
        addView(this.button);
    }

    private final ConstraintLayout.b getDefaultLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        return bVar;
    }

    private final void updateConstraints() {
        d dVar = new d();
        dVar.p(this);
        int id2 = this.title.getId();
        int i11 = dp16;
        dVar.t(id2, 6, 0, 6, i11);
        dVar.t(this.title.getId(), 7, 0, 7, i11);
        dVar.t(this.subtitle.getId(), 6, 0, 6, i11);
        dVar.t(this.subtitle.getId(), 3, this.title.getId(), 4, dp8);
        dVar.t(this.subtitle.getId(), 7, 0, 7, i11);
        int id3 = this.button.getId();
        int i12 = dp12;
        dVar.t(id3, 6, 0, 6, i12);
        dVar.t(this.button.getId(), 3, this.subtitle.getId(), 4, i12);
        dVar.t(this.button.getId(), 7, 0, 7, i12);
        dVar.f(this);
    }

    public final void bind(@NotNull EmptyCartV2VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitle, item.getSubtitle(), null, 2, null);
        ButtonV3HolderKt.bind(this.button, item.getButton(), actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyCartV2ViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.attrs = attributeSet;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        textAtomV2View.setId(R$id.emptyCartV2Title);
        textAtomV2View.setLayoutParams(getDefaultLayoutParams());
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context2, null, 0, 6, null) : textAtomV2View2;
        textAtomV2View2.setId(R$id.emptyCartV2Subtitle);
        textAtomV2View2.setLayoutParams(getDefaultLayoutParams());
        this.subtitle = textAtomV2View2;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context2, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View.setId(R$id.emptyCartV2Button);
        buttonV3View.setLayoutParams(getDefaultLayoutParams());
        this.button = buttonV3View;
        setId(R$id.rootCl);
        setFocusable(true);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor0));
        addViews();
        updateConstraints();
    }
}
