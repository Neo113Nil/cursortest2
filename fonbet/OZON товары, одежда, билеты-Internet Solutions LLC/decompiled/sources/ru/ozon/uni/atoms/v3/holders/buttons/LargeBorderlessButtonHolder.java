package ru.ozon.uni.atoms.v3.holders.buttons;

import Ar.d;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/LargeBorderlessButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LargeBorderlessButtonHolder extends AtomV3<ButtonV3Atom.LargeBorderlessButton, LargeBorderlessButtonView> {

    @NotNull
    private final StyleAppearance<LargeBorderlessButtonView> appearance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeBorderlessButtonHolder(@NotNull LargeBorderlessButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        getContainerView().setOnClickListener(new d(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(LargeBorderlessButtonHolder largeBorderlessButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = (ButtonV3Atom.LargeBorderlessButton) largeBorderlessButtonHolder.getData();
        AtomActionDTO action = largeBorderlessButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, largeBorderlessButton.getTrackingInfo())) == null) {
            return;
        }
        largeBorderlessButtonHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.LargeBorderlessButton item) {
        SpannableString text;
        int styleId;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LargeBorderlessButtonHolder) item);
        LargeBorderlessButtonView containerView = getContainerView();
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (UniGlobalConfigKt.getUnderlineLinksFlag(context)) {
            text = new SpannableString(item.getText());
            text.setSpan(new UnderlineSpan(), 0, item.getText().length(), 33);
        } else {
            text = item.getText();
        }
        containerView.setText(text);
        StyleAppearance<LargeBorderlessButtonView> styleAppearance = this.appearance;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        styleId = LargeBorderlessButtonHolderKt.getStyleId(item.getTheme());
        styleAppearance.read(context2, styleId);
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeBorderlessButtonHolder(@NotNull Context context, String str) {
        this(new LargeBorderlessButtonView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
