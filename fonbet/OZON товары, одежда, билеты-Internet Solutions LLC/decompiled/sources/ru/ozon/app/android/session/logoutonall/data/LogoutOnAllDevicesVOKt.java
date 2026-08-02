package ru.ozon.app.android.session.logoutonall.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"toVo", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesVO;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;", "stateId", "", "toGravity", "", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutOnAllDevicesVOKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoutOnAllDevicesDTO.Alignment.values().length];
            try {
                iArr[LogoutOnAllDevicesDTO.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoutOnAllDevicesDTO.Alignment.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int toGravity(LogoutOnAllDevicesDTO.Alignment alignment) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1) {
            return 17;
        }
        if (i11 == 2) {
            return 8388627;
        }
        throw new o();
    }

    @NotNull
    public static final LogoutOnAllDevicesVO toVo(@NotNull LogoutOnAllDevicesDTO logoutOnAllDevicesDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(logoutOnAllDevicesDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String title = logoutOnAllDevicesDTO.getTitle();
        String action = logoutOnAllDevicesDTO.getAction();
        int gravity = toGravity(logoutOnAllDevicesDTO.getAlignment());
        boolean showSeparator = logoutOnAllDevicesDTO.getShowSeparator();
        String textColor = logoutOnAllDevicesDTO.getTextColor();
        if (textColor == null) {
            textColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY.getValue();
        }
        return new LogoutOnAllDevicesVO(hashCode, title, action, textColor, gravity, showSeparator, logoutOnAllDevicesDTO.getConfirmation().getTitle(), logoutOnAllDevicesDTO.getConfirmation().getDescription());
    }
}
