package ru.ozon.uni.atoms.v3.holders.buttons;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;", "", "getStyleId", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LargeBorderlessButtonHolderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.LargeBorderlessButton.LargeBorderLessButtonTheme.values().length];
            try {
                iArr[ButtonV3Atom.LargeBorderlessButton.LargeBorderLessButtonTheme.THEME_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.LargeBorderlessButton.LargeBorderLessButtonTheme.THEME_TYPE_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC3999a
    public static final void bind(@NotNull LargeBorderlessButtonView largeBorderlessButtonView, @NotNull ButtonV3Atom.LargeBorderlessButton dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(largeBorderlessButtonView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(largeBorderlessButtonView, dto, new LargeBorderlessButtonHolderKt$bind$provider$1(largeBorderlessButtonView), function1);
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull LargeBorderlessButtonView largeBorderlessButtonView, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(largeBorderlessButtonView, "<this>");
        if (largeBorderlessButton == null) {
            ViewExtKt.gone(largeBorderlessButtonView);
        } else {
            ViewExtKt.show(largeBorderlessButtonView);
            bind(largeBorderlessButtonView, largeBorderlessButton, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getStyleId(ButtonV3Atom.LargeBorderlessButton.LargeBorderLessButtonTheme largeBorderLessButtonTheme) {
        int i11 = largeBorderLessButtonTheme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[largeBorderLessButtonTheme.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return R$style.LargeBorderlessButtonBold;
        }
        return R$style.LargeBorderlessButton;
    }
}
