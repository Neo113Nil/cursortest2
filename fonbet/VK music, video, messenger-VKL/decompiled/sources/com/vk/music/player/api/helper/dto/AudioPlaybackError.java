package com.vk.music.player.api.helper.dto;

import one.video.player.error.OneVideoPlaybackException;
import xsna.asp;
import xsna.zrp;

/* compiled from: AudioPlaybackError.kt */
/* loaded from: classes3.dex */
public final class AudioPlaybackError extends Exception {
    private final String errorCodeName;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPlaybackError.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type REMOTE;
        public static final Type RENDERER;
        public static final Type SOURCE;
        public static final Type UNEXPECTED;
        public static final Type UNRESOLVED;
        private final int value;

        static {
            Type type = new Type("SOURCE", 0, 0);
            SOURCE = type;
            Type type2 = new Type("RENDERER", 1, 1);
            RENDERER = type2;
            Type type3 = new Type("UNEXPECTED", 2, 2);
            UNEXPECTED = type3;
            Type type4 = new Type("REMOTE", 3, 3);
            REMOTE = type4;
            Type type5 = new Type("UNRESOLVED", 4, -1);
            UNRESOLVED = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* compiled from: AudioPlaybackError.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneVideoPlaybackException.Type.values().length];
            try {
                iArr[OneVideoPlaybackException.Type.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.RENDERER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.UNEXPECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.REMOTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.UNRESOLVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AudioPlaybackError(String str, Throwable th, Type type, String str2) {
        super(str, th);
        this.type = type;
        this.errorCodeName = str2;
    }

    public final String d() {
        return this.errorCodeName;
    }

    public final Type g() {
        return this.type;
    }
}
