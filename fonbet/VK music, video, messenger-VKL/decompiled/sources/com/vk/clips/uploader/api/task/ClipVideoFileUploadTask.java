package com.vk.clips.uploader.api.task;

import com.vk.clips.uploader.api.model.b;
import xsna.asp;
import xsna.ned;
import xsna.zrp;

/* compiled from: ClipVideoFileUploadTask.kt */
/* loaded from: classes17.dex */
public interface ClipVideoFileUploadTask extends ned {
    void a(b bVar);

    /* compiled from: ClipVideoFileUploadTask.kt */
    public static final class Exception extends RuntimeException {
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipVideoFileUploadTask.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type MISSING_FILE;
            public static final Type SHORT_VIDEO_API;
            public static final Type TRANSCODER;
            public static final Type UPLOAD_LIBRARY;

            static {
                Type type = new Type("UPLOAD_LIBRARY", 0);
                UPLOAD_LIBRARY = type;
                Type type2 = new Type("TRANSCODER", 1);
                TRANSCODER = type2;
                Type type3 = new Type("MISSING_FILE", 2);
                MISSING_FILE = type3;
                Type type4 = new Type("SHORT_VIDEO_API", 3);
                SHORT_VIDEO_API = type4;
                Type[] typeArr = {type, type2, type3, type4};
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

        public Exception(Type type, String str, Throwable th) {
            super(str, th);
            this.type = type;
        }

        public final Type d() {
            return this.type;
        }

        public Exception(Type type, Throwable th) {
            this(type, "", th);
        }
    }
}
