package ru.ozon.app.android.courieronmap.presentation.helper;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.courieronmap.data.CourierOnMapDTO;
import ru.ozon.app.android.courieronmap.presentation.decoration.CourierInfoIOffsetsItemDecoration;
import ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewListener;
import ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewV1;
import ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewV2;
import ru.ozon.app.android.courieronmap.presentation.vo.CourierOnMapVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u001f\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/helper/CourierBottomSheetConfigurator;", "", "bottomSheetContainer", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "courierInfoViewListener", "Lru/ozon/app/android/courieronmap/presentation/view/CourierInfoViewListener;", "configureBottomSheet", "", "vo", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "courierInfoItemDecoration", "Lru/ozon/app/android/courieronmap/presentation/decoration/CourierInfoIOffsetsItemDecoration;", "getHeaderHeight", "", "getCallCourierContainerHeightParams", "setPositionToCourierContainer", "x", "", "y", "(Ljava/lang/Float;Ljava/lang/Float;)V", "onDestroy", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierBottomSheetConfigurator {

    @NotNull
    private final ViewGroup bottomSheetContainer;
    private CourierInfoViewListener courierInfoViewListener;

    public CourierBottomSheetConfigurator(@NotNull ViewGroup bottomSheetContainer) {
        Intrinsics.checkNotNullParameter(bottomSheetContainer, "bottomSheetContainer");
        this.bottomSheetContainer = bottomSheetContainer;
    }

    public final void configureBottomSheet(@NotNull CourierOnMapVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull CourierInfoIOffsetsItemDecoration courierInfoItemDecoration) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(courierInfoItemDecoration, "courierInfoItemDecoration");
        this.bottomSheetContainer.removeAllViews();
        if (vo.getCourierDetails() != null) {
            Context context = this.bottomSheetContainer.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CourierInfoViewV2 courierInfoViewV2 = new CourierInfoViewV2(context, null, 0, 6, null);
            CourierOnMapDTO.CourierDetails courierDetails = vo.getCourierDetails();
            courierInfoViewV2.bindCourierTitle(courierDetails.getTitle());
            courierInfoViewV2.bindCourierSubtitle(courierDetails.getSubtitle());
            courierInfoViewV2.bindCourierCourierCallButton(courierDetails.getButton(), actionHandler);
            courierInfoViewV2.addActionHandlerToCourierInfoScrollVRC(actionHandler);
            List<CellDTO> info = courierDetails.getInfo();
            if (info == null) {
                info = K.f71697a;
            }
            courierInfoViewV2.bindCourierInfoVAL(info);
            this.courierInfoViewListener = courierInfoViewV2;
            this.bottomSheetContainer.addView(courierInfoViewV2);
            return;
        }
        Context context2 = this.bottomSheetContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CourierInfoViewV1 courierInfoViewV1 = new CourierInfoViewV1(context2, null, 0, 6, null);
        AtomDTO[] elements = {vo.getDeliveryTime(), vo.getAnnotation()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList B11 = C7705l.B(elements);
        List<CellAtom> orderInfo = vo.getOrderInfo();
        if (orderInfo == null) {
            orderInfo = K.f71697a;
        }
        ArrayList p02 = C7714v.p0(orderInfo, B11);
        courierInfoViewV1.bindCourierTitle(vo.getTitle());
        courierInfoViewV1.bindCourierSubtitle(vo.getSubtitle());
        courierInfoViewV1.bindCourierCourierCallButton(vo.getButton(), actionHandler);
        courierInfoViewV1.addItemDecorationToCourierInfoScrollVRC(courierInfoItemDecoration);
        courierInfoViewV1.addActionHandlerToCourierInfoScrollVRC(actionHandler);
        courierInfoViewV1.bindCourierInfoScrollVRC(p02);
        this.courierInfoViewListener = courierInfoViewV1;
        this.bottomSheetContainer.addView(courierInfoViewV1);
    }

    public final int getCallCourierContainerHeightParams() {
        Pair<Integer, Integer> callCourierContainerParams;
        CourierInfoViewListener courierInfoViewListener = this.courierInfoViewListener;
        if (courierInfoViewListener == null || (callCourierContainerParams = courierInfoViewListener.getCallCourierContainerParams()) == null) {
            return 0;
        }
        return callCourierContainerParams.f().intValue();
    }

    public final int getHeaderHeight() {
        CourierInfoViewListener courierInfoViewListener = this.courierInfoViewListener;
        if (courierInfoViewListener != null) {
            return courierInfoViewListener.getHeaderHeight();
        }
        return 0;
    }

    public final void onDestroy() {
        this.bottomSheetContainer.removeAllViews();
        this.courierInfoViewListener = null;
    }

    public final void setPositionToCourierContainer(Float x11, Float y11) {
        CourierInfoViewListener courierInfoViewListener = this.courierInfoViewListener;
        if (courierInfoViewListener != null) {
            courierInfoViewListener.setPositionToCourierContainer(x11, y11);
        }
    }
}
