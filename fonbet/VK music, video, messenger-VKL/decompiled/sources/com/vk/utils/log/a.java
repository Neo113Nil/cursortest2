package com.vk.utils.log;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.vk.api.base.Document;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.utils.log.LogUploader;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.FileOutputStream;
import xsna.asu0;
import xsna.bny;
import xsna.c24;
import xsna.c63;
import xsna.cvk;
import xsna.d260;
import xsna.e43;
import xsna.eny;
import xsna.gzs;
import xsna.h000;
import xsna.jq0;
import xsna.kbj0;
import xsna.lu2;
import xsna.nr4;
import xsna.o25;
import xsna.o260;
import xsna.ozl;
import xsna.rwu;
import xsna.s25;
import xsna.t6v0;
import xsna.x93;
import xsna.z4g;

/* compiled from: AppLogger.kt */
/* loaded from: classes11.dex */
public final class a {
    public static gzs<Boolean> a = new c24(0);
    public static final b b = new b();
    public static final C1941a c = new C1941a();

    /* compiled from: AppLogger.kt */
    public static final class b implements L.a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v12, types: [android.content.Context] */
        @Override // com.vk.log.L.a
        public final void a(String str, boolean z) {
            Activity activity;
            if (z && o25.a().b()) {
                LogUploader logUploader = LogUploader.a;
                if (LogUploader.d()) {
                    logUploader.e(o25.a().c().b, new File(str), LogUploader.LogArtifact.APPLOG);
                    return;
                }
                if (BuildInfo.m()) {
                    cvk.u(R.string.settings_upload_debug_started, false);
                    com.vk.upload.impl.a.i(new h000(str, o25.a().c(), false, true));
                    return;
                }
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    b = null;
                }
                if (b == null) {
                    ?? r11 = e43.a;
                    activity = r11 != 0 ? r11 : null;
                } else {
                    activity = b;
                }
                File file = new File(str);
                Document document = new Document();
                document.k = str;
                document.m = Header.COMPRESSION_ALGORITHM;
                document.l = file.getName();
                document.g = z4g.f(file);
                kbj0.e(nr4.b(), activity, new PendingDocumentAttachment(document), false, null, false, null, 60);
            }
        }

        @Override // com.vk.log.L.a
        public final void b(String str) {
            if (TextUtils.isEmpty(str) && o25.a().i().c) {
                cvk.u(R.string.debug_logger_is_enabled, false);
            }
        }
    }

    public static rwu.a a() {
        String str;
        ActivityInfo activityInfo;
        String string = Preference.j().getString("app_update_versions", "");
        String str2 = string != null ? string : "";
        bny.a.getClass();
        eny enyVar = (eny) bny.h.getValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enyVar.getClass();
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity((Intent) enyVar.a.getValue(), 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || (str = activityInfo.packageName) == null) {
            str = "unknown";
        }
        rwu.a aVar = new rwu.a(new lu2(1));
        aVar.a("UID_USER:", String.valueOf(o25.a().c().b));
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        aVar.a("USER_AGENT:", o260Var.l.a());
        aVar.a("VERSIONS:", str2);
        o260 o260Var2 = d260.a;
        aVar.a("HAS_PROXY:", String.valueOf((o260Var2 != null ? o260Var2 : null).h().isEnabled()));
        aVar.a("DEFAULT_LAUNCHER:", str);
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return aVar;
    }

    public static void b() {
        boolean z = o25.a().i().c || a.invoke().booleanValue();
        if (!BuildInfo.m()) {
            LoggerOutputTarget.Companion.getClass();
            L.y(e43.a(LoggerOutputTarget.RING_FILE, LoggerOutputTarget.CONSOLE, LoggerOutputTarget.LOGCAT, LoggerOutputTarget.EXTERNAL));
        } else if ((BuildInfo.m() && o25.a().i().c) || z) {
            LoggerOutputTarget.Companion.getClass();
            L.y(e43.a(LoggerOutputTarget.LOGCAT, LoggerOutputTarget.RING_FILE, LoggerOutputTarget.EXTERNAL));
        } else {
            LoggerOutputTarget.Companion.getClass();
            L.y(e43.a(LoggerOutputTarget.NONE));
        }
    }

    /* compiled from: AppLogger.kt */
    /* renamed from: com.vk.utils.log.a$a, reason: collision with other inner class name */
    public static final class C1941a implements s25 {
        @Override // xsna.s25
        public final void n(AuthResult authResult) {
            asu0.a.getClass();
            asu0.n().execute(new Runnable() { // from class: xsna.t63
                @Override // java.lang.Runnable
                public final void run() {
                    rwu.a a = com.vk.utils.log.a.a();
                    xkg0 xkg0Var = L.m;
                    if (xkg0Var != null) {
                        m9r m9rVar = xkg0Var.a;
                        jar jarVar = xkg0Var.d;
                        if (jarVar == null) {
                            jarVar = null;
                        }
                        xkg0Var.d = jar.a(jarVar, a, null, 27);
                        File file = xkg0Var.j;
                        m9rVar.getClass();
                        if (m9r.c(file)) {
                            File file2 = xkg0Var.j;
                            jar jarVar2 = xkg0Var.d;
                            byte[] bytes = (jarVar2 != null ? jarVar2 : null).c.b().toString().getBytes(emb.b);
                            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                            try {
                                fileOutputStream.write(bytes);
                                s3q0 s3q0Var = s3q0.a;
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ro.e(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            });
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void m() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void b(String str) {
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }
}
