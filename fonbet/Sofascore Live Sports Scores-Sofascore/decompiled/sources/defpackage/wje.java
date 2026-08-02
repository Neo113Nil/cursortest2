package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhek;
import com.google.android.gms.internal.ads.zzhep;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfd;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhge;
import com.google.android.gms.internal.ads.zzhgm;
import com.google.android.gms.internal.ads.zzhjc;
import com.google.android.gms.internal.ads.zzhjg;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhjt;
import com.google.android.gms.internal.ads.zzhle;
import com.google.android.gms.internal.ads.zzhlk;
import com.google.android.gms.internal.ads.zzhmo;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhpz;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzhrt;
import com.google.android.gms.internal.ads.zzhru;
import com.google.android.gms.internal.ads.zzhrx;
import com.google.android.gms.internal.ads.zzhry;
import com.google.android.gms.internal.ads.zzhsb;
import com.google.android.gms.internal.ads.zzhsc;
import com.google.android.gms.internal.ads.zzhtj;
import com.google.android.gms.internal.ads.zzhtl;
import com.google.android.gms.internal.ads.zzhtm;
import com.google.android.gms.internal.ads.zzhtn;
import com.google.android.gms.internal.ads.zzhto;
import com.google.android.gms.internal.ads.zzhtp;
import com.google.android.gms.internal.ads.zzhtq;
import com.google.android.gms.internal.ads.zzhtr;
import com.google.android.gms.internal.ads.zzhvj;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzigq;
import com.google.android.gms.internal.fido.zzdz;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzv;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaix;
import com.google.android.gms.internal.measurement.zzaiy;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wje implements vje, oic, jr0, mu, fon, RemoteCall, zzdjm, zzdz, Continuation, zzhep, zzhmz, zzhmw, zzhoc, zzeb, dfp {
    public static final /* synthetic */ wje b = new wje(8);
    public static final /* synthetic */ wje c = new wje(9);
    public static final /* synthetic */ wje d = new wje(10);
    public static final /* synthetic */ wje e = new wje(11);
    public static final /* synthetic */ wje f = new wje(12);
    public static final /* synthetic */ wje g = new wje(13);
    public static final /* synthetic */ wje h = new wje(14);
    public static final /* synthetic */ wje i = new wje(16);
    public static final /* synthetic */ wje j = new wje(17);
    public static final /* synthetic */ wje k = new wje(20);
    public static final /* synthetic */ wje l = new wje(21);
    public static final /* synthetic */ wje m = new wje(22);
    public static final /* synthetic */ wje n = new wje(23);
    public final /* synthetic */ int a;

    public /* synthetic */ wje(int i2) {
        this.a = i2;
    }

    public static Typeface g(String str, wg8 wg8Var, int i2) {
        if (i2 == 0 && Intrinsics.c(wg8Var, wg8.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int C = n4o.C(i2, wg8Var);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(C) : Typeface.create(str, C);
    }

    public static final zzigq k(Object obj, Object obj2) {
        zzigq zzigqVar = (zzigq) obj;
        zzigq zzigqVar2 = (zzigq) obj2;
        if (!zzigqVar2.isEmpty()) {
            if (!zzigqVar.a) {
                zzigqVar = zzigqVar.g();
            }
            zzigqVar.i();
            if (!zzigqVar2.isEmpty()) {
                zzigqVar.putAll(zzigqVar2);
            }
        }
        return zzigqVar;
    }

    public static boolean o(int i2, int i3, byte[] bArr) {
        int i4;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 < i3) {
            while (i2 < i3) {
                int i5 = i2 + 1;
                i4 = bArr[i2];
                if (i4 < 0) {
                    if (i4 >= -32) {
                        if (i4 >= -16) {
                            if (i5 < i3 - 2) {
                                int i6 = i2 + 2;
                                int i7 = bArr[i5];
                                if (i7 <= -65) {
                                    if ((((i7 + 112) + (i4 << 28)) >> 30) == 0) {
                                        int i8 = i2 + 3;
                                        if (bArr[i6] <= 65471) {
                                            i2 += 4;
                                            if (bArr[i8] > 65471) {
                                            }
                                        }
                                    }
                                }
                                i4 = -1;
                                break;
                            }
                            i4 = xdn.a(i5, i3, bArr);
                            break;
                        }
                        if (i5 < i3 - 1) {
                            int i9 = i2 + 2;
                            char c2 = bArr[i5];
                            if (c2 <= 65471 && ((i4 != -32 || c2 >= 65440) && (i4 != -19 || c2 < 65440))) {
                                i2 += 3;
                                if (bArr[i9] > 65471) {
                                }
                            }
                            i4 = -1;
                            break;
                        }
                        i4 = xdn.a(i5, i3, bArr);
                        break;
                    }
                    if (i5 < i3) {
                        if (i4 >= -62) {
                            i2 += 2;
                            if (bArr[i5] > 65471) {
                            }
                        }
                        i4 = -1;
                        break;
                    }
                    break;
                }
                i2 = i5;
            }
        }
        i4 = 0;
        return i4 == 0;
    }

    @Override // defpackage.dfp
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.dfp
    public zfp b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.zzhep
    public Object c(zzhfd zzhfdVar, Class cls) {
        if (cls == zzhek.class) {
            return cls.cast(zzhle.a(zzhfdVar, anf.k));
        }
        zzl.x("AeadConfigurationV1 can only create AEADs");
        return null;
    }

    @Override // defpackage.oic
    public byte[] d(Object obj) {
        vei veiVar = ((xei) obj).a;
        vei veiVar2 = vei.OK;
        return veiVar.b;
    }

    @Override // defpackage.vje
    public Typeface e(mw8 mw8Var, wg8 wg8Var, int i2) {
        String str = mw8Var.f;
        int i3 = wg8Var.a / 100;
        if (i3 >= 0 && i3 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i3 && i3 < 4) {
            str = str.concat("-light");
        } else if (i3 != 4) {
            if (i3 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i3 || i3 >= 8) && 8 <= i3 && i3 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface g2 = g(str, wg8Var, i2);
            if (!Intrinsics.c(g2, Typeface.create(Typeface.DEFAULT, n4o.C(i2, wg8Var))) && !Intrinsics.c(g2, g(null, wg8Var, i2))) {
                typeface = g2;
            }
        }
        return typeface == null ? g(mw8Var.f, wg8Var, i2) : typeface;
    }

    @Override // defpackage.vje
    public Typeface f(int i2, wg8 wg8Var) {
        return g(null, wg8Var, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhge zzhgeVar = (zzhge) zzhesVar;
        jno jnoVar = zzhjt.a;
        zzhrt H = zzhru.H();
        zzhrx G = zzhry.G();
        zzhsb E = zzhsc.E();
        int i2 = zzhgeVar.a.c;
        E.n();
        ((zzhsc) E.b).G(i2);
        zzhsc zzhscVar = (zzhsc) E.o();
        G.n();
        ((zzhry) G.b).I(zzhscVar);
        byte[] b2 = zzhgeVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        G.n();
        ((zzhry) G.b).J(B);
        zzhry zzhryVar = (zzhry) G.o();
        H.n();
        ((zzhru) H.b).J(zzhryVar);
        zzhtm H2 = zzhtn.H();
        zzhgm zzhgmVar = zzhgeVar.a;
        zzhtr d2 = zzhjt.d(zzhgmVar);
        H2.n();
        ((zzhtn) H2.b).K(d2);
        byte[] b3 = zzhgeVar.c.a.b();
        mpo B2 = zziei.B(0, b3.length, b3);
        H2.n();
        ((zzhtn) H2.b).L(B2);
        zzhtn zzhtnVar = (zzhtn) H2.o();
        H.n();
        ((zzhru) H.b).K(zzhtnVar);
        return zzhos.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhru) H.o()).e(), zzhfl.c, zzhjt.a(zzhgmVar.e), zzhgeVar.e);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhpz zzhpzVar = (zzhpz) zzhfjVar;
        zzhmo zzhmoVar = zzhqy.a;
        zzhfm a = zzhqy.a(zzhpzVar.c);
        zzhto H = zzhtp.H();
        zzhtq F = zzhtr.F();
        int i2 = zzhpzVar.b;
        F.n();
        ((zzhtr) F.b).I(i2);
        zzhtl zzhtlVar = (zzhtl) zzhqy.a.b(zzhpzVar.d);
        F.n();
        ((zzhtr) F.b).H(zzhtlVar);
        zzhtr zzhtrVar = (zzhtr) F.o();
        H.n();
        ((zzhtp) H.b).J(zzhtrVar);
        int i3 = zzhpzVar.a;
        H.n();
        ((zzhtp) H.b).K(i3);
        return zzhot.a("type.googleapis.com/google.crypto.tink.HmacKey", a, (mpo) ((zzhtp) H.o()).e());
    }

    @Override // defpackage.jr0
    public void m(final dni dniVar) {
        dniVar.getClass();
        final int i2 = 0;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i3 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i3));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i3 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i3 = i2;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i3) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused) {
        }
        final int i3 = 3;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i3;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused2) {
        }
        final int i4 = 4;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i4;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused3) {
        }
        final int i5 = 5;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i5;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused4) {
        }
        final int i6 = 6;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i6;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused5) {
        }
        final int i7 = 7;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i7;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused6) {
        }
        final int i8 = 8;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i8;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused7) {
        }
        final int i9 = 9;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i9;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused8) {
        }
        final int i10 = 10;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i10;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused9) {
        }
        final int i11 = 1;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i11;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused10) {
        }
        final int i12 = 2;
        try {
            new Function0(this) { // from class: ati
                private final Object a() {
                    int i32 = 0;
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM EventsTable");
                    try {
                        if (A0.moveToFirst()) {
                            while (true) {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "WINNER_CODE");
                                if (y == null) {
                                    contentValues.putNull("winnerCode");
                                } else {
                                    contentValues.put("winnerCode", y);
                                }
                                Integer y2 = fqj.y(A0, "AGGREGATED_WINNER_CODE");
                                if (y2 == null) {
                                    contentValues.putNull("aggregatedWinnerCode");
                                } else {
                                    contentValues.put("aggregatedWinnerCode", y2);
                                }
                                Integer y3 = fqj.y(A0, "STATISTICS");
                                if (y3 == null) {
                                    contentValues.putNull("hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("hasEventPlayerStatistics", y3);
                                }
                                Integer y4 = fqj.y(A0, "HAS_PLAYER_HEAT_MAP");
                                if (y4 == null) {
                                    contentValues.putNull("hasEventPlayerHeatMap");
                                } else {
                                    contentValues.put("hasEventPlayerHeatMap", y4);
                                }
                                Integer y5 = fqj.y(A0, "START_TIMESTAMP");
                                if (y5 == null) {
                                    contentValues.putNull("startTimestamp");
                                } else {
                                    contentValues.put("startTimestamp", y5);
                                }
                                Integer y6 = fqj.y(A0, "END_TIMESTAMP");
                                if (y6 == null) {
                                    contentValues.putNull("endTimestamp");
                                } else {
                                    contentValues.put("endTimestamp", y6);
                                }
                                Integer y7 = fqj.y(A0, "_id");
                                if (y7 == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y7);
                                }
                                Integer y8 = fqj.y(A0, "FIRST_LEG_EVENT_ID");
                                if (y8 == null) {
                                    contentValues.putNull("previousLegEventId");
                                } else {
                                    contentValues.put("previousLegEventId", y8);
                                }
                                String A = fqj.A(A0, "LAST_PERIOD");
                                if (A == null) {
                                    contentValues.putNull("lastPeriod");
                                } else {
                                    contentValues.put("lastPeriod", A);
                                }
                                Integer y9 = fqj.y(A0, "CRICKET_CURRENT_TEAM_ID");
                                if (y9 == null) {
                                    contentValues.putNull("currentBattingTeamId");
                                } else {
                                    contentValues.put("currentBattingTeamId", y9);
                                }
                                Integer y10 = fqj.y(A0, "HIDE");
                                if (y10 == null) {
                                    contentValues.putNull("hide");
                                } else {
                                    contentValues.put("hide", y10);
                                }
                                Integer y11 = fqj.y(A0, "MUTED");
                                if (y11 == null) {
                                    contentValues.putNull(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                                } else {
                                    contentValues.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, y11);
                                }
                                Integer y12 = fqj.y(A0, "LAST_UPDATE");
                                if (y12 == null) {
                                    contentValues.putNull("lastUpdate");
                                } else {
                                    contentValues.put("lastUpdate", y12);
                                }
                                Integer y13 = fqj.y(A0, "TOURNAMENT_ID");
                                if (y13 == null) {
                                    contentValues.putNull("tournament_id");
                                } else {
                                    contentValues.put("tournament_id", y13);
                                }
                                String A2 = fqj.A(A0, "TOURNAMENT_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("tournament_name");
                                } else {
                                    contentValues.put("tournament_name", A2);
                                }
                                Integer y14 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y14 == null) {
                                    contentValues.putNull("tournament_category_id");
                                } else {
                                    contentValues.put("tournament_category_id", y14);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_NAME");
                                if (A3 == null) {
                                    contentValues.putNull("tournament_category_name");
                                } else {
                                    contentValues.put("tournament_category_name", A3);
                                }
                                contentValues.put("tournament_category_flag", "");
                                Integer y15 = fqj.y(A0, "SPORT_ID");
                                if (y15 == null) {
                                    contentValues.putNull("tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_category_sport_id", y15);
                                }
                                String A4 = fqj.A(A0, "SPORT_NAME");
                                if (A4 == null) {
                                    contentValues.putNull("tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_category_sport_slug", A4);
                                }
                                Integer y16 = fqj.y(A0, "TOURNAMENT_UNIQUE_ID");
                                if (y16 == null) {
                                    contentValues.putNull("tournament_unique_tournament_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_id", y16);
                                }
                                String A5 = fqj.A(A0, "TOURNAMENT_UNIQUE_NAME");
                                if (A5 == null) {
                                    contentValues.putNull("tournament_unique_tournament_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_name", A5);
                                }
                                contentValues.put("tournament_unique_tournament_userCount", (Integer) 0);
                                String A6 = fqj.A(A0, "HAS_PLAYER_STATISTICS");
                                if (A6 == null) {
                                    contentValues.putNull("tournament_unique_tournament_hasEventPlayerStatistics");
                                } else {
                                    contentValues.put("tournament_unique_tournament_hasEventPlayerStatistics", A6);
                                }
                                Integer y17 = fqj.y(A0, "REVERSE_TEAMS");
                                if (y17 == null) {
                                    contentValues.putNull("tournament_unique_tournament_displayInverseHomeAwayTeams");
                                } else {
                                    contentValues.put("tournament_unique_tournament_displayInverseHomeAwayTeams", y17);
                                }
                                String A7 = fqj.A(A0, "GROUND_TYPE");
                                if (A7 == null) {
                                    contentValues.putNull("tournament_unique_tournament_groundType");
                                } else {
                                    contentValues.put("tournament_unique_tournament_groundType", A7);
                                }
                                Integer y18 = fqj.y(A0, "CATEGORY_NAME_ID");
                                if (y18 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_id", y18);
                                }
                                String A8 = fqj.A(A0, "CATEGORY_NAME");
                                if (A8 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_name");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_name", A8);
                                }
                                contentValues.put("tournament_unique_tournament_category_flag", "");
                                Integer y19 = fqj.y(A0, "SPORT_ID");
                                if (y19 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_id");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_id", y19);
                                }
                                String A9 = fqj.A(A0, "SPORT_NAME");
                                if (A9 == null) {
                                    contentValues.putNull("tournament_unique_tournament_category_sport_slug");
                                } else {
                                    contentValues.put("tournament_unique_tournament_category_sport_slug", A9);
                                }
                                Integer y20 = fqj.y(A0, "SEASON_ID");
                                if (y20 == null) {
                                    contentValues.putNull("season_id");
                                } else {
                                    contentValues.put("season_id", y20);
                                }
                                Integer y21 = fqj.y(A0, "STATUS_CODE");
                                if (y21 == null) {
                                    contentValues.putNull("status_code");
                                } else {
                                    contentValues.put("status_code", y21);
                                }
                                String A10 = fqj.A(A0, "STATUS_DESCRIPTION");
                                if (A10 == null) {
                                    contentValues.putNull("status_description");
                                } else {
                                    contentValues.put("status_description", A10);
                                }
                                String A11 = fqj.A(A0, "STATUS_TYPE");
                                if (A11 == null) {
                                    contentValues.putNull("status_type");
                                } else {
                                    contentValues.put("status_type", A11);
                                }
                                Integer y22 = fqj.y(A0, "HOME_ID");
                                if (y22 == null) {
                                    contentValues.putNull("home_team_id");
                                } else {
                                    contentValues.put("home_team_id", y22);
                                }
                                String A12 = fqj.A(A0, "HOME_TEAM");
                                if (A12 == null) {
                                    contentValues.putNull("home_team_name");
                                } else {
                                    contentValues.put("home_team_name", A12);
                                }
                                contentValues.put("home_team_slug", "");
                                contentValues.put("home_team_userCount", (Integer) 0);
                                Integer y23 = fqj.y(A0, "HOME_TEAM_TYPE");
                                contentValues.put("home_team_type", Integer.valueOf(y23 != null ? y23.intValue() : i32));
                                String A13 = fqj.A(A0, "HOME_TEAM_NAMECODE");
                                if (A13 == null) {
                                    contentValues.putNull("home_team_nameCode");
                                } else {
                                    contentValues.put("home_team_nameCode", A13);
                                }
                                String A14 = fqj.A(A0, "HOME_TEAM_SHORTNAME");
                                if (A14 == null) {
                                    A14 = fqj.A(A0, "HOME_TEAM");
                                }
                                if (A14 == null) {
                                    contentValues.putNull("home_team_shortName");
                                } else {
                                    contentValues.put("home_team_shortName", A14);
                                }
                                String A15 = fqj.A(A0, "HOME_GENDER");
                                if (A15 == null) {
                                    contentValues.putNull("home_team_gender");
                                } else {
                                    contentValues.put("home_team_gender", A15);
                                }
                                Integer y24 = fqj.y(A0, "HOME_TEAM_ENABLED");
                                String str = "1";
                                contentValues.put("home_team_disabled", (y24 != null && y24.intValue() == 1) ? "0" : "1");
                                Integer y25 = fqj.y(A0, "HOME_RANK");
                                if (y25 == null) {
                                    contentValues.putNull("home_team_ranking");
                                } else {
                                    contentValues.put("home_team_ranking", y25);
                                }
                                Integer y26 = fqj.y(A0, "HOME_1_ID");
                                if (y26 == null) {
                                    contentValues.putNull("home_team_sub_team_one_id");
                                } else {
                                    contentValues.put("home_team_sub_team_one_id", y26);
                                }
                                String A16 = fqj.A(A0, "HOME_1_NAME");
                                if (A16 == null) {
                                    contentValues.putNull("home_team_sub_team_one_name");
                                } else {
                                    contentValues.put("home_team_sub_team_one_name", A16);
                                }
                                Integer y27 = fqj.y(A0, "HOME_2_ID");
                                if (y27 == null) {
                                    contentValues.putNull("home_team_sub_team_two_id");
                                } else {
                                    contentValues.put("home_team_sub_team_two_id", y27);
                                }
                                String A17 = fqj.A(A0, "HOME_2_NAME");
                                if (A17 == null) {
                                    contentValues.putNull("home_team_sub_team_two_name");
                                } else {
                                    contentValues.put("home_team_sub_team_two_name", A17);
                                }
                                String A18 = fqj.A(A0, "HOME_TEAM_COUNTRY_ISO");
                                if (A18 == null) {
                                    contentValues.putNull("home_team_country_alpha2");
                                } else {
                                    contentValues.put("home_team_country_alpha2", A18);
                                }
                                Integer y28 = fqj.y(A0, "AWAY_ID");
                                if (y28 == null) {
                                    contentValues.putNull("away_team_id");
                                } else {
                                    contentValues.put("away_team_id", y28);
                                }
                                String A19 = fqj.A(A0, "AWAY_TEAM");
                                if (A19 == null) {
                                    contentValues.putNull("away_team_name");
                                } else {
                                    contentValues.put("away_team_name", A19);
                                }
                                contentValues.put("away_team_slug", "");
                                contentValues.put("away_team_userCount", (Integer) 0);
                                Integer y29 = fqj.y(A0, "AWAY_TEAM_TYPE");
                                contentValues.put("away_team_type", Integer.valueOf(y29 != null ? y29.intValue() : 0));
                                String A20 = fqj.A(A0, "AWAY_TEAM_NAMECODE");
                                if (A20 == null) {
                                    contentValues.putNull("away_team_nameCode");
                                } else {
                                    contentValues.put("away_team_nameCode", A20);
                                }
                                String A21 = fqj.A(A0, "AWAY_TEAM_SHORTNAME");
                                if (A21 == null) {
                                    A21 = fqj.A(A0, "AWAY_TEAM");
                                }
                                if (A21 == null) {
                                    contentValues.putNull("away_team_shortName");
                                } else {
                                    contentValues.put("away_team_shortName", A21);
                                }
                                String A22 = fqj.A(A0, "AWAY_GENDER");
                                if (A22 == null) {
                                    contentValues.putNull("away_team_gender");
                                } else {
                                    contentValues.put("away_team_gender", A22);
                                }
                                Integer y30 = fqj.y(A0, "AWAY_RANK");
                                if (y30 == null) {
                                    contentValues.putNull("away_team_ranking");
                                } else {
                                    contentValues.put("away_team_ranking", y30);
                                }
                                Integer y31 = fqj.y(A0, "AWAY_TEAM_ENABLED");
                                if (y31 != null && y31.intValue() == 1) {
                                    str = "0";
                                }
                                contentValues.put("away_team_disabled", str);
                                Integer y32 = fqj.y(A0, "AWAY_1_ID");
                                if (y32 == null) {
                                    contentValues.putNull("away_team_sub_team_one_id");
                                } else {
                                    contentValues.put("away_team_sub_team_one_id", y32);
                                }
                                String A23 = fqj.A(A0, "AWAY_1_NAME");
                                if (A23 == null) {
                                    contentValues.putNull("away_team_sub_team_one_name");
                                } else {
                                    contentValues.put("away_team_sub_team_one_name", A23);
                                }
                                Integer y33 = fqj.y(A0, "AWAY_2_ID");
                                if (y33 == null) {
                                    contentValues.putNull("away_team_sub_team_two_id");
                                } else {
                                    contentValues.put("away_team_sub_team_two_id", y33);
                                }
                                String A24 = fqj.A(A0, "AWAY_2_NAME");
                                if (A24 == null) {
                                    contentValues.putNull("away_team_sub_team_two_name");
                                } else {
                                    contentValues.put("away_team_sub_team_two_name", A24);
                                }
                                String A25 = fqj.A(A0, "AWAY_TEAM_COUNTRY_ISO");
                                if (A25 == null) {
                                    contentValues.putNull("away_team_country_alpha2");
                                } else {
                                    contentValues.put("away_team_country_alpha2", A25);
                                }
                                Integer z = fqj.z(A0, "HOME_SCORE");
                                if (z == null) {
                                    contentValues.putNull("home_score_display");
                                } else {
                                    contentValues.put("home_score_display", z);
                                }
                                Integer y34 = fqj.y(A0, "P1");
                                if (y34 == null) {
                                    contentValues.putNull("home_score_period1");
                                } else {
                                    contentValues.put("home_score_period1", y34);
                                }
                                Integer y35 = fqj.y(A0, "P1_TIE_BREAK");
                                if (y35 == null) {
                                    contentValues.putNull("home_score_period1TieBreak");
                                } else {
                                    contentValues.put("home_score_period1TieBreak", y35);
                                }
                                String A26 = fqj.A(A0, "P1GS");
                                if (A26 == null) {
                                    contentValues.putNull("home_score_point");
                                } else {
                                    contentValues.put("home_score_point", A26);
                                }
                                Integer z2 = fqj.z(A0, "HOME_OVERTIME");
                                if (z2 == null) {
                                    contentValues.putNull("home_score_overtime");
                                } else {
                                    contentValues.put("home_score_overtime", z2);
                                }
                                Integer z3 = fqj.z(A0, "HOME_PENALTIES");
                                if (z3 == null) {
                                    contentValues.putNull("home_score_penalties");
                                } else {
                                    contentValues.put("home_score_penalties", z3);
                                }
                                Integer y36 = fqj.y(A0, "HOME_AGGREGATED");
                                if (y36 == null) {
                                    contentValues.putNull("home_score_aggregated");
                                } else {
                                    contentValues.put("home_score_aggregated", y36);
                                }
                                Integer z4 = fqj.z(A0, "SERIES_HOME_SCORE");
                                if (z4 == null) {
                                    contentValues.putNull("home_score_series");
                                } else {
                                    contentValues.put("home_score_series", z4);
                                }
                                String A27 = fqj.A(A0, "CRICKET_HOME_SCORE");
                                if (A27 == null) {
                                    contentValues.putNull("home_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("home_score_currentCricketDisplay", A27);
                                }
                                Integer z5 = fqj.z(A0, "AWAY_SCORE");
                                if (z5 == null) {
                                    contentValues.putNull("away_score_display");
                                } else {
                                    contentValues.put("away_score_display", z5);
                                }
                                Integer y37 = fqj.y(A0, "P2");
                                if (y37 == null) {
                                    contentValues.putNull("away_score_period1");
                                } else {
                                    contentValues.put("away_score_period1", y37);
                                }
                                Integer y38 = fqj.y(A0, "P2_TIE_BREAK");
                                if (y38 == null) {
                                    contentValues.putNull("away_score_period1TieBreak");
                                } else {
                                    contentValues.put("away_score_period1TieBreak", y38);
                                }
                                String A28 = fqj.A(A0, "P2GS");
                                if (A28 == null) {
                                    contentValues.putNull("away_score_point");
                                } else {
                                    contentValues.put("away_score_point", A28);
                                }
                                Integer z6 = fqj.z(A0, "AWAY_OVERTIME");
                                if (z6 == null) {
                                    contentValues.putNull("away_score_overtime");
                                } else {
                                    contentValues.put("away_score_overtime", z6);
                                }
                                Integer z7 = fqj.z(A0, "AWAY_PENALTIES");
                                if (z7 == null) {
                                    contentValues.putNull("away_score_penalties");
                                } else {
                                    contentValues.put("away_score_penalties", z7);
                                }
                                Integer y39 = fqj.y(A0, "AWAY_AGGREGATED");
                                if (y39 == null) {
                                    contentValues.putNull("away_score_aggregated");
                                } else {
                                    contentValues.put("away_score_aggregated", y39);
                                }
                                Integer z8 = fqj.z(A0, "SERIES_AWAY_SCORE");
                                if (z8 == null) {
                                    contentValues.putNull("away_score_series");
                                } else {
                                    contentValues.put("away_score_series", z8);
                                }
                                String A29 = fqj.A(A0, "CRICKET_AWAY_SCORE");
                                if (A29 == null) {
                                    contentValues.putNull("away_score_currentCricketDisplay");
                                } else {
                                    contentValues.put("away_score_currentCricketDisplay", A29);
                                }
                                Integer y40 = fqj.y(A0, "TIME_INFO_PLAYED");
                                if (y40 == null) {
                                    contentValues.putNull("time_played");
                                } else {
                                    contentValues.put("time_played", y40);
                                }
                                Integer y41 = fqj.y(A0, "TIME_INFO_PERIOD_LENGTH");
                                if (y41 == null) {
                                    contentValues.putNull("time_periodLength");
                                } else {
                                    contentValues.put("time_periodLength", y41);
                                }
                                Integer y42 = fqj.y(A0, "TIME_INFO_OVERTIME_LENGTH");
                                if (y42 == null) {
                                    contentValues.putNull("time_overtimeLength");
                                } else {
                                    contentValues.put("time_overtimeLength", y42);
                                }
                                Integer y43 = fqj.y(A0, "TIME_INFO_TOTAL_PERIOD_COUNT");
                                if (y43 == null) {
                                    contentValues.putNull("time_totalPeriodCount");
                                } else {
                                    contentValues.put("time_totalPeriodCount", y43);
                                }
                                Integer z9 = fqj.z(A0, "STATUS_TIME_INITIAL");
                                if (z9 == null) {
                                    contentValues.putNull("time_initial");
                                } else {
                                    contentValues.put("time_initial", z9);
                                }
                                Integer z10 = fqj.z(A0, "STATUS_TIME_MAX");
                                if (z10 == null) {
                                    contentValues.putNull("time_max");
                                } else {
                                    contentValues.put("time_max", z10);
                                }
                                Integer z11 = fqj.z(A0, "STATUS_TIME_PERIOD_TIMESTAMP");
                                if (z11 == null) {
                                    contentValues.putNull("time_currentPeriodStartTimestamp");
                                } else {
                                    contentValues.put("time_currentPeriodStartTimestamp", z11);
                                }
                                Integer z12 = fqj.z(A0, "STATUS_TIME_EXTRA");
                                if (z12 == null) {
                                    contentValues.putNull("time_extra");
                                } else {
                                    contentValues.put("time_extra", z12);
                                }
                                Integer y44 = fqj.y(A0, "AM_FOOTBALL_YARDS_TO_FIRST_DOWN");
                                if (y44 == null) {
                                    contentValues.putNull("am_football_currentYardsToFirstDown");
                                } else {
                                    contentValues.put("am_football_currentYardsToFirstDown", y44);
                                }
                                Integer y45 = fqj.y(A0, "AM_FOOTBALL_CURRENT_DOWN");
                                if (y45 == null) {
                                    contentValues.putNull("am_football_currentDown");
                                } else {
                                    contentValues.put("am_football_currentDown", y45);
                                }
                                Integer y46 = fqj.y(A0, "AM_FOOTBALL_CURRENT_YARDLINE");
                                if (y46 == null) {
                                    contentValues.putNull("am_football_currentYardline");
                                } else {
                                    contentValues.put("am_football_currentYardline", y46);
                                }
                                Integer y47 = fqj.y(A0, "AM_FOOTBALL_IS_GOAL_POSSESSION");
                                if (y47 == null) {
                                    contentValues.putNull("am_football_isGoalPossession");
                                } else {
                                    contentValues.put("am_football_isGoalPossession", y47);
                                }
                                Integer y48 = fqj.y(A0, "AM_FOOTBALL_CURRENT_POSSESSION");
                                if (y48 == null) {
                                    contentValues.putNull("am_football_currentPossession");
                                } else {
                                    contentValues.put("am_football_currentPossession", y48);
                                }
                                Integer y49 = fqj.y(A0, "AM_FOOTBALL_CURRENT_TEAM_HALF");
                                if (y49 == null) {
                                    contentValues.putNull("am_football_currentTeamHalf");
                                } else {
                                    contentValues.put("am_football_currentTeamHalf", y49);
                                }
                                dniVar2.D0("events_table", 5, contentValues);
                                if (!A0.moveToNext()) {
                                    break;
                                }
                                i32 = 0;
                            }
                            dniVar2.E("DROP TABLE IF EXISTS EventsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object b() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM MyPlayerTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "_id");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "FOLLOWERS");
                                if (y2 == null) {
                                    contentValues.putNull("userCount");
                                } else {
                                    contentValues.put("userCount", y2);
                                }
                                Integer y3 = fqj.y(A0, "TEAM_ID");
                                if (y3 == null) {
                                    contentValues.putNull("team_id");
                                } else {
                                    contentValues.put("team_id", y3);
                                }
                                String A2 = fqj.A(A0, "TEAM_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("team_name");
                                } else {
                                    contentValues.put("team_name", A2);
                                }
                                contentValues.put("team_slug", "");
                                contentValues.put("team_userCount", (Integer) 0);
                                String A3 = fqj.A(A0, "TEAM_GENDER");
                                if (A3 == null) {
                                    contentValues.putNull("team_gender");
                                } else {
                                    contentValues.put("team_gender", A3);
                                }
                                contentValues.put("team_disabled", (Integer) 0);
                                contentValues.put("team_sport_id", (Integer) 0);
                                String A4 = fqj.A(A0, "SPORT");
                                if (A4 == null) {
                                    contentValues.putNull("team_sport_slug");
                                } else {
                                    contentValues.put("team_sport_slug", A4);
                                }
                                dniVar2.D0("my_players_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS MyPlayerTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                private final Object c() {
                    dni dniVar2 = dniVar;
                    Cursor A0 = dniVar2.A0("SELECT * FROM PinnedTournamentsTable");
                    try {
                        if (A0.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                Integer y = fqj.y(A0, "UNIQUE_ID");
                                if (y == null) {
                                    contentValues.putNull("id");
                                } else {
                                    contentValues.put("id", y);
                                }
                                String A = fqj.A(A0, "UNIQUE_NAME");
                                if (A == null) {
                                    contentValues.putNull("name");
                                } else {
                                    contentValues.put("name", A);
                                }
                                Integer y2 = fqj.y(A0, "CATEGORY_ID");
                                if (y2 == null) {
                                    contentValues.putNull("category_id");
                                } else {
                                    contentValues.put("category_id", y2);
                                }
                                String A2 = fqj.A(A0, "CATEGORY_NAME");
                                if (A2 == null) {
                                    contentValues.putNull("category_name");
                                } else {
                                    contentValues.put("category_name", A2);
                                }
                                String A3 = fqj.A(A0, "CATEGORY_FLAG");
                                if (A3 == null) {
                                    contentValues.putNull("category_flag");
                                } else {
                                    contentValues.put("category_flag", A3);
                                }
                                Integer y3 = fqj.y(A0, "SPORT_ID");
                                if (y3 == null) {
                                    contentValues.putNull("category_sport_id");
                                } else {
                                    contentValues.put("category_sport_id", y3);
                                }
                                String A4 = fqj.A(A0, "SPORT_SLUG");
                                if (A4 == null) {
                                    contentValues.putNull("category_sport_slug");
                                } else {
                                    contentValues.put("category_sport_slug", A4);
                                }
                                dniVar2.D0("pinned_tournaments_table", 5, contentValues);
                            } while (A0.moveToNext());
                            dniVar2.E("DROP TABLE IF EXISTS PinnedTournamentsTable");
                            ugj.a.getClass();
                        }
                        Unit unit = Unit.a;
                        A0.close();
                        return Unit.a;
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Cursor A0;
                    String str;
                    int i32 = i12;
                    y9f y9fVar = ugj.a;
                    dni dniVar2 = dniVar;
                    switch (i32) {
                        case 0:
                            return a();
                        case 1:
                            A0 = dniVar2.A0("SELECT * FROM TvChannelVoteTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues = new ContentValues();
                                        Integer y = fqj.y(A0, "EVENT_ID");
                                        if (y == null) {
                                            contentValues.putNull("eventId");
                                        } else {
                                            contentValues.put("eventId", y);
                                        }
                                        Integer y2 = fqj.y(A0, "CHANNEL_ID");
                                        if (y2 == null) {
                                            contentValues.putNull("channelId");
                                        } else {
                                            contentValues.put("channelId", y2);
                                        }
                                        Integer y3 = fqj.y(A0, "CONFIRMED");
                                        if (y3 == null) {
                                            contentValues.putNull("isConfirmed");
                                        } else {
                                            contentValues.put("isConfirmed", y3);
                                        }
                                        contentValues.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("tv_channel_vote_table", 5, contentValues);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS TvChannelVoteTable");
                                    y9fVar.getClass();
                                }
                                Unit unit = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 2:
                            A0 = dniVar2.A0("SELECT * FROM SportOrder");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues2 = new ContentValues();
                                        String A = fqj.A(A0, "SPORT_NAME");
                                        if (A == null) {
                                            contentValues2.putNull("sportName");
                                        } else {
                                            contentValues2.put("sportName", A);
                                        }
                                        Integer y4 = fqj.y(A0, "SPORT_ORDER");
                                        if (y4 == null) {
                                            contentValues2.putNull("sportOrder");
                                        } else {
                                            contentValues2.put("sportOrder", y4);
                                        }
                                        dniVar2.D0("sport_order", 5, contentValues2);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SportOrder");
                                    y9fVar.getClass();
                                }
                                Unit unit2 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 3:
                            A0 = dniVar2.A0("SELECT * FROM MyChannelsTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues3 = new ContentValues();
                                        Integer y5 = fqj.y(A0, "CHANNEL_ID");
                                        if (y5 == null) {
                                            contentValues3.putNull("id");
                                        } else {
                                            contentValues3.put("id", y5);
                                        }
                                        String A2 = fqj.A(A0, "CHANNEL_NAME");
                                        if (A2 == null) {
                                            contentValues3.putNull("name");
                                        } else {
                                            contentValues3.put("name", A2);
                                        }
                                        String A3 = fqj.A(A0, "COUNTRY_CODE");
                                        if (A3 == null) {
                                            contentValues3.putNull("countryCode");
                                        } else {
                                            contentValues3.put("countryCode", A3);
                                        }
                                        dniVar2.D0("my_channels_table", 5, contentValues3);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyChannelsTable");
                                    y9fVar.getClass();
                                }
                                Unit unit3 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 4:
                            A0 = dniVar2.A0("SELECT * FROM MyLeaguesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues4 = new ContentValues();
                                        Integer y6 = fqj.y(A0, "UNIQUE_ID");
                                        if (y6 == null) {
                                            contentValues4.putNull("id");
                                        } else {
                                            contentValues4.put("id", y6);
                                        }
                                        String A4 = fqj.A(A0, "GROUPED_NAME");
                                        if (A4 == null) {
                                            contentValues4.putNull("name");
                                        } else {
                                            contentValues4.put("name", A4);
                                        }
                                        Integer y7 = fqj.y(A0, "FOLLOWERS");
                                        if (y7 == null) {
                                            contentValues4.putNull("userCount");
                                        } else {
                                            contentValues4.put("userCount", y7);
                                        }
                                        contentValues4.put("hasEventPlayerStatistics", (Integer) 0);
                                        contentValues4.put("displayInverseHomeAwayTeams", (Integer) 0);
                                        Integer y8 = fqj.y(A0, "CATEGORY_ID");
                                        if (y8 == null) {
                                            contentValues4.putNull("category_id");
                                        } else {
                                            contentValues4.put("category_id", y8);
                                        }
                                        String A5 = fqj.A(A0, "CATEGORY_NAME");
                                        if (A5 == null) {
                                            contentValues4.putNull("category_name");
                                        } else {
                                            contentValues4.put("category_name", A5);
                                        }
                                        String A6 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A6 == null) {
                                            contentValues4.putNull("category_flag");
                                        } else {
                                            contentValues4.put("category_flag", A6);
                                        }
                                        contentValues4.put("category_sport_id", (Integer) 0);
                                        String A7 = fqj.A(A0, "SPORT");
                                        if (A7 == null) {
                                            contentValues4.putNull("category_sport_slug");
                                        } else {
                                            contentValues4.put("category_sport_slug", A7);
                                        }
                                        dniVar2.D0("my_leagues_table", 5, contentValues4);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyLeaguesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit4 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 5:
                            A0 = dniVar2.A0("SELECT * FROM MyStageTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues5 = new ContentValues();
                                        String A8 = fqj.A(A0, "NAME");
                                        if (A8 == null) {
                                            contentValues5.putNull("description");
                                        } else {
                                            contentValues5.put("description", A8);
                                        }
                                        String A9 = fqj.A(A0, "TYPE");
                                        if (A9 == null) {
                                            contentValues5.putNull("type");
                                        } else {
                                            contentValues5.put("type", A9);
                                        }
                                        Integer y9 = fqj.y(A0, "_id");
                                        if (y9 == null) {
                                            contentValues5.putNull("id");
                                        } else {
                                            contentValues5.put("id", y9);
                                        }
                                        Integer y10 = fqj.y(A0, "START_TIMESTAMP");
                                        if (y10 == null) {
                                            contentValues5.putNull("startDateTimestamp");
                                        } else {
                                            contentValues5.put("startDateTimestamp", y10);
                                        }
                                        String A10 = fqj.A(A0, "FLAG");
                                        if (A10 == null) {
                                            contentValues5.putNull("flag");
                                        } else {
                                            contentValues5.put("flag", A10);
                                        }
                                        Integer y11 = fqj.y(A0, "LAST_UPDATE");
                                        if (y11 == null) {
                                            contentValues5.putNull("lastUpdate");
                                        } else {
                                            contentValues5.put("lastUpdate", y11);
                                        }
                                        contentValues5.put("status_code", (Integer) 0);
                                        String A11 = fqj.A(A0, "STATUS_TYPE");
                                        if (A11 == null) {
                                            contentValues5.putNull("status_type");
                                        } else {
                                            contentValues5.put("status_type", A11);
                                        }
                                        Integer y12 = fqj.y(A0, "WINNER_ID");
                                        if (y12 == null) {
                                            contentValues5.putNull("winner_id");
                                        } else {
                                            contentValues5.put("winner_id", y12);
                                        }
                                        String A12 = fqj.A(A0, "WINNER_NAME");
                                        if (A12 == null) {
                                            contentValues5.putNull("winner_name");
                                        } else {
                                            contentValues5.put("winner_name", A12);
                                        }
                                        Integer y13 = fqj.y(A0, "STAGE_ID");
                                        if (y13 == null) {
                                            contentValues5.putNull("parent_event_id");
                                        } else {
                                            contentValues5.put("parent_event_id", y13);
                                        }
                                        String A13 = fqj.A(A0, "STAGE_NAME");
                                        if (A13 == null) {
                                            contentValues5.putNull("parent_event_description");
                                        } else {
                                            contentValues5.put("parent_event_description", A13);
                                        }
                                        Integer y14 = fqj.y(A0, "STAGE_START_TIMESTAMP");
                                        if (y14 == null) {
                                            contentValues5.putNull("parent_event_startTimestamp");
                                        } else {
                                            contentValues5.put("parent_event_startTimestamp", y14);
                                        }
                                        String A14 = fqj.A(A0, "STAGE_FLAG");
                                        if (A14 == null) {
                                            contentValues5.putNull("parent_event_flag");
                                        } else {
                                            contentValues5.put("parent_event_flag", A14);
                                        }
                                        String A15 = fqj.A(A0, "SEASON_NAME");
                                        if (A15 == null) {
                                            contentValues5.putNull("stage_season_description");
                                        } else {
                                            contentValues5.put("stage_season_description", A15);
                                        }
                                        String A16 = fqj.A(A0, "SEASON_YEAR");
                                        if (A16 == null) {
                                            contentValues5.putNull("stage_season_year");
                                        } else {
                                            contentValues5.put("stage_season_year", A16);
                                        }
                                        Integer y15 = fqj.y(A0, "SEASON_ID");
                                        if (y15 == null) {
                                            contentValues5.putNull("stage_season_id");
                                        } else {
                                            contentValues5.put("stage_season_id", y15);
                                        }
                                        Integer y16 = fqj.y(A0, "UNIQUE_ID");
                                        if (y16 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_id");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_id", y16);
                                        }
                                        String A17 = fqj.A(A0, "UNIQUE_NAME");
                                        if (A17 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_name", A17);
                                        }
                                        String A18 = fqj.A(A0, "UNIQUE_PRIMARY");
                                        if (A18 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_primaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_primaryColorHex", A18);
                                        }
                                        String A19 = fqj.A(A0, "UNIQUE_SECONDARY");
                                        if (A19 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_secondaryColorHex");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_secondaryColorHex", A19);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_id", (Integer) 0);
                                        String A20 = fqj.A(A0, "CATEGORY");
                                        if (A20 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_name");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_name", A20);
                                        }
                                        String A21 = fqj.A(A0, "CATEGORY_FLAG");
                                        if (A21 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_flag");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_flag", A21);
                                        }
                                        contentValues5.put("stage_season_unique_stage_category_sport_id", (Integer) 0);
                                        String A22 = fqj.A(A0, "SPORT");
                                        if (A22 == null) {
                                            contentValues5.putNull("stage_season_unique_stage_category_sport_slug");
                                        } else {
                                            contentValues5.put("stage_season_unique_stage_category_sport_slug", A22);
                                        }
                                        dniVar2.D0("my_stage_table", 5, contentValues5);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyStageTable");
                                    y9fVar.getClass();
                                }
                                Unit unit5 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 6:
                            A0 = dniVar2.A0("SELECT * FROM MyTeamTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues6 = new ContentValues();
                                        Integer y17 = fqj.y(A0, "_id");
                                        if (y17 == null) {
                                            contentValues6.putNull("id");
                                        } else {
                                            contentValues6.put("id", y17);
                                        }
                                        String A23 = fqj.A(A0, "TEAM_NAME");
                                        if (A23 == null) {
                                            contentValues6.putNull("name");
                                        } else {
                                            contentValues6.put("name", A23);
                                        }
                                        contentValues6.put("slug", "");
                                        String A24 = fqj.A(A0, "TEAM_FOLLOWERS");
                                        if (A24 == null) {
                                            contentValues6.putNull("userCount");
                                        } else {
                                            contentValues6.put("userCount", A24);
                                        }
                                        contentValues6.put("type", (Integer) 0);
                                        String A25 = fqj.A(A0, "TEAM_GENDER");
                                        if (A25 == null) {
                                            contentValues6.putNull(InneractiveMediationDefs.KEY_GENDER);
                                        } else {
                                            contentValues6.put(InneractiveMediationDefs.KEY_GENDER, A25);
                                        }
                                        contentValues6.put("sport_id", (Integer) (-1));
                                        String A26 = fqj.A(A0, "TEAM_SPORT");
                                        if (A26 == null) {
                                            contentValues6.putNull("sport_slug");
                                        } else {
                                            contentValues6.put("sport_slug", A26);
                                        }
                                        Integer y18 = fqj.y(A0, "TEAM_ENABLED");
                                        if (y18 != null && y18.intValue() == 1) {
                                            str = "0";
                                            contentValues6.put(Y1.e, str);
                                            dniVar2.D0("my_team_table", 5, contentValues6);
                                        }
                                        str = "1";
                                        contentValues6.put(Y1.e, str);
                                        dniVar2.D0("my_team_table", 5, contentValues6);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS MyTeamTable");
                                    y9fVar.getClass();
                                }
                                Unit unit6 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        case 7:
                            return b();
                        case 8:
                            return c();
                        case 9:
                            A0 = dniVar2.A0("SELECT * FROM SavedSearchesTable");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues7 = new ContentValues();
                                        Integer y19 = fqj.y(A0, "_id");
                                        if (y19 == null) {
                                            contentValues7.putNull("id");
                                        } else {
                                            contentValues7.put("id", y19);
                                        }
                                        String A27 = fqj.A(A0, "ENTITY");
                                        if (A27 == null) {
                                            contentValues7.putNull("entity");
                                        } else {
                                            contentValues7.put("entity", A27);
                                        }
                                        String A28 = fqj.A(A0, "JSON");
                                        if (A28 == null) {
                                            contentValues7.putNull("json");
                                        } else {
                                            contentValues7.put("json", A28);
                                        }
                                        contentValues7.put("timestamp", Long.valueOf(A0.getLong(A0.getColumnIndexOrThrow("TIMESTAMP"))));
                                        dniVar2.D0("saved_searches_table", 5, contentValues7);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS SavedSearchesTable");
                                    y9fVar.getClass();
                                }
                                Unit unit7 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        default:
                            A0 = dniVar2.A0("SELECT * FROM PopularCategories");
                            try {
                                if (A0.moveToFirst()) {
                                    do {
                                        ContentValues contentValues8 = new ContentValues();
                                        String A29 = fqj.A(A0, "SPORT_NAME");
                                        if (A29 == null) {
                                            contentValues8.putNull("sportName");
                                        } else {
                                            contentValues8.put("sportName", A29);
                                        }
                                        Integer y20 = fqj.y(A0, "CATEGORY_ID");
                                        if (y20 == null) {
                                            contentValues8.putNull("categoryId");
                                        } else {
                                            contentValues8.put("categoryId", y20);
                                        }
                                        Integer y21 = fqj.y(A0, "ORDER_INDEX");
                                        if (y21 == null) {
                                            contentValues8.putNull("orderIndex");
                                        } else {
                                            contentValues8.put("orderIndex", y21);
                                        }
                                        dniVar2.D0("popular_categories", 5, contentValues8);
                                    } while (A0.moveToNext());
                                    dniVar2.E("DROP TABLE IF EXISTS PopularCategories");
                                    y9fVar.getClass();
                                }
                                Unit unit8 = Unit.a;
                                A0.close();
                                return Unit.a;
                            } finally {
                            }
                    }
                }
            }.invoke();
        } catch (Exception unused11) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        zzhjg zzhjgVar;
        switch (this.a) {
            case 21:
                jno jnoVar = zzhlk.a;
                if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    a70.p("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    zziei zzieiVar = zzhosVar.c;
                    zziew zziewVar = zziew.b;
                    int i2 = dpo.a;
                    zzhvj G = zzhvj.G(zzieiVar, zziew.c);
                    if (G.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (G.F().o() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    zzhfm zzhfmVar = zzhosVar.e;
                    if (zzhfmVar == zzhfm.c) {
                        zzhjgVar = zzhjg.b;
                    } else {
                        if (zzhfmVar != zzhfm.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(zzhfmVar.a));
                        }
                        zzhjgVar = zzhjg.c;
                    }
                    return zzhjc.d(zzhjh.b(zzhjgVar, G.E().D()), new zzicj(zzich.a(G.F().d())), zzhosVar.f);
                } catch (zzige unused) {
                    zzl.x("Parsing XAesGcmKey failed");
                    return null;
                }
            default:
                jno jnoVar2 = zzhzi.a;
                String str = zzhosVar.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    a70.p("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                    return null;
                }
                try {
                    zziei zzieiVar2 = zzhosVar.c;
                    zziew zziewVar2 = zziew.b;
                    int i3 = dpo.a;
                    zzhtj F = zzhtj.F(zzieiVar2, zziew.c);
                    if (F.D() == 0) {
                        return zzhwo.d(zzhzi.b(zzhosVar.e), zzich.a(F.E().d()), zzhosVar.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (zzige unused2) {
                    zzl.x("Parsing Ed25519PublicKey failed");
                    return null;
                }
        }
    }

    @Override // defpackage.oic
    public Object p(byte[] bArr) {
        int i2;
        byte b2;
        char c2 = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return xei.e;
        }
        int length = bArr.length;
        if (length != 1) {
            if (length == 2 && (b2 = bArr[0]) >= 48 && b2 <= 57) {
                i2 = (b2 - 48) * 10;
                c2 = 1;
            }
            return xei.g.h("Unknown code ".concat(new String(bArr, xp2.a)));
        }
        i2 = 0;
        byte b3 = bArr[c2];
        if (b3 >= 48 && b3 <= 57) {
            int i3 = (b3 - 48) + i2;
            List list = xei.d;
            if (i3 < list.size()) {
                return (xei) list.get(i3);
            }
        }
        return xei.g.h("Unknown code ".concat(new String(bArr, xp2.a)));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        return rbo.a(task);
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) anyClient;
        new LastLocationRequest.Builder();
        LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, null);
        zzdzVar.getClass();
        if (zzdzVar.t(zzo.b)) {
            ((zzv) zzdzVar.getService()).E1(lastLocationRequest, new zzee(4, null, new gzn(taskCompletionSource), null, null));
        } else if (zzdzVar.t(zzo.a)) {
            ((zzv) zzdzVar.getService()).V0(lastLocationRequest, new gzn(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzv) zzdzVar.getService()).zzs());
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 8:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().zzb());
            case 10:
                List list2 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().w());
            case 11:
                List list3 = zzfy.a;
                return Long.valueOf(zzags.b.get().q());
            case 16:
                List list4 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().zzx());
            default:
                List list5 = zzfy.a;
                return Boolean.valueOf(((zzaiy) zzaix.b.a.a).zza());
        }
    }

    @Override // defpackage.mu
    public void j(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdo();
                break;
            case 13:
                ((zzdjg) obj).zzo();
                break;
            case 14:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
                break;
            case 26:
                break;
            default:
                break;
        }
    }
}
