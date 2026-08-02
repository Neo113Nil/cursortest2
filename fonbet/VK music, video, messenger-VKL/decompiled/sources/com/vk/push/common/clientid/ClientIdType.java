package com.vk.push.common.clientid;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientIdType.kt */
/* loaded from: classes5.dex */
public final class ClientIdType {
    private static final /* synthetic */ ClientIdType[] $VALUES;
    public static final ClientIdType GAID;
    public static final ClientIdType OAID;

    static {
        ClientIdType clientIdType = new ClientIdType(IronSourceConstants.TYPE_GAID, 0);
        GAID = clientIdType;
        ClientIdType clientIdType2 = new ClientIdType("OAID", 1);
        OAID = clientIdType2;
        $VALUES = new ClientIdType[]{clientIdType, clientIdType2};
    }

    public ClientIdType() {
        throw null;
    }

    public static ClientIdType valueOf(String str) {
        return (ClientIdType) Enum.valueOf(ClientIdType.class, str);
    }

    public static ClientIdType[] values() {
        return (ClientIdType[]) $VALUES.clone();
    }
}
