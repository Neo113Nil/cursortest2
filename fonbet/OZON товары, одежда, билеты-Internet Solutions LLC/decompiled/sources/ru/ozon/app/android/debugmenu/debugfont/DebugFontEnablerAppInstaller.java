package ru.ozon.app.android.debugmenu.debugfont;

import Vd0.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import bd.C5652b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lru/ozon/app/android/debugmenu/debugfont/DebugFontEnablerAppInstaller;", "", "<init>", "()V", "installApk", "", "context", "Landroid/content/Context;", "apkName", "", "copyApkFromAssets", "", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebugFontEnablerAppInstaller {

    @NotNull
    public static final DebugFontEnablerAppInstaller INSTANCE = new DebugFontEnablerAppInstaller();

    private DebugFontEnablerAppInstaller() {
    }

    private final boolean copyApkFromAssets(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            try {
                FileOutputStream openFileOutput = context.openFileOutput(str, 0);
                try {
                    C5652b.a(open, openFileOutput);
                    b.a(openFileOutput, null);
                    open.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            Toast.makeText(context, "Apk file fas not found in the assets dir. An error probably occurred during build", 0).show();
            return false;
        } catch (IOException unused2) {
            Toast.makeText(context, "Cannot read the apk file", 1).show();
            return false;
        }
    }

    public final void installApk(@NotNull Context context, @NotNull String apkName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apkName, "apkName");
        if (INSTANCE.copyApkFromAssets(context, apkName)) {
            Uri d11 = FileProvider.d(context, context.getPackageName() + ".fileprovider", new File(context.getFilesDir(), apkName));
            Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
            intent.setData(d11);
            intent.setFlags(1);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                Toast.makeText(context, "No apk installer found", 1).show();
            }
        }
    }
}
