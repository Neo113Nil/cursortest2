package ru.ozon.uni.atoms.v3.holders.texts;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\b\u001a5\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "bindOrInvisible", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextAtomHolderKt {
    @InterfaceC3999a
    public static final void bind(@NotNull TextAtomView textAtomView, @NotNull TextAtom dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textAtomView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(textAtomView, dto, new TextAtomHolderKt$bind$provider$1(textAtomView), function1);
    }

    public static /* synthetic */ void bind$default(TextAtomView textAtomView, TextAtom textAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(textAtomView, textAtom, function1);
    }

    @InterfaceC3999a
    public static final void bindOrGone(@NotNull TextAtomView textAtomView, TextAtom textAtom, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textAtomView, "<this>");
        if (textAtom == null) {
            ViewExtKt.gone(textAtomView);
        } else {
            ViewExtKt.show(textAtomView);
            bind(textAtomView, textAtom, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(TextAtomView textAtomView, TextAtom textAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(textAtomView, textAtom, function1);
    }

    @InterfaceC3999a
    public static final void bindOrInvisible(@NotNull TextAtomView textAtomView, TextAtom textAtom, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(textAtomView, "<this>");
        if (textAtom == null) {
            ViewExtKt.invisible(textAtomView);
        } else {
            ViewExtKt.show(textAtomView);
            bind(textAtomView, textAtom, function1);
        }
    }

    public static /* synthetic */ void bindOrInvisible$default(TextAtomView textAtomView, TextAtom textAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrInvisible(textAtomView, textAtom, function1);
    }
}
