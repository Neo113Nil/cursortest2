package com.vk.api.sdk.utils.clientagent.model;

import com.ironsource.O6;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientAgentKey.kt */
/* loaded from: classes.dex */
public final class ClientAgentKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClientAgentKey[] $VALUES;
    public static final ClientAgentKey APP;
    public static final ClientAgentKey ARCH;
    public static final ClientAgentKey BUILD_ID;
    public static final ClientAgentKey CLIENT_AGENT_VERSION;
    public static final ClientAgentKey DISTRIBUTOR;
    public static final ClientAgentKey FROM;
    public static final ClientAgentKey MODEL;
    public static final ClientAgentKey NET;
    public static final ClientAgentKey OS;
    public static final ClientAgentKey OS_VERSION;
    public static final ClientAgentKey SDK;
    public static final ClientAgentKey SIGN;
    public static final ClientAgentKey VERSION;
    private final String serializedName;

    static {
        ClientAgentKey clientAgentKey = new ClientAgentKey("APP", 0, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        APP = clientAgentKey;
        ClientAgentKey clientAgentKey2 = new ClientAgentKey("ARCH", 1, "arch");
        ARCH = clientAgentKey2;
        ClientAgentKey clientAgentKey3 = new ClientAgentKey("BUILD_ID", 2, "b");
        BUILD_ID = clientAgentKey3;
        ClientAgentKey clientAgentKey4 = new ClientAgentKey("CLIENT_AGENT_VERSION", 3, "cv");
        CLIENT_AGENT_VERSION = clientAgentKey4;
        ClientAgentKey clientAgentKey5 = new ClientAgentKey("DISTRIBUTOR", 4, "distro");
        DISTRIBUTOR = clientAgentKey5;
        ClientAgentKey clientAgentKey6 = new ClientAgentKey("FROM", 5, "from");
        FROM = clientAgentKey6;
        ClientAgentKey clientAgentKey7 = new ClientAgentKey("MODEL", 6, "model");
        MODEL = clientAgentKey7;
        ClientAgentKey clientAgentKey8 = new ClientAgentKey("NET", 7, "net");
        NET = clientAgentKey8;
        ClientAgentKey clientAgentKey9 = new ClientAgentKey("OS", 8, O6.F);
        OS = clientAgentKey9;
        ClientAgentKey clientAgentKey10 = new ClientAgentKey("OS_VERSION", 9, "os-v");
        OS_VERSION = clientAgentKey10;
        ClientAgentKey clientAgentKey11 = new ClientAgentKey("SDK", 10, "sdk");
        SDK = clientAgentKey11;
        ClientAgentKey clientAgentKey12 = new ClientAgentKey("SIGN", 11, UcumUtils.UCUM_SECONDS);
        SIGN = clientAgentKey12;
        ClientAgentKey clientAgentKey13 = new ClientAgentKey("VERSION", 12, "v");
        VERSION = clientAgentKey13;
        ClientAgentKey[] clientAgentKeyArr = {clientAgentKey, clientAgentKey2, clientAgentKey3, clientAgentKey4, clientAgentKey5, clientAgentKey6, clientAgentKey7, clientAgentKey8, clientAgentKey9, clientAgentKey10, clientAgentKey11, clientAgentKey12, clientAgentKey13};
        $VALUES = clientAgentKeyArr;
        $ENTRIES = new asp(clientAgentKeyArr);
    }

    public ClientAgentKey(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static ClientAgentKey valueOf(String str) {
        return (ClientAgentKey) Enum.valueOf(ClientAgentKey.class, str);
    }

    public static ClientAgentKey[] values() {
        return (ClientAgentKey[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serializedName;
    }
}
