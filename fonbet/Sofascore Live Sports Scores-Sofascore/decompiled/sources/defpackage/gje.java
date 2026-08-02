package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import android.view.textclassifier.TextClassifier;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.viewpager2.widget.ViewPager2;
import com.equativ.displaysdk.adadapter.SASMediationBannerAdapterWrapper;
import com.equativ.displaysdk.adadapter.SASMediationInterstitialAdapterWrapper;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import com.sofascore.model.newNetwork.post.ProfileImageUploadResponse;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.util.MarketValueUserVote;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gje extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gje(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Throwable, kotlin.coroutines.CoroutineContext, nu3] */
    /* JADX WARN: Type inference failed for: r12v14 */
    private final Object e(Object obj) {
        nig nigVar;
        ffg ffgVar;
        rq3 rq3Var;
        Object f;
        int i;
        Context context = (Context) this.u;
        tfg tfgVar = (tfg) this.t;
        g62 g62Var = tfgVar.L;
        nig nigVar2 = tfgVar.d;
        ffg ffgVar2 = tfgVar.a;
        nbg nbgVar = tfgVar.e;
        lu3 lu3Var = lu3.a;
        int i2 = this.s;
        int i3 = 1;
        if (i2 == 0) {
            y6a.M(obj);
            ExoPlayer exoPlayer = (ExoPlayer) tfgVar.g.invoke(context);
            tfgVar.v = exoPlayer;
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((vg6) exoPlayer).m.a(tfgVar.O);
            ct8 ct8Var = tfgVar.h;
            ExoPlayer exoPlayer2 = tfgVar.v;
            if (exoPlayer2 == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            tfgVar.y = (fhg) ct8Var.invoke(context, exoPlayer2, ffgVar2);
            Object obj2 = tfgVar.v;
            if (obj2 == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            String str = ffgVar2.a;
            h6c h6cVar = h6c.g;
            h5c h5cVar = new h5c();
            h5cVar.b(str);
            ((g51) obj2).l(h5cVar.a());
            ExoPlayer exoPlayer3 = tfgVar.v;
            if (exoPlayer3 == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((vg6) exoPlayer3).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            qgg qggVar = (qgg) tfgVar.b;
            qggVar.o = (Long) qggVar.c.invoke();
            ExoPlayer exoPlayer4 = tfgVar.v;
            if (exoPlayer4 == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((vg6) exoPlayer4).a();
            sdg sdgVar = new sdg(i3, context, tfgVar);
            tfgVar.p = sdgVar;
            sdgVar.setFocusable(true);
            sdg sdgVar2 = tfgVar.p;
            if (sdgVar2 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            sdgVar2.setFocusableInTouchMode(true);
            sdg sdgVar3 = tfgVar.p;
            if (sdgVar3 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            fhg fhgVar = tfgVar.y;
            if (fhgVar == null) {
                Intrinsics.i("videoLayersController");
                throw null;
            }
            sdgVar3.addView(fhgVar.i, new RelativeLayout.LayoutParams(-1, -1));
            sdg sdgVar4 = tfgVar.p;
            if (sdgVar4 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            fhg fhgVar2 = tfgVar.y;
            if (fhgVar2 == null) {
                Intrinsics.i("videoLayersController");
                throw null;
            }
            ehg ehgVar = fhgVar2.j;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13, -1);
            Unit unit = Unit.a;
            sdgVar4.addView(ehgVar, layoutParams);
            sdg sdgVar5 = tfgVar.p;
            if (sdgVar5 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            nigVar = nigVar2;
            ffgVar = ffgVar2;
            rq3Var = 0;
            sdgVar5.setOnTouchListener(new ifg(new fl8(0, tfgVar, tfg.class, "onVideoAdClicked", "onVideoAdClicked$smart_display_sdk_prodRelease()V", 0, 16)));
            tfgVar.q = new LinearLayout(context);
            dgg dggVar = (dgg) tfgVar.j.invoke(context, Boolean.valueOf(nbgVar.b));
            tfgVar.s = dggVar;
            if (dggVar == null) {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
            dggVar.setPostVideoLayoutControllerListener(tfgVar);
            sdg sdgVar6 = tfgVar.p;
            if (sdgVar6 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            dgg dggVar2 = tfgVar.s;
            if (dggVar2 == null) {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
            sdgVar6.addView(dggVar2.getPostVideoLayout());
            if (nbgVar.g) {
                sgg sggVar = (sgg) tfgVar.k.invoke(context);
                tfgVar.t = sggVar;
                sggVar.b();
                sdg sdgVar7 = tfgVar.p;
                if (sdgVar7 == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                sdgVar7.addView(sggVar.getView());
            }
            if (nbgVar.h) {
                yeg yegVar = (yeg) tfgVar.l.invoke(context);
                tfgVar.u = yegVar;
                xeg xegVar = (xeg) yegVar;
                xegVar.setMuteControllerListener(new qfg(tfgVar, 0));
                sdg sdgVar8 = tfgVar.p;
                if (sdgVar8 == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                sdgVar8.addView(xegVar.getView());
                qz.y(xegVar.getView(), gkg.c, new u9g(18));
            }
            if (nbgVar.e) {
                igg iggVar = (igg) tfgVar.m.invoke(context);
                tfgVar.A = iggVar;
                sdg sdgVar9 = tfgVar.p;
                if (sdgVar9 == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                sdgVar9.addView(iggVar.getView());
                qz.y(iggVar.getView(), gkg.b, new u9g(18));
            }
            this.s = 1;
            f = g62Var.f(this);
            if (f == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            f = obj;
            nigVar = nigVar2;
            ffgVar = ffgVar2;
            rq3Var = 0;
        }
        Exception exc = (Exception) f;
        if (exc != null) {
            throw exc;
        }
        g62Var.r(rq3Var);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        sdg sdgVar10 = tfgVar.p;
        if (sdgVar10 == null) {
            Intrinsics.i("rootLayout");
            throw rq3Var;
        }
        LinearLayout linearLayout = tfgVar.q;
        if (linearLayout == null) {
            Intrinsics.i("buttonsLayout");
            throw rq3Var;
        }
        sdgVar10.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = tfgVar.q;
        if (linearLayout2 == null) {
            Intrinsics.i("buttonsLayout");
            throw rq3Var;
        }
        qz.y(linearLayout2, gkg.a, new hfg(tfgVar, 4));
        if (nigVar != null) {
            ((pig) nigVar).o = tfgVar;
        }
        et8 et8Var = tfgVar.i;
        Object obj3 = tfgVar.v;
        if (obj3 == null) {
            Intrinsics.i("exoPlayer");
            throw rq3Var;
        }
        ahg ahgVar = (ahg) et8Var.invoke(context, new Long(((g51) obj3).u()), new Long(nbgVar.l != mbg.a ? nbgVar.c : -100L), Boolean.valueOf(nbgVar.i));
        tfgVar.r = ahgVar;
        if (ahgVar == null) {
            Intrinsics.i("videoCloseController");
            throw rq3Var;
        }
        ahgVar.g = tfgVar;
        if (nigVar != null) {
            LinearLayout linearLayout3 = tfgVar.q;
            if (linearLayout3 == null) {
                Intrinsics.i("buttonsLayout");
                throw rq3Var;
            }
            linearLayout3.addView(((pig) nigVar).m);
        }
        LinearLayout linearLayout4 = tfgVar.q;
        if (linearLayout4 == null) {
            Intrinsics.i("buttonsLayout");
            throw rq3Var;
        }
        ahg ahgVar2 = tfgVar.r;
        if (ahgVar2 == null) {
            Intrinsics.i("videoCloseController");
            throw rq3Var;
        }
        linearLayout4.addView(ahgVar2.f);
        tfgVar.n();
        mjg mjgVar = tfgVar.c;
        fhg fhgVar3 = tfgVar.y;
        if (fhgVar3 == null) {
            Intrinsics.i("videoLayersController");
            throw rq3Var;
        }
        ffg ffgVar3 = ffgVar;
        rjg d = mjgVar.d(fhgVar3.j, ffgVar3.g, true, false, tfgVar.b);
        if (d != null) {
            ahg ahgVar3 = tfgVar.r;
            if (ahgVar3 == null) {
                Intrinsics.i("videoCloseController");
                throw rq3Var;
            }
            d.a(2, ahgVar3.f);
            sgg sggVar2 = tfgVar.t;
            if (sggVar2 != null) {
                i = 1;
                d.a(1, sggVar2.getView());
            } else {
                i = 1;
            }
            yeg yegVar2 = tfgVar.u;
            if (yegVar2 != null) {
                d.a(i, ((xeg) yegVar2).getView());
            }
            igg iggVar2 = tfgVar.A;
            if (iggVar2 != null) {
                d.a(i, iggVar2.getView());
            }
            if (nigVar != null) {
                d.a(4, ((pig) nigVar).m);
            }
            hkg.T().post(new pjg(d, nbgVar.c, 1));
        }
        igg iggVar3 = tfgVar.A;
        if (iggVar3 != null) {
            ExoPlayer exoPlayer5 = tfgVar.v;
            if (exoPlayer5 == null) {
                Intrinsics.i("exoPlayer");
                throw rq3Var;
            }
            xw3.L(iggVar3.a, rq3Var, rq3Var, new hgg(iggVar3, ((vg6) exoPlayer5).getDuration(), rq3Var, 0), 3);
        }
        sdg sdgVar11 = tfgVar.p;
        if (sdgVar11 == null) {
            Intrinsics.i("rootLayout");
            throw rq3Var;
        }
        sdgVar11.setBackgroundColor(ffgVar3.d);
        sdg sdgVar12 = tfgVar.p;
        if (sdgVar12 != null) {
            return sdgVar12;
        }
        Intrinsics.i("rootLayout");
        throw rq3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new gje((TextClassifier) this.t, (Function2) obj2, rq3Var, 0);
            case 1:
                return new gje((ple) obj2, rq3Var, 1);
            case 2:
                return new gje((roe) this.t, (MarketValueUserVote) obj2, rq3Var, 2);
            case 3:
                return new gje((ale) this.t, (Function2) obj2, rq3Var, 3);
            case 4:
                gje gjeVar = new gje((gte) obj2, rq3Var, 4);
                gjeVar.t = obj;
                return gjeVar;
            case 5:
                return new gje((pxe) this.t, (Transfer) obj2, rq3Var, 5);
            case 6:
                return new gje((p1f) this.t, (j1f) obj2, rq3Var, 6);
            case 7:
                gje gjeVar2 = new gje((c4f) obj2, rq3Var, 7);
                gjeVar2.t = obj;
                return gjeVar2;
            case 8:
                return new gje((u6b) this.t, (c4f) obj2, rq3Var, 8);
            case 9:
                return new gje((d6f) this.t, (ale) obj2, rq3Var, 9);
            case 10:
                return new gje((UserBadge) this.t, (f9f) obj2, rq3Var, 10);
            case 11:
                return new gje((f9f) this.t, (String) obj2, rq3Var, 11);
            case 12:
                return new gje((f9f) this.t, (Uri) obj2, rq3Var, 12);
            case 13:
                gje gjeVar3 = new gje((q9f) obj2, rq3Var, 13);
                gjeVar3.t = obj;
                return gjeVar3;
            case 14:
                return new gje((Integer) this.t, (ksa) obj2, rq3Var, 14);
            case 15:
                return new gje((koh) this.t, (xnh) obj2, rq3Var, 15);
            case 16:
                return new gje((amf) this.t, (mlf) obj2, rq3Var, 16);
            case 17:
                gje gjeVar4 = new gje((yxf) obj2, rq3Var, 17);
                gjeVar4.t = obj;
                return gjeVar4;
            case 18:
                return new gje((o85) this.t, (ksa) obj2, rq3Var, 18);
            case 19:
                return new gje((bfk) this.t, (Context) obj2, rq3Var, 19);
            case 20:
                gje gjeVar5 = new gje((y20) obj2, rq3Var, 20);
                gjeVar5.t = obj;
                return gjeVar5;
            case 21:
                return new gje((l2a) this.t, (String) obj2, rq3Var, 21);
            case 22:
                return new gje((fcg) this.t, (fr7) obj2, rq3Var, 22);
            case 23:
                return new gje((tdg) this.t, (String) obj2, rq3Var, 23);
            case 24:
                return new gje((SASMediationBannerAdapterWrapper) this.t, (Exception) obj2, rq3Var, 24);
            case 25:
                return new gje((SASMediationInterstitialAdapterWrapper) this.t, (Exception) obj2, rq3Var, 25);
            case 26:
                return new gje((veg) this.t, (String) obj2, rq3Var, 26);
            case 27:
                return new gje((tfg) this.t, (dke) obj2, rq3Var, 27);
            case 28:
                return new gje((tfg) this.t, (Context) obj2, rq3Var, 28);
            default:
                return new gje((g62) this.t, (zjg) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 3:
                ((gje) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 18:
                ((gje) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((gje) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0232, code lost:
    
        if (r0 == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ab, code lost:
    
        if (r7 == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cd, code lost:
    
        if (r0 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a1, code lost:
    
        if (r0.d(r21) == r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0290, code lost:
    
        if (r2 == r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02ea, code lost:
    
        if (defpackage.v8a.G((defpackage.ksa) r6, r1, r21) == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02d8, code lost:
    
        if (r1 == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02ed, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0561, code lost:
    
        if (defpackage.bfk.e(r0, null, r1, null, null, null, null, null, null, null, r21, 8189) == r13) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0538, code lost:
    
        if (r1 == r13) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0512, code lost:
    
        if (r7 == r13) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0679, code lost:
    
        if ((r11 - r6.g) >= 30) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x067b, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x067d, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0688, code lost:
    
        if ((r11 - r6.f) >= 30) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x068f, code lost:
    
        if ((r11 - r6.e) >= 30) goto L356;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x06fd  */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [zdc] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x02ea -> B:173:0x02cc). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        ple pleVar;
        Object u;
        g4f predictionsAdapter;
        boolean z;
        boolean z2;
        int ordinal;
        Object P2;
        rq3 rq3Var;
        Object R;
        ?? r9;
        Object P3;
        Object a;
        Object b;
        Boolean bool;
        Double d;
        Integer num;
        gah gahVar;
        o7h o7hVar;
        Integer num2;
        Double d2;
        Object obj2;
        Boolean bool2;
        Object f;
        Object c;
        Object j;
        Object R2;
        Object i;
        Object R3;
        Object c2;
        Object c3;
        ln2 ln2Var;
        ln2 ln2Var2;
        int i2 = this.r;
        int i3 = 2;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Object obj3 = this.u;
        int i4 = 1;
        Object obj4 = null;
        Boolean bool3 = null;
        ?? r92 = 0;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                TextClassifier textClassifier = (TextClassifier) this.t;
                if (textClassifier == null) {
                    return null;
                }
                this.s = 1;
                Object invoke = ((Function2) obj3).invoke(textClassifier, this);
                return invoke == lu3Var ? lu3Var : invoke;
            case 1:
                ple pleVar2 = (ple) obj3;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    t9c t9cVar = pleVar2.g;
                    int i7 = pleVar2.j;
                    String c4 = dv3.c();
                    this.t = pleVar2;
                    this.s = 1;
                    t9cVar.getClass();
                    P = yaa.P(new y8c(t9cVar, i7, c4, null, 1), this);
                    if (P == lu3Var2) {
                        return lu3Var2;
                    }
                    pleVar = pleVar2;
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pleVar = (ple) this.t;
                    y6a.M(obj);
                    P = obj;
                }
                pleVar.w = (MediaHighlightSummaryResponse) yaa.x((x2g) P);
                return Boolean.valueOf(pleVar2.w != null);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    by9 by9Var = ((roe) this.t).f;
                    this.s = 1;
                    dvb dvbVar = (dvb) by9Var.a;
                    Object U = gz8.U(this, dvbVar.a, false, true, new lsb(i4, dvbVar, (MarketValueUserVote) obj3));
                    Object obj5 = U;
                    if (U != lu3Var3) {
                        obj5 = Unit.a;
                    }
                    if (obj5 != lu3Var3) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.s = 1;
                t6a.z((ale) this.t, null, (Function2) obj3, this);
                return lu3Var4;
            case 4:
                gte gteVar = (gte) obj3;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    List j2 = b.j(xw3.t(ku3Var, null, new dte(gteVar, r9, i4), 3), xw3.t(ku3Var, null, new dte(gteVar, r9, z3 ? 1 : 0), 3));
                    this.t = null;
                    this.s = 1;
                    u = m6k.u(j2, this);
                    if (u == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                }
                return k13.s((Iterable) u);
            case 5:
                pxe pxeVar = (pxe) this.t;
                lu3 lu3Var6 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ht9 ht9Var = new ht9(pxeVar.a);
                vt9.b(ht9Var, pxeVar.c);
                Team transferTo = ((Transfer) obj3).getTransferTo();
                ht9Var.c = transferTo != null ? pco.R(transferTo.getId()) : null;
                nt9 a2 = ht9Var.a();
                apf a3 = ajh.a(pxeVar.a);
                this.s = 1;
                Object c5 = a3.c(a2, this);
                return c5 == lu3Var6 ? lu3Var6 : c5;
            case 6:
                j1f j1fVar = (j1f) obj3;
                p1f p1fVar = (p1f) this.t;
                yzc yzcVar = p1fVar.c;
                lu3 lu3Var7 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    g9i g9iVar = p1fVar.h;
                    if (g9iVar != null) {
                        this.s = 1;
                        if (g9iVar.Z(this) == lu3Var7) {
                            return lu3Var7;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                p1fVar.f = p1fVar.f.a(j1fVar);
                if (yzcVar.d() == null) {
                    yzcVar.k(j1fVar);
                }
                return Unit.a;
            case 7:
                c4f c4fVar = (c4f) obj3;
                z3f z3fVar = c4fVar.d;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var8 = lu3.a;
                int i13 = this.s;
                if (i13 != 0 && i13 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var2)) {
                    predictionsAdapter = c4fVar.getPredictionsAdapter();
                    List S0 = CollectionsKt.S0(predictionsAdapter.i);
                    if (!S0.isEmpty()) {
                        w3f w3fVar = (w3f) CollectionsKt.a0(((ViewPager2) z3fVar.c).getCurrentItem(), S0);
                        if (w3fVar == null) {
                            continue;
                        } else {
                            y3f y3fVar = w3fVar.b;
                            int w = (int) yaa.w();
                            int ordinal2 = y3fVar.ordinal();
                            if (ordinal2 == 0) {
                                break;
                            } else if (ordinal2 == 1) {
                                break;
                            } else {
                                if (ordinal2 != 2) {
                                    zzl.b();
                                    return null;
                                }
                                break;
                            }
                            String str = w3fVar.g;
                            if ((str == null || str.length() == 0 || w3fVar.m) && !w3fVar.j && Intrinsics.c(w3fVar.k, StatusKt.STATUS_NOT_STARTED) && z) {
                                int i14 = Resources.getSystem().getDisplayMetrics().heightPixels;
                                int[] iArr = new int[2];
                                if (c4fVar.isAttachedToWindow()) {
                                    ((ViewPager2) z3fVar.c).getLocationOnScreen(iArr);
                                }
                                if (i14 <= 0) {
                                    s38.a().c(new IllegalArgumentException("Screen height == 0"));
                                } else if (iArr[1] >= i14) {
                                    z2 = false;
                                    if (iArr[1] > 0 && z2) {
                                        ordinal = y3fVar.ordinal();
                                        if (ordinal != 0) {
                                            c4fVar.e = w;
                                        } else if (ordinal == 1) {
                                            c4fVar.f = w;
                                        } else {
                                            if (ordinal != 2) {
                                                zzl.b();
                                                return null;
                                            }
                                            c4fVar.g = w;
                                        }
                                        Context context = c4fVar.getContext();
                                        context.getClass();
                                        nv.R(w3fVar.q, ((ViewPager2) z3fVar.c).getCurrentItem() + 1, lv.EVENT_DETAILS, context, y3fVar.b);
                                    }
                                }
                                z2 = true;
                                if (iArr[1] > 0) {
                                    ordinal = y3fVar.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    Context context2 = c4fVar.getContext();
                                    context2.getClass();
                                    nv.R(w3fVar.q, ((ViewPager2) z3fVar.c).getCurrentItem() + 1, lv.EVENT_DETAILS, context2, y3fVar.b);
                                }
                            }
                        }
                    }
                    wd5 wd5Var = xd5.b;
                    long R4 = wkn.R(2, be5.SECONDS);
                    this.t = ku3Var2;
                    this.s = 1;
                    if (n4o.z(R4, this) == lu3Var8) {
                        return lu3Var8;
                    }
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.t;
                    e6b e6bVar = e6b.e;
                    gje gjeVar = new gje((c4f) obj3, r9, 7);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, gjeVar, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((d6f) this.t).c((ale) obj3, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                cl clVar = new cl((UserBadge) this.t, (f9f) obj3, r9, 26);
                this.s = 1;
                Object P4 = yaa.P(clVar, this);
                return P4 == lu3Var11 ? lu3Var11 : P4;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    cl clVar2 = new cl((f9f) this.t, (String) obj3, r9, 27);
                    this.s = 1;
                    P2 = yaa.P(clVar2, this);
                    if (P2 == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                return (x2g) P2;
            case 12:
                f9f f9fVar = (f9f) this.t;
                yzc yzcVar2 = f9fVar.i;
                lu3 lu3Var13 = lu3.a;
                int i19 = this.s;
                rq3 rq3Var2 = null;
                if (i19 == 0) {
                    y6a.M(obj);
                    Context i20 = f9fVar.i();
                    Uri uri = (Uri) obj3;
                    this.s = 1;
                    Size size = new Size(600, 600);
                    hs4 hs4Var = z45.a;
                    hq4 hq4Var = hq4.c;
                    zi7 zi7Var = new zi7(i20, uri, size, rq3Var2, 13);
                    rq3Var = null;
                    R = xw3.R(hq4Var, zi7Var, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            if (i19 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                            r4a.M(f9fVar.k);
                            return Unit.a;
                        }
                        y6a.M(obj);
                        P3 = obj;
                        ProfileImageUploadResponse profileImageUploadResponse = (ProfileImageUploadResponse) yaa.x((x2g) P3);
                        yzcVar2.j(profileImageUploadResponse);
                        if (profileImageUploadResponse != null) {
                            bfk bfkVar = f9fVar.e;
                            String imageUrl = profileImageUploadResponse.getImageUrl();
                            this.s = 3;
                            break;
                        }
                        r4a.M(f9fVar.k);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    R = obj;
                    rq3Var = null;
                }
                byte[] bArr = (byte[]) R;
                if (bArr == null) {
                    yzcVar2.j(rq3Var);
                    r4a.M(f9fVar.k);
                    return Unit.a;
                }
                xzf xzfVar = yzf.Companion;
                Regex regex = zdc.e;
                try {
                    r9 = bea.v("image/jpeg");
                } catch (IllegalArgumentException unused) {
                    r9 = rq3Var;
                }
                cl clVar3 = new cl(f9fVar, xzf.d(xzfVar, bArr, r9, 0, 6), rq3Var, 28);
                this.s = 2;
                P3 = yaa.P(clVar3, this);
                break;
            case 13:
                q9f q9fVar = (q9f) obj3;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    q9fVar.n(null, new b1f(15));
                    av4 t = xw3.t(ku3Var3, null, new hje(q9fVar, r9, i3), 3);
                    wd5 wd5Var2 = xd5.b;
                    long R5 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    if (z8e.e0(t, R5, this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                q9fVar.n(null, new b1f(16));
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    Integer num3 = (Integer) this.t;
                    if (num3 != null) {
                        int intValue = num3.intValue() - 6;
                        this.s = 1;
                        y3g y3gVar = ksa.y;
                        if (((ksa) obj3).f(intValue, 0, this) == lu3Var15) {
                            return lu3Var15;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    q50 q50Var = (q50) ((koh) this.t).get("live_line_position");
                    if (q50Var != null) {
                        Float f2 = new Float(((xnh) obj3).h());
                        i4k h0 = s02.h0(400, 0, null, 6);
                        this.s = 1;
                        a = q50.a(q50Var, f2, h0, null, this, 12);
                        if (a == lu3Var16) {
                            return lu3Var16;
                        }
                    }
                    return Unit.a;
                }
                if (i23 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a = obj;
                return Unit.a;
            case 16:
                amf amfVar = (amf) this.t;
                lu3 lu3Var17 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    if (amfVar == amf.i || amfVar == amf.j) {
                        pai paiVar = ((mlf) obj3).e;
                        int i25 = amfVar.a;
                        this.s = 1;
                        b = paiVar.b(i25, this);
                        if (b == lu3Var17) {
                            return lu3Var17;
                        }
                    }
                    return amfVar;
                }
                if (i24 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                b = obj;
                if (!((Boolean) b).booleanValue()) {
                    return null;
                }
                return amfVar;
            case 17:
                yxf yxfVar = (yxf) obj3;
                lu3 lu3Var18 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    JSONObject jSONObject = (JSONObject) this.t;
                    Objects.toString(jSONObject);
                    if (jSONObject.has("app_quality")) {
                        Object obj6 = jSONObject.get("app_quality");
                        obj6.getClass();
                        JSONObject jSONObject2 = (JSONObject) obj6;
                        try {
                            bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        } catch (JSONException e) {
                            e = e;
                            num2 = null;
                            d2 = null;
                        }
                        try {
                            d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            } catch (JSONException e2) {
                                e = e2;
                                num2 = null;
                                bool3 = bool2;
                                obj2 = null;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            num2 = null;
                            d2 = null;
                            bool3 = bool2;
                            obj2 = d2;
                            o02.K(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d = d2;
                            bool = bool3;
                            r92 = obj2;
                            gahVar = yxfVar.e;
                            if (r92 != 0) {
                            }
                            yxfVar.a.getClass();
                            o7hVar = new o7h(bool, d, num, new Integer(r1), new Long(vhj.a().c));
                            this.s = 1;
                            if (gahVar.c(o7hVar, this) == lu3Var18) {
                            }
                            return Unit.a;
                        }
                        try {
                            obj4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                            Unit unit = Unit.a;
                            num = num2;
                            d = d2;
                            bool = bool2;
                            r92 = obj4;
                        } catch (JSONException e4) {
                            e = e4;
                            Object obj7 = obj4;
                            bool3 = bool2;
                            obj2 = obj7;
                            o02.K(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d = d2;
                            bool = bool3;
                            r92 = obj2;
                            gahVar = yxfVar.e;
                            if (r92 != 0) {
                            }
                            yxfVar.a.getClass();
                            o7hVar = new o7h(bool, d, num, new Integer(r1), new Long(vhj.a().c));
                            this.s = 1;
                            if (gahVar.c(o7hVar, this) == lu3Var18) {
                            }
                            return Unit.a;
                        }
                    } else {
                        bool = null;
                        d = null;
                        num = null;
                    }
                    gahVar = yxfVar.e;
                    int intValue2 = r92 != 0 ? r92.intValue() : yxf.g;
                    yxfVar.a.getClass();
                    o7hVar = new o7h(bool, d, num, new Integer(intValue2), new Long(vhj.a().c));
                    this.s = 1;
                    if (gahVar.c(o7hVar, this) == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i27 = this.s;
                if (i27 != 0) {
                    if (i27 == 1) {
                        y6a.M(obj);
                        f = obj;
                        float floatValue = ((Number) f).floatValue();
                        this.s = 2;
                        break;
                    } else if (i27 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                y6a.M(obj);
                g62 g62Var = ((o85) this.t).g;
                this.s = 1;
                f = g62Var.f(this);
                break;
            case 19:
                bfk bfkVar2 = (bfk) this.t;
                lu3 lu3Var20 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    c = bfkVar2.c(this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ad2 ad2Var = qv5.a;
                        qv5.a(j42.a);
                        u0a.D((Context) obj3, true);
                        return Unit.a;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                if (((UserAccount) c).getIsLoggedIn()) {
                    this.s = 2;
                    break;
                }
                u0a.D((Context) obj3, true);
                return Unit.a;
            case 20:
                y20 y20Var = (y20) obj3;
                lu3 lu3Var21 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var4 = (ku3) this.t;
                    z88 b2 = y20Var.o.b();
                    usf usfVar = new usf(i3, y20Var, ku3Var4);
                    this.s = 1;
                    if (b2.collect(usfVar, this) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                String str2 = (String) obj3;
                l2a l2aVar = (l2a) this.t;
                sz8 sz8Var = (sz8) l2aVar.c;
                by9 by9Var2 = (by9) l2aVar.b;
                lu3 lu3Var22 = lu3.a;
                int i30 = this.s;
                try {
                } catch (e9g unused2) {
                    this.s = 3;
                    j = by9Var2.j(str2, this);
                    break;
                }
                if (i30 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    i = by9Var2.i(str2, this);
                    break;
                } else if (i30 == 1) {
                    y6a.M(obj);
                    i = obj;
                } else {
                    if (i30 == 2) {
                        y6a.M(obj);
                        R3 = obj;
                        return (y8g) R3;
                    }
                    if (i30 == 3) {
                        y6a.M(obj);
                        j = obj;
                        String replace = new Regex("=\"(.*?)&(?!(amp;|lt;|gt;|quot;|apos;|#[0-9]+;|#x[0-9a-fA-F]+;))(.*?)\"").replace(me4.h("(<!\\[CDATA\\[.*?)&(?!(amp;|lt;|gt;|quot;|apos;|#[0-9]+;|#x[0-9a-fA-F]+;))(.*?\\]\\]>)", me4.h("<(meta|img|br|hr|input|area|base|col|embed|keygen|param|track|wbr)([^>]*?)/?>(?!</\\1>)", me4.h("<(link|source|category|guid|enclosure|media:content|media:thumbnail)([^>]*?)>\\s*</\\1>", me4.h("<([^>]+)></\\1>([^<]+|<!\\[CDATA\\[.+?\\]\\]>)</\\1>", me4.h("&(?!(amp;|lt;|gt;|quot;|apos;|#[0-9]+;|#x[0-9a-fA-F]+;))", (String) j, "&amp;"), "<$1>$2</$1>"), "<$1$2></$1>"), "<$1$2></$1>"), "$1&amp;$3"), "=\"$1&amp;$3\"");
                        replace.getClass();
                        byte[] bytes = StringsKt.l0(replace).toString().getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        t9e t9eVar = new t9e(new ByteArrayInputStream(bytes), null);
                        this.s = 4;
                        R2 = xw3.R((au3) sz8Var.b, new k50((Object) t9eVar, (Object) sz8Var, r9, (int) (z5 ? 1 : 0)), this);
                        break;
                    } else {
                        if (i30 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        R2 = obj;
                        return (y8g) R2;
                    }
                }
                t9e t9eVar2 = (t9e) i;
                this.s = 2;
                R3 = xw3.R((au3) sz8Var.b, new k50((Object) t9eVar2, (Object) sz8Var, r9, (int) (z4 ? 1 : 0)), this);
                if (R3 == lu3Var22) {
                    return lu3Var22;
                }
                return (y8g) R3;
            case 22:
                fcg fcgVar = (fcg) this.t;
                lu3 lu3Var23 = lu3.a;
                int i31 = this.s;
                try {
                    if (i31 == 0) {
                        y6a.M(obj);
                        this.s = 1;
                        int i32 = fcg.p;
                        c2 = fcgVar.c((fr7) obj3, this);
                        if (c2 == lu3Var23) {
                            return lu3Var23;
                        }
                    } else {
                        if (i31 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        c2 = obj;
                    }
                    fcgVar.k.post(new gjc(29, fcgVar, (uag) c2));
                } catch (hdg e5) {
                    fcgVar.k.post(new ecg(z6 ? 1 : 0, e5, fcgVar));
                }
                fcgVar.h = null;
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    xag xagVar = ((tdg) this.t).q;
                    if (xagVar != null) {
                        this.s = 1;
                        c3 = ((zag) xagVar).c((String) obj3, this);
                        if (c3 == lu3Var24) {
                            return lu3Var24;
                        }
                    }
                    return Unit.a;
                }
                if (i33 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                c3 = obj;
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                int i34 = this.s;
                try {
                    if (i34 == 0) {
                        y6a.M(obj);
                        ln2Var = ((SASMediationBannerAdapterWrapper) this.t).g;
                        this.s = 1;
                        if (ln2Var.q(this, (Exception) obj3) == lu3Var25) {
                            return lu3Var25;
                        }
                    } else {
                        if (i34 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused3) {
                }
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                int i35 = this.s;
                try {
                    if (i35 == 0) {
                        y6a.M(obj);
                        ln2Var2 = ((SASMediationInterstitialAdapterWrapper) this.t).h;
                        this.s = 1;
                        if (ln2Var2.q(this, (Exception) obj3) == lu3Var26) {
                            return lu3Var26;
                        }
                    } else {
                        if (i35 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused4) {
                }
                return Unit.a;
            case 26:
                lu3 lu3Var27 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((veg) this.t).a.a((String) obj3, this) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                tfg tfgVar = (tfg) this.t;
                lu3 lu3Var28 = lu3.a;
                int i37 = this.s;
                try {
                    if (i37 == 0) {
                        y6a.M(obj);
                        this.s = 1;
                        ?? q = tfgVar.L.q(this, (dke) obj3);
                        tfgVar = q;
                        if (q == lu3Var28) {
                            return lu3Var28;
                        }
                    } else {
                        if (i37 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        tfgVar = tfgVar;
                    }
                } catch (Exception unused5) {
                    ffg ffgVar = tfgVar.a;
                    String str3 = ffgVar.i;
                    if (str3 != null) {
                        tfgVar.f.a(qkg.r, ffgVar.h, str3);
                    }
                }
                return Unit.a;
            case 28:
                return e(obj);
            default:
                lu3 lu3Var29 = lu3.a;
                int i38 = this.s;
                try {
                    if (i38 == 0) {
                        y6a.M(obj);
                        this.s = 1;
                        if (((g62) this.t).q(this, (zjg) obj3) == lu3Var29) {
                            return lu3Var29;
                        }
                    } else {
                        if (i38 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (Exception unused6) {
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gje(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
