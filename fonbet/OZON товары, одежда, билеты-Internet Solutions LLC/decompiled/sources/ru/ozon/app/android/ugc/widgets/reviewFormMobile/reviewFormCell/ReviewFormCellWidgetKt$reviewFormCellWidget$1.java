package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormCell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormCellWidgetKt$reviewFormCellWidget$1 extends AbstractC7737t implements Function1<Object, Boolean> {
    public static final ReviewFormCellWidgetKt$reviewFormCellWidget$1 INSTANCE = new ReviewFormCellWidgetKt$reviewFormCellWidget$1();

    ReviewFormCellWidgetKt$reviewFormCellWidget$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof CellDTO);
    }
}
