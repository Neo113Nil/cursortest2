package com.vk.im.ui.views.online;

import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import xsna.asp;
import xsna.j5g;
import xsna.p3v0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnlineMode.kt */
/* loaded from: classes2.dex */
public final class OnlineMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnlineMode[] $VALUES;
    public static final a Companion;
    public static final OnlineMode OFFLINE;
    public static final OnlineMode ONLINE_VK_APP;
    public static final OnlineMode ONLINE_VK_ME;
    public static final OnlineMode ONLINE_WEB;

    /* compiled from: OnlineMode.kt */
    public static final class a {
        public static OnlineMode a(OnlineInfo onlineInfo) {
            if (!(onlineInfo instanceof VisibleStatus)) {
                return OnlineMode.OFFLINE;
            }
            VisibleStatus visibleStatus = (VisibleStatus) onlineInfo;
            if (visibleStatus.c && visibleStatus.Cb()) {
                return OnlineMode.ONLINE_VK_ME;
            }
            boolean z = visibleStatus.c;
            return (z && visibleStatus.e == Platform.MOBILE) ? OnlineMode.ONLINE_VK_APP : z ? OnlineMode.ONLINE_WEB : OnlineMode.OFFLINE;
        }

        public static OnlineMode b(UsersOnlineInfoDto usersOnlineInfoDto) {
            if (usersOnlineInfoDto == null || !usersOnlineInfoDto.g()) {
                return OnlineMode.OFFLINE;
            }
            Boolean j = usersOnlineInfoDto.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            boolean P = j5g.P(p3v0.a, usersOnlineInfoDto.d());
            Boolean i = usersOnlineInfoDto.i();
            return (booleanValue && P) ? OnlineMode.ONLINE_VK_ME : (booleanValue && (i != null ? i.booleanValue() : false)) ? OnlineMode.ONLINE_VK_APP : booleanValue ? OnlineMode.ONLINE_WEB : OnlineMode.OFFLINE;
        }
    }

    static {
        OnlineMode onlineMode = new OnlineMode("OFFLINE", 0);
        OFFLINE = onlineMode;
        OnlineMode onlineMode2 = new OnlineMode("ONLINE_VK_ME", 1);
        ONLINE_VK_ME = onlineMode2;
        OnlineMode onlineMode3 = new OnlineMode("ONLINE_VK_APP", 2);
        ONLINE_VK_APP = onlineMode3;
        OnlineMode onlineMode4 = new OnlineMode("ONLINE_WEB", 3);
        ONLINE_WEB = onlineMode4;
        OnlineMode[] onlineModeArr = {onlineMode, onlineMode2, onlineMode3, onlineMode4};
        $VALUES = onlineModeArr;
        $ENTRIES = new asp(onlineModeArr);
        Companion = new a();
    }

    public OnlineMode() {
        throw null;
    }

    public static OnlineMode valueOf(String str) {
        return (OnlineMode) Enum.valueOf(OnlineMode.class, str);
    }

    public static OnlineMode[] values() {
        return (OnlineMode[]) $VALUES.clone();
    }
}
