package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.SellerActionsPreviewDtoToDtoWrapperMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDTO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewModel$updateWidgetState$1", f = "SellerActionsPreviewAsyncViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerActionsPreviewAsyncViewModel$updateWidgetState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ long $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SellerActionsPreviewAsyncViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionsPreviewAsyncViewModel$updateWidgetState$1(SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel, String str, long j11, d<? super SellerActionsPreviewAsyncViewModel$updateWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = sellerActionsPreviewAsyncViewModel;
        this.$asyncData = str;
        this.$id = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SellerActionsPreviewAsyncViewModel$updateWidgetState$1 sellerActionsPreviewAsyncViewModel$updateWidgetState$1 = new SellerActionsPreviewAsyncViewModel$updateWidgetState$1(this.this$0, this.$asyncData, this.$id, dVar);
        sellerActionsPreviewAsyncViewModel$updateWidgetState$1.L$0 = obj;
        return sellerActionsPreviewAsyncViewModel$updateWidgetState$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SellerActionsPreviewAsyncViewModel$updateWidgetState$1 sellerActionsPreviewAsyncViewModel$updateWidgetState$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        SellerActionsPreviewDtoToDtoWrapperMapper sellerActionsPreviewDtoToDtoWrapperMapper;
        boolean z11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = sellerActionsPreviewAsyncViewModel.repository;
                this.label = 1;
                sellerActionsPreviewAsyncViewModel$updateWidgetState$1 = this;
            } catch (Throwable th3) {
                th = th3;
                sellerActionsPreviewAsyncViewModel$updateWidgetState$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel2 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.this$0;
                long j11 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$id;
                String str2 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, SellerActionsPreviewDTO.class, null, sellerActionsPreviewAsyncViewModel$updateWidgetState$1, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel22 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.this$0;
                long j112 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$id;
                String str22 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                sellerActionsPreviewAsyncViewModel$updateWidgetState$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                sellerActionsPreviewAsyncViewModel$updateWidgetState$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel222 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.this$0;
                long j1122 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$id;
                String str222 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel2222 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.this$0;
        long j11222 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$id;
        String str2222 = sellerActionsPreviewAsyncViewModel$updateWidgetState$1.$asyncData;
        if (!(a11 instanceof r.b)) {
            SingleLiveEvent<SellerActionsPreviewAsyncViewModel.NewState> widgetState = sellerActionsPreviewAsyncViewModel2222.getWidgetState();
            sellerActionsPreviewDtoToDtoWrapperMapper = sellerActionsPreviewAsyncViewModel2222.mapper;
            List<SellerActionsPreviewDtoWrapper<?>> map = sellerActionsPreviewDtoToDtoWrapperMapper.map((SellerActionsPreviewDTO) ((ComposerAsyncWidgetResponse) a11).getState(), true);
            ArrayList arrayList = new ArrayList(C7714v.z(map, 10));
            Iterator<T> it = map.iterator();
            while (it.hasNext()) {
                z11 = sellerActionsPreviewAsyncViewModel2222.isSelect;
                arrayList.add(((SellerActionsPreviewDtoWrapper) it.next()).mapToVo(r6.getId() + j11222, str2222, z11));
            }
            widgetState.postValue(new SellerActionsPreviewAsyncViewModel.NewState(arrayList));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SellerActionsPreviewAsyncViewModel$updateWidgetState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
