package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Ae.w0;
import He.b;
import Sc.s;
import Wc.a;
import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageRepository;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SearchByImageResponse;
import ru.ozon.app.android.search.widgets.searchbar.core.repository.SourceMetadata;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel$searchByImage$1", f = "SearchByImageViewModel.kt", l = {74, 75, ModuleDescriptor.MODULE_VERSION, 77}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchByImageViewModel$searchByImage$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SearchByImageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageViewModel$searchByImage$1(SearchByImageViewModel searchByImageViewModel, Uri uri, ContentResolver contentResolver, d<? super SearchByImageViewModel$searchByImage$1> dVar) {
        super(2, dVar);
        this.this$0 = searchByImageViewModel;
        this.$uri = uri;
        this.$contentResolver = contentResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchByImageViewModel$searchByImage$1 searchByImageViewModel$searchByImage$1 = new SearchByImageViewModel$searchByImage$1(this.this$0, this.$uri, this.$contentResolver, dVar);
        searchByImageViewModel$searchByImage$1.L$0 = obj;
        return searchByImageViewModel$searchByImage$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r13 != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchByImageRepository searchByImageRepository;
        U u11;
        SourceMetadata sourceMetadata;
        SearchByImageRepository searchByImageRepository2;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            U a11 = C10727i.a(m11, bVar, null, new SearchByImageViewModel$searchByImage$1$deferredMetadata$1(this.$uri, this.$contentResolver, null), 2);
            U a12 = C10727i.a(m11, bVar, null, new SearchByImageViewModel$searchByImage$1$deferredResizedPath$1(this.this$0, this.$uri, null), 2);
            searchByImageRepository = this.this$0.searchByImageRepository;
            this.L$0 = a12;
            this.L$1 = searchByImageRepository;
            this.label = 1;
            Object s11 = a11.s(this);
            if (s11 != aVar) {
                u11 = a12;
                obj = s11;
            }
            return aVar;
        }
        if (i11 == 1) {
            searchByImageRepository = (SearchByImageRepository) this.L$1;
            u11 = (U) this.L$0;
            s.b(obj);
        } else if (i11 == 2) {
            sourceMetadata = (SourceMetadata) this.L$1;
            searchByImageRepository2 = (SearchByImageRepository) this.L$0;
            s.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = searchByImageRepository2.searchByImage(sourceMetadata, (String) obj, this);
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            String redirectUri = ((SearchByImageResponse) obj).getRedirectUri();
            if (redirectUri == null) {
                return Unit.f71690a;
            }
            w0Var = this.this$0._openSearchResultFlow;
            this.label = 4;
        }
        SourceMetadata sourceMetadata2 = (SourceMetadata) obj;
        this.L$0 = searchByImageRepository;
        this.L$1 = sourceMetadata2;
        this.label = 2;
        Object s12 = u11.s(this);
        if (s12 != aVar) {
            SearchByImageRepository searchByImageRepository3 = searchByImageRepository;
            sourceMetadata = sourceMetadata2;
            obj = s12;
            searchByImageRepository2 = searchByImageRepository3;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = searchByImageRepository2.searchByImage(sourceMetadata, (String) obj, this);
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SearchByImageViewModel$searchByImage$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
