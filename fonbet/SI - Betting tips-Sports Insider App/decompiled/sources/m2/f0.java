package m2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.p0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.snackbar.Snackbar;
import com.sports.insider.MyApp;
import com.sports.insider.data.repository.room.support.dp.impl.FrequentQuestionsTable;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.settings.SettingFragment;
import com.sports.insider.ui.support.SupportChat;
import com.sports.insider.ui.views.EmptySectionFollowView;
import com.sports.insider.ui.views.EmptySectionView;
import com.sports.insider.ui.views.HeadToHeadLabelView;
import com.sports.insider.ui.views.PredictionLabelView;
import com.sports.insider.ui.views.StateGameView;
import eg.e1;
import eg.h1;
import eg.m0;
import hg.d1;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import la.j1;
import org.json.JSONArray;
import org.json.JSONObject;
import te.l0;
import ve.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20219b;

    /* renamed from: c, reason: collision with root package name */
    public int f20220c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20221d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(MainActivity mainActivity, Integer num, String str, int i5, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 9;
        this.f20221d = mainActivity;
        this.f20222e = num;
        this.f20223f = str;
        this.f20220c = i5;
    }

    private final Object c(Object obj) {
        SupportChat supportChat = (SupportChat) this.f20222e;
        Object obj2 = this.f20221d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20220c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            if (obj2 instanceof ka.a) {
                supportChat.I().getClass();
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), continuation, 0), 2);
                sd.m mVar = (sd.m) this.f20223f;
                if (mVar != null) {
                    supportChat.I().getClass();
                    sd.d h10 = l0.h((ka.a) obj2);
                    this.f20220c = 1;
                    obj = mVar.c(h10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f19194a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h8.b.B(obj);
        sd.d dVar = (sd.d) obj;
        if (dVar != null) {
            if (dVar.f23478b == sd.n.f23498e) {
                supportChat.I().l((ka.a) obj2);
            }
            if (dVar.f23478b == sd.n.f23499f) {
                supportChat.I().o((ka.a) obj2);
            }
            if (dVar.f23478b == sd.n.f23500g) {
                supportChat.I().n((ka.a) obj2);
            }
            if (dVar.f23478b == sd.n.f23502i) {
                ka.a aVar2 = (ka.a) obj2;
                String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                if (Build.VERSION.SDK_INT < 29) {
                    if (d0.c.a(supportChat.requireContext(), strArr[0]) == 0) {
                        supportChat.I().g(aVar2);
                    } else {
                        supportChat.f7059s.a(strArr);
                        supportChat.f7058r = aVar2;
                    }
                } else {
                    supportChat.I().g(aVar2);
                }
            }
            if (dVar.f23478b == sd.n.f23497d) {
                supportChat.I().f((ka.a) obj2);
            }
            if (dVar.f23478b == sd.n.f23501h) {
                l0 I = supportChat.I();
                ka.a supportData = (ka.a) obj2;
                I.getClass();
                Intrinsics.checkNotNullParameter(supportData, "supportData");
                md.m mVar2 = I.f23900d;
                int i10 = supportData.f18945a;
                String str = supportData.f18952h;
                String str2 = supportData.f18954k;
                String str3 = supportData.j;
                mVar2.getClass();
                eg.c0.t(MyApp.f6830c, mVar2.f20574c, null, new la.f(mVar2, i10, str, str2, str3, null), 2);
                new cd.d().g("resend_msg");
            }
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r10 != r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        EmptySectionFollowView emptySectionFollowView;
        EmptySectionFollowView emptySectionFollowView2;
        EmptySectionFollowView emptySectionFollowView3 = (EmptySectionFollowView) this.f20222e;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20220c;
        int i10 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.m mVar = new ve.m(emptySectionFollowView3, continuation, 0);
            this.f20221d = emptySectionFollowView3;
            this.f20220c = 1;
            obj = eg.c0.A(dVar, mVar, this);
            if (obj != aVar) {
                emptySectionFollowView = emptySectionFollowView3;
            }
            return aVar;
        }
        if (i5 == 1) {
            emptySectionFollowView = (EmptySectionFollowView) this.f20221d;
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                emptySectionFollowView3.setArimoRegularTypeface((Typeface) obj);
                emptySectionFollowView3.requestLayout();
                emptySectionFollowView3.invalidate();
                emptySectionFollowView3.E = true;
                eg.c0.h(emptySectionFollowView3.D.f18494a);
                return Unit.f19194a;
            }
            emptySectionFollowView2 = (EmptySectionFollowView) this.f20221d;
            h8.b.B(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            emptySectionFollowView2.f7398r = (String) obj;
            lg.e eVar2 = m0.f9201a;
            lg.d dVar2 = lg.d.f20063c;
            androidx.lifecycle.b bVar = new androidx.lifecycle.b((me.d) this.f20223f, continuation, 27);
            this.f20221d = null;
            this.f20220c = 3;
            obj = eg.c0.A(dVar2, bVar, this);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
        emptySectionFollowView.q = (String) obj;
        lg.e eVar3 = m0.f9201a;
        lg.d dVar3 = lg.d.f20063c;
        ve.m mVar2 = new ve.m(emptySectionFollowView3, continuation, i10);
        this.f20221d = emptySectionFollowView3;
        this.f20220c = 2;
        obj = eg.c0.A(dVar3, mVar2, this);
        if (obj != aVar) {
            emptySectionFollowView2 = emptySectionFollowView3;
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            emptySectionFollowView2.f7398r = (String) obj;
            lg.e eVar22 = m0.f9201a;
            lg.d dVar22 = lg.d.f20063c;
            androidx.lifecycle.b bVar2 = new androidx.lifecycle.b((me.d) this.f20223f, continuation, 27);
            this.f20221d = null;
            this.f20220c = 3;
            obj = eg.c0.A(dVar22, bVar2, this);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r10 != r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        EmptySectionView emptySectionView;
        EmptySectionView emptySectionView2;
        EmptySectionView emptySectionView3 = (EmptySectionView) this.f20222e;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20220c;
        int i10 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.n nVar = new ve.n(emptySectionView3, continuation, 0);
            this.f20221d = emptySectionView3;
            this.f20220c = 1;
            obj = eg.c0.A(dVar, nVar, this);
            if (obj != aVar) {
                emptySectionView = emptySectionView3;
            }
            return aVar;
        }
        if (i5 == 1) {
            emptySectionView = (EmptySectionView) this.f20221d;
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                emptySectionView3.setArimoRegularTypeface((Typeface) obj);
                emptySectionView3.requestLayout();
                emptySectionView3.invalidate();
                emptySectionView3.f7429y = true;
                eg.c0.h(emptySectionView3.f7428x.f18494a);
                return Unit.f19194a;
            }
            emptySectionView2 = (EmptySectionView) this.f20221d;
            h8.b.B(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            emptySectionView2.f7419n = (String) obj;
            lg.e eVar2 = m0.f9201a;
            lg.d dVar2 = lg.d.f20063c;
            androidx.lifecycle.b bVar = new androidx.lifecycle.b((me.d) this.f20223f, continuation, 28);
            this.f20221d = null;
            this.f20220c = 3;
            obj = eg.c0.A(dVar2, bVar, this);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
        emptySectionView.f7418m = (String) obj;
        lg.e eVar3 = m0.f9201a;
        lg.d dVar3 = lg.d.f20063c;
        ve.n nVar2 = new ve.n(emptySectionView3, continuation, i10);
        this.f20221d = emptySectionView3;
        this.f20220c = 2;
        obj = eg.c0.A(dVar3, nVar2, this);
        if (obj != aVar) {
            emptySectionView2 = emptySectionView3;
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            emptySectionView2.f7419n = (String) obj;
            lg.e eVar22 = m0.f9201a;
            lg.d dVar22 = lg.d.f20063c;
            androidx.lifecycle.b bVar2 = new androidx.lifecycle.b((me.d) this.f20223f, continuation, 28);
            this.f20221d = null;
            this.f20220c = 3;
            obj = eg.c0.A(dVar22, bVar2, this);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r9 == r1) goto L16;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        PredictionLabelView predictionLabelView;
        PredictionLabelView predictionLabelView2 = (PredictionLabelView) this.f20222e;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f20220c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            q4.r rVar = new q4.r(predictionLabelView2, continuation, 13);
            this.f20221d = predictionLabelView2;
            this.f20220c = 1;
            obj = eg.c0.A(dVar, rVar, this);
            if (obj != aVar) {
                predictionLabelView = predictionLabelView2;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            predictionLabelView2.setArimoBoldTypeface((Typeface) obj);
            predictionLabelView2.requestLayout();
            predictionLabelView2.invalidate();
            predictionLabelView2.f7801i = true;
            return Unit.f19194a;
        }
        predictionLabelView = (PredictionLabelView) this.f20221d;
        h8.b.B(obj);
        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
        predictionLabelView.f7793a = (String) obj;
        lg.e eVar2 = m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        ve.a aVar2 = new ve.a(6, null, (AdaptedFunctionReference) this.f20223f);
        this.f20221d = null;
        this.f20220c = 2;
        obj = eg.c0.A(dVar2, aVar2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f4, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        StateGameView stateGameView;
        StateGameView stateGameView2;
        StateGameView stateGameView3;
        StateGameView stateGameView4;
        StateGameView stateGameView5;
        StateGameView stateGameView6 = (StateGameView) this.f20222e;
        lf.a aVar = lf.a.f20034a;
        int i5 = 4;
        int i10 = 3;
        int i11 = 2;
        int i12 = 1;
        Continuation continuation = null;
        switch (this.f20220c) {
            case 0:
                h8.b.B(obj);
                lg.e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                n0 n0Var = new n0(stateGameView6, continuation, 0);
                this.f20221d = stateGameView6;
                this.f20220c = 1;
                obj = eg.c0.A(dVar, n0Var, this);
                if (obj != aVar) {
                    stateGameView = stateGameView6;
                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                    stateGameView.f7933e = (String) obj;
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    n0 n0Var2 = new n0(stateGameView6, continuation, i12);
                    this.f20221d = stateGameView6;
                    this.f20220c = 2;
                    obj = eg.c0.A(dVar2, n0Var2, this);
                    if (obj != aVar) {
                        stateGameView2 = stateGameView6;
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        stateGameView2.f7934f = (String) obj;
                        lg.e eVar3 = m0.f9201a;
                        lg.d dVar3 = lg.d.f20063c;
                        n0 n0Var3 = new n0(stateGameView6, continuation, i11);
                        this.f20221d = stateGameView6;
                        this.f20220c = 3;
                        obj = eg.c0.A(dVar3, n0Var3, this);
                        if (obj != aVar) {
                            stateGameView3 = stateGameView6;
                            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                            stateGameView3.f7935g = (String) obj;
                            lg.e eVar4 = m0.f9201a;
                            lg.d dVar4 = lg.d.f20063c;
                            n0 n0Var4 = new n0(stateGameView6, continuation, i10);
                            this.f20221d = stateGameView6;
                            this.f20220c = 4;
                            obj = eg.c0.A(dVar4, n0Var4, this);
                            if (obj != aVar) {
                                stateGameView4 = stateGameView6;
                                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                                stateGameView4.f7936h = (String) obj;
                                lg.e eVar5 = m0.f9201a;
                                lg.d dVar5 = lg.d.f20063c;
                                n0 n0Var5 = new n0(stateGameView6, continuation, i5);
                                this.f20221d = stateGameView6;
                                this.f20220c = 5;
                                obj = eg.c0.A(dVar5, n0Var5, this);
                                if (obj != aVar) {
                                    stateGameView5 = stateGameView6;
                                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                                    stateGameView5.f7937i = (String) obj;
                                    lg.e eVar6 = m0.f9201a;
                                    lg.d dVar6 = lg.d.f20063c;
                                    ve.a aVar2 = new ve.a(9, null, (AdaptedFunctionReference) this.f20223f);
                                    this.f20221d = null;
                                    this.f20220c = 6;
                                    obj = eg.c0.A(dVar6, aVar2, this);
                                    break;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                stateGameView = (StateGameView) this.f20221d;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                stateGameView.f7933e = (String) obj;
                lg.e eVar22 = m0.f9201a;
                lg.d dVar22 = lg.d.f20063c;
                n0 n0Var22 = new n0(stateGameView6, continuation, i12);
                this.f20221d = stateGameView6;
                this.f20220c = 2;
                obj = eg.c0.A(dVar22, n0Var22, this);
                if (obj != aVar) {
                }
                return aVar;
            case 2:
                stateGameView2 = (StateGameView) this.f20221d;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                stateGameView2.f7934f = (String) obj;
                lg.e eVar32 = m0.f9201a;
                lg.d dVar32 = lg.d.f20063c;
                n0 n0Var32 = new n0(stateGameView6, continuation, i11);
                this.f20221d = stateGameView6;
                this.f20220c = 3;
                obj = eg.c0.A(dVar32, n0Var32, this);
                if (obj != aVar) {
                }
                return aVar;
            case 3:
                stateGameView3 = (StateGameView) this.f20221d;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                stateGameView3.f7935g = (String) obj;
                lg.e eVar42 = m0.f9201a;
                lg.d dVar42 = lg.d.f20063c;
                n0 n0Var42 = new n0(stateGameView6, continuation, i10);
                this.f20221d = stateGameView6;
                this.f20220c = 4;
                obj = eg.c0.A(dVar42, n0Var42, this);
                if (obj != aVar) {
                }
                return aVar;
            case 4:
                stateGameView4 = (StateGameView) this.f20221d;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                stateGameView4.f7936h = (String) obj;
                lg.e eVar52 = m0.f9201a;
                lg.d dVar52 = lg.d.f20063c;
                n0 n0Var52 = new n0(stateGameView6, continuation, i5);
                this.f20221d = stateGameView6;
                this.f20220c = 5;
                obj = eg.c0.A(dVar52, n0Var52, this);
                if (obj != aVar) {
                }
                return aVar;
            case 5:
                stateGameView5 = (StateGameView) this.f20221d;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                stateGameView5.f7937i = (String) obj;
                lg.e eVar62 = m0.f9201a;
                lg.d dVar62 = lg.d.f20063c;
                ve.a aVar22 = new ve.a(9, null, (AdaptedFunctionReference) this.f20223f);
                this.f20221d = null;
                this.f20220c = 6;
                obj = eg.c0.A(dVar62, aVar22, this);
                break;
            case 6:
                h8.b.B(obj);
                stateGameView6.setArimoBoldTypeface((Typeface) obj);
                stateGameView6.requestLayout();
                stateGameView6.invalidate();
                stateGameView6.f7946t = true;
                return Unit.f19194a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20219b) {
            case 0:
                f0 f0Var = new f0((eg.r) this.f20222e, (Function2) this.f20223f, continuation);
                f0Var.f20221d = obj;
                return f0Var;
            case 1:
                return new f0((i2.d) this.f20223f, continuation, 1);
            case 2:
                return new f0((md.m) this.f20221d, (String) this.f20222e, (List) this.f20223f, continuation, 2);
            case 3:
                return new f0((Context) this.f20221d, (String) this.f20222e, (PredictionFragment) this.f20223f, continuation, 3);
            case 4:
                return new f0((PredictionFragment) this.f20222e, (Set) this.f20223f, continuation, 4);
            case 5:
                f0 f0Var2 = new f0((me.c0) this.f20222e, (kc.b) this.f20223f, continuation, 5);
                f0Var2.f20221d = obj;
                return f0Var2;
            case 6:
                return new f0((sd.m) this.f20221d, (sd.d) this.f20222e, (SettingFragment) this.f20223f, continuation, 6);
            case 7:
                return new f0((h1) this.f20221d, (k2.u) this.f20222e, (oe.k) this.f20223f, continuation, 7);
            case 8:
                return new f0((MainActivity) this.f20223f, continuation, 8);
            case 9:
                return new f0((MainActivity) this.f20221d, (Integer) this.f20222e, (String) this.f20223f, this.f20220c, continuation);
            case 10:
                return new f0((ja.c) this.f20221d, (pe.s) this.f20222e, (p0) this.f20223f, continuation, 10);
            case 11:
                return new f0((q8.b) this.f20221d, (g1.c) this.f20222e, (Long) this.f20223f, continuation, 11);
            case 12:
                return new f0((fb.b) this.f20221d, this.f20220c, (String) this.f20222e, (List) this.f20223f, continuation);
            case 13:
                return new f0((rc.b0) this.f20221d, (String) this.f20222e, (JSONObject) this.f20223f, continuation, 13);
            case 14:
                return new f0((s7.s) this.f20222e, (String) this.f20223f, continuation, 14);
            case 15:
                return new f0(this.f20221d, (SupportChat) this.f20222e, (sd.m) this.f20223f, continuation, 15);
            case 16:
                return new f0((EmptySectionFollowView) this.f20222e, (me.d) this.f20223f, continuation, 16);
            case 17:
                return new f0((EmptySectionView) this.f20222e, (me.d) this.f20223f, continuation, 17);
            case 18:
                return new f0((HeadToHeadLabelView) this.f20222e, (me.d) this.f20223f, continuation, 18);
            case 19:
                return new f0((PredictionLabelView) this.f20222e, (Function1) this.f20223f, continuation);
            case 20:
                return new f0((StateGameView) this.f20222e, (Function1) this.f20223f, continuation);
            default:
                return new f0((ic.b) this.f20221d, (ic.b) this.f20222e, this.f20220c, (Integer) this.f20223f, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20219b) {
        }
        return ((f0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:418:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: Exception -> 0x00cb, TRY_LEAVE, TryCatch #5 {Exception -> 0x00cb, blocks: (B:39:0x00c7, B:40:0x0112, B:42:0x011f, B:49:0x00d3, B:51:0x00fb, B:53:0x00ff, B:55:0x0105, B:59:0x00dc), top: B:34:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x082d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:460:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x097e  */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r5v35, types: [gf.i, java.lang.Object] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e1 e1Var;
        Object invoke;
        e1 e1Var2;
        Throwable th2;
        Throwable a7;
        Object A;
        String str;
        Object A2;
        String str2;
        String str3;
        Object A3;
        String str4;
        Object A4;
        File file;
        String str5;
        Object v5;
        long longValue;
        Object c2;
        HashMap<String, Bitmap> hashMap;
        Object c8;
        Object m6;
        sd.d dVar;
        Object A5;
        ga.a aVar;
        Window window;
        View decorView;
        View findViewById;
        String str6;
        Object A6;
        ha.a aVar2;
        ha.a aVar3;
        Object A7;
        HeadToHeadLabelView headToHeadLabelView;
        Object A8;
        int i5 = this.f20219b;
        int i10 = 18;
        int i11 = 6;
        int i12 = 3;
        Continuation continuation = null;
        Object obj2 = this.f20223f;
        switch (i5) {
            case 0:
                lf.a aVar4 = lf.a.f20034a;
                int i13 = this.f20220c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    eg.z zVar = (eg.z) this.f20221d;
                    e1Var = (eg.r) this.f20222e;
                    ?? r12 = (mf.i) obj2;
                    try {
                        gf.o oVar = gf.q.f10031a;
                        this.f20221d = e1Var;
                        this.f20220c = 1;
                        invoke = r12.invoke(zVar, this);
                        if (invoke == aVar4) {
                            return aVar4;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        e1Var2 = e1Var;
                        gf.o oVar2 = gf.q.f10031a;
                        e1Var = e1Var2;
                        invoke = h8.b.h(th2);
                        a7 = gf.q.a(invoke);
                        eg.r rVar = (eg.r) e1Var;
                        if (a7 == null) {
                        }
                        return Unit.f19194a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1Var2 = (eg.q) this.f20221d;
                    try {
                        h8.b.B(obj);
                        e1Var = e1Var2;
                        invoke = obj;
                    } catch (Throwable th4) {
                        th2 = th4;
                        gf.o oVar22 = gf.q.f10031a;
                        e1Var = e1Var2;
                        invoke = h8.b.h(th2);
                        a7 = gf.q.a(invoke);
                        eg.r rVar2 = (eg.r) e1Var;
                        if (a7 == null) {
                        }
                        return Unit.f19194a;
                    }
                }
                gf.o oVar3 = gf.q.f10031a;
                a7 = gf.q.a(invoke);
                eg.r rVar22 = (eg.r) e1Var;
                if (a7 == null) {
                    rVar22.Q(invoke);
                } else {
                    rVar22.h0(a7);
                }
                return Unit.f19194a;
            case 1:
                i2.d dVar2 = (i2.d) obj2;
                lf.a aVar5 = lf.a.f20034a;
                Continuation continuation2 = null;
                switch (this.f20220c) {
                    case 0:
                        h8.b.B(obj);
                        pc.u uVar = (pc.u) y3.m(pc.u.class, null, 6);
                        this.f20220c = 1;
                        uVar.getClass();
                        lg.e eVar = m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new pc.e(uVar, continuation2, 3), this);
                        if (A == aVar5) {
                            return aVar5;
                        }
                        str = (String) A;
                        pc.u uVar2 = (pc.u) y3.m(pc.u.class, null, 6);
                        this.f20221d = str;
                        this.f20220c = 2;
                        uVar2.getClass();
                        lg.e eVar2 = m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new pc.q(uVar2, continuation2, 1), this);
                        if (A2 == aVar5) {
                            return aVar5;
                        }
                        str2 = str;
                        str3 = (String) A2;
                        if (str2 != null && str3 == null) {
                            return Unit.f19194a;
                        }
                        this.f20221d = null;
                        this.f20220c = 3;
                        lg.e eVar3 = m0.f9201a;
                        A3 = eg.c0.A(lg.d.f20063c, new ge.f(str2, str3, (Object) dVar2, continuation2, 9), this);
                        if (A3 == aVar5) {
                            return aVar5;
                        }
                        str4 = (String) A3;
                        if (str4 != null) {
                            return Unit.f19194a;
                        }
                        ((zc.k) i2.d.u(dVar2).f20536a.getValue()).getClass();
                        File cacheDir = ((za.i) zc.k.e()).f25901a.getCacheDir();
                        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                        if (!cacheDir.isDirectory()) {
                            return Unit.f19194a;
                        }
                        i2.d.u(dVar2).getClass();
                        String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date());
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        this.f20221d = null;
                        this.f20220c = 4;
                        lg.e eVar4 = m0.f9201a;
                        A4 = eg.c0.A(lg.d.f20063c, new ge.f(format, cacheDir, str4, (Continuation) null), this);
                        if (A4 == aVar5) {
                            return aVar5;
                        }
                        file = (File) A4;
                        if (file != null || !file.exists() || !file.isFile()) {
                            return Unit.f19194a;
                        }
                        this.f20221d = null;
                        this.f20222e = file;
                        this.f20220c = 5;
                        String absolutePath = file.getAbsolutePath();
                        if (absolutePath != null) {
                            List list = lc.d.f19671a;
                            Intrinsics.checkNotNullParameter(absolutePath, "<this>");
                            str5 = "file://".concat(absolutePath);
                        } else {
                            str5 = null;
                        }
                        v5 = dVar2.v(str5, this);
                        if (v5 == aVar5) {
                            return aVar5;
                        }
                        longValue = ((Number) v5).longValue();
                        if (longValue >= 1) {
                            String absolutePath2 = file.getAbsolutePath();
                            this.f20221d = null;
                            this.f20222e = null;
                            this.f20220c = 6;
                            lg.e eVar5 = m0.f9201a;
                            Object A9 = eg.c0.A(lg.d.f20063c, new cd.j(dVar2, absolutePath2, (int) longValue, null), this);
                            if (A9 != aVar5) {
                                A9 = Unit.f19194a;
                            }
                            if (A9 == aVar5) {
                                return aVar5;
                            }
                        }
                        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), continuation2, 8), 2);
                        return Unit.f19194a;
                    case 1:
                        h8.b.B(obj);
                        A = obj;
                        str = (String) A;
                        pc.u uVar22 = (pc.u) y3.m(pc.u.class, null, 6);
                        this.f20221d = str;
                        this.f20220c = 2;
                        uVar22.getClass();
                        lg.e eVar22 = m0.f9201a;
                        A2 = eg.c0.A(lg.d.f20063c, new pc.q(uVar22, continuation2, 1), this);
                        if (A2 == aVar5) {
                        }
                        str2 = str;
                        str3 = (String) A2;
                        if (str2 != null) {
                        }
                        this.f20221d = null;
                        this.f20220c = 3;
                        lg.e eVar32 = m0.f9201a;
                        A3 = eg.c0.A(lg.d.f20063c, new ge.f(str2, str3, (Object) dVar2, continuation2, 9), this);
                        if (A3 == aVar5) {
                        }
                        str4 = (String) A3;
                        if (str4 != null) {
                        }
                        break;
                    case 2:
                        str = (String) this.f20221d;
                        h8.b.B(obj);
                        A2 = obj;
                        str2 = str;
                        str3 = (String) A2;
                        if (str2 != null) {
                        }
                        this.f20221d = null;
                        this.f20220c = 3;
                        lg.e eVar322 = m0.f9201a;
                        A3 = eg.c0.A(lg.d.f20063c, new ge.f(str2, str3, (Object) dVar2, continuation2, 9), this);
                        if (A3 == aVar5) {
                        }
                        str4 = (String) A3;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        h8.b.B(obj);
                        A3 = obj;
                        str4 = (String) A3;
                        if (str4 != null) {
                        }
                        break;
                    case 4:
                        h8.b.B(obj);
                        A4 = obj;
                        file = (File) A4;
                        if (file != null) {
                            break;
                        }
                        return Unit.f19194a;
                    case 5:
                        file = (File) this.f20222e;
                        h8.b.B(obj);
                        v5 = obj;
                        longValue = ((Number) v5).longValue();
                        if (longValue >= 1) {
                        }
                        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), continuation2, 8), 2);
                        return Unit.f19194a;
                    case 6:
                        h8.b.B(obj);
                        eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.s(new cd.d(), continuation2, 8), 2);
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 2:
                Object obj3 = lf.a.f20034a;
                int i14 = this.f20220c;
                try {
                    if (i14 == 0) {
                        h8.b.B(obj);
                        ((md.m) this.f20221d).getClass();
                        j1 g10 = md.m.g();
                        this.f20220c = 1;
                        g10.getClass();
                        fb.b bVar = new fb.b();
                        lg.e eVar6 = m0.f9201a;
                        Object A10 = eg.c0.A(lg.d.f20063c, new f0(bVar, (int) Instant.now().getEpochSecond(), (String) this.f20222e, (List) obj2, (Continuation) null), this);
                        if (A10 != obj3) {
                            A10 = Unit.f19194a;
                        }
                        if (A10 != obj3) {
                            A10 = Unit.f19194a;
                        }
                        if (A10 == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar3 = MyApp.f6830c;
                    lg.e eVar7 = m0.f9201a;
                    eg.c0.t(dVar3, lg.d.f20063c, null, new q4.r(ex, continuation, i10), 2);
                }
                return Unit.f19194a;
            case 3:
                String str7 = (String) this.f20222e;
                Context context = (Context) this.f20221d;
                lf.a aVar6 = lf.a.f20034a;
                int i15 = this.f20220c;
                try {
                    if (i15 == 0) {
                        h8.b.B(obj);
                        if (context == null) {
                            return null;
                        }
                        q4.e eVar8 = new q4.e(context);
                        eVar8.f21940c = str7;
                        q4.b bVar2 = q4.b.f21930c;
                        eVar8.f21946i = bVar2;
                        eVar8.f21945h = bVar2;
                        eVar8.j = bVar2;
                        int i16 = ((PredictionFragment) obj2).f7007x;
                        eVar8.f21950n = new r4.e(ci.c.c(i16, i16));
                        eVar8.f21951o = r4.g.f22299b;
                        q4.h a10 = eVar8.a();
                        c4.o a11 = c4.y.a(context);
                        this.f20220c = 1;
                        c2 = ((c4.v) a11).c(a10, this);
                        if (c2 == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        c2 = obj;
                    }
                    c4.m image = ((q4.k) c2).getImage();
                    if (image == null) {
                        return null;
                    }
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    Drawable b10 = c4.p.b(image, resources);
                    if (b10 != null) {
                        return y3.A(b10, 0, 0, 7);
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 4:
                PredictionFragment predictionFragment = (PredictionFragment) this.f20222e;
                lf.a aVar7 = lf.a.f20034a;
                int i17 = this.f20220c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    HashMap<String, Bitmap> hashMap2 = new HashMap<>();
                    lg.e eVar9 = m0.f9201a;
                    lg.d dVar4 = lg.d.f20063c;
                    me.p pVar = new me.p((Set) obj2, predictionFragment, hashMap2, null);
                    this.f20221d = hashMap2;
                    this.f20220c = 1;
                    if (eg.c0.A(dVar4, pVar, this) == aVar7) {
                        return aVar7;
                    }
                    hashMap = hashMap2;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hashMap = (HashMap) this.f20221d;
                    h8.b.B(obj);
                }
                ec.x xVar = (ec.x) predictionFragment.f22459a;
                if (xVar != null) {
                    xVar.f9061x.setBitmaps(hashMap);
                }
                ec.x xVar2 = (ec.x) predictionFragment.f22459a;
                if (xVar2 != null) {
                    xVar2.f9046g.setBitmaps(hashMap);
                }
                ec.x xVar3 = (ec.x) predictionFragment.f22459a;
                if (xVar3 != null) {
                    xVar3.f9045f.setBitmaps(hashMap);
                }
                return Unit.f19194a;
            case 5:
                me.c0 c0Var = (me.c0) this.f20222e;
                kc.b bVar3 = (kc.b) obj2;
                eg.z zVar2 = (eg.z) this.f20221d;
                Object obj4 = lf.a.f20034a;
                int i18 = this.f20220c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    c0Var.f20627k.j(bVar3);
                    d1 d1Var = c0Var.f20628l;
                    Pair pair = new Pair(bVar3 != null ? bVar3.getForecast() : null, bVar3 != null ? bVar3.getOdds() : null);
                    d1Var.getClass();
                    d1Var.k(null, pair);
                    lg.e eVar10 = m0.f9201a;
                    eg.c0.e(zVar2, lg.d.f20063c, new me.v(c0Var, bVar3, continuation, 1), 2);
                    String analyticsFull = bVar3 != null ? bVar3.getAnalyticsFull() : null;
                    String analyticsShort = bVar3 != null ? bVar3.getAnalyticsShort() : null;
                    if (kotlin.text.z.j(analyticsFull, analyticsShort, false)) {
                        analyticsShort = null;
                    }
                    d1 d1Var2 = c0Var.q;
                    Pair pair2 = new Pair(analyticsShort, analyticsFull);
                    d1Var2.getClass();
                    d1Var2.k(null, pair2);
                    c0Var.f20636s.j(bVar3 != null ? bVar3.getImageBackground() : null);
                    c0Var.f20637t.j(bVar3 != null ? bVar3.getStatus() : null);
                    String HHmmString = bVar3 != null ? bVar3.HHmmString() : null;
                    String ddMMyyyyString = bVar3 != null ? bVar3.ddMMyyyyString() : null;
                    String m10 = ((HHmmString == null || HHmmString.length() == 0) && (ddMMyyyyString == null || ddMMyyyyString.length() == 0)) ? null : (HHmmString == null || HHmmString.length() == 0) ? ddMMyyyyString : (ddMMyyyyString == null || ddMMyyyyString.length() == 0) ? HHmmString : r4.k.m(ddMMyyyyString, "   ", HHmmString);
                    d1 d1Var3 = c0Var.f20638u;
                    Pair pair3 = new Pair(HHmmString, ddMMyyyyString);
                    d1Var3.getClass();
                    d1Var3.k(null, pair3);
                    c0Var.f20639v.j(m10);
                    c0Var.P = bVar3 != null ? bVar3.startTimeMillisSecond() : 0L;
                    this.f20221d = null;
                    this.f20220c = 1;
                    Object A11 = eg.c0.A(jg.q.f18523a, new me.a0(c0Var, continuation, 1), this);
                    if (A11 != obj4) {
                        A11 = Unit.f19194a;
                    }
                    if (A11 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                d1 d1Var4 = c0Var.f20640w;
                Boolean valueOf = Boolean.valueOf(((bVar3 != null ? new Integer(bVar3.getStartTime()) : null) == null || bVar3.isMatchStarted()) ? false : true);
                d1Var4.getClass();
                d1Var4.k(null, valueOf);
                this.f20221d = null;
                this.f20220c = 2;
                lg.e eVar11 = m0.f9201a;
                Object A12 = eg.c0.A(lg.d.f20063c, new me.v(bVar3, c0Var, null), this);
                if (A12 != obj4) {
                    A12 = Unit.f19194a;
                }
                if (A12 == obj4) {
                    return obj4;
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar8 = lf.a.f20034a;
                int i19 = this.f20220c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    sd.m mVar = (sd.m) this.f20221d;
                    if (mVar != null) {
                        sd.d dVar5 = (sd.d) this.f20222e;
                        this.f20220c = 1;
                        c8 = mVar.c(dVar5, this);
                        if (c8 == aVar8) {
                            return aVar8;
                        }
                    }
                    return Unit.f19194a;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                c8 = obj;
                sd.d dVar6 = (sd.d) c8;
                if (dVar6 != null) {
                    SettingFragment settingFragment = (SettingFragment) obj2;
                    if (dVar6.f23478b == sd.n.f23497d) {
                        oe.k M = settingFragment.M();
                        p0 requireActivity = settingFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        M.getClass();
                        oe.k.e(requireActivity);
                    }
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar9 = lf.a.f20034a;
                int i20 = this.f20220c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    eg.r a12 = eg.c0.a();
                    ((h1) this.f20221d).invoke(a12);
                    this.f20220c = 1;
                    m6 = a12.m(this);
                    if (m6 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        eg.c0.t(MyApp.f6830c, new eg.y("logoutUser()"), null, new oe.h((oe.k) obj2, continuation, 0), 2);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    m6 = obj;
                }
                if (((Number) m6).intValue() == -2) {
                    eg.f0 f0Var = (eg.f0) ((k2.u) this.f20222e).invoke();
                    this.f20220c = 2;
                    if (f0Var.R(this) == aVar9) {
                        return aVar9;
                    }
                    eg.c0.t(MyApp.f6830c, new eg.y("logoutUser()"), null, new oe.h((oe.k) obj2, continuation, 0), 2);
                }
                return Unit.f19194a;
            case 8:
                MainActivity mainActivity = (MainActivity) obj2;
                lf.a aVar10 = lf.a.f20034a;
                int i21 = this.f20220c;
                int i22 = 28;
                if (i21 == 0) {
                    h8.b.B(obj);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sd.n.j);
                    dVar = new sd.d(arrayList, 2);
                    io.sentry.hints.j jVar = new io.sentry.hints.j(i22);
                    this.f20221d = dVar;
                    this.f20220c = 1;
                    lg.e eVar12 = m0.f9201a;
                    A5 = eg.c0.A(lg.d.f20063c, new ld.a(jVar, continuation, 0), this);
                    if (A5 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (ga.a) this.f20222e;
                        h8.b.B(obj);
                        new io.sentry.hints.j(i22).B(mainActivity.getBaseContext(), aVar.f9909a, aVar.f9910b);
                        da.r.a(0);
                        return Unit.f19194a;
                    }
                    sd.d dVar7 = (sd.d) this.f20221d;
                    h8.b.B(obj);
                    dVar = dVar7;
                    A5 = obj;
                }
                ga.a aVar11 = (ga.a) A5;
                if (aVar11 == null) {
                    return Unit.f19194a;
                }
                new io.sentry.hints.j(i22).C(aVar11.f9909a);
                sd.o oVar4 = (sd.o) mainActivity.E0.getValue();
                this.f20221d = null;
                this.f20222e = aVar11;
                this.f20220c = 2;
                if (oVar4.b(dVar, this) == aVar10) {
                    return aVar10;
                }
                aVar = aVar11;
                new io.sentry.hints.j(i22).B(mainActivity.getBaseContext(), aVar.f9909a, aVar.f9910b);
                da.r.a(0);
                return Unit.f19194a;
            case 9:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    window = ((MainActivity) this.f20221d).getWindow();
                } catch (Exception e7) {
                    zc.d.b(4, "showToast", e7);
                }
                if (window == null || (decorView = window.getDecorView()) == null || (findViewById = decorView.findViewById(R.id.content)) == null) {
                    return Unit.f19194a;
                }
                Integer num = (Integer) this.f20222e;
                if (num != null) {
                    str6 = findViewById.getContext().getString(num.intValue());
                    if (str6 == null) {
                    }
                    Snackbar.make(findViewById, str6, -2).setDuration(this.f20220c).show();
                    return Unit.f19194a;
                }
                str6 = (String) obj2;
                if (str6 == null) {
                    return Unit.f19194a;
                }
                Snackbar.make(findViewById, str6, -2).setDuration(this.f20220c).show();
                return Unit.f19194a;
            case 10:
                p0 p0Var = (p0) obj2;
                pe.s sVar = (pe.s) this.f20222e;
                ja.c cVar = (ja.c) this.f20221d;
                int i23 = cVar.f18391d;
                int i24 = cVar.f18388a;
                lf.a aVar13 = lf.a.f20034a;
                int i25 = this.f20220c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    if (Intrinsics.areEqual(cVar.b(), "unknown") && cVar.a()) {
                        if (Duration.ofDays(7L).getSeconds() + cVar.f18389b < Instant.now().getEpochSecond()) {
                            y8.d dVar8 = new y8.d();
                            this.f20220c = 1;
                            lg.e eVar13 = m0.f9201a;
                            if (eg.c0.A(lg.d.f20063c, new androidx.lifecycle.b(i24, i11, dVar8, continuation), this) == aVar13) {
                                return aVar13;
                            }
                        }
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (i23 == 1 || io.sentry.config.a.C(new Integer(cVar.j))) {
                    mc.a aVar14 = pe.s.F;
                    sVar.h(i24, i23);
                    return Unit.f19194a;
                }
                if (i23 == 1) {
                    mc.a aVar15 = pe.s.F;
                    sVar.h(i24, 1);
                } else if (i23 != 2) {
                    if (i23 == 3) {
                        if (da.r.d() || da.r.c()) {
                            pe.s.e(sVar, cVar, p0Var);
                        } else {
                            pe.s.f(sVar, cVar);
                        }
                    }
                } else if (da.r.f() || da.r.c()) {
                    pe.s.e(sVar, cVar, p0Var);
                } else {
                    pe.s.f(sVar, cVar);
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar16 = lf.a.f20034a;
                int i26 = this.f20220c;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                c1.i iVar = ((q8.b) this.f20221d).f22064c;
                ge.f fVar = new ge.f((g1.c) this.f20222e, (Long) obj2, continuation, 12);
                this.f20220c = 1;
                Object h10 = iVar.h(new g1.b(fVar, null, 1), this);
                return h10 == aVar16 ? aVar16 : h10;
            case 12:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                rb.g P0 = fb.b.P0();
                int i27 = this.f20220c;
                String title = (String) this.f20222e;
                List<lc.b> fQuestion = (List) obj2;
                P0.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(fQuestion, "fQuestion");
                rb.e eVar14 = P0.f22382a;
                ((Number) f3.x.n0(eVar14.f22378a, false, true, new k2.d0(19))).intValue();
                k2.w wVar = eVar14.f22378a;
                ((Number) f3.x.n0(wVar, false, true, new k2.d0(i10))).intValue();
                List<FrequentQuestionsTable> list2 = (List) f3.x.n0(wVar, true, false, new k2.d0(17));
                JSONArray jSONArray = new JSONArray();
                if (list2 != null) {
                    for (FrequentQuestionsTable frequentQuestionsTable : list2) {
                        int id2 = frequentQuestionsTable.getId();
                        String frequentQuestion = frequentQuestionsTable.getQuestion();
                        Intrinsics.checkNotNullParameter(frequentQuestion, "frequentQuestion");
                        jSONArray.put(new JSONObject("{ \"id\" : " + id2 + ", \"question\" : \"" + frequentQuestion + "\" }"));
                    }
                }
                for (lc.b bVar4 : fQuestion) {
                    int i28 = bVar4.f19668a;
                    String frequentQuestion2 = bVar4.f19669b;
                    String frequentAnswer = bVar4.f19670c;
                    Intrinsics.checkNotNullParameter(frequentQuestion2, "frequentQuestion");
                    Intrinsics.checkNotNullParameter(frequentAnswer, "frequentAnswer");
                    StringBuilder sb2 = new StringBuilder("{ \"id\" : ");
                    sb2.append(i28);
                    sb2.append(", \"question\" : \"");
                    sb2.append(frequentQuestion2);
                    sb2.append("\", \"answer\" : \"");
                    jSONArray.put(new JSONObject(d9.e.l(sb2, frequentAnswer, "\" }")));
                }
                String json = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(json, "toString(...)");
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(title, "title");
                ((Number) f3.x.n0(wVar, false, true, new pb.a(i27, title, json, 3))).longValue();
                return Unit.f19194a;
            case 13:
                lf.a aVar18 = lf.a.f20034a;
                int i29 = this.f20220c;
                if (i29 == 0) {
                    h8.b.B(obj);
                    this.f20220c = 1;
                    if (((rc.b0) this.f20221d).e((String) this.f20222e, (JSONObject) obj2, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                s7.s sVar2 = (s7.s) this.f20222e;
                Object obj5 = lf.a.f20034a;
                int i30 = this.f20220c;
                try {
                    if (i30 == 0) {
                        h8.b.B(obj);
                        la.g gVar = (la.g) y3.m(la.g.class, null, 6);
                        this.f20220c = 1;
                        gVar.getClass();
                        lg.e eVar15 = m0.f9201a;
                        A6 = eg.c0.A(lg.d.f20063c, new la.e(gVar, (String) obj2, null), this);
                        if (A6 == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i30 != 1) {
                            if (i30 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (ha.a) this.f20221d;
                            h8.b.B(obj);
                            new cd.d().c("auth_google", null);
                            aVar2 = aVar3;
                            if (aVar2 != null) {
                                return null;
                            }
                            obj5 = new Integer(aVar2.f10431a);
                            return obj5;
                        }
                        h8.b.B(obj);
                        A6 = obj;
                    }
                    aVar2 = (ha.a) A6;
                    if (aVar2 != null && aVar2.f10431a == 200) {
                        this.f20221d = aVar2;
                        this.f20220c = 2;
                        if (s7.s.b(sVar2, aVar2, this) != obj5) {
                            aVar3 = aVar2;
                            new cd.d().c("auth_google", null);
                            aVar2 = aVar3;
                        }
                        return obj5;
                    }
                    if (aVar2 != null) {
                    }
                } catch (Exception ex2) {
                    if (!(ex2 instanceof UnknownHostException) && !(ex2 instanceof SocketTimeoutException) && !(ex2 instanceof SocketException) && !(ex2 instanceof IOException)) {
                        zc.d.b(6, null, ex2);
                        return null;
                    }
                    Intrinsics.checkNotNullParameter(ex2, "ex");
                    jg.d dVar9 = MyApp.f6830c;
                    lg.e eVar16 = m0.f9201a;
                    eg.c0.t(dVar9, lg.d.f20063c, null, new q4.r(ex2, continuation, i10), 2);
                    return null;
                }
                break;
            case 15:
                return c(obj);
            case 16:
                return e(obj);
            case 17:
                return g(obj);
            case 18:
                HeadToHeadLabelView headToHeadLabelView2 = (HeadToHeadLabelView) this.f20222e;
                lf.a aVar19 = lf.a.f20034a;
                int i31 = this.f20220c;
                if (i31 == 0) {
                    h8.b.B(obj);
                    lg.e eVar17 = m0.f9201a;
                    lg.d dVar10 = lg.d.f20063c;
                    q4.r rVar3 = new q4.r(headToHeadLabelView2, continuation, 9);
                    this.f20221d = headToHeadLabelView2;
                    this.f20220c = 1;
                    A7 = eg.c0.A(dVar10, rVar3, this);
                    if (A7 == aVar19) {
                        return aVar19;
                    }
                    headToHeadLabelView = headToHeadLabelView2;
                } else {
                    if (i31 != 1) {
                        if (i31 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        A8 = obj;
                        headToHeadLabelView2.setArimoBoldTypeface((Typeface) A8);
                        headToHeadLabelView2.requestLayout();
                        headToHeadLabelView2.invalidate();
                        headToHeadLabelView2.f7515m = true;
                        return Unit.f19194a;
                    }
                    HeadToHeadLabelView headToHeadLabelView3 = (HeadToHeadLabelView) this.f20221d;
                    h8.b.B(obj);
                    headToHeadLabelView = headToHeadLabelView3;
                    A7 = obj;
                }
                Intrinsics.checkNotNullExpressionValue(A7, "withContext(...)");
                headToHeadLabelView.f7504a = (String) A7;
                lg.e eVar18 = m0.f9201a;
                lg.d dVar11 = lg.d.f20063c;
                ve.p pVar2 = new ve.p((me.d) obj2, continuation, i12);
                this.f20221d = null;
                this.f20220c = 2;
                A8 = eg.c0.A(dVar11, pVar2, this);
                if (A8 == aVar19) {
                    return aVar19;
                }
                headToHeadLabelView2.setArimoBoldTypeface((Typeface) A8);
                headToHeadLabelView2.requestLayout();
                headToHeadLabelView2.invalidate();
                headToHeadLabelView2.f7515m = true;
                return Unit.f19194a;
            case 19:
                return h(obj);
            case 20:
                return j(obj);
            default:
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                return new ic.c((ic.b) this.f20221d, (ic.b) this.f20222e, this.f20220c, (Integer) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(PredictionLabelView predictionLabelView, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 19;
        this.f20222e = predictionLabelView;
        this.f20223f = (AdaptedFunctionReference) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(StateGameView stateGameView, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 20;
        this.f20222e = stateGameView;
        this.f20223f = (AdaptedFunctionReference) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(eg.r rVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 0;
        this.f20222e = rVar;
        this.f20223f = (mf.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(fb.b bVar, int i5, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 12;
        this.f20221d = bVar;
        this.f20220c = i5;
        this.f20222e = str;
        this.f20223f = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ic.b bVar, ic.b bVar2, int i5, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f20219b = 21;
        this.f20221d = bVar;
        this.f20222e = bVar2;
        this.f20220c = i5;
        this.f20223f = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20219b = i5;
        this.f20221d = obj;
        this.f20222e = obj2;
        this.f20223f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20219b = i5;
        this.f20222e = obj;
        this.f20223f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20219b = i5;
        this.f20223f = obj;
    }
}
