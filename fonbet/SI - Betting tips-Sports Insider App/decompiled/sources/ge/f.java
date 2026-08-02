package ge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.android.billingclient.api.SkuDetails;
import com.logrocket.core.e0;
import com.sports.insider.MyApp;
import com.sports.insider.data.room.general.table.AccountTable;
import com.sports.insider.ui.live.LiveFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.subs.ListSubsFragment;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import ec.w;
import eg.c0;
import eg.m0;
import eg.y;
import eg.z;
import f3.x;
import io.appmetrica.analytics.AppMetrica;
import io.sentry.d4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.u;
import rc.b0;
import wc.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9968d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Comparable comparable, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9966b = i5;
        this.f9969e = obj;
        this.f9968d = comparable;
        this.f9967c = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9966b) {
            case 0:
                return new f(this.f9969e, this.f9967c, this.f9968d, continuation, 0);
            case 1:
                return new f((String) this.f9967c, (String) this.f9968d, this.f9969e, continuation, 1);
            case 2:
                return new f(this.f9969e, (Comparable) this.f9968d, (String) this.f9967c, continuation, 2);
            case 3:
                f fVar = new f((Context) this.f9967c, (LivePayFragment) this.f9968d, continuation, 3);
                fVar.f9969e = obj;
                return fVar;
            case 4:
                return new f(this.f9969e, this.f9967c, this.f9968d, continuation, 4);
            case 5:
                f fVar2 = new f((Context) this.f9967c, (PayExpressFragment) this.f9968d, continuation, 5);
                fVar2.f9969e = obj;
                return fVar2;
            case 6:
                return new f(this.f9969e, this.f9967c, this.f9968d, continuation, 6);
            case 7:
                f fVar3 = new f((Context) this.f9967c, (PayPremiumFragment) this.f9968d, continuation, 7);
                fVar3.f9969e = obj;
                return fVar3;
            case 8:
                f fVar4 = new f((Context) this.f9967c, (VipAccessFragment) this.f9968d, continuation, 8);
                fVar4.f9969e = obj;
                return fVar4;
            case 9:
                return new f((String) this.f9967c, (String) this.f9968d, this.f9969e, continuation, 9);
            case 10:
                return new f((String) this.f9967c, (File) this.f9969e, (String) this.f9968d, continuation);
            case 11:
                return new f((u) this.f9969e, (Activity) this.f9967c, (SkuDetails) this.f9968d, continuation, 11);
            case 12:
                f fVar5 = new f((g1.c) this.f9967c, (Long) this.f9968d, continuation, 12);
                fVar5.f9969e = obj;
                return fVar5;
            case 13:
                return new f((b0) this.f9969e, (String) this.f9967c, (JSONObject) this.f9968d, continuation, 13);
            case 14:
                return new f((sc.h) this.f9969e, (String) this.f9967c, (ha.d) this.f9968d, continuation, 14);
            case 15:
                return new f((Typeface) this.f9969e, (Typeface) this.f9967c, (ListSubsFragment) this.f9968d, continuation, 15);
            case 16:
                return new f((ViewCloudFragment) this.f9969e, (String) this.f9967c, (Map) this.f9968d, continuation, 16);
            case 17:
                return new f((v) this.f9969e, (ic.a) this.f9967c, (ic.a) this.f9968d, continuation, 17);
            default:
                return new f(this.f9969e, (Comparable) this.f9968d, (String) this.f9967c, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9966b) {
        }
        return ((f) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a4  */
    /* JADX WARN: Type inference failed for: r10v4, types: [y1.r] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [y1.c0] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CustomButton customButton;
        CustomGradientButton customGradientButton;
        CustomButton customButton2;
        CustomGradientButton customGradientButton2;
        IOException ex;
        File file;
        BufferedWriter bufferedWriter;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        TextView textView13;
        TextView textView14;
        TextView textView15;
        TextView textView16;
        TextView textView17;
        TextView textView18;
        TextView textView19;
        TextView textView20;
        TextView textView21;
        TextView textView22;
        TextView textView23;
        TextView textView24;
        TextView textView25;
        TextView textView26;
        TextView textView27;
        TextView textView28;
        TextView textView29;
        TextView textView30;
        TextView textView31;
        TextView textView32;
        TextView textView33;
        int i5 = 13;
        int i10 = 7;
        int i11 = 18;
        ?? r82 = 0;
        com.android.billingclient.api.d dVar = null;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f9966b) {
            case 0:
                LiveFragment liveFragment = (LiveFragment) this.f9969e;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    String str = (String) this.f9967c;
                    String str2 = (String) this.f9968d;
                    if (str != null) {
                        da.o oVar = new da.o(str);
                        oVar.m(str2);
                        r82 = oVar;
                    }
                    if (r82 != 0) {
                        a.a.r(liveFragment).d(r82);
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                String str3 = (String) this.f9967c;
                if (str3 == null) {
                    return Unit.f19194a;
                }
                String str4 = (String) this.f9968d;
                if (str4 == null || !Intrinsics.areEqual(str3, str4)) {
                    c0.t(MyApp.f6830c, new y("PushTokenUseCase"), null, new ab.b((y8.d) this.f9969e, str3, r82, i5), 2);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                sb.j e0 = x.e0();
                Integer num = (Integer) this.f9968d;
                String lang = (String) this.f9967c;
                e0.getClass();
                Intrinsics.checkNotNullParameter(lang, "lang");
                tb.f fVar = e0.f23426a;
                int intValue = num != null ? num.intValue() : 0;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(lang, "lang");
                return (ja.d) x.n0(fVar.f23832a, true, false, new m3.h(intValue, lang, i10));
            case 3:
                z zVar = (z) this.f9969e;
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = m0.f9201a;
                return c0.e(zVar, lg.d.f20063c, new bd.i((Context) this.f9967c, (LivePayFragment) this.f9968d, (Continuation) r82, i5), 2);
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                PayExpressFragment payExpressFragment = (PayExpressFragment) this.f9969e;
                ec.v vVar = (ec.v) payExpressFragment.f22459a;
                if (vVar != null && (customGradientButton = vVar.f9020c) != null) {
                    customGradientButton.setButtonText((String) this.f9967c);
                }
                ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
                if (vVar2 == null || (customButton = vVar2.f9021d) == null) {
                    return null;
                }
                customButton.setButtonText((String) this.f9968d);
                return Unit.f19194a;
            case 5:
                z zVar2 = (z) this.f9969e;
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = m0.f9201a;
                return c0.e(zVar2, lg.d.f20063c, new bd.i((Context) this.f9967c, (PayExpressFragment) this.f9968d, (Continuation) r82, 15), 2);
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) this.f9969e;
                w wVar = (w) payPremiumFragment.f22459a;
                if (wVar != null && (customGradientButton2 = wVar.f9031c) != null) {
                    customGradientButton2.setButtonText((String) this.f9967c);
                }
                w wVar2 = (w) payPremiumFragment.f22459a;
                if (wVar2 == null || (customButton2 = wVar2.f9032d) == null) {
                    return null;
                }
                customButton2.setButtonText((String) this.f9968d);
                return Unit.f19194a;
            case 7:
                z zVar3 = (z) this.f9969e;
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar3 = m0.f9201a;
                return c0.e(zVar3, lg.d.f20063c, new bd.i((Context) this.f9967c, (PayPremiumFragment) this.f9968d, (Continuation) r82, 17), 2);
            case 8:
                z zVar4 = (z) this.f9969e;
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar4 = m0.f9201a;
                return c0.e(zVar4, lg.d.f20063c, new bd.i((Context) this.f9967c, (VipAccessFragment) this.f9968d, (Continuation) r82, i11), 2);
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str5 = (String) this.f9967c;
                    if (str5 != null) {
                        jSONObject.put("history", new JSONArray(str5));
                    }
                    String str6 = (String) this.f9968d;
                    if (str6 != null) {
                        jSONObject.put("purchase", new JSONArray(str6));
                    }
                    jSONObject.put("info", i2.d.t((i2.d) this.f9969e));
                    return jSONObject.toString();
                } catch (Exception unused2) {
                    return null;
                }
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    try {
                        try {
                            file = File.createTempFile((String) this.f9967c, "historyPurchase.json", (File) this.f9969e);
                        } catch (IOException e7) {
                            ex = e7;
                            file = null;
                            bufferedWriter = null;
                            Intrinsics.checkNotNullParameter(ex, "ex");
                            jg.d dVar2 = MyApp.f6830c;
                            lg.e eVar5 = m0.f9201a;
                            c0.t(dVar2, lg.d.f20063c, null, new q4.r(ex, r82, i11), 2);
                            if (file != null && file.exists()) {
                                file.delete();
                            }
                            if (bufferedWriter != null) {
                                return null;
                            }
                            bufferedWriter.close();
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedWriter2 != null) {
                            bufferedWriter2.close();
                        }
                        throw th;
                    }
                    try {
                        bufferedWriter = new BufferedWriter(new io.sentry.instrumentation.file.h(new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.c(file, null, false))));
                        try {
                            try {
                                bufferedWriter.write((String) this.f9968d);
                                bufferedWriter.close();
                                return file;
                            } catch (IOException e9) {
                                ex = e9;
                                Intrinsics.checkNotNullParameter(ex, "ex");
                                jg.d dVar22 = MyApp.f6830c;
                                lg.e eVar52 = m0.f9201a;
                                c0.t(dVar22, lg.d.f20063c, null, new q4.r(ex, r82, i11), 2);
                                if (file != null) {
                                    file.delete();
                                }
                                if (bufferedWriter != null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter2 = bufferedWriter;
                            if (bufferedWriter2 != null) {
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        ex = e10;
                        bufferedWriter = null;
                    }
                } catch (IOException e11) {
                    ex = e11;
                }
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                yb.i n9 = u.n();
                Activity activity = (Activity) this.f9967c;
                SkuDetails skuDetails = (SkuDetails) this.f9968d;
                n9.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
                com.android.billingclient.api.d dVar3 = yb.i.f25817e;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                } else {
                    dVar = dVar3;
                }
                com.android.billingclient.api.g gVar = new com.android.billingclient.api.g();
                gVar.f4019c = new m3.f(i10);
                ArrayList arrayList = new ArrayList();
                arrayList.add(skuDetails);
                gVar.f4018b = arrayList;
                dVar.g(activity, gVar.a());
                return Unit.f19194a;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                ((g1.a) this.f9969e).e((g1.c) this.f9967c, (Long) this.f9968d);
                return Unit.f19194a;
            case 13:
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                za.k a7 = b0.a((b0) this.f9969e);
                String eventName = (String) this.f9967c;
                JSONObject jSONObject2 = (JSONObject) this.f9968d;
                a7.getClass();
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                ((ac.d) za.k.a()).getClass();
                Intrinsics.checkNotNullParameter(eventName, "eventName");
                if (jSONObject2 == null) {
                    AppMetrica.reportEvent(eventName);
                } else {
                    AppMetrica.reportEvent(eventName, jSONObject2.toString());
                }
                return Unit.f19194a;
            case 14:
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    e0.b(new androidx.transition.i((sc.h) this.f9969e, (String) this.f9967c, (ha.d) this.f9968d, 14));
                } catch (Exception ex2) {
                    Intrinsics.checkNotNullParameter(ex2, "ex");
                    jg.d dVar4 = MyApp.f6830c;
                    lg.e eVar6 = m0.f9201a;
                    c0.t(dVar4, lg.d.f20063c, null, new q4.r(ex2, r82, i11), 2);
                }
                return Unit.f19194a;
            case 15:
                ListSubsFragment listSubsFragment = (ListSubsFragment) this.f9968d;
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                Typeface typeface = (Typeface) this.f9969e;
                if (typeface != null) {
                    ec.d dVar5 = (ec.d) listSubsFragment.f22459a;
                    if (dVar5 != null && (textView33 = dVar5.f8895b) != null) {
                        textView33.setTypeface(typeface);
                    }
                    ec.d dVar6 = (ec.d) listSubsFragment.f22459a;
                    if (dVar6 != null && (textView32 = dVar6.K) != null) {
                        textView32.setTypeface(typeface);
                    }
                    ec.d dVar7 = (ec.d) listSubsFragment.f22459a;
                    if (dVar7 != null && (textView31 = dVar7.I) != null) {
                        textView31.setTypeface(typeface);
                    }
                    ec.d dVar8 = (ec.d) listSubsFragment.f22459a;
                    if (dVar8 != null && (textView30 = dVar8.X) != null) {
                        textView30.setTypeface(typeface);
                    }
                    ec.d dVar9 = (ec.d) listSubsFragment.f22459a;
                    if (dVar9 != null && (textView29 = dVar9.E) != null) {
                        textView29.setTypeface(typeface);
                    }
                    ec.d dVar10 = (ec.d) listSubsFragment.f22459a;
                    if (dVar10 != null && (textView28 = dVar10.D) != null) {
                        textView28.setTypeface(typeface);
                    }
                    ec.d dVar11 = (ec.d) listSubsFragment.f22459a;
                    if (dVar11 != null && (textView27 = dVar11.G) != null) {
                        textView27.setTypeface(typeface);
                    }
                    ec.d dVar12 = (ec.d) listSubsFragment.f22459a;
                    if (dVar12 != null && (textView26 = dVar12.A) != null) {
                        textView26.setTypeface(typeface);
                    }
                    ec.d dVar13 = (ec.d) listSubsFragment.f22459a;
                    if (dVar13 != null && (textView25 = dVar13.f8917z) != null) {
                        textView25.setTypeface(typeface);
                    }
                    ec.d dVar14 = (ec.d) listSubsFragment.f22459a;
                    if (dVar14 != null && (textView24 = dVar14.C) != null) {
                        textView24.setTypeface(typeface);
                    }
                    ec.d dVar15 = (ec.d) listSubsFragment.f22459a;
                    if (dVar15 != null && (textView23 = dVar15.f8908p) != null) {
                        textView23.setTypeface(typeface);
                    }
                    ec.d dVar16 = (ec.d) listSubsFragment.f22459a;
                    if (dVar16 != null && (textView22 = dVar16.f8905m) != null) {
                        textView22.setTypeface(typeface);
                    }
                    ec.d dVar17 = (ec.d) listSubsFragment.f22459a;
                    if (dVar17 != null && (textView21 = dVar17.f8903k) != null) {
                        textView21.setTypeface(typeface);
                    }
                    ec.d dVar18 = (ec.d) listSubsFragment.f22459a;
                    if (dVar18 != null && (textView20 = dVar18.f8907o) != null) {
                        textView20.setTypeface(typeface);
                    }
                    ec.d dVar19 = (ec.d) listSubsFragment.f22459a;
                    if (dVar19 != null && (textView19 = dVar19.f8902i) != null) {
                        textView19.setTypeface(typeface);
                    }
                    ec.d dVar20 = (ec.d) listSubsFragment.f22459a;
                    if (dVar20 != null && (textView18 = dVar20.f8899f) != null) {
                        textView18.setTypeface(typeface);
                    }
                    ec.d dVar21 = (ec.d) listSubsFragment.f22459a;
                    if (dVar21 != null && (textView17 = dVar21.f8897d) != null) {
                        textView17.setTypeface(typeface);
                    }
                    ec.d dVar23 = (ec.d) listSubsFragment.f22459a;
                    if (dVar23 != null && (textView16 = dVar23.f8901h) != null) {
                        textView16.setTypeface(typeface);
                    }
                }
                Typeface typeface2 = (Typeface) this.f9967c;
                if (typeface2 == null) {
                    return null;
                }
                ec.d dVar24 = (ec.d) listSubsFragment.f22459a;
                if (dVar24 != null && (textView15 = dVar24.H) != null) {
                    textView15.setTypeface(typeface2);
                }
                ec.d dVar25 = (ec.d) listSubsFragment.f22459a;
                if (dVar25 != null && (textView14 = dVar25.L) != null) {
                    textView14.setTypeface(typeface2);
                }
                ec.d dVar26 = (ec.d) listSubsFragment.f22459a;
                if (dVar26 != null && (textView13 = dVar26.f8912u) != null) {
                    textView13.setTypeface(typeface2);
                }
                ec.d dVar27 = (ec.d) listSubsFragment.f22459a;
                if (dVar27 != null && (textView12 = dVar27.f8916y) != null) {
                    textView12.setTypeface(typeface2);
                }
                ec.d dVar28 = (ec.d) listSubsFragment.f22459a;
                if (dVar28 != null && (textView11 = dVar28.F) != null) {
                    textView11.setTypeface(typeface2);
                }
                ec.d dVar29 = (ec.d) listSubsFragment.f22459a;
                if (dVar29 != null && (textView10 = dVar29.f8911t) != null) {
                    textView10.setTypeface(typeface2);
                }
                ec.d dVar30 = (ec.d) listSubsFragment.f22459a;
                if (dVar30 != null && (textView9 = dVar30.f8913v) != null) {
                    textView9.setTypeface(typeface2);
                }
                ec.d dVar31 = (ec.d) listSubsFragment.f22459a;
                if (dVar31 != null && (textView8 = dVar31.B) != null) {
                    textView8.setTypeface(typeface2);
                }
                ec.d dVar32 = (ec.d) listSubsFragment.f22459a;
                if (dVar32 != null && (textView7 = dVar32.f8910s) != null) {
                    textView7.setTypeface(typeface2);
                }
                ec.d dVar33 = (ec.d) listSubsFragment.f22459a;
                if (dVar33 != null && (textView6 = dVar33.j) != null) {
                    textView6.setTypeface(typeface2);
                }
                ec.d dVar34 = (ec.d) listSubsFragment.f22459a;
                if (dVar34 != null && (textView5 = dVar34.f8906n) != null) {
                    textView5.setTypeface(typeface2);
                }
                ec.d dVar35 = (ec.d) listSubsFragment.f22459a;
                if (dVar35 != null && (textView4 = dVar35.f8909r) != null) {
                    textView4.setTypeface(typeface2);
                }
                ec.d dVar36 = (ec.d) listSubsFragment.f22459a;
                if (dVar36 != null && (textView3 = dVar36.f8896c) != null) {
                    textView3.setTypeface(typeface2);
                }
                ec.d dVar37 = (ec.d) listSubsFragment.f22459a;
                if (dVar37 != null && (textView2 = dVar37.f8900g) != null) {
                    textView2.setTypeface(typeface2);
                }
                ec.d dVar38 = (ec.d) listSubsFragment.f22459a;
                if (dVar38 != null && (textView = dVar38.q) != null) {
                    textView.setTypeface(typeface2);
                }
                return Unit.f19194a;
            case 16:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                ViewCloudFragment viewCloudFragment = (ViewCloudFragment) this.f9969e;
                String token = (String) this.f9967c;
                int i12 = viewCloudFragment.f7064b;
                Map map = (Map) this.f9968d;
                Intrinsics.checkNotNullParameter(token, "token");
                HashMap hashMap = new HashMap();
                hashMap.put(AccountTable.tokenColumn, token);
                if (i12 > 0) {
                    hashMap.put("announcementId", String.valueOf(i12));
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return hashMap;
            case 17:
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                v vVar3 = (v) this.f9969e;
                return new Pair(vVar3.f25207i.c((ic.a) this.f9967c, false), vVar3.f25207i.c((ic.a) this.f9968d, false));
            default:
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    Intrinsics.checkNotNull(d4.d().s((Throwable) this.f9969e, new com.google.firebase.messaging.g(26, (io.sentry.e) this.f9968d, (String) this.f9967c)));
                } catch (Exception unused3) {
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9966b = i5;
        this.f9969e = obj;
        this.f9967c = obj2;
        this.f9968d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9966b = i5;
        this.f9967c = obj;
        this.f9968d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, File file, String str2, Continuation continuation) {
        super(2, continuation);
        this.f9966b = 10;
        this.f9967c = str;
        this.f9969e = file;
        this.f9968d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9966b = i5;
        this.f9967c = str;
        this.f9968d = str2;
        this.f9969e = obj;
    }
}
