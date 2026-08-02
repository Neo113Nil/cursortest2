package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterItemTagBinding;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/viewholders/TagViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/viewholders/BaseTagViewHolder;", "binding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterItemTagBinding;", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterItemTagBinding;)V", "bind", "", "item", "Lru/ozon/uni/atoms/data/AtomDTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagViewHolder extends BaseTagViewHolder {

    @NotNull
    private final WidgetFiltersTagFilterItemTagBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TagViewHolder(@NotNull WidgetFiltersTagFilterItemTagBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        TagAtomView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.viewholders.BaseTagViewHolder
    public void bind(@NotNull AtomDTO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TagAtomView tag = this.binding.tag;
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        TagV3Atom.TagAtom tagAtom = item instanceof TagV3Atom.TagAtom ? (TagV3Atom.TagAtom) item : null;
        if (tagAtom == null) {
            return;
        }
        TagHolderKt.bind(tag, tagAtom, actionHandler);
    }
}
