package d30;

import J4.A;
import J4.u;
import J4.w;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import d30.InterfaceC6070a;
import e30.C6288a;
import e30.C6290c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.analytic.db.GraylogDatabase_Impl;

/* renamed from: d30.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6072c implements InterfaceC6070a {

    /* renamed from: a, reason: collision with root package name */
    private final GraylogDatabase_Impl f61100a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6288a> f61101b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.l<C6290c> f61102c;

    /* renamed from: d, reason: collision with root package name */
    private final A f61103d;

    /* renamed from: d30.c$a */
    final class a implements Callable<List<C6288a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f61104a;

        a(w wVar) {
            this.f61104a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<C6288a> call() throws Exception {
            w wVar;
            int i11;
            int i12;
            String string;
            int i13;
            int i14;
            String str;
            int i15;
            int i16;
            String str2;
            int i17;
            int i18;
            Integer num;
            int i19;
            int i21;
            String str3;
            Boolean valueOf;
            int i22;
            int i23;
            String string2;
            int i24;
            int i25;
            String string3;
            int i26;
            int i27;
            Boolean valueOf2;
            int i28;
            int i29;
            Boolean valueOf3;
            int i31;
            int i32;
            Boolean valueOf4;
            int i33;
            int i34;
            Boolean valueOf5;
            int i35;
            int i36;
            Boolean valueOf6;
            int i37;
            int i38;
            String string4;
            int i39;
            int i41;
            String string5;
            int i42;
            int i43;
            String string6;
            int i44;
            int i45;
            String string7;
            int i46;
            int i47;
            Boolean valueOf7;
            int i48;
            int i49;
            String string8;
            int i51;
            int i52;
            String string9;
            int i53;
            int i54;
            String string10;
            int i55;
            int i56;
            String string11;
            int i57;
            int i58;
            Boolean valueOf8;
            int i59;
            int i61;
            String string12;
            int i62;
            int i63;
            String string13;
            int i64;
            int i65;
            String string14;
            int i66;
            int i67;
            String string15;
            int i68;
            int i69;
            Integer valueOf9;
            int i71;
            int i72;
            String string16;
            int i73;
            int i74;
            Integer valueOf10;
            int i75;
            int i76;
            String string17;
            int i77;
            int i78;
            int i79;
            int i81;
            Boolean valueOf11;
            int i82;
            int i83;
            String str4;
            int i84;
            int i85;
            String str5;
            int i86;
            int i87;
            String str6;
            J4.s sVar = C6072c.this.f61100a;
            w wVar2 = this.f61104a;
            Cursor b11 = L4.b.b(sVar, wVar2, false);
            try {
                int b12 = L4.a.b(b11, "id");
                int b13 = L4.a.b(b11, "timestamp");
                int b14 = L4.a.b(b11, "message");
                int b15 = L4.a.b(b11, "serviceName");
                int b16 = L4.a.b(b11, "userId");
                int b17 = L4.a.b(b11, "uuid");
                int b18 = L4.a.b(b11, "appVersion");
                int b19 = L4.a.b(b11, "sessionId");
                int b21 = L4.a.b(b11, "tags");
                int b22 = L4.a.b(b11, "data");
                int b23 = L4.a.b(b11, "delay");
                int b24 = L4.a.b(b11, "tabId");
                int b25 = L4.a.b(b11, "webViewVersion");
                int b26 = L4.a.b(b11, ImagesContract.URL);
                wVar = wVar2;
                try {
                    int b27 = L4.a.b(b11, "assetUrl");
                    int b28 = L4.a.b(b11, "errorDescription");
                    int b29 = L4.a.b(b11, "errorCode");
                    int b31 = L4.a.b(b11, "status");
                    int b32 = L4.a.b(b11, "firstLaunch");
                    int b33 = L4.a.b(b11, "model");
                    int b34 = L4.a.b(b11, "manufacturer");
                    int b35 = L4.a.b(b11, "permPostNotification");
                    int b36 = L4.a.b(b11, "permCamera");
                    int b37 = L4.a.b(b11, "permAccessLocation");
                    int b38 = L4.a.b(b11, "permReadContacts");
                    int b39 = L4.a.b(b11, "permUseBiometric");
                    int b41 = L4.a.b(b11, "pushType");
                    int b42 = L4.a.b(b11, "pins");
                    int b43 = L4.a.b(b11, "sign");
                    int b44 = L4.a.b(b11, "pubKey");
                    int b45 = L4.a.b(b11, "result");
                    int b46 = L4.a.b(b11, "pinsType");
                    int b47 = L4.a.b(b11, "pinsHashes");
                    int b48 = L4.a.b(b11, "certsChain");
                    int b49 = L4.a.b(b11, "storeName");
                    int b51 = L4.a.b(b11, "needUpdate");
                    int b52 = L4.a.b(b11, "rustoreStatus");
                    int b53 = L4.a.b(b11, "gmsStatus");
                    int b54 = L4.a.b(b11, "ozonSdkStatus");
                    int b55 = L4.a.b(b11, "platformVersion");
                    int b56 = L4.a.b(b11, "barcodeRecognitionType");
                    int b57 = L4.a.b(b11, "barcodeRecognitionSource");
                    int b58 = L4.a.b(b11, "barcodeRecognitionAvailableTypes");
                    int b59 = L4.a.b(b11, "ozonIdSessionId");
                    int b61 = L4.a.b(b11, "vpn");
                    int b62 = L4.a.b(b11, "networkType");
                    int b63 = L4.a.b(b11, "clusterName");
                    int b64 = L4.a.b(b11, "regionName");
                    int b65 = L4.a.b(b11, "cityName");
                    int i88 = b26;
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        int i89 = b11.getInt(b12);
                        String string18 = b11.getString(b13);
                        String string19 = b11.getString(b14);
                        String string20 = b11.isNull(b15) ? null : b11.getString(b15);
                        String string21 = b11.getString(b16);
                        String string22 = b11.getString(b17);
                        String string23 = b11.getString(b18);
                        String string24 = b11.isNull(b19) ? null : b11.getString(b19);
                        String string25 = b11.isNull(b21) ? null : b11.getString(b21);
                        String string26 = b11.isNull(b22) ? null : b11.getString(b22);
                        Integer valueOf12 = b11.isNull(b23) ? null : Integer.valueOf(b11.getInt(b23));
                        String string27 = b11.isNull(b24) ? null : b11.getString(b24);
                        String string28 = b11.isNull(b25) ? null : b11.getString(b25);
                        int i91 = i88;
                        if (b11.isNull(i91)) {
                            int i92 = b27;
                            i11 = b12;
                            i12 = i92;
                            string = null;
                        } else {
                            int i93 = b27;
                            i11 = b12;
                            i12 = i93;
                            string = b11.getString(i91);
                        }
                        if (b11.isNull(i12)) {
                            int i94 = b28;
                            i13 = i12;
                            i14 = i94;
                            str = null;
                        } else {
                            String string29 = b11.getString(i12);
                            int i95 = b28;
                            i13 = i12;
                            i14 = i95;
                            str = string29;
                        }
                        if (b11.isNull(i14)) {
                            int i96 = b29;
                            i15 = i14;
                            i16 = i96;
                            str2 = null;
                        } else {
                            String string30 = b11.getString(i14);
                            int i97 = b29;
                            i15 = i14;
                            i16 = i97;
                            str2 = string30;
                        }
                        if (b11.isNull(i16)) {
                            int i98 = b31;
                            i17 = i16;
                            i18 = i98;
                            num = null;
                        } else {
                            Integer valueOf13 = Integer.valueOf(b11.getInt(i16));
                            int i99 = b31;
                            i17 = i16;
                            i18 = i99;
                            num = valueOf13;
                        }
                        if (b11.isNull(i18)) {
                            int i100 = b32;
                            i19 = i18;
                            i21 = i100;
                            str3 = null;
                        } else {
                            String string31 = b11.getString(i18);
                            int i101 = b32;
                            i19 = i18;
                            i21 = i101;
                            str3 = string31;
                        }
                        Integer valueOf14 = b11.isNull(i21) ? null : Integer.valueOf(b11.getInt(i21));
                        boolean z11 = true;
                        if (valueOf14 == null) {
                            int i102 = b33;
                            i22 = i21;
                            i23 = i102;
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf14.intValue() != 0);
                            int i103 = b33;
                            i22 = i21;
                            i23 = i103;
                        }
                        if (b11.isNull(i23)) {
                            int i104 = b34;
                            i24 = i23;
                            i25 = i104;
                            string2 = null;
                        } else {
                            string2 = b11.getString(i23);
                            int i105 = b34;
                            i24 = i23;
                            i25 = i105;
                        }
                        if (b11.isNull(i25)) {
                            int i106 = b35;
                            i26 = i25;
                            i27 = i106;
                            string3 = null;
                        } else {
                            string3 = b11.getString(i25);
                            int i107 = b35;
                            i26 = i25;
                            i27 = i107;
                        }
                        Integer valueOf15 = b11.isNull(i27) ? null : Integer.valueOf(b11.getInt(i27));
                        if (valueOf15 == null) {
                            int i108 = b36;
                            i28 = i27;
                            i29 = i108;
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf15.intValue() != 0);
                            int i109 = b36;
                            i28 = i27;
                            i29 = i109;
                        }
                        Integer valueOf16 = b11.isNull(i29) ? null : Integer.valueOf(b11.getInt(i29));
                        if (valueOf16 == null) {
                            int i110 = b37;
                            i31 = i29;
                            i32 = i110;
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf16.intValue() != 0);
                            int i111 = b37;
                            i31 = i29;
                            i32 = i111;
                        }
                        Integer valueOf17 = b11.isNull(i32) ? null : Integer.valueOf(b11.getInt(i32));
                        if (valueOf17 == null) {
                            int i112 = b38;
                            i33 = i32;
                            i34 = i112;
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf17.intValue() != 0);
                            int i113 = b38;
                            i33 = i32;
                            i34 = i113;
                        }
                        Integer valueOf18 = b11.isNull(i34) ? null : Integer.valueOf(b11.getInt(i34));
                        if (valueOf18 == null) {
                            int i114 = b39;
                            i35 = i34;
                            i36 = i114;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Boolean.valueOf(valueOf18.intValue() != 0);
                            int i115 = b39;
                            i35 = i34;
                            i36 = i115;
                        }
                        Integer valueOf19 = b11.isNull(i36) ? null : Integer.valueOf(b11.getInt(i36));
                        if (valueOf19 == null) {
                            int i116 = b41;
                            i37 = i36;
                            i38 = i116;
                            valueOf6 = null;
                        } else {
                            valueOf6 = Boolean.valueOf(valueOf19.intValue() != 0);
                            int i117 = b41;
                            i37 = i36;
                            i38 = i117;
                        }
                        if (b11.isNull(i38)) {
                            int i118 = b42;
                            i39 = i38;
                            i41 = i118;
                            string4 = null;
                        } else {
                            string4 = b11.getString(i38);
                            int i119 = b42;
                            i39 = i38;
                            i41 = i119;
                        }
                        if (b11.isNull(i41)) {
                            int i120 = b43;
                            i42 = i41;
                            i43 = i120;
                            string5 = null;
                        } else {
                            string5 = b11.getString(i41);
                            int i121 = b43;
                            i42 = i41;
                            i43 = i121;
                        }
                        if (b11.isNull(i43)) {
                            int i122 = b44;
                            i44 = i43;
                            i45 = i122;
                            string6 = null;
                        } else {
                            string6 = b11.getString(i43);
                            int i123 = b44;
                            i44 = i43;
                            i45 = i123;
                        }
                        if (b11.isNull(i45)) {
                            int i124 = b45;
                            i46 = i45;
                            i47 = i124;
                            string7 = null;
                        } else {
                            string7 = b11.getString(i45);
                            int i125 = b45;
                            i46 = i45;
                            i47 = i125;
                        }
                        Integer valueOf20 = b11.isNull(i47) ? null : Integer.valueOf(b11.getInt(i47));
                        if (valueOf20 == null) {
                            int i126 = b46;
                            i48 = i47;
                            i49 = i126;
                            valueOf7 = null;
                        } else {
                            valueOf7 = Boolean.valueOf(valueOf20.intValue() != 0);
                            int i127 = b46;
                            i48 = i47;
                            i49 = i127;
                        }
                        if (b11.isNull(i49)) {
                            int i128 = b47;
                            i51 = i49;
                            i52 = i128;
                            string8 = null;
                        } else {
                            string8 = b11.getString(i49);
                            int i129 = b47;
                            i51 = i49;
                            i52 = i129;
                        }
                        if (b11.isNull(i52)) {
                            int i130 = b48;
                            i53 = i52;
                            i54 = i130;
                            string9 = null;
                        } else {
                            string9 = b11.getString(i52);
                            int i131 = b48;
                            i53 = i52;
                            i54 = i131;
                        }
                        if (b11.isNull(i54)) {
                            int i132 = b49;
                            i55 = i54;
                            i56 = i132;
                            string10 = null;
                        } else {
                            string10 = b11.getString(i54);
                            int i133 = b49;
                            i55 = i54;
                            i56 = i133;
                        }
                        if (b11.isNull(i56)) {
                            int i134 = b51;
                            i57 = i56;
                            i58 = i134;
                            string11 = null;
                        } else {
                            string11 = b11.getString(i56);
                            int i135 = b51;
                            i57 = i56;
                            i58 = i135;
                        }
                        Integer valueOf21 = b11.isNull(i58) ? null : Integer.valueOf(b11.getInt(i58));
                        if (valueOf21 == null) {
                            int i136 = b52;
                            i59 = i58;
                            i61 = i136;
                            valueOf8 = null;
                        } else {
                            valueOf8 = Boolean.valueOf(valueOf21.intValue() != 0);
                            int i137 = b52;
                            i59 = i58;
                            i61 = i137;
                        }
                        if (b11.isNull(i61)) {
                            int i138 = b53;
                            i62 = i61;
                            i63 = i138;
                            string12 = null;
                        } else {
                            string12 = b11.getString(i61);
                            int i139 = b53;
                            i62 = i61;
                            i63 = i139;
                        }
                        if (b11.isNull(i63)) {
                            int i140 = b54;
                            i64 = i63;
                            i65 = i140;
                            string13 = null;
                        } else {
                            string13 = b11.getString(i63);
                            int i141 = b54;
                            i64 = i63;
                            i65 = i141;
                        }
                        if (b11.isNull(i65)) {
                            int i142 = b55;
                            i66 = i65;
                            i67 = i142;
                            string14 = null;
                        } else {
                            string14 = b11.getString(i65);
                            int i143 = b55;
                            i66 = i65;
                            i67 = i143;
                        }
                        if (b11.isNull(i67)) {
                            int i144 = b56;
                            i68 = i67;
                            i69 = i144;
                            string15 = null;
                        } else {
                            string15 = b11.getString(i67);
                            int i145 = b56;
                            i68 = i67;
                            i69 = i145;
                        }
                        if (b11.isNull(i69)) {
                            int i146 = b57;
                            i71 = i69;
                            i72 = i146;
                            valueOf9 = null;
                        } else {
                            valueOf9 = Integer.valueOf(b11.getInt(i69));
                            int i147 = b57;
                            i71 = i69;
                            i72 = i147;
                        }
                        if (b11.isNull(i72)) {
                            int i148 = b58;
                            i73 = i72;
                            i74 = i148;
                            string16 = null;
                        } else {
                            string16 = b11.getString(i72);
                            int i149 = b58;
                            i73 = i72;
                            i74 = i149;
                        }
                        if (b11.isNull(i74)) {
                            int i150 = b59;
                            i75 = i74;
                            i76 = i150;
                            valueOf10 = null;
                        } else {
                            valueOf10 = Integer.valueOf(b11.getInt(i74));
                            int i151 = b59;
                            i75 = i74;
                            i76 = i151;
                        }
                        if (b11.isNull(i76)) {
                            int i152 = b61;
                            i77 = i76;
                            i78 = i152;
                            string17 = null;
                        } else {
                            string17 = b11.getString(i76);
                            int i153 = b61;
                            i77 = i76;
                            i78 = i153;
                        }
                        Integer valueOf22 = b11.isNull(i78) ? null : Integer.valueOf(b11.getInt(i78));
                        if (valueOf22 == null) {
                            int i154 = b62;
                            i79 = i78;
                            i81 = i154;
                            valueOf11 = null;
                        } else {
                            if (valueOf22.intValue() == 0) {
                                z11 = false;
                            }
                            int i155 = b62;
                            i79 = i78;
                            i81 = i155;
                            valueOf11 = Boolean.valueOf(z11);
                        }
                        if (b11.isNull(i81)) {
                            int i156 = b63;
                            i82 = i81;
                            i83 = i156;
                            str4 = null;
                        } else {
                            String string32 = b11.getString(i81);
                            int i157 = b63;
                            i82 = i81;
                            i83 = i157;
                            str4 = string32;
                        }
                        if (b11.isNull(i83)) {
                            int i158 = b64;
                            i84 = i83;
                            i85 = i158;
                            str5 = null;
                        } else {
                            String string33 = b11.getString(i83);
                            int i159 = b64;
                            i84 = i83;
                            i85 = i159;
                            str5 = string33;
                        }
                        if (b11.isNull(i85)) {
                            int i160 = b65;
                            i86 = i85;
                            i87 = i160;
                            str6 = null;
                        } else {
                            String string34 = b11.getString(i85);
                            int i161 = b65;
                            i86 = i85;
                            i87 = i161;
                            str6 = string34;
                        }
                        C6288a c6288a = new C6288a(i89, string18, string19, string20, string21, string22, string23, string24, string25, string26, valueOf12, string27, string28, string, str, str2, num, str3, valueOf, string2, string3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, string4, string5, string6, string7, valueOf7, string8, string9, string10, string11, valueOf8, string12, string13, string14, string15, valueOf9, string16, valueOf10, string17, valueOf11, str4, str5, str6, b11.isNull(i87) ? null : b11.getString(i87));
                        int i162 = i87;
                        arrayList.add(c6288a);
                        b12 = i11;
                        b27 = i13;
                        b28 = i15;
                        b29 = i17;
                        b31 = i19;
                        b32 = i22;
                        b33 = i24;
                        b34 = i26;
                        b35 = i28;
                        b36 = i31;
                        b37 = i33;
                        b38 = i35;
                        b39 = i37;
                        b41 = i39;
                        b42 = i42;
                        b43 = i44;
                        b44 = i46;
                        b45 = i48;
                        b46 = i51;
                        b47 = i53;
                        b48 = i55;
                        b49 = i57;
                        b51 = i59;
                        b52 = i62;
                        b53 = i64;
                        b54 = i66;
                        b55 = i68;
                        b56 = i71;
                        b57 = i73;
                        b58 = i75;
                        b59 = i77;
                        b61 = i79;
                        b62 = i82;
                        b63 = i84;
                        b64 = i86;
                        b65 = i162;
                        i88 = i91;
                    }
                    b11.close();
                    wVar.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    b11.close();
                    wVar.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                wVar = wVar2;
            }
        }
    }

    /* renamed from: d30.c$b */
    final class b implements Callable<List<C6288a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f61106a;

        b(w wVar) {
            this.f61106a = wVar;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final List<C6288a> call() throws Exception {
            w wVar;
            int i11;
            int i12;
            String string;
            int i13;
            int i14;
            String str;
            int i15;
            int i16;
            String str2;
            int i17;
            int i18;
            Integer num;
            int i19;
            int i21;
            String str3;
            Boolean valueOf;
            int i22;
            int i23;
            String string2;
            int i24;
            int i25;
            String string3;
            int i26;
            int i27;
            Boolean valueOf2;
            int i28;
            int i29;
            Boolean valueOf3;
            int i31;
            int i32;
            Boolean valueOf4;
            int i33;
            int i34;
            Boolean valueOf5;
            int i35;
            int i36;
            Boolean valueOf6;
            int i37;
            int i38;
            String string4;
            int i39;
            int i41;
            String string5;
            int i42;
            int i43;
            String string6;
            int i44;
            int i45;
            String string7;
            int i46;
            int i47;
            Boolean valueOf7;
            int i48;
            int i49;
            String string8;
            int i51;
            int i52;
            String string9;
            int i53;
            int i54;
            String string10;
            int i55;
            int i56;
            String string11;
            int i57;
            int i58;
            Boolean valueOf8;
            int i59;
            int i61;
            String string12;
            int i62;
            int i63;
            String string13;
            int i64;
            int i65;
            String string14;
            int i66;
            int i67;
            String string15;
            int i68;
            int i69;
            Integer valueOf9;
            int i71;
            int i72;
            String string16;
            int i73;
            int i74;
            Integer valueOf10;
            int i75;
            int i76;
            String string17;
            int i77;
            int i78;
            int i79;
            int i81;
            Boolean valueOf11;
            int i82;
            int i83;
            String str4;
            int i84;
            int i85;
            String str5;
            int i86;
            int i87;
            String str6;
            J4.s sVar = C6072c.this.f61100a;
            w wVar2 = this.f61106a;
            Cursor b11 = L4.b.b(sVar, wVar2, false);
            try {
                int b12 = L4.a.b(b11, "id");
                int b13 = L4.a.b(b11, "timestamp");
                int b14 = L4.a.b(b11, "message");
                int b15 = L4.a.b(b11, "serviceName");
                int b16 = L4.a.b(b11, "userId");
                int b17 = L4.a.b(b11, "uuid");
                int b18 = L4.a.b(b11, "appVersion");
                int b19 = L4.a.b(b11, "sessionId");
                int b21 = L4.a.b(b11, "tags");
                int b22 = L4.a.b(b11, "data");
                int b23 = L4.a.b(b11, "delay");
                int b24 = L4.a.b(b11, "tabId");
                int b25 = L4.a.b(b11, "webViewVersion");
                int b26 = L4.a.b(b11, ImagesContract.URL);
                wVar = wVar2;
                try {
                    int b27 = L4.a.b(b11, "assetUrl");
                    int b28 = L4.a.b(b11, "errorDescription");
                    int b29 = L4.a.b(b11, "errorCode");
                    int b31 = L4.a.b(b11, "status");
                    int b32 = L4.a.b(b11, "firstLaunch");
                    int b33 = L4.a.b(b11, "model");
                    int b34 = L4.a.b(b11, "manufacturer");
                    int b35 = L4.a.b(b11, "permPostNotification");
                    int b36 = L4.a.b(b11, "permCamera");
                    int b37 = L4.a.b(b11, "permAccessLocation");
                    int b38 = L4.a.b(b11, "permReadContacts");
                    int b39 = L4.a.b(b11, "permUseBiometric");
                    int b41 = L4.a.b(b11, "pushType");
                    int b42 = L4.a.b(b11, "pins");
                    int b43 = L4.a.b(b11, "sign");
                    int b44 = L4.a.b(b11, "pubKey");
                    int b45 = L4.a.b(b11, "result");
                    int b46 = L4.a.b(b11, "pinsType");
                    int b47 = L4.a.b(b11, "pinsHashes");
                    int b48 = L4.a.b(b11, "certsChain");
                    int b49 = L4.a.b(b11, "storeName");
                    int b51 = L4.a.b(b11, "needUpdate");
                    int b52 = L4.a.b(b11, "rustoreStatus");
                    int b53 = L4.a.b(b11, "gmsStatus");
                    int b54 = L4.a.b(b11, "ozonSdkStatus");
                    int b55 = L4.a.b(b11, "platformVersion");
                    int b56 = L4.a.b(b11, "barcodeRecognitionType");
                    int b57 = L4.a.b(b11, "barcodeRecognitionSource");
                    int b58 = L4.a.b(b11, "barcodeRecognitionAvailableTypes");
                    int b59 = L4.a.b(b11, "ozonIdSessionId");
                    int b61 = L4.a.b(b11, "vpn");
                    int b62 = L4.a.b(b11, "networkType");
                    int b63 = L4.a.b(b11, "clusterName");
                    int b64 = L4.a.b(b11, "regionName");
                    int b65 = L4.a.b(b11, "cityName");
                    int i88 = b26;
                    ArrayList arrayList = new ArrayList(b11.getCount());
                    while (b11.moveToNext()) {
                        int i89 = b11.getInt(b12);
                        String string18 = b11.getString(b13);
                        String string19 = b11.getString(b14);
                        String string20 = b11.isNull(b15) ? null : b11.getString(b15);
                        String string21 = b11.getString(b16);
                        String string22 = b11.getString(b17);
                        String string23 = b11.getString(b18);
                        String string24 = b11.isNull(b19) ? null : b11.getString(b19);
                        String string25 = b11.isNull(b21) ? null : b11.getString(b21);
                        String string26 = b11.isNull(b22) ? null : b11.getString(b22);
                        Integer valueOf12 = b11.isNull(b23) ? null : Integer.valueOf(b11.getInt(b23));
                        String string27 = b11.isNull(b24) ? null : b11.getString(b24);
                        String string28 = b11.isNull(b25) ? null : b11.getString(b25);
                        int i91 = i88;
                        if (b11.isNull(i91)) {
                            int i92 = b27;
                            i11 = b12;
                            i12 = i92;
                            string = null;
                        } else {
                            int i93 = b27;
                            i11 = b12;
                            i12 = i93;
                            string = b11.getString(i91);
                        }
                        if (b11.isNull(i12)) {
                            int i94 = b28;
                            i13 = i12;
                            i14 = i94;
                            str = null;
                        } else {
                            String string29 = b11.getString(i12);
                            int i95 = b28;
                            i13 = i12;
                            i14 = i95;
                            str = string29;
                        }
                        if (b11.isNull(i14)) {
                            int i96 = b29;
                            i15 = i14;
                            i16 = i96;
                            str2 = null;
                        } else {
                            String string30 = b11.getString(i14);
                            int i97 = b29;
                            i15 = i14;
                            i16 = i97;
                            str2 = string30;
                        }
                        if (b11.isNull(i16)) {
                            int i98 = b31;
                            i17 = i16;
                            i18 = i98;
                            num = null;
                        } else {
                            Integer valueOf13 = Integer.valueOf(b11.getInt(i16));
                            int i99 = b31;
                            i17 = i16;
                            i18 = i99;
                            num = valueOf13;
                        }
                        if (b11.isNull(i18)) {
                            int i100 = b32;
                            i19 = i18;
                            i21 = i100;
                            str3 = null;
                        } else {
                            String string31 = b11.getString(i18);
                            int i101 = b32;
                            i19 = i18;
                            i21 = i101;
                            str3 = string31;
                        }
                        Integer valueOf14 = b11.isNull(i21) ? null : Integer.valueOf(b11.getInt(i21));
                        boolean z11 = true;
                        if (valueOf14 == null) {
                            int i102 = b33;
                            i22 = i21;
                            i23 = i102;
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(valueOf14.intValue() != 0);
                            int i103 = b33;
                            i22 = i21;
                            i23 = i103;
                        }
                        if (b11.isNull(i23)) {
                            int i104 = b34;
                            i24 = i23;
                            i25 = i104;
                            string2 = null;
                        } else {
                            string2 = b11.getString(i23);
                            int i105 = b34;
                            i24 = i23;
                            i25 = i105;
                        }
                        if (b11.isNull(i25)) {
                            int i106 = b35;
                            i26 = i25;
                            i27 = i106;
                            string3 = null;
                        } else {
                            string3 = b11.getString(i25);
                            int i107 = b35;
                            i26 = i25;
                            i27 = i107;
                        }
                        Integer valueOf15 = b11.isNull(i27) ? null : Integer.valueOf(b11.getInt(i27));
                        if (valueOf15 == null) {
                            int i108 = b36;
                            i28 = i27;
                            i29 = i108;
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(valueOf15.intValue() != 0);
                            int i109 = b36;
                            i28 = i27;
                            i29 = i109;
                        }
                        Integer valueOf16 = b11.isNull(i29) ? null : Integer.valueOf(b11.getInt(i29));
                        if (valueOf16 == null) {
                            int i110 = b37;
                            i31 = i29;
                            i32 = i110;
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(valueOf16.intValue() != 0);
                            int i111 = b37;
                            i31 = i29;
                            i32 = i111;
                        }
                        Integer valueOf17 = b11.isNull(i32) ? null : Integer.valueOf(b11.getInt(i32));
                        if (valueOf17 == null) {
                            int i112 = b38;
                            i33 = i32;
                            i34 = i112;
                            valueOf4 = null;
                        } else {
                            valueOf4 = Boolean.valueOf(valueOf17.intValue() != 0);
                            int i113 = b38;
                            i33 = i32;
                            i34 = i113;
                        }
                        Integer valueOf18 = b11.isNull(i34) ? null : Integer.valueOf(b11.getInt(i34));
                        if (valueOf18 == null) {
                            int i114 = b39;
                            i35 = i34;
                            i36 = i114;
                            valueOf5 = null;
                        } else {
                            valueOf5 = Boolean.valueOf(valueOf18.intValue() != 0);
                            int i115 = b39;
                            i35 = i34;
                            i36 = i115;
                        }
                        Integer valueOf19 = b11.isNull(i36) ? null : Integer.valueOf(b11.getInt(i36));
                        if (valueOf19 == null) {
                            int i116 = b41;
                            i37 = i36;
                            i38 = i116;
                            valueOf6 = null;
                        } else {
                            valueOf6 = Boolean.valueOf(valueOf19.intValue() != 0);
                            int i117 = b41;
                            i37 = i36;
                            i38 = i117;
                        }
                        if (b11.isNull(i38)) {
                            int i118 = b42;
                            i39 = i38;
                            i41 = i118;
                            string4 = null;
                        } else {
                            string4 = b11.getString(i38);
                            int i119 = b42;
                            i39 = i38;
                            i41 = i119;
                        }
                        if (b11.isNull(i41)) {
                            int i120 = b43;
                            i42 = i41;
                            i43 = i120;
                            string5 = null;
                        } else {
                            string5 = b11.getString(i41);
                            int i121 = b43;
                            i42 = i41;
                            i43 = i121;
                        }
                        if (b11.isNull(i43)) {
                            int i122 = b44;
                            i44 = i43;
                            i45 = i122;
                            string6 = null;
                        } else {
                            string6 = b11.getString(i43);
                            int i123 = b44;
                            i44 = i43;
                            i45 = i123;
                        }
                        if (b11.isNull(i45)) {
                            int i124 = b45;
                            i46 = i45;
                            i47 = i124;
                            string7 = null;
                        } else {
                            string7 = b11.getString(i45);
                            int i125 = b45;
                            i46 = i45;
                            i47 = i125;
                        }
                        Integer valueOf20 = b11.isNull(i47) ? null : Integer.valueOf(b11.getInt(i47));
                        if (valueOf20 == null) {
                            int i126 = b46;
                            i48 = i47;
                            i49 = i126;
                            valueOf7 = null;
                        } else {
                            valueOf7 = Boolean.valueOf(valueOf20.intValue() != 0);
                            int i127 = b46;
                            i48 = i47;
                            i49 = i127;
                        }
                        if (b11.isNull(i49)) {
                            int i128 = b47;
                            i51 = i49;
                            i52 = i128;
                            string8 = null;
                        } else {
                            string8 = b11.getString(i49);
                            int i129 = b47;
                            i51 = i49;
                            i52 = i129;
                        }
                        if (b11.isNull(i52)) {
                            int i130 = b48;
                            i53 = i52;
                            i54 = i130;
                            string9 = null;
                        } else {
                            string9 = b11.getString(i52);
                            int i131 = b48;
                            i53 = i52;
                            i54 = i131;
                        }
                        if (b11.isNull(i54)) {
                            int i132 = b49;
                            i55 = i54;
                            i56 = i132;
                            string10 = null;
                        } else {
                            string10 = b11.getString(i54);
                            int i133 = b49;
                            i55 = i54;
                            i56 = i133;
                        }
                        if (b11.isNull(i56)) {
                            int i134 = b51;
                            i57 = i56;
                            i58 = i134;
                            string11 = null;
                        } else {
                            string11 = b11.getString(i56);
                            int i135 = b51;
                            i57 = i56;
                            i58 = i135;
                        }
                        Integer valueOf21 = b11.isNull(i58) ? null : Integer.valueOf(b11.getInt(i58));
                        if (valueOf21 == null) {
                            int i136 = b52;
                            i59 = i58;
                            i61 = i136;
                            valueOf8 = null;
                        } else {
                            valueOf8 = Boolean.valueOf(valueOf21.intValue() != 0);
                            int i137 = b52;
                            i59 = i58;
                            i61 = i137;
                        }
                        if (b11.isNull(i61)) {
                            int i138 = b53;
                            i62 = i61;
                            i63 = i138;
                            string12 = null;
                        } else {
                            string12 = b11.getString(i61);
                            int i139 = b53;
                            i62 = i61;
                            i63 = i139;
                        }
                        if (b11.isNull(i63)) {
                            int i140 = b54;
                            i64 = i63;
                            i65 = i140;
                            string13 = null;
                        } else {
                            string13 = b11.getString(i63);
                            int i141 = b54;
                            i64 = i63;
                            i65 = i141;
                        }
                        if (b11.isNull(i65)) {
                            int i142 = b55;
                            i66 = i65;
                            i67 = i142;
                            string14 = null;
                        } else {
                            string14 = b11.getString(i65);
                            int i143 = b55;
                            i66 = i65;
                            i67 = i143;
                        }
                        if (b11.isNull(i67)) {
                            int i144 = b56;
                            i68 = i67;
                            i69 = i144;
                            string15 = null;
                        } else {
                            string15 = b11.getString(i67);
                            int i145 = b56;
                            i68 = i67;
                            i69 = i145;
                        }
                        if (b11.isNull(i69)) {
                            int i146 = b57;
                            i71 = i69;
                            i72 = i146;
                            valueOf9 = null;
                        } else {
                            valueOf9 = Integer.valueOf(b11.getInt(i69));
                            int i147 = b57;
                            i71 = i69;
                            i72 = i147;
                        }
                        if (b11.isNull(i72)) {
                            int i148 = b58;
                            i73 = i72;
                            i74 = i148;
                            string16 = null;
                        } else {
                            string16 = b11.getString(i72);
                            int i149 = b58;
                            i73 = i72;
                            i74 = i149;
                        }
                        if (b11.isNull(i74)) {
                            int i150 = b59;
                            i75 = i74;
                            i76 = i150;
                            valueOf10 = null;
                        } else {
                            valueOf10 = Integer.valueOf(b11.getInt(i74));
                            int i151 = b59;
                            i75 = i74;
                            i76 = i151;
                        }
                        if (b11.isNull(i76)) {
                            int i152 = b61;
                            i77 = i76;
                            i78 = i152;
                            string17 = null;
                        } else {
                            string17 = b11.getString(i76);
                            int i153 = b61;
                            i77 = i76;
                            i78 = i153;
                        }
                        Integer valueOf22 = b11.isNull(i78) ? null : Integer.valueOf(b11.getInt(i78));
                        if (valueOf22 == null) {
                            int i154 = b62;
                            i79 = i78;
                            i81 = i154;
                            valueOf11 = null;
                        } else {
                            if (valueOf22.intValue() == 0) {
                                z11 = false;
                            }
                            int i155 = b62;
                            i79 = i78;
                            i81 = i155;
                            valueOf11 = Boolean.valueOf(z11);
                        }
                        if (b11.isNull(i81)) {
                            int i156 = b63;
                            i82 = i81;
                            i83 = i156;
                            str4 = null;
                        } else {
                            String string32 = b11.getString(i81);
                            int i157 = b63;
                            i82 = i81;
                            i83 = i157;
                            str4 = string32;
                        }
                        if (b11.isNull(i83)) {
                            int i158 = b64;
                            i84 = i83;
                            i85 = i158;
                            str5 = null;
                        } else {
                            String string33 = b11.getString(i83);
                            int i159 = b64;
                            i84 = i83;
                            i85 = i159;
                            str5 = string33;
                        }
                        if (b11.isNull(i85)) {
                            int i160 = b65;
                            i86 = i85;
                            i87 = i160;
                            str6 = null;
                        } else {
                            String string34 = b11.getString(i85);
                            int i161 = b65;
                            i86 = i85;
                            i87 = i161;
                            str6 = string34;
                        }
                        C6288a c6288a = new C6288a(i89, string18, string19, string20, string21, string22, string23, string24, string25, string26, valueOf12, string27, string28, string, str, str2, num, str3, valueOf, string2, string3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, string4, string5, string6, string7, valueOf7, string8, string9, string10, string11, valueOf8, string12, string13, string14, string15, valueOf9, string16, valueOf10, string17, valueOf11, str4, str5, str6, b11.isNull(i87) ? null : b11.getString(i87));
                        int i162 = i87;
                        arrayList.add(c6288a);
                        b12 = i11;
                        b27 = i13;
                        b28 = i15;
                        b29 = i17;
                        b31 = i19;
                        b32 = i22;
                        b33 = i24;
                        b34 = i26;
                        b35 = i28;
                        b36 = i31;
                        b37 = i33;
                        b38 = i35;
                        b39 = i37;
                        b41 = i39;
                        b42 = i42;
                        b43 = i44;
                        b44 = i46;
                        b45 = i48;
                        b46 = i51;
                        b47 = i53;
                        b48 = i55;
                        b49 = i57;
                        b51 = i59;
                        b52 = i62;
                        b53 = i64;
                        b54 = i66;
                        b55 = i68;
                        b56 = i71;
                        b57 = i73;
                        b58 = i75;
                        b59 = i77;
                        b61 = i79;
                        b62 = i82;
                        b63 = i84;
                        b64 = i86;
                        b65 = i162;
                        i88 = i91;
                    }
                    b11.close();
                    wVar.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    b11.close();
                    wVar.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                wVar = wVar2;
            }
        }
    }

    /* renamed from: d30.c$c, reason: collision with other inner class name */
    final class CallableC0943c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6288a f61108a;

        CallableC0943c(C6288a c6288a) {
            this.f61108a = c6288a;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            C6072c c6072c = C6072c.this;
            c6072c.f61100a.beginTransaction();
            try {
                c6072c.f61101b.insert((J4.l) this.f61108a);
                c6072c.f61100a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                c6072c.f61100a.endTransaction();
            }
        }
    }

    /* renamed from: d30.c$d */
    final class d implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6290c f61110a;

        d(C6290c c6290c) {
            this.f61110a = c6290c;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            C6072c c6072c = C6072c.this;
            c6072c.f61100a.beginTransaction();
            try {
                c6072c.f61102c.insert((J4.l) this.f61110a);
                c6072c.f61100a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                c6072c.f61100a.endTransaction();
            }
        }
    }

    /* renamed from: d30.c$e */
    final class e implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f61112a;

        e(int i11) {
            this.f61112a = i11;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        public final Unit call() throws Exception {
            C6072c c6072c = C6072c.this;
            O4.f acquire = c6072c.f61103d.acquire();
            acquire.m0(1, this.f61112a);
            try {
                c6072c.f61100a.beginTransaction();
                try {
                    acquire.C();
                    c6072c.f61100a.setTransactionSuccessful();
                    return Unit.f71690a;
                } finally {
                    c6072c.f61100a.endTransaction();
                }
            } finally {
                c6072c.f61103d.release(acquire);
            }
        }
    }

    public C6072c(@NonNull GraylogDatabase_Impl graylogDatabase_Impl) {
        this.f61100a = graylogDatabase_Impl;
        this.f61101b = new g(graylogDatabase_Impl);
        this.f61102c = new h(graylogDatabase_Impl);
        new i(graylogDatabase_Impl);
        this.f61103d = new j(graylogDatabase_Impl);
        new k(graylogDatabase_Impl);
    }

    @Override // d30.InterfaceC6070a
    public final Object a(kotlin.coroutines.jvm.internal.c cVar) {
        w j11 = w.j(0, "SELECT COUNT(*) FROM graylog_event");
        return J4.f.b(this.f61100a, new CancellationSignal(), new CallableC6073d(this, j11), cVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object b(kotlin.coroutines.jvm.internal.c cVar) {
        w j11 = w.j(0, "SELECT * FROM user_id ORDER BY id DESC LIMIT 1");
        return J4.f.b(this.f61100a, new CancellationSignal(), new CallableC6074e(this, j11), cVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object c(final C6290c c6290c, kotlin.coroutines.d<? super Unit> dVar) {
        return u.a(this.f61100a, new Function1() { // from class: d30.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C6072c c6072c = C6072c.this;
                c6072c.getClass();
                return InterfaceC6070a.C0941a.a(c6072c, c6290c, (kotlin.coroutines.d) obj);
            }
        }, dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object d(ArrayList arrayList, kotlin.coroutines.d dVar) {
        return J4.f.c(this.f61100a, new CallableC6075f(this, arrayList), dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object e(int i11, kotlin.coroutines.d<? super List<C6288a>> dVar) {
        w j11 = w.j(1, "SELECT * FROM graylog_event limit ?");
        j11.m0(1, i11);
        return J4.f.b(this.f61100a, new CancellationSignal(), new b(j11), dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object f(int i11, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f61100a, new e(i11), dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object g(kotlin.coroutines.d<? super List<C6288a>> dVar) {
        w j11 = w.j(0, "SELECT * FROM graylog_event");
        return J4.f.b(this.f61100a, new CancellationSignal(), new a(j11), dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object h(C6290c c6290c, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f61100a, new d(c6290c), dVar);
    }

    @Override // d30.InterfaceC6070a
    public final Object i(C6288a c6288a, kotlin.coroutines.d<? super Unit> dVar) {
        return J4.f.c(this.f61100a, new CallableC0943c(c6288a), dVar);
    }
}
