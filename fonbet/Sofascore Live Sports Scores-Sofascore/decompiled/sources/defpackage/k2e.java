package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k2e implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;

    public k2e(b98 b98Var, gzh gzhVar) {
        this.a = 3;
        this.b = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        j2e j2eVar;
        int i;
        lve lveVar;
        int i2;
        gbf gbfVar;
        int i3;
        czh czhVar;
        int i4;
        zzh zzhVar;
        int i5;
        dzi dziVar;
        int i6;
        nkl nklVar;
        int i7;
        List<DbMyUniqueTournament> myLeagueIds;
        okl oklVar;
        int i8;
        pkl pklVar;
        int i9;
        int i10 = this.a;
        b98 b98Var = this.b;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (i10) {
            case 0:
                if (rq3Var instanceof j2e) {
                    j2eVar = (j2e) rq3Var;
                    int i11 = j2eVar.s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        j2eVar.s = i11 - Integer.MIN_VALUE;
                        Object obj2 = j2eVar.r;
                        lu3 lu3Var = lu3.a;
                        i = j2eVar.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            f6e z4 = g7a.z((f6e) obj, new d11(2, z ? 1 : 0, 10));
                            j2eVar.s = 1;
                            if (b98Var.emit(z4, j2eVar) == lu3Var) {
                                break;
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj2);
                        }
                        break;
                    }
                }
                j2eVar = new j2e(this, rq3Var);
                Object obj22 = j2eVar.r;
                lu3 lu3Var2 = lu3.a;
                i = j2eVar.s;
                if (i != 0) {
                }
            case 1:
                if (rq3Var instanceof lve) {
                    lveVar = (lve) rq3Var;
                    int i12 = lveVar.s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        lveVar.s = i12 - Integer.MIN_VALUE;
                        Object obj3 = lveVar.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = lveVar.s;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            ArrayList W = CollectionsKt.W((List) obj);
                            lveVar.s = 1;
                            if (b98Var.emit(W, lveVar) == lu3Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj3);
                        }
                        break;
                    }
                }
                lveVar = new lve(this, rq3Var);
                Object obj32 = lveVar.r;
                lu3 lu3Var32 = lu3.a;
                i2 = lveVar.s;
                if (i2 != 0) {
                }
            case 2:
                if (rq3Var instanceof gbf) {
                    gbfVar = (gbf) rq3Var;
                    int i13 = gbfVar.s;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        gbfVar.s = i13 - Integer.MIN_VALUE;
                        Object obj4 = gbfVar.r;
                        lu3 lu3Var4 = lu3.a;
                        i3 = gbfVar.s;
                        if (i3 != 0) {
                            y6a.M(obj4);
                            f6e f6eVar = (f6e) obj;
                            br3 br3Var = new br3(3, z3 ? 1 : 0, 7);
                            a7j a7jVar = a7j.a;
                            f6eVar.getClass();
                            z88 z88Var = f6eVar.a;
                            z88Var.getClass();
                            f6e f6eVar2 = new f6e(new o63(12, z88Var, new t4h(a7jVar, new tl((Object) br3Var, (rq3) (z2 ? 1 : 0), 21))), f6eVar.b, f6eVar.c, jxa.D);
                            gbfVar.s = 1;
                            if (b98Var.emit(f6eVar2, gbfVar) == lu3Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj4);
                        }
                        break;
                    }
                }
                gbfVar = new gbf(this, rq3Var);
                Object obj42 = gbfVar.r;
                lu3 lu3Var42 = lu3.a;
                i3 = gbfVar.s;
                if (i3 != 0) {
                }
            case 3:
                if (rq3Var instanceof czh) {
                    czhVar = (czh) rq3Var;
                    int i14 = czhVar.s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        czhVar.s = i14 - Integer.MIN_VALUE;
                        Object obj5 = czhVar.r;
                        lu3 lu3Var5 = lu3.a;
                        i4 = czhVar.s;
                        if (i4 != 0) {
                            y6a.M(obj5);
                            List list = (List) obj;
                            boolean isEmpty = list.isEmpty();
                            List list2 = list;
                            if (isEmpty) {
                                list2 = oea.l(ke0.c, Sports.INSTANCE.getEntries());
                            }
                            czhVar.s = 1;
                            if (b98Var.emit(list2, czhVar) == lu3Var5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj5);
                        }
                        break;
                    }
                }
                czhVar = new czh(this, rq3Var);
                Object obj52 = czhVar.r;
                lu3 lu3Var52 = lu3.a;
                i4 = czhVar.s;
                if (i4 != 0) {
                }
            case 4:
                if (rq3Var instanceof zzh) {
                    zzhVar = (zzh) rq3Var;
                    int i15 = zzhVar.s;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        zzhVar.s = i15 - Integer.MIN_VALUE;
                        Object obj6 = zzhVar.r;
                        lu3 lu3Var6 = lu3.a;
                        i5 = zzhVar.s;
                        if (i5 != 0) {
                            y6a.M(obj6);
                            if (!((List) obj).isEmpty()) {
                                zzhVar.s = 1;
                                if (b98Var.emit(obj, zzhVar) == lu3Var6) {
                                    break;
                                }
                            }
                        } else if (i5 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj6);
                        }
                        break;
                    }
                }
                zzhVar = new zzh(this, rq3Var);
                Object obj62 = zzhVar.r;
                lu3 lu3Var62 = lu3.a;
                i5 = zzhVar.s;
                if (i5 != 0) {
                }
            case 5:
                if (rq3Var instanceof dzi) {
                    dziVar = (dzi) rq3Var;
                    int i16 = dziVar.s;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        dziVar.s = i16 - Integer.MIN_VALUE;
                        Object obj7 = dziVar.r;
                        lu3 lu3Var7 = lu3.a;
                        i6 = dziVar.s;
                        if (i6 != 0) {
                            y6a.M(obj7);
                            ArrayList W2 = CollectionsKt.W((List) obj);
                            dziVar.s = 1;
                            if (b98Var.emit(W2, dziVar) == lu3Var7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj7);
                        }
                        break;
                    }
                }
                dziVar = new dzi(this, rq3Var);
                Object obj72 = dziVar.r;
                lu3 lu3Var72 = lu3.a;
                i6 = dziVar.s;
                if (i6 != 0) {
                }
            case 6:
                if (rq3Var instanceof nkl) {
                    nklVar = (nkl) rq3Var;
                    int i17 = nklVar.s;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        nklVar.s = i17 - Integer.MIN_VALUE;
                        Object obj8 = nklVar.r;
                        lu3 lu3Var8 = lu3.a;
                        i7 = nklVar.s;
                        if (i7 != 0) {
                            y6a.M(obj8);
                            FavoritesEventsData favoritesEventsData = (FavoritesEventsData) obj;
                            boolean z5 = false;
                            if (favoritesEventsData != null && (myLeagueIds = favoritesEventsData.getMyLeagueIds()) != null && !myLeagueIds.isEmpty()) {
                                Iterator<T> it = myLeagueIds.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        DbMyUniqueTournament dbMyUniqueTournament = (DbMyUniqueTournament) it.next();
                                        if (dbMyUniqueTournament.getUniqueTournamentId() == 16 && dbMyUniqueTournament.getNotificationsEnabled()) {
                                            z5 = true;
                                        }
                                    }
                                }
                            }
                            Boolean valueOf = Boolean.valueOf(z5);
                            nklVar.s = 1;
                            if (b98Var.emit(valueOf, nklVar) == lu3Var8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj8);
                        }
                        break;
                    }
                }
                nklVar = new nkl(this, rq3Var);
                Object obj82 = nklVar.r;
                lu3 lu3Var82 = lu3.a;
                i7 = nklVar.s;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (rq3Var instanceof okl) {
                    oklVar = (okl) rq3Var;
                    int i18 = oklVar.s;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        oklVar.s = i18 - Integer.MIN_VALUE;
                        Object obj9 = oklVar.r;
                        lu3 lu3Var9 = lu3.a;
                        i8 = oklVar.s;
                        if (i8 != 0) {
                            y6a.M(obj9);
                            vel velVar = vel.a;
                            Integer b = vel.b((String) obj);
                            oklVar.s = 1;
                            if (b98Var.emit(b, oklVar) == lu3Var9) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj9);
                        }
                        break;
                    }
                }
                oklVar = new okl(this, rq3Var);
                Object obj92 = oklVar.r;
                lu3 lu3Var92 = lu3.a;
                i8 = oklVar.s;
                if (i8 != 0) {
                }
            default:
                if (rq3Var instanceof pkl) {
                    pklVar = (pkl) rq3Var;
                    int i19 = pklVar.s;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        pklVar.s = i19 - Integer.MIN_VALUE;
                        Object obj10 = pklVar.r;
                        lu3 lu3Var10 = lu3.a;
                        i9 = pklVar.s;
                        if (i9 != 0) {
                            y6a.M(obj10);
                            DbMyTeam dbMyTeam = (DbMyTeam) obj;
                            Boolean valueOf2 = Boolean.valueOf(Intrinsics.c(dbMyTeam != null ? Boolean.valueOf(dbMyTeam.getNotificationsEnabled()) : null, Boolean.TRUE));
                            pklVar.s = 1;
                            if (b98Var.emit(valueOf2, pklVar) == lu3Var10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj10);
                        }
                        break;
                    }
                }
                pklVar = new pkl(this, rq3Var);
                Object obj102 = pklVar.r;
                lu3 lu3Var102 = lu3.a;
                i9 = pklVar.s;
                if (i9 != 0) {
                }
        }
        return Unit.a;
    }

    public /* synthetic */ k2e(b98 b98Var, int i) {
        this.a = i;
        this.b = b98Var;
    }
}
