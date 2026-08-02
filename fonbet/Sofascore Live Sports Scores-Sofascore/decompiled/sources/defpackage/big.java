package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentActivity;
import androidx.glance.session.SessionWorker;
import com.ironsource.Ua;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.CategoryUniqueStagesResponse;
import com.sofascore.model.newNetwork.SportCategoriesResponse;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.newNetwork.TranslationResponse;
import com.sofascore.results.R;
import com.sofascore.results.service.StageWorker;
import com.sofascore.results.service.StartWorker;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class big extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ big(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = obj2;
    }

    private final Object e(Object obj) {
        Description description = (Description) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            fzh fzhVar = new fzh((rbi) this.t, description, rq3Var, 2);
            this.s = 1;
            obj = yaa.P(fzhVar, this);
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
        x2g x2gVar = (x2g) obj;
        return x2gVar instanceof v2g ? new Description(description.getId(), ((TranslationResponse) ((v2g) x2gVar).a).getTranslation().getValue()) : description;
    }

    private final Object f(Object obj) {
        ArrayList arrayList;
        SharedPreferences d;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            ArrayList l = oea.l(ke0.c, Sports.INSTANCE.getEntries());
            gzh gzhVar = ((lci) this.t).g;
            this.u = l;
            this.s = 1;
            Object b = gzhVar.b(this);
            if (b == lu3Var) {
                return lu3Var;
            }
            arrayList = l;
            obj = b;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.u;
            y6a.M(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty() && !list.equals(arrayList)) {
            Context i2 = ((lci) this.t).i();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = i2.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "UserHasCustomizedSportOrder", true);
            Unit unit = Unit.a;
            i3.apply();
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        StartWorker startWorker = (StartWorker) this.t;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            List j = b.j(xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, i2), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 2), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 3), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 4), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 5), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 6), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 7), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 8), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 9), 3), xw3.L(ku3Var, null, null, new nci(startWorker, rq3Var, 0), 3));
            this.u = null;
            this.s = 1;
            if (m6k.V(j, this) == lu3Var) {
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

    private final Object h(Object obj) {
        f7a f7aVar;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            f7a f7aVar2 = f7a.e;
            el elVar = ((StartWorker) this.t).j;
            String c = dv3.c();
            this.u = f7aVar2;
            this.s = 1;
            Object a = elVar.a(c, this);
            if (a == lu3Var) {
                return lu3Var;
            }
            obj = a;
            f7aVar = f7aVar2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f7aVar = (f7a) this.u;
            y6a.M(obj);
        }
        f7aVar.getClass();
        f7a.f = (List) obj;
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new big((g62) this.u, (String) obj2, rq3Var, 0);
            case 1:
                return new big((eig) this.u, (String) obj2, rq3Var, 1);
            case 2:
                return new big((yia) this.u, (Function0) obj2, rq3Var, 2);
            case 3:
                return new big((s85) this.u, (ivg) obj2, rq3Var, 3);
            case 4:
                return new big((tzg) this.u, (Context) obj2, rq3Var, 4);
            case 5:
                big bigVar = new big((af0) obj2, rq3Var, 5);
                bigVar.u = obj;
                return bigVar;
            case 6:
                return new big((SessionWorker) this.u, (af0) obj2, rq3Var, 6);
            case 7:
                big bigVar2 = new big((SessionWorker) obj2, rq3Var, 7);
                bigVar2.u = obj;
                return bigVar2;
            case 8:
                return new big((j52) this.u, (SettingsFragment) obj2, rq3Var, 8);
            case 9:
                return new big((seh) this.u, (s7h) obj2, rq3Var, 9);
            case 10:
                big bigVar3 = new big((rgh) obj2, rq3Var, 10);
                bigVar3.u = obj;
                return bigVar3;
            case 11:
                return new big((g7h) obj2, rq3Var, 11);
            case 12:
                return new big((g62) this.u, (Function2) obj2, rq3Var, 12);
            case 13:
                return new big((gmh) this.u, (w9) obj2, rq3Var, 13);
            case 14:
                return new big((SofaSeasonActivity) this.u, (Bitmap) obj2, rq3Var, 14);
            case 15:
                return new big((fm8) this.u, (q50) obj2, rq3Var, 15);
            case 16:
                return new big((scj) this.u, (e1d) obj2, rq3Var, 16);
            case 17:
                return new big((g1i) this.u, (StageSeason) obj2, rq3Var, 17);
            case 18:
                return new big((r1i) obj2, rq3Var, 18);
            case 19:
                return new big((StageDriverPerformanceGraphResponse) this.u, (Context) obj2, rq3Var, 19);
            case 20:
                return new big((n4i) this.u, (Stage) obj2, rq3Var, 20);
            case 21:
                return new big((j6i) this.u, (a6i) obj2, rq3Var, 21);
            case 22:
                return new big((j6i) this.u, (b6i) obj2, rq3Var, 22);
            case 23:
                return new big((h8i) obj2, rq3Var, 23);
            case 24:
                big bigVar4 = new big((StageWorker) obj2, rq3Var, 24);
                bigVar4.u = obj;
                return bigVar4;
            case 25:
                return new big((Description) this.u, (rbi) obj2, rq3Var, 25);
            case 26:
                return new big((lci) obj2, rq3Var, 26);
            case 27:
                big bigVar5 = new big((StartWorker) obj2, rq3Var, 27);
                bigVar5.u = obj;
                return bigVar5;
            case 28:
                return new big((StartWorker) obj2, rq3Var, 28);
            default:
                return new big((n72) this.u, (c80) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 2:
                ((big) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((big) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x049a, code lost:
    
        if (r0 == r1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04b7, code lost:
    
        if (r0 == r1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04d4, code lost:
    
        if (r0 == r1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0517, code lost:
    
        if (r1 == r0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0678, code lost:
    
        if (r0 == r14) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0659, code lost:
    
        if (r0.f(r55, r1) == r14) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0693, code lost:
    
        if (r0 == r14) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r2 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x07ba, code lost:
    
        if (r2 != r0) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x07c5, code lost:
    
        if (r1.invoke(r2, r55) == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0837, code lost:
    
        if (r0.a(r5, r55) == r3) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x086b, code lost:
    
        if (r2.e(r0, r1, r55) == r3) goto L422;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0735  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [yzc] */
    /* JADX WARN: Type inference failed for: r13v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [km5] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r1v130, types: [lu3] */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v132, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:367:0x07c5 -> B:362:0x07c9). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FragmentActivity activity;
        Object obj2;
        ce4 ce4Var;
        long j;
        fm8 fm8Var;
        Object a;
        Object a2;
        Object z;
        List<Stage> list;
        Stage stage;
        Object P;
        Object S;
        ?? r0;
        List<Category> categories;
        Object r;
        Object r2;
        Object r3;
        Object R;
        List<Stage> list2;
        Stage copy$default;
        Object P2;
        yzc yzcVar;
        Object c;
        int i = this.r;
        int i2 = 4;
        int i3 = 5;
        int i4 = 2;
        Object obj3 = this.t;
        int i5 = 1;
        Object obj4 = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    g62 g62Var = (g62) this.u;
                    String str = (String) obj3;
                    str.getClass();
                    this.s = 1;
                    if (g62Var.q(this, str) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                try {
                    if (i7 == 0) {
                        y6a.M(obj);
                        g62 g62Var2 = ((eig) this.u).f;
                        Exception exc = new Exception((String) obj3);
                        this.s = 1;
                        if (g62Var2.q(this, exc) == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i7 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aeh aehVar = (aeh) ((yia) this.u).b;
                f10 f10Var = new f10((Function0) obj3, 19);
                this.s = 1;
                aehVar.collect(f10Var, this);
                return lu3Var3;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    s85 s85Var = (s85) this.u;
                    float f = s85Var.b ? -1.0f : 1.0f;
                    svg svgVar = ((ivg) obj3).N;
                    long f2 = vmk.f(s85Var.a, f);
                    this.s = 1;
                    if (svgVar.b(f2, false, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                tzg tzgVar = (tzg) this.u;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    j4f[] j4fVarArr = j4f.a;
                    long j2 = tzgVar.getLong("SYNC_TIMESTAMP", 0L);
                    String string = tzgVar.getString("CHAT_COLOR", null);
                    boolean z2 = tzgVar.getBoolean("ACTIVE_CROWDSOURCER", false);
                    float f3 = tzgVar.getFloat("CREDIBILITY_SCORE", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    long j3 = tzgVar.getLong("JOIN_DATE", 0L);
                    String string2 = tzgVar.getString("USER_BADGE", null);
                    boolean z3 = tzgVar.getBoolean("PREF_FANTASY_USER", false);
                    String string3 = tzgVar.getString("USER_ID", "");
                    String str2 = string3 == null ? "" : string3;
                    String string4 = tzgVar.getString("USER_NAME", "Unknown");
                    String str3 = string4 == null ? "Unknown" : string4;
                    String string5 = tzgVar.getString("TYPE", "sofa");
                    String str4 = string5 == null ? "sofa" : string5;
                    String string6 = tzgVar.getString("ACCESS_TOKEN", "");
                    String str5 = string6 == null ? "" : string6;
                    String string7 = tzgVar.getString("TOKEN_SECRET", "");
                    String str6 = string7 == null ? "" : string7;
                    boolean z4 = tzgVar.getBoolean("LOGIN", false);
                    boolean z5 = tzgVar.getBoolean("com.sofascore.results.PROFILE_ADS", true);
                    String string8 = tzgVar.getString("PROFILE_IMG_URL", "");
                    String str7 = string8 == null ? "" : string8;
                    String string9 = tzgVar.getString("USER_NICKNAME", "");
                    String str8 = string9 == null ? "" : string9;
                    boolean z6 = tzgVar.getBoolean("PURCHASED_ADS", false);
                    boolean z7 = tzgVar.getBoolean("DEV_MOD", false);
                    String string10 = tzgVar.getString("CHAT_ROLE", "");
                    UserAccount userAccount = new UserAccount(str2, str3, str4, str5, str6, z4, z5, str7, str8, z6, z7, tzgVar.getBoolean("FORCE_ADS", false), tzgVar.getBoolean("SHOW_TEST_RATING", false), j3, string10 == null ? "" : string10, null, null, tzgVar.getBoolean("USER_EDITOR", false), tzgVar.getInt("PREVIOUS_LEADERBOARD_ID", 0), tzgVar.getInt("LEADERBOARD_ID", 0), tzgVar.getInt("LEADERBOARD_MAX_LVL", 0), j2, string, z2, f3, z3, false, string2, 0L, null, null, null, null, null, -201228288, 3, null);
                    SharedPreferences.Editor edit = tzgVar.a.edit();
                    edit.clear();
                    edit.apply();
                    ye4 a3 = rf4.a((Context) obj3);
                    hje hjeVar = new hje(userAccount, r13, i2);
                    this.s = 1;
                    if (a3.a(hjeVar, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    k8h k8hVar = (k8h) this.u;
                    String str9 = ((af0) obj3).a;
                    this.s = 1;
                    af0 af0Var = (af0) k8hVar.a.remove(str9);
                    if (af0Var != null) {
                        af0Var.c.r(null);
                        af0Var.b.set(false);
                        af0Var.j.e(null);
                    }
                    if (Unit.a == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    g8h g8hVar = ((SessionWorker) this.u).b;
                    big bigVar = new big((af0) obj3, r13, i3);
                    this.s = 1;
                    if (((l8h) g8hVar).a(bigVar, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                SessionWorker sessionWorker = (SessionWorker) obj3;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                zij zijVar = (zij) this.u;
                Context applicationContext = sessionWorker.getApplicationContext();
                rq3 rq3Var = null;
                n50 n50Var = new n50(zijVar, sessionWorker, rq3Var, 13);
                yw ywVar = new yw(sessionWorker, zijVar, null);
                this.s = 1;
                Object r4 = s9a.r(new va8(applicationContext, ywVar, n50Var, rq3Var, 5), this);
                return r4 == lu3Var8 ? lu3Var8 : r4;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (n4o.y(800L, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if ((((j52) this.u) instanceof o42) && (activity = ((SettingsFragment) obj3).getActivity()) != null) {
                    activity.finish();
                }
                return Unit.a;
            case 9:
                s7h s7hVar = (s7h) obj3;
                seh sehVar = (seh) this.u;
                lu3 lu3Var10 = lu3.a;
                int i15 = this.s;
                try {
                } catch (Exception e) {
                    e.getMessage();
                    if (sehVar.d(s7hVar)) {
                        x7h a4 = sehVar.b.a(s7hVar.a);
                        sehVar.h = s7h.a(s7hVar, a4, null, null, 4);
                        b8h b8hVar = sehVar.c;
                        xw3.L(s9a.c(b8hVar.e), null, null, new o46(b8hVar, a4, null), 3);
                        String str10 = a4.a;
                        peh pehVar = peh.b;
                        this.s = 2;
                        break;
                    }
                }
                if (i15 == 0) {
                    y6a.M(obj);
                    ye4 ye4Var = sehVar.e;
                    qeh qehVar = new qeh(sehVar, r13, i5);
                    this.s = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                i19 i19Var = (i19) this.u;
                lu3 lu3Var11 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.u = null;
                    this.s = 1;
                    if (((rgh) obj3).d(i19Var, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 11:
                g7h g7hVar = (g7h) obj3;
                lu3 lu3Var12 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        if (((AtomicInteger) ((de0) g7hVar.e).b).decrementAndGet() == 0) {
                            return Unit.a;
                        }
                        s9a.t((ku3) g7hVar.b);
                        ce4Var = (ce4) g7hVar.c;
                        g62 g62Var3 = (g62) g7hVar.d;
                        this.u = ce4Var;
                        this.s = 1;
                        obj2 = g62Var3.f(this);
                        break;
                    } else {
                        ce4Var = (ce4) this.u;
                        y6a.M(obj);
                        obj2 = obj;
                        this.u = null;
                        this.s = 2;
                        break;
                    }
                } else {
                    y6a.M(obj);
                    if (((AtomicInteger) ((de0) g7hVar.e).b).get() <= 0) {
                        a70.r("Check failed.");
                        return null;
                    }
                    s9a.t((ku3) g7hVar.b);
                    ce4Var = (ce4) g7hVar.c;
                    g62 g62Var32 = (g62) g7hVar.d;
                    this.u = ce4Var;
                    this.s = 1;
                    obj2 = g62Var32.f(this);
                }
            case 12:
                g62 g62Var4 = (g62) this.u;
                lu3 lu3Var13 = lu3.a;
                int i18 = this.s;
                try {
                    if (i18 == 0) {
                        y6a.M(obj);
                        v1f v1fVar = new v1f(g62Var4, (Function2) obj3, (rq3) r13, 22);
                        this.s = 1;
                        if (s9a.r(v1fVar, this) == lu3Var13) {
                            return lu3Var13;
                        }
                    } else {
                        if (i18 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    g62Var4.r(null);
                } catch (Throwable th) {
                    g62Var4.c(th, false);
                }
                return Unit.a;
            case 13:
                gmh gmhVar = (gmh) this.u;
                lu3 lu3Var14 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    if (gmhVar != null) {
                        w9 w9Var = (w9) obj3;
                        int ordinal = gmhVar.a.c.ordinal();
                        long j4 = Long.MAX_VALUE;
                        if (ordinal == 0) {
                            j = 4000;
                        } else if (ordinal == 1) {
                            j = Ua.s;
                        } else {
                            if (ordinal != 2) {
                                zzl.b();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (w9Var != null) {
                            AccessibilityManager accessibilityManager = ((mx) w9Var).a;
                            if (j < 2147483647L && Build.VERSION.SDK_INT >= 29) {
                                int y = eq3.y(accessibilityManager, (int) j, 3);
                                if (y != Integer.MAX_VALUE) {
                                    j4 = y;
                                }
                                this.s = 1;
                                if (n4o.y(j4, this) == lu3Var14) {
                                    return lu3Var14;
                                }
                            }
                        }
                        j4 = j;
                        this.s = 1;
                        if (n4o.y(j4, this) == lu3Var14) {
                        }
                    }
                    return Unit.a;
                }
                if (i19 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                gmhVar.a();
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    zic zicVar = zic.g;
                    SofaSeasonActivity sofaSeasonActivity = (SofaSeasonActivity) this.u;
                    String y2 = dmi.y(sofaSeasonActivity.getString(R.string.sofascore_season_2025_sharing_message), " https://app.sofascore.com/nixz/2y8uqqn1");
                    this.s = 1;
                    if (zicVar.L(sofaSeasonActivity, (Bitmap) obj3, y2, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                fm8 fm8Var2 = (fm8) this.u;
                lu3 lu3Var16 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    boolean z8 = fm8Var2 instanceof rdh;
                    fm8Var = fm8Var2;
                    q50 q50Var = (q50) obj3;
                    if (z8) {
                        Float f4 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.s = 1;
                        break;
                    } else {
                        Float f5 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i4k h0 = s02.h0(200, 0, null, 6);
                        this.s = 3;
                        a = q50.a(q50Var, f5, h0, null, this, 12);
                        break;
                    }
                    return lu3Var16;
                }
                if (i21 == 1) {
                    y6a.M(obj);
                    fm8Var = fm8Var2;
                    int a5 = fm8Var.a() / 2;
                    Float f6 = new Float(1.0f);
                    i4k h02 = s02.h0(a5, 0, jg5.d, 2);
                    this.s = 2;
                    a2 = q50.a((q50) obj3, f6, h02, null, this, 12);
                    break;
                } else if (i21 == 2) {
                    y6a.M(obj);
                    a2 = obj;
                } else {
                    if (i21 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    a = obj;
                }
                return Unit.a;
            case 16:
                scj scjVar = (scj) this.u;
                lu3 lu3Var17 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    pog y3 = sea.y(new kph(scjVar, 1));
                    usf usfVar = new usf(i3, scjVar, (e1d) obj3);
                    this.s = 1;
                    if (y3.collect(usfVar, this) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                StageSeason stageSeason = (StageSeason) obj3;
                g1i g1iVar = (g1i) this.u;
                lu3 lu3Var18 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    s96 s96Var = g1iVar.e;
                    int id = stageSeason.getId();
                    this.s = 1;
                    z = s96Var.z(id, this);
                    if (z == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    z = obj;
                }
                StageResponse stageResponse = (StageResponse) z;
                if (stageResponse == null || (stage = stageResponse.getStage()) == null || (list = stage.getSubstages()) == null) {
                    list = km5.a;
                }
                for (Stage stage2 : list) {
                    joa joaVar = l5i.a;
                    l5i.l(stage2);
                    List<Stage> substages = stage2.getSubstages();
                    if (substages != null) {
                        if (substages.isEmpty()) {
                            substages = null;
                        }
                        if (substages != null) {
                            for (Stage stage3 : substages) {
                                joa joaVar2 = l5i.a;
                                l5i.l(stage3);
                            }
                            joa joaVar3 = l5i.a;
                            stage2.setCurrentSubstage(l5i.e(substages));
                        }
                    }
                    stage2.setStageSeason(stageSeason);
                }
                g1iVar.n.j(list);
                return Unit.a;
            case 18:
                r1i r1iVar = (r1i) obj3;
                lu3 lu3Var19 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = r1iVar.f;
                    String str11 = (String) r1iVar.g.getValue();
                    this.s = 1;
                    vyhVar.getClass();
                    P = yaa.P(new uyh(vyhVar, str11, r13, i4), this);
                    break;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yzc yzcVar2 = (yzc) this.u;
                        y6a.M(obj);
                        S = obj;
                        r0 = yzcVar2;
                        CategoryUniqueStagesResponse categoryUniqueStagesResponse = (CategoryUniqueStagesResponse) S;
                        r13 = categoryUniqueStagesResponse != null ? categoryUniqueStagesResponse.getUniqueStages() : 0;
                        if (r13 == 0) {
                            r13 = km5.a;
                        }
                        r0.j(r13);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                SportCategoriesResponse sportCategoriesResponse = (SportCategoriesResponse) yaa.x((x2g) P);
                Category category = (sportCategoriesResponse == null || (categories = sportCategoriesResponse.getCategories()) == null) ? null : (Category) CollectionsKt.firstOrNull(categories);
                if (category != null) {
                    yzc yzcVar3 = r1iVar.j;
                    s96 s96Var2 = r1iVar.e;
                    int id2 = category.getId();
                    this.u = yzcVar3;
                    this.s = 2;
                    S = s96Var2.S(id2, this);
                    if (S != lu3Var19) {
                        r0 = yzcVar3;
                        CategoryUniqueStagesResponse categoryUniqueStagesResponse2 = (CategoryUniqueStagesResponse) S;
                        if (categoryUniqueStagesResponse2 != null) {
                        }
                        if (r13 == 0) {
                        }
                        r0.j(r13);
                    }
                    return lu3Var19;
                }
                return Unit.a;
            case 19:
                Context context = (Context) obj3;
                StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse = (StageDriverPerformanceGraphResponse) this.u;
                lu3 lu3Var20 = lu3.a;
                int i25 = this.s;
                if (i25 != 0) {
                    if (i25 == 1) {
                        y6a.M(obj);
                        r2 = obj;
                        return (a3i) r2;
                    }
                    if (i25 == 2) {
                        y6a.M(obj);
                        r = obj;
                        return (a3i) r;
                    }
                    if (i25 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r3 = obj;
                    return (a3i) r3;
                }
                y6a.M(obj);
                UniqueStage uniqueStage = stageDriverPerformanceGraphResponse.getStage().getUniqueStage();
                String name = uniqueStage != null ? uniqueStage.getName() : null;
                if (name == null) {
                    return null;
                }
                int hashCode = name.hashCode();
                if (hashCode != -1984447130) {
                    if (hashCode != -461196329) {
                        if (hashCode != 86216 || !name.equals("WRC")) {
                            return null;
                        }
                        this.s = 3;
                        r3 = s9a.r(new xxa(stageDriverPerformanceGraphResponse, context, null), this);
                        break;
                    } else {
                        if (!name.equals(Sports.FORMULA_1)) {
                            return null;
                        }
                        xkf xkfVar = xkf.b;
                        this.s = 1;
                        r2 = s9a.r(new zxa(stageDriverPerformanceGraphResponse, context, xkfVar, (rq3) null), this);
                        break;
                    }
                } else {
                    if (!name.equals("MotoGP")) {
                        return null;
                    }
                    xkf xkfVar2 = xkf.c;
                    this.s = 2;
                    r = s9a.r(new zxa(stageDriverPerformanceGraphResponse, context, xkfVar2, (rq3) null), this);
                    break;
                }
                return lu3Var20;
            case 20:
                n4i n4iVar = (n4i) this.u;
                Stage stage4 = (Stage) obj3;
                lu3 lu3Var21 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    s96 s96Var3 = n4iVar.e;
                    int id3 = stage4.getId();
                    this.s = 1;
                    R = s96Var3.R(id3, this);
                    if (R == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                StagesListResponse stagesListResponse = (StagesListResponse) R;
                if (stagesListResponse == null || (list2 = stagesListResponse.getStages()) == null) {
                    list2 = km5.a;
                }
                joa joaVar4 = l5i.a;
                boolean f7 = l5i.f(stage4);
                UniqueStage uniqueStage2 = stage4.getUniqueStage();
                boolean c2 = Intrinsics.c(uniqueStage2 != null ? Boolean.valueOf(cga.G(uniqueStage2)) : null, Boolean.TRUE);
                yzc yzcVar4 = n4iVar.n;
                Stage stage5 = (Stage) obj3;
                xbb b = a.b();
                if (list2.isEmpty()) {
                    b.add(Stage.copy$default(stage5, null, null, null, ServerType.RACE, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null));
                } else {
                    for (Stage stage6 : list2) {
                        if (!f7 || stage6.getType() != ServerType.AFTER_STAGE) {
                            List<Stage> partSubstages = stage6.getPartSubstages();
                            if (partSubstages != null) {
                                if (partSubstages.size() <= 1) {
                                    partSubstages = null;
                                }
                                if (partSubstages != null) {
                                    for (Stage stage7 : partSubstages) {
                                        joa joaVar5 = l5i.a;
                                        l5i.l(stage7);
                                        b.add(stage7);
                                    }
                                }
                            }
                            ServerType type = stage6.getType();
                            ServerType serverType = ServerType.QUALIFYING;
                            if (type == serverType) {
                                UniqueStage uniqueStage3 = stage6.getUniqueStage();
                                if (Intrinsics.c(uniqueStage3 != null ? Boolean.valueOf(cga.G(uniqueStage3)) : null, Boolean.TRUE)) {
                                    List<Stage> partSubstages2 = stage6.getPartSubstages();
                                    if (yid.m(partSubstages2 != null ? new Integer(partSubstages2.size()) : null) > 1) {
                                    }
                                }
                            }
                            joa joaVar6 = l5i.a;
                            l5i.l(stage6);
                            if (f7 && stage6.getType() == ServerType.RACE) {
                                stage6 = Stage.copy$default(stage6, null, null, null, ServerType.STAGE, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null);
                            } else if (c2 && stage6.getType() == serverType && Intrinsics.c(stage6.getSlug(), "sprint")) {
                                stage6 = Stage.copy$default(stage6, null, null, null, ServerType.SPRINT, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null);
                            }
                            b.add(stage6);
                        }
                    }
                    joa joaVar7 = l5i.a;
                    if (l5i.i(stage5) && !b.isEmpty()) {
                        ListIterator listIterator = b.listIterator(0);
                        while (true) {
                            hc9 hc9Var = (hc9) listIterator;
                            if (hc9Var.hasNext()) {
                                if (((Stage) hc9Var.next()).getType() == ServerType.DAY) {
                                    ListIterator listIterator2 = b.listIterator(b.size());
                                    while (true) {
                                        hc9 hc9Var2 = (hc9) listIterator2;
                                        if (hc9Var2.hasPrevious()) {
                                            Object previous = hc9Var2.previous();
                                            if (((Stage) previous).getType() == ServerType.STAGE) {
                                                obj4 = previous;
                                            }
                                        }
                                    }
                                    Stage stage8 = (Stage) obj4;
                                    if (stage8 != null && (copy$default = Stage.copy$default(stage8, null, null, null, ServerType.CUSTOM, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null)) != null) {
                                        b.add(copy$default);
                                    }
                                }
                            }
                        }
                    }
                    if (f7 && b.size() != 1) {
                        b.add(Stage.copy$default(stage5, null, null, null, ServerType.CYCLING_OVERALL, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108855, null));
                    }
                }
                yzcVar4.k(a.a(b));
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    j6i j6iVar = (j6i) this.u;
                    a6i a6iVar = (a6i) obj3;
                    for (c6i c6iVar : c6i.e) {
                        b6i b6iVar = c6iVar.a;
                        c6i c6iVar2 = j6iVar.k().c;
                        if (b6iVar == (c6iVar2 != null ? c6iVar2.a : null) && c6iVar.b == a6iVar) {
                            this.s = 1;
                            if (j6iVar.m(c6iVar, this) == lu3Var22) {
                                return lu3Var22;
                            }
                        }
                    }
                    ogj.m("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i27 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    j6i j6iVar2 = (j6i) this.u;
                    b6i b6iVar2 = (b6i) obj3;
                    for (c6i c6iVar3 : c6i.e) {
                        if (c6iVar3.a == b6iVar2) {
                            this.s = 1;
                            if (j6iVar2.m(c6iVar3, this) == lu3Var23) {
                                return lu3Var23;
                            }
                        }
                    }
                    ogj.m("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i28 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    h8i h8iVar = (h8i) obj3;
                    yzc yzcVar5 = h8iVar.l;
                    j0j j0jVar = h8iVar.e;
                    int i30 = h8iVar.g;
                    this.u = yzcVar5;
                    this.s = 1;
                    j0jVar.getClass();
                    P2 = yaa.P(new azi(j0jVar, i30, r13, i3), this);
                    if (P2 == lu3Var24) {
                        return lu3Var24;
                    }
                    yzcVar = yzcVar5;
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzcVar = (yzc) this.u;
                    y6a.M(obj);
                    P2 = obj;
                }
                yzcVar.j(yaa.x((x2g) P2));
                return Unit.a;
            case 24:
                StageWorker stageWorker = (StageWorker) obj3;
                ku3 ku3Var = (ku3) this.u;
                Object obj5 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    tak takVar = stageWorker.d;
                    this.u = ku3Var;
                    this.s = 1;
                    c = takVar.c(this);
                    break;
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                Iterable iterable = (Iterable) c;
                obj5 = new ArrayList(k13.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    obj5.add(xw3.t(ku3Var, null, new anc(stageWorker, ((Number) it.next()).intValue(), r13, 15), 3));
                }
                return obj5;
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                lu3 lu3Var25 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (q50.a((q50) ((n72) this.u).c, new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (c80) obj3, null, this, 12) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ big(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
