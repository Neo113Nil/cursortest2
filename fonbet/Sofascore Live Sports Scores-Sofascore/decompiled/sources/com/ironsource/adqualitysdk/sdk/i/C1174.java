package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Debug;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1174 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String[] f3668 = {StringFog.decrypt("59v90+GWi9yr3vCI9NSXnK7N9cPhlJTWusn51Q==\n", "yL+cp4C557M=\n"), StringFog.decrypt("ZTJVyP+/hUkpN1iT6v2ZCTgzGtrs+Y1HZCVRzuj1mw==\n", "SlY0vJ6Q6SY=\n"), StringFog.decrypt("QvigQ91/epoL+a1E3SBt0B/9oVI=\n", "bYvEILwNHrU=\n"), StringFog.decrypt("hXJgBV/5Gi7Jd21eSrsGbsxkaBVf+xcmz3h1X025\n", "qhYBcT7WdkE=\n")};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f3667 = {StringFog.decrypt("7I4KqiBOC6DphUCqIEUZoPCbS6sqSFPn5phQuSNAGPw=\n", "iOsk2E8sfY4=\n"), StringFog.decrypt("C2RswCVgiScHd3/ALWGeIAtlbopmaIc+BXFunA==\n", "ZBYL7kgF5lA=\n"), StringFog.decrypt("Aa3gfgcOfWUduuN+Bhxjawm69Q==\n", "bt+HUGt9DQo=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f3666 = {StringFog.decrypt("Wpb/VMHcnfoTl+dK0M6fpx7K3lfaypWxN5fvQ9Lc3r8Ulw==\n", "deWGJ7W58NU=\n"), StringFog.decrypt("DeZAgHf4bZpO/Fvcb/RizVL6SpZnwmHHVrtKnA==\n", "IpU58wOdALU=\n"), StringFog.decrypt("ZOWCWGBNhRcn/5kdIAeEUSnui0RnTYxnKuSPBWdH\n", "S5b7KxQo6Dg=\n")};

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String[] f3665 = {StringFog.decrypt("CSUiax7w68BHMSlxGw==\n", "JlZAAnDfxa0=\n"), StringFog.decrypt("rGHmx9PJjKjsYOE=\n", "gxKErr3moss=\n"), StringFog.decrypt("x9ZVI7hWximKnVk2vhDUJg==\n", "6LI0V9l5p00=\n"), StringFog.decrypt("DxdupGPRdJtCXGK/Zot5mlM=\n", "IHMP0AL+Ff8=\n"), StringFog.decrypt("1jvbGk1y33OBKssHFnrTO5A7yQ==\n", "+UiiaTkXslw=\n")};

    /* JADX WARN: Code restructure failed: missing block: B:177:0x00cb, code lost:
    
        if (r2 == null) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5 A[EDGE_INSN: B:129:0x01f5->B:89:0x01f5 BREAK  A[LOOP:5: B:81:0x01d9->B:126:0x01f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183 A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #3 {all -> 0x01c9, blocks: (B:74:0x017b, B:130:0x0183, B:137:0x01c1, B:141:0x01c5, B:142:0x01c8, B:132:0x01a1, B:134:0x01aa), top: B:73:0x017b, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x016b A[EDGE_INSN: B:148:0x016b->B:69:0x016b BREAK  A[LOOP:4: B:61:0x014f->B:145:0x0168], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x014b A[EDGE_INSN: B:150:0x014b->B:60:0x014b BREAK  A[LOOP:3: B:53:0x0137->B:149:0x0148], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x011b A[EDGE_INSN: B:157:0x011b->B:48:0x011b BREAK  A[LOOP:2: B:41:0x00ff->B:154:0x0118], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0204  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1176 m664(Context context) {
        BufferedReader bufferedReader;
        int length;
        int i;
        int length2;
        int i2;
        int length3;
        int i3;
        boolean z;
        int length4;
        int i4;
        Iterator it;
        BufferedReader bufferedReader2;
        String lowerCase;
        ArrayList arrayList = new ArrayList();
        try {
            Process exec = Runtime.getRuntime().exec(StringFog.decrypt("Uqs=\n", "ItgenCmmjo4=\n"));
            bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            do {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        exec.waitFor();
                        break;
                    }
                    lowerCase = readLine.toLowerCase();
                    if (lowerCase.contains(StringFog.decrypt("ePocVtCpg9ds/hBA\n", "Hoh1MrGE8LI=\n"))) {
                        break;
                    }
                } finally {
                }
            } while (!lowerCase.contains(StringFog.decrypt("QDQG2v4=\n", "JkZvvp8w6uI=\n")));
            bufferedReader2.close();
            arrayList.add(10);
        } catch (Throwable unused) {
        }
        Socket socket = null;
        try {
            bufferedReader2 = new BufferedReader(new FileReader(StringFog.decrypt("CvVqskWMGJRJ4zewR9MY\n", "JYUY3Saja/E=\n")));
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        while (true) {
            try {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 != null) {
                    String lowerCase2 = readLine2.toLowerCase();
                    if (lowerCase2.contains(StringFog.decrypt("RoDqxLM=\n", "IPKDoNJsDqA=\n")) || lowerCase2.contains(StringFog.decrypt("NPPcLHkQ1a8378E=\n", "UoG1SBg9tMg=\n")) || lowerCase2.contains(StringFog.decrypt("9eQBTmQdEeT38Q1e\n", "k5ZoKgUwdoU=\n")) || lowerCase2.contains(StringFog.decrypt("4YeChPrwwJ4=\n", "je7g4oiZpP8=\n"))) {
                        arrayList.add(11);
                        break;
                    }
                }
            } catch (Throwable unused3) {
            }
            try {
                bufferedReader.close();
                break;
            } catch (Throwable unused4) {
            }
        }
        try {
            Socket socket2 = new Socket();
            try {
                socket2.connect(new InetSocketAddress(StringFog.decrypt("8L1YbsyZqNnw\n", "wY9vQPy3mPc=\n"), 27042), 100);
                try {
                    socket2.close();
                } catch (Throwable unused5) {
                }
                arrayList.add(12);
            } catch (Throwable unused6) {
                socket = socket2;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable unused7) {
                    }
                }
                String[] strArr = f3668;
                length = strArr.length;
                boolean z2 = false;
                i = 0;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                }
                Class.forName(StringFog.decrypt("Q6poj2AphF1GoSKPYCKWXV+/KY5qL9wrV6A1mGsJgBpDqCM=\n", "J89G/Q9L8nM=\n"));
                arrayList.add(15);
                PackageManager packageManager = context.getPackageManager();
                String[] strArr2 = f3667;
                length2 = strArr2.length;
                i2 = 0;
                while (true) {
                    if (i2 < length2) {
                    }
                }
                String[] strArr3 = f3666;
                length3 = strArr3.length;
                i3 = 0;
                while (true) {
                    if (i3 < length3) {
                    }
                    i3++;
                }
                if (Debug.isDebuggerConnected()) {
                }
                if (Debug.isDebuggerConnected()) {
                }
                if (z) {
                }
                String[] strArr4 = f3665;
                length4 = strArr4.length;
                i4 = 0;
                while (true) {
                    if (i4 < length4) {
                    }
                    i4++;
                }
                it = arrayList.iterator();
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                while (it.hasNext()) {
                }
                return new C1176(z2, z3, z4, z5, arrayList);
            }
        } catch (Throwable unused8) {
        }
        String[] strArr5 = f3668;
        length = strArr5.length;
        boolean z22 = false;
        i = 0;
        while (true) {
            if (i < length) {
                break;
            }
            if (new File(strArr5[i]).exists()) {
                arrayList.add(13);
                break;
            }
            i++;
        }
        try {
            Class.forName(StringFog.decrypt("Q6poj2AphF1GoSKPYCKWXV+/KY5qL9wrV6A1mGsJgBpDqCM=\n", "J89G/Q9L8nM=\n"));
            arrayList.add(15);
        } catch (ClassNotFoundException unused9) {
        }
        PackageManager packageManager2 = context.getPackageManager();
        String[] strArr22 = f3667;
        length2 = strArr22.length;
        i2 = 0;
        while (true) {
            if (i2 < length2) {
                break;
            }
            try {
                packageManager2.getPackageInfo(strArr22[i2], 0);
                arrayList.add(16);
                break;
            } catch (Throwable unused10) {
                i2++;
            }
        }
        String[] strArr32 = f3666;
        length3 = strArr32.length;
        i3 = 0;
        while (true) {
            if (i3 < length3) {
                break;
            }
            if (new File(strArr32[i3]).exists()) {
                arrayList.add(17);
                break;
            }
            i3++;
        }
        if (Debug.isDebuggerConnected()) {
            arrayList.add(18);
        }
        try {
            if (Debug.isDebuggerConnected()) {
                Process exec2 = Runtime.getRuntime().exec(StringFog.decrypt("CtAicnB0TA8f2nhmZ3lJSArUNG5n\n", "bbVWAgIbPC8=\n"));
                bufferedReader2 = new BufferedReader(new InputStreamReader(exec2.getInputStream()));
                try {
                    String readLine3 = bufferedReader2.readLine();
                    exec2.waitFor();
                    if (readLine3 != null) {
                        if (readLine3.trim().equals(StringFog.decrypt("9Q==\n", "xDBZUmkxaOk=\n"))) {
                            z = true;
                            bufferedReader2.close();
                        }
                    }
                    z = false;
                    bufferedReader2.close();
                } finally {
                }
            } else {
                z = true;
            }
        } catch (Throwable unused11) {
            z = false;
        }
        if (z) {
            arrayList.add(19);
        }
        String[] strArr42 = f3665;
        length4 = strArr42.length;
        i4 = 0;
        while (true) {
            if (i4 < length4) {
                break;
            }
            if (new File(strArr42[i4]).exists()) {
                arrayList.add(20);
                break;
            }
            i4++;
        }
        it = arrayList.iterator();
        boolean z32 = false;
        boolean z42 = false;
        boolean z52 = false;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 10 && intValue <= 14) {
                z22 = true;
            } else if (intValue >= 15 && intValue <= 17) {
                z32 = true;
            } else if (intValue == 18 || intValue == 19) {
                z42 = true;
            } else if (intValue == 20) {
                z52 = true;
            }
        }
        return new C1176(z22, z32, z42, z52, arrayList);
    }
}
