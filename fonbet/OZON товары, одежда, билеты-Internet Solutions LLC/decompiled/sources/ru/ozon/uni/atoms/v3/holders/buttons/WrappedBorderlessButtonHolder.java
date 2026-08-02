package ru.ozon.uni.atoms.v3.holders.buttons;

import EI.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0014H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/WrappedBorderlessButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "onBind", "", "item", "getStyleId", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton$SmallBorderLessButtonTheme;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrappedBorderlessButtonHolder extends AtomV3<ButtonV3Atom.SmallBorderlessButton, SmallBorderlessButtonView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<SmallBorderlessButtonView> appearance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.SmallBorderlessButton.SmallBorderLessButtonTheme.values().length];
            try {
                iArr[ButtonV3Atom.SmallBorderlessButton.SmallBorderLessButtonTheme.THEME_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.SmallBorderlessButton.SmallBorderLessButtonTheme.THEME_TYPE_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedBorderlessButtonHolder(@NotNull SmallBorderlessButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        getContainerView().setOnClickListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(WrappedBorderlessButtonHolder wrappedBorderlessButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = (ButtonV3Atom.SmallBorderlessButton) wrappedBorderlessButtonHolder.getData();
        AtomActionDTO action = smallBorderlessButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, smallBorderlessButton.getTrackingInfo())) == null) {
            return;
        }
        wrappedBorderlessButtonHolder.handleAction(atomAction);
    }

    private final int getStyleId(ButtonV3Atom.SmallBorderlessButton.SmallBorderLessButtonTheme smallBorderLessButtonTheme) {
        int i11 = smallBorderLessButtonTheme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[smallBorderLessButtonTheme.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return R$style.SmallBorderlessButtonBold;
        }
        return R$style.SmallBorderlessButton;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.SmallBorderlessButton item) {
        SpannableString text;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedBorderlessButtonHolder) item);
        SmallBorderlessButtonView containerView = getContainerView();
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (UniGlobalConfigKt.getUnderlineLinksFlag(context)) {
            text = new SpannableString(item.getText());
            text.setSpan(new UnderlineSpan(), 0, item.getText().length(), 33);
        } else {
            text = item.getText();
        }
        containerView.setText(text);
        StyleAppearance<SmallBorderlessButtonView> styleAppearance = this.appearance;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        styleAppearance.read(context2, getStyleId(item.getTheme()));
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WrappedBorderlessButtonHolder(@NotNull Context context, String str) {
        this((SmallBorderlessButtonView) q.f64554a.g(N.b(SmallBorderlessButtonView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
