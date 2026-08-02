package com.vk.dto.common;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServerEffect.kt */
/* loaded from: classes18.dex */
public final class ServerEffect {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServerEffect[] $VALUES;
    public static final a Companion;
    public static final ServerEffect DEEP_FAKE;
    public static final ServerEffect NONE;
    private final String key;

    /* compiled from: ServerEffect.kt */
    public static final class a {
    }

    static {
        ServerEffect serverEffect = new ServerEffect("DEEP_FAKE", 0, "deepfake");
        DEEP_FAKE = serverEffect;
        ServerEffect serverEffect2 = new ServerEffect("NONE", 1, "none");
        NONE = serverEffect2;
        ServerEffect[] serverEffectArr = {serverEffect, serverEffect2};
        $VALUES = serverEffectArr;
        $ENTRIES = new asp(serverEffectArr);
        Companion = new a();
    }

    public ServerEffect(String str, int i, String str2) {
        this.key = str2;
    }

    public static final ServerEffect a(String str) {
        ServerEffect serverEffect;
        Companion.getClass();
        ServerEffect[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                serverEffect = null;
                break;
            }
            serverEffect = values[i];
            if (epx.f(serverEffect.h(), str)) {
                break;
            }
            i++;
        }
        return serverEffect == null ? NONE : serverEffect;
    }

    public static ServerEffect valueOf(String str) {
        return (ServerEffect) Enum.valueOf(ServerEffect.class, str);
    }

    public static ServerEffect[] values() {
        return (ServerEffect[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
