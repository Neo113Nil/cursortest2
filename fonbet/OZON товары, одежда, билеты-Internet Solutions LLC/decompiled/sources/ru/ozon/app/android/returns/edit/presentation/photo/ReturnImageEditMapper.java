package ru.ozon.app.android.returns.edit.presentation.photo;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.edit.data.dto.ReturnImageEditBlockDto;
import ru.ozon.app.android.returns.edit.presentation.viewObject.ReturnImageEditBlockVO;
import ru.ozon.app.android.returns.ui.molecules.reason.ReasonRowMapper;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;", "Ll20/d;", "", "Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnImageEditBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "reasonRowMapper", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;)V", "", "photoState", "", "stateId", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "mapPhotoState", "(Ljava/lang/Object;Ljava/lang/String;)Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnImageEditMapper implements Function2<ReturnImageEditBlockDto, d, List<? extends ReturnImageEditBlockVO>> {

    @NotNull
    private final ReasonRowMapper reasonRowMapper;

    public ReturnImageEditMapper(@NotNull ReasonRowMapper reasonRowMapper) {
        Intrinsics.checkNotNullParameter(reasonRowMapper, "reasonRowMapper");
        this.reasonRowMapper = reasonRowMapper;
    }

    private final ReasonRow mapPhotoState(Object photoState, String stateId) {
        if (photoState instanceof CellDTO) {
            return this.reasonRowMapper.mapToReasonRow(photoState, stateId);
        }
        if (photoState instanceof ReturnImageEditBlockDto.PickedImagesWithText) {
            return this.reasonRowMapper.mapToReasonRow(((ReturnImageEditBlockDto.PickedImagesWithText) photoState).getPickedImages(), stateId);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnImageEditBlockVO> invoke(@NotNull ReturnImageEditBlockDto state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = a.a("returnImageEditBlock_", widgetInfo.d());
        TextDTO title = state.getTitle();
        TextDTO validationText = state.getPhotoState() instanceof ReturnImageEditBlockDto.PickedImagesWithText ? ((ReturnImageEditBlockDto.PickedImagesWithText) state.getPhotoState()).getValidationText() : null;
        ReasonRow mapPhotoState = mapPhotoState(state.getPhotoState(), widgetInfo.d());
        return mapPhotoState == null ? K.f71697a : C7714v.a0(new ReturnImageEditBlockVO(a11, title, validationText, mapPhotoState));
    }
}
