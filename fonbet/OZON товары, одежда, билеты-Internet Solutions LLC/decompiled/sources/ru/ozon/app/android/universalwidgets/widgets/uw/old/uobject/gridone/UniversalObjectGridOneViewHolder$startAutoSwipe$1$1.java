package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Long;)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UniversalObjectGridOneViewHolder$startAutoSwipe$1$1 extends AbstractC7737t implements Function1<Long, Integer> {
    final /* synthetic */ ObjectItemsVO $item;
    final /* synthetic */ UniversalObjectGridOneViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalObjectGridOneViewHolder$startAutoSwipe$1$1(UniversalObjectGridOneViewHolder universalObjectGridOneViewHolder, ObjectItemsVO objectItemsVO) {
        super(1);
        this.this$0 = universalObjectGridOneViewHolder;
        this.$item = objectItemsVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Long it) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(it, "it");
        i11 = this.this$0.currentItemPosition;
        this.this$0.currentItemPosition = i11 + 1;
        i12 = this.this$0.currentItemPosition;
        if (i12 >= this.$item.getItems().size()) {
            this.this$0.currentItemPosition = 0;
        }
        i13 = this.this$0.currentItemPosition;
        return Integer.valueOf(i13);
    }
}
