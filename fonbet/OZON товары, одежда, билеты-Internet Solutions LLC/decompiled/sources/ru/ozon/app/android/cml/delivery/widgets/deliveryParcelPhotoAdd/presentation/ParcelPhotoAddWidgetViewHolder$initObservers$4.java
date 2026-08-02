package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import Sc.o;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel$Companion$AnalyticsEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddWidgetViewHolder$initObservers$4", f = "ParcelPhotoAddWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParcelPhotoAddWidgetViewHolder$initObservers$4 extends j implements Function2<ParcelPhotoAddViewModel.Companion.AnalyticsEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ParcelPhotoAddWidgetViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParcelPhotoAddViewModel.Companion.AnalyticsEvent.values().length];
            try {
                iArr[ParcelPhotoAddViewModel.Companion.AnalyticsEvent.UPLOAD_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParcelPhotoAddViewModel.Companion.AnalyticsEvent.UPLOAD_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParcelPhotoAddViewModel.Companion.AnalyticsEvent.DELETE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ParcelPhotoAddViewModel.Companion.AnalyticsEvent.PICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddWidgetViewHolder$initObservers$4(ParcelPhotoAddWidgetViewHolder parcelPhotoAddWidgetViewHolder, d<? super ParcelPhotoAddWidgetViewHolder$initObservers$4> dVar) {
        super(2, dVar);
        this.this$0 = parcelPhotoAddWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ParcelPhotoAddWidgetViewHolder$initObservers$4 parcelPhotoAddWidgetViewHolder$initObservers$4 = new ParcelPhotoAddWidgetViewHolder$initObservers$4(this.this$0, dVar);
        parcelPhotoAddWidgetViewHolder$initObservers$4.L$0 = obj;
        return parcelPhotoAddWidgetViewHolder$initObservers$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ParcelPhotoAddVO parcelPhotoAddVO;
        t uploadEvent;
        l lVar;
        ParcelPhotoAddVO parcelPhotoAddVO2;
        ParcelPhotoAddVO parcelPhotoAddVO3;
        ParcelPhotoAddVO parcelPhotoAddVO4;
        ParcelPhotoAddVO.PickerVO pickerItem;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = WhenMappings.$EnumSwitchMapping$0[((ParcelPhotoAddViewModel.Companion.AnalyticsEvent) this.L$0).ordinal()];
        if (i11 == 1) {
            parcelPhotoAddVO = this.this$0.vo;
            if (parcelPhotoAddVO != null) {
                uploadEvent = parcelPhotoAddVO.getUploadEvent();
            }
            uploadEvent = null;
        } else if (i11 == 2) {
            parcelPhotoAddVO2 = this.this$0.vo;
            if (parcelPhotoAddVO2 != null) {
                uploadEvent = parcelPhotoAddVO2.getUploadErrorEvent();
            }
            uploadEvent = null;
        } else if (i11 == 3) {
            parcelPhotoAddVO3 = this.this$0.vo;
            if (parcelPhotoAddVO3 != null) {
                uploadEvent = parcelPhotoAddVO3.getDeleteEvent();
            }
            uploadEvent = null;
        } else {
            if (i11 != 4) {
                throw new o();
            }
            parcelPhotoAddVO4 = this.this$0.vo;
            if (parcelPhotoAddVO4 != null && (pickerItem = parcelPhotoAddVO4.getPickerItem()) != null) {
                uploadEvent = pickerItem.getTokenizedEvent();
            }
            uploadEvent = null;
        }
        if (uploadEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, uploadEvent, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ParcelPhotoAddViewModel.Companion.AnalyticsEvent analyticsEvent, d<? super Unit> dVar) {
        return ((ParcelPhotoAddWidgetViewHolder$initObservers$4) create(analyticsEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
