package gg;

import X9.m;
import android.content.Context;
import android.util.Log;
import com.orkestapay.orkestapay.core.clicktopay.WebviewActivity;
import com.twilio.voice.EventKeys;
import dg.C4073a;
import eg.C4205b;
import eg.EnumC4204a;
import fg.InterfaceC4282a;
import fg.d;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import ug.AbstractC6574b;
import ug.e;
import vg.C6689a;
import wg.AbstractC6749d;
import wg.C6746a;
import wg.C6751f;
import wg.InterfaceC6747b;
import xg.AbstractC6824a;

/* renamed from: gg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4379a {

    /* renamed from: b, reason: collision with root package name */
    public fg.b f47398b;

    /* renamed from: e, reason: collision with root package name */
    public C6746a f47401e;

    /* renamed from: l, reason: collision with root package name */
    public Timer f47408l;

    /* renamed from: p, reason: collision with root package name */
    public d f47412p;

    /* renamed from: a, reason: collision with root package name */
    public b f47397a = b.DISCONNECTED;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47399c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f47400d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47402f = false;

    /* renamed from: g, reason: collision with root package name */
    public String f47403g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f47404h = null;

    /* renamed from: i, reason: collision with root package name */
    public final Object f47405i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public List f47406j = Arrays.asList(3000L, 5000L, 15000L, 30000L);

    /* renamed from: k, reason: collision with root package name */
    public final Object f47407k = new Object();

    /* renamed from: m, reason: collision with root package name */
    public Long f47409m = 0L;

    /* renamed from: n, reason: collision with root package name */
    public boolean f47410n = false;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f47411o = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public String f47413q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f47414r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f47415s = 1;

    /* renamed from: gg.a$b */
    public enum b {
        CONNECTING,
        DISCONNECTED,
        RECONNECTED,
        CONNECTED
    }

    /* renamed from: gg.a$c */
    public class c implements InterfaceC6747b {

        /* renamed from: gg.a$c$a, reason: collision with other inner class name */
        public class C0706a extends TimerTask {
            public C0706a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C4379a.this.J();
                C4379a c4379a = C4379a.this;
                int i10 = c4379a.f47400d;
                if (i10 < 3) {
                    c4379a.f47400d = i10 + 1;
                }
                if (c4379a.f47397a != b.CONNECTED) {
                    c.this.l();
                }
            }
        }

        public c() {
        }

        @Override // wg.InterfaceC6747b
        public HashMap a() {
            return C4379a.this.f47398b.b();
        }

        @Override // wg.InterfaceC6747b
        public void b() {
            if (C4379a.this.f47398b != null) {
                C4379a.this.f47398b.j("connect started onConnectStart--->");
            }
        }

        @Override // wg.InterfaceC6747b
        public void c(Hashtable hashtable) {
            String str;
            try {
                Hashtable hashtable2 = new Hashtable();
                try {
                    Object obj = hashtable.get("msg");
                    Hashtable hashtable3 = obj instanceof Hashtable ? (Hashtable) obj : obj instanceof String ? (Hashtable) AbstractC6574b.d((String) obj) : null;
                    if (hashtable3 != null && hashtable3.containsKey("t") && (str = (String) hashtable3.get("t")) != null) {
                        hashtable2.put("t", str);
                    }
                } catch (Exception e10) {
                    Log.e("WMSLibrary", Log.getStackTraceString(e10));
                }
                if (C4379a.this.f47409m.longValue() != 0) {
                    if (C4379a.this.f47398b != null) {
                        C4379a.this.f47398b.j("onNetworkUp time --->" + (System.currentTimeMillis() - C4379a.this.f47409m.longValue()));
                    }
                    C4379a.this.f47409m = 0L;
                }
                C4379a.this.f47397a = b.CONNECTED;
                C4379a c4379a = C4379a.this;
                c4379a.f47402f = false;
                if (c4379a.f47408l != null) {
                    C4379a.this.f47408l.cancel();
                    C4379a.this.f47408l.purge();
                }
                C4379a c4379a2 = C4379a.this;
                c4379a2.f47400d = 0;
                c4379a2.f47398b.k(hashtable2);
            } catch (Exception e11) {
                Log.e("WMSLibrary", Log.getStackTraceString(e11));
            }
        }

        @Override // wg.InterfaceC6747b
        public void d(String str) {
            if (C4379a.this.f47398b != null) {
                C4379a.this.f47398b.j(str);
            }
        }

        @Override // wg.InterfaceC6747b
        public HashMap e() {
            return C4379a.this.f47398b.c();
        }

        @Override // wg.InterfaceC6747b
        public void f(Hashtable hashtable) {
            String str;
            try {
                Hashtable hashtable2 = new Hashtable();
                try {
                    Hashtable hashtable3 = (Hashtable) hashtable.get("msg");
                    if (hashtable3.containsKey("t") && (str = (String) hashtable3.get("t")) != null) {
                        hashtable2.put("t", str);
                    }
                } catch (Exception e10) {
                    Log.e("WMSLibrary", Log.getStackTraceString(e10));
                }
                if (C4379a.this.f47409m.longValue() != 0) {
                    if (C4379a.this.f47398b != null) {
                        C4379a.this.f47398b.j("onReconnect time --->" + (System.currentTimeMillis() - C4379a.this.f47409m.longValue()));
                    }
                    C4379a.this.f47409m = 0L;
                }
                C4379a.this.f47397a = b.CONNECTED;
                C4379a c4379a = C4379a.this;
                c4379a.f47402f = false;
                if (c4379a.f47408l != null) {
                    C4379a.this.f47408l.cancel();
                    C4379a.this.f47408l.purge();
                }
                C4379a c4379a2 = C4379a.this;
                c4379a2.f47400d = 0;
                c4379a2.f47398b.n(hashtable2);
            } catch (Exception e11) {
                Log.e("WMSLibrary", Log.getStackTraceString(e11));
            }
        }

        @Override // wg.InterfaceC6747b
        public void g() {
            if (C4379a.this.f47398b != null) {
                C4379a.this.f47398b.j("connect started onBeforeConnect--->");
            }
            C4379a.this.f47398b.g();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(47:878|879|(3:1305|1306|1307)(1:881)|882|(1:884)|885|(1:887)|888|(1:890)|891|892|(1:894)|(1:896)|(1:898)|(2:899|900)|(2:902|(34:904|905|906|907|908|909|(1:911)|912|(2:914|915)(1:1297)|916|(31:918|919|920|(2:922|923)|925|926|927|(1:929)|930|(4:932|933|934|935)(1:1290)|936|(1:938)|940|941|942|(1:944)|946|947|948|(1:950)|952|953|954|(1:956)|957|(4:959|960|961|962)(1:1280)|963|964|965|(1:967)|969)(1:1296)|970|(1:972)|973|974|(1:976)|977|978|979|980|981|(4:983|984|985|986)(1:1267)|987|(1:989)|990|(1:992)|993|(1:995)|997|(1:999)(1:1263)|1000|(86:1003|(1:1005)|1010|(1:1012)|1013|(1:1015)|1016|(1:1018)|1019|(2:1021|1022)(1:1259)|1023|1024|1025|(1:1255)(4:1029|1030|1031|1032)|1033|(1:1035)|1036|1037|(2:1039|1040)|1041|(2:1043|1044)(1:1251)|1045|(1:1047)|1048|1049|(1:1051)|1052|1053|(1:1055)|1056|1057|(1:1059)|1060|(1:1062)|1063|(1:1065)|1066|1067|(1:1069)|1070|(1:1072)|1073|1074|(1:1076)|1077|1078|(1:1080)|1081|1082|1083|1084|1085|(4:1087|1088|1089|1090)(1:1244)|1091|(1:1093)|1094|(1:1096)|1097|(1:1099)|1100|(1:1102)|1103|1104|(26:1106|1107|1108|(2:1110|1111)|1112|1113|1114|(1:1116)|1117|1118|1119|(1:1121)|1122|1123|1124|(1:1126)|1127|1128|1129|(1:1131)|1132|(4:1134|1135|1136|1137)(1:1222)|1138|1139|1140|(1:1142))(1:1239)|(1:1144)|(1:1146)|1147|1148|(1:1212)(4:1152|1153|1154|1155)|1156|1157|1158|(1:1160)(2:1202|(1:1204))|1161|(1:1163)|(1:1165)|1166|1167|1168|1169|1170|(3:1172|1173|(5:1186|1187|(2:1190|1188)|1191|1192)(5:1175|(3:1177|(3:1180|1181|1178)|1182)|1183|1184|1185))(1:1198)|1193|1194|1185|1001)|1260|1261))|1302|908|909|(0)|912|(0)(0)|916|(0)(0)|970|(0)|973|974|(0)|977|978|979|980|981|(0)(0)|987|(0)|990|(0)|993|(0)|997|(0)(0)|1000|(1:1001)|1260|1261) */
        /* JADX WARN: Can't wrap try/catch for region: R(57:864|865|(1:867)(1:1314)|868|(1:870)(1:1313)|871|(1:873)(1:1312)|874|(2:876|877)(1:1311)|878|879|(3:1305|1306|1307)(1:881)|882|(1:884)|885|(1:887)|888|(1:890)|891|892|(1:894)|(1:896)|(1:898)|899|900|(2:902|(34:904|905|906|907|908|909|(1:911)|912|(2:914|915)(1:1297)|916|(31:918|919|920|(2:922|923)|925|926|927|(1:929)|930|(4:932|933|934|935)(1:1290)|936|(1:938)|940|941|942|(1:944)|946|947|948|(1:950)|952|953|954|(1:956)|957|(4:959|960|961|962)(1:1280)|963|964|965|(1:967)|969)(1:1296)|970|(1:972)|973|974|(1:976)|977|978|979|980|981|(4:983|984|985|986)(1:1267)|987|(1:989)|990|(1:992)|993|(1:995)|997|(1:999)(1:1263)|1000|(86:1003|(1:1005)|1010|(1:1012)|1013|(1:1015)|1016|(1:1018)|1019|(2:1021|1022)(1:1259)|1023|1024|1025|(1:1255)(4:1029|1030|1031|1032)|1033|(1:1035)|1036|1037|(2:1039|1040)|1041|(2:1043|1044)(1:1251)|1045|(1:1047)|1048|1049|(1:1051)|1052|1053|(1:1055)|1056|1057|(1:1059)|1060|(1:1062)|1063|(1:1065)|1066|1067|(1:1069)|1070|(1:1072)|1073|1074|(1:1076)|1077|1078|(1:1080)|1081|1082|1083|1084|1085|(4:1087|1088|1089|1090)(1:1244)|1091|(1:1093)|1094|(1:1096)|1097|(1:1099)|1100|(1:1102)|1103|1104|(26:1106|1107|1108|(2:1110|1111)|1112|1113|1114|(1:1116)|1117|1118|1119|(1:1121)|1122|1123|1124|(1:1126)|1127|1128|1129|(1:1131)|1132|(4:1134|1135|1136|1137)(1:1222)|1138|1139|1140|(1:1142))(1:1239)|(1:1144)|(1:1146)|1147|1148|(1:1212)(4:1152|1153|1154|1155)|1156|1157|1158|(1:1160)(2:1202|(1:1204))|1161|(1:1163)|(1:1165)|1166|1167|1168|1169|1170|(3:1172|1173|(5:1186|1187|(2:1190|1188)|1191|1192)(5:1175|(3:1177|(3:1180|1181|1178)|1182)|1183|1184|1185))(1:1198)|1193|1194|1185|1001)|1260|1261))|1302|908|909|(0)|912|(0)(0)|916|(0)(0)|970|(0)|973|974|(0)|977|978|979|980|981|(0)(0)|987|(0)|990|(0)|993|(0)|997|(0)(0)|1000|(1:1001)|1260|1261) */
        /* JADX WARN: Can't wrap try/catch for region: R(71:116|117|(2:565|566)(1:119)|120|121|(2:123|124)(1:564)|125|(1:127)|128|(2:130|131)(1:563)|132|(2:134|135)(1:562)|136|(2:138|139)(1:561)|140|(2:142|143)(1:560)|144|(2:146|147)(1:559)|148|(2:150|151)(1:558)|152|(2:154|155)(1:557)|156|(2:158|159)(1:556)|160|(2:162|163)(1:555)|164|(2:166|167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)|(1:181)|(1:183)|(2:184|185)|(2:187|(34:189|190|191|192|193|(1:195)|196|(2:198|199)(1:547)|200|(29:202|203|204|(2:206|207)(1:543)|208|209|(1:211)|212|(4:214|215|216|217)(1:537)|218|(1:220)|222|223|224|(1:226)|228|229|230|(1:232)|234|235|236|(1:238)|239|(4:241|242|243|244)(1:525)|245|246|247|(1:249))(1:546)|251|252|(1:254)|255|256|(1:258)|259|260|261|262|263|(4:265|266|267|268)(1:512)|269|(1:271)|272|(1:274)|275|(1:277)|279|(1:281)(1:508)|282|(87:285|(1:287)|293|294|(1:296)|297|(1:299)|300|(1:302)|303|304|(2:306|307)(1:504)|308|(1:310)|311|312|313|314|(1:500)(4:318|319|320|321)|322|323|324|325|(1:327)(2:490|(1:492))|328|329|(19:451|452|(1:454)|455|(1:457)|458|(4:460|461|462|463)(1:486)|464|(1:466)|467|(1:469)|470|(1:472)|473|(1:475)|476|(1:478)|479|(1:481))(1:331)|332|(1:334)|335|336|(2:338|339)(1:450)|340|(2:342|343)(1:449)|344|(1:346)|347|348|(1:350)|351|352|(1:354)|355|356|(1:358)|359|(1:361)|(1:363)|364|365|(1:367)|368|369|(1:371)|372|373|(1:375)|376|377|(1:379)|380|381|(1:383)|384|385|(1:387)|388|389|390|391|392|(4:394|395|396|397)(1:442)|398|(1:400)|401|(1:403)|404|(1:406)|407|(1:409)|(1:411)|(1:413)|414|415|(2:417|(5:419|(2:422|420)|423|424|425)(4:427|(3:429|(2:432|430)|433)|434|435))(2:436|437)|426|283)|505|506))|552|193|(0)|196|(0)(0)|200|(0)(0)|251|252|(0)|255|256|(0)|259|260|261|262|263|(0)(0)|269|(0)|272|(0)|275|(0)|279|(0)(0)|282|(1:283)|505|506) */
        /* JADX WARN: Can't wrap try/catch for region: R(72:115|116|117|(2:565|566)(1:119)|120|121|(2:123|124)(1:564)|125|(1:127)|128|(2:130|131)(1:563)|132|(2:134|135)(1:562)|136|(2:138|139)(1:561)|140|(2:142|143)(1:560)|144|(2:146|147)(1:559)|148|(2:150|151)(1:558)|152|(2:154|155)(1:557)|156|(2:158|159)(1:556)|160|(2:162|163)(1:555)|164|(2:166|167)|168|(1:170)|171|(1:173)|174|(1:176)|177|(1:179)|(1:181)|(1:183)|(2:184|185)|(2:187|(34:189|190|191|192|193|(1:195)|196|(2:198|199)(1:547)|200|(29:202|203|204|(2:206|207)(1:543)|208|209|(1:211)|212|(4:214|215|216|217)(1:537)|218|(1:220)|222|223|224|(1:226)|228|229|230|(1:232)|234|235|236|(1:238)|239|(4:241|242|243|244)(1:525)|245|246|247|(1:249))(1:546)|251|252|(1:254)|255|256|(1:258)|259|260|261|262|263|(4:265|266|267|268)(1:512)|269|(1:271)|272|(1:274)|275|(1:277)|279|(1:281)(1:508)|282|(87:285|(1:287)|293|294|(1:296)|297|(1:299)|300|(1:302)|303|304|(2:306|307)(1:504)|308|(1:310)|311|312|313|314|(1:500)(4:318|319|320|321)|322|323|324|325|(1:327)(2:490|(1:492))|328|329|(19:451|452|(1:454)|455|(1:457)|458|(4:460|461|462|463)(1:486)|464|(1:466)|467|(1:469)|470|(1:472)|473|(1:475)|476|(1:478)|479|(1:481))(1:331)|332|(1:334)|335|336|(2:338|339)(1:450)|340|(2:342|343)(1:449)|344|(1:346)|347|348|(1:350)|351|352|(1:354)|355|356|(1:358)|359|(1:361)|(1:363)|364|365|(1:367)|368|369|(1:371)|372|373|(1:375)|376|377|(1:379)|380|381|(1:383)|384|385|(1:387)|388|389|390|391|392|(4:394|395|396|397)(1:442)|398|(1:400)|401|(1:403)|404|(1:406)|407|(1:409)|(1:411)|(1:413)|414|415|(2:417|(5:419|(2:422|420)|423|424|425)(4:427|(3:429|(2:432|430)|433)|434|435))(2:436|437)|426|283)|505|506))|552|193|(0)|196|(0)(0)|200|(0)(0)|251|252|(0)|255|256|(0)|259|260|261|262|263|(0)(0)|269|(0)|272|(0)|275|(0)|279|(0)(0)|282|(1:283)|505|506) */
        /* JADX WARN: Code restructure failed: missing block: B:1269:0x0e71, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1270:0x0e72, code lost:
        
            r26 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1272:0x0ea9, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:1273:0x0eaa, code lost:
        
            r20 = "schMsgInfo";
         */
        /* JADX WARN: Code restructure failed: missing block: B:514:0x0667, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:515:0x0668, code lost:
        
            r23 = "ht";
         */
        /* JADX WARN: Code restructure failed: missing block: B:517:0x069f, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:518:0x06a0, code lost:
        
            r23 = "ht";
            r20 = "schMsgInfo";
         */
        /* JADX WARN: Not initialized variable reg: 33, insn: 0x169f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r33 I:??[OBJECT, ARRAY]), block:B:833:0x169f */
        /* JADX WARN: Removed duplicated region for block: B:1003:0x0ed9 A[Catch: Exception -> 0x1315, TRY_LEAVE, TryCatch #27 {Exception -> 0x1315, blocks: (B:879:0x0c86, B:882:0x0ca2, B:885:0x0caf, B:888:0x0cbc, B:892:0x0ccd, B:909:0x0d17, B:912:0x0d26, B:916:0x0d3b, B:970:0x0e34, B:974:0x0e45, B:997:0x0eb4, B:1000:0x0ecd, B:1001:0x0ed3, B:1003:0x0ed9, B:1010:0x0eee, B:1013:0x0efb, B:1016:0x0f0d, B:1019:0x0f1f, B:1023:0x0f33, B:1033:0x0f69, B:1037:0x0f7d, B:1041:0x0f8a, B:1045:0x0f9a, B:1049:0x0fae, B:1053:0x0fbe, B:1057:0x0fd2, B:1060:0x0fe1, B:1063:0x1002, B:1067:0x1013, B:1070:0x1020, B:1074:0x1031, B:1078:0x1042, B:1100:0x10b2, B:1104:0x10c6, B:1167:0x1211, B:1208:0x11f7, B:1211:0x11bd, B:1243:0x10ab, B:1254:0x0f62, B:1263:0x0eca, B:1266:0x0ead, B:1300:0x0d0f, B:1158:0x11c5, B:1160:0x11cd, B:1202:0x11df, B:1204:0x11e7), top: B:878:0x0c86, inners: #13 }] */
        /* JADX WARN: Removed duplicated region for block: B:1035:0x0f71 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1039:0x0f83 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1043:0x0f90 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1047:0x0fa2 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1051:0x0fb4 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1055:0x0fc6 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1059:0x0fd8 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1062:0x0ffb A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1065:0x1008 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1069:0x1019 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1072:0x1026 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1076:0x1037 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1080:0x1048 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1087:0x105e  */
        /* JADX WARN: Removed duplicated region for block: B:1093:0x107c A[Catch: Exception -> 0x106c, TryCatch #5 {Exception -> 0x106c, blocks: (B:1090:0x1062, B:1091:0x1074, B:1093:0x107c, B:1094:0x1087, B:1096:0x108f, B:1097:0x109a, B:1099:0x10a0), top: B:1089:0x1062 }] */
        /* JADX WARN: Removed duplicated region for block: B:1096:0x108f A[Catch: Exception -> 0x106c, TryCatch #5 {Exception -> 0x106c, blocks: (B:1090:0x1062, B:1091:0x1074, B:1093:0x107c, B:1094:0x1087, B:1096:0x108f, B:1097:0x109a, B:1099:0x10a0), top: B:1089:0x1062 }] */
        /* JADX WARN: Removed duplicated region for block: B:1099:0x10a0 A[Catch: Exception -> 0x106c, TRY_LEAVE, TryCatch #5 {Exception -> 0x106c, blocks: (B:1090:0x1062, B:1091:0x1074, B:1093:0x107c, B:1094:0x1087, B:1096:0x108f, B:1097:0x109a, B:1099:0x10a0), top: B:1089:0x1062 }] */
        /* JADX WARN: Removed duplicated region for block: B:1102:0x10ba A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1106:0x10d0  */
        /* JADX WARN: Removed duplicated region for block: B:1144:0x118c A[Catch: Exception -> 0x0c99, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1146:0x1191 A[Catch: Exception -> 0x0c99, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1150:0x119c A[Catch: Exception -> 0x11b6, TryCatch #45 {Exception -> 0x11b6, blocks: (B:1148:0x1194, B:1150:0x119c), top: B:1147:0x1194 }] */
        /* JADX WARN: Removed duplicated region for block: B:1160:0x11cd A[Catch: Exception -> 0x11dd, TryCatch #13 {Exception -> 0x11dd, blocks: (B:1158:0x11c5, B:1160:0x11cd, B:1202:0x11df, B:1204:0x11e7), top: B:1157:0x11c5, outer: #27 }] */
        /* JADX WARN: Removed duplicated region for block: B:1163:0x1201 A[Catch: Exception -> 0x0c99, TRY_ENTER, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1165:0x120c A[Catch: Exception -> 0x0c99, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:1172:0x122d A[Catch: Exception -> 0x12da, TRY_LEAVE, TryCatch #15 {Exception -> 0x12da, blocks: (B:1170:0x1219, B:1172:0x122d), top: B:1169:0x1219 }] */
        /* JADX WARN: Removed duplicated region for block: B:1198:0x12de  */
        /* JADX WARN: Removed duplicated region for block: B:1202:0x11df A[Catch: Exception -> 0x11dd, TryCatch #13 {Exception -> 0x11dd, blocks: (B:1158:0x11c5, B:1160:0x11cd, B:1202:0x11df, B:1204:0x11e7), top: B:1157:0x11c5, outer: #27 }] */
        /* JADX WARN: Removed duplicated region for block: B:1239:0x1182  */
        /* JADX WARN: Removed duplicated region for block: B:1244:0x1072  */
        /* JADX WARN: Removed duplicated region for block: B:1251:0x0f98  */
        /* JADX WARN: Removed duplicated region for block: B:1263:0x0eca A[Catch: Exception -> 0x1315, TRY_ENTER, TryCatch #27 {Exception -> 0x1315, blocks: (B:879:0x0c86, B:882:0x0ca2, B:885:0x0caf, B:888:0x0cbc, B:892:0x0ccd, B:909:0x0d17, B:912:0x0d26, B:916:0x0d3b, B:970:0x0e34, B:974:0x0e45, B:997:0x0eb4, B:1000:0x0ecd, B:1001:0x0ed3, B:1003:0x0ed9, B:1010:0x0eee, B:1013:0x0efb, B:1016:0x0f0d, B:1019:0x0f1f, B:1023:0x0f33, B:1033:0x0f69, B:1037:0x0f7d, B:1041:0x0f8a, B:1045:0x0f9a, B:1049:0x0fae, B:1053:0x0fbe, B:1057:0x0fd2, B:1060:0x0fe1, B:1063:0x1002, B:1067:0x1013, B:1070:0x1020, B:1074:0x1031, B:1078:0x1042, B:1100:0x10b2, B:1104:0x10c6, B:1167:0x1211, B:1208:0x11f7, B:1211:0x11bd, B:1243:0x10ab, B:1254:0x0f62, B:1263:0x0eca, B:1266:0x0ead, B:1300:0x0d0f, B:1158:0x11c5, B:1160:0x11cd, B:1202:0x11df, B:1204:0x11e7), top: B:878:0x0c86, inners: #13 }] */
        /* JADX WARN: Removed duplicated region for block: B:1267:0x0e75  */
        /* JADX WARN: Removed duplicated region for block: B:1296:0x0e2c  */
        /* JADX WARN: Removed duplicated region for block: B:1297:0x0d39  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x04e6 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x04f7 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0630 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:258:0x0641 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:265:0x0657  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x0675 A[Catch: Exception -> 0x0665, TryCatch #22 {Exception -> 0x0665, blocks: (B:268:0x065b, B:269:0x066d, B:271:0x0675, B:272:0x0680, B:274:0x0688, B:275:0x0693, B:277:0x0699), top: B:267:0x065b }] */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0688 A[Catch: Exception -> 0x0665, TryCatch #22 {Exception -> 0x0665, blocks: (B:268:0x065b, B:269:0x066d, B:271:0x0675, B:272:0x0680, B:274:0x0688, B:275:0x0693, B:277:0x0699), top: B:267:0x065b }] */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0699 A[Catch: Exception -> 0x0665, TRY_LEAVE, TryCatch #22 {Exception -> 0x0665, blocks: (B:268:0x065b, B:269:0x066d, B:271:0x0675, B:272:0x0680, B:274:0x0688, B:275:0x0693, B:277:0x0699), top: B:267:0x065b }] */
        /* JADX WARN: Removed duplicated region for block: B:281:0x06b8 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:285:0x06d0 A[Catch: Exception -> 0x0b31, TRY_LEAVE, TryCatch #50 {Exception -> 0x0b31, blocks: (B:117:0x0350, B:121:0x0385, B:125:0x0396, B:128:0x03a3, B:132:0x03b8, B:136:0x03cd, B:140:0x03de, B:144:0x03f3, B:148:0x0406, B:152:0x0419, B:156:0x042e, B:160:0x0441, B:164:0x0456, B:168:0x0472, B:171:0x047f, B:174:0x048c, B:177:0x0499, B:193:0x04e0, B:196:0x04ef, B:200:0x0504, B:252:0x062a, B:256:0x063b, B:279:0x06ab, B:282:0x06c4, B:283:0x06ca, B:285:0x06d0, B:294:0x06e9, B:297:0x06f6, B:300:0x0708, B:304:0x071e, B:308:0x0732, B:312:0x0745, B:322:0x077f, B:329:0x07d2, B:332:0x0884, B:336:0x0898, B:340:0x08b2, B:344:0x08c6, B:348:0x08de, B:352:0x08ee, B:356:0x0902, B:365:0x0933, B:369:0x0944, B:373:0x0955, B:377:0x0966, B:381:0x0977, B:385:0x0988, B:407:0x09f7, B:441:0x09f0, B:496:0x07ca, B:499:0x0778, B:508:0x06c1, B:511:0x06a4, B:550:0x04d9, B:325:0x0794, B:327:0x079c, B:490:0x07ae, B:492:0x07b6), top: B:116:0x0350, inners: #41 }] */
        /* JADX WARN: Removed duplicated region for block: B:327:0x079c A[Catch: Exception -> 0x07ac, TryCatch #41 {Exception -> 0x07ac, blocks: (B:325:0x0794, B:327:0x079c, B:490:0x07ae, B:492:0x07b6), top: B:324:0x0794, outer: #50 }] */
        /* JADX WARN: Removed duplicated region for block: B:331:0x0882  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x088c A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:338:0x089e A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:342:0x08b8 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:346:0x08ce A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:350:0x08e4 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:354:0x08f6 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:358:0x090a A[Catch: Exception -> 0x037e, TRY_ENTER, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:361:0x0923 A[Catch: Exception -> 0x037e, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:363:0x092e A[Catch: Exception -> 0x037e, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:367:0x0939 A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:371:0x094a A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:375:0x095b A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:379:0x096c A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:383:0x097d A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:387:0x098e A[Catch: Exception -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:394:0x09a4  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x09c2 A[Catch: Exception -> 0x09b2, TryCatch #48 {Exception -> 0x09b2, blocks: (B:397:0x09a8, B:398:0x09ba, B:400:0x09c2, B:401:0x09cd, B:403:0x09d5, B:404:0x09e0, B:406:0x09e6), top: B:396:0x09a8 }] */
        /* JADX WARN: Removed duplicated region for block: B:403:0x09d5 A[Catch: Exception -> 0x09b2, TryCatch #48 {Exception -> 0x09b2, blocks: (B:397:0x09a8, B:398:0x09ba, B:400:0x09c2, B:401:0x09cd, B:403:0x09d5, B:404:0x09e0, B:406:0x09e6), top: B:396:0x09a8 }] */
        /* JADX WARN: Removed duplicated region for block: B:406:0x09e6 A[Catch: Exception -> 0x09b2, TRY_LEAVE, TryCatch #48 {Exception -> 0x09b2, blocks: (B:397:0x09a8, B:398:0x09ba, B:400:0x09c2, B:401:0x09cd, B:403:0x09d5, B:404:0x09e0, B:406:0x09e6), top: B:396:0x09a8 }] */
        /* JADX WARN: Removed duplicated region for block: B:409:0x09ff A[Catch: Exception -> 0x037e, TRY_ENTER, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:411:0x0a0b A[Catch: Exception -> 0x037e, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:413:0x0a10 A[Catch: Exception -> 0x037e, TRY_LEAVE, TryCatch #31 {Exception -> 0x037e, blocks: (B:566:0x036f, B:123:0x038b, B:127:0x039c, B:130:0x03ab, B:134:0x03c0, B:138:0x03d3, B:142:0x03e6, B:146:0x03f9, B:150:0x040c, B:154:0x0421, B:158:0x0434, B:162:0x0449, B:166:0x045e, B:170:0x0478, B:173:0x0485, B:176:0x0492, B:179:0x049f, B:181:0x04a8, B:183:0x04ad, B:195:0x04e6, B:198:0x04f7, B:254:0x0630, B:258:0x0641, B:281:0x06b8, B:287:0x06dd, B:296:0x06ef, B:299:0x06fe, B:302:0x0710, B:306:0x0724, B:310:0x0738, B:334:0x088c, B:338:0x089e, B:342:0x08b8, B:346:0x08ce, B:350:0x08e4, B:354:0x08f6, B:358:0x090a, B:361:0x0923, B:363:0x092e, B:367:0x0939, B:371:0x094a, B:375:0x095b, B:379:0x096c, B:383:0x097d, B:387:0x098e, B:409:0x09ff, B:411:0x0a0b, B:413:0x0a10, B:485:0x087a, B:520:0x060a), top: B:565:0x036f }] */
        /* JADX WARN: Removed duplicated region for block: B:417:0x0a27 A[Catch: Exception -> 0x0a6d, TryCatch #4 {Exception -> 0x0a6d, blocks: (B:415:0x0a15, B:417:0x0a27, B:419:0x0a2f, B:420:0x0a33, B:422:0x0a39, B:427:0x0a81, B:429:0x0a95, B:430:0x0a99, B:432:0x0a9f, B:570:0x0b3c), top: B:113:0x034c }] */
        /* JADX WARN: Removed duplicated region for block: B:436:0x0aea  */
        /* JADX WARN: Removed duplicated region for block: B:442:0x09b8  */
        /* JADX WARN: Removed duplicated region for block: B:449:0x08c2  */
        /* JADX WARN: Removed duplicated region for block: B:450:0x08ab  */
        /* JADX WARN: Removed duplicated region for block: B:451:0x07da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x1b40 A[Catch: Exception -> 0x132e, TRY_LEAVE, TryCatch #40 {Exception -> 0x132e, blocks: (B:45:0x1b38, B:47:0x1b40, B:1009:0x1325, B:573:0x1331, B:575:0x134b, B:577:0x1399, B:578:0x139d, B:580:0x13a3, B:591:0x13b1, B:583:0x13ba, B:586:0x13c2, B:594:0x13cb, B:596:0x13d3, B:598:0x13fd, B:600:0x1407, B:601:0x140f, B:603:0x1417, B:604:0x141f, B:606:0x1427, B:607:0x1430, B:609:0x144e, B:611:0x1454, B:612:0x145a, B:614:0x1469, B:616:0x1476, B:618:0x1480, B:619:0x1485, B:621:0x1497, B:622:0x149b, B:624:0x14a1, B:627:0x14b1, B:629:0x14b9, B:631:0x14e3, B:633:0x14ed, B:634:0x14f5, B:636:0x14fd, B:637:0x1505, B:639:0x150d, B:640:0x1516, B:642:0x1534, B:644:0x153a, B:645:0x1540, B:647:0x154f, B:649:0x155c, B:651:0x1566, B:652:0x156b, B:654:0x157d, B:655:0x1581, B:657:0x1587, B:660:0x1597, B:662:0x159f, B:664:0x15d5, B:665:0x15d9, B:667:0x15df, B:669:0x15e9, B:671:0x15f1, B:673:0x1627, B:674:0x162b, B:676:0x1631, B:678:0x163b, B:758:0x1a81, B:761:0x1a8c, B:763:0x1a94, B:768:0x1ab6, B:770:0x1abe, B:775:0x1af3, B:777:0x1aff, B:778:0x1ace, B:780:0x1adc, B:781:0x1aee, B:783:0x1b0b, B:785:0x1b19, B:787:0x1b29, B:788:0x1b32, B:753:0x1a6e), top: B:17:0x007c, inners: #32 }] */
        /* JADX WARN: Removed duplicated region for block: B:490:0x07ae A[Catch: Exception -> 0x07ac, TryCatch #41 {Exception -> 0x07ac, blocks: (B:325:0x0794, B:327:0x079c, B:490:0x07ae, B:492:0x07b6), top: B:324:0x0794, outer: #50 }] */
        /* JADX WARN: Removed duplicated region for block: B:508:0x06c1 A[Catch: Exception -> 0x0b31, TRY_ENTER, TryCatch #50 {Exception -> 0x0b31, blocks: (B:117:0x0350, B:121:0x0385, B:125:0x0396, B:128:0x03a3, B:132:0x03b8, B:136:0x03cd, B:140:0x03de, B:144:0x03f3, B:148:0x0406, B:152:0x0419, B:156:0x042e, B:160:0x0441, B:164:0x0456, B:168:0x0472, B:171:0x047f, B:174:0x048c, B:177:0x0499, B:193:0x04e0, B:196:0x04ef, B:200:0x0504, B:252:0x062a, B:256:0x063b, B:279:0x06ab, B:282:0x06c4, B:283:0x06ca, B:285:0x06d0, B:294:0x06e9, B:297:0x06f6, B:300:0x0708, B:304:0x071e, B:308:0x0732, B:312:0x0745, B:322:0x077f, B:329:0x07d2, B:332:0x0884, B:336:0x0898, B:340:0x08b2, B:344:0x08c6, B:348:0x08de, B:352:0x08ee, B:356:0x0902, B:365:0x0933, B:369:0x0944, B:373:0x0955, B:377:0x0966, B:381:0x0977, B:385:0x0988, B:407:0x09f7, B:441:0x09f0, B:496:0x07ca, B:499:0x0778, B:508:0x06c1, B:511:0x06a4, B:550:0x04d9, B:325:0x0794, B:327:0x079c, B:490:0x07ae, B:492:0x07b6), top: B:116:0x0350, inners: #41 }] */
        /* JADX WARN: Removed duplicated region for block: B:512:0x066b  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:546:0x0612  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x0502  */
        /* JADX WARN: Removed duplicated region for block: B:911:0x0d1d A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:914:0x0d2e A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:918:0x0d43  */
        /* JADX WARN: Removed duplicated region for block: B:972:0x0e3a A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:976:0x0e4b A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        /* JADX WARN: Removed duplicated region for block: B:983:0x0e61  */
        /* JADX WARN: Removed duplicated region for block: B:989:0x0e7f A[Catch: Exception -> 0x0e6f, TryCatch #1 {Exception -> 0x0e6f, blocks: (B:986:0x0e65, B:987:0x0e77, B:989:0x0e7f, B:990:0x0e8a, B:992:0x0e92, B:993:0x0e9d, B:995:0x0ea3), top: B:985:0x0e65 }] */
        /* JADX WARN: Removed duplicated region for block: B:992:0x0e92 A[Catch: Exception -> 0x0e6f, TryCatch #1 {Exception -> 0x0e6f, blocks: (B:986:0x0e65, B:987:0x0e77, B:989:0x0e7f, B:990:0x0e8a, B:992:0x0e92, B:993:0x0e9d, B:995:0x0ea3), top: B:985:0x0e65 }] */
        /* JADX WARN: Removed duplicated region for block: B:995:0x0ea3 A[Catch: Exception -> 0x0e6f, TRY_LEAVE, TryCatch #1 {Exception -> 0x0e6f, blocks: (B:986:0x0e65, B:987:0x0e77, B:989:0x0e7f, B:990:0x0e8a, B:992:0x0e92, B:993:0x0e9d, B:995:0x0ea3), top: B:985:0x0e65 }] */
        /* JADX WARN: Removed duplicated region for block: B:999:0x0ec1 A[Catch: Exception -> 0x0c99, TRY_ENTER, TRY_LEAVE, TryCatch #55 {Exception -> 0x0c99, blocks: (B:1306:0x0c8e, B:884:0x0ca8, B:887:0x0cb5, B:890:0x0cc2, B:894:0x0cd3, B:896:0x0cdc, B:898:0x0ce1, B:911:0x0d1d, B:914:0x0d2e, B:972:0x0e3a, B:976:0x0e4b, B:999:0x0ec1, B:1005:0x0ee6, B:1012:0x0ef4, B:1015:0x0f03, B:1018:0x0f15, B:1021:0x0f25, B:1035:0x0f71, B:1039:0x0f83, B:1043:0x0f90, B:1047:0x0fa2, B:1051:0x0fb4, B:1055:0x0fc6, B:1059:0x0fd8, B:1062:0x0ffb, B:1065:0x1008, B:1069:0x1019, B:1072:0x1026, B:1076:0x1037, B:1080:0x1048, B:1102:0x10ba, B:1144:0x118c, B:1146:0x1191, B:1163:0x1201, B:1165:0x120c, B:1218:0x117a, B:1275:0x0e24), top: B:1305:0x0c8e }] */
        @Override // wg.InterfaceC6747b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void h(Hashtable hashtable) {
            Integer valueOf;
            int intValue;
            long currentTimeMillis;
            long j10;
            int i10;
            c cVar;
            int i11;
            Hashtable hashtable2;
            Hashtable hashtable3;
            String str;
            boolean parseBoolean;
            boolean z10;
            String str2;
            Object obj;
            Object obj2;
            String str3;
            int i12;
            String str4;
            String str5;
            String str6;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Iterator it;
            Object obj7;
            String str7;
            Iterator it2;
            String str8;
            String str9;
            String str10;
            String str11;
            Object obj8;
            Object obj9;
            Object obj10;
            Object obj11;
            String str12;
            String str13;
            Object obj12;
            Object obj13;
            Object obj14;
            String str14;
            int i13;
            ArrayList arrayList;
            boolean z11;
            Hashtable hashtable4;
            String str15;
            String str16;
            String str17;
            String str18;
            Hashtable hashtable5;
            Hashtable hashtable6;
            Object obj15;
            int i14;
            String str19;
            String str20;
            String str21;
            String str22;
            boolean parseBoolean2;
            Object obj16;
            String str23;
            Object obj17;
            String str24;
            String str25;
            String str26;
            Object obj18;
            Object obj19;
            Object obj20;
            Object obj21;
            Object obj22;
            Object obj23;
            Object obj24;
            Object obj25;
            Object obj26;
            Object obj27;
            Object obj28;
            Iterator it3;
            Iterator it4;
            String str27;
            int i15;
            String str28;
            Object obj29;
            Object obj30;
            String str29;
            Object obj31;
            String str30;
            Object obj32;
            Object obj33;
            Object obj34;
            Object obj35;
            Object obj36;
            Object obj37;
            Object obj38;
            String str31;
            ArrayList arrayList2;
            boolean z12;
            String str32;
            String str33;
            String str34;
            String str35;
            Hashtable hashtable7;
            String str36;
            Hashtable hashtable8;
            Hashtable hashtable9;
            Hashtable hashtable10;
            Hashtable hashtable11;
            String str37 = "WMSLibrary";
            try {
                valueOf = Integer.valueOf(hashtable.get("mtype").toString());
                intValue = valueOf.intValue();
                currentTimeMillis = System.currentTimeMillis();
                try {
                    if (C4379a.this.f47398b != null && C4379a.this.f47398b.e()) {
                        C4379a.this.H();
                        C4379a.this.y();
                    }
                } catch (Exception e10) {
                    Log.e("WMSLibrary", Log.getStackTraceString(e10));
                }
                if (C4379a.this.f47409m.longValue() != 0 && C4379a.this.f47398b != null) {
                    C4379a.this.f47398b.j("onConnect first mtype --->" + intValue);
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                if (intValue == 0) {
                    if (C4379a.this.f47409m.longValue() != 0) {
                        if (C4379a.this.f47398b != null) {
                            C4379a.this.f47398b.j("onConnect time --->" + (System.currentTimeMillis() - C4379a.this.f47409m.longValue()));
                        }
                        C4379a.this.f47409m = 0L;
                    }
                    C4379a.this.f47397a = b.CONNECTED;
                    Hashtable hashtable12 = new Hashtable();
                    if (C4379a.this.f47398b != null) {
                        Hashtable hashtable13 = (Hashtable) hashtable.get("msg");
                        String str38 = (String) hashtable13.get("uname");
                        String str39 = (String) hashtable13.get("orgid");
                        String str40 = (String) hashtable13.get("rsid");
                        String str41 = (String) hashtable13.get("deprecated");
                        if (str41 != null) {
                            hashtable12.put("deprecated", str41);
                        }
                        String str42 = (String) hashtable13.get("nname");
                        if (str42 != null) {
                            hashtable12.put("nname", str42);
                        }
                        C4379a.this.f47404h = (String) hashtable13.get("xa");
                        String str43 = (String) hashtable13.get("emailid");
                        if (str43 != null) {
                            hashtable12.put("emailid", str43);
                        }
                        C4379a.this.f47403g = (String) hashtable13.get("sid");
                        String str44 = (String) hashtable13.get("t");
                        if (str44 != null) {
                            hashtable12.put("t", str44);
                        }
                        String str45 = (String) hashtable13.get("ttl");
                        if (str45 != null) {
                            hashtable12.put("ttl", str45);
                        }
                        C4379a.this.f47398b.h(str38, str39, str40, C4379a.this.f47403g, C4379a.this.f47404h, hashtable12);
                    }
                } else if (intValue != -3 && intValue != -4) {
                    if (intValue == -17) {
                        if (C4379a.this.f47398b != null && (hashtable11 = (Hashtable) hashtable.get("msg")) != null) {
                            String g10 = AbstractC6574b.g(hashtable11);
                            C4379a.this.f47398b.j("connect log | mType:-17 | msgStr:" + g10);
                        }
                        if (C4379a.this.f47412p != null && (hashtable10 = (Hashtable) hashtable.get("msg")) != null) {
                            C4379a.this.f47412p.d(valueOf, hashtable10);
                        }
                    } else if (intValue == -11) {
                        C4379a.this.f47410n = true;
                    } else {
                        String str46 = "chid";
                        Object obj39 = "title";
                        if (intValue == EnumC4204a.WM_JOIN.b()) {
                            Hashtable hashtable14 = (Hashtable) hashtable.get("msg");
                            String str47 = (String) hashtable14.get("ctype");
                            String str48 = (String) hashtable14.get("chid");
                            String str49 = (String) hashtable14.get("customgroup");
                            String str50 = (String) hashtable14.get("title");
                            String str51 = (String) hashtable14.get("history");
                            String str52 = (String) hashtable14.get("pcount");
                            String str53 = (String) hashtable14.get("blockpnsinterval");
                            ArrayList arrayList3 = (ArrayList) hashtable14.get("users");
                            String str54 = (String) hashtable14.get("persistannonusers");
                            String str55 = (String) hashtable14.get("creator");
                            String str56 = (String) hashtable14.get("addinfo");
                            Hashtable hashtable15 = new Hashtable();
                            if (hashtable14.containsKey("isfollower")) {
                                Boolean bool = (Boolean) hashtable14.get("isfollower");
                                bool.booleanValue();
                                hashtable15.put("isfollower", bool);
                            }
                            if (hashtable14.containsKey("parentchatid")) {
                                hashtable15.put("parentchatid", (String) hashtable14.get("parentchatid"));
                            }
                            if (hashtable14.containsKey("threadmsguid")) {
                                hashtable15.put("threadmsguid", (String) hashtable14.get("threadmsguid"));
                            }
                            Object obj40 = hashtable14.get("context");
                            if (obj40 != null) {
                                hashtable15.put("context", obj40);
                            }
                            if (str49 != null) {
                                hashtable15.put("customgroup", str49);
                            }
                            if (str54 != null) {
                                hashtable15.put("persistannonusers", Integer.valueOf(Integer.parseInt(str54)));
                            }
                            if (str55 != null && str55.trim().length() > 0) {
                                hashtable15.put("creator", str55);
                            }
                            String str57 = hashtable14.containsKey("subscribercount") ? (String) hashtable14.get("subscribercount") : null;
                            if (str57 != null && !str57.trim().isEmpty()) {
                                hashtable15.put("subscribercount", str57);
                            }
                            ArrayList arrayList4 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str47));
                            if (arrayList4 != null) {
                                Iterator it5 = arrayList4.iterator();
                                while (it5.hasNext()) {
                                    Hashtable hashtable16 = hashtable15;
                                    ((InterfaceC4282a) it5.next()).g(str48, str50, str51, arrayList3, str53, str56, str52, hashtable16);
                                    hashtable15 = hashtable16;
                                }
                            }
                        } else {
                            j10 = currentTimeMillis;
                            try {
                                if (intValue == EnumC4204a.WM_TXT_MSG.b()) {
                                    int i16 = intValue;
                                    try {
                                        Hashtable hashtable17 = new Hashtable();
                                        Hashtable hashtable18 = (Hashtable) hashtable.get("msg");
                                        Object obj41 = "msg";
                                        String str58 = (String) hashtable18.get("ctype");
                                        if (hashtable18.containsKey("nc")) {
                                            try {
                                                parseBoolean2 = Boolean.parseBoolean((String) hashtable18.get("nc"));
                                            } catch (Exception e12) {
                                                e = e12;
                                                Log.e(str37, Log.getStackTraceString(e));
                                            }
                                        } else {
                                            parseBoolean2 = false;
                                        }
                                        boolean z13 = parseBoolean2;
                                        String str59 = hashtable18.containsKey("chid") ? (String) hashtable18.get("chid") : null;
                                        if (hashtable18.containsKey("ismoderated")) {
                                            hashtable17.put("ismoderated", hashtable18.get("ismoderated"));
                                        }
                                        String str60 = hashtable18.containsKey("sender") ? (String) hashtable18.get("sender") : null;
                                        String str61 = hashtable18.containsKey("dname") ? (String) hashtable18.get("dname") : null;
                                        String str62 = hashtable18.containsKey("customgroup") ? (String) hashtable18.get("customgroup") : null;
                                        String str63 = hashtable18.containsKey(m.f13664a) ? (String) hashtable18.get(m.f13664a) : null;
                                        if (hashtable18.containsKey(C4527h.f48087o)) {
                                            obj16 = "customgroup";
                                            str23 = (String) hashtable18.get(C4527h.f48087o);
                                        } else {
                                            obj16 = "customgroup";
                                            str23 = null;
                                        }
                                        if (hashtable18.containsKey("ht")) {
                                            obj17 = "ismoderated";
                                            str24 = (String) hashtable18.get("ht");
                                        } else {
                                            obj17 = "ismoderated";
                                            str24 = null;
                                        }
                                        String str64 = hashtable18.containsKey("history") ? (String) hashtable18.get("history") : null;
                                        String valueOf2 = hashtable18.containsKey("time") ? String.valueOf(hashtable18.get("time")) : null;
                                        String str65 = hashtable18.containsKey("mod") ? (String) hashtable18.get("mod") : null;
                                        if (hashtable18.containsKey("mtype")) {
                                            i16 = Integer.valueOf(AbstractC6574b.g(hashtable18.get("mtype"))).intValue();
                                        }
                                        if (hashtable18.containsKey("reply_to")) {
                                            hashtable17.put("reply_to", hashtable18.get("reply_to"));
                                        }
                                        if (hashtable18.containsKey("lmsgaddinfo")) {
                                            hashtable17.put("lmsgaddinfo", hashtable18.get("lmsgaddinfo"));
                                        }
                                        if (hashtable18.containsKey("lmsgtime")) {
                                            hashtable17.put("lmsgtime", hashtable18.get("lmsgtime"));
                                        }
                                        if (hashtable18.containsKey("lmsguid")) {
                                            hashtable17.put("lmsguid", hashtable18.get("lmsguid"));
                                        }
                                        if (str23 != null) {
                                            hashtable17.put(C4527h.f48087o, str23);
                                        }
                                        if (str24 != null) {
                                            hashtable17.put("ht", str24);
                                        }
                                        try {
                                        } catch (Exception e13) {
                                            e = e13;
                                            str25 = str24;
                                        }
                                        if (hashtable18.containsKey("includesenderinunread")) {
                                            if (((Boolean) hashtable18.get("includesenderinunread")).booleanValue()) {
                                                str25 = str24;
                                                try {
                                                    hashtable17.put("unread", Boolean.TRUE);
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                    if (hashtable18.containsKey("title")) {
                                                    }
                                                    if (hashtable18.containsKey("addinfo")) {
                                                    }
                                                    if (str58.equals("11")) {
                                                    }
                                                    Object obj42 = "time";
                                                    if (hashtable18.containsKey("temp_info")) {
                                                    }
                                                    Object obj43 = "temp_info";
                                                    if (hashtable18.containsKey("schMsgInfo")) {
                                                    }
                                                    hashtable9 = new Hashtable();
                                                    Object obj44 = "schMsgInfo";
                                                    if (hashtable18.containsKey("language_detection_version")) {
                                                    }
                                                    if (hashtable18.containsKey("detected_language")) {
                                                    }
                                                    if (hashtable18.containsKey("translation")) {
                                                    }
                                                    if (!hashtable9.isEmpty()) {
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    if (hashtable18.containsKey("msglist")) {
                                                    }
                                                    it3 = arrayList5.iterator();
                                                    String str66 = str25;
                                                    while (it3.hasNext()) {
                                                    }
                                                    cVar = this;
                                                    i11 = i16;
                                                    if (C4379a.this.f47398b == null) {
                                                    }
                                                }
                                                if (hashtable18.containsKey("title")) {
                                                    hashtable17.put("title", (String) hashtable18.get("title"));
                                                }
                                                String str67 = hashtable18.containsKey("addinfo") ? (String) hashtable18.get("addinfo") : null;
                                                if (str58.equals("11")) {
                                                    obj21 = "threadchatid";
                                                    try {
                                                        if (hashtable18.containsKey(obj21)) {
                                                            str26 = str23;
                                                            obj18 = "channelData";
                                                            str59 = (String) hashtable18.get(obj21);
                                                        } else {
                                                            str26 = str23;
                                                            obj18 = "channelData";
                                                        }
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        str26 = str23;
                                                        obj18 = "channelData";
                                                    }
                                                    try {
                                                        if (hashtable18.containsKey(obj18)) {
                                                            hashtable17.put(obj18, hashtable18.get(obj18));
                                                        }
                                                        if (hashtable18.containsKey("isfirstthreadmessage")) {
                                                            obj22 = "lmsguid";
                                                            try {
                                                                hashtable17.put("isfirstthreadmessage", hashtable18.get("isfirstthreadmessage"));
                                                            } catch (Exception e16) {
                                                                e = e16;
                                                                obj19 = "reply_to";
                                                                obj20 = "pcount";
                                                                obj23 = "parentchatid";
                                                                obj24 = "lmsgtime";
                                                                obj25 = "parentmsguid";
                                                                obj26 = "lmsgaddinfo";
                                                                obj27 = "parentmessagesenderid";
                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                Object obj422 = "time";
                                                                if (hashtable18.containsKey("temp_info")) {
                                                                }
                                                                Object obj432 = "temp_info";
                                                                if (hashtable18.containsKey("schMsgInfo")) {
                                                                }
                                                                hashtable9 = new Hashtable();
                                                                Object obj442 = "schMsgInfo";
                                                                if (hashtable18.containsKey("language_detection_version")) {
                                                                }
                                                                if (hashtable18.containsKey("detected_language")) {
                                                                }
                                                                if (hashtable18.containsKey("translation")) {
                                                                }
                                                                if (!hashtable9.isEmpty()) {
                                                                }
                                                                ArrayList arrayList52 = new ArrayList();
                                                                if (hashtable18.containsKey("msglist")) {
                                                                }
                                                                it3 = arrayList52.iterator();
                                                                String str662 = str25;
                                                                while (it3.hasNext()) {
                                                                }
                                                                cVar = this;
                                                                i11 = i16;
                                                                if (C4379a.this.f47398b == null) {
                                                                }
                                                            }
                                                        } else {
                                                            obj22 = "lmsguid";
                                                        }
                                                        if (hashtable18.containsKey("post_in_parent")) {
                                                            hashtable17.put("post_in_parent", hashtable18.get("post_in_parent"));
                                                        }
                                                        obj23 = "parentchatid";
                                                        try {
                                                            if (hashtable18.containsKey(obj23)) {
                                                                hashtable17.put(obj23, (String) hashtable18.get(obj23));
                                                            }
                                                            obj24 = "lmsgtime";
                                                            obj25 = "parentmsguid";
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            obj24 = "lmsgtime";
                                                            obj19 = "reply_to";
                                                            obj20 = "pcount";
                                                            obj25 = "parentmsguid";
                                                            obj26 = "lmsgaddinfo";
                                                            obj27 = "parentmessagesenderid";
                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                            Object obj4222 = "time";
                                                            if (hashtable18.containsKey("temp_info")) {
                                                            }
                                                            Object obj4322 = "temp_info";
                                                            if (hashtable18.containsKey("schMsgInfo")) {
                                                            }
                                                            hashtable9 = new Hashtable();
                                                            Object obj4422 = "schMsgInfo";
                                                            if (hashtable18.containsKey("language_detection_version")) {
                                                            }
                                                            if (hashtable18.containsKey("detected_language")) {
                                                            }
                                                            if (hashtable18.containsKey("translation")) {
                                                            }
                                                            if (!hashtable9.isEmpty()) {
                                                            }
                                                            ArrayList arrayList522 = new ArrayList();
                                                            if (hashtable18.containsKey("msglist")) {
                                                            }
                                                            it3 = arrayList522.iterator();
                                                            String str6622 = str25;
                                                            while (it3.hasNext()) {
                                                            }
                                                            cVar = this;
                                                            i11 = i16;
                                                            if (C4379a.this.f47398b == null) {
                                                            }
                                                        }
                                                        try {
                                                            if (hashtable18.containsKey(obj25)) {
                                                                hashtable17.put(obj25, (String) hashtable18.get(obj25));
                                                            }
                                                            obj26 = "lmsgaddinfo";
                                                            obj27 = "parentmessagesenderid";
                                                            try {
                                                                if (hashtable18.containsKey(obj27)) {
                                                                    hashtable17.put(obj27, (String) hashtable18.get(obj27));
                                                                }
                                                                if (hashtable18.containsKey("title")) {
                                                                    obj19 = "reply_to";
                                                                    try {
                                                                        hashtable17.put("threadtitle", (String) hashtable18.get("title"));
                                                                    } catch (Exception e18) {
                                                                        e = e18;
                                                                        obj20 = "pcount";
                                                                        Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                        Object obj42222 = "time";
                                                                        if (hashtable18.containsKey("temp_info")) {
                                                                        }
                                                                        Object obj43222 = "temp_info";
                                                                        if (hashtable18.containsKey("schMsgInfo")) {
                                                                        }
                                                                        hashtable9 = new Hashtable();
                                                                        Object obj44222 = "schMsgInfo";
                                                                        if (hashtable18.containsKey("language_detection_version")) {
                                                                        }
                                                                        if (hashtable18.containsKey("detected_language")) {
                                                                        }
                                                                        if (hashtable18.containsKey("translation")) {
                                                                        }
                                                                        if (!hashtable9.isEmpty()) {
                                                                        }
                                                                        ArrayList arrayList5222 = new ArrayList();
                                                                        if (hashtable18.containsKey("msglist")) {
                                                                        }
                                                                        it3 = arrayList5222.iterator();
                                                                        String str66222 = str25;
                                                                        while (it3.hasNext()) {
                                                                        }
                                                                        cVar = this;
                                                                        i11 = i16;
                                                                        if (C4379a.this.f47398b == null) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj19 = "reply_to";
                                                                }
                                                                obj20 = "pcount";
                                                                try {
                                                                    if (hashtable18.containsKey(obj20)) {
                                                                        hashtable17.put(obj20, Integer.valueOf((String) hashtable18.get(obj20)));
                                                                    }
                                                                } catch (Exception e19) {
                                                                    e = e19;
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                    Object obj422222 = "time";
                                                                    if (hashtable18.containsKey("temp_info")) {
                                                                    }
                                                                    Object obj432222 = "temp_info";
                                                                    if (hashtable18.containsKey("schMsgInfo")) {
                                                                    }
                                                                    hashtable9 = new Hashtable();
                                                                    Object obj442222 = "schMsgInfo";
                                                                    if (hashtable18.containsKey("language_detection_version")) {
                                                                    }
                                                                    if (hashtable18.containsKey("detected_language")) {
                                                                    }
                                                                    if (hashtable18.containsKey("translation")) {
                                                                    }
                                                                    if (!hashtable9.isEmpty()) {
                                                                    }
                                                                    ArrayList arrayList52222 = new ArrayList();
                                                                    if (hashtable18.containsKey("msglist")) {
                                                                    }
                                                                    it3 = arrayList52222.iterator();
                                                                    String str662222 = str25;
                                                                    while (it3.hasNext()) {
                                                                    }
                                                                    cVar = this;
                                                                    i11 = i16;
                                                                    if (C4379a.this.f47398b == null) {
                                                                    }
                                                                }
                                                            } catch (Exception e20) {
                                                                e = e20;
                                                                obj19 = "reply_to";
                                                            }
                                                        } catch (Exception e21) {
                                                            e = e21;
                                                            obj26 = "lmsgaddinfo";
                                                            obj19 = "reply_to";
                                                            obj20 = "pcount";
                                                            obj27 = "parentmessagesenderid";
                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                            Object obj4222222 = "time";
                                                            if (hashtable18.containsKey("temp_info")) {
                                                            }
                                                            Object obj4322222 = "temp_info";
                                                            if (hashtable18.containsKey("schMsgInfo")) {
                                                            }
                                                            hashtable9 = new Hashtable();
                                                            Object obj4422222 = "schMsgInfo";
                                                            if (hashtable18.containsKey("language_detection_version")) {
                                                            }
                                                            if (hashtable18.containsKey("detected_language")) {
                                                            }
                                                            if (hashtable18.containsKey("translation")) {
                                                            }
                                                            if (!hashtable9.isEmpty()) {
                                                            }
                                                            ArrayList arrayList522222 = new ArrayList();
                                                            if (hashtable18.containsKey("msglist")) {
                                                            }
                                                            it3 = arrayList522222.iterator();
                                                            String str6622222 = str25;
                                                            while (it3.hasNext()) {
                                                            }
                                                            cVar = this;
                                                            i11 = i16;
                                                            if (C4379a.this.f47398b == null) {
                                                            }
                                                        }
                                                    } catch (Exception e22) {
                                                        e = e22;
                                                        obj22 = "lmsguid";
                                                        obj19 = "reply_to";
                                                        obj20 = "pcount";
                                                        obj23 = "parentchatid";
                                                        obj24 = "lmsgtime";
                                                        obj25 = "parentmsguid";
                                                        obj26 = "lmsgaddinfo";
                                                        obj27 = "parentmessagesenderid";
                                                        Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                        Object obj42222222 = "time";
                                                        if (hashtable18.containsKey("temp_info")) {
                                                        }
                                                        Object obj43222222 = "temp_info";
                                                        if (hashtable18.containsKey("schMsgInfo")) {
                                                        }
                                                        hashtable9 = new Hashtable();
                                                        Object obj44222222 = "schMsgInfo";
                                                        if (hashtable18.containsKey("language_detection_version")) {
                                                        }
                                                        if (hashtable18.containsKey("detected_language")) {
                                                        }
                                                        if (hashtable18.containsKey("translation")) {
                                                        }
                                                        if (!hashtable9.isEmpty()) {
                                                        }
                                                        ArrayList arrayList5222222 = new ArrayList();
                                                        if (hashtable18.containsKey("msglist")) {
                                                        }
                                                        it3 = arrayList5222222.iterator();
                                                        String str66222222 = str25;
                                                        while (it3.hasNext()) {
                                                        }
                                                        cVar = this;
                                                        i11 = i16;
                                                        if (C4379a.this.f47398b == null) {
                                                        }
                                                    }
                                                } else {
                                                    str26 = str23;
                                                    obj18 = "channelData";
                                                    obj19 = "reply_to";
                                                    obj20 = "pcount";
                                                    obj21 = "threadchatid";
                                                    obj22 = "lmsguid";
                                                    obj23 = "parentchatid";
                                                    obj24 = "lmsgtime";
                                                    obj25 = "parentmsguid";
                                                    obj26 = "lmsgaddinfo";
                                                    obj27 = "parentmessagesenderid";
                                                }
                                                Object obj422222222 = "time";
                                                if (hashtable18.containsKey("temp_info")) {
                                                    hashtable17.put("temp_info", hashtable18.get("temp_info"));
                                                }
                                                Object obj432222222 = "temp_info";
                                                if (hashtable18.containsKey("schMsgInfo")) {
                                                    hashtable17.put("schMsgInfo", hashtable18.get("schMsgInfo"));
                                                }
                                                hashtable9 = new Hashtable();
                                                Object obj442222222 = "schMsgInfo";
                                                if (hashtable18.containsKey("language_detection_version")) {
                                                    obj28 = "ht";
                                                    try {
                                                        hashtable9.put("language_detection_version", hashtable18.get("language_detection_version"));
                                                    } catch (Exception e23) {
                                                        e = e23;
                                                        Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                        ArrayList arrayList52222222 = new ArrayList();
                                                        if (hashtable18.containsKey("msglist")) {
                                                        }
                                                        it3 = arrayList52222222.iterator();
                                                        String str662222222 = str25;
                                                        while (it3.hasNext()) {
                                                        }
                                                        cVar = this;
                                                        i11 = i16;
                                                        if (C4379a.this.f47398b == null) {
                                                        }
                                                    }
                                                } else {
                                                    obj28 = "ht";
                                                }
                                                if (hashtable18.containsKey("detected_language")) {
                                                    hashtable9.put("detected_language", hashtable18.get("detected_language"));
                                                }
                                                if (hashtable18.containsKey("translation")) {
                                                    hashtable9.put("translation", hashtable18.get("translation"));
                                                }
                                                if (!hashtable9.isEmpty()) {
                                                    hashtable17.put("translations", hashtable9);
                                                }
                                                ArrayList arrayList522222222 = new ArrayList();
                                                if (hashtable18.containsKey("msglist")) {
                                                    arrayList522222222.add(hashtable18);
                                                } else {
                                                    arrayList522222222 = (ArrayList) hashtable18.get("msglist");
                                                }
                                                it3 = arrayList522222222.iterator();
                                                String str6622222222 = str25;
                                                while (it3.hasNext()) {
                                                    Hashtable hashtable19 = (Hashtable) it3.next();
                                                    if (hashtable19.containsKey(str46)) {
                                                        str59 = (String) hashtable19.get(str46);
                                                    }
                                                    String str68 = str6622222222;
                                                    Object obj45 = obj17;
                                                    if (hashtable19.containsKey(obj45)) {
                                                        hashtable17.put(obj45, hashtable19.get(obj45));
                                                    }
                                                    if (hashtable19.containsKey("sender")) {
                                                        str60 = (String) hashtable19.get("sender");
                                                    }
                                                    if (hashtable19.containsKey("dname")) {
                                                        str61 = (String) hashtable19.get("dname");
                                                    }
                                                    obj17 = obj45;
                                                    Object obj46 = obj16;
                                                    if (hashtable19.containsKey(obj46)) {
                                                        it4 = it3;
                                                        str27 = (String) hashtable19.get(obj46);
                                                    } else {
                                                        it4 = it3;
                                                        str27 = str62;
                                                    }
                                                    if (hashtable19.containsKey(obj39)) {
                                                        hashtable17.put(obj39, (String) hashtable19.get(obj39));
                                                    }
                                                    String str69 = str46;
                                                    Object obj47 = obj41;
                                                    Object obj48 = hashtable19.get(obj47);
                                                    Object obj49 = hashtable19.get("meta");
                                                    try {
                                                        if (hashtable19.containsKey("includesenderinunread") && ((Boolean) hashtable19.get("includesenderinunread")).booleanValue()) {
                                                            obj41 = obj47;
                                                            try {
                                                                hashtable17.put("unread", Boolean.TRUE);
                                                            } catch (Exception e24) {
                                                                e = e24;
                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                String str70 = (String) hashtable19.get("msgid");
                                                                String str71 = (String) hashtable19.get("msguid");
                                                                int i17 = -1;
                                                                if (!hashtable19.containsKey("version")) {
                                                                }
                                                                String str72 = str70;
                                                                i15 = i17;
                                                                if (str58.equals("11")) {
                                                                }
                                                                if (hashtable19.containsKey(m.f13664a)) {
                                                                }
                                                                String str73 = str63;
                                                                if (hashtable19.containsKey(C4527h.f48087o)) {
                                                                }
                                                                if (hashtable19.containsKey(obj30)) {
                                                                }
                                                                if (hashtable19.containsKey("history")) {
                                                                }
                                                                obj32 = obj422222222;
                                                                Object obj50 = obj25;
                                                                if (hashtable19.containsKey(obj32)) {
                                                                }
                                                                String str74 = valueOf2;
                                                                if (hashtable19.containsKey("mod")) {
                                                                }
                                                                String str75 = str65;
                                                                if (hashtable19.containsKey("mtype")) {
                                                                }
                                                                Object obj51 = obj23;
                                                                int i18 = i16;
                                                                if (i15 != -1) {
                                                                }
                                                                if (str27 != null) {
                                                                }
                                                                obj33 = obj19;
                                                                if (hashtable19.containsKey(obj33)) {
                                                                }
                                                                Object obj52 = obj18;
                                                                obj34 = obj26;
                                                                if (hashtable19.containsKey(obj34)) {
                                                                }
                                                                Object obj53 = obj21;
                                                                obj35 = obj24;
                                                                if (hashtable19.containsKey(obj35)) {
                                                                }
                                                                Object obj54 = obj39;
                                                                obj36 = obj22;
                                                                if (hashtable19.containsKey(obj36)) {
                                                                }
                                                                obj22 = obj36;
                                                                obj37 = obj432222222;
                                                                if (hashtable19.containsKey(obj37)) {
                                                                }
                                                                obj432222222 = obj37;
                                                                obj38 = obj442222222;
                                                                if (hashtable19.containsKey(obj38)) {
                                                                }
                                                                hashtable8 = new Hashtable();
                                                                str31 = str27;
                                                                if (hashtable19.containsKey("language_detection_version")) {
                                                                }
                                                                if (hashtable19.containsKey("detected_language")) {
                                                                }
                                                                if (hashtable19.containsKey("translation")) {
                                                                }
                                                                if (!hashtable8.isEmpty()) {
                                                                }
                                                                if (hashtable19.containsKey("addinfo")) {
                                                                }
                                                                if (str29 != null) {
                                                                }
                                                                if (str30 != null) {
                                                                }
                                                                arrayList2 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str28));
                                                                if (arrayList2 == null) {
                                                                }
                                                                obj422222222 = obj32;
                                                                obj25 = obj50;
                                                                Object obj55 = obj29;
                                                                obj28 = obj30;
                                                                obj20 = obj55;
                                                                i16 = i18;
                                                                obj39 = obj54;
                                                                str64 = str32;
                                                                valueOf2 = str33;
                                                                z13 = z12;
                                                                str67 = str36;
                                                                str63 = str34;
                                                                hashtable17 = hashtable7;
                                                                obj23 = obj51;
                                                                str62 = str31;
                                                                str65 = str35;
                                                                obj24 = obj35;
                                                                obj21 = obj53;
                                                                it3 = it4;
                                                                obj26 = obj34;
                                                                obj16 = obj46;
                                                                obj18 = obj52;
                                                                str6622222222 = str30;
                                                                obj19 = obj33;
                                                                obj27 = obj31;
                                                                str46 = str69;
                                                                str26 = str29;
                                                                str58 = str28;
                                                            }
                                                        } else {
                                                            obj41 = obj47;
                                                        }
                                                    } catch (Exception e25) {
                                                        e = e25;
                                                        obj41 = obj47;
                                                    }
                                                    String str702 = (String) hashtable19.get("msgid");
                                                    String str712 = (String) hashtable19.get("msguid");
                                                    int i172 = -1;
                                                    try {
                                                        if (!hashtable19.containsKey("version")) {
                                                            Integer num = (Integer) hashtable19.get("version");
                                                            num.intValue();
                                                            i172 = num.intValue();
                                                        } else if (hashtable19.containsKey("revision")) {
                                                            Integer num2 = (Integer) hashtable19.get("revision");
                                                            num2.intValue();
                                                            i172 = num2.intValue();
                                                        }
                                                    } catch (Exception e26) {
                                                        Log.e("WMSLibrary", Log.getStackTraceString(e26));
                                                    }
                                                    String str722 = str702;
                                                    i15 = i172;
                                                    if (str58.equals("11")) {
                                                        str28 = str58;
                                                    } else {
                                                        try {
                                                            if (hashtable19.containsKey(obj21)) {
                                                                str59 = (String) hashtable19.get(obj21);
                                                            }
                                                            if (hashtable19.containsKey(obj18)) {
                                                                hashtable17.put(obj18, hashtable19.get(obj18));
                                                            }
                                                            if (hashtable19.containsKey("isfirstthreadmessage")) {
                                                                str28 = str58;
                                                                try {
                                                                    hashtable17.put("isfirstthreadmessage", hashtable19.get("isfirstthreadmessage"));
                                                                } catch (Exception e27) {
                                                                    e = e27;
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                    if (hashtable19.containsKey(m.f13664a)) {
                                                                    }
                                                                    String str732 = str63;
                                                                    if (hashtable19.containsKey(C4527h.f48087o)) {
                                                                    }
                                                                    if (hashtable19.containsKey(obj30)) {
                                                                    }
                                                                    if (hashtable19.containsKey("history")) {
                                                                    }
                                                                    obj32 = obj422222222;
                                                                    Object obj502 = obj25;
                                                                    if (hashtable19.containsKey(obj32)) {
                                                                    }
                                                                    String str742 = valueOf2;
                                                                    if (hashtable19.containsKey("mod")) {
                                                                    }
                                                                    String str752 = str65;
                                                                    if (hashtable19.containsKey("mtype")) {
                                                                    }
                                                                    Object obj512 = obj23;
                                                                    int i182 = i16;
                                                                    if (i15 != -1) {
                                                                    }
                                                                    if (str27 != null) {
                                                                    }
                                                                    obj33 = obj19;
                                                                    if (hashtable19.containsKey(obj33)) {
                                                                    }
                                                                    Object obj522 = obj18;
                                                                    obj34 = obj26;
                                                                    if (hashtable19.containsKey(obj34)) {
                                                                    }
                                                                    Object obj532 = obj21;
                                                                    obj35 = obj24;
                                                                    if (hashtable19.containsKey(obj35)) {
                                                                    }
                                                                    Object obj542 = obj39;
                                                                    obj36 = obj22;
                                                                    if (hashtable19.containsKey(obj36)) {
                                                                    }
                                                                    obj22 = obj36;
                                                                    obj37 = obj432222222;
                                                                    if (hashtable19.containsKey(obj37)) {
                                                                    }
                                                                    obj432222222 = obj37;
                                                                    obj38 = obj442222222;
                                                                    if (hashtable19.containsKey(obj38)) {
                                                                    }
                                                                    hashtable8 = new Hashtable();
                                                                    str31 = str27;
                                                                    if (hashtable19.containsKey("language_detection_version")) {
                                                                    }
                                                                    if (hashtable19.containsKey("detected_language")) {
                                                                    }
                                                                    if (hashtable19.containsKey("translation")) {
                                                                    }
                                                                    if (!hashtable8.isEmpty()) {
                                                                    }
                                                                    if (hashtable19.containsKey("addinfo")) {
                                                                    }
                                                                    if (str29 != null) {
                                                                    }
                                                                    if (str30 != null) {
                                                                    }
                                                                    arrayList2 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str28));
                                                                    if (arrayList2 == null) {
                                                                    }
                                                                    obj422222222 = obj32;
                                                                    obj25 = obj502;
                                                                    Object obj552 = obj29;
                                                                    obj28 = obj30;
                                                                    obj20 = obj552;
                                                                    i16 = i182;
                                                                    obj39 = obj542;
                                                                    str64 = str32;
                                                                    valueOf2 = str33;
                                                                    z13 = z12;
                                                                    str67 = str36;
                                                                    str63 = str34;
                                                                    hashtable17 = hashtable7;
                                                                    obj23 = obj512;
                                                                    str62 = str31;
                                                                    str65 = str35;
                                                                    obj24 = obj35;
                                                                    obj21 = obj532;
                                                                    it3 = it4;
                                                                    obj26 = obj34;
                                                                    obj16 = obj46;
                                                                    obj18 = obj522;
                                                                    str6622222222 = str30;
                                                                    obj19 = obj33;
                                                                    obj27 = obj31;
                                                                    str46 = str69;
                                                                    str26 = str29;
                                                                    str58 = str28;
                                                                }
                                                            } else {
                                                                str28 = str58;
                                                            }
                                                            if (hashtable19.containsKey("post_in_parent")) {
                                                                hashtable17.put("post_in_parent", hashtable19.get("post_in_parent"));
                                                            }
                                                            if (hashtable19.containsKey(obj23)) {
                                                                hashtable17.put(obj23, (String) hashtable19.get(obj23));
                                                            }
                                                            if (hashtable19.containsKey(obj25)) {
                                                                hashtable17.put(obj25, (String) hashtable19.get(obj25));
                                                            }
                                                            if (hashtable19.containsKey(obj27)) {
                                                                hashtable17.put(obj27, (String) hashtable19.get(obj27));
                                                            }
                                                            if (hashtable19.containsKey(obj39)) {
                                                                hashtable17.put("threadtitle", (String) hashtable19.get(obj39));
                                                            }
                                                            if (hashtable19.containsKey(obj20)) {
                                                                hashtable17.put(obj20, Integer.valueOf((String) hashtable19.get(obj20)));
                                                            }
                                                        } catch (Exception e28) {
                                                            e = e28;
                                                            str28 = str58;
                                                        }
                                                    }
                                                    if (hashtable19.containsKey(m.f13664a)) {
                                                        str63 = (String) hashtable19.get(m.f13664a);
                                                    }
                                                    String str7322 = str63;
                                                    if (hashtable19.containsKey(C4527h.f48087o)) {
                                                        Object obj56 = obj28;
                                                        obj29 = obj20;
                                                        obj30 = obj56;
                                                        str29 = (String) hashtable19.get(C4527h.f48087o);
                                                    } else {
                                                        Object obj57 = obj28;
                                                        obj29 = obj20;
                                                        obj30 = obj57;
                                                        str29 = str26;
                                                    }
                                                    if (hashtable19.containsKey(obj30)) {
                                                        obj31 = obj27;
                                                        str30 = (String) hashtable19.get(obj30);
                                                    } else {
                                                        obj31 = obj27;
                                                        str30 = str68;
                                                    }
                                                    if (hashtable19.containsKey("history")) {
                                                        str64 = (String) hashtable19.get("history");
                                                    }
                                                    obj32 = obj422222222;
                                                    Object obj5022 = obj25;
                                                    if (hashtable19.containsKey(obj32)) {
                                                        valueOf2 = String.valueOf(hashtable19.get(obj32));
                                                    }
                                                    String str7422 = valueOf2;
                                                    if (hashtable19.containsKey("mod")) {
                                                        str65 = (String) hashtable19.get("mod");
                                                    }
                                                    String str7522 = str65;
                                                    if (hashtable19.containsKey("mtype")) {
                                                        i16 = Integer.valueOf(AbstractC6574b.g(hashtable19.get("mtype"))).intValue();
                                                    }
                                                    Object obj5122 = obj23;
                                                    int i1822 = i16;
                                                    if (i15 != -1) {
                                                        hashtable17.put("revision", Integer.valueOf(i15));
                                                    }
                                                    if (str27 != null) {
                                                        hashtable17.put(obj46, str27);
                                                    }
                                                    obj33 = obj19;
                                                    if (hashtable19.containsKey(obj33)) {
                                                        hashtable17.put(obj33, hashtable19.get(obj33));
                                                    }
                                                    Object obj5222 = obj18;
                                                    obj34 = obj26;
                                                    if (hashtable19.containsKey(obj34)) {
                                                        hashtable17.put(obj34, hashtable19.get(obj34));
                                                    }
                                                    Object obj5322 = obj21;
                                                    obj35 = obj24;
                                                    if (hashtable19.containsKey(obj35)) {
                                                        hashtable17.put(obj35, hashtable19.get(obj35));
                                                    }
                                                    Object obj5422 = obj39;
                                                    obj36 = obj22;
                                                    if (hashtable19.containsKey(obj36)) {
                                                        hashtable17.put(obj36, hashtable19.get(obj36));
                                                    }
                                                    obj22 = obj36;
                                                    obj37 = obj432222222;
                                                    if (hashtable19.containsKey(obj37)) {
                                                        hashtable17.put(obj37, hashtable19.get(obj37));
                                                    }
                                                    obj432222222 = obj37;
                                                    obj38 = obj442222222;
                                                    if (hashtable19.containsKey(obj38)) {
                                                        hashtable17.put(obj38, hashtable19.get(obj38));
                                                    }
                                                    try {
                                                        hashtable8 = new Hashtable();
                                                        str31 = str27;
                                                    } catch (Exception e29) {
                                                        e = e29;
                                                        str31 = str27;
                                                    }
                                                    try {
                                                        if (hashtable19.containsKey("language_detection_version")) {
                                                            obj442222222 = obj38;
                                                            try {
                                                                hashtable8.put("language_detection_version", hashtable19.get("language_detection_version"));
                                                            } catch (Exception e30) {
                                                                e = e30;
                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                if (hashtable19.containsKey("addinfo")) {
                                                                }
                                                                if (str29 != null) {
                                                                }
                                                                if (str30 != null) {
                                                                }
                                                                arrayList2 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str28));
                                                                if (arrayList2 == null) {
                                                                }
                                                                obj422222222 = obj32;
                                                                obj25 = obj5022;
                                                                Object obj5522 = obj29;
                                                                obj28 = obj30;
                                                                obj20 = obj5522;
                                                                i16 = i1822;
                                                                obj39 = obj5422;
                                                                str64 = str32;
                                                                valueOf2 = str33;
                                                                z13 = z12;
                                                                str67 = str36;
                                                                str63 = str34;
                                                                hashtable17 = hashtable7;
                                                                obj23 = obj5122;
                                                                str62 = str31;
                                                                str65 = str35;
                                                                obj24 = obj35;
                                                                obj21 = obj5322;
                                                                it3 = it4;
                                                                obj26 = obj34;
                                                                obj16 = obj46;
                                                                obj18 = obj5222;
                                                                str6622222222 = str30;
                                                                obj19 = obj33;
                                                                obj27 = obj31;
                                                                str46 = str69;
                                                                str26 = str29;
                                                                str58 = str28;
                                                            }
                                                        } else {
                                                            obj442222222 = obj38;
                                                        }
                                                        if (hashtable19.containsKey("detected_language")) {
                                                            hashtable8.put("detected_language", hashtable19.get("detected_language"));
                                                        }
                                                        if (hashtable19.containsKey("translation")) {
                                                            hashtable8.put("translation", hashtable19.get("translation"));
                                                        }
                                                        if (!hashtable8.isEmpty()) {
                                                            hashtable17.put("translations", hashtable8);
                                                        }
                                                    } catch (Exception e31) {
                                                        e = e31;
                                                        obj442222222 = obj38;
                                                        Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                        if (hashtable19.containsKey("addinfo")) {
                                                        }
                                                        if (str29 != null) {
                                                        }
                                                        if (str30 != null) {
                                                        }
                                                        arrayList2 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str28));
                                                        if (arrayList2 == null) {
                                                        }
                                                        obj422222222 = obj32;
                                                        obj25 = obj5022;
                                                        Object obj55222 = obj29;
                                                        obj28 = obj30;
                                                        obj20 = obj55222;
                                                        i16 = i1822;
                                                        obj39 = obj5422;
                                                        str64 = str32;
                                                        valueOf2 = str33;
                                                        z13 = z12;
                                                        str67 = str36;
                                                        str63 = str34;
                                                        hashtable17 = hashtable7;
                                                        obj23 = obj5122;
                                                        str62 = str31;
                                                        str65 = str35;
                                                        obj24 = obj35;
                                                        obj21 = obj5322;
                                                        it3 = it4;
                                                        obj26 = obj34;
                                                        obj16 = obj46;
                                                        obj18 = obj5222;
                                                        str6622222222 = str30;
                                                        obj19 = obj33;
                                                        obj27 = obj31;
                                                        str46 = str69;
                                                        str26 = str29;
                                                        str58 = str28;
                                                    }
                                                    if (hashtable19.containsKey("addinfo")) {
                                                        str67 = (String) hashtable19.get("addinfo");
                                                    }
                                                    if (str29 != null) {
                                                        hashtable17.put(C4527h.f48087o, str29);
                                                    }
                                                    if (str30 != null) {
                                                        hashtable17.put(obj30, str30);
                                                    }
                                                    arrayList2 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str28));
                                                    if (arrayList2 == null) {
                                                        z12 = z13;
                                                        str32 = str64;
                                                        str33 = str7422;
                                                        str34 = str7322;
                                                        str35 = str7522;
                                                        hashtable7 = hashtable17;
                                                        str36 = str67;
                                                    } else if (i1822 == EnumC4204a.WM_TXT_MSG.b()) {
                                                        Iterator it6 = arrayList2.iterator();
                                                        while (it6.hasNext()) {
                                                            String str76 = str712;
                                                            Object obj58 = obj48;
                                                            String str77 = str64;
                                                            String str78 = str7422;
                                                            String str79 = str722;
                                                            String str80 = str7322;
                                                            Hashtable hashtable20 = hashtable17;
                                                            String str81 = str67;
                                                            ((InterfaceC4282a) it6.next()).m(str59, str60, str61, str77, obj58, str79, str76, str78, Boolean.valueOf(z13), str81, obj49, str80, hashtable20);
                                                            str64 = str77;
                                                            obj48 = obj58;
                                                            str712 = str76;
                                                            str67 = str81;
                                                            hashtable17 = hashtable20;
                                                            str7422 = str78;
                                                            str7322 = str80;
                                                            str722 = str79;
                                                        }
                                                        str33 = str7422;
                                                        str36 = str67;
                                                        z12 = z13;
                                                        str32 = str64;
                                                        str34 = str7322;
                                                        str35 = str7522;
                                                        hashtable7 = hashtable17;
                                                    } else {
                                                        String str82 = str712;
                                                        str33 = str7422;
                                                        String str83 = str722;
                                                        str34 = str7322;
                                                        hashtable7 = hashtable17;
                                                        str36 = str67;
                                                        if (i1822 == EnumC4204a.WM_NFY_ATTACH.b()) {
                                                            Iterator it7 = arrayList2.iterator();
                                                            while (it7.hasNext()) {
                                                                String str84 = str82;
                                                                String str85 = str64;
                                                                String str86 = str36;
                                                                String str87 = str33;
                                                                String str88 = str7522;
                                                                Hashtable hashtable21 = hashtable7;
                                                                String str89 = str34;
                                                                Object obj59 = obj49;
                                                                boolean z14 = z13;
                                                                ((InterfaceC4282a) it7.next()).j(str59, str60, str61, obj48, str83, str84, str85, str88, z14, str87, str86, obj59, str89, hashtable21);
                                                                str82 = str84;
                                                                str33 = str87;
                                                                str36 = str86;
                                                                obj49 = obj59;
                                                                str34 = str89;
                                                                hashtable7 = hashtable21;
                                                                str64 = str85;
                                                                obj48 = obj48;
                                                                str83 = str83;
                                                                str7522 = str88;
                                                                z13 = z14;
                                                            }
                                                        }
                                                        z12 = z13;
                                                        str32 = str64;
                                                        str35 = str7522;
                                                    }
                                                    obj422222222 = obj32;
                                                    obj25 = obj5022;
                                                    Object obj552222 = obj29;
                                                    obj28 = obj30;
                                                    obj20 = obj552222;
                                                    i16 = i1822;
                                                    obj39 = obj5422;
                                                    str64 = str32;
                                                    valueOf2 = str33;
                                                    z13 = z12;
                                                    str67 = str36;
                                                    str63 = str34;
                                                    hashtable17 = hashtable7;
                                                    obj23 = obj5122;
                                                    str62 = str31;
                                                    str65 = str35;
                                                    obj24 = obj35;
                                                    obj21 = obj5322;
                                                    it3 = it4;
                                                    obj26 = obj34;
                                                    obj16 = obj46;
                                                    obj18 = obj5222;
                                                    str6622222222 = str30;
                                                    obj19 = obj33;
                                                    obj27 = obj31;
                                                    str46 = str69;
                                                    str26 = str29;
                                                    str58 = str28;
                                                }
                                                cVar = this;
                                                i11 = i16;
                                            }
                                        }
                                        str25 = str24;
                                        if (hashtable18.containsKey("title")) {
                                        }
                                        if (hashtable18.containsKey("addinfo")) {
                                        }
                                        if (str58.equals("11")) {
                                        }
                                        Object obj4222222222 = "time";
                                        if (hashtable18.containsKey("temp_info")) {
                                        }
                                        Object obj4322222222 = "temp_info";
                                        if (hashtable18.containsKey("schMsgInfo")) {
                                        }
                                        hashtable9 = new Hashtable();
                                        Object obj4422222222 = "schMsgInfo";
                                        if (hashtable18.containsKey("language_detection_version")) {
                                        }
                                        if (hashtable18.containsKey("detected_language")) {
                                        }
                                        if (hashtable18.containsKey("translation")) {
                                        }
                                        if (!hashtable9.isEmpty()) {
                                        }
                                        ArrayList arrayList5222222222 = new ArrayList();
                                        if (hashtable18.containsKey("msglist")) {
                                        }
                                        it3 = arrayList5222222222.iterator();
                                        String str66222222222 = str25;
                                        while (it3.hasNext()) {
                                        }
                                        cVar = this;
                                        i11 = i16;
                                    } catch (Exception e32) {
                                        e = e32;
                                        obj39 = this;
                                        Log.e(str37, Log.getStackTraceString(e));
                                    }
                                } else {
                                    Object obj60 = "reply_to";
                                    Object obj61 = "parentchatid";
                                    Object obj62 = "channelData";
                                    Object obj63 = "lmsgaddinfo";
                                    Object obj64 = "parentmsguid";
                                    Object obj65 = "threadchatid";
                                    if (intValue == EnumC4204a.WM_NFY_ATTACH.b()) {
                                        try {
                                            hashtable2 = new Hashtable();
                                            hashtable3 = (Hashtable) hashtable.get("msg");
                                            str = (String) hashtable3.get("ctype");
                                            if (hashtable3.containsKey("nc")) {
                                                try {
                                                    parseBoolean = Boolean.parseBoolean((String) hashtable3.get("nc"));
                                                } catch (Exception e33) {
                                                    e = e33;
                                                    i11 = intValue;
                                                    cVar = this;
                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                    if (C4379a.this.f47398b == null) {
                                                    }
                                                }
                                            } else {
                                                parseBoolean = false;
                                            }
                                            z10 = parseBoolean;
                                            str2 = hashtable3.containsKey("chid") ? (String) hashtable3.get("chid") : null;
                                            i10 = intValue;
                                            obj = "ismoderated";
                                        } catch (Exception e34) {
                                            e = e34;
                                            i10 = intValue;
                                        }
                                        try {
                                            if (hashtable3.containsKey(obj)) {
                                                hashtable2.put(obj, hashtable3.get(obj));
                                            }
                                            String str90 = hashtable3.containsKey("sender") ? (String) hashtable3.get("sender") : null;
                                            String str91 = hashtable3.containsKey("dname") ? (String) hashtable3.get("dname") : null;
                                            String str92 = hashtable3.containsKey("customgroup") ? (String) hashtable3.get("customgroup") : null;
                                            String str93 = hashtable3.containsKey(m.f13664a) ? (String) hashtable3.get(m.f13664a) : null;
                                            String str94 = hashtable3.containsKey(C4527h.f48087o) ? (String) hashtable3.get(C4527h.f48087o) : null;
                                            try {
                                                if (hashtable3.containsKey("ht")) {
                                                    obj2 = "msg";
                                                    str3 = (String) hashtable3.get("ht");
                                                } else {
                                                    obj2 = "msg";
                                                    str3 = null;
                                                }
                                                String str95 = hashtable3.containsKey("history") ? (String) hashtable3.get("history") : null;
                                                String valueOf3 = hashtable3.containsKey("time") ? String.valueOf(hashtable3.get("time")) : null;
                                                int intValue2 = hashtable3.containsKey("mtype") ? Integer.valueOf(AbstractC6574b.g(hashtable3.get("mtype"))).intValue() : i10;
                                                try {
                                                    if (hashtable3.containsKey("mod")) {
                                                        try {
                                                            str4 = (String) hashtable3.get("mod");
                                                        } catch (Exception e35) {
                                                            e = e35;
                                                            cVar = this;
                                                            i11 = intValue2;
                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                            if (C4379a.this.f47398b == null) {
                                                            }
                                                        }
                                                    } else {
                                                        str4 = null;
                                                    }
                                                    if (hashtable3.containsKey(obj60)) {
                                                        hashtable2.put(obj60, hashtable3.get(obj60));
                                                    }
                                                    if (hashtable3.containsKey(obj63)) {
                                                        hashtable2.put(obj63, hashtable3.get(obj63));
                                                    }
                                                    if (hashtable3.containsKey("lmsgtime")) {
                                                        hashtable2.put("lmsgtime", hashtable3.get("lmsgtime"));
                                                    }
                                                    Object obj66 = "lmsgtime";
                                                    Object obj67 = "lmsguid";
                                                    if (hashtable3.containsKey(obj67)) {
                                                        hashtable2.put(obj67, hashtable3.get(obj67));
                                                    }
                                                    if (str94 != null) {
                                                        hashtable2.put(C4527h.f48087o, str94);
                                                    }
                                                    if (str3 != null) {
                                                        hashtable2.put("ht", str3);
                                                    }
                                                    try {
                                                    } catch (Exception e36) {
                                                        e = e36;
                                                        str5 = str3;
                                                    }
                                                    if (hashtable3.containsKey("includesenderinunread")) {
                                                        if (((Boolean) hashtable3.get("includesenderinunread")).booleanValue()) {
                                                            str5 = str3;
                                                            try {
                                                                hashtable2.put("unread", Boolean.TRUE);
                                                            } catch (Exception e37) {
                                                                e = e37;
                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                if (hashtable3.containsKey("title")) {
                                                                }
                                                                if (hashtable3.containsKey("addinfo")) {
                                                                }
                                                                if (str.equals("11")) {
                                                                }
                                                                if (hashtable3.containsKey(obj4)) {
                                                                }
                                                                String str96 = str;
                                                                if (hashtable3.containsKey("schMsgInfo")) {
                                                                }
                                                                hashtable6 = new Hashtable();
                                                                Object obj68 = "schMsgInfo";
                                                                if (hashtable3.containsKey("language_detection_version")) {
                                                                }
                                                                if (hashtable3.containsKey("detected_language")) {
                                                                }
                                                                if (hashtable3.containsKey("translation")) {
                                                                }
                                                                if (!hashtable6.isEmpty()) {
                                                                }
                                                                ArrayList arrayList6 = new ArrayList();
                                                                if (hashtable3.containsKey("msglist")) {
                                                                }
                                                                it = arrayList6.iterator();
                                                                String str97 = str6;
                                                                while (it.hasNext()) {
                                                                }
                                                                cVar = this;
                                                                i11 = intValue2;
                                                                if (C4379a.this.f47398b == null) {
                                                                }
                                                            }
                                                            if (hashtable3.containsKey("title")) {
                                                                hashtable2.put("title", (String) hashtable3.get("title"));
                                                            }
                                                            String str98 = hashtable3.containsKey("addinfo") ? (String) hashtable3.get("addinfo") : null;
                                                            if (str.equals("11")) {
                                                                str6 = str94;
                                                                try {
                                                                    if (hashtable3.containsKey(obj65)) {
                                                                        str2 = (String) hashtable3.get(obj65);
                                                                    }
                                                                    obj65 = obj65;
                                                                    try {
                                                                        if (hashtable3.containsKey(obj62)) {
                                                                            hashtable2.put(obj62, hashtable3.get(obj62));
                                                                        }
                                                                        if (hashtable3.containsKey("isfirstthreadmessage")) {
                                                                            obj62 = obj62;
                                                                            try {
                                                                                hashtable2.put("isfirstthreadmessage", hashtable3.get("isfirstthreadmessage"));
                                                                            } catch (Exception e38) {
                                                                                e = e38;
                                                                                obj15 = "pcount";
                                                                                obj3 = "parentmessagesenderid";
                                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                obj5 = obj15;
                                                                                obj4 = "temp_info";
                                                                                if (hashtable3.containsKey(obj4)) {
                                                                                }
                                                                                String str962 = str;
                                                                                if (hashtable3.containsKey("schMsgInfo")) {
                                                                                }
                                                                                hashtable6 = new Hashtable();
                                                                                Object obj682 = "schMsgInfo";
                                                                                if (hashtable3.containsKey("language_detection_version")) {
                                                                                }
                                                                                if (hashtable3.containsKey("detected_language")) {
                                                                                }
                                                                                if (hashtable3.containsKey("translation")) {
                                                                                }
                                                                                if (!hashtable6.isEmpty()) {
                                                                                }
                                                                                ArrayList arrayList62 = new ArrayList();
                                                                                if (hashtable3.containsKey("msglist")) {
                                                                                }
                                                                                it = arrayList62.iterator();
                                                                                String str972 = str6;
                                                                                while (it.hasNext()) {
                                                                                }
                                                                                cVar = this;
                                                                                i11 = intValue2;
                                                                                if (C4379a.this.f47398b == null) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj62 = obj62;
                                                                        }
                                                                        if (hashtable3.containsKey("post_in_parent")) {
                                                                            hashtable2.put("post_in_parent", hashtable3.get("post_in_parent"));
                                                                        }
                                                                        try {
                                                                            if (hashtable3.containsKey(obj61)) {
                                                                                hashtable2.put(obj61, (String) hashtable3.get(obj61));
                                                                            }
                                                                            obj61 = obj61;
                                                                        } catch (Exception e39) {
                                                                            e = e39;
                                                                            obj61 = obj61;
                                                                        }
                                                                    } catch (Exception e40) {
                                                                        e = e40;
                                                                        obj62 = obj62;
                                                                    }
                                                                } catch (Exception e41) {
                                                                    e = e41;
                                                                    obj65 = obj65;
                                                                }
                                                                try {
                                                                    if (hashtable3.containsKey(obj64)) {
                                                                        hashtable2.put(obj64, (String) hashtable3.get(obj64));
                                                                    }
                                                                    obj64 = obj64;
                                                                    try {
                                                                        if (hashtable3.containsKey("parentmessagesenderid")) {
                                                                            hashtable2.put("parentmessagesenderid", (String) hashtable3.get("parentmessagesenderid"));
                                                                        }
                                                                        if (hashtable3.containsKey("title")) {
                                                                            obj3 = "parentmessagesenderid";
                                                                            try {
                                                                                hashtable2.put("threadtitle", (String) hashtable3.get("title"));
                                                                            } catch (Exception e42) {
                                                                                e = e42;
                                                                                obj15 = "pcount";
                                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                obj5 = obj15;
                                                                                obj4 = "temp_info";
                                                                                if (hashtable3.containsKey(obj4)) {
                                                                                }
                                                                                String str9622 = str;
                                                                                if (hashtable3.containsKey("schMsgInfo")) {
                                                                                }
                                                                                hashtable6 = new Hashtable();
                                                                                Object obj6822 = "schMsgInfo";
                                                                                if (hashtable3.containsKey("language_detection_version")) {
                                                                                }
                                                                                if (hashtable3.containsKey("detected_language")) {
                                                                                }
                                                                                if (hashtable3.containsKey("translation")) {
                                                                                }
                                                                                if (!hashtable6.isEmpty()) {
                                                                                }
                                                                                ArrayList arrayList622 = new ArrayList();
                                                                                if (hashtable3.containsKey("msglist")) {
                                                                                }
                                                                                it = arrayList622.iterator();
                                                                                String str9722 = str6;
                                                                                while (it.hasNext()) {
                                                                                }
                                                                                cVar = this;
                                                                                i11 = intValue2;
                                                                                if (C4379a.this.f47398b == null) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            obj3 = "parentmessagesenderid";
                                                                        }
                                                                        obj15 = "pcount";
                                                                    } catch (Exception e43) {
                                                                        e = e43;
                                                                        obj3 = "parentmessagesenderid";
                                                                    }
                                                                    try {
                                                                        if (hashtable3.containsKey(obj15)) {
                                                                            hashtable2.put(obj15, Integer.valueOf((String) hashtable3.get(obj15)));
                                                                        }
                                                                    } catch (Exception e44) {
                                                                        e = e44;
                                                                        Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                        obj5 = obj15;
                                                                        obj4 = "temp_info";
                                                                        if (hashtable3.containsKey(obj4)) {
                                                                        }
                                                                        String str96222 = str;
                                                                        if (hashtable3.containsKey("schMsgInfo")) {
                                                                        }
                                                                        hashtable6 = new Hashtable();
                                                                        Object obj68222 = "schMsgInfo";
                                                                        if (hashtable3.containsKey("language_detection_version")) {
                                                                        }
                                                                        if (hashtable3.containsKey("detected_language")) {
                                                                        }
                                                                        if (hashtable3.containsKey("translation")) {
                                                                        }
                                                                        if (!hashtable6.isEmpty()) {
                                                                        }
                                                                        ArrayList arrayList6222 = new ArrayList();
                                                                        if (hashtable3.containsKey("msglist")) {
                                                                        }
                                                                        it = arrayList6222.iterator();
                                                                        String str97222 = str6;
                                                                        while (it.hasNext()) {
                                                                        }
                                                                        cVar = this;
                                                                        i11 = intValue2;
                                                                        if (C4379a.this.f47398b == null) {
                                                                        }
                                                                    }
                                                                } catch (Exception e45) {
                                                                    e = e45;
                                                                    obj64 = obj64;
                                                                    obj15 = "pcount";
                                                                    obj3 = "parentmessagesenderid";
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                    obj5 = obj15;
                                                                    obj4 = "temp_info";
                                                                    if (hashtable3.containsKey(obj4)) {
                                                                    }
                                                                    String str962222 = str;
                                                                    if (hashtable3.containsKey("schMsgInfo")) {
                                                                    }
                                                                    hashtable6 = new Hashtable();
                                                                    Object obj682222 = "schMsgInfo";
                                                                    if (hashtable3.containsKey("language_detection_version")) {
                                                                    }
                                                                    if (hashtable3.containsKey("detected_language")) {
                                                                    }
                                                                    if (hashtable3.containsKey("translation")) {
                                                                    }
                                                                    if (!hashtable6.isEmpty()) {
                                                                    }
                                                                    ArrayList arrayList62222 = new ArrayList();
                                                                    if (hashtable3.containsKey("msglist")) {
                                                                    }
                                                                    it = arrayList62222.iterator();
                                                                    String str972222 = str6;
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    cVar = this;
                                                                    i11 = intValue2;
                                                                    if (C4379a.this.f47398b == null) {
                                                                    }
                                                                }
                                                                obj5 = obj15;
                                                                obj4 = "temp_info";
                                                            } else {
                                                                str6 = str94;
                                                                obj3 = "parentmessagesenderid";
                                                                obj4 = "temp_info";
                                                                obj5 = "pcount";
                                                            }
                                                            if (hashtable3.containsKey(obj4)) {
                                                                hashtable2.put(obj4, hashtable3.get(obj4));
                                                            }
                                                            String str9622222 = str;
                                                            if (hashtable3.containsKey("schMsgInfo")) {
                                                                hashtable2.put("schMsgInfo", hashtable3.get("schMsgInfo"));
                                                            }
                                                            hashtable6 = new Hashtable();
                                                            Object obj6822222 = "schMsgInfo";
                                                            if (hashtable3.containsKey("language_detection_version")) {
                                                                obj6 = obj4;
                                                                try {
                                                                    hashtable6.put("language_detection_version", hashtable3.get("language_detection_version"));
                                                                } catch (Exception e46) {
                                                                    e = e46;
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                    ArrayList arrayList622222 = new ArrayList();
                                                                    if (hashtable3.containsKey("msglist")) {
                                                                    }
                                                                    it = arrayList622222.iterator();
                                                                    String str9722222 = str6;
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    cVar = this;
                                                                    i11 = intValue2;
                                                                    if (C4379a.this.f47398b == null) {
                                                                    }
                                                                }
                                                            } else {
                                                                obj6 = obj4;
                                                            }
                                                            if (hashtable3.containsKey("detected_language")) {
                                                                hashtable6.put("detected_language", hashtable3.get("detected_language"));
                                                            }
                                                            if (hashtable3.containsKey("translation")) {
                                                                hashtable6.put("translation", hashtable3.get("translation"));
                                                            }
                                                            if (!hashtable6.isEmpty()) {
                                                                hashtable2.put("translations", hashtable6);
                                                            }
                                                            ArrayList arrayList6222222 = new ArrayList();
                                                            if (hashtable3.containsKey("msglist")) {
                                                                arrayList6222222 = (ArrayList) hashtable3.get("msglist");
                                                            } else {
                                                                arrayList6222222.add(hashtable3);
                                                            }
                                                            it = arrayList6222222.iterator();
                                                            String str97222222 = str6;
                                                            while (it.hasNext()) {
                                                                Hashtable hashtable22 = (Hashtable) it.next();
                                                                if (hashtable22.containsKey("chid")) {
                                                                    str2 = (String) hashtable22.get("chid");
                                                                }
                                                                if (hashtable22.containsKey(obj)) {
                                                                    hashtable2.put(obj, hashtable22.get(obj));
                                                                }
                                                                if (hashtable22.containsKey("sender")) {
                                                                    str90 = (String) hashtable22.get("sender");
                                                                }
                                                                if (hashtable22.containsKey("dname")) {
                                                                    str91 = (String) hashtable22.get("dname");
                                                                }
                                                                if (hashtable22.containsKey("customgroup")) {
                                                                    obj7 = obj;
                                                                    str7 = (String) hashtable22.get("customgroup");
                                                                } else {
                                                                    obj7 = obj;
                                                                    str7 = str92;
                                                                }
                                                                Object obj69 = hashtable22.get("meta");
                                                                try {
                                                                    if (hashtable22.containsKey("includesenderinunread") && ((Boolean) hashtable22.get("includesenderinunread")).booleanValue()) {
                                                                        it2 = it;
                                                                        try {
                                                                            hashtable2.put("unread", Boolean.TRUE);
                                                                        } catch (Exception e47) {
                                                                            e = e47;
                                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                            if (hashtable22.containsKey(m.f13664a)) {
                                                                            }
                                                                            str8 = str93;
                                                                            if (hashtable22.containsKey(C4527h.f48087o)) {
                                                                            }
                                                                            if (!hashtable22.containsKey("ht")) {
                                                                            }
                                                                            if (hashtable22.containsKey("history")) {
                                                                            }
                                                                            str10 = str95;
                                                                            if (hashtable22.containsKey("time")) {
                                                                            }
                                                                            String str99 = valueOf3;
                                                                            if (hashtable22.containsKey("mod")) {
                                                                            }
                                                                            str11 = str4;
                                                                            if (hashtable22.containsKey("title")) {
                                                                            }
                                                                            String str100 = (String) hashtable22.get("msgid");
                                                                            String str101 = (String) hashtable22.get("msguid");
                                                                            if (hashtable22.containsKey(obj60)) {
                                                                            }
                                                                            if (hashtable22.containsKey(obj63)) {
                                                                            }
                                                                            Object obj70 = obj63;
                                                                            obj8 = obj66;
                                                                            if (hashtable22.containsKey(obj8)) {
                                                                            }
                                                                            if (hashtable22.containsKey(obj67)) {
                                                                            }
                                                                            Object obj71 = obj60;
                                                                            obj9 = obj6;
                                                                            if (hashtable22.containsKey(obj9)) {
                                                                            }
                                                                            obj6 = obj9;
                                                                            obj10 = obj6822222;
                                                                            if (hashtable22.containsKey(obj10)) {
                                                                            }
                                                                            hashtable5 = new Hashtable();
                                                                            obj6822222 = obj10;
                                                                            try {
                                                                                if (hashtable22.containsKey("language_detection_version")) {
                                                                                }
                                                                                if (hashtable22.containsKey("detected_language")) {
                                                                                }
                                                                                if (hashtable22.containsKey("translation")) {
                                                                                }
                                                                                if (!hashtable5.isEmpty()) {
                                                                                }
                                                                            } catch (Exception e48) {
                                                                                e = e48;
                                                                                obj11 = obj67;
                                                                            }
                                                                            if (hashtable22.containsKey("addinfo")) {
                                                                            }
                                                                            str12 = str98;
                                                                            str13 = str9622222;
                                                                            if (str13.equals("11")) {
                                                                            }
                                                                            if (str97222222 != null) {
                                                                            }
                                                                            if (str9 != null) {
                                                                            }
                                                                            if (hashtable22.containsKey("includesenderinunread")) {
                                                                            }
                                                                            str14 = str9;
                                                                            i13 = -1;
                                                                            if (hashtable22.containsKey("version")) {
                                                                            }
                                                                            if (i13 != -1) {
                                                                            }
                                                                            if (str7 != null) {
                                                                            }
                                                                            Object obj72 = obj2;
                                                                            Object obj73 = hashtable22.get(obj72);
                                                                            cVar = this;
                                                                            String str102 = str7;
                                                                            obj2 = obj72;
                                                                            arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                            if (arrayList != null) {
                                                                            }
                                                                            str16 = str11;
                                                                            str17 = str90;
                                                                            str18 = str2;
                                                                            intValue2 = i12;
                                                                            obj5 = obj12;
                                                                            str5 = str14;
                                                                            obj = obj7;
                                                                            str2 = str18;
                                                                            str90 = str17;
                                                                            str91 = str15;
                                                                            str95 = str10;
                                                                            str4 = str16;
                                                                            z10 = z11;
                                                                            str98 = str12;
                                                                            str93 = str8;
                                                                            hashtable2 = hashtable4;
                                                                            it = it2;
                                                                            obj67 = obj11;
                                                                            str92 = str102;
                                                                            obj64 = obj14;
                                                                            obj65 = obj13;
                                                                            obj60 = obj71;
                                                                            obj66 = obj8;
                                                                            obj63 = obj70;
                                                                        }
                                                                    } else {
                                                                        it2 = it;
                                                                    }
                                                                } catch (Exception e49) {
                                                                    e = e49;
                                                                    it2 = it;
                                                                }
                                                                if (hashtable22.containsKey(m.f13664a)) {
                                                                    str93 = (String) hashtable22.get(m.f13664a);
                                                                }
                                                                str8 = str93;
                                                                if (hashtable22.containsKey(C4527h.f48087o)) {
                                                                    str97222222 = (String) hashtable22.get(C4527h.f48087o);
                                                                }
                                                                str9 = !hashtable22.containsKey("ht") ? (String) hashtable22.get("ht") : str5;
                                                                if (hashtable22.containsKey("history")) {
                                                                    str95 = (String) hashtable22.get("history");
                                                                }
                                                                str10 = str95;
                                                                if (hashtable22.containsKey("time")) {
                                                                    valueOf3 = String.valueOf(hashtable22.get("time"));
                                                                }
                                                                String str992 = valueOf3;
                                                                if (hashtable22.containsKey("mod")) {
                                                                    str4 = (String) hashtable22.get("mod");
                                                                }
                                                                str11 = str4;
                                                                if (hashtable22.containsKey("title")) {
                                                                    hashtable2.put("title", (String) hashtable22.get("title"));
                                                                }
                                                                String str1002 = (String) hashtable22.get("msgid");
                                                                String str1012 = (String) hashtable22.get("msguid");
                                                                if (hashtable22.containsKey(obj60)) {
                                                                    hashtable2.put(obj60, hashtable22.get(obj60));
                                                                }
                                                                if (hashtable22.containsKey(obj63)) {
                                                                    hashtable2.put(obj63, hashtable22.get(obj63));
                                                                }
                                                                Object obj702 = obj63;
                                                                obj8 = obj66;
                                                                if (hashtable22.containsKey(obj8)) {
                                                                    hashtable2.put(obj8, hashtable22.get(obj8));
                                                                }
                                                                if (hashtable22.containsKey(obj67)) {
                                                                    hashtable2.put(obj67, hashtable22.get(obj67));
                                                                }
                                                                Object obj712 = obj60;
                                                                obj9 = obj6;
                                                                if (hashtable22.containsKey(obj9)) {
                                                                    hashtable2.put(obj9, hashtable22.get(obj9));
                                                                }
                                                                obj6 = obj9;
                                                                obj10 = obj6822222;
                                                                if (hashtable22.containsKey(obj10)) {
                                                                    hashtable2.put(obj10, hashtable22.get(obj10));
                                                                }
                                                                try {
                                                                    hashtable5 = new Hashtable();
                                                                    obj6822222 = obj10;
                                                                    if (hashtable22.containsKey("language_detection_version")) {
                                                                        obj11 = obj67;
                                                                    } else {
                                                                        obj11 = obj67;
                                                                        try {
                                                                            hashtable5.put("language_detection_version", hashtable22.get("language_detection_version"));
                                                                        } catch (Exception e50) {
                                                                            e = e50;
                                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                            if (hashtable22.containsKey("addinfo")) {
                                                                            }
                                                                            str12 = str98;
                                                                            str13 = str9622222;
                                                                            if (str13.equals("11")) {
                                                                            }
                                                                            if (str97222222 != null) {
                                                                            }
                                                                            if (str9 != null) {
                                                                            }
                                                                            if (hashtable22.containsKey("includesenderinunread")) {
                                                                            }
                                                                            str14 = str9;
                                                                            i13 = -1;
                                                                            if (hashtable22.containsKey("version")) {
                                                                            }
                                                                            if (i13 != -1) {
                                                                            }
                                                                            if (str7 != null) {
                                                                            }
                                                                            Object obj722 = obj2;
                                                                            Object obj732 = hashtable22.get(obj722);
                                                                            cVar = this;
                                                                            String str1022 = str7;
                                                                            obj2 = obj722;
                                                                            arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                            if (arrayList != null) {
                                                                            }
                                                                            str16 = str11;
                                                                            str17 = str90;
                                                                            str18 = str2;
                                                                            intValue2 = i12;
                                                                            obj5 = obj12;
                                                                            str5 = str14;
                                                                            obj = obj7;
                                                                            str2 = str18;
                                                                            str90 = str17;
                                                                            str91 = str15;
                                                                            str95 = str10;
                                                                            str4 = str16;
                                                                            z10 = z11;
                                                                            str98 = str12;
                                                                            str93 = str8;
                                                                            hashtable2 = hashtable4;
                                                                            it = it2;
                                                                            obj67 = obj11;
                                                                            str92 = str1022;
                                                                            obj64 = obj14;
                                                                            obj65 = obj13;
                                                                            obj60 = obj712;
                                                                            obj66 = obj8;
                                                                            obj63 = obj702;
                                                                        }
                                                                    }
                                                                    if (hashtable22.containsKey("detected_language")) {
                                                                        hashtable5.put("detected_language", hashtable22.get("detected_language"));
                                                                    }
                                                                    if (hashtable22.containsKey("translation")) {
                                                                        hashtable5.put("translation", hashtable22.get("translation"));
                                                                    }
                                                                    if (!hashtable5.isEmpty()) {
                                                                        hashtable2.put("translations", hashtable5);
                                                                    }
                                                                } catch (Exception e51) {
                                                                    e = e51;
                                                                    obj11 = obj67;
                                                                    obj6822222 = obj10;
                                                                }
                                                                if (hashtable22.containsKey("addinfo")) {
                                                                    str98 = (String) hashtable22.get("addinfo");
                                                                }
                                                                str12 = str98;
                                                                str13 = str9622222;
                                                                if (str13.equals("11")) {
                                                                    obj13 = obj65;
                                                                    try {
                                                                        if (hashtable22.containsKey(obj13)) {
                                                                            str2 = (String) hashtable22.get(obj13);
                                                                        }
                                                                        str9622222 = str13;
                                                                        Object obj74 = obj62;
                                                                        try {
                                                                            if (hashtable22.containsKey(obj74)) {
                                                                                hashtable2.put(obj74, hashtable22.get(obj74));
                                                                            }
                                                                            obj62 = obj74;
                                                                            Object obj75 = obj61;
                                                                            try {
                                                                                if (hashtable22.containsKey(obj75)) {
                                                                                    hashtable2.put(obj75, (String) hashtable22.get(obj75));
                                                                                }
                                                                                obj61 = obj75;
                                                                                Object obj76 = obj64;
                                                                                try {
                                                                                    if (hashtable22.containsKey(obj76)) {
                                                                                        hashtable2.put(obj76, (String) hashtable22.get(obj76));
                                                                                    }
                                                                                    obj14 = obj76;
                                                                                    Object obj77 = obj3;
                                                                                    try {
                                                                                        if (hashtable22.containsKey(obj77)) {
                                                                                            hashtable2.put(obj77, (String) hashtable22.get(obj77));
                                                                                        }
                                                                                        if (hashtable22.containsKey("title")) {
                                                                                            obj3 = obj77;
                                                                                            try {
                                                                                                hashtable2.put("threadtitle", (String) hashtable22.get("title"));
                                                                                            } catch (Exception e52) {
                                                                                                e = e52;
                                                                                                obj12 = obj5;
                                                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                                if (str97222222 != null) {
                                                                                                }
                                                                                                if (str9 != null) {
                                                                                                }
                                                                                                if (hashtable22.containsKey("includesenderinunread")) {
                                                                                                }
                                                                                                str14 = str9;
                                                                                                i13 = -1;
                                                                                                if (hashtable22.containsKey("version")) {
                                                                                                }
                                                                                                if (i13 != -1) {
                                                                                                }
                                                                                                if (str7 != null) {
                                                                                                }
                                                                                                Object obj7222 = obj2;
                                                                                                Object obj7322 = hashtable22.get(obj7222);
                                                                                                cVar = this;
                                                                                                String str10222 = str7;
                                                                                                obj2 = obj7222;
                                                                                                arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                                                if (arrayList != null) {
                                                                                                }
                                                                                                str16 = str11;
                                                                                                str17 = str90;
                                                                                                str18 = str2;
                                                                                                intValue2 = i12;
                                                                                                obj5 = obj12;
                                                                                                str5 = str14;
                                                                                                obj = obj7;
                                                                                                str2 = str18;
                                                                                                str90 = str17;
                                                                                                str91 = str15;
                                                                                                str95 = str10;
                                                                                                str4 = str16;
                                                                                                z10 = z11;
                                                                                                str98 = str12;
                                                                                                str93 = str8;
                                                                                                hashtable2 = hashtable4;
                                                                                                it = it2;
                                                                                                obj67 = obj11;
                                                                                                str92 = str10222;
                                                                                                obj64 = obj14;
                                                                                                obj65 = obj13;
                                                                                                obj60 = obj712;
                                                                                                obj66 = obj8;
                                                                                                obj63 = obj702;
                                                                                            }
                                                                                        } else {
                                                                                            obj3 = obj77;
                                                                                        }
                                                                                        obj12 = obj5;
                                                                                        try {
                                                                                            if (hashtable22.containsKey(obj12)) {
                                                                                                hashtable2.put(obj12, Integer.valueOf((String) hashtable22.get(obj12)));
                                                                                            }
                                                                                        } catch (Exception e53) {
                                                                                            e = e53;
                                                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                            if (str97222222 != null) {
                                                                                            }
                                                                                            if (str9 != null) {
                                                                                            }
                                                                                            if (hashtable22.containsKey("includesenderinunread")) {
                                                                                            }
                                                                                            str14 = str9;
                                                                                            i13 = -1;
                                                                                            if (hashtable22.containsKey("version")) {
                                                                                            }
                                                                                            if (i13 != -1) {
                                                                                            }
                                                                                            if (str7 != null) {
                                                                                            }
                                                                                            Object obj72222 = obj2;
                                                                                            Object obj73222 = hashtable22.get(obj72222);
                                                                                            cVar = this;
                                                                                            String str102222 = str7;
                                                                                            obj2 = obj72222;
                                                                                            arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                                            if (arrayList != null) {
                                                                                            }
                                                                                            str16 = str11;
                                                                                            str17 = str90;
                                                                                            str18 = str2;
                                                                                            intValue2 = i12;
                                                                                            obj5 = obj12;
                                                                                            str5 = str14;
                                                                                            obj = obj7;
                                                                                            str2 = str18;
                                                                                            str90 = str17;
                                                                                            str91 = str15;
                                                                                            str95 = str10;
                                                                                            str4 = str16;
                                                                                            z10 = z11;
                                                                                            str98 = str12;
                                                                                            str93 = str8;
                                                                                            hashtable2 = hashtable4;
                                                                                            it = it2;
                                                                                            obj67 = obj11;
                                                                                            str92 = str102222;
                                                                                            obj64 = obj14;
                                                                                            obj65 = obj13;
                                                                                            obj60 = obj712;
                                                                                            obj66 = obj8;
                                                                                            obj63 = obj702;
                                                                                        }
                                                                                    } catch (Exception e54) {
                                                                                        e = e54;
                                                                                        obj3 = obj77;
                                                                                    }
                                                                                } catch (Exception e55) {
                                                                                    e = e55;
                                                                                    obj14 = obj76;
                                                                                }
                                                                            } catch (Exception e56) {
                                                                                e = e56;
                                                                                obj61 = obj75;
                                                                                obj14 = obj64;
                                                                                obj12 = obj5;
                                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                if (str97222222 != null) {
                                                                                }
                                                                                if (str9 != null) {
                                                                                }
                                                                                if (hashtable22.containsKey("includesenderinunread")) {
                                                                                }
                                                                                str14 = str9;
                                                                                i13 = -1;
                                                                                if (hashtable22.containsKey("version")) {
                                                                                }
                                                                                if (i13 != -1) {
                                                                                }
                                                                                if (str7 != null) {
                                                                                }
                                                                                Object obj722222 = obj2;
                                                                                Object obj732222 = hashtable22.get(obj722222);
                                                                                cVar = this;
                                                                                String str1022222 = str7;
                                                                                obj2 = obj722222;
                                                                                arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                                if (arrayList != null) {
                                                                                }
                                                                                str16 = str11;
                                                                                str17 = str90;
                                                                                str18 = str2;
                                                                                intValue2 = i12;
                                                                                obj5 = obj12;
                                                                                str5 = str14;
                                                                                obj = obj7;
                                                                                str2 = str18;
                                                                                str90 = str17;
                                                                                str91 = str15;
                                                                                str95 = str10;
                                                                                str4 = str16;
                                                                                z10 = z11;
                                                                                str98 = str12;
                                                                                str93 = str8;
                                                                                hashtable2 = hashtable4;
                                                                                it = it2;
                                                                                obj67 = obj11;
                                                                                str92 = str1022222;
                                                                                obj64 = obj14;
                                                                                obj65 = obj13;
                                                                                obj60 = obj712;
                                                                                obj66 = obj8;
                                                                                obj63 = obj702;
                                                                            }
                                                                        } catch (Exception e57) {
                                                                            e = e57;
                                                                            obj62 = obj74;
                                                                        }
                                                                    } catch (Exception e58) {
                                                                        e = e58;
                                                                        str9622222 = str13;
                                                                    }
                                                                } else {
                                                                    str9622222 = str13;
                                                                    obj12 = obj5;
                                                                    obj13 = obj65;
                                                                    obj14 = obj64;
                                                                }
                                                                if (str97222222 != null) {
                                                                    hashtable2.put(C4527h.f48087o, str97222222);
                                                                }
                                                                if (str9 != null) {
                                                                    hashtable2.put("ht", str9);
                                                                }
                                                                try {
                                                                    if (hashtable22.containsKey("includesenderinunread") || !((Boolean) hashtable22.get("includesenderinunread")).booleanValue()) {
                                                                        str14 = str9;
                                                                    } else {
                                                                        str14 = str9;
                                                                        try {
                                                                            hashtable2.put("unread", Boolean.TRUE);
                                                                        } catch (Exception e59) {
                                                                            e = e59;
                                                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                            i13 = -1;
                                                                            if (hashtable22.containsKey("version")) {
                                                                            }
                                                                            if (i13 != -1) {
                                                                            }
                                                                            if (str7 != null) {
                                                                            }
                                                                            Object obj7222222 = obj2;
                                                                            Object obj7322222 = hashtable22.get(obj7222222);
                                                                            cVar = this;
                                                                            String str10222222 = str7;
                                                                            obj2 = obj7222222;
                                                                            arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                            if (arrayList != null) {
                                                                            }
                                                                            str16 = str11;
                                                                            str17 = str90;
                                                                            str18 = str2;
                                                                            intValue2 = i12;
                                                                            obj5 = obj12;
                                                                            str5 = str14;
                                                                            obj = obj7;
                                                                            str2 = str18;
                                                                            str90 = str17;
                                                                            str91 = str15;
                                                                            str95 = str10;
                                                                            str4 = str16;
                                                                            z10 = z11;
                                                                            str98 = str12;
                                                                            str93 = str8;
                                                                            hashtable2 = hashtable4;
                                                                            it = it2;
                                                                            obj67 = obj11;
                                                                            str92 = str10222222;
                                                                            obj64 = obj14;
                                                                            obj65 = obj13;
                                                                            obj60 = obj712;
                                                                            obj66 = obj8;
                                                                            obj63 = obj702;
                                                                        }
                                                                    }
                                                                } catch (Exception e60) {
                                                                    e = e60;
                                                                    str14 = str9;
                                                                }
                                                                i13 = -1;
                                                                try {
                                                                    if (hashtable22.containsKey("version")) {
                                                                        Integer num3 = (Integer) hashtable22.get("version");
                                                                        num3.intValue();
                                                                        i13 = num3.intValue();
                                                                    } else if (hashtable22.containsKey("revision")) {
                                                                        Integer num4 = (Integer) hashtable22.get("revision");
                                                                        num4.intValue();
                                                                        i13 = num4.intValue();
                                                                    }
                                                                } catch (Exception e61) {
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e61));
                                                                }
                                                                if (i13 != -1) {
                                                                    hashtable2.put("revision", Integer.valueOf(i13));
                                                                }
                                                                if (str7 != null) {
                                                                    hashtable2.put("customgroup", str7);
                                                                }
                                                                Object obj72222222 = obj2;
                                                                Object obj73222222 = hashtable22.get(obj72222222);
                                                                cVar = this;
                                                                String str102222222 = str7;
                                                                try {
                                                                    obj2 = obj72222222;
                                                                    arrayList = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str9622222));
                                                                    if (arrayList != null) {
                                                                        i12 = intValue2;
                                                                        if (i12 == EnumC4204a.WM_TXT_MSG.b()) {
                                                                            try {
                                                                                Iterator it8 = arrayList.iterator();
                                                                                while (it8.hasNext()) {
                                                                                    Hashtable hashtable23 = hashtable2;
                                                                                    String str103 = str91;
                                                                                    String str104 = str1012;
                                                                                    String str105 = str90;
                                                                                    String str106 = str1002;
                                                                                    Object obj78 = obj73222222;
                                                                                    String str107 = str2;
                                                                                    ((InterfaceC4282a) it8.next()).m(str107, str105, str103, str10, obj78, str106, str104, str992, Boolean.valueOf(z10), str12, obj69, str8, hashtable23);
                                                                                    obj73222222 = obj78;
                                                                                    str1002 = str106;
                                                                                    str1012 = str104;
                                                                                    str2 = str107;
                                                                                    str90 = str105;
                                                                                    str91 = str103;
                                                                                    hashtable2 = hashtable23;
                                                                                }
                                                                                z11 = z10;
                                                                                hashtable4 = hashtable2;
                                                                                str15 = str91;
                                                                                valueOf3 = str992;
                                                                            } catch (Exception e62) {
                                                                                e = e62;
                                                                                i11 = i12;
                                                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                                if (C4379a.this.f47398b == null) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            hashtable4 = hashtable2;
                                                                            str15 = str91;
                                                                            str17 = str90;
                                                                            str18 = str2;
                                                                            if (i12 == EnumC4204a.WM_NFY_ATTACH.b()) {
                                                                                Iterator it9 = arrayList.iterator();
                                                                                while (it9.hasNext()) {
                                                                                    boolean z15 = z10;
                                                                                    String str108 = str10;
                                                                                    Hashtable hashtable24 = hashtable4;
                                                                                    Object obj79 = obj73222222;
                                                                                    String str109 = str8;
                                                                                    Object obj80 = obj69;
                                                                                    String str110 = str12;
                                                                                    String str111 = str992;
                                                                                    String str112 = str11;
                                                                                    ((InterfaceC4282a) it9.next()).j(str18, str17, str15, obj79, str1002, str1012, str108, str112, z15, str111, str110, obj80, str109, hashtable24);
                                                                                    obj73222222 = obj79;
                                                                                    str10 = str108;
                                                                                    str12 = str110;
                                                                                    obj69 = obj80;
                                                                                    str8 = str109;
                                                                                    hashtable4 = hashtable24;
                                                                                    str11 = str112;
                                                                                    z10 = z15;
                                                                                    str992 = str111;
                                                                                    str1012 = str1012;
                                                                                }
                                                                            }
                                                                            z11 = z10;
                                                                            valueOf3 = str992;
                                                                            str16 = str11;
                                                                            intValue2 = i12;
                                                                            obj5 = obj12;
                                                                            str5 = str14;
                                                                            obj = obj7;
                                                                            str2 = str18;
                                                                            str90 = str17;
                                                                            str91 = str15;
                                                                            str95 = str10;
                                                                            str4 = str16;
                                                                            z10 = z11;
                                                                            str98 = str12;
                                                                            str93 = str8;
                                                                            hashtable2 = hashtable4;
                                                                            it = it2;
                                                                            obj67 = obj11;
                                                                            str92 = str102222222;
                                                                            obj64 = obj14;
                                                                            obj65 = obj13;
                                                                            obj60 = obj712;
                                                                            obj66 = obj8;
                                                                            obj63 = obj702;
                                                                        }
                                                                    } else {
                                                                        z11 = z10;
                                                                        hashtable4 = hashtable2;
                                                                        str15 = str91;
                                                                        valueOf3 = str992;
                                                                        i12 = intValue2;
                                                                    }
                                                                    str16 = str11;
                                                                    str17 = str90;
                                                                    str18 = str2;
                                                                    intValue2 = i12;
                                                                    obj5 = obj12;
                                                                    str5 = str14;
                                                                    obj = obj7;
                                                                    str2 = str18;
                                                                    str90 = str17;
                                                                    str91 = str15;
                                                                    str95 = str10;
                                                                    str4 = str16;
                                                                    z10 = z11;
                                                                    str98 = str12;
                                                                    str93 = str8;
                                                                    hashtable2 = hashtable4;
                                                                    it = it2;
                                                                    obj67 = obj11;
                                                                    str92 = str102222222;
                                                                    obj64 = obj14;
                                                                    obj65 = obj13;
                                                                    obj60 = obj712;
                                                                    obj66 = obj8;
                                                                    obj63 = obj702;
                                                                } catch (Exception e63) {
                                                                    e = e63;
                                                                    i12 = intValue2;
                                                                    i11 = i12;
                                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                                    if (C4379a.this.f47398b == null) {
                                                                    }
                                                                }
                                                            }
                                                            cVar = this;
                                                            i11 = intValue2;
                                                        }
                                                    }
                                                    str5 = str3;
                                                    if (hashtable3.containsKey("title")) {
                                                    }
                                                    if (hashtable3.containsKey("addinfo")) {
                                                    }
                                                    if (str.equals("11")) {
                                                    }
                                                    if (hashtable3.containsKey(obj4)) {
                                                    }
                                                    String str96222222 = str;
                                                    if (hashtable3.containsKey("schMsgInfo")) {
                                                    }
                                                    hashtable6 = new Hashtable();
                                                    Object obj68222222 = "schMsgInfo";
                                                    if (hashtable3.containsKey("language_detection_version")) {
                                                    }
                                                    if (hashtable3.containsKey("detected_language")) {
                                                    }
                                                    if (hashtable3.containsKey("translation")) {
                                                    }
                                                    if (!hashtable6.isEmpty()) {
                                                    }
                                                    ArrayList arrayList62222222 = new ArrayList();
                                                    if (hashtable3.containsKey("msglist")) {
                                                    }
                                                    it = arrayList62222222.iterator();
                                                    String str972222222 = str6;
                                                    while (it.hasNext()) {
                                                    }
                                                    cVar = this;
                                                    i11 = intValue2;
                                                } catch (Exception e64) {
                                                    e = e64;
                                                    cVar = this;
                                                    i12 = intValue2;
                                                    i11 = i12;
                                                    Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                    if (C4379a.this.f47398b == null) {
                                                    }
                                                }
                                            } catch (Exception e65) {
                                                e = e65;
                                                cVar = this;
                                                i11 = i10;
                                                Log.e("WMSLibrary", Log.getStackTraceString(e));
                                                if (C4379a.this.f47398b == null) {
                                                }
                                            }
                                        } catch (Exception e66) {
                                            e = e66;
                                            cVar = this;
                                            i11 = i10;
                                            Log.e("WMSLibrary", Log.getStackTraceString(e));
                                            if (C4379a.this.f47398b == null) {
                                            }
                                        }
                                    } else {
                                        cVar = this;
                                        i14 = intValue;
                                        if (i14 == EnumC4204a.WM_NFY_USERSTATUS.b()) {
                                            Hashtable hashtable25 = (Hashtable) hashtable.get("msg");
                                            String str113 = (String) hashtable25.get("chid");
                                            String str114 = (String) hashtable25.get("uname");
                                            String str115 = (String) hashtable25.get("dname");
                                            String str116 = (String) hashtable25.get("scode");
                                            String str117 = (String) hashtable25.get("smsg");
                                            String str118 = (String) hashtable25.get("status");
                                            ArrayList arrayList7 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf((String) hashtable25.get("ctype")));
                                            if (arrayList7 != null) {
                                                Iterator it10 = arrayList7.iterator();
                                                while (it10.hasNext()) {
                                                    InterfaceC4282a interfaceC4282a = (InterfaceC4282a) it10.next();
                                                    if (str118.equals("1")) {
                                                        interfaceC4282a.n(str113, str114, str115, new C4205b(str116, str117));
                                                    } else if (str118.equals("0")) {
                                                        interfaceC4282a.d(str113, str114, str115, new C4205b(str116, str117));
                                                    }
                                                }
                                            }
                                        } else if (i14 == EnumC4204a.WM_NFY_MEMBERADD.b()) {
                                            Hashtable hashtable26 = (Hashtable) hashtable.get("msg");
                                            String str119 = (String) hashtable26.get("chid");
                                            String str120 = (String) hashtable26.get("time");
                                            String str121 = (String) hashtable26.get("pcount");
                                            Object obj81 = hashtable26.get("opruser");
                                            str22 = "";
                                            String str122 = "";
                                            if (obj81 instanceof Hashtable) {
                                                Hashtable hashtable27 = (Hashtable) obj81;
                                                str22 = hashtable27.containsKey("uname") ? (String) hashtable27.get("uname") : "";
                                                if (hashtable27.containsKey("zuid")) {
                                                    str22 = (String) hashtable27.get("zuid");
                                                }
                                                if (hashtable27.containsKey("nname")) {
                                                    str122 = (String) hashtable27.get("nname");
                                                }
                                            }
                                            String str123 = str22;
                                            String str124 = str122;
                                            ArrayList arrayList8 = (ArrayList) hashtable26.get("users");
                                            String str125 = (String) hashtable26.get("ctype");
                                            if (str125.equals("11") && hashtable26.containsKey(obj65)) {
                                                str119 = (String) hashtable26.get(obj65);
                                            }
                                            String str126 = str119;
                                            Hashtable hashtable28 = new Hashtable();
                                            String str127 = hashtable26.containsKey("subscribercount") ? (String) hashtable26.get("subscribercount") : null;
                                            if (str127 != null && !str127.trim().isEmpty()) {
                                                hashtable28.put("subscribercount", str127);
                                            }
                                            ArrayList arrayList9 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str125));
                                            if (arrayList9 != null) {
                                                Iterator it11 = arrayList9.iterator();
                                                while (it11.hasNext()) {
                                                    Hashtable hashtable29 = hashtable28;
                                                    ((InterfaceC4282a) it11.next()).l(str126, str123, str124, arrayList8, str121, str120, hashtable29);
                                                    hashtable28 = hashtable29;
                                                }
                                            }
                                        } else if (i14 == EnumC4204a.WM_NFY_MEMBERDELETE.b()) {
                                            Hashtable hashtable30 = (Hashtable) hashtable.get("msg");
                                            String str128 = (String) hashtable30.get("chid");
                                            String str129 = (String) hashtable30.get("time");
                                            String str130 = (String) hashtable30.get("pcount");
                                            Object obj82 = hashtable30.get("opruser");
                                            str21 = "";
                                            String str131 = "";
                                            if (obj82 instanceof Hashtable) {
                                                Hashtable hashtable31 = (Hashtable) obj82;
                                                str21 = hashtable31.containsKey("uname") ? (String) hashtable31.get("uname") : "";
                                                if (hashtable31.containsKey("zuid")) {
                                                    str21 = (String) hashtable31.get("zuid");
                                                }
                                                if (hashtable31.containsKey("nname")) {
                                                    str131 = (String) hashtable31.get("nname");
                                                }
                                            }
                                            String str132 = str21;
                                            String str133 = str131;
                                            ArrayList arrayList10 = (ArrayList) hashtable30.get("users");
                                            String str134 = (String) hashtable30.get("ctype");
                                            if (str134.equals("11") && hashtable30.containsKey(obj65)) {
                                                str128 = (String) hashtable30.get(obj65);
                                            }
                                            String str135 = str128;
                                            Hashtable hashtable32 = new Hashtable();
                                            String str136 = hashtable30.containsKey("subscribercount") ? (String) hashtable30.get("subscribercount") : null;
                                            if (str136 != null && !str136.trim().isEmpty()) {
                                                hashtable32.put("subscribercount", str136);
                                            }
                                            ArrayList arrayList11 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str134));
                                            if (arrayList11 != null) {
                                                Iterator it12 = arrayList11.iterator();
                                                while (it12.hasNext()) {
                                                    Hashtable hashtable33 = hashtable32;
                                                    ((InterfaceC4282a) it12.next()).b(str135, str132, str133, arrayList10, str130, str129, hashtable33);
                                                    hashtable32 = hashtable33;
                                                }
                                            }
                                        } else if (i14 == EnumC4204a.WM_NFY_INVITE.b()) {
                                            Hashtable hashtable34 = (Hashtable) hashtable.get("msg");
                                            String str137 = (String) hashtable34.get("chid");
                                            String str138 = (String) hashtable34.get("zuid");
                                            String str139 = (String) hashtable34.get("nname");
                                            ArrayList arrayList12 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf((String) hashtable34.get("ctype")));
                                            if (arrayList12 != null) {
                                                Iterator it13 = arrayList12.iterator();
                                                while (it13.hasNext()) {
                                                    ((InterfaceC4282a) it13.next()).k(str137, str138, str139);
                                                }
                                            }
                                        } else if (i14 == EnumC4204a.WM_NFY_REMOVE.b()) {
                                            Hashtable hashtable35 = (Hashtable) hashtable.get("msg");
                                            String str140 = (String) hashtable35.get("chid");
                                            String str141 = (String) hashtable35.get("zuid");
                                            String str142 = (String) hashtable35.get("nname");
                                            ArrayList arrayList13 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf((String) hashtable35.get("ctype")));
                                            if (arrayList13 != null) {
                                                Iterator it14 = arrayList13.iterator();
                                                while (it14.hasNext()) {
                                                    ((InterfaceC4282a) it14.next()).c(str140, str141, str142);
                                                }
                                            }
                                        } else {
                                            try {
                                                if (i14 == EnumC4204a.WM_NFY_INFOMSG.b()) {
                                                    try {
                                                        Hashtable hashtable36 = (Hashtable) hashtable.get("msg");
                                                        String str143 = (String) hashtable36.get("chid");
                                                        Hashtable hashtable37 = (Hashtable) hashtable36.get("msg");
                                                        String str144 = (String) hashtable37.get("mode");
                                                        String str145 = (String) hashtable37.get("title");
                                                        String str146 = (String) hashtable37.get("access");
                                                        Hashtable hashtable38 = (Hashtable) hashtable37.get("opruser");
                                                        Hashtable hashtable39 = (Hashtable) hashtable37.get("oprcontext");
                                                        Object obj83 = hashtable36.get("lmsgtime");
                                                        Hashtable hashtable40 = new Hashtable();
                                                        Object obj84 = hashtable37.get("botlist");
                                                        str20 = "WMSLibrary";
                                                        if (obj84 instanceof ArrayList) {
                                                            hashtable40.put("botlist", obj84);
                                                        }
                                                        if (hashtable39 != null) {
                                                            hashtable40.put("oprcontext", hashtable39);
                                                        }
                                                        if (obj83 != null) {
                                                            hashtable40.put("lmsgtime", obj83);
                                                        }
                                                        Object obj85 = hashtable36.get("lmsguid");
                                                        if (obj85 != null) {
                                                            hashtable40.put("lmsguid", obj85);
                                                        }
                                                        String str147 = (String) hashtable36.get("pcount");
                                                        if (str147 != null && str147.trim().length() > 0) {
                                                            hashtable40.put("pcount", str147);
                                                        }
                                                        String str148 = (String) hashtable38.get("zuid");
                                                        String str149 = (String) hashtable38.get("nname");
                                                        String str150 = (String) hashtable36.get("ctype");
                                                        String str151 = (str150.equals("11") && hashtable36.containsKey(obj65)) ? (String) hashtable36.get(obj65) : str143;
                                                        String str152 = (String) hashtable36.get("msguid");
                                                        String str153 = (String) hashtable36.get("addinfo");
                                                        String str154 = (String) hashtable36.get("time");
                                                        Object obj86 = hashtable37.get("userslist");
                                                        String str155 = (String) hashtable36.get("customgroup");
                                                        Object obj87 = (!(obj86 instanceof Hashtable) || ((Hashtable) obj86).isEmpty()) ? hashtable37.containsKey("msg") ? hashtable37.get("msg") : null : obj86;
                                                        ArrayList arrayList14 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str150));
                                                        if (arrayList14 != null) {
                                                            Iterator it15 = arrayList14.iterator();
                                                            while (it15.hasNext()) {
                                                                String str156 = str150;
                                                                Hashtable hashtable41 = hashtable40;
                                                                ((InterfaceC4282a) it15.next()).h(str151, str144, str146, str145, str148, str149, obj87, str154, str152, str153, str156, str155, hashtable41);
                                                                str150 = str156;
                                                                hashtable40 = hashtable41;
                                                            }
                                                        }
                                                    } catch (Exception e67) {
                                                        e = e67;
                                                        Log.e(str37, Log.getStackTraceString(e));
                                                    }
                                                } else {
                                                    str20 = "WMSLibrary";
                                                    if (i14 == EnumC4204a.WM_NFY_TYPING.b()) {
                                                        Hashtable hashtable42 = (Hashtable) hashtable.get("msg");
                                                        String[] split = ((String) hashtable42.get("oc")).split(":", 4);
                                                        String str157 = split[0];
                                                        String str158 = split[1];
                                                        String str159 = split[2];
                                                        ArrayList arrayList15 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str158));
                                                        if (arrayList15 != null) {
                                                            Iterator it16 = arrayList15.iterator();
                                                            while (it16.hasNext()) {
                                                                ((InterfaceC4282a) it16.next()).f(str157, str159, hashtable42);
                                                            }
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_NFY_IDLE.b()) {
                                                        String[] split2 = ((String) ((Hashtable) hashtable.get("msg")).get("oc")).split(":", 4);
                                                        String str160 = split2[0];
                                                        String str161 = split2[1];
                                                        String str162 = split2[2];
                                                        ArrayList arrayList16 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str161));
                                                        if (arrayList16 != null) {
                                                            Iterator it17 = arrayList16.iterator();
                                                            while (it17.hasNext()) {
                                                                ((InterfaceC4282a) it17.next()).i(str160, str162);
                                                            }
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_NFY_TXTENTRD.b()) {
                                                        String[] split3 = ((String) ((Hashtable) hashtable.get("msg")).get("oc")).split(":", 4);
                                                        String str163 = split3[0];
                                                        String str164 = split3[1];
                                                        String str165 = split3[2];
                                                        ArrayList arrayList17 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str164));
                                                        if (arrayList17 != null) {
                                                            Iterator it18 = arrayList17.iterator();
                                                            while (it18.hasNext()) {
                                                                ((InterfaceC4282a) it18.next()).a(str163, str165);
                                                            }
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_NFY_TITLECHANGE.b()) {
                                                        Hashtable hashtable43 = (Hashtable) hashtable.get("msg");
                                                        String[] split4 = ((String) hashtable43.get("oc")).split(":", 4);
                                                        String str166 = split4[0];
                                                        String str167 = split4[1];
                                                        String str168 = split4[2];
                                                        String str169 = (String) ((Hashtable) hashtable43.get("msg")).get("title");
                                                        String str170 = (String) hashtable43.get("time");
                                                        ArrayList arrayList18 = (ArrayList) C4379a.this.f47411o.get(Integer.valueOf(str167));
                                                        if (arrayList18 != null) {
                                                            Iterator it19 = arrayList18.iterator();
                                                            while (it19.hasNext()) {
                                                                Hashtable hashtable44 = hashtable43;
                                                                ((InterfaceC4282a) it19.next()).e(str166, str168, str169, str170, hashtable44);
                                                                hashtable43 = hashtable44;
                                                            }
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_CONTACTS_MSG.b()) {
                                                        Hashtable hashtable45 = (Hashtable) hashtable.get("msg");
                                                        C4379a.f(C4379a.this);
                                                    } else if (i14 == EnumC4204a.WM_STATUS_CHANGE.b()) {
                                                        C4379a.f(C4379a.this);
                                                    } else if (i14 == EnumC4204a.WM_CUSTOM_MSG.b()) {
                                                        Object obj88 = hashtable.get("msg");
                                                        if (C4379a.this.f47412p != null) {
                                                            C4379a.this.f47412p.c(obj88);
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_CROSSPRD_MSG.b()) {
                                                        String str171 = (String) hashtable.get("prd");
                                                        Object obj89 = hashtable.get("msg");
                                                        if (C4379a.this.f47412p != null) {
                                                            C4379a.this.f47412p.b(new e(str171), obj89);
                                                        }
                                                    } else if (i14 == EnumC4204a.ZOHO_MSG.b()) {
                                                        Hashtable hashtable46 = (Hashtable) hashtable.get("msg");
                                                        String str172 = (String) hashtable.get("prd");
                                                        Object obj90 = hashtable46.get("MSG");
                                                        String str173 = (String) hashtable46.get(WebviewActivity.URL);
                                                        String str174 = (String) hashtable46.get("URLSTRING");
                                                        String str175 = (String) hashtable46.get("CATEGORY");
                                                        String str176 = (String) hashtable46.get("SENDER");
                                                        Object obj91 = hashtable46.get("ATTACHMENTS");
                                                        String str177 = (String) hashtable46.get("PARAMS");
                                                        String str178 = (String) hashtable46.get("ID");
                                                        String str179 = (String) hashtable46.get("DNAME");
                                                        String str180 = (String) hashtable46.get("ORGS");
                                                        String str181 = (String) hashtable46.get("GROUPS");
                                                        if (C4379a.this.f47412p != null) {
                                                            C4379a.this.f47412p.f(new e(str172), obj90, str173, str174, str175, str176, obj91, str177, str178, str179, str180, str181);
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_ACS_MSG.b()) {
                                                        Hashtable hashtable47 = (Hashtable) hashtable.get("msg");
                                                        String str182 = (String) hashtable47.get("type");
                                                        Object obj92 = hashtable47.get(EventKeys.DATA);
                                                        if (C4379a.this.f47412p != null) {
                                                            C4379a.this.f47412p.a(str182, obj92);
                                                        }
                                                    } else if (i14 == EnumC4204a.WM_CONTACTS_UPDATE.b() || i14 == EnumC4204a.WM_CONTACTS_DETAILS.b()) {
                                                        str37 = str20;
                                                        if (hashtable.containsKey("meta")) {
                                                            Hashtable hashtable48 = (Hashtable) hashtable.get("meta");
                                                            if (hashtable48.containsKey("count")) {
                                                                String.valueOf(hashtable48.get("count"));
                                                            }
                                                        }
                                                        C4379a.f(C4379a.this);
                                                    } else if (i14 != -1) {
                                                        str37 = str20;
                                                        if (i14 == -25) {
                                                            if (hashtable.containsKey("domain")) {
                                                                C4379a.this.f47413q = (String) hashtable.get("domain");
                                                                C4379a.this.f47410n = true;
                                                                C4379a.this.v();
                                                            }
                                                        } else if (i14 < 250 || i14 > 253) {
                                                            if (i14 == -5 || i14 == -2) {
                                                                C4379a.this.f47399c = true;
                                                                if (C4379a.this.f47408l != null) {
                                                                    C4379a.this.f47408l.cancel();
                                                                    C4379a.this.f47408l.purge();
                                                                }
                                                                C4379a.this.f47400d = 0;
                                                            }
                                                            Object obj93 = hashtable.get("msg");
                                                            if (C4379a.this.f47412p != null) {
                                                                C4379a.this.f47412p.d(valueOf, obj93);
                                                            }
                                                        } else if (C4379a.this.f47412p != null) {
                                                            C4379a.this.f47412p.e(hashtable);
                                                        }
                                                    } else if (!C4379a.this.f47401e.x()) {
                                                        try {
                                                            C4379a.this.f47401e.A(null, null);
                                                        } catch (C6689a e68) {
                                                            str37 = str20;
                                                            Log.e(str37, Log.getStackTraceString(e68));
                                                        }
                                                    }
                                                }
                                                str37 = str20;
                                            } catch (Exception e69) {
                                                e = e69;
                                                str37 = str19;
                                            }
                                        }
                                        i11 = i14;
                                    }
                                }
                                if (C4379a.this.f47398b == null) {
                                    C4379a.this.f47398b.m("" + i11, System.currentTimeMillis() - j10);
                                    return;
                                }
                                return;
                            } catch (Exception e70) {
                                e = e70;
                            }
                        }
                    }
                }
                cVar = this;
                i14 = intValue;
                j10 = currentTimeMillis;
                i11 = i14;
                if (C4379a.this.f47398b == null) {
                }
            } catch (Exception e71) {
                e = e71;
                Log.e(str37, Log.getStackTraceString(e));
            }
        }

        @Override // wg.InterfaceC6747b
        public void i() {
            C4379a.this.f47397a = b.DISCONNECTED;
            C4379a.this.f47401e.p();
            if (C4379a.this.f47398b != null && !C4379a.this.f47410n) {
                if (C4379a.this.f47399c) {
                    C4379a.this.f47398b.i(true);
                } else {
                    C4379a.this.f47398b.i(false);
                    C4379a.this.f47397a = b.RECONNECTED;
                }
            }
            C4379a.this.f47410n = false;
            try {
                C4379a c4379a = C4379a.this;
                if (c4379a.f47402f || c4379a.f47399c || C4379a.this.f47401e.x()) {
                    return;
                }
                C4379a.this.f47402f = true;
                l();
            } catch (Exception e10) {
                Log.e("WMSLibrary", Log.getStackTraceString(e10));
            }
        }

        @Override // wg.InterfaceC6747b
        public void j() {
            C4379a c4379a = C4379a.this;
            c4379a.f47402f = false;
            if (c4379a.f47408l != null) {
                C4379a.this.f47408l.cancel();
                C4379a.this.f47408l.purge();
            }
            C4379a c4379a2 = C4379a.this;
            c4379a2.f47400d = 0;
            c4379a2.f47398b.l();
            if (C4379a.this.f47398b != null) {
                C4379a.this.f47398b.j("onOpen time --->" + (System.currentTimeMillis() - C4379a.this.f47409m.longValue()));
            }
        }

        public void k() {
            Timer timer;
            synchronized (C4379a.this.f47407k) {
                timer = C4379a.this.f47408l;
                C4379a.this.f47408l = null;
            }
            if (timer != null) {
                try {
                    timer.cancel();
                    timer.purge();
                } catch (Exception e10) {
                    Log.e("WMSLibrary", Log.getStackTraceString(e10));
                }
            }
        }

        public void l() {
            k();
            synchronized (C4379a.this.f47407k) {
                C4379a.this.f47408l = new Timer();
                Timer timer = C4379a.this.f47408l;
                C0706a c0706a = new C0706a();
                C4379a c4379a = C4379a.this;
                timer.schedule(c0706a, ((Long) c4379a.f47406j.get(c4379a.f47400d)).longValue());
            }
        }
    }

    public static /* synthetic */ fg.c f(C4379a c4379a) {
        c4379a.getClass();
        return null;
    }

    public boolean A() {
        try {
            C6746a c6746a = this.f47401e;
            if (c6746a != null) {
                return c6746a.x();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean B(String str) {
        fg.b bVar = this.f47398b;
        if (bVar == null) {
            return true;
        }
        bVar.j(str);
        return false;
    }

    public void C(AbstractC6749d abstractC6749d) {
        if (this.f47397a != b.CONNECTED) {
            throw new C6751f(101, "No connection available");
        }
        try {
            this.f47401e.y(abstractC6749d);
        } catch (Exception e10) {
            Log.e("WMSLibrary", Log.getStackTraceString(e10));
        }
    }

    public void D(com.zoho.messenger.api.a aVar, fg.e eVar) {
        if (aVar == null || eVar == null) {
            return;
        }
        ArrayList arrayList = this.f47411o.containsKey(Integer.valueOf(aVar.b())) ? (ArrayList) this.f47411o.get(Integer.valueOf(aVar.b())) : new ArrayList();
        if (arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
        this.f47411o.put(Integer.valueOf(aVar.b()), arrayList);
    }

    public void E(fg.b bVar) {
        this.f47398b = bVar;
    }

    public void F(d dVar) {
        this.f47412p = dVar;
    }

    public void G() {
        try {
            if (this.f47397a != b.DISCONNECTED) {
                this.f47399c = false;
                this.f47401e.C();
            }
        } catch (Exception e10) {
            Log.e("WMPEXAdapter", Log.getStackTraceString(e10));
        }
    }

    public void H() {
        this.f47399c = true;
        Timer timer = this.f47408l;
        if (timer != null) {
            timer.cancel();
            this.f47408l.purge();
        }
        this.f47400d = 0;
    }

    public void I() {
        this.f47401e.I();
    }

    public final void J() {
        try {
            this.f47409m = Long.valueOf(System.currentTimeMillis());
            this.f47401e.D(this.f47414r);
            this.f47401e.B(this.f47413q, this.f47403g, this.f47404h);
        } catch (Exception e10) {
            Log.e("WMSLibrary", Log.getStackTraceString(e10));
        }
    }

    public void K() {
        this.f47401e.J();
    }

    public void L(com.zoho.messenger.api.a aVar) {
        if (aVar == null || !this.f47411o.containsKey(Integer.valueOf(aVar.b()))) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f47411o.get(Integer.valueOf(aVar.b()));
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f47411o.remove(Integer.valueOf(aVar.b()));
    }

    public void v() {
        this.f47403g = null;
        this.f47404h = null;
        System.clearProperty("sid");
        System.clearProperty("xa");
    }

    public void w(Context context, String str, AbstractC6824a abstractC6824a, String str2, e eVar, C4073a c4073a, boolean z10, Hashtable hashtable) {
        synchronized (this.f47405i) {
            try {
                if (this.f47401e == null) {
                    C6746a r10 = C6746a.r();
                    this.f47401e = r10;
                    r10.F(new c());
                    this.f47401e.G(this.f47415s);
                }
                if (this.f47408l == null) {
                    this.f47408l = new Timer();
                }
            } finally {
            }
        }
        if (A()) {
            return;
        }
        b bVar = this.f47397a;
        b bVar2 = b.CONNECTING;
        if (bVar == bVar2) {
            this.f47399c = false;
        }
        if (bVar == b.RECONNECTED) {
            this.f47402f = false;
            Timer timer = this.f47408l;
            if (timer != null) {
                timer.cancel();
                this.f47408l.purge();
            }
            this.f47400d = 0;
            this.f47397a = b.DISCONNECTED;
        }
        fg.b bVar3 = this.f47398b;
        if (bVar3 == null || bVar3.a() == null || this.f47398b.a().trim().length() == 0 || this.f47398b.d() == null || this.f47398b.d().trim().length() == 0) {
            throw new C6689a("Domain and SubDomain should be given");
        }
        if (this.f47397a == b.DISCONNECTED) {
            this.f47397a = bVar2;
            this.f47402f = false;
            this.f47399c = false;
            String str3 = this.f47398b.f() ? "wss" : "ws";
            String str4 = str3 + "://" + this.f47398b.d() + "." + this.f47398b.a();
            if (this.f47413q != null) {
                str4 = str3 + "://" + this.f47413q;
            }
            this.f47401e.E(60);
            try {
                this.f47409m = Long.valueOf(System.currentTimeMillis());
                this.f47398b.g();
                fg.b bVar4 = this.f47398b;
                if (bVar4 != null) {
                    bVar4.j("connect started --->");
                }
                this.f47401e.D(this.f47414r);
                this.f47401e.w(context, str4 + "/pconnect", str2, eVar, c4073a, abstractC6824a, z10, hashtable, this.f47403g, this.f47404h, str);
            } catch (C6689a e10) {
                throw e10;
            } catch (Exception e11) {
                Log.e("WMSLibrary", Log.getStackTraceString(e11));
            }
        }
    }

    public void x() {
        H();
        try {
            this.f47397a = b.DISCONNECTED;
            this.f47401e.H();
        } catch (Exception e10) {
            Log.e("WMSLibrary", Log.getStackTraceString(e10));
        }
    }

    public void y() {
        H();
        if (this.f47397a == b.CONNECTED) {
            try {
                this.f47401e.v();
            } catch (Exception e10) {
                Log.e("WMSLibrary", Log.getStackTraceString(e10));
            }
        }
    }

    public boolean z() {
        return this.f47397a == b.CONNECTED;
    }
}
