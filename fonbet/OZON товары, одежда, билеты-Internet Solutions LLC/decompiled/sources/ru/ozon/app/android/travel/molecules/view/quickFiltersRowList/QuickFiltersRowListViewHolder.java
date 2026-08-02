package ru.ozon.app.android.travel.molecules.view.quickFiltersRowList;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "view", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;)V", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuickFiltersRowListViewHolder extends j {
    public static final int $stable = TagButtonView.$stable;

    @NotNull
    private final TagButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickFiltersRowListViewHolder(@NotNull TagButtonView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull TagButtonDTO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonHolderKt.bind(this.view, item, onAction);
    }
}
