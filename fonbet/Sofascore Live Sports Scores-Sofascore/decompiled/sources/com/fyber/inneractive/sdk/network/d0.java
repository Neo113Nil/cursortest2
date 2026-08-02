package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class d0 {
    public final Context a;
    public final com.fyber.inneractive.sdk.cache.a b;
    public SharedPreferences c;

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        FileInputStream fileInputStream;
        IAlog.a("reading local file: %s", str);
        ?? r1 = 0;
        r1 = null;
        r1 = null;
        String str2 = null;
        try {
            try {
                fileInputStream = this.a.openFileInput(str);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    String str3 = new String(bArr, C.UTF8_NAME);
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing local file: %s", e.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof FileNotFoundException) {
                        throw new FileNotFoundException();
                    }
                    IAlog.a("Failed reading local file: %s", e.getMessage());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e3) {
                            IAlog.f("Failed closing local file: %s", e3.getMessage());
                        }
                    }
                    IAlog.a("local file %s read successfully", str);
                    return str2;
                }
            } catch (Throwable th) {
                th = th;
                r1 = this;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (Exception e4) {
                        IAlog.f("Failed closing local file: %s", e4.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }

    public final void b(String str) {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            sharedPreferences = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            this.c = sharedPreferences;
        }
        sharedPreferences.edit().putString(this.b.b(), str).apply();
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            sharedPreferences = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            this.c = sharedPreferences;
        }
        sharedPreferences.edit().remove(this.b.b()).apply();
    }

    public boolean a(String str, String str2) {
        boolean z;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        boolean z2 = false;
        try {
            try {
                fileOutputStream = this.a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
                z = true;
            } finally {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing cache file: %s", e.getMessage());
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            IAlog.a("File cached successfully", new Object[0]);
            try {
                fileOutputStream.close();
            } catch (Exception e3) {
                IAlog.f("Failed closing cache file: %s", e3.getMessage());
            }
        } catch (Exception e4) {
            e = e4;
            z2 = true;
            IAlog.f("Failed caching file: %s", e.getMessage());
            z = z2;
            return z;
        }
        return z;
    }

    public com.fyber.inneractive.sdk.cache.m a() {
        try {
            if (!this.b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            Object a = this.b.a(a(this.b.c()));
            SharedPreferences sharedPreferences = this.c;
            if (sharedPreferences == null) {
                sharedPreferences = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
                this.c = sharedPreferences;
            }
            return new com.fyber.inneractive.sdk.cache.m(a, sharedPreferences.getString(this.b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }
}
