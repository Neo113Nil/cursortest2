package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Sc.s;
import Wc.a;
import android.content.ContentResolver;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SourceMetadata;
import ru.ozon.app.android.search.widgets.searchbar.utils.UriUtilsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/search/widgets/searchbar/core/repository/SourceMetadata;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel$searchByImage$1$deferredMetadata$1", f = "SearchByImageViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchByImageViewModel$searchByImage$1$deferredMetadata$1 extends j implements Function2<M, d<? super SourceMetadata>, Object> {
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageViewModel$searchByImage$1$deferredMetadata$1(Uri uri, ContentResolver contentResolver, d<? super SearchByImageViewModel$searchByImage$1$deferredMetadata$1> dVar) {
        super(2, dVar);
        this.$uri = uri;
        this.$contentResolver = contentResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchByImageViewModel$searchByImage$1$deferredMetadata$1(this.$uri, this.$contentResolver, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Pair<Integer, Integer> extractImageDimension = UriUtilsKt.extractImageDimension(this.$uri, this.$contentResolver);
        return new SourceMetadata(extractImageDimension.a().intValue(), extractImageDimension.b().intValue(), UriUtilsKt.extractMimeType(this.$uri, this.$contentResolver));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SourceMetadata> dVar) {
        return ((SearchByImageViewModel$searchByImage$1$deferredMetadata$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
