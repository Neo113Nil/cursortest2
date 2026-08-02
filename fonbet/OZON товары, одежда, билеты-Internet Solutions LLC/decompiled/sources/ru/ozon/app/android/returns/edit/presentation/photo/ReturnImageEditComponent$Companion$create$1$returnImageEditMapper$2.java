package ru.ozon.app.android.returns.edit.presentation.photo;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.ui.molecules.reason.ReasonRowMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnImageEditComponent$Companion$create$1$returnImageEditMapper$2 extends AbstractC7737t implements Function0<ReturnImageEditMapper> {
    final /* synthetic */ ReturnImageEditComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnImageEditComponent$Companion$create$1$returnImageEditMapper$2(ReturnImageEditComponent$Companion$create$1 returnImageEditComponent$Companion$create$1) {
        super(0);
        this.this$0 = returnImageEditComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReturnImageEditMapper invoke() {
        ReasonRowMapper reasonRowMapper;
        reasonRowMapper = this.this$0.getReasonRowMapper();
        return new ReturnImageEditMapper(reasonRowMapper);
    }
}
