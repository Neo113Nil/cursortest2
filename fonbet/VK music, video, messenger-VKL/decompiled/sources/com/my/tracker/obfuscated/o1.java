package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class o1 {
    final e0 a;
    final y2 b;
    final Context c;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public o1(e0 e0Var, y2 y2Var, Context context) {
        this.a = e0Var;
        this.b = y2Var;
        this.c = context.getApplicationContext();
    }

    public static o1 a(e0 e0Var, y2 y2Var, Context context) {
        return new o1(e0Var, y2Var, context);
    }

    public a b() {
        String str = "ro.mtpi." + this.b.g();
        String a2 = c2.a(str);
        if (TextUtils.isEmpty(a2)) {
            x2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        x2.a("PreInstallHandler: raw data in SystemProperties has been found: " + a2);
        return a(3, a2, str);
    }

    public void c() {
        String r = this.b.r();
        if (TextUtils.isEmpty(r)) {
            return;
        }
        p1 a2 = p1.a(this.c);
        if (a2.q()) {
            return;
        }
        x2.a("PreInstallHandler: checking preinstall");
        try {
            String a3 = a(this.c.getPackageManager().getResourcesForApplication(r), this.c.getPackageName(), r);
            a2.u();
            if (TextUtils.isEmpty(a3)) {
                x2.a("PreInstallHandler: referrer is empty");
                return;
            }
            x2.a("PreInstallHandler: referrer " + a3);
            this.a.a(a3, t.b(this.c), (Runnable) null);
            p1.a(this.c).v();
        } catch (Throwable unused) {
            x2.a("PreInstallHandler: unable to locate vendor app " + r);
        }
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static a a(int i, String str, String str2) {
        try {
            x2.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            x2.a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                x2.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                x2.b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                x2.a("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    public a a() {
        if (!this.b.w()) {
            x2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a b = b();
        if (b != null) {
            return b;
        }
        a a2 = a(1);
        if (a2 != null) {
            return a2;
        }
        if (this.b.x()) {
            return a(2);
        }
        return null;
    }

    public a a(int i) {
        String str;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else if (i == 2) {
            str = "ro.appsflyer.preinstall.path";
        } else {
            x2.a("PreInstallHandler: wrong property property key");
            return null;
        }
        String a2 = c2.a(str);
        if (TextUtils.isEmpty(a2)) {
            x2.a("PreInstallHandler: empty path for source: " + i);
            return null;
        }
        String a3 = a(a2);
        if (TextUtils.isEmpty(a3)) {
            x2.a("PreInstallHandler: empty data for source: " + i);
            return null;
        }
        x2.a("PreInstallHandler: raw data for source has been found: " + a3);
        return a(i, a3, a2);
    }

    public String a(String str) {
        BufferedReader bufferedReader;
        try {
            try {
                x2.a("PreInstallHandler: searching string in file " + str);
                String str2 = this.c.getPackageName() + "=";
                int length = str2.length();
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            break;
                        }
                        x2.a("PreInstallHandler: processing string " + readLine);
                        if (readLine.startsWith(str2) && readLine.length() > length) {
                            String substring = readLine.substring(length);
                            if (!TextUtils.isEmpty(substring)) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused) {
                                }
                                return substring;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            x2.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable unused3) {
        }
        return null;
    }
}
