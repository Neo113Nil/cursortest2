package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2395e4 {
    private static final String b = "iads/";
    private static final String c = "CONTROLLER_FROM_BUNDLE";
    private static final String d = "controllerVersion";
    private static final String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;
    public static final C2395e4 a = new C2395e4();
    private static final List<String> f = CollectionsKt.listOf((Object[]) new String[]{X3.f, X3.g, "mobileController.min.css", "index.html", "index.css", "index.js"});

    private C2395e4() {
    }

    public static final List<String> a() {
        return f;
    }

    @JvmStatic
    public static /* synthetic */ void b() {
    }

    @JvmStatic
    public static final void a(Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            IronSourceUtils.b(context, e, z);
        }
    }

    @JvmStatic
    public static final boolean b(Context context) {
        if (context != null) {
            g = IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    @JvmStatic
    public static final byte[] a(Context context, String fileName) {
        Throwable th;
        ?? r0 = b;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr = null;
        if (context != null) {
            try {
                try {
                    InputStream inputStream = context.getAssets().open(b + fileName);
                    try {
                        Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                        r0 = ByteStreamsKt.readBytes(inputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        r0 = 0;
                    }
                    try {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStream, null);
                        return r0;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(inputStream, th);
                            throw th4;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                    e.printStackTrace();
                    return bArr;
                }
            } catch (Exception e3) {
                e = e3;
                bArr = r0;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                e.printStackTrace();
                return bArr;
            }
        }
        return bArr;
    }

    @JvmStatic
    public static final String a(Context context) {
        if (context != null) {
            try {
                byte[] a2 = a(context, d);
                String obj = a2 != null ? StringsKt.trim((CharSequence) new String(a2, Charsets.UTF_8)).toString() : null;
                if (obj != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + obj);
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
