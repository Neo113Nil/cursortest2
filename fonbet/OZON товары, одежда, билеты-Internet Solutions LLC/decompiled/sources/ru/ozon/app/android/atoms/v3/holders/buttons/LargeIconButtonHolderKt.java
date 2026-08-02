package ru.ozon.app.android.atoms.v3.holders.buttons;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a=\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "isSemanticBackground", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lkotlin/jvm/functions/Function1;Z)V", "bindOrGone", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lkotlin/jvm/functions/Function1;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeIconButtonHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull LargeIconButtonView largeIconButtonView, @NotNull ButtonV3Atom.LargeIconButton dto, Function1<? super AtomAction, Unit> function1, boolean z11) {
        Intrinsics.checkNotNullParameter(largeIconButtonView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(largeIconButtonView, dto, new LargeIconButtonHolderKt$bind$provider$1(largeIconButtonView, z11), function1);
    }

    public static /* synthetic */ void bind$default(LargeIconButtonView largeIconButtonView, ButtonV3Atom.LargeIconButton largeIconButton, Function1 function1, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        bind(largeIconButtonView, largeIconButton, function1, z11);
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull LargeIconButtonView largeIconButtonView, ButtonV3Atom.LargeIconButton largeIconButton, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(largeIconButtonView, "<this>");
        if (largeIconButton == null) {
            ViewExtKt.gone(largeIconButtonView);
        } else {
            ViewExtKt.show(largeIconButtonView);
            BindExtKt.bindHolder(largeIconButtonView, largeIconButton, new LargeIconButtonHolderKt$bindOrGone$1$provider$1(largeIconButtonView), function1);
        }
    }
}
