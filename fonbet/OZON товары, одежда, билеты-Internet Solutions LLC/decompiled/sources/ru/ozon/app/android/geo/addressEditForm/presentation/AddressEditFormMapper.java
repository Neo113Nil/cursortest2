package ru.ozon.app.android.geo.addressEditForm.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTOKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;Ll20/d;)Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormMapper implements Function2<FormBuilderDTO, d, List<? extends AddressEditFormVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressEditFormVO> invoke(@NotNull FormBuilderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new AddressEditFormVO(hashCode, FormBuilderDTOKt.toVO$default(state, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, false, 2, null), FormBuilderHelper.Transform.INSTANCE.makeDataForSend(state.getRows()), 0L, false, 24, null));
    }
}
