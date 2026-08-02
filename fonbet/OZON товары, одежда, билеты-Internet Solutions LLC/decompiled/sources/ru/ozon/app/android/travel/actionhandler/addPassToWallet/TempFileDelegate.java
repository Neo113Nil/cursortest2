package ru.ozon.app.android.travel.actionhandler.addPassToWallet;

import Lm0.a;
import android.content.Context;
import android.util.Base64;
import bd.h;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/addPassToWallet/TempFileDelegate;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "createFromBase64", "Ljava/io/File;", "base64", "", "fileSuffix", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TempFileDelegate {

    @NotNull
    private final Context context;

    public TempFileDelegate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final File createFromBase64(@NotNull String base64, @NotNull String fileSuffix) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(fileSuffix, "fileSuffix");
        try {
            byte[] decode = Base64.decode(base64, 0);
            File file = new File(this.context.getCacheDir(), "docs");
            if (!file.exists()) {
                file.mkdir();
            }
            File createTempFile = File.createTempFile("temp", "." + fileSuffix, file);
            Intrinsics.f(createTempFile);
            Intrinsics.f(decode);
            h.n(createTempFile, decode);
            return createTempFile;
        } catch (Exception e11) {
            a.f17149a.e(e11, "Failed to create temp file from base64", new Object[0]);
            return null;
        }
    }
}
