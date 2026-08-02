package ru.ozon.app.android.search.widgets.searchbar.core.repository;

import Sc.s;
import Wc.a;
import We.C;
import We.D;
import We.H;
import We.K;
import android.webkit.MimeTypeMap;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/search/widgets/searchbar/core/repository/SearchByImageResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepositoryImpl$searchByImage$2", f = "SearchByImageRepository.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchByImageRepositoryImpl$searchByImage$2 extends j implements Function2<M, d<? super SearchByImageResponse>, Object> {
    final /* synthetic */ String $filePath;
    final /* synthetic */ SourceMetadata $sourceMetadata;
    int label;
    final /* synthetic */ SearchByImageRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageRepositoryImpl$searchByImage$2(String str, SourceMetadata sourceMetadata, SearchByImageRepositoryImpl searchByImageRepositoryImpl, d<? super SearchByImageRepositoryImpl$searchByImage$2> dVar) {
        super(2, dVar);
        this.$filePath = str;
        this.$sourceMetadata = sourceMetadata;
        this.this$0 = searchByImageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchByImageRepositoryImpl$searchByImage$2(this.$filePath, this.$sourceMetadata, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SearchByImageApi searchByImageApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        File file = new File(this.$filePath);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        C.f33536g.getClass();
        C b11 = C.a.b(mimeTypeFromExtension);
        D.c.a aVar2 = D.c.f33553c;
        String name = file.getName();
        K.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        H a11 = K.Companion.a(file, b11);
        aVar2.getClass();
        D.c b12 = D.c.a.b("file", name, a11);
        String jSONObject = this.$sourceMetadata.toJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        D.c b13 = D.c.a.b("sourceMetadata", null, K.Companion.b(jSONObject, C.a.b("application/json")));
        searchByImageApi = this.this$0.searchByImageApi;
        this.label = 1;
        Object searchByImage = searchByImageApi.searchByImage(b12, b13, this);
        return searchByImage == aVar ? aVar : searchByImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SearchByImageResponse> dVar) {
        return ((SearchByImageRepositoryImpl$searchByImage$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
