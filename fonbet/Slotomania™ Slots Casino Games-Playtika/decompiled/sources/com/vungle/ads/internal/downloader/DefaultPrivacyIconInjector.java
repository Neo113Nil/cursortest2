package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.safedk.android.internal.partials.LiftoffMonetizeFilesBridge;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPrivacyIconInjector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", "file", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPrivacyIconInjector {
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    public final File injectPrivacyIcon(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultPrivacyIconInjector defaultPrivacyIconInjector = this;
            byte[] decode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStreamCtor = LiftoffMonetizeFilesBridge.fileOutputStreamCtor(file);
            try {
                fileOutputStreamCtor.write(decode);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamCtor, null);
                m11180constructorimpl = Result.m11180constructorimpl(true);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = false;
        }
        return ((Boolean) m11180constructorimpl).booleanValue();
    }
}
