package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.data.NavBarIconButtonDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/data/NavBarIconButtonDTO;", "stateId", "", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavBarIconButtonViewMapperKt {
    @NotNull
    public static final NavBarIconButtonVO toVO(@NotNull NavBarIconButtonDTO navBarIconButtonDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(navBarIconButtonDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new NavBarIconButtonVO(stateId.hashCode(), navBarIconButtonDTO.getIcon(), navBarIconButtonDTO.getAction(), navBarIconButtonDTO.getTrackingInfo());
    }
}
