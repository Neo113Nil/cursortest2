package com.vk.core.apps;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.bpn0;
import xsna.drm0;
import xsna.gzs;
import xsna.ib3;
import xsna.kb3;
import xsna.mn8;
import xsna.msy;
import xsna.zr;
import xsna.zrp;

/* compiled from: BuildInfo.kt */
/* loaded from: classes.dex */
public final class BuildInfo {
    public static Client a;
    public static String b;
    public static String c;
    public static String d;
    public static int e;
    public static String f;
    public static int g;
    public static boolean h;
    public static final bpn0 i;
    public static gzs<? extends VkBuildAppStore> j;
    public static final Object k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuildInfo.kt */
    public static final class Client {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Client[] $VALUES;
        public static final Client SAMPLE;
        public static final Client UNKNOWN;
        public static final Client VK_ADMIN;
        public static final Client VK_APP;
        public static final Client VK_CALLS;
        public static final Client VK_DATING;
        public static final Client VK_EDU;
        public static final Client VK_ME;
        public static final Client VK_MINI_APP;
        public static final Client VK_MUSIC;
        public static final Client VK_TV;
        public static final Client VK_VIDEO;

        static {
            Client client = new Client("VK_APP", 0);
            VK_APP = client;
            Client client2 = new Client("VK_ME", 1);
            VK_ME = client2;
            Client client3 = new Client("VK_EDU", 2);
            VK_EDU = client3;
            Client client4 = new Client("SAMPLE", 3);
            SAMPLE = client4;
            Client client5 = new Client("VK_CALLS", 4);
            VK_CALLS = client5;
            Client client6 = new Client("VK_MINI_APP", 5);
            VK_MINI_APP = client6;
            Client client7 = new Client("VK_VIDEO", 6);
            VK_VIDEO = client7;
            Client client8 = new Client("VK_TV", 7);
            VK_TV = client8;
            Client client9 = new Client("VK_ADMIN", 8);
            VK_ADMIN = client9;
            Client client10 = new Client("VK_DATING", 9);
            VK_DATING = client10;
            Client client11 = new Client("VK_MUSIC", 10);
            VK_MUSIC = client11;
            Client client12 = new Client(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11);
            UNKNOWN = client12;
            Client[] clientArr = {client, client2, client3, client4, client5, client6, client7, client8, client9, client10, client11, client12};
            $VALUES = clientArr;
            $ENTRIES = new asp(clientArr);
        }

        public Client() {
            throw null;
        }

        public static Client valueOf(String str) {
            return (Client) Enum.valueOf(Client.class, str);
        }

        public static Client[] values() {
            return (Client[]) $VALUES.clone();
        }
    }

    /* compiled from: BuildInfo.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static boolean a(String str) {
            switch (str.hashCode()) {
                case -2106067805:
                    return str.equals("com.vk.admin");
                case -2104310999:
                    return str.equals("com.vk.calls");
                case -1938583537:
                    return str.equals("com.vkontakte.android");
                case -618855800:
                    return str.equals("com.uma.musicvk");
                case 664853306:
                    return str.equals("com.vk.vkvideo");
                case 1011858512:
                    return str.equals("com.vk.im");
                case 1011858862:
                    return str.equals("com.vk.tv");
                case 1733516190:
                    return str.equals("com.vk.love");
                default:
                    return false;
            }
        }
    }

    static {
        ib3 ib3Var = new ib3(1);
        a = Client.UNKNOWN;
        b = "release";
        c = new String();
        d = new String();
        e = -1;
        f = new String();
        g = -1;
        i = new bpn0(new mn8(0));
        j = ib3Var;
        k = msy.a(LazyThreadSafetyMode.NONE, new kb3(1));
    }

    public static final String a() {
        return d + '-' + e;
    }

    public static final boolean b() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"BuildInfo", "Build app store is \"" + c().i() + "\"."});
        }
        return n();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static VkBuildAppStore c() {
        return !h() ? (VkBuildAppStore) com.vk.core.apps.a.h.getValue() : (VkBuildAppStore) k.getValue();
    }

    public static String d(String str) {
        return m() ? "<HIDE>" : str;
    }

    public static final boolean e() {
        return TextUtils.equals("beta", b);
    }

    public static final boolean f() {
        if (g > -1) {
            return i() || e();
        }
        return false;
    }

    public static final boolean g() {
        return a == Client.VK_CALLS;
    }

    public static final boolean h() {
        return TextUtils.equals("debug", b);
    }

    public static final boolean i() {
        return TextUtils.equals("deploy", b);
    }

    public static final boolean j() {
        return c() == VkBuildAppStore.GOOGLE;
    }

    public static final boolean k() {
        return c() == VkBuildAppStore.HUAWEI;
    }

    public static final boolean l(Context context, String str) {
        final InstallSourceInfo installSourceInfo;
        final String installingPackageName;
        String initiatingPackageName;
        String originatingPackageName;
        if (Build.VERSION.SDK_INT < 30) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName != null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"BuildInfo", zr.a("Installer package name is \"", installerPackageName, "\".")});
                }
                return drm0.D(installerPackageName, str, false);
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.w, new Object[]{"BuildInfo", "Installer package name is null."});
                return false;
            }
        } else {
            try {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    L.n("BuildInfo", new gzs() { // from class: xsna.nn8
                        @Override // xsna.gzs
                        public final Object invoke() {
                            String initiatingPackageName2;
                            String originatingPackageName2;
                            InstallSourceInfo installSourceInfo2 = installSourceInfo;
                            StringBuilder a2 = t33.a("Installer package name is \"", installingPackageName, "\". Initialing package is \"");
                            initiatingPackageName2 = installSourceInfo2.getInitiatingPackageName();
                            a2.append(initiatingPackageName2);
                            a2.append("\", originating package is \"");
                            originatingPackageName2 = installSourceInfo2.getOriginatingPackageName();
                            a2.append(originatingPackageName2);
                            a2.append("\".");
                            return a2.toString();
                        }
                    });
                    return drm0.D(installingPackageName, str, false);
                }
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.w;
                    StringBuilder sb = new StringBuilder("Installer package name is null. Initialing package is \"");
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    sb.append(initiatingPackageName);
                    sb.append("\", originating package is \"");
                    originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    sb.append(originatingPackageName);
                    sb.append("\".");
                    L.u(l3, logType, new Object[]{"BuildInfo", sb.toString()});
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                L.j(e2, "BuildInfo", "Can't determine installer package name.");
                return false;
            }
        }
        return false;
    }

    public static final boolean m() {
        return TextUtils.equals("release", b) || TextUtils.equals("upload", b) || e();
    }

    public static final boolean n() {
        return c() == VkBuildAppStore.RUSTORE;
    }

    public static final boolean o() {
        return TextUtils.equals("release", b) || TextUtils.equals("upload", b);
    }

    public static final boolean p() {
        return i() || h() || e();
    }

    public static final boolean q() {
        return a == Client.VK_VIDEO;
    }

    public static final boolean r() {
        return a == Client.VK_ADMIN;
    }

    public static final boolean s() {
        return a == Client.VK_APP;
    }

    public static final boolean t() {
        return a == Client.VK_ME;
    }

    public static final boolean u() {
        return a == Client.VK_MUSIC;
    }

    public static String v() {
        return u() ? k() ? "appgallery" : n() ? "rustore" : AndroidStaticDeviceInfoDataSource.STORE_GOOGLE : AndroidStaticDeviceInfoDataSource.STORE_GOOGLE;
    }
}
