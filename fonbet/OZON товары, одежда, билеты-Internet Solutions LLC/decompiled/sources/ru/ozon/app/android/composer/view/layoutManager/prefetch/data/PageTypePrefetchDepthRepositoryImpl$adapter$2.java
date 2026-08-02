package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import Y9.b;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageDepthInfoDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PageTypePrefetchDepthRepositoryImpl$adapter$2 extends AbstractC7737t implements Function0<JsonAdapter<List<? extends PageDepthInfoDTO>>> {
    final /* synthetic */ PageTypePrefetchDepthRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageTypePrefetchDepthRepositoryImpl$adapter$2(PageTypePrefetchDepthRepositoryImpl pageTypePrefetchDepthRepositoryImpl) {
        super(0);
        this.this$0 = pageTypePrefetchDepthRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JsonAdapter<List<? extends PageDepthInfoDTO>> invoke() {
        Moshi moshi;
        b e11 = D.e(List.class, PageDepthInfoDTO.class);
        moshi = this.this$0.moshi;
        return moshi.d(e11);
    }
}
