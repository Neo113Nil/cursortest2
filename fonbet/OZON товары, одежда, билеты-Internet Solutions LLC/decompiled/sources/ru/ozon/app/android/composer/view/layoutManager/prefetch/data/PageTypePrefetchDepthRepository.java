package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchCategory;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepository;", "", "", "init", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "pageType", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "prefetchCategory", "", "getBottomMultipler", "(Ljava/lang/String;Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;)Ljava/lang/Float;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PageTypePrefetchDepthRepository {
    Float getBottomMultipler(@NotNull String pageType, @NotNull PrefetchCategory prefetchCategory);

    Object init(@NotNull d<? super Unit> dVar) throws IOException;
}
