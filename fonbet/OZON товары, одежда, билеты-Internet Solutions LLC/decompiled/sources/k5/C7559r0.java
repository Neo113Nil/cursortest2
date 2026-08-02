package k5;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7559r0 extends D0<Integer> {

    /* renamed from: k, reason: collision with root package name */
    private static final Mm0.e f70838k = Mm0.e.Compromised;

    /* renamed from: l, reason: collision with root package name */
    private static final long f70839l = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: m, reason: collision with root package name */
    static final String[] f70840m = {C7563s0.a(new byte[]{3, -39, 62, -26, 54, 2, 103, 50, 34, 60, 32, 88, -96, 101, -28, -11, 50, 106, 45, 54, 82, -121, -55, -116, -95, -13, -32, -97, 41, 7, -48, -85}), C7563s0.a(new byte[]{-45, 57, -106, 12, 60, 110, -12, -5, 32, -3, 72, -27, -88, -60, -23, 75}), C7563s0.a(new byte[]{16, 110, 9, -65, -56, -30, 27, 30, 53, -127, -36, -19, 17, -11, 71, 115}), C7563s0.a(new byte[]{-87, -5, 83, 124, 109, 98, 39, -21, 99, -23, -91, 34, -9, -36, 5, -6, 25, 115, 70, -65, 81, 16, -118, -88, 57, 123, 36, -98, 43, -40, -96, 106}), C7563s0.a(new byte[]{-83, 66, 28, -25, -10, 6, 79, 17, -4, -13, -87, 87, -47, -7, -2, -103}), C7563s0.a(new byte[]{-125, 63, 81, -37, 99, 80, -105, -15, -34, 72, 40, 32, 81, 118, -33, -67, -1, -73, -6, -121, -127, -80, -45, 31, -80, 71, 60, 109, 43, 87, 7, -52}), C7563s0.a(new byte[]{31, 88, 65, -119, -69, -38, 97, 51, -49, -100, 49, -110, 9, -99, 105, -30, 0, -5, -115, -69, -91, -56, -66, 83, 76, -118, 54, 10, 2, -68, 97, -48}), C7563s0.a(new byte[]{-56, 35, 86, -36, -54, -78, 27, -39, -19, 113, -76, 54, -126, 30, 86, 18, 19, -93, -43, 51, -56, 75, -61, 97, -8, -122, 30, 8, -122, -74, 124, -61}), C7563s0.a(new byte[]{11, 109, -31, 38, -77, 97, 12, 20, Byte.MAX_VALUE, 37, 38, 8, -45, 93, 20, -99, 2, -28, -109, -91, -84, 38, 62, 112, -79, -2, 25, -45, -79, 64, 3, 118}), C7563s0.a(new byte[]{-108, 55, -41, -40, -71, -38, 31, -28, 92, -82, 80, 9, 78, 5, 60, -37, 100, 57, 15, 23, 62, -35, 66, -14, 70, 55, 4, 49, -2, -69, -6, 64}), C7563s0.a(new byte[]{38, 88, 75, 39, -35, 47, 99, -33, -126, 10, -111, -78, 76, -94, -95, -57}), C7563s0.a(new byte[]{21, -67, 125, -12, 6, 126, -123, 30, 64, -111, 57, 17, 59, -33, -85, 98}), C7563s0.a(new byte[]{-94, 83, 96, -13, 121, 4, -115, 87, -60, -16, -112, 94, -9, -26, 82, 66, 62, Byte.MAX_VALUE, -126, -81, 109, 47, -7, 78, 25, 32, 88, -49, -75, -29, 82, 22, -42, -49, -14, 79, 108, 99, 11, -111, -11, -92, 16, -100, -63, -63, -11, -73}), C7563s0.a(new byte[]{69, -95, -30, -23, -30, -92, 123, -57, 37, 84, 81, -75, 4, -4, -75, -59, -51, 41, 99, 65, 50, -29, 32, 0, -101, -18, 119, -22, 88, -17, -27, -78}), C7563s0.a(new byte[]{-48, -22, -24, -115, -51, 103, 48, 57, -97, -53, -93, -37, 26, -84, -76, 76}), C7563s0.a(new byte[]{18, 51, -35, 12, -70, -22, 125, 118, 59, -13, 54, 99, -59, -32, 22, 69}), C7563s0.a(new byte[]{122, -75, -11, 51, -82, -107, -104, -2, 114, -26, 118, 39, 63, 105, 47, -30})};

    /* renamed from: n, reason: collision with root package name */
    static final String f70841n = C7563s0.a(new byte[]{-119, 80, -111, 74, -8, -86, -114, 13, -45, 14, -71, 108, 49, 28, 16, 59});

    /* renamed from: o, reason: collision with root package name */
    static final String f70842o = C7563s0.a(new byte[]{119, 46, -125, -99, 6, -101, 66, 116, -82, -93, -115, 41, 116, -87, -9, 59});

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f70843p = {C7563s0.a(new byte[]{66, 54, -12, 63, -112, -100, -10, 15, 52, -13, -120, 89, 84, 38, 9, -114}), C7563s0.a(new byte[]{105, -20, -30, -111, 58, 42, 104, 37, 29, 85, -118, 13, 109, 116, 18, 3}), C7563s0.a(new byte[]{102, 105, 77, 8, 56, 99, 48, 15, -67, 5, -12, 56, -18, -59, 111, 116, 120, -51, -34, 111, 86, 50, 83, 91, 91, -65, -52, 84, 3, -28, -72, 44}), C7563s0.a(new byte[]{-59, -69, -85, 85, -60, -105, 71, 3, 72, -41, 32, 118, 2, 74, -80, -3, -41, Byte.MAX_VALUE, 67, 14, -36, 123, 17, 102, 116, 54, -83, -24, 57, 92, 104, -48}), C7563s0.a(new byte[]{86, 110, 56, -107, 87, 67, 81, 119, 44, 97, Byte.MIN_VALUE, 120, 64, 111, 110, -117}), C7563s0.a(new byte[]{-116, -14, 64, 124, -94, -122, 58, 66, -15, -121, 42, -67, -97, 0, 85, -64}), C7563s0.a(new byte[]{-65, 79, 105, -19, 67, 57, -56, 99, 119, 74, -69, 9, 84, 51, 121, -115})};

    /* renamed from: q, reason: collision with root package name */
    private static int f70844q = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f70845e;

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap f70846f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f70847g;

    /* renamed from: h, reason: collision with root package name */
    private final Mm0.d f70848h;

    /* renamed from: i, reason: collision with root package name */
    private final R2 f70849i;

    /* renamed from: j, reason: collision with root package name */
    private final G0 f70850j;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'default' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: k5.r0$a */
    static final class a {

        /* renamed from: default, reason: not valid java name */
        public static final a f23default;

        /* renamed from: do, reason: not valid java name */
        public static final a f24do;

        /* renamed from: instanceof, reason: not valid java name */
        private static final /* synthetic */ a[] f25instanceof;

        /* renamed from: final, reason: not valid java name */
        private final String f26final;

        /* renamed from: transient, reason: not valid java name */
        private final String f27transient;

        static {
            String a11 = C7563s0.a(new byte[]{-96, -38, -48, -60, 29, 123, -100, 3, -30, 50, -77, 91, -84, 95, -56, 16, 28, 107, -26, 6, 83, -120, 47, 16, -19, 94, -38, 22, -50, 20, 90, -108});
            String str = C7559r0.f70841n;
            a aVar = new a("SearchSuBinary", 0, a11, str);
            f23default = aVar;
            a aVar2 = new a("SearchSuBinaryX", 1, C7563s0.a(new byte[]{-115, -62, 82, 118, 88, -72, 96, -113, -69, -12, 23, -115, 89, -41, 101, -77, 114, 79, 42, 88, -31, -93, -74, 124, 71, -103, Byte.MAX_VALUE, -111, -74, -85, 70, -68}), str);
            f24do = aVar2;
            f25instanceof = new a[]{aVar, aVar2};
        }

        private a(String str, int i11, String str2, String str3) {
            this.f27transient = str2;
            this.f26final = str3;
        }

        @NonNull
        static ArrayList b(@NonNull a aVar) {
            Process process;
            ArrayList arrayList = new ArrayList(0);
            try {
                process = Runtime.getRuntime().exec(new String[]{aVar.f27transient, aVar.f26final});
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                process = null;
            }
            L2.b(process);
            return arrayList;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25instanceof.clone();
        }

        public final String a() {
            return this.f27transient;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5.r0$b */
    enum b {
        TwiceZygoteInit(true, C7563s0.a(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73}), 0),
        Xposed(false, C7563s0.a(new byte[]{78, -81, 51, -90, -125, -127, 57, 40, -22, 40, 85, -29, 115, -52, 88, 112}), 1),
        CydiaSubstrate(false, C7563s0.a(new byte[]{-101, 93, 66, 68, 63, -23, 57, 114, -90, -111, -29, 107, -14, 20, 112, 121}), 2);


        /* renamed from: default, reason: not valid java name */
        private final boolean f32default;

        /* renamed from: final, reason: not valid java name */
        private final String f33final;

        /* renamed from: transient, reason: not valid java name */
        @NonNull
        private final String f34transient;

        b(boolean z11, @NonNull String str, int i11) {
            this.f34transient = r2;
            this.f33final = str;
            this.f32default = z11;
        }

        static boolean a(@NonNull b bVar, @NonNull String str, String str2) {
            boolean equals = bVar.f32default ? str.equals(bVar.f34transient) : str.contains(bVar.f34transient);
            return (equals || str2 == null || bVar.f33final.isEmpty()) ? equals : str2.toLowerCase(Locale.ROOT).contains(bVar.f33final);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: k5.r0$c */
    static final class c {

        /* renamed from: default, reason: not valid java name */
        private static final /* synthetic */ c[] f35default;

        /* renamed from: final, reason: not valid java name */
        public static final c f36final;

        /* renamed from: transient, reason: not valid java name */
        public static final c f37transient;

        static {
            c cVar = new c("WorkerThread", 0);
            f37transient = cVar;
            c cVar2 = new c("MainThread", 1);
            f36final = cVar2;
            f35default = new c[]{cVar, cVar2};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f35default.clone();
        }
    }

    C7559r0(@NonNull Context context, @NonNull Mm0.d dVar, @NonNull R2 r22, @NonNull G0 g02) {
        super(f70838k);
        this.f70845e = new Handler(Looper.getMainLooper());
        this.f70846f = new ConcurrentHashMap(c.values().length);
        this.f70847g = context;
        this.f70848h = dVar;
        this.f70849i = r22;
        this.f70850j = g02;
    }

    @NonNull
    private static EnumSet<b> A() {
        EnumSet<b> noneOf = EnumSet.noneOf(b.class);
        try {
            throw new Exception(C7563s0.a(new byte[]{87, 87, 85, 49, 88, -101, -113, 117, 16, 118, -83, 58, -66, 75, -30, 27, -27, 15, 69, 48, 53, 41, 79, 56, -110, -25, -49, -96, 126, 3, -121, -114, -2, -111, 16, -53, 66, 100, 3, 68, -77, -8, -33, -92, -75, -1, -1, 81}));
        } catch (Exception e11) {
            int i11 = 0;
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                String fileName = stackTraceElement.getFileName();
                for (b bVar : b.values()) {
                    if (b.a(bVar, className, fileName)) {
                        if (bVar.equals(b.TwiceZygoteInit)) {
                            i11++;
                            if (i11 > 1) {
                                noneOf.add(bVar);
                            }
                        } else {
                            noneOf.add(bVar);
                        }
                    }
                }
            }
            return noneOf;
        }
    }

    private boolean B() {
        R2 r22 = this.f70849i;
        boolean a11 = r22.a();
        if (a11) {
            return a11;
        }
        boolean c11 = r22.c(this.f70847g);
        if (!c11) {
            Mm0.f fVar = Mm0.f.Critical;
            String a12 = C7563s0.a(new byte[]{80, 77, -33, 100, 72, 113, -109, 41, -31, -124, 93, -66, 117, 109, 33, -59, -126, 33, 7, 11, 24, -43, 88, -65, 35, -119, -124, -25, -122, -119, -40, 53, 10, -95, -92, 2, 114, -125, -119, -106, -106, 31, -81, 63, -30, -47, -108, -117});
            this.f70850j.a(f70838k, fVar, a12, 5);
        }
        return c11;
    }

    public static /* synthetic */ void w(C7559r0 c7559r0, c cVar, CountDownLatch countDownLatch) {
        c7559r0.f70846f.put(cVar, A());
        countDownLatch.countDown();
    }

    private void y(int i11) {
        if (i11 == -1) {
            this.f70850j.a(f70838k, Mm0.f.Critical, C7563s0.a(new byte[]{6, 87, 92, -116, -100, -83, -80, 27, 30, 45, -24, -114, -83, 117, 10, -2, 71, -70, 14, Byte.MAX_VALUE, -40, 71, 89, 92, -88, 70, 61, 74, -15, -55, 122, -12}), 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x006b, code lost:
    
        if (r8 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        r7 = r7 | 2;
     */
    @Override // k5.D0
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Integer s() throws D1 {
        Mm0.d dVar;
        E.C c11;
        R2 r22;
        com.google.common.primitives.f fVar;
        int i11;
        zone.bi.mobile.fingerprint.impl.cs.b bVar;
        int i12 = 0;
        String str = Build.TAGS;
        int i13 = (str == null || !str.contains(f70842o)) ? 0 : 1;
        String[] strArr = f70840m;
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            dVar = this.f70848h;
            c11 = null;
            r22 = this.f70849i;
            if (i14 < length) {
                if (Files.exists(Paths.get(strArr[i14], new String[0]), new LinkOption[0])) {
                    break;
                }
                i14++;
            } else if (Mm0.d.Deep.equals(dVar)) {
                if (B()) {
                    r22.a();
                    fVar = new com.google.common.primitives.f();
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    R2 a11 = L2.a();
                    i11 = a11.a() ? a11.b().b() : -1;
                } else {
                    i11 = 0;
                }
                y(i11);
            }
        }
        if (f70844q < 0) {
            a[] aVarArr = {a.f23default, a.f24do};
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    break;
                }
                a aVar = aVarArr[i15];
                if (Files.exists(Paths.get(aVar.a(), new String[0]), new LinkOption[0])) {
                    f70844q = !a.b(aVar).isEmpty() ? 1 : 0;
                    break;
                }
                i15++;
            }
        }
        if (f70844q > 0) {
            i13 |= 4;
        }
        if (Mm0.d.Deep.equals(dVar)) {
            int myPid = Process.myPid();
            HashSet hashSet = new HashSet();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(String.format(Locale.ROOT, C7563s0.a(new byte[]{-95, -19, Byte.MIN_VALUE, -97, 108, -10, -24, -43, Byte.MIN_VALUE, -88, -46, 29, 94, 37, -97, 30}), Integer.valueOf(myPid)))));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.endsWith(".so") && !readLine.endsWith(".jar")) {
                        }
                        hashSet.add(readLine.substring(readLine.lastIndexOf(C7563s0.a(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34})) + 1));
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (IOException unused) {
            }
            Iterator it = hashSet.iterator();
            loop3: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null) {
                    String trim = str2.toLowerCase(Locale.ROOT).trim();
                    for (String str3 : f70843p) {
                        if (trim.contains(str3)) {
                            i13 |= 32;
                            break loop3;
                        }
                    }
                }
            }
            boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
            ConcurrentHashMap concurrentHashMap = this.f70846f;
            if (!isCurrentThread) {
                c cVar = c.f37transient;
                if (((EnumSet) concurrentHashMap.get(cVar)) == null) {
                    concurrentHashMap.put(cVar, A());
                }
            }
            final c cVar2 = c.f36final;
            EnumSet enumSet = (EnumSet) concurrentHashMap.get(cVar2);
            Handler handler = this.f70845e;
            if (enumSet == null) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                handler.post(new Runnable() { // from class: k5.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7559r0.w(C7559r0.this, cVar2, countDownLatch);
                    }
                });
                try {
                    countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused2) {
                }
            }
            Iterator it2 = concurrentHashMap.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((EnumSet) it2.next()).isEmpty()) {
                    i13 |= 64;
                    break;
                }
            }
            if (B()) {
                r22.a();
                bVar = new zone.bi.mobile.fingerprint.impl.cs.b(this.f70847g);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                int[] iArr = {0};
                handler.post(new P70.e(bVar, iArr, countDownLatch2, 1));
                try {
                    if (!countDownLatch2.await(f70839l, TimeUnit.MILLISECONDS)) {
                        this.f70850j.a(f70838k, Mm0.f.Warning, C7563s0.a(new byte[]{Byte.MIN_VALUE, -110, -65, 99, 116, 116, 118, -47, 30, -78, -67, 9, 115, 68, -87, 78, -127, 25, 118, -80, -9, -124, -71, -107, -6, -57, 78, -91, 117, 4, -52, 13, 33, -117, -57, -87, -59, 90, 64, -58, -27, 49, -97, 26, -78, -28, -83, 126, 8, -56, -34, 69, 63, -102, 59, 5, 51, -78, 124, -17, 0, 91, -31, 104}), 7);
                    }
                } catch (InterruptedException unused3) {
                }
                y(iArr[0]);
                if (iArr[0] == 2) {
                    i13 |= UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
            if (B()) {
                r22.a();
                c11 = new E.C();
            }
            if (c11 != null) {
                R2 a12 = L2.a();
                i12 = a12.a() ? a12.b().c() : -1;
            }
            y(i12);
            if (i12 == 8) {
                i13 |= 256;
            }
        }
        return Integer.valueOf(i13);
    }
}
