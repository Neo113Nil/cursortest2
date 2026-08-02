package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.UserManager;
import android.view.PointerIcon;
import j$.util.stream.IntStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e8.b f5072a;

    public static IntStream a(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
        return convert;
    }

    public static IntStream b(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        return convert;
    }

    public static LocaleList c(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static final void d(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        context.deleteSharedPreferences(name);
    }

    public static DecimalFormatSymbols e(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList f(Configuration configuration) {
        return configuration.getLocales();
    }

    public static PointerIcon g(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static String[] h(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] i(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static boolean j(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean k(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:90)(1:24)|25|26|27|28|29|30|31|(1:33)(1:82)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:59|60|61)(7:45|46|(2:48|(1:51))|52|(1:54)(1:58)|55|56)|57)(1:62))|63|64|65)(1:81)|66|14) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0076, code lost:
    
        io.sentry.android.core.w0.e("HermeticFileOverrides", "no data dir", r0);
        r5 = e8.a.f8772a;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e8.b l(Context context) {
        e8.b bVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        e8.b bVar2;
        char c2;
        e8.b bVar3 = f5072a;
        if (bVar3 != null) {
            return bVar3;
        }
        synchronized (h4.class) {
            try {
                bVar = f5072a;
                if (bVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    s.e eVar = k4.f5109a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        bVar = e8.a.f8772a;
                        f5072a = bVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        bVar = e8.a.f8772a;
                        f5072a = bVar;
                    }
                    Context createDeviceProtectedStorageContext = (!a4.a() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c8 = 0;
                    File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                    e8.b bVar4 = file.exists() ? new e8.c(file) : e8.a.f8772a;
                    if (bVar4.b()) {
                        File file2 = (File) bVar4.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(y4.a.m(new FileInputStream(file2), file2)));
                            try {
                                s.n nVar = new s.n(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb2 = new StringBuilder(readLine.length() + 9);
                                        sb2.append("Invalid: ");
                                        sb2.append(readLine);
                                        io.sentry.android.core.w0.d("HermeticFileOverrides", sb2.toString());
                                    } else {
                                        String str3 = new String(split[c8]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        s.n nVar2 = (s.n) nVar.get(str3);
                                        if (nVar2 == null) {
                                            c2 = 0;
                                            nVar2 = new s.n(0);
                                            nVar.put(str3, nVar2);
                                        } else {
                                            c2 = 0;
                                        }
                                        nVar2.put(decode, str4);
                                        c8 = c2;
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = createDeviceProtectedStorageContext.getPackageName();
                                StringBuilder sb3 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                sb3.append("Parsed ");
                                sb3.append(obj);
                                sb3.append(" for Android package ");
                                sb3.append(packageName);
                                io.sentry.android.core.w0.m("HermeticFileOverrides", sb3.toString());
                                e4 e4Var = new e4(nVar);
                                bufferedReader.close();
                                bVar2 = new e8.c(e4Var);
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (IOException e7) {
                            throw new RuntimeException(e7);
                        }
                    } else {
                        bVar2 = e8.a.f8772a;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    bVar = bVar2;
                    f5072a = bVar;
                }
            } catch (Throwable th4) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th4;
            } finally {
            }
        }
        return bVar;
    }
}
