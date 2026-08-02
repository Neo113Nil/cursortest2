package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.InterfaceC3967k;
import Vg.e;
import a1.C4912a;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import v0.G;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CellListKt$CellList$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ e.a $actionHandler;
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;
    final /* synthetic */ Map<TitleCell, List<FavoriteCell>> $state;

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "Lkotlin/jvm/internal/EnhancedNullability;", "sections", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.brandList.presentation.list.CellListKt$CellList$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<TitleCell, List<? extends FavoriteCell>, Unit> {
        final /* synthetic */ e.a $actionHandler;
        final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;
        final /* synthetic */ G $this_LazyColumn;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.brandList.presentation.list.CellListKt$CellList$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18591 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ TitleCell $title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18591(TitleCell titleCell) {
                super(3);
                this.$title = titleCell;
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(interfaceC10165e, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                TitleCell titleCell = this.$title;
                Intrinsics.f(titleCell);
                TitleItemKt.TitleItem(titleCell, interfaceC3967k, 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "item", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.search.widgets.brandList.presentation.list.CellListKt$CellList$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<Integer, FavoriteCell, Object> {
            final /* synthetic */ TitleCell $title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TitleCell titleCell) {
                super(2);
                this.$title = titleCell;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, FavoriteCell favoriteCell) {
                return invoke(num.intValue(), favoriteCell);
            }

            public final Object invoke(int i11, FavoriteCell item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getId() + "-" + this.$title.getId() + "-" + i11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(G g10, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, e.a aVar) {
            super(2);
            this.$this_LazyColumn = g10;
            this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
            this.$actionHandler = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(TitleCell titleCell, List<? extends FavoriteCell> list) {
            invoke2(titleCell, (List<FavoriteCell>) list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TitleCell title, List<FavoriteCell> sections) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(sections, "sections");
            G.e(this.$this_LazyColumn, title.getId(), new C4912a(true, -191422981, new C18591(title)), 2);
            this.$this_LazyColumn.a(sections.size(), new CellListKt$CellList$1$1$1$invoke$$inlined$itemsIndexed$default$1(new AnonymousClass2(title), sections), new CellListKt$CellList$1$1$1$invoke$$inlined$itemsIndexed$default$2(sections), new C4912a(true, -1091073711, new CellListKt$CellList$1$1$1$invoke$$inlined$itemsIndexed$default$3(sections, this.$sisBrandFavoriteButtonDelegateFactory, this.$actionHandler)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CellListKt$CellList$1$1(Map<TitleCell, ? extends List<FavoriteCell>> map, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, e.a aVar) {
        super(1);
        this.$state = map;
        this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
        this.$actionHandler = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Map<TitleCell, List<FavoriteCell>> map = this.$state;
        if (map != null) {
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1(LazyColumn, this.$sisBrandFavoriteButtonDelegateFactory, this.$actionHandler);
            map.forEach(new BiConsumer() { // from class: ru.ozon.app.android.search.widgets.brandList.presentation.list.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Function2.this.invoke(obj, obj2);
                }
            });
        }
    }
}
