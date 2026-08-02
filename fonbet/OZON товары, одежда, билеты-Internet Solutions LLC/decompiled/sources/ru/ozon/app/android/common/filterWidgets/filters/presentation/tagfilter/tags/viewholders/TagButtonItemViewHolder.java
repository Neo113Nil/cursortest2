package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/viewholders/TagButtonItemViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/viewholders/BaseTagViewHolder;", "view", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "<init>", "(Lru/ozon/uni/android/controls/tag/TagButtonView;)V", "bind", "", "item", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagButtonItemViewHolder extends BaseTagViewHolder {

    @NotNull
    private final TagButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagButtonItemViewHolder(@NotNull TagButtonView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.BaseTagViewHolder
    public void bind(@NotNull AtomDTO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagButtonView tagButtonView = this.view;
        TagButtonDTO tagButtonDTO = item instanceof TagButtonDTO ? (TagButtonDTO) item : null;
        if (tagButtonDTO == null) {
            return;
        }
        TagButtonHolderKt.bindOrGone(tagButtonView, tagButtonDTO, actionHandler);
    }
}
