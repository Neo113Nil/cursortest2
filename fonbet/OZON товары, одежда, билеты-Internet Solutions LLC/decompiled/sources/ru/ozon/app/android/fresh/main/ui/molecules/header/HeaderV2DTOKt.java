package ru.ozon.app.android.fresh.main.ui.molecules.header;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderV2DTOKt {
    @NotNull
    public static final HeaderV2VO toVO(@NotNull HeaderV2DTO headerV2DTO) {
        Intrinsics.checkNotNullParameter(headerV2DTO, "<this>");
        TextAtom title = headerV2DTO.getTitle();
        AtomActionDTO action = headerV2DTO.getAction();
        return new HeaderV2VO(title, action != null ? AtomActionMapperKt.toAtomAction(action, headerV2DTO.getTrackingInfo()) : null, headerV2DTO.getDisclosure(), headerV2DTO.isTopCornersRounded(), headerV2DTO.getBackgroundColor(), headerV2DTO.getTrackingInfo());
    }
}
