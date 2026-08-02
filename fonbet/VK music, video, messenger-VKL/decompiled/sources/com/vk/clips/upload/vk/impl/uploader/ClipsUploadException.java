package com.vk.clips.upload.vk.impl.uploader;

import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsUploadException.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadException extends RuntimeException {
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsUploadException.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SHORT_VIDEO_API;
        public static final Type TRANSCODER;
        public static final Type UPLOAD_LIBRARY;

        static {
            Type type = new Type("UPLOAD_LIBRARY", 0);
            UPLOAD_LIBRARY = type;
            Type type2 = new Type("TRANSCODER", 1);
            TRANSCODER = type2;
            Type type3 = new Type("SHORT_VIDEO_API", 2);
            SHORT_VIDEO_API = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ClipsUploadException(Type type, Throwable th) {
        super("", th);
        this.type = type;
    }

    public final Type d() {
        return this.type;
    }
}
