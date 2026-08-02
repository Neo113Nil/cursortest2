package B5;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f797b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f796a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f798c = new Object();

    public static /* synthetic */ String c(a aVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = null;
        }
        return aVar.b(context);
    }

    public final void a(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
        File file = new File(noBackupFilesDir, "cx-fingerprint.no-backup");
        if (file.exists()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m147constructorimpl(Boolean.valueOf(file.createNewFile()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (context.getSharedPreferences("coralogix_sdk_prefs", 0).contains("cx-fingerprint")) {
            f(context);
        }
    }

    public final String b(Context context) {
        Context applicationContext;
        String str = f797b;
        if (str != null) {
            return str;
        }
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            String str2 = f797b;
            if (str2 != null) {
                return str2;
            }
            String e10 = e();
            f797b = e10;
            return e10;
        }
        synchronized (f798c) {
            try {
                String str3 = f797b;
                if (str3 != null) {
                    return str3;
                }
                a aVar = f796a;
                aVar.a(applicationContext);
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("coralogix_sdk_prefs", 0);
                String string = sharedPreferences.getString("cx-fingerprint", null);
                if (string == null) {
                    string = aVar.e();
                    Intrinsics.checkNotNull(sharedPreferences);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("cx-fingerprint", string);
                    edit.commit();
                }
                f797b = string;
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b(context);
    }

    public final String e() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }

    public final String f(Context context) {
        String e10;
        synchronized (f798c) {
            e10 = f796a.e();
            SharedPreferences sharedPreferences = context.getSharedPreferences("coralogix_sdk_prefs", 0);
            Intrinsics.checkNotNull(sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("cx-fingerprint", e10);
            edit.commit();
            f797b = e10;
        }
        return e10;
    }
}
