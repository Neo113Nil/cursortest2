package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Y1;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bvi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvi b;

    public /* synthetic */ bvi(fvi fviVar, int i) {
        this.a = i;
        this.b = fviVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0359 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0346 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0314 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0303 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029e A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0287 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0200 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bc A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0222 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026c A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bf A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e6 A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032b A[Catch: all -> 0x0190, TryCatch #0 {all -> 0x0190, blocks: (B:3:0x0013, B:4:0x00c6, B:6:0x00cc, B:9:0x00fa, B:12:0x0109, B:17:0x0121, B:20:0x0139, B:24:0x0149, B:27:0x0155, B:29:0x015b, B:31:0x0163, B:33:0x016b, B:36:0x01a4, B:39:0x01b6, B:41:0x01bc, B:45:0x0213, B:47:0x021c, B:49:0x0222, B:51:0x022a, B:53:0x0232, B:56:0x0254, B:59:0x0266, B:61:0x026c, B:65:0x02b1, B:67:0x02b9, B:69:0x02bf, B:72:0x02cf, B:74:0x02e0, B:76:0x02e6, B:79:0x02fa, B:82:0x0307, B:86:0x031d, B:88:0x0325, B:90:0x032b, B:93:0x033d, B:96:0x034a, B:108:0x0359, B:109:0x0346, B:112:0x0314, B:113:0x0303, B:118:0x027c, B:121:0x028f, B:124:0x02a6, B:125:0x029e, B:126:0x0287, B:127:0x0262, B:132:0x01d2, B:135:0x01f1, B:138:0x0208, B:139:0x0200, B:140:0x01e3, B:141:0x01b2, B:149:0x012c, B:150:0x011b, B:151:0x0112, B:152:0x0103, B:153:0x00f4), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        nlg nlgVar;
        int i;
        Integer valueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        SubTeam subTeam;
        int i11;
        sz8 sz8Var;
        int i12;
        int i13;
        int i14;
        int i15;
        SubTeam subTeam2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Sport sport;
        int i22;
        int i23;
        Country country;
        int i24;
        int i25;
        int i26;
        int i27;
        FieldTranslations fieldTranslations;
        String F0;
        String F02;
        String F03;
        FieldTranslations fieldTranslations2;
        String str;
        String F04;
        FieldTranslations fieldTranslations3;
        sz8 sz8Var2 = this.b.d;
        glg glgVar = (glg) obj;
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT teams.* FROM my_teams, teams WHERE teams.id = my_teams.teamId ORDER BY teams.name");
        try {
            int r = w1a.r(V0, "id");
            int r2 = w1a.r(V0, "name");
            int r3 = w1a.r(V0, "slug");
            int r4 = w1a.r(V0, "userCount");
            int r5 = w1a.r(V0, "type");
            int r6 = w1a.r(V0, "nameCode");
            int r7 = w1a.r(V0, "shortName");
            int r8 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
            int r9 = w1a.r(V0, "ranking");
            int r10 = w1a.r(V0, Y1.e);
            int r11 = w1a.r(V0, "national");
            int r12 = w1a.r(V0, "sub_team_one_id");
            int r13 = w1a.r(V0, "sub_team_one_name");
            int r14 = w1a.r(V0, "sub_team_one_nameTranslation");
            sz8 sz8Var3 = sz8Var2;
            int r15 = w1a.r(V0, "sub_team_one_shortNameTranslation");
            int r16 = w1a.r(V0, "sub_team_two_id");
            int r17 = w1a.r(V0, "sub_team_two_name");
            int r18 = w1a.r(V0, "sub_team_two_nameTranslation");
            int r19 = w1a.r(V0, "sub_team_two_shortNameTranslation");
            int r20 = w1a.r(V0, "sport_id");
            int r21 = w1a.r(V0, "sport_slug");
            int r22 = w1a.r(V0, "country_name");
            int r23 = w1a.r(V0, "country_alpha2");
            int r24 = w1a.r(V0, "nameTranslation");
            int r25 = w1a.r(V0, "shortNameTranslation");
            ArrayList arrayList = new ArrayList();
            while (V0.U0()) {
                int i28 = r13;
                int i29 = r14;
                int i30 = (int) V0.getLong(r);
                String F05 = V0.F0(r2);
                String F06 = V0.F0(r3);
                long j = V0.getLong(r4);
                int i31 = r;
                int i32 = r2;
                int i33 = (int) V0.getLong(r5);
                String F07 = V0.isNull(r6) ? null : V0.F0(r6);
                String F08 = V0.isNull(r7) ? null : V0.F0(r7);
                String F09 = V0.isNull(r8) ? null : V0.F0(r8);
                Gender stringToGender = F09 == null ? null : GenderTypeConverter.stringToGender(F09);
                if (V0.isNull(r9)) {
                    i = i33;
                    valueOf = null;
                } else {
                    i = i33;
                    valueOf = Integer.valueOf((int) V0.getLong(r9));
                }
                boolean z = ((int) V0.getLong(r10)) != 0;
                int i34 = r3;
                boolean z2 = ((int) V0.getLong(r11)) != 0;
                try {
                    if (V0.isNull(r12)) {
                        i2 = i28;
                        if (V0.isNull(i2)) {
                            i3 = i29;
                            if (V0.isNull(i3)) {
                                i4 = i34;
                                i5 = r15;
                                if (V0.isNull(i5)) {
                                    sz8Var = sz8Var3;
                                    i7 = i3;
                                    i9 = i5;
                                    i10 = i2;
                                    i6 = r4;
                                    i11 = r5;
                                    i8 = r6;
                                    subTeam = null;
                                    i12 = r16;
                                    if (V0.isNull(i12)) {
                                        i13 = r17;
                                    } else {
                                        i13 = r17;
                                        if (V0.isNull(i13)) {
                                            i14 = r18;
                                            if (V0.isNull(i14)) {
                                                i15 = r19;
                                                if (V0.isNull(i15)) {
                                                    i17 = i12;
                                                    i16 = i13;
                                                    i18 = i14;
                                                    i19 = r7;
                                                    subTeam2 = null;
                                                    i20 = r20;
                                                    if (V0.isNull(i20)) {
                                                        i21 = r21;
                                                        if (V0.isNull(i21)) {
                                                            sport = null;
                                                            i22 = r22;
                                                            if (V0.isNull(i22)) {
                                                                i23 = r23;
                                                            } else {
                                                                i23 = r23;
                                                                if (V0.isNull(i23)) {
                                                                    i24 = i20;
                                                                    i25 = i21;
                                                                    country = null;
                                                                    i26 = r24;
                                                                    if (V0.isNull(i26)) {
                                                                        i27 = r25;
                                                                        if (V0.isNull(i27)) {
                                                                            nlgVar = V0;
                                                                            r24 = i26;
                                                                            fieldTranslations = null;
                                                                            arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                                            int i35 = i24;
                                                                            r21 = i25;
                                                                            r20 = i35;
                                                                            r25 = i27;
                                                                            r23 = i23;
                                                                            r = i31;
                                                                            r7 = i19;
                                                                            r16 = i17;
                                                                            V0 = nlgVar;
                                                                            r2 = i32;
                                                                            r13 = i10;
                                                                            r6 = i8;
                                                                            r14 = i7;
                                                                            sz8Var3 = sz8Var;
                                                                            r22 = i22;
                                                                            r18 = i18;
                                                                            r17 = i16;
                                                                            r3 = i4;
                                                                            r4 = i6;
                                                                            r19 = i15;
                                                                            r5 = i11;
                                                                            r15 = i9;
                                                                        }
                                                                    } else {
                                                                        i27 = r25;
                                                                    }
                                                                    nlgVar = V0;
                                                                    r24 = i26;
                                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                                    int i352 = i24;
                                                                    r21 = i25;
                                                                    r20 = i352;
                                                                    r25 = i27;
                                                                    r23 = i23;
                                                                    r = i31;
                                                                    r7 = i19;
                                                                    r16 = i17;
                                                                    V0 = nlgVar;
                                                                    r2 = i32;
                                                                    r13 = i10;
                                                                    r6 = i8;
                                                                    r14 = i7;
                                                                    sz8Var3 = sz8Var;
                                                                    r22 = i22;
                                                                    r18 = i18;
                                                                    r17 = i16;
                                                                    r3 = i4;
                                                                    r4 = i6;
                                                                    r19 = i15;
                                                                    r5 = i11;
                                                                    r15 = i9;
                                                                }
                                                            }
                                                            String F010 = !V0.isNull(i22) ? null : V0.F0(i22);
                                                            if (V0.isNull(i23)) {
                                                                i24 = i20;
                                                                F0 = V0.F0(i23);
                                                            } else {
                                                                i24 = i20;
                                                                F0 = null;
                                                            }
                                                            i25 = i21;
                                                            country = new Country(F010, F0);
                                                            i26 = r24;
                                                            if (V0.isNull(i26)) {
                                                            }
                                                            nlgVar = V0;
                                                            r24 = i26;
                                                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                            arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                            int i3522 = i24;
                                                            r21 = i25;
                                                            r20 = i3522;
                                                            r25 = i27;
                                                            r23 = i23;
                                                            r = i31;
                                                            r7 = i19;
                                                            r16 = i17;
                                                            V0 = nlgVar;
                                                            r2 = i32;
                                                            r13 = i10;
                                                            r6 = i8;
                                                            r14 = i7;
                                                            sz8Var3 = sz8Var;
                                                            r22 = i22;
                                                            r18 = i18;
                                                            r17 = i16;
                                                            r3 = i4;
                                                            r4 = i6;
                                                            r19 = i15;
                                                            r5 = i11;
                                                            r15 = i9;
                                                        }
                                                    } else {
                                                        i21 = r21;
                                                    }
                                                    sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                                    i22 = r22;
                                                    if (V0.isNull(i22)) {
                                                    }
                                                    if (!V0.isNull(i22)) {
                                                    }
                                                    if (V0.isNull(i23)) {
                                                    }
                                                    i25 = i21;
                                                    country = new Country(F010, F0);
                                                    i26 = r24;
                                                    if (V0.isNull(i26)) {
                                                    }
                                                    nlgVar = V0;
                                                    r24 = i26;
                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                    int i35222 = i24;
                                                    r21 = i25;
                                                    r20 = i35222;
                                                    r25 = i27;
                                                    r23 = i23;
                                                    r = i31;
                                                    r7 = i19;
                                                    r16 = i17;
                                                    V0 = nlgVar;
                                                    r2 = i32;
                                                    r13 = i10;
                                                    r6 = i8;
                                                    r14 = i7;
                                                    sz8Var3 = sz8Var;
                                                    r22 = i22;
                                                    r18 = i18;
                                                    r17 = i16;
                                                    r3 = i4;
                                                    r4 = i6;
                                                    r19 = i15;
                                                    r5 = i11;
                                                    r15 = i9;
                                                }
                                                i19 = r7;
                                                int i36 = (int) V0.getLong(i12);
                                                String F011 = !V0.isNull(i13) ? null : V0.F0(i13);
                                                if (V0.isNull(i14) && V0.isNull(i15)) {
                                                    i17 = i12;
                                                    i16 = i13;
                                                    i18 = i14;
                                                    fieldTranslations2 = null;
                                                    subTeam2 = new SubTeam(i36, F011, fieldTranslations2);
                                                    i20 = r20;
                                                    if (V0.isNull(i20)) {
                                                    }
                                                    sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                                    i22 = r22;
                                                    if (V0.isNull(i22)) {
                                                    }
                                                    if (!V0.isNull(i22)) {
                                                    }
                                                    if (V0.isNull(i23)) {
                                                    }
                                                    i25 = i21;
                                                    country = new Country(F010, F0);
                                                    i26 = r24;
                                                    if (V0.isNull(i26)) {
                                                    }
                                                    nlgVar = V0;
                                                    r24 = i26;
                                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                    int i352222 = i24;
                                                    r21 = i25;
                                                    r20 = i352222;
                                                    r25 = i27;
                                                    r23 = i23;
                                                    r = i31;
                                                    r7 = i19;
                                                    r16 = i17;
                                                    V0 = nlgVar;
                                                    r2 = i32;
                                                    r13 = i10;
                                                    r6 = i8;
                                                    r14 = i7;
                                                    sz8Var3 = sz8Var;
                                                    r22 = i22;
                                                    r18 = i18;
                                                    r17 = i16;
                                                    r3 = i4;
                                                    r4 = i6;
                                                    r19 = i15;
                                                    r5 = i11;
                                                    r15 = i9;
                                                }
                                                if (V0.isNull(i14)) {
                                                    i17 = i12;
                                                    F02 = V0.F0(i14);
                                                } else {
                                                    i17 = i12;
                                                    F02 = null;
                                                }
                                                Map z3 = sz8Var.z(F02);
                                                if (V0.isNull(i15)) {
                                                    i16 = i13;
                                                    F03 = V0.F0(i15);
                                                } else {
                                                    i16 = i13;
                                                    F03 = null;
                                                }
                                                i18 = i14;
                                                fieldTranslations2 = new FieldTranslations(z3, sz8Var.z(F03));
                                                subTeam2 = new SubTeam(i36, F011, fieldTranslations2);
                                                i20 = r20;
                                                if (V0.isNull(i20)) {
                                                }
                                                sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                                i22 = r22;
                                                if (V0.isNull(i22)) {
                                                }
                                                if (!V0.isNull(i22)) {
                                                }
                                                if (V0.isNull(i23)) {
                                                }
                                                i25 = i21;
                                                country = new Country(F010, F0);
                                                i26 = r24;
                                                if (V0.isNull(i26)) {
                                                }
                                                nlgVar = V0;
                                                r24 = i26;
                                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                int i3522222 = i24;
                                                r21 = i25;
                                                r20 = i3522222;
                                                r25 = i27;
                                                r23 = i23;
                                                r = i31;
                                                r7 = i19;
                                                r16 = i17;
                                                V0 = nlgVar;
                                                r2 = i32;
                                                r13 = i10;
                                                r6 = i8;
                                                r14 = i7;
                                                sz8Var3 = sz8Var;
                                                r22 = i22;
                                                r18 = i18;
                                                r17 = i16;
                                                r3 = i4;
                                                r4 = i6;
                                                r19 = i15;
                                                r5 = i11;
                                                r15 = i9;
                                            }
                                            i15 = r19;
                                            i19 = r7;
                                            int i362 = (int) V0.getLong(i12);
                                            if (!V0.isNull(i13)) {
                                            }
                                            if (V0.isNull(i14)) {
                                                i17 = i12;
                                                i16 = i13;
                                                i18 = i14;
                                                fieldTranslations2 = null;
                                                subTeam2 = new SubTeam(i362, F011, fieldTranslations2);
                                                i20 = r20;
                                                if (V0.isNull(i20)) {
                                                }
                                                sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                                i22 = r22;
                                                if (V0.isNull(i22)) {
                                                }
                                                if (!V0.isNull(i22)) {
                                                }
                                                if (V0.isNull(i23)) {
                                                }
                                                i25 = i21;
                                                country = new Country(F010, F0);
                                                i26 = r24;
                                                if (V0.isNull(i26)) {
                                                }
                                                nlgVar = V0;
                                                r24 = i26;
                                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                                arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                int i35222222 = i24;
                                                r21 = i25;
                                                r20 = i35222222;
                                                r25 = i27;
                                                r23 = i23;
                                                r = i31;
                                                r7 = i19;
                                                r16 = i17;
                                                V0 = nlgVar;
                                                r2 = i32;
                                                r13 = i10;
                                                r6 = i8;
                                                r14 = i7;
                                                sz8Var3 = sz8Var;
                                                r22 = i22;
                                                r18 = i18;
                                                r17 = i16;
                                                r3 = i4;
                                                r4 = i6;
                                                r19 = i15;
                                                r5 = i11;
                                                r15 = i9;
                                            }
                                            if (V0.isNull(i14)) {
                                            }
                                            Map z32 = sz8Var.z(F02);
                                            if (V0.isNull(i15)) {
                                            }
                                            i18 = i14;
                                            fieldTranslations2 = new FieldTranslations(z32, sz8Var.z(F03));
                                            subTeam2 = new SubTeam(i362, F011, fieldTranslations2);
                                            i20 = r20;
                                            if (V0.isNull(i20)) {
                                            }
                                            sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                            i22 = r22;
                                            if (V0.isNull(i22)) {
                                            }
                                            if (!V0.isNull(i22)) {
                                            }
                                            if (V0.isNull(i23)) {
                                            }
                                            i25 = i21;
                                            country = new Country(F010, F0);
                                            i26 = r24;
                                            if (V0.isNull(i26)) {
                                            }
                                            nlgVar = V0;
                                            r24 = i26;
                                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                            arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                            int i352222222 = i24;
                                            r21 = i25;
                                            r20 = i352222222;
                                            r25 = i27;
                                            r23 = i23;
                                            r = i31;
                                            r7 = i19;
                                            r16 = i17;
                                            V0 = nlgVar;
                                            r2 = i32;
                                            r13 = i10;
                                            r6 = i8;
                                            r14 = i7;
                                            sz8Var3 = sz8Var;
                                            r22 = i22;
                                            r18 = i18;
                                            r17 = i16;
                                            r3 = i4;
                                            r4 = i6;
                                            r19 = i15;
                                            r5 = i11;
                                            r15 = i9;
                                        }
                                    }
                                    i14 = r18;
                                    i15 = r19;
                                    i19 = r7;
                                    int i3622 = (int) V0.getLong(i12);
                                    if (!V0.isNull(i13)) {
                                    }
                                    if (V0.isNull(i14)) {
                                    }
                                    if (V0.isNull(i14)) {
                                    }
                                    Map z322 = sz8Var.z(F02);
                                    if (V0.isNull(i15)) {
                                    }
                                    i18 = i14;
                                    fieldTranslations2 = new FieldTranslations(z322, sz8Var.z(F03));
                                    subTeam2 = new SubTeam(i3622, F011, fieldTranslations2);
                                    i20 = r20;
                                    if (V0.isNull(i20)) {
                                    }
                                    sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                    i22 = r22;
                                    if (V0.isNull(i22)) {
                                    }
                                    if (!V0.isNull(i22)) {
                                    }
                                    if (V0.isNull(i23)) {
                                    }
                                    i25 = i21;
                                    country = new Country(F010, F0);
                                    i26 = r24;
                                    if (V0.isNull(i26)) {
                                    }
                                    nlgVar = V0;
                                    r24 = i26;
                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                    int i3522222222 = i24;
                                    r21 = i25;
                                    r20 = i3522222222;
                                    r25 = i27;
                                    r23 = i23;
                                    r = i31;
                                    r7 = i19;
                                    r16 = i17;
                                    V0 = nlgVar;
                                    r2 = i32;
                                    r13 = i10;
                                    r6 = i8;
                                    r14 = i7;
                                    sz8Var3 = sz8Var;
                                    r22 = i22;
                                    r18 = i18;
                                    r17 = i16;
                                    r3 = i4;
                                    r4 = i6;
                                    r19 = i15;
                                    r5 = i11;
                                    r15 = i9;
                                }
                                i6 = r4;
                                i11 = r5;
                                int i37 = (int) V0.getLong(r12);
                                String F012 = V0.isNull(i2) ? null : V0.F0(i2);
                                if (V0.isNull(i3) && V0.isNull(i5)) {
                                    int i38 = i3;
                                    sz8Var = sz8Var3;
                                    i7 = i38;
                                    i9 = i5;
                                    i10 = i2;
                                    i8 = r6;
                                    fieldTranslations3 = null;
                                    subTeam = new SubTeam(i37, F012, fieldTranslations3);
                                    i12 = r16;
                                    if (V0.isNull(i12)) {
                                    }
                                    i14 = r18;
                                    i15 = r19;
                                    i19 = r7;
                                    int i36222 = (int) V0.getLong(i12);
                                    if (!V0.isNull(i13)) {
                                    }
                                    if (V0.isNull(i14)) {
                                    }
                                    if (V0.isNull(i14)) {
                                    }
                                    Map z3222 = sz8Var.z(F02);
                                    if (V0.isNull(i15)) {
                                    }
                                    i18 = i14;
                                    fieldTranslations2 = new FieldTranslations(z3222, sz8Var.z(F03));
                                    subTeam2 = new SubTeam(i36222, F011, fieldTranslations2);
                                    i20 = r20;
                                    if (V0.isNull(i20)) {
                                    }
                                    sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                    i22 = r22;
                                    if (V0.isNull(i22)) {
                                    }
                                    if (!V0.isNull(i22)) {
                                    }
                                    if (V0.isNull(i23)) {
                                    }
                                    i25 = i21;
                                    country = new Country(F010, F0);
                                    i26 = r24;
                                    if (V0.isNull(i26)) {
                                    }
                                    nlgVar = V0;
                                    r24 = i26;
                                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                    int i35222222222 = i24;
                                    r21 = i25;
                                    r20 = i35222222222;
                                    r25 = i27;
                                    r23 = i23;
                                    r = i31;
                                    r7 = i19;
                                    r16 = i17;
                                    V0 = nlgVar;
                                    r2 = i32;
                                    r13 = i10;
                                    r6 = i8;
                                    r14 = i7;
                                    sz8Var3 = sz8Var;
                                    r22 = i22;
                                    r18 = i18;
                                    r17 = i16;
                                    r3 = i4;
                                    r4 = i6;
                                    r19 = i15;
                                    r5 = i11;
                                    r15 = i9;
                                }
                                if (V0.isNull(i3)) {
                                    int i39 = i3;
                                    sz8Var = sz8Var3;
                                    i7 = i39;
                                    i10 = i2;
                                    str = null;
                                } else {
                                    String F013 = V0.F0(i3);
                                    int i40 = i3;
                                    sz8Var = sz8Var3;
                                    i7 = i40;
                                    i10 = i2;
                                    str = F013;
                                }
                                Map z4 = sz8Var.z(str);
                                if (V0.isNull(i5)) {
                                    i9 = i5;
                                    F04 = null;
                                } else {
                                    i9 = i5;
                                    F04 = V0.F0(i5);
                                }
                                i8 = r6;
                                fieldTranslations3 = new FieldTranslations(z4, sz8Var.z(F04));
                                subTeam = new SubTeam(i37, F012, fieldTranslations3);
                                i12 = r16;
                                if (V0.isNull(i12)) {
                                }
                                i14 = r18;
                                i15 = r19;
                                i19 = r7;
                                int i362222 = (int) V0.getLong(i12);
                                if (!V0.isNull(i13)) {
                                }
                                if (V0.isNull(i14)) {
                                }
                                if (V0.isNull(i14)) {
                                }
                                Map z32222 = sz8Var.z(F02);
                                if (V0.isNull(i15)) {
                                }
                                i18 = i14;
                                fieldTranslations2 = new FieldTranslations(z32222, sz8Var.z(F03));
                                subTeam2 = new SubTeam(i362222, F011, fieldTranslations2);
                                i20 = r20;
                                if (V0.isNull(i20)) {
                                }
                                sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                i22 = r22;
                                if (V0.isNull(i22)) {
                                }
                                if (!V0.isNull(i22)) {
                                }
                                if (V0.isNull(i23)) {
                                }
                                i25 = i21;
                                country = new Country(F010, F0);
                                i26 = r24;
                                if (V0.isNull(i26)) {
                                }
                                nlgVar = V0;
                                r24 = i26;
                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                int i352222222222 = i24;
                                r21 = i25;
                                r20 = i352222222222;
                                r25 = i27;
                                r23 = i23;
                                r = i31;
                                r7 = i19;
                                r16 = i17;
                                V0 = nlgVar;
                                r2 = i32;
                                r13 = i10;
                                r6 = i8;
                                r14 = i7;
                                sz8Var3 = sz8Var;
                                r22 = i22;
                                r18 = i18;
                                r17 = i16;
                                r3 = i4;
                                r4 = i6;
                                r19 = i15;
                                r5 = i11;
                                r15 = i9;
                            }
                        } else {
                            i4 = i34;
                            i3 = i29;
                            i5 = r15;
                            i6 = r4;
                            i11 = r5;
                            int i372 = (int) V0.getLong(r12);
                            if (V0.isNull(i2)) {
                            }
                            if (V0.isNull(i3)) {
                                int i382 = i3;
                                sz8Var = sz8Var3;
                                i7 = i382;
                                i9 = i5;
                                i10 = i2;
                                i8 = r6;
                                fieldTranslations3 = null;
                                subTeam = new SubTeam(i372, F012, fieldTranslations3);
                                i12 = r16;
                                if (V0.isNull(i12)) {
                                }
                                i14 = r18;
                                i15 = r19;
                                i19 = r7;
                                int i3622222 = (int) V0.getLong(i12);
                                if (!V0.isNull(i13)) {
                                }
                                if (V0.isNull(i14)) {
                                }
                                if (V0.isNull(i14)) {
                                }
                                Map z322222 = sz8Var.z(F02);
                                if (V0.isNull(i15)) {
                                }
                                i18 = i14;
                                fieldTranslations2 = new FieldTranslations(z322222, sz8Var.z(F03));
                                subTeam2 = new SubTeam(i3622222, F011, fieldTranslations2);
                                i20 = r20;
                                if (V0.isNull(i20)) {
                                }
                                sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                                i22 = r22;
                                if (V0.isNull(i22)) {
                                }
                                if (!V0.isNull(i22)) {
                                }
                                if (V0.isNull(i23)) {
                                }
                                i25 = i21;
                                country = new Country(F010, F0);
                                i26 = r24;
                                if (V0.isNull(i26)) {
                                }
                                nlgVar = V0;
                                r24 = i26;
                                fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                                arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                int i3522222222222 = i24;
                                r21 = i25;
                                r20 = i3522222222222;
                                r25 = i27;
                                r23 = i23;
                                r = i31;
                                r7 = i19;
                                r16 = i17;
                                V0 = nlgVar;
                                r2 = i32;
                                r13 = i10;
                                r6 = i8;
                                r14 = i7;
                                sz8Var3 = sz8Var;
                                r22 = i22;
                                r18 = i18;
                                r17 = i16;
                                r3 = i4;
                                r4 = i6;
                                r19 = i15;
                                r5 = i11;
                                r15 = i9;
                            }
                            if (V0.isNull(i3)) {
                            }
                            Map z42 = sz8Var.z(str);
                            if (V0.isNull(i5)) {
                            }
                            i8 = r6;
                            fieldTranslations3 = new FieldTranslations(z42, sz8Var.z(F04));
                            subTeam = new SubTeam(i372, F012, fieldTranslations3);
                            i12 = r16;
                            if (V0.isNull(i12)) {
                            }
                            i14 = r18;
                            i15 = r19;
                            i19 = r7;
                            int i36222222 = (int) V0.getLong(i12);
                            if (!V0.isNull(i13)) {
                            }
                            if (V0.isNull(i14)) {
                            }
                            if (V0.isNull(i14)) {
                            }
                            Map z3222222 = sz8Var.z(F02);
                            if (V0.isNull(i15)) {
                            }
                            i18 = i14;
                            fieldTranslations2 = new FieldTranslations(z3222222, sz8Var.z(F03));
                            subTeam2 = new SubTeam(i36222222, F011, fieldTranslations2);
                            i20 = r20;
                            if (V0.isNull(i20)) {
                            }
                            sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                            i22 = r22;
                            if (V0.isNull(i22)) {
                            }
                            if (!V0.isNull(i22)) {
                            }
                            if (V0.isNull(i23)) {
                            }
                            i25 = i21;
                            country = new Country(F010, F0);
                            i26 = r24;
                            if (V0.isNull(i26)) {
                            }
                            nlgVar = V0;
                            r24 = i26;
                            fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                            arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                            int i35222222222222 = i24;
                            r21 = i25;
                            r20 = i35222222222222;
                            r25 = i27;
                            r23 = i23;
                            r = i31;
                            r7 = i19;
                            r16 = i17;
                            V0 = nlgVar;
                            r2 = i32;
                            r13 = i10;
                            r6 = i8;
                            r14 = i7;
                            sz8Var3 = sz8Var;
                            r22 = i22;
                            r18 = i18;
                            r17 = i16;
                            r3 = i4;
                            r4 = i6;
                            r19 = i15;
                            r5 = i11;
                            r15 = i9;
                        }
                    } else {
                        i2 = i28;
                        i3 = i29;
                    }
                    r24 = i26;
                    fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(i26) ? null : V0.F0(i26)), sz8Var.z(V0.isNull(i27) ? null : V0.F0(i27)));
                    arrayList.add(new Team(i30, F05, F06, j, i, F07, F08, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                    int i352222222222222 = i24;
                    r21 = i25;
                    r20 = i352222222222222;
                    r25 = i27;
                    r23 = i23;
                    r = i31;
                    r7 = i19;
                    r16 = i17;
                    V0 = nlgVar;
                    r2 = i32;
                    r13 = i10;
                    r6 = i8;
                    r14 = i7;
                    sz8Var3 = sz8Var;
                    r22 = i22;
                    r18 = i18;
                    r17 = i16;
                    r3 = i4;
                    r4 = i6;
                    r19 = i15;
                    r5 = i11;
                    r15 = i9;
                } catch (Throwable th) {
                    th = th;
                    nlgVar.close();
                    throw th;
                }
                i4 = i34;
                i5 = r15;
                i6 = r4;
                i11 = r5;
                int i3722 = (int) V0.getLong(r12);
                if (V0.isNull(i2)) {
                }
                if (V0.isNull(i3)) {
                }
                if (V0.isNull(i3)) {
                }
                Map z422 = sz8Var.z(str);
                if (V0.isNull(i5)) {
                }
                i8 = r6;
                fieldTranslations3 = new FieldTranslations(z422, sz8Var.z(F04));
                subTeam = new SubTeam(i3722, F012, fieldTranslations3);
                i12 = r16;
                if (V0.isNull(i12)) {
                }
                i14 = r18;
                i15 = r19;
                i19 = r7;
                int i362222222 = (int) V0.getLong(i12);
                if (!V0.isNull(i13)) {
                }
                if (V0.isNull(i14)) {
                }
                if (V0.isNull(i14)) {
                }
                Map z32222222 = sz8Var.z(F02);
                if (V0.isNull(i15)) {
                }
                i18 = i14;
                fieldTranslations2 = new FieldTranslations(z32222222, sz8Var.z(F03));
                subTeam2 = new SubTeam(i362222222, F011, fieldTranslations2);
                i20 = r20;
                if (V0.isNull(i20)) {
                }
                sport = new Sport((int) V0.getLong(i20), V0.F0(i21));
                i22 = r22;
                if (V0.isNull(i22)) {
                }
                if (!V0.isNull(i22)) {
                }
                if (V0.isNull(i23)) {
                }
                i25 = i21;
                country = new Country(F010, F0);
                i26 = r24;
                if (V0.isNull(i26)) {
                }
                nlgVar = V0;
            }
            V0.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            nlgVar = V0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0362 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034f A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031d A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030c A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a7 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0290 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026b A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0207 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0540 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05a6 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05f2 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0645 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x066c A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06b1 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06df A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06cc A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x069a A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0689 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0624 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x060d A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e8 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0584 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0567 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0536 A[Catch: all -> 0x0516, TryCatch #1 {all -> 0x0516, blocks: (B:163:0x03bd, B:164:0x0452, B:166:0x0458, B:169:0x0484, B:172:0x0493, B:177:0x04ab, B:180:0x04c3, B:183:0x04cf, B:186:0x04db, B:188:0x04e1, B:190:0x04e9, B:192:0x04f1, B:195:0x0528, B:198:0x053a, B:200:0x0540, B:204:0x0597, B:206:0x05a0, B:208:0x05a6, B:210:0x05ae, B:212:0x05b6, B:215:0x05da, B:218:0x05ec, B:220:0x05f2, B:224:0x0637, B:226:0x063f, B:228:0x0645, B:231:0x0655, B:233:0x0666, B:235:0x066c, B:238:0x0680, B:241:0x068d, B:245:0x06a3, B:247:0x06ab, B:249:0x06b1, B:252:0x06c3, B:255:0x06d0, B:258:0x06e7, B:259:0x06f4, B:261:0x06df, B:262:0x06cc, B:265:0x069a, B:266:0x0689, B:271:0x0602, B:274:0x0615, B:277:0x062c, B:278:0x0624, B:279:0x060d, B:280:0x05e8, B:285:0x0556, B:288:0x0575, B:291:0x058c, B:292:0x0584, B:293:0x0567, B:294:0x0536, B:302:0x04b6, B:303:0x04a5, B:304:0x049c, B:305:0x048d, B:306:0x047e), top: B:162:0x03bd }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0229 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0275 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0334 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:5:0x004e, B:6:0x00e3, B:8:0x00e9, B:11:0x0116, B:14:0x0125, B:19:0x013d, B:22:0x0155, B:25:0x0161, B:28:0x016d, B:30:0x0173, B:32:0x017b, B:34:0x0183, B:37:0x01b4, B:40:0x01c6, B:42:0x01cc, B:46:0x021a, B:48:0x0223, B:50:0x0229, B:52:0x0231, B:54:0x0239, B:57:0x025d, B:60:0x026f, B:62:0x0275, B:66:0x02ba, B:68:0x02c2, B:70:0x02c8, B:73:0x02d8, B:75:0x02e9, B:77:0x02ef, B:80:0x0303, B:83:0x0310, B:87:0x0326, B:89:0x032e, B:91:0x0334, B:94:0x0346, B:97:0x0353, B:100:0x036a, B:101:0x0377, B:103:0x0362, B:104:0x034f, B:107:0x031d, B:108:0x030c, B:113:0x0285, B:116:0x0298, B:119:0x02af, B:120:0x02a7, B:121:0x0290, B:122:0x026b, B:127:0x01e0, B:131:0x01f8, B:134:0x020f, B:135:0x0207, B:136:0x01ef, B:137:0x01c2, B:145:0x0148, B:146:0x0137, B:147:0x012e, B:148:0x011f, B:149:0x0110), top: B:4:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        nlg V0;
        int i;
        Integer valueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        SubTeam subTeam;
        int i9;
        int i10;
        int i11;
        sz8 sz8Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        SubTeam subTeam2;
        int i17;
        int i18;
        int i19;
        int i20;
        Sport sport;
        int i21;
        int i22;
        Country country;
        int i23;
        int i24;
        int i25;
        int i26;
        FieldTranslations fieldTranslations;
        sz8 sz8Var2;
        String F0;
        String F02;
        String F03;
        String F04;
        FieldTranslations fieldTranslations2;
        String str;
        String F05;
        FieldTranslations fieldTranslations3;
        int i27;
        Integer valueOf2;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        SubTeam subTeam3;
        int i34;
        int i35;
        int i36;
        sz8 sz8Var3;
        int i37;
        int i38;
        int i39;
        int i40;
        SubTeam subTeam4;
        int i41;
        int i42;
        int i43;
        Sport sport2;
        int i44;
        int i45;
        Country country2;
        int i46;
        int i47;
        FieldTranslations fieldTranslations4;
        sz8 sz8Var4;
        String F06;
        String F07;
        String F08;
        String F09;
        FieldTranslations fieldTranslations5;
        String F010;
        String F011;
        FieldTranslations fieldTranslations6;
        int i48 = this.a;
        fvi fviVar = this.b;
        switch (i48) {
            case 0:
                sz8 sz8Var5 = fviVar.d;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT teams.* FROM my_teams, teams WHERE teams.id = my_teams.teamId AND teams.type = 1 ORDER BY teams.name");
                try {
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "name");
                    int r3 = w1a.r(V0, "slug");
                    int r4 = w1a.r(V0, "userCount");
                    int r5 = w1a.r(V0, "type");
                    int r6 = w1a.r(V0, "nameCode");
                    int r7 = w1a.r(V0, "shortName");
                    int r8 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
                    int r9 = w1a.r(V0, "ranking");
                    int r10 = w1a.r(V0, Y1.e);
                    int r11 = w1a.r(V0, "national");
                    int r12 = w1a.r(V0, "sub_team_one_id");
                    int r13 = w1a.r(V0, "sub_team_one_name");
                    int r14 = w1a.r(V0, "sub_team_one_nameTranslation");
                    int r15 = w1a.r(V0, "sub_team_one_shortNameTranslation");
                    int r16 = w1a.r(V0, "sub_team_two_id");
                    int r17 = w1a.r(V0, "sub_team_two_name");
                    int r18 = w1a.r(V0, "sub_team_two_nameTranslation");
                    int r19 = w1a.r(V0, "sub_team_two_shortNameTranslation");
                    int r20 = w1a.r(V0, "sport_id");
                    int r21 = w1a.r(V0, "sport_slug");
                    int r22 = w1a.r(V0, "country_name");
                    int r23 = w1a.r(V0, "country_alpha2");
                    int r24 = w1a.r(V0, "nameTranslation");
                    int r25 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        int i49 = r14;
                        int i50 = r13;
                        int i51 = (int) V0.getLong(r);
                        String F012 = V0.F0(r2);
                        String F013 = V0.F0(r3);
                        long j = V0.getLong(r4);
                        int i52 = r;
                        int i53 = r4;
                        int i54 = (int) V0.getLong(r5);
                        String F014 = V0.isNull(r6) ? null : V0.F0(r6);
                        String F015 = V0.isNull(r7) ? null : V0.F0(r7);
                        String F016 = V0.isNull(r8) ? null : V0.F0(r8);
                        Gender stringToGender = F016 == null ? null : GenderTypeConverter.stringToGender(F016);
                        if (V0.isNull(r9)) {
                            i = i54;
                            valueOf = null;
                        } else {
                            i = i54;
                            valueOf = Integer.valueOf((int) V0.getLong(r9));
                        }
                        boolean z = ((int) V0.getLong(r10)) != 0;
                        boolean z2 = ((int) V0.getLong(r11)) != 0;
                        if (V0.isNull(r12)) {
                            i2 = i50;
                            if (V0.isNull(i2)) {
                                i3 = i49;
                                if (V0.isNull(i3)) {
                                    i4 = r3;
                                    i5 = r15;
                                    if (V0.isNull(i5)) {
                                        sz8 sz8Var6 = sz8Var5;
                                        i11 = i3;
                                        sz8Var = sz8Var6;
                                        i8 = i2;
                                        i7 = i5;
                                        i6 = r2;
                                        i10 = r5;
                                        i9 = i51;
                                        subTeam = null;
                                        i12 = r16;
                                        if (V0.isNull(i12)) {
                                            i13 = r18;
                                            i14 = r17;
                                        } else {
                                            i14 = r17;
                                            if (V0.isNull(i14)) {
                                                i13 = r18;
                                                if (V0.isNull(i13)) {
                                                    i15 = r19;
                                                    if (V0.isNull(i15)) {
                                                        i18 = i12;
                                                        i17 = i14;
                                                        r18 = i13;
                                                        i16 = i52;
                                                        subTeam2 = null;
                                                        i19 = r20;
                                                        if (V0.isNull(i19)) {
                                                            i20 = r21;
                                                        } else {
                                                            i20 = r21;
                                                            if (V0.isNull(i20)) {
                                                                sport = null;
                                                                i21 = r22;
                                                                if (V0.isNull(i21)) {
                                                                    i22 = r23;
                                                                    if (V0.isNull(i22)) {
                                                                        i23 = i19;
                                                                        i24 = i20;
                                                                        country = null;
                                                                        i25 = r24;
                                                                        if (V0.isNull(i25)) {
                                                                            i26 = r25;
                                                                        } else {
                                                                            i26 = r25;
                                                                            if (V0.isNull(i26)) {
                                                                                r24 = i25;
                                                                                sz8Var2 = sz8Var;
                                                                                fieldTranslations = null;
                                                                                arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                                                int i55 = i23;
                                                                                r21 = i24;
                                                                                r20 = i55;
                                                                                r = i16;
                                                                                r25 = i26;
                                                                                r23 = i22;
                                                                                r14 = i11;
                                                                                r16 = i18;
                                                                                r17 = i17;
                                                                                sz8Var5 = sz8Var2;
                                                                                r3 = i4;
                                                                                r4 = i53;
                                                                                r13 = i8;
                                                                                r22 = i21;
                                                                                r19 = i15;
                                                                                r5 = i10;
                                                                                r2 = i6;
                                                                                r15 = i7;
                                                                            }
                                                                        }
                                                                        Map z3 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                                                        if (V0.isNull(i26)) {
                                                                            r24 = i25;
                                                                            F0 = V0.F0(i26);
                                                                        } else {
                                                                            r24 = i25;
                                                                            F0 = null;
                                                                        }
                                                                        sz8Var2 = sz8Var;
                                                                        fieldTranslations = new FieldTranslations(z3, sz8Var.z(F0));
                                                                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                                        int i552 = i23;
                                                                        r21 = i24;
                                                                        r20 = i552;
                                                                        r = i16;
                                                                        r25 = i26;
                                                                        r23 = i22;
                                                                        r14 = i11;
                                                                        r16 = i18;
                                                                        r17 = i17;
                                                                        sz8Var5 = sz8Var2;
                                                                        r3 = i4;
                                                                        r4 = i53;
                                                                        r13 = i8;
                                                                        r22 = i21;
                                                                        r19 = i15;
                                                                        r5 = i10;
                                                                        r2 = i6;
                                                                        r15 = i7;
                                                                    }
                                                                } else {
                                                                    i22 = r23;
                                                                }
                                                                String F017 = V0.isNull(i21) ? null : V0.F0(i21);
                                                                if (V0.isNull(i22)) {
                                                                    i23 = i19;
                                                                    F02 = null;
                                                                } else {
                                                                    i23 = i19;
                                                                    F02 = V0.F0(i22);
                                                                }
                                                                i24 = i20;
                                                                country = new Country(F017, F02);
                                                                i25 = r24;
                                                                if (V0.isNull(i25)) {
                                                                }
                                                                Map z32 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                                                if (V0.isNull(i26)) {
                                                                }
                                                                sz8Var2 = sz8Var;
                                                                fieldTranslations = new FieldTranslations(z32, sz8Var.z(F0));
                                                                arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                                int i5522 = i23;
                                                                r21 = i24;
                                                                r20 = i5522;
                                                                r = i16;
                                                                r25 = i26;
                                                                r23 = i22;
                                                                r14 = i11;
                                                                r16 = i18;
                                                                r17 = i17;
                                                                sz8Var5 = sz8Var2;
                                                                r3 = i4;
                                                                r4 = i53;
                                                                r13 = i8;
                                                                r22 = i21;
                                                                r19 = i15;
                                                                r5 = i10;
                                                                r2 = i6;
                                                                r15 = i7;
                                                            }
                                                        }
                                                        sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                                        i21 = r22;
                                                        if (V0.isNull(i21)) {
                                                        }
                                                        if (V0.isNull(i21)) {
                                                        }
                                                        if (V0.isNull(i22)) {
                                                        }
                                                        i24 = i20;
                                                        country = new Country(F017, F02);
                                                        i25 = r24;
                                                        if (V0.isNull(i25)) {
                                                        }
                                                        Map z322 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                                        if (V0.isNull(i26)) {
                                                        }
                                                        sz8Var2 = sz8Var;
                                                        fieldTranslations = new FieldTranslations(z322, sz8Var.z(F0));
                                                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                        int i55222 = i23;
                                                        r21 = i24;
                                                        r20 = i55222;
                                                        r = i16;
                                                        r25 = i26;
                                                        r23 = i22;
                                                        r14 = i11;
                                                        r16 = i18;
                                                        r17 = i17;
                                                        sz8Var5 = sz8Var2;
                                                        r3 = i4;
                                                        r4 = i53;
                                                        r13 = i8;
                                                        r22 = i21;
                                                        r19 = i15;
                                                        r5 = i10;
                                                        r2 = i6;
                                                        r15 = i7;
                                                    }
                                                    i16 = i52;
                                                    int i56 = (int) V0.getLong(i12);
                                                    String F018 = V0.isNull(i14) ? null : V0.F0(i14);
                                                    if (V0.isNull(i13) && V0.isNull(i15)) {
                                                        i18 = i12;
                                                        i17 = i14;
                                                        r18 = i13;
                                                        fieldTranslations2 = null;
                                                        subTeam2 = new SubTeam(i56, F018, fieldTranslations2);
                                                        i19 = r20;
                                                        if (V0.isNull(i19)) {
                                                        }
                                                        sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                                        i21 = r22;
                                                        if (V0.isNull(i21)) {
                                                        }
                                                        if (V0.isNull(i21)) {
                                                        }
                                                        if (V0.isNull(i22)) {
                                                        }
                                                        i24 = i20;
                                                        country = new Country(F017, F02);
                                                        i25 = r24;
                                                        if (V0.isNull(i25)) {
                                                        }
                                                        Map z3222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                                        if (V0.isNull(i26)) {
                                                        }
                                                        sz8Var2 = sz8Var;
                                                        fieldTranslations = new FieldTranslations(z3222, sz8Var.z(F0));
                                                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                        int i552222 = i23;
                                                        r21 = i24;
                                                        r20 = i552222;
                                                        r = i16;
                                                        r25 = i26;
                                                        r23 = i22;
                                                        r14 = i11;
                                                        r16 = i18;
                                                        r17 = i17;
                                                        sz8Var5 = sz8Var2;
                                                        r3 = i4;
                                                        r4 = i53;
                                                        r13 = i8;
                                                        r22 = i21;
                                                        r19 = i15;
                                                        r5 = i10;
                                                        r2 = i6;
                                                        r15 = i7;
                                                    }
                                                    if (V0.isNull(i13)) {
                                                        i18 = i12;
                                                        F03 = null;
                                                    } else {
                                                        i18 = i12;
                                                        F03 = V0.F0(i13);
                                                    }
                                                    Map z4 = sz8Var.z(F03);
                                                    if (V0.isNull(i15)) {
                                                        i17 = i14;
                                                        F04 = null;
                                                    } else {
                                                        i17 = i14;
                                                        F04 = V0.F0(i15);
                                                    }
                                                    r18 = i13;
                                                    fieldTranslations2 = new FieldTranslations(z4, sz8Var.z(F04));
                                                    subTeam2 = new SubTeam(i56, F018, fieldTranslations2);
                                                    i19 = r20;
                                                    if (V0.isNull(i19)) {
                                                    }
                                                    sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                                    i21 = r22;
                                                    if (V0.isNull(i21)) {
                                                    }
                                                    if (V0.isNull(i21)) {
                                                    }
                                                    if (V0.isNull(i22)) {
                                                    }
                                                    i24 = i20;
                                                    country = new Country(F017, F02);
                                                    i25 = r24;
                                                    if (V0.isNull(i25)) {
                                                    }
                                                    Map z32222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                                    if (V0.isNull(i26)) {
                                                    }
                                                    sz8Var2 = sz8Var;
                                                    fieldTranslations = new FieldTranslations(z32222, sz8Var.z(F0));
                                                    arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                                    int i5522222 = i23;
                                                    r21 = i24;
                                                    r20 = i5522222;
                                                    r = i16;
                                                    r25 = i26;
                                                    r23 = i22;
                                                    r14 = i11;
                                                    r16 = i18;
                                                    r17 = i17;
                                                    sz8Var5 = sz8Var2;
                                                    r3 = i4;
                                                    r4 = i53;
                                                    r13 = i8;
                                                    r22 = i21;
                                                    r19 = i15;
                                                    r5 = i10;
                                                    r2 = i6;
                                                    r15 = i7;
                                                }
                                            } else {
                                                i13 = r18;
                                            }
                                        }
                                        i15 = r19;
                                        i16 = i52;
                                        int i562 = (int) V0.getLong(i12);
                                        if (V0.isNull(i14)) {
                                        }
                                        if (V0.isNull(i13)) {
                                            i18 = i12;
                                            i17 = i14;
                                            r18 = i13;
                                            fieldTranslations2 = null;
                                            subTeam2 = new SubTeam(i562, F018, fieldTranslations2);
                                            i19 = r20;
                                            if (V0.isNull(i19)) {
                                            }
                                            sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                            i21 = r22;
                                            if (V0.isNull(i21)) {
                                            }
                                            if (V0.isNull(i21)) {
                                            }
                                            if (V0.isNull(i22)) {
                                            }
                                            i24 = i20;
                                            country = new Country(F017, F02);
                                            i25 = r24;
                                            if (V0.isNull(i25)) {
                                            }
                                            Map z322222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                            if (V0.isNull(i26)) {
                                            }
                                            sz8Var2 = sz8Var;
                                            fieldTranslations = new FieldTranslations(z322222, sz8Var.z(F0));
                                            arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                            int i55222222 = i23;
                                            r21 = i24;
                                            r20 = i55222222;
                                            r = i16;
                                            r25 = i26;
                                            r23 = i22;
                                            r14 = i11;
                                            r16 = i18;
                                            r17 = i17;
                                            sz8Var5 = sz8Var2;
                                            r3 = i4;
                                            r4 = i53;
                                            r13 = i8;
                                            r22 = i21;
                                            r19 = i15;
                                            r5 = i10;
                                            r2 = i6;
                                            r15 = i7;
                                        }
                                        if (V0.isNull(i13)) {
                                        }
                                        Map z42 = sz8Var.z(F03);
                                        if (V0.isNull(i15)) {
                                        }
                                        r18 = i13;
                                        fieldTranslations2 = new FieldTranslations(z42, sz8Var.z(F04));
                                        subTeam2 = new SubTeam(i562, F018, fieldTranslations2);
                                        i19 = r20;
                                        if (V0.isNull(i19)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                        i21 = r22;
                                        if (V0.isNull(i21)) {
                                        }
                                        if (V0.isNull(i21)) {
                                        }
                                        if (V0.isNull(i22)) {
                                        }
                                        i24 = i20;
                                        country = new Country(F017, F02);
                                        i25 = r24;
                                        if (V0.isNull(i25)) {
                                        }
                                        Map z3222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                        if (V0.isNull(i26)) {
                                        }
                                        sz8Var2 = sz8Var;
                                        fieldTranslations = new FieldTranslations(z3222222, sz8Var.z(F0));
                                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                        int i552222222 = i23;
                                        r21 = i24;
                                        r20 = i552222222;
                                        r = i16;
                                        r25 = i26;
                                        r23 = i22;
                                        r14 = i11;
                                        r16 = i18;
                                        r17 = i17;
                                        sz8Var5 = sz8Var2;
                                        r3 = i4;
                                        r4 = i53;
                                        r13 = i8;
                                        r22 = i21;
                                        r19 = i15;
                                        r5 = i10;
                                        r2 = i6;
                                        r15 = i7;
                                    }
                                    i6 = r2;
                                    i10 = r5;
                                    int i57 = (int) V0.getLong(r12);
                                    String F019 = V0.isNull(i2) ? null : V0.F0(i2);
                                    if (V0.isNull(i3) && V0.isNull(i5)) {
                                        sz8 sz8Var7 = sz8Var5;
                                        i11 = i3;
                                        sz8Var = sz8Var7;
                                        i8 = i2;
                                        i7 = i5;
                                        i9 = i51;
                                        fieldTranslations3 = null;
                                        subTeam = new SubTeam(i57, F019, fieldTranslations3);
                                        i12 = r16;
                                        if (V0.isNull(i12)) {
                                        }
                                        i15 = r19;
                                        i16 = i52;
                                        int i5622 = (int) V0.getLong(i12);
                                        if (V0.isNull(i14)) {
                                        }
                                        if (V0.isNull(i13)) {
                                        }
                                        if (V0.isNull(i13)) {
                                        }
                                        Map z422 = sz8Var.z(F03);
                                        if (V0.isNull(i15)) {
                                        }
                                        r18 = i13;
                                        fieldTranslations2 = new FieldTranslations(z422, sz8Var.z(F04));
                                        subTeam2 = new SubTeam(i5622, F018, fieldTranslations2);
                                        i19 = r20;
                                        if (V0.isNull(i19)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                        i21 = r22;
                                        if (V0.isNull(i21)) {
                                        }
                                        if (V0.isNull(i21)) {
                                        }
                                        if (V0.isNull(i22)) {
                                        }
                                        i24 = i20;
                                        country = new Country(F017, F02);
                                        i25 = r24;
                                        if (V0.isNull(i25)) {
                                        }
                                        Map z32222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                        if (V0.isNull(i26)) {
                                        }
                                        sz8Var2 = sz8Var;
                                        fieldTranslations = new FieldTranslations(z32222222, sz8Var.z(F0));
                                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                        int i5522222222 = i23;
                                        r21 = i24;
                                        r20 = i5522222222;
                                        r = i16;
                                        r25 = i26;
                                        r23 = i22;
                                        r14 = i11;
                                        r16 = i18;
                                        r17 = i17;
                                        sz8Var5 = sz8Var2;
                                        r3 = i4;
                                        r4 = i53;
                                        r13 = i8;
                                        r22 = i21;
                                        r19 = i15;
                                        r5 = i10;
                                        r2 = i6;
                                        r15 = i7;
                                    }
                                    if (V0.isNull(i3)) {
                                        sz8 sz8Var8 = sz8Var5;
                                        i11 = i3;
                                        sz8Var = sz8Var8;
                                        i8 = i2;
                                        str = null;
                                    } else {
                                        String F020 = V0.F0(i3);
                                        sz8 sz8Var9 = sz8Var5;
                                        i11 = i3;
                                        sz8Var = sz8Var9;
                                        i8 = i2;
                                        str = F020;
                                    }
                                    Map z5 = sz8Var.z(str);
                                    if (V0.isNull(i5)) {
                                        i7 = i5;
                                        F05 = null;
                                    } else {
                                        i7 = i5;
                                        F05 = V0.F0(i5);
                                    }
                                    i9 = i51;
                                    fieldTranslations3 = new FieldTranslations(z5, sz8Var.z(F05));
                                    subTeam = new SubTeam(i57, F019, fieldTranslations3);
                                    i12 = r16;
                                    if (V0.isNull(i12)) {
                                    }
                                    i15 = r19;
                                    i16 = i52;
                                    int i56222 = (int) V0.getLong(i12);
                                    if (V0.isNull(i14)) {
                                    }
                                    if (V0.isNull(i13)) {
                                    }
                                    if (V0.isNull(i13)) {
                                    }
                                    Map z4222 = sz8Var.z(F03);
                                    if (V0.isNull(i15)) {
                                    }
                                    r18 = i13;
                                    fieldTranslations2 = new FieldTranslations(z4222, sz8Var.z(F04));
                                    subTeam2 = new SubTeam(i56222, F018, fieldTranslations2);
                                    i19 = r20;
                                    if (V0.isNull(i19)) {
                                    }
                                    sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                    i21 = r22;
                                    if (V0.isNull(i21)) {
                                    }
                                    if (V0.isNull(i21)) {
                                    }
                                    if (V0.isNull(i22)) {
                                    }
                                    i24 = i20;
                                    country = new Country(F017, F02);
                                    i25 = r24;
                                    if (V0.isNull(i25)) {
                                    }
                                    Map z322222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                    if (V0.isNull(i26)) {
                                    }
                                    sz8Var2 = sz8Var;
                                    fieldTranslations = new FieldTranslations(z322222222, sz8Var.z(F0));
                                    arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                    int i55222222222 = i23;
                                    r21 = i24;
                                    r20 = i55222222222;
                                    r = i16;
                                    r25 = i26;
                                    r23 = i22;
                                    r14 = i11;
                                    r16 = i18;
                                    r17 = i17;
                                    sz8Var5 = sz8Var2;
                                    r3 = i4;
                                    r4 = i53;
                                    r13 = i8;
                                    r22 = i21;
                                    r19 = i15;
                                    r5 = i10;
                                    r2 = i6;
                                    r15 = i7;
                                }
                            } else {
                                i4 = r3;
                                i3 = i49;
                                i5 = r15;
                                i6 = r2;
                                i10 = r5;
                                int i572 = (int) V0.getLong(r12);
                                if (V0.isNull(i2)) {
                                }
                                if (V0.isNull(i3)) {
                                    sz8 sz8Var72 = sz8Var5;
                                    i11 = i3;
                                    sz8Var = sz8Var72;
                                    i8 = i2;
                                    i7 = i5;
                                    i9 = i51;
                                    fieldTranslations3 = null;
                                    subTeam = new SubTeam(i572, F019, fieldTranslations3);
                                    i12 = r16;
                                    if (V0.isNull(i12)) {
                                    }
                                    i15 = r19;
                                    i16 = i52;
                                    int i562222 = (int) V0.getLong(i12);
                                    if (V0.isNull(i14)) {
                                    }
                                    if (V0.isNull(i13)) {
                                    }
                                    if (V0.isNull(i13)) {
                                    }
                                    Map z42222 = sz8Var.z(F03);
                                    if (V0.isNull(i15)) {
                                    }
                                    r18 = i13;
                                    fieldTranslations2 = new FieldTranslations(z42222, sz8Var.z(F04));
                                    subTeam2 = new SubTeam(i562222, F018, fieldTranslations2);
                                    i19 = r20;
                                    if (V0.isNull(i19)) {
                                    }
                                    sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                    i21 = r22;
                                    if (V0.isNull(i21)) {
                                    }
                                    if (V0.isNull(i21)) {
                                    }
                                    if (V0.isNull(i22)) {
                                    }
                                    i24 = i20;
                                    country = new Country(F017, F02);
                                    i25 = r24;
                                    if (V0.isNull(i25)) {
                                    }
                                    Map z3222222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                    if (V0.isNull(i26)) {
                                    }
                                    sz8Var2 = sz8Var;
                                    fieldTranslations = new FieldTranslations(z3222222222, sz8Var.z(F0));
                                    arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                    int i552222222222 = i23;
                                    r21 = i24;
                                    r20 = i552222222222;
                                    r = i16;
                                    r25 = i26;
                                    r23 = i22;
                                    r14 = i11;
                                    r16 = i18;
                                    r17 = i17;
                                    sz8Var5 = sz8Var2;
                                    r3 = i4;
                                    r4 = i53;
                                    r13 = i8;
                                    r22 = i21;
                                    r19 = i15;
                                    r5 = i10;
                                    r2 = i6;
                                    r15 = i7;
                                }
                                if (V0.isNull(i3)) {
                                }
                                Map z52 = sz8Var.z(str);
                                if (V0.isNull(i5)) {
                                }
                                i9 = i51;
                                fieldTranslations3 = new FieldTranslations(z52, sz8Var.z(F05));
                                subTeam = new SubTeam(i572, F019, fieldTranslations3);
                                i12 = r16;
                                if (V0.isNull(i12)) {
                                }
                                i15 = r19;
                                i16 = i52;
                                int i5622222 = (int) V0.getLong(i12);
                                if (V0.isNull(i14)) {
                                }
                                if (V0.isNull(i13)) {
                                }
                                if (V0.isNull(i13)) {
                                }
                                Map z422222 = sz8Var.z(F03);
                                if (V0.isNull(i15)) {
                                }
                                r18 = i13;
                                fieldTranslations2 = new FieldTranslations(z422222, sz8Var.z(F04));
                                subTeam2 = new SubTeam(i5622222, F018, fieldTranslations2);
                                i19 = r20;
                                if (V0.isNull(i19)) {
                                }
                                sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                                i21 = r22;
                                if (V0.isNull(i21)) {
                                }
                                if (V0.isNull(i21)) {
                                }
                                if (V0.isNull(i22)) {
                                }
                                i24 = i20;
                                country = new Country(F017, F02);
                                i25 = r24;
                                if (V0.isNull(i25)) {
                                }
                                Map z32222222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                                if (V0.isNull(i26)) {
                                }
                                sz8Var2 = sz8Var;
                                fieldTranslations = new FieldTranslations(z32222222222, sz8Var.z(F0));
                                arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                                int i5522222222222 = i23;
                                r21 = i24;
                                r20 = i5522222222222;
                                r = i16;
                                r25 = i26;
                                r23 = i22;
                                r14 = i11;
                                r16 = i18;
                                r17 = i17;
                                sz8Var5 = sz8Var2;
                                r3 = i4;
                                r4 = i53;
                                r13 = i8;
                                r22 = i21;
                                r19 = i15;
                                r5 = i10;
                                r2 = i6;
                                r15 = i7;
                            }
                        } else {
                            i2 = i50;
                            i3 = i49;
                        }
                        i4 = r3;
                        i5 = r15;
                        i6 = r2;
                        i10 = r5;
                        int i5722 = (int) V0.getLong(r12);
                        if (V0.isNull(i2)) {
                        }
                        if (V0.isNull(i3)) {
                        }
                        if (V0.isNull(i3)) {
                        }
                        Map z522 = sz8Var.z(str);
                        if (V0.isNull(i5)) {
                        }
                        i9 = i51;
                        fieldTranslations3 = new FieldTranslations(z522, sz8Var.z(F05));
                        subTeam = new SubTeam(i5722, F019, fieldTranslations3);
                        i12 = r16;
                        if (V0.isNull(i12)) {
                        }
                        i15 = r19;
                        i16 = i52;
                        int i56222222 = (int) V0.getLong(i12);
                        if (V0.isNull(i14)) {
                        }
                        if (V0.isNull(i13)) {
                        }
                        if (V0.isNull(i13)) {
                        }
                        Map z4222222 = sz8Var.z(F03);
                        if (V0.isNull(i15)) {
                        }
                        r18 = i13;
                        fieldTranslations2 = new FieldTranslations(z4222222, sz8Var.z(F04));
                        subTeam2 = new SubTeam(i56222222, F018, fieldTranslations2);
                        i19 = r20;
                        if (V0.isNull(i19)) {
                        }
                        sport = new Sport((int) V0.getLong(i19), V0.F0(i20));
                        i21 = r22;
                        if (V0.isNull(i21)) {
                        }
                        if (V0.isNull(i21)) {
                        }
                        if (V0.isNull(i22)) {
                        }
                        i24 = i20;
                        country = new Country(F017, F02);
                        i25 = r24;
                        if (V0.isNull(i25)) {
                        }
                        Map z322222222222 = sz8Var.z(!V0.isNull(i25) ? null : V0.F0(i25));
                        if (V0.isNull(i26)) {
                        }
                        sz8Var2 = sz8Var;
                        fieldTranslations = new FieldTranslations(z322222222222, sz8Var.z(F0));
                        arrayList.add(new Team(i9, F012, F013, j, i, F014, F015, subTeam, subTeam2, stringToGender, sport, valueOf, z, z2, country, fieldTranslations));
                        int i55222222222222 = i23;
                        r21 = i24;
                        r20 = i55222222222222;
                        r = i16;
                        r25 = i26;
                        r23 = i22;
                        r14 = i11;
                        r16 = i18;
                        r17 = i17;
                        sz8Var5 = sz8Var2;
                        r3 = i4;
                        r4 = i53;
                        r13 = i8;
                        r22 = i21;
                        r19 = i15;
                        r5 = i10;
                        r2 = i6;
                        r15 = i7;
                    }
                    V0.close();
                    return arrayList;
                } finally {
                }
            case 1:
                return a(obj);
            default:
                sz8 sz8Var10 = fviVar.d;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                sz8 sz8Var11 = sz8Var10;
                V0 = glgVar2.V0("SELECT teams.* FROM my_teams, teams WHERE teams.id = my_teams.teamId AND teams.type != 1 ORDER BY teams.name");
                try {
                    int r26 = w1a.r(V0, "id");
                    int r27 = w1a.r(V0, "name");
                    int r28 = w1a.r(V0, "slug");
                    int r29 = w1a.r(V0, "userCount");
                    int r30 = w1a.r(V0, "type");
                    int r31 = w1a.r(V0, "nameCode");
                    int r32 = w1a.r(V0, "shortName");
                    int r33 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
                    int r34 = w1a.r(V0, "ranking");
                    int r35 = w1a.r(V0, Y1.e);
                    int r36 = w1a.r(V0, "national");
                    int r37 = w1a.r(V0, "sub_team_one_id");
                    int r38 = w1a.r(V0, "sub_team_one_name");
                    int r39 = w1a.r(V0, "sub_team_one_nameTranslation");
                    int r40 = w1a.r(V0, "sub_team_one_shortNameTranslation");
                    int r41 = w1a.r(V0, "sub_team_two_id");
                    int r42 = w1a.r(V0, "sub_team_two_name");
                    int r43 = w1a.r(V0, "sub_team_two_nameTranslation");
                    int r44 = w1a.r(V0, "sub_team_two_shortNameTranslation");
                    int r45 = w1a.r(V0, "sport_id");
                    int r46 = w1a.r(V0, "sport_slug");
                    int r47 = w1a.r(V0, "country_name");
                    int r48 = w1a.r(V0, "country_alpha2");
                    int r49 = w1a.r(V0, "nameTranslation");
                    int r50 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        int i58 = r39;
                        int i59 = r38;
                        int i60 = (int) V0.getLong(r26);
                        String F021 = V0.F0(r27);
                        String F022 = V0.F0(r28);
                        long j2 = V0.getLong(r29);
                        int i61 = r26;
                        int i62 = r29;
                        int i63 = (int) V0.getLong(r30);
                        String F023 = V0.isNull(r31) ? null : V0.F0(r31);
                        String F024 = V0.isNull(r32) ? null : V0.F0(r32);
                        String F025 = V0.isNull(r33) ? null : V0.F0(r33);
                        Gender stringToGender2 = F025 == null ? null : GenderTypeConverter.stringToGender(F025);
                        if (V0.isNull(r34)) {
                            i27 = i63;
                            valueOf2 = null;
                        } else {
                            i27 = i63;
                            valueOf2 = Integer.valueOf((int) V0.getLong(r34));
                        }
                        boolean z6 = ((int) V0.getLong(r35)) != 0;
                        boolean z7 = ((int) V0.getLong(r36)) != 0;
                        if (V0.isNull(r37)) {
                            i29 = i59;
                            if (V0.isNull(i29)) {
                                i30 = i58;
                                if (V0.isNull(i30)) {
                                    i28 = r40;
                                    if (V0.isNull(i28)) {
                                        i33 = i29;
                                        i35 = i30;
                                        i36 = r28;
                                        i31 = r27;
                                        i32 = r30;
                                        i34 = i60;
                                        sz8Var3 = sz8Var11;
                                        subTeam3 = null;
                                        i37 = r41;
                                        if (V0.isNull(i37)) {
                                            i39 = r42;
                                            if (V0.isNull(i39)) {
                                                i38 = r43;
                                                if (V0.isNull(i38)) {
                                                    i40 = r44;
                                                    if (V0.isNull(i40)) {
                                                        r41 = i37;
                                                        r42 = i39;
                                                        r43 = i38;
                                                        i41 = i28;
                                                        subTeam4 = null;
                                                        i42 = r45;
                                                        if (V0.isNull(i42)) {
                                                            i43 = r46;
                                                            if (V0.isNull(i43)) {
                                                                sport2 = null;
                                                                i44 = r47;
                                                                if (V0.isNull(i44)) {
                                                                    i45 = r48;
                                                                } else {
                                                                    i45 = r48;
                                                                    if (V0.isNull(i45)) {
                                                                        r45 = i42;
                                                                        r46 = i43;
                                                                        country2 = null;
                                                                        i46 = r49;
                                                                        if (V0.isNull(i46)) {
                                                                            i47 = r50;
                                                                            if (V0.isNull(i47)) {
                                                                                r49 = i46;
                                                                                sz8Var4 = sz8Var3;
                                                                                fieldTranslations4 = null;
                                                                                arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                                                r50 = i47;
                                                                                r47 = i44;
                                                                                r48 = i45;
                                                                                r28 = i36;
                                                                                r39 = i35;
                                                                                r26 = i61;
                                                                                r29 = i62;
                                                                                r38 = i33;
                                                                                r27 = i31;
                                                                                r40 = i41;
                                                                                sz8Var11 = sz8Var4;
                                                                                r44 = i40;
                                                                                r30 = i32;
                                                                            }
                                                                        } else {
                                                                            i47 = r50;
                                                                        }
                                                                        Map z8 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                                                        if (V0.isNull(i47)) {
                                                                            r49 = i46;
                                                                            F06 = null;
                                                                        } else {
                                                                            r49 = i46;
                                                                            F06 = V0.F0(i47);
                                                                        }
                                                                        sz8Var4 = sz8Var3;
                                                                        fieldTranslations4 = new FieldTranslations(z8, sz8Var3.z(F06));
                                                                        arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                                        r50 = i47;
                                                                        r47 = i44;
                                                                        r48 = i45;
                                                                        r28 = i36;
                                                                        r39 = i35;
                                                                        r26 = i61;
                                                                        r29 = i62;
                                                                        r38 = i33;
                                                                        r27 = i31;
                                                                        r40 = i41;
                                                                        sz8Var11 = sz8Var4;
                                                                        r44 = i40;
                                                                        r30 = i32;
                                                                    }
                                                                }
                                                                String F026 = !V0.isNull(i44) ? null : V0.F0(i44);
                                                                if (V0.isNull(i45)) {
                                                                    r45 = i42;
                                                                    F07 = V0.F0(i45);
                                                                } else {
                                                                    r45 = i42;
                                                                    F07 = null;
                                                                }
                                                                r46 = i43;
                                                                country2 = new Country(F026, F07);
                                                                i46 = r49;
                                                                if (V0.isNull(i46)) {
                                                                }
                                                                Map z82 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                                                if (V0.isNull(i47)) {
                                                                }
                                                                sz8Var4 = sz8Var3;
                                                                fieldTranslations4 = new FieldTranslations(z82, sz8Var3.z(F06));
                                                                arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                                r50 = i47;
                                                                r47 = i44;
                                                                r48 = i45;
                                                                r28 = i36;
                                                                r39 = i35;
                                                                r26 = i61;
                                                                r29 = i62;
                                                                r38 = i33;
                                                                r27 = i31;
                                                                r40 = i41;
                                                                sz8Var11 = sz8Var4;
                                                                r44 = i40;
                                                                r30 = i32;
                                                            }
                                                        } else {
                                                            i43 = r46;
                                                        }
                                                        sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                                        i44 = r47;
                                                        if (V0.isNull(i44)) {
                                                        }
                                                        if (!V0.isNull(i44)) {
                                                        }
                                                        if (V0.isNull(i45)) {
                                                        }
                                                        r46 = i43;
                                                        country2 = new Country(F026, F07);
                                                        i46 = r49;
                                                        if (V0.isNull(i46)) {
                                                        }
                                                        Map z822 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                                        if (V0.isNull(i47)) {
                                                        }
                                                        sz8Var4 = sz8Var3;
                                                        fieldTranslations4 = new FieldTranslations(z822, sz8Var3.z(F06));
                                                        arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                        r50 = i47;
                                                        r47 = i44;
                                                        r48 = i45;
                                                        r28 = i36;
                                                        r39 = i35;
                                                        r26 = i61;
                                                        r29 = i62;
                                                        r38 = i33;
                                                        r27 = i31;
                                                        r40 = i41;
                                                        sz8Var11 = sz8Var4;
                                                        r44 = i40;
                                                        r30 = i32;
                                                    }
                                                    i41 = i28;
                                                    int i64 = (int) V0.getLong(i37);
                                                    String F027 = !V0.isNull(i39) ? null : V0.F0(i39);
                                                    if (V0.isNull(i38) && V0.isNull(i40)) {
                                                        r41 = i37;
                                                        r42 = i39;
                                                        r43 = i38;
                                                        fieldTranslations5 = null;
                                                        subTeam4 = new SubTeam(i64, F027, fieldTranslations5);
                                                        i42 = r45;
                                                        if (V0.isNull(i42)) {
                                                        }
                                                        sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                                        i44 = r47;
                                                        if (V0.isNull(i44)) {
                                                        }
                                                        if (!V0.isNull(i44)) {
                                                        }
                                                        if (V0.isNull(i45)) {
                                                        }
                                                        r46 = i43;
                                                        country2 = new Country(F026, F07);
                                                        i46 = r49;
                                                        if (V0.isNull(i46)) {
                                                        }
                                                        Map z8222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                                        if (V0.isNull(i47)) {
                                                        }
                                                        sz8Var4 = sz8Var3;
                                                        fieldTranslations4 = new FieldTranslations(z8222, sz8Var3.z(F06));
                                                        arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                        r50 = i47;
                                                        r47 = i44;
                                                        r48 = i45;
                                                        r28 = i36;
                                                        r39 = i35;
                                                        r26 = i61;
                                                        r29 = i62;
                                                        r38 = i33;
                                                        r27 = i31;
                                                        r40 = i41;
                                                        sz8Var11 = sz8Var4;
                                                        r44 = i40;
                                                        r30 = i32;
                                                    }
                                                    if (V0.isNull(i38)) {
                                                        r41 = i37;
                                                        F08 = V0.F0(i38);
                                                    } else {
                                                        r41 = i37;
                                                        F08 = null;
                                                    }
                                                    Map z9 = sz8Var3.z(F08);
                                                    if (V0.isNull(i40)) {
                                                        r42 = i39;
                                                        F09 = V0.F0(i40);
                                                    } else {
                                                        r42 = i39;
                                                        F09 = null;
                                                    }
                                                    r43 = i38;
                                                    fieldTranslations5 = new FieldTranslations(z9, sz8Var3.z(F09));
                                                    subTeam4 = new SubTeam(i64, F027, fieldTranslations5);
                                                    i42 = r45;
                                                    if (V0.isNull(i42)) {
                                                    }
                                                    sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                                    i44 = r47;
                                                    if (V0.isNull(i44)) {
                                                    }
                                                    if (!V0.isNull(i44)) {
                                                    }
                                                    if (V0.isNull(i45)) {
                                                    }
                                                    r46 = i43;
                                                    country2 = new Country(F026, F07);
                                                    i46 = r49;
                                                    if (V0.isNull(i46)) {
                                                    }
                                                    Map z82222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                                    if (V0.isNull(i47)) {
                                                    }
                                                    sz8Var4 = sz8Var3;
                                                    fieldTranslations4 = new FieldTranslations(z82222, sz8Var3.z(F06));
                                                    arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                                    r50 = i47;
                                                    r47 = i44;
                                                    r48 = i45;
                                                    r28 = i36;
                                                    r39 = i35;
                                                    r26 = i61;
                                                    r29 = i62;
                                                    r38 = i33;
                                                    r27 = i31;
                                                    r40 = i41;
                                                    sz8Var11 = sz8Var4;
                                                    r44 = i40;
                                                    r30 = i32;
                                                }
                                            } else {
                                                i38 = r43;
                                            }
                                        } else {
                                            i38 = r43;
                                            i39 = r42;
                                        }
                                        i40 = r44;
                                        i41 = i28;
                                        int i642 = (int) V0.getLong(i37);
                                        if (!V0.isNull(i39)) {
                                        }
                                        if (V0.isNull(i38)) {
                                            r41 = i37;
                                            r42 = i39;
                                            r43 = i38;
                                            fieldTranslations5 = null;
                                            subTeam4 = new SubTeam(i642, F027, fieldTranslations5);
                                            i42 = r45;
                                            if (V0.isNull(i42)) {
                                            }
                                            sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                            i44 = r47;
                                            if (V0.isNull(i44)) {
                                            }
                                            if (!V0.isNull(i44)) {
                                            }
                                            if (V0.isNull(i45)) {
                                            }
                                            r46 = i43;
                                            country2 = new Country(F026, F07);
                                            i46 = r49;
                                            if (V0.isNull(i46)) {
                                            }
                                            Map z822222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                            if (V0.isNull(i47)) {
                                            }
                                            sz8Var4 = sz8Var3;
                                            fieldTranslations4 = new FieldTranslations(z822222, sz8Var3.z(F06));
                                            arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                            r50 = i47;
                                            r47 = i44;
                                            r48 = i45;
                                            r28 = i36;
                                            r39 = i35;
                                            r26 = i61;
                                            r29 = i62;
                                            r38 = i33;
                                            r27 = i31;
                                            r40 = i41;
                                            sz8Var11 = sz8Var4;
                                            r44 = i40;
                                            r30 = i32;
                                        }
                                        if (V0.isNull(i38)) {
                                        }
                                        Map z92 = sz8Var3.z(F08);
                                        if (V0.isNull(i40)) {
                                        }
                                        r43 = i38;
                                        fieldTranslations5 = new FieldTranslations(z92, sz8Var3.z(F09));
                                        subTeam4 = new SubTeam(i642, F027, fieldTranslations5);
                                        i42 = r45;
                                        if (V0.isNull(i42)) {
                                        }
                                        sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                        i44 = r47;
                                        if (V0.isNull(i44)) {
                                        }
                                        if (!V0.isNull(i44)) {
                                        }
                                        if (V0.isNull(i45)) {
                                        }
                                        r46 = i43;
                                        country2 = new Country(F026, F07);
                                        i46 = r49;
                                        if (V0.isNull(i46)) {
                                        }
                                        Map z8222222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                        if (V0.isNull(i47)) {
                                        }
                                        sz8Var4 = sz8Var3;
                                        fieldTranslations4 = new FieldTranslations(z8222222, sz8Var3.z(F06));
                                        arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                        r50 = i47;
                                        r47 = i44;
                                        r48 = i45;
                                        r28 = i36;
                                        r39 = i35;
                                        r26 = i61;
                                        r29 = i62;
                                        r38 = i33;
                                        r27 = i31;
                                        r40 = i41;
                                        sz8Var11 = sz8Var4;
                                        r44 = i40;
                                        r30 = i32;
                                    }
                                } else {
                                    i28 = r40;
                                }
                                i36 = r28;
                                i31 = r27;
                                int i65 = (int) V0.getLong(r37);
                                String F028 = !V0.isNull(i29) ? null : V0.F0(i29);
                                if (V0.isNull(i30) && V0.isNull(i28)) {
                                    i33 = i29;
                                    i35 = i30;
                                    i32 = r30;
                                    i34 = i60;
                                    sz8Var3 = sz8Var11;
                                    fieldTranslations6 = null;
                                    subTeam3 = new SubTeam(i65, F028, fieldTranslations6);
                                    i37 = r41;
                                    if (V0.isNull(i37)) {
                                    }
                                    i40 = r44;
                                    i41 = i28;
                                    int i6422 = (int) V0.getLong(i37);
                                    if (!V0.isNull(i39)) {
                                    }
                                    if (V0.isNull(i38)) {
                                    }
                                    if (V0.isNull(i38)) {
                                    }
                                    Map z922 = sz8Var3.z(F08);
                                    if (V0.isNull(i40)) {
                                    }
                                    r43 = i38;
                                    fieldTranslations5 = new FieldTranslations(z922, sz8Var3.z(F09));
                                    subTeam4 = new SubTeam(i6422, F027, fieldTranslations5);
                                    i42 = r45;
                                    if (V0.isNull(i42)) {
                                    }
                                    sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                    i44 = r47;
                                    if (V0.isNull(i44)) {
                                    }
                                    if (!V0.isNull(i44)) {
                                    }
                                    if (V0.isNull(i45)) {
                                    }
                                    r46 = i43;
                                    country2 = new Country(F026, F07);
                                    i46 = r49;
                                    if (V0.isNull(i46)) {
                                    }
                                    Map z82222222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                    if (V0.isNull(i47)) {
                                    }
                                    sz8Var4 = sz8Var3;
                                    fieldTranslations4 = new FieldTranslations(z82222222, sz8Var3.z(F06));
                                    arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                    r50 = i47;
                                    r47 = i44;
                                    r48 = i45;
                                    r28 = i36;
                                    r39 = i35;
                                    r26 = i61;
                                    r29 = i62;
                                    r38 = i33;
                                    r27 = i31;
                                    r40 = i41;
                                    sz8Var11 = sz8Var4;
                                    r44 = i40;
                                    r30 = i32;
                                }
                                if (V0.isNull(i30)) {
                                    i33 = i29;
                                    F010 = V0.F0(i30);
                                } else {
                                    i33 = i29;
                                    F010 = null;
                                }
                                i35 = i30;
                                sz8Var3 = sz8Var11;
                                Map z10 = sz8Var3.z(F010);
                                if (V0.isNull(i28)) {
                                    i32 = r30;
                                    F011 = V0.F0(i28);
                                } else {
                                    i32 = r30;
                                    F011 = null;
                                }
                                i34 = i60;
                                fieldTranslations6 = new FieldTranslations(z10, sz8Var3.z(F011));
                                subTeam3 = new SubTeam(i65, F028, fieldTranslations6);
                                i37 = r41;
                                if (V0.isNull(i37)) {
                                }
                                i40 = r44;
                                i41 = i28;
                                int i64222 = (int) V0.getLong(i37);
                                if (!V0.isNull(i39)) {
                                }
                                if (V0.isNull(i38)) {
                                }
                                if (V0.isNull(i38)) {
                                }
                                Map z9222 = sz8Var3.z(F08);
                                if (V0.isNull(i40)) {
                                }
                                r43 = i38;
                                fieldTranslations5 = new FieldTranslations(z9222, sz8Var3.z(F09));
                                subTeam4 = new SubTeam(i64222, F027, fieldTranslations5);
                                i42 = r45;
                                if (V0.isNull(i42)) {
                                }
                                sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                                i44 = r47;
                                if (V0.isNull(i44)) {
                                }
                                if (!V0.isNull(i44)) {
                                }
                                if (V0.isNull(i45)) {
                                }
                                r46 = i43;
                                country2 = new Country(F026, F07);
                                i46 = r49;
                                if (V0.isNull(i46)) {
                                }
                                Map z822222222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                                if (V0.isNull(i47)) {
                                }
                                sz8Var4 = sz8Var3;
                                fieldTranslations4 = new FieldTranslations(z822222222, sz8Var3.z(F06));
                                arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                                r50 = i47;
                                r47 = i44;
                                r48 = i45;
                                r28 = i36;
                                r39 = i35;
                                r26 = i61;
                                r29 = i62;
                                r38 = i33;
                                r27 = i31;
                                r40 = i41;
                                sz8Var11 = sz8Var4;
                                r44 = i40;
                                r30 = i32;
                            } else {
                                i28 = r40;
                            }
                        } else {
                            i28 = r40;
                            i29 = i59;
                        }
                        i30 = i58;
                        i36 = r28;
                        i31 = r27;
                        int i652 = (int) V0.getLong(r37);
                        if (!V0.isNull(i29)) {
                        }
                        if (V0.isNull(i30)) {
                            i33 = i29;
                            i35 = i30;
                            i32 = r30;
                            i34 = i60;
                            sz8Var3 = sz8Var11;
                            fieldTranslations6 = null;
                            subTeam3 = new SubTeam(i652, F028, fieldTranslations6);
                            i37 = r41;
                            if (V0.isNull(i37)) {
                            }
                            i40 = r44;
                            i41 = i28;
                            int i642222 = (int) V0.getLong(i37);
                            if (!V0.isNull(i39)) {
                            }
                            if (V0.isNull(i38)) {
                            }
                            if (V0.isNull(i38)) {
                            }
                            Map z92222 = sz8Var3.z(F08);
                            if (V0.isNull(i40)) {
                            }
                            r43 = i38;
                            fieldTranslations5 = new FieldTranslations(z92222, sz8Var3.z(F09));
                            subTeam4 = new SubTeam(i642222, F027, fieldTranslations5);
                            i42 = r45;
                            if (V0.isNull(i42)) {
                            }
                            sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                            i44 = r47;
                            if (V0.isNull(i44)) {
                            }
                            if (!V0.isNull(i44)) {
                            }
                            if (V0.isNull(i45)) {
                            }
                            r46 = i43;
                            country2 = new Country(F026, F07);
                            i46 = r49;
                            if (V0.isNull(i46)) {
                            }
                            Map z8222222222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                            if (V0.isNull(i47)) {
                            }
                            sz8Var4 = sz8Var3;
                            fieldTranslations4 = new FieldTranslations(z8222222222, sz8Var3.z(F06));
                            arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                            r50 = i47;
                            r47 = i44;
                            r48 = i45;
                            r28 = i36;
                            r39 = i35;
                            r26 = i61;
                            r29 = i62;
                            r38 = i33;
                            r27 = i31;
                            r40 = i41;
                            sz8Var11 = sz8Var4;
                            r44 = i40;
                            r30 = i32;
                        }
                        if (V0.isNull(i30)) {
                        }
                        i35 = i30;
                        sz8Var3 = sz8Var11;
                        Map z102 = sz8Var3.z(F010);
                        if (V0.isNull(i28)) {
                        }
                        i34 = i60;
                        fieldTranslations6 = new FieldTranslations(z102, sz8Var3.z(F011));
                        subTeam3 = new SubTeam(i652, F028, fieldTranslations6);
                        i37 = r41;
                        if (V0.isNull(i37)) {
                        }
                        i40 = r44;
                        i41 = i28;
                        int i6422222 = (int) V0.getLong(i37);
                        if (!V0.isNull(i39)) {
                        }
                        if (V0.isNull(i38)) {
                        }
                        if (V0.isNull(i38)) {
                        }
                        Map z922222 = sz8Var3.z(F08);
                        if (V0.isNull(i40)) {
                        }
                        r43 = i38;
                        fieldTranslations5 = new FieldTranslations(z922222, sz8Var3.z(F09));
                        subTeam4 = new SubTeam(i6422222, F027, fieldTranslations5);
                        i42 = r45;
                        if (V0.isNull(i42)) {
                        }
                        sport2 = new Sport((int) V0.getLong(i42), V0.F0(i43));
                        i44 = r47;
                        if (V0.isNull(i44)) {
                        }
                        if (!V0.isNull(i44)) {
                        }
                        if (V0.isNull(i45)) {
                        }
                        r46 = i43;
                        country2 = new Country(F026, F07);
                        i46 = r49;
                        if (V0.isNull(i46)) {
                        }
                        Map z82222222222 = sz8Var3.z(V0.isNull(i46) ? null : V0.F0(i46));
                        if (V0.isNull(i47)) {
                        }
                        sz8Var4 = sz8Var3;
                        fieldTranslations4 = new FieldTranslations(z82222222222, sz8Var3.z(F06));
                        arrayList2.add(new Team(i34, F021, F022, j2, i27, F023, F024, subTeam3, subTeam4, stringToGender2, sport2, valueOf2, z6, z7, country2, fieldTranslations4));
                        r50 = i47;
                        r47 = i44;
                        r48 = i45;
                        r28 = i36;
                        r39 = i35;
                        r26 = i61;
                        r29 = i62;
                        r38 = i33;
                        r27 = i31;
                        r40 = i41;
                        sz8Var11 = sz8Var4;
                        r44 = i40;
                        r30 = i32;
                    }
                    V0.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
