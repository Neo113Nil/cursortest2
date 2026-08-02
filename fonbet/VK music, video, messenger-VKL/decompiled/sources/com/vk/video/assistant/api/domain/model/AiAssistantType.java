package com.vk.video.assistant.api.domain.model;

import java.util.Iterator;
import xsna.asp;
import xsna.brm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AiAssistantType.kt */
/* loaded from: classes5.dex */
public final class AiAssistantType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AiAssistantType[] $VALUES;
    public static final AiAssistantType COMMON;
    public static final a Companion;
    public static final AiAssistantType MUSIC;
    private final String value;

    /* compiled from: AiAssistantType.kt */
    public static final class a {
        public static AiAssistantType a(String str) {
            Object obj;
            Iterator<E> it = AiAssistantType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (brm0.w(((AiAssistantType) obj).i(), str, true)) {
                    break;
                }
            }
            AiAssistantType aiAssistantType = (AiAssistantType) obj;
            return aiAssistantType == null ? AiAssistantType.COMMON : aiAssistantType;
        }
    }

    static {
        AiAssistantType aiAssistantType = new AiAssistantType("COMMON", 0, "common");
        COMMON = aiAssistantType;
        AiAssistantType aiAssistantType2 = new AiAssistantType("MUSIC", 1, "music");
        MUSIC = aiAssistantType2;
        AiAssistantType[] aiAssistantTypeArr = {aiAssistantType, aiAssistantType2};
        $VALUES = aiAssistantTypeArr;
        $ENTRIES = new asp(aiAssistantTypeArr);
        Companion = new a();
    }

    public AiAssistantType(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<AiAssistantType> h() {
        return $ENTRIES;
    }

    public static AiAssistantType valueOf(String str) {
        return (AiAssistantType) Enum.valueOf(AiAssistantType.class, str);
    }

    public static AiAssistantType[] values() {
        return (AiAssistantType[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
