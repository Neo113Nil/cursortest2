package com.vk.media.player;

import java.util.Iterator;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayerError.kt */
/* loaded from: classes3.dex */
public final class PlayerError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlayerError[] $VALUES;
    public static final a Companion;
    public static final PlayerError ERROR_CANT_DECODE;
    public static final PlayerError ERROR_CONTENT_RESTRICTED;
    public static final PlayerError ERROR_GL_FAILED;
    public static final PlayerError ERROR_LIVE_NOT_STARTED;
    public static final PlayerError ERROR_NETWORK;
    public static final PlayerError ERROR_NOT_CONVERTED;
    public static final PlayerError ERROR_NOT_PROCESSED;
    public static final PlayerError ERROR_NOT_SUPPORT;
    public static final PlayerError ERROR_NOT_SUPPORT_RESOLUTION;
    public static final PlayerError ERROR_SERVER;
    public static final PlayerError UNKNOWN_ERROR;
    private final int code;
    private final String description;

    /* compiled from: PlayerError.kt */
    public static final class a {
        public static PlayerError a(int i) {
            Object obj;
            Iterator<E> it = PlayerError.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PlayerError) obj).ordinal() == i) {
                    break;
                }
            }
            PlayerError playerError = (PlayerError) obj;
            return playerError == null ? PlayerError.UNKNOWN_ERROR : playerError;
        }
    }

    static {
        PlayerError playerError = new PlayerError("ERROR_NETWORK", 0, "ERROR_NETWORK", -1);
        ERROR_NETWORK = playerError;
        PlayerError playerError2 = new PlayerError("ERROR_CANT_DECODE", 1, "ERROR_CANT_DECODE", 1);
        ERROR_CANT_DECODE = playerError2;
        PlayerError playerError3 = new PlayerError("ERROR_SERVER", 2, "ERROR_SERVER", 2);
        ERROR_SERVER = playerError3;
        PlayerError playerError4 = new PlayerError("ERROR_NOT_PROCESSED", 3, "ERROR_NOT_PROCESSED", 4);
        ERROR_NOT_PROCESSED = playerError4;
        PlayerError playerError5 = new PlayerError("ERROR_LIVE_NOT_STARTED", 4, "ERROR_LIVE_NOT_STARTED", 5);
        ERROR_LIVE_NOT_STARTED = playerError5;
        PlayerError playerError6 = new PlayerError("ERROR_CONTENT_RESTRICTED", 5, "ERROR_CONTENT_RESTRICTED", 6);
        ERROR_CONTENT_RESTRICTED = playerError6;
        PlayerError playerError7 = new PlayerError("ERROR_NOT_SUPPORT", 6, "ERROR_NOT_SUPPORT", 7);
        ERROR_NOT_SUPPORT = playerError7;
        PlayerError playerError8 = new PlayerError("ERROR_NOT_SUPPORT_RESOLUTION", 7, "ERROR_NOT_SUPPORT_RESOLUTION", 8);
        ERROR_NOT_SUPPORT_RESOLUTION = playerError8;
        PlayerError playerError9 = new PlayerError("ERROR_NOT_CONVERTED", 8, "ERROR_NOT_CONVERTED", 9);
        ERROR_NOT_CONVERTED = playerError9;
        PlayerError playerError10 = new PlayerError("ERROR_GL_FAILED", 9, "ERROR_GL_FAILED", 10);
        ERROR_GL_FAILED = playerError10;
        PlayerError playerError11 = new PlayerError("UNKNOWN_ERROR", 10, "UNKNOWN_ERROR", 11);
        UNKNOWN_ERROR = playerError11;
        PlayerError[] playerErrorArr = {playerError, playerError2, playerError3, playerError4, playerError5, playerError6, playerError7, playerError8, playerError9, playerError10, playerError11};
        $VALUES = playerErrorArr;
        $ENTRIES = new asp(playerErrorArr);
        Companion = new a();
    }

    public PlayerError(String str, int i, String str2, int i2) {
        this.description = str2;
        this.code = i2;
    }

    public static zrp<PlayerError> i() {
        return $ENTRIES;
    }

    public static PlayerError valueOf(String str) {
        return (PlayerError) Enum.valueOf(PlayerError.class, str);
    }

    public static PlayerError[] values() {
        return (PlayerError[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }

    public final int h() {
        return this.code;
    }
}
