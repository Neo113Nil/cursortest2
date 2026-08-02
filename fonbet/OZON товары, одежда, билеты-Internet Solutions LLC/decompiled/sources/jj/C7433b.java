package jj;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7433b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f70127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7433b(Activity activity) {
        super(0);
        this.f70127b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z11;
        Intent c11;
        Intent c12;
        String str = Build.MANUFACTURER;
        if (str != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            z11 = Intrinsics.d(lowerCase, "samsung");
        } else {
            z11 = false;
        }
        Activity activity = this.f70127b;
        if (z11) {
            Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage("com.sec.android.app.myfiles");
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setAction("samsung.myfiles.intent.action.LAUNCH_MY_FILES");
                launchIntentForPackage.putExtra("samsung.myfiles.intent.extra.START_PATH", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());
            } else {
                launchIntentForPackage = null;
            }
            if (launchIntentForPackage == null) {
                c12 = c.c();
                c.e(activity, c12, null);
            } else {
                c.e(activity, launchIntentForPackage, new C7432a(activity));
            }
        } else {
            c11 = c.c();
            c.e(activity, c11, null);
        }
        return Unit.f71690a;
    }
}
