package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "isAdultConfirmed", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$initAdultStateObserver$1", f = "FreshTileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshTileViewModel$initAdultStateObserver$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FreshTileViewModel this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "<destruct>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel$initAdultStateObserver$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Map.Entry<? extends Long, ? extends ProductActionBarVO>, Pair<? extends Long, ? extends ProductActionBarVO>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Long, ? extends ProductActionBarVO> invoke(Map.Entry<? extends Long, ? extends ProductActionBarVO> entry) {
            return invoke2((Map.Entry<Long, ProductActionBarVO>) entry);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Pair<Long, ProductActionBarVO> invoke2(Map.Entry<Long, ProductActionBarVO> entry) {
            Intrinsics.checkNotNullParameter(entry, "<destruct>");
            return new Pair<>(Long.valueOf(entry.getKey().longValue()), ProductActionBarVO.copy$default(entry.getValue(), 0L, 0, null, null, null, null, 47, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewModel$initAdultStateObserver$1(FreshTileViewModel freshTileViewModel, d<? super FreshTileViewModel$initAdultStateObserver$1> dVar) {
        super(2, dVar);
        this.this$0 = freshTileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshTileViewModel$initAdultStateObserver$1 freshTileViewModel$initAdultStateObserver$1 = new FreshTileViewModel$initAdultStateObserver$1(this.this$0, dVar);
        freshTileViewModel$initAdultStateObserver$1.L$0 = obj;
        return freshTileViewModel$initAdultStateObserver$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Unit> dVar) {
        return ((FreshTileViewModel$initAdultStateObserver$1) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((Boolean) this.L$0).booleanValue()) {
            FreshTileViewModel freshTileViewModel = this.this$0;
            x0Var = freshTileViewModel.actionBarStateListFlow;
            freshTileViewModel.updateEach(x0Var, AnonymousClass1.INSTANCE);
        }
        return Unit.f71690a;
    }
}
