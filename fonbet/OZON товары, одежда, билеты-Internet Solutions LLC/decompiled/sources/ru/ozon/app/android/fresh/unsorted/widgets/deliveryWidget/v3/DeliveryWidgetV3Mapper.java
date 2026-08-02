package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.DeliveryWidgetV3DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3VO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/DeliveryWidgetV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "info", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/presentation/DeliveryWidgetV3VO;", "Lorg/joda/time/DateTime;", "", "deadlineTimeStamp", "(Lorg/joda/time/DateTime;)Ljava/lang/Long;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV3Mapper implements Function2<DeliveryWidgetV3DTO, d, List<? extends DeliveryWidgetV3VO>> {
    private final Long deadlineTimeStamp(DateTime dateTime) {
        if (dateTime.getMillis() > 0) {
            return Long.valueOf(dateTime.getMillis());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3VO toVO(ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.DeliveryWidgetV3DTO r30, l20.d r31) {
        /*
            r29 = this;
            long r1 = ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt.getId(r31)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3VO r0 = new ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3VO
            ru.ozon.uni.atoms.data.text.TextDTO r4 = r30.getPriceText()
            ru.ozon.uni.atoms.data.text.TextDTO r5 = r30.getDeliveryText()
            ru.ozon.uni.atoms.data.common.CommonAtomIconDTO r6 = r30.getDeliveryInfoIcon()
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.Spacers r3 = r30.getSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getTop()
            int r3 = r3.getPx()
            int r7 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.Spacers r3 = r30.getSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getBottom()
            int r3 = r3.getPx()
            int r8 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.Spacers r3 = r30.getSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getHorizontal()
            int r3 = r3.getPx()
            int r9 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.Spacers r3 = r30.getSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getBetween()
            int r3 = r3.getPx()
            int r10 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.ContentSpacers r3 = r30.getContentSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getEclipse()
            int r3 = r3.getPx()
            int r11 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.ContentSpacers r3 = r30.getContentSpacers()
            ru.ozon.uni.atoms.data.common.Paddings r3 = r3.getDeliveryInfo()
            int r3 = r3.getPx()
            int r12 = ru.ozon.uni.android.uikitsdk.ext.UiExtKt.toPx(r3)
            ru.ozon.uni.atoms.data.AtomActionDTO r3 = r30.getAction()
            r13 = 0
            ru.ozon.uni.atoms.af.AtomAction r3 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r3, r13)
            long r14 = r30.getWidgetUpdatePeriod()
            java.lang.Integer r16 = r30.getProgress()
            if (r16 == 0) goto L8a
            int r16 = r16.intValue()
            goto L8c
        L8a:
            r16 = 0
        L8c:
            java.lang.String r17 = r30.getProgressGradient()
            java.lang.String r18 = r30.getBorderColor()
            java.lang.String r19 = r30.getEclipseColor()
            java.lang.String r20 = r30.getBackgroundColor()
            java.util.Map r13 = r30.getTrackingInfo()
            if (r13 == 0) goto Lb5
            r22 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r23 = r1
            r1 = 2
            r2 = 0
            WZ.t r0 = ru.ozon.app.android.composer.TrackingInfoMapperKt.mapToTokenizedEvent$default(r13, r0, r2, r1, r2)
            r21 = r0
            r0 = r22
            goto Lba
        Lb5:
            r23 = r1
            r2 = 0
            r21 = r2
        Lba:
            boolean r22 = r30.getShouldHideProgressBar()
            org.joda.time.DateTime r1 = r30.getTimerDeadline()
            r13 = r29
            if (r1 == 0) goto Lcb
            java.lang.Long r1 = r13.deadlineTimeStamp(r1)
            goto Lcc
        Lcb:
            r1 = r2
        Lcc:
            r26 = 0
            r27 = r23
            r23 = r1
            r1 = r27
            r24 = 0
            r25 = 2097152(0x200000, float:2.938736E-39)
            r13 = r3
            r3 = r31
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.DeliveryWidgetV3Mapper.toVO(ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.DeliveryWidgetV3DTO, l20.d):ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3VO");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryWidgetV3VO> invoke(@NotNull DeliveryWidgetV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
