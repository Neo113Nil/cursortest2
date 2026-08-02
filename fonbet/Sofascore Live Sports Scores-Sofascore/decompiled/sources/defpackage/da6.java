package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.database.DbAmericanFootballDownDistance;
import com.sofascore.model.database.DbEvent;
import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbEventScore;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageEvent;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.VarInProgress;
import com.sofascore.model.mvvm.model.WidgetItemRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class da6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ArrayList t;
    public final /* synthetic */ qa6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da6(ArrayList arrayList, qa6 qa6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = arrayList;
        this.u = qa6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        qa6 qa6Var = this.u;
        ArrayList arrayList = this.t;
        switch (i) {
            case 0:
                return new da6(arrayList, qa6Var, rq3Var, 0);
            default:
                return new da6(arrayList, qa6Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((da6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qa6 qa6Var = this.u;
        ArrayList arrayList = this.t;
        final int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (arrayList.isEmpty()) {
                        lm5 lm5Var = lm5.a;
                        lm5Var.getClass();
                        break;
                    } else {
                        final v76 v76Var = qa6Var.a;
                        final ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            w1l.A(arrayList2, ((WidgetItemRef) it.next()).getId());
                        }
                        this.s = 1;
                        v76Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT * FROM events_table WHERE id IN (");
                        pea.m(arrayList2.size(), sb);
                        sb.append(")");
                        final String sb2 = sb.toString();
                        obj = gz8.U(this, v76Var.a, true, true, new Function1() { // from class: f76
                            /* JADX WARN: Removed duplicated region for block: B:102:0x048d  */
                            /* JADX WARN: Removed duplicated region for block: B:105:0x049e  */
                            /* JADX WARN: Removed duplicated region for block: B:108:0x04a0  */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x048f  */
                            /* JADX WARN: Removed duplicated region for block: B:113:0x03cc  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x03db  */
                            /* JADX WARN: Removed duplicated region for block: B:120:0x040c A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:127:0x041e  */
                            /* JADX WARN: Removed duplicated region for block: B:133:0x0439 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:134:0x0425 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:135:0x03e0 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:136:0x03cf A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:137:0x0364 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x0348  */
                            /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
                            /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
                            /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
                            /* JADX WARN: Removed duplicated region for block: B:166:0x0207 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:167:0x01f4 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:168:0x01e7 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x0218 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x035d  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0376 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private final Object a(Object obj2) {
                                ServerType b;
                                int i4;
                                int i5;
                                int i6;
                                Status status;
                                StageWinner stageWinner;
                                int i7;
                                StageEvent stageEvent;
                                int i8;
                                int i9;
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
                                ArrayList arrayList3;
                                int i30;
                                int i31;
                                int i32;
                                int i33;
                                int i34;
                                StageEvent stageEvent2;
                                StageSeason stageSeason;
                                int i35;
                                int i36;
                                Sport sport;
                                Sport sport2;
                                FieldTranslations fieldTranslations;
                                UniqueStage uniqueStage;
                                f76 f76Var = this;
                                ArrayList arrayList4 = arrayList2;
                                glg glgVar = (glg) obj2;
                                glgVar.getClass();
                                nlg V0 = glgVar.V0(sb2);
                                try {
                                    Iterator it2 = arrayList4.iterator();
                                    int i37 = 1;
                                    while (it2.hasNext()) {
                                        V0.q(i37, ((Number) it2.next()).intValue());
                                        i37++;
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
                                    int i38 = r8;
                                    int r15 = w1a.r(V0, "parent_event_description");
                                    int i39 = r7;
                                    int r16 = w1a.r(V0, "parent_event_startTimestamp");
                                    int i40 = r6;
                                    int r17 = w1a.r(V0, "parent_event_flag");
                                    int i41 = r4;
                                    int r18 = w1a.r(V0, "stage_season_description");
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
                                    ArrayList arrayList5 = new ArrayList();
                                    while (V0.U0()) {
                                        String F0 = V0.F0(r);
                                        boolean isNull = V0.isNull(r2);
                                        int i42 = r;
                                        v76 v76Var2 = v76Var;
                                        if (isNull) {
                                            b = null;
                                        } else {
                                            String F02 = V0.F0(r2);
                                            v76Var2.getClass();
                                            b = v76.b(F02);
                                        }
                                        int i43 = (int) V0.getLong(r3);
                                        String F03 = V0.isNull(r5) ? null : V0.F0(r5);
                                        if (V0.isNull(r9) && V0.isNull(r10) && V0.isNull(r11)) {
                                            i4 = i43;
                                            i5 = r2;
                                            i6 = r3;
                                            status = null;
                                        } else {
                                            i4 = i43;
                                            i5 = r2;
                                            i6 = r3;
                                            status = new Status((int) V0.getLong(r9), V0.isNull(r10) ? null : V0.F0(r10), V0.F0(r11));
                                        }
                                        if (V0.isNull(r12) && V0.isNull(r13)) {
                                            stageWinner = null;
                                            if (V0.isNull(r14) && V0.isNull(r15) && V0.isNull(r16) && V0.isNull(r17)) {
                                                i7 = r14;
                                                stageEvent = null;
                                                i8 = r18;
                                                if (V0.isNull(i8)) {
                                                    i9 = r5;
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
                                                                i9 = r5;
                                                                i13 = r22;
                                                                if (V0.isNull(i13)) {
                                                                    i14 = r17;
                                                                    i18 = r23;
                                                                    if (V0.isNull(i18)) {
                                                                        i15 = r16;
                                                                        i19 = r24;
                                                                        if (V0.isNull(i19)) {
                                                                            i16 = r15;
                                                                            i20 = r25;
                                                                            if (V0.isNull(i20)) {
                                                                                i17 = r9;
                                                                                i21 = r26;
                                                                                if (V0.isNull(i21)) {
                                                                                    i22 = r10;
                                                                                    i26 = r27;
                                                                                    if (V0.isNull(i26)) {
                                                                                        i23 = r11;
                                                                                        i27 = r28;
                                                                                        if (V0.isNull(i27)) {
                                                                                            i24 = r12;
                                                                                            i28 = r29;
                                                                                            if (V0.isNull(i28)) {
                                                                                                i25 = r13;
                                                                                                i29 = r30;
                                                                                                if (V0.isNull(i29)) {
                                                                                                    arrayList3 = arrayList5;
                                                                                                    i30 = r31;
                                                                                                    if (V0.isNull(i30)) {
                                                                                                        i33 = i8;
                                                                                                        i34 = i10;
                                                                                                        stageEvent2 = stageEvent;
                                                                                                        i31 = i11;
                                                                                                        i32 = i12;
                                                                                                        stageSeason = null;
                                                                                                        Stage stage = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                                        int i44 = i41;
                                                                                                        stage.setStartDateTimestamp(V0.getLong(i44));
                                                                                                        int i45 = i40;
                                                                                                        int i46 = i30;
                                                                                                        stage.setLastUpdate(V0.getLong(i45));
                                                                                                        i41 = i44;
                                                                                                        int i47 = i39;
                                                                                                        stage.setMuted(((int) V0.getLong(i47)) != 0);
                                                                                                        i39 = i47;
                                                                                                        int i48 = i38;
                                                                                                        stage.setHidden(((int) V0.getLong(i48)) != 0);
                                                                                                        stage.setParentEvent(stageEvent2);
                                                                                                        stage.setStageSeason(stageSeason);
                                                                                                        ArrayList arrayList6 = arrayList3;
                                                                                                        arrayList6.add(stage);
                                                                                                        int i49 = i17;
                                                                                                        r22 = i13;
                                                                                                        r5 = i9;
                                                                                                        r18 = i33;
                                                                                                        r30 = i29;
                                                                                                        r13 = i25;
                                                                                                        r26 = i21;
                                                                                                        r9 = i49;
                                                                                                        f76Var = this;
                                                                                                        i38 = i48;
                                                                                                        r27 = i26;
                                                                                                        r28 = i27;
                                                                                                        r10 = i22;
                                                                                                        r11 = i23;
                                                                                                        r2 = i5;
                                                                                                        r3 = i6;
                                                                                                        r14 = i7;
                                                                                                        r23 = i18;
                                                                                                        r24 = i19;
                                                                                                        r17 = i14;
                                                                                                        r16 = i15;
                                                                                                        r19 = i34;
                                                                                                        r20 = i31;
                                                                                                        r29 = i28;
                                                                                                        r12 = i24;
                                                                                                        r25 = i20;
                                                                                                        r15 = i16;
                                                                                                        r21 = i32;
                                                                                                        r31 = i46;
                                                                                                        i40 = i45;
                                                                                                        arrayList5 = arrayList6;
                                                                                                        r = i42;
                                                                                                    }
                                                                                                    stageEvent2 = stageEvent;
                                                                                                    String F04 = V0.F0(i8);
                                                                                                    String F05 = V0.isNull(i10) ? null : V0.F0(i10);
                                                                                                    i33 = i8;
                                                                                                    i34 = i10;
                                                                                                    i35 = (int) V0.getLong(i11);
                                                                                                    if (!V0.isNull(i12) && V0.isNull(i13) && V0.isNull(i18) && V0.isNull(i19) && V0.isNull(i20) && V0.isNull(i21) && V0.isNull(i26) && V0.isNull(i27) && V0.isNull(i28) && V0.isNull(i29) && V0.isNull(i30)) {
                                                                                                        i36 = i35;
                                                                                                        i31 = i11;
                                                                                                        uniqueStage = null;
                                                                                                    } else {
                                                                                                        i36 = i35;
                                                                                                        int i50 = (int) V0.getLong(i12);
                                                                                                        String F06 = V0.F0(i13);
                                                                                                        String F07 = V0.isNull(i18) ? null : V0.F0(i18);
                                                                                                        String F08 = V0.isNull(i19) ? null : V0.F0(i19);
                                                                                                        int i51 = (int) V0.getLong(i20);
                                                                                                        String F09 = V0.F0(i21);
                                                                                                        String F010 = V0.F0(i26);
                                                                                                        i31 = i11;
                                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                                        if (V0.isNull(i29) && V0.isNull(i30)) {
                                                                                                            sport2 = sport;
                                                                                                            fieldTranslations = null;
                                                                                                            uniqueStage = new UniqueStage(i50, F06, new Category(i51, F09, F010, sport2, fieldTranslations), F07, F08);
                                                                                                        }
                                                                                                        sport2 = sport;
                                                                                                        fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                                        uniqueStage = new UniqueStage(i50, F06, new Category(i51, F09, F010, sport2, fieldTranslations), F07, F08);
                                                                                                    }
                                                                                                    String str = F05;
                                                                                                    i32 = i12;
                                                                                                    stageSeason = new StageSeason(uniqueStage, F04, str, i36);
                                                                                                    Stage stage2 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                                    int i442 = i41;
                                                                                                    stage2.setStartDateTimestamp(V0.getLong(i442));
                                                                                                    int i452 = i40;
                                                                                                    int i462 = i30;
                                                                                                    stage2.setLastUpdate(V0.getLong(i452));
                                                                                                    i41 = i442;
                                                                                                    int i472 = i39;
                                                                                                    stage2.setMuted(((int) V0.getLong(i472)) != 0);
                                                                                                    i39 = i472;
                                                                                                    int i482 = i38;
                                                                                                    stage2.setHidden(((int) V0.getLong(i482)) != 0);
                                                                                                    stage2.setParentEvent(stageEvent2);
                                                                                                    stage2.setStageSeason(stageSeason);
                                                                                                    ArrayList arrayList62 = arrayList3;
                                                                                                    arrayList62.add(stage2);
                                                                                                    int i492 = i17;
                                                                                                    r22 = i13;
                                                                                                    r5 = i9;
                                                                                                    r18 = i33;
                                                                                                    r30 = i29;
                                                                                                    r13 = i25;
                                                                                                    r26 = i21;
                                                                                                    r9 = i492;
                                                                                                    f76Var = this;
                                                                                                    i38 = i482;
                                                                                                    r27 = i26;
                                                                                                    r28 = i27;
                                                                                                    r10 = i22;
                                                                                                    r11 = i23;
                                                                                                    r2 = i5;
                                                                                                    r3 = i6;
                                                                                                    r14 = i7;
                                                                                                    r23 = i18;
                                                                                                    r24 = i19;
                                                                                                    r17 = i14;
                                                                                                    r16 = i15;
                                                                                                    r19 = i34;
                                                                                                    r20 = i31;
                                                                                                    r29 = i28;
                                                                                                    r12 = i24;
                                                                                                    r25 = i20;
                                                                                                    r15 = i16;
                                                                                                    r21 = i32;
                                                                                                    r31 = i462;
                                                                                                    i40 = i452;
                                                                                                    arrayList5 = arrayList62;
                                                                                                    r = i42;
                                                                                                }
                                                                                                arrayList3 = arrayList5;
                                                                                                i30 = r31;
                                                                                                stageEvent2 = stageEvent;
                                                                                                String F042 = V0.F0(i8);
                                                                                                if (V0.isNull(i10)) {
                                                                                                }
                                                                                                i33 = i8;
                                                                                                i34 = i10;
                                                                                                i35 = (int) V0.getLong(i11);
                                                                                                if (!V0.isNull(i12)) {
                                                                                                }
                                                                                                i36 = i35;
                                                                                                int i502 = (int) V0.getLong(i12);
                                                                                                String F062 = V0.F0(i13);
                                                                                                if (V0.isNull(i18)) {
                                                                                                }
                                                                                                if (V0.isNull(i19)) {
                                                                                                }
                                                                                                int i512 = (int) V0.getLong(i20);
                                                                                                String F092 = V0.F0(i21);
                                                                                                String F0102 = V0.F0(i26);
                                                                                                i31 = i11;
                                                                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                                if (V0.isNull(i29)) {
                                                                                                    sport2 = sport;
                                                                                                    fieldTranslations = null;
                                                                                                    uniqueStage = new UniqueStage(i502, F062, new Category(i512, F092, F0102, sport2, fieldTranslations), F07, F08);
                                                                                                    String str2 = F05;
                                                                                                    i32 = i12;
                                                                                                    stageSeason = new StageSeason(uniqueStage, F042, str2, i36);
                                                                                                    Stage stage22 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                                    int i4422 = i41;
                                                                                                    stage22.setStartDateTimestamp(V0.getLong(i4422));
                                                                                                    int i4522 = i40;
                                                                                                    int i4622 = i30;
                                                                                                    stage22.setLastUpdate(V0.getLong(i4522));
                                                                                                    i41 = i4422;
                                                                                                    int i4722 = i39;
                                                                                                    stage22.setMuted(((int) V0.getLong(i4722)) != 0);
                                                                                                    i39 = i4722;
                                                                                                    int i4822 = i38;
                                                                                                    stage22.setHidden(((int) V0.getLong(i4822)) != 0);
                                                                                                    stage22.setParentEvent(stageEvent2);
                                                                                                    stage22.setStageSeason(stageSeason);
                                                                                                    ArrayList arrayList622 = arrayList3;
                                                                                                    arrayList622.add(stage22);
                                                                                                    int i4922 = i17;
                                                                                                    r22 = i13;
                                                                                                    r5 = i9;
                                                                                                    r18 = i33;
                                                                                                    r30 = i29;
                                                                                                    r13 = i25;
                                                                                                    r26 = i21;
                                                                                                    r9 = i4922;
                                                                                                    f76Var = this;
                                                                                                    i38 = i4822;
                                                                                                    r27 = i26;
                                                                                                    r28 = i27;
                                                                                                    r10 = i22;
                                                                                                    r11 = i23;
                                                                                                    r2 = i5;
                                                                                                    r3 = i6;
                                                                                                    r14 = i7;
                                                                                                    r23 = i18;
                                                                                                    r24 = i19;
                                                                                                    r17 = i14;
                                                                                                    r16 = i15;
                                                                                                    r19 = i34;
                                                                                                    r20 = i31;
                                                                                                    r29 = i28;
                                                                                                    r12 = i24;
                                                                                                    r25 = i20;
                                                                                                    r15 = i16;
                                                                                                    r21 = i32;
                                                                                                    r31 = i4622;
                                                                                                    i40 = i4522;
                                                                                                    arrayList5 = arrayList622;
                                                                                                    r = i42;
                                                                                                }
                                                                                                sport2 = sport;
                                                                                                fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                                uniqueStage = new UniqueStage(i502, F062, new Category(i512, F092, F0102, sport2, fieldTranslations), F07, F08);
                                                                                                String str22 = F05;
                                                                                                i32 = i12;
                                                                                                stageSeason = new StageSeason(uniqueStage, F042, str22, i36);
                                                                                                Stage stage222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                                int i44222 = i41;
                                                                                                stage222.setStartDateTimestamp(V0.getLong(i44222));
                                                                                                int i45222 = i40;
                                                                                                int i46222 = i30;
                                                                                                stage222.setLastUpdate(V0.getLong(i45222));
                                                                                                i41 = i44222;
                                                                                                int i47222 = i39;
                                                                                                stage222.setMuted(((int) V0.getLong(i47222)) != 0);
                                                                                                i39 = i47222;
                                                                                                int i48222 = i38;
                                                                                                stage222.setHidden(((int) V0.getLong(i48222)) != 0);
                                                                                                stage222.setParentEvent(stageEvent2);
                                                                                                stage222.setStageSeason(stageSeason);
                                                                                                ArrayList arrayList6222 = arrayList3;
                                                                                                arrayList6222.add(stage222);
                                                                                                int i49222 = i17;
                                                                                                r22 = i13;
                                                                                                r5 = i9;
                                                                                                r18 = i33;
                                                                                                r30 = i29;
                                                                                                r13 = i25;
                                                                                                r26 = i21;
                                                                                                r9 = i49222;
                                                                                                f76Var = this;
                                                                                                i38 = i48222;
                                                                                                r27 = i26;
                                                                                                r28 = i27;
                                                                                                r10 = i22;
                                                                                                r11 = i23;
                                                                                                r2 = i5;
                                                                                                r3 = i6;
                                                                                                r14 = i7;
                                                                                                r23 = i18;
                                                                                                r24 = i19;
                                                                                                r17 = i14;
                                                                                                r16 = i15;
                                                                                                r19 = i34;
                                                                                                r20 = i31;
                                                                                                r29 = i28;
                                                                                                r12 = i24;
                                                                                                r25 = i20;
                                                                                                r15 = i16;
                                                                                                r21 = i32;
                                                                                                r31 = i46222;
                                                                                                i40 = i45222;
                                                                                                arrayList5 = arrayList6222;
                                                                                                r = i42;
                                                                                            }
                                                                                            arrayList3 = arrayList5;
                                                                                            i25 = r13;
                                                                                            i29 = r30;
                                                                                            i30 = r31;
                                                                                            stageEvent2 = stageEvent;
                                                                                            String F0422 = V0.F0(i8);
                                                                                            if (V0.isNull(i10)) {
                                                                                            }
                                                                                            i33 = i8;
                                                                                            i34 = i10;
                                                                                            i35 = (int) V0.getLong(i11);
                                                                                            if (!V0.isNull(i12)) {
                                                                                            }
                                                                                            i36 = i35;
                                                                                            int i5022 = (int) V0.getLong(i12);
                                                                                            String F0622 = V0.F0(i13);
                                                                                            if (V0.isNull(i18)) {
                                                                                            }
                                                                                            if (V0.isNull(i19)) {
                                                                                            }
                                                                                            int i5122 = (int) V0.getLong(i20);
                                                                                            String F0922 = V0.F0(i21);
                                                                                            String F01022 = V0.F0(i26);
                                                                                            i31 = i11;
                                                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                            if (V0.isNull(i29)) {
                                                                                            }
                                                                                            sport2 = sport;
                                                                                            fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                            uniqueStage = new UniqueStage(i5022, F0622, new Category(i5122, F0922, F01022, sport2, fieldTranslations), F07, F08);
                                                                                            String str222 = F05;
                                                                                            i32 = i12;
                                                                                            stageSeason = new StageSeason(uniqueStage, F0422, str222, i36);
                                                                                            Stage stage2222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                            int i442222 = i41;
                                                                                            stage2222.setStartDateTimestamp(V0.getLong(i442222));
                                                                                            int i452222 = i40;
                                                                                            int i462222 = i30;
                                                                                            stage2222.setLastUpdate(V0.getLong(i452222));
                                                                                            i41 = i442222;
                                                                                            int i472222 = i39;
                                                                                            stage2222.setMuted(((int) V0.getLong(i472222)) != 0);
                                                                                            i39 = i472222;
                                                                                            int i482222 = i38;
                                                                                            stage2222.setHidden(((int) V0.getLong(i482222)) != 0);
                                                                                            stage2222.setParentEvent(stageEvent2);
                                                                                            stage2222.setStageSeason(stageSeason);
                                                                                            ArrayList arrayList62222 = arrayList3;
                                                                                            arrayList62222.add(stage2222);
                                                                                            int i492222 = i17;
                                                                                            r22 = i13;
                                                                                            r5 = i9;
                                                                                            r18 = i33;
                                                                                            r30 = i29;
                                                                                            r13 = i25;
                                                                                            r26 = i21;
                                                                                            r9 = i492222;
                                                                                            f76Var = this;
                                                                                            i38 = i482222;
                                                                                            r27 = i26;
                                                                                            r28 = i27;
                                                                                            r10 = i22;
                                                                                            r11 = i23;
                                                                                            r2 = i5;
                                                                                            r3 = i6;
                                                                                            r14 = i7;
                                                                                            r23 = i18;
                                                                                            r24 = i19;
                                                                                            r17 = i14;
                                                                                            r16 = i15;
                                                                                            r19 = i34;
                                                                                            r20 = i31;
                                                                                            r29 = i28;
                                                                                            r12 = i24;
                                                                                            r25 = i20;
                                                                                            r15 = i16;
                                                                                            r21 = i32;
                                                                                            r31 = i462222;
                                                                                            i40 = i452222;
                                                                                            arrayList5 = arrayList62222;
                                                                                            r = i42;
                                                                                        }
                                                                                        arrayList3 = arrayList5;
                                                                                        i24 = r12;
                                                                                        i25 = r13;
                                                                                        i28 = r29;
                                                                                        i29 = r30;
                                                                                        i30 = r31;
                                                                                        stageEvent2 = stageEvent;
                                                                                        String F04222 = V0.F0(i8);
                                                                                        if (V0.isNull(i10)) {
                                                                                        }
                                                                                        i33 = i8;
                                                                                        i34 = i10;
                                                                                        i35 = (int) V0.getLong(i11);
                                                                                        if (!V0.isNull(i12)) {
                                                                                        }
                                                                                        i36 = i35;
                                                                                        int i50222 = (int) V0.getLong(i12);
                                                                                        String F06222 = V0.F0(i13);
                                                                                        if (V0.isNull(i18)) {
                                                                                        }
                                                                                        if (V0.isNull(i19)) {
                                                                                        }
                                                                                        int i51222 = (int) V0.getLong(i20);
                                                                                        String F09222 = V0.F0(i21);
                                                                                        String F010222 = V0.F0(i26);
                                                                                        i31 = i11;
                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                        if (V0.isNull(i29)) {
                                                                                        }
                                                                                        sport2 = sport;
                                                                                        fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                        uniqueStage = new UniqueStage(i50222, F06222, new Category(i51222, F09222, F010222, sport2, fieldTranslations), F07, F08);
                                                                                        String str2222 = F05;
                                                                                        i32 = i12;
                                                                                        stageSeason = new StageSeason(uniqueStage, F04222, str2222, i36);
                                                                                        Stage stage22222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                        int i4422222 = i41;
                                                                                        stage22222.setStartDateTimestamp(V0.getLong(i4422222));
                                                                                        int i4522222 = i40;
                                                                                        int i4622222 = i30;
                                                                                        stage22222.setLastUpdate(V0.getLong(i4522222));
                                                                                        i41 = i4422222;
                                                                                        int i4722222 = i39;
                                                                                        stage22222.setMuted(((int) V0.getLong(i4722222)) != 0);
                                                                                        i39 = i4722222;
                                                                                        int i4822222 = i38;
                                                                                        stage22222.setHidden(((int) V0.getLong(i4822222)) != 0);
                                                                                        stage22222.setParentEvent(stageEvent2);
                                                                                        stage22222.setStageSeason(stageSeason);
                                                                                        ArrayList arrayList622222 = arrayList3;
                                                                                        arrayList622222.add(stage22222);
                                                                                        int i4922222 = i17;
                                                                                        r22 = i13;
                                                                                        r5 = i9;
                                                                                        r18 = i33;
                                                                                        r30 = i29;
                                                                                        r13 = i25;
                                                                                        r26 = i21;
                                                                                        r9 = i4922222;
                                                                                        f76Var = this;
                                                                                        i38 = i4822222;
                                                                                        r27 = i26;
                                                                                        r28 = i27;
                                                                                        r10 = i22;
                                                                                        r11 = i23;
                                                                                        r2 = i5;
                                                                                        r3 = i6;
                                                                                        r14 = i7;
                                                                                        r23 = i18;
                                                                                        r24 = i19;
                                                                                        r17 = i14;
                                                                                        r16 = i15;
                                                                                        r19 = i34;
                                                                                        r20 = i31;
                                                                                        r29 = i28;
                                                                                        r12 = i24;
                                                                                        r25 = i20;
                                                                                        r15 = i16;
                                                                                        r21 = i32;
                                                                                        r31 = i4622222;
                                                                                        i40 = i4522222;
                                                                                        arrayList5 = arrayList622222;
                                                                                        r = i42;
                                                                                    }
                                                                                    arrayList3 = arrayList5;
                                                                                    i23 = r11;
                                                                                    i24 = r12;
                                                                                    i25 = r13;
                                                                                    i27 = r28;
                                                                                    i28 = r29;
                                                                                    i29 = r30;
                                                                                    i30 = r31;
                                                                                    stageEvent2 = stageEvent;
                                                                                    String F042222 = V0.F0(i8);
                                                                                    if (V0.isNull(i10)) {
                                                                                    }
                                                                                    i33 = i8;
                                                                                    i34 = i10;
                                                                                    i35 = (int) V0.getLong(i11);
                                                                                    if (!V0.isNull(i12)) {
                                                                                    }
                                                                                    i36 = i35;
                                                                                    int i502222 = (int) V0.getLong(i12);
                                                                                    String F062222 = V0.F0(i13);
                                                                                    if (V0.isNull(i18)) {
                                                                                    }
                                                                                    if (V0.isNull(i19)) {
                                                                                    }
                                                                                    int i512222 = (int) V0.getLong(i20);
                                                                                    String F092222 = V0.F0(i21);
                                                                                    String F0102222 = V0.F0(i26);
                                                                                    i31 = i11;
                                                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                    if (V0.isNull(i29)) {
                                                                                    }
                                                                                    sport2 = sport;
                                                                                    fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                    uniqueStage = new UniqueStage(i502222, F062222, new Category(i512222, F092222, F0102222, sport2, fieldTranslations), F07, F08);
                                                                                    String str22222 = F05;
                                                                                    i32 = i12;
                                                                                    stageSeason = new StageSeason(uniqueStage, F042222, str22222, i36);
                                                                                    Stage stage222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                    int i44222222 = i41;
                                                                                    stage222222.setStartDateTimestamp(V0.getLong(i44222222));
                                                                                    int i45222222 = i40;
                                                                                    int i46222222 = i30;
                                                                                    stage222222.setLastUpdate(V0.getLong(i45222222));
                                                                                    i41 = i44222222;
                                                                                    int i47222222 = i39;
                                                                                    stage222222.setMuted(((int) V0.getLong(i47222222)) != 0);
                                                                                    i39 = i47222222;
                                                                                    int i48222222 = i38;
                                                                                    stage222222.setHidden(((int) V0.getLong(i48222222)) != 0);
                                                                                    stage222222.setParentEvent(stageEvent2);
                                                                                    stage222222.setStageSeason(stageSeason);
                                                                                    ArrayList arrayList6222222 = arrayList3;
                                                                                    arrayList6222222.add(stage222222);
                                                                                    int i49222222 = i17;
                                                                                    r22 = i13;
                                                                                    r5 = i9;
                                                                                    r18 = i33;
                                                                                    r30 = i29;
                                                                                    r13 = i25;
                                                                                    r26 = i21;
                                                                                    r9 = i49222222;
                                                                                    f76Var = this;
                                                                                    i38 = i48222222;
                                                                                    r27 = i26;
                                                                                    r28 = i27;
                                                                                    r10 = i22;
                                                                                    r11 = i23;
                                                                                    r2 = i5;
                                                                                    r3 = i6;
                                                                                    r14 = i7;
                                                                                    r23 = i18;
                                                                                    r24 = i19;
                                                                                    r17 = i14;
                                                                                    r16 = i15;
                                                                                    r19 = i34;
                                                                                    r20 = i31;
                                                                                    r29 = i28;
                                                                                    r12 = i24;
                                                                                    r25 = i20;
                                                                                    r15 = i16;
                                                                                    r21 = i32;
                                                                                    r31 = i46222222;
                                                                                    i40 = i45222222;
                                                                                    arrayList5 = arrayList6222222;
                                                                                    r = i42;
                                                                                }
                                                                                i22 = r10;
                                                                                i23 = r11;
                                                                                i24 = r12;
                                                                                i25 = r13;
                                                                                i26 = r27;
                                                                                i27 = r28;
                                                                                i28 = r29;
                                                                                i29 = r30;
                                                                                arrayList3 = arrayList5;
                                                                                i30 = r31;
                                                                                stageEvent2 = stageEvent;
                                                                                String F0422222 = V0.F0(i8);
                                                                                if (V0.isNull(i10)) {
                                                                                }
                                                                                i33 = i8;
                                                                                i34 = i10;
                                                                                i35 = (int) V0.getLong(i11);
                                                                                if (!V0.isNull(i12)) {
                                                                                }
                                                                                i36 = i35;
                                                                                int i5022222 = (int) V0.getLong(i12);
                                                                                String F0622222 = V0.F0(i13);
                                                                                if (V0.isNull(i18)) {
                                                                                }
                                                                                if (V0.isNull(i19)) {
                                                                                }
                                                                                int i5122222 = (int) V0.getLong(i20);
                                                                                String F0922222 = V0.F0(i21);
                                                                                String F01022222 = V0.F0(i26);
                                                                                i31 = i11;
                                                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                if (V0.isNull(i29)) {
                                                                                }
                                                                                sport2 = sport;
                                                                                fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                uniqueStage = new UniqueStage(i5022222, F0622222, new Category(i5122222, F0922222, F01022222, sport2, fieldTranslations), F07, F08);
                                                                                String str222222 = F05;
                                                                                i32 = i12;
                                                                                stageSeason = new StageSeason(uniqueStage, F0422222, str222222, i36);
                                                                                Stage stage2222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                                                int i442222222 = i41;
                                                                                stage2222222.setStartDateTimestamp(V0.getLong(i442222222));
                                                                                int i452222222 = i40;
                                                                                int i462222222 = i30;
                                                                                stage2222222.setLastUpdate(V0.getLong(i452222222));
                                                                                i41 = i442222222;
                                                                                int i472222222 = i39;
                                                                                stage2222222.setMuted(((int) V0.getLong(i472222222)) != 0);
                                                                                i39 = i472222222;
                                                                                int i482222222 = i38;
                                                                                stage2222222.setHidden(((int) V0.getLong(i482222222)) != 0);
                                                                                stage2222222.setParentEvent(stageEvent2);
                                                                                stage2222222.setStageSeason(stageSeason);
                                                                                ArrayList arrayList62222222 = arrayList3;
                                                                                arrayList62222222.add(stage2222222);
                                                                                int i492222222 = i17;
                                                                                r22 = i13;
                                                                                r5 = i9;
                                                                                r18 = i33;
                                                                                r30 = i29;
                                                                                r13 = i25;
                                                                                r26 = i21;
                                                                                r9 = i492222222;
                                                                                f76Var = this;
                                                                                i38 = i482222222;
                                                                                r27 = i26;
                                                                                r28 = i27;
                                                                                r10 = i22;
                                                                                r11 = i23;
                                                                                r2 = i5;
                                                                                r3 = i6;
                                                                                r14 = i7;
                                                                                r23 = i18;
                                                                                r24 = i19;
                                                                                r17 = i14;
                                                                                r16 = i15;
                                                                                r19 = i34;
                                                                                r20 = i31;
                                                                                r29 = i28;
                                                                                r12 = i24;
                                                                                r25 = i20;
                                                                                r15 = i16;
                                                                                r21 = i32;
                                                                                r31 = i462222222;
                                                                                i40 = i452222222;
                                                                                arrayList5 = arrayList62222222;
                                                                                r = i42;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i9 = r5;
                                                                i14 = r17;
                                                                i15 = r16;
                                                                i16 = r15;
                                                                i13 = r22;
                                                                i18 = r23;
                                                                i19 = r24;
                                                                i20 = r25;
                                                            }
                                                            i17 = r9;
                                                            i22 = r10;
                                                            i23 = r11;
                                                            i24 = r12;
                                                            i21 = r26;
                                                            i26 = r27;
                                                            i27 = r28;
                                                            i28 = r29;
                                                            arrayList3 = arrayList5;
                                                            i25 = r13;
                                                            i29 = r30;
                                                            i30 = r31;
                                                            stageEvent2 = stageEvent;
                                                            String F04222222 = V0.F0(i8);
                                                            if (V0.isNull(i10)) {
                                                            }
                                                            i33 = i8;
                                                            i34 = i10;
                                                            i35 = (int) V0.getLong(i11);
                                                            if (!V0.isNull(i12)) {
                                                            }
                                                            i36 = i35;
                                                            int i50222222 = (int) V0.getLong(i12);
                                                            String F06222222 = V0.F0(i13);
                                                            if (V0.isNull(i18)) {
                                                            }
                                                            if (V0.isNull(i19)) {
                                                            }
                                                            int i51222222 = (int) V0.getLong(i20);
                                                            String F09222222 = V0.F0(i21);
                                                            String F010222222 = V0.F0(i26);
                                                            i31 = i11;
                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                            if (V0.isNull(i29)) {
                                                            }
                                                            sport2 = sport;
                                                            fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                            uniqueStage = new UniqueStage(i50222222, F06222222, new Category(i51222222, F09222222, F010222222, sport2, fieldTranslations), F07, F08);
                                                            String str2222222 = F05;
                                                            i32 = i12;
                                                            stageSeason = new StageSeason(uniqueStage, F04222222, str2222222, i36);
                                                            Stage stage22222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                            int i4422222222 = i41;
                                                            stage22222222.setStartDateTimestamp(V0.getLong(i4422222222));
                                                            int i4522222222 = i40;
                                                            int i4622222222 = i30;
                                                            stage22222222.setLastUpdate(V0.getLong(i4522222222));
                                                            i41 = i4422222222;
                                                            int i4722222222 = i39;
                                                            stage22222222.setMuted(((int) V0.getLong(i4722222222)) != 0);
                                                            i39 = i4722222222;
                                                            int i4822222222 = i38;
                                                            stage22222222.setHidden(((int) V0.getLong(i4822222222)) != 0);
                                                            stage22222222.setParentEvent(stageEvent2);
                                                            stage22222222.setStageSeason(stageSeason);
                                                            ArrayList arrayList622222222 = arrayList3;
                                                            arrayList622222222.add(stage22222222);
                                                            int i4922222222 = i17;
                                                            r22 = i13;
                                                            r5 = i9;
                                                            r18 = i33;
                                                            r30 = i29;
                                                            r13 = i25;
                                                            r26 = i21;
                                                            r9 = i4922222222;
                                                            f76Var = this;
                                                            i38 = i4822222222;
                                                            r27 = i26;
                                                            r28 = i27;
                                                            r10 = i22;
                                                            r11 = i23;
                                                            r2 = i5;
                                                            r3 = i6;
                                                            r14 = i7;
                                                            r23 = i18;
                                                            r24 = i19;
                                                            r17 = i14;
                                                            r16 = i15;
                                                            r19 = i34;
                                                            r20 = i31;
                                                            r29 = i28;
                                                            r12 = i24;
                                                            r25 = i20;
                                                            r15 = i16;
                                                            r21 = i32;
                                                            r31 = i4622222222;
                                                            i40 = i4522222222;
                                                            arrayList5 = arrayList622222222;
                                                            r = i42;
                                                        } else {
                                                            i9 = r5;
                                                            i14 = r17;
                                                            i15 = r16;
                                                            i12 = r21;
                                                            i13 = r22;
                                                            i18 = r23;
                                                            i19 = r24;
                                                        }
                                                        i16 = r15;
                                                        i17 = r9;
                                                        i22 = r10;
                                                        i23 = r11;
                                                        i20 = r25;
                                                        i21 = r26;
                                                        i26 = r27;
                                                        i27 = r28;
                                                        arrayList3 = arrayList5;
                                                        i24 = r12;
                                                        i25 = r13;
                                                        i28 = r29;
                                                        i29 = r30;
                                                        i30 = r31;
                                                        stageEvent2 = stageEvent;
                                                        String F042222222 = V0.F0(i8);
                                                        if (V0.isNull(i10)) {
                                                        }
                                                        i33 = i8;
                                                        i34 = i10;
                                                        i35 = (int) V0.getLong(i11);
                                                        if (!V0.isNull(i12)) {
                                                        }
                                                        i36 = i35;
                                                        int i502222222 = (int) V0.getLong(i12);
                                                        String F062222222 = V0.F0(i13);
                                                        if (V0.isNull(i18)) {
                                                        }
                                                        if (V0.isNull(i19)) {
                                                        }
                                                        int i512222222 = (int) V0.getLong(i20);
                                                        String F092222222 = V0.F0(i21);
                                                        String F0102222222 = V0.F0(i26);
                                                        i31 = i11;
                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                        if (V0.isNull(i29)) {
                                                        }
                                                        sport2 = sport;
                                                        fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                        uniqueStage = new UniqueStage(i502222222, F062222222, new Category(i512222222, F092222222, F0102222222, sport2, fieldTranslations), F07, F08);
                                                        String str22222222 = F05;
                                                        i32 = i12;
                                                        stageSeason = new StageSeason(uniqueStage, F042222222, str22222222, i36);
                                                        Stage stage222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                        int i44222222222 = i41;
                                                        stage222222222.setStartDateTimestamp(V0.getLong(i44222222222));
                                                        int i45222222222 = i40;
                                                        int i46222222222 = i30;
                                                        stage222222222.setLastUpdate(V0.getLong(i45222222222));
                                                        i41 = i44222222222;
                                                        int i47222222222 = i39;
                                                        stage222222222.setMuted(((int) V0.getLong(i47222222222)) != 0);
                                                        i39 = i47222222222;
                                                        int i48222222222 = i38;
                                                        stage222222222.setHidden(((int) V0.getLong(i48222222222)) != 0);
                                                        stage222222222.setParentEvent(stageEvent2);
                                                        stage222222222.setStageSeason(stageSeason);
                                                        ArrayList arrayList6222222222 = arrayList3;
                                                        arrayList6222222222.add(stage222222222);
                                                        int i49222222222 = i17;
                                                        r22 = i13;
                                                        r5 = i9;
                                                        r18 = i33;
                                                        r30 = i29;
                                                        r13 = i25;
                                                        r26 = i21;
                                                        r9 = i49222222222;
                                                        f76Var = this;
                                                        i38 = i48222222222;
                                                        r27 = i26;
                                                        r28 = i27;
                                                        r10 = i22;
                                                        r11 = i23;
                                                        r2 = i5;
                                                        r3 = i6;
                                                        r14 = i7;
                                                        r23 = i18;
                                                        r24 = i19;
                                                        r17 = i14;
                                                        r16 = i15;
                                                        r19 = i34;
                                                        r20 = i31;
                                                        r29 = i28;
                                                        r12 = i24;
                                                        r25 = i20;
                                                        r15 = i16;
                                                        r21 = i32;
                                                        r31 = i46222222222;
                                                        i40 = i45222222222;
                                                        arrayList5 = arrayList6222222222;
                                                        r = i42;
                                                    } else {
                                                        i9 = r5;
                                                        i14 = r17;
                                                        i11 = r20;
                                                        i12 = r21;
                                                        i13 = r22;
                                                        i18 = r23;
                                                    }
                                                    i15 = r16;
                                                    i16 = r15;
                                                    i17 = r9;
                                                    i22 = r10;
                                                    i19 = r24;
                                                    i20 = r25;
                                                    i21 = r26;
                                                    i26 = r27;
                                                    arrayList3 = arrayList5;
                                                    i23 = r11;
                                                    i24 = r12;
                                                    i25 = r13;
                                                    i27 = r28;
                                                    i28 = r29;
                                                    i29 = r30;
                                                    i30 = r31;
                                                    stageEvent2 = stageEvent;
                                                    String F0422222222 = V0.F0(i8);
                                                    if (V0.isNull(i10)) {
                                                    }
                                                    i33 = i8;
                                                    i34 = i10;
                                                    i35 = (int) V0.getLong(i11);
                                                    if (!V0.isNull(i12)) {
                                                    }
                                                    i36 = i35;
                                                    int i5022222222 = (int) V0.getLong(i12);
                                                    String F0622222222 = V0.F0(i13);
                                                    if (V0.isNull(i18)) {
                                                    }
                                                    if (V0.isNull(i19)) {
                                                    }
                                                    int i5122222222 = (int) V0.getLong(i20);
                                                    String F0922222222 = V0.F0(i21);
                                                    String F01022222222 = V0.F0(i26);
                                                    i31 = i11;
                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                    if (V0.isNull(i29)) {
                                                    }
                                                    sport2 = sport;
                                                    fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                    uniqueStage = new UniqueStage(i5022222222, F0622222222, new Category(i5122222222, F0922222222, F01022222222, sport2, fieldTranslations), F07, F08);
                                                    String str222222222 = F05;
                                                    i32 = i12;
                                                    stageSeason = new StageSeason(uniqueStage, F0422222222, str222222222, i36);
                                                    Stage stage2222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                    int i442222222222 = i41;
                                                    stage2222222222.setStartDateTimestamp(V0.getLong(i442222222222));
                                                    int i452222222222 = i40;
                                                    int i462222222222 = i30;
                                                    stage2222222222.setLastUpdate(V0.getLong(i452222222222));
                                                    i41 = i442222222222;
                                                    int i472222222222 = i39;
                                                    stage2222222222.setMuted(((int) V0.getLong(i472222222222)) != 0);
                                                    i39 = i472222222222;
                                                    int i482222222222 = i38;
                                                    stage2222222222.setHidden(((int) V0.getLong(i482222222222)) != 0);
                                                    stage2222222222.setParentEvent(stageEvent2);
                                                    stage2222222222.setStageSeason(stageSeason);
                                                    ArrayList arrayList62222222222 = arrayList3;
                                                    arrayList62222222222.add(stage2222222222);
                                                    int i492222222222 = i17;
                                                    r22 = i13;
                                                    r5 = i9;
                                                    r18 = i33;
                                                    r30 = i29;
                                                    r13 = i25;
                                                    r26 = i21;
                                                    r9 = i492222222222;
                                                    f76Var = this;
                                                    i38 = i482222222222;
                                                    r27 = i26;
                                                    r28 = i27;
                                                    r10 = i22;
                                                    r11 = i23;
                                                    r2 = i5;
                                                    r3 = i6;
                                                    r14 = i7;
                                                    r23 = i18;
                                                    r24 = i19;
                                                    r17 = i14;
                                                    r16 = i15;
                                                    r19 = i34;
                                                    r20 = i31;
                                                    r29 = i28;
                                                    r12 = i24;
                                                    r25 = i20;
                                                    r15 = i16;
                                                    r21 = i32;
                                                    r31 = i462222222222;
                                                    i40 = i452222222222;
                                                    arrayList5 = arrayList62222222222;
                                                    r = i42;
                                                }
                                                i14 = r17;
                                                i15 = r16;
                                                i16 = r15;
                                                i17 = r9;
                                                i18 = r23;
                                                i19 = r24;
                                                i20 = r25;
                                                i21 = r26;
                                                i22 = r10;
                                                i23 = r11;
                                                i24 = r12;
                                                i25 = r13;
                                                i26 = r27;
                                                i27 = r28;
                                                i28 = r29;
                                                i29 = r30;
                                                arrayList3 = arrayList5;
                                                i30 = r31;
                                                stageEvent2 = stageEvent;
                                                String F04222222222 = V0.F0(i8);
                                                if (V0.isNull(i10)) {
                                                }
                                                i33 = i8;
                                                i34 = i10;
                                                i35 = (int) V0.getLong(i11);
                                                if (!V0.isNull(i12)) {
                                                }
                                                i36 = i35;
                                                int i50222222222 = (int) V0.getLong(i12);
                                                String F06222222222 = V0.F0(i13);
                                                if (V0.isNull(i18)) {
                                                }
                                                if (V0.isNull(i19)) {
                                                }
                                                int i51222222222 = (int) V0.getLong(i20);
                                                String F09222222222 = V0.F0(i21);
                                                String F010222222222 = V0.F0(i26);
                                                i31 = i11;
                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                if (V0.isNull(i29)) {
                                                }
                                                sport2 = sport;
                                                fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                uniqueStage = new UniqueStage(i50222222222, F06222222222, new Category(i51222222222, F09222222222, F010222222222, sport2, fieldTranslations), F07, F08);
                                                String str2222222222 = F05;
                                                i32 = i12;
                                                stageSeason = new StageSeason(uniqueStage, F04222222222, str2222222222, i36);
                                                Stage stage22222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                                int i4422222222222 = i41;
                                                stage22222222222.setStartDateTimestamp(V0.getLong(i4422222222222));
                                                int i4522222222222 = i40;
                                                int i4622222222222 = i30;
                                                stage22222222222.setLastUpdate(V0.getLong(i4522222222222));
                                                i41 = i4422222222222;
                                                int i4722222222222 = i39;
                                                stage22222222222.setMuted(((int) V0.getLong(i4722222222222)) != 0);
                                                i39 = i4722222222222;
                                                int i4822222222222 = i38;
                                                stage22222222222.setHidden(((int) V0.getLong(i4822222222222)) != 0);
                                                stage22222222222.setParentEvent(stageEvent2);
                                                stage22222222222.setStageSeason(stageSeason);
                                                ArrayList arrayList622222222222 = arrayList3;
                                                arrayList622222222222.add(stage22222222222);
                                                int i4922222222222 = i17;
                                                r22 = i13;
                                                r5 = i9;
                                                r18 = i33;
                                                r30 = i29;
                                                r13 = i25;
                                                r26 = i21;
                                                r9 = i4922222222222;
                                                f76Var = this;
                                                i38 = i4822222222222;
                                                r27 = i26;
                                                r28 = i27;
                                                r10 = i22;
                                                r11 = i23;
                                                r2 = i5;
                                                r3 = i6;
                                                r14 = i7;
                                                r23 = i18;
                                                r24 = i19;
                                                r17 = i14;
                                                r16 = i15;
                                                r19 = i34;
                                                r20 = i31;
                                                r29 = i28;
                                                r12 = i24;
                                                r25 = i20;
                                                r15 = i16;
                                                r21 = i32;
                                                r31 = i4622222222222;
                                                i40 = i4522222222222;
                                                arrayList5 = arrayList622222222222;
                                                r = i42;
                                            }
                                            i7 = r14;
                                            stageEvent = new StageEvent((int) V0.getLong(r14), !V0.isNull(r15) ? null : V0.F0(r15), !V0.isNull(r16) ? null : Long.valueOf(V0.getLong(r16)), !V0.isNull(r17) ? null : V0.F0(r17));
                                            i8 = r18;
                                            if (V0.isNull(i8)) {
                                            }
                                            i14 = r17;
                                            i15 = r16;
                                            i16 = r15;
                                            i17 = r9;
                                            i18 = r23;
                                            i19 = r24;
                                            i20 = r25;
                                            i21 = r26;
                                            i22 = r10;
                                            i23 = r11;
                                            i24 = r12;
                                            i25 = r13;
                                            i26 = r27;
                                            i27 = r28;
                                            i28 = r29;
                                            i29 = r30;
                                            arrayList3 = arrayList5;
                                            i30 = r31;
                                            stageEvent2 = stageEvent;
                                            String F042222222222 = V0.F0(i8);
                                            if (V0.isNull(i10)) {
                                            }
                                            i33 = i8;
                                            i34 = i10;
                                            i35 = (int) V0.getLong(i11);
                                            if (!V0.isNull(i12)) {
                                            }
                                            i36 = i35;
                                            int i502222222222 = (int) V0.getLong(i12);
                                            String F062222222222 = V0.F0(i13);
                                            if (V0.isNull(i18)) {
                                            }
                                            if (V0.isNull(i19)) {
                                            }
                                            int i512222222222 = (int) V0.getLong(i20);
                                            String F092222222222 = V0.F0(i21);
                                            String F0102222222222 = V0.F0(i26);
                                            i31 = i11;
                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                            if (V0.isNull(i29)) {
                                            }
                                            sport2 = sport;
                                            fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                            uniqueStage = new UniqueStage(i502222222222, F062222222222, new Category(i512222222222, F092222222222, F0102222222222, sport2, fieldTranslations), F07, F08);
                                            String str22222222222 = F05;
                                            i32 = i12;
                                            stageSeason = new StageSeason(uniqueStage, F042222222222, str22222222222, i36);
                                            Stage stage222222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                            int i44222222222222 = i41;
                                            stage222222222222.setStartDateTimestamp(V0.getLong(i44222222222222));
                                            int i45222222222222 = i40;
                                            int i46222222222222 = i30;
                                            stage222222222222.setLastUpdate(V0.getLong(i45222222222222));
                                            i41 = i44222222222222;
                                            int i47222222222222 = i39;
                                            stage222222222222.setMuted(((int) V0.getLong(i47222222222222)) != 0);
                                            i39 = i47222222222222;
                                            int i48222222222222 = i38;
                                            stage222222222222.setHidden(((int) V0.getLong(i48222222222222)) != 0);
                                            stage222222222222.setParentEvent(stageEvent2);
                                            stage222222222222.setStageSeason(stageSeason);
                                            ArrayList arrayList6222222222222 = arrayList3;
                                            arrayList6222222222222.add(stage222222222222);
                                            int i49222222222222 = i17;
                                            r22 = i13;
                                            r5 = i9;
                                            r18 = i33;
                                            r30 = i29;
                                            r13 = i25;
                                            r26 = i21;
                                            r9 = i49222222222222;
                                            f76Var = this;
                                            i38 = i48222222222222;
                                            r27 = i26;
                                            r28 = i27;
                                            r10 = i22;
                                            r11 = i23;
                                            r2 = i5;
                                            r3 = i6;
                                            r14 = i7;
                                            r23 = i18;
                                            r24 = i19;
                                            r17 = i14;
                                            r16 = i15;
                                            r19 = i34;
                                            r20 = i31;
                                            r29 = i28;
                                            r12 = i24;
                                            r25 = i20;
                                            r15 = i16;
                                            r21 = i32;
                                            r31 = i46222222222222;
                                            i40 = i45222222222222;
                                            arrayList5 = arrayList6222222222222;
                                            r = i42;
                                        }
                                        stageWinner = new StageWinner((int) V0.getLong(r12), V0.isNull(r13) ? null : V0.F0(r13));
                                        if (V0.isNull(r14)) {
                                            i7 = r14;
                                            stageEvent = null;
                                            i8 = r18;
                                            if (V0.isNull(i8)) {
                                            }
                                            i14 = r17;
                                            i15 = r16;
                                            i16 = r15;
                                            i17 = r9;
                                            i18 = r23;
                                            i19 = r24;
                                            i20 = r25;
                                            i21 = r26;
                                            i22 = r10;
                                            i23 = r11;
                                            i24 = r12;
                                            i25 = r13;
                                            i26 = r27;
                                            i27 = r28;
                                            i28 = r29;
                                            i29 = r30;
                                            arrayList3 = arrayList5;
                                            i30 = r31;
                                            stageEvent2 = stageEvent;
                                            String F0422222222222 = V0.F0(i8);
                                            if (V0.isNull(i10)) {
                                            }
                                            i33 = i8;
                                            i34 = i10;
                                            i35 = (int) V0.getLong(i11);
                                            if (!V0.isNull(i12)) {
                                            }
                                            i36 = i35;
                                            int i5022222222222 = (int) V0.getLong(i12);
                                            String F0622222222222 = V0.F0(i13);
                                            if (V0.isNull(i18)) {
                                            }
                                            if (V0.isNull(i19)) {
                                            }
                                            int i5122222222222 = (int) V0.getLong(i20);
                                            String F0922222222222 = V0.F0(i21);
                                            String F01022222222222 = V0.F0(i26);
                                            i31 = i11;
                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                            if (V0.isNull(i29)) {
                                            }
                                            sport2 = sport;
                                            fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                            uniqueStage = new UniqueStage(i5022222222222, F0622222222222, new Category(i5122222222222, F0922222222222, F01022222222222, sport2, fieldTranslations), F07, F08);
                                            String str222222222222 = F05;
                                            i32 = i12;
                                            stageSeason = new StageSeason(uniqueStage, F0422222222222, str222222222222, i36);
                                            Stage stage2222222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                            int i442222222222222 = i41;
                                            stage2222222222222.setStartDateTimestamp(V0.getLong(i442222222222222));
                                            int i452222222222222 = i40;
                                            int i462222222222222 = i30;
                                            stage2222222222222.setLastUpdate(V0.getLong(i452222222222222));
                                            i41 = i442222222222222;
                                            int i472222222222222 = i39;
                                            stage2222222222222.setMuted(((int) V0.getLong(i472222222222222)) != 0);
                                            i39 = i472222222222222;
                                            int i482222222222222 = i38;
                                            stage2222222222222.setHidden(((int) V0.getLong(i482222222222222)) != 0);
                                            stage2222222222222.setParentEvent(stageEvent2);
                                            stage2222222222222.setStageSeason(stageSeason);
                                            ArrayList arrayList62222222222222 = arrayList3;
                                            arrayList62222222222222.add(stage2222222222222);
                                            int i492222222222222 = i17;
                                            r22 = i13;
                                            r5 = i9;
                                            r18 = i33;
                                            r30 = i29;
                                            r13 = i25;
                                            r26 = i21;
                                            r9 = i492222222222222;
                                            f76Var = this;
                                            i38 = i482222222222222;
                                            r27 = i26;
                                            r28 = i27;
                                            r10 = i22;
                                            r11 = i23;
                                            r2 = i5;
                                            r3 = i6;
                                            r14 = i7;
                                            r23 = i18;
                                            r24 = i19;
                                            r17 = i14;
                                            r16 = i15;
                                            r19 = i34;
                                            r20 = i31;
                                            r29 = i28;
                                            r12 = i24;
                                            r25 = i20;
                                            r15 = i16;
                                            r21 = i32;
                                            r31 = i462222222222222;
                                            i40 = i452222222222222;
                                            arrayList5 = arrayList62222222222222;
                                            r = i42;
                                        }
                                        i7 = r14;
                                        stageEvent = new StageEvent((int) V0.getLong(r14), !V0.isNull(r15) ? null : V0.F0(r15), !V0.isNull(r16) ? null : Long.valueOf(V0.getLong(r16)), !V0.isNull(r17) ? null : V0.F0(r17));
                                        i8 = r18;
                                        if (V0.isNull(i8)) {
                                        }
                                        i14 = r17;
                                        i15 = r16;
                                        i16 = r15;
                                        i17 = r9;
                                        i18 = r23;
                                        i19 = r24;
                                        i20 = r25;
                                        i21 = r26;
                                        i22 = r10;
                                        i23 = r11;
                                        i24 = r12;
                                        i25 = r13;
                                        i26 = r27;
                                        i27 = r28;
                                        i28 = r29;
                                        i29 = r30;
                                        arrayList3 = arrayList5;
                                        i30 = r31;
                                        stageEvent2 = stageEvent;
                                        String F04222222222222 = V0.F0(i8);
                                        if (V0.isNull(i10)) {
                                        }
                                        i33 = i8;
                                        i34 = i10;
                                        i35 = (int) V0.getLong(i11);
                                        if (!V0.isNull(i12)) {
                                        }
                                        i36 = i35;
                                        int i50222222222222 = (int) V0.getLong(i12);
                                        String F06222222222222 = V0.F0(i13);
                                        if (V0.isNull(i18)) {
                                        }
                                        if (V0.isNull(i19)) {
                                        }
                                        int i51222222222222 = (int) V0.getLong(i20);
                                        String F09222222222222 = V0.F0(i21);
                                        String F010222222222222 = V0.F0(i26);
                                        i31 = i11;
                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                        if (V0.isNull(i29)) {
                                        }
                                        sport2 = sport;
                                        fieldTranslations = new FieldTranslations(v76Var2.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var2.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                        uniqueStage = new UniqueStage(i50222222222222, F06222222222222, new Category(i51222222222222, F09222222222222, F010222222222222, sport2, fieldTranslations), F07, F08);
                                        String str2222222222222 = F05;
                                        i32 = i12;
                                        stageSeason = new StageSeason(uniqueStage, F04222222222222, str2222222222222, i36);
                                        Stage stage22222222222222 = new Stage(F0, b, status, i4, stageWinner, F03);
                                        int i4422222222222222 = i41;
                                        stage22222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222));
                                        int i4522222222222222 = i40;
                                        int i4622222222222222 = i30;
                                        stage22222222222222.setLastUpdate(V0.getLong(i4522222222222222));
                                        i41 = i4422222222222222;
                                        int i4722222222222222 = i39;
                                        stage22222222222222.setMuted(((int) V0.getLong(i4722222222222222)) != 0);
                                        i39 = i4722222222222222;
                                        int i4822222222222222 = i38;
                                        stage22222222222222.setHidden(((int) V0.getLong(i4822222222222222)) != 0);
                                        stage22222222222222.setParentEvent(stageEvent2);
                                        stage22222222222222.setStageSeason(stageSeason);
                                        ArrayList arrayList622222222222222 = arrayList3;
                                        arrayList622222222222222.add(stage22222222222222);
                                        int i4922222222222222 = i17;
                                        r22 = i13;
                                        r5 = i9;
                                        r18 = i33;
                                        r30 = i29;
                                        r13 = i25;
                                        r26 = i21;
                                        r9 = i4922222222222222;
                                        f76Var = this;
                                        i38 = i4822222222222222;
                                        r27 = i26;
                                        r28 = i27;
                                        r10 = i22;
                                        r11 = i23;
                                        r2 = i5;
                                        r3 = i6;
                                        r14 = i7;
                                        r23 = i18;
                                        r24 = i19;
                                        r17 = i14;
                                        r16 = i15;
                                        r19 = i34;
                                        r20 = i31;
                                        r29 = i28;
                                        r12 = i24;
                                        r25 = i20;
                                        r15 = i16;
                                        r21 = i32;
                                        r31 = i4622222222222222;
                                        i40 = i4522222222222222;
                                        arrayList5 = arrayList622222222222222;
                                        r = i42;
                                    }
                                    ArrayList arrayList7 = arrayList5;
                                    V0.close();
                                    return arrayList7;
                                } catch (Throwable th) {
                                    V0.close();
                                    throw th;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:164:0x065e  */
                            /* JADX WARN: Removed duplicated region for block: B:167:0x067a  */
                            /* JADX WARN: Removed duplicated region for block: B:170:0x068e  */
                            /* JADX WARN: Removed duplicated region for block: B:173:0x06a2  */
                            /* JADX WARN: Removed duplicated region for block: B:176:0x06b6  */
                            /* JADX WARN: Removed duplicated region for block: B:179:0x06c9  */
                            /* JADX WARN: Removed duplicated region for block: B:182:0x06dc  */
                            /* JADX WARN: Removed duplicated region for block: B:185:0x06ef  */
                            /* JADX WARN: Removed duplicated region for block: B:190:0x070b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:195:0x0729  */
                            /* JADX WARN: Removed duplicated region for block: B:200:0x0751 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x07b3  */
                            /* JADX WARN: Removed duplicated region for block: B:216:0x07cf  */
                            /* JADX WARN: Removed duplicated region for block: B:219:0x07e3  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x07f7  */
                            /* JADX WARN: Removed duplicated region for block: B:224:0x0804 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:230:0x081c  */
                            /* JADX WARN: Removed duplicated region for block: B:233:0x0830  */
                            /* JADX WARN: Removed duplicated region for block: B:238:0x084d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:243:0x0868  */
                            /* JADX WARN: Removed duplicated region for block: B:245:0x087d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:251:0x0892  */
                            /* JADX WARN: Removed duplicated region for block: B:253:0x08a5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:260:0x08cf  */
                            /* JADX WARN: Removed duplicated region for block: B:263:0x08d1  */
                            /* JADX WARN: Removed duplicated region for block: B:265:0x08b3  */
                            /* JADX WARN: Removed duplicated region for block: B:266:0x0897 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:268:0x088b  */
                            /* JADX WARN: Removed duplicated region for block: B:269:0x086e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:271:0x0860  */
                            /* JADX WARN: Removed duplicated region for block: B:272:0x0833 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:273:0x081f A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:275:0x0814  */
                            /* JADX WARN: Removed duplicated region for block: B:276:0x07f9 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:277:0x07e6 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:278:0x07d2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:279:0x07ba A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:288:0x07a2  */
                            /* JADX WARN: Removed duplicated region for block: B:289:0x072d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:291:0x0721  */
                            /* JADX WARN: Removed duplicated region for block: B:292:0x06f2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:293:0x06df A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:294:0x06cc A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:295:0x06b9 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:296:0x06a5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:297:0x0691 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:298:0x067d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:299:0x0665 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                nkb nkbVar;
                                int i4;
                                Integer valueOf;
                                int i5;
                                Integer valueOf2;
                                int i6;
                                ArrayList arrayList3;
                                nkb nkbVar2;
                                Integer valueOf3;
                                int i7;
                                Integer valueOf4;
                                Long valueOf5;
                                int i8;
                                int i9;
                                int i10;
                                Integer valueOf6;
                                int i11;
                                int i12;
                                Integer valueOf7;
                                int i13;
                                Integer valueOf8;
                                int i14;
                                Integer valueOf9;
                                int i15;
                                Integer valueOf10;
                                int i16;
                                Integer valueOf11;
                                int i17;
                                Integer valueOf12;
                                int i18;
                                Integer valueOf13;
                                int i19;
                                Integer valueOf14;
                                int i20;
                                Integer valueOf15;
                                Boolean bool;
                                int i21;
                                Integer valueOf16;
                                Boolean bool2;
                                int i22;
                                Integer valueOf17;
                                Boolean bool3;
                                int i23;
                                Integer valueOf18;
                                int i24;
                                String F0;
                                int i25;
                                Season season;
                                int i26;
                                String F02;
                                Status status;
                                int i27;
                                int i28;
                                int i29;
                                int i30;
                                int i31;
                                nkb nkbVar3;
                                ArrayList arrayList4;
                                int i32;
                                int i33;
                                int i34;
                                int i35;
                                Time time;
                                nkb nkbVar4;
                                nkb nkbVar5;
                                int i36;
                                int i37;
                                EventChanges eventChanges;
                                int i38;
                                int i39;
                                int i40;
                                int i41;
                                int i42;
                                sz8 sz8Var;
                                int i43;
                                int i44;
                                int i45;
                                int i46;
                                int i47;
                                int i48;
                                DbAmericanFootballDownDistance dbAmericanFootballDownDistance;
                                int i49;
                                int i50;
                                int i51;
                                int i52;
                                VarInProgress varInProgress;
                                int i53;
                                int i54;
                                int i55;
                                int i56;
                                Integer valueOf19;
                                Boolean bool4;
                                Integer valueOf20;
                                Boolean bool5;
                                Integer valueOf21;
                                Integer valueOf22;
                                Boolean bool6;
                                String F03;
                                Integer valueOf23;
                                switch (i2) {
                                    case 0:
                                        return a(obj2);
                                    default:
                                        ArrayList arrayList5 = arrayList2;
                                        v76 v76Var2 = v76Var;
                                        glg glgVar = (glg) obj2;
                                        glgVar.getClass();
                                        nlg V0 = glgVar.V0(sb2);
                                        try {
                                            Iterator it2 = arrayList5.iterator();
                                            int i57 = 1;
                                            while (it2.hasNext()) {
                                                V0.q(i57, ((Number) it2.next()).intValue());
                                                i57++;
                                            }
                                            int r = w1a.r(V0, "winnerCode");
                                            int r2 = w1a.r(V0, "aggregatedWinnerCode");
                                            int r3 = w1a.r(V0, "homeTeamId");
                                            int r4 = w1a.r(V0, "homeSubTeam1Id");
                                            int r5 = w1a.r(V0, "homeSubTeam2Id");
                                            int r6 = w1a.r(V0, "awayTeamId");
                                            int r7 = w1a.r(V0, "awaySubTeam1Id");
                                            int r8 = w1a.r(V0, "awaySubTeam2Id");
                                            int r9 = w1a.r(V0, "hasEventPlayerHeatMap");
                                            int r10 = w1a.r(V0, "startTimestamp");
                                            int r11 = w1a.r(V0, "endTimestamp");
                                            int r12 = w1a.r(V0, "id");
                                            int r13 = w1a.r(V0, "tournamentId");
                                            int i58 = r11;
                                            int r14 = w1a.r(V0, "uniqueTournamentId");
                                            int r15 = w1a.r(V0, "previousLegEventId");
                                            int r16 = w1a.r(V0, "lastPeriod");
                                            int r17 = w1a.r(V0, "homeRedCards");
                                            int r18 = w1a.r(V0, "awayRedCards");
                                            int r19 = w1a.r(V0, "currentBattingTeamId");
                                            int r20 = w1a.r(V0, "firstToServe");
                                            int r21 = w1a.r(V0, "bestOfSets");
                                            int r22 = w1a.r(V0, "bestOfLegs");
                                            int r23 = w1a.r(V0, "finalRound");
                                            int r24 = w1a.r(V0, "winType");
                                            int r25 = w1a.r(V0, "crowdsourcingDataDisplayEnabled");
                                            int r26 = w1a.r(V0, "crowdsourcingEnabled");
                                            int r27 = w1a.r(V0, "finalResultOnly");
                                            int r28 = w1a.r(V0, "streamContentId");
                                            int r29 = w1a.r(V0, "streamContentGeoRestrictions");
                                            int r30 = w1a.r(V0, "eventFilters");
                                            int r31 = w1a.r(V0, "homeTeamSeed");
                                            int r32 = w1a.r(V0, "awayTeamSeed");
                                            int r33 = w1a.r(V0, "hide");
                                            int r34 = w1a.r(V0, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                            int r35 = w1a.r(V0, "lastUpdate");
                                            int r36 = w1a.r(V0, "season_id");
                                            int r37 = w1a.r(V0, "status_code");
                                            int r38 = w1a.r(V0, "status_description");
                                            int r39 = w1a.r(V0, "status_type");
                                            int r40 = w1a.r(V0, "time_played");
                                            int r41 = w1a.r(V0, "time_periodLength");
                                            int r42 = w1a.r(V0, "time_overtimeLength");
                                            int r43 = w1a.r(V0, "time_totalPeriodCount");
                                            int r44 = w1a.r(V0, "time_initial");
                                            int r45 = w1a.r(V0, "time_max");
                                            int r46 = w1a.r(V0, "time_currentPeriodStartTimestamp");
                                            int r47 = w1a.r(V0, "time_extra");
                                            int r48 = w1a.r(V0, "changes_changes");
                                            int r49 = w1a.r(V0, "changes_changeTimestamp");
                                            int r50 = w1a.r(V0, "am_football_currentYardsToFirstDown");
                                            int r51 = w1a.r(V0, "am_football_currentDown");
                                            int r52 = w1a.r(V0, "am_football_currentYardline");
                                            int r53 = w1a.r(V0, "am_football_isGoalPossession");
                                            int r54 = w1a.r(V0, "am_football_currentPossession");
                                            int r55 = w1a.r(V0, "am_football_currentTeamHalf");
                                            int r56 = w1a.r(V0, "var_homeTeam");
                                            int r57 = w1a.r(V0, "var_awayTeam");
                                            int i59 = r10;
                                            Integer num = null;
                                            nkb nkbVar6 = new nkb((Object) null);
                                            int i60 = r9;
                                            nkb nkbVar7 = new nkb((Object) null);
                                            int i61 = r8;
                                            nkb nkbVar8 = new nkb((Object) null);
                                            int i62 = r7;
                                            nkb nkbVar9 = new nkb((Object) null);
                                            while (V0.U0()) {
                                                nkbVar6.g(null, V0.getLong(r3));
                                                nkbVar7.g(null, V0.getLong(r6));
                                                nkbVar8.g(null, V0.getLong(r13));
                                                nkbVar9.g(null, V0.getLong(r12));
                                                r4 = r4;
                                                r5 = r5;
                                            }
                                            int i63 = r4;
                                            int i64 = r5;
                                            V0.reset();
                                            v76Var2.d(glgVar, nkbVar6);
                                            sz8 sz8Var2 = v76Var2.c;
                                            v76Var2.d(glgVar, nkbVar7);
                                            v76Var2.e(glgVar, nkbVar8);
                                            v76Var2.c(glgVar, nkbVar9);
                                            ArrayList arrayList6 = new ArrayList();
                                            while (V0.U0()) {
                                                if (V0.isNull(r)) {
                                                    nkbVar = nkbVar6;
                                                } else {
                                                    nkbVar = nkbVar6;
                                                    num = Integer.valueOf((int) V0.getLong(r));
                                                }
                                                Integer num2 = num;
                                                Integer valueOf24 = V0.isNull(r2) ? null : Integer.valueOf((int) V0.getLong(r2));
                                                int i65 = (int) V0.getLong(r3);
                                                int i66 = i63;
                                                if (V0.isNull(i66)) {
                                                    i4 = r6;
                                                    valueOf = null;
                                                } else {
                                                    i4 = r6;
                                                    valueOf = Integer.valueOf((int) V0.getLong(i66));
                                                }
                                                int i67 = i64;
                                                if (V0.isNull(i67)) {
                                                    i5 = i65;
                                                    i6 = i4;
                                                    valueOf2 = null;
                                                    i63 = i66;
                                                } else {
                                                    i5 = i65;
                                                    valueOf2 = Integer.valueOf((int) V0.getLong(i67));
                                                    i6 = i4;
                                                    i63 = i66;
                                                }
                                                i64 = i67;
                                                int i68 = (int) V0.getLong(i6);
                                                int i69 = i62;
                                                if (V0.isNull(i69)) {
                                                    arrayList3 = arrayList6;
                                                    nkbVar2 = nkbVar;
                                                    valueOf3 = null;
                                                } else {
                                                    arrayList3 = arrayList6;
                                                    nkbVar2 = nkbVar;
                                                    valueOf3 = Integer.valueOf((int) V0.getLong(i69));
                                                }
                                                int i70 = i61;
                                                if (V0.isNull(i70)) {
                                                    i7 = i68;
                                                    valueOf4 = null;
                                                } else {
                                                    i7 = i68;
                                                    i69 = i69;
                                                    valueOf4 = Integer.valueOf((int) V0.getLong(i70));
                                                }
                                                i61 = i70;
                                                int i71 = i60;
                                                boolean z = ((int) V0.getLong(i71)) != 0;
                                                int i72 = i59;
                                                long j = V0.getLong(i72);
                                                int i73 = i58;
                                                if (V0.isNull(i73)) {
                                                    valueOf5 = null;
                                                    i8 = i72;
                                                    i58 = i73;
                                                } else {
                                                    valueOf5 = Long.valueOf(V0.getLong(i73));
                                                    i58 = i73;
                                                    i8 = i72;
                                                }
                                                int i74 = (int) V0.getLong(r12);
                                                int i75 = (int) V0.getLong(r13);
                                                int i76 = r14;
                                                if (V0.isNull(i76)) {
                                                    i9 = i71;
                                                    i10 = i69;
                                                    valueOf6 = null;
                                                } else {
                                                    i9 = i71;
                                                    i10 = i69;
                                                    valueOf6 = Integer.valueOf((int) V0.getLong(i76));
                                                }
                                                int i77 = r15;
                                                if (V0.isNull(i77)) {
                                                    i11 = i75;
                                                    i12 = i76;
                                                    valueOf7 = null;
                                                } else {
                                                    i11 = i75;
                                                    i12 = i76;
                                                    valueOf7 = Integer.valueOf((int) V0.getLong(i77));
                                                }
                                                int i78 = r16;
                                                String F04 = V0.isNull(i78) ? null : V0.F0(i78);
                                                int i79 = r17;
                                                if (V0.isNull(i79)) {
                                                    r15 = i77;
                                                    i13 = i12;
                                                    valueOf8 = null;
                                                } else {
                                                    r15 = i77;
                                                    i13 = i12;
                                                    valueOf8 = Integer.valueOf((int) V0.getLong(i79));
                                                }
                                                int i80 = r18;
                                                if (V0.isNull(i80)) {
                                                    i14 = i78;
                                                    r17 = i79;
                                                    valueOf9 = null;
                                                } else {
                                                    i14 = i78;
                                                    r17 = i79;
                                                    valueOf9 = Integer.valueOf((int) V0.getLong(i80));
                                                }
                                                int i81 = r19;
                                                if (V0.isNull(i81)) {
                                                    r18 = i80;
                                                    i15 = i14;
                                                    valueOf10 = null;
                                                } else {
                                                    r18 = i80;
                                                    i15 = i14;
                                                    valueOf10 = Integer.valueOf((int) V0.getLong(i81));
                                                }
                                                int i82 = r20;
                                                if (V0.isNull(i82)) {
                                                    r19 = i81;
                                                    i16 = i15;
                                                    valueOf11 = null;
                                                } else {
                                                    r19 = i81;
                                                    i16 = i15;
                                                    valueOf11 = Integer.valueOf((int) V0.getLong(i82));
                                                }
                                                int i83 = r21;
                                                if (V0.isNull(i83)) {
                                                    r20 = i82;
                                                    i17 = i16;
                                                    valueOf12 = null;
                                                } else {
                                                    r20 = i82;
                                                    i17 = i16;
                                                    valueOf12 = Integer.valueOf((int) V0.getLong(i83));
                                                }
                                                int i84 = r22;
                                                if (V0.isNull(i84)) {
                                                    r21 = i83;
                                                    i18 = i17;
                                                    valueOf13 = null;
                                                } else {
                                                    r21 = i83;
                                                    i18 = i17;
                                                    valueOf13 = Integer.valueOf((int) V0.getLong(i84));
                                                }
                                                int i85 = r23;
                                                if (V0.isNull(i85)) {
                                                    r22 = i84;
                                                    i19 = i18;
                                                    valueOf14 = null;
                                                } else {
                                                    r22 = i84;
                                                    i19 = i18;
                                                    valueOf14 = Integer.valueOf((int) V0.getLong(i85));
                                                }
                                                int i86 = r24;
                                                String F05 = V0.isNull(i86) ? null : V0.F0(i86);
                                                int i87 = r25;
                                                if (V0.isNull(i87)) {
                                                    r23 = i85;
                                                    i20 = i19;
                                                    valueOf15 = null;
                                                } else {
                                                    r23 = i85;
                                                    i20 = i19;
                                                    valueOf15 = Integer.valueOf((int) V0.getLong(i87));
                                                }
                                                if (valueOf15 != null) {
                                                    bool = Boolean.valueOf(valueOf15.intValue() != 0);
                                                } else {
                                                    bool = null;
                                                }
                                                int i88 = r26;
                                                if (V0.isNull(i88)) {
                                                    i21 = i86;
                                                    r25 = i87;
                                                    valueOf16 = null;
                                                } else {
                                                    i21 = i86;
                                                    r25 = i87;
                                                    valueOf16 = Integer.valueOf((int) V0.getLong(i88));
                                                }
                                                if (valueOf16 != null) {
                                                    bool2 = Boolean.valueOf(valueOf16.intValue() != 0);
                                                } else {
                                                    bool2 = null;
                                                }
                                                int i89 = r27;
                                                if (V0.isNull(i89)) {
                                                    r26 = i88;
                                                    i22 = i21;
                                                    valueOf17 = null;
                                                } else {
                                                    r26 = i88;
                                                    i22 = i21;
                                                    valueOf17 = Integer.valueOf((int) V0.getLong(i89));
                                                }
                                                if (valueOf17 != null) {
                                                    bool3 = Boolean.valueOf(valueOf17.intValue() != 0);
                                                } else {
                                                    bool3 = null;
                                                }
                                                int i90 = r28;
                                                if (V0.isNull(i90)) {
                                                    r27 = i89;
                                                    i23 = i22;
                                                    valueOf18 = null;
                                                } else {
                                                    r27 = i89;
                                                    i23 = i22;
                                                    valueOf18 = Integer.valueOf((int) V0.getLong(i90));
                                                }
                                                int i91 = r29;
                                                List y = sz8Var2.y(V0.isNull(i91) ? null : V0.F0(i91));
                                                int i92 = r30;
                                                if (V0.isNull(i92)) {
                                                    i24 = r;
                                                    F0 = null;
                                                } else {
                                                    i24 = r;
                                                    F0 = V0.F0(i92);
                                                }
                                                Map A = sz8Var2.A(F0);
                                                int i93 = r31;
                                                String F06 = V0.isNull(i93) ? null : V0.F0(i93);
                                                r31 = i93;
                                                int i94 = r32;
                                                String F07 = V0.isNull(i94) ? null : V0.F0(i94);
                                                r32 = i94;
                                                int i95 = r36;
                                                if (V0.isNull(i95)) {
                                                    r28 = i90;
                                                    i25 = i23;
                                                    season = null;
                                                } else {
                                                    r28 = i90;
                                                    i25 = i23;
                                                    season = new Season((int) V0.getLong(i95));
                                                }
                                                int i96 = r37;
                                                int i97 = (int) V0.getLong(i96);
                                                int i98 = r38;
                                                if (V0.isNull(i98)) {
                                                    i26 = i95;
                                                    F02 = null;
                                                } else {
                                                    i26 = i95;
                                                    F02 = V0.F0(i98);
                                                }
                                                r37 = i96;
                                                int i99 = r39;
                                                Status status2 = new Status(i97, F02, V0.F0(i99));
                                                int i100 = r40;
                                                if (V0.isNull(i100)) {
                                                    i28 = r41;
                                                    if (V0.isNull(i28)) {
                                                        i29 = r42;
                                                        if (V0.isNull(i29)) {
                                                            status = status2;
                                                            i30 = r43;
                                                            if (V0.isNull(i30)) {
                                                                i27 = r2;
                                                                i31 = r44;
                                                                if (V0.isNull(i31)) {
                                                                    i32 = i98;
                                                                    i33 = r45;
                                                                    if (V0.isNull(i33)) {
                                                                        arrayList4 = arrayList3;
                                                                        i34 = r46;
                                                                        if (V0.isNull(i34)) {
                                                                            nkbVar3 = nkbVar9;
                                                                            i35 = r47;
                                                                            if (V0.isNull(i35)) {
                                                                                nkbVar4 = nkbVar8;
                                                                                nkbVar5 = nkbVar7;
                                                                                time = null;
                                                                                i36 = r48;
                                                                                if (V0.isNull(i36)) {
                                                                                }
                                                                                if (V0.isNull(i36)) {
                                                                                }
                                                                                i39 = i30;
                                                                                i41 = i28;
                                                                                i38 = i31;
                                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                                i42 = r50;
                                                                                if (V0.isNull(i42)) {
                                                                                }
                                                                                i47 = i29;
                                                                                i48 = r55;
                                                                                if (V0.isNull(i42)) {
                                                                                }
                                                                                if (!V0.isNull(i43)) {
                                                                                }
                                                                                if (!V0.isNull(i44)) {
                                                                                }
                                                                                if (!V0.isNull(i45)) {
                                                                                }
                                                                                if (valueOf22 == null) {
                                                                                }
                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, r110, r111, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                i51 = r56;
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (valueOf19 != null) {
                                                                                }
                                                                                if (V0.isNull(i52)) {
                                                                                }
                                                                                if (valueOf20 != null) {
                                                                                }
                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                DbEvent dbEvent = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                int i101 = r33;
                                                                                dbEvent.setHide(((int) V0.getLong(i101)) == 0);
                                                                                r57 = i52;
                                                                                int i102 = r34;
                                                                                dbEvent.setMute((int) V0.getLong(i102));
                                                                                r34 = i102;
                                                                                int i103 = r35;
                                                                                dbEvent.setLastUpdate(V0.getLong(i103));
                                                                                nkb nkbVar10 = nkbVar2;
                                                                                Team team = (Team) nkbVar10.c(V0.getLong(r3));
                                                                                nkb nkbVar11 = nkbVar5;
                                                                                Team team2 = (Team) nkbVar11.c(V0.getLong(i6));
                                                                                nkb nkbVar12 = nkbVar4;
                                                                                Tournament tournament = (Tournament) nkbVar12.c(V0.getLong(r13));
                                                                                nkb nkbVar13 = nkbVar3;
                                                                                ArrayList arrayList7 = arrayList4;
                                                                                arrayList7.add(new DbEventAll(dbEvent, team, team2, tournament, (DbEventScore) nkbVar13.c(V0.getLong(r12))));
                                                                                int i104 = i49;
                                                                                r53 = i45;
                                                                                r2 = i27;
                                                                                r40 = i40;
                                                                                r47 = i104;
                                                                                int i105 = i38;
                                                                                r49 = i37;
                                                                                nkbVar7 = nkbVar11;
                                                                                r44 = i105;
                                                                                arrayList6 = arrayList7;
                                                                                r43 = i39;
                                                                                sz8Var2 = sz8Var;
                                                                                r42 = i47;
                                                                                r51 = i55;
                                                                                i59 = i8;
                                                                                r54 = i56;
                                                                                r48 = i36;
                                                                                i60 = i9;
                                                                                r14 = i13;
                                                                                r16 = i20;
                                                                                r24 = i25;
                                                                                r50 = i42;
                                                                                r30 = i92;
                                                                                r36 = i26;
                                                                                r38 = i32;
                                                                                nkbVar8 = nkbVar12;
                                                                                r41 = i41;
                                                                                r45 = i50;
                                                                                r52 = i54;
                                                                                r55 = i53;
                                                                                r35 = i103;
                                                                                r6 = i6;
                                                                                r46 = i34;
                                                                                r56 = i51;
                                                                                nkbVar6 = nkbVar10;
                                                                                i62 = i10;
                                                                                num = null;
                                                                                r33 = i101;
                                                                                nkbVar9 = nkbVar13;
                                                                                r = i24;
                                                                                r29 = i91;
                                                                                r39 = i99;
                                                                            } else {
                                                                                if (V0.isNull(i100)) {
                                                                                    nkbVar4 = nkbVar8;
                                                                                    nkbVar5 = nkbVar7;
                                                                                    valueOf23 = null;
                                                                                } else {
                                                                                    nkbVar4 = nkbVar8;
                                                                                    nkbVar5 = nkbVar7;
                                                                                    valueOf23 = Integer.valueOf((int) V0.getLong(i100));
                                                                                }
                                                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                                                i36 = r48;
                                                                                if (V0.isNull(i36)) {
                                                                                    i37 = r49;
                                                                                } else {
                                                                                    i37 = r49;
                                                                                    if (V0.isNull(i37)) {
                                                                                        i40 = i100;
                                                                                        i39 = i30;
                                                                                        i41 = i28;
                                                                                        i38 = i31;
                                                                                        eventChanges = null;
                                                                                        i42 = r50;
                                                                                        if (V0.isNull(i42)) {
                                                                                            i43 = r51;
                                                                                            if (V0.isNull(i43)) {
                                                                                                i44 = r52;
                                                                                                if (V0.isNull(i44)) {
                                                                                                    i45 = r53;
                                                                                                    if (V0.isNull(i45)) {
                                                                                                        sz8Var = sz8Var2;
                                                                                                        i46 = r54;
                                                                                                        if (V0.isNull(i46)) {
                                                                                                            i47 = i29;
                                                                                                            i48 = r55;
                                                                                                            if (V0.isNull(i48)) {
                                                                                                                i50 = i33;
                                                                                                                i49 = i35;
                                                                                                                dbAmericanFootballDownDistance = null;
                                                                                                                i51 = r56;
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                }
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                }
                                                                                                                if (valueOf19 != null) {
                                                                                                                }
                                                                                                                if (V0.isNull(i52)) {
                                                                                                                }
                                                                                                                if (valueOf20 != null) {
                                                                                                                }
                                                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                                                DbEvent dbEvent2 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                                                int i1012 = r33;
                                                                                                                dbEvent2.setHide(((int) V0.getLong(i1012)) == 0);
                                                                                                                r57 = i52;
                                                                                                                int i1022 = r34;
                                                                                                                dbEvent2.setMute((int) V0.getLong(i1022));
                                                                                                                r34 = i1022;
                                                                                                                int i1032 = r35;
                                                                                                                dbEvent2.setLastUpdate(V0.getLong(i1032));
                                                                                                                nkb nkbVar102 = nkbVar2;
                                                                                                                Team team3 = (Team) nkbVar102.c(V0.getLong(r3));
                                                                                                                nkb nkbVar112 = nkbVar5;
                                                                                                                Team team22 = (Team) nkbVar112.c(V0.getLong(i6));
                                                                                                                nkb nkbVar122 = nkbVar4;
                                                                                                                Tournament tournament2 = (Tournament) nkbVar122.c(V0.getLong(r13));
                                                                                                                nkb nkbVar132 = nkbVar3;
                                                                                                                ArrayList arrayList72 = arrayList4;
                                                                                                                arrayList72.add(new DbEventAll(dbEvent2, team3, team22, tournament2, (DbEventScore) nkbVar132.c(V0.getLong(r12))));
                                                                                                                int i1042 = i49;
                                                                                                                r53 = i45;
                                                                                                                r2 = i27;
                                                                                                                r40 = i40;
                                                                                                                r47 = i1042;
                                                                                                                int i1052 = i38;
                                                                                                                r49 = i37;
                                                                                                                nkbVar7 = nkbVar112;
                                                                                                                r44 = i1052;
                                                                                                                arrayList6 = arrayList72;
                                                                                                                r43 = i39;
                                                                                                                sz8Var2 = sz8Var;
                                                                                                                r42 = i47;
                                                                                                                r51 = i55;
                                                                                                                i59 = i8;
                                                                                                                r54 = i56;
                                                                                                                r48 = i36;
                                                                                                                i60 = i9;
                                                                                                                r14 = i13;
                                                                                                                r16 = i20;
                                                                                                                r24 = i25;
                                                                                                                r50 = i42;
                                                                                                                r30 = i92;
                                                                                                                r36 = i26;
                                                                                                                r38 = i32;
                                                                                                                nkbVar8 = nkbVar122;
                                                                                                                r41 = i41;
                                                                                                                r45 = i50;
                                                                                                                r52 = i54;
                                                                                                                r55 = i53;
                                                                                                                r35 = i1032;
                                                                                                                r6 = i6;
                                                                                                                r46 = i34;
                                                                                                                r56 = i51;
                                                                                                                nkbVar6 = nkbVar102;
                                                                                                                i62 = i10;
                                                                                                                num = null;
                                                                                                                r33 = i1012;
                                                                                                                nkbVar9 = nkbVar132;
                                                                                                                r = i24;
                                                                                                                r29 = i91;
                                                                                                                r39 = i99;
                                                                                                            } else {
                                                                                                                if (V0.isNull(i42)) {
                                                                                                                    i50 = i33;
                                                                                                                    i49 = i35;
                                                                                                                    valueOf21 = Integer.valueOf((int) V0.getLong(i42));
                                                                                                                } else {
                                                                                                                    i50 = i33;
                                                                                                                    i49 = i35;
                                                                                                                    valueOf21 = null;
                                                                                                                }
                                                                                                                Integer valueOf25 = !V0.isNull(i43) ? null : Integer.valueOf((int) V0.getLong(i43));
                                                                                                                Integer valueOf26 = !V0.isNull(i44) ? null : Integer.valueOf((int) V0.getLong(i44));
                                                                                                                valueOf22 = !V0.isNull(i45) ? null : Integer.valueOf((int) V0.getLong(i45));
                                                                                                                if (valueOf22 == null) {
                                                                                                                    bool6 = Boolean.valueOf(valueOf22.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool6 = null;
                                                                                                                }
                                                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                                                i51 = r56;
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                    i52 = r57;
                                                                                                                    if (V0.isNull(i52)) {
                                                                                                                        i55 = i43;
                                                                                                                        i54 = i44;
                                                                                                                        i56 = i46;
                                                                                                                        i53 = i48;
                                                                                                                        varInProgress = null;
                                                                                                                        DbEvent dbEvent22 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                                                        int i10122 = r33;
                                                                                                                        dbEvent22.setHide(((int) V0.getLong(i10122)) == 0);
                                                                                                                        r57 = i52;
                                                                                                                        int i10222 = r34;
                                                                                                                        dbEvent22.setMute((int) V0.getLong(i10222));
                                                                                                                        r34 = i10222;
                                                                                                                        int i10322 = r35;
                                                                                                                        dbEvent22.setLastUpdate(V0.getLong(i10322));
                                                                                                                        nkb nkbVar1022 = nkbVar2;
                                                                                                                        Team team32 = (Team) nkbVar1022.c(V0.getLong(r3));
                                                                                                                        nkb nkbVar1122 = nkbVar5;
                                                                                                                        Team team222 = (Team) nkbVar1122.c(V0.getLong(i6));
                                                                                                                        nkb nkbVar1222 = nkbVar4;
                                                                                                                        Tournament tournament22 = (Tournament) nkbVar1222.c(V0.getLong(r13));
                                                                                                                        nkb nkbVar1322 = nkbVar3;
                                                                                                                        ArrayList arrayList722 = arrayList4;
                                                                                                                        arrayList722.add(new DbEventAll(dbEvent22, team32, team222, tournament22, (DbEventScore) nkbVar1322.c(V0.getLong(r12))));
                                                                                                                        int i10422 = i49;
                                                                                                                        r53 = i45;
                                                                                                                        r2 = i27;
                                                                                                                        r40 = i40;
                                                                                                                        r47 = i10422;
                                                                                                                        int i10522 = i38;
                                                                                                                        r49 = i37;
                                                                                                                        nkbVar7 = nkbVar1122;
                                                                                                                        r44 = i10522;
                                                                                                                        arrayList6 = arrayList722;
                                                                                                                        r43 = i39;
                                                                                                                        sz8Var2 = sz8Var;
                                                                                                                        r42 = i47;
                                                                                                                        r51 = i55;
                                                                                                                        i59 = i8;
                                                                                                                        r54 = i56;
                                                                                                                        r48 = i36;
                                                                                                                        i60 = i9;
                                                                                                                        r14 = i13;
                                                                                                                        r16 = i20;
                                                                                                                        r24 = i25;
                                                                                                                        r50 = i42;
                                                                                                                        r30 = i92;
                                                                                                                        r36 = i26;
                                                                                                                        r38 = i32;
                                                                                                                        nkbVar8 = nkbVar1222;
                                                                                                                        r41 = i41;
                                                                                                                        r45 = i50;
                                                                                                                        r52 = i54;
                                                                                                                        r55 = i53;
                                                                                                                        r35 = i10322;
                                                                                                                        r6 = i6;
                                                                                                                        r46 = i34;
                                                                                                                        r56 = i51;
                                                                                                                        nkbVar6 = nkbVar1022;
                                                                                                                        i62 = i10;
                                                                                                                        num = null;
                                                                                                                        r33 = i10122;
                                                                                                                        nkbVar9 = nkbVar1322;
                                                                                                                        r = i24;
                                                                                                                        r29 = i91;
                                                                                                                        r39 = i99;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i52 = r57;
                                                                                                                }
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                    i55 = i43;
                                                                                                                    i54 = i44;
                                                                                                                    valueOf19 = null;
                                                                                                                } else {
                                                                                                                    i55 = i43;
                                                                                                                    i54 = i44;
                                                                                                                    valueOf19 = Integer.valueOf((int) V0.getLong(i51));
                                                                                                                }
                                                                                                                if (valueOf19 != null) {
                                                                                                                    bool4 = Boolean.valueOf(valueOf19.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool4 = null;
                                                                                                                }
                                                                                                                if (V0.isNull(i52)) {
                                                                                                                    i56 = i46;
                                                                                                                    i53 = i48;
                                                                                                                    valueOf20 = null;
                                                                                                                } else {
                                                                                                                    i56 = i46;
                                                                                                                    i53 = i48;
                                                                                                                    valueOf20 = Integer.valueOf((int) V0.getLong(i52));
                                                                                                                }
                                                                                                                if (valueOf20 != null) {
                                                                                                                    bool5 = Boolean.valueOf(valueOf20.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool5 = null;
                                                                                                                }
                                                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                                                DbEvent dbEvent222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                                                int i101222 = r33;
                                                                                                                dbEvent222.setHide(((int) V0.getLong(i101222)) == 0);
                                                                                                                r57 = i52;
                                                                                                                int i102222 = r34;
                                                                                                                dbEvent222.setMute((int) V0.getLong(i102222));
                                                                                                                r34 = i102222;
                                                                                                                int i103222 = r35;
                                                                                                                dbEvent222.setLastUpdate(V0.getLong(i103222));
                                                                                                                nkb nkbVar10222 = nkbVar2;
                                                                                                                Team team322 = (Team) nkbVar10222.c(V0.getLong(r3));
                                                                                                                nkb nkbVar11222 = nkbVar5;
                                                                                                                Team team2222 = (Team) nkbVar11222.c(V0.getLong(i6));
                                                                                                                nkb nkbVar12222 = nkbVar4;
                                                                                                                Tournament tournament222 = (Tournament) nkbVar12222.c(V0.getLong(r13));
                                                                                                                nkb nkbVar13222 = nkbVar3;
                                                                                                                ArrayList arrayList7222 = arrayList4;
                                                                                                                arrayList7222.add(new DbEventAll(dbEvent222, team322, team2222, tournament222, (DbEventScore) nkbVar13222.c(V0.getLong(r12))));
                                                                                                                int i104222 = i49;
                                                                                                                r53 = i45;
                                                                                                                r2 = i27;
                                                                                                                r40 = i40;
                                                                                                                r47 = i104222;
                                                                                                                int i105222 = i38;
                                                                                                                r49 = i37;
                                                                                                                nkbVar7 = nkbVar11222;
                                                                                                                r44 = i105222;
                                                                                                                arrayList6 = arrayList7222;
                                                                                                                r43 = i39;
                                                                                                                sz8Var2 = sz8Var;
                                                                                                                r42 = i47;
                                                                                                                r51 = i55;
                                                                                                                i59 = i8;
                                                                                                                r54 = i56;
                                                                                                                r48 = i36;
                                                                                                                i60 = i9;
                                                                                                                r14 = i13;
                                                                                                                r16 = i20;
                                                                                                                r24 = i25;
                                                                                                                r50 = i42;
                                                                                                                r30 = i92;
                                                                                                                r36 = i26;
                                                                                                                r38 = i32;
                                                                                                                nkbVar8 = nkbVar12222;
                                                                                                                r41 = i41;
                                                                                                                r45 = i50;
                                                                                                                r52 = i54;
                                                                                                                r55 = i53;
                                                                                                                r35 = i103222;
                                                                                                                r6 = i6;
                                                                                                                r46 = i34;
                                                                                                                r56 = i51;
                                                                                                                nkbVar6 = nkbVar10222;
                                                                                                                i62 = i10;
                                                                                                                num = null;
                                                                                                                r33 = i101222;
                                                                                                                nkbVar9 = nkbVar13222;
                                                                                                                r = i24;
                                                                                                                r29 = i91;
                                                                                                                r39 = i99;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sz8Var = sz8Var2;
                                                                                                        i47 = i29;
                                                                                                        i46 = r54;
                                                                                                        i48 = r55;
                                                                                                        if (V0.isNull(i42)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i43)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i44)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i45)) {
                                                                                                        }
                                                                                                        if (valueOf22 == null) {
                                                                                                        }
                                                                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                                        i51 = r56;
                                                                                                        if (V0.isNull(i51)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i51)) {
                                                                                                        }
                                                                                                        if (valueOf19 != null) {
                                                                                                        }
                                                                                                        if (V0.isNull(i52)) {
                                                                                                        }
                                                                                                        if (valueOf20 != null) {
                                                                                                        }
                                                                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                                                                        DbEvent dbEvent2222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                                        int i1012222 = r33;
                                                                                                        dbEvent2222.setHide(((int) V0.getLong(i1012222)) == 0);
                                                                                                        r57 = i52;
                                                                                                        int i1022222 = r34;
                                                                                                        dbEvent2222.setMute((int) V0.getLong(i1022222));
                                                                                                        r34 = i1022222;
                                                                                                        int i1032222 = r35;
                                                                                                        dbEvent2222.setLastUpdate(V0.getLong(i1032222));
                                                                                                        nkb nkbVar102222 = nkbVar2;
                                                                                                        Team team3222 = (Team) nkbVar102222.c(V0.getLong(r3));
                                                                                                        nkb nkbVar112222 = nkbVar5;
                                                                                                        Team team22222 = (Team) nkbVar112222.c(V0.getLong(i6));
                                                                                                        nkb nkbVar122222 = nkbVar4;
                                                                                                        Tournament tournament2222 = (Tournament) nkbVar122222.c(V0.getLong(r13));
                                                                                                        nkb nkbVar132222 = nkbVar3;
                                                                                                        ArrayList arrayList72222 = arrayList4;
                                                                                                        arrayList72222.add(new DbEventAll(dbEvent2222, team3222, team22222, tournament2222, (DbEventScore) nkbVar132222.c(V0.getLong(r12))));
                                                                                                        int i1042222 = i49;
                                                                                                        r53 = i45;
                                                                                                        r2 = i27;
                                                                                                        r40 = i40;
                                                                                                        r47 = i1042222;
                                                                                                        int i1052222 = i38;
                                                                                                        r49 = i37;
                                                                                                        nkbVar7 = nkbVar112222;
                                                                                                        r44 = i1052222;
                                                                                                        arrayList6 = arrayList72222;
                                                                                                        r43 = i39;
                                                                                                        sz8Var2 = sz8Var;
                                                                                                        r42 = i47;
                                                                                                        r51 = i55;
                                                                                                        i59 = i8;
                                                                                                        r54 = i56;
                                                                                                        r48 = i36;
                                                                                                        i60 = i9;
                                                                                                        r14 = i13;
                                                                                                        r16 = i20;
                                                                                                        r24 = i25;
                                                                                                        r50 = i42;
                                                                                                        r30 = i92;
                                                                                                        r36 = i26;
                                                                                                        r38 = i32;
                                                                                                        nkbVar8 = nkbVar122222;
                                                                                                        r41 = i41;
                                                                                                        r45 = i50;
                                                                                                        r52 = i54;
                                                                                                        r55 = i53;
                                                                                                        r35 = i1032222;
                                                                                                        r6 = i6;
                                                                                                        r46 = i34;
                                                                                                        r56 = i51;
                                                                                                        nkbVar6 = nkbVar102222;
                                                                                                        i62 = i10;
                                                                                                        num = null;
                                                                                                        r33 = i1012222;
                                                                                                        nkbVar9 = nkbVar132222;
                                                                                                        r = i24;
                                                                                                        r29 = i91;
                                                                                                        r39 = i99;
                                                                                                    }
                                                                                                } else {
                                                                                                    sz8Var = sz8Var2;
                                                                                                    i47 = i29;
                                                                                                }
                                                                                            } else {
                                                                                                sz8Var = sz8Var2;
                                                                                                i47 = i29;
                                                                                                i44 = r52;
                                                                                            }
                                                                                            i45 = r53;
                                                                                            i46 = r54;
                                                                                            i48 = r55;
                                                                                            if (V0.isNull(i42)) {
                                                                                            }
                                                                                            if (!V0.isNull(i43)) {
                                                                                            }
                                                                                            if (!V0.isNull(i44)) {
                                                                                            }
                                                                                            if (!V0.isNull(i45)) {
                                                                                            }
                                                                                            if (valueOf22 == null) {
                                                                                            }
                                                                                            dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                            i51 = r56;
                                                                                            if (V0.isNull(i51)) {
                                                                                            }
                                                                                            if (V0.isNull(i51)) {
                                                                                            }
                                                                                            if (valueOf19 != null) {
                                                                                            }
                                                                                            if (V0.isNull(i52)) {
                                                                                            }
                                                                                            if (valueOf20 != null) {
                                                                                            }
                                                                                            varInProgress = new VarInProgress(bool4, bool5);
                                                                                            DbEvent dbEvent22222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                            int i10122222 = r33;
                                                                                            dbEvent22222.setHide(((int) V0.getLong(i10122222)) == 0);
                                                                                            r57 = i52;
                                                                                            int i10222222 = r34;
                                                                                            dbEvent22222.setMute((int) V0.getLong(i10222222));
                                                                                            r34 = i10222222;
                                                                                            int i10322222 = r35;
                                                                                            dbEvent22222.setLastUpdate(V0.getLong(i10322222));
                                                                                            nkb nkbVar1022222 = nkbVar2;
                                                                                            Team team32222 = (Team) nkbVar1022222.c(V0.getLong(r3));
                                                                                            nkb nkbVar1122222 = nkbVar5;
                                                                                            Team team222222 = (Team) nkbVar1122222.c(V0.getLong(i6));
                                                                                            nkb nkbVar1222222 = nkbVar4;
                                                                                            Tournament tournament22222 = (Tournament) nkbVar1222222.c(V0.getLong(r13));
                                                                                            nkb nkbVar1322222 = nkbVar3;
                                                                                            ArrayList arrayList722222 = arrayList4;
                                                                                            arrayList722222.add(new DbEventAll(dbEvent22222, team32222, team222222, tournament22222, (DbEventScore) nkbVar1322222.c(V0.getLong(r12))));
                                                                                            int i10422222 = i49;
                                                                                            r53 = i45;
                                                                                            r2 = i27;
                                                                                            r40 = i40;
                                                                                            r47 = i10422222;
                                                                                            int i10522222 = i38;
                                                                                            r49 = i37;
                                                                                            nkbVar7 = nkbVar1122222;
                                                                                            r44 = i10522222;
                                                                                            arrayList6 = arrayList722222;
                                                                                            r43 = i39;
                                                                                            sz8Var2 = sz8Var;
                                                                                            r42 = i47;
                                                                                            r51 = i55;
                                                                                            i59 = i8;
                                                                                            r54 = i56;
                                                                                            r48 = i36;
                                                                                            i60 = i9;
                                                                                            r14 = i13;
                                                                                            r16 = i20;
                                                                                            r24 = i25;
                                                                                            r50 = i42;
                                                                                            r30 = i92;
                                                                                            r36 = i26;
                                                                                            r38 = i32;
                                                                                            nkbVar8 = nkbVar1222222;
                                                                                            r41 = i41;
                                                                                            r45 = i50;
                                                                                            r52 = i54;
                                                                                            r55 = i53;
                                                                                            r35 = i10322222;
                                                                                            r6 = i6;
                                                                                            r46 = i34;
                                                                                            r56 = i51;
                                                                                            nkbVar6 = nkbVar1022222;
                                                                                            i62 = i10;
                                                                                            num = null;
                                                                                            r33 = i10122222;
                                                                                            nkbVar9 = nkbVar1322222;
                                                                                            r = i24;
                                                                                            r29 = i91;
                                                                                            r39 = i99;
                                                                                        } else {
                                                                                            sz8Var = sz8Var2;
                                                                                            i43 = r51;
                                                                                            i44 = r52;
                                                                                            i45 = r53;
                                                                                            i46 = r54;
                                                                                        }
                                                                                        i47 = i29;
                                                                                        i48 = r55;
                                                                                        if (V0.isNull(i42)) {
                                                                                        }
                                                                                        if (!V0.isNull(i43)) {
                                                                                        }
                                                                                        if (!V0.isNull(i44)) {
                                                                                        }
                                                                                        if (!V0.isNull(i45)) {
                                                                                        }
                                                                                        if (valueOf22 == null) {
                                                                                        }
                                                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                        i51 = r56;
                                                                                        if (V0.isNull(i51)) {
                                                                                        }
                                                                                        if (V0.isNull(i51)) {
                                                                                        }
                                                                                        if (valueOf19 != null) {
                                                                                        }
                                                                                        if (V0.isNull(i52)) {
                                                                                        }
                                                                                        if (valueOf20 != null) {
                                                                                        }
                                                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                                                        DbEvent dbEvent222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                        int i101222222 = r33;
                                                                                        dbEvent222222.setHide(((int) V0.getLong(i101222222)) == 0);
                                                                                        r57 = i52;
                                                                                        int i102222222 = r34;
                                                                                        dbEvent222222.setMute((int) V0.getLong(i102222222));
                                                                                        r34 = i102222222;
                                                                                        int i103222222 = r35;
                                                                                        dbEvent222222.setLastUpdate(V0.getLong(i103222222));
                                                                                        nkb nkbVar10222222 = nkbVar2;
                                                                                        Team team322222 = (Team) nkbVar10222222.c(V0.getLong(r3));
                                                                                        nkb nkbVar11222222 = nkbVar5;
                                                                                        Team team2222222 = (Team) nkbVar11222222.c(V0.getLong(i6));
                                                                                        nkb nkbVar12222222 = nkbVar4;
                                                                                        Tournament tournament222222 = (Tournament) nkbVar12222222.c(V0.getLong(r13));
                                                                                        nkb nkbVar13222222 = nkbVar3;
                                                                                        ArrayList arrayList7222222 = arrayList4;
                                                                                        arrayList7222222.add(new DbEventAll(dbEvent222222, team322222, team2222222, tournament222222, (DbEventScore) nkbVar13222222.c(V0.getLong(r12))));
                                                                                        int i104222222 = i49;
                                                                                        r53 = i45;
                                                                                        r2 = i27;
                                                                                        r40 = i40;
                                                                                        r47 = i104222222;
                                                                                        int i105222222 = i38;
                                                                                        r49 = i37;
                                                                                        nkbVar7 = nkbVar11222222;
                                                                                        r44 = i105222222;
                                                                                        arrayList6 = arrayList7222222;
                                                                                        r43 = i39;
                                                                                        sz8Var2 = sz8Var;
                                                                                        r42 = i47;
                                                                                        r51 = i55;
                                                                                        i59 = i8;
                                                                                        r54 = i56;
                                                                                        r48 = i36;
                                                                                        i60 = i9;
                                                                                        r14 = i13;
                                                                                        r16 = i20;
                                                                                        r24 = i25;
                                                                                        r50 = i42;
                                                                                        r30 = i92;
                                                                                        r36 = i26;
                                                                                        r38 = i32;
                                                                                        nkbVar8 = nkbVar12222222;
                                                                                        r41 = i41;
                                                                                        r45 = i50;
                                                                                        r52 = i54;
                                                                                        r55 = i53;
                                                                                        r35 = i103222222;
                                                                                        r6 = i6;
                                                                                        r46 = i34;
                                                                                        r56 = i51;
                                                                                        nkbVar6 = nkbVar10222222;
                                                                                        i62 = i10;
                                                                                        num = null;
                                                                                        r33 = i101222222;
                                                                                        nkbVar9 = nkbVar13222222;
                                                                                        r = i24;
                                                                                        r29 = i91;
                                                                                        r39 = i99;
                                                                                    }
                                                                                }
                                                                                if (V0.isNull(i36)) {
                                                                                    i40 = i100;
                                                                                    F03 = V0.F0(i36);
                                                                                } else {
                                                                                    i40 = i100;
                                                                                    F03 = null;
                                                                                }
                                                                                i39 = i30;
                                                                                i41 = i28;
                                                                                i38 = i31;
                                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                                i42 = r50;
                                                                                if (V0.isNull(i42)) {
                                                                                }
                                                                                i47 = i29;
                                                                                i48 = r55;
                                                                                if (V0.isNull(i42)) {
                                                                                }
                                                                                if (!V0.isNull(i43)) {
                                                                                }
                                                                                if (!V0.isNull(i44)) {
                                                                                }
                                                                                if (!V0.isNull(i45)) {
                                                                                }
                                                                                if (valueOf22 == null) {
                                                                                }
                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                i51 = r56;
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (valueOf19 != null) {
                                                                                }
                                                                                if (V0.isNull(i52)) {
                                                                                }
                                                                                if (valueOf20 != null) {
                                                                                }
                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                DbEvent dbEvent2222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                                int i1012222222 = r33;
                                                                                dbEvent2222222.setHide(((int) V0.getLong(i1012222222)) == 0);
                                                                                r57 = i52;
                                                                                int i1022222222 = r34;
                                                                                dbEvent2222222.setMute((int) V0.getLong(i1022222222));
                                                                                r34 = i1022222222;
                                                                                int i1032222222 = r35;
                                                                                dbEvent2222222.setLastUpdate(V0.getLong(i1032222222));
                                                                                nkb nkbVar102222222 = nkbVar2;
                                                                                Team team3222222 = (Team) nkbVar102222222.c(V0.getLong(r3));
                                                                                nkb nkbVar112222222 = nkbVar5;
                                                                                Team team22222222 = (Team) nkbVar112222222.c(V0.getLong(i6));
                                                                                nkb nkbVar122222222 = nkbVar4;
                                                                                Tournament tournament2222222 = (Tournament) nkbVar122222222.c(V0.getLong(r13));
                                                                                nkb nkbVar132222222 = nkbVar3;
                                                                                ArrayList arrayList72222222 = arrayList4;
                                                                                arrayList72222222.add(new DbEventAll(dbEvent2222222, team3222222, team22222222, tournament2222222, (DbEventScore) nkbVar132222222.c(V0.getLong(r12))));
                                                                                int i1042222222 = i49;
                                                                                r53 = i45;
                                                                                r2 = i27;
                                                                                r40 = i40;
                                                                                r47 = i1042222222;
                                                                                int i1052222222 = i38;
                                                                                r49 = i37;
                                                                                nkbVar7 = nkbVar112222222;
                                                                                r44 = i1052222222;
                                                                                arrayList6 = arrayList72222222;
                                                                                r43 = i39;
                                                                                sz8Var2 = sz8Var;
                                                                                r42 = i47;
                                                                                r51 = i55;
                                                                                i59 = i8;
                                                                                r54 = i56;
                                                                                r48 = i36;
                                                                                i60 = i9;
                                                                                r14 = i13;
                                                                                r16 = i20;
                                                                                r24 = i25;
                                                                                r50 = i42;
                                                                                r30 = i92;
                                                                                r36 = i26;
                                                                                r38 = i32;
                                                                                nkbVar8 = nkbVar122222222;
                                                                                r41 = i41;
                                                                                r45 = i50;
                                                                                r52 = i54;
                                                                                r55 = i53;
                                                                                r35 = i1032222222;
                                                                                r6 = i6;
                                                                                r46 = i34;
                                                                                r56 = i51;
                                                                                nkbVar6 = nkbVar102222222;
                                                                                i62 = i10;
                                                                                num = null;
                                                                                r33 = i1012222222;
                                                                                nkbVar9 = nkbVar132222222;
                                                                                r = i24;
                                                                                r29 = i91;
                                                                                r39 = i99;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i27 = r2;
                                                                i32 = i98;
                                                                nkbVar3 = nkbVar9;
                                                                arrayList4 = arrayList3;
                                                                i31 = r44;
                                                                i33 = r45;
                                                                i34 = r46;
                                                                i35 = r47;
                                                                if (V0.isNull(i100)) {
                                                                }
                                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                                i36 = r48;
                                                                if (V0.isNull(i36)) {
                                                                }
                                                                if (V0.isNull(i36)) {
                                                                }
                                                                i39 = i30;
                                                                i41 = i28;
                                                                i38 = i31;
                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                i42 = r50;
                                                                if (V0.isNull(i42)) {
                                                                }
                                                                i47 = i29;
                                                                i48 = r55;
                                                                if (V0.isNull(i42)) {
                                                                }
                                                                if (!V0.isNull(i43)) {
                                                                }
                                                                if (!V0.isNull(i44)) {
                                                                }
                                                                if (!V0.isNull(i45)) {
                                                                }
                                                                if (valueOf22 == null) {
                                                                }
                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                i51 = r56;
                                                                if (V0.isNull(i51)) {
                                                                }
                                                                if (V0.isNull(i51)) {
                                                                }
                                                                if (valueOf19 != null) {
                                                                }
                                                                if (V0.isNull(i52)) {
                                                                }
                                                                if (valueOf20 != null) {
                                                                }
                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                DbEvent dbEvent22222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                                int i10122222222 = r33;
                                                                dbEvent22222222.setHide(((int) V0.getLong(i10122222222)) == 0);
                                                                r57 = i52;
                                                                int i10222222222 = r34;
                                                                dbEvent22222222.setMute((int) V0.getLong(i10222222222));
                                                                r34 = i10222222222;
                                                                int i10322222222 = r35;
                                                                dbEvent22222222.setLastUpdate(V0.getLong(i10322222222));
                                                                nkb nkbVar1022222222 = nkbVar2;
                                                                Team team32222222 = (Team) nkbVar1022222222.c(V0.getLong(r3));
                                                                nkb nkbVar1122222222 = nkbVar5;
                                                                Team team222222222 = (Team) nkbVar1122222222.c(V0.getLong(i6));
                                                                nkb nkbVar1222222222 = nkbVar4;
                                                                Tournament tournament22222222 = (Tournament) nkbVar1222222222.c(V0.getLong(r13));
                                                                nkb nkbVar1322222222 = nkbVar3;
                                                                ArrayList arrayList722222222 = arrayList4;
                                                                arrayList722222222.add(new DbEventAll(dbEvent22222222, team32222222, team222222222, tournament22222222, (DbEventScore) nkbVar1322222222.c(V0.getLong(r12))));
                                                                int i10422222222 = i49;
                                                                r53 = i45;
                                                                r2 = i27;
                                                                r40 = i40;
                                                                r47 = i10422222222;
                                                                int i10522222222 = i38;
                                                                r49 = i37;
                                                                nkbVar7 = nkbVar1122222222;
                                                                r44 = i10522222222;
                                                                arrayList6 = arrayList722222222;
                                                                r43 = i39;
                                                                sz8Var2 = sz8Var;
                                                                r42 = i47;
                                                                r51 = i55;
                                                                i59 = i8;
                                                                r54 = i56;
                                                                r48 = i36;
                                                                i60 = i9;
                                                                r14 = i13;
                                                                r16 = i20;
                                                                r24 = i25;
                                                                r50 = i42;
                                                                r30 = i92;
                                                                r36 = i26;
                                                                r38 = i32;
                                                                nkbVar8 = nkbVar1222222222;
                                                                r41 = i41;
                                                                r45 = i50;
                                                                r52 = i54;
                                                                r55 = i53;
                                                                r35 = i10322222222;
                                                                r6 = i6;
                                                                r46 = i34;
                                                                r56 = i51;
                                                                nkbVar6 = nkbVar1022222222;
                                                                i62 = i10;
                                                                num = null;
                                                                r33 = i10122222222;
                                                                nkbVar9 = nkbVar1322222222;
                                                                r = i24;
                                                                r29 = i91;
                                                                r39 = i99;
                                                            }
                                                        } else {
                                                            status = status2;
                                                            i27 = r2;
                                                            i32 = i98;
                                                            arrayList4 = arrayList3;
                                                            i30 = r43;
                                                            i31 = r44;
                                                            i33 = r45;
                                                            i34 = r46;
                                                        }
                                                        nkbVar3 = nkbVar9;
                                                        i35 = r47;
                                                        if (V0.isNull(i100)) {
                                                        }
                                                        time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                        i36 = r48;
                                                        if (V0.isNull(i36)) {
                                                        }
                                                        if (V0.isNull(i36)) {
                                                        }
                                                        i39 = i30;
                                                        i41 = i28;
                                                        i38 = i31;
                                                        eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                        i42 = r50;
                                                        if (V0.isNull(i42)) {
                                                        }
                                                        i47 = i29;
                                                        i48 = r55;
                                                        if (V0.isNull(i42)) {
                                                        }
                                                        if (!V0.isNull(i43)) {
                                                        }
                                                        if (!V0.isNull(i44)) {
                                                        }
                                                        if (!V0.isNull(i45)) {
                                                        }
                                                        if (valueOf22 == null) {
                                                        }
                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                        i51 = r56;
                                                        if (V0.isNull(i51)) {
                                                        }
                                                        if (V0.isNull(i51)) {
                                                        }
                                                        if (valueOf19 != null) {
                                                        }
                                                        if (V0.isNull(i52)) {
                                                        }
                                                        if (valueOf20 != null) {
                                                        }
                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                        DbEvent dbEvent222222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                        int i101222222222 = r33;
                                                        dbEvent222222222.setHide(((int) V0.getLong(i101222222222)) == 0);
                                                        r57 = i52;
                                                        int i102222222222 = r34;
                                                        dbEvent222222222.setMute((int) V0.getLong(i102222222222));
                                                        r34 = i102222222222;
                                                        int i103222222222 = r35;
                                                        dbEvent222222222.setLastUpdate(V0.getLong(i103222222222));
                                                        nkb nkbVar10222222222 = nkbVar2;
                                                        Team team322222222 = (Team) nkbVar10222222222.c(V0.getLong(r3));
                                                        nkb nkbVar11222222222 = nkbVar5;
                                                        Team team2222222222 = (Team) nkbVar11222222222.c(V0.getLong(i6));
                                                        nkb nkbVar12222222222 = nkbVar4;
                                                        Tournament tournament222222222 = (Tournament) nkbVar12222222222.c(V0.getLong(r13));
                                                        nkb nkbVar13222222222 = nkbVar3;
                                                        ArrayList arrayList7222222222 = arrayList4;
                                                        arrayList7222222222.add(new DbEventAll(dbEvent222222222, team322222222, team2222222222, tournament222222222, (DbEventScore) nkbVar13222222222.c(V0.getLong(r12))));
                                                        int i104222222222 = i49;
                                                        r53 = i45;
                                                        r2 = i27;
                                                        r40 = i40;
                                                        r47 = i104222222222;
                                                        int i105222222222 = i38;
                                                        r49 = i37;
                                                        nkbVar7 = nkbVar11222222222;
                                                        r44 = i105222222222;
                                                        arrayList6 = arrayList7222222222;
                                                        r43 = i39;
                                                        sz8Var2 = sz8Var;
                                                        r42 = i47;
                                                        r51 = i55;
                                                        i59 = i8;
                                                        r54 = i56;
                                                        r48 = i36;
                                                        i60 = i9;
                                                        r14 = i13;
                                                        r16 = i20;
                                                        r24 = i25;
                                                        r50 = i42;
                                                        r30 = i92;
                                                        r36 = i26;
                                                        r38 = i32;
                                                        nkbVar8 = nkbVar12222222222;
                                                        r41 = i41;
                                                        r45 = i50;
                                                        r52 = i54;
                                                        r55 = i53;
                                                        r35 = i103222222222;
                                                        r6 = i6;
                                                        r46 = i34;
                                                        r56 = i51;
                                                        nkbVar6 = nkbVar10222222222;
                                                        i62 = i10;
                                                        num = null;
                                                        r33 = i101222222222;
                                                        nkbVar9 = nkbVar13222222222;
                                                        r = i24;
                                                        r29 = i91;
                                                        r39 = i99;
                                                    } else {
                                                        status = status2;
                                                        i27 = r2;
                                                        i32 = i98;
                                                        i29 = r42;
                                                        i30 = r43;
                                                        i31 = r44;
                                                        i33 = r45;
                                                    }
                                                    nkbVar3 = nkbVar9;
                                                    arrayList4 = arrayList3;
                                                    i34 = r46;
                                                    i35 = r47;
                                                    if (V0.isNull(i100)) {
                                                    }
                                                    time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                    i36 = r48;
                                                    if (V0.isNull(i36)) {
                                                    }
                                                    if (V0.isNull(i36)) {
                                                    }
                                                    i39 = i30;
                                                    i41 = i28;
                                                    i38 = i31;
                                                    eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                    i42 = r50;
                                                    if (V0.isNull(i42)) {
                                                    }
                                                    i47 = i29;
                                                    i48 = r55;
                                                    if (V0.isNull(i42)) {
                                                    }
                                                    if (!V0.isNull(i43)) {
                                                    }
                                                    if (!V0.isNull(i44)) {
                                                    }
                                                    if (!V0.isNull(i45)) {
                                                    }
                                                    if (valueOf22 == null) {
                                                    }
                                                    dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                    i51 = r56;
                                                    if (V0.isNull(i51)) {
                                                    }
                                                    if (V0.isNull(i51)) {
                                                    }
                                                    if (valueOf19 != null) {
                                                    }
                                                    if (V0.isNull(i52)) {
                                                    }
                                                    if (valueOf20 != null) {
                                                    }
                                                    varInProgress = new VarInProgress(bool4, bool5);
                                                    DbEvent dbEvent2222222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                    int i1012222222222 = r33;
                                                    dbEvent2222222222.setHide(((int) V0.getLong(i1012222222222)) == 0);
                                                    r57 = i52;
                                                    int i1022222222222 = r34;
                                                    dbEvent2222222222.setMute((int) V0.getLong(i1022222222222));
                                                    r34 = i1022222222222;
                                                    int i1032222222222 = r35;
                                                    dbEvent2222222222.setLastUpdate(V0.getLong(i1032222222222));
                                                    nkb nkbVar102222222222 = nkbVar2;
                                                    Team team3222222222 = (Team) nkbVar102222222222.c(V0.getLong(r3));
                                                    nkb nkbVar112222222222 = nkbVar5;
                                                    Team team22222222222 = (Team) nkbVar112222222222.c(V0.getLong(i6));
                                                    nkb nkbVar122222222222 = nkbVar4;
                                                    Tournament tournament2222222222 = (Tournament) nkbVar122222222222.c(V0.getLong(r13));
                                                    nkb nkbVar132222222222 = nkbVar3;
                                                    ArrayList arrayList72222222222 = arrayList4;
                                                    arrayList72222222222.add(new DbEventAll(dbEvent2222222222, team3222222222, team22222222222, tournament2222222222, (DbEventScore) nkbVar132222222222.c(V0.getLong(r12))));
                                                    int i1042222222222 = i49;
                                                    r53 = i45;
                                                    r2 = i27;
                                                    r40 = i40;
                                                    r47 = i1042222222222;
                                                    int i1052222222222 = i38;
                                                    r49 = i37;
                                                    nkbVar7 = nkbVar112222222222;
                                                    r44 = i1052222222222;
                                                    arrayList6 = arrayList72222222222;
                                                    r43 = i39;
                                                    sz8Var2 = sz8Var;
                                                    r42 = i47;
                                                    r51 = i55;
                                                    i59 = i8;
                                                    r54 = i56;
                                                    r48 = i36;
                                                    i60 = i9;
                                                    r14 = i13;
                                                    r16 = i20;
                                                    r24 = i25;
                                                    r50 = i42;
                                                    r30 = i92;
                                                    r36 = i26;
                                                    r38 = i32;
                                                    nkbVar8 = nkbVar122222222222;
                                                    r41 = i41;
                                                    r45 = i50;
                                                    r52 = i54;
                                                    r55 = i53;
                                                    r35 = i1032222222222;
                                                    r6 = i6;
                                                    r46 = i34;
                                                    r56 = i51;
                                                    nkbVar6 = nkbVar102222222222;
                                                    i62 = i10;
                                                    num = null;
                                                    r33 = i1012222222222;
                                                    nkbVar9 = nkbVar132222222222;
                                                    r = i24;
                                                    r29 = i91;
                                                    r39 = i99;
                                                } else {
                                                    status = status2;
                                                    i27 = r2;
                                                    i28 = r41;
                                                    i29 = r42;
                                                    i30 = r43;
                                                    i31 = r44;
                                                }
                                                i32 = i98;
                                                nkbVar3 = nkbVar9;
                                                arrayList4 = arrayList3;
                                                i33 = r45;
                                                i34 = r46;
                                                i35 = r47;
                                                if (V0.isNull(i100)) {
                                                }
                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                i36 = r48;
                                                if (V0.isNull(i36)) {
                                                }
                                                if (V0.isNull(i36)) {
                                                }
                                                i39 = i30;
                                                i41 = i28;
                                                i38 = i31;
                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                i42 = r50;
                                                if (V0.isNull(i42)) {
                                                }
                                                i47 = i29;
                                                i48 = r55;
                                                if (V0.isNull(i42)) {
                                                }
                                                if (!V0.isNull(i43)) {
                                                }
                                                if (!V0.isNull(i44)) {
                                                }
                                                if (!V0.isNull(i45)) {
                                                }
                                                if (valueOf22 == null) {
                                                }
                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                i51 = r56;
                                                if (V0.isNull(i51)) {
                                                }
                                                if (V0.isNull(i51)) {
                                                }
                                                if (valueOf19 != null) {
                                                }
                                                if (V0.isNull(i52)) {
                                                }
                                                if (valueOf20 != null) {
                                                }
                                                varInProgress = new VarInProgress(bool4, bool5);
                                                DbEvent dbEvent22222222222 = new DbEvent(season, status, num2, valueOf24, i5, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y, varInProgress, A, F06, F07);
                                                int i10122222222222 = r33;
                                                dbEvent22222222222.setHide(((int) V0.getLong(i10122222222222)) == 0);
                                                r57 = i52;
                                                int i10222222222222 = r34;
                                                dbEvent22222222222.setMute((int) V0.getLong(i10222222222222));
                                                r34 = i10222222222222;
                                                int i10322222222222 = r35;
                                                dbEvent22222222222.setLastUpdate(V0.getLong(i10322222222222));
                                                nkb nkbVar1022222222222 = nkbVar2;
                                                Team team32222222222 = (Team) nkbVar1022222222222.c(V0.getLong(r3));
                                                nkb nkbVar1122222222222 = nkbVar5;
                                                Team team222222222222 = (Team) nkbVar1122222222222.c(V0.getLong(i6));
                                                nkb nkbVar1222222222222 = nkbVar4;
                                                Tournament tournament22222222222 = (Tournament) nkbVar1222222222222.c(V0.getLong(r13));
                                                nkb nkbVar1322222222222 = nkbVar3;
                                                ArrayList arrayList722222222222 = arrayList4;
                                                arrayList722222222222.add(new DbEventAll(dbEvent22222222222, team32222222222, team222222222222, tournament22222222222, (DbEventScore) nkbVar1322222222222.c(V0.getLong(r12))));
                                                int i10422222222222 = i49;
                                                r53 = i45;
                                                r2 = i27;
                                                r40 = i40;
                                                r47 = i10422222222222;
                                                int i10522222222222 = i38;
                                                r49 = i37;
                                                nkbVar7 = nkbVar1122222222222;
                                                r44 = i10522222222222;
                                                arrayList6 = arrayList722222222222;
                                                r43 = i39;
                                                sz8Var2 = sz8Var;
                                                r42 = i47;
                                                r51 = i55;
                                                i59 = i8;
                                                r54 = i56;
                                                r48 = i36;
                                                i60 = i9;
                                                r14 = i13;
                                                r16 = i20;
                                                r24 = i25;
                                                r50 = i42;
                                                r30 = i92;
                                                r36 = i26;
                                                r38 = i32;
                                                nkbVar8 = nkbVar1222222222222;
                                                r41 = i41;
                                                r45 = i50;
                                                r52 = i54;
                                                r55 = i53;
                                                r35 = i10322222222222;
                                                r6 = i6;
                                                r46 = i34;
                                                r56 = i51;
                                                nkbVar6 = nkbVar1022222222222;
                                                i62 = i10;
                                                num = null;
                                                r33 = i10122222222222;
                                                nkbVar9 = nkbVar1322222222222;
                                                r = i24;
                                                r29 = i91;
                                                r39 = i99;
                                            }
                                            ArrayList arrayList8 = arrayList6;
                                            V0.close();
                                            return arrayList8;
                                        } catch (Throwable th) {
                                            V0.close();
                                            throw th;
                                        }
                                }
                            }
                        });
                        if (obj == lu3Var) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((Iterable) obj).iterator();
                while (it2.hasNext()) {
                    Event y = qa6.y((DbEventAll) it2.next());
                    if (y != null) {
                        arrayList3.add(y);
                    }
                }
                int c = sub.c(k13.r(arrayList3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(c >= 16 ? c : 16);
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(new Integer(((Event) next).getId()), next);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (arrayList.isEmpty()) {
                        lm5 lm5Var2 = lm5.a;
                        lm5Var2.getClass();
                        break;
                    } else {
                        final v76 v76Var2 = qa6Var.a;
                        final ArrayList arrayList4 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            w1l.A(arrayList4, ((WidgetItemRef) it4.next()).getId());
                        }
                        this.s = 1;
                        v76Var2.getClass();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SELECT * FROM my_stage_table WHERE id IN (");
                        pea.m(arrayList4.size(), sb3);
                        sb3.append(")");
                        final String sb4 = sb3.toString();
                        final int i5 = 0;
                        obj = gz8.U(this, v76Var2.a, true, false, new Function1() { // from class: f76
                            /* JADX WARN: Removed duplicated region for block: B:102:0x048d  */
                            /* JADX WARN: Removed duplicated region for block: B:105:0x049e  */
                            /* JADX WARN: Removed duplicated region for block: B:108:0x04a0  */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x048f  */
                            /* JADX WARN: Removed duplicated region for block: B:113:0x03cc  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x03db  */
                            /* JADX WARN: Removed duplicated region for block: B:120:0x040c A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:127:0x041e  */
                            /* JADX WARN: Removed duplicated region for block: B:133:0x0439 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:134:0x0425 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:135:0x03e0 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:136:0x03cf A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:137:0x0364 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:154:0x0348  */
                            /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
                            /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
                            /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
                            /* JADX WARN: Removed duplicated region for block: B:166:0x0207 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:167:0x01f4 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:168:0x01e7 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x0218 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x035d  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x0376 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:8:0x0030, B:9:0x0113, B:11:0x0119, B:16:0x013c, B:19:0x0150, B:21:0x0156, B:23:0x015c, B:26:0x0190, B:28:0x0196, B:32:0x01b9, B:34:0x01bf, B:36:0x01c5, B:38:0x01cb, B:43:0x0212, B:45:0x0218, B:47:0x0220, B:49:0x0228, B:51:0x0230, B:53:0x023a, B:55:0x0244, B:57:0x024e, B:59:0x0258, B:61:0x0262, B:63:0x026c, B:65:0x0276, B:67:0x0280, B:69:0x028a, B:72:0x0353, B:76:0x036b, B:78:0x0376, B:80:0x037c, B:82:0x0382, B:84:0x0388, B:86:0x038e, B:88:0x0394, B:90:0x039a, B:92:0x03a0, B:94:0x03a6, B:96:0x03ac, B:99:0x045b, B:100:0x0466, B:103:0x0490, B:106:0x04a1, B:111:0x03bd, B:114:0x03d5, B:118:0x03e7, B:120:0x040c, B:124:0x044b, B:125:0x0418, B:129:0x042a, B:132:0x043e, B:133:0x0439, B:134:0x0425, B:135:0x03e0, B:136:0x03cf, B:137:0x0364, B:155:0x01d9, B:158:0x01eb, B:161:0x01fc, B:165:0x020c, B:166:0x0207, B:167:0x01f4, B:168:0x01e7, B:169:0x01a0, B:172:0x01b2, B:173:0x01ae, B:175:0x016e, B:179:0x0183, B:180:0x017e, B:181:0x014a, B:182:0x012e), top: B:2:0x0011 }] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private final Object a(Object obj2) {
                                ServerType b;
                                int i42;
                                int i52;
                                int i6;
                                Status status;
                                StageWinner stageWinner;
                                int i7;
                                StageEvent stageEvent;
                                int i8;
                                int i9;
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
                                ArrayList arrayList32;
                                int i30;
                                int i31;
                                int i32;
                                int i33;
                                int i34;
                                StageEvent stageEvent2;
                                StageSeason stageSeason;
                                int i35;
                                int i36;
                                Sport sport;
                                Sport sport2;
                                FieldTranslations fieldTranslations;
                                UniqueStage uniqueStage;
                                f76 f76Var = this;
                                ArrayList arrayList42 = arrayList4;
                                glg glgVar = (glg) obj2;
                                glgVar.getClass();
                                nlg V0 = glgVar.V0(sb4);
                                try {
                                    Iterator it22 = arrayList42.iterator();
                                    int i37 = 1;
                                    while (it22.hasNext()) {
                                        V0.q(i37, ((Number) it22.next()).intValue());
                                        i37++;
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
                                    int i38 = r8;
                                    int r15 = w1a.r(V0, "parent_event_description");
                                    int i39 = r7;
                                    int r16 = w1a.r(V0, "parent_event_startTimestamp");
                                    int i40 = r6;
                                    int r17 = w1a.r(V0, "parent_event_flag");
                                    int i41 = r4;
                                    int r18 = w1a.r(V0, "stage_season_description");
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
                                    ArrayList arrayList5 = new ArrayList();
                                    while (V0.U0()) {
                                        String F0 = V0.F0(r);
                                        boolean isNull = V0.isNull(r2);
                                        int i422 = r;
                                        v76 v76Var22 = v76Var2;
                                        if (isNull) {
                                            b = null;
                                        } else {
                                            String F02 = V0.F0(r2);
                                            v76Var22.getClass();
                                            b = v76.b(F02);
                                        }
                                        int i43 = (int) V0.getLong(r3);
                                        String F03 = V0.isNull(r5) ? null : V0.F0(r5);
                                        if (V0.isNull(r9) && V0.isNull(r10) && V0.isNull(r11)) {
                                            i42 = i43;
                                            i52 = r2;
                                            i6 = r3;
                                            status = null;
                                        } else {
                                            i42 = i43;
                                            i52 = r2;
                                            i6 = r3;
                                            status = new Status((int) V0.getLong(r9), V0.isNull(r10) ? null : V0.F0(r10), V0.F0(r11));
                                        }
                                        if (V0.isNull(r12) && V0.isNull(r13)) {
                                            stageWinner = null;
                                            if (V0.isNull(r14) && V0.isNull(r15) && V0.isNull(r16) && V0.isNull(r17)) {
                                                i7 = r14;
                                                stageEvent = null;
                                                i8 = r18;
                                                if (V0.isNull(i8)) {
                                                    i9 = r5;
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
                                                                i9 = r5;
                                                                i13 = r22;
                                                                if (V0.isNull(i13)) {
                                                                    i14 = r17;
                                                                    i18 = r23;
                                                                    if (V0.isNull(i18)) {
                                                                        i15 = r16;
                                                                        i19 = r24;
                                                                        if (V0.isNull(i19)) {
                                                                            i16 = r15;
                                                                            i20 = r25;
                                                                            if (V0.isNull(i20)) {
                                                                                i17 = r9;
                                                                                i21 = r26;
                                                                                if (V0.isNull(i21)) {
                                                                                    i22 = r10;
                                                                                    i26 = r27;
                                                                                    if (V0.isNull(i26)) {
                                                                                        i23 = r11;
                                                                                        i27 = r28;
                                                                                        if (V0.isNull(i27)) {
                                                                                            i24 = r12;
                                                                                            i28 = r29;
                                                                                            if (V0.isNull(i28)) {
                                                                                                i25 = r13;
                                                                                                i29 = r30;
                                                                                                if (V0.isNull(i29)) {
                                                                                                    arrayList32 = arrayList5;
                                                                                                    i30 = r31;
                                                                                                    if (V0.isNull(i30)) {
                                                                                                        i33 = i8;
                                                                                                        i34 = i10;
                                                                                                        stageEvent2 = stageEvent;
                                                                                                        i31 = i11;
                                                                                                        i32 = i12;
                                                                                                        stageSeason = null;
                                                                                                        Stage stage22222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                                        int i4422222222222222 = i41;
                                                                                                        stage22222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222));
                                                                                                        int i4522222222222222 = i40;
                                                                                                        int i4622222222222222 = i30;
                                                                                                        stage22222222222222.setLastUpdate(V0.getLong(i4522222222222222));
                                                                                                        i41 = i4422222222222222;
                                                                                                        int i4722222222222222 = i39;
                                                                                                        stage22222222222222.setMuted(((int) V0.getLong(i4722222222222222)) != 0);
                                                                                                        i39 = i4722222222222222;
                                                                                                        int i4822222222222222 = i38;
                                                                                                        stage22222222222222.setHidden(((int) V0.getLong(i4822222222222222)) != 0);
                                                                                                        stage22222222222222.setParentEvent(stageEvent2);
                                                                                                        stage22222222222222.setStageSeason(stageSeason);
                                                                                                        ArrayList arrayList622222222222222 = arrayList32;
                                                                                                        arrayList622222222222222.add(stage22222222222222);
                                                                                                        int i4922222222222222 = i17;
                                                                                                        r22 = i13;
                                                                                                        r5 = i9;
                                                                                                        r18 = i33;
                                                                                                        r30 = i29;
                                                                                                        r13 = i25;
                                                                                                        r26 = i21;
                                                                                                        r9 = i4922222222222222;
                                                                                                        f76Var = this;
                                                                                                        i38 = i4822222222222222;
                                                                                                        r27 = i26;
                                                                                                        r28 = i27;
                                                                                                        r10 = i22;
                                                                                                        r11 = i23;
                                                                                                        r2 = i52;
                                                                                                        r3 = i6;
                                                                                                        r14 = i7;
                                                                                                        r23 = i18;
                                                                                                        r24 = i19;
                                                                                                        r17 = i14;
                                                                                                        r16 = i15;
                                                                                                        r19 = i34;
                                                                                                        r20 = i31;
                                                                                                        r29 = i28;
                                                                                                        r12 = i24;
                                                                                                        r25 = i20;
                                                                                                        r15 = i16;
                                                                                                        r21 = i32;
                                                                                                        r31 = i4622222222222222;
                                                                                                        i40 = i4522222222222222;
                                                                                                        arrayList5 = arrayList622222222222222;
                                                                                                        r = i422;
                                                                                                    }
                                                                                                    stageEvent2 = stageEvent;
                                                                                                    String F04222222222222 = V0.F0(i8);
                                                                                                    String F05 = V0.isNull(i10) ? null : V0.F0(i10);
                                                                                                    i33 = i8;
                                                                                                    i34 = i10;
                                                                                                    i35 = (int) V0.getLong(i11);
                                                                                                    if (!V0.isNull(i12) && V0.isNull(i13) && V0.isNull(i18) && V0.isNull(i19) && V0.isNull(i20) && V0.isNull(i21) && V0.isNull(i26) && V0.isNull(i27) && V0.isNull(i28) && V0.isNull(i29) && V0.isNull(i30)) {
                                                                                                        i36 = i35;
                                                                                                        i31 = i11;
                                                                                                        uniqueStage = null;
                                                                                                    } else {
                                                                                                        i36 = i35;
                                                                                                        int i50222222222222 = (int) V0.getLong(i12);
                                                                                                        String F06222222222222 = V0.F0(i13);
                                                                                                        String F07 = V0.isNull(i18) ? null : V0.F0(i18);
                                                                                                        String F08 = V0.isNull(i19) ? null : V0.F0(i19);
                                                                                                        int i51222222222222 = (int) V0.getLong(i20);
                                                                                                        String F09222222222222 = V0.F0(i21);
                                                                                                        String F010222222222222 = V0.F0(i26);
                                                                                                        i31 = i11;
                                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                                        if (V0.isNull(i29) && V0.isNull(i30)) {
                                                                                                            sport2 = sport;
                                                                                                            fieldTranslations = null;
                                                                                                            uniqueStage = new UniqueStage(i50222222222222, F06222222222222, new Category(i51222222222222, F09222222222222, F010222222222222, sport2, fieldTranslations), F07, F08);
                                                                                                        }
                                                                                                        sport2 = sport;
                                                                                                        fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                                        uniqueStage = new UniqueStage(i50222222222222, F06222222222222, new Category(i51222222222222, F09222222222222, F010222222222222, sport2, fieldTranslations), F07, F08);
                                                                                                    }
                                                                                                    String str2222222222222 = F05;
                                                                                                    i32 = i12;
                                                                                                    stageSeason = new StageSeason(uniqueStage, F04222222222222, str2222222222222, i36);
                                                                                                    Stage stage222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                                    int i44222222222222222 = i41;
                                                                                                    stage222222222222222.setStartDateTimestamp(V0.getLong(i44222222222222222));
                                                                                                    int i45222222222222222 = i40;
                                                                                                    int i46222222222222222 = i30;
                                                                                                    stage222222222222222.setLastUpdate(V0.getLong(i45222222222222222));
                                                                                                    i41 = i44222222222222222;
                                                                                                    int i47222222222222222 = i39;
                                                                                                    stage222222222222222.setMuted(((int) V0.getLong(i47222222222222222)) != 0);
                                                                                                    i39 = i47222222222222222;
                                                                                                    int i48222222222222222 = i38;
                                                                                                    stage222222222222222.setHidden(((int) V0.getLong(i48222222222222222)) != 0);
                                                                                                    stage222222222222222.setParentEvent(stageEvent2);
                                                                                                    stage222222222222222.setStageSeason(stageSeason);
                                                                                                    ArrayList arrayList6222222222222222 = arrayList32;
                                                                                                    arrayList6222222222222222.add(stage222222222222222);
                                                                                                    int i49222222222222222 = i17;
                                                                                                    r22 = i13;
                                                                                                    r5 = i9;
                                                                                                    r18 = i33;
                                                                                                    r30 = i29;
                                                                                                    r13 = i25;
                                                                                                    r26 = i21;
                                                                                                    r9 = i49222222222222222;
                                                                                                    f76Var = this;
                                                                                                    i38 = i48222222222222222;
                                                                                                    r27 = i26;
                                                                                                    r28 = i27;
                                                                                                    r10 = i22;
                                                                                                    r11 = i23;
                                                                                                    r2 = i52;
                                                                                                    r3 = i6;
                                                                                                    r14 = i7;
                                                                                                    r23 = i18;
                                                                                                    r24 = i19;
                                                                                                    r17 = i14;
                                                                                                    r16 = i15;
                                                                                                    r19 = i34;
                                                                                                    r20 = i31;
                                                                                                    r29 = i28;
                                                                                                    r12 = i24;
                                                                                                    r25 = i20;
                                                                                                    r15 = i16;
                                                                                                    r21 = i32;
                                                                                                    r31 = i46222222222222222;
                                                                                                    i40 = i45222222222222222;
                                                                                                    arrayList5 = arrayList6222222222222222;
                                                                                                    r = i422;
                                                                                                }
                                                                                                arrayList32 = arrayList5;
                                                                                                i30 = r31;
                                                                                                stageEvent2 = stageEvent;
                                                                                                String F042222222222222 = V0.F0(i8);
                                                                                                if (V0.isNull(i10)) {
                                                                                                }
                                                                                                i33 = i8;
                                                                                                i34 = i10;
                                                                                                i35 = (int) V0.getLong(i11);
                                                                                                if (!V0.isNull(i12)) {
                                                                                                }
                                                                                                i36 = i35;
                                                                                                int i502222222222222 = (int) V0.getLong(i12);
                                                                                                String F062222222222222 = V0.F0(i13);
                                                                                                if (V0.isNull(i18)) {
                                                                                                }
                                                                                                if (V0.isNull(i19)) {
                                                                                                }
                                                                                                int i512222222222222 = (int) V0.getLong(i20);
                                                                                                String F092222222222222 = V0.F0(i21);
                                                                                                String F0102222222222222 = V0.F0(i26);
                                                                                                i31 = i11;
                                                                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                                if (V0.isNull(i29)) {
                                                                                                    sport2 = sport;
                                                                                                    fieldTranslations = null;
                                                                                                    uniqueStage = new UniqueStage(i502222222222222, F062222222222222, new Category(i512222222222222, F092222222222222, F0102222222222222, sport2, fieldTranslations), F07, F08);
                                                                                                    String str22222222222222 = F05;
                                                                                                    i32 = i12;
                                                                                                    stageSeason = new StageSeason(uniqueStage, F042222222222222, str22222222222222, i36);
                                                                                                    Stage stage2222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                                    int i442222222222222222 = i41;
                                                                                                    stage2222222222222222.setStartDateTimestamp(V0.getLong(i442222222222222222));
                                                                                                    int i452222222222222222 = i40;
                                                                                                    int i462222222222222222 = i30;
                                                                                                    stage2222222222222222.setLastUpdate(V0.getLong(i452222222222222222));
                                                                                                    i41 = i442222222222222222;
                                                                                                    int i472222222222222222 = i39;
                                                                                                    stage2222222222222222.setMuted(((int) V0.getLong(i472222222222222222)) != 0);
                                                                                                    i39 = i472222222222222222;
                                                                                                    int i482222222222222222 = i38;
                                                                                                    stage2222222222222222.setHidden(((int) V0.getLong(i482222222222222222)) != 0);
                                                                                                    stage2222222222222222.setParentEvent(stageEvent2);
                                                                                                    stage2222222222222222.setStageSeason(stageSeason);
                                                                                                    ArrayList arrayList62222222222222222 = arrayList32;
                                                                                                    arrayList62222222222222222.add(stage2222222222222222);
                                                                                                    int i492222222222222222 = i17;
                                                                                                    r22 = i13;
                                                                                                    r5 = i9;
                                                                                                    r18 = i33;
                                                                                                    r30 = i29;
                                                                                                    r13 = i25;
                                                                                                    r26 = i21;
                                                                                                    r9 = i492222222222222222;
                                                                                                    f76Var = this;
                                                                                                    i38 = i482222222222222222;
                                                                                                    r27 = i26;
                                                                                                    r28 = i27;
                                                                                                    r10 = i22;
                                                                                                    r11 = i23;
                                                                                                    r2 = i52;
                                                                                                    r3 = i6;
                                                                                                    r14 = i7;
                                                                                                    r23 = i18;
                                                                                                    r24 = i19;
                                                                                                    r17 = i14;
                                                                                                    r16 = i15;
                                                                                                    r19 = i34;
                                                                                                    r20 = i31;
                                                                                                    r29 = i28;
                                                                                                    r12 = i24;
                                                                                                    r25 = i20;
                                                                                                    r15 = i16;
                                                                                                    r21 = i32;
                                                                                                    r31 = i462222222222222222;
                                                                                                    i40 = i452222222222222222;
                                                                                                    arrayList5 = arrayList62222222222222222;
                                                                                                    r = i422;
                                                                                                }
                                                                                                sport2 = sport;
                                                                                                fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                                uniqueStage = new UniqueStage(i502222222222222, F062222222222222, new Category(i512222222222222, F092222222222222, F0102222222222222, sport2, fieldTranslations), F07, F08);
                                                                                                String str222222222222222 = F05;
                                                                                                i32 = i12;
                                                                                                stageSeason = new StageSeason(uniqueStage, F042222222222222, str222222222222222, i36);
                                                                                                Stage stage22222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                                int i4422222222222222222 = i41;
                                                                                                stage22222222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222222));
                                                                                                int i4522222222222222222 = i40;
                                                                                                int i4622222222222222222 = i30;
                                                                                                stage22222222222222222.setLastUpdate(V0.getLong(i4522222222222222222));
                                                                                                i41 = i4422222222222222222;
                                                                                                int i4722222222222222222 = i39;
                                                                                                stage22222222222222222.setMuted(((int) V0.getLong(i4722222222222222222)) != 0);
                                                                                                i39 = i4722222222222222222;
                                                                                                int i4822222222222222222 = i38;
                                                                                                stage22222222222222222.setHidden(((int) V0.getLong(i4822222222222222222)) != 0);
                                                                                                stage22222222222222222.setParentEvent(stageEvent2);
                                                                                                stage22222222222222222.setStageSeason(stageSeason);
                                                                                                ArrayList arrayList622222222222222222 = arrayList32;
                                                                                                arrayList622222222222222222.add(stage22222222222222222);
                                                                                                int i4922222222222222222 = i17;
                                                                                                r22 = i13;
                                                                                                r5 = i9;
                                                                                                r18 = i33;
                                                                                                r30 = i29;
                                                                                                r13 = i25;
                                                                                                r26 = i21;
                                                                                                r9 = i4922222222222222222;
                                                                                                f76Var = this;
                                                                                                i38 = i4822222222222222222;
                                                                                                r27 = i26;
                                                                                                r28 = i27;
                                                                                                r10 = i22;
                                                                                                r11 = i23;
                                                                                                r2 = i52;
                                                                                                r3 = i6;
                                                                                                r14 = i7;
                                                                                                r23 = i18;
                                                                                                r24 = i19;
                                                                                                r17 = i14;
                                                                                                r16 = i15;
                                                                                                r19 = i34;
                                                                                                r20 = i31;
                                                                                                r29 = i28;
                                                                                                r12 = i24;
                                                                                                r25 = i20;
                                                                                                r15 = i16;
                                                                                                r21 = i32;
                                                                                                r31 = i4622222222222222222;
                                                                                                i40 = i4522222222222222222;
                                                                                                arrayList5 = arrayList622222222222222222;
                                                                                                r = i422;
                                                                                            }
                                                                                            arrayList32 = arrayList5;
                                                                                            i25 = r13;
                                                                                            i29 = r30;
                                                                                            i30 = r31;
                                                                                            stageEvent2 = stageEvent;
                                                                                            String F0422222222222222 = V0.F0(i8);
                                                                                            if (V0.isNull(i10)) {
                                                                                            }
                                                                                            i33 = i8;
                                                                                            i34 = i10;
                                                                                            i35 = (int) V0.getLong(i11);
                                                                                            if (!V0.isNull(i12)) {
                                                                                            }
                                                                                            i36 = i35;
                                                                                            int i5022222222222222 = (int) V0.getLong(i12);
                                                                                            String F0622222222222222 = V0.F0(i13);
                                                                                            if (V0.isNull(i18)) {
                                                                                            }
                                                                                            if (V0.isNull(i19)) {
                                                                                            }
                                                                                            int i5122222222222222 = (int) V0.getLong(i20);
                                                                                            String F0922222222222222 = V0.F0(i21);
                                                                                            String F01022222222222222 = V0.F0(i26);
                                                                                            i31 = i11;
                                                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                            if (V0.isNull(i29)) {
                                                                                            }
                                                                                            sport2 = sport;
                                                                                            fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                            uniqueStage = new UniqueStage(i5022222222222222, F0622222222222222, new Category(i5122222222222222, F0922222222222222, F01022222222222222, sport2, fieldTranslations), F07, F08);
                                                                                            String str2222222222222222 = F05;
                                                                                            i32 = i12;
                                                                                            stageSeason = new StageSeason(uniqueStage, F0422222222222222, str2222222222222222, i36);
                                                                                            Stage stage222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                            int i44222222222222222222 = i41;
                                                                                            stage222222222222222222.setStartDateTimestamp(V0.getLong(i44222222222222222222));
                                                                                            int i45222222222222222222 = i40;
                                                                                            int i46222222222222222222 = i30;
                                                                                            stage222222222222222222.setLastUpdate(V0.getLong(i45222222222222222222));
                                                                                            i41 = i44222222222222222222;
                                                                                            int i47222222222222222222 = i39;
                                                                                            stage222222222222222222.setMuted(((int) V0.getLong(i47222222222222222222)) != 0);
                                                                                            i39 = i47222222222222222222;
                                                                                            int i48222222222222222222 = i38;
                                                                                            stage222222222222222222.setHidden(((int) V0.getLong(i48222222222222222222)) != 0);
                                                                                            stage222222222222222222.setParentEvent(stageEvent2);
                                                                                            stage222222222222222222.setStageSeason(stageSeason);
                                                                                            ArrayList arrayList6222222222222222222 = arrayList32;
                                                                                            arrayList6222222222222222222.add(stage222222222222222222);
                                                                                            int i49222222222222222222 = i17;
                                                                                            r22 = i13;
                                                                                            r5 = i9;
                                                                                            r18 = i33;
                                                                                            r30 = i29;
                                                                                            r13 = i25;
                                                                                            r26 = i21;
                                                                                            r9 = i49222222222222222222;
                                                                                            f76Var = this;
                                                                                            i38 = i48222222222222222222;
                                                                                            r27 = i26;
                                                                                            r28 = i27;
                                                                                            r10 = i22;
                                                                                            r11 = i23;
                                                                                            r2 = i52;
                                                                                            r3 = i6;
                                                                                            r14 = i7;
                                                                                            r23 = i18;
                                                                                            r24 = i19;
                                                                                            r17 = i14;
                                                                                            r16 = i15;
                                                                                            r19 = i34;
                                                                                            r20 = i31;
                                                                                            r29 = i28;
                                                                                            r12 = i24;
                                                                                            r25 = i20;
                                                                                            r15 = i16;
                                                                                            r21 = i32;
                                                                                            r31 = i46222222222222222222;
                                                                                            i40 = i45222222222222222222;
                                                                                            arrayList5 = arrayList6222222222222222222;
                                                                                            r = i422;
                                                                                        }
                                                                                        arrayList32 = arrayList5;
                                                                                        i24 = r12;
                                                                                        i25 = r13;
                                                                                        i28 = r29;
                                                                                        i29 = r30;
                                                                                        i30 = r31;
                                                                                        stageEvent2 = stageEvent;
                                                                                        String F04222222222222222 = V0.F0(i8);
                                                                                        if (V0.isNull(i10)) {
                                                                                        }
                                                                                        i33 = i8;
                                                                                        i34 = i10;
                                                                                        i35 = (int) V0.getLong(i11);
                                                                                        if (!V0.isNull(i12)) {
                                                                                        }
                                                                                        i36 = i35;
                                                                                        int i50222222222222222 = (int) V0.getLong(i12);
                                                                                        String F06222222222222222 = V0.F0(i13);
                                                                                        if (V0.isNull(i18)) {
                                                                                        }
                                                                                        if (V0.isNull(i19)) {
                                                                                        }
                                                                                        int i51222222222222222 = (int) V0.getLong(i20);
                                                                                        String F09222222222222222 = V0.F0(i21);
                                                                                        String F010222222222222222 = V0.F0(i26);
                                                                                        i31 = i11;
                                                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                        if (V0.isNull(i29)) {
                                                                                        }
                                                                                        sport2 = sport;
                                                                                        fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                        uniqueStage = new UniqueStage(i50222222222222222, F06222222222222222, new Category(i51222222222222222, F09222222222222222, F010222222222222222, sport2, fieldTranslations), F07, F08);
                                                                                        String str22222222222222222 = F05;
                                                                                        i32 = i12;
                                                                                        stageSeason = new StageSeason(uniqueStage, F04222222222222222, str22222222222222222, i36);
                                                                                        Stage stage2222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                        int i442222222222222222222 = i41;
                                                                                        stage2222222222222222222.setStartDateTimestamp(V0.getLong(i442222222222222222222));
                                                                                        int i452222222222222222222 = i40;
                                                                                        int i462222222222222222222 = i30;
                                                                                        stage2222222222222222222.setLastUpdate(V0.getLong(i452222222222222222222));
                                                                                        i41 = i442222222222222222222;
                                                                                        int i472222222222222222222 = i39;
                                                                                        stage2222222222222222222.setMuted(((int) V0.getLong(i472222222222222222222)) != 0);
                                                                                        i39 = i472222222222222222222;
                                                                                        int i482222222222222222222 = i38;
                                                                                        stage2222222222222222222.setHidden(((int) V0.getLong(i482222222222222222222)) != 0);
                                                                                        stage2222222222222222222.setParentEvent(stageEvent2);
                                                                                        stage2222222222222222222.setStageSeason(stageSeason);
                                                                                        ArrayList arrayList62222222222222222222 = arrayList32;
                                                                                        arrayList62222222222222222222.add(stage2222222222222222222);
                                                                                        int i492222222222222222222 = i17;
                                                                                        r22 = i13;
                                                                                        r5 = i9;
                                                                                        r18 = i33;
                                                                                        r30 = i29;
                                                                                        r13 = i25;
                                                                                        r26 = i21;
                                                                                        r9 = i492222222222222222222;
                                                                                        f76Var = this;
                                                                                        i38 = i482222222222222222222;
                                                                                        r27 = i26;
                                                                                        r28 = i27;
                                                                                        r10 = i22;
                                                                                        r11 = i23;
                                                                                        r2 = i52;
                                                                                        r3 = i6;
                                                                                        r14 = i7;
                                                                                        r23 = i18;
                                                                                        r24 = i19;
                                                                                        r17 = i14;
                                                                                        r16 = i15;
                                                                                        r19 = i34;
                                                                                        r20 = i31;
                                                                                        r29 = i28;
                                                                                        r12 = i24;
                                                                                        r25 = i20;
                                                                                        r15 = i16;
                                                                                        r21 = i32;
                                                                                        r31 = i462222222222222222222;
                                                                                        i40 = i452222222222222222222;
                                                                                        arrayList5 = arrayList62222222222222222222;
                                                                                        r = i422;
                                                                                    }
                                                                                    arrayList32 = arrayList5;
                                                                                    i23 = r11;
                                                                                    i24 = r12;
                                                                                    i25 = r13;
                                                                                    i27 = r28;
                                                                                    i28 = r29;
                                                                                    i29 = r30;
                                                                                    i30 = r31;
                                                                                    stageEvent2 = stageEvent;
                                                                                    String F042222222222222222 = V0.F0(i8);
                                                                                    if (V0.isNull(i10)) {
                                                                                    }
                                                                                    i33 = i8;
                                                                                    i34 = i10;
                                                                                    i35 = (int) V0.getLong(i11);
                                                                                    if (!V0.isNull(i12)) {
                                                                                    }
                                                                                    i36 = i35;
                                                                                    int i502222222222222222 = (int) V0.getLong(i12);
                                                                                    String F062222222222222222 = V0.F0(i13);
                                                                                    if (V0.isNull(i18)) {
                                                                                    }
                                                                                    if (V0.isNull(i19)) {
                                                                                    }
                                                                                    int i512222222222222222 = (int) V0.getLong(i20);
                                                                                    String F092222222222222222 = V0.F0(i21);
                                                                                    String F0102222222222222222 = V0.F0(i26);
                                                                                    i31 = i11;
                                                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                    if (V0.isNull(i29)) {
                                                                                    }
                                                                                    sport2 = sport;
                                                                                    fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                    uniqueStage = new UniqueStage(i502222222222222222, F062222222222222222, new Category(i512222222222222222, F092222222222222222, F0102222222222222222, sport2, fieldTranslations), F07, F08);
                                                                                    String str222222222222222222 = F05;
                                                                                    i32 = i12;
                                                                                    stageSeason = new StageSeason(uniqueStage, F042222222222222222, str222222222222222222, i36);
                                                                                    Stage stage22222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                    int i4422222222222222222222 = i41;
                                                                                    stage22222222222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222222222));
                                                                                    int i4522222222222222222222 = i40;
                                                                                    int i4622222222222222222222 = i30;
                                                                                    stage22222222222222222222.setLastUpdate(V0.getLong(i4522222222222222222222));
                                                                                    i41 = i4422222222222222222222;
                                                                                    int i4722222222222222222222 = i39;
                                                                                    stage22222222222222222222.setMuted(((int) V0.getLong(i4722222222222222222222)) != 0);
                                                                                    i39 = i4722222222222222222222;
                                                                                    int i4822222222222222222222 = i38;
                                                                                    stage22222222222222222222.setHidden(((int) V0.getLong(i4822222222222222222222)) != 0);
                                                                                    stage22222222222222222222.setParentEvent(stageEvent2);
                                                                                    stage22222222222222222222.setStageSeason(stageSeason);
                                                                                    ArrayList arrayList622222222222222222222 = arrayList32;
                                                                                    arrayList622222222222222222222.add(stage22222222222222222222);
                                                                                    int i4922222222222222222222 = i17;
                                                                                    r22 = i13;
                                                                                    r5 = i9;
                                                                                    r18 = i33;
                                                                                    r30 = i29;
                                                                                    r13 = i25;
                                                                                    r26 = i21;
                                                                                    r9 = i4922222222222222222222;
                                                                                    f76Var = this;
                                                                                    i38 = i4822222222222222222222;
                                                                                    r27 = i26;
                                                                                    r28 = i27;
                                                                                    r10 = i22;
                                                                                    r11 = i23;
                                                                                    r2 = i52;
                                                                                    r3 = i6;
                                                                                    r14 = i7;
                                                                                    r23 = i18;
                                                                                    r24 = i19;
                                                                                    r17 = i14;
                                                                                    r16 = i15;
                                                                                    r19 = i34;
                                                                                    r20 = i31;
                                                                                    r29 = i28;
                                                                                    r12 = i24;
                                                                                    r25 = i20;
                                                                                    r15 = i16;
                                                                                    r21 = i32;
                                                                                    r31 = i4622222222222222222222;
                                                                                    i40 = i4522222222222222222222;
                                                                                    arrayList5 = arrayList622222222222222222222;
                                                                                    r = i422;
                                                                                }
                                                                                i22 = r10;
                                                                                i23 = r11;
                                                                                i24 = r12;
                                                                                i25 = r13;
                                                                                i26 = r27;
                                                                                i27 = r28;
                                                                                i28 = r29;
                                                                                i29 = r30;
                                                                                arrayList32 = arrayList5;
                                                                                i30 = r31;
                                                                                stageEvent2 = stageEvent;
                                                                                String F0422222222222222222 = V0.F0(i8);
                                                                                if (V0.isNull(i10)) {
                                                                                }
                                                                                i33 = i8;
                                                                                i34 = i10;
                                                                                i35 = (int) V0.getLong(i11);
                                                                                if (!V0.isNull(i12)) {
                                                                                }
                                                                                i36 = i35;
                                                                                int i5022222222222222222 = (int) V0.getLong(i12);
                                                                                String F0622222222222222222 = V0.F0(i13);
                                                                                if (V0.isNull(i18)) {
                                                                                }
                                                                                if (V0.isNull(i19)) {
                                                                                }
                                                                                int i5122222222222222222 = (int) V0.getLong(i20);
                                                                                String F0922222222222222222 = V0.F0(i21);
                                                                                String F01022222222222222222 = V0.F0(i26);
                                                                                i31 = i11;
                                                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                                                if (V0.isNull(i29)) {
                                                                                }
                                                                                sport2 = sport;
                                                                                fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                                                uniqueStage = new UniqueStage(i5022222222222222222, F0622222222222222222, new Category(i5122222222222222222, F0922222222222222222, F01022222222222222222, sport2, fieldTranslations), F07, F08);
                                                                                String str2222222222222222222 = F05;
                                                                                i32 = i12;
                                                                                stageSeason = new StageSeason(uniqueStage, F0422222222222222222, str2222222222222222222, i36);
                                                                                Stage stage222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                                                int i44222222222222222222222 = i41;
                                                                                stage222222222222222222222.setStartDateTimestamp(V0.getLong(i44222222222222222222222));
                                                                                int i45222222222222222222222 = i40;
                                                                                int i46222222222222222222222 = i30;
                                                                                stage222222222222222222222.setLastUpdate(V0.getLong(i45222222222222222222222));
                                                                                i41 = i44222222222222222222222;
                                                                                int i47222222222222222222222 = i39;
                                                                                stage222222222222222222222.setMuted(((int) V0.getLong(i47222222222222222222222)) != 0);
                                                                                i39 = i47222222222222222222222;
                                                                                int i48222222222222222222222 = i38;
                                                                                stage222222222222222222222.setHidden(((int) V0.getLong(i48222222222222222222222)) != 0);
                                                                                stage222222222222222222222.setParentEvent(stageEvent2);
                                                                                stage222222222222222222222.setStageSeason(stageSeason);
                                                                                ArrayList arrayList6222222222222222222222 = arrayList32;
                                                                                arrayList6222222222222222222222.add(stage222222222222222222222);
                                                                                int i49222222222222222222222 = i17;
                                                                                r22 = i13;
                                                                                r5 = i9;
                                                                                r18 = i33;
                                                                                r30 = i29;
                                                                                r13 = i25;
                                                                                r26 = i21;
                                                                                r9 = i49222222222222222222222;
                                                                                f76Var = this;
                                                                                i38 = i48222222222222222222222;
                                                                                r27 = i26;
                                                                                r28 = i27;
                                                                                r10 = i22;
                                                                                r11 = i23;
                                                                                r2 = i52;
                                                                                r3 = i6;
                                                                                r14 = i7;
                                                                                r23 = i18;
                                                                                r24 = i19;
                                                                                r17 = i14;
                                                                                r16 = i15;
                                                                                r19 = i34;
                                                                                r20 = i31;
                                                                                r29 = i28;
                                                                                r12 = i24;
                                                                                r25 = i20;
                                                                                r15 = i16;
                                                                                r21 = i32;
                                                                                r31 = i46222222222222222222222;
                                                                                i40 = i45222222222222222222222;
                                                                                arrayList5 = arrayList6222222222222222222222;
                                                                                r = i422;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i9 = r5;
                                                                i14 = r17;
                                                                i15 = r16;
                                                                i16 = r15;
                                                                i13 = r22;
                                                                i18 = r23;
                                                                i19 = r24;
                                                                i20 = r25;
                                                            }
                                                            i17 = r9;
                                                            i22 = r10;
                                                            i23 = r11;
                                                            i24 = r12;
                                                            i21 = r26;
                                                            i26 = r27;
                                                            i27 = r28;
                                                            i28 = r29;
                                                            arrayList32 = arrayList5;
                                                            i25 = r13;
                                                            i29 = r30;
                                                            i30 = r31;
                                                            stageEvent2 = stageEvent;
                                                            String F04222222222222222222 = V0.F0(i8);
                                                            if (V0.isNull(i10)) {
                                                            }
                                                            i33 = i8;
                                                            i34 = i10;
                                                            i35 = (int) V0.getLong(i11);
                                                            if (!V0.isNull(i12)) {
                                                            }
                                                            i36 = i35;
                                                            int i50222222222222222222 = (int) V0.getLong(i12);
                                                            String F06222222222222222222 = V0.F0(i13);
                                                            if (V0.isNull(i18)) {
                                                            }
                                                            if (V0.isNull(i19)) {
                                                            }
                                                            int i51222222222222222222 = (int) V0.getLong(i20);
                                                            String F09222222222222222222 = V0.F0(i21);
                                                            String F010222222222222222222 = V0.F0(i26);
                                                            i31 = i11;
                                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                            if (V0.isNull(i29)) {
                                                            }
                                                            sport2 = sport;
                                                            fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                            uniqueStage = new UniqueStage(i50222222222222222222, F06222222222222222222, new Category(i51222222222222222222, F09222222222222222222, F010222222222222222222, sport2, fieldTranslations), F07, F08);
                                                            String str22222222222222222222 = F05;
                                                            i32 = i12;
                                                            stageSeason = new StageSeason(uniqueStage, F04222222222222222222, str22222222222222222222, i36);
                                                            Stage stage2222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                            int i442222222222222222222222 = i41;
                                                            stage2222222222222222222222.setStartDateTimestamp(V0.getLong(i442222222222222222222222));
                                                            int i452222222222222222222222 = i40;
                                                            int i462222222222222222222222 = i30;
                                                            stage2222222222222222222222.setLastUpdate(V0.getLong(i452222222222222222222222));
                                                            i41 = i442222222222222222222222;
                                                            int i472222222222222222222222 = i39;
                                                            stage2222222222222222222222.setMuted(((int) V0.getLong(i472222222222222222222222)) != 0);
                                                            i39 = i472222222222222222222222;
                                                            int i482222222222222222222222 = i38;
                                                            stage2222222222222222222222.setHidden(((int) V0.getLong(i482222222222222222222222)) != 0);
                                                            stage2222222222222222222222.setParentEvent(stageEvent2);
                                                            stage2222222222222222222222.setStageSeason(stageSeason);
                                                            ArrayList arrayList62222222222222222222222 = arrayList32;
                                                            arrayList62222222222222222222222.add(stage2222222222222222222222);
                                                            int i492222222222222222222222 = i17;
                                                            r22 = i13;
                                                            r5 = i9;
                                                            r18 = i33;
                                                            r30 = i29;
                                                            r13 = i25;
                                                            r26 = i21;
                                                            r9 = i492222222222222222222222;
                                                            f76Var = this;
                                                            i38 = i482222222222222222222222;
                                                            r27 = i26;
                                                            r28 = i27;
                                                            r10 = i22;
                                                            r11 = i23;
                                                            r2 = i52;
                                                            r3 = i6;
                                                            r14 = i7;
                                                            r23 = i18;
                                                            r24 = i19;
                                                            r17 = i14;
                                                            r16 = i15;
                                                            r19 = i34;
                                                            r20 = i31;
                                                            r29 = i28;
                                                            r12 = i24;
                                                            r25 = i20;
                                                            r15 = i16;
                                                            r21 = i32;
                                                            r31 = i462222222222222222222222;
                                                            i40 = i452222222222222222222222;
                                                            arrayList5 = arrayList62222222222222222222222;
                                                            r = i422;
                                                        } else {
                                                            i9 = r5;
                                                            i14 = r17;
                                                            i15 = r16;
                                                            i12 = r21;
                                                            i13 = r22;
                                                            i18 = r23;
                                                            i19 = r24;
                                                        }
                                                        i16 = r15;
                                                        i17 = r9;
                                                        i22 = r10;
                                                        i23 = r11;
                                                        i20 = r25;
                                                        i21 = r26;
                                                        i26 = r27;
                                                        i27 = r28;
                                                        arrayList32 = arrayList5;
                                                        i24 = r12;
                                                        i25 = r13;
                                                        i28 = r29;
                                                        i29 = r30;
                                                        i30 = r31;
                                                        stageEvent2 = stageEvent;
                                                        String F042222222222222222222 = V0.F0(i8);
                                                        if (V0.isNull(i10)) {
                                                        }
                                                        i33 = i8;
                                                        i34 = i10;
                                                        i35 = (int) V0.getLong(i11);
                                                        if (!V0.isNull(i12)) {
                                                        }
                                                        i36 = i35;
                                                        int i502222222222222222222 = (int) V0.getLong(i12);
                                                        String F062222222222222222222 = V0.F0(i13);
                                                        if (V0.isNull(i18)) {
                                                        }
                                                        if (V0.isNull(i19)) {
                                                        }
                                                        int i512222222222222222222 = (int) V0.getLong(i20);
                                                        String F092222222222222222222 = V0.F0(i21);
                                                        String F0102222222222222222222 = V0.F0(i26);
                                                        i31 = i11;
                                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                        if (V0.isNull(i29)) {
                                                        }
                                                        sport2 = sport;
                                                        fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                        uniqueStage = new UniqueStage(i502222222222222222222, F062222222222222222222, new Category(i512222222222222222222, F092222222222222222222, F0102222222222222222222, sport2, fieldTranslations), F07, F08);
                                                        String str222222222222222222222 = F05;
                                                        i32 = i12;
                                                        stageSeason = new StageSeason(uniqueStage, F042222222222222222222, str222222222222222222222, i36);
                                                        Stage stage22222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                        int i4422222222222222222222222 = i41;
                                                        stage22222222222222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222222222222));
                                                        int i4522222222222222222222222 = i40;
                                                        int i4622222222222222222222222 = i30;
                                                        stage22222222222222222222222.setLastUpdate(V0.getLong(i4522222222222222222222222));
                                                        i41 = i4422222222222222222222222;
                                                        int i4722222222222222222222222 = i39;
                                                        stage22222222222222222222222.setMuted(((int) V0.getLong(i4722222222222222222222222)) != 0);
                                                        i39 = i4722222222222222222222222;
                                                        int i4822222222222222222222222 = i38;
                                                        stage22222222222222222222222.setHidden(((int) V0.getLong(i4822222222222222222222222)) != 0);
                                                        stage22222222222222222222222.setParentEvent(stageEvent2);
                                                        stage22222222222222222222222.setStageSeason(stageSeason);
                                                        ArrayList arrayList622222222222222222222222 = arrayList32;
                                                        arrayList622222222222222222222222.add(stage22222222222222222222222);
                                                        int i4922222222222222222222222 = i17;
                                                        r22 = i13;
                                                        r5 = i9;
                                                        r18 = i33;
                                                        r30 = i29;
                                                        r13 = i25;
                                                        r26 = i21;
                                                        r9 = i4922222222222222222222222;
                                                        f76Var = this;
                                                        i38 = i4822222222222222222222222;
                                                        r27 = i26;
                                                        r28 = i27;
                                                        r10 = i22;
                                                        r11 = i23;
                                                        r2 = i52;
                                                        r3 = i6;
                                                        r14 = i7;
                                                        r23 = i18;
                                                        r24 = i19;
                                                        r17 = i14;
                                                        r16 = i15;
                                                        r19 = i34;
                                                        r20 = i31;
                                                        r29 = i28;
                                                        r12 = i24;
                                                        r25 = i20;
                                                        r15 = i16;
                                                        r21 = i32;
                                                        r31 = i4622222222222222222222222;
                                                        i40 = i4522222222222222222222222;
                                                        arrayList5 = arrayList622222222222222222222222;
                                                        r = i422;
                                                    } else {
                                                        i9 = r5;
                                                        i14 = r17;
                                                        i11 = r20;
                                                        i12 = r21;
                                                        i13 = r22;
                                                        i18 = r23;
                                                    }
                                                    i15 = r16;
                                                    i16 = r15;
                                                    i17 = r9;
                                                    i22 = r10;
                                                    i19 = r24;
                                                    i20 = r25;
                                                    i21 = r26;
                                                    i26 = r27;
                                                    arrayList32 = arrayList5;
                                                    i23 = r11;
                                                    i24 = r12;
                                                    i25 = r13;
                                                    i27 = r28;
                                                    i28 = r29;
                                                    i29 = r30;
                                                    i30 = r31;
                                                    stageEvent2 = stageEvent;
                                                    String F0422222222222222222222 = V0.F0(i8);
                                                    if (V0.isNull(i10)) {
                                                    }
                                                    i33 = i8;
                                                    i34 = i10;
                                                    i35 = (int) V0.getLong(i11);
                                                    if (!V0.isNull(i12)) {
                                                    }
                                                    i36 = i35;
                                                    int i5022222222222222222222 = (int) V0.getLong(i12);
                                                    String F0622222222222222222222 = V0.F0(i13);
                                                    if (V0.isNull(i18)) {
                                                    }
                                                    if (V0.isNull(i19)) {
                                                    }
                                                    int i5122222222222222222222 = (int) V0.getLong(i20);
                                                    String F0922222222222222222222 = V0.F0(i21);
                                                    String F01022222222222222222222 = V0.F0(i26);
                                                    i31 = i11;
                                                    sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                    if (V0.isNull(i29)) {
                                                    }
                                                    sport2 = sport;
                                                    fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                    uniqueStage = new UniqueStage(i5022222222222222222222, F0622222222222222222222, new Category(i5122222222222222222222, F0922222222222222222222, F01022222222222222222222, sport2, fieldTranslations), F07, F08);
                                                    String str2222222222222222222222 = F05;
                                                    i32 = i12;
                                                    stageSeason = new StageSeason(uniqueStage, F0422222222222222222222, str2222222222222222222222, i36);
                                                    Stage stage222222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                    int i44222222222222222222222222 = i41;
                                                    stage222222222222222222222222.setStartDateTimestamp(V0.getLong(i44222222222222222222222222));
                                                    int i45222222222222222222222222 = i40;
                                                    int i46222222222222222222222222 = i30;
                                                    stage222222222222222222222222.setLastUpdate(V0.getLong(i45222222222222222222222222));
                                                    i41 = i44222222222222222222222222;
                                                    int i47222222222222222222222222 = i39;
                                                    stage222222222222222222222222.setMuted(((int) V0.getLong(i47222222222222222222222222)) != 0);
                                                    i39 = i47222222222222222222222222;
                                                    int i48222222222222222222222222 = i38;
                                                    stage222222222222222222222222.setHidden(((int) V0.getLong(i48222222222222222222222222)) != 0);
                                                    stage222222222222222222222222.setParentEvent(stageEvent2);
                                                    stage222222222222222222222222.setStageSeason(stageSeason);
                                                    ArrayList arrayList6222222222222222222222222 = arrayList32;
                                                    arrayList6222222222222222222222222.add(stage222222222222222222222222);
                                                    int i49222222222222222222222222 = i17;
                                                    r22 = i13;
                                                    r5 = i9;
                                                    r18 = i33;
                                                    r30 = i29;
                                                    r13 = i25;
                                                    r26 = i21;
                                                    r9 = i49222222222222222222222222;
                                                    f76Var = this;
                                                    i38 = i48222222222222222222222222;
                                                    r27 = i26;
                                                    r28 = i27;
                                                    r10 = i22;
                                                    r11 = i23;
                                                    r2 = i52;
                                                    r3 = i6;
                                                    r14 = i7;
                                                    r23 = i18;
                                                    r24 = i19;
                                                    r17 = i14;
                                                    r16 = i15;
                                                    r19 = i34;
                                                    r20 = i31;
                                                    r29 = i28;
                                                    r12 = i24;
                                                    r25 = i20;
                                                    r15 = i16;
                                                    r21 = i32;
                                                    r31 = i46222222222222222222222222;
                                                    i40 = i45222222222222222222222222;
                                                    arrayList5 = arrayList6222222222222222222222222;
                                                    r = i422;
                                                }
                                                i14 = r17;
                                                i15 = r16;
                                                i16 = r15;
                                                i17 = r9;
                                                i18 = r23;
                                                i19 = r24;
                                                i20 = r25;
                                                i21 = r26;
                                                i22 = r10;
                                                i23 = r11;
                                                i24 = r12;
                                                i25 = r13;
                                                i26 = r27;
                                                i27 = r28;
                                                i28 = r29;
                                                i29 = r30;
                                                arrayList32 = arrayList5;
                                                i30 = r31;
                                                stageEvent2 = stageEvent;
                                                String F04222222222222222222222 = V0.F0(i8);
                                                if (V0.isNull(i10)) {
                                                }
                                                i33 = i8;
                                                i34 = i10;
                                                i35 = (int) V0.getLong(i11);
                                                if (!V0.isNull(i12)) {
                                                }
                                                i36 = i35;
                                                int i50222222222222222222222 = (int) V0.getLong(i12);
                                                String F06222222222222222222222 = V0.F0(i13);
                                                if (V0.isNull(i18)) {
                                                }
                                                if (V0.isNull(i19)) {
                                                }
                                                int i51222222222222222222222 = (int) V0.getLong(i20);
                                                String F09222222222222222222222 = V0.F0(i21);
                                                String F010222222222222222222222 = V0.F0(i26);
                                                i31 = i11;
                                                sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                                if (V0.isNull(i29)) {
                                                }
                                                sport2 = sport;
                                                fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                                uniqueStage = new UniqueStage(i50222222222222222222222, F06222222222222222222222, new Category(i51222222222222222222222, F09222222222222222222222, F010222222222222222222222, sport2, fieldTranslations), F07, F08);
                                                String str22222222222222222222222 = F05;
                                                i32 = i12;
                                                stageSeason = new StageSeason(uniqueStage, F04222222222222222222222, str22222222222222222222222, i36);
                                                Stage stage2222222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                                int i442222222222222222222222222 = i41;
                                                stage2222222222222222222222222.setStartDateTimestamp(V0.getLong(i442222222222222222222222222));
                                                int i452222222222222222222222222 = i40;
                                                int i462222222222222222222222222 = i30;
                                                stage2222222222222222222222222.setLastUpdate(V0.getLong(i452222222222222222222222222));
                                                i41 = i442222222222222222222222222;
                                                int i472222222222222222222222222 = i39;
                                                stage2222222222222222222222222.setMuted(((int) V0.getLong(i472222222222222222222222222)) != 0);
                                                i39 = i472222222222222222222222222;
                                                int i482222222222222222222222222 = i38;
                                                stage2222222222222222222222222.setHidden(((int) V0.getLong(i482222222222222222222222222)) != 0);
                                                stage2222222222222222222222222.setParentEvent(stageEvent2);
                                                stage2222222222222222222222222.setStageSeason(stageSeason);
                                                ArrayList arrayList62222222222222222222222222 = arrayList32;
                                                arrayList62222222222222222222222222.add(stage2222222222222222222222222);
                                                int i492222222222222222222222222 = i17;
                                                r22 = i13;
                                                r5 = i9;
                                                r18 = i33;
                                                r30 = i29;
                                                r13 = i25;
                                                r26 = i21;
                                                r9 = i492222222222222222222222222;
                                                f76Var = this;
                                                i38 = i482222222222222222222222222;
                                                r27 = i26;
                                                r28 = i27;
                                                r10 = i22;
                                                r11 = i23;
                                                r2 = i52;
                                                r3 = i6;
                                                r14 = i7;
                                                r23 = i18;
                                                r24 = i19;
                                                r17 = i14;
                                                r16 = i15;
                                                r19 = i34;
                                                r20 = i31;
                                                r29 = i28;
                                                r12 = i24;
                                                r25 = i20;
                                                r15 = i16;
                                                r21 = i32;
                                                r31 = i462222222222222222222222222;
                                                i40 = i452222222222222222222222222;
                                                arrayList5 = arrayList62222222222222222222222222;
                                                r = i422;
                                            }
                                            i7 = r14;
                                            stageEvent = new StageEvent((int) V0.getLong(r14), !V0.isNull(r15) ? null : V0.F0(r15), !V0.isNull(r16) ? null : Long.valueOf(V0.getLong(r16)), !V0.isNull(r17) ? null : V0.F0(r17));
                                            i8 = r18;
                                            if (V0.isNull(i8)) {
                                            }
                                            i14 = r17;
                                            i15 = r16;
                                            i16 = r15;
                                            i17 = r9;
                                            i18 = r23;
                                            i19 = r24;
                                            i20 = r25;
                                            i21 = r26;
                                            i22 = r10;
                                            i23 = r11;
                                            i24 = r12;
                                            i25 = r13;
                                            i26 = r27;
                                            i27 = r28;
                                            i28 = r29;
                                            i29 = r30;
                                            arrayList32 = arrayList5;
                                            i30 = r31;
                                            stageEvent2 = stageEvent;
                                            String F042222222222222222222222 = V0.F0(i8);
                                            if (V0.isNull(i10)) {
                                            }
                                            i33 = i8;
                                            i34 = i10;
                                            i35 = (int) V0.getLong(i11);
                                            if (!V0.isNull(i12)) {
                                            }
                                            i36 = i35;
                                            int i502222222222222222222222 = (int) V0.getLong(i12);
                                            String F062222222222222222222222 = V0.F0(i13);
                                            if (V0.isNull(i18)) {
                                            }
                                            if (V0.isNull(i19)) {
                                            }
                                            int i512222222222222222222222 = (int) V0.getLong(i20);
                                            String F092222222222222222222222 = V0.F0(i21);
                                            String F0102222222222222222222222 = V0.F0(i26);
                                            i31 = i11;
                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                            if (V0.isNull(i29)) {
                                            }
                                            sport2 = sport;
                                            fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                            uniqueStage = new UniqueStage(i502222222222222222222222, F062222222222222222222222, new Category(i512222222222222222222222, F092222222222222222222222, F0102222222222222222222222, sport2, fieldTranslations), F07, F08);
                                            String str222222222222222222222222 = F05;
                                            i32 = i12;
                                            stageSeason = new StageSeason(uniqueStage, F042222222222222222222222, str222222222222222222222222, i36);
                                            Stage stage22222222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                            int i4422222222222222222222222222 = i41;
                                            stage22222222222222222222222222.setStartDateTimestamp(V0.getLong(i4422222222222222222222222222));
                                            int i4522222222222222222222222222 = i40;
                                            int i4622222222222222222222222222 = i30;
                                            stage22222222222222222222222222.setLastUpdate(V0.getLong(i4522222222222222222222222222));
                                            i41 = i4422222222222222222222222222;
                                            int i4722222222222222222222222222 = i39;
                                            stage22222222222222222222222222.setMuted(((int) V0.getLong(i4722222222222222222222222222)) != 0);
                                            i39 = i4722222222222222222222222222;
                                            int i4822222222222222222222222222 = i38;
                                            stage22222222222222222222222222.setHidden(((int) V0.getLong(i4822222222222222222222222222)) != 0);
                                            stage22222222222222222222222222.setParentEvent(stageEvent2);
                                            stage22222222222222222222222222.setStageSeason(stageSeason);
                                            ArrayList arrayList622222222222222222222222222 = arrayList32;
                                            arrayList622222222222222222222222222.add(stage22222222222222222222222222);
                                            int i4922222222222222222222222222 = i17;
                                            r22 = i13;
                                            r5 = i9;
                                            r18 = i33;
                                            r30 = i29;
                                            r13 = i25;
                                            r26 = i21;
                                            r9 = i4922222222222222222222222222;
                                            f76Var = this;
                                            i38 = i4822222222222222222222222222;
                                            r27 = i26;
                                            r28 = i27;
                                            r10 = i22;
                                            r11 = i23;
                                            r2 = i52;
                                            r3 = i6;
                                            r14 = i7;
                                            r23 = i18;
                                            r24 = i19;
                                            r17 = i14;
                                            r16 = i15;
                                            r19 = i34;
                                            r20 = i31;
                                            r29 = i28;
                                            r12 = i24;
                                            r25 = i20;
                                            r15 = i16;
                                            r21 = i32;
                                            r31 = i4622222222222222222222222222;
                                            i40 = i4522222222222222222222222222;
                                            arrayList5 = arrayList622222222222222222222222222;
                                            r = i422;
                                        }
                                        stageWinner = new StageWinner((int) V0.getLong(r12), V0.isNull(r13) ? null : V0.F0(r13));
                                        if (V0.isNull(r14)) {
                                            i7 = r14;
                                            stageEvent = null;
                                            i8 = r18;
                                            if (V0.isNull(i8)) {
                                            }
                                            i14 = r17;
                                            i15 = r16;
                                            i16 = r15;
                                            i17 = r9;
                                            i18 = r23;
                                            i19 = r24;
                                            i20 = r25;
                                            i21 = r26;
                                            i22 = r10;
                                            i23 = r11;
                                            i24 = r12;
                                            i25 = r13;
                                            i26 = r27;
                                            i27 = r28;
                                            i28 = r29;
                                            i29 = r30;
                                            arrayList32 = arrayList5;
                                            i30 = r31;
                                            stageEvent2 = stageEvent;
                                            String F0422222222222222222222222 = V0.F0(i8);
                                            if (V0.isNull(i10)) {
                                            }
                                            i33 = i8;
                                            i34 = i10;
                                            i35 = (int) V0.getLong(i11);
                                            if (!V0.isNull(i12)) {
                                            }
                                            i36 = i35;
                                            int i5022222222222222222222222 = (int) V0.getLong(i12);
                                            String F0622222222222222222222222 = V0.F0(i13);
                                            if (V0.isNull(i18)) {
                                            }
                                            if (V0.isNull(i19)) {
                                            }
                                            int i5122222222222222222222222 = (int) V0.getLong(i20);
                                            String F0922222222222222222222222 = V0.F0(i21);
                                            String F01022222222222222222222222 = V0.F0(i26);
                                            i31 = i11;
                                            sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                            if (V0.isNull(i29)) {
                                            }
                                            sport2 = sport;
                                            fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                            uniqueStage = new UniqueStage(i5022222222222222222222222, F0622222222222222222222222, new Category(i5122222222222222222222222, F0922222222222222222222222, F01022222222222222222222222, sport2, fieldTranslations), F07, F08);
                                            String str2222222222222222222222222 = F05;
                                            i32 = i12;
                                            stageSeason = new StageSeason(uniqueStage, F0422222222222222222222222, str2222222222222222222222222, i36);
                                            Stage stage222222222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                            int i44222222222222222222222222222 = i41;
                                            stage222222222222222222222222222.setStartDateTimestamp(V0.getLong(i44222222222222222222222222222));
                                            int i45222222222222222222222222222 = i40;
                                            int i46222222222222222222222222222 = i30;
                                            stage222222222222222222222222222.setLastUpdate(V0.getLong(i45222222222222222222222222222));
                                            i41 = i44222222222222222222222222222;
                                            int i47222222222222222222222222222 = i39;
                                            stage222222222222222222222222222.setMuted(((int) V0.getLong(i47222222222222222222222222222)) != 0);
                                            i39 = i47222222222222222222222222222;
                                            int i48222222222222222222222222222 = i38;
                                            stage222222222222222222222222222.setHidden(((int) V0.getLong(i48222222222222222222222222222)) != 0);
                                            stage222222222222222222222222222.setParentEvent(stageEvent2);
                                            stage222222222222222222222222222.setStageSeason(stageSeason);
                                            ArrayList arrayList6222222222222222222222222222 = arrayList32;
                                            arrayList6222222222222222222222222222.add(stage222222222222222222222222222);
                                            int i49222222222222222222222222222 = i17;
                                            r22 = i13;
                                            r5 = i9;
                                            r18 = i33;
                                            r30 = i29;
                                            r13 = i25;
                                            r26 = i21;
                                            r9 = i49222222222222222222222222222;
                                            f76Var = this;
                                            i38 = i48222222222222222222222222222;
                                            r27 = i26;
                                            r28 = i27;
                                            r10 = i22;
                                            r11 = i23;
                                            r2 = i52;
                                            r3 = i6;
                                            r14 = i7;
                                            r23 = i18;
                                            r24 = i19;
                                            r17 = i14;
                                            r16 = i15;
                                            r19 = i34;
                                            r20 = i31;
                                            r29 = i28;
                                            r12 = i24;
                                            r25 = i20;
                                            r15 = i16;
                                            r21 = i32;
                                            r31 = i46222222222222222222222222222;
                                            i40 = i45222222222222222222222222222;
                                            arrayList5 = arrayList6222222222222222222222222222;
                                            r = i422;
                                        }
                                        i7 = r14;
                                        stageEvent = new StageEvent((int) V0.getLong(r14), !V0.isNull(r15) ? null : V0.F0(r15), !V0.isNull(r16) ? null : Long.valueOf(V0.getLong(r16)), !V0.isNull(r17) ? null : V0.F0(r17));
                                        i8 = r18;
                                        if (V0.isNull(i8)) {
                                        }
                                        i14 = r17;
                                        i15 = r16;
                                        i16 = r15;
                                        i17 = r9;
                                        i18 = r23;
                                        i19 = r24;
                                        i20 = r25;
                                        i21 = r26;
                                        i22 = r10;
                                        i23 = r11;
                                        i24 = r12;
                                        i25 = r13;
                                        i26 = r27;
                                        i27 = r28;
                                        i28 = r29;
                                        i29 = r30;
                                        arrayList32 = arrayList5;
                                        i30 = r31;
                                        stageEvent2 = stageEvent;
                                        String F04222222222222222222222222 = V0.F0(i8);
                                        if (V0.isNull(i10)) {
                                        }
                                        i33 = i8;
                                        i34 = i10;
                                        i35 = (int) V0.getLong(i11);
                                        if (!V0.isNull(i12)) {
                                        }
                                        i36 = i35;
                                        int i50222222222222222222222222 = (int) V0.getLong(i12);
                                        String F06222222222222222222222222 = V0.F0(i13);
                                        if (V0.isNull(i18)) {
                                        }
                                        if (V0.isNull(i19)) {
                                        }
                                        int i51222222222222222222222222 = (int) V0.getLong(i20);
                                        String F09222222222222222222222222 = V0.F0(i21);
                                        String F010222222222222222222222222 = V0.F0(i26);
                                        i31 = i11;
                                        sport = new Sport((int) V0.getLong(i27), V0.F0(i28));
                                        if (V0.isNull(i29)) {
                                        }
                                        sport2 = sport;
                                        fieldTranslations = new FieldTranslations(v76Var22.c.z(V0.isNull(i29) ? null : V0.F0(i29)), v76Var22.c.z(V0.isNull(i30) ? null : V0.F0(i30)));
                                        uniqueStage = new UniqueStage(i50222222222222222222222222, F06222222222222222222222222, new Category(i51222222222222222222222222, F09222222222222222222222222, F010222222222222222222222222, sport2, fieldTranslations), F07, F08);
                                        String str22222222222222222222222222 = F05;
                                        i32 = i12;
                                        stageSeason = new StageSeason(uniqueStage, F04222222222222222222222222, str22222222222222222222222222, i36);
                                        Stage stage2222222222222222222222222222 = new Stage(F0, b, status, i42, stageWinner, F03);
                                        int i442222222222222222222222222222 = i41;
                                        stage2222222222222222222222222222.setStartDateTimestamp(V0.getLong(i442222222222222222222222222222));
                                        int i452222222222222222222222222222 = i40;
                                        int i462222222222222222222222222222 = i30;
                                        stage2222222222222222222222222222.setLastUpdate(V0.getLong(i452222222222222222222222222222));
                                        i41 = i442222222222222222222222222222;
                                        int i472222222222222222222222222222 = i39;
                                        stage2222222222222222222222222222.setMuted(((int) V0.getLong(i472222222222222222222222222222)) != 0);
                                        i39 = i472222222222222222222222222222;
                                        int i482222222222222222222222222222 = i38;
                                        stage2222222222222222222222222222.setHidden(((int) V0.getLong(i482222222222222222222222222222)) != 0);
                                        stage2222222222222222222222222222.setParentEvent(stageEvent2);
                                        stage2222222222222222222222222222.setStageSeason(stageSeason);
                                        ArrayList arrayList62222222222222222222222222222 = arrayList32;
                                        arrayList62222222222222222222222222222.add(stage2222222222222222222222222222);
                                        int i492222222222222222222222222222 = i17;
                                        r22 = i13;
                                        r5 = i9;
                                        r18 = i33;
                                        r30 = i29;
                                        r13 = i25;
                                        r26 = i21;
                                        r9 = i492222222222222222222222222222;
                                        f76Var = this;
                                        i38 = i482222222222222222222222222222;
                                        r27 = i26;
                                        r28 = i27;
                                        r10 = i22;
                                        r11 = i23;
                                        r2 = i52;
                                        r3 = i6;
                                        r14 = i7;
                                        r23 = i18;
                                        r24 = i19;
                                        r17 = i14;
                                        r16 = i15;
                                        r19 = i34;
                                        r20 = i31;
                                        r29 = i28;
                                        r12 = i24;
                                        r25 = i20;
                                        r15 = i16;
                                        r21 = i32;
                                        r31 = i462222222222222222222222222222;
                                        i40 = i452222222222222222222222222222;
                                        arrayList5 = arrayList62222222222222222222222222222;
                                        r = i422;
                                    }
                                    ArrayList arrayList7 = arrayList5;
                                    V0.close();
                                    return arrayList7;
                                } catch (Throwable th) {
                                    V0.close();
                                    throw th;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:164:0x065e  */
                            /* JADX WARN: Removed duplicated region for block: B:167:0x067a  */
                            /* JADX WARN: Removed duplicated region for block: B:170:0x068e  */
                            /* JADX WARN: Removed duplicated region for block: B:173:0x06a2  */
                            /* JADX WARN: Removed duplicated region for block: B:176:0x06b6  */
                            /* JADX WARN: Removed duplicated region for block: B:179:0x06c9  */
                            /* JADX WARN: Removed duplicated region for block: B:182:0x06dc  */
                            /* JADX WARN: Removed duplicated region for block: B:185:0x06ef  */
                            /* JADX WARN: Removed duplicated region for block: B:190:0x070b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:195:0x0729  */
                            /* JADX WARN: Removed duplicated region for block: B:200:0x0751 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x07b3  */
                            /* JADX WARN: Removed duplicated region for block: B:216:0x07cf  */
                            /* JADX WARN: Removed duplicated region for block: B:219:0x07e3  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x07f7  */
                            /* JADX WARN: Removed duplicated region for block: B:224:0x0804 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:230:0x081c  */
                            /* JADX WARN: Removed duplicated region for block: B:233:0x0830  */
                            /* JADX WARN: Removed duplicated region for block: B:238:0x084d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:243:0x0868  */
                            /* JADX WARN: Removed duplicated region for block: B:245:0x087d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:251:0x0892  */
                            /* JADX WARN: Removed duplicated region for block: B:253:0x08a5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:260:0x08cf  */
                            /* JADX WARN: Removed duplicated region for block: B:263:0x08d1  */
                            /* JADX WARN: Removed duplicated region for block: B:265:0x08b3  */
                            /* JADX WARN: Removed duplicated region for block: B:266:0x0897 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:268:0x088b  */
                            /* JADX WARN: Removed duplicated region for block: B:269:0x086e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:271:0x0860  */
                            /* JADX WARN: Removed duplicated region for block: B:272:0x0833 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:273:0x081f A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:275:0x0814  */
                            /* JADX WARN: Removed duplicated region for block: B:276:0x07f9 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:277:0x07e6 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:278:0x07d2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:279:0x07ba A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:288:0x07a2  */
                            /* JADX WARN: Removed duplicated region for block: B:289:0x072d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:291:0x0721  */
                            /* JADX WARN: Removed duplicated region for block: B:292:0x06f2 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:293:0x06df A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:294:0x06cc A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:295:0x06b9 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:296:0x06a5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:297:0x0691 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:298:0x067d A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            /* JADX WARN: Removed duplicated region for block: B:299:0x0665 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0018, B:6:0x001d, B:8:0x0023, B:10:0x0037, B:11:0x0204, B:13:0x020a, B:15:0x022f, B:16:0x0249, B:18:0x024f, B:22:0x0264, B:25:0x0278, B:29:0x029a, B:33:0x02be, B:37:0x02e2, B:41:0x0301, B:45:0x0310, B:48:0x0331, B:52:0x035e, B:56:0x037b, B:60:0x038d, B:64:0x03ac, B:68:0x03c9, B:72:0x03e6, B:76:0x0403, B:80:0x0420, B:84:0x043d, B:88:0x045a, B:92:0x046c, B:96:0x0487, B:99:0x0490, B:101:0x049c, B:105:0x04b5, B:108:0x04be, B:110:0x04ca, B:114:0x04e3, B:117:0x04ec, B:119:0x04f8, B:123:0x0515, B:126:0x0521, B:129:0x0539, B:133:0x0553, B:137:0x0567, B:139:0x056d, B:141:0x058a, B:145:0x05aa, B:147:0x05bd, B:149:0x05c5, B:151:0x05cd, B:153:0x05d7, B:155:0x05e1, B:157:0x05eb, B:159:0x05f5, B:162:0x0658, B:165:0x0674, B:168:0x0688, B:171:0x069c, B:174:0x06b0, B:177:0x06c3, B:180:0x06d6, B:183:0x06e9, B:186:0x06fc, B:188:0x0705, B:190:0x070b, B:193:0x0723, B:196:0x0735, B:198:0x074b, B:200:0x0751, B:202:0x0759, B:204:0x0761, B:206:0x0769, B:208:0x0773, B:211:0x07ad, B:214:0x07c9, B:217:0x07dd, B:220:0x07f1, B:224:0x0804, B:227:0x080d, B:228:0x0816, B:231:0x082a, B:234:0x083e, B:236:0x0847, B:238:0x084d, B:241:0x0862, B:245:0x087d, B:248:0x0886, B:249:0x088c, B:253:0x08a5, B:256:0x08ae, B:257:0x08b4, B:258:0x08bb, B:261:0x08d2, B:266:0x0897, B:269:0x086e, B:272:0x0833, B:273:0x081f, B:276:0x07f9, B:277:0x07e6, B:278:0x07d2, B:279:0x07ba, B:289:0x072d, B:292:0x06f2, B:293:0x06df, B:294:0x06cc, B:295:0x06b9, B:296:0x06a5, B:297:0x0691, B:298:0x067d, B:299:0x0665, B:311:0x05a1, B:313:0x0560, B:314:0x054c, B:315:0x0531, B:316:0x051d, B:317:0x0506, B:320:0x04d5, B:323:0x04a7, B:326:0x0478, B:327:0x0465, B:328:0x044b, B:329:0x042e, B:330:0x0411, B:331:0x03f4, B:332:0x03d7, B:333:0x03ba, B:334:0x039c, B:335:0x0386, B:336:0x036c, B:337:0x034e, B:338:0x0323, B:340:0x02f1, B:341:0x02d3, B:342:0x02ab, B:343:0x028c, B:344:0x026d, B:345:0x0259), top: B:4:0x0018 }] */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj2) {
                                nkb nkbVar;
                                int i42;
                                Integer valueOf;
                                int i52;
                                Integer valueOf2;
                                int i6;
                                ArrayList arrayList32;
                                nkb nkbVar2;
                                Integer valueOf3;
                                int i7;
                                Integer valueOf4;
                                Long valueOf5;
                                int i8;
                                int i9;
                                int i10;
                                Integer valueOf6;
                                int i11;
                                int i12;
                                Integer valueOf7;
                                int i13;
                                Integer valueOf8;
                                int i14;
                                Integer valueOf9;
                                int i15;
                                Integer valueOf10;
                                int i16;
                                Integer valueOf11;
                                int i17;
                                Integer valueOf12;
                                int i18;
                                Integer valueOf13;
                                int i19;
                                Integer valueOf14;
                                int i20;
                                Integer valueOf15;
                                Boolean bool;
                                int i21;
                                Integer valueOf16;
                                Boolean bool2;
                                int i22;
                                Integer valueOf17;
                                Boolean bool3;
                                int i23;
                                Integer valueOf18;
                                int i24;
                                String F0;
                                int i25;
                                Season season;
                                int i26;
                                String F02;
                                Status status;
                                int i27;
                                int i28;
                                int i29;
                                int i30;
                                int i31;
                                nkb nkbVar3;
                                ArrayList arrayList42;
                                int i32;
                                int i33;
                                int i34;
                                int i35;
                                Time time;
                                nkb nkbVar4;
                                nkb nkbVar5;
                                int i36;
                                int i37;
                                EventChanges eventChanges;
                                int i38;
                                int i39;
                                int i40;
                                int i41;
                                int i422;
                                sz8 sz8Var;
                                int i43;
                                int i44;
                                int i45;
                                int i46;
                                int i47;
                                int i48;
                                DbAmericanFootballDownDistance dbAmericanFootballDownDistance;
                                int i49;
                                int i50;
                                int i51;
                                int i522;
                                VarInProgress varInProgress;
                                int i53;
                                int i54;
                                int i55;
                                int i56;
                                Integer valueOf19;
                                Boolean bool4;
                                Integer valueOf20;
                                Boolean bool5;
                                Integer valueOf21;
                                Integer valueOf22;
                                Boolean bool6;
                                String F03;
                                Integer valueOf23;
                                switch (i5) {
                                    case 0:
                                        return a(obj2);
                                    default:
                                        ArrayList arrayList5 = arrayList4;
                                        v76 v76Var22 = v76Var2;
                                        glg glgVar = (glg) obj2;
                                        glgVar.getClass();
                                        nlg V0 = glgVar.V0(sb4);
                                        try {
                                            Iterator it22 = arrayList5.iterator();
                                            int i57 = 1;
                                            while (it22.hasNext()) {
                                                V0.q(i57, ((Number) it22.next()).intValue());
                                                i57++;
                                            }
                                            int r = w1a.r(V0, "winnerCode");
                                            int r2 = w1a.r(V0, "aggregatedWinnerCode");
                                            int r3 = w1a.r(V0, "homeTeamId");
                                            int r4 = w1a.r(V0, "homeSubTeam1Id");
                                            int r5 = w1a.r(V0, "homeSubTeam2Id");
                                            int r6 = w1a.r(V0, "awayTeamId");
                                            int r7 = w1a.r(V0, "awaySubTeam1Id");
                                            int r8 = w1a.r(V0, "awaySubTeam2Id");
                                            int r9 = w1a.r(V0, "hasEventPlayerHeatMap");
                                            int r10 = w1a.r(V0, "startTimestamp");
                                            int r11 = w1a.r(V0, "endTimestamp");
                                            int r12 = w1a.r(V0, "id");
                                            int r13 = w1a.r(V0, "tournamentId");
                                            int i58 = r11;
                                            int r14 = w1a.r(V0, "uniqueTournamentId");
                                            int r15 = w1a.r(V0, "previousLegEventId");
                                            int r16 = w1a.r(V0, "lastPeriod");
                                            int r17 = w1a.r(V0, "homeRedCards");
                                            int r18 = w1a.r(V0, "awayRedCards");
                                            int r19 = w1a.r(V0, "currentBattingTeamId");
                                            int r20 = w1a.r(V0, "firstToServe");
                                            int r21 = w1a.r(V0, "bestOfSets");
                                            int r22 = w1a.r(V0, "bestOfLegs");
                                            int r23 = w1a.r(V0, "finalRound");
                                            int r24 = w1a.r(V0, "winType");
                                            int r25 = w1a.r(V0, "crowdsourcingDataDisplayEnabled");
                                            int r26 = w1a.r(V0, "crowdsourcingEnabled");
                                            int r27 = w1a.r(V0, "finalResultOnly");
                                            int r28 = w1a.r(V0, "streamContentId");
                                            int r29 = w1a.r(V0, "streamContentGeoRestrictions");
                                            int r30 = w1a.r(V0, "eventFilters");
                                            int r31 = w1a.r(V0, "homeTeamSeed");
                                            int r32 = w1a.r(V0, "awayTeamSeed");
                                            int r33 = w1a.r(V0, "hide");
                                            int r34 = w1a.r(V0, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                            int r35 = w1a.r(V0, "lastUpdate");
                                            int r36 = w1a.r(V0, "season_id");
                                            int r37 = w1a.r(V0, "status_code");
                                            int r38 = w1a.r(V0, "status_description");
                                            int r39 = w1a.r(V0, "status_type");
                                            int r40 = w1a.r(V0, "time_played");
                                            int r41 = w1a.r(V0, "time_periodLength");
                                            int r42 = w1a.r(V0, "time_overtimeLength");
                                            int r43 = w1a.r(V0, "time_totalPeriodCount");
                                            int r44 = w1a.r(V0, "time_initial");
                                            int r45 = w1a.r(V0, "time_max");
                                            int r46 = w1a.r(V0, "time_currentPeriodStartTimestamp");
                                            int r47 = w1a.r(V0, "time_extra");
                                            int r48 = w1a.r(V0, "changes_changes");
                                            int r49 = w1a.r(V0, "changes_changeTimestamp");
                                            int r50 = w1a.r(V0, "am_football_currentYardsToFirstDown");
                                            int r51 = w1a.r(V0, "am_football_currentDown");
                                            int r52 = w1a.r(V0, "am_football_currentYardline");
                                            int r53 = w1a.r(V0, "am_football_isGoalPossession");
                                            int r54 = w1a.r(V0, "am_football_currentPossession");
                                            int r55 = w1a.r(V0, "am_football_currentTeamHalf");
                                            int r56 = w1a.r(V0, "var_homeTeam");
                                            int r57 = w1a.r(V0, "var_awayTeam");
                                            int i59 = r10;
                                            Integer num = null;
                                            nkb nkbVar6 = new nkb((Object) null);
                                            int i60 = r9;
                                            nkb nkbVar7 = new nkb((Object) null);
                                            int i61 = r8;
                                            nkb nkbVar8 = new nkb((Object) null);
                                            int i62 = r7;
                                            nkb nkbVar9 = new nkb((Object) null);
                                            while (V0.U0()) {
                                                nkbVar6.g(null, V0.getLong(r3));
                                                nkbVar7.g(null, V0.getLong(r6));
                                                nkbVar8.g(null, V0.getLong(r13));
                                                nkbVar9.g(null, V0.getLong(r12));
                                                r4 = r4;
                                                r5 = r5;
                                            }
                                            int i63 = r4;
                                            int i64 = r5;
                                            V0.reset();
                                            v76Var22.d(glgVar, nkbVar6);
                                            sz8 sz8Var2 = v76Var22.c;
                                            v76Var22.d(glgVar, nkbVar7);
                                            v76Var22.e(glgVar, nkbVar8);
                                            v76Var22.c(glgVar, nkbVar9);
                                            ArrayList arrayList6 = new ArrayList();
                                            while (V0.U0()) {
                                                if (V0.isNull(r)) {
                                                    nkbVar = nkbVar6;
                                                } else {
                                                    nkbVar = nkbVar6;
                                                    num = Integer.valueOf((int) V0.getLong(r));
                                                }
                                                Integer num2 = num;
                                                Integer valueOf24 = V0.isNull(r2) ? null : Integer.valueOf((int) V0.getLong(r2));
                                                int i65 = (int) V0.getLong(r3);
                                                int i66 = i63;
                                                if (V0.isNull(i66)) {
                                                    i42 = r6;
                                                    valueOf = null;
                                                } else {
                                                    i42 = r6;
                                                    valueOf = Integer.valueOf((int) V0.getLong(i66));
                                                }
                                                int i67 = i64;
                                                if (V0.isNull(i67)) {
                                                    i52 = i65;
                                                    i6 = i42;
                                                    valueOf2 = null;
                                                    i63 = i66;
                                                } else {
                                                    i52 = i65;
                                                    valueOf2 = Integer.valueOf((int) V0.getLong(i67));
                                                    i6 = i42;
                                                    i63 = i66;
                                                }
                                                i64 = i67;
                                                int i68 = (int) V0.getLong(i6);
                                                int i69 = i62;
                                                if (V0.isNull(i69)) {
                                                    arrayList32 = arrayList6;
                                                    nkbVar2 = nkbVar;
                                                    valueOf3 = null;
                                                } else {
                                                    arrayList32 = arrayList6;
                                                    nkbVar2 = nkbVar;
                                                    valueOf3 = Integer.valueOf((int) V0.getLong(i69));
                                                }
                                                int i70 = i61;
                                                if (V0.isNull(i70)) {
                                                    i7 = i68;
                                                    valueOf4 = null;
                                                } else {
                                                    i7 = i68;
                                                    i69 = i69;
                                                    valueOf4 = Integer.valueOf((int) V0.getLong(i70));
                                                }
                                                i61 = i70;
                                                int i71 = i60;
                                                boolean z = ((int) V0.getLong(i71)) != 0;
                                                int i72 = i59;
                                                long j = V0.getLong(i72);
                                                int i73 = i58;
                                                if (V0.isNull(i73)) {
                                                    valueOf5 = null;
                                                    i8 = i72;
                                                    i58 = i73;
                                                } else {
                                                    valueOf5 = Long.valueOf(V0.getLong(i73));
                                                    i58 = i73;
                                                    i8 = i72;
                                                }
                                                int i74 = (int) V0.getLong(r12);
                                                int i75 = (int) V0.getLong(r13);
                                                int i76 = r14;
                                                if (V0.isNull(i76)) {
                                                    i9 = i71;
                                                    i10 = i69;
                                                    valueOf6 = null;
                                                } else {
                                                    i9 = i71;
                                                    i10 = i69;
                                                    valueOf6 = Integer.valueOf((int) V0.getLong(i76));
                                                }
                                                int i77 = r15;
                                                if (V0.isNull(i77)) {
                                                    i11 = i75;
                                                    i12 = i76;
                                                    valueOf7 = null;
                                                } else {
                                                    i11 = i75;
                                                    i12 = i76;
                                                    valueOf7 = Integer.valueOf((int) V0.getLong(i77));
                                                }
                                                int i78 = r16;
                                                String F04 = V0.isNull(i78) ? null : V0.F0(i78);
                                                int i79 = r17;
                                                if (V0.isNull(i79)) {
                                                    r15 = i77;
                                                    i13 = i12;
                                                    valueOf8 = null;
                                                } else {
                                                    r15 = i77;
                                                    i13 = i12;
                                                    valueOf8 = Integer.valueOf((int) V0.getLong(i79));
                                                }
                                                int i80 = r18;
                                                if (V0.isNull(i80)) {
                                                    i14 = i78;
                                                    r17 = i79;
                                                    valueOf9 = null;
                                                } else {
                                                    i14 = i78;
                                                    r17 = i79;
                                                    valueOf9 = Integer.valueOf((int) V0.getLong(i80));
                                                }
                                                int i81 = r19;
                                                if (V0.isNull(i81)) {
                                                    r18 = i80;
                                                    i15 = i14;
                                                    valueOf10 = null;
                                                } else {
                                                    r18 = i80;
                                                    i15 = i14;
                                                    valueOf10 = Integer.valueOf((int) V0.getLong(i81));
                                                }
                                                int i82 = r20;
                                                if (V0.isNull(i82)) {
                                                    r19 = i81;
                                                    i16 = i15;
                                                    valueOf11 = null;
                                                } else {
                                                    r19 = i81;
                                                    i16 = i15;
                                                    valueOf11 = Integer.valueOf((int) V0.getLong(i82));
                                                }
                                                int i83 = r21;
                                                if (V0.isNull(i83)) {
                                                    r20 = i82;
                                                    i17 = i16;
                                                    valueOf12 = null;
                                                } else {
                                                    r20 = i82;
                                                    i17 = i16;
                                                    valueOf12 = Integer.valueOf((int) V0.getLong(i83));
                                                }
                                                int i84 = r22;
                                                if (V0.isNull(i84)) {
                                                    r21 = i83;
                                                    i18 = i17;
                                                    valueOf13 = null;
                                                } else {
                                                    r21 = i83;
                                                    i18 = i17;
                                                    valueOf13 = Integer.valueOf((int) V0.getLong(i84));
                                                }
                                                int i85 = r23;
                                                if (V0.isNull(i85)) {
                                                    r22 = i84;
                                                    i19 = i18;
                                                    valueOf14 = null;
                                                } else {
                                                    r22 = i84;
                                                    i19 = i18;
                                                    valueOf14 = Integer.valueOf((int) V0.getLong(i85));
                                                }
                                                int i86 = r24;
                                                String F05 = V0.isNull(i86) ? null : V0.F0(i86);
                                                int i87 = r25;
                                                if (V0.isNull(i87)) {
                                                    r23 = i85;
                                                    i20 = i19;
                                                    valueOf15 = null;
                                                } else {
                                                    r23 = i85;
                                                    i20 = i19;
                                                    valueOf15 = Integer.valueOf((int) V0.getLong(i87));
                                                }
                                                if (valueOf15 != null) {
                                                    bool = Boolean.valueOf(valueOf15.intValue() != 0);
                                                } else {
                                                    bool = null;
                                                }
                                                int i88 = r26;
                                                if (V0.isNull(i88)) {
                                                    i21 = i86;
                                                    r25 = i87;
                                                    valueOf16 = null;
                                                } else {
                                                    i21 = i86;
                                                    r25 = i87;
                                                    valueOf16 = Integer.valueOf((int) V0.getLong(i88));
                                                }
                                                if (valueOf16 != null) {
                                                    bool2 = Boolean.valueOf(valueOf16.intValue() != 0);
                                                } else {
                                                    bool2 = null;
                                                }
                                                int i89 = r27;
                                                if (V0.isNull(i89)) {
                                                    r26 = i88;
                                                    i22 = i21;
                                                    valueOf17 = null;
                                                } else {
                                                    r26 = i88;
                                                    i22 = i21;
                                                    valueOf17 = Integer.valueOf((int) V0.getLong(i89));
                                                }
                                                if (valueOf17 != null) {
                                                    bool3 = Boolean.valueOf(valueOf17.intValue() != 0);
                                                } else {
                                                    bool3 = null;
                                                }
                                                int i90 = r28;
                                                if (V0.isNull(i90)) {
                                                    r27 = i89;
                                                    i23 = i22;
                                                    valueOf18 = null;
                                                } else {
                                                    r27 = i89;
                                                    i23 = i22;
                                                    valueOf18 = Integer.valueOf((int) V0.getLong(i90));
                                                }
                                                int i91 = r29;
                                                List y2 = sz8Var2.y(V0.isNull(i91) ? null : V0.F0(i91));
                                                int i92 = r30;
                                                if (V0.isNull(i92)) {
                                                    i24 = r;
                                                    F0 = null;
                                                } else {
                                                    i24 = r;
                                                    F0 = V0.F0(i92);
                                                }
                                                Map A = sz8Var2.A(F0);
                                                int i93 = r31;
                                                String F06 = V0.isNull(i93) ? null : V0.F0(i93);
                                                r31 = i93;
                                                int i94 = r32;
                                                String F07 = V0.isNull(i94) ? null : V0.F0(i94);
                                                r32 = i94;
                                                int i95 = r36;
                                                if (V0.isNull(i95)) {
                                                    r28 = i90;
                                                    i25 = i23;
                                                    season = null;
                                                } else {
                                                    r28 = i90;
                                                    i25 = i23;
                                                    season = new Season((int) V0.getLong(i95));
                                                }
                                                int i96 = r37;
                                                int i97 = (int) V0.getLong(i96);
                                                int i98 = r38;
                                                if (V0.isNull(i98)) {
                                                    i26 = i95;
                                                    F02 = null;
                                                } else {
                                                    i26 = i95;
                                                    F02 = V0.F0(i98);
                                                }
                                                r37 = i96;
                                                int i99 = r39;
                                                Status status2 = new Status(i97, F02, V0.F0(i99));
                                                int i100 = r40;
                                                if (V0.isNull(i100)) {
                                                    i28 = r41;
                                                    if (V0.isNull(i28)) {
                                                        i29 = r42;
                                                        if (V0.isNull(i29)) {
                                                            status = status2;
                                                            i30 = r43;
                                                            if (V0.isNull(i30)) {
                                                                i27 = r2;
                                                                i31 = r44;
                                                                if (V0.isNull(i31)) {
                                                                    i32 = i98;
                                                                    i33 = r45;
                                                                    if (V0.isNull(i33)) {
                                                                        arrayList42 = arrayList32;
                                                                        i34 = r46;
                                                                        if (V0.isNull(i34)) {
                                                                            nkbVar3 = nkbVar9;
                                                                            i35 = r47;
                                                                            if (V0.isNull(i35)) {
                                                                                nkbVar4 = nkbVar8;
                                                                                nkbVar5 = nkbVar7;
                                                                                time = null;
                                                                                i36 = r48;
                                                                                if (V0.isNull(i36)) {
                                                                                }
                                                                                if (V0.isNull(i36)) {
                                                                                }
                                                                                i39 = i30;
                                                                                i41 = i28;
                                                                                i38 = i31;
                                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                                i422 = r50;
                                                                                if (V0.isNull(i422)) {
                                                                                }
                                                                                i47 = i29;
                                                                                i48 = r55;
                                                                                if (V0.isNull(i422)) {
                                                                                }
                                                                                if (!V0.isNull(i43)) {
                                                                                }
                                                                                if (!V0.isNull(i44)) {
                                                                                }
                                                                                if (!V0.isNull(i45)) {
                                                                                }
                                                                                if (valueOf22 == null) {
                                                                                }
                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                i51 = r56;
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (valueOf19 != null) {
                                                                                }
                                                                                if (V0.isNull(i522)) {
                                                                                }
                                                                                if (valueOf20 != null) {
                                                                                }
                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                DbEvent dbEvent22222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                int i10122222222222 = r33;
                                                                                dbEvent22222222222.setHide(((int) V0.getLong(i10122222222222)) == 0);
                                                                                r57 = i522;
                                                                                int i10222222222222 = r34;
                                                                                dbEvent22222222222.setMute((int) V0.getLong(i10222222222222));
                                                                                r34 = i10222222222222;
                                                                                int i10322222222222 = r35;
                                                                                dbEvent22222222222.setLastUpdate(V0.getLong(i10322222222222));
                                                                                nkb nkbVar1022222222222 = nkbVar2;
                                                                                Team team32222222222 = (Team) nkbVar1022222222222.c(V0.getLong(r3));
                                                                                nkb nkbVar1122222222222 = nkbVar5;
                                                                                Team team222222222222 = (Team) nkbVar1122222222222.c(V0.getLong(i6));
                                                                                nkb nkbVar1222222222222 = nkbVar4;
                                                                                Tournament tournament22222222222 = (Tournament) nkbVar1222222222222.c(V0.getLong(r13));
                                                                                nkb nkbVar1322222222222 = nkbVar3;
                                                                                ArrayList arrayList722222222222 = arrayList42;
                                                                                arrayList722222222222.add(new DbEventAll(dbEvent22222222222, team32222222222, team222222222222, tournament22222222222, (DbEventScore) nkbVar1322222222222.c(V0.getLong(r12))));
                                                                                int i10422222222222 = i49;
                                                                                r53 = i45;
                                                                                r2 = i27;
                                                                                r40 = i40;
                                                                                r47 = i10422222222222;
                                                                                int i10522222222222 = i38;
                                                                                r49 = i37;
                                                                                nkbVar7 = nkbVar1122222222222;
                                                                                r44 = i10522222222222;
                                                                                arrayList6 = arrayList722222222222;
                                                                                r43 = i39;
                                                                                sz8Var2 = sz8Var;
                                                                                r42 = i47;
                                                                                r51 = i55;
                                                                                i59 = i8;
                                                                                r54 = i56;
                                                                                r48 = i36;
                                                                                i60 = i9;
                                                                                r14 = i13;
                                                                                r16 = i20;
                                                                                r24 = i25;
                                                                                r50 = i422;
                                                                                r30 = i92;
                                                                                r36 = i26;
                                                                                r38 = i32;
                                                                                nkbVar8 = nkbVar1222222222222;
                                                                                r41 = i41;
                                                                                r45 = i50;
                                                                                r52 = i54;
                                                                                r55 = i53;
                                                                                r35 = i10322222222222;
                                                                                r6 = i6;
                                                                                r46 = i34;
                                                                                r56 = i51;
                                                                                nkbVar6 = nkbVar1022222222222;
                                                                                i62 = i10;
                                                                                num = null;
                                                                                r33 = i10122222222222;
                                                                                nkbVar9 = nkbVar1322222222222;
                                                                                r = i24;
                                                                                r29 = i91;
                                                                                r39 = i99;
                                                                            } else {
                                                                                if (V0.isNull(i100)) {
                                                                                    nkbVar4 = nkbVar8;
                                                                                    nkbVar5 = nkbVar7;
                                                                                    valueOf23 = null;
                                                                                } else {
                                                                                    nkbVar4 = nkbVar8;
                                                                                    nkbVar5 = nkbVar7;
                                                                                    valueOf23 = Integer.valueOf((int) V0.getLong(i100));
                                                                                }
                                                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                                                i36 = r48;
                                                                                if (V0.isNull(i36)) {
                                                                                    i37 = r49;
                                                                                } else {
                                                                                    i37 = r49;
                                                                                    if (V0.isNull(i37)) {
                                                                                        i40 = i100;
                                                                                        i39 = i30;
                                                                                        i41 = i28;
                                                                                        i38 = i31;
                                                                                        eventChanges = null;
                                                                                        i422 = r50;
                                                                                        if (V0.isNull(i422)) {
                                                                                            i43 = r51;
                                                                                            if (V0.isNull(i43)) {
                                                                                                i44 = r52;
                                                                                                if (V0.isNull(i44)) {
                                                                                                    i45 = r53;
                                                                                                    if (V0.isNull(i45)) {
                                                                                                        sz8Var = sz8Var2;
                                                                                                        i46 = r54;
                                                                                                        if (V0.isNull(i46)) {
                                                                                                            i47 = i29;
                                                                                                            i48 = r55;
                                                                                                            if (V0.isNull(i48)) {
                                                                                                                i50 = i33;
                                                                                                                i49 = i35;
                                                                                                                dbAmericanFootballDownDistance = null;
                                                                                                                i51 = r56;
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                }
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                }
                                                                                                                if (valueOf19 != null) {
                                                                                                                }
                                                                                                                if (V0.isNull(i522)) {
                                                                                                                }
                                                                                                                if (valueOf20 != null) {
                                                                                                                }
                                                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                                                DbEvent dbEvent222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                                                int i101222222222222 = r33;
                                                                                                                dbEvent222222222222.setHide(((int) V0.getLong(i101222222222222)) == 0);
                                                                                                                r57 = i522;
                                                                                                                int i102222222222222 = r34;
                                                                                                                dbEvent222222222222.setMute((int) V0.getLong(i102222222222222));
                                                                                                                r34 = i102222222222222;
                                                                                                                int i103222222222222 = r35;
                                                                                                                dbEvent222222222222.setLastUpdate(V0.getLong(i103222222222222));
                                                                                                                nkb nkbVar10222222222222 = nkbVar2;
                                                                                                                Team team322222222222 = (Team) nkbVar10222222222222.c(V0.getLong(r3));
                                                                                                                nkb nkbVar11222222222222 = nkbVar5;
                                                                                                                Team team2222222222222 = (Team) nkbVar11222222222222.c(V0.getLong(i6));
                                                                                                                nkb nkbVar12222222222222 = nkbVar4;
                                                                                                                Tournament tournament222222222222 = (Tournament) nkbVar12222222222222.c(V0.getLong(r13));
                                                                                                                nkb nkbVar13222222222222 = nkbVar3;
                                                                                                                ArrayList arrayList7222222222222 = arrayList42;
                                                                                                                arrayList7222222222222.add(new DbEventAll(dbEvent222222222222, team322222222222, team2222222222222, tournament222222222222, (DbEventScore) nkbVar13222222222222.c(V0.getLong(r12))));
                                                                                                                int i104222222222222 = i49;
                                                                                                                r53 = i45;
                                                                                                                r2 = i27;
                                                                                                                r40 = i40;
                                                                                                                r47 = i104222222222222;
                                                                                                                int i105222222222222 = i38;
                                                                                                                r49 = i37;
                                                                                                                nkbVar7 = nkbVar11222222222222;
                                                                                                                r44 = i105222222222222;
                                                                                                                arrayList6 = arrayList7222222222222;
                                                                                                                r43 = i39;
                                                                                                                sz8Var2 = sz8Var;
                                                                                                                r42 = i47;
                                                                                                                r51 = i55;
                                                                                                                i59 = i8;
                                                                                                                r54 = i56;
                                                                                                                r48 = i36;
                                                                                                                i60 = i9;
                                                                                                                r14 = i13;
                                                                                                                r16 = i20;
                                                                                                                r24 = i25;
                                                                                                                r50 = i422;
                                                                                                                r30 = i92;
                                                                                                                r36 = i26;
                                                                                                                r38 = i32;
                                                                                                                nkbVar8 = nkbVar12222222222222;
                                                                                                                r41 = i41;
                                                                                                                r45 = i50;
                                                                                                                r52 = i54;
                                                                                                                r55 = i53;
                                                                                                                r35 = i103222222222222;
                                                                                                                r6 = i6;
                                                                                                                r46 = i34;
                                                                                                                r56 = i51;
                                                                                                                nkbVar6 = nkbVar10222222222222;
                                                                                                                i62 = i10;
                                                                                                                num = null;
                                                                                                                r33 = i101222222222222;
                                                                                                                nkbVar9 = nkbVar13222222222222;
                                                                                                                r = i24;
                                                                                                                r29 = i91;
                                                                                                                r39 = i99;
                                                                                                            } else {
                                                                                                                if (V0.isNull(i422)) {
                                                                                                                    i50 = i33;
                                                                                                                    i49 = i35;
                                                                                                                    valueOf21 = Integer.valueOf((int) V0.getLong(i422));
                                                                                                                } else {
                                                                                                                    i50 = i33;
                                                                                                                    i49 = i35;
                                                                                                                    valueOf21 = null;
                                                                                                                }
                                                                                                                Integer valueOf25 = !V0.isNull(i43) ? null : Integer.valueOf((int) V0.getLong(i43));
                                                                                                                Integer valueOf26 = !V0.isNull(i44) ? null : Integer.valueOf((int) V0.getLong(i44));
                                                                                                                valueOf22 = !V0.isNull(i45) ? null : Integer.valueOf((int) V0.getLong(i45));
                                                                                                                if (valueOf22 == null) {
                                                                                                                    bool6 = Boolean.valueOf(valueOf22.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool6 = null;
                                                                                                                }
                                                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                                                i51 = r56;
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                    i522 = r57;
                                                                                                                    if (V0.isNull(i522)) {
                                                                                                                        i55 = i43;
                                                                                                                        i54 = i44;
                                                                                                                        i56 = i46;
                                                                                                                        i53 = i48;
                                                                                                                        varInProgress = null;
                                                                                                                        DbEvent dbEvent2222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                                                        int i1012222222222222 = r33;
                                                                                                                        dbEvent2222222222222.setHide(((int) V0.getLong(i1012222222222222)) == 0);
                                                                                                                        r57 = i522;
                                                                                                                        int i1022222222222222 = r34;
                                                                                                                        dbEvent2222222222222.setMute((int) V0.getLong(i1022222222222222));
                                                                                                                        r34 = i1022222222222222;
                                                                                                                        int i1032222222222222 = r35;
                                                                                                                        dbEvent2222222222222.setLastUpdate(V0.getLong(i1032222222222222));
                                                                                                                        nkb nkbVar102222222222222 = nkbVar2;
                                                                                                                        Team team3222222222222 = (Team) nkbVar102222222222222.c(V0.getLong(r3));
                                                                                                                        nkb nkbVar112222222222222 = nkbVar5;
                                                                                                                        Team team22222222222222 = (Team) nkbVar112222222222222.c(V0.getLong(i6));
                                                                                                                        nkb nkbVar122222222222222 = nkbVar4;
                                                                                                                        Tournament tournament2222222222222 = (Tournament) nkbVar122222222222222.c(V0.getLong(r13));
                                                                                                                        nkb nkbVar132222222222222 = nkbVar3;
                                                                                                                        ArrayList arrayList72222222222222 = arrayList42;
                                                                                                                        arrayList72222222222222.add(new DbEventAll(dbEvent2222222222222, team3222222222222, team22222222222222, tournament2222222222222, (DbEventScore) nkbVar132222222222222.c(V0.getLong(r12))));
                                                                                                                        int i1042222222222222 = i49;
                                                                                                                        r53 = i45;
                                                                                                                        r2 = i27;
                                                                                                                        r40 = i40;
                                                                                                                        r47 = i1042222222222222;
                                                                                                                        int i1052222222222222 = i38;
                                                                                                                        r49 = i37;
                                                                                                                        nkbVar7 = nkbVar112222222222222;
                                                                                                                        r44 = i1052222222222222;
                                                                                                                        arrayList6 = arrayList72222222222222;
                                                                                                                        r43 = i39;
                                                                                                                        sz8Var2 = sz8Var;
                                                                                                                        r42 = i47;
                                                                                                                        r51 = i55;
                                                                                                                        i59 = i8;
                                                                                                                        r54 = i56;
                                                                                                                        r48 = i36;
                                                                                                                        i60 = i9;
                                                                                                                        r14 = i13;
                                                                                                                        r16 = i20;
                                                                                                                        r24 = i25;
                                                                                                                        r50 = i422;
                                                                                                                        r30 = i92;
                                                                                                                        r36 = i26;
                                                                                                                        r38 = i32;
                                                                                                                        nkbVar8 = nkbVar122222222222222;
                                                                                                                        r41 = i41;
                                                                                                                        r45 = i50;
                                                                                                                        r52 = i54;
                                                                                                                        r55 = i53;
                                                                                                                        r35 = i1032222222222222;
                                                                                                                        r6 = i6;
                                                                                                                        r46 = i34;
                                                                                                                        r56 = i51;
                                                                                                                        nkbVar6 = nkbVar102222222222222;
                                                                                                                        i62 = i10;
                                                                                                                        num = null;
                                                                                                                        r33 = i1012222222222222;
                                                                                                                        nkbVar9 = nkbVar132222222222222;
                                                                                                                        r = i24;
                                                                                                                        r29 = i91;
                                                                                                                        r39 = i99;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i522 = r57;
                                                                                                                }
                                                                                                                if (V0.isNull(i51)) {
                                                                                                                    i55 = i43;
                                                                                                                    i54 = i44;
                                                                                                                    valueOf19 = null;
                                                                                                                } else {
                                                                                                                    i55 = i43;
                                                                                                                    i54 = i44;
                                                                                                                    valueOf19 = Integer.valueOf((int) V0.getLong(i51));
                                                                                                                }
                                                                                                                if (valueOf19 != null) {
                                                                                                                    bool4 = Boolean.valueOf(valueOf19.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool4 = null;
                                                                                                                }
                                                                                                                if (V0.isNull(i522)) {
                                                                                                                    i56 = i46;
                                                                                                                    i53 = i48;
                                                                                                                    valueOf20 = null;
                                                                                                                } else {
                                                                                                                    i56 = i46;
                                                                                                                    i53 = i48;
                                                                                                                    valueOf20 = Integer.valueOf((int) V0.getLong(i522));
                                                                                                                }
                                                                                                                if (valueOf20 != null) {
                                                                                                                    bool5 = Boolean.valueOf(valueOf20.intValue() != 0);
                                                                                                                } else {
                                                                                                                    bool5 = null;
                                                                                                                }
                                                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                                                DbEvent dbEvent22222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                                                int i10122222222222222 = r33;
                                                                                                                dbEvent22222222222222.setHide(((int) V0.getLong(i10122222222222222)) == 0);
                                                                                                                r57 = i522;
                                                                                                                int i10222222222222222 = r34;
                                                                                                                dbEvent22222222222222.setMute((int) V0.getLong(i10222222222222222));
                                                                                                                r34 = i10222222222222222;
                                                                                                                int i10322222222222222 = r35;
                                                                                                                dbEvent22222222222222.setLastUpdate(V0.getLong(i10322222222222222));
                                                                                                                nkb nkbVar1022222222222222 = nkbVar2;
                                                                                                                Team team32222222222222 = (Team) nkbVar1022222222222222.c(V0.getLong(r3));
                                                                                                                nkb nkbVar1122222222222222 = nkbVar5;
                                                                                                                Team team222222222222222 = (Team) nkbVar1122222222222222.c(V0.getLong(i6));
                                                                                                                nkb nkbVar1222222222222222 = nkbVar4;
                                                                                                                Tournament tournament22222222222222 = (Tournament) nkbVar1222222222222222.c(V0.getLong(r13));
                                                                                                                nkb nkbVar1322222222222222 = nkbVar3;
                                                                                                                ArrayList arrayList722222222222222 = arrayList42;
                                                                                                                arrayList722222222222222.add(new DbEventAll(dbEvent22222222222222, team32222222222222, team222222222222222, tournament22222222222222, (DbEventScore) nkbVar1322222222222222.c(V0.getLong(r12))));
                                                                                                                int i10422222222222222 = i49;
                                                                                                                r53 = i45;
                                                                                                                r2 = i27;
                                                                                                                r40 = i40;
                                                                                                                r47 = i10422222222222222;
                                                                                                                int i10522222222222222 = i38;
                                                                                                                r49 = i37;
                                                                                                                nkbVar7 = nkbVar1122222222222222;
                                                                                                                r44 = i10522222222222222;
                                                                                                                arrayList6 = arrayList722222222222222;
                                                                                                                r43 = i39;
                                                                                                                sz8Var2 = sz8Var;
                                                                                                                r42 = i47;
                                                                                                                r51 = i55;
                                                                                                                i59 = i8;
                                                                                                                r54 = i56;
                                                                                                                r48 = i36;
                                                                                                                i60 = i9;
                                                                                                                r14 = i13;
                                                                                                                r16 = i20;
                                                                                                                r24 = i25;
                                                                                                                r50 = i422;
                                                                                                                r30 = i92;
                                                                                                                r36 = i26;
                                                                                                                r38 = i32;
                                                                                                                nkbVar8 = nkbVar1222222222222222;
                                                                                                                r41 = i41;
                                                                                                                r45 = i50;
                                                                                                                r52 = i54;
                                                                                                                r55 = i53;
                                                                                                                r35 = i10322222222222222;
                                                                                                                r6 = i6;
                                                                                                                r46 = i34;
                                                                                                                r56 = i51;
                                                                                                                nkbVar6 = nkbVar1022222222222222;
                                                                                                                i62 = i10;
                                                                                                                num = null;
                                                                                                                r33 = i10122222222222222;
                                                                                                                nkbVar9 = nkbVar1322222222222222;
                                                                                                                r = i24;
                                                                                                                r29 = i91;
                                                                                                                r39 = i99;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sz8Var = sz8Var2;
                                                                                                        i47 = i29;
                                                                                                        i46 = r54;
                                                                                                        i48 = r55;
                                                                                                        if (V0.isNull(i422)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i43)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i44)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i45)) {
                                                                                                        }
                                                                                                        if (valueOf22 == null) {
                                                                                                        }
                                                                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                                        i51 = r56;
                                                                                                        if (V0.isNull(i51)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i51)) {
                                                                                                        }
                                                                                                        if (valueOf19 != null) {
                                                                                                        }
                                                                                                        if (V0.isNull(i522)) {
                                                                                                        }
                                                                                                        if (valueOf20 != null) {
                                                                                                        }
                                                                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                                                                        DbEvent dbEvent222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                                        int i101222222222222222 = r33;
                                                                                                        dbEvent222222222222222.setHide(((int) V0.getLong(i101222222222222222)) == 0);
                                                                                                        r57 = i522;
                                                                                                        int i102222222222222222 = r34;
                                                                                                        dbEvent222222222222222.setMute((int) V0.getLong(i102222222222222222));
                                                                                                        r34 = i102222222222222222;
                                                                                                        int i103222222222222222 = r35;
                                                                                                        dbEvent222222222222222.setLastUpdate(V0.getLong(i103222222222222222));
                                                                                                        nkb nkbVar10222222222222222 = nkbVar2;
                                                                                                        Team team322222222222222 = (Team) nkbVar10222222222222222.c(V0.getLong(r3));
                                                                                                        nkb nkbVar11222222222222222 = nkbVar5;
                                                                                                        Team team2222222222222222 = (Team) nkbVar11222222222222222.c(V0.getLong(i6));
                                                                                                        nkb nkbVar12222222222222222 = nkbVar4;
                                                                                                        Tournament tournament222222222222222 = (Tournament) nkbVar12222222222222222.c(V0.getLong(r13));
                                                                                                        nkb nkbVar13222222222222222 = nkbVar3;
                                                                                                        ArrayList arrayList7222222222222222 = arrayList42;
                                                                                                        arrayList7222222222222222.add(new DbEventAll(dbEvent222222222222222, team322222222222222, team2222222222222222, tournament222222222222222, (DbEventScore) nkbVar13222222222222222.c(V0.getLong(r12))));
                                                                                                        int i104222222222222222 = i49;
                                                                                                        r53 = i45;
                                                                                                        r2 = i27;
                                                                                                        r40 = i40;
                                                                                                        r47 = i104222222222222222;
                                                                                                        int i105222222222222222 = i38;
                                                                                                        r49 = i37;
                                                                                                        nkbVar7 = nkbVar11222222222222222;
                                                                                                        r44 = i105222222222222222;
                                                                                                        arrayList6 = arrayList7222222222222222;
                                                                                                        r43 = i39;
                                                                                                        sz8Var2 = sz8Var;
                                                                                                        r42 = i47;
                                                                                                        r51 = i55;
                                                                                                        i59 = i8;
                                                                                                        r54 = i56;
                                                                                                        r48 = i36;
                                                                                                        i60 = i9;
                                                                                                        r14 = i13;
                                                                                                        r16 = i20;
                                                                                                        r24 = i25;
                                                                                                        r50 = i422;
                                                                                                        r30 = i92;
                                                                                                        r36 = i26;
                                                                                                        r38 = i32;
                                                                                                        nkbVar8 = nkbVar12222222222222222;
                                                                                                        r41 = i41;
                                                                                                        r45 = i50;
                                                                                                        r52 = i54;
                                                                                                        r55 = i53;
                                                                                                        r35 = i103222222222222222;
                                                                                                        r6 = i6;
                                                                                                        r46 = i34;
                                                                                                        r56 = i51;
                                                                                                        nkbVar6 = nkbVar10222222222222222;
                                                                                                        i62 = i10;
                                                                                                        num = null;
                                                                                                        r33 = i101222222222222222;
                                                                                                        nkbVar9 = nkbVar13222222222222222;
                                                                                                        r = i24;
                                                                                                        r29 = i91;
                                                                                                        r39 = i99;
                                                                                                    }
                                                                                                } else {
                                                                                                    sz8Var = sz8Var2;
                                                                                                    i47 = i29;
                                                                                                }
                                                                                            } else {
                                                                                                sz8Var = sz8Var2;
                                                                                                i47 = i29;
                                                                                                i44 = r52;
                                                                                            }
                                                                                            i45 = r53;
                                                                                            i46 = r54;
                                                                                            i48 = r55;
                                                                                            if (V0.isNull(i422)) {
                                                                                            }
                                                                                            if (!V0.isNull(i43)) {
                                                                                            }
                                                                                            if (!V0.isNull(i44)) {
                                                                                            }
                                                                                            if (!V0.isNull(i45)) {
                                                                                            }
                                                                                            if (valueOf22 == null) {
                                                                                            }
                                                                                            dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                            i51 = r56;
                                                                                            if (V0.isNull(i51)) {
                                                                                            }
                                                                                            if (V0.isNull(i51)) {
                                                                                            }
                                                                                            if (valueOf19 != null) {
                                                                                            }
                                                                                            if (V0.isNull(i522)) {
                                                                                            }
                                                                                            if (valueOf20 != null) {
                                                                                            }
                                                                                            varInProgress = new VarInProgress(bool4, bool5);
                                                                                            DbEvent dbEvent2222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                            int i1012222222222222222 = r33;
                                                                                            dbEvent2222222222222222.setHide(((int) V0.getLong(i1012222222222222222)) == 0);
                                                                                            r57 = i522;
                                                                                            int i1022222222222222222 = r34;
                                                                                            dbEvent2222222222222222.setMute((int) V0.getLong(i1022222222222222222));
                                                                                            r34 = i1022222222222222222;
                                                                                            int i1032222222222222222 = r35;
                                                                                            dbEvent2222222222222222.setLastUpdate(V0.getLong(i1032222222222222222));
                                                                                            nkb nkbVar102222222222222222 = nkbVar2;
                                                                                            Team team3222222222222222 = (Team) nkbVar102222222222222222.c(V0.getLong(r3));
                                                                                            nkb nkbVar112222222222222222 = nkbVar5;
                                                                                            Team team22222222222222222 = (Team) nkbVar112222222222222222.c(V0.getLong(i6));
                                                                                            nkb nkbVar122222222222222222 = nkbVar4;
                                                                                            Tournament tournament2222222222222222 = (Tournament) nkbVar122222222222222222.c(V0.getLong(r13));
                                                                                            nkb nkbVar132222222222222222 = nkbVar3;
                                                                                            ArrayList arrayList72222222222222222 = arrayList42;
                                                                                            arrayList72222222222222222.add(new DbEventAll(dbEvent2222222222222222, team3222222222222222, team22222222222222222, tournament2222222222222222, (DbEventScore) nkbVar132222222222222222.c(V0.getLong(r12))));
                                                                                            int i1042222222222222222 = i49;
                                                                                            r53 = i45;
                                                                                            r2 = i27;
                                                                                            r40 = i40;
                                                                                            r47 = i1042222222222222222;
                                                                                            int i1052222222222222222 = i38;
                                                                                            r49 = i37;
                                                                                            nkbVar7 = nkbVar112222222222222222;
                                                                                            r44 = i1052222222222222222;
                                                                                            arrayList6 = arrayList72222222222222222;
                                                                                            r43 = i39;
                                                                                            sz8Var2 = sz8Var;
                                                                                            r42 = i47;
                                                                                            r51 = i55;
                                                                                            i59 = i8;
                                                                                            r54 = i56;
                                                                                            r48 = i36;
                                                                                            i60 = i9;
                                                                                            r14 = i13;
                                                                                            r16 = i20;
                                                                                            r24 = i25;
                                                                                            r50 = i422;
                                                                                            r30 = i92;
                                                                                            r36 = i26;
                                                                                            r38 = i32;
                                                                                            nkbVar8 = nkbVar122222222222222222;
                                                                                            r41 = i41;
                                                                                            r45 = i50;
                                                                                            r52 = i54;
                                                                                            r55 = i53;
                                                                                            r35 = i1032222222222222222;
                                                                                            r6 = i6;
                                                                                            r46 = i34;
                                                                                            r56 = i51;
                                                                                            nkbVar6 = nkbVar102222222222222222;
                                                                                            i62 = i10;
                                                                                            num = null;
                                                                                            r33 = i1012222222222222222;
                                                                                            nkbVar9 = nkbVar132222222222222222;
                                                                                            r = i24;
                                                                                            r29 = i91;
                                                                                            r39 = i99;
                                                                                        } else {
                                                                                            sz8Var = sz8Var2;
                                                                                            i43 = r51;
                                                                                            i44 = r52;
                                                                                            i45 = r53;
                                                                                            i46 = r54;
                                                                                        }
                                                                                        i47 = i29;
                                                                                        i48 = r55;
                                                                                        if (V0.isNull(i422)) {
                                                                                        }
                                                                                        if (!V0.isNull(i43)) {
                                                                                        }
                                                                                        if (!V0.isNull(i44)) {
                                                                                        }
                                                                                        if (!V0.isNull(i45)) {
                                                                                        }
                                                                                        if (valueOf22 == null) {
                                                                                        }
                                                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                        i51 = r56;
                                                                                        if (V0.isNull(i51)) {
                                                                                        }
                                                                                        if (V0.isNull(i51)) {
                                                                                        }
                                                                                        if (valueOf19 != null) {
                                                                                        }
                                                                                        if (V0.isNull(i522)) {
                                                                                        }
                                                                                        if (valueOf20 != null) {
                                                                                        }
                                                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                                                        DbEvent dbEvent22222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                        int i10122222222222222222 = r33;
                                                                                        dbEvent22222222222222222.setHide(((int) V0.getLong(i10122222222222222222)) == 0);
                                                                                        r57 = i522;
                                                                                        int i10222222222222222222 = r34;
                                                                                        dbEvent22222222222222222.setMute((int) V0.getLong(i10222222222222222222));
                                                                                        r34 = i10222222222222222222;
                                                                                        int i10322222222222222222 = r35;
                                                                                        dbEvent22222222222222222.setLastUpdate(V0.getLong(i10322222222222222222));
                                                                                        nkb nkbVar1022222222222222222 = nkbVar2;
                                                                                        Team team32222222222222222 = (Team) nkbVar1022222222222222222.c(V0.getLong(r3));
                                                                                        nkb nkbVar1122222222222222222 = nkbVar5;
                                                                                        Team team222222222222222222 = (Team) nkbVar1122222222222222222.c(V0.getLong(i6));
                                                                                        nkb nkbVar1222222222222222222 = nkbVar4;
                                                                                        Tournament tournament22222222222222222 = (Tournament) nkbVar1222222222222222222.c(V0.getLong(r13));
                                                                                        nkb nkbVar1322222222222222222 = nkbVar3;
                                                                                        ArrayList arrayList722222222222222222 = arrayList42;
                                                                                        arrayList722222222222222222.add(new DbEventAll(dbEvent22222222222222222, team32222222222222222, team222222222222222222, tournament22222222222222222, (DbEventScore) nkbVar1322222222222222222.c(V0.getLong(r12))));
                                                                                        int i10422222222222222222 = i49;
                                                                                        r53 = i45;
                                                                                        r2 = i27;
                                                                                        r40 = i40;
                                                                                        r47 = i10422222222222222222;
                                                                                        int i10522222222222222222 = i38;
                                                                                        r49 = i37;
                                                                                        nkbVar7 = nkbVar1122222222222222222;
                                                                                        r44 = i10522222222222222222;
                                                                                        arrayList6 = arrayList722222222222222222;
                                                                                        r43 = i39;
                                                                                        sz8Var2 = sz8Var;
                                                                                        r42 = i47;
                                                                                        r51 = i55;
                                                                                        i59 = i8;
                                                                                        r54 = i56;
                                                                                        r48 = i36;
                                                                                        i60 = i9;
                                                                                        r14 = i13;
                                                                                        r16 = i20;
                                                                                        r24 = i25;
                                                                                        r50 = i422;
                                                                                        r30 = i92;
                                                                                        r36 = i26;
                                                                                        r38 = i32;
                                                                                        nkbVar8 = nkbVar1222222222222222222;
                                                                                        r41 = i41;
                                                                                        r45 = i50;
                                                                                        r52 = i54;
                                                                                        r55 = i53;
                                                                                        r35 = i10322222222222222222;
                                                                                        r6 = i6;
                                                                                        r46 = i34;
                                                                                        r56 = i51;
                                                                                        nkbVar6 = nkbVar1022222222222222222;
                                                                                        i62 = i10;
                                                                                        num = null;
                                                                                        r33 = i10122222222222222222;
                                                                                        nkbVar9 = nkbVar1322222222222222222;
                                                                                        r = i24;
                                                                                        r29 = i91;
                                                                                        r39 = i99;
                                                                                    }
                                                                                }
                                                                                if (V0.isNull(i36)) {
                                                                                    i40 = i100;
                                                                                    F03 = V0.F0(i36);
                                                                                } else {
                                                                                    i40 = i100;
                                                                                    F03 = null;
                                                                                }
                                                                                i39 = i30;
                                                                                i41 = i28;
                                                                                i38 = i31;
                                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                                i422 = r50;
                                                                                if (V0.isNull(i422)) {
                                                                                }
                                                                                i47 = i29;
                                                                                i48 = r55;
                                                                                if (V0.isNull(i422)) {
                                                                                }
                                                                                if (!V0.isNull(i43)) {
                                                                                }
                                                                                if (!V0.isNull(i44)) {
                                                                                }
                                                                                if (!V0.isNull(i45)) {
                                                                                }
                                                                                if (valueOf22 == null) {
                                                                                }
                                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                                i51 = r56;
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (V0.isNull(i51)) {
                                                                                }
                                                                                if (valueOf19 != null) {
                                                                                }
                                                                                if (V0.isNull(i522)) {
                                                                                }
                                                                                if (valueOf20 != null) {
                                                                                }
                                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                                DbEvent dbEvent222222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                                int i101222222222222222222 = r33;
                                                                                dbEvent222222222222222222.setHide(((int) V0.getLong(i101222222222222222222)) == 0);
                                                                                r57 = i522;
                                                                                int i102222222222222222222 = r34;
                                                                                dbEvent222222222222222222.setMute((int) V0.getLong(i102222222222222222222));
                                                                                r34 = i102222222222222222222;
                                                                                int i103222222222222222222 = r35;
                                                                                dbEvent222222222222222222.setLastUpdate(V0.getLong(i103222222222222222222));
                                                                                nkb nkbVar10222222222222222222 = nkbVar2;
                                                                                Team team322222222222222222 = (Team) nkbVar10222222222222222222.c(V0.getLong(r3));
                                                                                nkb nkbVar11222222222222222222 = nkbVar5;
                                                                                Team team2222222222222222222 = (Team) nkbVar11222222222222222222.c(V0.getLong(i6));
                                                                                nkb nkbVar12222222222222222222 = nkbVar4;
                                                                                Tournament tournament222222222222222222 = (Tournament) nkbVar12222222222222222222.c(V0.getLong(r13));
                                                                                nkb nkbVar13222222222222222222 = nkbVar3;
                                                                                ArrayList arrayList7222222222222222222 = arrayList42;
                                                                                arrayList7222222222222222222.add(new DbEventAll(dbEvent222222222222222222, team322222222222222222, team2222222222222222222, tournament222222222222222222, (DbEventScore) nkbVar13222222222222222222.c(V0.getLong(r12))));
                                                                                int i104222222222222222222 = i49;
                                                                                r53 = i45;
                                                                                r2 = i27;
                                                                                r40 = i40;
                                                                                r47 = i104222222222222222222;
                                                                                int i105222222222222222222 = i38;
                                                                                r49 = i37;
                                                                                nkbVar7 = nkbVar11222222222222222222;
                                                                                r44 = i105222222222222222222;
                                                                                arrayList6 = arrayList7222222222222222222;
                                                                                r43 = i39;
                                                                                sz8Var2 = sz8Var;
                                                                                r42 = i47;
                                                                                r51 = i55;
                                                                                i59 = i8;
                                                                                r54 = i56;
                                                                                r48 = i36;
                                                                                i60 = i9;
                                                                                r14 = i13;
                                                                                r16 = i20;
                                                                                r24 = i25;
                                                                                r50 = i422;
                                                                                r30 = i92;
                                                                                r36 = i26;
                                                                                r38 = i32;
                                                                                nkbVar8 = nkbVar12222222222222222222;
                                                                                r41 = i41;
                                                                                r45 = i50;
                                                                                r52 = i54;
                                                                                r55 = i53;
                                                                                r35 = i103222222222222222222;
                                                                                r6 = i6;
                                                                                r46 = i34;
                                                                                r56 = i51;
                                                                                nkbVar6 = nkbVar10222222222222222222;
                                                                                i62 = i10;
                                                                                num = null;
                                                                                r33 = i101222222222222222222;
                                                                                nkbVar9 = nkbVar13222222222222222222;
                                                                                r = i24;
                                                                                r29 = i91;
                                                                                r39 = i99;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                i27 = r2;
                                                                i32 = i98;
                                                                nkbVar3 = nkbVar9;
                                                                arrayList42 = arrayList32;
                                                                i31 = r44;
                                                                i33 = r45;
                                                                i34 = r46;
                                                                i35 = r47;
                                                                if (V0.isNull(i100)) {
                                                                }
                                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                                i36 = r48;
                                                                if (V0.isNull(i36)) {
                                                                }
                                                                if (V0.isNull(i36)) {
                                                                }
                                                                i39 = i30;
                                                                i41 = i28;
                                                                i38 = i31;
                                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                                i422 = r50;
                                                                if (V0.isNull(i422)) {
                                                                }
                                                                i47 = i29;
                                                                i48 = r55;
                                                                if (V0.isNull(i422)) {
                                                                }
                                                                if (!V0.isNull(i43)) {
                                                                }
                                                                if (!V0.isNull(i44)) {
                                                                }
                                                                if (!V0.isNull(i45)) {
                                                                }
                                                                if (valueOf22 == null) {
                                                                }
                                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                                i51 = r56;
                                                                if (V0.isNull(i51)) {
                                                                }
                                                                if (V0.isNull(i51)) {
                                                                }
                                                                if (valueOf19 != null) {
                                                                }
                                                                if (V0.isNull(i522)) {
                                                                }
                                                                if (valueOf20 != null) {
                                                                }
                                                                varInProgress = new VarInProgress(bool4, bool5);
                                                                DbEvent dbEvent2222222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                                int i1012222222222222222222 = r33;
                                                                dbEvent2222222222222222222.setHide(((int) V0.getLong(i1012222222222222222222)) == 0);
                                                                r57 = i522;
                                                                int i1022222222222222222222 = r34;
                                                                dbEvent2222222222222222222.setMute((int) V0.getLong(i1022222222222222222222));
                                                                r34 = i1022222222222222222222;
                                                                int i1032222222222222222222 = r35;
                                                                dbEvent2222222222222222222.setLastUpdate(V0.getLong(i1032222222222222222222));
                                                                nkb nkbVar102222222222222222222 = nkbVar2;
                                                                Team team3222222222222222222 = (Team) nkbVar102222222222222222222.c(V0.getLong(r3));
                                                                nkb nkbVar112222222222222222222 = nkbVar5;
                                                                Team team22222222222222222222 = (Team) nkbVar112222222222222222222.c(V0.getLong(i6));
                                                                nkb nkbVar122222222222222222222 = nkbVar4;
                                                                Tournament tournament2222222222222222222 = (Tournament) nkbVar122222222222222222222.c(V0.getLong(r13));
                                                                nkb nkbVar132222222222222222222 = nkbVar3;
                                                                ArrayList arrayList72222222222222222222 = arrayList42;
                                                                arrayList72222222222222222222.add(new DbEventAll(dbEvent2222222222222222222, team3222222222222222222, team22222222222222222222, tournament2222222222222222222, (DbEventScore) nkbVar132222222222222222222.c(V0.getLong(r12))));
                                                                int i1042222222222222222222 = i49;
                                                                r53 = i45;
                                                                r2 = i27;
                                                                r40 = i40;
                                                                r47 = i1042222222222222222222;
                                                                int i1052222222222222222222 = i38;
                                                                r49 = i37;
                                                                nkbVar7 = nkbVar112222222222222222222;
                                                                r44 = i1052222222222222222222;
                                                                arrayList6 = arrayList72222222222222222222;
                                                                r43 = i39;
                                                                sz8Var2 = sz8Var;
                                                                r42 = i47;
                                                                r51 = i55;
                                                                i59 = i8;
                                                                r54 = i56;
                                                                r48 = i36;
                                                                i60 = i9;
                                                                r14 = i13;
                                                                r16 = i20;
                                                                r24 = i25;
                                                                r50 = i422;
                                                                r30 = i92;
                                                                r36 = i26;
                                                                r38 = i32;
                                                                nkbVar8 = nkbVar122222222222222222222;
                                                                r41 = i41;
                                                                r45 = i50;
                                                                r52 = i54;
                                                                r55 = i53;
                                                                r35 = i1032222222222222222222;
                                                                r6 = i6;
                                                                r46 = i34;
                                                                r56 = i51;
                                                                nkbVar6 = nkbVar102222222222222222222;
                                                                i62 = i10;
                                                                num = null;
                                                                r33 = i1012222222222222222222;
                                                                nkbVar9 = nkbVar132222222222222222222;
                                                                r = i24;
                                                                r29 = i91;
                                                                r39 = i99;
                                                            }
                                                        } else {
                                                            status = status2;
                                                            i27 = r2;
                                                            i32 = i98;
                                                            arrayList42 = arrayList32;
                                                            i30 = r43;
                                                            i31 = r44;
                                                            i33 = r45;
                                                            i34 = r46;
                                                        }
                                                        nkbVar3 = nkbVar9;
                                                        i35 = r47;
                                                        if (V0.isNull(i100)) {
                                                        }
                                                        time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                        i36 = r48;
                                                        if (V0.isNull(i36)) {
                                                        }
                                                        if (V0.isNull(i36)) {
                                                        }
                                                        i39 = i30;
                                                        i41 = i28;
                                                        i38 = i31;
                                                        eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                        i422 = r50;
                                                        if (V0.isNull(i422)) {
                                                        }
                                                        i47 = i29;
                                                        i48 = r55;
                                                        if (V0.isNull(i422)) {
                                                        }
                                                        if (!V0.isNull(i43)) {
                                                        }
                                                        if (!V0.isNull(i44)) {
                                                        }
                                                        if (!V0.isNull(i45)) {
                                                        }
                                                        if (valueOf22 == null) {
                                                        }
                                                        dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                        i51 = r56;
                                                        if (V0.isNull(i51)) {
                                                        }
                                                        if (V0.isNull(i51)) {
                                                        }
                                                        if (valueOf19 != null) {
                                                        }
                                                        if (V0.isNull(i522)) {
                                                        }
                                                        if (valueOf20 != null) {
                                                        }
                                                        varInProgress = new VarInProgress(bool4, bool5);
                                                        DbEvent dbEvent22222222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                        int i10122222222222222222222 = r33;
                                                        dbEvent22222222222222222222.setHide(((int) V0.getLong(i10122222222222222222222)) == 0);
                                                        r57 = i522;
                                                        int i10222222222222222222222 = r34;
                                                        dbEvent22222222222222222222.setMute((int) V0.getLong(i10222222222222222222222));
                                                        r34 = i10222222222222222222222;
                                                        int i10322222222222222222222 = r35;
                                                        dbEvent22222222222222222222.setLastUpdate(V0.getLong(i10322222222222222222222));
                                                        nkb nkbVar1022222222222222222222 = nkbVar2;
                                                        Team team32222222222222222222 = (Team) nkbVar1022222222222222222222.c(V0.getLong(r3));
                                                        nkb nkbVar1122222222222222222222 = nkbVar5;
                                                        Team team222222222222222222222 = (Team) nkbVar1122222222222222222222.c(V0.getLong(i6));
                                                        nkb nkbVar1222222222222222222222 = nkbVar4;
                                                        Tournament tournament22222222222222222222 = (Tournament) nkbVar1222222222222222222222.c(V0.getLong(r13));
                                                        nkb nkbVar1322222222222222222222 = nkbVar3;
                                                        ArrayList arrayList722222222222222222222 = arrayList42;
                                                        arrayList722222222222222222222.add(new DbEventAll(dbEvent22222222222222222222, team32222222222222222222, team222222222222222222222, tournament22222222222222222222, (DbEventScore) nkbVar1322222222222222222222.c(V0.getLong(r12))));
                                                        int i10422222222222222222222 = i49;
                                                        r53 = i45;
                                                        r2 = i27;
                                                        r40 = i40;
                                                        r47 = i10422222222222222222222;
                                                        int i10522222222222222222222 = i38;
                                                        r49 = i37;
                                                        nkbVar7 = nkbVar1122222222222222222222;
                                                        r44 = i10522222222222222222222;
                                                        arrayList6 = arrayList722222222222222222222;
                                                        r43 = i39;
                                                        sz8Var2 = sz8Var;
                                                        r42 = i47;
                                                        r51 = i55;
                                                        i59 = i8;
                                                        r54 = i56;
                                                        r48 = i36;
                                                        i60 = i9;
                                                        r14 = i13;
                                                        r16 = i20;
                                                        r24 = i25;
                                                        r50 = i422;
                                                        r30 = i92;
                                                        r36 = i26;
                                                        r38 = i32;
                                                        nkbVar8 = nkbVar1222222222222222222222;
                                                        r41 = i41;
                                                        r45 = i50;
                                                        r52 = i54;
                                                        r55 = i53;
                                                        r35 = i10322222222222222222222;
                                                        r6 = i6;
                                                        r46 = i34;
                                                        r56 = i51;
                                                        nkbVar6 = nkbVar1022222222222222222222;
                                                        i62 = i10;
                                                        num = null;
                                                        r33 = i10122222222222222222222;
                                                        nkbVar9 = nkbVar1322222222222222222222;
                                                        r = i24;
                                                        r29 = i91;
                                                        r39 = i99;
                                                    } else {
                                                        status = status2;
                                                        i27 = r2;
                                                        i32 = i98;
                                                        i29 = r42;
                                                        i30 = r43;
                                                        i31 = r44;
                                                        i33 = r45;
                                                    }
                                                    nkbVar3 = nkbVar9;
                                                    arrayList42 = arrayList32;
                                                    i34 = r46;
                                                    i35 = r47;
                                                    if (V0.isNull(i100)) {
                                                    }
                                                    time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                    i36 = r48;
                                                    if (V0.isNull(i36)) {
                                                    }
                                                    if (V0.isNull(i36)) {
                                                    }
                                                    i39 = i30;
                                                    i41 = i28;
                                                    i38 = i31;
                                                    eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                    i422 = r50;
                                                    if (V0.isNull(i422)) {
                                                    }
                                                    i47 = i29;
                                                    i48 = r55;
                                                    if (V0.isNull(i422)) {
                                                    }
                                                    if (!V0.isNull(i43)) {
                                                    }
                                                    if (!V0.isNull(i44)) {
                                                    }
                                                    if (!V0.isNull(i45)) {
                                                    }
                                                    if (valueOf22 == null) {
                                                    }
                                                    dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                    i51 = r56;
                                                    if (V0.isNull(i51)) {
                                                    }
                                                    if (V0.isNull(i51)) {
                                                    }
                                                    if (valueOf19 != null) {
                                                    }
                                                    if (V0.isNull(i522)) {
                                                    }
                                                    if (valueOf20 != null) {
                                                    }
                                                    varInProgress = new VarInProgress(bool4, bool5);
                                                    DbEvent dbEvent222222222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                    int i101222222222222222222222 = r33;
                                                    dbEvent222222222222222222222.setHide(((int) V0.getLong(i101222222222222222222222)) == 0);
                                                    r57 = i522;
                                                    int i102222222222222222222222 = r34;
                                                    dbEvent222222222222222222222.setMute((int) V0.getLong(i102222222222222222222222));
                                                    r34 = i102222222222222222222222;
                                                    int i103222222222222222222222 = r35;
                                                    dbEvent222222222222222222222.setLastUpdate(V0.getLong(i103222222222222222222222));
                                                    nkb nkbVar10222222222222222222222 = nkbVar2;
                                                    Team team322222222222222222222 = (Team) nkbVar10222222222222222222222.c(V0.getLong(r3));
                                                    nkb nkbVar11222222222222222222222 = nkbVar5;
                                                    Team team2222222222222222222222 = (Team) nkbVar11222222222222222222222.c(V0.getLong(i6));
                                                    nkb nkbVar12222222222222222222222 = nkbVar4;
                                                    Tournament tournament222222222222222222222 = (Tournament) nkbVar12222222222222222222222.c(V0.getLong(r13));
                                                    nkb nkbVar13222222222222222222222 = nkbVar3;
                                                    ArrayList arrayList7222222222222222222222 = arrayList42;
                                                    arrayList7222222222222222222222.add(new DbEventAll(dbEvent222222222222222222222, team322222222222222222222, team2222222222222222222222, tournament222222222222222222222, (DbEventScore) nkbVar13222222222222222222222.c(V0.getLong(r12))));
                                                    int i104222222222222222222222 = i49;
                                                    r53 = i45;
                                                    r2 = i27;
                                                    r40 = i40;
                                                    r47 = i104222222222222222222222;
                                                    int i105222222222222222222222 = i38;
                                                    r49 = i37;
                                                    nkbVar7 = nkbVar11222222222222222222222;
                                                    r44 = i105222222222222222222222;
                                                    arrayList6 = arrayList7222222222222222222222;
                                                    r43 = i39;
                                                    sz8Var2 = sz8Var;
                                                    r42 = i47;
                                                    r51 = i55;
                                                    i59 = i8;
                                                    r54 = i56;
                                                    r48 = i36;
                                                    i60 = i9;
                                                    r14 = i13;
                                                    r16 = i20;
                                                    r24 = i25;
                                                    r50 = i422;
                                                    r30 = i92;
                                                    r36 = i26;
                                                    r38 = i32;
                                                    nkbVar8 = nkbVar12222222222222222222222;
                                                    r41 = i41;
                                                    r45 = i50;
                                                    r52 = i54;
                                                    r55 = i53;
                                                    r35 = i103222222222222222222222;
                                                    r6 = i6;
                                                    r46 = i34;
                                                    r56 = i51;
                                                    nkbVar6 = nkbVar10222222222222222222222;
                                                    i62 = i10;
                                                    num = null;
                                                    r33 = i101222222222222222222222;
                                                    nkbVar9 = nkbVar13222222222222222222222;
                                                    r = i24;
                                                    r29 = i91;
                                                    r39 = i99;
                                                } else {
                                                    status = status2;
                                                    i27 = r2;
                                                    i28 = r41;
                                                    i29 = r42;
                                                    i30 = r43;
                                                    i31 = r44;
                                                }
                                                i32 = i98;
                                                nkbVar3 = nkbVar9;
                                                arrayList42 = arrayList32;
                                                i33 = r45;
                                                i34 = r46;
                                                i35 = r47;
                                                if (V0.isNull(i100)) {
                                                }
                                                time = new Time(valueOf23, V0.isNull(i28) ? null : Integer.valueOf((int) V0.getLong(i28)), V0.isNull(i29) ? null : Integer.valueOf((int) V0.getLong(i29)), V0.isNull(i30) ? null : Integer.valueOf((int) V0.getLong(i30)), V0.isNull(i31) ? null : Long.valueOf(V0.getLong(i31)), V0.isNull(i33) ? null : Long.valueOf(V0.getLong(i33)), V0.isNull(i34) ? null : Long.valueOf(V0.getLong(i34)), V0.isNull(i35) ? null : Long.valueOf(V0.getLong(i35)));
                                                i36 = r48;
                                                if (V0.isNull(i36)) {
                                                }
                                                if (V0.isNull(i36)) {
                                                }
                                                i39 = i30;
                                                i41 = i28;
                                                i38 = i31;
                                                eventChanges = new EventChanges(sz8Var2.y(F03), V0.getLong(i37));
                                                i422 = r50;
                                                if (V0.isNull(i422)) {
                                                }
                                                i47 = i29;
                                                i48 = r55;
                                                if (V0.isNull(i422)) {
                                                }
                                                if (!V0.isNull(i43)) {
                                                }
                                                if (!V0.isNull(i44)) {
                                                }
                                                if (!V0.isNull(i45)) {
                                                }
                                                if (valueOf22 == null) {
                                                }
                                                dbAmericanFootballDownDistance = new DbAmericanFootballDownDistance(valueOf21, valueOf25, valueOf26, bool6, !V0.isNull(i46) ? null : Integer.valueOf((int) V0.getLong(i46)), !V0.isNull(i48) ? null : Integer.valueOf((int) V0.getLong(i48)));
                                                i51 = r56;
                                                if (V0.isNull(i51)) {
                                                }
                                                if (V0.isNull(i51)) {
                                                }
                                                if (valueOf19 != null) {
                                                }
                                                if (V0.isNull(i522)) {
                                                }
                                                if (valueOf20 != null) {
                                                }
                                                varInProgress = new VarInProgress(bool4, bool5);
                                                DbEvent dbEvent2222222222222222222222 = new DbEvent(season, status, num2, valueOf24, i52, valueOf, valueOf2, i7, valueOf3, valueOf4, z, j, valueOf5, i74, i11, valueOf6, time, eventChanges, valueOf7, F04, valueOf8, valueOf9, valueOf10, valueOf11, dbAmericanFootballDownDistance, valueOf12, valueOf13, valueOf14, F05, bool, bool2, bool3, valueOf18, y2, varInProgress, A, F06, F07);
                                                int i1012222222222222222222222 = r33;
                                                dbEvent2222222222222222222222.setHide(((int) V0.getLong(i1012222222222222222222222)) == 0);
                                                r57 = i522;
                                                int i1022222222222222222222222 = r34;
                                                dbEvent2222222222222222222222.setMute((int) V0.getLong(i1022222222222222222222222));
                                                r34 = i1022222222222222222222222;
                                                int i1032222222222222222222222 = r35;
                                                dbEvent2222222222222222222222.setLastUpdate(V0.getLong(i1032222222222222222222222));
                                                nkb nkbVar102222222222222222222222 = nkbVar2;
                                                Team team3222222222222222222222 = (Team) nkbVar102222222222222222222222.c(V0.getLong(r3));
                                                nkb nkbVar112222222222222222222222 = nkbVar5;
                                                Team team22222222222222222222222 = (Team) nkbVar112222222222222222222222.c(V0.getLong(i6));
                                                nkb nkbVar122222222222222222222222 = nkbVar4;
                                                Tournament tournament2222222222222222222222 = (Tournament) nkbVar122222222222222222222222.c(V0.getLong(r13));
                                                nkb nkbVar132222222222222222222222 = nkbVar3;
                                                ArrayList arrayList72222222222222222222222 = arrayList42;
                                                arrayList72222222222222222222222.add(new DbEventAll(dbEvent2222222222222222222222, team3222222222222222222222, team22222222222222222222222, tournament2222222222222222222222, (DbEventScore) nkbVar132222222222222222222222.c(V0.getLong(r12))));
                                                int i1042222222222222222222222 = i49;
                                                r53 = i45;
                                                r2 = i27;
                                                r40 = i40;
                                                r47 = i1042222222222222222222222;
                                                int i1052222222222222222222222 = i38;
                                                r49 = i37;
                                                nkbVar7 = nkbVar112222222222222222222222;
                                                r44 = i1052222222222222222222222;
                                                arrayList6 = arrayList72222222222222222222222;
                                                r43 = i39;
                                                sz8Var2 = sz8Var;
                                                r42 = i47;
                                                r51 = i55;
                                                i59 = i8;
                                                r54 = i56;
                                                r48 = i36;
                                                i60 = i9;
                                                r14 = i13;
                                                r16 = i20;
                                                r24 = i25;
                                                r50 = i422;
                                                r30 = i92;
                                                r36 = i26;
                                                r38 = i32;
                                                nkbVar8 = nkbVar122222222222222222222222;
                                                r41 = i41;
                                                r45 = i50;
                                                r52 = i54;
                                                r55 = i53;
                                                r35 = i1032222222222222222222222;
                                                r6 = i6;
                                                r46 = i34;
                                                r56 = i51;
                                                nkbVar6 = nkbVar102222222222222222222222;
                                                i62 = i10;
                                                num = null;
                                                r33 = i1012222222222222222222222;
                                                nkbVar9 = nkbVar132222222222222222222222;
                                                r = i24;
                                                r29 = i91;
                                                r39 = i99;
                                            }
                                            ArrayList arrayList8 = arrayList6;
                                            V0.close();
                                            return arrayList8;
                                        } catch (Throwable th) {
                                            V0.close();
                                            throw th;
                                        }
                                }
                            }
                        });
                        if (obj == lu3Var2) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                int c2 = sub.c(k13.r(iterable, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                for (Object obj2 : iterable) {
                    linkedHashMap2.put(new Integer(((Stage) obj2).getId()), obj2);
                }
                break;
        }
        return null;
    }
}
