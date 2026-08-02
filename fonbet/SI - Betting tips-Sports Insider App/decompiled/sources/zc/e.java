package zc;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.widget.c1;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {
    public static Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 <= 23 || i5 >= 28) {
            intent.addFlags(402653184);
        }
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        return intent;
    }

    public static Intent b(Bundle bundle, String str) {
        Intent a7 = a();
        String decode = Uri.decode(str);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        a7.setData(Uri.parse(decode));
        if (bundle != null) {
            a7.putExtra("com.android.browser.headers", bundle);
        }
        return a7;
    }

    public static Uri c(String str, boolean z5) {
        String decode = Uri.decode(c1.m(z5 ? "https://play.google.com/store/apps/details?id=" : "market://details?id=", str));
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return Uri.parse(decode);
    }

    public static void d(String str, WeakReference weakReference) {
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending");
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setAction("android.intent.action.VIEW");
                launchIntentForPackage.setData(c(str, false));
                launchIntentForPackage.addFlags(67108864);
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
                return;
            }
            Context context2 = (Context) weakReference.get();
            if (context2 == null) {
                return;
            }
            try {
                Intent data = a().addCategory("android.intent.category.BROWSABLE").setData(c(str, true));
                Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                context2.startActivity(data);
            } catch (Exception e7) {
                d.b(6, null, e7);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean e(String str, WeakReference weakReference, Bundle bundle) {
        Context context = (Context) weakReference.get();
        if (context == null) {
            return false;
        }
        Continuation continuation = null;
        try {
            Intent createChooser = Intent.createChooser(b(bundle, str), "Open link");
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 24 || i5 >= 28) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
            return true;
        } catch (ActivityNotFoundException ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, continuation, 18), 2);
            return false;
        } catch (Exception e7) {
            d.b(6, null, e7);
            return false;
        }
    }
}
