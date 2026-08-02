package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "tag", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentWidgetViewHolder$updateTagItem$1 extends AbstractC7737t implements Function1<TagV3Atom.TagAtom, TagV3Atom.TagAtom> {
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentWidgetViewHolder$updateTagItem$1(boolean z11) {
        super(1);
        this.$isSelected = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TagV3Atom.TagAtom invoke(TagV3Atom.TagAtom tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return TagV3Atom.TagAtom.copy$default(tag, null, null, null, null, this.$isSelected, null, null, null, null, null, 1007, null);
    }
}
