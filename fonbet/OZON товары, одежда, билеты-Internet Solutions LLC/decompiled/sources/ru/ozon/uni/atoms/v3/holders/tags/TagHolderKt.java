package ru.ozon.uni.atoms.v3.holders.tags;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/uikit/view/atoms/tags/TagAtomView;Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagHolderKt {
    public static final void bind(@NotNull TagAtomView tagAtomView, @NotNull TagV3Atom.TagAtom dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(tagAtomView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(tagAtomView, dto, new TagHolderKt$bind$provider$1(tagAtomView), function1);
    }

    public static /* synthetic */ void bind$default(TagAtomView tagAtomView, TagV3Atom.TagAtom tagAtom, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(tagAtomView, tagAtom, function1);
    }
}
