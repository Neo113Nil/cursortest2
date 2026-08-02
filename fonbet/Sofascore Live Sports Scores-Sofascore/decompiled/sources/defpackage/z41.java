package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.cardview.widget.CardView;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4427z5;
import com.ironsource.E9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class z41 implements hlg, m1g, ya3, fqf, d6h, y8e, BillingClientStateListener, gu, SuccessContinuation, ch2, ph2, ne4 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0c50, code lost:
    
        if (r1.equals("BF") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0f7d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0f84  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0fa7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0fbc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0fc3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0fed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1009  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x1017  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x101e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x102c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x1033  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x103a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1048  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x104f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1064  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x106b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1072  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x1079  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x108e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1095  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x109c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x10a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x10b1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x10b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x10d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x10e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x10f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x10fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x1105  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x1113  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1119  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x111f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1125  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1131  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1137  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1143  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1149  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x114f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1155  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x115b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1167  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x116d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0d5b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0d69  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0d77  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0d8c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0dbd  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0e2d  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0e3b  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0e65  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0e73  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0e81  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0e88  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0e8f  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0ea4  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0eab  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0eb2  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0eb9  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0ece  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0ed5  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0edc  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0c62  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x0c9a  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0eff  */
    /* JADX WARN: Removed duplicated region for block: B:850:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0f0d  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0f3e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0f5a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0f61  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0f68  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z41(Context context, int i) {
        String X;
        int[] iArr;
        TelephonyManager telephonyManager;
        this.a = i;
        char c = 20;
        switch (i) {
            case 23:
                this.b = context == null ? null : context.getApplicationContext();
                int i2 = lik.a;
                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (!TextUtils.isEmpty(networkCountryIso)) {
                        X = rz8.X(networkCountryIso);
                        vvf vvfVar = sn4.n;
                        X.getClass();
                        switch (X.hashCode()) {
                            case 2083:
                                if (X.equals("AD")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2084:
                                if (X.equals("AE")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2085:
                                if (X.equals("AF")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2086:
                                if (X.equals("AG")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2088:
                                if (X.equals("AI")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2091:
                                if (X.equals("AL")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2092:
                                if (X.equals("AM")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2094:
                                if (X.equals("AO")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2096:
                                if (X.equals("AQ")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2097:
                                if (X.equals(PlayerKt.CRICKET_ALLROUNDER)) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2098:
                                if (X.equals("AS")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2099:
                                if (X.equals("AT")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2100:
                                if (X.equals("AU")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2102:
                                if (X.equals("AW")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2103:
                                if (X.equals("AX")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2105:
                                if (X.equals("AZ")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2111:
                                if (X.equals("BA")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2112:
                                if (X.equals("BB")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2114:
                                if (X.equals("BD")) {
                                    c = 18;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2115:
                                if (X.equals("BE")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2116:
                                break;
                            case 2117:
                                if (X.equals("BG")) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2118:
                                if (X.equals("BH")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2119:
                                if (X.equals("BI")) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2120:
                                if (X.equals("BJ")) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2122:
                                if (X.equals("BL")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2123:
                                if (X.equals(PlayerKt.CRICKET_BATTER)) {
                                    c = 26;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2124:
                                if (X.equals("BN")) {
                                    c = 27;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2125:
                                if (X.equals("BO")) {
                                    c = 28;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2127:
                                if (X.equals("BQ")) {
                                    c = 29;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2129:
                                if (X.equals("BS")) {
                                    c = 30;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2130:
                                if (X.equals("BT")) {
                                    c = 31;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2133:
                                if (X.equals("BW")) {
                                    c = ' ';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2135:
                                if (X.equals("BY")) {
                                    c = '!';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2136:
                                if (X.equals("BZ")) {
                                    c = '\"';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2142:
                                if (X.equals("CA")) {
                                    c = '#';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2145:
                                if (X.equals("CD")) {
                                    c = '$';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2147:
                                if (X.equals("CF")) {
                                    c = '%';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2148:
                                if (X.equals("CG")) {
                                    c = '&';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2149:
                                if (X.equals("CH")) {
                                    c = '\'';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2150:
                                if (X.equals("CI")) {
                                    c = '(';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2152:
                                if (X.equals("CK")) {
                                    c = ')';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2153:
                                if (X.equals("CL")) {
                                    c = '*';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2154:
                                if (X.equals("CM")) {
                                    c = '+';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2155:
                                if (X.equals("CN")) {
                                    c = ',';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2156:
                                if (X.equals("CO")) {
                                    c = '-';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2159:
                                if (X.equals("CR")) {
                                    c = '.';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2162:
                                if (X.equals("CU")) {
                                    c = '/';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2163:
                                if (X.equals("CV")) {
                                    c = '0';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2164:
                                if (X.equals("CW")) {
                                    c = '1';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2165:
                                if (X.equals("CX")) {
                                    c = '2';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2166:
                                if (X.equals("CY")) {
                                    c = '3';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2167:
                                if (X.equals("CZ")) {
                                    c = '4';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2177:
                                if (X.equals(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END)) {
                                    c = '5';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2182:
                                if (X.equals("DJ")) {
                                    c = '6';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2183:
                                if (X.equals("DK")) {
                                    c = '7';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2185:
                                if (X.equals("DM")) {
                                    c = '8';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2187:
                                if (X.equals("DO")) {
                                    c = '9';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2198:
                                if (X.equals("DZ")) {
                                    c = ':';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2206:
                                if (X.equals("EC")) {
                                    c = ';';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2208:
                                if (X.equals("EE")) {
                                    c = '<';
                                    break;
                                }
                                c = 65535;
                                break;
                            case E9.a.e /* 2210 */:
                                if (X.equals("EG")) {
                                    c = C4427z5.U;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2221:
                                if (X.equals("ER")) {
                                    c = '>';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2222:
                                if (X.equals("ES")) {
                                    c = '?';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2223:
                                if (X.equals("ET")) {
                                    c = '@';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2243:
                                if (X.equals("FI")) {
                                    c = 'A';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2244:
                                if (X.equals("FJ")) {
                                    c = 'B';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2245:
                                if (X.equals("FK")) {
                                    c = 'C';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2247:
                                if (X.equals("FM")) {
                                    c = 'D';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2249:
                                if (X.equals("FO")) {
                                    c = 'E';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2252:
                                if (X.equals("FR")) {
                                    c = 'F';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2266:
                                if (X.equals("GA")) {
                                    c = 'G';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2267:
                                if (X.equals("GB")) {
                                    c = 'H';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2269:
                                if (X.equals("GD")) {
                                    c = 'I';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2270:
                                if (X.equals("GE")) {
                                    c = 'J';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2271:
                                if (X.equals("GF")) {
                                    c = 'K';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2272:
                                if (X.equals("GG")) {
                                    c = 'L';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2273:
                                if (X.equals("GH")) {
                                    c = 'M';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2274:
                                if (X.equals("GI")) {
                                    c = 'N';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2277:
                                if (X.equals("GL")) {
                                    c = 'O';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2278:
                                if (X.equals("GM")) {
                                    c = 'P';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2279:
                                if (X.equals("GN")) {
                                    c = 'Q';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2281:
                                if (X.equals("GP")) {
                                    c = 'R';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2282:
                                if (X.equals("GQ")) {
                                    c = 'S';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2283:
                                if (X.equals("GR")) {
                                    c = 'T';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2285:
                                if (X.equals("GT")) {
                                    c = 'U';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2286:
                                if (X.equals("GU")) {
                                    c = 'V';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2288:
                                if (X.equals("GW")) {
                                    c = 'W';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2290:
                                if (X.equals("GY")) {
                                    c = 'X';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2307:
                                if (X.equals("HK")) {
                                    c = 'Y';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2314:
                                if (X.equals("HR")) {
                                    c = 'Z';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2316:
                                if (X.equals("HT")) {
                                    c = '[';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2317:
                                if (X.equals("HU")) {
                                    c = '\\';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2331:
                                if (X.equals("ID")) {
                                    c = ']';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2332:
                                if (X.equals("IE")) {
                                    c = '^';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2339:
                                if (X.equals("IL")) {
                                    c = '_';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2340:
                                if (X.equals("IM")) {
                                    c = '`';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2341:
                                if (X.equals("IN")) {
                                    c = 'a';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2342:
                                if (X.equals("IO")) {
                                    c = 'b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2344:
                                if (X.equals("IQ")) {
                                    c = 'c';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2345:
                                if (X.equals("IR")) {
                                    c = 'd';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2346:
                                if (X.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                                    c = 'e';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2347:
                                if (X.equals("IT")) {
                                    c = 'f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2363:
                                if (X.equals("JE")) {
                                    c = 'g';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2371:
                                if (X.equals("JM")) {
                                    c = 'h';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2373:
                                if (X.equals("JO")) {
                                    c = 'i';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2374:
                                if (X.equals("JP")) {
                                    c = 'j';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2394:
                                if (X.equals("KE")) {
                                    c = 'k';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2396:
                                if (X.equals("KG")) {
                                    c = 'l';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2397:
                                if (X.equals("KH")) {
                                    c = 'm';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2398:
                                if (X.equals("KI")) {
                                    c = 'n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2402:
                                if (X.equals("KM")) {
                                    c = 'o';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2403:
                                if (X.equals("KN")) {
                                    c = 'p';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2405:
                                if (X.equals("KP")) {
                                    c = 'q';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2407:
                                if (X.equals("KR")) {
                                    c = 'r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2412:
                                if (X.equals("KW")) {
                                    c = 's';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2414:
                                if (X.equals("KY")) {
                                    c = 't';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2415:
                                if (X.equals("KZ")) {
                                    c = 'u';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2421:
                                if (X.equals("LA")) {
                                    c = 'v';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2422:
                                if (X.equals("LB")) {
                                    c = 'w';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2423:
                                if (X.equals("LC")) {
                                    c = 'x';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2429:
                                if (X.equals("LI")) {
                                    c = 'y';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2431:
                                if (X.equals("LK")) {
                                    c = 'z';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2438:
                                if (X.equals("LR")) {
                                    c = '{';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2439:
                                if (X.equals(PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER)) {
                                    c = '|';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2440:
                                if (X.equals("LT")) {
                                    c = '}';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2441:
                                if (X.equals("LU")) {
                                    c = '~';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2442:
                                if (X.equals("LV")) {
                                    c = 127;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2445:
                                if (X.equals("LY")) {
                                    c = 128;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2452:
                                if (X.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                    c = 129;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2454:
                                if (X.equals("MC")) {
                                    c = 130;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2455:
                                if (X.equals("MD")) {
                                    c = 131;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2456:
                                if (X.equals("ME")) {
                                    c = 132;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2457:
                                if (X.equals("MF")) {
                                    c = 133;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2458:
                                if (X.equals("MG")) {
                                    c = 134;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2459:
                                if (X.equals("MH")) {
                                    c = 135;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2462:
                                if (X.equals("MK")) {
                                    c = 136;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2463:
                                if (X.equals("ML")) {
                                    c = 137;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2464:
                                if (X.equals("MM")) {
                                    c = 138;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2465:
                                if (X.equals("MN")) {
                                    c = 139;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2466:
                                if (X.equals("MO")) {
                                    c = 140;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2467:
                                if (X.equals("MP")) {
                                    c = 141;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2468:
                                if (X.equals("MQ")) {
                                    c = 142;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2469:
                                if (X.equals("MR")) {
                                    c = 143;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2470:
                                if (X.equals("MS")) {
                                    c = 144;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2471:
                                if (X.equals("MT")) {
                                    c = 145;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2472:
                                if (X.equals("MU")) {
                                    c = 146;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2473:
                                if (X.equals("MV")) {
                                    c = 147;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2474:
                                if (X.equals("MW")) {
                                    c = 148;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2475:
                                if (X.equals("MX")) {
                                    c = 149;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2476:
                                if (X.equals("MY")) {
                                    c = 150;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2477:
                                if (X.equals("MZ")) {
                                    c = 151;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2483:
                                if (X.equals("NA")) {
                                    c = 152;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2485:
                                if (X.equals("NC")) {
                                    c = 153;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2487:
                                if (X.equals("NE")) {
                                    c = 154;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2489:
                                if (X.equals("NG")) {
                                    c = 155;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2491:
                                if (X.equals("NI")) {
                                    c = 156;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2494:
                                if (X.equals("NL")) {
                                    c = 157;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2497:
                                if (X.equals("NO")) {
                                    c = 158;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2498:
                                if (X.equals("NP")) {
                                    c = 159;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2500:
                                if (X.equals("NR")) {
                                    c = 160;
                                    break;
                                }
                                c = 65535;
                                break;
                            case E9.b.e /* 2503 */:
                                if (X.equals("NU")) {
                                    c = 161;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2508:
                                if (X.equals("NZ")) {
                                    c = 162;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2526:
                                if (X.equals("OM")) {
                                    c = 163;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2545:
                                if (X.equals("PA")) {
                                    c = 164;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2549:
                                if (X.equals("PE")) {
                                    c = 165;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2550:
                                if (X.equals("PF")) {
                                    c = 166;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2551:
                                if (X.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                                    c = 167;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2552:
                                if (X.equals("PH")) {
                                    c = 168;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2555:
                                if (X.equals("PK")) {
                                    c = 169;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2556:
                                if (X.equals("PL")) {
                                    c = 170;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2557:
                                if (X.equals("PM")) {
                                    c = 171;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2562:
                                if (X.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)) {
                                    c = 172;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2563:
                                if (X.equals("PS")) {
                                    c = 173;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2564:
                                if (X.equals("PT")) {
                                    c = 174;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2567:
                                if (X.equals("PW")) {
                                    c = 175;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2576:
                                if (X.equals("QA")) {
                                    c = 176;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2611:
                                if (X.equals("RE")) {
                                    c = 177;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2621:
                                if (X.equals("RO")) {
                                    c = 178;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2625:
                                if (X.equals("RS")) {
                                    c = 179;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2627:
                                if (X.equals("RU")) {
                                    c = 180;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2629:
                                if (X.equals("RW")) {
                                    c = 181;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2638:
                                if (X.equals("SA")) {
                                    c = 182;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2639:
                                if (X.equals("SB")) {
                                    c = 183;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2640:
                                if (X.equals("SC")) {
                                    c = 184;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2641:
                                if (X.equals("SD")) {
                                    c = 185;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2642:
                                if (X.equals("SE")) {
                                    c = 186;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2644:
                                if (X.equals("SG")) {
                                    c = 187;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2645:
                                if (X.equals("SH")) {
                                    c = 188;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2646:
                                if (X.equals("SI")) {
                                    c = 189;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2648:
                                if (X.equals("SK")) {
                                    c = 190;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2649:
                                if (X.equals("SL")) {
                                    c = 191;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2650:
                                if (X.equals("SM")) {
                                    c = 192;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2651:
                                if (X.equals("SN")) {
                                    c = 193;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2652:
                                if (X.equals("SO")) {
                                    c = 194;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2655:
                                if (X.equals("SR")) {
                                    c = 195;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2656:
                                if (X.equals(PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY)) {
                                    c = 196;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2657:
                                if (X.equals("ST")) {
                                    c = 197;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2659:
                                if (X.equals("SV")) {
                                    c = 198;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2661:
                                if (X.equals("SX")) {
                                    c = 199;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2662:
                                if (X.equals("SY")) {
                                    c = 200;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2663:
                                if (X.equals("SZ")) {
                                    c = 201;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2671:
                                if (X.equals("TC")) {
                                    c = 202;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2672:
                                if (X.equals("TD")) {
                                    c = 203;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2675:
                                if (X.equals("TG")) {
                                    c = 204;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2676:
                                if (X.equals("TH")) {
                                    c = 205;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2678:
                                if (X.equals("TJ")) {
                                    c = 206;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2679:
                                if (X.equals("TK")) {
                                    c = 207;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2680:
                                if (X.equals("TL")) {
                                    c = 208;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2681:
                                if (X.equals("TM")) {
                                    c = 209;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2682:
                                if (X.equals("TN")) {
                                    c = 210;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2683:
                                if (X.equals("TO")) {
                                    c = 211;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2686:
                                if (X.equals("TR")) {
                                    c = 212;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2688:
                                if (X.equals("TT")) {
                                    c = 213;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2690:
                                if (X.equals("TV")) {
                                    c = 214;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2691:
                                if (X.equals("TW")) {
                                    c = 215;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2694:
                                if (X.equals("TZ")) {
                                    c = 216;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2700:
                                if (X.equals("UA")) {
                                    c = 217;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2706:
                                if (X.equals("UG")) {
                                    c = 218;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2718:
                                if (X.equals("US")) {
                                    c = 219;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2724:
                                if (X.equals("UY")) {
                                    c = 220;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2725:
                                if (X.equals("UZ")) {
                                    c = 221;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2731:
                                if (X.equals("VA")) {
                                    c = 222;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2733:
                                if (X.equals("VC")) {
                                    c = 223;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2735:
                                if (X.equals("VE")) {
                                    c = 224;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2737:
                                if (X.equals("VG")) {
                                    c = 225;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2739:
                                if (X.equals("VI")) {
                                    c = 226;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2744:
                                if (X.equals("VN")) {
                                    c = 227;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2751:
                                if (X.equals("VU")) {
                                    c = 228;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2767:
                                if (X.equals("WF")) {
                                    c = 229;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2780:
                                if (X.equals("WS")) {
                                    c = 230;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2803:
                                if (X.equals("XK")) {
                                    c = 231;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2828:
                                if (X.equals("YE")) {
                                    c = 232;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2843:
                                if (X.equals("YT")) {
                                    c = 233;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2855:
                                if (X.equals("ZA")) {
                                    c = 234;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2867:
                                if (X.equals("ZM")) {
                                    c = 235;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2877:
                                if (X.equals("ZW")) {
                                    c = 236;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 26:
                            case 29:
                            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                            case 'O':
                            case 'p':
                            case GZIP_ENCODE_ERROR_VALUE:
                            case 'x':
                            case STALE_CACHED_RESPONSE_VALUE:
                                iArr = new int[]{1, 2, 0, 0, 2, 2};
                                break;
                            case 1:
                                iArr = new int[]{1, 4, 4, 4, 4, 0};
                                break;
                            case 2:
                            case 'P':
                                iArr = new int[]{4, 3, 3, 4, 2, 2};
                                break;
                            case 3:
                                iArr = new int[]{2, 4, 1, 2, 2, 2};
                                break;
                            case 4:
                                iArr = new int[]{0, 2, 0, 3, 2, 2};
                                break;
                            case 5:
                            case 231:
                                iArr = new int[]{1, 1, 1, 1, 2, 2};
                                break;
                            case 6:
                                iArr = new int[]{2, 3, 2, 3, 2, 2};
                                break;
                            case 7:
                                iArr = new int[]{4, 4, 3, 2, 2, 2};
                                break;
                            case '\b':
                            case '>':
                            case 188:
                                iArr = new int[]{4, 2, 2, 2, 2, 2};
                                break;
                            case '\t':
                            case 'l':
                            case AD_NOT_LOADED_VALUE:
                            case AD_RESPONSE_RETRY_AFTER_VALUE:
                                iArr = new int[]{2, 1, 1, 1, 2, 2};
                                break;
                            case '\n':
                                iArr = new int[]{2, 2, 3, 3, 2, 2};
                                break;
                            case 11:
                                iArr = new int[]{1, 0, 1, 1, 0, 0};
                                break;
                            case '\f':
                                iArr = new int[]{0, 1, 1, 1, 2, 0};
                                break;
                            case '\r':
                                iArr = new int[]{1, 3, 4, 4, 2, 2};
                                break;
                            case 14:
                            case TPAT_ERROR_VALUE:
                            case 144:
                            case 171:
                            case PsExtractor.AUDIO_STREAM /* 192 */:
                                iArr = new int[]{0, 2, 2, 2, 2, 2};
                                break;
                            case 15:
                            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            case 128:
                            case 169:
                            case 194:
                            case 211:
                                iArr = new int[]{3, 2, 3, 3, 2, 2};
                                break;
                            case 16:
                                iArr = new int[]{1, 2, 1, 1, 2, 2};
                                break;
                            case 17:
                            case '8':
                            case 'E':
                            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                                iArr = new int[]{0, 2, 0, 0, 2, 2};
                                break;
                            case 18:
                                iArr = new int[]{2, 1, 3, 3, 2, 2};
                                break;
                            case 19:
                                iArr = new int[]{0, 1, 4, 4, 3, 2};
                                break;
                            case 20:
                                iArr = new int[]{4, 3, 4, 3, 2, 2};
                                break;
                            case 21:
                            case 145:
                            case 190:
                                iArr = new int[]{0, 0, 0, 0, 1, 2};
                                break;
                            case 22:
                                iArr = new int[]{1, 2, 1, 3, 4, 2};
                                break;
                            case 23:
                            case '[':
                            case 'o':
                            case 134:
                            case 154:
                            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                            case 203:
                            case 224:
                            case 232:
                                iArr = new int[]{4, 4, 4, 4, 2, 2};
                                break;
                            case 24:
                                iArr = new int[]{4, 4, 3, 3, 2, 2};
                                break;
                            case 25:
                            case '2':
                            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                iArr = new int[]{1, 2, 2, 2, 2, 2};
                                break;
                            case 27:
                            case '1':
                                iArr = new int[]{2, 2, 0, 0, 2, 2};
                                break;
                            case 28:
                                iArr = new int[]{1, 2, 3, 2, 2, 2};
                                break;
                            case 30:
                                iArr = new int[]{4, 4, 2, 2, 2, 2};
                                break;
                            case 31:
                                iArr = new int[]{3, 1, 3, 2, 2, 2};
                                break;
                            case ' ':
                                iArr = new int[]{3, 2, 1, 0, 2, 2};
                                break;
                            case '!':
                                iArr = new int[]{0, 1, 2, 3, 2, 2};
                                break;
                            case '\"':
                                iArr = new int[]{2, 4, 2, 1, 2, 2};
                                break;
                            case '#':
                                iArr = new int[]{0, 2, 2, 2, 3, 2};
                                break;
                            case '$':
                                iArr = new int[]{4, 2, 3, 2, 2, 2};
                                break;
                            case '%':
                            case 'n':
                                iArr = new int[]{4, 2, 4, 2, 2, 2};
                                break;
                            case '&':
                            case '=':
                            case 'W':
                                iArr = new int[]{3, 4, 3, 3, 2, 2};
                                break;
                            case '\'':
                                iArr = new int[]{0, 0, 0, 1, 0, 2};
                                break;
                            case '(':
                            case ':':
                            case INVALID_RI_ENDPOINT_VALUE:
                                iArr = new int[]{3, 4, 4, 4, 2, 2};
                                break;
                            case ')':
                            case 166:
                                iArr = new int[]{2, 2, 2, 1, 2, 2};
                                break;
                            case '*':
                            case '_':
                                iArr = new int[]{1, 2, 2, 2, 3, 2};
                                break;
                            case '+':
                                iArr = new int[]{3, 3, 3, 3, 2, 2};
                                break;
                            case ',':
                                iArr = new int[]{2, 0, 1, 1, 3, 2};
                                break;
                            case '-':
                                iArr = new int[]{2, 3, 4, 3, 2, 2};
                                break;
                            case '.':
                                iArr = new int[]{2, 3, 4, 4, 2, 2};
                                break;
                            case '/':
                            case '6':
                            case 200:
                            case 206:
                            case INVALID_BID_PAYLOAD_VALUE:
                                iArr = new int[]{4, 3, 4, 4, 2, 2};
                                break;
                            case '0':
                                iArr = new int[]{2, 1, 0, 0, 2, 2};
                                break;
                            case '3':
                            case INVALID_INDEX_URL_VALUE:
                                iArr = new int[]{1, 0, 0, 0, 0, 2};
                                break;
                            case '4':
                            case 158:
                                iArr = new int[]{0, 0, 2, 0, 1, 2};
                                break;
                            case '5':
                                iArr = new int[]{0, 1, 2, 2, 2, 3};
                                break;
                            case '7':
                                iArr = new int[]{0, 0, 3, 2, 0, 2};
                                break;
                            case '9':
                                iArr = new int[]{3, 4, 4, 4, 4, 2};
                                break;
                            case ';':
                                iArr = new int[]{2, 3, 2, 1, 2, 2};
                                break;
                            case '<':
                            case 'e':
                            case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                            case 174:
                            case 186:
                            case AD_RESPONSE_EMPTY_VALUE:
                                iArr = new int[]{0, 0, 0, 0, 0, 2};
                                break;
                            case '?':
                            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                                iArr = new int[]{0, 1, 1, 1, 2, 2};
                                break;
                            case '@':
                                iArr = new int[]{4, 3, 3, 1, 2, 2};
                                break;
                            case 'A':
                                iArr = new int[]{0, 0, 0, 3, 0, 2};
                                break;
                            case 'B':
                                iArr = new int[]{3, 1, 2, 2, 2, 2};
                                break;
                            case 'C':
                            case 'k':
                            case 'q':
                                iArr = new int[]{3, 2, 2, 2, 2, 2};
                                break;
                            case 'D':
                                iArr = new int[]{4, 2, 4, 1, 2, 2};
                                break;
                            case 'F':
                                iArr = new int[]{1, 2, 3, 1, 0, 2};
                                break;
                            case 'G':
                            case 204:
                                iArr = new int[]{3, 4, 1, 0, 2, 2};
                                break;
                            case 'H':
                                iArr = new int[]{0, 0, 1, 1, 1, 1};
                                break;
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                iArr = new int[]{1, 1, 1, 2, 2, 2};
                                break;
                            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                iArr = new int[]{0, 2, 0, 1, 2, 2};
                                break;
                            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                            case 152:
                            case 228:
                                iArr = new int[]{3, 3, 3, 2, 2, 2};
                                break;
                            case 'Q':
                                iArr = new int[]{4, 3, 4, 2, 2, 2};
                                break;
                            case 'R':
                            case 142:
                                iArr = new int[]{2, 1, 2, 3, 2, 2};
                                break;
                            case 'S':
                                iArr = new int[]{4, 2, 1, 4, 2, 2};
                                break;
                            case 'T':
                            case 'Z':
                            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                                iArr = new int[]{1, 0, 0, 0, 1, 2};
                                break;
                            case 'U':
                                iArr = new int[]{2, 3, 2, 2, 2, 2};
                                break;
                            case 'V':
                            case 165:
                                iArr = new int[]{1, 2, 4, 4, 4, 2};
                                break;
                            case 'X':
                                iArr = new int[]{3, 2, 2, 1, 2, 2};
                                break;
                            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                iArr = new int[]{0, 1, 2, 3, 2, 0};
                                break;
                            case '\\':
                                iArr = new int[]{0, 0, 0, 1, 3, 2};
                                break;
                            case ']':
                                iArr = new int[]{3, 1, 2, 2, 3, 2};
                                break;
                            case '`':
                            case AD_RESPONSE_TIMED_OUT_VALUE:
                                iArr = new int[]{0, 2, 1, 1, 2, 2};
                                break;
                            case 'a':
                                iArr = new int[]{1, 1, 3, 2, 3, 3};
                                break;
                            case 'b':
                            case 135:
                            case INVALID_GZIP_BID_PAYLOAD_VALUE:
                            case 229:
                                iArr = new int[]{4, 2, 2, 4, 2, 2};
                                break;
                            case 'c':
                                iArr = new int[]{3, 2, 2, 3, 2, 2};
                                break;
                            case 'd':
                                iArr = new int[]{3, 0, 1, 1, 4, 1};
                                break;
                            case 'f':
                                iArr = new int[]{0, 0, 0, 1, 1, 2};
                                break;
                            case 'g':
                            case 233:
                                iArr = new int[]{4, 2, 2, 3, 2, 2};
                                break;
                            case 'h':
                                iArr = new int[]{2, 4, 3, 2, 2, 2};
                                break;
                            case 'i':
                                iArr = new int[]{2, 1, 1, 2, 2, 2};
                                break;
                            case 'j':
                                iArr = new int[]{0, 1, 1, 2, 2, 4};
                                break;
                            case 'm':
                                iArr = new int[]{2, 1, 4, 2, 2, 2};
                                break;
                            case ASSET_WRITE_ERROR_VALUE:
                                iArr = new int[]{0, 1, 1, 3, 4, 4};
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                iArr = new int[]{2, 1, 2, 2, 2, 2};
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                iArr = new int[]{1, 2, 1, 3, 2, 2};
                                break;
                            case JSON_ENCODE_ERROR_VALUE:
                                iArr = new int[]{3, 3, 2, 4, 2, 2};
                                break;
                            case INVALID_ADS_ENDPOINT_VALUE:
                                iArr = new int[]{3, 1, 3, 3, 4, 2};
                                break;
                            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                iArr = new int[]{3, 3, 2, 2, 2, 2};
                                break;
                            case INVALID_METRICS_ENDPOINT_VALUE:
                                iArr = new int[]{0, 0, 0, 0, 2, 2};
                                break;
                            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                                iArr = new int[]{1, 0, 3, 2, 1, 4};
                                break;
                            case 129:
                                iArr = new int[]{3, 3, 1, 1, 2, 2};
                                break;
                            case 130:
                                iArr = new int[]{0, 2, 2, 0, 2, 2};
                                break;
                            case MRAID_JS_WRITE_FAILED_VALUE:
                            case 179:
                                iArr = new int[]{1, 0, 0, 0, 2, 2};
                                break;
                            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                iArr = new int[]{2, 0, 0, 1, 2, 2};
                                break;
                            case OMSDK_JS_WRITE_FAILED_VALUE:
                            case 177:
                                iArr = new int[]{1, 2, 1, 2, 2, 2};
                                break;
                            case PRIVACY_URL_ERROR_VALUE:
                                iArr = new int[]{1, 0, 0, 1, 3, 2};
                                break;
                            case TPAT_RETRY_FAILED_VALUE:
                            case 167:
                                iArr = new int[]{4, 3, 3, 2, 2, 2};
                                break;
                            case 138:
                                iArr = new int[]{2, 4, 2, 3, 2, 2};
                                break;
                            case 139:
                                iArr = new int[]{2, 0, 1, 2, 2, 2};
                                break;
                            case 140:
                            case 141:
                                iArr = new int[]{0, 2, 4, 4, 2, 2};
                                break;
                            case 143:
                            case 236:
                                iArr = new int[]{4, 2, 4, 4, 2, 2};
                                break;
                            case 146:
                                iArr = new int[]{3, 1, 1, 2, 2, 2};
                                break;
                            case 147:
                                iArr = new int[]{3, 4, 1, 4, 2, 2};
                                break;
                            case 148:
                                iArr = new int[]{4, 2, 3, 3, 2, 2};
                                break;
                            case 149:
                                iArr = new int[]{2, 4, 3, 4, 2, 2};
                                break;
                            case 150:
                                iArr = new int[]{1, 0, 3, 1, 3, 2};
                                break;
                            case 151:
                                iArr = new int[]{3, 1, 2, 1, 2, 2};
                                break;
                            case 153:
                                iArr = new int[]{3, 3, 4, 4, 2, 2};
                                break;
                            case 155:
                                iArr = new int[]{3, 4, 2, 1, 2, 2};
                                break;
                            case 156:
                            case 164:
                            case 198:
                                iArr = new int[]{2, 3, 3, 3, 2, 2};
                                break;
                            case 157:
                                iArr = new int[]{0, 2, 2, 3, 0, 3};
                                break;
                            case 159:
                                iArr = new int[]{2, 2, 4, 3, 2, 2};
                                break;
                            case 160:
                            case 161:
                                iArr = new int[]{4, 2, 2, 1, 2, 2};
                                break;
                            case 162:
                            case 170:
                                iArr = new int[]{1, 1, 2, 2, 4, 2};
                                break;
                            case 163:
                                iArr = new int[]{2, 3, 1, 3, 4, 2};
                                break;
                            case 168:
                                iArr = new int[]{2, 1, 3, 3, 3, 0};
                                break;
                            case 172:
                                iArr = new int[]{2, 0, 2, 1, 2, 1};
                                break;
                            case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                                iArr = new int[]{3, 4, 1, 2, 2, 2};
                                break;
                            case 175:
                                iArr = new int[]{2, 2, 4, 1, 2, 2};
                                break;
                            case 176:
                                iArr = new int[]{2, 4, 4, 4, 4, 2};
                                break;
                            case 178:
                                iArr = new int[]{0, 0, 1, 2, 1, 2};
                                break;
                            case 180:
                                iArr = new int[]{1, 0, 0, 0, 4, 3};
                                break;
                            case 181:
                                iArr = new int[]{3, 4, 2, 0, 2, 2};
                                break;
                            case 182:
                                iArr = new int[]{3, 1, 1, 1, 2, 2};
                                break;
                            case 183:
                                iArr = new int[]{4, 2, 4, 3, 2, 2};
                                break;
                            case 184:
                            case INVALID_JSON_BID_PAYLOAD_VALUE:
                                iArr = new int[]{4, 2, 1, 1, 2, 2};
                                break;
                            case 187:
                                iArr = new int[]{1, 1, 2, 2, 2, 1};
                                break;
                            case 191:
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                iArr = new int[]{3, 3, 4, 3, 2, 2};
                                break;
                            case 193:
                                iArr = new int[]{4, 4, 4, 3, 2, 2};
                                break;
                            case 195:
                                iArr = new int[]{2, 4, 3, 0, 2, 2};
                                break;
                            case 196:
                                iArr = new int[]{4, 3, 2, 3, 2, 2};
                                break;
                            case 197:
                                iArr = new int[]{2, 2, 1, 2, 2, 2};
                                break;
                            case 199:
                            case 202:
                                iArr = new int[]{1, 2, 1, 0, 2, 2};
                                break;
                            case 201:
                                iArr = new int[]{3, 3, 3, 4, 2, 2};
                                break;
                            case 205:
                                iArr = new int[]{0, 2, 2, 3, 3, 4};
                                break;
                            case 207:
                                iArr = new int[]{2, 2, 2, 4, 2, 2};
                                break;
                            case PLACEMENT_SLEEP_VALUE:
                                iArr = new int[]{1, 1, 0, 0, 2, 2};
                                break;
                            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                                iArr = new int[]{1, 4, 1, 3, 2, 2};
                                break;
                            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                iArr = new int[]{3, 4, 3, 2, 2, 2};
                                break;
                            case MRAID_JS_COPY_FAILED_VALUE:
                                iArr = new int[]{1, 0, 2, 2, 3, 1};
                                break;
                            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                iArr = new int[]{2, 2, 3, 4, 2, 2};
                                break;
                            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                                iArr = new int[]{2, 2, 1, 1, 2, 2};
                                break;
                            case INVALID_CSB_DATA_VALUE:
                                iArr = new int[]{0, 3, 3, 4, 2, 2};
                                break;
                            case 230:
                                iArr = new int[]{3, 1, 3, 1, 2, 2};
                                break;
                            case 234:
                                iArr = new int[]{3, 2, 2, 1, 1, 2};
                                break;
                            case 235:
                                iArr = new int[]{3, 3, 4, 2, 2, 2};
                                break;
                            default:
                                iArr = new int[]{2, 2, 2, 2, 2, 2};
                                break;
                        }
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        vvf vvfVar2 = sn4.n;
                        hashMap.put(2, (Long) vvfVar2.get(iArr[0]));
                        hashMap.put(3, (Long) sn4.o.get(iArr[1]));
                        hashMap.put(4, (Long) sn4.p.get(iArr[2]));
                        hashMap.put(5, (Long) sn4.q.get(iArr[3]));
                        hashMap.put(10, (Long) sn4.r.get(iArr[4]));
                        hashMap.put(9, (Long) sn4.s.get(iArr[5]));
                        hashMap.put(7, (Long) vvfVar2.get(iArr[0]));
                        this.c = hashMap;
                        break;
                    }
                }
                X = rz8.X(Locale.getDefault().getCountry());
                vvf vvfVar3 = sn4.n;
                X.getClass();
                switch (X.hashCode()) {
                    case 2083:
                        break;
                    case 2084:
                        break;
                    case 2085:
                        break;
                    case 2086:
                        break;
                    case 2088:
                        break;
                    case 2091:
                        break;
                    case 2092:
                        break;
                    case 2094:
                        break;
                    case 2096:
                        break;
                    case 2097:
                        break;
                    case 2098:
                        break;
                    case 2099:
                        break;
                    case 2100:
                        break;
                    case 2102:
                        break;
                    case 2103:
                        break;
                    case 2105:
                        break;
                    case 2111:
                        break;
                    case 2112:
                        break;
                    case 2114:
                        break;
                    case 2115:
                        break;
                    case 2116:
                        break;
                    case 2117:
                        break;
                    case 2118:
                        break;
                    case 2119:
                        break;
                    case 2120:
                        break;
                    case 2122:
                        break;
                    case 2123:
                        break;
                    case 2124:
                        break;
                    case 2125:
                        break;
                    case 2127:
                        break;
                    case 2129:
                        break;
                    case 2130:
                        break;
                    case 2133:
                        break;
                    case 2135:
                        break;
                    case 2136:
                        break;
                    case 2142:
                        break;
                    case 2145:
                        break;
                    case 2147:
                        break;
                    case 2148:
                        break;
                    case 2149:
                        break;
                    case 2150:
                        break;
                    case 2152:
                        break;
                    case 2153:
                        break;
                    case 2154:
                        break;
                    case 2155:
                        break;
                    case 2156:
                        break;
                    case 2159:
                        break;
                    case 2162:
                        break;
                    case 2163:
                        break;
                    case 2164:
                        break;
                    case 2165:
                        break;
                    case 2166:
                        break;
                    case 2167:
                        break;
                    case 2177:
                        break;
                    case 2182:
                        break;
                    case 2183:
                        break;
                    case 2185:
                        break;
                    case 2187:
                        break;
                    case 2198:
                        break;
                    case 2206:
                        break;
                    case 2208:
                        break;
                    case E9.a.e /* 2210 */:
                        break;
                    case 2221:
                        break;
                    case 2222:
                        break;
                    case 2223:
                        break;
                    case 2243:
                        break;
                    case 2244:
                        break;
                    case 2245:
                        break;
                    case 2247:
                        break;
                    case 2249:
                        break;
                    case 2252:
                        break;
                    case 2266:
                        break;
                    case 2267:
                        break;
                    case 2269:
                        break;
                    case 2270:
                        break;
                    case 2271:
                        break;
                    case 2272:
                        break;
                    case 2273:
                        break;
                    case 2274:
                        break;
                    case 2277:
                        break;
                    case 2278:
                        break;
                    case 2279:
                        break;
                    case 2281:
                        break;
                    case 2282:
                        break;
                    case 2283:
                        break;
                    case 2285:
                        break;
                    case 2286:
                        break;
                    case 2288:
                        break;
                    case 2290:
                        break;
                    case 2307:
                        break;
                    case 2314:
                        break;
                    case 2316:
                        break;
                    case 2317:
                        break;
                    case 2331:
                        break;
                    case 2332:
                        break;
                    case 2339:
                        break;
                    case 2340:
                        break;
                    case 2341:
                        break;
                    case 2342:
                        break;
                    case 2344:
                        break;
                    case 2345:
                        break;
                    case 2346:
                        break;
                    case 2347:
                        break;
                    case 2363:
                        break;
                    case 2371:
                        break;
                    case 2373:
                        break;
                    case 2374:
                        break;
                    case 2394:
                        break;
                    case 2396:
                        break;
                    case 2397:
                        break;
                    case 2398:
                        break;
                    case 2402:
                        break;
                    case 2403:
                        break;
                    case 2405:
                        break;
                    case 2407:
                        break;
                    case 2412:
                        break;
                    case 2414:
                        break;
                    case 2415:
                        break;
                    case 2421:
                        break;
                    case 2422:
                        break;
                    case 2423:
                        break;
                    case 2429:
                        break;
                    case 2431:
                        break;
                    case 2438:
                        break;
                    case 2439:
                        break;
                    case 2440:
                        break;
                    case 2441:
                        break;
                    case 2442:
                        break;
                    case 2445:
                        break;
                    case 2452:
                        break;
                    case 2454:
                        break;
                    case 2455:
                        break;
                    case 2456:
                        break;
                    case 2457:
                        break;
                    case 2458:
                        break;
                    case 2459:
                        break;
                    case 2462:
                        break;
                    case 2463:
                        break;
                    case 2464:
                        break;
                    case 2465:
                        break;
                    case 2466:
                        break;
                    case 2467:
                        break;
                    case 2468:
                        break;
                    case 2469:
                        break;
                    case 2470:
                        break;
                    case 2471:
                        break;
                    case 2472:
                        break;
                    case 2473:
                        break;
                    case 2474:
                        break;
                    case 2475:
                        break;
                    case 2476:
                        break;
                    case 2477:
                        break;
                    case 2483:
                        break;
                    case 2485:
                        break;
                    case 2487:
                        break;
                    case 2489:
                        break;
                    case 2491:
                        break;
                    case 2494:
                        break;
                    case 2497:
                        break;
                    case 2498:
                        break;
                    case 2500:
                        break;
                    case E9.b.e /* 2503 */:
                        break;
                    case 2508:
                        break;
                    case 2526:
                        break;
                    case 2545:
                        break;
                    case 2549:
                        break;
                    case 2550:
                        break;
                    case 2551:
                        break;
                    case 2552:
                        break;
                    case 2555:
                        break;
                    case 2556:
                        break;
                    case 2557:
                        break;
                    case 2562:
                        break;
                    case 2563:
                        break;
                    case 2564:
                        break;
                    case 2567:
                        break;
                    case 2576:
                        break;
                    case 2611:
                        break;
                    case 2621:
                        break;
                    case 2625:
                        break;
                    case 2627:
                        break;
                    case 2629:
                        break;
                    case 2638:
                        break;
                    case 2639:
                        break;
                    case 2640:
                        break;
                    case 2641:
                        break;
                    case 2642:
                        break;
                    case 2644:
                        break;
                    case 2645:
                        break;
                    case 2646:
                        break;
                    case 2648:
                        break;
                    case 2649:
                        break;
                    case 2650:
                        break;
                    case 2651:
                        break;
                    case 2652:
                        break;
                    case 2655:
                        break;
                    case 2656:
                        break;
                    case 2657:
                        break;
                    case 2659:
                        break;
                    case 2661:
                        break;
                    case 2662:
                        break;
                    case 2663:
                        break;
                    case 2671:
                        break;
                    case 2672:
                        break;
                    case 2675:
                        break;
                    case 2676:
                        break;
                    case 2678:
                        break;
                    case 2679:
                        break;
                    case 2680:
                        break;
                    case 2681:
                        break;
                    case 2682:
                        break;
                    case 2683:
                        break;
                    case 2686:
                        break;
                    case 2688:
                        break;
                    case 2690:
                        break;
                    case 2691:
                        break;
                    case 2694:
                        break;
                    case 2700:
                        break;
                    case 2706:
                        break;
                    case 2718:
                        break;
                    case 2724:
                        break;
                    case 2725:
                        break;
                    case 2731:
                        break;
                    case 2733:
                        break;
                    case 2735:
                        break;
                    case 2737:
                        break;
                    case 2739:
                        break;
                    case 2744:
                        break;
                    case 2751:
                        break;
                    case 2767:
                        break;
                    case 2780:
                        break;
                    case 2803:
                        break;
                    case 2828:
                        break;
                    case 2843:
                        break;
                    case 2855:
                        break;
                    case 2867:
                        break;
                    case 2877:
                        break;
                }
                switch (c) {
                }
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put(0, 1000000L);
                vvf vvfVar22 = sn4.n;
                hashMap2.put(2, (Long) vvfVar22.get(iArr[0]));
                hashMap2.put(3, (Long) sn4.o.get(iArr[1]));
                hashMap2.put(4, (Long) sn4.p.get(iArr[2]));
                hashMap2.put(5, (Long) sn4.q.get(iArr[3]));
                hashMap2.put(10, (Long) sn4.r.get(iArr[4]));
                hashMap2.put(9, (Long) sn4.s.get(iArr[5]));
                hashMap2.put(7, (Long) vvfVar22.get(iArr[0]));
                this.c = hashMap2;
                break;
            case 27:
                j0l j0lVar = new j0l(20);
                this.b = context.getApplicationContext();
                this.c = j0lVar;
                break;
            default:
                this.b = new ArrayList();
                this.c = context.getApplicationContext();
                break;
        }
    }

    public static z41 n(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new z41(20, fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    public vsj B(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                tgj.z("Unmatched track of type: " + i);
                return new q35();
            }
            if (i == iArr[i2]) {
                return ((hpg[]) this.c)[i2];
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r14.equals(r3.d) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(int i, h6c h6cVar, MediaInfo mediaInfo, String str, long j) {
        long T;
        long j2;
        h6c h6cVar2;
        String str2;
        SparseArray sparseArray = (SparseArray) this.b;
        ul2 ul2Var = (ul2) sparseArray.get(i, ul2.f);
        if (mediaInfo != null) {
            long j3 = mediaInfo.e;
            if (j3 != -1) {
                T = nik.T(j3);
                if (T == C.TIME_UNSET) {
                    T = ul2Var.a;
                }
                j2 = T;
                boolean z = mediaInfo != null ? ul2Var.c : mediaInfo.b == 2;
                long j4 = j != C.TIME_UNSET ? ul2Var.b : j;
                if (j2 != ul2Var.a && j4 == ul2Var.b && z == ul2Var.c) {
                    str2 = str;
                    h6cVar2 = str2.equals(ul2Var.e) ? h6cVar : h6cVar;
                } else {
                    h6cVar2 = h6cVar;
                    str2 = str;
                }
                ul2Var = new ul2(j2, j4, z, h6cVar2, str2);
                sparseArray.put(i, ul2Var);
            }
        }
        T = -9223372036854775807L;
        if (T == C.TIME_UNSET) {
        }
        j2 = T;
        boolean z2 = mediaInfo != null ? ul2Var.c : mediaInfo.b == 2;
        if (j != C.TIME_UNSET) {
        }
        if (j2 != ul2Var.a) {
        }
        h6cVar2 = h6cVar;
        str2 = str;
        ul2Var = new ul2(j2, j4, z2, h6cVar2, str2);
        sparseArray.put(i, ul2Var);
    }

    @Override // defpackage.ya3
    public void a(k55 k55Var) {
        r55.c((na3) this.b, k55Var);
    }

    @Override // defpackage.ch2
    public Type c() {
        return (Type) this.b;
    }

    @Override // defpackage.ne4
    public qe4 createDataSource() {
        return new fo4((Context) this.b, ((j0l) this.c).createDataSource());
    }

    @Override // defpackage.y8e
    public Object d(KClass kClass, ArrayList arrayList) {
        Object u2gVar;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class x = sha.x(kClass);
        Object obj = concurrentHashMap.get(x);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(x, (obj = new x8e()))) != null) {
            obj = putIfAbsent;
        }
        x8e x8eVar = (x8e) obj;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new lia((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = x8eVar.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = (KSerializer) ((Function2) this.b).invoke(kClass, arrayList);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            w2g w2gVar = new w2g(u2gVar);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, w2gVar);
            obj2 = putIfAbsent2 == null ? w2gVar : putIfAbsent2;
        }
        return ((w2g) obj2).a;
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        ((xn4) this.c).a.execute(new p3(12, this, (ph2) this.b, c2gVar));
    }

    @Override // defpackage.fqf
    public raa f(eqf eqfVar, Object obj) {
        raa raaVar;
        sg3 sg3Var = (sg3) this.b;
        if (sg3Var == null) {
            sg3Var = null;
        }
        if (sg3Var == null || (raaVar = sg3Var.f(eqfVar, obj)) == null) {
            raaVar = raa.a;
        }
        if (raaVar != raa.a) {
            return raaVar;
        }
        twc twcVar = (twc) this.c;
        twcVar.f = CollectionsKt.x0(twcVar.f, new Pair(eqfVar, obj));
        return raa.b;
    }

    @Override // defpackage.m1g
    public int g(uvd uvdVar) {
        return 2;
    }

    @Override // defpackage.gu
    public void h(int i, Bundle bundle) {
        Locale locale = Locale.US;
        bundle.toString();
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            nu nuVar = "clx".equals(bundle2.getString("_o")) ? (x6k) this.b : (dad) this.c;
            if (nuVar == null) {
                return;
            }
            nuVar.m(bundle2, string);
        }
    }

    @Override // defpackage.gn5
    public boolean i(Object obj, File file, uvd uvdVar) {
        return ((ow1) this.c).i(new ex1((dx1) this.b, ((BitmapDrawable) ((e1g) obj).get()).getBitmap()), file, uvdVar);
    }

    @Override // defpackage.d6h
    public KSerializer j(KClass kClass) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class x = sha.x(kClass);
        Object obj = concurrentHashMap.get(x);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(x, (obj = new ue2((KSerializer) ((Function1) this.b).invoke(kClass))))) != null) {
            obj = putIfAbsent;
        }
        return ((ue2) obj).a;
    }

    @Override // defpackage.ch2
    public Object k(dod dodVar) {
        Executor executor = (Executor) this.c;
        return executor == null ? dodVar : new xn4(executor, dodVar);
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        ((xn4) this.c).a.execute(new p3(13, this, (ph2) this.b, th));
    }

    @Override // defpackage.hlg
    public boolean o() {
        return ((hlg) this.b).o();
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        ((sn3) this.b).h = false;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        billingResult.getClass();
        if (billingResult.getResponseCode() == 0) {
            sn3 sn3Var = (sn3) this.b;
            sn3Var.h = true;
            sn3Var.a();
            ((Function0) this.c).invoke();
        }
    }

    @Override // defpackage.ya3
    public void onComplete() {
        ((ya3) this.c).onComplete();
    }

    @Override // defpackage.ya3
    public void onError(Throwable th) {
        ((ya3) this.c).onError(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.hlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public glg open(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        d6g d6gVar = (d6g) this.c;
        if (!str.equals(":memory:")) {
            str = d6gVar.c.a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        pe6 pe6Var = new pe6(str, (d6gVar.a || d6gVar.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = pe6Var.a;
        reentrantLock.lock();
        fp4 fp4Var = pe6Var.b;
        if (fp4Var != null) {
            try {
                fp4Var.E();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (d6gVar.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                glg open = ((hlg) this.b).open(str);
                if (d6gVar.a) {
                    d6g.a(open);
                    if (d6gVar.c.g == i6g.b) {
                        b0a.F(open, "PRAGMA synchronous = NORMAL");
                    } else {
                        b0a.F(open, "PRAGMA synchronous = FULL");
                    }
                    d6gVar.d.d(open);
                } else {
                    try {
                        d6gVar.b = true;
                        d6gVar.b(open);
                        d6gVar.b = false;
                    } catch (Throwable th2) {
                        d6gVar.b = false;
                        throw th2;
                    }
                }
                if (fp4Var != null && (fileChannel2 = (FileChannel) fp4Var.c) != null) {
                    try {
                        fileChannel2.close();
                        fp4Var.c = null;
                    } finally {
                    }
                }
                return open;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (fp4Var != null && (fileChannel = (FileChannel) fp4Var.c) != null) {
                try {
                    fileChannel.close();
                    fp4Var.c = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    public void p(jn2 jn2Var, int i, int i2, int i3) {
        int i4;
        i1d i1dVar = (i1d) this.c;
        int i5 = i1dVar.c;
        if (i5 == 0) {
            i4 = 0;
        } else if (i5 == 0) {
            ogj.m("MutableVector is empty.");
            return;
        } else {
            jn2 jn2Var2 = (jn2) i1dVar.a[i5 - 1];
            i4 = jn2Var2.b - jn2Var2.d;
        }
        if (jn2Var == null) {
            int i6 = i - i4;
            jn2Var = new jn2(i, i2 + i3, i6, (i2 - i) + i6);
        } else {
            if (jn2Var.a > i) {
                jn2Var.a = i;
                jn2Var.c = i;
            }
            int i7 = jn2Var.b;
            if (i2 > i7) {
                int i8 = i7 - jn2Var.d;
                jn2Var.b = i2;
                jn2Var.d = i2 - i8;
            } else {
                i2 = i7;
            }
            jn2Var.b = i2 + i3;
        }
        i1dVar.b(jn2Var);
    }

    public void q() {
        ((i1d) this.b).n();
    }

    public kl6 r(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a = ((dp4) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (kl6) a.newInstance(objArr);
        } catch (Exception e2) {
            sw9.m("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public boolean s() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        d4a d4aVar = (d4a) this.b;
        r38 r38Var = (r38) d4aVar.b;
        r38Var.a();
        boolean contains = ((Application) r38Var.a).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init");
        r38 r38Var2 = (r38) d4aVar.b;
        if (!contains) {
            r38Var2.a();
            Application application = (Application) r38Var2.a;
            try {
                PackageManager packageManager = application.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                    if (bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                        r38Var2.a();
                        Application application2 = (Application) r38Var2.a;
                        try {
                            PackageManager packageManager2 = application2.getPackageManager();
                            if (packageManager2 != null && (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), 128)) != null && (bundle2 = applicationInfo2.metaData) != null && bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                                return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            return ((AtomicBoolean) this.c).get();
        }
        r38Var2.a();
        SharedPreferences sharedPreferences = ((Application) r38Var2.a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", true);
        }
        return true;
    }

    public void t(boolean z, Exception exc) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        hv9 v = hv9.v(hashSet);
        hashSet.clear();
        av9 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            oo4 oo4Var = (oo4) listIterator.next();
            oo4Var.getClass();
            oo4Var.i(z ? 1 : 3, exc);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        jw3 jw3Var = (jw3) this.c;
        if (booleanValue) {
            boolean booleanValue2 = bool.booleanValue();
            rd4 rd4Var = jw3Var.b;
            if (booleanValue2) {
                ((TaskCompletionSource) rd4Var.f).trySetResult(null);
                return ((Task) this.b).onSuccessTask((xx3) jw3Var.e.b, new j0l(this, 16));
            }
            a70.r("An invalid data collection token was used.");
            return null;
        }
        r18 r18Var = jw3Var.g;
        Iterator it = r18.s(((File) r18Var.c).listFiles(jw3.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        r18 r18Var2 = jw3Var.m.b.b;
        vx3.b(r18.s(((File) r18Var2.e).listFiles()));
        vx3.b(r18.s(((File) r18Var2.f).listFiles()));
        vx3.b(r18.s(((File) r18Var2.g).listFiles()));
        jw3Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                i1d i1dVar = (i1d) this.b;
                Object[] objArr = i1dVar.a;
                int i = i1dVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    jn2 jn2Var = (jn2) objArr[i2];
                    sb.append("(" + jn2Var.c + ',' + jn2Var.d + ")->(" + jn2Var.a + ',' + jn2Var.b + ')');
                    if (i2 < ((i1d) this.b).c - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(ig8 ig8Var) {
        m10 m10Var = (m10) this.c;
        yia yiaVar = (yia) this.b;
        int i = ig8Var.b;
        if (i != 0) {
            m10Var.execute(new q61(yiaVar, i, 1));
        } else {
            m10Var.execute(new pyn(3, yiaVar, ig8Var.a));
        }
    }

    public void v(oo4 oo4Var) {
        ((HashSet) this.b).add(oo4Var);
        if (((oo4) this.c) != null) {
            return;
        }
        this.c = oo4Var;
        qf6 provisionRequest = oo4Var.b.getProvisionRequest();
        oo4Var.z = provisionRequest;
        mo4 mo4Var = oo4Var.s;
        String str = nik.a;
        provisionRequest.getClass();
        mo4Var.getClass();
        mo4Var.obtainMessage(1, new no4(lfb.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), provisionRequest)).sendToTarget();
    }

    public void w() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    public InputMethodManager x() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.b).getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.c = inputMethodManager2;
        return inputMethodManager2;
    }

    public void y(Object obj) {
        obj.getClass();
        fdi fdiVar = (fdi) this.b;
        fdiVar.m(null, new Pair(Integer.valueOf(((Number) ((Pair) fdiVar.getValue()).a).intValue() + 1), obj));
    }

    public void z(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void A() {
    }

    @Override // defpackage.fqf
    public void b() {
    }

    @Override // defpackage.fqf
    public void l(Object obj) {
    }

    public /* synthetic */ z41(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ z41(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ z41(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public z41(int i) {
        this.a = i;
        switch (i) {
            case 28:
                this.b = new HashSet();
                break;
            default:
                fdi a = gdi.a(new Pair(Integer.MIN_VALUE, null));
                this.b = a;
                this.c = new sj3(a, 0);
                break;
        }
    }

    public z41(z41 z41Var) {
        i1d i1dVar;
        this.a = 7;
        this.b = new i1d(new jn2[16], 0);
        this.c = new i1d(new jn2[16], 0);
        if (z41Var == null || (i1dVar = (i1d) z41Var.b) == null) {
            return;
        }
        Object[] objArr = i1dVar.a;
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            jn2 jn2Var = (jn2) objArr[i2];
            ((i1d) this.b).b(new jn2(jn2Var.a, jn2Var.b, jn2Var.c, jn2Var.d));
        }
    }

    public z41(br4 br4Var) {
        this.a = 6;
        this.b = new SparseArray();
        this.c = new HashMap();
    }

    public z41(d6g d6gVar, hlg hlgVar) {
        this.a = 1;
        hlgVar.getClass();
        this.c = d6gVar;
        this.b = hlgVar;
    }

    public z41(oe4 oe4Var) {
        this.a = 26;
        fjg fjgVar = new fjg();
        fjgVar.b = new zic(21);
        this.c = fjgVar;
        this.b = oe4Var;
    }

    public z41(View view) {
        this.a = 9;
        this.b = view;
    }

    public z41(Function1 function1) {
        this.a = 11;
        this.b = function1;
        this.c = new ConcurrentHashMap();
    }

    public z41(Function2 function2) {
        this.a = 12;
        this.b = function2;
        this.c = new ConcurrentHashMap();
    }

    public z41(CardView cardView) {
        this.a = 5;
        this.c = cardView;
    }

    public z41(dp4 dp4Var) {
        this.a = 29;
        this.b = dp4Var;
        this.c = new AtomicBoolean(false);
    }
}
