package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RecShelfViewMapper$mapper$2 extends AbstractC7737t implements Function0<RecShelfMapper> {
    final /* synthetic */ RecShelfViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecShelfViewMapper$mapper$2(RecShelfViewMapper recShelfViewMapper) {
        super(0);
        this.this$0 = recShelfViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RecShelfMapper invoke() {
        return this.this$0.component().getMapper();
    }
}
