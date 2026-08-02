package com.vk.qrcode;

import com.google.zxing.client.result.ParsedResultType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vkontakte.android.data.b;
import defpackage.q0;
import java.net.URLEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.brm0;
import xsna.drm0;
import xsna.epx;
import xsna.rne0;
import xsna.zrp;

/* compiled from: QRStatsTracker.kt */
/* loaded from: classes5.dex */
public final class QRStatsTracker {
    public static final QRStatsTracker a = new QRStatsTracker();
    public static final ArrayDeque b = new ArrayDeque();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QRStatsTracker.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ADD_FRIEND;
        public static final Action ADD_TO_CALENDAR;
        public static final Action ADD_TO_CONTACTS;
        public static final Action ADD_TO_FAVORITES;
        public static final Action CALL;
        public static final Action CONNECT_WI_FI;
        public static final Action COPY_TEXT;
        public static final Action DECLINE;
        public static final Action JOIN_GROUP;
        public static final Action OPEN_APP;
        public static final Action OPEN_ARTICLE;
        public static final Action OPEN_CHECK_BACK;
        public static final Action OPEN_CLIP;
        public static final Action OPEN_CLIPS_BY_HASHTAG;
        public static final Action OPEN_LINK;
        public static final Action OPEN_LINK_FROM_AVATAR;
        public static final Action OPEN_LINK_FROM_TEXT;
        public static final Action OPEN_MAP;
        public static final Action OPEN_MONEY_TRANSFER;
        public static final Action OPEN_POST;
        public static final Action OPEN_PROFILE;
        public static final Action SEND_EMAIL;
        public static final Action SEND_MESSAGE;
        public static final Action SEND_SMS;
        public static final Action UPGRADE_VERSION;

        static {
            Action action = new Action("DECLINE", 0);
            DECLINE = action;
            Action action2 = new Action("ADD_TO_FAVORITES", 1);
            ADD_TO_FAVORITES = action2;
            Action action3 = new Action("ADD_FRIEND", 2);
            ADD_FRIEND = action3;
            Action action4 = new Action("JOIN_GROUP", 3);
            JOIN_GROUP = action4;
            Action action5 = new Action("ADD_TO_CONTACTS", 4);
            ADD_TO_CONTACTS = action5;
            Action action6 = new Action("ADD_TO_CALENDAR", 5);
            ADD_TO_CALENDAR = action6;
            Action action7 = new Action("CONNECT_WI_FI", 6);
            CONNECT_WI_FI = action7;
            Action action8 = new Action("OPEN_LINK", 7);
            OPEN_LINK = action8;
            Action action9 = new Action("OPEN_MAP", 8);
            OPEN_MAP = action9;
            Action action10 = new Action("OPEN_APP", 9);
            OPEN_APP = action10;
            Action action11 = new Action("OPEN_CHECK_BACK", 10);
            OPEN_CHECK_BACK = action11;
            Action action12 = new Action("OPEN_POST", 11);
            OPEN_POST = action12;
            Action action13 = new Action("OPEN_ARTICLE", 12);
            OPEN_ARTICLE = action13;
            Action action14 = new Action("OPEN_CLIP", 13);
            OPEN_CLIP = action14;
            Action action15 = new Action("OPEN_CLIPS_BY_HASHTAG", 14);
            OPEN_CLIPS_BY_HASHTAG = action15;
            Action action16 = new Action("COPY_TEXT", 15);
            COPY_TEXT = action16;
            Action action17 = new Action("OPEN_LINK_FROM_TEXT", 16);
            OPEN_LINK_FROM_TEXT = action17;
            Action action18 = new Action("OPEN_LINK_FROM_AVATAR", 17);
            OPEN_LINK_FROM_AVATAR = action18;
            Action action19 = new Action("SEND_MESSAGE", 18);
            SEND_MESSAGE = action19;
            Action action20 = new Action("OPEN_PROFILE", 19);
            OPEN_PROFILE = action20;
            Action action21 = new Action("UPGRADE_VERSION", 20);
            UPGRADE_VERSION = action21;
            Action action22 = new Action("OPEN_MONEY_TRANSFER", 21);
            OPEN_MONEY_TRANSFER = action22;
            Action action23 = new Action("CALL", 22);
            CALL = action23;
            Action action24 = new Action("SEND_SMS", 23);
            SEND_SMS = action24;
            Action action25 = new Action("SEND_EMAIL", 24);
            SEND_EMAIL = action25;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11, action12, action13, action14, action15, action16, action17, action18, action19, action20, action21, action22, action23, action24, action25};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: QRStatsTracker.kt */
    public static final class a {
        public final boolean a;
        public final rne0 b;
        public final boolean c;

