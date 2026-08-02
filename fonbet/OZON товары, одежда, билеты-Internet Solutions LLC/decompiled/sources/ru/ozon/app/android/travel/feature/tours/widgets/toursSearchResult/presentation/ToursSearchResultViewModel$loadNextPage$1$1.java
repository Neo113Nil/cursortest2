package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import Sc.r;
import Sc.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel$loadNextPage$1$1", f = "ToursSearchResultViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ToursSearchResultViewModel$loadNextPage$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ToursSearchResultVO $this_run;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ToursSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultViewModel$loadNextPage$1$1(ToursSearchResultVO toursSearchResultVO, ToursSearchResultViewModel toursSearchResultViewModel, d<? super ToursSearchResultViewModel$loadNextPage$1$1> dVar) {
        super(2, dVar);
        this.$this_run = toursSearchResultVO;
        this.this$0 = toursSearchResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursSearchResultViewModel$loadNextPage$1$1(this.$this_run, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Throwable b11;
        ToursSearchResultVO toursSearchResultVO;
        ToursSearchResultApi toursSearchResultApi;
        Object processHotelsRequest;
        ToursSearchResultViewModel toursSearchResultViewModel;
        ToursSearchResultMapper toursSearchResultMapper;
        ToursSearchResultVO copy;
        SingleLiveEvent singleLiveEvent;
        List prepareHotelsList;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        boolean z11 = true;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            toursSearchResultVO = this.$this_run;
            ToursSearchResultViewModel toursSearchResultViewModel2 = this.this$0;
            r.Companion companion2 = r.INSTANCE;
            AtomActionDTO lazyLoadAction = toursSearchResultVO.getLazyLoadAction();
            if (lazyLoadAction == null) {
                a11 = null;
                r.Companion companion3 = r.INSTANCE;
                ToursSearchResultViewModel toursSearchResultViewModel3 = this.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                    Lm0.a.f17149a.e(b11);
                    toursSearchResultViewModel3.onNextPageError();
                }
                return Unit.f71690a;
            }
            Map<String, String> params = toursSearchResultVO.getLazyLoadAction().getParams();
            if (params == null) {
                params = U.c();
            }
            LinkedHashMap m11 = U.m(params, U.l(new Pair("offset", new Integer(toursSearchResultVO.getHotels().size()))));
            toursSearchResultApi = toursSearchResultViewModel2.api;
            String link = lazyLoadAction.getLink();
            if (link == null) {
                link = "";
            }
            this.L$0 = toursSearchResultVO;
            this.L$1 = toursSearchResultViewModel2;
            this.label = 1;
            processHotelsRequest = toursSearchResultApi.processHotelsRequest(link, m11, this);
            if (processHotelsRequest == aVar) {
                return aVar;
            }
            toursSearchResultViewModel = toursSearchResultViewModel2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toursSearchResultViewModel = (ToursSearchResultViewModel) this.L$1;
            toursSearchResultVO = (ToursSearchResultVO) this.L$0;
            s.b(obj);
            processHotelsRequest = obj;
        }
        ToursSearchResultVO toursSearchResultVO2 = toursSearchResultVO;
        toursSearchResultMapper = toursSearchResultViewModel.mapper;
        ToursSearchResultVO mapToursSearchResultDTO = toursSearchResultMapper.mapToursSearchResultDTO((ToursSearchResultDTO) processHotelsRequest, toursSearchResultVO2.getId(), toursSearchResultVO2.getUrl());
        List<ToursSearchResultVO.SearchResultItem> hotels = toursSearchResultVO2.getHotels();
        List<ToursSearchResultVO.SearchResultItem> hotels2 = mapToursSearchResultDTO.getHotels();
        if (hotels2 == null) {
            hotels2 = K.f71697a;
        }
        copy = toursSearchResultVO2.copy((r27 & 1) != 0 ? toursSearchResultVO2.id : 0L, (r27 & 2) != 0 ? toursSearchResultVO2.url : null, (r27 & 4) != 0 ? toursSearchResultVO2.hotels : C7714v.p0(hotels2, hotels), (r27 & 8) != 0 ? toursSearchResultVO2.isAllDone : false, (r27 & 16) != 0 ? toursSearchResultVO2.timeout : null, (r27 & 32) != 0 ? toursSearchResultVO2.errorMessage : null, (r27 & 64) != 0 ? toursSearchResultVO2.errorNotification : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toursSearchResultVO2.timeoutAction : null, (r27 & 256) != 0 ? toursSearchResultVO2.lazyLoadAction : mapToursSearchResultDTO.getLazyLoadAction(), (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toursSearchResultVO2.pollingAction : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toursSearchResultVO2.loaderState : null, (r27 & 2048) != 0 ? toursSearchResultVO2.trackingInfo : null);
        toursSearchResultViewModel.lastVo = copy;
        if (copy.getLazyLoadAction() != null) {
            z11 = false;
        }
        toursSearchResultViewModel.isPaginationCompleted = z11;
        singleLiveEvent = toursSearchResultViewModel.resultLiveData;
        prepareHotelsList = toursSearchResultViewModel.prepareHotelsList(copy.getHotels());
        singleLiveEvent.setValue(new ToursSearchResultViewModel.ToursState(prepareHotelsList, null, false, 6, null));
        toursSearchResultViewModel.isLoadingNextPage = false;
        a11 = Unit.f71690a;
        r.Companion companion32 = r.INSTANCE;
        ToursSearchResultViewModel toursSearchResultViewModel32 = this.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursSearchResultViewModel$loadNextPage$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
