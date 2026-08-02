package ru.ozon.app.android.favorites.data.favoriteslist;

import io.reactivex.AbstractC7094b;
import io.reactivex.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.utils.HttpExceptionUtilsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/f;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/f;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FavoritesListsRepositoryImpl$removeFavoritesList$1 extends AbstractC7737t implements Function1<Throwable, f> {
    final /* synthetic */ FavoritesListsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesListsRepositoryImpl$removeFavoritesList$1(FavoritesListsRepositoryImpl favoritesListsRepositoryImpl) {
        super(1);
        this.this$0 = favoritesListsRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final f invoke(Throwable it) {
        JsonParser jsonParser;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof HttpException)) {
            return AbstractC7094b.h(it);
        }
        jsonParser = this.this$0.jsonDeserializer;
        return AbstractC7094b.h(HttpExceptionUtilsKt.parseHttpException(jsonParser, (HttpException) it));
    }
}
