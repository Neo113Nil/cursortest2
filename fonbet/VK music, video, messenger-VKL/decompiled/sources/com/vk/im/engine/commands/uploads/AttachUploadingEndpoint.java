package com.vk.im.engine.commands.uploads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachUploadingEndpoint.kt */
/* loaded from: classes2.dex */
public final class AttachUploadingEndpoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AttachUploadingEndpoint[] $VALUES;
    public static final AttachUploadingEndpoint CHANNEL;
    public static final AttachUploadingEndpoint CHAT;

    static {
        AttachUploadingEndpoint attachUploadingEndpoint = new AttachUploadingEndpoint("CHAT", 0);
        CHAT = attachUploadingEndpoint;
        AttachUploadingEndpoint attachUploadingEndpoint2 = new AttachUploadingEndpoint("CHANNEL", 1);
        CHANNEL = attachUploadingEndpoint2;
        AttachUploadingEndpoint[] attachUploadingEndpointArr = {attachUploadingEndpoint, attachUploadingEndpoint2};
        $VALUES = attachUploadingEndpointArr;
        $ENTRIES = new asp(attachUploadingEndpointArr);
    }

    public AttachUploadingEndpoint() {
        throw null;
    }

    public static zrp<AttachUploadingEndpoint> h() {
        return $ENTRIES;
    }

    public static AttachUploadingEndpoint valueOf(String str) {
        return (AttachUploadingEndpoint) Enum.valueOf(AttachUploadingEndpoint.class, str);
    }

    public static AttachUploadingEndpoint[] values() {
        return (AttachUploadingEndpoint[]) $VALUES.clone();
    }
}
