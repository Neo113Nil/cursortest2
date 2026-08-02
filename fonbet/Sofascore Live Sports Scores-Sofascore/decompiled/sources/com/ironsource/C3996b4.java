package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.m6k;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.b4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3996b4 {

    @NotNull
    private static final String b = "iads/";

    @NotNull
    private static final String c = "CONTROLLER_FROM_BUNDLE";

    @NotNull
    private static final String d = "controllerVersion";

    @NotNull
    private static final String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;

    @NotNull
    public static final C3996b4 a = new C3996b4();

    @NotNull
    private static final List<String> f = kotlin.collections.b.j(U3.f, U3.g, "mobileController.min.css", "index.html", "index.css", "index.js");

    private C3996b4() {
    }

    @Nullable
    public static final String a(@Nullable Context context) {
        if (context != null) {
            try {
                byte[] a2 = a(context, d);
                String obj = a2 != null ? StringsKt.l0(new String(a2, Charsets.UTF_8)).toString() : null;
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

    public static final boolean b(@Nullable Context context) {
        if (context != null) {
            g = IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    public static /* synthetic */ void b() {
    }

    public static final void a(@Nullable Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            IronSourceUtils.b(context, e, z);
        }
    }

    @Nullable
    public static final byte[] a(@Nullable Context context, @NotNull String str) {
        str.getClass();
        byte[] bArr = null;
        if (context != null) {
            try {
                InputStream open = context.getAssets().open(b.concat(str));
                try {
                    open.getClass();
                    bArr = m6k.b0(open);
                    Unit unit = Unit.a;
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

    @NotNull
    public static final List<String> a() {
        return f;
    }
}
