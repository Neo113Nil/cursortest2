package defpackage;

import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageEvent;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.UniqueStage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ List d;
    public final /* synthetic */ v76 e;

    public /* synthetic */ n76(String str, long j, List list, v76 v76Var, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
        this.e = v76Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e9 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0496 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04cb A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b6 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0468 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0457 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d2 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0277 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x025f A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0251 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028b A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:31:0x0071, B:32:0x0078, B:34:0x007e, B:36:0x0094, B:37:0x0177, B:39:0x017d, B:43:0x019c, B:46:0x01b0, B:48:0x01b6, B:50:0x01bc, B:53:0x01f1, B:55:0x01f7, B:59:0x0219, B:61:0x021f, B:63:0x0225, B:65:0x022d, B:68:0x0244, B:71:0x0255, B:74:0x026b, B:78:0x0280, B:79:0x0285, B:81:0x028b, B:83:0x0293, B:85:0x029b, B:87:0x02a3, B:89:0x02ab, B:91:0x02b5, B:93:0x02bf, B:95:0x02c9, B:97:0x02d3, B:99:0x02dd, B:101:0x02e7, B:103:0x02f1, B:105:0x02fb, B:108:0x03c0, B:111:0x03de, B:113:0x03e9, B:115:0x03ef, B:117:0x03f5, B:119:0x03fb, B:121:0x0401, B:123:0x0407, B:125:0x040d, B:127:0x0413, B:129:0x041b, B:131:0x0425, B:134:0x04ed, B:135:0x04f4, B:138:0x0522, B:141:0x0531, B:147:0x0445, B:150:0x045d, B:154:0x046f, B:156:0x0496, B:160:0x04dd, B:161:0x04a8, B:165:0x04bb, B:169:0x04d0, B:170:0x04cb, B:171:0x04b6, B:172:0x0468, B:173:0x0457, B:176:0x03d2, B:194:0x0277, B:195:0x025f, B:196:0x0251, B:200:0x0201, B:203:0x0212, B:204:0x020e, B:206:0x01d0, B:210:0x01e4, B:211:0x01df, B:212:0x01aa, B:213:0x018e), top: B:30:0x0071 }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ServerType b;
        int i;
        int i2;
        int i3;
        int i4;
        Status status;
        StageWinner stageWinner;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        StageEvent stageEvent;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        ArrayList arrayList;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        StageEvent stageEvent2;
        int i35;
        int i36;
        StageSeason stageSeason;
        v76 v76Var;
        String F0;
        int i37;
        int i38;
        int i39;
        String str;
        Sport sport;
        int i40;
        Sport sport2;
        FieldTranslations fieldTranslations;
        UniqueStage uniqueStage;
        Long valueOf;
        String F02;
        int i41 = this.a;
        int i42 = 2;
        v76 v76Var2 = this.e;
        List<ServerType> list = this.d;
        long j = this.c;
        String str2 = this.b;
        switch (i41) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0(str2);
                try {
                    V0.q(1, j);
                    for (ServerType serverType : list) {
                        v76Var2.getClass();
                        V0.L(i42, v76.a(serverType));
                        i42++;
                    }
                    int r = w1a.r(V0, "description");
                    int r2 = w1a.r(V0, "type");
                    int r3 = w1a.r(V0, "id");
                    int r4 = w1a.r(V0, "startDateTimestamp");
                    int r5 = w1a.r(V0, "flag");
                    int r6 = w1a.r(V0, "lastUpdate");
                    int r7 = w1a.r(V0, "isMuted");
                    int r8 = w1a.r(V0, "isHidden");
                    int r9 = w1a.r(V0, "status_code");
                    int r10 = w1a.r(V0, "status_description");
                    int r11 = w1a.r(V0, "status_type");
                    int r12 = w1a.r(V0, "winner_id");
                    int r13 = w1a.r(V0, "winner_name");
                    int r14 = w1a.r(V0, "parent_event_id");
                    int i43 = r8;
                    int r15 = w1a.r(V0, "parent_event_description");
                    int i44 = r7;
                    int r16 = w1a.r(V0, "parent_event_startTimestamp");
                    int i45 = r6;
                    int r17 = w1a.r(V0, "parent_event_flag");
                    int i46 = r4;
                    int r18 = w1a.r(V0, "stage_season_description");
                    v76 v76Var3 = v76Var2;
                    int r19 = w1a.r(V0, "stage_season_year");
                    int r20 = w1a.r(V0, "stage_season_id");
                    int r21 = w1a.r(V0, "stage_season_unique_stage_id");
                    int r22 = w1a.r(V0, "stage_season_unique_stage_name");
                    int r23 = w1a.r(V0, "stage_season_unique_stage_primaryColorHex");
                    int r24 = w1a.r(V0, "stage_season_unique_stage_secondaryColorHex");
                    int r25 = w1a.r(V0, "stage_season_unique_stage_category_id");
                    int r26 = w1a.r(V0, "stage_season_unique_stage_category_name");
                    int r27 = w1a.r(V0, "stage_season_unique_stage_category_flag");
                    int r28 = w1a.r(V0, "stage_season_unique_stage_category_sport_id");
                    int r29 = w1a.r(V0, "stage_season_unique_stage_category_sport_slug");
                    int r30 = w1a.r(V0, "stage_season_unique_stage_category_nameTranslation");
                    int r31 = w1a.r(V0, "stage_season_unique_stage_category_shortNameTranslation");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        String F03 = V0.F0(r);
                        if (V0.isNull(r2)) {
                            b = null;
                        } else {
                            String F04 = V0.F0(r2);
                            v76Var3.getClass();
                            b = v76.b(F04);
                        }
                        int i47 = r17;
                        int i48 = r16;
                        int i49 = (int) V0.getLong(r3);
                        String F05 = V0.isNull(r5) ? null : V0.F0(r5);
                        if (V0.isNull(r9) && V0.isNull(r10) && V0.isNull(r11)) {
                            i3 = r;
                            i4 = r2;
                            i = r5;
                            i2 = i49;
                            status = null;
                        } else {
                            i = r5;
                            i2 = i49;
                            i3 = r;
                            i4 = r2;
                            status = new Status((int) V0.getLong(r9), V0.isNull(r10) ? null : V0.F0(r10), V0.F0(r11));
                        }
                        if (V0.isNull(r12) && V0.isNull(r13)) {
                            stageWinner = null;
                            if (V0.isNull(r14) || !V0.isNull(r15)) {
                                i5 = i48;
                            } else {
                                i5 = i48;
                                if (V0.isNull(i5)) {
                                    i6 = i47;
                                    if (V0.isNull(i6)) {
                                        i8 = i5;
                                        i7 = r12;
                                        i9 = i6;
                                        stageEvent = null;
                                        if (V0.isNull(r18)) {
                                        }
                                        i14 = r13;
                                        i15 = r14;
                                        i16 = r3;
                                        i17 = i;
                                        i18 = r23;
                                        i19 = r24;
                                        i20 = r25;
                                        i21 = r26;
                                        i22 = r15;
                                        i23 = r9;
                                        i24 = r10;
                                        i25 = r11;
                                        i26 = r27;
                                        i27 = r28;
                                        i28 = r29;
                                        i29 = r30;
                                        arrayList = arrayList2;
                                        i30 = r31;
                                        stageEvent2 = stageEvent;
                                        String F06 = V0.F0(r18);
                                        if (V0.isNull(i10)) {
                                        }
                                        int i50 = (int) V0.getLong(i11);
                                        if (!V0.isNull(i12)) {
                                        }
                                        i36 = i38;
                                        i34 = i11;
                                        i39 = i37;
                                        str = F06;
                                        int i51 = (int) V0.getLong(i12);
                                        String F07 = V0.F0(i13);
                                        if (!V0.isNull(i18)) {
                                        }
                                        if (!V0.isNull(i19)) {
                                        }
                                        int i52 = (int) V0.getLong(i20);
                                        String F08 = V0.F0(i21);
                                        String F09 = V0.F0(i26);
                                        i31 = i18;
                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                        i40 = i39;
                                        if (V0.isNull(i40)) {
                                        }
                                        if (!V0.isNull(i40)) {
                                        }
                                        i32 = i40;
                                        sport2 = sport;
                                        v76Var = v76Var3;
                                        i35 = i19;
                                        fieldTranslations = new FieldTranslations(v76Var.c.z(r3), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                        uniqueStage = new UniqueStage(i51, F07, new Category(i52, F08, F09, sport2, fieldTranslations), r49, r50);
                                        stageSeason = new StageSeason(uniqueStage, str, F0, i50);
                                        Stage stage = new Stage(F03, b, status, i2, stageWinner, F05);
                                        r31 = i30;
                                        int i53 = i46;
                                        stage.setStartDateTimestamp(V0.getLong(i53));
                                        v76 v76Var4 = v76Var;
                                        i46 = i53;
                                        int i54 = i45;
                                        stage.setLastUpdate(V0.getLong(i54));
                                        int i55 = i44;
                                        i45 = i54;
                                        stage.setMuted(((int) V0.getLong(i55)) == 0);
                                        int i56 = i43;
                                        stage.setHidden(((int) V0.getLong(i56)) == 0);
                                        stage.setParentEvent(stageEvent2);
                                        stage.setStageSeason(stageSeason);
                                        ArrayList arrayList3 = arrayList;
                                        arrayList3.add(stage);
                                        i43 = i56;
                                        arrayList2 = arrayList3;
                                        r27 = i26;
                                        r28 = i27;
                                        r13 = i14;
                                        r14 = i15;
                                        r15 = i22;
                                        r9 = i23;
                                        r10 = i24;
                                        r20 = i34;
                                        r19 = i33;
                                        r = i3;
                                        r2 = i4;
                                        r30 = i32;
                                        r23 = i31;
                                        r25 = i20;
                                        r29 = i36;
                                        r24 = i35;
                                        r3 = i16;
                                        r11 = i25;
                                        v76Var3 = v76Var4;
                                        i44 = i55;
                                        r21 = i12;
                                        r26 = i21;
                                        r5 = i17;
                                        r16 = i8;
                                        r12 = i7;
                                        r22 = i13;
                                        r17 = i9;
                                    } else {
                                        int i57 = (int) V0.getLong(r14);
                                        String F010 = V0.isNull(r15) ? null : V0.F0(r15);
                                        if (V0.isNull(i5)) {
                                            i8 = i5;
                                            valueOf = null;
                                        } else {
                                            i8 = i5;
                                            valueOf = Long.valueOf(V0.getLong(i5));
                                        }
                                        if (V0.isNull(i6)) {
                                            i7 = r12;
                                            F02 = null;
                                        } else {
                                            i7 = r12;
                                            F02 = V0.F0(i6);
                                        }
                                        i9 = i6;
                                        stageEvent = new StageEvent(i57, F010, valueOf, F02);
                                        if (V0.isNull(r18)) {
                                            i10 = r19;
                                            i11 = r20;
                                            i12 = r21;
                                            i13 = r22;
                                        } else {
                                            i10 = r19;
                                            if (V0.isNull(i10)) {
                                                i11 = r20;
                                                if (V0.isNull(i11)) {
                                                    i12 = r21;
                                                    if (V0.isNull(i12)) {
                                                        i13 = r22;
                                                        if (V0.isNull(i13)) {
                                                            i14 = r13;
                                                            i18 = r23;
                                                            if (V0.isNull(i18)) {
                                                                i15 = r14;
                                                                i19 = r24;
                                                                if (V0.isNull(i19)) {
                                                                    i16 = r3;
                                                                    i20 = r25;
                                                                    if (V0.isNull(i20)) {
                                                                        i17 = i;
                                                                        i21 = r26;
                                                                        if (V0.isNull(i21)) {
                                                                            i22 = r15;
                                                                            i26 = r27;
                                                                            if (V0.isNull(i26)) {
                                                                                i23 = r9;
                                                                                i27 = r28;
                                                                                if (V0.isNull(i27)) {
                                                                                    i24 = r10;
                                                                                    i28 = r29;
                                                                                    if (V0.isNull(i28)) {
                                                                                        i25 = r11;
                                                                                        i29 = r30;
                                                                                        if (V0.isNull(i29)) {
                                                                                            arrayList = arrayList2;
                                                                                            i30 = r31;
                                                                                            if (V0.isNull(i30)) {
                                                                                                i33 = i10;
                                                                                                i34 = i11;
                                                                                                stageEvent2 = stageEvent;
                                                                                                i31 = i18;
                                                                                                i32 = i29;
                                                                                                v76Var = v76Var3;
                                                                                                stageSeason = null;
                                                                                                i35 = i19;
                                                                                                i36 = i28;
                                                                                                Stage stage2 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                                r31 = i30;
                                                                                                int i532 = i46;
                                                                                                stage2.setStartDateTimestamp(V0.getLong(i532));
                                                                                                v76 v76Var42 = v76Var;
                                                                                                i46 = i532;
                                                                                                int i542 = i45;
                                                                                                stage2.setLastUpdate(V0.getLong(i542));
                                                                                                int i552 = i44;
                                                                                                i45 = i542;
                                                                                                stage2.setMuted(((int) V0.getLong(i552)) == 0);
                                                                                                int i562 = i43;
                                                                                                stage2.setHidden(((int) V0.getLong(i562)) == 0);
                                                                                                stage2.setParentEvent(stageEvent2);
                                                                                                stage2.setStageSeason(stageSeason);
                                                                                                ArrayList arrayList32 = arrayList;
                                                                                                arrayList32.add(stage2);
                                                                                                i43 = i562;
                                                                                                arrayList2 = arrayList32;
                                                                                                r27 = i26;
                                                                                                r28 = i27;
                                                                                                r13 = i14;
                                                                                                r14 = i15;
                                                                                                r15 = i22;
                                                                                                r9 = i23;
                                                                                                r10 = i24;
                                                                                                r20 = i34;
                                                                                                r19 = i33;
                                                                                                r = i3;
                                                                                                r2 = i4;
                                                                                                r30 = i32;
                                                                                                r23 = i31;
                                                                                                r25 = i20;
                                                                                                r29 = i36;
                                                                                                r24 = i35;
                                                                                                r3 = i16;
                                                                                                r11 = i25;
                                                                                                v76Var3 = v76Var42;
                                                                                                i44 = i552;
                                                                                                r21 = i12;
                                                                                                r26 = i21;
                                                                                                r5 = i17;
                                                                                                r16 = i8;
                                                                                                r12 = i7;
                                                                                                r22 = i13;
                                                                                                r17 = i9;
                                                                                            }
                                                                                            stageEvent2 = stageEvent;
                                                                                            String F062 = V0.F0(r18);
                                                                                            if (V0.isNull(i10)) {
                                                                                                i33 = i10;
                                                                                                F0 = null;
                                                                                                i38 = i28;
                                                                                                i37 = i29;
                                                                                            } else {
                                                                                                i33 = i10;
                                                                                                F0 = V0.F0(i10);
                                                                                                i37 = i29;
                                                                                                i38 = i28;
                                                                                            }
                                                                                            int i502 = (int) V0.getLong(i11);
                                                                                            if (!V0.isNull(i12) && V0.isNull(i13) && V0.isNull(i18) && V0.isNull(i19) && V0.isNull(i20) && V0.isNull(i21) && V0.isNull(i26) && V0.isNull(i27)) {
                                                                                                i36 = i38;
                                                                                                if (V0.isNull(i36)) {
                                                                                                    i34 = i11;
                                                                                                    int i58 = i37;
                                                                                                    if (V0.isNull(i58) && V0.isNull(i30)) {
                                                                                                        i32 = i58;
                                                                                                        str = F062;
                                                                                                        i31 = i18;
                                                                                                        v76Var = v76Var3;
                                                                                                        uniqueStage = null;
                                                                                                        i35 = i19;
                                                                                                        stageSeason = new StageSeason(uniqueStage, str, F0, i502);
                                                                                                        Stage stage22 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                                        r31 = i30;
                                                                                                        int i5322 = i46;
                                                                                                        stage22.setStartDateTimestamp(V0.getLong(i5322));
                                                                                                        v76 v76Var422 = v76Var;
                                                                                                        i46 = i5322;
                                                                                                        int i5422 = i45;
                                                                                                        stage22.setLastUpdate(V0.getLong(i5422));
                                                                                                        int i5522 = i44;
                                                                                                        i45 = i5422;
                                                                                                        stage22.setMuted(((int) V0.getLong(i5522)) == 0);
                                                                                                        int i5622 = i43;
                                                                                                        stage22.setHidden(((int) V0.getLong(i5622)) == 0);
                                                                                                        stage22.setParentEvent(stageEvent2);
                                                                                                        stage22.setStageSeason(stageSeason);
                                                                                                        ArrayList arrayList322 = arrayList;
                                                                                                        arrayList322.add(stage22);
                                                                                                        i43 = i5622;
                                                                                                        arrayList2 = arrayList322;
                                                                                                        r27 = i26;
                                                                                                        r28 = i27;
                                                                                                        r13 = i14;
                                                                                                        r14 = i15;
                                                                                                        r15 = i22;
                                                                                                        r9 = i23;
                                                                                                        r10 = i24;
                                                                                                        r20 = i34;
                                                                                                        r19 = i33;
                                                                                                        r = i3;
                                                                                                        r2 = i4;
                                                                                                        r30 = i32;
                                                                                                        r23 = i31;
                                                                                                        r25 = i20;
                                                                                                        r29 = i36;
                                                                                                        r24 = i35;
                                                                                                        r3 = i16;
                                                                                                        r11 = i25;
                                                                                                        v76Var3 = v76Var422;
                                                                                                        i44 = i5522;
                                                                                                        r21 = i12;
                                                                                                        r26 = i21;
                                                                                                        r5 = i17;
                                                                                                        r16 = i8;
                                                                                                        r12 = i7;
                                                                                                        r22 = i13;
                                                                                                        r17 = i9;
                                                                                                    } else {
                                                                                                        i39 = i58;
                                                                                                        str = F062;
                                                                                                        int i512 = (int) V0.getLong(i12);
                                                                                                        String F072 = V0.F0(i13);
                                                                                                        String F011 = !V0.isNull(i18) ? null : V0.F0(i18);
                                                                                                        String F012 = !V0.isNull(i19) ? null : V0.F0(i19);
                                                                                                        int i522 = (int) V0.getLong(i20);
                                                                                                        String F082 = V0.F0(i21);
                                                                                                        String F092 = V0.F0(i26);
                                                                                                        i31 = i18;
                                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                                                        i40 = i39;
                                                                                                        if (V0.isNull(i40) && V0.isNull(i30)) {
                                                                                                            i32 = i40;
                                                                                                            sport2 = sport;
                                                                                                            v76Var = v76Var3;
                                                                                                            fieldTranslations = null;
                                                                                                            i35 = i19;
                                                                                                            uniqueStage = new UniqueStage(i512, F072, new Category(i522, F082, F092, sport2, fieldTranslations), F011, F012);
                                                                                                            stageSeason = new StageSeason(uniqueStage, str, F0, i502);
                                                                                                            Stage stage222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                                            r31 = i30;
                                                                                                            int i53222 = i46;
                                                                                                            stage222.setStartDateTimestamp(V0.getLong(i53222));
                                                                                                            v76 v76Var4222 = v76Var;
                                                                                                            i46 = i53222;
                                                                                                            int i54222 = i45;
                                                                                                            stage222.setLastUpdate(V0.getLong(i54222));
                                                                                                            int i55222 = i44;
                                                                                                            i45 = i54222;
                                                                                                            stage222.setMuted(((int) V0.getLong(i55222)) == 0);
                                                                                                            int i56222 = i43;
                                                                                                            stage222.setHidden(((int) V0.getLong(i56222)) == 0);
                                                                                                            stage222.setParentEvent(stageEvent2);
                                                                                                            stage222.setStageSeason(stageSeason);
                                                                                                            ArrayList arrayList3222 = arrayList;
                                                                                                            arrayList3222.add(stage222);
                                                                                                            i43 = i56222;
                                                                                                            arrayList2 = arrayList3222;
                                                                                                            r27 = i26;
                                                                                                            r28 = i27;
                                                                                                            r13 = i14;
                                                                                                            r14 = i15;
                                                                                                            r15 = i22;
                                                                                                            r9 = i23;
                                                                                                            r10 = i24;
                                                                                                            r20 = i34;
                                                                                                            r19 = i33;
                                                                                                            r = i3;
                                                                                                            r2 = i4;
                                                                                                            r30 = i32;
                                                                                                            r23 = i31;
                                                                                                            r25 = i20;
                                                                                                            r29 = i36;
                                                                                                            r24 = i35;
                                                                                                            r3 = i16;
                                                                                                            r11 = i25;
                                                                                                            v76Var3 = v76Var4222;
                                                                                                            i44 = i55222;
                                                                                                            r21 = i12;
                                                                                                            r26 = i21;
                                                                                                            r5 = i17;
                                                                                                            r16 = i8;
                                                                                                            r12 = i7;
                                                                                                            r22 = i13;
                                                                                                            r17 = i9;
                                                                                                        }
                                                                                                        String F013 = !V0.isNull(i40) ? null : V0.F0(i40);
                                                                                                        i32 = i40;
                                                                                                        sport2 = sport;
                                                                                                        v76Var = v76Var3;
                                                                                                        i35 = i19;
                                                                                                        fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                                        uniqueStage = new UniqueStage(i512, F072, new Category(i522, F082, F092, sport2, fieldTranslations), F011, F012);
                                                                                                        stageSeason = new StageSeason(uniqueStage, str, F0, i502);
                                                                                                        Stage stage2222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                                        r31 = i30;
                                                                                                        int i532222 = i46;
                                                                                                        stage2222.setStartDateTimestamp(V0.getLong(i532222));
                                                                                                        v76 v76Var42222 = v76Var;
                                                                                                        i46 = i532222;
                                                                                                        int i542222 = i45;
                                                                                                        stage2222.setLastUpdate(V0.getLong(i542222));
                                                                                                        int i552222 = i44;
                                                                                                        i45 = i542222;
                                                                                                        stage2222.setMuted(((int) V0.getLong(i552222)) == 0);
                                                                                                        int i562222 = i43;
                                                                                                        stage2222.setHidden(((int) V0.getLong(i562222)) == 0);
                                                                                                        stage2222.setParentEvent(stageEvent2);
                                                                                                        stage2222.setStageSeason(stageSeason);
                                                                                                        ArrayList arrayList32222 = arrayList;
                                                                                                        arrayList32222.add(stage2222);
                                                                                                        i43 = i562222;
                                                                                                        arrayList2 = arrayList32222;
                                                                                                        r27 = i26;
                                                                                                        r28 = i27;
                                                                                                        r13 = i14;
                                                                                                        r14 = i15;
                                                                                                        r15 = i22;
                                                                                                        r9 = i23;
                                                                                                        r10 = i24;
                                                                                                        r20 = i34;
                                                                                                        r19 = i33;
                                                                                                        r = i3;
                                                                                                        r2 = i4;
                                                                                                        r30 = i32;
                                                                                                        r23 = i31;
                                                                                                        r25 = i20;
                                                                                                        r29 = i36;
                                                                                                        r24 = i35;
                                                                                                        r3 = i16;
                                                                                                        r11 = i25;
                                                                                                        v76Var3 = v76Var42222;
                                                                                                        i44 = i552222;
                                                                                                        r21 = i12;
                                                                                                        r26 = i21;
                                                                                                        r5 = i17;
                                                                                                        r16 = i8;
                                                                                                        r12 = i7;
                                                                                                        r22 = i13;
                                                                                                        r17 = i9;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i36 = i38;
                                                                                            }
                                                                                            i34 = i11;
                                                                                            i39 = i37;
                                                                                            str = F062;
                                                                                            int i5122 = (int) V0.getLong(i12);
                                                                                            String F0722 = V0.F0(i13);
                                                                                            if (!V0.isNull(i18)) {
                                                                                            }
                                                                                            if (!V0.isNull(i19)) {
                                                                                            }
                                                                                            int i5222 = (int) V0.getLong(i20);
                                                                                            String F0822 = V0.F0(i21);
                                                                                            String F0922 = V0.F0(i26);
                                                                                            i31 = i18;
                                                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                                            i40 = i39;
                                                                                            if (V0.isNull(i40)) {
                                                                                                i32 = i40;
                                                                                                sport2 = sport;
                                                                                                v76Var = v76Var3;
                                                                                                fieldTranslations = null;
                                                                                                i35 = i19;
                                                                                                uniqueStage = new UniqueStage(i5122, F0722, new Category(i5222, F0822, F0922, sport2, fieldTranslations), F011, F012);
                                                                                                stageSeason = new StageSeason(uniqueStage, str, F0, i502);
                                                                                                Stage stage22222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                                r31 = i30;
                                                                                                int i5322222 = i46;
                                                                                                stage22222.setStartDateTimestamp(V0.getLong(i5322222));
                                                                                                v76 v76Var422222 = v76Var;
                                                                                                i46 = i5322222;
                                                                                                int i5422222 = i45;
                                                                                                stage22222.setLastUpdate(V0.getLong(i5422222));
                                                                                                int i5522222 = i44;
                                                                                                i45 = i5422222;
                                                                                                stage22222.setMuted(((int) V0.getLong(i5522222)) == 0);
                                                                                                int i5622222 = i43;
                                                                                                stage22222.setHidden(((int) V0.getLong(i5622222)) == 0);
                                                                                                stage22222.setParentEvent(stageEvent2);
                                                                                                stage22222.setStageSeason(stageSeason);
                                                                                                ArrayList arrayList322222 = arrayList;
                                                                                                arrayList322222.add(stage22222);
                                                                                                i43 = i5622222;
                                                                                                arrayList2 = arrayList322222;
                                                                                                r27 = i26;
                                                                                                r28 = i27;
                                                                                                r13 = i14;
                                                                                                r14 = i15;
                                                                                                r15 = i22;
                                                                                                r9 = i23;
                                                                                                r10 = i24;
                                                                                                r20 = i34;
                                                                                                r19 = i33;
                                                                                                r = i3;
                                                                                                r2 = i4;
                                                                                                r30 = i32;
                                                                                                r23 = i31;
                                                                                                r25 = i20;
                                                                                                r29 = i36;
                                                                                                r24 = i35;
                                                                                                r3 = i16;
                                                                                                r11 = i25;
                                                                                                v76Var3 = v76Var422222;
                                                                                                i44 = i5522222;
                                                                                                r21 = i12;
                                                                                                r26 = i21;
                                                                                                r5 = i17;
                                                                                                r16 = i8;
                                                                                                r12 = i7;
                                                                                                r22 = i13;
                                                                                                r17 = i9;
                                                                                            }
                                                                                            if (!V0.isNull(i40)) {
                                                                                            }
                                                                                            i32 = i40;
                                                                                            sport2 = sport;
                                                                                            v76Var = v76Var3;
                                                                                            i35 = i19;
                                                                                            fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                            uniqueStage = new UniqueStage(i5122, F0722, new Category(i5222, F0822, F0922, sport2, fieldTranslations), F011, F012);
                                                                                            stageSeason = new StageSeason(uniqueStage, str, F0, i502);
                                                                                            Stage stage222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                            r31 = i30;
                                                                                            int i53222222 = i46;
                                                                                            stage222222.setStartDateTimestamp(V0.getLong(i53222222));
                                                                                            v76 v76Var4222222 = v76Var;
                                                                                            i46 = i53222222;
                                                                                            int i54222222 = i45;
                                                                                            stage222222.setLastUpdate(V0.getLong(i54222222));
                                                                                            int i55222222 = i44;
                                                                                            i45 = i54222222;
                                                                                            stage222222.setMuted(((int) V0.getLong(i55222222)) == 0);
                                                                                            int i56222222 = i43;
                                                                                            stage222222.setHidden(((int) V0.getLong(i56222222)) == 0);
                                                                                            stage222222.setParentEvent(stageEvent2);
                                                                                            stage222222.setStageSeason(stageSeason);
                                                                                            ArrayList arrayList3222222 = arrayList;
                                                                                            arrayList3222222.add(stage222222);
                                                                                            i43 = i56222222;
                                                                                            arrayList2 = arrayList3222222;
                                                                                            r27 = i26;
                                                                                            r28 = i27;
                                                                                            r13 = i14;
                                                                                            r14 = i15;
                                                                                            r15 = i22;
                                                                                            r9 = i23;
                                                                                            r10 = i24;
                                                                                            r20 = i34;
                                                                                            r19 = i33;
                                                                                            r = i3;
                                                                                            r2 = i4;
                                                                                            r30 = i32;
                                                                                            r23 = i31;
                                                                                            r25 = i20;
                                                                                            r29 = i36;
                                                                                            r24 = i35;
                                                                                            r3 = i16;
                                                                                            r11 = i25;
                                                                                            v76Var3 = v76Var4222222;
                                                                                            i44 = i55222222;
                                                                                            r21 = i12;
                                                                                            r26 = i21;
                                                                                            r5 = i17;
                                                                                            r16 = i8;
                                                                                            r12 = i7;
                                                                                            r22 = i13;
                                                                                            r17 = i9;
                                                                                        }
                                                                                        arrayList = arrayList2;
                                                                                        i30 = r31;
                                                                                        stageEvent2 = stageEvent;
                                                                                        String F0622 = V0.F0(r18);
                                                                                        if (V0.isNull(i10)) {
                                                                                        }
                                                                                        int i5022 = (int) V0.getLong(i11);
                                                                                        if (!V0.isNull(i12)) {
                                                                                        }
                                                                                        i36 = i38;
                                                                                        i34 = i11;
                                                                                        i39 = i37;
                                                                                        str = F0622;
                                                                                        int i51222 = (int) V0.getLong(i12);
                                                                                        String F07222 = V0.F0(i13);
                                                                                        if (!V0.isNull(i18)) {
                                                                                        }
                                                                                        if (!V0.isNull(i19)) {
                                                                                        }
                                                                                        int i52222 = (int) V0.getLong(i20);
                                                                                        String F08222 = V0.F0(i21);
                                                                                        String F09222 = V0.F0(i26);
                                                                                        i31 = i18;
                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                                        i40 = i39;
                                                                                        if (V0.isNull(i40)) {
                                                                                        }
                                                                                        if (!V0.isNull(i40)) {
                                                                                        }
                                                                                        i32 = i40;
                                                                                        sport2 = sport;
                                                                                        v76Var = v76Var3;
                                                                                        i35 = i19;
                                                                                        fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                        uniqueStage = new UniqueStage(i51222, F07222, new Category(i52222, F08222, F09222, sport2, fieldTranslations), F011, F012);
                                                                                        stageSeason = new StageSeason(uniqueStage, str, F0, i5022);
                                                                                        Stage stage2222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                        r31 = i30;
                                                                                        int i532222222 = i46;
                                                                                        stage2222222.setStartDateTimestamp(V0.getLong(i532222222));
                                                                                        v76 v76Var42222222 = v76Var;
                                                                                        i46 = i532222222;
                                                                                        int i542222222 = i45;
                                                                                        stage2222222.setLastUpdate(V0.getLong(i542222222));
                                                                                        int i552222222 = i44;
                                                                                        i45 = i542222222;
                                                                                        stage2222222.setMuted(((int) V0.getLong(i552222222)) == 0);
                                                                                        int i562222222 = i43;
                                                                                        stage2222222.setHidden(((int) V0.getLong(i562222222)) == 0);
                                                                                        stage2222222.setParentEvent(stageEvent2);
                                                                                        stage2222222.setStageSeason(stageSeason);
                                                                                        ArrayList arrayList32222222 = arrayList;
                                                                                        arrayList32222222.add(stage2222222);
                                                                                        i43 = i562222222;
                                                                                        arrayList2 = arrayList32222222;
                                                                                        r27 = i26;
                                                                                        r28 = i27;
                                                                                        r13 = i14;
                                                                                        r14 = i15;
                                                                                        r15 = i22;
                                                                                        r9 = i23;
                                                                                        r10 = i24;
                                                                                        r20 = i34;
                                                                                        r19 = i33;
                                                                                        r = i3;
                                                                                        r2 = i4;
                                                                                        r30 = i32;
                                                                                        r23 = i31;
                                                                                        r25 = i20;
                                                                                        r29 = i36;
                                                                                        r24 = i35;
                                                                                        r3 = i16;
                                                                                        r11 = i25;
                                                                                        v76Var3 = v76Var42222222;
                                                                                        i44 = i552222222;
                                                                                        r21 = i12;
                                                                                        r26 = i21;
                                                                                        r5 = i17;
                                                                                        r16 = i8;
                                                                                        r12 = i7;
                                                                                        r22 = i13;
                                                                                        r17 = i9;
                                                                                    }
                                                                                    arrayList = arrayList2;
                                                                                    i25 = r11;
                                                                                    i29 = r30;
                                                                                    i30 = r31;
                                                                                    stageEvent2 = stageEvent;
                                                                                    String F06222 = V0.F0(r18);
                                                                                    if (V0.isNull(i10)) {
                                                                                    }
                                                                                    int i50222 = (int) V0.getLong(i11);
                                                                                    if (!V0.isNull(i12)) {
                                                                                    }
                                                                                    i36 = i38;
                                                                                    i34 = i11;
                                                                                    i39 = i37;
                                                                                    str = F06222;
                                                                                    int i512222 = (int) V0.getLong(i12);
                                                                                    String F072222 = V0.F0(i13);
                                                                                    if (!V0.isNull(i18)) {
                                                                                    }
                                                                                    if (!V0.isNull(i19)) {
                                                                                    }
                                                                                    int i522222 = (int) V0.getLong(i20);
                                                                                    String F082222 = V0.F0(i21);
                                                                                    String F092222 = V0.F0(i26);
                                                                                    i31 = i18;
                                                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                                    i40 = i39;
                                                                                    if (V0.isNull(i40)) {
                                                                                    }
                                                                                    if (!V0.isNull(i40)) {
                                                                                    }
                                                                                    i32 = i40;
                                                                                    sport2 = sport;
                                                                                    v76Var = v76Var3;
                                                                                    i35 = i19;
                                                                                    fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                    uniqueStage = new UniqueStage(i512222, F072222, new Category(i522222, F082222, F092222, sport2, fieldTranslations), F011, F012);
                                                                                    stageSeason = new StageSeason(uniqueStage, str, F0, i50222);
                                                                                    Stage stage22222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                    r31 = i30;
                                                                                    int i5322222222 = i46;
                                                                                    stage22222222.setStartDateTimestamp(V0.getLong(i5322222222));
                                                                                    v76 v76Var422222222 = v76Var;
                                                                                    i46 = i5322222222;
                                                                                    int i5422222222 = i45;
                                                                                    stage22222222.setLastUpdate(V0.getLong(i5422222222));
                                                                                    int i5522222222 = i44;
                                                                                    i45 = i5422222222;
                                                                                    stage22222222.setMuted(((int) V0.getLong(i5522222222)) == 0);
                                                                                    int i5622222222 = i43;
                                                                                    stage22222222.setHidden(((int) V0.getLong(i5622222222)) == 0);
                                                                                    stage22222222.setParentEvent(stageEvent2);
                                                                                    stage22222222.setStageSeason(stageSeason);
                                                                                    ArrayList arrayList322222222 = arrayList;
                                                                                    arrayList322222222.add(stage22222222);
                                                                                    i43 = i5622222222;
                                                                                    arrayList2 = arrayList322222222;
                                                                                    r27 = i26;
                                                                                    r28 = i27;
                                                                                    r13 = i14;
                                                                                    r14 = i15;
                                                                                    r15 = i22;
                                                                                    r9 = i23;
                                                                                    r10 = i24;
                                                                                    r20 = i34;
                                                                                    r19 = i33;
                                                                                    r = i3;
                                                                                    r2 = i4;
                                                                                    r30 = i32;
                                                                                    r23 = i31;
                                                                                    r25 = i20;
                                                                                    r29 = i36;
                                                                                    r24 = i35;
                                                                                    r3 = i16;
                                                                                    r11 = i25;
                                                                                    v76Var3 = v76Var422222222;
                                                                                    i44 = i5522222222;
                                                                                    r21 = i12;
                                                                                    r26 = i21;
                                                                                    r5 = i17;
                                                                                    r16 = i8;
                                                                                    r12 = i7;
                                                                                    r22 = i13;
                                                                                    r17 = i9;
                                                                                }
                                                                                arrayList = arrayList2;
                                                                                i24 = r10;
                                                                                i25 = r11;
                                                                                i28 = r29;
                                                                                i29 = r30;
                                                                                i30 = r31;
                                                                                stageEvent2 = stageEvent;
                                                                                String F062222 = V0.F0(r18);
                                                                                if (V0.isNull(i10)) {
                                                                                }
                                                                                int i502222 = (int) V0.getLong(i11);
                                                                                if (!V0.isNull(i12)) {
                                                                                }
                                                                                i36 = i38;
                                                                                i34 = i11;
                                                                                i39 = i37;
                                                                                str = F062222;
                                                                                int i5122222 = (int) V0.getLong(i12);
                                                                                String F0722222 = V0.F0(i13);
                                                                                if (!V0.isNull(i18)) {
                                                                                }
                                                                                if (!V0.isNull(i19)) {
                                                                                }
                                                                                int i5222222 = (int) V0.getLong(i20);
                                                                                String F0822222 = V0.F0(i21);
                                                                                String F0922222 = V0.F0(i26);
                                                                                i31 = i18;
                                                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                                i40 = i39;
                                                                                if (V0.isNull(i40)) {
                                                                                }
                                                                                if (!V0.isNull(i40)) {
                                                                                }
                                                                                i32 = i40;
                                                                                sport2 = sport;
                                                                                v76Var = v76Var3;
                                                                                i35 = i19;
                                                                                fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                uniqueStage = new UniqueStage(i5122222, F0722222, new Category(i5222222, F0822222, F0922222, sport2, fieldTranslations), F011, F012);
                                                                                stageSeason = new StageSeason(uniqueStage, str, F0, i502222);
                                                                                Stage stage222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                                r31 = i30;
                                                                                int i53222222222 = i46;
                                                                                stage222222222.setStartDateTimestamp(V0.getLong(i53222222222));
                                                                                v76 v76Var4222222222 = v76Var;
                                                                                i46 = i53222222222;
                                                                                int i54222222222 = i45;
                                                                                stage222222222.setLastUpdate(V0.getLong(i54222222222));
                                                                                int i55222222222 = i44;
                                                                                i45 = i54222222222;
                                                                                stage222222222.setMuted(((int) V0.getLong(i55222222222)) == 0);
                                                                                int i56222222222 = i43;
                                                                                stage222222222.setHidden(((int) V0.getLong(i56222222222)) == 0);
                                                                                stage222222222.setParentEvent(stageEvent2);
                                                                                stage222222222.setStageSeason(stageSeason);
                                                                                ArrayList arrayList3222222222 = arrayList;
                                                                                arrayList3222222222.add(stage222222222);
                                                                                i43 = i56222222222;
                                                                                arrayList2 = arrayList3222222222;
                                                                                r27 = i26;
                                                                                r28 = i27;
                                                                                r13 = i14;
                                                                                r14 = i15;
                                                                                r15 = i22;
                                                                                r9 = i23;
                                                                                r10 = i24;
                                                                                r20 = i34;
                                                                                r19 = i33;
                                                                                r = i3;
                                                                                r2 = i4;
                                                                                r30 = i32;
                                                                                r23 = i31;
                                                                                r25 = i20;
                                                                                r29 = i36;
                                                                                r24 = i35;
                                                                                r3 = i16;
                                                                                r11 = i25;
                                                                                v76Var3 = v76Var4222222222;
                                                                                i44 = i55222222222;
                                                                                r21 = i12;
                                                                                r26 = i21;
                                                                                r5 = i17;
                                                                                r16 = i8;
                                                                                r12 = i7;
                                                                                r22 = i13;
                                                                                r17 = i9;
                                                                            }
                                                                            arrayList = arrayList2;
                                                                            i23 = r9;
                                                                            i24 = r10;
                                                                            i25 = r11;
                                                                            i27 = r28;
                                                                            i28 = r29;
                                                                            i29 = r30;
                                                                            i30 = r31;
                                                                            stageEvent2 = stageEvent;
                                                                            String F0622222 = V0.F0(r18);
                                                                            if (V0.isNull(i10)) {
                                                                            }
                                                                            int i5022222 = (int) V0.getLong(i11);
                                                                            if (!V0.isNull(i12)) {
                                                                            }
                                                                            i36 = i38;
                                                                            i34 = i11;
                                                                            i39 = i37;
                                                                            str = F0622222;
                                                                            int i51222222 = (int) V0.getLong(i12);
                                                                            String F07222222 = V0.F0(i13);
                                                                            if (!V0.isNull(i18)) {
                                                                            }
                                                                            if (!V0.isNull(i19)) {
                                                                            }
                                                                            int i52222222 = (int) V0.getLong(i20);
                                                                            String F08222222 = V0.F0(i21);
                                                                            String F09222222 = V0.F0(i26);
                                                                            i31 = i18;
                                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                            i40 = i39;
                                                                            if (V0.isNull(i40)) {
                                                                            }
                                                                            if (!V0.isNull(i40)) {
                                                                            }
                                                                            i32 = i40;
                                                                            sport2 = sport;
                                                                            v76Var = v76Var3;
                                                                            i35 = i19;
                                                                            fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                            uniqueStage = new UniqueStage(i51222222, F07222222, new Category(i52222222, F08222222, F09222222, sport2, fieldTranslations), F011, F012);
                                                                            stageSeason = new StageSeason(uniqueStage, str, F0, i5022222);
                                                                            Stage stage2222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                            r31 = i30;
                                                                            int i532222222222 = i46;
                                                                            stage2222222222.setStartDateTimestamp(V0.getLong(i532222222222));
                                                                            v76 v76Var42222222222 = v76Var;
                                                                            i46 = i532222222222;
                                                                            int i542222222222 = i45;
                                                                            stage2222222222.setLastUpdate(V0.getLong(i542222222222));
                                                                            int i552222222222 = i44;
                                                                            i45 = i542222222222;
                                                                            stage2222222222.setMuted(((int) V0.getLong(i552222222222)) == 0);
                                                                            int i562222222222 = i43;
                                                                            stage2222222222.setHidden(((int) V0.getLong(i562222222222)) == 0);
                                                                            stage2222222222.setParentEvent(stageEvent2);
                                                                            stage2222222222.setStageSeason(stageSeason);
                                                                            ArrayList arrayList32222222222 = arrayList;
                                                                            arrayList32222222222.add(stage2222222222);
                                                                            i43 = i562222222222;
                                                                            arrayList2 = arrayList32222222222;
                                                                            r27 = i26;
                                                                            r28 = i27;
                                                                            r13 = i14;
                                                                            r14 = i15;
                                                                            r15 = i22;
                                                                            r9 = i23;
                                                                            r10 = i24;
                                                                            r20 = i34;
                                                                            r19 = i33;
                                                                            r = i3;
                                                                            r2 = i4;
                                                                            r30 = i32;
                                                                            r23 = i31;
                                                                            r25 = i20;
                                                                            r29 = i36;
                                                                            r24 = i35;
                                                                            r3 = i16;
                                                                            r11 = i25;
                                                                            v76Var3 = v76Var42222222222;
                                                                            i44 = i552222222222;
                                                                            r21 = i12;
                                                                            r26 = i21;
                                                                            r5 = i17;
                                                                            r16 = i8;
                                                                            r12 = i7;
                                                                            r22 = i13;
                                                                            r17 = i9;
                                                                        }
                                                                        i22 = r15;
                                                                        i23 = r9;
                                                                        i24 = r10;
                                                                        i25 = r11;
                                                                        i26 = r27;
                                                                        i27 = r28;
                                                                        i28 = r29;
                                                                        i29 = r30;
                                                                        arrayList = arrayList2;
                                                                        i30 = r31;
                                                                        stageEvent2 = stageEvent;
                                                                        String F06222222 = V0.F0(r18);
                                                                        if (V0.isNull(i10)) {
                                                                        }
                                                                        int i50222222 = (int) V0.getLong(i11);
                                                                        if (!V0.isNull(i12)) {
                                                                        }
                                                                        i36 = i38;
                                                                        i34 = i11;
                                                                        i39 = i37;
                                                                        str = F06222222;
                                                                        int i512222222 = (int) V0.getLong(i12);
                                                                        String F072222222 = V0.F0(i13);
                                                                        if (!V0.isNull(i18)) {
                                                                        }
                                                                        if (!V0.isNull(i19)) {
                                                                        }
                                                                        int i522222222 = (int) V0.getLong(i20);
                                                                        String F082222222 = V0.F0(i21);
                                                                        String F092222222 = V0.F0(i26);
                                                                        i31 = i18;
                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                                        i40 = i39;
                                                                        if (V0.isNull(i40)) {
                                                                        }
                                                                        if (!V0.isNull(i40)) {
                                                                        }
                                                                        i32 = i40;
                                                                        sport2 = sport;
                                                                        v76Var = v76Var3;
                                                                        i35 = i19;
                                                                        fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                                        uniqueStage = new UniqueStage(i512222222, F072222222, new Category(i522222222, F082222222, F092222222, sport2, fieldTranslations), F011, F012);
                                                                        stageSeason = new StageSeason(uniqueStage, str, F0, i50222222);
                                                                        Stage stage22222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                                        r31 = i30;
                                                                        int i5322222222222 = i46;
                                                                        stage22222222222.setStartDateTimestamp(V0.getLong(i5322222222222));
                                                                        v76 v76Var422222222222 = v76Var;
                                                                        i46 = i5322222222222;
                                                                        int i5422222222222 = i45;
                                                                        stage22222222222.setLastUpdate(V0.getLong(i5422222222222));
                                                                        int i5522222222222 = i44;
                                                                        i45 = i5422222222222;
                                                                        stage22222222222.setMuted(((int) V0.getLong(i5522222222222)) == 0);
                                                                        int i5622222222222 = i43;
                                                                        stage22222222222.setHidden(((int) V0.getLong(i5622222222222)) == 0);
                                                                        stage22222222222.setParentEvent(stageEvent2);
                                                                        stage22222222222.setStageSeason(stageSeason);
                                                                        ArrayList arrayList322222222222 = arrayList;
                                                                        arrayList322222222222.add(stage22222222222);
                                                                        i43 = i5622222222222;
                                                                        arrayList2 = arrayList322222222222;
                                                                        r27 = i26;
                                                                        r28 = i27;
                                                                        r13 = i14;
                                                                        r14 = i15;
                                                                        r15 = i22;
                                                                        r9 = i23;
                                                                        r10 = i24;
                                                                        r20 = i34;
                                                                        r19 = i33;
                                                                        r = i3;
                                                                        r2 = i4;
                                                                        r30 = i32;
                                                                        r23 = i31;
                                                                        r25 = i20;
                                                                        r29 = i36;
                                                                        r24 = i35;
                                                                        r3 = i16;
                                                                        r11 = i25;
                                                                        v76Var3 = v76Var422222222222;
                                                                        i44 = i5522222222222;
                                                                        r21 = i12;
                                                                        r26 = i21;
                                                                        r5 = i17;
                                                                        r16 = i8;
                                                                        r12 = i7;
                                                                        r22 = i13;
                                                                        r17 = i9;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i14 = r13;
                                                        i15 = r14;
                                                        i16 = r3;
                                                        i13 = r22;
                                                        i18 = r23;
                                                        i19 = r24;
                                                        i20 = r25;
                                                    }
                                                    i17 = i;
                                                    i22 = r15;
                                                    i23 = r9;
                                                    i24 = r10;
                                                    i21 = r26;
                                                    i26 = r27;
                                                    i27 = r28;
                                                    i28 = r29;
                                                    arrayList = arrayList2;
                                                    i25 = r11;
                                                    i29 = r30;
                                                    i30 = r31;
                                                    stageEvent2 = stageEvent;
                                                    String F062222222 = V0.F0(r18);
                                                    if (V0.isNull(i10)) {
                                                    }
                                                    int i502222222 = (int) V0.getLong(i11);
                                                    if (!V0.isNull(i12)) {
                                                    }
                                                    i36 = i38;
                                                    i34 = i11;
                                                    i39 = i37;
                                                    str = F062222222;
                                                    int i5122222222 = (int) V0.getLong(i12);
                                                    String F0722222222 = V0.F0(i13);
                                                    if (!V0.isNull(i18)) {
                                                    }
                                                    if (!V0.isNull(i19)) {
                                                    }
                                                    int i5222222222 = (int) V0.getLong(i20);
                                                    String F0822222222 = V0.F0(i21);
                                                    String F0922222222 = V0.F0(i26);
                                                    i31 = i18;
                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                    i40 = i39;
                                                    if (V0.isNull(i40)) {
                                                    }
                                                    if (!V0.isNull(i40)) {
                                                    }
                                                    i32 = i40;
                                                    sport2 = sport;
                                                    v76Var = v76Var3;
                                                    i35 = i19;
                                                    fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                    uniqueStage = new UniqueStage(i5122222222, F0722222222, new Category(i5222222222, F0822222222, F0922222222, sport2, fieldTranslations), F011, F012);
                                                    stageSeason = new StageSeason(uniqueStage, str, F0, i502222222);
                                                    Stage stage222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                    r31 = i30;
                                                    int i53222222222222 = i46;
                                                    stage222222222222.setStartDateTimestamp(V0.getLong(i53222222222222));
                                                    v76 v76Var4222222222222 = v76Var;
                                                    i46 = i53222222222222;
                                                    int i54222222222222 = i45;
                                                    stage222222222222.setLastUpdate(V0.getLong(i54222222222222));
                                                    int i55222222222222 = i44;
                                                    i45 = i54222222222222;
                                                    stage222222222222.setMuted(((int) V0.getLong(i55222222222222)) == 0);
                                                    int i56222222222222 = i43;
                                                    stage222222222222.setHidden(((int) V0.getLong(i56222222222222)) == 0);
                                                    stage222222222222.setParentEvent(stageEvent2);
                                                    stage222222222222.setStageSeason(stageSeason);
                                                    ArrayList arrayList3222222222222 = arrayList;
                                                    arrayList3222222222222.add(stage222222222222);
                                                    i43 = i56222222222222;
                                                    arrayList2 = arrayList3222222222222;
                                                    r27 = i26;
                                                    r28 = i27;
                                                    r13 = i14;
                                                    r14 = i15;
                                                    r15 = i22;
                                                    r9 = i23;
                                                    r10 = i24;
                                                    r20 = i34;
                                                    r19 = i33;
                                                    r = i3;
                                                    r2 = i4;
                                                    r30 = i32;
                                                    r23 = i31;
                                                    r25 = i20;
                                                    r29 = i36;
                                                    r24 = i35;
                                                    r3 = i16;
                                                    r11 = i25;
                                                    v76Var3 = v76Var4222222222222;
                                                    i44 = i55222222222222;
                                                    r21 = i12;
                                                    r26 = i21;
                                                    r5 = i17;
                                                    r16 = i8;
                                                    r12 = i7;
                                                    r22 = i13;
                                                    r17 = i9;
                                                } else {
                                                    i14 = r13;
                                                    i15 = r14;
                                                    i12 = r21;
                                                    i13 = r22;
                                                    i18 = r23;
                                                    i19 = r24;
                                                }
                                                i16 = r3;
                                                i17 = i;
                                                i22 = r15;
                                                i23 = r9;
                                                i20 = r25;
                                                i21 = r26;
                                                i26 = r27;
                                                i27 = r28;
                                                arrayList = arrayList2;
                                                i24 = r10;
                                                i25 = r11;
                                                i28 = r29;
                                                i29 = r30;
                                                i30 = r31;
                                                stageEvent2 = stageEvent;
                                                String F0622222222 = V0.F0(r18);
                                                if (V0.isNull(i10)) {
                                                }
                                                int i5022222222 = (int) V0.getLong(i11);
                                                if (!V0.isNull(i12)) {
                                                }
                                                i36 = i38;
                                                i34 = i11;
                                                i39 = i37;
                                                str = F0622222222;
                                                int i51222222222 = (int) V0.getLong(i12);
                                                String F07222222222 = V0.F0(i13);
                                                if (!V0.isNull(i18)) {
                                                }
                                                if (!V0.isNull(i19)) {
                                                }
                                                int i52222222222 = (int) V0.getLong(i20);
                                                String F08222222222 = V0.F0(i21);
                                                String F09222222222 = V0.F0(i26);
                                                i31 = i18;
                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                                i40 = i39;
                                                if (V0.isNull(i40)) {
                                                }
                                                if (!V0.isNull(i40)) {
                                                }
                                                i32 = i40;
                                                sport2 = sport;
                                                v76Var = v76Var3;
                                                i35 = i19;
                                                fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                                uniqueStage = new UniqueStage(i51222222222, F07222222222, new Category(i52222222222, F08222222222, F09222222222, sport2, fieldTranslations), F011, F012);
                                                stageSeason = new StageSeason(uniqueStage, str, F0, i5022222222);
                                                Stage stage2222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                                r31 = i30;
                                                int i532222222222222 = i46;
                                                stage2222222222222.setStartDateTimestamp(V0.getLong(i532222222222222));
                                                v76 v76Var42222222222222 = v76Var;
                                                i46 = i532222222222222;
                                                int i542222222222222 = i45;
                                                stage2222222222222.setLastUpdate(V0.getLong(i542222222222222));
                                                int i552222222222222 = i44;
                                                i45 = i542222222222222;
                                                stage2222222222222.setMuted(((int) V0.getLong(i552222222222222)) == 0);
                                                int i562222222222222 = i43;
                                                stage2222222222222.setHidden(((int) V0.getLong(i562222222222222)) == 0);
                                                stage2222222222222.setParentEvent(stageEvent2);
                                                stage2222222222222.setStageSeason(stageSeason);
                                                ArrayList arrayList32222222222222 = arrayList;
                                                arrayList32222222222222.add(stage2222222222222);
                                                i43 = i562222222222222;
                                                arrayList2 = arrayList32222222222222;
                                                r27 = i26;
                                                r28 = i27;
                                                r13 = i14;
                                                r14 = i15;
                                                r15 = i22;
                                                r9 = i23;
                                                r10 = i24;
                                                r20 = i34;
                                                r19 = i33;
                                                r = i3;
                                                r2 = i4;
                                                r30 = i32;
                                                r23 = i31;
                                                r25 = i20;
                                                r29 = i36;
                                                r24 = i35;
                                                r3 = i16;
                                                r11 = i25;
                                                v76Var3 = v76Var42222222222222;
                                                i44 = i552222222222222;
                                                r21 = i12;
                                                r26 = i21;
                                                r5 = i17;
                                                r16 = i8;
                                                r12 = i7;
                                                r22 = i13;
                                                r17 = i9;
                                            } else {
                                                i14 = r13;
                                                i11 = r20;
                                                i12 = r21;
                                                i13 = r22;
                                                i18 = r23;
                                            }
                                            i15 = r14;
                                            i16 = r3;
                                            i17 = i;
                                            i22 = r15;
                                            i19 = r24;
                                            i20 = r25;
                                            i21 = r26;
                                            i26 = r27;
                                            arrayList = arrayList2;
                                            i23 = r9;
                                            i24 = r10;
                                            i25 = r11;
                                            i27 = r28;
                                            i28 = r29;
                                            i29 = r30;
                                            i30 = r31;
                                            stageEvent2 = stageEvent;
                                            String F06222222222 = V0.F0(r18);
                                            if (V0.isNull(i10)) {
                                            }
                                            int i50222222222 = (int) V0.getLong(i11);
                                            if (!V0.isNull(i12)) {
                                            }
                                            i36 = i38;
                                            i34 = i11;
                                            i39 = i37;
                                            str = F06222222222;
                                            int i512222222222 = (int) V0.getLong(i12);
                                            String F072222222222 = V0.F0(i13);
                                            if (!V0.isNull(i18)) {
                                            }
                                            if (!V0.isNull(i19)) {
                                            }
                                            int i522222222222 = (int) V0.getLong(i20);
                                            String F082222222222 = V0.F0(i21);
                                            String F092222222222 = V0.F0(i26);
                                            i31 = i18;
                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                            i40 = i39;
                                            if (V0.isNull(i40)) {
                                            }
                                            if (!V0.isNull(i40)) {
                                            }
                                            i32 = i40;
                                            sport2 = sport;
                                            v76Var = v76Var3;
                                            i35 = i19;
                                            fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                            uniqueStage = new UniqueStage(i512222222222, F072222222222, new Category(i522222222222, F082222222222, F092222222222, sport2, fieldTranslations), F011, F012);
                                            stageSeason = new StageSeason(uniqueStage, str, F0, i50222222222);
                                            Stage stage22222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                            r31 = i30;
                                            int i5322222222222222 = i46;
                                            stage22222222222222.setStartDateTimestamp(V0.getLong(i5322222222222222));
                                            v76 v76Var422222222222222 = v76Var;
                                            i46 = i5322222222222222;
                                            int i5422222222222222 = i45;
                                            stage22222222222222.setLastUpdate(V0.getLong(i5422222222222222));
                                            int i5522222222222222 = i44;
                                            i45 = i5422222222222222;
                                            stage22222222222222.setMuted(((int) V0.getLong(i5522222222222222)) == 0);
                                            int i5622222222222222 = i43;
                                            stage22222222222222.setHidden(((int) V0.getLong(i5622222222222222)) == 0);
                                            stage22222222222222.setParentEvent(stageEvent2);
                                            stage22222222222222.setStageSeason(stageSeason);
                                            ArrayList arrayList322222222222222 = arrayList;
                                            arrayList322222222222222.add(stage22222222222222);
                                            i43 = i5622222222222222;
                                            arrayList2 = arrayList322222222222222;
                                            r27 = i26;
                                            r28 = i27;
                                            r13 = i14;
                                            r14 = i15;
                                            r15 = i22;
                                            r9 = i23;
                                            r10 = i24;
                                            r20 = i34;
                                            r19 = i33;
                                            r = i3;
                                            r2 = i4;
                                            r30 = i32;
                                            r23 = i31;
                                            r25 = i20;
                                            r29 = i36;
                                            r24 = i35;
                                            r3 = i16;
                                            r11 = i25;
                                            v76Var3 = v76Var422222222222222;
                                            i44 = i5522222222222222;
                                            r21 = i12;
                                            r26 = i21;
                                            r5 = i17;
                                            r16 = i8;
                                            r12 = i7;
                                            r22 = i13;
                                            r17 = i9;
                                        }
                                        i14 = r13;
                                        i15 = r14;
                                        i16 = r3;
                                        i17 = i;
                                        i18 = r23;
                                        i19 = r24;
                                        i20 = r25;
                                        i21 = r26;
                                        i22 = r15;
                                        i23 = r9;
                                        i24 = r10;
                                        i25 = r11;
                                        i26 = r27;
                                        i27 = r28;
                                        i28 = r29;
                                        i29 = r30;
                                        arrayList = arrayList2;
                                        i30 = r31;
                                        stageEvent2 = stageEvent;
                                        String F062222222222 = V0.F0(r18);
                                        if (V0.isNull(i10)) {
                                        }
                                        int i502222222222 = (int) V0.getLong(i11);
                                        if (!V0.isNull(i12)) {
                                        }
                                        i36 = i38;
                                        i34 = i11;
                                        i39 = i37;
                                        str = F062222222222;
                                        int i5122222222222 = (int) V0.getLong(i12);
                                        String F0722222222222 = V0.F0(i13);
                                        if (!V0.isNull(i18)) {
                                        }
                                        if (!V0.isNull(i19)) {
                                        }
                                        int i5222222222222 = (int) V0.getLong(i20);
                                        String F0822222222222 = V0.F0(i21);
                                        String F0922222222222 = V0.F0(i26);
                                        i31 = i18;
                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                                        i40 = i39;
                                        if (V0.isNull(i40)) {
                                        }
                                        if (!V0.isNull(i40)) {
                                        }
                                        i32 = i40;
                                        sport2 = sport;
                                        v76Var = v76Var3;
                                        i35 = i19;
                                        fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                                        uniqueStage = new UniqueStage(i5122222222222, F0722222222222, new Category(i5222222222222, F0822222222222, F0922222222222, sport2, fieldTranslations), F011, F012);
                                        stageSeason = new StageSeason(uniqueStage, str, F0, i502222222222);
                                        Stage stage222222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                                        r31 = i30;
                                        int i53222222222222222 = i46;
                                        stage222222222222222.setStartDateTimestamp(V0.getLong(i53222222222222222));
                                        v76 v76Var4222222222222222 = v76Var;
                                        i46 = i53222222222222222;
                                        int i54222222222222222 = i45;
                                        stage222222222222222.setLastUpdate(V0.getLong(i54222222222222222));
                                        int i55222222222222222 = i44;
                                        i45 = i54222222222222222;
                                        stage222222222222222.setMuted(((int) V0.getLong(i55222222222222222)) == 0);
                                        int i56222222222222222 = i43;
                                        stage222222222222222.setHidden(((int) V0.getLong(i56222222222222222)) == 0);
                                        stage222222222222222.setParentEvent(stageEvent2);
                                        stage222222222222222.setStageSeason(stageSeason);
                                        ArrayList arrayList3222222222222222 = arrayList;
                                        arrayList3222222222222222.add(stage222222222222222);
                                        i43 = i56222222222222222;
                                        arrayList2 = arrayList3222222222222222;
                                        r27 = i26;
                                        r28 = i27;
                                        r13 = i14;
                                        r14 = i15;
                                        r15 = i22;
                                        r9 = i23;
                                        r10 = i24;
                                        r20 = i34;
                                        r19 = i33;
                                        r = i3;
                                        r2 = i4;
                                        r30 = i32;
                                        r23 = i31;
                                        r25 = i20;
                                        r29 = i36;
                                        r24 = i35;
                                        r3 = i16;
                                        r11 = i25;
                                        v76Var3 = v76Var4222222222222222;
                                        i44 = i55222222222222222;
                                        r21 = i12;
                                        r26 = i21;
                                        r5 = i17;
                                        r16 = i8;
                                        r12 = i7;
                                        r22 = i13;
                                        r17 = i9;
                                    }
                                }
                            }
                            i6 = i47;
                            int i572 = (int) V0.getLong(r14);
                            if (V0.isNull(r15)) {
                            }
                            if (V0.isNull(i5)) {
                            }
                            if (V0.isNull(i6)) {
                            }
                            i9 = i6;
                            stageEvent = new StageEvent(i572, F010, valueOf, F02);
                            if (V0.isNull(r18)) {
                            }
                            i14 = r13;
                            i15 = r14;
                            i16 = r3;
                            i17 = i;
                            i18 = r23;
                            i19 = r24;
                            i20 = r25;
                            i21 = r26;
                            i22 = r15;
                            i23 = r9;
                            i24 = r10;
                            i25 = r11;
                            i26 = r27;
                            i27 = r28;
                            i28 = r29;
                            i29 = r30;
                            arrayList = arrayList2;
                            i30 = r31;
                            stageEvent2 = stageEvent;
                            String F0622222222222 = V0.F0(r18);
                            if (V0.isNull(i10)) {
                            }
                            int i5022222222222 = (int) V0.getLong(i11);
                            if (!V0.isNull(i12)) {
                            }
                            i36 = i38;
                            i34 = i11;
                            i39 = i37;
                            str = F0622222222222;
                            int i51222222222222 = (int) V0.getLong(i12);
                            String F07222222222222 = V0.F0(i13);
                            if (!V0.isNull(i18)) {
                            }
                            if (!V0.isNull(i19)) {
                            }
                            int i52222222222222 = (int) V0.getLong(i20);
                            String F08222222222222 = V0.F0(i21);
                            String F09222222222222 = V0.F0(i26);
                            i31 = i18;
                            sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                            i40 = i39;
                            if (V0.isNull(i40)) {
                            }
                            if (!V0.isNull(i40)) {
                            }
                            i32 = i40;
                            sport2 = sport;
                            v76Var = v76Var3;
                            i35 = i19;
                            fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                            uniqueStage = new UniqueStage(i51222222222222, F07222222222222, new Category(i52222222222222, F08222222222222, F09222222222222, sport2, fieldTranslations), F011, F012);
                            stageSeason = new StageSeason(uniqueStage, str, F0, i5022222222222);
                            Stage stage2222222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                            r31 = i30;
                            int i532222222222222222 = i46;
                            stage2222222222222222.setStartDateTimestamp(V0.getLong(i532222222222222222));
                            v76 v76Var42222222222222222 = v76Var;
                            i46 = i532222222222222222;
                            int i542222222222222222 = i45;
                            stage2222222222222222.setLastUpdate(V0.getLong(i542222222222222222));
                            int i552222222222222222 = i44;
                            i45 = i542222222222222222;
                            stage2222222222222222.setMuted(((int) V0.getLong(i552222222222222222)) == 0);
                            int i562222222222222222 = i43;
                            stage2222222222222222.setHidden(((int) V0.getLong(i562222222222222222)) == 0);
                            stage2222222222222222.setParentEvent(stageEvent2);
                            stage2222222222222222.setStageSeason(stageSeason);
                            ArrayList arrayList32222222222222222 = arrayList;
                            arrayList32222222222222222.add(stage2222222222222222);
                            i43 = i562222222222222222;
                            arrayList2 = arrayList32222222222222222;
                            r27 = i26;
                            r28 = i27;
                            r13 = i14;
                            r14 = i15;
                            r15 = i22;
                            r9 = i23;
                            r10 = i24;
                            r20 = i34;
                            r19 = i33;
                            r = i3;
                            r2 = i4;
                            r30 = i32;
                            r23 = i31;
                            r25 = i20;
                            r29 = i36;
                            r24 = i35;
                            r3 = i16;
                            r11 = i25;
                            v76Var3 = v76Var42222222222222222;
                            i44 = i552222222222222222;
                            r21 = i12;
                            r26 = i21;
                            r5 = i17;
                            r16 = i8;
                            r12 = i7;
                            r22 = i13;
                            r17 = i9;
                        }
                        stageWinner = new StageWinner((int) V0.getLong(r12), V0.isNull(r13) ? null : V0.F0(r13));
                        if (V0.isNull(r14)) {
                        }
                        i5 = i48;
                        i6 = i47;
                        int i5722 = (int) V0.getLong(r14);
                        if (V0.isNull(r15)) {
                        }
                        if (V0.isNull(i5)) {
                        }
                        if (V0.isNull(i6)) {
                        }
                        i9 = i6;
                        stageEvent = new StageEvent(i5722, F010, valueOf, F02);
                        if (V0.isNull(r18)) {
                        }
                        i14 = r13;
                        i15 = r14;
                        i16 = r3;
                        i17 = i;
                        i18 = r23;
                        i19 = r24;
                        i20 = r25;
                        i21 = r26;
                        i22 = r15;
                        i23 = r9;
                        i24 = r10;
                        i25 = r11;
                        i26 = r27;
                        i27 = r28;
                        i28 = r29;
                        i29 = r30;
                        arrayList = arrayList2;
                        i30 = r31;
                        stageEvent2 = stageEvent;
                        String F06222222222222 = V0.F0(r18);
                        if (V0.isNull(i10)) {
                        }
                        int i50222222222222 = (int) V0.getLong(i11);
                        if (!V0.isNull(i12)) {
                        }
                        i36 = i38;
                        i34 = i11;
                        i39 = i37;
                        str = F06222222222222;
                        int i512222222222222 = (int) V0.getLong(i12);
                        String F072222222222222 = V0.F0(i13);
                        if (!V0.isNull(i18)) {
                        }
                        if (!V0.isNull(i19)) {
                        }
                        int i522222222222222 = (int) V0.getLong(i20);
                        String F082222222222222 = V0.F0(i21);
                        String F092222222222222 = V0.F0(i26);
                        i31 = i18;
                        sport = new Sport((int) V0.getLong(i27), V0.F0(i36));
                        i40 = i39;
                        if (V0.isNull(i40)) {
                        }
                        if (!V0.isNull(i40)) {
                        }
                        i32 = i40;
                        sport2 = sport;
                        v76Var = v76Var3;
                        i35 = i19;
                        fieldTranslations = new FieldTranslations(v76Var.c.z(F013), v76Var.c.z(!V0.isNull(i30) ? null : V0.F0(i30)));
                        uniqueStage = new UniqueStage(i512222222222222, F072222222222222, new Category(i522222222222222, F082222222222222, F092222222222222, sport2, fieldTranslations), F011, F012);
                        stageSeason = new StageSeason(uniqueStage, str, F0, i50222222222222);
                        Stage stage22222222222222222 = new Stage(F03, b, status, i2, stageWinner, F05);
                        r31 = i30;
                        int i5322222222222222222 = i46;
                        stage22222222222222222.setStartDateTimestamp(V0.getLong(i5322222222222222222));
                        v76 v76Var422222222222222222 = v76Var;
                        i46 = i5322222222222222222;
                        int i5422222222222222222 = i45;
                        stage22222222222222222.setLastUpdate(V0.getLong(i5422222222222222222));
                        int i5522222222222222222 = i44;
                        i45 = i5422222222222222222;
                        stage22222222222222222.setMuted(((int) V0.getLong(i5522222222222222222)) == 0);
                        int i5622222222222222222 = i43;
                        stage22222222222222222.setHidden(((int) V0.getLong(i5622222222222222222)) == 0);
                        stage22222222222222222.setParentEvent(stageEvent2);
                        stage22222222222222222.setStageSeason(stageSeason);
                        ArrayList arrayList322222222222222222 = arrayList;
                        arrayList322222222222222222.add(stage22222222222222222);
                        i43 = i5622222222222222222;
                        arrayList2 = arrayList322222222222222222;
                        r27 = i26;
                        r28 = i27;
                        r13 = i14;
                        r14 = i15;
                        r15 = i22;
                        r9 = i23;
                        r10 = i24;
                        r20 = i34;
                        r19 = i33;
                        r = i3;
                        r2 = i4;
                        r30 = i32;
                        r23 = i31;
                        r25 = i20;
                        r29 = i36;
                        r24 = i35;
                        r3 = i16;
                        r11 = i25;
                        v76Var3 = v76Var422222222222222222;
                        i44 = i5522222222222222222;
                        r21 = i12;
                        r26 = i21;
                        r5 = i17;
                        r16 = i8;
                        r12 = i7;
                        r22 = i13;
                        r17 = i9;
                    }
                    ArrayList arrayList4 = arrayList2;
                    V0.close();
                    return arrayList4;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0(str2);
                try {
                    V02.q(1, j);
                    V02.q(2, j);
                    int i59 = 3;
                    for (ServerType serverType2 : list) {
                        v76Var2.getClass();
                        V02.L(i59, v76.a(serverType2));
                        i59++;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    while (V02.U0()) {
                        arrayList5.add(V02.isNull(0) ? null : V02.F0(0));
                    }
                    V02.close();
                    return arrayList5;
                } catch (Throwable th2) {
                    V02.close();
                    throw th2;
                }
        }
    }
}
