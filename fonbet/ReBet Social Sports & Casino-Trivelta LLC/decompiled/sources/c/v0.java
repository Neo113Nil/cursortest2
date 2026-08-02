package c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import com.appsflyer.AdRevenueScheme;
import com.surt.guardian.core.Configuration;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: n, reason: collision with root package name */
    public static final Ac.a f26696n = new Ac.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26697a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f26698b;

    /* renamed from: c, reason: collision with root package name */
    public E0 f26699c;

    /* renamed from: d, reason: collision with root package name */
    public P0 f26700d;

    /* renamed from: e, reason: collision with root package name */
    public C0 f26701e;

    /* renamed from: f, reason: collision with root package name */
    public C2459o0 f26702f;

    /* renamed from: g, reason: collision with root package name */
    public M0 f26703g;

    /* renamed from: h, reason: collision with root package name */
    public C2453l0 f26704h;

    /* renamed from: i, reason: collision with root package name */
    public Q f26705i;

    /* renamed from: j, reason: collision with root package name */
    public Y f26706j;

    /* renamed from: k, reason: collision with root package name */
    public K0 f26707k;

    /* renamed from: l, reason: collision with root package name */
    public C2445h0 f26708l;

    /* renamed from: m, reason: collision with root package name */
    public u0 f26709m;

    public v0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26697a = context;
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNull(digest);
            return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C2466s0.f26672d, 30, (Object) null);
        } catch (Exception e10) {
            Logger.f41582a.b("DataCollector", "Error generating SHA-256 hash", e10);
            return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(192:76|77|78|79|80|(186:85|86|87|88|89|90|(1:92)|93|(1:95)|96|(3:98|(1:607)(1:102)|(175:104|105|(3:107|(1:109)|(172:111|112|(3:114|(1:116)|(169:118|119|(1:121)(1:603)|122|(1:124)(1:602)|125|(1:129)|130|(7:132|(1:134)(1:600)|(1:136)(1:599)|137|(1:139)(1:598)|(1:141)(1:597)|142)(1:601)|143|(1:145)(1:596)|146|(1:148)(1:595)|(1:150)(1:594)|(1:152)(1:593)|(1:154)|(1:156)|157|(1:159)(1:592)|(1:161)(1:591)|162|(1:164)(1:590)|(1:166)(1:589)|167|(1:169)(1:588)|(1:171)(1:587)|172|(1:174)(1:586)|(1:176)(1:585)|177|(1:179)(1:584)|(1:181)(1:583)|182|(1:184)(1:582)|(1:186)(1:581)|187|(1:189)(1:580)|(1:191)(1:579)|192|(1:194)(1:578)|195|(1:197)(1:577)|198|(1:200)(1:576)|201|(1:203)(1:575)|204|(1:206)(1:574)|(1:208)(1:573)|209|(1:211)(1:572)|212|(1:214)(1:571)|215|(1:217)(1:570)|218|(1:220)(1:569)|221|(1:223)(1:568)|224|(1:226)(1:567)|227|(1:229)(1:566)|(1:231)(1:565)|232|(1:234)(1:564)|(1:236)(1:563)|237|(1:239)(1:562)|(1:241)(1:561)|242|(1:244)(1:560)|(1:246)(1:559)|247|(1:249)(1:558)|250|(1:252)(1:557)|(1:254)(1:556)|255|(1:257)(1:555)|258|(1:260)(1:554)|261|(1:263)(1:553)|264|(1:266)(1:552)|267|(1:269)(1:551)|270|(1:272)(1:550)|273|274|(1:276)(1:549)|(1:278)(1:548)|279|(1:281)(1:547)|(1:283)(1:546)|284|(1:286)(1:545)|(1:288)(1:544)|289|(1:291)(1:543)|(1:293)(1:542)|294|295|(1:297)(1:541)|(1:299)(1:540)|300|(1:302)(1:539)|(1:304)(1:538)|305|306|(1:308)(1:537)|(1:310)(1:536)|311|312|(1:314)(1:535)|(1:316)(1:534)|317|318|(1:320)(1:533)|(1:322)(1:532)|323|(1:325)(1:531)|(1:327)(1:530)|328|329|(1:331)(1:529)|(1:333)(1:528)|334|(1:336)(1:527)|(1:338)(1:526)|339|340|(1:342)(1:525)|(1:344)(1:524)|345|(1:347)(1:523)|348|(1:350)(1:522)|(1:352)|353|(1:355)(1:521)|356|357|(1:359)(1:520)|360|(1:362)(1:519)|363|(1:365)(1:518)|366|(1:368)(1:517)|369|(1:371)(1:516)|372|(1:374)(1:515)|375|(1:377)(1:514)|378|379|(1:381)(1:513)|(1:383)(1:512)|(9:385|(1:387)(1:510)|(1:389)(1:509)|390|(1:392)(1:508)|(1:394)|395|(1:397)(1:507)|398)(1:511)|(8:400|(1:402)(1:505)|403|(1:405)(1:504)|(1:407)|408|(1:410)(1:503)|411)(1:506)|(19:413|(1:415)(1:501)|(1:417)(1:500)|418|(1:420)(1:499)|(1:422)(1:498)|423|(1:425)(1:497)|(1:427)|428|(1:430)(1:496)|(1:432)|433|(1:435)(1:495)|436|(1:438)(1:494)|439|(1:441)(1:493)|442)(1:502)|(11:444|(1:446)(1:491)|447|(1:449)(1:490)|450|(1:452)(1:489)|453|(1:455)(1:488)|456|(1:458)(1:487)|459)(1:492)|(12:461|(1:463)(1:485)|464|(1:466)(1:484)|467|(1:469)(1:483)|470|(1:472)(1:482)|473|(1:475)(1:481)|476|477)(1:486)|478|479))|604|119|(0)(0)|122|(0)(0)|125|(2:127|129)|130|(0)(0)|143|(0)(0)|146|(0)(0)|(0)(0)|(0)(0)|(0)|(0)|157|(0)(0)|(0)(0)|162|(0)(0)|(0)(0)|167|(0)(0)|(0)(0)|172|(0)(0)|(0)(0)|177|(0)(0)|(0)(0)|182|(0)(0)|(0)(0)|187|(0)(0)|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)(0)|(0)(0)|209|(0)(0)|212|(0)(0)|215|(0)(0)|218|(0)(0)|221|(0)(0)|224|(0)(0)|227|(0)(0)|(0)(0)|232|(0)(0)|(0)(0)|237|(0)(0)|(0)(0)|242|(0)(0)|(0)(0)|247|(0)(0)|250|(0)(0)|(0)(0)|255|(0)(0)|258|(0)(0)|261|(0)(0)|264|(0)(0)|267|(0)(0)|270|(0)(0)|273|274|(0)(0)|(0)(0)|279|(0)(0)|(0)(0)|284|(0)(0)|(0)(0)|289|(0)(0)|(0)(0)|294|295|(0)(0)|(0)(0)|300|(0)(0)|(0)(0)|305|306|(0)(0)|(0)(0)|311|312|(0)(0)|(0)(0)|317|318|(0)(0)|(0)(0)|323|(0)(0)|(0)(0)|328|329|(0)(0)|(0)(0)|334|(0)(0)|(0)(0)|339|340|(0)(0)|(0)(0)|345|(0)(0)|348|(0)(0)|(0)|353|(0)(0)|356|357|(0)(0)|360|(0)(0)|363|(0)(0)|366|(0)(0)|369|(0)(0)|372|(0)(0)|375|(0)(0)|378|379|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|478|479))|605|112|(0)|604|119|(0)(0)|122|(0)(0)|125|(0)|130|(0)(0)|143|(0)(0)|146|(0)(0)|(0)(0)|(0)(0)|(0)|(0)|157|(0)(0)|(0)(0)|162|(0)(0)|(0)(0)|167|(0)(0)|(0)(0)|172|(0)(0)|(0)(0)|177|(0)(0)|(0)(0)|182|(0)(0)|(0)(0)|187|(0)(0)|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)(0)|(0)(0)|209|(0)(0)|212|(0)(0)|215|(0)(0)|218|(0)(0)|221|(0)(0)|224|(0)(0)|227|(0)(0)|(0)(0)|232|(0)(0)|(0)(0)|237|(0)(0)|(0)(0)|242|(0)(0)|(0)(0)|247|(0)(0)|250|(0)(0)|(0)(0)|255|(0)(0)|258|(0)(0)|261|(0)(0)|264|(0)(0)|267|(0)(0)|270|(0)(0)|273|274|(0)(0)|(0)(0)|279|(0)(0)|(0)(0)|284|(0)(0)|(0)(0)|289|(0)(0)|(0)(0)|294|295|(0)(0)|(0)(0)|300|(0)(0)|(0)(0)|305|306|(0)(0)|(0)(0)|311|312|(0)(0)|(0)(0)|317|318|(0)(0)|(0)(0)|323|(0)(0)|(0)(0)|328|329|(0)(0)|(0)(0)|334|(0)(0)|(0)(0)|339|340|(0)(0)|(0)(0)|345|(0)(0)|348|(0)(0)|(0)|353|(0)(0)|356|357|(0)(0)|360|(0)(0)|363|(0)(0)|366|(0)(0)|369|(0)(0)|372|(0)(0)|375|(0)(0)|378|379|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|478|479))(1:608)|606|105|(0)|605|112|(0)|604|119|(0)(0)|122|(0)(0)|125|(0)|130|(0)(0)|143|(0)(0)|146|(0)(0)|(0)(0)|(0)(0)|(0)|(0)|157|(0)(0)|(0)(0)|162|(0)(0)|(0)(0)|167|(0)(0)|(0)(0)|172|(0)(0)|(0)(0)|177|(0)(0)|(0)(0)|182|(0)(0)|(0)(0)|187|(0)(0)|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)(0)|(0)(0)|209|(0)(0)|212|(0)(0)|215|(0)(0)|218|(0)(0)|221|(0)(0)|224|(0)(0)|227|(0)(0)|(0)(0)|232|(0)(0)|(0)(0)|237|(0)(0)|(0)(0)|242|(0)(0)|(0)(0)|247|(0)(0)|250|(0)(0)|(0)(0)|255|(0)(0)|258|(0)(0)|261|(0)(0)|264|(0)(0)|267|(0)(0)|270|(0)(0)|273|274|(0)(0)|(0)(0)|279|(0)(0)|(0)(0)|284|(0)(0)|(0)(0)|289|(0)(0)|(0)(0)|294|295|(0)(0)|(0)(0)|300|(0)(0)|(0)(0)|305|306|(0)(0)|(0)(0)|311|312|(0)(0)|(0)(0)|317|318|(0)(0)|(0)(0)|323|(0)(0)|(0)(0)|328|329|(0)(0)|(0)(0)|334|(0)(0)|(0)(0)|339|340|(0)(0)|(0)(0)|345|(0)(0)|348|(0)(0)|(0)|353|(0)(0)|356|357|(0)(0)|360|(0)(0)|363|(0)(0)|366|(0)(0)|369|(0)(0)|372|(0)(0)|375|(0)(0)|378|379|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|478|479)|613|86|87|88|89|90|(0)|93|(0)|96|(0)(0)|606|105|(0)|605|112|(0)|604|119|(0)(0)|122|(0)(0)|125|(0)|130|(0)(0)|143|(0)(0)|146|(0)(0)|(0)(0)|(0)(0)|(0)|(0)|157|(0)(0)|(0)(0)|162|(0)(0)|(0)(0)|167|(0)(0)|(0)(0)|172|(0)(0)|(0)(0)|177|(0)(0)|(0)(0)|182|(0)(0)|(0)(0)|187|(0)(0)|(0)(0)|192|(0)(0)|195|(0)(0)|198|(0)(0)|201|(0)(0)|204|(0)(0)|(0)(0)|209|(0)(0)|212|(0)(0)|215|(0)(0)|218|(0)(0)|221|(0)(0)|224|(0)(0)|227|(0)(0)|(0)(0)|232|(0)(0)|(0)(0)|237|(0)(0)|(0)(0)|242|(0)(0)|(0)(0)|247|(0)(0)|250|(0)(0)|(0)(0)|255|(0)(0)|258|(0)(0)|261|(0)(0)|264|(0)(0)|267|(0)(0)|270|(0)(0)|273|274|(0)(0)|(0)(0)|279|(0)(0)|(0)(0)|284|(0)(0)|(0)(0)|289|(0)(0)|(0)(0)|294|295|(0)(0)|(0)(0)|300|(0)(0)|(0)(0)|305|306|(0)(0)|(0)(0)|311|312|(0)(0)|(0)(0)|317|318|(0)(0)|(0)(0)|323|(0)(0)|(0)(0)|328|329|(0)(0)|(0)(0)|334|(0)(0)|(0)(0)|339|340|(0)(0)|(0)(0)|345|(0)(0)|348|(0)(0)|(0)|353|(0)(0)|356|357|(0)(0)|360|(0)(0)|363|(0)(0)|366|(0)(0)|369|(0)(0)|372|(0)(0)|375|(0)(0)|378|379|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|478|479) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0 a() {
        Object obj;
        Map map;
        Map map2;
        Q q10;
        Map a10;
        Y y10;
        String d10;
        K0 k02;
        Map map3;
        Map map4;
        C2445h0 c2445h0;
        Map map5;
        u0 u0Var;
        Map map6;
        Map map7;
        ArrayList arrayList;
        Map map8;
        String str;
        C2447i0 c2447i0;
        N n10;
        F0 f02;
        C2437d0 c2437d0;
        C2464r0 c2464r0;
        Object obj2;
        Intent registerReceiver;
        float intExtra;
        int intExtra2;
        boolean z10;
        Logger.f41582a.a("DataCollector", "Starting comprehensive data collection...");
        long currentTimeMillis = System.currentTimeMillis();
        E0 e02 = this.f26699c;
        if (e02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enhancedHardwareModule");
            e02 = null;
        }
        Map a11 = e02.a();
        P0 p02 = this.f26700d;
        if (p02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enhancedSoftwareModule");
            p02 = null;
        }
        Map a12 = p02.a();
        C0 c02 = this.f26701e;
        if (c02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("integrityModule");
            c02 = null;
        }
        c02.getClass();
        Map a13 = C0.a();
        C2459o0 c2459o0 = this.f26702f;
        if (c2459o0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("securityModule");
            c2459o0 = null;
        }
        Map a14 = c2459o0.a();
        M0 m02 = this.f26703g;
        if (m02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("enhancedSecurityModule");
            m02 = null;
        }
        m02.getClass();
        Pair pair = TuplesKt.to("frida_detected", Boolean.valueOf(M0.a()));
        Pair pair2 = TuplesKt.to("xposed_detected", Boolean.valueOf(m02.f()));
        Pair pair3 = TuplesKt.to("substrate_detected", Boolean.valueOf(m02.d()));
        Pair pair4 = TuplesKt.to("debugger_attached", Boolean.valueOf(Debug.isDebuggerConnected() || Debug.waitingForDebugger()));
        Pair pair5 = TuplesKt.to("rooted_advanced", Boolean.valueOf(m02.g()));
        Pair pair6 = TuplesKt.to("magisk_detected", Boolean.valueOf(m02.c()));
        Object obj3 = new C2459o0(m02.f26466a).a().get("is_emulator");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Pair pair7 = TuplesKt.to("emulator_detected", Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        Pair pair8 = TuplesKt.to("signature_valid", Boolean.valueOf(m02.h()));
        Pair pair9 = TuplesKt.to("suspicious_apps_installed", m02.e());
        int i10 = M0.a() ? 10 : 0;
        if (m02.f()) {
            i10 += 10;
        }
        if (m02.d()) {
            i10 += 8;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            i10 += 15;
        }
        if (m02.g()) {
            i10 += 12;
        }
        if (m02.c()) {
            i10 += 8;
        }
        int i11 = i10;
        Object obj4 = new C2459o0(m02.f26466a).a().get("is_emulator");
        Boolean bool2 = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        int i12 = (bool2 == null || !bool2.booleanValue()) ? i11 : i11 + 5;
        if (!m02.h()) {
            i12 += 20;
        }
        if (!m02.e().isEmpty()) {
            i12 += 5;
        }
        Map mapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to("threat_level", i12 >= 20 ? "CRITICAL" : i12 >= 10 ? "HIGH" : i12 >= 5 ? "MEDIUM" : "LOW"));
        Configuration configuration = this.f26698b;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration = null;
        }
        if (configuration.getCollectBatteryInfo()) {
            C2453l0 c2453l0 = this.f26704h;
            if (c2453l0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("batteryModule");
                c2453l0 = null;
            }
            c2453l0.getClass();
            try {
                try {
                    registerReceiver = c2453l0.f26624a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Exception unused) {
                    obj = "rooted_advanced";
                    map = null;
                }
            } catch (Exception unused2) {
            }
            if (registerReceiver != null) {
                obj = "rooted_advanced";
                try {
                    intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
                    intExtra2 = registerReceiver.getIntExtra("status", -1);
                } catch (Exception unused3) {
                }
                if (intExtra2 != 2 && intExtra2 != 5) {
                    z10 = false;
                    Pair pair10 = TuplesKt.to("level", Float.valueOf(intExtra));
                    map = null;
                    map2 = MapsKt.mapOf(pair10, TuplesKt.to("is_charging", Boolean.valueOf(z10)), TuplesKt.to("temperature", null));
                    q10 = this.f26705i;
                    Q q11 = q10;
                    if (q10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("networkModule");
                        q11 = map;
                    }
                    a10 = q11.a();
                    y10 = this.f26706j;
                    Y y11 = y10;
                    if (y10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("persistentIdModule");
                        y11 = map;
                    }
                    d10 = y11.d();
                    Map mutableMap = MapsKt.toMutableMap(a14);
                    mutableMap.putAll(mapOf);
                    k02 = this.f26707k;
                    if (k02 != null) {
                        map3 = map2;
                        K0 k03 = (AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? k02 : null;
                        if (k03 != null) {
                            map4 = k03.b();
                            c2445h0 = this.f26708l;
                            if (c2445h0 != null) {
                                if (!c2445h0.b()) {
                                    c2445h0 = null;
                                }
                                if (c2445h0 != null) {
                                    map5 = c2445h0.a();
                                    u0Var = this.f26709m;
                                    if (u0Var != null) {
                                        u0 u0Var2 = u0Var;
                                        if (AbstractC5338c.checkSelfPermission(u0Var.f26691a, "android.permission.READ_PHONE_STATE") != 0) {
                                            u0Var2 = null;
                                        }
                                        if (u0Var2 != null) {
                                            map6 = u0Var2.a();
                                            Object obj5 = a11.get("manufacturer");
                                            Object obj6 = a11.get("model");
                                            Object obj7 = a11.get("brand");
                                            Object obj8 = a11.get("screen_width");
                                            Object obj9 = a11.get("screen_height");
                                            Object obj10 = a11.get("density");
                                            Object obj11 = a11.get("screen_refresh_rate");
                                            Object obj12 = a11.get("total_memory");
                                            Object obj13 = a11.get("available_sensors");
                                            String obj14 = obj13 == null ? obj13.toString() : null;
                                            Object obj15 = a11.get("system_features");
                                            map7 = map6;
                                            String b10 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj14, obj15 == null ? obj15.toString() : null)), "|", null, null, 0, null, null, 62, null));
                                            String b11 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
                                            arrayList = new ArrayList();
                                            if (map5 != null && (obj2 = map5.get("bssid")) != null) {
                                                arrayList.add(obj2.toString());
                                            }
                                            if (map4 == null) {
                                                Object obj16 = map4.get("latitude");
                                                Double d11 = obj16 instanceof Double ? (Double) obj16 : null;
                                                String take = StringsKt.take(String.valueOf(d11 != null ? d11.doubleValue() : 0.0d), 6);
                                                Object obj17 = map4.get("longitude");
                                                map8 = mutableMap;
                                                Double d12 = obj17 instanceof Double ? (Double) obj17 : null;
                                                arrayList.add(take + ',' + StringsKt.take(String.valueOf(d12 != null ? d12.doubleValue() : 0.0d), 6));
                                            } else {
                                                map8 = mutableMap;
                                            }
                                            String b12 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b10, "s:" + b11, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
                                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                            Logger logger = Logger.f41582a;
                                            logger.a("DataCollector", "Data collection completed in " + currentTimeMillis2 + "ms");
                                            StringBuilder sb2 = new StringBuilder("Fingerprint: ");
                                            sb2.append(b12);
                                            logger.a("DataCollector", sb2.toString());
                                            double d13 = d10.length() != 0 ? 0.7d : 1.0d;
                                            if (map4 == null) {
                                                str = "";
                                                d13 = Math.min(1.0d, d13 + 0.05d);
                                            } else {
                                                str = "";
                                            }
                                            if ((map5 == null ? map5.get("bssid") : null) != null) {
                                                d13 = Math.min(1.0d, d13 + 0.03d);
                                            }
                                            if (map7 != null) {
                                                d13 = Math.min(1.0d, d13 + 0.02d);
                                            }
                                            double max = Math.max(0.0d, d13);
                                            long currentTimeMillis3 = System.currentTimeMillis();
                                            Object obj18 = a11.get("manufacturer");
                                            String str2 = !(obj18 instanceof String) ? (String) obj18 : null;
                                            String str3 = str2 != null ? str : str2;
                                            Object obj19 = a11.get("model");
                                            String str4 = !(obj19 instanceof String) ? (String) obj19 : null;
                                            String str5 = str4 != null ? str : str4;
                                            Object obj20 = a11.get("brand");
                                            String str6 = !(obj20 instanceof String) ? (String) obj20 : null;
                                            String str7 = str6 != null ? str : str6;
                                            Object obj21 = a12.get(PublisherMetadata.OS_VERSION);
                                            String str8 = !(obj21 instanceof String) ? (String) obj21 : null;
                                            String str9 = str8 != null ? str : str8;
                                            Object obj22 = a12.get("sdk_int");
                                            Integer num = !(obj22 instanceof Integer) ? (Integer) obj22 : null;
                                            int intValue = num == null ? num.intValue() : 0;
                                            Object obj23 = a11.get("screen_width");
                                            Integer num2 = !(obj23 instanceof Integer) ? (Integer) obj23 : null;
                                            int intValue2 = num2 == null ? num2.intValue() : 0;
                                            Object obj24 = a11.get("screen_height");
                                            Integer num3 = !(obj24 instanceof Integer) ? (Integer) obj24 : null;
                                            int intValue3 = num3 == null ? num3.intValue() : 0;
                                            Object obj25 = a11.get("density");
                                            Float f10 = !(obj25 instanceof Float) ? (Float) obj25 : null;
                                            float floatValue = f10 == null ? f10.floatValue() : 0.0f;
                                            Object obj26 = a11.get("total_memory");
                                            Long l10 = !(obj26 instanceof Long) ? (Long) obj26 : null;
                                            long longValue = l10 == null ? l10.longValue() : 0L;
                                            Object obj27 = a11.get("total_storage");
                                            Long l11 = !(obj27 instanceof Long) ? (Long) obj27 : null;
                                            long longValue2 = l11 == null ? l11.longValue() : 0L;
                                            Object obj28 = a11.get("screen_refresh_rate");
                                            Float f11 = !(obj28 instanceof Float) ? (Float) obj28 : null;
                                            Object obj29 = a11.get("available_sensors");
                                            List list = !(obj29 instanceof List) ? (List) obj29 : null;
                                            Object obj30 = a11.get("system_features");
                                            List list2 = !(obj30 instanceof List) ? (List) obj30 : null;
                                            Object obj31 = a11.get("device_uptime_ms");
                                            Long l12 = !(obj31 instanceof Long) ? (Long) obj31 : null;
                                            Object obj32 = a11.get("is_dark_mode");
                                            Boolean bool3 = !(obj32 instanceof Boolean) ? (Boolean) obj32 : null;
                                            Object obj33 = a11.get("camera_count");
                                            Integer num4 = !(obj33 instanceof Integer) ? (Integer) obj33 : null;
                                            Object obj34 = a11.get("system_features");
                                            List list3 = !(obj34 instanceof List) ? (List) obj34 : null;
                                            boolean contains = list3 == null ? list3.contains("nfc") : false;
                                            Object obj35 = a11.get("has_fingerprint");
                                            Boolean bool4 = !(obj35 instanceof Boolean) ? (Boolean) obj35 : null;
                                            B0 b02 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
                                            Object obj36 = a13.get("is_rooted");
                                            Boolean bool5 = !(obj36 instanceof Boolean) ? (Boolean) obj36 : null;
                                            boolean booleanValue = bool5 == null ? bool5.booleanValue() : false;
                                            Object obj37 = a13.get("confidence");
                                            Double d14 = !(obj37 instanceof Double) ? (Double) obj37 : null;
                                            double doubleValue = d14 == null ? d14.doubleValue() : 1.0d;
                                            Object obj38 = a13.get("su_binary_paths");
                                            List list4 = !(obj38 instanceof List) ? (List) obj38 : null;
                                            Object obj39 = a13.get("test_keys_present");
                                            Boolean bool6 = !(obj39 instanceof Boolean) ? (Boolean) obj39 : null;
                                            boolean booleanValue2 = bool6 == null ? bool6.booleanValue() : false;
                                            Object obj40 = a13.get("bootloader");
                                            String str10 = !(obj40 instanceof String) ? (String) obj40 : null;
                                            Object obj41 = a13.get("build_tags");
                                            String str11 = !(obj41 instanceof String) ? (String) obj41 : null;
                                            Object obj42 = a13.get("build_type");
                                            String str12 = !(obj42 instanceof String) ? (String) obj42 : null;
                                            Object obj43 = a13.get("build_user");
                                            String str13 = !(obj43 instanceof String) ? (String) obj43 : null;
                                            Object obj44 = a13.get("build_host");
                                            String str14 = !(obj44 instanceof String) ? (String) obj44 : null;
                                            Object obj45 = a13.get("build_fingerprint");
                                            z0 z0Var = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj45 instanceof String) ? (String) obj45 : null);
                                            Map map9 = map8;
                                            Object obj46 = map9.get("developer_options_enabled");
                                            Boolean bool7 = !(obj46 instanceof Boolean) ? (Boolean) obj46 : null;
                                            boolean booleanValue3 = bool7 == null ? bool7.booleanValue() : false;
                                            Object obj47 = map9.get("adb_enabled");
                                            Boolean bool8 = !(obj47 instanceof Boolean) ? (Boolean) obj47 : null;
                                            boolean booleanValue4 = bool8 == null ? bool8.booleanValue() : false;
                                            Object obj48 = map9.get("is_vpn_active");
                                            Boolean bool9 = !(obj48 instanceof Boolean) ? (Boolean) obj48 : null;
                                            boolean booleanValue5 = bool9 == null ? bool9.booleanValue() : false;
                                            Object obj49 = map9.get("unknown_sources_enabled");
                                            Boolean bool10 = !(obj49 instanceof Boolean) ? (Boolean) obj49 : null;
                                            boolean booleanValue6 = bool10 == null ? bool10.booleanValue() : false;
                                            Object obj50 = map9.get("is_emulator");
                                            Boolean bool11 = !(obj50 instanceof Boolean) ? (Boolean) obj50 : null;
                                            boolean booleanValue7 = bool11 == null ? bool11.booleanValue() : false;
                                            Object obj51 = map9.get("emulator_confidence");
                                            Double d15 = !(obj51 instanceof Double) ? (Double) obj51 : null;
                                            double doubleValue2 = d15 == null ? d15.doubleValue() : 0.0d;
                                            Object obj52 = map9.get("frida_detected");
                                            Boolean bool12 = !(obj52 instanceof Boolean) ? (Boolean) obj52 : null;
                                            boolean booleanValue8 = bool12 == null ? bool12.booleanValue() : false;
                                            Object obj53 = map9.get("xposed_detected");
                                            Boolean bool13 = !(obj53 instanceof Boolean) ? (Boolean) obj53 : null;
                                            boolean booleanValue9 = bool13 == null ? bool13.booleanValue() : false;
                                            Object obj54 = map9.get("substrate_detected");
                                            Boolean bool14 = !(obj54 instanceof Boolean) ? (Boolean) obj54 : null;
                                            boolean booleanValue10 = bool14 == null ? bool14.booleanValue() : false;
                                            Object obj55 = map9.get("magisk_detected");
                                            Boolean bool15 = !(obj55 instanceof Boolean) ? (Boolean) obj55 : null;
                                            boolean booleanValue11 = bool15 == null ? bool15.booleanValue() : false;
                                            Object obj56 = map9.get("debugger_attached");
                                            Boolean bool16 = !(obj56 instanceof Boolean) ? (Boolean) obj56 : null;
                                            boolean booleanValue12 = bool16 == null ? bool16.booleanValue() : false;
                                            Object obj57 = map9.get("app_cloned");
                                            Boolean bool17 = !(obj57 instanceof Boolean) ? (Boolean) obj57 : null;
                                            boolean booleanValue13 = bool17 == null ? bool17.booleanValue() : false;
                                            Object obj58 = map9.get(obj);
                                            Boolean bool18 = !(obj58 instanceof Boolean) ? (Boolean) obj58 : null;
                                            boolean booleanValue14 = bool18 == null ? bool18.booleanValue() : false;
                                            Object obj59 = map9.get("suspicious_apps_installed");
                                            List list5 = !(obj59 instanceof List) ? (List) obj59 : null;
                                            Object obj60 = map9.get("signature_valid");
                                            Boolean bool19 = !(obj60 instanceof Boolean) ? (Boolean) obj60 : null;
                                            boolean booleanValue15 = bool19 != null ? bool19.booleanValue() : true;
                                            Object obj61 = map9.get("threat_level");
                                            C2451k0 c2451k0 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue15, !(obj61 instanceof String) ? (String) obj61 : null);
                                            Object obj62 = a12.get("build_fingerprint");
                                            String str15 = !(obj62 instanceof String) ? (String) obj62 : null;
                                            Object obj63 = a12.get("build_id");
                                            String str16 = !(obj63 instanceof String) ? (String) obj63 : null;
                                            Object obj64 = a12.get("language");
                                            String str17 = !(obj64 instanceof String) ? (String) obj64 : null;
                                            Object obj65 = a12.get(AdRevenueScheme.COUNTRY);
                                            String str18 = !(obj65 instanceof String) ? (String) obj65 : null;
                                            Object obj66 = a12.get("app_install_time");
                                            Long l13 = !(obj66 instanceof Long) ? (Long) obj66 : null;
                                            Object obj67 = a12.get("app_update_time");
                                            Long l14 = !(obj67 instanceof Long) ? (Long) obj67 : null;
                                            Object obj68 = a12.get("days_since_install");
                                            x0 x0Var = new x0(str15, str16, str17, str18, l13, l14, !(obj68 instanceof Long) ? (Long) obj68 : null);
                                            Object obj69 = a12.get("timezone");
                                            String str19 = !(obj69 instanceof String) ? (String) obj69 : null;
                                            String str20 = str19 != null ? str : str19;
                                            if (map3 == null) {
                                                Map map10 = map3;
                                                Object obj70 = map10.get("level");
                                                Float f12 = obj70 instanceof Float ? (Float) obj70 : null;
                                                float floatValue2 = f12 != null ? f12.floatValue() : 0.0f;
                                                Object obj71 = map10.get("is_charging");
                                                Boolean bool20 = obj71 instanceof Boolean ? (Boolean) obj71 : null;
                                                boolean booleanValue16 = bool20 != null ? bool20.booleanValue() : false;
                                                Object obj72 = map10.get("temperature");
                                                c2447i0 = new C2447i0(floatValue2, booleanValue16, obj72 instanceof Float ? (Float) obj72 : null);
                                            } else {
                                                c2447i0 = null;
                                            }
                                            if (a10 == null) {
                                                Object obj73 = a10.get("wifi_ssid");
                                                String str21 = obj73 instanceof String ? (String) obj73 : null;
                                                Object obj74 = a10.get("connection_type");
                                                String str22 = obj74 instanceof String ? (String) obj74 : null;
                                                if (str22 == null) {
                                                    str22 = "unknown";
                                                }
                                                Object obj75 = a10.get("ip_address");
                                                n10 = new N(str21, str22, obj75 instanceof String ? (String) obj75 : null);
                                            } else {
                                                n10 = null;
                                            }
                                            if (map4 == null) {
                                                Object obj76 = map4.get("latitude");
                                                Double d16 = obj76 instanceof Double ? (Double) obj76 : null;
                                                double doubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                                                Object obj77 = map4.get("longitude");
                                                Double d17 = obj77 instanceof Double ? (Double) obj77 : null;
                                                double doubleValue4 = d17 != null ? d17.doubleValue() : 0.0d;
                                                Object obj78 = map4.get("accuracy");
                                                Float f13 = obj78 instanceof Float ? (Float) obj78 : null;
                                                float floatValue3 = f13 != null ? f13.floatValue() : 0.0f;
                                                Object obj79 = map4.get(EventKeys.TIMESTAMP);
                                                Long l15 = obj79 instanceof Long ? (Long) obj79 : null;
                                                long longValue3 = l15 != null ? l15.longValue() : 0L;
                                                Object obj80 = map4.get("altitude");
                                                Double d18 = obj80 instanceof Double ? (Double) obj80 : null;
                                                Object obj81 = map4.get("speed");
                                                Float f14 = obj81 instanceof Float ? (Float) obj81 : null;
                                                Object obj82 = map4.get("provider");
                                                f02 = new F0(doubleValue3, doubleValue4, floatValue3, longValue3, d18, f14, obj82 instanceof String ? (String) obj82 : null);
                                            } else {
                                                f02 = null;
                                            }
                                            if (map5 == null) {
                                                Object obj83 = map5.get("ssid");
                                                String str23 = obj83 instanceof String ? (String) obj83 : null;
                                                Object obj84 = map5.get("bssid");
                                                String str24 = obj84 instanceof String ? (String) obj84 : null;
                                                Object obj85 = map5.get("link_speed");
                                                Integer num5 = obj85 instanceof Integer ? (Integer) obj85 : null;
                                                Object obj86 = map5.get("rssi");
                                                Integer num6 = obj86 instanceof Integer ? (Integer) obj86 : null;
                                                Object obj87 = map5.get("frequency");
                                                c2437d0 = new C2437d0(str23, str24, num5, num6, obj87 instanceof Integer ? (Integer) obj87 : null);
                                            } else {
                                                c2437d0 = null;
                                            }
                                            if (map7 == null) {
                                                Object obj88 = map7.get("carrier_name");
                                                String str25 = obj88 instanceof String ? (String) obj88 : null;
                                                Object obj89 = map7.get("carrier_country");
                                                String str26 = obj89 instanceof String ? (String) obj89 : null;
                                                Object obj90 = map7.get("sim_country");
                                                String str27 = obj90 instanceof String ? (String) obj90 : null;
                                                Object obj91 = map7.get("network_type");
                                                String str28 = obj91 instanceof String ? (String) obj91 : null;
                                                Object obj92 = map7.get("sim_state");
                                                c2464r0 = new C2464r0(str25, str26, str27, str28, obj92 instanceof String ? (String) obj92 : null);
                                            } else {
                                                c2464r0 = null;
                                            }
                                            return new y0(b12, currentTimeMillis3, b02, z0Var, c2451k0, x0Var, str20, c2447i0, n10, f02, c2437d0, c2464r0, max);
                                        }
                                    }
                                    map6 = null;
                                    Object obj510 = a11.get("manufacturer");
                                    Object obj610 = a11.get("model");
                                    Object obj710 = a11.get("brand");
                                    Object obj810 = a11.get("screen_width");
                                    Object obj93 = a11.get("screen_height");
                                    Object obj102 = a11.get("density");
                                    Object obj112 = a11.get("screen_refresh_rate");
                                    Object obj122 = a11.get("total_memory");
                                    Object obj132 = a11.get("available_sensors");
                                    if (obj132 == null) {
                                    }
                                    Object obj152 = a11.get("system_features");
                                    map7 = map6;
                                    String b102 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj510, obj610, obj710, obj810, obj93, obj102, obj112, obj122, obj14, obj152 == null ? obj152.toString() : null)), "|", null, null, 0, null, null, 62, null));
                                    String b112 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
                                    arrayList = new ArrayList();
                                    if (map5 != null) {
                                        arrayList.add(obj2.toString());
                                    }
                                    if (map4 == null) {
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    String b122 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b102, "s:" + b112, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
                                    long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
                                    Logger logger2 = Logger.f41582a;
                                    logger2.a("DataCollector", "Data collection completed in " + currentTimeMillis22 + "ms");
                                    StringBuilder sb22 = new StringBuilder("Fingerprint: ");
                                    sb22.append(b122);
                                    logger2.a("DataCollector", sb22.toString());
                                    if (d10.length() != 0) {
                                    }
                                    if (map4 == null) {
                                    }
                                    if ((map5 == null ? map5.get("bssid") : null) != null) {
                                    }
                                    if (map7 != null) {
                                    }
                                    double max2 = Math.max(0.0d, d13);
                                    long currentTimeMillis32 = System.currentTimeMillis();
                                    Object obj182 = a11.get("manufacturer");
                                    if (!(obj182 instanceof String)) {
                                    }
                                    if (str2 != null) {
                                    }
                                    Object obj192 = a11.get("model");
                                    if (!(obj192 instanceof String)) {
                                    }
                                    if (str4 != null) {
                                    }
                                    Object obj202 = a11.get("brand");
                                    if (!(obj202 instanceof String)) {
                                    }
                                    if (str6 != null) {
                                    }
                                    Object obj212 = a12.get(PublisherMetadata.OS_VERSION);
                                    if (!(obj212 instanceof String)) {
                                    }
                                    if (str8 != null) {
                                    }
                                    Object obj222 = a12.get("sdk_int");
                                    if (!(obj222 instanceof Integer)) {
                                    }
                                    if (num == null) {
                                    }
                                    Object obj232 = a11.get("screen_width");
                                    if (!(obj232 instanceof Integer)) {
                                    }
                                    if (num2 == null) {
                                    }
                                    Object obj242 = a11.get("screen_height");
                                    if (!(obj242 instanceof Integer)) {
                                    }
                                    if (num3 == null) {
                                    }
                                    Object obj252 = a11.get("density");
                                    if (!(obj252 instanceof Float)) {
                                    }
                                    if (f10 == null) {
                                    }
                                    Object obj262 = a11.get("total_memory");
                                    if (!(obj262 instanceof Long)) {
                                    }
                                    if (l10 == null) {
                                    }
                                    Object obj272 = a11.get("total_storage");
                                    if (!(obj272 instanceof Long)) {
                                    }
                                    if (l11 == null) {
                                    }
                                    Object obj282 = a11.get("screen_refresh_rate");
                                    if (!(obj282 instanceof Float)) {
                                    }
                                    Object obj292 = a11.get("available_sensors");
                                    if (!(obj292 instanceof List)) {
                                    }
                                    Object obj302 = a11.get("system_features");
                                    if (!(obj302 instanceof List)) {
                                    }
                                    Object obj312 = a11.get("device_uptime_ms");
                                    if (!(obj312 instanceof Long)) {
                                    }
                                    Object obj322 = a11.get("is_dark_mode");
                                    if (!(obj322 instanceof Boolean)) {
                                    }
                                    Object obj332 = a11.get("camera_count");
                                    if (!(obj332 instanceof Integer)) {
                                    }
                                    Object obj342 = a11.get("system_features");
                                    if (!(obj342 instanceof List)) {
                                    }
                                    if (list3 == null) {
                                    }
                                    Object obj352 = a11.get("has_fingerprint");
                                    if (!(obj352 instanceof Boolean)) {
                                    }
                                    B0 b022 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
                                    Object obj362 = a13.get("is_rooted");
                                    if (!(obj362 instanceof Boolean)) {
                                    }
                                    if (bool5 == null) {
                                    }
                                    Object obj372 = a13.get("confidence");
                                    if (!(obj372 instanceof Double)) {
                                    }
                                    if (d14 == null) {
                                    }
                                    Object obj382 = a13.get("su_binary_paths");
                                    if (!(obj382 instanceof List)) {
                                    }
                                    Object obj392 = a13.get("test_keys_present");
                                    if (!(obj392 instanceof Boolean)) {
                                    }
                                    if (bool6 == null) {
                                    }
                                    Object obj402 = a13.get("bootloader");
                                    if (!(obj402 instanceof String)) {
                                    }
                                    Object obj412 = a13.get("build_tags");
                                    if (!(obj412 instanceof String)) {
                                    }
                                    Object obj422 = a13.get("build_type");
                                    if (!(obj422 instanceof String)) {
                                    }
                                    Object obj432 = a13.get("build_user");
                                    if (!(obj432 instanceof String)) {
                                    }
                                    Object obj442 = a13.get("build_host");
                                    if (!(obj442 instanceof String)) {
                                    }
                                    Object obj452 = a13.get("build_fingerprint");
                                    z0 z0Var2 = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj452 instanceof String) ? (String) obj452 : null);
                                    Map map92 = map8;
                                    Object obj462 = map92.get("developer_options_enabled");
                                    if (!(obj462 instanceof Boolean)) {
                                    }
                                    if (bool7 == null) {
                                    }
                                    Object obj472 = map92.get("adb_enabled");
                                    if (!(obj472 instanceof Boolean)) {
                                    }
                                    if (bool8 == null) {
                                    }
                                    Object obj482 = map92.get("is_vpn_active");
                                    if (!(obj482 instanceof Boolean)) {
                                    }
                                    if (bool9 == null) {
                                    }
                                    Object obj492 = map92.get("unknown_sources_enabled");
                                    if (!(obj492 instanceof Boolean)) {
                                    }
                                    if (bool10 == null) {
                                    }
                                    Object obj502 = map92.get("is_emulator");
                                    if (!(obj502 instanceof Boolean)) {
                                    }
                                    if (bool11 == null) {
                                    }
                                    Object obj512 = map92.get("emulator_confidence");
                                    if (!(obj512 instanceof Double)) {
                                    }
                                    if (d15 == null) {
                                    }
                                    Object obj522 = map92.get("frida_detected");
                                    if (!(obj522 instanceof Boolean)) {
                                    }
                                    if (bool12 == null) {
                                    }
                                    Object obj532 = map92.get("xposed_detected");
                                    if (!(obj532 instanceof Boolean)) {
                                    }
                                    if (bool13 == null) {
                                    }
                                    Object obj542 = map92.get("substrate_detected");
                                    if (!(obj542 instanceof Boolean)) {
                                    }
                                    if (bool14 == null) {
                                    }
                                    Object obj552 = map92.get("magisk_detected");
                                    if (!(obj552 instanceof Boolean)) {
                                    }
                                    if (bool15 == null) {
                                    }
                                    Object obj562 = map92.get("debugger_attached");
                                    if (!(obj562 instanceof Boolean)) {
                                    }
                                    if (bool16 == null) {
                                    }
                                    Object obj572 = map92.get("app_cloned");
                                    if (!(obj572 instanceof Boolean)) {
                                    }
                                    if (bool17 == null) {
                                    }
                                    Object obj582 = map92.get(obj);
                                    if (!(obj582 instanceof Boolean)) {
                                    }
                                    if (bool18 == null) {
                                    }
                                    Object obj592 = map92.get("suspicious_apps_installed");
                                    if (!(obj592 instanceof List)) {
                                    }
                                    Object obj602 = map92.get("signature_valid");
                                    if (!(obj602 instanceof Boolean)) {
                                    }
                                    boolean booleanValue152 = bool19 != null ? bool19.booleanValue() : true;
                                    Object obj612 = map92.get("threat_level");
                                    C2451k0 c2451k02 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue152, !(obj612 instanceof String) ? (String) obj612 : null);
                                    Object obj622 = a12.get("build_fingerprint");
                                    if (!(obj622 instanceof String)) {
                                    }
                                    Object obj632 = a12.get("build_id");
                                    if (!(obj632 instanceof String)) {
                                    }
                                    Object obj642 = a12.get("language");
                                    if (!(obj642 instanceof String)) {
                                    }
                                    Object obj652 = a12.get(AdRevenueScheme.COUNTRY);
                                    if (!(obj652 instanceof String)) {
                                    }
                                    Object obj662 = a12.get("app_install_time");
                                    if (!(obj662 instanceof Long)) {
                                    }
                                    Object obj672 = a12.get("app_update_time");
                                    if (!(obj672 instanceof Long)) {
                                    }
                                    Object obj682 = a12.get("days_since_install");
                                    x0 x0Var2 = new x0(str15, str16, str17, str18, l13, l14, !(obj682 instanceof Long) ? (Long) obj682 : null);
                                    Object obj692 = a12.get("timezone");
                                    if (!(obj692 instanceof String)) {
                                    }
                                    if (str19 != null) {
                                    }
                                    if (map3 == null) {
                                    }
                                    if (a10 == null) {
                                    }
                                    if (map4 == null) {
                                    }
                                    if (map5 == null) {
                                    }
                                    if (map7 == null) {
                                    }
                                    return new y0(b122, currentTimeMillis32, b022, z0Var2, c2451k02, x0Var2, str20, c2447i0, n10, f02, c2437d0, c2464r0, max2);
                                }
                            }
                            map5 = null;
                            u0Var = this.f26709m;
                            if (u0Var != null) {
                            }
                            map6 = null;
                            Object obj5102 = a11.get("manufacturer");
                            Object obj6102 = a11.get("model");
                            Object obj7102 = a11.get("brand");
                            Object obj8102 = a11.get("screen_width");
                            Object obj932 = a11.get("screen_height");
                            Object obj1022 = a11.get("density");
                            Object obj1122 = a11.get("screen_refresh_rate");
                            Object obj1222 = a11.get("total_memory");
                            Object obj1322 = a11.get("available_sensors");
                            if (obj1322 == null) {
                            }
                            Object obj1522 = a11.get("system_features");
                            map7 = map6;
                            String b1022 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj5102, obj6102, obj7102, obj8102, obj932, obj1022, obj1122, obj1222, obj14, obj1522 == null ? obj1522.toString() : null)), "|", null, null, 0, null, null, 62, null));
                            String b1122 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
                            arrayList = new ArrayList();
                            if (map5 != null) {
                            }
                            if (map4 == null) {
                            }
                            if (arrayList.isEmpty()) {
                            }
                            String b1222 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b1022, "s:" + b1122, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
                            long currentTimeMillis222 = System.currentTimeMillis() - currentTimeMillis;
                            Logger logger22 = Logger.f41582a;
                            logger22.a("DataCollector", "Data collection completed in " + currentTimeMillis222 + "ms");
                            StringBuilder sb222 = new StringBuilder("Fingerprint: ");
                            sb222.append(b1222);
                            logger22.a("DataCollector", sb222.toString());
                            if (d10.length() != 0) {
                            }
                            if (map4 == null) {
                            }
                            if ((map5 == null ? map5.get("bssid") : null) != null) {
                            }
                            if (map7 != null) {
                            }
                            double max22 = Math.max(0.0d, d13);
                            long currentTimeMillis322 = System.currentTimeMillis();
                            Object obj1822 = a11.get("manufacturer");
                            if (!(obj1822 instanceof String)) {
                            }
                            if (str2 != null) {
                            }
                            Object obj1922 = a11.get("model");
                            if (!(obj1922 instanceof String)) {
                            }
                            if (str4 != null) {
                            }
                            Object obj2022 = a11.get("brand");
                            if (!(obj2022 instanceof String)) {
                            }
                            if (str6 != null) {
                            }
                            Object obj2122 = a12.get(PublisherMetadata.OS_VERSION);
                            if (!(obj2122 instanceof String)) {
                            }
                            if (str8 != null) {
                            }
                            Object obj2222 = a12.get("sdk_int");
                            if (!(obj2222 instanceof Integer)) {
                            }
                            if (num == null) {
                            }
                            Object obj2322 = a11.get("screen_width");
                            if (!(obj2322 instanceof Integer)) {
                            }
                            if (num2 == null) {
                            }
                            Object obj2422 = a11.get("screen_height");
                            if (!(obj2422 instanceof Integer)) {
                            }
                            if (num3 == null) {
                            }
                            Object obj2522 = a11.get("density");
                            if (!(obj2522 instanceof Float)) {
                            }
                            if (f10 == null) {
                            }
                            Object obj2622 = a11.get("total_memory");
                            if (!(obj2622 instanceof Long)) {
                            }
                            if (l10 == null) {
                            }
                            Object obj2722 = a11.get("total_storage");
                            if (!(obj2722 instanceof Long)) {
                            }
                            if (l11 == null) {
                            }
                            Object obj2822 = a11.get("screen_refresh_rate");
                            if (!(obj2822 instanceof Float)) {
                            }
                            Object obj2922 = a11.get("available_sensors");
                            if (!(obj2922 instanceof List)) {
                            }
                            Object obj3022 = a11.get("system_features");
                            if (!(obj3022 instanceof List)) {
                            }
                            Object obj3122 = a11.get("device_uptime_ms");
                            if (!(obj3122 instanceof Long)) {
                            }
                            Object obj3222 = a11.get("is_dark_mode");
                            if (!(obj3222 instanceof Boolean)) {
                            }
                            Object obj3322 = a11.get("camera_count");
                            if (!(obj3322 instanceof Integer)) {
                            }
                            Object obj3422 = a11.get("system_features");
                            if (!(obj3422 instanceof List)) {
                            }
                            if (list3 == null) {
                            }
                            Object obj3522 = a11.get("has_fingerprint");
                            if (!(obj3522 instanceof Boolean)) {
                            }
                            B0 b0222 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
                            Object obj3622 = a13.get("is_rooted");
                            if (!(obj3622 instanceof Boolean)) {
                            }
                            if (bool5 == null) {
                            }
                            Object obj3722 = a13.get("confidence");
                            if (!(obj3722 instanceof Double)) {
                            }
                            if (d14 == null) {
                            }
                            Object obj3822 = a13.get("su_binary_paths");
                            if (!(obj3822 instanceof List)) {
                            }
                            Object obj3922 = a13.get("test_keys_present");
                            if (!(obj3922 instanceof Boolean)) {
                            }
                            if (bool6 == null) {
                            }
                            Object obj4022 = a13.get("bootloader");
                            if (!(obj4022 instanceof String)) {
                            }
                            Object obj4122 = a13.get("build_tags");
                            if (!(obj4122 instanceof String)) {
                            }
                            Object obj4222 = a13.get("build_type");
                            if (!(obj4222 instanceof String)) {
                            }
                            Object obj4322 = a13.get("build_user");
                            if (!(obj4322 instanceof String)) {
                            }
                            Object obj4422 = a13.get("build_host");
                            if (!(obj4422 instanceof String)) {
                            }
                            Object obj4522 = a13.get("build_fingerprint");
                            z0 z0Var22 = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj4522 instanceof String) ? (String) obj4522 : null);
                            Map map922 = map8;
                            Object obj4622 = map922.get("developer_options_enabled");
                            if (!(obj4622 instanceof Boolean)) {
                            }
                            if (bool7 == null) {
                            }
                            Object obj4722 = map922.get("adb_enabled");
                            if (!(obj4722 instanceof Boolean)) {
                            }
                            if (bool8 == null) {
                            }
                            Object obj4822 = map922.get("is_vpn_active");
                            if (!(obj4822 instanceof Boolean)) {
                            }
                            if (bool9 == null) {
                            }
                            Object obj4922 = map922.get("unknown_sources_enabled");
                            if (!(obj4922 instanceof Boolean)) {
                            }
                            if (bool10 == null) {
                            }
                            Object obj5022 = map922.get("is_emulator");
                            if (!(obj5022 instanceof Boolean)) {
                            }
                            if (bool11 == null) {
                            }
                            Object obj5122 = map922.get("emulator_confidence");
                            if (!(obj5122 instanceof Double)) {
                            }
                            if (d15 == null) {
                            }
                            Object obj5222 = map922.get("frida_detected");
                            if (!(obj5222 instanceof Boolean)) {
                            }
                            if (bool12 == null) {
                            }
                            Object obj5322 = map922.get("xposed_detected");
                            if (!(obj5322 instanceof Boolean)) {
                            }
                            if (bool13 == null) {
                            }
                            Object obj5422 = map922.get("substrate_detected");
                            if (!(obj5422 instanceof Boolean)) {
                            }
                            if (bool14 == null) {
                            }
                            Object obj5522 = map922.get("magisk_detected");
                            if (!(obj5522 instanceof Boolean)) {
                            }
                            if (bool15 == null) {
                            }
                            Object obj5622 = map922.get("debugger_attached");
                            if (!(obj5622 instanceof Boolean)) {
                            }
                            if (bool16 == null) {
                            }
                            Object obj5722 = map922.get("app_cloned");
                            if (!(obj5722 instanceof Boolean)) {
                            }
                            if (bool17 == null) {
                            }
                            Object obj5822 = map922.get(obj);
                            if (!(obj5822 instanceof Boolean)) {
                            }
                            if (bool18 == null) {
                            }
                            Object obj5922 = map922.get("suspicious_apps_installed");
                            if (!(obj5922 instanceof List)) {
                            }
                            Object obj6022 = map922.get("signature_valid");
                            if (!(obj6022 instanceof Boolean)) {
                            }
                            boolean booleanValue1522 = bool19 != null ? bool19.booleanValue() : true;
                            Object obj6122 = map922.get("threat_level");
                            C2451k0 c2451k022 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue1522, !(obj6122 instanceof String) ? (String) obj6122 : null);
                            Object obj6222 = a12.get("build_fingerprint");
                            if (!(obj6222 instanceof String)) {
                            }
                            Object obj6322 = a12.get("build_id");
                            if (!(obj6322 instanceof String)) {
                            }
                            Object obj6422 = a12.get("language");
                            if (!(obj6422 instanceof String)) {
                            }
                            Object obj6522 = a12.get(AdRevenueScheme.COUNTRY);
                            if (!(obj6522 instanceof String)) {
                            }
                            Object obj6622 = a12.get("app_install_time");
                            if (!(obj6622 instanceof Long)) {
                            }
                            Object obj6722 = a12.get("app_update_time");
                            if (!(obj6722 instanceof Long)) {
                            }
                            Object obj6822 = a12.get("days_since_install");
                            x0 x0Var22 = new x0(str15, str16, str17, str18, l13, l14, !(obj6822 instanceof Long) ? (Long) obj6822 : null);
                            Object obj6922 = a12.get("timezone");
                            if (!(obj6922 instanceof String)) {
                            }
                            if (str19 != null) {
                            }
                            if (map3 == null) {
                            }
                            if (a10 == null) {
                            }
                            if (map4 == null) {
                            }
                            if (map5 == null) {
                            }
                            if (map7 == null) {
                            }
                            return new y0(b1222, currentTimeMillis322, b0222, z0Var22, c2451k022, x0Var22, str20, c2447i0, n10, f02, c2437d0, c2464r0, max22);
                        }
                    } else {
                        map3 = map2;
                    }
                    map4 = null;
                    c2445h0 = this.f26708l;
                    if (c2445h0 != null) {
                    }
                    map5 = null;
                    u0Var = this.f26709m;
                    if (u0Var != null) {
                    }
                    map6 = null;
                    Object obj51022 = a11.get("manufacturer");
                    Object obj61022 = a11.get("model");
                    Object obj71022 = a11.get("brand");
                    Object obj81022 = a11.get("screen_width");
                    Object obj9322 = a11.get("screen_height");
                    Object obj10222 = a11.get("density");
                    Object obj11222 = a11.get("screen_refresh_rate");
                    Object obj12222 = a11.get("total_memory");
                    Object obj13222 = a11.get("available_sensors");
                    if (obj13222 == null) {
                    }
                    Object obj15222 = a11.get("system_features");
                    map7 = map6;
                    String b10222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj51022, obj61022, obj71022, obj81022, obj9322, obj10222, obj11222, obj12222, obj14, obj15222 == null ? obj15222.toString() : null)), "|", null, null, 0, null, null, 62, null));
                    String b11222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
                    arrayList = new ArrayList();
                    if (map5 != null) {
                    }
                    if (map4 == null) {
                    }
                    if (arrayList.isEmpty()) {
                    }
                    String b12222 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b10222, "s:" + b11222, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
                    long currentTimeMillis2222 = System.currentTimeMillis() - currentTimeMillis;
                    Logger logger222 = Logger.f41582a;
                    logger222.a("DataCollector", "Data collection completed in " + currentTimeMillis2222 + "ms");
                    StringBuilder sb2222 = new StringBuilder("Fingerprint: ");
                    sb2222.append(b12222);
                    logger222.a("DataCollector", sb2222.toString());
                    if (d10.length() != 0) {
                    }
                    if (map4 == null) {
                    }
                    if ((map5 == null ? map5.get("bssid") : null) != null) {
                    }
                    if (map7 != null) {
                    }
                    double max222 = Math.max(0.0d, d13);
                    long currentTimeMillis3222 = System.currentTimeMillis();
                    Object obj18222 = a11.get("manufacturer");
                    if (!(obj18222 instanceof String)) {
                    }
                    if (str2 != null) {
                    }
                    Object obj19222 = a11.get("model");
                    if (!(obj19222 instanceof String)) {
                    }
                    if (str4 != null) {
                    }
                    Object obj20222 = a11.get("brand");
                    if (!(obj20222 instanceof String)) {
                    }
                    if (str6 != null) {
                    }
                    Object obj21222 = a12.get(PublisherMetadata.OS_VERSION);
                    if (!(obj21222 instanceof String)) {
                    }
                    if (str8 != null) {
                    }
                    Object obj22222 = a12.get("sdk_int");
                    if (!(obj22222 instanceof Integer)) {
                    }
                    if (num == null) {
                    }
                    Object obj23222 = a11.get("screen_width");
                    if (!(obj23222 instanceof Integer)) {
                    }
                    if (num2 == null) {
                    }
                    Object obj24222 = a11.get("screen_height");
                    if (!(obj24222 instanceof Integer)) {
                    }
                    if (num3 == null) {
                    }
                    Object obj25222 = a11.get("density");
                    if (!(obj25222 instanceof Float)) {
                    }
                    if (f10 == null) {
                    }
                    Object obj26222 = a11.get("total_memory");
                    if (!(obj26222 instanceof Long)) {
                    }
                    if (l10 == null) {
                    }
                    Object obj27222 = a11.get("total_storage");
                    if (!(obj27222 instanceof Long)) {
                    }
                    if (l11 == null) {
                    }
                    Object obj28222 = a11.get("screen_refresh_rate");
                    if (!(obj28222 instanceof Float)) {
                    }
                    Object obj29222 = a11.get("available_sensors");
                    if (!(obj29222 instanceof List)) {
                    }
                    Object obj30222 = a11.get("system_features");
                    if (!(obj30222 instanceof List)) {
                    }
                    Object obj31222 = a11.get("device_uptime_ms");
                    if (!(obj31222 instanceof Long)) {
                    }
                    Object obj32222 = a11.get("is_dark_mode");
                    if (!(obj32222 instanceof Boolean)) {
                    }
                    Object obj33222 = a11.get("camera_count");
                    if (!(obj33222 instanceof Integer)) {
                    }
                    Object obj34222 = a11.get("system_features");
                    if (!(obj34222 instanceof List)) {
                    }
                    if (list3 == null) {
                    }
                    Object obj35222 = a11.get("has_fingerprint");
                    if (!(obj35222 instanceof Boolean)) {
                    }
                    B0 b02222 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
                    Object obj36222 = a13.get("is_rooted");
                    if (!(obj36222 instanceof Boolean)) {
                    }
                    if (bool5 == null) {
                    }
                    Object obj37222 = a13.get("confidence");
                    if (!(obj37222 instanceof Double)) {
                    }
                    if (d14 == null) {
                    }
                    Object obj38222 = a13.get("su_binary_paths");
                    if (!(obj38222 instanceof List)) {
                    }
                    Object obj39222 = a13.get("test_keys_present");
                    if (!(obj39222 instanceof Boolean)) {
                    }
                    if (bool6 == null) {
                    }
                    Object obj40222 = a13.get("bootloader");
                    if (!(obj40222 instanceof String)) {
                    }
                    Object obj41222 = a13.get("build_tags");
                    if (!(obj41222 instanceof String)) {
                    }
                    Object obj42222 = a13.get("build_type");
                    if (!(obj42222 instanceof String)) {
                    }
                    Object obj43222 = a13.get("build_user");
                    if (!(obj43222 instanceof String)) {
                    }
                    Object obj44222 = a13.get("build_host");
                    if (!(obj44222 instanceof String)) {
                    }
                    Object obj45222 = a13.get("build_fingerprint");
                    z0 z0Var222 = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj45222 instanceof String) ? (String) obj45222 : null);
                    Map map9222 = map8;
                    Object obj46222 = map9222.get("developer_options_enabled");
                    if (!(obj46222 instanceof Boolean)) {
                    }
                    if (bool7 == null) {
                    }
                    Object obj47222 = map9222.get("adb_enabled");
                    if (!(obj47222 instanceof Boolean)) {
                    }
                    if (bool8 == null) {
                    }
                    Object obj48222 = map9222.get("is_vpn_active");
                    if (!(obj48222 instanceof Boolean)) {
                    }
                    if (bool9 == null) {
                    }
                    Object obj49222 = map9222.get("unknown_sources_enabled");
                    if (!(obj49222 instanceof Boolean)) {
                    }
                    if (bool10 == null) {
                    }
                    Object obj50222 = map9222.get("is_emulator");
                    if (!(obj50222 instanceof Boolean)) {
                    }
                    if (bool11 == null) {
                    }
                    Object obj51222 = map9222.get("emulator_confidence");
                    if (!(obj51222 instanceof Double)) {
                    }
                    if (d15 == null) {
                    }
                    Object obj52222 = map9222.get("frida_detected");
                    if (!(obj52222 instanceof Boolean)) {
                    }
                    if (bool12 == null) {
                    }
                    Object obj53222 = map9222.get("xposed_detected");
                    if (!(obj53222 instanceof Boolean)) {
                    }
                    if (bool13 == null) {
                    }
                    Object obj54222 = map9222.get("substrate_detected");
                    if (!(obj54222 instanceof Boolean)) {
                    }
                    if (bool14 == null) {
                    }
                    Object obj55222 = map9222.get("magisk_detected");
                    if (!(obj55222 instanceof Boolean)) {
                    }
                    if (bool15 == null) {
                    }
                    Object obj56222 = map9222.get("debugger_attached");
                    if (!(obj56222 instanceof Boolean)) {
                    }
                    if (bool16 == null) {
                    }
                    Object obj57222 = map9222.get("app_cloned");
                    if (!(obj57222 instanceof Boolean)) {
                    }
                    if (bool17 == null) {
                    }
                    Object obj58222 = map9222.get(obj);
                    if (!(obj58222 instanceof Boolean)) {
                    }
                    if (bool18 == null) {
                    }
                    Object obj59222 = map9222.get("suspicious_apps_installed");
                    if (!(obj59222 instanceof List)) {
                    }
                    Object obj60222 = map9222.get("signature_valid");
                    if (!(obj60222 instanceof Boolean)) {
                    }
                    boolean booleanValue15222 = bool19 != null ? bool19.booleanValue() : true;
                    Object obj61222 = map9222.get("threat_level");
                    C2451k0 c2451k0222 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue15222, !(obj61222 instanceof String) ? (String) obj61222 : null);
                    Object obj62222 = a12.get("build_fingerprint");
                    if (!(obj62222 instanceof String)) {
                    }
                    Object obj63222 = a12.get("build_id");
                    if (!(obj63222 instanceof String)) {
                    }
                    Object obj64222 = a12.get("language");
                    if (!(obj64222 instanceof String)) {
                    }
                    Object obj65222 = a12.get(AdRevenueScheme.COUNTRY);
                    if (!(obj65222 instanceof String)) {
                    }
                    Object obj66222 = a12.get("app_install_time");
                    if (!(obj66222 instanceof Long)) {
                    }
                    Object obj67222 = a12.get("app_update_time");
                    if (!(obj67222 instanceof Long)) {
                    }
                    Object obj68222 = a12.get("days_since_install");
                    x0 x0Var222 = new x0(str15, str16, str17, str18, l13, l14, !(obj68222 instanceof Long) ? (Long) obj68222 : null);
                    Object obj69222 = a12.get("timezone");
                    if (!(obj69222 instanceof String)) {
                    }
                    if (str19 != null) {
                    }
                    if (map3 == null) {
                    }
                    if (a10 == null) {
                    }
                    if (map4 == null) {
                    }
                    if (map5 == null) {
                    }
                    if (map7 == null) {
                    }
                    return new y0(b12222, currentTimeMillis3222, b02222, z0Var222, c2451k0222, x0Var222, str20, c2447i0, n10, f02, c2437d0, c2464r0, max222);
                }
                z10 = true;
                Pair pair102 = TuplesKt.to("level", Float.valueOf(intExtra));
                map = null;
                map2 = MapsKt.mapOf(pair102, TuplesKt.to("is_charging", Boolean.valueOf(z10)), TuplesKt.to("temperature", null));
                q10 = this.f26705i;
                Q q112 = q10;
                if (q10 == null) {
                }
                a10 = q112.a();
                y10 = this.f26706j;
                Y y112 = y10;
                if (y10 == null) {
                }
                d10 = y112.d();
                Map mutableMap2 = MapsKt.toMutableMap(a14);
                mutableMap2.putAll(mapOf);
                k02 = this.f26707k;
                if (k02 != null) {
                }
                map4 = null;
                c2445h0 = this.f26708l;
                if (c2445h0 != null) {
                }
                map5 = null;
                u0Var = this.f26709m;
                if (u0Var != null) {
                }
                map6 = null;
                Object obj510222 = a11.get("manufacturer");
                Object obj610222 = a11.get("model");
                Object obj710222 = a11.get("brand");
                Object obj810222 = a11.get("screen_width");
                Object obj93222 = a11.get("screen_height");
                Object obj102222 = a11.get("density");
                Object obj112222 = a11.get("screen_refresh_rate");
                Object obj122222 = a11.get("total_memory");
                Object obj132222 = a11.get("available_sensors");
                if (obj132222 == null) {
                }
                Object obj152222 = a11.get("system_features");
                map7 = map6;
                String b102222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj510222, obj610222, obj710222, obj810222, obj93222, obj102222, obj112222, obj122222, obj14, obj152222 == null ? obj152222.toString() : null)), "|", null, null, 0, null, null, 62, null));
                String b112222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
                arrayList = new ArrayList();
                if (map5 != null) {
                }
                if (map4 == null) {
                }
                if (arrayList.isEmpty()) {
                }
                String b122222 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b102222, "s:" + b112222, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
                long currentTimeMillis22222 = System.currentTimeMillis() - currentTimeMillis;
                Logger logger2222 = Logger.f41582a;
                logger2222.a("DataCollector", "Data collection completed in " + currentTimeMillis22222 + "ms");
                StringBuilder sb22222 = new StringBuilder("Fingerprint: ");
                sb22222.append(b122222);
                logger2222.a("DataCollector", sb22222.toString());
                if (d10.length() != 0) {
                }
                if (map4 == null) {
                }
                if ((map5 == null ? map5.get("bssid") : null) != null) {
                }
                if (map7 != null) {
                }
                double max2222 = Math.max(0.0d, d13);
                long currentTimeMillis32222 = System.currentTimeMillis();
                Object obj182222 = a11.get("manufacturer");
                if (!(obj182222 instanceof String)) {
                }
                if (str2 != null) {
                }
                Object obj192222 = a11.get("model");
                if (!(obj192222 instanceof String)) {
                }
                if (str4 != null) {
                }
                Object obj202222 = a11.get("brand");
                if (!(obj202222 instanceof String)) {
                }
                if (str6 != null) {
                }
                Object obj212222 = a12.get(PublisherMetadata.OS_VERSION);
                if (!(obj212222 instanceof String)) {
                }
                if (str8 != null) {
                }
                Object obj222222 = a12.get("sdk_int");
                if (!(obj222222 instanceof Integer)) {
                }
                if (num == null) {
                }
                Object obj232222 = a11.get("screen_width");
                if (!(obj232222 instanceof Integer)) {
                }
                if (num2 == null) {
                }
                Object obj242222 = a11.get("screen_height");
                if (!(obj242222 instanceof Integer)) {
                }
                if (num3 == null) {
                }
                Object obj252222 = a11.get("density");
                if (!(obj252222 instanceof Float)) {
                }
                if (f10 == null) {
                }
                Object obj262222 = a11.get("total_memory");
                if (!(obj262222 instanceof Long)) {
                }
                if (l10 == null) {
                }
                Object obj272222 = a11.get("total_storage");
                if (!(obj272222 instanceof Long)) {
                }
                if (l11 == null) {
                }
                Object obj282222 = a11.get("screen_refresh_rate");
                if (!(obj282222 instanceof Float)) {
                }
                Object obj292222 = a11.get("available_sensors");
                if (!(obj292222 instanceof List)) {
                }
                Object obj302222 = a11.get("system_features");
                if (!(obj302222 instanceof List)) {
                }
                Object obj312222 = a11.get("device_uptime_ms");
                if (!(obj312222 instanceof Long)) {
                }
                Object obj322222 = a11.get("is_dark_mode");
                if (!(obj322222 instanceof Boolean)) {
                }
                Object obj332222 = a11.get("camera_count");
                if (!(obj332222 instanceof Integer)) {
                }
                Object obj342222 = a11.get("system_features");
                if (!(obj342222 instanceof List)) {
                }
                if (list3 == null) {
                }
                Object obj352222 = a11.get("has_fingerprint");
                if (!(obj352222 instanceof Boolean)) {
                }
                B0 b022222 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
                Object obj362222 = a13.get("is_rooted");
                if (!(obj362222 instanceof Boolean)) {
                }
                if (bool5 == null) {
                }
                Object obj372222 = a13.get("confidence");
                if (!(obj372222 instanceof Double)) {
                }
                if (d14 == null) {
                }
                Object obj382222 = a13.get("su_binary_paths");
                if (!(obj382222 instanceof List)) {
                }
                Object obj392222 = a13.get("test_keys_present");
                if (!(obj392222 instanceof Boolean)) {
                }
                if (bool6 == null) {
                }
                Object obj402222 = a13.get("bootloader");
                if (!(obj402222 instanceof String)) {
                }
                Object obj412222 = a13.get("build_tags");
                if (!(obj412222 instanceof String)) {
                }
                Object obj422222 = a13.get("build_type");
                if (!(obj422222 instanceof String)) {
                }
                Object obj432222 = a13.get("build_user");
                if (!(obj432222 instanceof String)) {
                }
                Object obj442222 = a13.get("build_host");
                if (!(obj442222 instanceof String)) {
                }
                Object obj452222 = a13.get("build_fingerprint");
                z0 z0Var2222 = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj452222 instanceof String) ? (String) obj452222 : null);
                Map map92222 = map8;
                Object obj462222 = map92222.get("developer_options_enabled");
                if (!(obj462222 instanceof Boolean)) {
                }
                if (bool7 == null) {
                }
                Object obj472222 = map92222.get("adb_enabled");
                if (!(obj472222 instanceof Boolean)) {
                }
                if (bool8 == null) {
                }
                Object obj482222 = map92222.get("is_vpn_active");
                if (!(obj482222 instanceof Boolean)) {
                }
                if (bool9 == null) {
                }
                Object obj492222 = map92222.get("unknown_sources_enabled");
                if (!(obj492222 instanceof Boolean)) {
                }
                if (bool10 == null) {
                }
                Object obj502222 = map92222.get("is_emulator");
                if (!(obj502222 instanceof Boolean)) {
                }
                if (bool11 == null) {
                }
                Object obj512222 = map92222.get("emulator_confidence");
                if (!(obj512222 instanceof Double)) {
                }
                if (d15 == null) {
                }
                Object obj522222 = map92222.get("frida_detected");
                if (!(obj522222 instanceof Boolean)) {
                }
                if (bool12 == null) {
                }
                Object obj532222 = map92222.get("xposed_detected");
                if (!(obj532222 instanceof Boolean)) {
                }
                if (bool13 == null) {
                }
                Object obj542222 = map92222.get("substrate_detected");
                if (!(obj542222 instanceof Boolean)) {
                }
                if (bool14 == null) {
                }
                Object obj552222 = map92222.get("magisk_detected");
                if (!(obj552222 instanceof Boolean)) {
                }
                if (bool15 == null) {
                }
                Object obj562222 = map92222.get("debugger_attached");
                if (!(obj562222 instanceof Boolean)) {
                }
                if (bool16 == null) {
                }
                Object obj572222 = map92222.get("app_cloned");
                if (!(obj572222 instanceof Boolean)) {
                }
                if (bool17 == null) {
                }
                Object obj582222 = map92222.get(obj);
                if (!(obj582222 instanceof Boolean)) {
                }
                if (bool18 == null) {
                }
                Object obj592222 = map92222.get("suspicious_apps_installed");
                if (!(obj592222 instanceof List)) {
                }
                Object obj602222 = map92222.get("signature_valid");
                if (!(obj602222 instanceof Boolean)) {
                }
                boolean booleanValue152222 = bool19 != null ? bool19.booleanValue() : true;
                Object obj612222 = map92222.get("threat_level");
                C2451k0 c2451k02222 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue152222, !(obj612222 instanceof String) ? (String) obj612222 : null);
                Object obj622222 = a12.get("build_fingerprint");
                if (!(obj622222 instanceof String)) {
                }
                Object obj632222 = a12.get("build_id");
                if (!(obj632222 instanceof String)) {
                }
                Object obj642222 = a12.get("language");
                if (!(obj642222 instanceof String)) {
                }
                Object obj652222 = a12.get(AdRevenueScheme.COUNTRY);
                if (!(obj652222 instanceof String)) {
                }
                Object obj662222 = a12.get("app_install_time");
                if (!(obj662222 instanceof Long)) {
                }
                Object obj672222 = a12.get("app_update_time");
                if (!(obj672222 instanceof Long)) {
                }
                Object obj682222 = a12.get("days_since_install");
                x0 x0Var2222 = new x0(str15, str16, str17, str18, l13, l14, !(obj682222 instanceof Long) ? (Long) obj682222 : null);
                Object obj692222 = a12.get("timezone");
                if (!(obj692222 instanceof String)) {
                }
                if (str19 != null) {
                }
                if (map3 == null) {
                }
                if (a10 == null) {
                }
                if (map4 == null) {
                }
                if (map5 == null) {
                }
                if (map7 == null) {
                }
                return new y0(b122222, currentTimeMillis32222, b022222, z0Var2222, c2451k02222, x0Var2222, str20, c2447i0, n10, f02, c2437d0, c2464r0, max2222);
            }
        }
        obj = "rooted_advanced";
        map = null;
        map2 = map;
        q10 = this.f26705i;
        Q q1122 = q10;
        if (q10 == null) {
        }
        a10 = q1122.a();
        y10 = this.f26706j;
        Y y1122 = y10;
        if (y10 == null) {
        }
        d10 = y1122.d();
        Map mutableMap22 = MapsKt.toMutableMap(a14);
        mutableMap22.putAll(mapOf);
        k02 = this.f26707k;
        if (k02 != null) {
        }
        map4 = null;
        c2445h0 = this.f26708l;
        if (c2445h0 != null) {
        }
        map5 = null;
        u0Var = this.f26709m;
        if (u0Var != null) {
        }
        map6 = null;
        Object obj5102222 = a11.get("manufacturer");
        Object obj6102222 = a11.get("model");
        Object obj7102222 = a11.get("brand");
        Object obj8102222 = a11.get("screen_width");
        Object obj932222 = a11.get("screen_height");
        Object obj1022222 = a11.get("density");
        Object obj1122222 = a11.get("screen_refresh_rate");
        Object obj1222222 = a11.get("total_memory");
        Object obj1322222 = a11.get("available_sensors");
        if (obj1322222 == null) {
        }
        Object obj1522222 = a11.get("system_features");
        map7 = map6;
        String b1022222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(obj5102222, obj6102222, obj7102222, obj8102222, obj932222, obj1022222, obj1122222, obj1222222, obj14, obj1522222 == null ? obj1522222.toString() : null)), "|", null, null, 0, null, null, 62, null));
        String b1122222 = b(CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(CollectionsKt.listOf(a12.get("android_id"), a12.get("build_fingerprint"), a12.get("sdk_int"), a12.get("timezone"), a12.get("language"))), "|", null, null, 0, null, null, 62, null));
        arrayList = new ArrayList();
        if (map5 != null) {
        }
        if (map4 == null) {
        }
        if (arrayList.isEmpty()) {
        }
        String b1222222 = b(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"p:" + d10, "h:" + b1022222, "s:" + b1122222, "n:" + (arrayList.isEmpty() ? b(CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null)) : "")}), "|", null, null, 0, null, null, 62, null));
        long currentTimeMillis222222 = System.currentTimeMillis() - currentTimeMillis;
        Logger logger22222 = Logger.f41582a;
        logger22222.a("DataCollector", "Data collection completed in " + currentTimeMillis222222 + "ms");
        StringBuilder sb222222 = new StringBuilder("Fingerprint: ");
        sb222222.append(b1222222);
        logger22222.a("DataCollector", sb222222.toString());
        if (d10.length() != 0) {
        }
        if (map4 == null) {
        }
        if ((map5 == null ? map5.get("bssid") : null) != null) {
        }
        if (map7 != null) {
        }
        double max22222 = Math.max(0.0d, d13);
        long currentTimeMillis322222 = System.currentTimeMillis();
        Object obj1822222 = a11.get("manufacturer");
        if (!(obj1822222 instanceof String)) {
        }
        if (str2 != null) {
        }
        Object obj1922222 = a11.get("model");
        if (!(obj1922222 instanceof String)) {
        }
        if (str4 != null) {
        }
        Object obj2022222 = a11.get("brand");
        if (!(obj2022222 instanceof String)) {
        }
        if (str6 != null) {
        }
        Object obj2122222 = a12.get(PublisherMetadata.OS_VERSION);
        if (!(obj2122222 instanceof String)) {
        }
        if (str8 != null) {
        }
        Object obj2222222 = a12.get("sdk_int");
        if (!(obj2222222 instanceof Integer)) {
        }
        if (num == null) {
        }
        Object obj2322222 = a11.get("screen_width");
        if (!(obj2322222 instanceof Integer)) {
        }
        if (num2 == null) {
        }
        Object obj2422222 = a11.get("screen_height");
        if (!(obj2422222 instanceof Integer)) {
        }
        if (num3 == null) {
        }
        Object obj2522222 = a11.get("density");
        if (!(obj2522222 instanceof Float)) {
        }
        if (f10 == null) {
        }
        Object obj2622222 = a11.get("total_memory");
        if (!(obj2622222 instanceof Long)) {
        }
        if (l10 == null) {
        }
        Object obj2722222 = a11.get("total_storage");
        if (!(obj2722222 instanceof Long)) {
        }
        if (l11 == null) {
        }
        Object obj2822222 = a11.get("screen_refresh_rate");
        if (!(obj2822222 instanceof Float)) {
        }
        Object obj2922222 = a11.get("available_sensors");
        if (!(obj2922222 instanceof List)) {
        }
        Object obj3022222 = a11.get("system_features");
        if (!(obj3022222 instanceof List)) {
        }
        Object obj3122222 = a11.get("device_uptime_ms");
        if (!(obj3122222 instanceof Long)) {
        }
        Object obj3222222 = a11.get("is_dark_mode");
        if (!(obj3222222 instanceof Boolean)) {
        }
        Object obj3322222 = a11.get("camera_count");
        if (!(obj3322222 instanceof Integer)) {
        }
        Object obj3422222 = a11.get("system_features");
        if (!(obj3422222 instanceof List)) {
        }
        if (list3 == null) {
        }
        Object obj3522222 = a11.get("has_fingerprint");
        if (!(obj3522222 instanceof Boolean)) {
        }
        B0 b0222222 = new B0(str3, str5, str7, str9, intValue, intValue2, intValue3, floatValue, f11, longValue, longValue2, list, list2, l12, bool3, num4, contains, bool4 == null ? bool4.booleanValue() : false);
        Object obj3622222 = a13.get("is_rooted");
        if (!(obj3622222 instanceof Boolean)) {
        }
        if (bool5 == null) {
        }
        Object obj3722222 = a13.get("confidence");
        if (!(obj3722222 instanceof Double)) {
        }
        if (d14 == null) {
        }
        Object obj3822222 = a13.get("su_binary_paths");
        if (!(obj3822222 instanceof List)) {
        }
        Object obj3922222 = a13.get("test_keys_present");
        if (!(obj3922222 instanceof Boolean)) {
        }
        if (bool6 == null) {
        }
        Object obj4022222 = a13.get("bootloader");
        if (!(obj4022222 instanceof String)) {
        }
        Object obj4122222 = a13.get("build_tags");
        if (!(obj4122222 instanceof String)) {
        }
        Object obj4222222 = a13.get("build_type");
        if (!(obj4222222 instanceof String)) {
        }
        Object obj4322222 = a13.get("build_user");
        if (!(obj4322222 instanceof String)) {
        }
        Object obj4422222 = a13.get("build_host");
        if (!(obj4422222 instanceof String)) {
        }
        Object obj4522222 = a13.get("build_fingerprint");
        z0 z0Var22222 = new z0(booleanValue, doubleValue, list4, booleanValue2, str10, str11, str12, str13, str14, !(obj4522222 instanceof String) ? (String) obj4522222 : null);
        Map map922222 = map8;
        Object obj4622222 = map922222.get("developer_options_enabled");
        if (!(obj4622222 instanceof Boolean)) {
        }
        if (bool7 == null) {
        }
        Object obj4722222 = map922222.get("adb_enabled");
        if (!(obj4722222 instanceof Boolean)) {
        }
        if (bool8 == null) {
        }
        Object obj4822222 = map922222.get("is_vpn_active");
        if (!(obj4822222 instanceof Boolean)) {
        }
        if (bool9 == null) {
        }
        Object obj4922222 = map922222.get("unknown_sources_enabled");
        if (!(obj4922222 instanceof Boolean)) {
        }
        if (bool10 == null) {
        }
        Object obj5022222 = map922222.get("is_emulator");
        if (!(obj5022222 instanceof Boolean)) {
        }
        if (bool11 == null) {
        }
        Object obj5122222 = map922222.get("emulator_confidence");
        if (!(obj5122222 instanceof Double)) {
        }
        if (d15 == null) {
        }
        Object obj5222222 = map922222.get("frida_detected");
        if (!(obj5222222 instanceof Boolean)) {
        }
        if (bool12 == null) {
        }
        Object obj5322222 = map922222.get("xposed_detected");
        if (!(obj5322222 instanceof Boolean)) {
        }
        if (bool13 == null) {
        }
        Object obj5422222 = map922222.get("substrate_detected");
        if (!(obj5422222 instanceof Boolean)) {
        }
        if (bool14 == null) {
        }
        Object obj5522222 = map922222.get("magisk_detected");
        if (!(obj5522222 instanceof Boolean)) {
        }
        if (bool15 == null) {
        }
        Object obj5622222 = map922222.get("debugger_attached");
        if (!(obj5622222 instanceof Boolean)) {
        }
        if (bool16 == null) {
        }
        Object obj5722222 = map922222.get("app_cloned");
        if (!(obj5722222 instanceof Boolean)) {
        }
        if (bool17 == null) {
        }
        Object obj5822222 = map922222.get(obj);
        if (!(obj5822222 instanceof Boolean)) {
        }
        if (bool18 == null) {
        }
        Object obj5922222 = map922222.get("suspicious_apps_installed");
        if (!(obj5922222 instanceof List)) {
        }
        Object obj6022222 = map922222.get("signature_valid");
        if (!(obj6022222 instanceof Boolean)) {
        }
        boolean booleanValue1522222 = bool19 != null ? bool19.booleanValue() : true;
        Object obj6122222 = map922222.get("threat_level");
        C2451k0 c2451k022222 = new C2451k0(booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, doubleValue2, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue12, booleanValue13, booleanValue14, list5, booleanValue1522222, !(obj6122222 instanceof String) ? (String) obj6122222 : null);
        Object obj6222222 = a12.get("build_fingerprint");
        if (!(obj6222222 instanceof String)) {
        }
        Object obj6322222 = a12.get("build_id");
        if (!(obj6322222 instanceof String)) {
        }
        Object obj6422222 = a12.get("language");
        if (!(obj6422222 instanceof String)) {
        }
        Object obj6522222 = a12.get(AdRevenueScheme.COUNTRY);
        if (!(obj6522222 instanceof String)) {
        }
        Object obj6622222 = a12.get("app_install_time");
        if (!(obj6622222 instanceof Long)) {
        }
        Object obj6722222 = a12.get("app_update_time");
        if (!(obj6722222 instanceof Long)) {
        }
        Object obj6822222 = a12.get("days_since_install");
        x0 x0Var22222 = new x0(str15, str16, str17, str18, l13, l14, !(obj6822222 instanceof Long) ? (Long) obj6822222 : null);
        Object obj6922222 = a12.get("timezone");
        if (!(obj6922222 instanceof String)) {
        }
        if (str19 != null) {
        }
        if (map3 == null) {
        }
        if (a10 == null) {
        }
        if (map4 == null) {
        }
        if (map5 == null) {
        }
        if (map7 == null) {
        }
        return new y0(b1222222, currentTimeMillis322222, b0222222, z0Var22222, c2451k022222, x0Var22222, str20, c2447i0, n10, f02, c2437d0, c2464r0, max22222);
    }

    public final void c(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f26698b = configuration;
        Context context = this.f26697a;
        Configuration configuration2 = null;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration = null;
        }
        this.f26699c = new E0(context, configuration);
        Context context2 = this.f26697a;
        Configuration configuration3 = this.f26698b;
        if (configuration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration3 = null;
        }
        this.f26700d = new P0(context2, configuration3);
        this.f26701e = new C0(this.f26697a);
        this.f26702f = new C2459o0(this.f26697a);
        this.f26703g = new M0(this.f26697a);
        this.f26704h = new C2453l0(this.f26697a);
        this.f26705i = new Q(this.f26697a);
        this.f26706j = new Y(this.f26697a);
        Configuration configuration4 = this.f26698b;
        if (configuration4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration4 = null;
        }
        if (configuration4.getCollectLocation()) {
            this.f26707k = new K0(this.f26697a);
        }
        Configuration configuration5 = this.f26698b;
        if (configuration5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration5 = null;
        }
        if (configuration5.getCollectWifiInfo()) {
            this.f26708l = new C2445h0(this.f26697a);
        }
        Configuration configuration6 = this.f26698b;
        if (configuration6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration6 = null;
        }
        if (configuration6.getCollectSimCardInfo()) {
            this.f26709m = new u0(this.f26697a);
        }
        Logger logger = Logger.f41582a;
        StringBuilder sb2 = new StringBuilder("DataCollector initialized with config: ");
        ArrayList arrayList = new ArrayList();
        Configuration configuration7 = this.f26698b;
        if (configuration7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration7 = null;
        }
        if (configuration7.getCollectLocation()) {
            arrayList.add("location");
        }
        Configuration configuration8 = this.f26698b;
        if (configuration8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration8 = null;
        }
        if (configuration8.getCollectWifiInfo()) {
            arrayList.add("wifi");
        }
        Configuration configuration9 = this.f26698b;
        if (configuration9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration9 = null;
        }
        if (configuration9.getCollectSimCardInfo()) {
            arrayList.add("simcard");
        }
        Configuration configuration10 = this.f26698b;
        if (configuration10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            configuration10 = null;
        }
        if (configuration10.getDetectVPN()) {
            arrayList.add("vpn-detection");
        }
        Configuration configuration11 = this.f26698b;
        if (configuration11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        } else {
            configuration2 = configuration11;
        }
        if (configuration2.getDetectEmulator()) {
            arrayList.add("emulator-detection");
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null));
        logger.d("DataCollector", sb2.toString());
    }
}
