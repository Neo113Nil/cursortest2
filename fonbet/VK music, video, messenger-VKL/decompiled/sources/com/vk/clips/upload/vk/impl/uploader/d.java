package com.vk.clips.upload.vk.impl.uploader;

import com.vk.clips.upload.vk.impl.uploader.ClipsUploadException;
import com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsUploaderExt.kt */
/* loaded from: classes17.dex */
public final class d {

    /* compiled from: ClipsUploaderExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsUploadException.Type.values().length];
            try {
                iArr[ClipsUploadException.Type.UPLOAD_LIBRARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsUploadException.Type.TRANSCODER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsUploadException.Type.SHORT_VIDEO_API.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ClipsUploadErrorsEventBuilder.ErrorType a(Throwable th) {
        while (th != null) {
            if (th instanceof ClipsUploadException) {
                int i = a.$EnumSwitchMapping$0[((ClipsUploadException) th).d().ordinal()];
                if (i == 1) {
                    return ClipsUploadErrorsEventBuilder.ErrorType.UPLOAD_LIBRARY;
                }
                if (i == 2) {
                    return ClipsUploadErrorsEventBuilder.ErrorType.TRANSCODER;
                }
                if (i == 3) {
                    return ClipsUploadErrorsEventBuilder.ErrorType.SHORT_VIDEO_API;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (th.equals(th.getCause())) {
                return ClipsUploadErrorsEventBuilder.ErrorType.OTHER;
            }
            th = th.getCause();
        }
        return ClipsUploadErrorsEventBuilder.ErrorType.OTHER;
    }
}
