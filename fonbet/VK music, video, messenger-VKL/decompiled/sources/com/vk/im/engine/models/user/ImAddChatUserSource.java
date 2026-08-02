package com.vk.im.engine.models.user;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImAddChatUserSource.kt */
/* loaded from: classes2.dex */
public final class ImAddChatUserSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImAddChatUserSource[] $VALUES;
    public static final ImAddChatUserSource CONTACTS;
    public static final ImAddChatUserSource CONVERSATION;
    public static final ImAddChatUserSource CREATE_CHAT;
    public static final ImAddChatUserSource OTHER;
    public static final ImAddChatUserSource PERSONAL;
    public static final ImAddChatUserSource PHONE;
    public static final ImAddChatUserSource SCREEN;
    public static final ImAddChatUserSource SEARCH;

    static {
        ImAddChatUserSource imAddChatUserSource = new ImAddChatUserSource("CONTACTS", 0);
        CONTACTS = imAddChatUserSource;
        ImAddChatUserSource imAddChatUserSource2 = new ImAddChatUserSource("CONVERSATION", 1);
        CONVERSATION = imAddChatUserSource2;
        ImAddChatUserSource imAddChatUserSource3 = new ImAddChatUserSource("CREATE_CHAT", 2);
        CREATE_CHAT = imAddChatUserSource3;
        ImAddChatUserSource imAddChatUserSource4 = new ImAddChatUserSource(NativeAdContent.ViewTag.OTHER, 3);
        OTHER = imAddChatUserSource4;
        ImAddChatUserSource imAddChatUserSource5 = new ImAddChatUserSource("PERSONAL", 4);
        PERSONAL = imAddChatUserSource5;
        ImAddChatUserSource imAddChatUserSource6 = new ImAddChatUserSource("PHONE", 5);
        PHONE = imAddChatUserSource6;
        ImAddChatUserSource imAddChatUserSource7 = new ImAddChatUserSource("SCREEN", 6);
        SCREEN = imAddChatUserSource7;
        ImAddChatUserSource imAddChatUserSource8 = new ImAddChatUserSource("SEARCH", 7);
        SEARCH = imAddChatUserSource8;
        ImAddChatUserSource[] imAddChatUserSourceArr = {imAddChatUserSource, imAddChatUserSource2, imAddChatUserSource3, imAddChatUserSource4, imAddChatUserSource5, imAddChatUserSource6, imAddChatUserSource7, imAddChatUserSource8};
        $VALUES = imAddChatUserSourceArr;
        $ENTRIES = new asp(imAddChatUserSourceArr);
    }

    public ImAddChatUserSource() {
        throw null;
    }

    public static ImAddChatUserSource valueOf(String str) {
        return (ImAddChatUserSource) Enum.valueOf(ImAddChatUserSource.class, str);
    }

    public static ImAddChatUserSource[] values() {
        return (ImAddChatUserSource[]) $VALUES.clone();
    }
}
