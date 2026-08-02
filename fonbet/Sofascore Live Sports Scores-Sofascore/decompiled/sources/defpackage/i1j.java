package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.TeamDetailsHeadFlags;
import com.sofascore.model.newNetwork.TennisPowerItem;
import com.sofascore.model.newNetwork.TennisPowerResponse;
import com.sofascore.model.newNetwork.statistics.season.team.TennisTeamSeasonStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i1j implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ i1j(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d9, code lost:
    
        if (r8.equals("SG") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01e2, code lost:
    
        if (r8.equals("SF") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01eb, code lost:
    
        if (r8.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01f4, code lost:
    
        if (r8.equals("PF") == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01fb, code lost:
    
        if (r8.equals("C") == false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Comparable sortedList$lambda$0;
        Comparable sortedList$lambda$1;
        String a;
        String f;
        int i;
        Double d = null;
        switch (this.a) {
            case 0:
                return Integer.valueOf(Intrinsics.c((String) obj, Sports.ICE_HOCKEY) ? R.string.hockey_depth_chart : R.string.nba_depth_chart);
            case 1:
                return Integer.valueOf(R.string.player_contract);
            case 2:
                return Integer.valueOf(R.string.previous_club);
            case 3:
                return Integer.valueOf(R.string.player_contribution);
            case 4:
                return Integer.valueOf(R.string.player_debut);
            case 5:
                return Integer.valueOf(R.string.general);
            case 6:
                return Integer.valueOf(R.string.age);
            case 7:
                return Integer.valueOf(R.string.player_height);
            case 8:
                return Integer.valueOf(R.string.market_value);
            case 9:
                b2j b2jVar = (b2j) obj;
                b2jVar.getClass();
                String str = b2jVar.u;
                return str == null ? "" : str;
            case 10:
                return (String) obj;
            case 11:
                b2j b2jVar2 = (b2j) obj;
                b2jVar2.getClass();
                String str2 = b2jVar2.v;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = b2jVar2.u;
                String str4 = str3 != null ? str3 : "";
                int hashCode = str2.hashCode();
                if (hashCode == 67) {
                    break;
                } else if (hashCode == 2550) {
                    break;
                } else if (hashCode == 2551) {
                    break;
                } else if (hashCode == 2643) {
                    break;
                } else if (hashCode == 2644) {
                    break;
                }
                int hashCode2 = str4.hashCode();
                if (hashCode2 != 67) {
                    if (hashCode2 != 2147) {
                        if (hashCode2 != 2237) {
                            if (hashCode2 != 2241) {
                                if (hashCode2 != 2271) {
                                    if (hashCode2 != 70) {
                                        if (hashCode2 != 71 || !str4.equals("G")) {
                                            return null;
                                        }
                                    } else if (!str4.equals("F")) {
                                        return null;
                                    }
                                } else if (!str4.equals("GF")) {
                                    return null;
                                }
                                return "G";
                            }
                            if (!str4.equals("FG")) {
                                return null;
                            }
                        } else if (!str4.equals("FC")) {
                            return null;
                        }
                        return "F";
                    }
                    if (!str4.equals("CF")) {
                        return null;
                    }
                } else if (!str4.equals("C")) {
                    return null;
                }
                return "C";
            case 12:
                ((TeamDetailsHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 13:
                ((TeamDetailsHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 14:
                sortedList$lambda$0 = TennisPowerResponse.getSortedList$lambda$0((TennisPowerItem) obj);
                return sortedList$lambda$0;
            case 15:
                sortedList$lambda$1 = TennisPowerResponse.getSortedList$lambda$1((TennisPowerItem) obj);
                return sortedList$lambda$1;
            case 16:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                TennisTeamSeasonStatistics o = tba.o(c73Var);
                if (o != null) {
                    return u6j.d(o);
                }
                return null;
            case 17:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                TennisTeamSeasonStatistics o2 = tba.o(c73Var2);
                if (o2 != null) {
                    return u6j.b(o2);
                }
                return null;
            case 18:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                TennisTeamSeasonStatistics o3 = tba.o(c73Var3);
                Integer tiebreaksWon = o3 != null ? o3.getTiebreaksWon() : null;
                TennisTeamSeasonStatistics o4 = tba.o(c73Var3);
                Integer tiebreakLosses = o4 != null ? o4.getTiebreakLosses() : null;
                if (tiebreaksWon == null || tiebreakLosses == null) {
                    return null;
                }
                int intValue = tiebreakLosses.intValue();
                int intValue2 = tiebreaksWon.intValue();
                int i2 = intValue + intValue2;
                return Double.valueOf(i2 == 0 ? 0.0d : 100.0d * (intValue2 / i2));
            case 19:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                TennisTeamSeasonStatistics o5 = tba.o(c73Var4);
                if (o5 != null) {
                    return u6j.g(o5);
                }
                return null;
            case 20:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                TennisTeamSeasonStatistics o6 = tba.o(c73Var5);
                if (o6 != null) {
                    return u6j.h(o6);
                }
                return null;
            case 21:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                TennisTeamSeasonStatistics o7 = tba.o(c73Var6);
                if (o7 != null) {
                    return u6j.l(o7);
                }
                return null;
            case 22:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                TennisTeamSeasonStatistics o8 = tba.o(c73Var7);
                if (o8 != null) {
                    return u6j.m(o8);
                }
                return null;
            case 23:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                TennisTeamSeasonStatistics o9 = tba.o(c73Var8);
                if (o9 == null || (a = u6j.a(o9)) == null) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(a));
            case 24:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                TennisTeamSeasonStatistics o10 = tba.o(c73Var9);
                if (o10 != null && (f = u6j.f(o10)) != null) {
                    d = Double.valueOf(Double.parseDouble(f));
                }
                return yid.h(d);
            case 25:
                hbj hbjVar = (hbj) obj;
                String str5 = hbjVar.g.b;
                long j = hbjVar.f;
                int i3 = pej.c;
                int i4 = (int) (j & 4294967295L);
                if (i4 > 0) {
                    cl5 C = hda.C();
                    if (C != null) {
                        int b = C.b(str5, i4 - 1);
                        if (b >= 0) {
                            i = b;
                        } else if (i4 > 0) {
                            i = Character.offsetByCodePoints(str5, i4, -1);
                        }
                        if (i == -1) {
                        }
                    } else if (i4 > 0) {
                        i = Character.offsetByCodePoints(str5, i4, -1);
                        if (i == -1) {
                            return null;
                        }
                        return new zw4(((int) (hbjVar.f & 4294967295L)) - i, 0);
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case 26:
                hbj hbjVar2 = (hbj) obj;
                String str6 = hbjVar2.g.b;
                long j2 = hbjVar2.f;
                int i5 = pej.c;
                int x = hda.x((int) (j2 & 4294967295L), str6);
                if (x != -1) {
                    return new zw4(0, x - ((int) (hbjVar2.f & 4294967295L)));
                }
                return null;
            case 27:
                hbj hbjVar3 = (hbj) obj;
                Integer e = hbjVar3.e();
                if (e == null) {
                    return null;
                }
                int intValue3 = e.intValue();
                long j3 = hbjVar3.f;
                int i6 = pej.c;
                return new zw4(((int) (j3 & 4294967295L)) - intValue3, 0);
            case 28:
                hbj hbjVar4 = (hbj) obj;
                Integer d2 = hbjVar4.d();
                if (d2 == null) {
                    return null;
                }
                int intValue4 = d2.intValue();
                long j4 = hbjVar4.f;
                int i7 = pej.c;
                return new zw4(0, intValue4 - ((int) (j4 & 4294967295L)));
            default:
                hbj hbjVar5 = (hbj) obj;
                Integer c = hbjVar5.c();
                if (c == null) {
                    return null;
                }
                int intValue5 = c.intValue();
                long j5 = hbjVar5.f;
                int i8 = pej.c;
                return new zw4(((int) (j5 & 4294967295L)) - intValue5, 0);
        }
    }
}
