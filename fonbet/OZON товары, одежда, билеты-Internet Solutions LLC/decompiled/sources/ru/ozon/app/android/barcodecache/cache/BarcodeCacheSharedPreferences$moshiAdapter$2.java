package ru.ozon.app.android.barcodecache.cache;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.barcodecache.data.BarcodeCacheDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/barcodecache/data/BarcodeCacheDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BarcodeCacheSharedPreferences$moshiAdapter$2 extends AbstractC7737t implements Function0<JsonAdapter<BarcodeCacheDTO>> {
    final /* synthetic */ BarcodeCacheSharedPreferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeCacheSharedPreferences$moshiAdapter$2(BarcodeCacheSharedPreferences barcodeCacheSharedPreferences) {
        super(0);
        this.this$0 = barcodeCacheSharedPreferences;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final JsonAdapter<BarcodeCacheDTO> invoke() {
        Moshi moshi;
        moshi = this.this$0.moshi;
        return moshi.c(BarcodeCacheDTO.class);
    }
}
