package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084cm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f13542a;

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f13543b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3 f13544c;

    static {
        String[] elements = {"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f13542a = kotlin.collections.p.B(elements);
        f13543b = new SystemTimeProvider();
        f13544c = new C3();
    }

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0161fm c0161fm, Collection collection, Map map, Function0 function0) {
        boolean a7;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                            break;
                        } else {
                            a7 = a(c0161fm.f13756d);
                            if (a7) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a7 = a(c0161fm.f13761i);
                            if (a7) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a7 = a(c0161fm.f13754b);
                            if (a7) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            C3 c32 = f13544c;
                            C0645z3 c0645z3 = (C0645z3) function0.invoke();
                            c32.getClass();
                            a7 = C3.a(map, c0161fm, c0645z3);
                            if (a7) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a7 = a(c0161fm.j);
                            if (a7) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a7 = a(c0161fm.f13753a);
                            if (a7) {
                            }
                        }
                        break;
                }
                if (c0161fm.f13773w) {
                    return false;
                }
                if (f13543b.currentTimeSeconds() > c0161fm.f13766o + c0161fm.f13776z.f12119a) {
                    return false;
                }
            }
        }
        return true;
    }
}
