package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r0 == 295) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07b2 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07cb A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07ce A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07bc A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[Catch: Exception -> 0x003d, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x002c, B:5:0x0038, B:9:0x0042, B:11:0x004e, B:18:0x007a, B:20:0x0086, B:22:0x008e, B:24:0x0099, B:26:0x009f, B:28:0x00aa, B:30:0x00b0, B:31:0x00db, B:33:0x00e1, B:35:0x00e6, B:38:0x0107, B:40:0x010d, B:42:0x0148, B:43:0x014c, B:45:0x0152, B:48:0x015b, B:51:0x01ae, B:52:0x01e3, B:55:0x01ef, B:57:0x0202, B:58:0x020b, B:59:0x021a, B:61:0x0229, B:62:0x0236, B:65:0x0242, B:67:0x026d, B:69:0x0273, B:71:0x0279, B:72:0x0297, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02e2, B:80:0x02ea, B:82:0x02f0, B:83:0x030e, B:84:0x0319, B:86:0x0321, B:88:0x0327, B:89:0x0345, B:90:0x0350, B:92:0x0358, B:94:0x035e, B:95:0x037c, B:96:0x0387, B:99:0x039c, B:102:0x03a8, B:103:0x03ac, B:104:0x03af, B:107:0x03b9, B:109:0x03c7, B:112:0x03d9, B:114:0x03df, B:115:0x042b, B:117:0x0435, B:120:0x0441, B:122:0x0447, B:123:0x045e, B:124:0x0462, B:126:0x0468, B:127:0x047f, B:128:0x0482, B:130:0x048c, B:133:0x049d, B:134:0x04c9, B:137:0x04d2, B:139:0x04d8, B:140:0x0513, B:144:0x0520, B:146:0x0538, B:148:0x0560, B:150:0x0566, B:151:0x058b, B:153:0x058f, B:155:0x059f, B:156:0x05a4, B:158:0x05ae, B:159:0x05b7, B:161:0x05bd, B:162:0x05ca, B:164:0x05e9, B:166:0x05ef, B:167:0x05fc, B:169:0x0606, B:170:0x060f, B:172:0x0617, B:174:0x061d, B:175:0x062a, B:177:0x0634, B:178:0x063d, B:179:0x064a, B:181:0x0652, B:185:0x066c, B:188:0x067a, B:190:0x06a0, B:192:0x06a6, B:193:0x06ab, B:194:0x06a9, B:195:0x06b2, B:197:0x06ba, B:199:0x06c0, B:200:0x06c5, B:201:0x06c3, B:202:0x06cc, B:205:0x06d6, B:207:0x06de, B:208:0x06e6, B:210:0x06f4, B:212:0x06fa, B:213:0x06ff, B:215:0x070e, B:217:0x0714, B:218:0x0719, B:221:0x072c, B:224:0x074c, B:227:0x0757, B:228:0x0769, B:230:0x0775, B:235:0x0784, B:237:0x0790, B:239:0x079a, B:242:0x07b2, B:243:0x07c5, B:245:0x07cb, B:246:0x07d0, B:247:0x07ce, B:248:0x07bc, B:249:0x07a5, B:251:0x07ab, B:252:0x080b, B:253:0x07d8, B:255:0x07e6, B:256:0x07f9, B:258:0x07ff, B:259:0x0804, B:260:0x0802, B:261:0x07f0, B:265:0x075b, B:266:0x0748, B:268:0x0717, B:269:0x06fd, B:275:0x0584, B:276:0x0558, B:278:0x04ef, B:279:0x04f3, B:281:0x04f9, B:282:0x0510, B:283:0x04bd, B:285:0x03fa, B:286:0x0402, B:288:0x040c, B:289:0x0423, B:291:0x02d2, B:293:0x0260, B:294:0x0213, B:295:0x01da, B:309:0x013e, B:311:0x0142, B:313:0x00a4, B:315:0x00b4, B:316:0x00b9, B:318:0x00bf, B:319:0x00c7, B:321:0x00cd, B:323:0x00d8, B:324:0x00d2, B:329:0x0071, B:303:0x011d, B:305:0x0138, B:13:0x0055, B:15:0x005b), top: B:2:0x002c, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.mbridge.msdk.foundation.same.report.metrics.e] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> c(String str, c cVar) {
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean contains;
        String str8 = CampaignEx.JSON_KEY_EC_TEMP_ID;
        String str9 = "vtid";
        String str10 = CampaignEx.KEY_LOCAL_CHECK_STATE;
        int i = 1;
        String str11 = "rid_n";
        ?? eVar = new e();
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        if (Arrays.asList(b.g).contains(str)) {
            return eVar.a();
        }
        if (cVar == null) {
            eVar.a("metrics_data_reason", "metrics 上报时意外为空");
            return eVar.a();
        }
        String str12 = BidResponsedEx.KEY_CID;
        ?? arrayList = new ArrayList();
        try {
            if (cVar.n() != null) {
                int adType = cVar.n().getAdType();
                str2 = CampaignEx.JSON_KEY_HB;
            } else {
                str2 = CampaignEx.JSON_KEY_HB;
            }
        } catch (Throwable th) {
            str2 = CampaignEx.JSON_KEY_HB;
            q0.b("SameMetricsReport", th.getMessage());
        }
        if (Arrays.asList(b.f).contains(str)) {
            if ("m_download_start".equals(str) || "m_download_end".equals(str)) {
                arrayList = a(cVar, str);
            } else {
                List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                if (o != null && o.size() > 0) {
                    arrayList.addAll(o);
                }
            }
            if (!arrayList.isEmpty()) {
                return eVar.a();
            }
            Map<String, Map<String, String>> w = cVar.w();
            String str13 = cVar.t() + str;
            if (!w.containsKey(str13) || w.get(str13) == null) {
                list = arrayList;
            } else {
                list = arrayList;
                if (w.get(str13).containsKey("126_exclude")) {
                    try {
                        String str14 = w.get(str13).get("126_exclude");
                        w.get(str13).remove("126_exclude");
                        if ("1".equals(str14)) {
                            return eVar.a();
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx != null) {
                    eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                    eVar.a("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                    eVar.a("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    Iterator it2 = it;
                    boolean z = false;
                    if (rsIgnoreCheckRule != null) {
                        eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                        eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                        eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                    } else {
                        eVar.a("ignore_video", 1);
                        eVar.a("ignore_template", 1);
                        eVar.a("ignore_ec", 1);
                    }
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    } else {
                        eVar.a("n_lrid", campaignEx.getNLRid());
                        if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                            eVar.a("n_rid", campaignEx.getNRid());
                        }
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    }
                    eVar.a("rid", campaignEx.getRequestId());
                    if (campaignEx.getMof_tplid() != 0) {
                        eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (eVar.a(str10)) {
                        eVar.a(str10, eVar.b(str10) + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getLocalCheckShow());
                    } else {
                        eVar.a(str10, Integer.valueOf(campaignEx.getLocalCheckShow()));
                    }
                    if (rewardTemplateMode != null && rewardTemplateMode.k() != 0) {
                        if (eVar.a(str9)) {
                            eVar.a(str9, eVar.b(str9) + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + rewardTemplateMode.k());
                        } else {
                            eVar.a(str9, Integer.valueOf(rewardTemplateMode.k()));
                        }
                    }
                    if (campaignEx.getCreativeId() == 0) {
                        str3 = str9;
                        str4 = str10;
                    } else if (eVar.a("crid")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(eVar.b("crid"));
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                        str3 = str9;
                        str4 = str10;
                        sb.append(campaignEx.getCreativeId());
                        eVar.a("crid", sb.toString());
                    } else {
                        str3 = str9;
                        str4 = str10;
                        eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                    }
                    if (campaignEx.getVidCrtvId() != 0) {
                        if (eVar.a("video_crid")) {
                            eVar.a("video_crid", eVar.b("video_crid") + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getVidCrtvId());
                        } else {
                            eVar.a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                        }
                    }
                    if (campaignEx.getEcCrtvId() != 0) {
                        if (eVar.a("endcard_crid")) {
                            eVar.a("endcard_crid", eVar.b("endcard_crid") + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getEcCrtvId());
                        } else {
                            eVar.a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                        }
                    }
                    if (campaignEx.getEcTemplateId() != 0) {
                        if (eVar.a(str8)) {
                            eVar.a(str8, eVar.b(str8) + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getEcTemplateId());
                        } else {
                            eVar.a(str8, Long.valueOf(campaignEx.getEcTemplateId()));
                        }
                    }
                    eVar.a("bid_tk", campaignEx.getBidToken());
                    if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                        if (v0.i(campaignEx.getMof_template_url())) {
                            eVar.a("sdyv", "1");
                        } else {
                            eVar.a("sdyv", "2");
                        }
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                        str6 = str4;
                    } else if (!v0.i(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                        str6 = str4;
                        if (eVar.a("vdyv")) {
                            eVar.a("vdyv", eVar.b("vdyv") + ",2");
                        } else {
                            eVar.a("vdyv", "2");
                        }
                    } else if (eVar.a("vdyv")) {
                        str5 = str3;
                        StringBuilder sb2 = new StringBuilder();
                        str6 = str4;
                        sb2.append(eVar.b("vdyv"));
                        sb2.append(",1");
                        eVar.a("vdyv", sb2.toString());
                    } else {
                        str5 = str3;
                        str6 = str4;
                        eVar.a("vdyv", "1");
                    }
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        if (v0.i(campaignEx.getendcard_url())) {
                            if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",1");
                            } else {
                                eVar.a("edyv", "1");
                            }
                        } else if (eVar.a("edyv")) {
                            eVar.a("edyv", eVar.b("edyv") + ",2");
                        } else {
                            eVar.a("edyv", "2");
                        }
                    }
                    if (TextUtils.isEmpty(campaignEx.getExt_data())) {
                        str7 = str8;
                    } else {
                        JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                        if (eVar.a("dspid")) {
                            StringBuilder sb3 = new StringBuilder();
                            str7 = str8;
                            sb3.append(eVar.b("dspid"));
                            sb3.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                            sb3.append(jSONObject.optString("par_dspid"));
                            eVar.a("dspid", sb3.toString());
                        } else {
                            str7 = str8;
                            eVar.a("dspid", jSONObject.optString("par_dspid"));
                        }
                    }
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",2");
                        } else {
                            eVar.a("only_ec", "2");
                        }
                    } else if (eVar.a("only_ec")) {
                        eVar.a("only_ec", eVar.b("only_ec") + ",1");
                    } else {
                        eVar.a("only_ec", "1");
                    }
                    String str15 = str2;
                    eVar.a(str15, campaignEx.isBidCampaign() ? "1" : "0");
                    eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                    String str16 = str12;
                    if (eVar.a(str16)) {
                        eVar.a(str16, eVar.b(str16) + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getId());
                    } else {
                        eVar.a(str16, campaignEx.getId());
                    }
                    String str17 = str11;
                    if (eVar.a(str17)) {
                        eVar.a(str17, eVar.b(str17) + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + campaignEx.getRequestIdNotice());
                    } else {
                        eVar.a(str17, campaignEx.getRequestIdNotice());
                    }
                    HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                    if (hashMap != null) {
                        String str18 = hashMap.get(campaignEx.getCampaignUnitId());
                        if (!TextUtils.isEmpty(str18)) {
                            eVar.a("u_stid", str18);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                        eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                    }
                    if (campaignEx.getAdType() != 0) {
                        eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                    }
                    eVar.a(str15, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                    eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                    if ("2000047".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason_d", campaignEx.getReasond());
                        }
                    }
                    if ("2000048".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason", campaignEx.getReasond());
                        }
                        eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                    }
                    if (campaignEx.getAdType() != 94 && campaignEx.getAdType() != 287) {
                        it = it2;
                        str2 = str15;
                        str12 = str16;
                        str11 = str17;
                        str9 = str5;
                        str10 = str6;
                        str8 = str7;
                    }
                    if (Arrays.asList(b.j).contains(str)) {
                        eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                        eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                        if (Arrays.asList(b.l).contains(str)) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        }
                        if (str.equals("2000147")) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                    }
                    if (TextUtils.equals(str, "2000130")) {
                        String j = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().j() : "";
                        String str19 = campaignEx.getendcard_url();
                        str2 = str15;
                        eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str19) || !str19.contains("alecfc=1")) ? a.h : a.g));
                        eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(j) || !j.contains("alecfc=1")) ? a.h : a.g));
                        int i2 = campaignEx.getPlayable_ads_without_video() == 2 ? i : 0;
                        com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.B());
                        eVar.a("video_skip_result", Integer.valueOf(c == null ? 2 : c.E()));
                        if (i2 != 0) {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                        } else {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                        }
                    } else {
                        str2 = str15;
                    }
                    if (Arrays.asList(b.k).contains(str)) {
                        int clickTempSource = campaignEx.getClickTempSource();
                        if (clickTempSource == i) {
                            if (campaignEx.getRewardTemplateMode().j().contains("alecfc=1")) {
                                eVar.a("full_screen_click", Integer.valueOf(a.g));
                            } else {
                                eVar.a("full_screen_click", Integer.valueOf(a.h));
                            }
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        } else if (clickTempSource == 2) {
                            String str20 = campaignEx.getendcard_url();
                            if (campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                                if (!TextUtils.isEmpty(str20)) {
                                    contains = str20.contains("alecfc=1");
                                }
                                if (z) {
                                    eVar.a("full_screen_click", Integer.valueOf(a.h));
                                } else {
                                    eVar.a("full_screen_click", Integer.valueOf(a.g));
                                }
                                eVar.a("temp_display_type", Integer.valueOf(!campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                            } else {
                                contains = campaignEx.getMof_template_url().contains("alecfc=1");
                            }
                            z = contains;
                            if (z) {
                            }
                            eVar.a("temp_display_type", Integer.valueOf(!campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                        eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                        eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                        eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                    }
                    it = it2;
                    str12 = str16;
                    str11 = str17;
                    str9 = str5;
                    str10 = str6;
                    str8 = str7;
                    i = 1;
                }
            }
            return eVar.a();
        }
        if (cVar.n() != null) {
            arrayList.add(cVar.n());
        } else {
            List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
            if (o2 != null) {
                arrayList.addAll(o2);
            }
        }
        if (!arrayList.isEmpty()) {
        }
    }

    private Map<String, String> d(String str, c cVar) {
        HashMap hashMap = new HashMap();
        return (cVar == null || TextUtils.isEmpty(str)) ? hashMap : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000048")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> e;
        HashMap hashMap = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> c = c(str, cVar);
            if (c != null) {
                hashMap.putAll(c);
            }
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            if (Arrays.asList(b.d).contains(str) && (e = e(str, cVar)) != null) {
                hashMap.putAll(e);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty((CharSequence) hashMap.get("lrid"))) {
                hashMap.put("lrid", cVar.t());
            }
            if (hashMap.containsKey("lrid")) {
                String str2 = (String) hashMap.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    hashMap.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (hashMap.containsKey("n_lrid")) {
                String str3 = (String) hashMap.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    hashMap.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.m).contains(str)) {
                    hashMap.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    hashMap.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
                if (mVar != null && a3 != null) {
                    mVar.d(a3);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            cVar.j(str);
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
            if (mVar != null && a3 != null) {
                mVar.d(a3);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap hashMap = new HashMap();
        if (cVar == null) {
            return hashMap;
        }
        return cVar.a(cVar.t() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean a = com.mbridge.msdk.foundation.same.b.b().a();
            if (a != null) {
                jSONObject.put("r_v_r", a.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            return eVar;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return eVar;
        }
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            if (!TextUtils.isEmpty(f.q0())) {
                eVar.a("as_rid", f.q0());
            }
            String L = f.L();
            JSONArray K = f.K();
            if (K != null) {
                int i = 0;
                while (true) {
                    if (i >= K.length()) {
                        break;
                    }
                    if (str.equals(K.getString(i))) {
                        L = "1.0";
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(L)) {
                eVar.a("log_rate", L);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.setting.m d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (d != null && !TextUtils.isEmpty(d.I())) {
                    eVar.a("us_rid", d.I());
                }
                if (d != null && !TextUtils.isEmpty(d.a())) {
                    eVar.a("u_stid", d.a());
                }
                e c = d.b().c(str2);
                if (c != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", c.b("r_stid"));
                            c.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(c);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x004e -> B:44:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0050 -> B:44:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CampaignEx> a(c cVar, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> w = cVar.w();
                if (w != null && w.containsKey(str2)) {
                    try {
                        Object obj = w.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            i = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            i = ((Integer) obj).intValue();
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (i != 1) {
                        List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o != null && o.size() > 0) {
                            arrayList.addAll(o);
                        }
                    } else if (cVar.n() != null) {
                        arrayList.add(cVar.n());
                    } else {
                        List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o2 != null && o2.size() > 0) {
                            arrayList.addAll(o2);
                        }
                    }
                }
                i = -1;
                if (i != 1) {
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(b.e).contains(str)) {
                String str2 = "";
                if (cVar != null) {
                    str2 = cVar.j();
                }
                hashMap.put("auto_load", str2);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> w = cVar.w();
                String str3 = cVar.t() + str;
                if (w.containsKey(str3) && w.get(str3) != null) {
                    hashMap.putAll(w.get(str3));
                }
                try {
                    Map<String, Map<String, String>> v = cVar.v();
                    String str4 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (v.containsKey(str4) && v.get(str4) != null) {
                        hashMap.putAll(v.get(str4));
                        return hashMap;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }
}
