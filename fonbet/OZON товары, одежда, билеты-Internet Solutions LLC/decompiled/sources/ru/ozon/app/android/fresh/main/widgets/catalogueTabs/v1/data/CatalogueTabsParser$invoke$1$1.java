package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data;

import Sc.s;
import Wc.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.app.android.utils.JsonAsyncParseHelper;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO$CatalogueTabsSingleTab;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsParser$invoke$1$1", f = "CatalogueTabsParser.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogueTabsParser$invoke$1$1 extends j implements Function2<M, d<? super List<? extends CatalogueTabsDTO.CatalogueTabsSingleTab>>, Object> {
    final /* synthetic */ n $this_readObject;
    int label;
    final /* synthetic */ CatalogueTabsParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsParser$invoke$1$1(n nVar, CatalogueTabsParser catalogueTabsParser, d<? super CatalogueTabsParser$invoke$1$1> dVar) {
        super(2, dVar);
        this.$this_readObject = nVar;
        this.this$0 = catalogueTabsParser;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogueTabsParser$invoke$1$1(this.$this_readObject, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends CatalogueTabsDTO.CatalogueTabsSingleTab>> dVar) {
        return invoke2(m11, (d<? super List<CatalogueTabsDTO.CatalogueTabsSingleTab>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonAdapter jsonAdapter;
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
        JsonAsyncParseHelper jsonAsyncParseHelper = JsonAsyncParseHelper.INSTANCE;
        n nVar = this.$this_readObject;
        jsonAdapter = this.this$0.tabAdapter;
        this.label = 1;
        Object asyncReadJsonArray = jsonAsyncParseHelper.asyncReadJsonArray(nVar, jsonAdapter, this);
        return asyncReadJsonArray == aVar ? aVar : asyncReadJsonArray;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<CatalogueTabsDTO.CatalogueTabsSingleTab>> dVar) {
        return ((CatalogueTabsParser$invoke$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
