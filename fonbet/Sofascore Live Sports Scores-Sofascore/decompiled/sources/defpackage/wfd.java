package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wfd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yfd b;
    public final /* synthetic */ LinkedHashMap c;

    public /* synthetic */ wfd(yfd yfdVar, LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = yfdVar;
        this.c = linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x075a, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.MINI_FOOTBALL) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0763, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.FOOTBALL) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0794, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.FUTSAL) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x016e, code lost:
    
        if (r8.equals(r9) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x017b, code lost:
    
        r5 = com.sofascore.results.R.string.game_period_result;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0175, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0385, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.MINI_FOOTBALL) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x03d5, code lost:
    
        r5 = com.sofascore.results.R.string.score_football;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x038e, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.FOOTBALL) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0397, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.TABLE_TENNIS) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x03e5, code lost:
    
        r5 = com.sofascore.results.R.string.score_set;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x03a0, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.BANDY) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x03a9, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.WATERPOLO) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03b2, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.BEACH_VOLLEY) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03b9, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.TENNIS) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03c2, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.VOLLEYBALL) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03cb, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.FUTSAL) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03d2, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03df, code lost:
    
        if (r8.equals(com.sofascore.model.Sports.BADMINTON) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0578, code lost:
    
        if (r12.equals(r5) != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0581, code lost:
    
        if (r12.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L252;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x054d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05bf  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        Object obj2;
        String str;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        ArrayList arrayList;
        Object obj5;
        Object obj6;
        String str4;
        Object obj7;
        String str5;
        int i;
        Object obj8;
        Object obj9;
        String name;
        Integer num;
        int hashCode;
        String str6;
        Object obj10;
        Object obj11;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2;
        Object obj12;
        Object obj13;
        String str11;
        String str12;
        int i3;
        switch (this.a) {
            case 0:
                yfd yfdVar = this.b;
                LinkedHashMap linkedHashMap = this.c;
                vfd vfdVar = (vfd) obj;
                vfdVar.getClass();
                gv9 t = yfdVar.t(vfdVar.a, linkedHashMap);
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            z = true;
                            return vfd.a(vfdVar, t, false, false, z, 0L, 22);
                        }
                    }
                }
                z = false;
                return vfd.a(vfdVar, t, false, false, z, 0L, 22);
            default:
                yfd yfdVar2 = this.b;
                LinkedHashMap linkedHashMap2 = this.c;
                vfd vfdVar2 = (vfd) obj;
                List list = yfdVar2.n;
                String str13 = Sports.FLOORBALL;
                String str14 = "period_score";
                String str15 = "period_start";
                String str16 = "highlights";
                String str17 = "player_rating_available";
                String str18 = Sports.CRICKET;
                Object obj14 = "suggestions";
                Object obj15 = "weekly_challenge";
                Object obj16 = "round_info";
                Object obj17 = "info";
                Object obj18 = "player_media";
                String str19 = "player_game";
                Object obj19 = "other";
                list.getClass();
                Object obj20 = "start";
                Object obj21 = "lineups";
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    NotificationSetting notificationSetting = (NotificationSetting) it2.next();
                    String name2 = notificationSetting.getName();
                    Iterator it3 = it2;
                    String name3 = notificationSetting.getName();
                    String group = notificationSetting.getGroup();
                    switch (name3.hashCode()) {
                        case -1709465524:
                            String str20 = str13;
                            obj2 = obj14;
                            str = str20;
                            Object obj22 = obj16;
                            str2 = str18;
                            obj3 = obj22;
                            Object obj23 = obj15;
                            str3 = str14;
                            obj4 = obj23;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            if (!name3.equals("current_score")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            switch (group.hashCode()) {
                                case -2005973498:
                                    break;
                                case -2002238939:
                                    break;
                                case -1263172551:
                                    break;
                                case -1160328212:
                                    break;
                                case -877324069:
                                    break;
                                case -433846249:
                                    break;
                                case -213321383:
                                    break;
                                case 93503716:
                                    break;
                                case 203883450:
                                    break;
                                case 394668909:
                                    break;
                                case 932645060:
                                    break;
                                default:
                                    i = R.string.score;
                                    break;
                            }
                            q9k q9kVar = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    if (name.equals(obj2)) {
                                        num = Integer.valueOf(R.string.contributions_body);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case -1249310171:
                                    if (name.equals(obj4)) {
                                        num = Integer.valueOf(R.string.deadlines_reminders_results);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case -146262849:
                                    if (name.equals(obj3)) {
                                        num = Integer.valueOf(R.string.key_alerts_body);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case 3237038:
                                    if (name.equals(obj5)) {
                                        num = Integer.valueOf(R.string.new_competitions_body);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case 84476166:
                                    if (name.equals(obj7)) {
                                        num = Integer.valueOf(R.string.headlines_transfers_recaps);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case 556732048:
                                    if (name.equals(str19)) {
                                        num = Integer.valueOf(R.string.ratings_and_key_updates);
                                        break;
                                    }
                                    num = null;
                                    break;
                                case 1638533572:
                                    if (name.equals("predictions")) {
                                        num = Integer.valueOf(R.string.predictions_notifications_body);
                                        break;
                                    }
                                    num = null;
                                    break;
                                default:
                                    num = null;
                                    break;
                            }
                            q9k q9kVar2 = num != null ? new q9k(num.intValue()) : null;
                            String name4 = notificationSetting.getName();
                            String group2 = notificationSetting.getGroup();
                            hashCode = name4.hashCode();
                            int i4 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    String str21 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str21;
                                    str9 = str4;
                                    str10 = str19;
                                    if (!name4.equals("current_score")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    switch (group2.hashCode()) {
                                        case -2002238939:
                                            if (group2.equals(Sports.ICE_HOCKEY)) {
                                                i4 = R.drawable.ic_hockey_puck;
                                                i2 = i4;
                                                break;
                                            }
                                            i2 = R.drawable.ic_score;
                                            break;
                                        case -1711979509:
                                            if (group2.equals(str6)) {
                                                i4 = R.drawable.ic_goal_floorball_20;
                                                i2 = i4;
                                                break;
                                            }
                                            i2 = R.drawable.ic_score;
                                            break;
                                        case -1263172551:
                                            break;
                                        case -877324069:
                                            if (group2.equals(Sports.TENNIS)) {
                                                i4 = R.drawable.ic_score_set_tennis;
                                                i2 = i4;
                                                break;
                                            }
                                            i2 = R.drawable.ic_score;
                                            break;
                                        case -213321383:
                                            if (group2.equals(Sports.WATERPOLO)) {
                                                i4 = R.drawable.ic_goal_waterpolo;
                                                i2 = i4;
                                                break;
                                            }
                                            i2 = R.drawable.ic_score;
                                            break;
                                        case 93503716:
                                            if (group2.equals(Sports.BANDY)) {
                                                i4 = R.drawable.ic_goal_bandy_20;
                                                i2 = i4;
                                                break;
                                            }
                                            i2 = R.drawable.ic_score;
                                            break;
                                        case 394668909:
                                            break;
                                        case 932645060:
                                            break;
                                        default:
                                            i2 = R.drawable.ic_score;
                                            break;
                                    }
                                    ArrayList arrayList3 = arrayList;
                                    arrayList3.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24 = obj5;
                                    arrayList2 = arrayList3;
                                    str19 = str10;
                                    obj17 = obj24;
                                    String str22 = str2;
                                    obj16 = obj3;
                                    str18 = str22;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -1525319953:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj2)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_crowdsourcing;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList32 = arrayList;
                                    arrayList32.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242 = obj5;
                                    arrayList2 = arrayList32;
                                    str19 = str10;
                                    obj17 = obj242;
                                    String str222 = str2;
                                    obj16 = obj3;
                                    str18 = str222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -1276231777:
                                    str9 = str4;
                                    obj13 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("prestart")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    obj10 = obj13;
                                    i2 = R.drawable.ic_notification_on_16;
                                    ArrayList arrayList322 = arrayList;
                                    arrayList322.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422 = obj5;
                                    arrayList2 = arrayList322;
                                    str19 = str10;
                                    obj17 = obj2422;
                                    String str2222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -1274442605:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("finish")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_full_time;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList3222 = arrayList;
                                    arrayList3222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222 = obj5;
                                    arrayList2 = arrayList3222;
                                    str19 = str10;
                                    obj17 = obj24222;
                                    String str22222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -1249310171:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj4)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_leagues_empty;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList32222 = arrayList;
                                    arrayList32222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222 = obj5;
                                    arrayList2 = arrayList32222;
                                    str19 = str10;
                                    obj17 = obj242222;
                                    String str222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -1192204437:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("ai_analyst")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_ai_analyst;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList322222 = arrayList;
                                    arrayList322222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222 = obj5;
                                    arrayList2 = arrayList322222;
                                    str19 = str10;
                                    obj17 = obj2422222;
                                    String str2222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -682674039:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("penalty")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_penalty_16;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList3222222 = arrayList;
                                    arrayList3222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222 = obj5;
                                    arrayList2 = arrayList3222222;
                                    str19 = str10;
                                    obj17 = obj24222222;
                                    String str22222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -411869959:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("player_of_the_match_voting")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_heart;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList32222222 = arrayList;
                                    arrayList32222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222 = obj5;
                                    arrayList2 = arrayList32222222;
                                    str19 = str10;
                                    obj17 = obj242222222;
                                    String str222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -146262849:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj3)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList322222222 = arrayList;
                                    arrayList322222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222222 = obj5;
                                    arrayList2 = arrayList322222222;
                                    str19 = str10;
                                    obj17 = obj2422222222;
                                    String str2222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case -53100160:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("halftime")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_halftime;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList3222222222 = arrayList;
                                    arrayList3222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222222 = obj5;
                                    arrayList2 = arrayList3222222222;
                                    str19 = str10;
                                    obj17 = obj24222222222;
                                    String str22222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 3237038:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj5)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_fantasy_notifications;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList32222222222 = arrayList;
                                    arrayList32222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222 = obj5;
                                    arrayList2 = arrayList32222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222;
                                    String str222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 84476166:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj7)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_players_news_notifications;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList322222222222 = arrayList;
                                    arrayList322222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222222222 = obj5;
                                    arrayList2 = arrayList322222222222;
                                    str19 = str10;
                                    obj17 = obj2422222222222;
                                    String str2222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 105510629:
                                    str9 = str4;
                                    obj12 = obj19;
                                    obj11 = obj6;
                                    str10 = str19;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals("missed_penalty")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i4 = R.drawable.ic_missed_penalty;
                                    obj10 = obj12;
                                    i2 = i4;
                                    ArrayList arrayList3222222222222 = arrayList;
                                    arrayList3222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222222222 = obj5;
                                    arrayList2 = arrayList3222222222222;
                                    str19 = str10;
                                    obj17 = obj24222222222222;
                                    String str22222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 106069776:
                                    str9 = str4;
                                    obj13 = obj19;
                                    str10 = str19;
                                    Object obj25 = obj6;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj13)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    obj11 = obj25;
                                    obj10 = obj13;
                                    i2 = R.drawable.ic_notification_on_16;
                                    ArrayList arrayList32222222222222 = arrayList;
                                    arrayList32222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222222 = obj5;
                                    arrayList2 = arrayList32222222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222222;
                                    String str222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 109757538:
                                    str9 = str4;
                                    str10 = str19;
                                    Object obj26 = obj6;
                                    str7 = str3;
                                    str8 = str17;
                                    str6 = str;
                                    if (!name4.equals(obj26)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    if (Intrinsics.c(group2, Sports.TENNIS)) {
                                        obj10 = obj19;
                                        i2 = R.drawable.ic_tennis;
                                    } else {
                                        obj10 = obj19;
                                        i2 = R.drawable.ic_referee;
                                    }
                                    obj11 = obj26;
                                    ArrayList arrayList322222222222222 = arrayList;
                                    arrayList322222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222222222222 = obj5;
                                    arrayList2 = arrayList322222222222222;
                                    str19 = str10;
                                    obj17 = obj2422222222222222;
                                    String str2222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 176922820:
                                    String str23 = str3;
                                    str8 = str17;
                                    String str24 = str;
                                    str9 = str4;
                                    str10 = str19;
                                    Object obj27 = obj21;
                                    if (!name4.equals(obj27)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    obj21 = obj27;
                                    obj10 = obj19;
                                    i2 = R.drawable.ic_lineups;
                                    obj11 = obj6;
                                    str7 = str23;
                                    str6 = str24;
                                    ArrayList arrayList3222222222222222 = arrayList;
                                    arrayList3222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222222222222 = obj5;
                                    arrayList2 = arrayList3222222222222222;
                                    str19 = str10;
                                    obj17 = obj24222222222222222;
                                    String str22222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 300548756:
                                    String str25 = str3;
                                    str8 = str17;
                                    str9 = str4;
                                    str10 = str19;
                                    str11 = str2;
                                    if (!name4.equals(str25)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    switch (group2.hashCode()) {
                                        case -2002238939:
                                            str12 = str;
                                            break;
                                        case -1711979509:
                                            str12 = str;
                                            break;
                                        case -877324069:
                                            if (group2.equals(Sports.TENNIS)) {
                                                str12 = str;
                                                str2 = str11;
                                                obj10 = obj19;
                                                obj11 = obj6;
                                                i2 = R.drawable.ic_score;
                                                str7 = str25;
                                                str6 = str12;
                                                break;
                                            }
                                            str12 = str;
                                            str2 = str11;
                                            obj10 = obj19;
                                            i2 = R.drawable.ic_quarter;
                                            obj11 = obj6;
                                            str7 = str25;
                                            str6 = str12;
                                        case 1032299505:
                                            if (group2.equals(str11)) {
                                                i4 = R.drawable.ic_wicket_notifications;
                                                str6 = str;
                                                obj10 = obj19;
                                                obj11 = obj6;
                                                str7 = str25;
                                                str2 = str11;
                                                i2 = i4;
                                                break;
                                            }
                                            str12 = str;
                                            str2 = str11;
                                            obj10 = obj19;
                                            i2 = R.drawable.ic_quarter;
                                            obj11 = obj6;
                                            str7 = str25;
                                            str6 = str12;
                                            break;
                                        default:
                                            str12 = str;
                                            str2 = str11;
                                            obj10 = obj19;
                                            i2 = R.drawable.ic_quarter;
                                            obj11 = obj6;
                                            str7 = str25;
                                            str6 = str12;
                                            break;
                                    }
                                    ArrayList arrayList32222222222222222 = arrayList;
                                    arrayList32222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222222222 = obj5;
                                    arrayList2 = arrayList32222222222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222222222;
                                    String str222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 301041764:
                                    String str26 = str4;
                                    str10 = str19;
                                    if (!name4.equals(str26)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    str9 = str26;
                                    str11 = str2;
                                    if (Intrinsics.c(group2, str11)) {
                                        i4 = R.drawable.ic_timer;
                                        String str27 = str17;
                                        str6 = str;
                                        obj10 = obj19;
                                        obj11 = obj6;
                                        str7 = str3;
                                        str8 = str27;
                                        str2 = str11;
                                        i2 = i4;
                                        ArrayList arrayList322222222222222222 = arrayList;
                                        arrayList322222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                        Object obj2422222222222222222 = obj5;
                                        arrayList2 = arrayList322222222222222222;
                                        str19 = str10;
                                        obj17 = obj2422222222222222222;
                                        String str2222222222222222222 = str2;
                                        obj16 = obj3;
                                        str18 = str2222222222222222222;
                                        str16 = str5;
                                        it2 = it3;
                                        obj18 = obj7;
                                        str15 = str9;
                                        obj20 = obj11;
                                        obj19 = obj10;
                                        obj14 = obj2;
                                        str13 = str6;
                                        str17 = str8;
                                        obj15 = obj4;
                                        str14 = str7;
                                    } else {
                                        String str28 = str17;
                                        str6 = str;
                                        obj10 = obj19;
                                        obj11 = obj6;
                                        str7 = str3;
                                        str8 = str28;
                                        str2 = str11;
                                        i2 = R.drawable.ic_referee;
                                        ArrayList arrayList3222222222222222222 = arrayList;
                                        arrayList3222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                        Object obj24222222222222222222 = obj5;
                                        arrayList2 = arrayList3222222222222222222;
                                        str19 = str10;
                                        obj17 = obj24222222222222222222;
                                        String str22222222222222222222 = str2;
                                        obj16 = obj3;
                                        str18 = str22222222222222222222;
                                        str16 = str5;
                                        it2 = it3;
                                        obj18 = obj7;
                                        str15 = str9;
                                        obj20 = obj11;
                                        obj19 = obj10;
                                        obj14 = obj2;
                                        str13 = str6;
                                        str17 = str8;
                                        obj15 = obj4;
                                        str14 = str7;
                                    }
                                case 357304895:
                                    String str29 = str5;
                                    if (!name4.equals(str29)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_more_media;
                                    String str30 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str30;
                                    str5 = str29;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList32222222222222222222 = arrayList;
                                    arrayList32222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222222222222 = obj5;
                                    arrayList2 = arrayList32222222222222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222222222222;
                                    String str222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 556732048:
                                    if (!name4.equals(str19)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_players_notifications;
                                    String str31 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str31;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList322222222222222222222 = arrayList;
                                    arrayList322222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222222222222222222 = obj5;
                                    arrayList2 = arrayList322222222222222222222;
                                    str19 = str10;
                                    obj17 = obj2422222222222222222222;
                                    String str2222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 1075676876:
                                    if (!name4.equals("goal_scorer")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_scorer_hockey_notifications;
                                    String str312 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str312;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList3222222222222222222222 = arrayList;
                                    arrayList3222222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222222222222222222 = obj5;
                                    arrayList2 = arrayList3222222222222222222222;
                                    str19 = str10;
                                    obj17 = obj24222222222222222222222;
                                    String str22222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 1083147041:
                                    if (!name4.equals("redcard")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_card_yellows;
                                    String str3122 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str3122;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList32222222222222222222222 = arrayList;
                                    arrayList32222222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222222222222222 = obj5;
                                    arrayList2 = arrayList32222222222222222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222222222222222;
                                    String str222222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 1638533572:
                                    if (!name4.equals("predictions")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_predictions_menu;
                                    String str31222 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str31222;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList322222222222222222222222 = arrayList;
                                    arrayList322222222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj2422222222222222222222222 = obj5;
                                    arrayList2 = arrayList322222222222222222222222;
                                    str19 = str10;
                                    obj17 = obj2422222222222222222222222;
                                    String str2222222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str2222222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 1749554768:
                                    if (!name4.equals("break_point")) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_ball_tennis;
                                    String str312222 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str312222;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList3222222222222222222222222 = arrayList;
                                    arrayList3222222222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj24222222222222222222222222 = obj5;
                                    arrayList2 = arrayList3222222222222222222222222;
                                    str19 = str10;
                                    obj17 = obj24222222222222222222222222;
                                    String str22222222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str22222222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                case 1895455813:
                                    if (!name4.equals(str17)) {
                                        a70.p("This notification setting is not supported: ".concat(name4));
                                        return null;
                                    }
                                    i3 = R.drawable.ic_rating;
                                    String str3122222 = str17;
                                    str6 = str;
                                    obj10 = obj19;
                                    obj11 = obj6;
                                    str7 = str3;
                                    str8 = str3122222;
                                    str9 = str4;
                                    i2 = i3;
                                    str10 = str19;
                                    ArrayList arrayList32222222222222222222222222 = arrayList;
                                    arrayList32222222222222222222222222.add(new ghd(name2, q9kVar, q9kVar2, i2, notificationSetting.getEnabled(), 32));
                                    Object obj242222222222222222222222222 = obj5;
                                    arrayList2 = arrayList32222222222222222222222222;
                                    str19 = str10;
                                    obj17 = obj242222222222222222222222222;
                                    String str222222222222222222222222222 = str2;
                                    obj16 = obj3;
                                    str18 = str222222222222222222222222222;
                                    str16 = str5;
                                    it2 = it3;
                                    obj18 = obj7;
                                    str15 = str9;
                                    obj20 = obj11;
                                    obj19 = obj10;
                                    obj14 = obj2;
                                    str13 = str6;
                                    str17 = str8;
                                    obj15 = obj4;
                                    str14 = str7;
                                default:
                                    a70.p("This notification setting is not supported: ".concat(name4));
                                    return null;
                            }
                        case -1525319953:
                            Object obj28 = obj14;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals(obj28)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.contribution_settings_name;
                            Object obj29 = obj16;
                            str2 = str18;
                            obj3 = obj29;
                            Object obj30 = obj15;
                            str3 = str14;
                            obj4 = obj30;
                            str = str13;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            obj2 = obj28;
                            str5 = str16;
                            q9k q9kVar3 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42 = notificationSetting.getName();
                            String group22 = notificationSetting.getGroup();
                            hashCode = name42.hashCode();
                            int i42 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -1276231777:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("prestart")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.prestart;
                            String str32 = str13;
                            obj2 = obj14;
                            str = str32;
                            Object obj31 = obj16;
                            str2 = str18;
                            obj3 = obj31;
                            Object obj32 = obj15;
                            str3 = str14;
                            obj4 = obj32;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar32 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422 = notificationSetting.getName();
                            String group222 = notificationSetting.getGroup();
                            hashCode = name422.hashCode();
                            int i422 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -1274442605:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("finish")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.finish;
                            String str322 = str13;
                            obj2 = obj14;
                            str = str322;
                            Object obj312 = obj16;
                            str2 = str18;
                            obj3 = obj312;
                            Object obj322 = obj15;
                            str3 = str14;
                            obj4 = obj322;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar322 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222 = notificationSetting.getName();
                            String group2222 = notificationSetting.getGroup();
                            hashCode = name4222.hashCode();
                            int i4222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -1249310171:
                            arrayList = arrayList2;
                            Object obj33 = obj15;
                            obj5 = obj17;
                            if (!name3.equals(obj33)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.weekly_challenge;
                            String str33 = str13;
                            obj2 = obj14;
                            str = str33;
                            Object obj34 = obj16;
                            str2 = str18;
                            obj3 = obj34;
                            str3 = str14;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            obj4 = obj33;
                            str5 = str16;
                            q9k q9kVar3222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222 = notificationSetting.getName();
                            String group22222 = notificationSetting.getGroup();
                            hashCode = name42222.hashCode();
                            int i42222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -1192204437:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("ai_analyst")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.settings_toggle_halftime_analysis;
                            String str3222 = str13;
                            obj2 = obj14;
                            str = str3222;
                            Object obj3122 = obj16;
                            str2 = str18;
                            obj3 = obj3122;
                            Object obj3222 = obj15;
                            str3 = str14;
                            obj4 = obj3222;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar32222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222 = notificationSetting.getName();
                            String group222222 = notificationSetting.getGroup();
                            hashCode = name422222.hashCode();
                            int i422222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -682674039:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("penalty")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.football_shot_situation_penalty;
                            String str32222 = str13;
                            obj2 = obj14;
                            str = str32222;
                            Object obj31222 = obj16;
                            str2 = str18;
                            obj3 = obj31222;
                            Object obj32222 = obj15;
                            str3 = str14;
                            obj4 = obj32222;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar322222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222 = notificationSetting.getName();
                            String group2222222 = notificationSetting.getGroup();
                            hashCode = name4222222.hashCode();
                            int i4222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -411869959:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("player_of_the_match_voting")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.fans_player_of_the_match_pick;
                            String str322222 = str13;
                            obj2 = obj14;
                            str = str322222;
                            Object obj312222 = obj16;
                            str2 = str18;
                            obj3 = obj312222;
                            Object obj322222 = obj15;
                            str3 = str14;
                            obj4 = obj322222;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar3222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222 = notificationSetting.getName();
                            String group22222222 = notificationSetting.getGroup();
                            hashCode = name42222222.hashCode();
                            int i42222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -146262849:
                            arrayList = arrayList2;
                            Object obj35 = obj16;
                            obj5 = obj17;
                            if (!name3.equals(obj35)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.key_alerts;
                            String str34 = str13;
                            obj2 = obj14;
                            str = str34;
                            Object obj36 = obj15;
                            str3 = str14;
                            obj4 = obj36;
                            str2 = str18;
                            obj3 = obj35;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar32222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222 = notificationSetting.getName();
                            String group222222222 = notificationSetting.getGroup();
                            hashCode = name422222222.hashCode();
                            int i422222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case -53100160:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            if (!name3.equals("halftime")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.halftime;
                            String str3222222 = str13;
                            obj2 = obj14;
                            str = str3222222;
                            Object obj3122222 = obj16;
                            str2 = str18;
                            obj3 = obj3122222;
                            Object obj3222222 = obj15;
                            str3 = str14;
                            obj4 = obj3222222;
                            str4 = str15;
                            obj7 = obj18;
                            obj6 = obj20;
                            str5 = str16;
                            q9k q9kVar322222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222 = notificationSetting.getName();
                            String group2222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222.hashCode();
                            int i4222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 3237038:
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj8 = obj18;
                            if (!name3.equals(obj5)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.new_competitions;
                            String str35 = str13;
                            obj2 = obj14;
                            str = str35;
                            Object obj37 = obj16;
                            str2 = str18;
                            obj3 = obj37;
                            Object obj38 = obj15;
                            str3 = str14;
                            obj4 = obj38;
                            str4 = str15;
                            str5 = str16;
                            obj6 = obj20;
                            obj7 = obj8;
                            q9k q9kVar3222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222222 = notificationSetting.getName();
                            String group22222222222 = notificationSetting.getGroup();
                            hashCode = name42222222222.hashCode();
                            int i42222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 84476166:
                            arrayList = arrayList2;
                            obj8 = obj18;
                            Object obj39 = obj19;
                            if (!name3.equals(obj8)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.news;
                            String str36 = str13;
                            obj2 = obj14;
                            str = str36;
                            Object obj40 = obj16;
                            str2 = str18;
                            obj3 = obj40;
                            Object obj41 = obj15;
                            str3 = str14;
                            obj4 = obj41;
                            obj19 = obj39;
                            str5 = str16;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj8;
                            q9k q9kVar32222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222222 = notificationSetting.getName();
                            String group222222222222 = notificationSetting.getGroup();
                            hashCode = name422222222222.hashCode();
                            int i422222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 105510629:
                            arrayList = arrayList2;
                            Object obj42 = obj19;
                            if (!name3.equals("missed_penalty")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.missed_penalty;
                            String str37 = str13;
                            obj2 = obj14;
                            str = str37;
                            Object obj43 = obj16;
                            str2 = str18;
                            obj3 = obj43;
                            Object obj44 = obj15;
                            str3 = str14;
                            obj4 = obj44;
                            obj19 = obj42;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar322222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222222 = notificationSetting.getName();
                            String group2222222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222222.hashCode();
                            int i4222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 106069776:
                            arrayList = arrayList2;
                            Object obj45 = obj19;
                            obj9 = obj20;
                            if (!name3.equals(obj45)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.other;
                            String str38 = str13;
                            obj2 = obj14;
                            str = str38;
                            Object obj46 = obj16;
                            str2 = str18;
                            obj3 = obj46;
                            Object obj47 = obj15;
                            str3 = str14;
                            obj4 = obj47;
                            obj19 = obj45;
                            obj6 = obj9;
                            obj5 = obj17;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar3222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222222222 = notificationSetting.getName();
                            String group22222222222222 = notificationSetting.getGroup();
                            hashCode = name42222222222222.hashCode();
                            int i42222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 109757538:
                            arrayList = arrayList2;
                            obj9 = obj20;
                            Object obj48 = obj21;
                            if (!name3.equals(obj9)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.start;
                            String str39 = str13;
                            obj2 = obj14;
                            str = str39;
                            Object obj49 = obj16;
                            str2 = str18;
                            obj3 = obj49;
                            Object obj50 = obj15;
                            str3 = str14;
                            obj4 = obj50;
                            obj21 = obj48;
                            obj6 = obj9;
                            obj5 = obj17;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar32222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222222222 = notificationSetting.getName();
                            String group222222222222222 = notificationSetting.getGroup();
                            hashCode = name422222222222222.hashCode();
                            int i422222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 176922820:
                            arrayList = arrayList2;
                            Object obj51 = obj21;
                            if (!name3.equals(obj51)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.lineups;
                            String str40 = str13;
                            obj2 = obj14;
                            str = str40;
                            Object obj52 = obj16;
                            str2 = str18;
                            obj3 = obj52;
                            Object obj53 = obj15;
                            str3 = str14;
                            obj4 = obj53;
                            obj21 = obj51;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar322222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222222222 = notificationSetting.getName();
                            String group2222222222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222222222.hashCode();
                            int i4222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 300548756:
                            arrayList = arrayList2;
                            if (!name3.equals(str14)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            switch (group.hashCode()) {
                                case -2002238939:
                                    break;
                                case -1711979509:
                                    break;
                                case -877324069:
                                    if (group.equals(Sports.TENNIS)) {
                                        i = R.string.period_score_tennis_android_oreo;
                                        break;
                                    }
                                    i = R.string.quarterly_result;
                                    break;
                                case 1032299505:
                                    if (group.equals(str18)) {
                                        i = R.string.period_score_cricket;
                                        break;
                                    }
                                    i = R.string.quarterly_result;
                                    break;
                                default:
                                    i = R.string.quarterly_result;
                                    break;
                            }
                            String str41 = str13;
                            obj2 = obj14;
                            str = str41;
                            Object obj54 = obj16;
                            str2 = str18;
                            obj3 = obj54;
                            Object obj55 = obj15;
                            str3 = str14;
                            obj4 = obj55;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar3222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222222222222 = notificationSetting.getName();
                            String group22222222222222222 = notificationSetting.getGroup();
                            hashCode = name42222222222222222.hashCode();
                            int i42222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 301041764:
                            if (!name3.equals(str15)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            int hashCode2 = group.hashCode();
                            arrayList = arrayList2;
                            if (hashCode2 == -83759494) {
                                if (group.equals(Sports.AMERICAN_FOOTBALL)) {
                                    i = R.string.period_start_quarter;
                                    String str412 = str13;
                                    obj2 = obj14;
                                    str = str412;
                                    Object obj542 = obj16;
                                    str2 = str18;
                                    obj3 = obj542;
                                    Object obj552 = obj15;
                                    str3 = str14;
                                    obj4 = obj552;
                                    obj5 = obj17;
                                    obj6 = obj20;
                                    str4 = str15;
                                    obj7 = obj18;
                                }
                                i = R.string.game_period_start;
                                String str4122 = str13;
                                obj2 = obj14;
                                str = str4122;
                                Object obj5422 = obj16;
                                str2 = str18;
                                obj3 = obj5422;
                                Object obj5522 = obj15;
                                str3 = str14;
                                obj4 = obj5522;
                                obj5 = obj17;
                                obj6 = obj20;
                                str4 = str15;
                                obj7 = obj18;
                            } else if (hashCode2 != 727149765) {
                                if (hashCode2 == 1032299505 && group.equals(str18)) {
                                    i = R.string.cricket_innings_breaks;
                                    String str41222 = str13;
                                    obj2 = obj14;
                                    str = str41222;
                                    Object obj54222 = obj16;
                                    str2 = str18;
                                    obj3 = obj54222;
                                    Object obj55222 = obj15;
                                    str3 = str14;
                                    obj4 = obj55222;
                                    obj5 = obj17;
                                    obj6 = obj20;
                                    str4 = str15;
                                    obj7 = obj18;
                                }
                                i = R.string.game_period_start;
                                String str412222 = str13;
                                obj2 = obj14;
                                str = str412222;
                                Object obj542222 = obj16;
                                str2 = str18;
                                obj3 = obj542222;
                                Object obj552222 = obj15;
                                str3 = str14;
                                obj4 = obj552222;
                                obj5 = obj17;
                                obj6 = obj20;
                                str4 = str15;
                                obj7 = obj18;
                            } else {
                                if (group.equals(Sports.BASKETBALL)) {
                                    i = R.string.second_half_start;
                                    String str4122222 = str13;
                                    obj2 = obj14;
                                    str = str4122222;
                                    Object obj5422222 = obj16;
                                    str2 = str18;
                                    obj3 = obj5422222;
                                    Object obj5522222 = obj15;
                                    str3 = str14;
                                    obj4 = obj5522222;
                                    obj5 = obj17;
                                    obj6 = obj20;
                                    str4 = str15;
                                    obj7 = obj18;
                                }
                                i = R.string.game_period_start;
                                String str41222222 = str13;
                                obj2 = obj14;
                                str = str41222222;
                                Object obj54222222 = obj16;
                                str2 = str18;
                                obj3 = obj54222222;
                                Object obj55222222 = obj15;
                                str3 = str14;
                                obj4 = obj55222222;
                                obj5 = obj17;
                                obj6 = obj20;
                                str4 = str15;
                                obj7 = obj18;
                            }
                            str5 = str16;
                            q9k q9kVar32222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222222222222 = notificationSetting.getName();
                            String group222222222222222222 = notificationSetting.getGroup();
                            hashCode = name422222222222222222.hashCode();
                            int i422222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 357304895:
                            if (!name3.equals(str16)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.media;
                            String str42 = str13;
                            obj2 = obj14;
                            str = str42;
                            Object obj56 = obj16;
                            str2 = str18;
                            obj3 = obj56;
                            Object obj57 = obj15;
                            str3 = str14;
                            obj4 = obj57;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar322222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222222222222 = notificationSetting.getName();
                            String group2222222222222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222222222222.hashCode();
                            int i4222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 556732048:
                            if (!name3.equals(str19)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.player_driver_event_notification;
                            String str422 = str13;
                            obj2 = obj14;
                            str = str422;
                            Object obj562 = obj16;
                            str2 = str18;
                            obj3 = obj562;
                            Object obj572 = obj15;
                            str3 = str14;
                            obj4 = obj572;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar3222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222222222222222 = notificationSetting.getName();
                            String group22222222222222222222 = notificationSetting.getGroup();
                            hashCode = name42222222222222222222.hashCode();
                            int i42222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 1075676876:
                            if (!name3.equals("goal_scorer")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.goal_scorer;
                            String str4222 = str13;
                            obj2 = obj14;
                            str = str4222;
                            Object obj5622 = obj16;
                            str2 = str18;
                            obj3 = obj5622;
                            Object obj5722 = obj15;
                            str3 = str14;
                            obj4 = obj5722;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar32222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222222222222222 = notificationSetting.getName();
                            String group222222222222222222222 = notificationSetting.getGroup();
                            hashCode = name422222222222222222222.hashCode();
                            int i422222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 1083147041:
                            if (!name3.equals("redcard")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.red_card;
                            String str42222 = str13;
                            obj2 = obj14;
                            str = str42222;
                            Object obj56222 = obj16;
                            str2 = str18;
                            obj3 = obj56222;
                            Object obj57222 = obj15;
                            str3 = str14;
                            obj4 = obj57222;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar322222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222222222222222 = notificationSetting.getName();
                            String group2222222222222222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222222222222222.hashCode();
                            int i4222222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 1638533572:
                            if (!name3.equals("predictions")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.predictions;
                            String str422222 = str13;
                            obj2 = obj14;
                            str = str422222;
                            Object obj562222 = obj16;
                            str2 = str18;
                            obj3 = obj562222;
                            Object obj572222 = obj15;
                            str3 = str14;
                            obj4 = obj572222;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar3222222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name42222222222222222222222 = notificationSetting.getName();
                            String group22222222222222222222222 = notificationSetting.getGroup();
                            hashCode = name42222222222222222222222.hashCode();
                            int i42222222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 1749554768:
                            if (!name3.equals("break_point")) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.tennis_break;
                            String str4222222 = str13;
                            obj2 = obj14;
                            str = str4222222;
                            Object obj5622222 = obj16;
                            str2 = str18;
                            obj3 = obj5622222;
                            Object obj5722222 = obj15;
                            str3 = str14;
                            obj4 = obj5722222;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar32222222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name422222222222222222222222 = notificationSetting.getName();
                            String group222222222222222222222222 = notificationSetting.getGroup();
                            hashCode = name422222222222222222222222.hashCode();
                            int i422222222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        case 1895455813:
                            if (!name3.equals(str17)) {
                                a70.p("This notification setting is not supported: ".concat(name3));
                                return null;
                            }
                            i = R.string.sofascore_ratings;
                            String str42222222 = str13;
                            obj2 = obj14;
                            str = str42222222;
                            Object obj56222222 = obj16;
                            str2 = str18;
                            obj3 = obj56222222;
                            Object obj57222222 = obj15;
                            str3 = str14;
                            obj4 = obj57222222;
                            arrayList = arrayList2;
                            obj5 = obj17;
                            obj6 = obj20;
                            str4 = str15;
                            obj7 = obj18;
                            str5 = str16;
                            q9k q9kVar322222222222222222222222 = new q9k(i);
                            name = notificationSetting.getName();
                            switch (name.hashCode()) {
                                case -1525319953:
                                    break;
                                case -1249310171:
                                    break;
                                case -146262849:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 556732048:
                                    break;
                                case 1638533572:
                                    break;
                            }
                            if (num != null) {
                            }
                            String name4222222222222222222222222 = notificationSetting.getName();
                            String group2222222222222222222222222 = notificationSetting.getGroup();
                            hashCode = name4222222222222222222222222.hashCode();
                            int i4222222222222222222222222 = R.drawable.ic_ball_football;
                            switch (hashCode) {
                                case -1709465524:
                                    break;
                                case -1525319953:
                                    break;
                                case -1276231777:
                                    break;
                                case -1274442605:
                                    break;
                                case -1249310171:
                                    break;
                                case -1192204437:
                                    break;
                                case -682674039:
                                    break;
                                case -411869959:
                                    break;
                                case -146262849:
                                    break;
                                case -53100160:
                                    break;
                                case 3237038:
                                    break;
                                case 84476166:
                                    break;
                                case 105510629:
                                    break;
                                case 106069776:
                                    break;
                                case 109757538:
                                    break;
                                case 176922820:
                                    break;
                                case 300548756:
                                    break;
                                case 301041764:
                                    break;
                                case 357304895:
                                    break;
                                case 556732048:
                                    break;
                                case 1075676876:
                                    break;
                                case 1083147041:
                                    break;
                                case 1638533572:
                                    break;
                                case 1749554768:
                                    break;
                                case 1895455813:
                                    break;
                            }
                        default:
                            a70.p("This notification setting is not supported: ".concat(name3));
                            return null;
                    }
                }
                gv9 t2 = yfdVar2.t(arrayList2, linkedHashMap2);
                if (!linkedHashMap2.isEmpty()) {
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it4.next()).getValue()).booleanValue()) {
                            z2 = true;
                            Context i5 = yfdVar2.i();
                            sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = i5.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            return vfd.a(vfdVar2, t2, false, false, z2, sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L), 6);
                        }
                    }
                }
                z2 = false;
                Context i52 = yfdVar2.i();
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                }
                return vfd.a(vfdVar2, t2, false, false, z2, sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L), 6);
        }
    }
}
