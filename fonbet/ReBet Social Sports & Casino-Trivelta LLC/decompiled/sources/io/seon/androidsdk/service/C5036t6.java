package io.seon.androidsdk.service;

import android.app.Instrumentation;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.TrafficStats;
import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;
import android.util.Base64;
import i3.C4527h;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.seon.androidsdk.service.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5036t6 extends AbstractC4950j {

    /* renamed from: e, reason: collision with root package name */
    public Context f53497e;

    /* renamed from: g, reason: collision with root package name */
    public SeonNT f53498g = null;

    /* renamed from: n, reason: collision with root package name */
    public M6 f53499n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final L4 f53496o = new L4(4000);

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f53495i = {"first_api_level", "is_espresso_connected", "is_hiddenapi_modified", "profile_administrators", "is_app_cloned", "package_name", "package_signatures"};

    public static void l0(OutputStream outputStream, byte[] bArr) {
        ByteBuffer allocate;
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            byte[] bArr3 = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % 4]);
            }
            if (length <= 125) {
                allocate = ByteBuffer.allocate(length + 6);
                allocate.put((byte) -126);
                allocate.put((byte) (length | 128));
            } else if (length <= 65535) {
                allocate = ByteBuffer.allocate(length + 8);
                allocate.put((byte) -126);
                allocate.put((byte) -2);
                allocate.putShort((short) length);
            } else {
                allocate = ByteBuffer.allocate(length + 14);
                allocate.put((byte) -126);
                allocate.put((byte) -1);
                allocate.putLong(length);
            }
            allocate.put(bArr2);
            allocate.put(bArr3);
            outputStream.write(allocate.array());
            outputStream.flush();
        } catch (Exception unused) {
        }
    }

    public final ArrayList A0() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.R5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList h02;
                h02 = C5036t6.this.h0();
                return h02;
            }
        });
    }

    public final BigInteger B0() {
        return U0().f53068h.f53190f;
    }

    public final Boolean C0() {
        return (Boolean) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.I5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Boolean i02;
                i02 = C5036t6.this.i0();
                return i02;
            }
        });
    }

    public final BigInteger D0() {
        return U0().f53067g.f53190f;
    }

    public final KeyDescription$SecurityLevelEnum E0() {
        return KeyDescription$SecurityLevelEnum.get((Integer) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.g6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Integer j02;
                j02 = C5036t6.this.j0();
                return j02;
            }
        }));
    }

    public final /* synthetic */ String F0() {
        return this.f53497e.getPackageName().trim();
    }

    public final Integer G0() {
        return (Integer) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.U5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Integer k02;
                k02 = C5036t6.this.k0();
                return k02;
            }
        });
    }

    public final ArrayList H0() {
        return U0().f53067g.f53187c;
    }

    public final String I0() {
        return (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.e6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String n02;
                n02 = C5036t6.this.n0();
                return n02;
            }
        });
    }

    public final ArrayList J0() {
        return U0().f53067g.f53188d;
    }

    public final ArrayList K0() {
        final ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = this.f53497e.getPackageManager();
            for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.media.action.VIDEO_CAPTURE"), 0)) {
                Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.O5
                    @Override // java.lang.Runnable
                    public final void run() {
                        arrayList.add(resolveInfo.activityInfo.name);
                    }
                };
                AtomicInteger atomicInteger = V.f53166a;
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
            for (final ResolveInfo resolveInfo2 : packageManager.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 0)) {
                Runnable runnable2 = new Runnable() { // from class: io.seon.androidsdk.service.P5
                    @Override // java.lang.Runnable
                    public final void run() {
                        arrayList.add(resolveInfo2.activityInfo.name);
                    }
                };
                AtomicInteger atomicInteger2 = V.f53166a;
                try {
                    runnable2.run();
                } catch (Throwable unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        return arrayList;
    }

    public final ArrayList L() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.J5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList J02;
                J02 = C5036t6.this.J0();
                return J02;
            }
        });
    }

    public final Map L0() {
        C4946i3 c4946i3 = U0().f53073m;
        c4946i3.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("crt_iss", c4946i3.f53356a);
        hashMap.put("mfr", c4946i3.f53357b);
        hashMap.put("ent", c4946i3.f53358c);
        hashMap.put("add", c4946i3.f53359d);
        return hashMap;
    }

    public final List M() {
        ArrayList arrayList = new ArrayList();
        try {
            List<ComponentName> activeAdmins = ((DevicePolicyManager) this.f53497e.getSystemService("device_policy")).getActiveAdmins();
            Objects.requireNonNull(activeAdmins);
            Iterator<ComponentName> it = activeAdmins.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getPackageName());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final BigInteger M0() {
        return (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.K5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger p02;
                p02 = C5036t6.this.p0();
                return p02;
            }
        });
    }

    public final Map N() {
        return (Map) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.o6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Map L02;
                L02 = C5036t6.this.L0();
                return L02;
            }
        });
    }

    public final AttestationGenerator$RootCertIssuer N0() {
        return U0().f53061a;
    }

    public final AttestationGenerator$RootCertIssuer O() {
        return (AttestationGenerator$RootCertIssuer) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.V5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                AttestationGenerator$RootCertIssuer N02;
                N02 = C5036t6.this.N0();
                return N02;
            }
        });
    }

    public final RootOfTrust$DeviceLockState O0() {
        W0 w02;
        W0 w03;
        C4947i4 c4947i4;
        C4947i4 c4947i42;
        try {
            w02 = U0().f53068h;
            w03 = U0().f53067g;
        } catch (Exception unused) {
        }
        if (w02 != null && (c4947i42 = w02.f53186b) != null) {
            return c4947i42.f53362c.booleanValue() ? RootOfTrust$DeviceLockState.LOCKED_HW : RootOfTrust$DeviceLockState.UNLOCKED_HW;
        }
        if (w03 != null && (c4947i4 = w03.f53186b) != null) {
            return c4947i4.f53362c.booleanValue() ? RootOfTrust$DeviceLockState.LOCKED_SW : RootOfTrust$DeviceLockState.UNLOCKED_SW;
        }
        if (U0().f53072l.booleanValue() && u0().equals("ONEPLUS_SUPPORTED")) {
            Iterator it = U0().f53071k.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).contains("java.security.ProviderException")) {
                    return RootOfTrust$DeviceLockState.UNLOCKED_SW;
                }
            }
        }
        return RootOfTrust$DeviceLockState.ERROR;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: Exception -> 0x006d, TRY_LEAVE, TryCatch #0 {Exception -> 0x006d, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0024, B:9:0x0043, B:11:0x0046, B:13:0x004b, B:21:0x0029), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:3:0x0006, B:5:0x000c, B:7:0x0024, B:9:0x0043, B:11:0x0046, B:13:0x004b, B:21:0x0029), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List P() {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 28) {
            signatureArr = this.f53497e.getPackageManager().getPackageInfo(this.f53497e.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (signatureArr != null) {
                }
                return null;
            }
            signatureArr = null;
            if (signatureArr != null) {
            }
            return null;
        }
        signingInfo = this.f53497e.getPackageManager().getPackageInfo(this.f53497e.getPackageName(), 134217728).signingInfo;
        if (signingInfo != null) {
            signatureArr = signingInfo.getApkContentsSigners();
            if (signatureArr != null && signatureArr.length > 0) {
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    arrayList.add(Base64.encodeToString(messageDigest.digest(), 0).trim());
                }
                return arrayList;
            }
            return null;
        }
        signatureArr = null;
        if (signatureArr != null) {
            while (r5 < r3) {
            }
            return arrayList;
        }
        return null;
    }

    public final ArrayList P0() {
        return U0().f53067g.f53185a;
    }

    public final ArrayList Q() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.H5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList P02;
                P02 = C5036t6.this.P0();
                return P02;
            }
        });
    }

    public final Integer Q0() {
        return (Integer) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.l6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Integer r02;
                r02 = C5036t6.this.r0();
                return r02;
            }
        });
    }

    public final ArrayList R() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.S5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList R02;
                R02 = C5036t6.this.R0();
                return R02;
            }
        });
    }

    public final ArrayList R0() {
        return U0().f53068h.f53185a;
    }

    public final String S() {
        String str = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.L5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String T02;
                T02 = C5036t6.this.T0();
                return T02;
            }
        });
        return str != null ? str : (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.M5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String V02;
                V02 = C5036t6.this.V0();
                return V02;
            }
        });
    }

    public final String S0() {
        Instrumentation instrumentation;
        try {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                Field declaredField2 = cls.getDeclaredField("mInstrumentation");
                declaredField2.setAccessible(true);
                instrumentation = (Instrumentation) declaredField2.get(obj);
            } catch (Exception e10) {
                V.j("Instr", e10);
                instrumentation = null;
            }
            if (instrumentation != null) {
                return instrumentation.getClass().getName();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String T() {
        String str = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.Z5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String X02;
                X02 = C5036t6.this.X0();
                return X02;
            }
        });
        return str != null ? str : (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.a6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String Z02;
                Z02 = C5036t6.this.Z0();
                return Z02;
            }
        });
    }

    public final String T0() {
        return U0().f53068h.f53186b.f53363d;
    }

    public final RootOfTrust$VerifiedBootStateEnum U() {
        BigInteger bigInteger = (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.i6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger b12;
                b12 = C5036t6.this.b1();
                return b12;
            }
        });
        return bigInteger != null ? RootOfTrust$VerifiedBootStateEnum.get(bigInteger) : RootOfTrust$VerifiedBootStateEnum.get((BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.k6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger d12;
                d12 = C5036t6.this.d1();
                return d12;
            }
        }));
    }

    public final M6 U0() {
        if (this.f53499n == null) {
            this.f53499n = AbstractC4998p.c();
        }
        return this.f53499n;
    }

    public final Boolean V() {
        try {
            if (!X().booleanValue() && !a0().booleanValue()) {
                Iterator it = ((ArrayList) M()).iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).contains("oasisfeng.island")) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String V0() {
        return U0().f53067g.f53186b.f53363d;
    }

    public final Boolean W() {
        boolean isManagedProfile;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return null;
            }
            isManagedProfile = ((UserManager) this.f53497e.getSystemService("user")).isManagedProfile();
            return Boolean.valueOf(isManagedProfile);
        } catch (Exception unused) {
            return null;
        }
    }

    public final KeyDescription$SecurityLevelEnum W0() {
        return (KeyDescription$SecurityLevelEnum) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.b6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                KeyDescription$SecurityLevelEnum t02;
                t02 = C5036t6.this.t0();
                return t02;
            }
        });
    }

    public final Boolean X() {
        return (Boolean) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.n6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Boolean f12;
                f12 = C5036t6.this.f1();
                return f12;
            }
        });
    }

    public final String X0() {
        return U0().f53068h.f53186b.f53361b;
    }

    public final Boolean Y() {
        Instrumentation instrumentation;
        boolean z10 = true;
        try {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                Field declaredField2 = cls.getDeclaredField("mInstrumentation");
                declaredField2.setAccessible(true);
                instrumentation = (Instrumentation) declaredField2.get(obj);
            } catch (Exception e10) {
                V.j("Instr", e10);
                instrumentation = null;
            }
            if (instrumentation == null || !instrumentation.getClass().getSimpleName().contains("JUnit")) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Integer Y0() {
        return (Integer) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.Q5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                Integer v02;
                v02 = C5036t6.this.v0();
                return v02;
            }
        });
    }

    public final Boolean Z() {
        try {
            boolean z10 = true;
            if (Settings.Global.getInt(this.f53497e.getContentResolver(), "hidden_api_policy") != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final String Z0() {
        return U0().f53067g.f53186b.f53361b;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53497e = c4878a.a();
        this.f53368b = c4878a;
        Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.g5
            @Override // java.lang.Runnable
            public final void run() {
                C5036t6.this.d0();
            }
        };
        AtomicInteger atomicInteger = V.f53166a;
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        try {
            new Runnable() { // from class: io.seon.androidsdk.service.r5
                @Override // java.lang.Runnable
                public final void run() {
                    C5036t6.this.e0();
                }
            }.run();
        } catch (Throwable unused2) {
        }
    }

    public final Boolean a0() {
        try {
            ArrayList h12 = h1();
            ArrayList L10 = L();
            String g12 = g1();
            List P10 = P();
            boolean z10 = (h12 == null || h12.isEmpty() || h12.contains("UNKNOWN") || h12.contains("UnknownPackage")) ? false : true;
            boolean z11 = (L10 == null || L10.isEmpty()) ? false : true;
            boolean z12 = (g12 == null || g12.isEmpty()) ? false : true;
            boolean z13 = (P10 == null || ((ArrayList) P10).isEmpty()) ? false : true;
            if (!z10 || !z11 || !z12 || !z13) {
                return Boolean.FALSE;
            }
            Iterator it = ((ArrayList) P10).iterator();
            boolean z14 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator it2 = L10.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (str.equals((String) it2.next())) {
                        z14 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf((h12.contains(g12) && z14) ? false : true);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Map a1() {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = new ArrayList();
            U4 u42 = new U4(Collections.reverseOrder());
            int i10 = 0;
            for (Integer num : u42.keySet()) {
                String str = (String) u42.get(num);
                AtomicInteger atomicInteger = V.f53166a;
                try {
                    Class.forName(str);
                    if (i10 < num.intValue()) {
                        i10 = num.intValue();
                    }
                } catch (Exception unused) {
                    if (i10 > num.intValue()) {
                        arrayList.add(num);
                    }
                }
            }
            hashMap.put(C4527h.f48087o, Integer.valueOf(i10));
            hashMap.put(X9.m.f13664a, arrayList);
        } catch (Exception unused2) {
        }
        return hashMap;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("attest_cert_signature", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.C5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.O();
            }
        }));
        hashMap.put("attest_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.a5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.G0();
            }
        }));
        hashMap.put("attest_sec_level", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.m5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.E0();
            }
        }));
        hashMap.put("attest_km_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.q5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.Y0();
            }
        }));
        hashMap.put("attest_km_level", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.s5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.W0();
            }
        }));
        hashMap.put("attest_challenge", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.t5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.y0();
            }
        }));
        hashMap.put("attest_time", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.M0();
            }
        }));
        hashMap.put("attest_packages", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.v5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.h1();
            }
        }));
        hashMap.put("attest_signatures", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.L();
            }
        }));
        hashMap.put("attest_is_device_unlocked", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.x5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.O0();
            }
        }));
        hashMap.put("attest_ver_boot_state", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.N5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.U();
            }
        }));
        hashMap.put("attest_ver_boot_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Y5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.S();
            }
        }));
        hashMap.put("attest_ver_boot_key", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.j6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.T();
            }
        }));
        hashMap.put("attest_os_version", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.p6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.e1();
            }
        }));
        hashMap.put("attest_os_patch_level", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.q6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.c1();
            }
        }));
        hashMap.put("attest_cert_ids", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.r6
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.w0();
            }
        }));
        hashMap.put("attest_sw_tags", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.W4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.Q();
            }
        }));
        hashMap.put("attest_hw_tags", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.X4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.R();
            }
        }));
        hashMap.put("attest_ca_pub_hash", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Y4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.I0();
            }
        }));
        hashMap.put("attest_rt_error_flag", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Z4
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.C0();
            }
        }));
        hashMap.put("attest_logs", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.b5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.A0();
            }
        }));
        hashMap.put("attestation_capability", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.c5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.u0();
            }
        }));
        hashMap.put("is_applisto_detected", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.d5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.X();
            }
        }));
        hashMap.put("is_packageinfo_inconsistent", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.e5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.a0();
            }
        }));
        hashMap.put("is_system_user", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.f5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.c0();
            }
        }));
        hashMap.put("is_work_profile", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.h5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.W();
            }
        }));
        hashMap.put("camera_apps", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.i5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.K0();
            }
        }));
        hashMap.put("is_rooted_by_prop", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.j5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.b0();
            }
        }));
        hashMap.put("instr_class", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.k5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.S0();
            }
        }));
        hashMap.put("lvl_inf", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.l5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.a1();
            }
        }));
        hashMap.put("frd_scan", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.n5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.s0();
            }
        }));
        hashMap.put("ptr_int", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.o5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                Integer q02;
                q02 = C5036t6.this.q0();
                return q02;
            }
        }));
        hashMap.put("provision", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.p5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.N();
            }
        }));
        return hashMap;
    }

    public final Boolean b0() {
        try {
            C4890b3 c4890b3 = this.f53368b.b().f53308f;
            RootOfTrust$DeviceLockState O02 = O0();
            return Boolean.valueOf((O02.equals(RootOfTrust$DeviceLockState.UNLOCKED_HW) || O02.equals(RootOfTrust$DeviceLockState.UNLOCKED_SW)) && c4890b3.z().equals(OSProbe$OSEnum.BOOTLOADER_STATE_LOCKED));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final BigInteger b1() {
        return U0().f53068h.f53186b.f53360a;
    }

    public final Boolean c0() {
        try {
            return Boolean.valueOf(((UserManager) this.f53497e.getSystemService("user")).isSystemUser());
        } catch (Exception unused) {
            return null;
        }
    }

    public final BigInteger c1() {
        BigInteger bigInteger = (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.c6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger x02;
                x02 = C5036t6.this.x0();
                return x02;
            }
        });
        return bigInteger != null ? bigInteger : (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.d6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger z02;
                z02 = C5036t6.this.z0();
                return z02;
            }
        });
    }

    public final /* synthetic */ void d0() {
        this.f53498g = new SeonNT(this.f53497e);
    }

    public final BigInteger d1() {
        return U0().f53067g.f53186b.f53360a;
    }

    public final /* synthetic */ void e0() {
        this.f53497e.getSharedPreferences("seonLocalPreferences", 0);
    }

    public final BigInteger e1() {
        BigInteger bigInteger = (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.W5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger B02;
                B02 = C5036t6.this.B0();
                return B02;
            }
        });
        return bigInteger != null ? bigInteger : (BigInteger) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.X5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                BigInteger D02;
                D02 = C5036t6.this.D0();
                return D02;
            }
        });
    }

    public final ArrayList f0() {
        return U0().f53069i;
    }

    public final Boolean f1() {
        ArrayList arrayList = new ArrayList();
        try {
            for (ActivityInfo activityInfo : this.f53497e.getPackageManager().getPackageInfo(this.f53497e.getApplicationContext().getPackageName(), 1).activities) {
                arrayList.add(activityInfo.name);
            }
        } catch (Exception unused) {
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).contains("applisto.appcloner")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final String g0() {
        return U0().f53066f;
    }

    public final String g1() {
        return (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.m6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String F02;
                F02 = C5036t6.this.F0();
                return F02;
            }
        });
    }

    public final ArrayList h0() {
        return U0().f53071k;
    }

    public final ArrayList h1() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.T5
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList H02;
                H02 = C5036t6.this.H0();
                return H02;
            }
        });
    }

    public final Boolean i0() {
        return U0().f53072l;
    }

    public final Integer j0() {
        return U0().f53063c;
    }

    public final Integer k0() {
        return U0().f53062b;
    }

    public final String n0() {
        return U0().f53070j;
    }

    public final BigInteger p0() {
        return U0().f53067g.f53189e;
    }

    public final Integer q0() {
        int i10;
        SeonNT seonNT = this.f53498g;
        seonNT.getClass();
        try {
            i10 = seonNT.d();
        } catch (Throwable unused) {
            i10 = -1;
        }
        return Integer.valueOf(i10);
    }

    public final /* synthetic */ Integer r0() {
        String n10 = V.n(this.f53497e, "ro.product.first_api_level");
        Objects.requireNonNull(n10);
        return Integer.valueOf(n10);
    }

    public final Map s0() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            TrafficStats.setThreadStatsTag(325411);
            Integer[] numArr = {27042, 65000};
            byte[] decode = Base64.decode("bAEBAQQAAAABAAAAVQAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcAAXUAAAMBcwAEAAAAUGluZwAAAAAeAAAA", 0);
            byte[] decode2 = Base64.decode("bAEAAQgAAAACAAAAawAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcABWF7c3Z9AAAAAAAAAwFzABIAAABFbnVtZXJhdGVQcm9jZXNzZXMAAAAAAAAAAAAAAAAAAA==", 0);
            for (int i10 = 0; i10 < 2; i10++) {
                Integer num = numArr[i10];
                int intValue = num.intValue();
                try {
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress("127.0.0.1", intValue), 100);
                        socket.setSoTimeout(100);
                        OutputStream outputStream = socket.getOutputStream();
                        InputStream inputStream = socket.getInputStream();
                        String format = String.format(Locale.ENGLISH, "GET /ws HTTP/1.1\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: HdKNfOsC40gRHC1BvpQR0Q==\r\nSec-WebSocket-Version: 13\r\nHost: 127.0.0.1:%d\r\nUser-Agent: Frida/16.6.0\r\n\r\n", num);
                        Charset charset = StandardCharsets.US_ASCII;
                        outputStream.write(format.getBytes(charset));
                        outputStream.flush();
                        byte[] bArr = new byte[1024];
                        int read = inputStream.read(bArr);
                        if (read > 0 && new String(bArr, 0, read, charset).contains("mChJsQDTW0vQTC9txP6Lk/0lK5s=")) {
                            arrayList.add(num);
                            byte[] bArr2 = new byte[10240];
                            l0(outputStream, decode);
                            l0(outputStream, decode2);
                            int read2 = inputStream.read(bArr2);
                            if (read2 > 0) {
                                String str = new String(Arrays.copyOfRange(bArr2, 0, read2), StandardCharsets.UTF_8);
                                String str2 = new String(Base64.decode("YW5kcm9pZA==", 0));
                                String str3 = new String(Base64.decode("ZnJpZGE=", 0));
                                if (!V.l(str, str2)) {
                                    if (V.l(str, str3)) {
                                    }
                                }
                                arrayList2.add(num);
                            }
                        }
                        socket.close();
                    } catch (Throwable th2) {
                        try {
                            socket.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        } catch (Exception unused2) {
        }
        hashMap.put("ws", arrayList);
        hashMap.put("f", arrayList2);
        return hashMap;
    }

    public final KeyDescription$SecurityLevelEnum t0() {
        return KeyDescription$SecurityLevelEnum.get(U0().f53065e);
    }

    public final String u0() {
        int i10 = Build.VERSION.SDK_INT;
        Integer Q02 = Q0();
        return (Q02 == null || Q02.intValue() >= 24) ? (Q02 != null || i10 >= 28) ? (!Build.MANUFACTURER.contains("OnePlus") || Q02 == null || Q02.intValue() < 24) ? "SUPPORTED" : "ONEPLUS_SUPPORTED" : "UNSURE" : "SOFTWARE_ONLY";
    }

    public final Integer v0() {
        return U0().f53064d;
    }

    public final ArrayList w0() {
        return (ArrayList) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.h6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                ArrayList f02;
                f02 = C5036t6.this.f0();
                return f02;
            }
        });
    }

    public final BigInteger x0() {
        return U0().f53068h.f53191g;
    }

    public final String y0() {
        return (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.f6
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                String g02;
                g02 = C5036t6.this.g0();
                return g02;
            }
        });
    }

    public final BigInteger z0() {
        return U0().f53067g.f53191g;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        HashMap hashMap = new HashMap();
        this.f53499n = (M6) f53496o.a(new N4() { // from class: io.seon.androidsdk.service.y5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return AbstractC4998p.c();
            }
        });
        hashMap.put("first_api_level", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.z5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.Q0();
            }
        }));
        hashMap.put("is_espresso_connected", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.A5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.Y();
            }
        }));
        hashMap.put("is_hiddenapi_modified", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.B5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.Z();
            }
        }));
        hashMap.put("profile_administrators", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.D5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.M();
            }
        }));
        hashMap.put("is_app_cloned", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.E5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.V();
            }
        }));
        hashMap.put("package_name", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.F5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.g1();
            }
        }));
        hashMap.put("package_signatures", AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.G5
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5036t6.this.P();
            }
        }));
        return hashMap;
    }
}
