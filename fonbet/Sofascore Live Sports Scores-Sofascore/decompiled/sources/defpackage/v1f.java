package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import com.appsflyer.sdk_base.referrer.Payload;
import com.facebook.AccessToken;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UserSubscriptionsResponse;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRacesFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v1f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1f(q3i q3iVar, j5i j5iVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 28;
        this.u = q3iVar;
        this.v = j5iVar;
        this.s = i;
    }

    private final Object e(Object obj) {
        owg owgVar = (owg) this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            List list = owgVar.d;
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(xw3.t(ku3Var, null, new v1f((IRecent) it.next(), owgVar, rq3Var, 16), 3));
            }
            this.t = null;
            this.s = 1;
            obj = m6k.u(arrayList, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        hwg hwgVar = (hwg) this.v;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            IRecent iRecent = (IRecent) obj2;
            String str = owgVar.g;
            int ordinal = hwgVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                zzl.b();
                                return null;
                            }
                            if (iRecent instanceof UniqueTournament) {
                                if (str != null && !str.equals(((UniqueTournament) iRecent).getSportSlug())) {
                                }
                            }
                        } else if (iRecent instanceof Event) {
                            if (str != null && !str.equals(((Event) iRecent).getSportSlug())) {
                            }
                        }
                    } else if (!(iRecent instanceof Player) || (str != null && !str.equals(((Player) iRecent).getSportSlug()))) {
                        if ((iRecent instanceof Team) && (str == null || str.equals(((Team) iRecent).getSportSlug()))) {
                            Set set = wyh.a;
                            Team team = (Team) iRecent;
                            Sport sport = team.getSport();
                            if (!wyh.e(sport != null ? sport.getSlug() : null)) {
                                Sport sport2 = team.getSport();
                                if (wyh.m(sport2 != null ? sport2.getSlug() : null) && team.getType() == 1) {
                                }
                            }
                        }
                    }
                } else if (iRecent instanceof Team) {
                    Set set2 = wyh.a;
                    Team team2 = (Team) iRecent;
                    Sport sport3 = team2.getSport();
                    if (!wyh.e(sport3 != null ? sport3.getSlug() : null)) {
                        Sport sport4 = team2.getSport();
                        if (!wyh.m(sport4 != null ? sport4.getSlug() : null) || team2.getType() == 0) {
                            if (str != null && !str.equals(team2.getSportSlug())) {
                            }
                        }
                    }
                }
            }
            arrayList2.add(obj2);
        }
        return arrayList2;
    }

    private final Object f(Object obj) {
        Context context = (Context) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            Bitmap bitmap = (Bitmap) this.u;
            this.s = 1;
            hs4 hs4Var = z45.a;
            obj = xw3.R(hq4.c, new rch(context, bitmap, rq3Var, 0), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName(), (File) obj);
        Intent intent = new Intent("android.intent.action.SEND");
        String str = (String) this.v;
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        intent.setFlags(1);
        intent.setClipData(new ClipData(context.getString(R.string.share_match_details), new String[]{"image/*"}, new ClipData.Item(uriForFile)));
        return intent;
    }

    private final Object g(Object obj) {
        rgh rghVar = (rgh) this.v;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            ia0 ia0Var = ia0.q;
            bfk g = ok3.p().g();
            String optString = ((JSONObject) this.t).optString("name");
            optString.getClass();
            String str = ((AccessToken) this.u).e;
            this.s = 1;
            Object a = rf4.a(g.a).a(new t53(optString, Payload.SOURCE_FACEBOOK, str, (rq3) null, 11), this);
            if (a != lu3Var) {
                a = Unit.a;
            }
            if (a == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        String string = rghVar.a.getString(R.string.signing_in, "Sofascore");
        string.getClass();
        rghVar.e(string);
        u0a.G(rghVar.a);
        return Unit.a;
    }

    private final Object h(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            nhh nhhVar = new nhh((ku3) this.t, (g62) this.u);
            Function2 function2 = (Function2) this.v;
            this.s = 1;
            if (function2.invoke(nhhVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r10.invoke(r9) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [sx2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [yda] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [yda] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, sq3, v1f] */
    /* JADX WARN: Type inference failed for: r9v1, types: [sq3, v1f] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        yda ydaVar;
        ?? r0 = (sx2) ((bka) this.u).b;
        lu3 lu3Var = lu3.a;
        ?? r2 = this.s;
        try {
        } catch (Throwable th) {
            this.t = th;
            this.s = 4;
            if (r0.I(r2, this) != lu3Var) {
                throw th;
            }
        }
        if (r2 == 0) {
            y6a.M(obj);
            CoroutineContext.Element element = ((ku3) this.t).getCoroutineContext().get(uic.g);
            if (element == null) {
                a70.r("Internal error. coroutineScope should've created a job.");
                return null;
            }
            yda ydaVar2 = (yda) element;
            this.t = ydaVar2;
            this.s = 1;
            Object O = r0.O(ydaVar2, this);
            if (O != lu3Var) {
                ydaVar = ydaVar2;
                obj = O;
            }
            return lu3Var;
        }
        if (r2 == 1) {
            yda ydaVar3 = (yda) this.t;
            y6a.M(obj);
            ydaVar = ydaVar3;
        } else {
            if (r2 != 2) {
                if (r2 == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (r2 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.t;
                y6a.M(obj);
                throw th2;
            }
            yda ydaVar4 = (yda) this.t;
            y6a.M(obj);
            r2 = ydaVar4;
            this.t = null;
            this.s = 3;
            this = r0.I(r2, this);
        }
        if (((Boolean) obj).booleanValue()) {
            Function1 function1 = (Function1) this.v;
            this.t = ydaVar;
            this.s = 2;
            r2 = ydaVar;
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0.collect(r1, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (defpackage.xw3.R(r1, r3, r7) == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        z88 z88Var = (z88) this.v;
        CoroutineContext coroutineContext = (CoroutineContext) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        int i2 = 1;
        if (i == 0) {
            y6a.M(obj);
            i8f i8fVar = (i8f) this.t;
            if (Intrinsics.c(coroutineContext, g.a)) {
                g98 g98Var = new g98(i8fVar, 2);
                this.s = 1;
            } else {
                h98 h98Var = new h98(z88Var, i8fVar, rq3Var, i2);
                this.s = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            gv9 gv9Var = (gv9) this.t;
            gv9Var.getClass();
            Iterator it = gv9Var.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.c(((vt2) it.next()).a, this.v)) {
                    break;
                }
                i2++;
            }
            Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
            if (valueOf != null) {
                ksa ksaVar = (ksa) this.u;
                int intValue = valueOf.intValue();
                this.s = 1;
                if (n9e.o(ksaVar, intValue, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r9 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m(Object obj) {
        b98 b98Var = (b98) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            gzh gzhVar = ((a0i) this.v).l;
            int offset = TimeZone.getDefault().getOffset(yaa.v()) / 1000;
            StringBuilder sb = new StringBuilder();
            sb.append(offset);
            String sb2 = sb.toString();
            this.u = null;
            this.t = b98Var;
            this.s = 1;
            gzhVar.getClass();
            obj = yaa.P(new fzh(gzhVar, sb2, rq3Var, 0), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b98Var = (b98) this.t;
            y6a.M(obj);
        }
        Object x = yaa.x((x2g) obj);
        this.u = null;
        this.t = null;
        this.s = 2;
    }

    private final Object n(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            b1d b1dVar = (b1d) this.t;
            usf usfVar = new usf(7, (StageCategoryRacesFragment) this.u, (StageCategoryRacesFragment) this.v);
            this.s = 1;
            if (b1dVar.collect(usfVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        pvd.x();
        return null;
    }

    private final Object o(Object obj) {
        j5i j5iVar = (j5i) this.v;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        q3i q3iVar = (q3i) this.u;
        j5i j5iVar2 = q3iVar.i;
        return yaa.p(ku3Var, j5iVar2 == null || j5iVar2 == j5iVar, new o3i(q3iVar, this.s, j5iVar, null, 1));
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new v1f((b1d) this.t, (PopularPlayersModal) this.u, rq3Var, (PopularPlayersModal) obj2, 0);
            case 1:
                v1f v1fVar = new v1f((t9f) this.u, (String) obj2, rq3Var, 1);
                v1fVar.t = obj;
                return v1fVar;
            case 2:
                v1f v1fVar2 = new v1f((sbf) this.u, (gta) obj2, rq3Var, 2);
                v1fVar2.t = obj;
                return v1fVar2;
            case 3:
                return new v1f((RaceFlowModels$RaceEntrant) this.t, (q50) this.u, (e1d) obj2, rq3Var, 3);
            case 4:
                v1f v1fVar3 = new v1f((apf) this.u, (nt9) obj2, rq3Var, 4);
                v1fVar3.t = obj;
                return v1fVar3;
            case 5:
                v1f v1fVar4 = new v1f((ot9) this.u, (bpf) obj2, rq3Var, 5);
                v1fVar4.t = obj;
                return v1fVar4;
            case 6:
                v1f v1fVar5 = new v1f((jqf) this.u, (wuc) obj2, rq3Var, 6);
                v1fVar5.t = obj;
                return v1fVar5;
            case 7:
                return new v1f((b1d) this.t, (RefereeEventsFragment) this.u, rq3Var, (RefereeEventsFragment) obj2, 7);
            case 8:
                v1f v1fVar6 = new v1f((wzc) this.u, (x20) obj2, rq3Var, 8);
                v1fVar6.t = obj;
                return v1fVar6;
            case 9:
                v1f v1fVar7 = new v1f((qa3) this.u, (Function2) obj2, rq3Var, 9);
                v1fVar7.t = obj;
                return v1fVar7;
            case 10:
                return new v1f((tfg) obj2, rq3Var, 10);
            case 11:
                return new v1f((String) this.t, (yhg) this.u, (String) obj2, rq3Var, 11);
            case 12:
                return new v1f((yhg) this.u, (Context) obj2, rq3Var, 12);
            case 13:
                return new v1f((u6b) this.t, (yia) this.u, (Function0) obj2, rq3Var, 13);
            case 14:
                v1f v1fVar8 = new v1f((j95) this.u, (svg) obj2, rq3Var, 14);
                v1fVar8.t = obj;
                return v1fVar8;
            case 15:
                v1f v1fVar9 = new v1f((svg) this.u, (Function2) obj2, rq3Var, 15);
                v1fVar9.t = obj;
                return v1fVar9;
            case 16:
                return new v1f((IRecent) this.u, (owg) obj2, rq3Var, 16);
            case 17:
                v1f v1fVar10 = new v1f((owg) this.u, (hwg) obj2, rq3Var, 17);
                v1fVar10.t = obj;
                return v1fVar10;
            case 18:
                v1f v1fVar11 = new v1f((cdi) this.u, (q50) obj2, rq3Var, 18);
                v1fVar11.t = obj;
                return v1fVar11;
            case 19:
                return new v1f((Context) this.t, (Bitmap) this.u, (String) obj2, rq3Var, 19);
            case 20:
                return new v1f((JSONObject) this.t, (AccessToken) this.u, (rgh) obj2, rq3Var, 20);
            case 21:
                return new v1f((rgh) this.t, (n19) this.u, (Function1) obj2, rq3Var, 21);
            case 22:
                v1f v1fVar12 = new v1f((g62) this.u, (Function2) obj2, rq3Var, 22);
                v1fVar12.t = obj;
                return v1fVar12;
            case 23:
                v1f v1fVar13 = new v1f((bka) this.u, (Function1) obj2, rq3Var, 23);
                v1fVar13.t = obj;
                return v1fVar13;
            case 24:
                v1f v1fVar14 = new v1f((CoroutineContext) this.u, (z88) obj2, rq3Var, 24);
                v1fVar14.t = obj;
                return v1fVar14;
            case 25:
                return new v1f((gv9) this.t, (ksa) this.u, this.v, rq3Var, 25);
            case 26:
                v1f v1fVar15 = new v1f((a0i) obj2, rq3Var, 26);
                v1fVar15.u = obj;
                return v1fVar15;
            case 27:
                return new v1f((b1d) this.t, (StageCategoryRacesFragment) this.u, rq3Var, (StageCategoryRacesFragment) obj2, 27);
            case 28:
                v1f v1fVar16 = new v1f((q3i) this.u, (j5i) obj2, this.s, rq3Var);
                v1fVar16.t = obj;
                return v1fVar16;
            default:
                return new v1f((g4i) this.t, (Stage) this.u, (Stage) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((v1f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 7:
                ((v1f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 27:
                ((v1f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((v1f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x03d7, code lost:
    
        if (r4 == r12) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0324, code lost:
    
        if (r11.a(r7, r33) != r12) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02db, code lost:
    
        if (r10 == r12) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        if (r2 == r1) goto L88;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x093e  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        Object value;
        Object value2;
        yda ydaVar;
        Object invoke;
        yda ydaVar2;
        Throwable th;
        Throwable a;
        tfg tfgVar;
        Object c;
        xag xagVar;
        int i;
        Object invoke2;
        eig eigVar;
        String str;
        Object f;
        Throwable th2;
        Throwable th3;
        Object d;
        Event event;
        int i2 = this.r;
        int i3 = 12;
        int i4 = 11;
        int i5 = 8;
        int i6 = 10;
        int i7 = 3;
        int i8 = 2;
        Object obj2 = this.v;
        rq3 rq3Var = null;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    nk0 nk0Var = new nk0(29, (PopularPlayersModal) this.u, (PopularPlayersModal) obj2);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 1:
                t9f t9fVar = (t9f) this.u;
                yzc yzcVar = t9fVar.f;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    dhk dhkVar = t9fVar.e;
                    this.t = ku3Var;
                    this.s = 1;
                    dhkVar.getClass();
                    P = yaa.P(new hgk(dhkVar, (String) obj2, null, 7), this);
                    if (P == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                UserSubscriptionsResponse userSubscriptionsResponse = (UserSubscriptionsResponse) yaa.x((x2g) P);
                if (userSubscriptionsResponse != null) {
                    List<PlayerSubscription> players = userSubscriptionsResponse.getSubscriptions().getPlayers();
                    List<TeamSubscription> teams = userSubscriptionsResponse.getSubscriptions().getTeams();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : teams) {
                        if (((TeamSubscription) obj3).getType() == 1) {
                            arrayList.add(obj3);
                        }
                    }
                    List S0 = CollectionsKt.S0(CollectionsKt.L0(CollectionsKt.H0(CollectionsKt.w0(arrayList, players), new wpb(25)), 20));
                    List H0 = CollectionsKt.H0(userSubscriptionsResponse.getSubscriptions().getTeams(), new wpb(26));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : H0) {
                        if (((TeamSubscription) obj4).getType() == 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    yzcVar.k(new lf8(S0, CollectionsKt.S0(CollectionsKt.L0(arrayList2, 20)), CollectionsKt.S0(CollectionsKt.L0(CollectionsKt.H0(userSubscriptionsResponse.getSubscriptions().getLeagues(), new wpb(27)), 20))));
                } else {
                    km5 km5Var = km5.a;
                    yzcVar.k(new lf8(km5Var, km5Var, km5Var));
                }
                return Unit.a;
            case 2:
                sbf sbfVar = (sbf) this.u;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    fdi fdiVar = sbfVar.i;
                    do {
                        value = fdiVar.getValue();
                        ((Boolean) value).getClass();
                    } while (!fdiVar.k(value, Boolean.TRUE));
                    int i12 = 2;
                    rq3 rq3Var2 = null;
                    List j = b.j(xw3.L(ku3Var2, null, null, new u41(i12, rq3Var2, i3), 3), xw3.L(ku3Var2, null, null, new m1f(sbfVar, (gta) obj2, rq3Var2, i12), 3));
                    this.t = null;
                    this.s = 1;
                    if (m6k.V(j, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                fdi fdiVar2 = sbfVar.i;
                do {
                    value2 = fdiVar2.getValue();
                    ((Boolean) value2).getClass();
                } while (!fdiVar2.k(value2, Boolean.FALSE));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    if (((gv9) ((e1d) obj2).getValue()).contains(new Integer(((RaceFlowModels$RaceEntrant) this.t).a))) {
                        q50 q50Var = (q50) this.u;
                        Float f2 = new Float(1.0f);
                        i4k h0 = s02.h0(400, 0, null, 6);
                        this.s = 1;
                        if (q50.a(q50Var, f2, h0, null, this, 12) == lu3Var4) {
                            return lu3Var4;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                nt9 nt9Var = (nt9) obj2;
                apf apfVar = (apf) this.u;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                int i15 = 1;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                zu4 c2 = waa.B(nt9Var, xw3.t(ku3Var3, (CoroutineContext) apfVar.a.c.getValue(), new vof(apfVar, nt9Var, null, i15), 2)).c();
                this.t = null;
                this.s = 1;
                Object T = c2.T(this);
                return T == lu3Var5 ? lu3Var5 : T;
            case 5:
                ot9 ot9Var = (ot9) this.u;
                lu3 lu3Var6 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var4 = (ku3) this.t;
                hs4 hs4Var = z45.a;
                av4 t = xw3.t(ku3Var4, rob.a.f, new wof((bpf) obj2, ot9Var, null, 1), 2);
                sti stiVar = ot9Var.c;
                if (stiVar instanceof ku9) {
                    l.c(((ku9) stiVar).b).b();
                }
                this.s = 1;
                Object w = t.w(this);
                return w == lu3Var6 ? lu3Var6 : w;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var5 = (ku3) this.t;
                this.s = 1;
                ((jqf) this.u).invoke(ku3Var5, (wuc) obj2, this);
                return lu3Var7;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    b1d b1dVar2 = (b1d) this.t;
                    usf usfVar = new usf(0, (RefereeEventsFragment) this.u, (RefereeEventsFragment) obj2);
                    this.s = 1;
                    if (b1dVar2.collect(usfVar, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var6 = (ku3) this.t;
                    z88 b = ((wzc) this.u).b();
                    usf usfVar2 = new usf(1, (x20) obj2, ku3Var6);
                    this.s = 1;
                    if (b.collect(usfVar2, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var7 = (ku3) this.t;
                    ydaVar = (qa3) this.u;
                    Function2 function2 = (Function2) obj2;
                    try {
                        p2g p2gVar = w2g.b;
                        this.t = ydaVar;
                        this.s = 1;
                        invoke = function2.invoke(ku3Var7, this);
                        if (invoke == lu3Var10) {
                            return lu3Var10;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ydaVar2 = ydaVar;
                        p2g p2gVar2 = w2g.b;
                        ydaVar = ydaVar2;
                        invoke = new u2g(th);
                        a = w2g.a(invoke);
                        qa3 qa3Var = (qa3) ydaVar;
                        if (a == null) {
                        }
                        return Unit.a;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ydaVar2 = (pa3) this.t;
                    try {
                        y6a.M(obj);
                        ydaVar = ydaVar2;
                        invoke = obj;
                    } catch (Throwable th5) {
                        th = th5;
                        p2g p2gVar22 = w2g.b;
                        ydaVar = ydaVar2;
                        invoke = new u2g(th);
                        a = w2g.a(invoke);
                        qa3 qa3Var2 = (qa3) ydaVar;
                        if (a == null) {
                        }
                        return Unit.a;
                    }
                }
                p2g p2gVar3 = w2g.b;
                a = w2g.a(invoke);
                qa3 qa3Var22 = (qa3) ydaVar;
                if (a == null) {
                    qa3Var22.V(invoke);
                } else {
                    qa3Var22.j0(a);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    tfgVar = (tfg) obj2;
                    xag xagVar2 = tfgVar.z;
                    if (xagVar2 != null) {
                        this.t = tfgVar;
                        this.u = xagVar2;
                        this.s = 1;
                        c = ((zag) xagVar2).c(null, this);
                        if (c == lu3Var11) {
                            return lu3Var11;
                        }
                        xagVar = xagVar2;
                    }
                    return Unit.a;
                }
                if (i21 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xagVar = (xag) this.u;
                tfgVar = (tfg) this.t;
                y6a.M(obj);
                c = obj;
                if (((Boolean) c).booleanValue()) {
                    kig kigVar = kig.CLICK;
                    ExoPlayer exoPlayer = tfgVar.v;
                    if (exoPlayer == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    zag zagVar = (zag) xagVar;
                    zagVar.i(kigVar, ((vg6) exoPlayer).getCurrentPosition());
                    kig kigVar2 = kig.TIME_TO_CLICK;
                    ExoPlayer exoPlayer2 = tfgVar.v;
                    if (exoPlayer2 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    zagVar.i(kigVar2, ((vg6) exoPlayer2).getCurrentPosition());
                    mjg mjgVar = tfgVar.c;
                    fhg fhgVar = tfgVar.y;
                    if (fhgVar == null) {
                        Intrinsics.i("videoLayersController");
                        throw null;
                    }
                    rjg b2 = mjgVar.b(fhgVar.j);
                    if (b2 != null && b2.c != null) {
                        hkg.T().post(new ojg(b2, 5));
                    }
                }
                return Unit.a;
            case 11:
                String str2 = (String) obj2;
                yhg yhgVar = (yhg) this.u;
                zl1 zl1Var = yhgVar.u;
                mjg mjgVar2 = yhgVar.c;
                lu3 lu3Var12 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    String str3 = (String) this.t;
                    if (str3 != null) {
                        switch (str3.hashCode()) {
                            case -1844074968:
                                if (str3.equals("AdLoaded")) {
                                    this.s = 3;
                                    if (yhgVar.k(this) == lu3Var12) {
                                        return lu3Var12;
                                    }
                                }
                                break;
                            case -1741877423:
                                if (str3.equals("AdPaused")) {
                                    yhgVar.o(nhg.d);
                                    yhgVar.p(false);
                                    xag xagVar3 = yhgVar.t;
                                    if (xagVar3 != null) {
                                        ((zag) xagVar3).i(kig.PAUSE, yhgVar.C);
                                    }
                                    hs4 hs4Var2 = z45.a;
                                    xw3.L(s9a.c(rob.a), null, null, new qhg(yhgVar, null, 3), 3);
                                    RelativeLayout relativeLayout = yhgVar.o;
                                    if (relativeLayout == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b3 = mjgVar2.b(relativeLayout);
                                    if (b3 != null) {
                                        hkg.T().post(new ojg(b3, 2));
                                    }
                                    yhgVar.g();
                                    break;
                                }
                                break;
                            case -1686946132:
                                if (str3.equals("AdImpression") && !yhgVar.z) {
                                    yhgVar.z = true;
                                    zl1Var.b.add(new adg(new lhg(yhgVar, 3)));
                                    zl1Var.j();
                                    break;
                                }
                                break;
                            case -1528092430:
                                if (str3.equals("AdVideoThirdQuartile")) {
                                    xag xagVar4 = yhgVar.t;
                                    if (xagVar4 != null) {
                                        ((zag) xagVar4).i(kig.THIRD_QUARTILE, yhgVar.C);
                                    }
                                    RelativeLayout relativeLayout2 = yhgVar.o;
                                    if (relativeLayout2 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b4 = mjgVar2.b(relativeLayout2);
                                    if (b4 != null) {
                                        hkg.T().post(new ojg(b4, 0));
                                        break;
                                    }
                                }
                                break;
                            case -916384160:
                                if (str3.equals("AdVideoMidpoint")) {
                                    xag xagVar5 = yhgVar.t;
                                    if (xagVar5 != null) {
                                        ((zag) xagVar5).i(kig.MIDPOINT, yhgVar.C);
                                    }
                                    RelativeLayout relativeLayout3 = yhgVar.o;
                                    if (relativeLayout3 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b5 = mjgVar2.b(relativeLayout3);
                                    if (b5 != null) {
                                        hkg.T().post(new ojg(b5, 10));
                                        break;
                                    }
                                }
                                break;
                            case -766240063:
                                if (str3.equals("sasCurrentTime")) {
                                    Float g = kotlin.text.b.g(str2);
                                    yhgVar.C = g != null ? (long) (g.floatValue() * 1000.0f) : -1L;
                                    hs4 hs4Var3 = z45.a;
                                    xw3.L(s9a.c(rob.a), null, null, new qhg(yhgVar, null, 2), 3);
                                    break;
                                }
                                break;
                            case -143494777:
                                if (str3.equals("AdDurationChange")) {
                                    this.s = 1;
                                    if (yhgVar.i(str2, this) == lu3Var12) {
                                        return lu3Var12;
                                    }
                                }
                                break;
                            case 123005777:
                                if (str3.equals("AdVideoComplete")) {
                                    xag xagVar6 = yhgVar.t;
                                    if (xagVar6 != null) {
                                        ((zag) xagVar6).i(kig.COMPLETE, yhgVar.C);
                                    }
                                    yhgVar.o(nhg.e);
                                    yhgVar.p(false);
                                    RelativeLayout relativeLayout4 = yhgVar.o;
                                    if (relativeLayout4 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b6 = mjgVar2.b(relativeLayout4);
                                    if (b6 != null) {
                                        i = 1;
                                        hkg.T().post(new ojg(b6, i));
                                    } else {
                                        i = 1;
                                    }
                                    hs4 hs4Var4 = z45.a;
                                    xw3.L(s9a.c(rob.a), null, null, new qhg(yhgVar, null, i), 3);
                                    yhgVar.g();
                                    break;
                                }
                                break;
                            case 227130189:
                                if (str3.equals("AdVolumeChange")) {
                                    boolean parseBoolean = Boolean.parseBoolean(str2);
                                    yhgVar.E = parseBoolean;
                                    yeg yegVar = yhgVar.x;
                                    if (yegVar != null) {
                                        ((xeg) yegVar).setMuted(parseBoolean);
                                    }
                                    zl1Var.b.add(new adg(new lhg(yhgVar, 2)));
                                    zl1Var.j();
                                    RelativeLayout relativeLayout5 = yhgVar.o;
                                    if (relativeLayout5 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b7 = mjgVar2.b(relativeLayout5);
                                    if (b7 != null) {
                                        hkg.T().post(new pjg(b7, yhgVar.E ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f, 0));
                                    }
                                    yhgVar.g();
                                    break;
                                }
                                break;
                            case 369958203:
                                if (str3.equals("AdVideoFirstQuartile")) {
                                    xag xagVar7 = yhgVar.t;
                                    if (xagVar7 != null) {
                                        ((zag) xagVar7).i(kig.FIRST_QUARTILE, yhgVar.C);
                                    }
                                    RelativeLayout relativeLayout6 = yhgVar.o;
                                    if (relativeLayout6 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b8 = mjgVar2.b(relativeLayout6);
                                    if (b8 != null) {
                                        hkg.T().post(new ojg(b8, 9));
                                        break;
                                    }
                                }
                                break;
                            case 479049069:
                                if (str3.equals("AdSkipped") && !yhgVar.F) {
                                    yhgVar.F = true;
                                    xag xagVar8 = yhgVar.t;
                                    if (xagVar8 != null) {
                                        tbg tbgVar = ((zag) xagVar8).j;
                                        if (tbgVar == null) {
                                            Intrinsics.i("adViewController");
                                            throw null;
                                        }
                                        tbgVar.closeAdView(true);
                                        break;
                                    }
                                }
                                break;
                            case 488344453:
                                if (str3.equals("AdError")) {
                                    this.s = 2;
                                    if (yhgVar.j(str2, this) == lu3Var12) {
                                        return lu3Var12;
                                    }
                                }
                                break;
                            case 729386686:
                                str3.equals("AdStarted");
                                break;
                            case 858456394:
                                if (str3.equals("AdVideoStart")) {
                                    this.s = 4;
                                    if (yhgVar.l(this) == lu3Var12) {
                                        return lu3Var12;
                                    }
                                }
                                break;
                            case 1024669788:
                                if (str3.equals("AdClickThru")) {
                                    if (StringsKt.R(str2)) {
                                        str2 = null;
                                    }
                                    hs4 hs4Var5 = z45.a;
                                    xw3.L(s9a.c(rob.a), null, null, new cce(yhgVar, str2, (rq3) null, i3), 3);
                                    break;
                                }
                                break;
                            case 2133007979:
                                if (str3.equals("AdPlaying")) {
                                    yhgVar.o(nhg.c);
                                    yhgVar.p(true);
                                    xag xagVar9 = yhgVar.t;
                                    if (xagVar9 != null) {
                                        ((zag) xagVar9).i(kig.RESUME, yhgVar.C);
                                    }
                                    RelativeLayout relativeLayout7 = yhgVar.o;
                                    if (relativeLayout7 == null) {
                                        Intrinsics.i("measuredView");
                                        throw null;
                                    }
                                    rjg b9 = mjgVar2.b(relativeLayout7);
                                    if (b9 != null) {
                                        hkg.T().post(new ojg(b9, 3));
                                    }
                                    yhgVar.g();
                                    break;
                                }
                                break;
                        }
                    }
                } else {
                    if (i22 != 1 && i22 != 2 && i22 != 3 && i22 != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                Context context = (Context) obj2;
                final yhg yhgVar2 = (yhg) this.u;
                nig nigVar = yhgVar2.d;
                pgg pggVar = yhgVar2.b;
                g62 g62Var = yhgVar2.p;
                khg khgVar = yhgVar2.a;
                nbg nbgVar = yhgVar2.e;
                lu3 lu3Var13 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    sdg sdgVar = new sdg(i8, context, yhgVar2);
                    yhgVar2.m = sdgVar;
                    sdgVar.setFocusable(true);
                    sdg sdgVar2 = yhgVar2.m;
                    if (sdgVar2 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar2.setFocusableInTouchMode(true);
                    sdg sdgVar3 = yhgVar2.m;
                    if (sdgVar3 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar3.setOnFocusChangeListener(new jr2(yhgVar2, i5));
                    if (Build.VERSION.SDK_INT < 35) {
                        sdg sdgVar4 = yhgVar2.m;
                        if (sdgVar4 == null) {
                            Intrinsics.i("rootLayout");
                            throw null;
                        }
                        sdgVar4.addOnLayoutChangeListener(new r8(yhgVar2, i5));
                    }
                    yhgVar2.n = new LinearLayout(context);
                    ct8 ct8Var = yhgVar2.f;
                    final int i24 = 0;
                    Function1 function1 = new Function1() { // from class: whg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            xag xagVar10;
                            switch (i24) {
                                case 0:
                                    String str4 = (String) obj5;
                                    boolean equalsIgnoreCase = "sasvpaid".equalsIgnoreCase(Uri.parse(str4).getScheme());
                                    rq3 rq3Var3 = null;
                                    yhg yhgVar3 = yhgVar2;
                                    if (equalsIgnoreCase) {
                                        Uri parse = Uri.parse(str4);
                                        String host = parse.getHost();
                                        String queryParameter = parse.getQueryParameter("code");
                                        if (queryParameter == null) {
                                            queryParameter = "";
                                        }
                                        String str5 = queryParameter;
                                        hs4 hs4Var6 = z45.a;
                                        xw3.L(s9a.c(rob.a), null, null, new v1f(host, yhgVar3, str5, rq3Var3, 11), 3);
                                    } else {
                                        hs4 hs4Var7 = z45.a;
                                        xw3.L(s9a.c(rob.a), null, null, new cce(yhgVar3, str4, (rq3) null, 12), 3);
                                    }
                                    return Boolean.TRUE;
                                default:
                                    boolean booleanValue = ((Boolean) obj5).booleanValue();
                                    yhg yhgVar4 = yhgVar2;
                                    if (booleanValue && yhgVar4.q == mhg.a && (xagVar10 = yhgVar4.t) != null) {
                                        yhgVar4.m(mhg.c);
                                        tbg tbgVar2 = ((zag) xagVar10).j;
                                        if (tbgVar2 == null) {
                                            Intrinsics.i("adViewController");
                                            throw null;
                                        }
                                        tbgVar2.expandAdView(false);
                                    }
                                    if (!booleanValue && yhgVar4.q == mhg.b) {
                                        yhgVar4.onCloseRequested();
                                    }
                                    return Unit.a;
                            }
                        }
                    };
                    this.s = 1;
                    invoke2 = ct8Var.invoke(context, function1, this);
                    break;
                } else if (i23 == 1) {
                    y6a.M(obj);
                    invoke2 = obj;
                } else if (i23 == 2) {
                    eigVar = (eig) this.t;
                    y6a.M(obj);
                    qgg qggVar = (qgg) pggVar;
                    qggVar.o = (Long) qggVar.c.invoke();
                    str = khgVar.f;
                    if (str == null) {
                        str = "";
                    }
                    String k = bf3.k("loadPlayer({params:'", me4.h("(?<!\\\\)'", str, "\\\\'"), "', url:'", khgVar.a, "'});");
                    this.t = eigVar;
                    this.s = 3;
                    break;
                } else {
                    if (i23 != 3) {
                        if (i23 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            y6a.M(obj);
                            f = obj;
                            Exception exc = (Exception) f;
                            if (exc != null) {
                                throw exc;
                            }
                            g62Var.r(null);
                            if (nigVar != null) {
                                ((pig) nigVar).o = yhgVar2;
                            }
                            if (nigVar != null) {
                                LinearLayout linearLayout = yhgVar2.n;
                                if (linearLayout == null) {
                                    Intrinsics.i("buttonsLayout");
                                    throw null;
                                }
                                linearLayout.addView(((pig) nigVar).m);
                            }
                            et8 et8Var = yhgVar2.g;
                            long j2 = (long) (yhgVar2.D * 1000.0f);
                            if (j2 < -1) {
                                j2 = -1;
                            }
                            ahg ahgVar = (ahg) et8Var.invoke(context, new Long(j2), new Long(nbgVar.l != mbg.a ? nbgVar.c : -100L), Boolean.valueOf(nbgVar.i));
                            yhgVar2.v = ahgVar;
                            if (ahgVar == null) {
                                Intrinsics.i("videoCloseController");
                                throw null;
                            }
                            ahgVar.g = yhgVar2;
                            if (nbgVar.f) {
                                sdg sdgVar5 = yhgVar2.m;
                                if (sdgVar5 == null) {
                                    Intrinsics.i("rootLayout");
                                    throw null;
                                }
                                idg idgVar = yhgVar2.w;
                                if (idgVar == null) {
                                    Intrinsics.i("fullscreenButton");
                                    throw null;
                                }
                                sdgVar5.addView(idgVar.getFullscreenButtonView());
                                idg idgVar2 = yhgVar2.w;
                                if (idgVar2 == null) {
                                    Intrinsics.i("fullscreenButton");
                                    throw null;
                                }
                                qz.y(idgVar2.getFullscreenButtonView(), gkg.c, new lhg(yhgVar2, 5));
                            } else {
                                LinearLayout linearLayout2 = yhgVar2.n;
                                if (linearLayout2 == null) {
                                    Intrinsics.i("buttonsLayout");
                                    throw null;
                                }
                                linearLayout2.addView(ahgVar.f);
                            }
                            mjg mjgVar3 = yhgVar2.c;
                            RelativeLayout relativeLayout8 = yhgVar2.o;
                            if (relativeLayout8 == null) {
                                Intrinsics.i("measuredView");
                                throw null;
                            }
                            rjg b10 = mjgVar3.b(relativeLayout8);
                            if (b10 != null) {
                                if (nbgVar.f) {
                                    idg idgVar3 = yhgVar2.w;
                                    if (idgVar3 == null) {
                                        Intrinsics.i("fullscreenButton");
                                        throw null;
                                    }
                                    b10.a(1, idgVar3.getFullscreenButtonView());
                                } else {
                                    ahg ahgVar2 = yhgVar2.v;
                                    if (ahgVar2 == null) {
                                        Intrinsics.i("videoCloseController");
                                        throw null;
                                    }
                                    b10.a(2, ahgVar2.f);
                                }
                                if (nigVar != null) {
                                    b10.a(4, ((pig) nigVar).m);
                                }
                                yeg yegVar2 = yhgVar2.x;
                                if (yegVar2 != null) {
                                    b10.a(1, ((xeg) yegVar2).getView());
                                }
                            }
                            leg[] legVarArr = leg.a;
                            keg kegVar = keg.VAST;
                            String str4 = khgVar.a;
                            long j3 = (long) (yhgVar2.D * 1000.0f);
                            ((qgg) pggVar).h(kegVar, str4, j3 < -1 ? -1L : j3);
                            yhgVar2.n(true);
                            yhgVar2.o(nhg.b);
                            sdg sdgVar6 = yhgVar2.m;
                            if (sdgVar6 != null) {
                                return sdgVar6;
                            }
                            Intrinsics.i("rootLayout");
                            throw null;
                        } catch (Throwable th6) {
                            th3 = th6;
                            th2 = null;
                            g62Var.r(th2);
                            throw th3;
                        }
                    }
                    eigVar = (eig) this.t;
                    y6a.M(obj);
                    RelativeLayout relativeLayout9 = new RelativeLayout(context);
                    relativeLayout9.addView(eigVar.c, new ViewGroup.LayoutParams(-1, -1));
                    sdg sdgVar7 = yhgVar2.m;
                    if (sdgVar7 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar7.addView(relativeLayout9, new ViewGroup.LayoutParams(-1, -1));
                    yhgVar2.o = relativeLayout9;
                    idg idgVar4 = (idg) yhgVar2.h.invoke(context);
                    yhgVar2.w = idgVar4;
                    if (idgVar4 == null) {
                        Intrinsics.i("fullscreenButton");
                        throw null;
                    }
                    final int i25 = 1;
                    idgVar4.setFullscreenControllerListener(new Function1() { // from class: whg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            xag xagVar10;
                            switch (i25) {
                                case 0:
                                    String str42 = (String) obj5;
                                    boolean equalsIgnoreCase = "sasvpaid".equalsIgnoreCase(Uri.parse(str42).getScheme());
                                    rq3 rq3Var3 = null;
                                    yhg yhgVar3 = yhgVar2;
                                    if (equalsIgnoreCase) {
                                        Uri parse = Uri.parse(str42);
                                        String host = parse.getHost();
                                        String queryParameter = parse.getQueryParameter("code");
                                        if (queryParameter == null) {
                                            queryParameter = "";
                                        }
                                        String str5 = queryParameter;
                                        hs4 hs4Var6 = z45.a;
                                        xw3.L(s9a.c(rob.a), null, null, new v1f(host, yhgVar3, str5, rq3Var3, 11), 3);
                                    } else {
                                        hs4 hs4Var7 = z45.a;
                                        xw3.L(s9a.c(rob.a), null, null, new cce(yhgVar3, str42, (rq3) null, 12), 3);
                                    }
                                    return Boolean.TRUE;
                                default:
                                    boolean booleanValue = ((Boolean) obj5).booleanValue();
                                    yhg yhgVar4 = yhgVar2;
                                    if (booleanValue && yhgVar4.q == mhg.a && (xagVar10 = yhgVar4.t) != null) {
                                        yhgVar4.m(mhg.c);
                                        tbg tbgVar2 = ((zag) xagVar10).j;
                                        if (tbgVar2 == null) {
                                            Intrinsics.i("adViewController");
                                            throw null;
                                        }
                                        tbgVar2.expandAdView(false);
                                    }
                                    if (!booleanValue && yhgVar4.q == mhg.b) {
                                        yhgVar4.onCloseRequested();
                                    }
                                    return Unit.a;
                            }
                        }
                    });
                    if (nbgVar.h) {
                        yeg yegVar3 = (yeg) yhgVar2.i.invoke(context);
                        yhgVar2.x = yegVar3;
                        xeg xegVar = (xeg) yegVar3;
                        xegVar.setMuteControllerListener(new chf(1, yhgVar2, yhg.class, "setMuted", "setMuted(Z)V", 0, 8));
                        sdg sdgVar8 = yhgVar2.m;
                        if (sdgVar8 == null) {
                            Intrinsics.i("rootLayout");
                            throw null;
                        }
                        sdgVar8.addView(xegVar.getView());
                        qz.y(xegVar.getView(), gkg.c, new u9g(18));
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    sdg sdgVar9 = yhgVar2.m;
                    if (sdgVar9 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    LinearLayout linearLayout3 = yhgVar2.n;
                    if (linearLayout3 == null) {
                        Intrinsics.i("buttonsLayout");
                        throw null;
                    }
                    sdgVar9.addView(linearLayout3, layoutParams);
                    LinearLayout linearLayout4 = yhgVar2.n;
                    if (linearLayout4 == null) {
                        Intrinsics.i("buttonsLayout");
                        throw null;
                    }
                    qz.y(linearLayout4, gkg.a, new lhg(yhgVar2, 4));
                    try {
                        this.t = null;
                        this.s = 4;
                        f = g62Var.f(this);
                        break;
                    } catch (Throwable th7) {
                        th3 = th7;
                        th2 = null;
                        g62Var.r(th2);
                        throw th3;
                    }
                }
                eig eigVar2 = (eig) invoke2;
                yhgVar2.y = eigVar2;
                String str5 = pcg.a.a;
                this.t = eigVar2;
                this.s = 2;
                if (eigVar2.c(str5, this) != lu3Var13) {
                    eigVar = eigVar2;
                    qgg qggVar2 = (qgg) pggVar;
                    qggVar2.o = (Long) qggVar2.c.invoke();
                    str = khgVar.f;
                    if (str == null) {
                    }
                    String k2 = bf3.k("loadPlayer({params:'", me4.h("(?<!\\\\)'", str, "\\\\'"), "', url:'", khgVar.a, "'});");
                    this.t = eigVar;
                    this.s = 3;
                }
                return lu3Var13;
            case 13:
                lu3 lu3Var14 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.d;
                    big bigVar = new big((yia) this.u, (Function0) obj2, rq3Var, i8);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, bigVar, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    qvg qvgVar = (qvg) this.t;
                    j95 j95Var = (j95) this.u;
                    aaf aafVar = new aaf(i4, qvgVar, (svg) obj2);
                    this.s = 1;
                    if (j95Var.invoke(aafVar, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    oug ougVar = (oug) this.t;
                    svg svgVar = (svg) this.u;
                    svgVar.k = ougVar;
                    qvg qvgVar2 = svgVar.l;
                    this.s = 1;
                    if (((Function2) obj2).invoke(qvgVar2, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                owg owgVar = (owg) obj2;
                IRecent iRecent = (IRecent) this.u;
                lu3 lu3Var17 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    if (!(iRecent instanceof Event) || pwg.a.contains(((Event) iRecent).getStatus().getType())) {
                        iRecent.setRecent(true);
                        return iRecent;
                    }
                    s96 s96Var = owgVar.c;
                    int id = iRecent.getId();
                    this.s = 1;
                    d = s96Var.d(id, this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Event event2 = (Event) this.t;
                        y6a.M(obj);
                        return event2;
                    }
                    y6a.M(obj);
                    d = obj;
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) d);
                Event event3 = (eventResponse == null || (event = eventResponse.getEvent()) == null) ? (Event) iRecent : event;
                event3.setRecent(true);
                uwg uwgVar = owgVar.b;
                int id2 = event3.getId();
                this.t = event3;
                this.s = 2;
                Object U = gz8.U(this, uwgVar.b.a, false, true, new pu9(uwgVar.f(event3), id2, i8));
                if (U != lu3Var17) {
                    U = Unit.a;
                }
                if (U != lu3Var17) {
                    U = Unit.a;
                }
                if (U != lu3Var17) {
                    return event3;
                }
                return lu3Var17;
            case 17:
                return e(obj);
            case 18:
                lu3 lu3Var18 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var8 = (ku3) this.t;
                    pog y = sea.y(new m56((cdi) this.u, i7));
                    usf usfVar3 = new usf(i7, (q50) obj2, ku3Var8);
                    this.s = 1;
                    if (y.collect(usfVar3, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                rgh rghVar = (rgh) this.t;
                lu3 lu3Var19 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    m19 m19Var = (m19) rghVar.c.getValue();
                    big bigVar2 = new big(rghVar, rq3Var, i6);
                    n19 n19Var = (n19) this.u;
                    Function1 function12 = (Function1) obj2;
                    k1e k1eVar = new k1e(i5, function12);
                    l97 l97Var = new l97(28, n19Var, rghVar, function12);
                    this.s = 1;
                    if (m19Var.d(bigVar2, n19Var, k1eVar, l97Var, this) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                return h(obj);
            case 23:
                return j(obj);
            case 24:
                return k(obj);
            case 25:
                return l(obj);
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                lu3 lu3Var20 = lu3.a;
                int i32 = this.s;
                if (i32 != 0) {
                    if (i32 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var2 = ((g4i) this.t).f;
                Stage stage = (Stage) this.u;
                int id3 = stage != null ? stage.getId() : ((Stage) obj2).getId();
                j5i j5iVar = j5i.b;
                this.s = 1;
                s96Var2.getClass();
                Object P2 = yaa.P(new m86(s96Var2, id3, "competitor", (rq3) null, 2), this);
                return P2 == lu3Var20 ? lu3Var20 : P2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1f(b1d b1dVar, Fragment fragment, rq3 rq3Var, Fragment fragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = fragment;
        this.v = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1f(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1f(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1f(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
