package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.כ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0452 implements InterfaceC1129 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1306;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String[] f1305 = {StringFog.decrypt("p+nJ\n", "05ynm4lJ7e4=\n"), StringFog.decrypt("j2so\n", "/xtYycuSHw8=\n"), StringFog.decrypt("HEPHL50=\n", "dTO0Sv56zuc=\n")};

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String[] f1304 = {StringFog.decrypt("71FoLw==\n", "myQGH5Bcc+g=\n"), StringFog.decrypt("nlWbSA==\n", "7iXreLB3DVg=\n")};

    public C0452(Context context) {
        this.f1306 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    public final String getName() {
        return StringFog.decrypt("xZN503nqinLCmGrBZOiTXcWC\n", "q/YNpBaY4TQ=\n");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|1|2|3|(31:121|122|(1:8)|9|10|(1:12)(1:(4:95|(1:(2:97|(2:100|101)(1:99))(1:103))|102|93))|13|14|(2:16|(22:18|(1:20)|21|22|23|(1:86)|26|27|28|(1:30)(2:61|(1:63)(2:64|(1:66)(2:67|(1:69)(2:70|(1:72)(2:73|(1:75)(2:76|(1:78)(2:79|(1:81)(1:82))))))))|31|32|(1:58)|35|36|(1:38)(4:49|(2:52|50)|53|54)|39|40|(1:42)|43|44|45))|91|(0)|21|22|23|(1:25)(2:84|86)|26|27|28|(0)(0)|31|32|(1:34)(2:56|58)|35|36|(0)(0)|39|40|(0)|43|44|45)|6|(0)|9|10|(0)(0)|13|14|(0)|91|(0)|21|22|23|(0)(0)|26|27|28|(0)(0)|31|32|(0)(0)|35|36|(0)(0)|39|40|(0)|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0069, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.C0452.f1305;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x006d, code lost:
    
        if (r8 >= r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0075, code lost:
    
        if (r5.startsWith(r6[r8]) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0081, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f8, code lost:
    
        r11 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("jZc=\n", "9uq2rq9V1UY=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ae, code lost:
    
        r11 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.StringFog.decrypt("QSIs6rw3OA==\n", "NExHhNNAVhU=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00cc, code lost:
    
        if (r6.trim().isEmpty() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #4 {Exception -> 0x009e, blocks: (B:14:0x0084, B:16:0x0092), top: B:13:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2 A[Catch: all -> 0x0162, TryCatch #3 {all -> 0x0162, blocks: (B:28:0x00d0, B:30:0x00e2, B:61:0x00ec, B:63:0x00f2, B:64:0x00fc, B:66:0x0102, B:67:0x010b, B:69:0x0111, B:70:0x011a, B:72:0x0120, B:73:0x0129, B:75:0x0130, B:76:0x0139, B:78:0x0140, B:79:0x0149, B:81:0x0150, B:82:0x0159), top: B:27:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0190 A[Catch: Exception -> 0x01ae, TryCatch #2 {Exception -> 0x01ae, blocks: (B:36:0x018a, B:38:0x0190, B:49:0x0193, B:50:0x0198, B:52:0x019e), top: B:35:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193 A[Catch: Exception -> 0x01ae, TryCatch #2 {Exception -> 0x01ae, blocks: (B:36:0x018a, B:38:0x0190, B:49:0x0193, B:50:0x0198, B:52:0x019e), top: B:35:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d A[Catch: Exception -> 0x018a, TryCatch #5 {Exception -> 0x018a, blocks: (B:32:0x016a, B:56:0x017d, B:58:0x0183), top: B:31:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[Catch: all -> 0x0162, TryCatch #3 {all -> 0x0162, blocks: (B:28:0x00d0, B:30:0x00e2, B:61:0x00ec, B:63:0x00f2, B:64:0x00fc, B:66:0x0102, B:67:0x010b, B:69:0x0111, B:70:0x011a, B:72:0x0120, B:73:0x0129, B:75:0x0130, B:76:0x0139, B:78:0x0140, B:79:0x0149, B:81:0x0150, B:82:0x0159), top: B:27:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00be A[Catch: Exception -> 0x00cf, TryCatch #1 {Exception -> 0x00cf, blocks: (B:23:0x00ab, B:84:0x00be, B:86:0x00c4), top: B:22:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0043 A[Catch: Exception -> 0x0084, LOOP:1: B:93:0x0043->B:112:?, LOOP_LABEL: LOOP:1: B:93:0x0043->B:112:?, LOOP_START, TryCatch #7 {Exception -> 0x0084, blocks: (B:10:0x003c, B:93:0x0043, B:95:0x0049, B:97:0x005d, B:99:0x0066, B:104:0x0069, B:107:0x006f), top: B:9:0x003c }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0350 mo221() {
        boolean z;
        boolean z2;
        String decrypt;
        List list;
        Enumeration<NetworkInterface> networkInterfaces;
        TelephonyManager telephonyManager;
        String simCountryIso;
        ConnectivityManager connectivityManager;
        TelephonyManager telephonyManager2;
        String property;
        Enumeration<NetworkInterface> networkInterfaces2;
        ConnectivityManager connectivityManager2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ArrayList arrayList = new ArrayList();
        try {
            connectivityManager2 = (ConnectivityManager) this.f1306.getSystemService(StringFog.decrypt("FfDrIhFEPAMA9vE1\n", "dp+FTHQnSGo=\n"));
        } catch (Throwable unused) {
        }
        if (connectivityManager2 != null && (activeNetwork = connectivityManager2.getActiveNetwork()) != null && (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) != null) {
            z = !networkCapabilities.hasCapability(15);
            if (z) {
                arrayList.add(30);
            }
            networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces2 == null) {
                loop1: while (networkInterfaces2.hasMoreElements()) {
                    String lowerCase = networkInterfaces2.nextElement().getName().toLowerCase();
                    String[] strArr = f1304;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (lowerCase.equals(strArr[i])) {
                            break loop1;
                        }
                        i++;
                    }
                    arrayList.add(31);
                }
            }
            property = System.getProperty(StringFog.decrypt("++WWgCECzA3r6KqffAY=\n", "k5Hi8A9yvmI=\n"));
            if (property != null) {
                if (!property.trim().isEmpty()) {
                    z2 = true;
                    if (z2) {
                        arrayList.add(32);
                    }
                    telephonyManager2 = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("KSoK5Wg=\n", "WUJliw0Wn4Y=\n"));
                    if (telephonyManager2 != null && (r6 = telephonyManager2.getNetworkOperatorName()) != null) {
                    }
                    String str = null;
                    connectivityManager = (ConnectivityManager) this.f1306.getSystemService(StringFog.decrypt("tbL5zgNA52SgtOPZ\n", "1t2XoGYjkw0=\n"));
                    if (connectivityManager == null) {
                        decrypt = StringFog.decrypt("8u3AtzWUEA==\n", "h4Or2Vrjftk=\n");
                    } else {
                        Network activeNetwork2 = connectivityManager.getActiveNetwork();
                        if (activeNetwork2 == null) {
                            decrypt = StringFog.decrypt("HGCGpg==\n", "cg/ow9In2KY=\n");
                        } else {
                            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork2);
                            decrypt = networkCapabilities2 == null ? StringFog.decrypt("BkBQjo1Ljg==\n", "cy474OI84Io=\n") : networkCapabilities2.hasTransport(1) ? StringFog.decrypt("gIn5eA==\n", "9+CfETSlCFI=\n") : networkCapabilities2.hasTransport(0) ? StringFog.decrypt("kyvUGKiiQ4s=\n", "8E64dN3OIvk=\n") : networkCapabilities2.hasTransport(3) ? StringFog.decrypt("KIsOH+2A3F4=\n", "Tf9mep/uuSo=\n") : networkCapabilities2.hasTransport(2) ? StringFog.decrypt("5x0L5OjCWM3t\n", "hXF+gZytN7k=\n") : networkCapabilities2.hasTransport(4) ? StringFog.decrypt("OD+p\n", "Tk/HPd+UkZI=\n") : StringFog.decrypt("6WJ7wyU=\n", "hhYTplePKEM=\n");
                        }
                    }
                    telephonyManager = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("+0P2vQg=\n", "iyuZ022Wd7g=\n"));
                    if (telephonyManager == null && (simCountryIso = telephonyManager.getSimCountryIso()) != null) {
                        simCountryIso.trim().getClass();
                    }
                    networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    if (networkInterfaces == null) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        while (networkInterfaces.hasMoreElements()) {
                            arrayList2.add(networkInterfaces.nextElement().getName());
                        }
                        list = arrayList2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(StringFog.decrypt("bAMZTIE=\n", "BXBPPO+GO8E=\n"), z);
                    jSONObject.put(StringFog.decrypt("aVgfAVLT9zZ+TQ4=\n", "Bz1rdj2hnGI=\n"), decrypt);
                    jSONObject.put(StringFog.decrypt("r4JHkBJzUMGpn3GLGn5b56I=\n", "xvEX4n0LKYI=\n"), z2);
                    jSONObject.put(StringFog.decrypt("VabrcwL1oIFYtQ==\n", "PceYMGOH0ug=\n"), str != null);
                    jSONObject.put(StringFog.decrypt("+Exbt1DRolf0YUCnTMM=\n", "kSIv0iK3wzQ=\n"), list.size());
                    String decrypt2 = jSONObject.toString();
                    return new C0350(arrayList.isEmpty(), arrayList, decrypt2, null);
                }
            }
            z2 = false;
            if (z2) {
            }
            telephonyManager2 = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("KSoK5Wg=\n", "WUJliw0Wn4Y=\n"));
            if (telephonyManager2 != null) {
            }
            String str2 = null;
            connectivityManager = (ConnectivityManager) this.f1306.getSystemService(StringFog.decrypt("tbL5zgNA52SgtOPZ\n", "1t2XoGYjkw0=\n"));
            if (connectivityManager == null) {
            }
            telephonyManager = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("+0P2vQg=\n", "iyuZ022Wd7g=\n"));
            if (telephonyManager == null) {
                simCountryIso.trim().getClass();
            }
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringFog.decrypt("bAMZTIE=\n", "BXBPPO+GO8E=\n"), z);
            jSONObject2.put(StringFog.decrypt("aVgfAVLT9zZ+TQ4=\n", "Bz1rdj2hnGI=\n"), decrypt);
            jSONObject2.put(StringFog.decrypt("r4JHkBJzUMGpn3GLGn5b56I=\n", "xvEX4n0LKYI=\n"), z2);
            jSONObject2.put(StringFog.decrypt("VabrcwL1oIFYtQ==\n", "PceYMGOH0ug=\n"), str2 != null);
            jSONObject2.put(StringFog.decrypt("+Exbt1DRolf0YUCnTMM=\n", "kSIv0iK3wzQ=\n"), list.size());
            String decrypt22 = jSONObject2.toString();
            return new C0350(arrayList.isEmpty(), arrayList, decrypt22, null);
        }
        z = false;
        if (z) {
        }
        networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces2 == null) {
        }
        property = System.getProperty(StringFog.decrypt("++WWgCECzA3r6KqffAY=\n", "k5Hi8A9yvmI=\n"));
        if (property != null) {
        }
        z2 = false;
        if (z2) {
        }
        telephonyManager2 = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("KSoK5Wg=\n", "WUJliw0Wn4Y=\n"));
        if (telephonyManager2 != null) {
        }
        String str22 = null;
        connectivityManager = (ConnectivityManager) this.f1306.getSystemService(StringFog.decrypt("tbL5zgNA52SgtOPZ\n", "1t2XoGYjkw0=\n"));
        if (connectivityManager == null) {
        }
        telephonyManager = (TelephonyManager) this.f1306.getSystemService(StringFog.decrypt("+0P2vQg=\n", "iyuZ022Wd7g=\n"));
        if (telephonyManager == null) {
        }
        networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
        }
        JSONObject jSONObject22 = new JSONObject();
        jSONObject22.put(StringFog.decrypt("bAMZTIE=\n", "BXBPPO+GO8E=\n"), z);
        jSONObject22.put(StringFog.decrypt("aVgfAVLT9zZ+TQ4=\n", "Bz1rdj2hnGI=\n"), decrypt);
        jSONObject22.put(StringFog.decrypt("r4JHkBJzUMGpn3GLGn5b56I=\n", "xvEX4n0LKYI=\n"), z2);
        jSONObject22.put(StringFog.decrypt("VabrcwL1oIFYtQ==\n", "PceYMGOH0ug=\n"), str22 != null);
        jSONObject22.put(StringFog.decrypt("+Exbt1DRolf0YUCnTMM=\n", "kSIv0iK3wzQ=\n"), list.size());
        String decrypt222 = jSONObject22.toString();
        return new C0350(arrayList.isEmpty(), arrayList, decrypt222, null);
    }
}
