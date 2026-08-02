package jj;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.network.CheckUpdateResponseDTO;
import ru.ozon.android.inAppUpdate.internal.ui.g;

/* loaded from: classes10.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static Intent c() {
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        intent.addFlags(1);
        intent.addFlags(268435456);
        return intent;
    }

    public static void d(@NotNull Activity activity, @NotNull g config, @NotNull CheckUpdateResponseDTO response) {
        boolean z11;
        Intent intent;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(response, "response");
        int i11 = C8938a.f81237c;
        C8938a.b("Trying to open the directory with the downloaded apk file");
        String str = Build.MANUFACTURER;
        boolean z12 = false;
        if (str != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            z11 = Intrinsics.d(lowerCase, "xiaomi");
        } else {
            z11 = false;
        }
        if (z11) {
            intent = activity.getPackageManager().getLaunchIntentForPackage("com.mi.android.globalFileexplorer");
            if (intent != null) {
                intent.setDataAndType(null, "application/vnd.android.package-archive");
                intent.setFlags(1);
            } else {
                intent = null;
            }
            if (intent == null) {
                intent = c();
            }
        } else {
            if (str != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = str.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                z12 = Intrinsics.d(lowerCase2, "huawei");
            }
            if (z12) {
                intent = c();
            } else if (Build.VERSION.SDK_INT >= 29) {
                intent = c();
            } else {
                Uri parse = Uri.parse("content://com.android.externalstorage.documents/document/primary%3ADownload%2FOzon");
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setDataAndType(parse, "vnd.android.document/directory");
                intent2.addFlags(1);
                intent2.addFlags(268435456);
                intent = intent2;
            }
        }
        e(activity, intent, new C7433b(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Activity activity, Intent intent, Function0 function0) {
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            int i11 = C8938a.f81237c;
            C8938a.b("Intent: " + intent);
            C8938a.c(null, e11);
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Exception e12) {
            C8938a.c(null, e12);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