        public a(boolean z, rne0 rne0Var, boolean z2) {
            this.a = z;
            this.b = rne0Var;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FutureReportData(reread=");
            sb.append(this.a);
            sb.append(", qrInfo=");
            sb.append(this.b);
            sb.append(", fromPhoto=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: QRStatsTracker.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ParsedResultType.values().length];
            try {
                iArr[ParsedResultType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParsedResultType.ADDRESSBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QRTypes$Type.values().length];
            try {
                iArr2[QRTypes$Type.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[QRTypes$Type.VC_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static void a(Action action) {
        b.d dVar = new b.d("qr_popup");
        dVar.b(action.name().toLowerCase(Locale.ROOT), "action");
        dVar.e();
    }

    public static String c(String str) {
        Iterator it = new ArrayList(drm0.c0(str, new String[]{"\n"}, 0, 6)).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (brm0.B(str2, "N:", true)) {
                int K = drm0.K(0, 6, str, str2, false);
                str = drm0.V(K, str2.length() + K + 1, str).toString();
            }
        }
        return str;
    }

    public static String d(rne0 rne0Var, String str) {
        ArrayList arrayList = new ArrayList(drm0.c0(rne0Var.a.toString(), new String[]{"\n"}, 0, 6));
        if (brm0.B(str, "WIFI:T:", true) && arrayList.size() > 1) {
            String str2 = (String) arrayList.get(1);
            if (epx.f(str2, "nopass")) {
                return str;
            }
            int K = drm0.K(0, 6, str, str2, false);
            str = drm0.V(K - 2, str2.length() + K + 1, str).toString();
        }
        if (arrayList.size() < 4) {
            return str;
        }
        String str3 = (String) arrayList.get(2);
        int O = drm0.O(0, 6, str, str3);
        return drm0.V(O, str3.length() + O, str).toString();
    }

    public static void e(QRTypes$Type qRTypes$Type, QRTypes$SubType qRTypes$SubType, boolean z, rne0 rne0Var, boolean z2) {
        String str = rne0Var.d;
        int i = b.$EnumSwitchMapping$1[qRTypes$Type.ordinal()];
        if (i == 1) {
            str = d(rne0Var, str);
        } else if (i == 2) {
            str = c(str);
        }
        f(qRTypes$Type, qRTypes$SubType, z, URLEncoder.encode(str, C.UTF8_NAME), z2);
    }

    public static void f(QRTypes$Type qRTypes$Type, QRTypes$SubType qRTypes$SubType, boolean z, String str, boolean z2) {
        b.d dVar = new b.d("qr_decode");
        dVar.b(qRTypes$Type.h(), "type");
        dVar.b(qRTypes$SubType.h(), "subtype");
        dVar.b(Boolean.valueOf(z), "reread");
        dVar.b(Boolean.valueOf(z2), "from_photo");
        dVar.b(str, "data");
        dVar.e();
    }

    public static void g(QRTypes$Type qRTypes$Type, QRTypes$SubType qRTypes$SubType, boolean z) {
        a aVar = (a) b.poll();
        if (aVar != null) {
            e(qRTypes$Type, qRTypes$SubType, aVar.a, aVar.b, z);
        }
    }

    public final void b(String str, String str2) {
        String encode = str != null ? URLEncoder.encode(str, C.UTF8_NAME) : null;
        b.d dVar = new b.d("qr_decode");
        dVar.b(str2, "type");
        dVar.b(encode, "data");
        dVar.e();
    }
}
