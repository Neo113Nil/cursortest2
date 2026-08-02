package com.vk.core.native_loader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.facebook.soloader.ExternalSoMapping;
import com.facebook.soloader.SoLoader;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import dalvik.system.BaseDexClassLoader;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bpn0;
import xsna.brm0;
import xsna.c5g;
import xsna.dli0;
import xsna.drm0;
import xsna.e2v0;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.go9;
import xsna.gzs;
import xsna.i5g;
import xsna.izs;
import xsna.j5g;
import xsna.kir;
import xsna.ky6;
import xsna.lir;
import xsna.mb3;
import xsna.nbr;
import xsna.ox4;
import xsna.rl3;
import xsna.rli0;
import xsna.s3q0;
import xsna.tv50;
import xsna.ulp0;
import xsna.z33;
import xsna.zrp;

/* compiled from: NativeLibLoader.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class NativeLibLoader {
    public static volatile boolean d;
    public static HashMap g;
    public static Context h;
    public static b i;
    public static PackageManager j;
    public static boolean m;
    public static boolean o;
    public static final NativeLibLoader a = new NativeLibLoader();
    public static final Set<String> b = rl3.y0(new String[]{"so", "a", "o"});
    public static final Set<String> c = rl3.y0(new String[]{"/vendor/lib/", "/system/lib/"});
    public static final Object e = new Object();
    public static CpuType f = CpuType.UNKNOWN;
    public static volatile SoLoaderState k = SoLoaderState.UNINITIALIZED;
    public static final Object l = new Object();
    public static boolean n = true;
    public static final a<String> p = new a<>(new mb3(10));
    public static final a<Set<String>> q = new a<>(new ox4(5));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NativeLibLoader.kt */
    public static final class SoLoaderState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SoLoaderState[] $VALUES;
        public static final SoLoaderState FAILED;
        public static final SoLoaderState INITIALIZED;
        public static final SoLoaderState UNINITIALIZED;

        static {
            SoLoaderState soLoaderState = new SoLoaderState("UNINITIALIZED", 0);
            UNINITIALIZED = soLoaderState;
            SoLoaderState soLoaderState2 = new SoLoaderState("INITIALIZED", 1);
            INITIALIZED = soLoaderState2;
            SoLoaderState soLoaderState3 = new SoLoaderState(SignalingProtocol.HUNGUP_REASON_FAILED, 2);
            FAILED = soLoaderState3;
            SoLoaderState[] soLoaderStateArr = {soLoaderState, soLoaderState2, soLoaderState3};
            $VALUES = soLoaderStateArr;
            $ENTRIES = new asp(soLoaderStateArr);
        }

        public SoLoaderState() {
            throw null;
        }

        public static SoLoaderState valueOf(String str) {
            return (SoLoaderState) Enum.valueOf(SoLoaderState.class, str);
        }

        public static SoLoaderState[] values() {
            return (SoLoaderState[]) $VALUES.clone();
        }
    }

    /* compiled from: NativeLibLoader.kt */
    public static final class a<T> implements Lazy<T> {
        public final gzs<T> b;
        public volatile bpn0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gzs<? extends T> gzsVar) {
            this.b = gzsVar;
            this.c = new bpn0(gzsVar);
        }

        @Override // kotlin.Lazy
        public final T getValue() {
            return (T) this.c.getValue();
        }

        @Override // kotlin.Lazy
        public final boolean isInitialized() {
            return this.c.isInitialized();
        }
    }

    /* compiled from: NativeLibLoader.kt */
    public interface b {

        /* compiled from: NativeLibLoader.kt */
        /* loaded from: classes17.dex */
        public static final class a {
            public static void a(e2v0 e2v0Var, Throwable th, CpuType cpuType) {
                e2v0Var.a(th);
            }

            public static void b(e2v0 e2v0Var, NativeLibLoadException nativeLibLoadException, CpuType cpuType) {
                e2v0Var.a(nativeLibLoadException);
            }
        }

        void a(Throwable th);

        void b(Throwable th, CpuType cpuType, String str, String str2);

        void c(NativeLibLoadException nativeLibLoadException, CpuType cpuType);
    }

    /* compiled from: NativeLibLoader.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<File, Boolean> {
        public static final c b = new c(1, File.class, "exists", "exists()Z", 0);

        @Override // xsna.izs
        public final Boolean invoke(File file) {
            return Boolean.valueOf(file.exists());
        }
    }

    /* compiled from: NativeLibLoader.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<File, String> {
        public static final d b = new d(1, File.class, "getAbsolutePath", "getAbsolutePath()Ljava/lang/String;", 0);

        @Override // xsna.izs
        public final String invoke(File file) {
            return file.getAbsolutePath();
        }
    }

    /* compiled from: NativeLibLoader.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e extends AdaptedFunctionReference implements izs<String, List<? extends String>> {
        public e(NativeLibLoader nativeLibLoader) {
            super(1, nativeLibLoader, NativeLibLoader.class, "getFileList", "getFileList(Ljava/lang/String;I)Ljava/util/List;", 0);
        }

        @Override // xsna.izs
        public final List<? extends String> invoke(String str) {
            NativeLibLoader nativeLibLoader = (NativeLibLoader) this.receiver;
            NativeLibLoader nativeLibLoader2 = NativeLibLoader.a;
            nativeLibLoader.getClass();
            return NativeLibLoader.e(0, str);
        }
    }

    /* compiled from: NativeLibLoader.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public f(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public static boolean a(NativeLib nativeLib) {
        if (n) {
            return k == SoLoaderState.INITIALIZED ? k(nativeLib, false) : l(nativeLib, false);
        }
        if (k != SoLoaderState.INITIALIZED) {
            return l(nativeLib, false);
        }
        try {
            SoLoader.loadLibrary(nativeLib.l());
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public static File b(NativeLib nativeLib, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                if (epx.f(str2, nativeLib.j())) {
                    return new File(str, str2);
                }
            }
        }
        return null;
    }

    @SuppressLint({"SdCardPath"})
    public static LinkedHashSet c() {
        ApplicationInfo applicationInfo;
        Context context = h;
        if (context == null) {
            context = null;
        }
        String packageName = context.getPackageName();
        Context context2 = h;
        if (context2 == null) {
            context2 = null;
        }
        String packageName2 = context2.getPackageName();
        boolean f2 = epx.f(packageName, packageName2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a.getClass();
        List<String> c0 = drm0.c0((String) p.c.getValue(), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
        ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
        for (String str : c0) {
            if (!drm0.G(str, '/')) {
                str = str.concat(DomExceptionUtils.SEPARATOR);
            }
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!f2) {
                str2 = brm0.y(str2, packageName2, packageName);
            }
            arrayList2.add(str2);
        }
        linkedHashSet.addAll(arrayList2);
        linkedHashSet.add("/data/data/" + packageName + "/lib/");
        linkedHashSet.add("/data/data/" + packageName + "/lib-0/");
        linkedHashSet.add("/data/data/" + packageName + "/lib-1/");
        linkedHashSet.add("/data/data/" + packageName + "/lib-main/");
        if (f2) {
            Context context3 = h;
            applicationInfo = (context3 != null ? context3 : null).getApplicationInfo();
        } else {
            PackageManager packageManager = j;
            applicationInfo = (packageManager != null ? packageManager : null).getApplicationInfo(packageName, 0);
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (!drm0.G(str3, '/')) {
            str3 = str3.concat(DomExceptionUtils.SEPARATOR);
        }
        linkedHashSet.add(str3);
        return linkedHashSet;
    }

    public static ArrayList e(int i2, String str) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(str);
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory() && i2 < 3) {
                        NativeLibLoader nativeLibLoader = a;
                        String absolutePath = file2.getAbsolutePath();
                        nativeLibLoader.getClass();
                        arrayList.addAll(e(i2 + 1, absolutePath));
                    } else if (b.contains(nbr.m(file2))) {
                        arrayList.add(file2.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static Set f() {
        return (Set) q.c.getValue();
    }

    public static boolean g(NativeLib nativeLib) {
        if (k != SoLoaderState.INITIALIZED) {
            Set f2 = f();
            if (!(f2 instanceof Collection) || !f2.isEmpty()) {
                Iterator it = f2.iterator();
                while (it.hasNext()) {
                    if (new File((String) it.next(), nativeLib.j()).exists()) {
                    }
                }
            }
        }
        try {
            return SoLoader.getLibraryPath(nativeLib.j()) != null;
        } catch (Exception unused) {
            if (n) {
                Set f3 = f();
                if (!(f3 instanceof Collection) || !f3.isEmpty()) {
                    Iterator it2 = f3.iterator();
                    while (it2.hasNext()) {
                        if (new File((String) it2.next(), nativeLib.j()).exists()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static void h(Context context, CpuType cpuType, b bVar, boolean z, boolean z2) {
        i = bVar;
        if (d) {
            return;
        }
        synchronized (e) {
            if (d) {
                return;
            }
            o = z2;
            a.getClass();
            m = Preference.j().getBoolean("had_problems_with_system_load", false);
            n = !z;
            f = cpuType;
            j = context.getPackageManager();
            h = context.getApplicationContext();
            if (!n && m) {
                try {
                    o();
                } catch (Exception e2) {
                    bVar.c(new NativeLibLoadException("Error during initialization SoLoader", e2), cpuType);
                }
            }
            if (n && m) {
                a.getClass();
                i();
            }
            d = true;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static void i() {
        SoLoaderState soLoaderState = k;
        SoLoaderState soLoaderState2 = SoLoaderState.UNINITIALIZED;
        if (soLoaderState != soLoaderState2) {
            return;
        }
        synchronized (l) {
            if (k != soLoaderState2) {
                return;
            }
            try {
                a.getClass();
                o();
                k = SoLoaderState.INITIALIZED;
            } catch (Throwable th) {
                NativeLibLoadException nativeLibLoadException = new NativeLibLoadException("Error during initialization SoLoader", th);
                b bVar = i;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.c(nativeLibLoadException, f);
                k = SoLoaderState.FAILED;
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static boolean j(NativeLibLoader nativeLibLoader, NativeLib nativeLib) {
        if (!d) {
            nativeLibLoader.getClass();
            return l(nativeLib, true);
        }
        nativeLibLoader.getClass();
        if (!n) {
            if (k != SoLoaderState.INITIALIZED) {
                return l(nativeLib, true);
            }
            try {
                SoLoader.loadLibrary(nativeLib.l());
                return true;
            } catch (Throwable th) {
                b bVar = i;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.b(th, f, nativeLib.k(), "soloader");
                return l(nativeLib, true);
            }
        }
        SoLoaderState soLoaderState = k;
        SoLoaderState soLoaderState2 = SoLoaderState.INITIALIZED;
        if (soLoaderState == soLoaderState2) {
            if (!k(nativeLib, true) && !l(nativeLib, true)) {
                return false;
            }
        } else if (!l(nativeLib, true)) {
            if (k != SoLoaderState.UNINITIALIZED) {
                return false;
            }
            i();
            if (k != soLoaderState2) {
                return false;
            }
            boolean k2 = k(nativeLib, true);
            if (k2) {
                a.getClass();
                n(true);
            }
            if (!k2) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(NativeLib nativeLib, boolean z) {
        try {
            SoLoader.loadLibrary(nativeLib.l());
            return true;
        } catch (Throwable th) {
            if (!z) {
                return false;
            }
            b bVar = i;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(th, f, nativeLib.k(), "soloader");
            return false;
        }
    }

    @SuppressLint({"CheckResult"})
    public static boolean l(NativeLib nativeLib, boolean z) {
        try {
            System.loadLibrary(nativeLib.l());
            return true;
        } catch (UnsatisfiedLinkError e2) {
            boolean z2 = false;
            if (z) {
                new s0(new tv50(z2)).r0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new lir(new kir(1, nativeLib, e2), 1), new z33(new f(L.a), 2));
            }
            return false;
        }
    }

    public static String m() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Context context = h;
        if (context == null) {
            context = null;
        }
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/lib-main");
        arrayList.add(sb.toString());
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && str.length() > 0) {
            g5g.y(drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6), arrayList);
        }
        try {
            List c0 = drm0.c0((String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) NativeLibLoader.class.getClassLoader(), null), new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : c0) {
                if (!drm0.D((String) obj, ".apk", false)) {
                    arrayList2.add(obj);
                }
            }
            g5g.y(arrayList2, arrayList);
        } catch (Exception e2) {
            b bVar = i;
            (bVar != null ? bVar : null).a(new NativeLibLoadException("Error during accessing classloader's LdLibraryPath", e2));
        }
        if (Process.is64Bit()) {
            arrayList.add("/system/lib64");
            arrayList.add("/vendor/lib64");
        } else {
            arrayList.add("/system/lib");
            arrayList.add("/vendor/lib");
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        return j5g.g0(arrayList3, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, 62);
    }

    public static void n(boolean z) {
        if (m || Preference.j().getBoolean("had_problems_with_system_load", false)) {
            return;
        }
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putBoolean("had_problems_with_system_load", true);
        aVar.apply();
        if (z) {
            new AggregateEventBuilder(AggregateEventKey.PROBLEM_WITH_SYSTEM_LOAD).q();
        }
    }

    public static void o() {
        if (!o) {
            Context context = h;
            SoLoader.init(context != null ? context : null, false);
        } else {
            g gVar = new g();
            Context context2 = h;
            SoLoader.init(context2 != null ? context2 : null, gVar);
        }
    }

    public final Set<String> d(Context context, boolean z) {
        Iterable iterable;
        String packageName = context.getPackageName();
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < 10; i2++) {
            hashSet.add(new File("/data/app/" + packageName + '-' + i2));
        }
        if (z) {
            hashSet.add(new File(go9.b("/data/user/0/", packageName)));
            hashSet.add(new File(go9.b("/data/data/", packageName)));
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            List<String[]> l2 = e43.l(new String[]{applicationInfo.sourceDir, applicationInfo.publicSourceDir}, applicationInfo.splitSourceDirs, applicationInfo.splitPublicSourceDirs);
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : l2) {
                if (strArr == null || (iterable = rl3.u0(strArr)) == null) {
                    iterable = EmptyList.b;
                }
                g5g.y(iterable, arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File parentFile = new File((String) it.next()).getParentFile();
                if (parentFile != null) {
                    hashSet.add(parentFile);
                }
            }
        }
        try {
            return rli0.C(dli0.d(new ulp0(new ulp0(rli0.j(new i5g(hashSet), c.b), d.b), new e(this))));
        } catch (Throwable unused) {
            return EmptySet.b;
        }
    }

    /* compiled from: NativeLibLoader.kt */
    /* loaded from: classes17.dex */
    public static final class g implements ExternalSoMapping {
        @Override // com.facebook.soloader.ExternalSoMapping
        public final String mapLibName(String str) {
            return null;
        }

        @Override // com.facebook.soloader.ExternalSoMapping
        public final void invokeJniOnload(String str) {
        }
    }
}
