package ph0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph0.InterfaceC8932a;

/* renamed from: ph0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8933b implements InterfaceC8932a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PackageManager f80544a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f80545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Xc.a<d> f80546c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Tc.d f80547d;

    /* renamed from: ph0.b$a */
    public static final class a {
        @NotNull
        public static C8933b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return new C8933b(packageManager);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ph0.b$b, reason: collision with other inner class name */
    private static final class EnumC1366b implements c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1366b[] $VALUES;
        public static final EnumC1366b FLYME_PUSH;
        public static final EnumC1366b HEY_TAP;
        public static final EnumC1366b HONOR_PUSH;
        public static final EnumC1366b MI_PUSH;
        public static final EnumC1366b VIVO_PUSH;

        @NotNull
        private final List<String> packages;
        private final String serviceQualifiedName;

        static {
            EnumC1366b enumC1366b = new EnumC1366b(0, C7714v.a0("com.xiaomi.xmsf"), "MI_PUSH", "com.xiaomi.xmsf.push.service.XMPushService");
            MI_PUSH = enumC1366b;
            EnumC1366b enumC1366b2 = new EnumC1366b(1, C7714v.a0("com.vivo.pushservice"), "VIVO_PUSH", "com.vivo.pushservice.core.external.PushEngineService");
            VIVO_PUSH = enumC1366b2;
            EnumC1366b enumC1366b3 = new EnumC1366b(2, C7714v.b0("com.coloros.mcs", "com.heytap.mcs", "com.nearme.push", "com.oplus.mcs", "com.coloros.oppopush", "com.oneplus.mcs"), "HEY_TAP", "com.nearme.instant.oms.push.PushManagerService");
            HEY_TAP = enumC1366b3;
            EnumC1366b enumC1366b4 = new EnumC1366b(3, C7714v.b0("com.hihonor.push", "com.hihonor.hms", "com.honor.hms", "com.hihonor.android.pushagent"), "HONOR_PUSH", null);
            HONOR_PUSH = enumC1366b4;
            EnumC1366b enumC1366b5 = new EnumC1366b(4, C7714v.b0("com.meizu.flyme.push", "com.meizu.mzsyncservice", "com.meizu.cloud", "com.meizu.push"), "FLYME_PUSH", null);
            FLYME_PUSH = enumC1366b5;
            EnumC1366b[] enumC1366bArr = {enumC1366b, enumC1366b2, enumC1366b3, enumC1366b4, enumC1366b5};
            $VALUES = enumC1366bArr;
            $ENTRIES = Xc.b.a(enumC1366bArr);
        }

        private EnumC1366b(int i11, List list, String str, String str2) {
            this.packages = list;
            this.serviceQualifiedName = str2;
        }

        public static EnumC1366b valueOf(String str) {
            return (EnumC1366b) Enum.valueOf(EnumC1366b.class, str);
        }

        public static EnumC1366b[] values() {
            return (EnumC1366b[]) $VALUES.clone();
        }

        @Override // ph0.C8933b.c
        @NotNull
        public final List<String> a() {
            return this.packages;
        }

        @Override // ph0.C8933b.c
        public final String b() {
            return this.serviceQualifiedName;
        }
    }

    /* renamed from: ph0.b$c */
    private interface c {
        @NotNull
        List<String> a();

        String b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ph0.b$d */
    private static final class d implements c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d FIREBASE;
        public static final d HUAWEI_PUSH;
        public static final d RU_STORE;

        @NotNull
        private final List<String> packages;
        private final String serviceQualifiedName;

        static {
            d dVar = new d(0, C7714v.a0("com.google.android.gms"), "FIREBASE", null);
            FIREBASE = dVar;
            d dVar2 = new d(1, C7714v.b0("com.huawei.android.pushagent", "com.huawei.hwid"), "HUAWEI_PUSH", "com.huawei.android.pushselfshow.receiver.PushMsgReceiver");
            HUAWEI_PUSH = dVar2;
            d dVar3 = new d(2, C7714v.a0("ru.vk.store"), "RU_STORE", "com.vk.push.pushsdk.ipc.PushService");
            RU_STORE = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            $VALUES = dVarArr;
            $ENTRIES = Xc.b.a(dVarArr);
        }

        private d(int i11, List list, String str, String str2) {
            this.packages = list;
            this.serviceQualifiedName = str2;
        }

        @NotNull
        public static Xc.a<d> d() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        @Override // ph0.C8933b.c
        @NotNull
        public final List<String> a() {
            return this.packages;
        }

        @Override // ph0.C8933b.c
        public final String b() {
            return this.serviceQualifiedName;
        }
    }

    public C8933b(@NotNull PackageManager packageManager) {
        String manufacturer = Build.MANUFACTURER;
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.f80544a = packageManager;
        String upperCase = manufacturer.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.f80545b = upperCase;
        this.f80546c = d.d();
        Tc.d builder = new Tc.d();
        builder.put("XIAOMI", EnumC1366b.MI_PUSH);
        builder.put("VIVO", EnumC1366b.VIVO_PUSH);
        EnumC1366b enumC1366b = EnumC1366b.HEY_TAP;
        builder.put("OPPO", enumC1366b);
        builder.put("REALME", enumC1366b);
        builder.put("ONEPLUS", enumC1366b);
        builder.put("HONOR", EnumC1366b.HONOR_PUSH);
        builder.put("MEIZU", EnumC1366b.FLYME_PUSH);
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f80547d = builder.u();
    }

    private final InterfaceC8932a.C1363a b(c cVar, InterfaceC8932a.C1363a.b bVar) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        InterfaceC8932a.C1363a.C1364a.EnumC1365a enumC1365a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = cVar.a().iterator();
        while (true) {
            Boolean bool = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            try {
                packageInfo = this.f80544a.getPackageInfo(str, 4);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            String str2 = packageInfo != null ? packageInfo.versionName : null;
            if (str2 != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                boolean z11 = true;
                if (applicationInfo.enabled) {
                    String b11 = cVar.b();
                    if (b11 != null) {
                        ServiceInfo[] serviceInfoArr = packageInfo.services;
                        if (serviceInfoArr != null) {
                            int length = serviceInfoArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    z11 = false;
                                    break;
                                }
                                ServiceInfo serviceInfo = serviceInfoArr[i11];
                                if (Intrinsics.d(serviceInfo.name, b11) && serviceInfo.enabled) {
                                    break;
                                }
                                i11++;
                            }
                            bool = Boolean.valueOf(z11);
                        }
                        enumC1365a = Intrinsics.d(bool, Boolean.TRUE) ? InterfaceC8932a.C1363a.C1364a.EnumC1365a.AVAILABLE : InterfaceC8932a.C1363a.C1364a.EnumC1365a.NOT_AVAILABLE;
                    } else {
                        enumC1365a = InterfaceC8932a.C1363a.C1364a.EnumC1365a.NA;
                    }
                    arrayList.add(new InterfaceC8932a.C1363a.C1364a(str, str2, packageInfo.versionCode, enumC1365a));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new InterfaceC8932a.C1363a(bVar, arrayList);
    }

    @Override // ph0.InterfaceC8932a
    @NotNull
    public final ArrayList a() {
        InterfaceC8932a.C1363a b11;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f80546c.iterator();
        while (it.hasNext()) {
            InterfaceC8932a.C1363a b12 = b((d) it.next(), InterfaceC8932a.C1363a.b.UNIVERSAL);
            if (b12 != null) {
                arrayList.add(b12);
            }
        }
        EnumC1366b enumC1366b = (EnumC1366b) this.f80547d.get(this.f80545b);
        if (enumC1366b != null && (b11 = b(enumC1366b, InterfaceC8932a.C1363a.b.OEM)) != null) {
            arrayList.add(b11);
        }
        return arrayList;
    }
}
