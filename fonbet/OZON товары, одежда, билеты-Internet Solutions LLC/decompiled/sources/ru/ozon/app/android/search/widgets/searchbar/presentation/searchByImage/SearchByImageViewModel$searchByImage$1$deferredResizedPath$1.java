package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Sc.s;
import Wc.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.platform.image.ImageResizer;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel$searchByImage$1$deferredResizedPath$1", f = "SearchByImageViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchByImageViewModel$searchByImage$1$deferredResizedPath$1 extends j implements Function2<M, d<? super String>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ SearchByImageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageViewModel$searchByImage$1$deferredResizedPath$1(SearchByImageViewModel searchByImageViewModel, Uri uri, d<? super SearchByImageViewModel$searchByImage$1$deferredResizedPath$1> dVar) {
        super(2, dVar);
        this.this$0 = searchByImageViewModel;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchByImageViewModel$searchByImage$1$deferredResizedPath$1(this.this$0, this.$uri, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SearchImageResizer searchImageResizer;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        searchImageResizer = this.this$0.imageResizer;
        return ImageResizer.DefaultImpls.resize$default(searchImageResizer, this.$uri, 0.0f, 2, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((SearchByImageViewModel$searchByImage$1$deferredResizedPath$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
