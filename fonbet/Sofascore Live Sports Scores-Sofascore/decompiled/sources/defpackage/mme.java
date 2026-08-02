package defpackage;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.U3;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.GenderTypeConverter;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.network.response.UserRegionResponse;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.chat.fragment.RiskyChatsDialog;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.edit.ProfileEditActivity;
import com.sofascore.results.ranking.RankingFragment;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mme implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mme(CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData, ome omeVar) {
        this.a = 1;
        this.b = careerStatsFilterData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0.b(r5) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        tdg tdgVar = (tdg) this.b;
        String str = (String) obj;
        str.getClass();
        try {
            veg vegVar = tdgVar.r;
            if (vegVar != null) {
            }
        } catch (Exception unused) {
        }
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new gje(tdgVar, str, null, 23), 3);
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08fc A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0952 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x09b5 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x09fe A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a4e A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a75 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0ab8 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0afa A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0b26 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0b14 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0adc A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0acc A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0aa1 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0a91 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a2d A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a17 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x09f4 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0993 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0977 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0948 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08ce A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08bd A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08b4 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08a6 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0897 A[Catch: all -> 0x081d, TryCatch #2 {all -> 0x081d, blocks: (B:212:0x0621, B:213:0x06fc, B:215:0x0702, B:217:0x0719, B:219:0x071f, B:221:0x0725, B:223:0x072b, B:225:0x0731, B:227:0x0737, B:229:0x073d, B:231:0x0743, B:233:0x0749, B:235:0x0751, B:237:0x075b, B:239:0x0765, B:241:0x076f, B:243:0x0779, B:245:0x0783, B:247:0x078d, B:249:0x0797, B:251:0x07a1, B:253:0x07ab, B:255:0x07b5, B:257:0x07bf, B:259:0x07c9, B:261:0x07d3, B:263:0x07dd, B:266:0x0876, B:269:0x089d, B:272:0x08ac, B:277:0x08c3, B:280:0x08db, B:283:0x08e7, B:287:0x08f6, B:289:0x08fc, B:291:0x0904, B:293:0x090a, B:296:0x093b, B:299:0x094c, B:301:0x0952, B:305:0x09a6, B:307:0x09af, B:309:0x09b5, B:311:0x09bd, B:313:0x09c5, B:316:0x09e7, B:319:0x09f8, B:321:0x09fe, B:325:0x0a40, B:327:0x0a48, B:329:0x0a4e, B:332:0x0a5e, B:334:0x0a6f, B:336:0x0a75, B:339:0x0a89, B:342:0x0a95, B:346:0x0aaa, B:348:0x0ab2, B:350:0x0ab8, B:354:0x0aed, B:356:0x0af4, B:358:0x0afa, B:361:0x0b0c, B:364:0x0b18, B:367:0x0b2e, B:377:0x0b26, B:378:0x0b14, B:381:0x0ac4, B:384:0x0ad0, B:387:0x0ae0, B:388:0x0adc, B:389:0x0acc, B:390:0x0aa1, B:391:0x0a91, B:396:0x0a0d, B:399:0x0a1f, B:402:0x0a35, B:403:0x0a2d, B:404:0x0a17, B:405:0x09f4, B:410:0x0967, B:413:0x0985, B:416:0x099b, B:417:0x0993, B:418:0x0977, B:419:0x0948, B:425:0x08ce, B:426:0x08bd, B:427:0x08b4, B:428:0x08a6, B:429:0x0897), top: B:211:0x0621 }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List c;
        nlg nlgVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Team team;
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
        sz8 sz8Var;
        int i28;
        int i29;
        int i30;
        FieldTranslations fieldTranslations;
        String F0;
        int i31;
        int i32;
        Integer valueOf;
        int i33;
        int i34;
        SubTeam subTeam;
        int i35;
        int i36;
        int i37;
        SubTeam subTeam2;
        int i38;
        int i39;
        Sport sport;
        Country country;
        FieldTranslations fieldTranslations2;
        String F02;
        String F03;
        String F04;
        FieldTranslations fieldTranslations3;
        String F05;
        String F06;
        FieldTranslations fieldTranslations4;
        boolean z;
        Object obj2;
        String sb;
        int i40 = 3;
        int i41 = 9;
        boolean z2 = true;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                i2a.E((kse) this.b, ((Integer) obj).intValue());
                return Unit.a;
            case 1:
                CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData = (CareerStatsFilterModal.CareerStatsFilterData) this.b;
                List list = (List) obj;
                list.getClass();
                Team team2 = careerStatsFilterData.a;
                return (team2 == null || (c = a.c(Integer.valueOf(team2.getId()))) == null) ? ome.l(10, list) : c;
            case 2:
                sz8 sz8Var2 = ((aoe) this.b).d;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM players ORDER BY team_name, name");
                try {
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "name");
                    int r3 = w1a.r(V0, "userCount");
                    int r4 = w1a.r(V0, "team_id");
                    int r5 = w1a.r(V0, "team_name");
                    int r6 = w1a.r(V0, "team_slug");
                    int r7 = w1a.r(V0, "team_userCount");
                    int r8 = w1a.r(V0, "team_type");
                    int r9 = w1a.r(V0, "team_nameCode");
                    int r10 = w1a.r(V0, "team_shortName");
                    int r11 = w1a.r(V0, "team_gender");
                    int r12 = w1a.r(V0, "team_ranking");
                    int r13 = w1a.r(V0, "team_disabled");
                    int r14 = w1a.r(V0, "team_national");
                    sz8 sz8Var3 = sz8Var2;
                    int r15 = w1a.r(V0, "team_sub_team_one_id");
                    int r16 = w1a.r(V0, "team_sub_team_one_name");
                    int r17 = w1a.r(V0, "team_sub_team_one_nameTranslation");
                    int r18 = w1a.r(V0, "team_sub_team_one_shortNameTranslation");
                    int r19 = w1a.r(V0, "team_sub_team_two_id");
                    int r20 = w1a.r(V0, "team_sub_team_two_name");
                    int r21 = w1a.r(V0, "team_sub_team_two_nameTranslation");
                    int r22 = w1a.r(V0, "team_sub_team_two_shortNameTranslation");
                    int r23 = w1a.r(V0, "team_sport_id");
                    int r24 = w1a.r(V0, "team_sport_slug");
                    int r25 = w1a.r(V0, "team_country_name");
                    int r26 = w1a.r(V0, "team_country_alpha2");
                    int r27 = w1a.r(V0, "team_nameTranslation");
                    int r28 = w1a.r(V0, "team_shortNameTranslation");
                    int r29 = w1a.r(V0, "nameTranslation");
                    int r30 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        int i42 = r13;
                        int i43 = r14;
                        int i44 = (int) V0.getLong(r);
                        String F07 = V0.F0(r2);
                        long j = V0.getLong(r3);
                        try {
                            if (V0.isNull(r4) && V0.isNull(r5) && V0.isNull(r6) && V0.isNull(r7) && V0.isNull(r8) && V0.isNull(r9) && V0.isNull(r10) && V0.isNull(r11) && V0.isNull(r12)) {
                                i3 = i42;
                                if (V0.isNull(i3)) {
                                    i4 = r;
                                    i5 = i43;
                                    if (V0.isNull(i5)) {
                                        i6 = r2;
                                        i7 = r15;
                                        if (V0.isNull(i7)) {
                                            i8 = r3;
                                            i9 = r16;
                                            if (V0.isNull(i9)) {
                                                i = i44;
                                                i2 = r17;
                                                if (V0.isNull(i2)) {
                                                    arrayList = arrayList2;
                                                    int i45 = r18;
                                                    if (V0.isNull(i45)) {
                                                        r18 = i45;
                                                        int i46 = r19;
                                                        if (V0.isNull(i46)) {
                                                            r19 = i46;
                                                            int i47 = r20;
                                                            if (V0.isNull(i47)) {
                                                                r20 = i47;
                                                                int i48 = r21;
                                                                if (V0.isNull(i48)) {
                                                                    r21 = i48;
                                                                    int i49 = r22;
                                                                    if (V0.isNull(i49)) {
                                                                        r22 = i49;
                                                                        int i50 = r23;
                                                                        if (V0.isNull(i50)) {
                                                                            r23 = i50;
                                                                            int i51 = r24;
                                                                            if (V0.isNull(i51)) {
                                                                                r24 = i51;
                                                                                int i52 = r25;
                                                                                if (V0.isNull(i52)) {
                                                                                    r25 = i52;
                                                                                    int i53 = r26;
                                                                                    if (V0.isNull(i53)) {
                                                                                        r26 = i53;
                                                                                        int i54 = r27;
                                                                                        if (V0.isNull(i54)) {
                                                                                            r27 = i54;
                                                                                            i10 = r28;
                                                                                            if (V0.isNull(i10)) {
                                                                                                sz8Var = sz8Var3;
                                                                                                i11 = i9;
                                                                                                i17 = r23;
                                                                                                i18 = r24;
                                                                                                i24 = i5;
                                                                                                i14 = i7;
                                                                                                i15 = r5;
                                                                                                i12 = r6;
                                                                                                i13 = r18;
                                                                                                i26 = r22;
                                                                                                i25 = r26;
                                                                                                i28 = r27;
                                                                                                team = null;
                                                                                                i23 = r4;
                                                                                                i19 = r20;
                                                                                                i21 = r21;
                                                                                                i27 = r25;
                                                                                                i16 = i10;
                                                                                                i20 = r19;
                                                                                                i22 = r12;
                                                                                                i29 = r29;
                                                                                                if (V0.isNull(i29)) {
                                                                                                    i30 = r30;
                                                                                                } else {
                                                                                                    i30 = r30;
                                                                                                    if (V0.isNull(i30)) {
                                                                                                        r29 = i29;
                                                                                                        nlgVar = V0;
                                                                                                        fieldTranslations = null;
                                                                                                        ArrayList arrayList3 = arrayList;
                                                                                                        arrayList3.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                        int i55 = i24;
                                                                                                        r17 = i2;
                                                                                                        r13 = i3;
                                                                                                        r14 = i55;
                                                                                                        int i56 = i17;
                                                                                                        r24 = i18;
                                                                                                        r23 = i56;
                                                                                                        r16 = i11;
                                                                                                        arrayList2 = arrayList3;
                                                                                                        r27 = i28;
                                                                                                        r30 = i30;
                                                                                                        sz8Var3 = sz8Var;
                                                                                                        r12 = i22;
                                                                                                        r19 = i20;
                                                                                                        V0 = nlgVar;
                                                                                                        r = i4;
                                                                                                        r2 = i6;
                                                                                                        r3 = i8;
                                                                                                        r26 = i25;
                                                                                                        r21 = i21;
                                                                                                        r20 = i19;
                                                                                                        r15 = i14;
                                                                                                        r6 = i12;
                                                                                                        r22 = i26;
                                                                                                        r5 = i15;
                                                                                                        r28 = i16;
                                                                                                        r25 = i27;
                                                                                                        r4 = i23;
                                                                                                        r18 = i13;
                                                                                                    }
                                                                                                }
                                                                                                Map z3 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                if (V0.isNull(i30)) {
                                                                                                    r29 = i29;
                                                                                                    F0 = V0.F0(i30);
                                                                                                } else {
                                                                                                    r29 = i29;
                                                                                                    F0 = null;
                                                                                                }
                                                                                                nlgVar = V0;
                                                                                                fieldTranslations = new FieldTranslations(z3, sz8Var.z(F0));
                                                                                                ArrayList arrayList32 = arrayList;
                                                                                                arrayList32.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                int i552 = i24;
                                                                                                r17 = i2;
                                                                                                r13 = i3;
                                                                                                r14 = i552;
                                                                                                int i562 = i17;
                                                                                                r24 = i18;
                                                                                                r23 = i562;
                                                                                                r16 = i11;
                                                                                                arrayList2 = arrayList32;
                                                                                                r27 = i28;
                                                                                                r30 = i30;
                                                                                                sz8Var3 = sz8Var;
                                                                                                r12 = i22;
                                                                                                r19 = i20;
                                                                                                V0 = nlgVar;
                                                                                                r = i4;
                                                                                                r2 = i6;
                                                                                                r3 = i8;
                                                                                                r26 = i25;
                                                                                                r21 = i21;
                                                                                                r20 = i19;
                                                                                                r15 = i14;
                                                                                                r6 = i12;
                                                                                                r22 = i26;
                                                                                                r5 = i15;
                                                                                                r28 = i16;
                                                                                                r25 = i27;
                                                                                                r4 = i23;
                                                                                                r18 = i13;
                                                                                            }
                                                                                            i31 = i7;
                                                                                            int i57 = i9;
                                                                                            int i58 = (int) V0.getLong(r4);
                                                                                            String F08 = V0.F0(r5);
                                                                                            String F09 = V0.F0(r6);
                                                                                            long j2 = V0.getLong(r7);
                                                                                            int i59 = (int) V0.getLong(r8);
                                                                                            String F010 = V0.isNull(r9) ? null : V0.F0(r9);
                                                                                            String F011 = V0.isNull(r10) ? null : V0.F0(r10);
                                                                                            String F012 = V0.isNull(r11) ? null : V0.F0(r11);
                                                                                            Gender stringToGender = F012 == null ? null : GenderTypeConverter.stringToGender(F012);
                                                                                            if (V0.isNull(r12)) {
                                                                                                i32 = i59;
                                                                                                valueOf = null;
                                                                                            } else {
                                                                                                i32 = i59;
                                                                                                valueOf = Integer.valueOf((int) V0.getLong(r12));
                                                                                            }
                                                                                            boolean z4 = ((int) V0.getLong(i3)) != 0;
                                                                                            boolean z5 = ((int) V0.getLong(i5)) != 0;
                                                                                            if (V0.isNull(i31)) {
                                                                                                i34 = i57;
                                                                                                if (V0.isNull(i34) && V0.isNull(i2)) {
                                                                                                    i24 = i5;
                                                                                                    i33 = r18;
                                                                                                    if (V0.isNull(i33)) {
                                                                                                        sz8Var = sz8Var3;
                                                                                                        i11 = i34;
                                                                                                        i13 = i33;
                                                                                                        i14 = i31;
                                                                                                        i23 = r4;
                                                                                                        i15 = r5;
                                                                                                        i12 = r6;
                                                                                                        subTeam = null;
                                                                                                        i35 = r19;
                                                                                                        if (V0.isNull(i35)) {
                                                                                                            i36 = r20;
                                                                                                        } else {
                                                                                                            i36 = r20;
                                                                                                            if (V0.isNull(i36)) {
                                                                                                                i37 = r21;
                                                                                                                if (V0.isNull(i37)) {
                                                                                                                    i26 = r22;
                                                                                                                    if (V0.isNull(i26)) {
                                                                                                                        i20 = i35;
                                                                                                                        i19 = i36;
                                                                                                                        i21 = i37;
                                                                                                                        i22 = r12;
                                                                                                                        subTeam2 = null;
                                                                                                                        i38 = r23;
                                                                                                                        if (V0.isNull(i38)) {
                                                                                                                            i39 = r24;
                                                                                                                            if (V0.isNull(i39)) {
                                                                                                                                sport = null;
                                                                                                                                i27 = r25;
                                                                                                                                if (V0.isNull(i27)) {
                                                                                                                                    i25 = r26;
                                                                                                                                } else {
                                                                                                                                    i25 = r26;
                                                                                                                                    if (V0.isNull(i25)) {
                                                                                                                                        i17 = i38;
                                                                                                                                        i18 = i39;
                                                                                                                                        country = null;
                                                                                                                                        i28 = r27;
                                                                                                                                        if (V0.isNull(i28) && V0.isNull(i10)) {
                                                                                                                                            i16 = i10;
                                                                                                                                            fieldTranslations2 = null;
                                                                                                                                            team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                                            i29 = r29;
                                                                                                                                            if (V0.isNull(i29)) {
                                                                                                                                            }
                                                                                                                                            Map z32 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                                            if (V0.isNull(i30)) {
                                                                                                                                            }
                                                                                                                                            nlgVar = V0;
                                                                                                                                            fieldTranslations = new FieldTranslations(z32, sz8Var.z(F0));
                                                                                                                                            ArrayList arrayList322 = arrayList;
                                                                                                                                            arrayList322.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                                            int i5522 = i24;
                                                                                                                                            r17 = i2;
                                                                                                                                            r13 = i3;
                                                                                                                                            r14 = i5522;
                                                                                                                                            int i5622 = i17;
                                                                                                                                            r24 = i18;
                                                                                                                                            r23 = i5622;
                                                                                                                                            r16 = i11;
                                                                                                                                            arrayList2 = arrayList322;
                                                                                                                                            r27 = i28;
                                                                                                                                            r30 = i30;
                                                                                                                                            sz8Var3 = sz8Var;
                                                                                                                                            r12 = i22;
                                                                                                                                            r19 = i20;
                                                                                                                                            V0 = nlgVar;
                                                                                                                                            r = i4;
                                                                                                                                            r2 = i6;
                                                                                                                                            r3 = i8;
                                                                                                                                            r26 = i25;
                                                                                                                                            r21 = i21;
                                                                                                                                            r20 = i19;
                                                                                                                                            r15 = i14;
                                                                                                                                            r6 = i12;
                                                                                                                                            r22 = i26;
                                                                                                                                            r5 = i15;
                                                                                                                                            r28 = i16;
                                                                                                                                            r25 = i27;
                                                                                                                                            r4 = i23;
                                                                                                                                            r18 = i13;
                                                                                                                                        }
                                                                                                                                        i16 = i10;
                                                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                                        team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                                        i29 = r29;
                                                                                                                                        if (V0.isNull(i29)) {
                                                                                                                                        }
                                                                                                                                        Map z322 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                                        if (V0.isNull(i30)) {
                                                                                                                                        }
                                                                                                                                        nlgVar = V0;
                                                                                                                                        fieldTranslations = new FieldTranslations(z322, sz8Var.z(F0));
                                                                                                                                        ArrayList arrayList3222 = arrayList;
                                                                                                                                        arrayList3222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                                        int i55222 = i24;
                                                                                                                                        r17 = i2;
                                                                                                                                        r13 = i3;
                                                                                                                                        r14 = i55222;
                                                                                                                                        int i56222 = i17;
                                                                                                                                        r24 = i18;
                                                                                                                                        r23 = i56222;
                                                                                                                                        r16 = i11;
                                                                                                                                        arrayList2 = arrayList3222;
                                                                                                                                        r27 = i28;
                                                                                                                                        r30 = i30;
                                                                                                                                        sz8Var3 = sz8Var;
                                                                                                                                        r12 = i22;
                                                                                                                                        r19 = i20;
                                                                                                                                        V0 = nlgVar;
                                                                                                                                        r = i4;
                                                                                                                                        r2 = i6;
                                                                                                                                        r3 = i8;
                                                                                                                                        r26 = i25;
                                                                                                                                        r21 = i21;
                                                                                                                                        r20 = i19;
                                                                                                                                        r15 = i14;
                                                                                                                                        r6 = i12;
                                                                                                                                        r22 = i26;
                                                                                                                                        r5 = i15;
                                                                                                                                        r28 = i16;
                                                                                                                                        r25 = i27;
                                                                                                                                        r4 = i23;
                                                                                                                                        r18 = i13;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                String F013 = !V0.isNull(i27) ? null : V0.F0(i27);
                                                                                                                                if (V0.isNull(i25)) {
                                                                                                                                    i17 = i38;
                                                                                                                                    F02 = V0.F0(i25);
                                                                                                                                } else {
                                                                                                                                    i17 = i38;
                                                                                                                                    F02 = null;
                                                                                                                                }
                                                                                                                                i18 = i39;
                                                                                                                                country = new Country(F013, F02);
                                                                                                                                i28 = r27;
                                                                                                                                if (V0.isNull(i28)) {
                                                                                                                                    i16 = i10;
                                                                                                                                    fieldTranslations2 = null;
                                                                                                                                    team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                                    i29 = r29;
                                                                                                                                    if (V0.isNull(i29)) {
                                                                                                                                    }
                                                                                                                                    Map z3222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                                    if (V0.isNull(i30)) {
                                                                                                                                    }
                                                                                                                                    nlgVar = V0;
                                                                                                                                    fieldTranslations = new FieldTranslations(z3222, sz8Var.z(F0));
                                                                                                                                    ArrayList arrayList32222 = arrayList;
                                                                                                                                    arrayList32222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                                    int i552222 = i24;
                                                                                                                                    r17 = i2;
                                                                                                                                    r13 = i3;
                                                                                                                                    r14 = i552222;
                                                                                                                                    int i562222 = i17;
                                                                                                                                    r24 = i18;
                                                                                                                                    r23 = i562222;
                                                                                                                                    r16 = i11;
                                                                                                                                    arrayList2 = arrayList32222;
                                                                                                                                    r27 = i28;
                                                                                                                                    r30 = i30;
                                                                                                                                    sz8Var3 = sz8Var;
                                                                                                                                    r12 = i22;
                                                                                                                                    r19 = i20;
                                                                                                                                    V0 = nlgVar;
                                                                                                                                    r = i4;
                                                                                                                                    r2 = i6;
                                                                                                                                    r3 = i8;
                                                                                                                                    r26 = i25;
                                                                                                                                    r21 = i21;
                                                                                                                                    r20 = i19;
                                                                                                                                    r15 = i14;
                                                                                                                                    r6 = i12;
                                                                                                                                    r22 = i26;
                                                                                                                                    r5 = i15;
                                                                                                                                    r28 = i16;
                                                                                                                                    r25 = i27;
                                                                                                                                    r4 = i23;
                                                                                                                                    r18 = i13;
                                                                                                                                }
                                                                                                                                i16 = i10;
                                                                                                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                                team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                                i29 = r29;
                                                                                                                                if (V0.isNull(i29)) {
                                                                                                                                }
                                                                                                                                Map z32222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                                if (V0.isNull(i30)) {
                                                                                                                                }
                                                                                                                                nlgVar = V0;
                                                                                                                                fieldTranslations = new FieldTranslations(z32222, sz8Var.z(F0));
                                                                                                                                ArrayList arrayList322222 = arrayList;
                                                                                                                                arrayList322222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                                int i5522222 = i24;
                                                                                                                                r17 = i2;
                                                                                                                                r13 = i3;
                                                                                                                                r14 = i5522222;
                                                                                                                                int i5622222 = i17;
                                                                                                                                r24 = i18;
                                                                                                                                r23 = i5622222;
                                                                                                                                r16 = i11;
                                                                                                                                arrayList2 = arrayList322222;
                                                                                                                                r27 = i28;
                                                                                                                                r30 = i30;
                                                                                                                                sz8Var3 = sz8Var;
                                                                                                                                r12 = i22;
                                                                                                                                r19 = i20;
                                                                                                                                V0 = nlgVar;
                                                                                                                                r = i4;
                                                                                                                                r2 = i6;
                                                                                                                                r3 = i8;
                                                                                                                                r26 = i25;
                                                                                                                                r21 = i21;
                                                                                                                                r20 = i19;
                                                                                                                                r15 = i14;
                                                                                                                                r6 = i12;
                                                                                                                                r22 = i26;
                                                                                                                                r5 = i15;
                                                                                                                                r28 = i16;
                                                                                                                                r25 = i27;
                                                                                                                                r4 = i23;
                                                                                                                                r18 = i13;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i39 = r24;
                                                                                                                        }
                                                                                                                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                                        i27 = r25;
                                                                                                                        if (V0.isNull(i27)) {
                                                                                                                        }
                                                                                                                        if (!V0.isNull(i27)) {
                                                                                                                        }
                                                                                                                        if (V0.isNull(i25)) {
                                                                                                                        }
                                                                                                                        i18 = i39;
                                                                                                                        country = new Country(F013, F02);
                                                                                                                        i28 = r27;
                                                                                                                        if (V0.isNull(i28)) {
                                                                                                                        }
                                                                                                                        i16 = i10;
                                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                        team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                        i29 = r29;
                                                                                                                        if (V0.isNull(i29)) {
                                                                                                                        }
                                                                                                                        Map z322222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                        if (V0.isNull(i30)) {
                                                                                                                        }
                                                                                                                        nlgVar = V0;
                                                                                                                        fieldTranslations = new FieldTranslations(z322222, sz8Var.z(F0));
                                                                                                                        ArrayList arrayList3222222 = arrayList;
                                                                                                                        arrayList3222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                        int i55222222 = i24;
                                                                                                                        r17 = i2;
                                                                                                                        r13 = i3;
                                                                                                                        r14 = i55222222;
                                                                                                                        int i56222222 = i17;
                                                                                                                        r24 = i18;
                                                                                                                        r23 = i56222222;
                                                                                                                        r16 = i11;
                                                                                                                        arrayList2 = arrayList3222222;
                                                                                                                        r27 = i28;
                                                                                                                        r30 = i30;
                                                                                                                        sz8Var3 = sz8Var;
                                                                                                                        r12 = i22;
                                                                                                                        r19 = i20;
                                                                                                                        V0 = nlgVar;
                                                                                                                        r = i4;
                                                                                                                        r2 = i6;
                                                                                                                        r3 = i8;
                                                                                                                        r26 = i25;
                                                                                                                        r21 = i21;
                                                                                                                        r20 = i19;
                                                                                                                        r15 = i14;
                                                                                                                        r6 = i12;
                                                                                                                        r22 = i26;
                                                                                                                        r5 = i15;
                                                                                                                        r28 = i16;
                                                                                                                        r25 = i27;
                                                                                                                        r4 = i23;
                                                                                                                        r18 = i13;
                                                                                                                    }
                                                                                                                    i22 = r12;
                                                                                                                    int i60 = (int) V0.getLong(i35);
                                                                                                                    String F014 = !V0.isNull(i36) ? null : V0.F0(i36);
                                                                                                                    if (V0.isNull(i37) && V0.isNull(i26)) {
                                                                                                                        i20 = i35;
                                                                                                                        i19 = i36;
                                                                                                                        i21 = i37;
                                                                                                                        fieldTranslations3 = null;
                                                                                                                        subTeam2 = new SubTeam(i60, F014, fieldTranslations3);
                                                                                                                        i38 = r23;
                                                                                                                        if (V0.isNull(i38)) {
                                                                                                                        }
                                                                                                                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                                        i27 = r25;
                                                                                                                        if (V0.isNull(i27)) {
                                                                                                                        }
                                                                                                                        if (!V0.isNull(i27)) {
                                                                                                                        }
                                                                                                                        if (V0.isNull(i25)) {
                                                                                                                        }
                                                                                                                        i18 = i39;
                                                                                                                        country = new Country(F013, F02);
                                                                                                                        i28 = r27;
                                                                                                                        if (V0.isNull(i28)) {
                                                                                                                        }
                                                                                                                        i16 = i10;
                                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                        team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                        i29 = r29;
                                                                                                                        if (V0.isNull(i29)) {
                                                                                                                        }
                                                                                                                        Map z3222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                        if (V0.isNull(i30)) {
                                                                                                                        }
                                                                                                                        nlgVar = V0;
                                                                                                                        fieldTranslations = new FieldTranslations(z3222222, sz8Var.z(F0));
                                                                                                                        ArrayList arrayList32222222 = arrayList;
                                                                                                                        arrayList32222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                        int i552222222 = i24;
                                                                                                                        r17 = i2;
                                                                                                                        r13 = i3;
                                                                                                                        r14 = i552222222;
                                                                                                                        int i562222222 = i17;
                                                                                                                        r24 = i18;
                                                                                                                        r23 = i562222222;
                                                                                                                        r16 = i11;
                                                                                                                        arrayList2 = arrayList32222222;
                                                                                                                        r27 = i28;
                                                                                                                        r30 = i30;
                                                                                                                        sz8Var3 = sz8Var;
                                                                                                                        r12 = i22;
                                                                                                                        r19 = i20;
                                                                                                                        V0 = nlgVar;
                                                                                                                        r = i4;
                                                                                                                        r2 = i6;
                                                                                                                        r3 = i8;
                                                                                                                        r26 = i25;
                                                                                                                        r21 = i21;
                                                                                                                        r20 = i19;
                                                                                                                        r15 = i14;
                                                                                                                        r6 = i12;
                                                                                                                        r22 = i26;
                                                                                                                        r5 = i15;
                                                                                                                        r28 = i16;
                                                                                                                        r25 = i27;
                                                                                                                        r4 = i23;
                                                                                                                        r18 = i13;
                                                                                                                    }
                                                                                                                    if (V0.isNull(i37)) {
                                                                                                                        i20 = i35;
                                                                                                                        F03 = V0.F0(i37);
                                                                                                                    } else {
                                                                                                                        i20 = i35;
                                                                                                                        F03 = null;
                                                                                                                    }
                                                                                                                    Map z6 = sz8Var.z(F03);
                                                                                                                    if (V0.isNull(i26)) {
                                                                                                                        i19 = i36;
                                                                                                                        F04 = V0.F0(i26);
                                                                                                                    } else {
                                                                                                                        i19 = i36;
                                                                                                                        F04 = null;
                                                                                                                    }
                                                                                                                    i21 = i37;
                                                                                                                    fieldTranslations3 = new FieldTranslations(z6, sz8Var.z(F04));
                                                                                                                    subTeam2 = new SubTeam(i60, F014, fieldTranslations3);
                                                                                                                    i38 = r23;
                                                                                                                    if (V0.isNull(i38)) {
                                                                                                                    }
                                                                                                                    sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                                    i27 = r25;
                                                                                                                    if (V0.isNull(i27)) {
                                                                                                                    }
                                                                                                                    if (!V0.isNull(i27)) {
                                                                                                                    }
                                                                                                                    if (V0.isNull(i25)) {
                                                                                                                    }
                                                                                                                    i18 = i39;
                                                                                                                    country = new Country(F013, F02);
                                                                                                                    i28 = r27;
                                                                                                                    if (V0.isNull(i28)) {
                                                                                                                    }
                                                                                                                    i16 = i10;
                                                                                                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                    team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                    i29 = r29;
                                                                                                                    if (V0.isNull(i29)) {
                                                                                                                    }
                                                                                                                    Map z32222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                    if (V0.isNull(i30)) {
                                                                                                                    }
                                                                                                                    nlgVar = V0;
                                                                                                                    fieldTranslations = new FieldTranslations(z32222222, sz8Var.z(F0));
                                                                                                                    ArrayList arrayList322222222 = arrayList;
                                                                                                                    arrayList322222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                    int i5522222222 = i24;
                                                                                                                    r17 = i2;
                                                                                                                    r13 = i3;
                                                                                                                    r14 = i5522222222;
                                                                                                                    int i5622222222 = i17;
                                                                                                                    r24 = i18;
                                                                                                                    r23 = i5622222222;
                                                                                                                    r16 = i11;
                                                                                                                    arrayList2 = arrayList322222222;
                                                                                                                    r27 = i28;
                                                                                                                    r30 = i30;
                                                                                                                    sz8Var3 = sz8Var;
                                                                                                                    r12 = i22;
                                                                                                                    r19 = i20;
                                                                                                                    V0 = nlgVar;
                                                                                                                    r = i4;
                                                                                                                    r2 = i6;
                                                                                                                    r3 = i8;
                                                                                                                    r26 = i25;
                                                                                                                    r21 = i21;
                                                                                                                    r20 = i19;
                                                                                                                    r15 = i14;
                                                                                                                    r6 = i12;
                                                                                                                    r22 = i26;
                                                                                                                    r5 = i15;
                                                                                                                    r28 = i16;
                                                                                                                    r25 = i27;
                                                                                                                    r4 = i23;
                                                                                                                    r18 = i13;
                                                                                                                }
                                                                                                                i26 = r22;
                                                                                                                i22 = r12;
                                                                                                                int i602 = (int) V0.getLong(i35);
                                                                                                                if (!V0.isNull(i36)) {
                                                                                                                }
                                                                                                                if (V0.isNull(i37)) {
                                                                                                                    i20 = i35;
                                                                                                                    i19 = i36;
                                                                                                                    i21 = i37;
                                                                                                                    fieldTranslations3 = null;
                                                                                                                    subTeam2 = new SubTeam(i602, F014, fieldTranslations3);
                                                                                                                    i38 = r23;
                                                                                                                    if (V0.isNull(i38)) {
                                                                                                                    }
                                                                                                                    sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                                    i27 = r25;
                                                                                                                    if (V0.isNull(i27)) {
                                                                                                                    }
                                                                                                                    if (!V0.isNull(i27)) {
                                                                                                                    }
                                                                                                                    if (V0.isNull(i25)) {
                                                                                                                    }
                                                                                                                    i18 = i39;
                                                                                                                    country = new Country(F013, F02);
                                                                                                                    i28 = r27;
                                                                                                                    if (V0.isNull(i28)) {
                                                                                                                    }
                                                                                                                    i16 = i10;
                                                                                                                    fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                    team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                    i29 = r29;
                                                                                                                    if (V0.isNull(i29)) {
                                                                                                                    }
                                                                                                                    Map z322222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                    if (V0.isNull(i30)) {
                                                                                                                    }
                                                                                                                    nlgVar = V0;
                                                                                                                    fieldTranslations = new FieldTranslations(z322222222, sz8Var.z(F0));
                                                                                                                    ArrayList arrayList3222222222 = arrayList;
                                                                                                                    arrayList3222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                    int i55222222222 = i24;
                                                                                                                    r17 = i2;
                                                                                                                    r13 = i3;
                                                                                                                    r14 = i55222222222;
                                                                                                                    int i56222222222 = i17;
                                                                                                                    r24 = i18;
                                                                                                                    r23 = i56222222222;
                                                                                                                    r16 = i11;
                                                                                                                    arrayList2 = arrayList3222222222;
                                                                                                                    r27 = i28;
                                                                                                                    r30 = i30;
                                                                                                                    sz8Var3 = sz8Var;
                                                                                                                    r12 = i22;
                                                                                                                    r19 = i20;
                                                                                                                    V0 = nlgVar;
                                                                                                                    r = i4;
                                                                                                                    r2 = i6;
                                                                                                                    r3 = i8;
                                                                                                                    r26 = i25;
                                                                                                                    r21 = i21;
                                                                                                                    r20 = i19;
                                                                                                                    r15 = i14;
                                                                                                                    r6 = i12;
                                                                                                                    r22 = i26;
                                                                                                                    r5 = i15;
                                                                                                                    r28 = i16;
                                                                                                                    r25 = i27;
                                                                                                                    r4 = i23;
                                                                                                                    r18 = i13;
                                                                                                                }
                                                                                                                if (V0.isNull(i37)) {
                                                                                                                }
                                                                                                                Map z62 = sz8Var.z(F03);
                                                                                                                if (V0.isNull(i26)) {
                                                                                                                }
                                                                                                                i21 = i37;
                                                                                                                fieldTranslations3 = new FieldTranslations(z62, sz8Var.z(F04));
                                                                                                                subTeam2 = new SubTeam(i602, F014, fieldTranslations3);
                                                                                                                i38 = r23;
                                                                                                                if (V0.isNull(i38)) {
                                                                                                                }
                                                                                                                sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                                i27 = r25;
                                                                                                                if (V0.isNull(i27)) {
                                                                                                                }
                                                                                                                if (!V0.isNull(i27)) {
                                                                                                                }
                                                                                                                if (V0.isNull(i25)) {
                                                                                                                }
                                                                                                                i18 = i39;
                                                                                                                country = new Country(F013, F02);
                                                                                                                i28 = r27;
                                                                                                                if (V0.isNull(i28)) {
                                                                                                                }
                                                                                                                i16 = i10;
                                                                                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                                team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                                i29 = r29;
                                                                                                                if (V0.isNull(i29)) {
                                                                                                                }
                                                                                                                Map z3222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                                if (V0.isNull(i30)) {
                                                                                                                }
                                                                                                                nlgVar = V0;
                                                                                                                fieldTranslations = new FieldTranslations(z3222222222, sz8Var.z(F0));
                                                                                                                ArrayList arrayList32222222222 = arrayList;
                                                                                                                arrayList32222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                                int i552222222222 = i24;
                                                                                                                r17 = i2;
                                                                                                                r13 = i3;
                                                                                                                r14 = i552222222222;
                                                                                                                int i562222222222 = i17;
                                                                                                                r24 = i18;
                                                                                                                r23 = i562222222222;
                                                                                                                r16 = i11;
                                                                                                                arrayList2 = arrayList32222222222;
                                                                                                                r27 = i28;
                                                                                                                r30 = i30;
                                                                                                                sz8Var3 = sz8Var;
                                                                                                                r12 = i22;
                                                                                                                r19 = i20;
                                                                                                                V0 = nlgVar;
                                                                                                                r = i4;
                                                                                                                r2 = i6;
                                                                                                                r3 = i8;
                                                                                                                r26 = i25;
                                                                                                                r21 = i21;
                                                                                                                r20 = i19;
                                                                                                                r15 = i14;
                                                                                                                r6 = i12;
                                                                                                                r22 = i26;
                                                                                                                r5 = i15;
                                                                                                                r28 = i16;
                                                                                                                r25 = i27;
                                                                                                                r4 = i23;
                                                                                                                r18 = i13;
                                                                                                            }
                                                                                                        }
                                                                                                        i37 = r21;
                                                                                                        i26 = r22;
                                                                                                        i22 = r12;
                                                                                                        int i6022 = (int) V0.getLong(i35);
                                                                                                        if (!V0.isNull(i36)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i37)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i37)) {
                                                                                                        }
                                                                                                        Map z622 = sz8Var.z(F03);
                                                                                                        if (V0.isNull(i26)) {
                                                                                                        }
                                                                                                        i21 = i37;
                                                                                                        fieldTranslations3 = new FieldTranslations(z622, sz8Var.z(F04));
                                                                                                        subTeam2 = new SubTeam(i6022, F014, fieldTranslations3);
                                                                                                        i38 = r23;
                                                                                                        if (V0.isNull(i38)) {
                                                                                                        }
                                                                                                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                        i27 = r25;
                                                                                                        if (V0.isNull(i27)) {
                                                                                                        }
                                                                                                        if (!V0.isNull(i27)) {
                                                                                                        }
                                                                                                        if (V0.isNull(i25)) {
                                                                                                        }
                                                                                                        i18 = i39;
                                                                                                        country = new Country(F013, F02);
                                                                                                        i28 = r27;
                                                                                                        if (V0.isNull(i28)) {
                                                                                                        }
                                                                                                        i16 = i10;
                                                                                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                        team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                        i29 = r29;
                                                                                                        if (V0.isNull(i29)) {
                                                                                                        }
                                                                                                        Map z32222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                        if (V0.isNull(i30)) {
                                                                                                        }
                                                                                                        nlgVar = V0;
                                                                                                        fieldTranslations = new FieldTranslations(z32222222222, sz8Var.z(F0));
                                                                                                        ArrayList arrayList322222222222 = arrayList;
                                                                                                        arrayList322222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                        int i5522222222222 = i24;
                                                                                                        r17 = i2;
                                                                                                        r13 = i3;
                                                                                                        r14 = i5522222222222;
                                                                                                        int i5622222222222 = i17;
                                                                                                        r24 = i18;
                                                                                                        r23 = i5622222222222;
                                                                                                        r16 = i11;
                                                                                                        arrayList2 = arrayList322222222222;
                                                                                                        r27 = i28;
                                                                                                        r30 = i30;
                                                                                                        sz8Var3 = sz8Var;
                                                                                                        r12 = i22;
                                                                                                        r19 = i20;
                                                                                                        V0 = nlgVar;
                                                                                                        r = i4;
                                                                                                        r2 = i6;
                                                                                                        r3 = i8;
                                                                                                        r26 = i25;
                                                                                                        r21 = i21;
                                                                                                        r20 = i19;
                                                                                                        r15 = i14;
                                                                                                        r6 = i12;
                                                                                                        r22 = i26;
                                                                                                        r5 = i15;
                                                                                                        r28 = i16;
                                                                                                        r25 = i27;
                                                                                                        r4 = i23;
                                                                                                        r18 = i13;
                                                                                                    }
                                                                                                } else {
                                                                                                    i24 = i5;
                                                                                                    i33 = r18;
                                                                                                }
                                                                                            } else {
                                                                                                i24 = i5;
                                                                                                i33 = r18;
                                                                                                i34 = i57;
                                                                                            }
                                                                                            i23 = r4;
                                                                                            i15 = r5;
                                                                                            int i61 = (int) V0.getLong(i31);
                                                                                            String F015 = V0.isNull(i34) ? null : V0.F0(i34);
                                                                                            if (V0.isNull(i2) && V0.isNull(i33)) {
                                                                                                int i62 = i34;
                                                                                                sz8Var = sz8Var3;
                                                                                                i11 = i62;
                                                                                                i13 = i33;
                                                                                                i14 = i31;
                                                                                                i12 = r6;
                                                                                                fieldTranslations4 = null;
                                                                                                subTeam = new SubTeam(i61, F015, fieldTranslations4);
                                                                                                i35 = r19;
                                                                                                if (V0.isNull(i35)) {
                                                                                                }
                                                                                                i37 = r21;
                                                                                                i26 = r22;
                                                                                                i22 = r12;
                                                                                                int i60222 = (int) V0.getLong(i35);
                                                                                                if (!V0.isNull(i36)) {
                                                                                                }
                                                                                                if (V0.isNull(i37)) {
                                                                                                }
                                                                                                if (V0.isNull(i37)) {
                                                                                                }
                                                                                                Map z6222 = sz8Var.z(F03);
                                                                                                if (V0.isNull(i26)) {
                                                                                                }
                                                                                                i21 = i37;
                                                                                                fieldTranslations3 = new FieldTranslations(z6222, sz8Var.z(F04));
                                                                                                subTeam2 = new SubTeam(i60222, F014, fieldTranslations3);
                                                                                                i38 = r23;
                                                                                                if (V0.isNull(i38)) {
                                                                                                }
                                                                                                sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                                i27 = r25;
                                                                                                if (V0.isNull(i27)) {
                                                                                                }
                                                                                                if (!V0.isNull(i27)) {
                                                                                                }
                                                                                                if (V0.isNull(i25)) {
                                                                                                }
                                                                                                i18 = i39;
                                                                                                country = new Country(F013, F02);
                                                                                                i28 = r27;
                                                                                                if (V0.isNull(i28)) {
                                                                                                }
                                                                                                i16 = i10;
                                                                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                                team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                                i29 = r29;
                                                                                                if (V0.isNull(i29)) {
                                                                                                }
                                                                                                Map z322222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                                if (V0.isNull(i30)) {
                                                                                                }
                                                                                                nlgVar = V0;
                                                                                                fieldTranslations = new FieldTranslations(z322222222222, sz8Var.z(F0));
                                                                                                ArrayList arrayList3222222222222 = arrayList;
                                                                                                arrayList3222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                                int i55222222222222 = i24;
                                                                                                r17 = i2;
                                                                                                r13 = i3;
                                                                                                r14 = i55222222222222;
                                                                                                int i56222222222222 = i17;
                                                                                                r24 = i18;
                                                                                                r23 = i56222222222222;
                                                                                                r16 = i11;
                                                                                                arrayList2 = arrayList3222222222222;
                                                                                                r27 = i28;
                                                                                                r30 = i30;
                                                                                                sz8Var3 = sz8Var;
                                                                                                r12 = i22;
                                                                                                r19 = i20;
                                                                                                V0 = nlgVar;
                                                                                                r = i4;
                                                                                                r2 = i6;
                                                                                                r3 = i8;
                                                                                                r26 = i25;
                                                                                                r21 = i21;
                                                                                                r20 = i19;
                                                                                                r15 = i14;
                                                                                                r6 = i12;
                                                                                                r22 = i26;
                                                                                                r5 = i15;
                                                                                                r28 = i16;
                                                                                                r25 = i27;
                                                                                                r4 = i23;
                                                                                                r18 = i13;
                                                                                            }
                                                                                            if (V0.isNull(i2)) {
                                                                                                int i63 = i34;
                                                                                                sz8Var = sz8Var3;
                                                                                                i11 = i63;
                                                                                                i14 = i31;
                                                                                                F05 = null;
                                                                                            } else {
                                                                                                int i64 = i34;
                                                                                                sz8Var = sz8Var3;
                                                                                                i11 = i64;
                                                                                                i14 = i31;
                                                                                                F05 = V0.F0(i2);
                                                                                            }
                                                                                            Map z7 = sz8Var.z(F05);
                                                                                            if (V0.isNull(i33)) {
                                                                                                i13 = i33;
                                                                                                F06 = null;
                                                                                            } else {
                                                                                                i13 = i33;
                                                                                                F06 = V0.F0(i33);
                                                                                            }
                                                                                            i12 = r6;
                                                                                            fieldTranslations4 = new FieldTranslations(z7, sz8Var.z(F06));
                                                                                            subTeam = new SubTeam(i61, F015, fieldTranslations4);
                                                                                            i35 = r19;
                                                                                            if (V0.isNull(i35)) {
                                                                                            }
                                                                                            i37 = r21;
                                                                                            i26 = r22;
                                                                                            i22 = r12;
                                                                                            int i602222 = (int) V0.getLong(i35);
                                                                                            if (!V0.isNull(i36)) {
                                                                                            }
                                                                                            if (V0.isNull(i37)) {
                                                                                            }
                                                                                            if (V0.isNull(i37)) {
                                                                                            }
                                                                                            Map z62222 = sz8Var.z(F03);
                                                                                            if (V0.isNull(i26)) {
                                                                                            }
                                                                                            i21 = i37;
                                                                                            fieldTranslations3 = new FieldTranslations(z62222, sz8Var.z(F04));
                                                                                            subTeam2 = new SubTeam(i602222, F014, fieldTranslations3);
                                                                                            i38 = r23;
                                                                                            if (V0.isNull(i38)) {
                                                                                            }
                                                                                            sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                                                            i27 = r25;
                                                                                            if (V0.isNull(i27)) {
                                                                                            }
                                                                                            if (!V0.isNull(i27)) {
                                                                                            }
                                                                                            if (V0.isNull(i25)) {
                                                                                            }
                                                                                            i18 = i39;
                                                                                            country = new Country(F013, F02);
                                                                                            i28 = r27;
                                                                                            if (V0.isNull(i28)) {
                                                                                            }
                                                                                            i16 = i10;
                                                                                            fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                                                            team = new Team(i58, F08, F09, j2, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                                                            i29 = r29;
                                                                                            if (V0.isNull(i29)) {
                                                                                            }
                                                                                            Map z3222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                                                            if (V0.isNull(i30)) {
                                                                                            }
                                                                                            nlgVar = V0;
                                                                                            fieldTranslations = new FieldTranslations(z3222222222222, sz8Var.z(F0));
                                                                                            ArrayList arrayList32222222222222 = arrayList;
                                                                                            arrayList32222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                                                            int i552222222222222 = i24;
                                                                                            r17 = i2;
                                                                                            r13 = i3;
                                                                                            r14 = i552222222222222;
                                                                                            int i562222222222222 = i17;
                                                                                            r24 = i18;
                                                                                            r23 = i562222222222222;
                                                                                            r16 = i11;
                                                                                            arrayList2 = arrayList32222222222222;
                                                                                            r27 = i28;
                                                                                            r30 = i30;
                                                                                            sz8Var3 = sz8Var;
                                                                                            r12 = i22;
                                                                                            r19 = i20;
                                                                                            V0 = nlgVar;
                                                                                            r = i4;
                                                                                            r2 = i6;
                                                                                            r3 = i8;
                                                                                            r26 = i25;
                                                                                            r21 = i21;
                                                                                            r20 = i19;
                                                                                            r15 = i14;
                                                                                            r6 = i12;
                                                                                            r22 = i26;
                                                                                            r5 = i15;
                                                                                            r28 = i16;
                                                                                            r25 = i27;
                                                                                            r4 = i23;
                                                                                            r18 = i13;
                                                                                        } else {
                                                                                            r27 = i54;
                                                                                        }
                                                                                    } else {
                                                                                        r26 = i53;
                                                                                    }
                                                                                } else {
                                                                                    r25 = i52;
                                                                                }
                                                                            } else {
                                                                                r24 = i51;
                                                                            }
                                                                        } else {
                                                                            r23 = i50;
                                                                        }
                                                                    } else {
                                                                        r22 = i49;
                                                                    }
                                                                } else {
                                                                    r21 = i48;
                                                                }
                                                            } else {
                                                                r20 = i47;
                                                            }
                                                        } else {
                                                            r19 = i46;
                                                        }
                                                    } else {
                                                        r18 = i45;
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                i = i44;
                                                i2 = r17;
                                            }
                                            i10 = r28;
                                            i31 = i7;
                                            int i572 = i9;
                                            int i582 = (int) V0.getLong(r4);
                                            String F082 = V0.F0(r5);
                                            String F092 = V0.F0(r6);
                                            long j22 = V0.getLong(r7);
                                            int i592 = (int) V0.getLong(r8);
                                            if (V0.isNull(r9)) {
                                            }
                                            if (V0.isNull(r10)) {
                                            }
                                            if (V0.isNull(r11)) {
                                            }
                                            if (F012 == null) {
                                            }
                                            if (V0.isNull(r12)) {
                                            }
                                            if (((int) V0.getLong(i3)) != 0) {
                                            }
                                            if (((int) V0.getLong(i5)) != 0) {
                                            }
                                            if (V0.isNull(i31)) {
                                            }
                                            i23 = r4;
                                            i15 = r5;
                                            int i612 = (int) V0.getLong(i31);
                                            if (V0.isNull(i34)) {
                                            }
                                            if (V0.isNull(i2)) {
                                                int i622 = i34;
                                                sz8Var = sz8Var3;
                                                i11 = i622;
                                                i13 = i33;
                                                i14 = i31;
                                                i12 = r6;
                                                fieldTranslations4 = null;
                                                subTeam = new SubTeam(i612, F015, fieldTranslations4);
                                                i35 = r19;
                                                if (V0.isNull(i35)) {
                                                }
                                                i37 = r21;
                                                i26 = r22;
                                                i22 = r12;
                                                int i6022222 = (int) V0.getLong(i35);
                                                if (!V0.isNull(i36)) {
                                                }
                                                if (V0.isNull(i37)) {
                                                }
                                                if (V0.isNull(i37)) {
                                                }
                                                Map z622222 = sz8Var.z(F03);
                                                if (V0.isNull(i26)) {
                                                }
                                                i21 = i37;
                                                fieldTranslations3 = new FieldTranslations(z622222, sz8Var.z(F04));
                                                subTeam2 = new SubTeam(i6022222, F014, fieldTranslations3);
                                                i38 = r23;
                                                if (V0.isNull(i38)) {
                                                }
                                                sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                                i27 = r25;
                                                if (V0.isNull(i27)) {
                                                }
                                                if (!V0.isNull(i27)) {
                                                }
                                                if (V0.isNull(i25)) {
                                                }
                                                i18 = i39;
                                                country = new Country(F013, F02);
                                                i28 = r27;
                                                if (V0.isNull(i28)) {
                                                }
                                                i16 = i10;
                                                fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                                team = new Team(i582, F082, F092, j22, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                                i29 = r29;
                                                if (V0.isNull(i29)) {
                                                }
                                                Map z32222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                                if (V0.isNull(i30)) {
                                                }
                                                nlgVar = V0;
                                                fieldTranslations = new FieldTranslations(z32222222222222, sz8Var.z(F0));
                                                ArrayList arrayList322222222222222 = arrayList;
                                                arrayList322222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                                int i5522222222222222 = i24;
                                                r17 = i2;
                                                r13 = i3;
                                                r14 = i5522222222222222;
                                                int i5622222222222222 = i17;
                                                r24 = i18;
                                                r23 = i5622222222222222;
                                                r16 = i11;
                                                arrayList2 = arrayList322222222222222;
                                                r27 = i28;
                                                r30 = i30;
                                                sz8Var3 = sz8Var;
                                                r12 = i22;
                                                r19 = i20;
                                                V0 = nlgVar;
                                                r = i4;
                                                r2 = i6;
                                                r3 = i8;
                                                r26 = i25;
                                                r21 = i21;
                                                r20 = i19;
                                                r15 = i14;
                                                r6 = i12;
                                                r22 = i26;
                                                r5 = i15;
                                                r28 = i16;
                                                r25 = i27;
                                                r4 = i23;
                                                r18 = i13;
                                            }
                                            if (V0.isNull(i2)) {
                                            }
                                            Map z72 = sz8Var.z(F05);
                                            if (V0.isNull(i33)) {
                                            }
                                            i12 = r6;
                                            fieldTranslations4 = new FieldTranslations(z72, sz8Var.z(F06));
                                            subTeam = new SubTeam(i612, F015, fieldTranslations4);
                                            i35 = r19;
                                            if (V0.isNull(i35)) {
                                            }
                                            i37 = r21;
                                            i26 = r22;
                                            i22 = r12;
                                            int i60222222 = (int) V0.getLong(i35);
                                            if (!V0.isNull(i36)) {
                                            }
                                            if (V0.isNull(i37)) {
                                            }
                                            if (V0.isNull(i37)) {
                                            }
                                            Map z6222222 = sz8Var.z(F03);
                                            if (V0.isNull(i26)) {
                                            }
                                            i21 = i37;
                                            fieldTranslations3 = new FieldTranslations(z6222222, sz8Var.z(F04));
                                            subTeam2 = new SubTeam(i60222222, F014, fieldTranslations3);
                                            i38 = r23;
                                            if (V0.isNull(i38)) {
                                            }
                                            sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                            i27 = r25;
                                            if (V0.isNull(i27)) {
                                            }
                                            if (!V0.isNull(i27)) {
                                            }
                                            if (V0.isNull(i25)) {
                                            }
                                            i18 = i39;
                                            country = new Country(F013, F02);
                                            i28 = r27;
                                            if (V0.isNull(i28)) {
                                            }
                                            i16 = i10;
                                            fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                            team = new Team(i582, F082, F092, j22, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                            i29 = r29;
                                            if (V0.isNull(i29)) {
                                            }
                                            Map z322222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                            if (V0.isNull(i30)) {
                                            }
                                            nlgVar = V0;
                                            fieldTranslations = new FieldTranslations(z322222222222222, sz8Var.z(F0));
                                            ArrayList arrayList3222222222222222 = arrayList;
                                            arrayList3222222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                            int i55222222222222222 = i24;
                                            r17 = i2;
                                            r13 = i3;
                                            r14 = i55222222222222222;
                                            int i56222222222222222 = i17;
                                            r24 = i18;
                                            r23 = i56222222222222222;
                                            r16 = i11;
                                            arrayList2 = arrayList3222222222222222;
                                            r27 = i28;
                                            r30 = i30;
                                            sz8Var3 = sz8Var;
                                            r12 = i22;
                                            r19 = i20;
                                            V0 = nlgVar;
                                            r = i4;
                                            r2 = i6;
                                            r3 = i8;
                                            r26 = i25;
                                            r21 = i21;
                                            r20 = i19;
                                            r15 = i14;
                                            r6 = i12;
                                            r22 = i26;
                                            r5 = i15;
                                            r28 = i16;
                                            r25 = i27;
                                            r4 = i23;
                                            r18 = i13;
                                        } else {
                                            i8 = r3;
                                            i = i44;
                                            i9 = r16;
                                            i2 = r17;
                                        }
                                        arrayList = arrayList2;
                                        i10 = r28;
                                        i31 = i7;
                                        int i5722 = i9;
                                        int i5822 = (int) V0.getLong(r4);
                                        String F0822 = V0.F0(r5);
                                        String F0922 = V0.F0(r6);
                                        long j222 = V0.getLong(r7);
                                        int i5922 = (int) V0.getLong(r8);
                                        if (V0.isNull(r9)) {
                                        }
                                        if (V0.isNull(r10)) {
                                        }
                                        if (V0.isNull(r11)) {
                                        }
                                        if (F012 == null) {
                                        }
                                        if (V0.isNull(r12)) {
                                        }
                                        if (((int) V0.getLong(i3)) != 0) {
                                        }
                                        if (((int) V0.getLong(i5)) != 0) {
                                        }
                                        if (V0.isNull(i31)) {
                                        }
                                        i23 = r4;
                                        i15 = r5;
                                        int i6122 = (int) V0.getLong(i31);
                                        if (V0.isNull(i34)) {
                                        }
                                        if (V0.isNull(i2)) {
                                        }
                                        if (V0.isNull(i2)) {
                                        }
                                        Map z722 = sz8Var.z(F05);
                                        if (V0.isNull(i33)) {
                                        }
                                        i12 = r6;
                                        fieldTranslations4 = new FieldTranslations(z722, sz8Var.z(F06));
                                        subTeam = new SubTeam(i6122, F015, fieldTranslations4);
                                        i35 = r19;
                                        if (V0.isNull(i35)) {
                                        }
                                        i37 = r21;
                                        i26 = r22;
                                        i22 = r12;
                                        int i602222222 = (int) V0.getLong(i35);
                                        if (!V0.isNull(i36)) {
                                        }
                                        if (V0.isNull(i37)) {
                                        }
                                        if (V0.isNull(i37)) {
                                        }
                                        Map z62222222 = sz8Var.z(F03);
                                        if (V0.isNull(i26)) {
                                        }
                                        i21 = i37;
                                        fieldTranslations3 = new FieldTranslations(z62222222, sz8Var.z(F04));
                                        subTeam2 = new SubTeam(i602222222, F014, fieldTranslations3);
                                        i38 = r23;
                                        if (V0.isNull(i38)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                        i27 = r25;
                                        if (V0.isNull(i27)) {
                                        }
                                        if (!V0.isNull(i27)) {
                                        }
                                        if (V0.isNull(i25)) {
                                        }
                                        i18 = i39;
                                        country = new Country(F013, F02);
                                        i28 = r27;
                                        if (V0.isNull(i28)) {
                                        }
                                        i16 = i10;
                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                        team = new Team(i5822, F0822, F0922, j222, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                        i29 = r29;
                                        if (V0.isNull(i29)) {
                                        }
                                        Map z3222222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                        if (V0.isNull(i30)) {
                                        }
                                        nlgVar = V0;
                                        fieldTranslations = new FieldTranslations(z3222222222222222, sz8Var.z(F0));
                                        ArrayList arrayList32222222222222222 = arrayList;
                                        arrayList32222222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                        int i552222222222222222 = i24;
                                        r17 = i2;
                                        r13 = i3;
                                        r14 = i552222222222222222;
                                        int i562222222222222222 = i17;
                                        r24 = i18;
                                        r23 = i562222222222222222;
                                        r16 = i11;
                                        arrayList2 = arrayList32222222222222222;
                                        r27 = i28;
                                        r30 = i30;
                                        sz8Var3 = sz8Var;
                                        r12 = i22;
                                        r19 = i20;
                                        V0 = nlgVar;
                                        r = i4;
                                        r2 = i6;
                                        r3 = i8;
                                        r26 = i25;
                                        r21 = i21;
                                        r20 = i19;
                                        r15 = i14;
                                        r6 = i12;
                                        r22 = i26;
                                        r5 = i15;
                                        r28 = i16;
                                        r25 = i27;
                                        r4 = i23;
                                        r18 = i13;
                                    } else {
                                        i6 = r2;
                                        i = i44;
                                        i2 = r17;
                                        i7 = r15;
                                        i8 = r3;
                                        i9 = r16;
                                        arrayList = arrayList2;
                                        i10 = r28;
                                        i31 = i7;
                                        int i57222 = i9;
                                        int i58222 = (int) V0.getLong(r4);
                                        String F08222 = V0.F0(r5);
                                        String F09222 = V0.F0(r6);
                                        long j2222 = V0.getLong(r7);
                                        int i59222 = (int) V0.getLong(r8);
                                        if (V0.isNull(r9)) {
                                        }
                                        if (V0.isNull(r10)) {
                                        }
                                        if (V0.isNull(r11)) {
                                        }
                                        if (F012 == null) {
                                        }
                                        if (V0.isNull(r12)) {
                                        }
                                        if (((int) V0.getLong(i3)) != 0) {
                                        }
                                        if (((int) V0.getLong(i5)) != 0) {
                                        }
                                        if (V0.isNull(i31)) {
                                        }
                                        i23 = r4;
                                        i15 = r5;
                                        int i61222 = (int) V0.getLong(i31);
                                        if (V0.isNull(i34)) {
                                        }
                                        if (V0.isNull(i2)) {
                                        }
                                        if (V0.isNull(i2)) {
                                        }
                                        Map z7222 = sz8Var.z(F05);
                                        if (V0.isNull(i33)) {
                                        }
                                        i12 = r6;
                                        fieldTranslations4 = new FieldTranslations(z7222, sz8Var.z(F06));
                                        subTeam = new SubTeam(i61222, F015, fieldTranslations4);
                                        i35 = r19;
                                        if (V0.isNull(i35)) {
                                        }
                                        i37 = r21;
                                        i26 = r22;
                                        i22 = r12;
                                        int i6022222222 = (int) V0.getLong(i35);
                                        if (!V0.isNull(i36)) {
                                        }
                                        if (V0.isNull(i37)) {
                                        }
                                        if (V0.isNull(i37)) {
                                        }
                                        Map z622222222 = sz8Var.z(F03);
                                        if (V0.isNull(i26)) {
                                        }
                                        i21 = i37;
                                        fieldTranslations3 = new FieldTranslations(z622222222, sz8Var.z(F04));
                                        subTeam2 = new SubTeam(i6022222222, F014, fieldTranslations3);
                                        i38 = r23;
                                        if (V0.isNull(i38)) {
                                        }
                                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                                        i27 = r25;
                                        if (V0.isNull(i27)) {
                                        }
                                        if (!V0.isNull(i27)) {
                                        }
                                        if (V0.isNull(i25)) {
                                        }
                                        i18 = i39;
                                        country = new Country(F013, F02);
                                        i28 = r27;
                                        if (V0.isNull(i28)) {
                                        }
                                        i16 = i10;
                                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                                        team = new Team(i58222, F08222, F09222, j2222, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                                        i29 = r29;
                                        if (V0.isNull(i29)) {
                                        }
                                        Map z32222222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                                        if (V0.isNull(i30)) {
                                        }
                                        nlgVar = V0;
                                        fieldTranslations = new FieldTranslations(z32222222222222222, sz8Var.z(F0));
                                        ArrayList arrayList322222222222222222 = arrayList;
                                        arrayList322222222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                                        int i5522222222222222222 = i24;
                                        r17 = i2;
                                        r13 = i3;
                                        r14 = i5522222222222222222;
                                        int i5622222222222222222 = i17;
                                        r24 = i18;
                                        r23 = i5622222222222222222;
                                        r16 = i11;
                                        arrayList2 = arrayList322222222222222222;
                                        r27 = i28;
                                        r30 = i30;
                                        sz8Var3 = sz8Var;
                                        r12 = i22;
                                        r19 = i20;
                                        V0 = nlgVar;
                                        r = i4;
                                        r2 = i6;
                                        r3 = i8;
                                        r26 = i25;
                                        r21 = i21;
                                        r20 = i19;
                                        r15 = i14;
                                        r6 = i12;
                                        r22 = i26;
                                        r5 = i15;
                                        r28 = i16;
                                        r25 = i27;
                                        r4 = i23;
                                        r18 = i13;
                                    }
                                } else {
                                    i4 = r;
                                    i = i44;
                                    i2 = r17;
                                }
                            } else {
                                i = i44;
                                i2 = r17;
                                i3 = i42;
                                i4 = r;
                            }
                            fieldTranslations = new FieldTranslations(z32222222222222222, sz8Var.z(F0));
                            ArrayList arrayList3222222222222222222 = arrayList;
                            arrayList3222222222222222222.add(new Player(i, F07, j, team, fieldTranslations));
                            int i55222222222222222222 = i24;
                            r17 = i2;
                            r13 = i3;
                            r14 = i55222222222222222222;
                            int i56222222222222222222 = i17;
                            r24 = i18;
                            r23 = i56222222222222222222;
                            r16 = i11;
                            arrayList2 = arrayList3222222222222222222;
                            r27 = i28;
                            r30 = i30;
                            sz8Var3 = sz8Var;
                            r12 = i22;
                            r19 = i20;
                            V0 = nlgVar;
                            r = i4;
                            r2 = i6;
                            r3 = i8;
                            r26 = i25;
                            r21 = i21;
                            r20 = i19;
                            r15 = i14;
                            r6 = i12;
                            r22 = i26;
                            r5 = i15;
                            r28 = i16;
                            r25 = i27;
                            r4 = i23;
                            r18 = i13;
                        } catch (Throwable th) {
                            th = th;
                            nlgVar.close();
                            throw th;
                        }
                        i5 = i43;
                        i6 = r2;
                        i7 = r15;
                        i8 = r3;
                        i9 = r16;
                        arrayList = arrayList2;
                        i10 = r28;
                        i31 = i7;
                        int i572222 = i9;
                        int i582222 = (int) V0.getLong(r4);
                        String F082222 = V0.F0(r5);
                        String F092222 = V0.F0(r6);
                        long j22222 = V0.getLong(r7);
                        int i592222 = (int) V0.getLong(r8);
                        if (V0.isNull(r9)) {
                        }
                        if (V0.isNull(r10)) {
                        }
                        if (V0.isNull(r11)) {
                        }
                        if (F012 == null) {
                        }
                        if (V0.isNull(r12)) {
                        }
                        if (((int) V0.getLong(i3)) != 0) {
                        }
                        if (((int) V0.getLong(i5)) != 0) {
                        }
                        if (V0.isNull(i31)) {
                        }
                        i23 = r4;
                        i15 = r5;
                        int i612222 = (int) V0.getLong(i31);
                        if (V0.isNull(i34)) {
                        }
                        if (V0.isNull(i2)) {
                        }
                        if (V0.isNull(i2)) {
                        }
                        Map z72222 = sz8Var.z(F05);
                        if (V0.isNull(i33)) {
                        }
                        i12 = r6;
                        fieldTranslations4 = new FieldTranslations(z72222, sz8Var.z(F06));
                        subTeam = new SubTeam(i612222, F015, fieldTranslations4);
                        i35 = r19;
                        if (V0.isNull(i35)) {
                        }
                        i37 = r21;
                        i26 = r22;
                        i22 = r12;
                        int i60222222222 = (int) V0.getLong(i35);
                        if (!V0.isNull(i36)) {
                        }
                        if (V0.isNull(i37)) {
                        }
                        if (V0.isNull(i37)) {
                        }
                        Map z6222222222 = sz8Var.z(F03);
                        if (V0.isNull(i26)) {
                        }
                        i21 = i37;
                        fieldTranslations3 = new FieldTranslations(z6222222222, sz8Var.z(F04));
                        subTeam2 = new SubTeam(i60222222222, F014, fieldTranslations3);
                        i38 = r23;
                        if (V0.isNull(i38)) {
                        }
                        sport = new Sport((int) V0.getLong(i38), V0.F0(i39));
                        i27 = r25;
                        if (V0.isNull(i27)) {
                        }
                        if (!V0.isNull(i27)) {
                        }
                        if (V0.isNull(i25)) {
                        }
                        i18 = i39;
                        country = new Country(F013, F02);
                        i28 = r27;
                        if (V0.isNull(i28)) {
                        }
                        i16 = i10;
                        fieldTranslations2 = new FieldTranslations(sz8Var.z(V0.isNull(i28) ? null : V0.F0(i28)), sz8Var.z(V0.isNull(i10) ? null : V0.F0(i10)));
                        team = new Team(i582222, F082222, F092222, j22222, i32, F010, F011, subTeam, subTeam2, stringToGender, sport, valueOf, z4, z5, country, fieldTranslations2);
                        i29 = r29;
                        if (V0.isNull(i29)) {
                        }
                        Map z322222222222222222 = sz8Var.z(!V0.isNull(i29) ? null : V0.F0(i29));
                        if (V0.isNull(i30)) {
                        }
                        nlgVar = V0;
                    }
                    nlg nlgVar2 = V0;
                    ArrayList arrayList4 = arrayList2;
                    nlgVar2.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    th = th2;
                    nlgVar = V0;
                }
                break;
            case 3:
                i9a.F((dt5) this.b, ((Integer) obj).intValue());
                return Unit.a;
            case 4:
                PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) this.b;
                List<Transfer> list2 = (List) obj;
                int i65 = PlayerTransfersActivity.R;
                PlayerTransferFilterData playerTransferFilterData = playerTransfersActivity.P().g;
                if (playerTransferFilterData != null) {
                    ((dvj) playerTransfersActivity.N.getValue()).setFilters(playerTransferFilterData);
                }
                list2.getClass();
                if (!list2.isEmpty()) {
                    if (playerTransfersActivity.P().f) {
                        rvj O = playerTransfersActivity.O();
                        ArrayList arrayList5 = O.i;
                        if (!list2.isEmpty()) {
                            ArrayList arrayList6 = new ArrayList();
                            lvj lvjVar = !arrayList5.isEmpty() ? (lvj) CollectionsKt.h0(arrayList5) : null;
                            for (Transfer transfer : list2) {
                                if (lvjVar != null) {
                                    Player player = ((Transfer) CollectionsKt.Y(lvjVar.a)).getPlayer();
                                    Integer valueOf2 = player != null ? Integer.valueOf(player.getId()) : null;
                                    Player player2 = transfer.getPlayer();
                                    z = Intrinsics.c(valueOf2, player2 != null ? Integer.valueOf(player2.getId()) : null);
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    lvjVar = new lvj(transfer, O.n);
                                    arrayList6.add(lvjVar);
                                } else if (lvjVar != null) {
                                    transfer.getClass();
                                    lvjVar.a = CollectionsKt.x0(lvjVar.a, transfer);
                                }
                            }
                            O.F(CollectionsKt.w0(arrayList6, arrayList5));
                        }
                    } else {
                        playerTransfersActivity.O().G(list2);
                    }
                }
                ((am8) playerTransfersActivity.P.getValue()).a.setVisibility(8);
                boolean isEmpty = playerTransfersActivity.O().i.isEmpty();
                mqi mqiVar = playerTransfersActivity.Q;
                if (isEmpty) {
                    ((jdd) mqiVar.getValue()).a.setVisibility(0);
                } else {
                    ((jdd) mqiVar.getValue()).a.setVisibility(8);
                }
                return Unit.a;
            case 5:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.b;
                int intValue = ((Integer) obj).intValue();
                return serialDescriptor.e(intValue) + ": " + serialDescriptor.g(intValue).h();
            case 6:
                a0f a0fVar = (a0f) this.b;
                vv2 vv2Var = (vv2) obj;
                vv2Var.getClass();
                l98.h0(phi.a);
                g7f g7fVar = uhi.b;
                km5 km5Var = km5.a;
                vv2Var.a("type", g7fVar, km5Var, false);
                vv2Var.a(U3.i.X, aik.x("kotlinx.serialization.Polymorphic<" + a0fVar.a.getSimpleName() + '>', o5h.f, new SerialDescriptor[0]), km5Var, false);
                List list3 = a0fVar.b;
                list3.getClass();
                vv2Var.b = list3;
                return Unit.a;
            case 7:
                Class cls = (Class) this.b;
                j1f j1fVar = (j1f) obj;
                j1fVar.getClass();
                List list4 = j1fVar.d;
                if (!list4.contains(cls) && !list4.isEmpty()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
                PopularPlayersModal popularPlayersModal = (PopularPlayersModal) this.b;
                List list5 = (List) obj;
                if (list5 != null) {
                    ((u1f) popularPlayersModal.C.getValue()).F(list5);
                } else {
                    popularPlayersModal.j();
                }
                return Unit.a;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ProfileData profileData = (ProfileData) obj;
                int i66 = ProfileActivity.Q;
                CollapsibleProfileHeaderView collapsibleProfileHeaderView = profileActivity.Q().d;
                profileData.getClass();
                bv1 bv1Var = collapsibleProfileHeaderView.a;
                ((TextView) bv1Var.d).setVisibility(profileData.getJoinDate() != 0 ? 0 : 8);
                if (profileData.getJoinDate() != 0) {
                    long joinDate = profileData.getJoinDate();
                    bi4 bi4Var = bi4.PATTERN_DMY;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    ((TextView) bv1Var.d).setText(collapsibleProfileHeaderView.getContext().getString(R.string.joined, fc6.i(joinDate, hk4.a(bi4Var.d()))));
                }
                as9.s((ImageView) bv1Var.f, profileData.getId());
                collapsibleProfileHeaderView.setUserName(profileData.getNickname());
                profileActivity.Q().d.b(profileData.getUserBadge(), profileData.getEditor(), profileData.getEditorName());
                profileActivity.Q().d.setOnBadgeRoleClickListener(new zbe(13, profileData, profileActivity));
                return Unit.a;
            case 10:
                ProfileEditActivity profileEditActivity = (ProfileEditActivity) this.b;
                int i67 = ProfileEditActivity.L;
                ((Unit) obj).getClass();
                profileEditActivity.setResult(-1, profileEditActivity.getIntent());
                return Unit.a;
            case 11:
                f4g f4gVar = (f4g) obj;
                f4gVar.y(((ghf) this.b).e.h() - Float.intBitsToFloat((int) (f4gVar.r & 4294967295L)));
                return Unit.a;
            case 12:
                a88 a88Var = (a88) this.b;
                b4h b4hVar = (b4h) obj;
                if (a88Var.invoke() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    y3h.i(b4hVar, new dcf(a88Var.invoke(), new lz2(1.0f)));
                }
                return Unit.a;
            case 13:
                bjf bjfVar = (bjf) this.b;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean("PREF_" + bjfVar.name() + "_SHOW_QUICK_LINK", true));
            case 14:
                ((woc) ((z3f) this.b).d).b.setElevation(((Float) obj).floatValue());
                return Unit.a;
            case 15:
                cmf C = ((RankingFragment) this.b).C();
                C.getClass();
                new zk2(C, 7).filter((CharSequence) obj);
                return Unit.a;
            case 16:
                RankingsActivity rankingsActivity = (RankingsActivity) this.b;
                mqi mqiVar2 = rankingsActivity.M;
                int i68 = RankingsActivity.O;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    d41.w((mmf) mqiVar2.getValue(), (amf) it.next());
                }
                if (((mmf) mqiVar2.getValue()).l.size() < 2) {
                    rankingsActivity.R().g.setVisibility(8);
                } else {
                    rankingsActivity.R().i.setCurrentItem(rankingsActivity.T(Integer.valueOf(rankingsActivity.N)));
                }
                return Unit.a;
            case 17:
                ((sg3) this.b).l(obj);
                return Unit.a;
            case 18:
                kqf kqfVar = (kqf) this.b;
                Throwable th3 = (Throwable) obj;
                CancellationException e = ml4.e("Recomposer effect job completed", th3);
                synchronized (kqfVar.d) {
                    try {
                        yda ydaVar = kqfVar.e;
                        if (ydaVar != null) {
                            fdi fdiVar = kqfVar.v;
                            iqf iqfVar = iqf.b;
                            fdiVar.getClass();
                            fdiVar.m(null, iqfVar);
                            ydaVar.e(e);
                            kqfVar.s = null;
                            ydaVar.n(new aaf(6, kqfVar, th3));
                        } else {
                            kqfVar.f = e;
                            fdi fdiVar2 = kqfVar.v;
                            iqf iqfVar2 = iqf.a;
                            fdiVar2.getClass();
                            fdiVar2.m(null, iqfVar2);
                            Unit unit = Unit.a;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return Unit.a;
            case 19:
                ((mqf) this.b).a((vg5) obj);
                return Unit.a;
            case 20:
                ((qsf) this.b).G(((Integer) obj).intValue());
                return Unit.a;
            case 21:
                ReferralActivity referralActivity = (ReferralActivity) this.b;
                ltf ltfVar = (ltf) obj;
                int i69 = ReferralActivity.N;
                ltfVar.getClass();
                if (ltfVar instanceof ktf) {
                    zbe zbeVar = new zbe(20, referralActivity, ltfVar);
                    AlertDialog create = new AlertDialog.Builder(referralActivity, R.style.RedesignDialog).create();
                    h04 b = h04.b(LayoutInflater.from(referralActivity));
                    b.d.setText(referralActivity.getString(R.string.quit_squad_rewards_popover));
                    b.c.setText(referralActivity.getString(R.string.referra_program_quit_body));
                    create.setView(b.b);
                    create.setButton(-2, referralActivity.getString(R.string.cancel), new i0(create, 9));
                    create.setButton(-1, referralActivity.getString(R.string.quit_button), new pn(zbeVar, i40));
                    create.show();
                    Button button = create.getButton(-1);
                    nv.l0(referralActivity, dv.OTHER, bv.FAVORITES_TO_PINNED_LEAGUES_DISMISS, null);
                    button.setTextColor(ColorStateList.valueOf(referralActivity.getColor(R.color.on_color_primary)));
                    button.setBackgroundTintList(ColorStateList.valueOf(referralActivity.getColor(R.color.error)));
                } else {
                    ((buf) referralActivity.K.getValue()).t(ltfVar);
                }
                return Unit.a;
            case 22:
                UserRegionResponse userRegionResponse = (UserRegionResponse) this.b;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putString("REGION_ANALYTICS_CONTINENT", userRegionResponse.getContinentCode());
                editor.putString("REGION_ANALYTICS_COUNTRY", userRegionResponse.getCountry());
                editor.putString("REGION_ANALYTICS_REGION", userRegionResponse.getRegionCode());
                editor.putString("REGION_ANALYTICS_CITY", userRegionResponse.getCity());
                return Unit.a;
            case 23:
                o85 o85Var = (o85) this.b;
                long j3 = ((dnd) obj).a;
                Iterator it2 = o85Var.a.j().k.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        dsa dsaVar = (dsa) obj2;
                        int i70 = dsaVar.o;
                        int i71 = dsaVar.p + i70;
                        int intBitsToFloat = (int) Float.intBitsToFloat((int) (j3 & 4294967295L));
                        if (i70 > intBitsToFloat || intBitsToFloat > i71) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                dsa dsaVar2 = (dsa) obj2;
                if (dsaVar2 != null) {
                    Object obj3 = dsaVar2.l;
                    v95 v95Var = obj3 instanceof v95 ? (v95) obj3 : null;
                    if (v95Var != null && v95Var.b) {
                        ((eoh) o85Var.d).setValue(dsaVar2);
                        ((eoh) o85Var.c).setValue(Integer.valueOf(v95Var.a));
                        ((eoh) o85Var.e).setValue(v95Var.c);
                    }
                }
                return Unit.a;
            case 24:
                RiskyChatsDialog riskyChatsDialog = (RiskyChatsDialog) this.b;
                List list6 = (List) obj;
                z3f z3fVar = riskyChatsDialog.C;
                if (z3fVar == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                ((GraphicLarge) z3fVar.c).setVisibility(list6.isEmpty() ? 0 : 8);
                z3f z3fVar2 = riskyChatsDialog.C;
                if (z3fVar2 == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                ((RecyclerView) z3fVar2.d).setVisibility(list6.isEmpty() ? 8 : 0);
                nm5 nm5Var = riskyChatsDialog.D;
                if (nm5Var != null) {
                    nm5Var.F(list6);
                    return Unit.a;
                }
                Intrinsics.i("dialogAdapter");
                throw null;
            case 25:
                d6g d6gVar = (d6g) this.b;
                dni dniVar = (dni) obj;
                dniVar.getClass();
                d6gVar.h = dniVar;
                return Unit.a;
            case 26:
                k6g k6gVar = (k6g) this.b;
                hg4 hg4Var = (hg4) obj;
                hg4Var.getClass();
                return k6gVar.createOpenHelper(hg4Var);
            case 27:
                kcg kcgVar = (kcg) this.b;
                long longValue = ((Long) obj).longValue();
                hcg hcgVar = kcgVar.c;
                String valueOf3 = String.valueOf((int) Math.ceil(longValue / 1000.0d));
                hcgVar.getClass();
                valueOf3.getClass();
                xw3.L(hcgVar.a, null, null, new m1f(hcgVar, valueOf3, objArr == true ? 1 : 0, i41), 3);
                return Unit.a;
            case 28:
                return a(obj);
            default:
                jdg jdgVar = (jdg) this.b;
                String str = (String) obj;
                str.getClass();
                String str2 = jdgVar.c;
                String str3 = ncg.a.a;
                gbg gbgVar = new gbg();
                String str4 = "";
                String concat = (str2 == null || str2.length() == 0) ? "" : "\n".concat(str2);
                if (!StringsKt.J(str, "\"mraid.js\"", false) && !StringsKt.J(str, "'mraid.js'", false)) {
                    str4 = "<script src=\"mraid.js\"></script>";
                }
                if (!StringsKt.J(str, "\"https://apps.sascdn.com/sdk/omsdk/1.6.1/omsdk-v1.min.js\"", false) && !StringsKt.J(str, "'https://apps.sascdn.com/sdk/omsdk/1.6.1/omsdk-v1.min.js'", false)) {
                    str4 = str4.concat("<script src=\"https://apps.sascdn.com/sdk/omsdk/1.6.1/omsdk-v1.min.js\"></script>");
                }
                if (str4.length() > 0) {
                    str4 = str4.concat("\n");
                }
                if (djg.a.f(str)) {
                    sb = lnb.o(str4, str, concat);
                } else {
                    StringBuilder s = mz1.s("<!DOCTYPE html><html><head><meta name=\"viewport\" content=\"initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n", str4, "</head><body style=\"text-align:center;margin:0\">\n", str, concat);
                    s.append("\n</body></html>");
                    sb = s.toString();
                }
                gbgVar.a = c.t(c.t(sb, "\"mraid.js\"", lnb.o("\"", str3, "\""), false), "'mraid.js'", lnb.o("'", str3, "'"), false);
                return gbgVar;
        }
    }

    public /* synthetic */ mme(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
