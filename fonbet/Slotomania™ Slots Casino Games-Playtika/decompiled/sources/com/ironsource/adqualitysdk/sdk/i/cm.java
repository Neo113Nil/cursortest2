package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.cq;
import com.ironsource.adqualitysdk.sdk.i.ig;
import java.util.List;

/* loaded from: classes4.dex */
public class cm {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f1477;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private cq f1478;

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f1479;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ig.d f1480;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ig m7263(ii iiVar) {
        return this.f1480.m7999(iiVar, this.f1477, this.f1479);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final cq m7264() {
        return this.f1478;
    }

    public static class d extends cw implements ch {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f1481 = 53592;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f1482 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f1483 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static long f1484 = 1623021001088475023L;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f1485;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f1486;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private cm f1487;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private cq.e f1488;

        public d(List<String> list, int i) {
            cm cmVar = new cm();
            this.f1487 = cmVar;
            cmVar.f1480 = new ig.d();
            this.f1487.f1477 = list;
            this.f1487.f1479 = i;
            this.f1488 = new cq.e();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private cm m7266() {
            int i = 2 % 2;
            int i2 = f1482 + 13;
            f1483 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f1487.f1478 = this.f1488.m7310();
                cm cmVar = this.f1487;
                int i3 = f1482 + 93;
                f1483 = i3 % 128;
                int i4 = i3 % 2;
                return cmVar;
            }
            this.f1487.f1478 = this.f1488.m7310();
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01ee A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0214 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x022e A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0250 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0287 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a1 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0064 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0087 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00ad A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00cc A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00e9 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x010b A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x013d A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0159 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x018d A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01b6 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d2 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[Catch: Exception -> 0x0037, TryCatch #1 {Exception -> 0x0037, blocks: (B:4:0x0029, B:7:0x002f, B:9:0x0047, B:13:0x02dd, B:14:0x046c, B:23:0x02e1, B:28:0x02f2, B:30:0x0309, B:32:0x0317, B:34:0x0325, B:36:0x0333, B:38:0x0349, B:40:0x035f, B:42:0x0375, B:44:0x038b, B:46:0x03a1, B:48:0x03b7, B:50:0x03cd, B:52:0x03e3, B:54:0x03f9, B:60:0x041e, B:64:0x0440, B:66:0x0456, B:68:0x0064, B:71:0x0087, B:74:0x00ad, B:77:0x00cc, B:80:0x00e9, B:83:0x010b, B:86:0x013d, B:89:0x0159, B:92:0x018d, B:95:0x01b6, B:98:0x01d2, B:101:0x01ee, B:104:0x0214, B:107:0x022e, B:110:0x0250, B:117:0x0287, B:120:0x02a1, B:130:0x003c, B:131:0x0040), top: B:2:0x0027 }] */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* renamed from: ﻛ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            cl clVar2;
            int i = 2 % 2;
            int i2 = f1482 + 79;
            f1483 = i2 % 128;
            char c = 1;
            try {
                if (i2 % 2 == 0) {
                    switch (str.hashCode()) {
                        case -1930334554:
                            break;
                        case -1826216039:
                            break;
                        case -994397843:
                            break;
                        case -941967812:
                            break;
                        case -770599694:
                            break;
                        case -235079533:
                            break;
                        case -213689933:
                            break;
                        case 46561673:
                            break;
                        case 94094958:
                            break;
                        case 841006591:
                            break;
                        case 902024524:
                            break;
                        case 923334616:
                            break;
                        case 1080975014:
                            break;
                        case 1083215325:
                            break;
                        case 1202614773:
                            break;
                        case 1689765750:
                            break;
                        case 1766229249:
                            break;
                        case 1833576080:
                            break;
                    }
                } else {
                    int i3 = 60 / 0;
                    switch (str.hashCode()) {
                        case -1930334554:
                            if (str.equals(m7265((char) (49351 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "弱밸옢闀", "ᣖ㓷턏ṯ┒༫覐駰ꟓ胱હ繅鹎阡鏭", KeyEvent.keyCodeFromString("") + 582760543).intern())) {
                                int i4 = f1483 + 35;
                                f1482 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    c = 7;
                                    break;
                                } else {
                                    c = '7';
                                    break;
                                }
                            }
                            c = 65535;
                            break;
                        case -1826216039:
                            if (str.equals(m7267("鿻ꚭ\ued49㏻窦脹쟘ຓ唻鯏", Color.red(0) + 14683).intern())) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -994397843:
                            if (!(!str.equals(m7265((char) (57930 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", "鷚㪐䫪团", "蒤ुቍ쌐顳㉹ꄅ\ue607䐤⚊\u1289뜖\ue9fe⃗ဖ㟷㥽鬴", ViewConfiguration.getScrollDefaultDelay() >> 16).intern()))) {
                                int i5 = f1483 + 31;
                                f1482 = i5 % 128;
                                if (i5 % 2 != 0) {
                                    c = 6;
                                    break;
                                } else {
                                    c = '\'';
                                    break;
                                }
                            }
                            c = 65535;
                            break;
                        case -941967812:
                            if (str.equals(m7265((char) (11938 - MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "酪甄ꍈ\udb2e", "뭖ᰲᰟ\uf220ﯛ횎좴웳䟯瑛㙯൘忻䄚\ue301ܟ䈏䏖", View.MeasureSpec.getMode(0)).intern())) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -770599694:
                            if (str.equals(m7267("鿼\ud8e5ᇥ䫯菚ﲪ㖑溃ꞇ\ue07c奱鉬쭔о紞똆\uef1a⠓惪", 18191 - KeyEvent.normalizeMetaState(0)).intern())) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -235079533:
                            if (str.equals(m7267("鿼ꯥ\uf7e5ϡ俒鮧ꞽ\uf383㾶䭤靵ꍥ\uef59㬦䜸錍\udf0b\ueb03", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13327).intern())) {
                                int i6 = f1483 + 81;
                                f1482 = i6 % 128;
                                int i7 = i6 % 2;
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -213689933:
                            if (str.equals(m7267("鿼툽ѕ癌ꢼ\u1ad0䳩뼁\uf140⍗閌쟓㧰氶\ude28ၰ䊚뒺\ue6f4夔謠﵉⾆", 19927 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 46561673:
                            if (str.equals(m7267("鿼딧쩡Ά㓞䧯鼳둷즏ỳ㏣䤁鹡뎔죘᷵㌬", 10957 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94094958:
                            if (str.equals(m7265((char) (KeyEvent.normalizeMetaState(0) + 17717), "\u0000\u0000\u0000\u0000", "믇ꜹ㕉㙅", "㲄鑟悮訥簽", 1235696059 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 841006591:
                            if (str.equals(m7265((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "\udc35ႅ첥曏", "ꁙ傤諍즋ߊ▹꼽촑鍜囵횡둣颷ﮈ\uf508ᱏ╺築譑ֆޫ⼵掟\ue0d6鴕", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1525643812).intern())) {
                                int i8 = f1482 + 53;
                                f1483 = i8 % 128;
                                int i9 = i8 % 2;
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 902024524:
                            if (str.equals(m7267("鿦斌欦炼癚節䅢䜑䲨刼", TextUtils.getTrimmedLength("") + 64109).intern())) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 923334616:
                            if (str.equals(m7265((char) ((ViewConfiguration.getTapTimeout() >> 16) + 32056), "\u0000\u0000\u0000\u0000", "\ue759彊㠛\uda7d", "‼턞⋤얥䌒ʪ嚌晄俤䀒↧\udd88ᬱᮭ褪랕輏", 459229926 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                                int i10 = f1483 + 19;
                                f1482 = i10 % 128;
                                int i11 = i10 % 2;
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1080975014:
                            if (str.equals(m7265((char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", "Ⲑ饎\ueb26광", "댴悉伔ɼ질䠰␡⪣茇﮷睧얿\uef4d其욤\uef58\uec49䇿繅\ufb1b伋\ue0b6", ViewConfiguration.getLongPressTimeout() >> 16).intern())) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1083215325:
                            if (str.equals(m7267("鿦焍䈬匯\u2438㕓َ\u1776\ue866璉쪉\udbb1겅뷀軎鿽", 61169 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1202614773:
                            if (str.equals(m7267("鿼֕ꬅ傡\uf616鮕ćꚕ䰟\uf1ab霌㲊ꈞ䞎\ued3e銒㠞\udd93䌒\ue887踐", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39551).intern())) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1689765750:
                            if (str.equals(m7265((char) (53380 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", "道玦葹勐", "❋ᶚ폌䓩ﺀ㶙듉馑ퟵ㘧맩踄♍\uec49\udeb0謬ǰℨ\ue541匿\ueeae\u1a8c䍜ẋ\ue0b4ᳶ\ueae5杙", ViewConfiguration.getEdgeSlop() >> 16).intern())) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1766229249:
                            if (str.equals(m7267("鿼\ue86b烹論䇢쩤勍\udb6d⏷걲㓭뵂\u05ec蹰ᛒ齵\ue7ef灻\uf8ef䅟짷剻\udaea⍫꯲㑥", 30593 - View.combineMeasuredStates(0, 0)).intern())) {
                                int i12 = f1483 + 91;
                                f1482 = i12 % 128;
                                int i13 = i12 % 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1833576080:
                            if (str.equals(m7267("鿼럛쾙\ue751㼢圔滭蚽\ude77\uf642ญ◒綬門굠씢᳭㒯䲄摟", TextUtils.lastIndexOf("", '0', 0, 0) + 10290).intern())) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                }
            } catch (Exception e) {
                e = e;
                clVar2 = clVar;
            }
            switch (c) {
                case 0:
                    this.f1487.f1480.m7997(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f1487.f1480.m7989(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f1487.f1480.m7993(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    int i14 = f1482 + 15;
                    f1483 = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return this;
                case 3:
                    this.f1487.f1480.m7991(((Integer) m7365(list, 0, Integer.class)).intValue());
                    int i15 = f1483 + 37;
                    f1482 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 87 / 0;
                        return this;
                    }
                    return this;
                case 4:
                    this.f1487.f1480.m7994(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case 5:
                    this.f1487.f1480.m7995(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f1487.f1480.m7987(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f1487.f1480.m7990(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    return this;
                case '\b':
                    this.f1487.f1480.m7984(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case '\t':
                    this.f1487.f1480.m7988(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    return this;
                case '\n':
                    this.f1487.f1480.m7986(((Integer) m7365(list, 0, Integer.class)).intValue());
                    return this;
                case 11:
                    this.f1487.f1480.m7998(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    return this;
                case '\f':
                    this.f1487.f1480.m7985(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                    return this;
                case '\r':
                    this.f1488.m7311((Class) m7365(list, 0, Class.class));
                    return this;
                case 14:
                    this.f1488.m7309((Class) m7365(list, 0, Class.class));
                    return this;
                case 15:
                    this.f1488.m7313((Class) m7365(list, 0, Class.class));
                    return this;
                case 16:
                    dz dzVar = (dz) m7365(list, 0, dz.class);
                    this.f1488.m7312(dzVar);
                    this.f1487.f1480.m7992(dzVar);
                    return this;
                case 17:
                    cm m7266 = m7266();
                    int i17 = f1482 + 9;
                    f1483 = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 4 / 0;
                    }
                    return m7266;
                default:
                    clVar2 = clVar;
                    try {
                        new ds(clVar2, eeVar, m7265((char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", "睸ᓫ峭ו", "㜾ꙉኋ嘁쑳䢷잓滫䈍絨\ue59a䖬쇽䵬䢆蟰䅟鸊횄ㅥ衯ᰬ", Process.myPid() >> 22).intern(), str).m7593(clVar2.m7203());
                    } catch (Exception e2) {
                        e = e2;
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7267("鿊갼\uf87fң價鵪\ua97e\uf5a0Ǯ个驠ꛤ\uf2e6㼺䭤鞣ꏪ\uf02a㱴䢲铼ꅺ\ued4b㦽䗺鈹\ude61\ueab1㛀䌷轰\udba2\ue7cc㐆䁩貉\ud8cd\ue503ㅇ綁觓혏\ue24a⺊窃蜌퍀ᾔ⯖砈葘태᳖⤟畍膐췘ᨒ☕狓", 13249 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern()).append(str).append(m7265((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 48041), "\u0000\u0000\u0000\u0000", "쪆㰞ꫳ쪻", "\uedcd", View.MeasureSpec.makeMeasureSpec(0, 0) - 214163766).intern()).toString(), e);
                        return null;
                    }
                    return null;
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m7267(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (i.f2454) {
                i.f2455 = i;
                char[] cArr3 = new char[cArr2.length];
                i.f2453 = 0;
                while (i.f2453 < cArr2.length) {
                    cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1484);
                    i.f2453++;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m7265(char c, String str, String str2, String str3, int i) {
            String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (f.f2042) {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                f.f2041 = 0;
                while (f.f2041 < length) {
                    int i2 = (f.f2041 + 2) % 4;
                    int i3 = (f.f2041 + 3) % 4;
                    f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = f.f2043;
                    cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1485) ^ f1486) ^ f1481);
                    f.f2041++;
                }
                str4 = new String(cArr9);
            }
            return str4;
        }
    }
}
