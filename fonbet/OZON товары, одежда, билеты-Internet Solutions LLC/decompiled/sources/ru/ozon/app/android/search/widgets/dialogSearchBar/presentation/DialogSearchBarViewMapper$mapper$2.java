package ru.ozon.app.android.search.widgets.dialogSearchBar.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DialogSearchBarViewMapper$mapper$2 extends AbstractC7737t implements Function0<DialogSearchBarMapper> {
    final /* synthetic */ DialogSearchBarViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchBarViewMapper$mapper$2(DialogSearchBarViewMapper dialogSearchBarViewMapper) {
        super(0);
        this.this$0 = dialogSearchBarViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DialogSearchBarMapper invoke() {
        return this.this$0.component().getMapper();
    }
}
