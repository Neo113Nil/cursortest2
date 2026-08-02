package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import xsna.drm0;
import xsna.e43;
import xsna.emb;
import xsna.i7o0;
import xsna.s3q0;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4291e4 {
    private static final String b = "iads/";
    private static final String c = "CONTROLLER_FROM_BUNDLE";
    private static final String d = "controllerVersion";
    private static final String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;
    public static final C4291e4 a = new C4291e4();
    private static final List<String> f = e43.l(X3.f, X3.g, "mobileController.min.css", "index.html", "index.css", "index.js");

    private C4291e4() {
    }

    public static final List<String> a() {
        return f;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            IronSourceUtils.b(context, e, z);
        }
    }

    public static final boolean b(Context context) {
        if (context != null) {
            g = IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    public static final byte[] a(Context context, String str) {
        byte[] bArr = null;
        if (context != null) {
            try {
                InputStream open = context.getAssets().open(b.concat(str));
                try {
                    bArr = i7o0.h(open);
                    s3q0 s3q0Var = s3q0.a;
                    open.close();
                    return bArr;
                } finally {
                }
            } catch (Exception e2) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/".concat(str));
                e2.printStackTrace();
            }
        }
        return bArr;
    }

    public static final String a(Context context) {
        if (context != null) {
            try {
                byte[] a2 = a(context, d);
                String obj = a2 != null ? drm0.p0(new String(a2, emb.b)).toString() : null;
                if (obj != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: ".concat(obj));
                    return obj;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e2) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return null;
    }
}
