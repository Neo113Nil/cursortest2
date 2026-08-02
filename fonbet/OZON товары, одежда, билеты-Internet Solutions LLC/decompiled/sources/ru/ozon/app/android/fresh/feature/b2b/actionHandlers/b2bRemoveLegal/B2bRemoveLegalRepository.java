package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalRepository;", "", "", "actionName", "postData", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;", "removeLegal", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface B2bRemoveLegalRepository {
    Object removeLegal(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<B2bRemoveLegalResponse>> dVar);
}
