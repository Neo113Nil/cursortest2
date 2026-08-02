package ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input;

import A00.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.ComplaintInfo;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputVO;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0007\u0010\u0013J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ComplaintInfoUpdater;", "", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "<init>", "(Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ReasonSelected;", "update", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "oldItem", "reasonSelected", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ReasonSelected;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/CommentUpdated;", "updateComment", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/CommentUpdated;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;", "complaintInfo", "", "isDisabled", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;Ljava/lang/Boolean;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComplaintInfoUpdater {

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/ComplaintInfoUpdater$Companion;", "", "<init>", "()V", "PARAM_COMPLAINT_INFO", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ComplaintInfoUpdater(@NotNull JsonSerializer jsonSerializer) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.jsonSerializer = jsonSerializer;
    }

    private final DeliveryDateChangedComplaintFormInputVO reasonSelected(ReasonSelected update, DeliveryDateChangedComplaintFormInputVO oldItem) {
        ArrayList W02 = C7714v.W0(oldItem.getComplaintInfo().getReasonIds());
        if (W02.contains(update.getReasonId())) {
            W02.remove(update.getReasonId());
        } else {
            W02.add(update.getReasonId());
        }
        return update(oldItem, ComplaintInfo.copy$default(oldItem.getComplaintInfo(), W02, null, 2, null), Boolean.valueOf(W02.isEmpty()));
    }

    private final DeliveryDateChangedComplaintFormInputVO update(DeliveryDateChangedComplaintFormInputVO deliveryDateChangedComplaintFormInputVO, ComplaintInfo complaintInfo, Boolean bool) {
        AtomActionDTO action;
        AtomActionDTO action2;
        Map<String, String> params;
        ButtonV3DTO submitButton = deliveryDateChangedComplaintFormInputVO.getSubmitButton();
        CommonControlSettings common = deliveryDateChangedComplaintFormInputVO.getSubmitButton().getCommon();
        CommonControlSettings commonControlSettings = null;
        LinkedHashMap linkedHashMap = null;
        AtomActionDTO atomActionDTO = null;
        if (common != null) {
            CommonControlSettings common2 = deliveryDateChangedComplaintFormInputVO.getSubmitButton().getCommon();
            if (common2 != null && (action = common2.getAction()) != null) {
                CommonControlSettings common3 = deliveryDateChangedComplaintFormInputVO.getSubmitButton().getCommon();
                if (common3 != null && (action2 = common3.getAction()) != null && (params = action2.getParams()) != null) {
                    linkedHashMap = U.u(params);
                    linkedHashMap.put("complaintInfo", this.jsonSerializer.toJson((JsonSerializer) complaintInfo, (Class<JsonSerializer>) ComplaintInfo.class));
                    Unit unit = Unit.f71690a;
                }
                atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, linkedHashMap, null, 23, null);
            }
            commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
        }
        return DeliveryDateChangedComplaintFormInputVO.copy$default(deliveryDateChangedComplaintFormInputVO, 0L, null, ButtonV3DTO.copy$default(submitButton, null, null, null, null, null, null, bool == null ? deliveryDateChangedComplaintFormInputVO.getSubmitButton().isDisabled() : bool, null, null, null, null, null, null, commonControlSettings, null, null, null, 122815, null), complaintInfo, 3, null);
    }

    static /* synthetic */ DeliveryDateChangedComplaintFormInputVO update$default(ComplaintInfoUpdater complaintInfoUpdater, DeliveryDateChangedComplaintFormInputVO deliveryDateChangedComplaintFormInputVO, ComplaintInfo complaintInfo, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = null;
        }
        return complaintInfoUpdater.update(deliveryDateChangedComplaintFormInputVO, complaintInfo, bool);
    }

    private final DeliveryDateChangedComplaintFormInputVO updateComment(CommentUpdated update, DeliveryDateChangedComplaintFormInputVO oldItem) {
        return update$default(this, oldItem, ComplaintInfo.copy$default(oldItem.getComplaintInfo(), null, update.getText(), 1, null), null, 2, null);
    }

    public final DeliveryDateChangedComplaintFormInputVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DeliveryDateChangedComplaintFormInputVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ReasonSelected) {
            return reasonSelected((ReasonSelected) update, oldItem);
        }
        if (update instanceof CommentUpdated) {
            return updateComment((CommentUpdated) update, oldItem);
        }
        return null;
    }
}
