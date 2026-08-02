package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation;

import Pc.a;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.C7740w;
import kotlin.reflect.j;
import l20.d;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapter;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapterFactory;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RichPromoScrollViewHolder$adapter$2 extends AbstractC7737t implements Function0<CatalogTileScrollItemsAdapter> {
    final /* synthetic */ a<CatalogTileScrollItemsAdapterFactory> $catalogTileFactoryProvider;
    final /* synthetic */ RichPromoScrollViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoScrollViewHolder$adapter$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<d> {
        AnonymousClass1(Object obj) {
            super(0, obj, j.class, "get", "get()Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return (d) ((j) this.receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RichPromoScrollViewHolder$adapter$2(a<CatalogTileScrollItemsAdapterFactory> aVar, RichPromoScrollViewHolder richPromoScrollViewHolder) {
        super(0);
        this.$catalogTileFactoryProvider = aVar;
        this.this$0 = richPromoScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CatalogTileScrollItemsAdapter invoke() {
        l lVar;
        Function1<? super AtomAction, Unit> function1;
        CatalogTileScrollItemsAdapterFactory catalogTileScrollItemsAdapterFactory = this.$catalogTileFactoryProvider.get();
        RichPromoScrollViewHolder richPromoScrollViewHolder = this.this$0;
        lVar = richPromoScrollViewHolder.tokenizedAnalytics;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(new C7740w(this.this$0) { // from class: ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoScrollViewHolder$adapter$2.2
            @Override // kotlin.reflect.n
            public Object get() {
                d dVar;
                dVar = ((RichPromoScrollViewHolder) this.receiver).widgetInfo;
                return dVar;
            }

            @Override // kotlin.reflect.j
            public void set(Object obj) {
                ((RichPromoScrollViewHolder) this.receiver).widgetInfo = (d) obj;
            }
        });
        function1 = this.this$0.actionHandler;
        return catalogTileScrollItemsAdapterFactory.create(richPromoScrollViewHolder, lVar, anonymousClass1, function1);
    }
}
