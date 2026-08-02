package ru.ozon.app.android.yandexsearchsheet;

import com.google.android.gms.actions.SearchIntents;
import io.reactivex.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import vc.C10300e;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", SearchIntents.EXTRA_QUERY, "Lio/reactivex/f;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/f;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class YandexSearchSheetViewModelImpl$bindInitial$1$2 extends AbstractC7737t implements Function1<String, f> {
    final /* synthetic */ YandexSearchSheetViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetViewModelImpl$bindInitial$1$2(YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl) {
        super(1);
        this.this$0 = yandexSearchSheetViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final f invoke(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.this$0.formSuggestsWithCommunication(query);
        return C10300e.f102773a;
    }
}
