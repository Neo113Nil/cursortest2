package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.chat.Message;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vj0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;

    public vj0(b98 b98Var, w24 w24Var) {
        this.a = 6;
        this.b = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(rq3 rq3Var, Object obj) {
        vsd vsdVar;
        int i;
        if (rq3Var instanceof vsd) {
            vsdVar = (vsd) rq3Var;
            int i2 = vsdVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vsdVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = vsdVar.r;
                lu3 lu3Var = lu3.a;
                i = vsdVar.s;
                if (i != 0) {
                    y6a.M(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        vsdVar.s = 1;
                        if (this.b.emit(obj, vsdVar) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        vsdVar = new vsd(this, rq3Var);
        Object obj22 = vsdVar.r;
        lu3 lu3Var2 = lu3.a;
        i = vsdVar.s;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:576:0x0861, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_NOT_STARTED) == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0882, code lost:
    
        r13 = defpackage.l64.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x087f, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) == false) goto L543;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9 A[LOOP:1: B:116:0x01f3->B:118:0x01f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /* JADX WARN: Type inference failed for: r13v1, types: [jjh] */
    /* JADX WARN: Type inference failed for: r13v4, types: [jjh] */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        uj0 uj0Var;
        int i;
        vf2 vf2Var;
        int i2;
        oj2 oj2Var;
        int i3;
        rj3 rj3Var;
        int i4;
        dn3 dn3Var;
        int i5;
        nr3 nr3Var;
        int i6;
        u24 u24Var;
        int i7;
        ey4 ey4Var;
        String playerName;
        String assistName;
        String playerName2;
        v44 v44Var;
        int i8;
        l54 l54Var;
        int i9;
        m54 m54Var;
        int i10;
        gf4 gf4Var;
        int i11;
        bz5 bz5Var;
        int i12;
        z66 z66Var;
        int i13;
        ba6 ba6Var;
        int i14;
        g67 g67Var;
        int i15;
        md7 md7Var;
        int i16;
        kr7 kr7Var;
        int i17;
        hs7 hs7Var;
        int i18;
        xa8 xa8Var;
        int i19;
        xza xzaVar;
        int i20;
        k0b k0bVar;
        int i21;
        wnb wnbVar;
        int i22;
        xnb xnbVar;
        int i23;
        wqb wqbVar;
        int i24;
        xqb xqbVar;
        int i25;
        Object obj2;
        String str;
        boolean z;
        Iterator it;
        ozh ozhVar;
        Integer b;
        yqb yqbVar;
        int i26;
        j5d j5dVar;
        int i27;
        d7d d7dVar;
        int i28;
        a1e a1eVar;
        int i29;
        int i30 = this.a;
        int i31 = 10;
        String str2 = Sports.TRENDING;
        int i32 = 2;
        b98 b98Var = this.b;
        rq3 rq3Var2 = null;
        r13 = null;
        q9k q9kVar = null;
        zdl zdlVar = null;
        String str3 = null;
        String str4 = null;
        r13 = null;
        ey4 ey4Var2 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        l64 l64Var = null;
        jjh jjhVar = null;
        rq3Var2 = null;
        switch (i30) {
            case 0:
                if (rq3Var instanceof uj0) {
                    uj0Var = (uj0) rq3Var;
                    int i33 = uj0Var.s;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        uj0Var.s = i33 - Integer.MIN_VALUE;
                        Object obj3 = uj0Var.r;
                        lu3 lu3Var = lu3.a;
                        i = uj0Var.s;
                        if (i != 0) {
                            y6a.M(obj3);
                            long j = ((njh) obj).a;
                            s02 s02Var = w25.j;
                            if (j == 9205357640488583168L) {
                                rq3Var2 = jjh.c;
                            } else if (njh.f(j) >= 0.5d && njh.d(j) >= 0.5d) {
                                float f = njh.f(j);
                                s02 u25Var = (Float.isInfinite(f) || Float.isNaN(f)) ? s02Var : new u25(wzb.b(njh.f(j)));
                                float d = njh.d(j);
                                s02 s02Var2 = s02Var;
                                if (!Float.isInfinite(d)) {
                                    s02Var2 = s02Var;
                                    if (!Float.isNaN(d)) {
                                        s02Var2 = new u25(wzb.b(njh.d(j)));
                                    }
                                }
                                rq3Var2 = new jjh(u25Var, s02Var2);
                            }
                            if (rq3Var2 != null) {
                                uj0Var.s = 1;
                                if (b98Var.emit(rq3Var2, uj0Var) == lu3Var) {
                                    return lu3Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj3);
                        }
                        return Unit.a;
                    }
                }
                uj0Var = new uj0(this, rq3Var);
                Object obj32 = uj0Var.r;
                lu3 lu3Var2 = lu3.a;
                i = uj0Var.s;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (rq3Var instanceof vf2) {
                    vf2Var = (vf2) rq3Var;
                    int i34 = vf2Var.s;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        vf2Var.s = i34 - Integer.MIN_VALUE;
                        Object obj4 = vf2Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = vf2Var.s;
                        if (i2 != 0) {
                            y6a.M(obj4);
                            yyc yycVar = (yyc) obj;
                            t98 t98Var = new t98(new v98(new ip1(yycVar, rq3Var2, 28), (pog) yycVar.b.f), new zy1(yycVar, rq3Var2, i32), r8 ? 1 : 0);
                            f6e f6eVar = yycVar.a;
                            f6e f6eVar2 = new f6e(t98Var, f6eVar.b, f6eVar.c, new xxb(yycVar, i31));
                            vf2Var.s = 1;
                            if (b98Var.emit(f6eVar2, vf2Var) == lu3Var3) {
                                return lu3Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj4);
                        }
                        return Unit.a;
                    }
                }
                vf2Var = new vf2(this, rq3Var);
                Object obj42 = vf2Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = vf2Var.s;
                if (i2 != 0) {
                }
                return Unit.a;
            case 2:
                if (rq3Var instanceof oj2) {
                    oj2Var = (oj2) rq3Var;
                    int i35 = oj2Var.t;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        oj2Var.t = i35 - Integer.MIN_VALUE;
                        Object obj5 = oj2Var.r;
                        lu3 lu3Var4 = lu3.a;
                        i3 = oj2Var.t;
                        if (i3 != 0) {
                            y6a.M(obj5);
                            bea.u(oj2Var.getContext());
                            oj2Var.t = 1;
                            if (b98Var.emit(obj, oj2Var) == lu3Var4) {
                                return lu3Var4;
                            }
                        } else {
                            if (i3 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj5);
                        }
                        return Unit.a;
                    }
                }
                oj2Var = new oj2(this, rq3Var);
                Object obj52 = oj2Var.r;
                lu3 lu3Var42 = lu3.a;
                i3 = oj2Var.t;
                if (i3 != 0) {
                }
                return Unit.a;
            case 3:
                if (rq3Var instanceof rj3) {
                    rj3Var = (rj3) rq3Var;
                    int i36 = rj3Var.s;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        rj3Var.s = i36 - Integer.MIN_VALUE;
                        Object obj6 = rj3Var.r;
                        lu3 lu3Var5 = lu3.a;
                        i4 = rj3Var.s;
                        if (i4 != 0) {
                            y6a.M(obj6);
                            Object obj7 = ((Pair) obj).b;
                            if (obj7 != null) {
                                rj3Var.s = 1;
                                if (b98Var.emit(obj7, rj3Var) == lu3Var5) {
                                    return lu3Var5;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj6);
                        }
                        return Unit.a;
                    }
                }
                rj3Var = new rj3(this, rq3Var);
                Object obj62 = rj3Var.r;
                lu3 lu3Var52 = lu3.a;
                i4 = rj3Var.s;
                if (i4 != 0) {
                }
                return Unit.a;
            case 4:
                if (rq3Var instanceof dn3) {
                    dn3Var = (dn3) rq3Var;
                    int i37 = dn3Var.s;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        dn3Var.s = i37 - Integer.MIN_VALUE;
                        Object obj8 = dn3Var.r;
                        lu3 lu3Var6 = lu3.a;
                        i5 = dn3Var.s;
                        if (i5 != 0) {
                            y6a.M(obj8);
                            long j2 = ((an3) obj).a;
                            s02 s02Var3 = w25.j;
                            if (!an3.k(j2)) {
                                s02 u25Var2 = an3.d(j2) ? new u25(an3.h(j2)) : s02Var3;
                                s02 s02Var4 = s02Var3;
                                if (an3.c(j2)) {
                                    s02Var4 = new u25(an3.g(j2));
                                }
                                jjhVar = new jjh(u25Var2, s02Var4);
                            }
                            if (jjhVar != null) {
                                dn3Var.s = 1;
                                if (b98Var.emit(jjhVar, dn3Var) == lu3Var6) {
                                    return lu3Var6;
                                }
                            }
                        } else {
                            if (i5 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj8);
                        }
                        return Unit.a;
                    }
                }
                dn3Var = new dn3(this, rq3Var);
                Object obj82 = dn3Var.r;
                lu3 lu3Var62 = lu3.a;
                i5 = dn3Var.s;
                if (i5 != 0) {
                }
                return Unit.a;
            case 5:
                if (rq3Var instanceof nr3) {
                    nr3Var = (nr3) rq3Var;
                    int i38 = nr3Var.s;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        nr3Var.s = i38 - Integer.MIN_VALUE;
                        Object obj9 = nr3Var.r;
                        lu3 lu3Var7 = lu3.a;
                        i6 = nr3Var.s;
                        if (i6 != 0) {
                            y6a.M(obj9);
                            Event event = (Event) obj;
                            event.getClass();
                            String type = event.getStatus().getType();
                            int hashCode = type.hashCode();
                            if (hashCode == -1411655086) {
                                break;
                            } else {
                                if (hashCode != -673660814) {
                                    if (hashCode == -500280754) {
                                        break;
                                    }
                                } else if (type.equals(StatusKt.STATUS_FINISHED)) {
                                    l64Var = event.getCrowdsourcingDataDisplayEnabled() ? l64.a : l64.b;
                                }
                                if (l64Var != null) {
                                    nr3Var.s = 1;
                                    if (b98Var.emit(l64Var, nr3Var) == lu3Var7) {
                                        return lu3Var7;
                                    }
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj9);
                        }
                        return Unit.a;
                    }
                }
                nr3Var = new nr3(this, rq3Var);
                Object obj92 = nr3Var.r;
                lu3 lu3Var72 = lu3.a;
                i6 = nr3Var.s;
                if (i6 != 0) {
                }
                return Unit.a;
            case 6:
                if (rq3Var instanceof u24) {
                    u24Var = (u24) rq3Var;
                    int i39 = u24Var.s;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        u24Var.s = i39 - Integer.MIN_VALUE;
                        Object obj10 = u24Var.r;
                        lu3 lu3Var8 = lu3.a;
                        i7 = u24Var.s;
                        if (i7 != 0) {
                            y6a.M(obj10);
                            EventSuggest.IncidentSuggest incidentSuggest = ((k24) obj).b.b;
                            if (incidentSuggest != null) {
                                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                                    EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
                                    CrowdsourcingIncidentType.Card type2 = cardSuggest.getType();
                                    Integer time = cardSuggest.getTime();
                                    Integer addedTime = cardSuggest.getAddedTime();
                                    if (time != null) {
                                        String j3 = addedTime != null ? ljg.j(addedTime.intValue(), "+") : null;
                                        str3 = time + "'" + (j3 != null ? j3 : "");
                                    }
                                    String str5 = str3;
                                    Player player = cardSuggest.getPlayer();
                                    if (player == null || (playerName2 = tba.t(player)) == null) {
                                        playerName2 = cardSuggest.getPlayerName();
                                    }
                                    ey4Var = new ey4(null, type2, str5, null, null, playerName2, null, cardSuggest.getSide(), null);
                                } else if (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                                    CrowdsourcingIncidentType.Goal type3 = goalSuggest.getType();
                                    Integer time2 = goalSuggest.getTime();
                                    Integer addedTime2 = goalSuggest.getAddedTime();
                                    if (time2 != null) {
                                        String j4 = addedTime2 != null ? ljg.j(addedTime2.intValue(), "+") : null;
                                        str4 = time2 + "'" + (j4 != null ? j4 : "");
                                    }
                                    String str6 = str4;
                                    Integer valueOf = Integer.valueOf(goalSuggest.getHomeScoreSuggest());
                                    Integer valueOf2 = Integer.valueOf(goalSuggest.getAwayScoreSuggest());
                                    Player player2 = goalSuggest.getPlayer();
                                    if (player2 == null || (playerName = tba.t(player2)) == null) {
                                        playerName = goalSuggest.getPlayerName();
                                    }
                                    String str7 = playerName;
                                    Player assist = goalSuggest.getAssist();
                                    if (assist == null || (assistName = tba.t(assist)) == null) {
                                        assistName = goalSuggest.getAssistName();
                                    }
                                    ey4Var = new ey4(null, type3, str6, valueOf, valueOf2, str7, assistName, goalSuggest.getSide(), null);
                                }
                                ey4Var2 = ey4Var;
                            }
                            if (ey4Var2 != null) {
                                u24Var.s = 1;
                                if (b98Var.emit(ey4Var2, u24Var) == lu3Var8) {
                                    return lu3Var8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj10);
                        }
                        return Unit.a;
                    }
                }
                u24Var = new u24(this, rq3Var);
                Object obj102 = u24Var.r;
                lu3 lu3Var82 = lu3.a;
                i7 = u24Var.s;
                if (i7 != 0) {
                }
                return Unit.a;
            case 7:
                if (rq3Var instanceof v44) {
                    v44Var = (v44) rq3Var;
                    int i40 = v44Var.s;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        v44Var.s = i40 - Integer.MIN_VALUE;
                        Object obj11 = v44Var.r;
                        lu3 lu3Var9 = lu3.a;
                        i8 = v44Var.s;
                        if (i8 != 0) {
                            y6a.M(obj11);
                            EventSuggest.IncidentSuggest incidentSuggest2 = ((k24) obj).b.b;
                            if (incidentSuggest2 != null) {
                                v44Var.s = 1;
                                if (b98Var.emit(incidentSuggest2, v44Var) == lu3Var9) {
                                    return lu3Var9;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj11);
                        }
                        return Unit.a;
                    }
                }
                v44Var = new v44(this, rq3Var);
                Object obj112 = v44Var.r;
                lu3 lu3Var92 = lu3.a;
                i8 = v44Var.s;
                if (i8 != 0) {
                }
                return Unit.a;
            case 8:
                if (rq3Var instanceof l54) {
                    l54Var = (l54) rq3Var;
                    int i41 = l54Var.s;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        l54Var.s = i41 - Integer.MIN_VALUE;
                        Object obj12 = l54Var.r;
                        lu3 lu3Var10 = lu3.a;
                        i9 = l54Var.s;
                        if (i9 != 0) {
                            y6a.M(obj12);
                            Boolean valueOf3 = Boolean.valueOf(((k24) obj).b.b == null);
                            l54Var.s = 1;
                            if (b98Var.emit(valueOf3, l54Var) == lu3Var10) {
                                return lu3Var10;
                            }
                        } else {
                            if (i9 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj12);
                        }
                        return Unit.a;
                    }
                }
                l54Var = new l54(this, rq3Var);
                Object obj122 = l54Var.r;
                lu3 lu3Var102 = lu3.a;
                i9 = l54Var.s;
                if (i9 != 0) {
                }
                return Unit.a;
            case 9:
                if (rq3Var instanceof m54) {
                    m54Var = (m54) rq3Var;
                    int i42 = m54Var.s;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        m54Var.s = i42 - Integer.MIN_VALUE;
                        Object obj13 = m54Var.r;
                        lu3 lu3Var11 = lu3.a;
                        i10 = m54Var.s;
                        if (i10 != 0) {
                            y6a.M(obj13);
                            ey4 ey4Var3 = (ey4) obj;
                            if (ey4Var3 != null) {
                                m54Var.s = 1;
                                if (b98Var.emit(ey4Var3, m54Var) == lu3Var11) {
                                    return lu3Var11;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj13);
                        }
                        return Unit.a;
                    }
                }
                m54Var = new m54(this, rq3Var);
                Object obj132 = m54Var.r;
                lu3 lu3Var112 = lu3.a;
                i10 = m54Var.s;
                if (i10 != 0) {
                }
                return Unit.a;
            case 10:
                if (rq3Var instanceof gf4) {
                    gf4Var = (gf4) rq3Var;
                    int i43 = gf4Var.s;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        gf4Var.s = i43 - Integer.MIN_VALUE;
                        Object obj14 = gf4Var.r;
                        lu3 lu3Var12 = lu3.a;
                        i11 = gf4Var.s;
                        if (i11 != 0) {
                            y6a.M(obj14);
                            adi adiVar = (adi) obj;
                            if (adiVar instanceof wnf) {
                                throw ((wnf) adiVar).b;
                            }
                            if (!(adiVar instanceof od4)) {
                                if ((adiVar instanceof e38) || (adiVar instanceof t9k) || (adiVar instanceof mdd)) {
                                    a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    return null;
                                }
                                zzl.b();
                                return null;
                            }
                            Object obj15 = ((od4) adiVar).b;
                            gf4Var.s = 1;
                            if (b98Var.emit(obj15, gf4Var) == lu3Var12) {
                                return lu3Var12;
                            }
                        } else {
                            if (i11 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj14);
                        }
                        return Unit.a;
                    }
                }
                gf4Var = new gf4(this, rq3Var);
                Object obj142 = gf4Var.r;
                lu3 lu3Var122 = lu3.a;
                i11 = gf4Var.s;
                if (i11 != 0) {
                }
                return Unit.a;
            case 11:
                if (rq3Var instanceof bz5) {
                    bz5Var = (bz5) rq3Var;
                    int i44 = bz5Var.s;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        bz5Var.s = i44 - Integer.MIN_VALUE;
                        Object obj16 = bz5Var.r;
                        lu3 lu3Var13 = lu3.a;
                        i12 = bz5Var.s;
                        if (i12 != 0) {
                            y6a.M(obj16);
                            Boolean valueOf4 = Boolean.valueOf(((Number) obj).intValue() < 3);
                            bz5Var.s = 1;
                            if (b98Var.emit(valueOf4, bz5Var) == lu3Var13) {
                                return lu3Var13;
                            }
                        } else {
                            if (i12 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj16);
                        }
                        return Unit.a;
                    }
                }
                bz5Var = new bz5(this, rq3Var);
                Object obj162 = bz5Var.r;
                lu3 lu3Var132 = lu3.a;
                i12 = bz5Var.s;
                if (i12 != 0) {
                }
                return Unit.a;
            case 12:
                if (rq3Var instanceof z66) {
                    z66Var = (z66) rq3Var;
                    int i45 = z66Var.s;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        z66Var.s = i45 - Integer.MIN_VALUE;
                        Object obj17 = z66Var.r;
                        lu3 lu3Var14 = lu3.a;
                        i13 = z66Var.s;
                        if (i13 != 0) {
                            y6a.M(obj17);
                            FavoritesEventsData favoritesEventsData = new FavoritesEventsData(null, (List) obj, null, 5, null);
                            z66Var.s = 1;
                            if (b98Var.emit(favoritesEventsData, z66Var) == lu3Var14) {
                                return lu3Var14;
                            }
                        } else {
                            if (i13 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj17);
                        }
                        return Unit.a;
                    }
                }
                z66Var = new z66(this, rq3Var);
                Object obj172 = z66Var.r;
                lu3 lu3Var142 = lu3.a;
                i13 = z66Var.s;
                if (i13 != 0) {
                }
                return Unit.a;
            case 13:
                if (rq3Var instanceof ba6) {
                    ba6Var = (ba6) rq3Var;
                    int i46 = ba6Var.s;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        ba6Var.s = i46 - Integer.MIN_VALUE;
                        Object obj18 = ba6Var.r;
                        lu3 lu3Var15 = lu3.a;
                        i14 = ba6Var.s;
                        if (i14 != 0) {
                            y6a.M(obj18);
                            ArrayList W = CollectionsKt.W((List) obj);
                            ba6Var.s = 1;
                            if (b98Var.emit(W, ba6Var) == lu3Var15) {
                                return lu3Var15;
                            }
                        } else {
                            if (i14 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj18);
                        }
                        return Unit.a;
                    }
                }
                ba6Var = new ba6(this, rq3Var);
                Object obj182 = ba6Var.r;
                lu3 lu3Var152 = lu3.a;
                i14 = ba6Var.s;
                if (i14 != 0) {
                }
                return Unit.a;
            case 14:
                if (rq3Var instanceof g67) {
                    g67Var = (g67) rq3Var;
                    int i47 = g67Var.s;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        g67Var.s = i47 - Integer.MIN_VALUE;
                        Object obj19 = g67Var.r;
                        lu3 lu3Var16 = lu3.a;
                        i15 = g67Var.s;
                        if (i15 != 0) {
                            y6a.M(obj19);
                            f6e z2 = g7a.z((f6e) obj, new d11(i32, rq3Var2, 8));
                            g67Var.s = 1;
                            if (b98Var.emit(z2, g67Var) == lu3Var16) {
                                return lu3Var16;
                            }
                        } else {
                            if (i15 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj19);
                        }
                        return Unit.a;
                    }
                }
                g67Var = new g67(this, rq3Var);
                Object obj192 = g67Var.r;
                lu3 lu3Var162 = lu3.a;
                i15 = g67Var.s;
                if (i15 != 0) {
                }
                return Unit.a;
            case 15:
                if (rq3Var instanceof md7) {
                    md7Var = (md7) rq3Var;
                    int i48 = md7Var.s;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        md7Var.s = i48 - Integer.MIN_VALUE;
                        Object obj20 = md7Var.r;
                        lu3 lu3Var17 = lu3.a;
                        i16 = md7Var.s;
                        if (i16 != 0) {
                            y6a.M(obj20);
                            Map map = (Map) obj;
                            Boolean valueOf5 = Boolean.valueOf(!(map == null || map.isEmpty()));
                            md7Var.s = 1;
                            if (b98Var.emit(valueOf5, md7Var) == lu3Var17) {
                                return lu3Var17;
                            }
                        } else {
                            if (i16 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj20);
                        }
                        return Unit.a;
                    }
                }
                md7Var = new md7(this, rq3Var);
                Object obj202 = md7Var.r;
                lu3 lu3Var172 = lu3.a;
                i16 = md7Var.s;
                if (i16 != 0) {
                }
                return Unit.a;
            case 16:
                if (rq3Var instanceof kr7) {
                    kr7Var = (kr7) rq3Var;
                    int i49 = kr7Var.s;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        kr7Var.s = i49 - Integer.MIN_VALUE;
                        Object obj21 = kr7Var.r;
                        lu3 lu3Var18 = lu3.a;
                        i17 = kr7Var.s;
                        if (i17 != 0) {
                            y6a.M(obj21);
                            if (((Boolean) obj).booleanValue()) {
                                kr7Var.s = 1;
                                if (b98Var.emit(obj, kr7Var) == lu3Var18) {
                                    return lu3Var18;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj21);
                        }
                        return Unit.a;
                    }
                }
                kr7Var = new kr7(this, rq3Var);
                Object obj212 = kr7Var.r;
                lu3 lu3Var182 = lu3.a;
                i17 = kr7Var.s;
                if (i17 != 0) {
                }
                return Unit.a;
            case 17:
                if (rq3Var instanceof hs7) {
                    hs7Var = (hs7) rq3Var;
                    int i50 = hs7Var.s;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        hs7Var.s = i50 - Integer.MIN_VALUE;
                        Object obj22 = hs7Var.r;
                        lu3 lu3Var19 = lu3.a;
                        i18 = hs7Var.s;
                        if (i18 != 0) {
                            y6a.M(obj22);
                            if (((Boolean) obj).booleanValue()) {
                                hs7Var.s = 1;
                                if (b98Var.emit(obj, hs7Var) == lu3Var19) {
                                    return lu3Var19;
                                }
                            }
                        } else {
                            if (i18 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj22);
                        }
                        return Unit.a;
                    }
                }
                hs7Var = new hs7(this, rq3Var);
                Object obj222 = hs7Var.r;
                lu3 lu3Var192 = lu3.a;
                i18 = hs7Var.s;
                if (i18 != 0) {
                }
                return Unit.a;
            case 18:
                if (rq3Var instanceof xa8) {
                    xa8Var = (xa8) rq3Var;
                    int i51 = xa8Var.s;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        xa8Var.s = i51 - Integer.MIN_VALUE;
                        Object obj23 = xa8Var.r;
                        lu3 lu3Var20 = lu3.a;
                        i19 = xa8Var.s;
                        if (i19 != 0) {
                            y6a.M(obj23);
                            if (obj != null) {
                                xa8Var.s = 1;
                                if (b98Var.emit(obj, xa8Var) == lu3Var20) {
                                    return lu3Var20;
                                }
                            }
                        } else {
                            if (i19 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj23);
                        }
                        return Unit.a;
                    }
                }
                xa8Var = new xa8(this, rq3Var);
                Object obj232 = xa8Var.r;
                lu3 lu3Var202 = lu3.a;
                i19 = xa8Var.s;
                if (i19 != 0) {
                }
                return Unit.a;
            case 19:
                if (rq3Var instanceof xza) {
                    xzaVar = (xza) rq3Var;
                    int i52 = xzaVar.s;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        xzaVar.s = i52 - Integer.MIN_VALUE;
                        Object obj24 = xzaVar.r;
                        lu3 lu3Var21 = lu3.a;
                        i20 = xzaVar.s;
                        if (i20 != 0) {
                            y6a.M(obj24);
                            HashSet Q0 = CollectionsKt.Q0((List) obj);
                            xzaVar.s = 1;
                            if (b98Var.emit(Q0, xzaVar) == lu3Var21) {
                                return lu3Var21;
                            }
                        } else {
                            if (i20 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj24);
                        }
                        return Unit.a;
                    }
                }
                xzaVar = new xza(this, rq3Var);
                Object obj242 = xzaVar.r;
                lu3 lu3Var212 = lu3.a;
                i20 = xzaVar.s;
                if (i20 != 0) {
                }
                return Unit.a;
            case 20:
                if (rq3Var instanceof k0b) {
                    k0bVar = (k0b) rq3Var;
                    int i53 = k0bVar.s;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        k0bVar.s = i53 - Integer.MIN_VALUE;
                        Object obj25 = k0bVar.r;
                        lu3 lu3Var22 = lu3.a;
                        i21 = k0bVar.s;
                        if (i21 != 0) {
                            y6a.M(obj25);
                            ArrayList W2 = CollectionsKt.W((List) obj);
                            k0bVar.s = 1;
                            if (b98Var.emit(W2, k0bVar) == lu3Var22) {
                                return lu3Var22;
                            }
                        } else {
                            if (i21 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj25);
                        }
                        return Unit.a;
                    }
                }
                k0bVar = new k0b(this, rq3Var);
                Object obj252 = k0bVar.r;
                lu3 lu3Var222 = lu3.a;
                i21 = k0bVar.s;
                if (i21 != 0) {
                }
                return Unit.a;
            case 21:
                if (rq3Var instanceof wnb) {
                    wnbVar = (wnb) rq3Var;
                    int i54 = wnbVar.s;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        wnbVar.s = i54 - Integer.MIN_VALUE;
                        Object obj26 = wnbVar.r;
                        lu3 lu3Var23 = lu3.a;
                        i22 = wnbVar.s;
                        if (i22 != 0) {
                            y6a.M(obj26);
                            if (obj instanceof unb) {
                                wnbVar.s = 1;
                                if (b98Var.emit(obj, wnbVar) == lu3Var23) {
                                    return lu3Var23;
                                }
                            }
                        } else {
                            if (i22 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj26);
                        }
                        return Unit.a;
                    }
                }
                wnbVar = new wnb(this, rq3Var);
                Object obj262 = wnbVar.r;
                lu3 lu3Var232 = lu3.a;
                i22 = wnbVar.s;
                if (i22 != 0) {
                }
                return Unit.a;
            case 22:
                if (rq3Var instanceof xnb) {
                    xnbVar = (xnb) rq3Var;
                    int i55 = xnbVar.s;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        xnbVar.s = i55 - Integer.MIN_VALUE;
                        Object obj27 = xnbVar.r;
                        lu3 lu3Var24 = lu3.a;
                        i23 = xnbVar.s;
                        if (i23 != 0) {
                            y6a.M(obj27);
                            Object obj28 = ((unb) obj).a;
                            xnbVar.s = 1;
                            if (b98Var.emit(obj28, xnbVar) == lu3Var24) {
                                return lu3Var24;
                            }
                        } else {
                            if (i23 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj27);
                        }
                        return Unit.a;
                    }
                }
                xnbVar = new xnb(this, rq3Var);
                Object obj272 = xnbVar.r;
                lu3 lu3Var242 = lu3.a;
                i23 = xnbVar.s;
                if (i23 != 0) {
                }
                return Unit.a;
            case 23:
                if (rq3Var instanceof wqb) {
                    wqbVar = (wqb) rq3Var;
                    int i56 = wqbVar.s;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        wqbVar.s = i56 - Integer.MIN_VALUE;
                        Object obj29 = wqbVar.r;
                        lu3 lu3Var25 = lu3.a;
                        i24 = wqbVar.s;
                        if (i24 != 0) {
                            y6a.M(obj29);
                            String str8 = (String) obj;
                            if (str8.length() > 0) {
                                vel velVar = vel.a;
                                zdl zdlVar2 = (zdl) ((Map) vel.h.getValue()).get(str8);
                                if (zdlVar2 == null) {
                                    zdlVar2 = vel.b;
                                }
                                zdlVar = zdlVar2;
                            }
                            wqbVar.s = 1;
                            if (b98Var.emit(zdlVar, wqbVar) == lu3Var25) {
                                return lu3Var25;
                            }
                        } else {
                            if (i24 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj29);
                        }
                        return Unit.a;
                    }
                }
                wqbVar = new wqb(this, rq3Var);
                Object obj292 = wqbVar.r;
                lu3 lu3Var252 = lu3.a;
                i24 = wqbVar.s;
                if (i24 != 0) {
                }
                return Unit.a;
            case 24:
                if (rq3Var instanceof xqb) {
                    xqbVar = (xqb) rq3Var;
                    int i57 = xqbVar.s;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        xqbVar.s = i57 - Integer.MIN_VALUE;
                        Object obj30 = xqbVar.r;
                        lu3 lu3Var26 = lu3.a;
                        i25 = xqbVar.s;
                        if (i25 != 0) {
                            y6a.M(obj30);
                            List list = (List) obj;
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((DbSportOrder) obj2).isSelected()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            DbSportOrder dbSportOrder = (DbSportOrder) obj2;
                            if (dbSportOrder == null || (str = dbSportOrder.getSportName()) == null) {
                                str = Sports.TRENDING;
                            }
                            if (!str.equals(Sports.TRENDING)) {
                                List L0 = CollectionsKt.L0(list, 3);
                                if (L0 == null || !L0.isEmpty()) {
                                    Iterator it3 = L0.iterator();
                                    while (it3.hasNext()) {
                                        if (((DbSportOrder) it3.next()).isSelected()) {
                                        }
                                    }
                                }
                                z = true;
                                xbb b2 = a.b();
                                b2.add(new hzh(mzh.a, str.equals(Sports.TRENDING), new q9k(R.string.trending), R.drawable.ic_trending_fire, null, null, null));
                                List L02 = CollectionsKt.L0(list, 3);
                                ArrayList arrayList = new ArrayList(k13.r(L02, 10));
                                it = L02.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(pea.F((DbSportOrder) it.next(), null, 1));
                                }
                                b2.addAll(arrayList);
                                if (Boolean.valueOf(z).equals(Boolean.TRUE) && (b = wyh.b(str)) != null) {
                                    q9kVar = new q9k(b.intValue());
                                }
                                b2.add(new hzh(kzh.a, z, q9kVar, R.drawable.ic_more_horiz, null, null, null));
                                ozhVar = new ozh(l6g.W(a.a(b2)));
                                xqbVar.s = 1;
                                if (b98Var.emit(ozhVar, xqbVar) == lu3Var26) {
                                    return lu3Var26;
                                }
                            }
                            z = false;
                            xbb b22 = a.b();
                            b22.add(new hzh(mzh.a, str.equals(Sports.TRENDING), new q9k(R.string.trending), R.drawable.ic_trending_fire, null, null, null));
                            List L022 = CollectionsKt.L0(list, 3);
                            ArrayList arrayList2 = new ArrayList(k13.r(L022, 10));
                            it = L022.iterator();
                            while (it.hasNext()) {
                            }
                            b22.addAll(arrayList2);
                            if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                                q9kVar = new q9k(b.intValue());
                            }
                            b22.add(new hzh(kzh.a, z, q9kVar, R.drawable.ic_more_horiz, null, null, null));
                            ozhVar = new ozh(l6g.W(a.a(b22)));
                            xqbVar.s = 1;
                            if (b98Var.emit(ozhVar, xqbVar) == lu3Var26) {
                            }
                        } else {
                            if (i25 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj30);
                        }
                        return Unit.a;
                    }
                }
                xqbVar = new xqb(this, rq3Var);
                Object obj302 = xqbVar.r;
                lu3 lu3Var262 = lu3.a;
                i25 = xqbVar.s;
                if (i25 != 0) {
                }
                return Unit.a;
            case 25:
                if (rq3Var instanceof yqb) {
                    yqbVar = (yqb) rq3Var;
                    int i58 = yqbVar.s;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        yqbVar.s = i58 - Integer.MIN_VALUE;
                        Object obj31 = yqbVar.r;
                        lu3 lu3Var27 = lu3.a;
                        i26 = yqbVar.s;
                        if (i26 != 0) {
                            y6a.M(obj31);
                            String str9 = (String) obj;
                            if (str9 != null) {
                                str2 = str9;
                            }
                            yqbVar.s = 1;
                            if (b98Var.emit(str2, yqbVar) == lu3Var27) {
                                return lu3Var27;
                            }
                        } else {
                            if (i26 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj31);
                        }
                        return Unit.a;
                    }
                }
                yqbVar = new yqb(this, rq3Var);
                Object obj312 = yqbVar.r;
                lu3 lu3Var272 = lu3.a;
                i26 = yqbVar.s;
                if (i26 != 0) {
                }
                return Unit.a;
            case 26:
                if (rq3Var instanceof j5d) {
                    j5dVar = (j5d) rq3Var;
                    int i59 = j5dVar.s;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        j5dVar.s = i59 - Integer.MIN_VALUE;
                        Object obj33 = j5dVar.r;
                        lu3 lu3Var28 = lu3.a;
                        i27 = j5dVar.s;
                        if (i27 != 0) {
                            y6a.M(obj33);
                            JSONObject jSONObject = (JSONObject) obj;
                            jSONObject.getClass();
                            bga bgaVar = vga.a;
                            String jSONObject2 = jSONObject.toString();
                            jSONObject2.getClass();
                            bgaVar.getClass();
                            Message message = (Message) bgaVar.b(Message.INSTANCE.serializer(), jSONObject2);
                            j5dVar.s = 1;
                            if (b98Var.emit(message, j5dVar) == lu3Var28) {
                                return lu3Var28;
                            }
                        } else {
                            if (i27 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj33);
                        }
                        return Unit.a;
                    }
                }
                j5dVar = new j5d(this, rq3Var);
                Object obj332 = j5dVar.r;
                lu3 lu3Var282 = lu3.a;
                i27 = j5dVar.s;
                if (i27 != 0) {
                }
                return Unit.a;
            case 27:
                if (rq3Var instanceof d7d) {
                    d7dVar = (d7d) rq3Var;
                    int i60 = d7dVar.s;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        d7dVar.s = i60 - Integer.MIN_VALUE;
                        Object obj34 = d7dVar.r;
                        lu3 lu3Var29 = lu3.a;
                        i28 = d7dVar.s;
                        if (i28 != 0) {
                            y6a.M(obj34);
                            if (!((Boolean) obj).booleanValue()) {
                                d7dVar.s = 1;
                                if (b98Var.emit(obj, d7dVar) == lu3Var29) {
                                    return lu3Var29;
                                }
                            }
                        } else {
                            if (i28 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj34);
                        }
                        return Unit.a;
                    }
                }
                d7dVar = new d7d(this, rq3Var);
                Object obj342 = d7dVar.r;
                lu3 lu3Var292 = lu3.a;
                i28 = d7dVar.s;
                if (i28 != 0) {
                }
                return Unit.a;
            case 28:
                return a(rq3Var, obj);
            default:
                if (rq3Var instanceof a1e) {
                    a1eVar = (a1e) rq3Var;
                    int i61 = a1eVar.s;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        a1eVar.s = i61 - Integer.MIN_VALUE;
                        Object obj35 = a1eVar.r;
                        lu3 lu3Var30 = lu3.a;
                        i29 = a1eVar.s;
                        if (i29 != 0) {
                            y6a.M(obj35);
                            if (((String) obj).length() >= 2) {
                                a1eVar.s = 1;
                                if (b98Var.emit(obj, a1eVar) == lu3Var30) {
                                    return lu3Var30;
                                }
                            }
                        } else {
                            if (i29 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj35);
                        }
                        return Unit.a;
                    }
                }
                a1eVar = new a1e(this, rq3Var);
                Object obj352 = a1eVar.r;
                lu3 lu3Var302 = lu3.a;
                i29 = a1eVar.s;
                if (i29 != 0) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vj0(b98 b98Var, int i) {
        this.a = i;
        this.b = b98Var;
    }
}
