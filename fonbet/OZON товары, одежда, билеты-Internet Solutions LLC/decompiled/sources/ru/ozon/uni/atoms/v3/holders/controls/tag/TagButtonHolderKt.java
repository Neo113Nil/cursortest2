package ru.ozon.uni.atoms.v3.holders.controls.tag;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/controls/tag/TagButtonView;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/controls/tag/TagButtonView;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagButtonHolderKt {
    public static final void bind(@NotNull TagButtonView tagButtonView, @NotNull TagButtonDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(tagButtonView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(tagButtonView, dto, new TagButtonHolderKt$bind$provider$1(tagButtonView), function1);
    }

    public static /* synthetic */ void bind$default(TagButtonView tagButtonView, TagButtonDTO tagButtonDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(tagButtonView, tagButtonDTO, function1);
    }

    public static final void bindOrGone(@NotNull TagButtonView tagButtonView, TagButtonDTO tagButtonDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(tagButtonView, "<this>");
        if (tagButtonDTO == null) {
            tagButtonView.setVisibility(8);
        } else {
            tagButtonView.setVisibility(0);
            bind(tagButtonView, tagButtonDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(TagButtonView tagButtonView, TagButtonDTO tagButtonDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(tagButtonView, tagButtonDTO, function1);
    }
}
