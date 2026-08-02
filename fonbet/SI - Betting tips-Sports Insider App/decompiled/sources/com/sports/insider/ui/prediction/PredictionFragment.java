package com.sports.insider.ui.prediction;

import ag.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.n0;
import androidx.lifecycle.q0;
import androidx.lifecycle.u0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.i;
import c4.o;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.button.MaterialButton;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.views.AnalyticsBackground;
import com.sports.insider.ui.views.AnalyticsShortView;
import com.sports.insider.ui.views.AnalyticsView;
import com.sports.insider.ui.views.DiagramSection;
import com.sports.insider.ui.views.FrameGradientWithHead;
import com.sports.insider.ui.views.HeadToHeadLabelView;
import com.sports.insider.ui.views.LastGamesNameLabel;
import com.sports.insider.ui.views.MeetingGameView;
import com.sports.insider.ui.views.PredictionCard;
import com.sports.insider.ui.views.PredictionGradientView;
import com.sports.insider.ui.views.PredictionLabelView;
import com.sports.insider.ui.views.PremiumGradientView;
import com.sports.insider.ui.views.ResponsibleGamingBtn;
import com.sports.insider.ui.views.ShadowLayoutSimple;
import com.sports.insider.ui.views.StateGameView;
import com.sports.insider.ui.views.TelegramBannerView;
import e.d0;
import ec.x;
import eg.c0;
import eg.m0;
import eg.t1;
import ge.d;
import gf.k;
import gf.t;
import id.r;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import m2.f0;
import me.a;
import me.a0;
import me.b0;
import me.j;
import me.l;
import me.s;
import pe.g;
import rd.b;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/prediction/PredictionFragment;", "Lrd/b;", "Lec/x;", "Lpe/g;", "Landroidx/swiperefreshlayout/widget/i;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionFragment.kt\ncom/sports/insider/ui/prediction/PredictionFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 5 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n+ 6 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n*L\n1#1,1120:1\n42#2,3:1121\n1#3:1124\n35#4,3:1125\n17#4:1128\n38#4,6:1129\n44#4,2:1136\n52#4,2:1138\n52#4,2:1140\n52#4,2:1142\n17#4:1153\n17#4:1163\n17#4:1169\n17#4:1175\n17#4:1181\n35#4,3:1182\n17#4:1185\n40#4,6:1186\n35#4,3:1192\n17#4:1195\n38#4,6:1196\n44#4,2:1203\n35#4,3:1205\n17#4:1208\n38#4,6:1209\n44#4,2:1216\n35#4,3:1218\n17#4:1221\n38#4,6:1222\n44#4,2:1229\n38#5:1135\n38#5:1202\n38#5:1215\n38#5:1228\n410#6,9:1144\n410#6,9:1154\n414#6,5:1164\n414#6,5:1170\n414#6,5:1176\n*S KotlinDebug\n*F\n+ 1 PredictionFragment.kt\ncom/sports/insider/ui/prediction/PredictionFragment\n*L\n65#1:1121,3\n307#1:1125,3\n307#1:1128\n307#1:1129,6\n307#1:1136,2\n580#1:1138,2\n583#1:1140,2\n584#1:1142,2\n909#1:1153\n925#1:1163\n996#1:1169\n1012#1:1175\n1028#1:1181\n137#1:1182,3\n137#1:1185\n137#1:1186,6\n195#1:1192,3\n195#1:1195\n195#1:1196,6\n195#1:1203,2\n196#1:1205,3\n196#1:1208\n196#1:1209,6\n196#1:1216,2\n250#1:1218,3\n250#1:1221\n250#1:1222,6\n250#1:1229,2\n307#1:1135\n195#1:1202\n196#1:1215\n250#1:1228\n904#1:1144,9\n920#1:1154,9\n991#1:1164,5\n1007#1:1170,5\n1023#1:1176,5\n*E\n"})
/* loaded from: classes.dex */
public class PredictionFragment extends b<x> implements g, i, ViewTreeObserver.OnScrollChangedListener {
    public final j A;
    public final j B;
    public final j C;
    public final j D;
    public final j E;

    /* renamed from: d, reason: collision with root package name */
    public final j f6989d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6990e;

    /* renamed from: f, reason: collision with root package name */
    public final j f6991f;

    /* renamed from: g, reason: collision with root package name */
    public final j f6992g;

    /* renamed from: h, reason: collision with root package name */
    public final j f6993h;

    /* renamed from: i, reason: collision with root package name */
    public final j f6994i;

    /* renamed from: k, reason: collision with root package name */
    public final j f6995k;

    /* renamed from: l, reason: collision with root package name */
    public final j f6996l;

    /* renamed from: m, reason: collision with root package name */
    public final j f6997m;

    /* renamed from: n, reason: collision with root package name */
    public final j f6998n;

    /* renamed from: o, reason: collision with root package name */
    public final j f6999o;

    /* renamed from: p, reason: collision with root package name */
    public final j f7000p;
    public final j q;

    /* renamed from: r, reason: collision with root package name */
    public final j f7001r;

    /* renamed from: s, reason: collision with root package name */
    public final j f7002s;

    /* renamed from: t, reason: collision with root package name */
    public final j f7003t;

    /* renamed from: u, reason: collision with root package name */
    public final j f7004u;

    /* renamed from: z, reason: collision with root package name */
    public final j f7009z;

    /* renamed from: c, reason: collision with root package name */
    public final t f6988c = k.b(new a(1, this));
    public final m j = new m(1);

    /* renamed from: v, reason: collision with root package name */
    public final d f7005v = new d(this, 9);

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7006w = true;

    /* renamed from: x, reason: collision with root package name */
    public int f7007x = 20;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f7008y = new Rect();

    /* JADX WARN: Type inference failed for: r0v10, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v11, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v12, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v13, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v14, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v15, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v16, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v17, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v18, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v19, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v2, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v24, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v25, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v26, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v27, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v28, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v29, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v3, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v4, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v5, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v6, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v7, types: [me.j] */
    /* JADX WARN: Type inference failed for: r0v9, types: [me.j] */
    public PredictionFragment() {
        final int i5 = 6;
        this.f6989d = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i10 = i5;
                int i11 = 4;
                int i12 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i13 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i10) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i11), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i13), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i13));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i12));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i13);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i13, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i13 < 2) {
                                View view11 = view10[i13];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i13++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i14 = 0; i14 < 2; i14++) {
                                View view13 = view12[i14];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 12;
        this.f6990e = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i10;
                int i11 = 4;
                int i12 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i13 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i11), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i13), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i13));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i12));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i13);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i13, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i13 < 2) {
                                View view11 = view10[i13];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i13++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i14 = 0; i14 < 2; i14++) {
                                View view13 = view12[i14];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 13;
        this.f6991f = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i11;
                int i112 = 4;
                int i12 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i13 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i13), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i13));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i12));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i13);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i13, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i13 < 2) {
                                View view11 = view10[i13];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i13++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i14 = 0; i14 < 2; i14++) {
                                View view13 = view12[i14];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 14;
        this.f6992g = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i12;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i13 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i13), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i13));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i13);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i13, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i13 < 2) {
                                View view11 = view10[i13];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i13++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i14 = 0; i14 < 2; i14++) {
                                View view13 = view12[i14];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 15;
        this.f6993h = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i13;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i14 = 0; i14 < 2; i14++) {
                                View view13 = view12[i14];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 16;
        this.f6994i = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i14;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 17;
        this.f6995k = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i15;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 18;
        this.f6996l = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i16;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i17 = 19;
        this.f6997m = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i17;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i18 = 20;
        this.f6998n = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i18;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i19 = 21;
        this.f6999o = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i19;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i20 = 22;
        this.f7000p = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i20;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i21 = 0;
        this.q = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i21;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i22 = 1;
        this.f7001r = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i22;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i23 = 2;
        this.f7002s = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i23;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i24 = 3;
        this.f7003t = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i24;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i25 = 4;
        this.f7004u = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i25;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i26 = 5;
        this.f7009z = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i26;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i27 = 7;
        this.A = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i27;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i28 = 8;
        this.B = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i28;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i29 = 9;
        this.C = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i29;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i30 = 10;
        this.D = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i30;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
        final int i31 = 11;
        this.E = new q0(this) { // from class: me.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PredictionFragment f20655b;

            {
                this.f20655b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.x xVar;
                ec.x xVar2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                ec.x xVar3;
                String str7;
                ec.x xVar4;
                CharSequence charSequence;
                CharSequence charSequence2;
                int i102 = i31;
                int i112 = 4;
                int i122 = 2;
                str = "";
                boolean z5 = true;
                z5 = true;
                int i132 = 0;
                PredictionFragment predictionFragment = this.f20655b;
                switch (i102) {
                    case 0:
                        String str8 = (String) obj;
                        ec.x xVar5 = (ec.x) predictionFragment.f22459a;
                        if (xVar5 != null) {
                            xVar5.f9062y.setLeagueName(str8 != null ? str8 : "");
                            break;
                        }
                        break;
                    case 1:
                        String str9 = (String) obj;
                        if (str9 != null && (xVar = (ec.x) predictionFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = xVar.f9060w;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str9;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                    case 2:
                        String str10 = (String) obj;
                        ec.x xVar6 = (ec.x) predictionFragment.f22459a;
                        if (xVar6 != null) {
                            xVar6.E.setStatusGame(str10);
                        }
                        if (!Intrinsics.areEqual("unknown", str10) && str10 != null) {
                            ec.x xVar7 = (ec.x) predictionFragment.f22459a;
                            if (xVar7 != null) {
                                xVar7.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.x xVar8 = (ec.x) predictionFragment.f22459a;
                            if (xVar8 != null) {
                                xVar8.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.x xVar9 = (ec.x) predictionFragment.f22459a;
                            if (xVar9 != null) {
                                xVar9.H.setText(predictionFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.x xVar10 = (ec.x) predictionFragment.f22459a;
                            if (xVar10 != null) {
                                xVar10.f9044e.setText(predictionFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 3:
                        String str11 = (String) obj;
                        ec.x xVar11 = (ec.x) predictionFragment.f22459a;
                        if (xVar11 != null) {
                            xVar11.f9062y.setStartDateTime(str11 != null ? str11 : "");
                            break;
                        }
                        break;
                    case 4:
                        Long l6 = (Long) obj;
                        ec.x xVar12 = (ec.x) predictionFragment.f22459a;
                        if (xVar12 != null) {
                            PredictionCard predictionCard = xVar12.f9062y;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (longValue > 0) {
                                predictionCard.g(longValue);
                            } else {
                                predictionCard.g(0L);
                            }
                            predictionCard.invalidate();
                            break;
                        }
                        break;
                    case 5:
                        Set set = (Set) obj;
                        if (set != null && !set.isEmpty()) {
                            androidx.lifecycle.z g10 = d1.g(predictionFragment);
                            lg.e eVar2 = m0.f9201a;
                            eg.c0.t(g10, jg.q.f18523a, null, new m2.f0(predictionFragment, set, r9, i112), 2);
                            break;
                        }
                        break;
                    case 6:
                        Integer num = (Integer) obj;
                        pd.x G = predictionFragment.G();
                        predictionFragment.P().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 7:
                        eg.c0.t(d1.g(predictionFragment), null, null, new kd.e(predictionFragment, (List) obj, r9, 27), 3);
                        break;
                    case 8:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, z5 ? 1 : 0), 3);
                        break;
                    case 9:
                        eg.c0.t(d1.g(predictionFragment), null, null, new q(predictionFragment, (nc.c) obj, r9, i132), 3);
                        break;
                    case 10:
                        gf.u uVar = (gf.u) obj;
                        if (uVar == null) {
                            ec.x xVar13 = (ec.x) predictionFragment.f22459a;
                            if (xVar13 != null) {
                                xVar13.X.setText("");
                            }
                            ec.x xVar14 = (ec.x) predictionFragment.f22459a;
                            if (xVar14 != null) {
                                xVar14.f9056s.setText("");
                            }
                            ec.x xVar15 = (ec.x) predictionFragment.f22459a;
                            if (xVar15 != null) {
                                xVar15.j.setText("");
                            }
                            ec.x xVar16 = (ec.x) predictionFragment.f22459a;
                            if (xVar16 != null) {
                                xVar16.f9047h.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue = ((Number) uVar.f10039a).intValue();
                            int intValue2 = ((Number) uVar.f10040b).intValue();
                            int intValue3 = ((Number) uVar.f10041c).intValue();
                            ec.x xVar17 = (ec.x) predictionFragment.f22459a;
                            if (xVar17 != null) {
                                xVar17.X.setText(String.valueOf(intValue));
                            }
                            ec.x xVar18 = (ec.x) predictionFragment.f22459a;
                            if (xVar18 != null) {
                                xVar18.f9056s.setText(String.valueOf(intValue2));
                            }
                            ec.x xVar19 = (ec.x) predictionFragment.f22459a;
                            if (xVar19 != null) {
                                xVar19.j.setText(String.valueOf(intValue3));
                            }
                            ec.x xVar20 = (ec.x) predictionFragment.f22459a;
                            if (xVar20 != null) {
                                xVar20.f9047h.a(intValue, intValue2, intValue3);
                                break;
                            }
                        }
                        break;
                    case 11:
                        gf.u uVar2 = (gf.u) obj;
                        if (uVar2 == null) {
                            ec.x xVar21 = (ec.x) predictionFragment.f22459a;
                            if (xVar21 != null) {
                                xVar21.Y.setText("");
                            }
                            ec.x xVar22 = (ec.x) predictionFragment.f22459a;
                            if (xVar22 != null) {
                                xVar22.f9057t.setText("");
                            }
                            ec.x xVar23 = (ec.x) predictionFragment.f22459a;
                            if (xVar23 != null) {
                                xVar23.f9049k.setText("");
                            }
                            ec.x xVar24 = (ec.x) predictionFragment.f22459a;
                            if (xVar24 != null) {
                                xVar24.f9048i.a(0, 0, 0);
                                break;
                            }
                        } else {
                            int intValue4 = ((Number) uVar2.f10039a).intValue();
                            int intValue5 = ((Number) uVar2.f10040b).intValue();
                            int intValue6 = ((Number) uVar2.f10041c).intValue();
                            ec.x xVar25 = (ec.x) predictionFragment.f22459a;
                            if (xVar25 != null) {
                                xVar25.Y.setText(String.valueOf(intValue4));
                            }
                            ec.x xVar26 = (ec.x) predictionFragment.f22459a;
                            if (xVar26 != null) {
                                xVar26.f9057t.setText(String.valueOf(intValue5));
                            }
                            ec.x xVar27 = (ec.x) predictionFragment.f22459a;
                            if (xVar27 != null) {
                                xVar27.f9049k.setText(String.valueOf(intValue6));
                            }
                            ec.x xVar28 = (ec.x) predictionFragment.f22459a;
                            if (xVar28 != null) {
                                xVar28.f9048i.a(intValue4, intValue5, intValue6);
                                break;
                            }
                        }
                        break;
                    case 12:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.x xVar29 = (ec.x) predictionFragment.f22459a;
                            if (xVar29 != null) {
                                TelegramBannerView view = xVar29.G;
                                view.setVisibility(0);
                                Intrinsics.checkNotNullParameter(view, "view");
                                int widthSizeFt = view.getWidthSizeFt();
                                int heightSizeFt = view.getHeightSizeFt();
                                int widthSizeTg = view.getWidthSizeTg();
                                int heightSizeTg = view.getHeightSizeTg();
                                int widthSizeSi = view.getWidthSizeSi();
                                int heightSizeSi = view.getHeightSizeSi();
                                if (widthSizeTg <= 10 || heightSizeTg <= 10 || widthSizeSi <= 10 || heightSizeSi <= 10 || widthSizeFt <= 10 || heightSizeFt <= 10) {
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i132));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, z5 ? 1 : 0));
                                    view.addOnLayoutChangeListener(new k(predictionFragment, i122));
                                    break;
                                } else {
                                    Context context = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    predictionFragment.W(context, widthSizeTg, heightSizeTg);
                                    Context context2 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                    predictionFragment.V(context2, widthSizeSi, heightSizeSi);
                                    Context context3 = view.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                                    predictionFragment.N(context3, widthSizeFt, heightSizeFt);
                                    break;
                                }
                            }
                        } else {
                            ec.x xVar30 = (ec.x) predictionFragment.f22459a;
                            if (xVar30 != null) {
                                xVar30.G.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 13:
                        Pair pair = (Pair) obj;
                        ec.x xVar31 = (ec.x) predictionFragment.f22459a;
                        if (xVar31 != null) {
                            RelativeLayout relativeLayout = xVar31.A;
                            if ((pair != null ? (String) pair.f19193b : null) == null) {
                                if ((pair != null ? (String) pair.f19192a : null) == null) {
                                    View[] view2 = {relativeLayout};
                                    Intrinsics.checkNotNullParameter(view2, "view");
                                    View view3 = view2[0];
                                    if (view3 != null) {
                                        view3.setVisibility(4);
                                        break;
                                    }
                                }
                            }
                            View[] view4 = {relativeLayout};
                            Intrinsics.checkNotNullParameter(view4, "view");
                            View view5 = view4[0];
                            if (view5 != null) {
                                view5.setVisibility(0);
                            }
                            eg.c0.t(d1.g(predictionFragment), null, null, new u0(xVar31, pair, r9, r6), 3);
                            TextView textView = xVar31.J;
                            String str12 = (String) pair.f19192a;
                            if (str12 == null) {
                                str12 = "-";
                            }
                            textView.setText(str12);
                            break;
                        }
                        break;
                    case 14:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (predictionFragment.isAdded() && (xVar2 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar2.F.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 15:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.x xVar32 = (ec.x) predictionFragment.f22459a;
                        if (xVar32 != null) {
                            xVar32.D.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            predictionFragment.L();
                            break;
                        }
                        break;
                    case 16:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        ec.x xVar33 = (ec.x) predictionFragment.f22459a;
                        if (xVar33 != null) {
                            xVar33.f9041b.setVisibility(booleanValue3 ? 0 : 8);
                            break;
                        }
                        break;
                    case 17:
                        String str13 = (String) obj;
                        ec.x xVar34 = (ec.x) predictionFragment.f22459a;
                        if (xVar34 != null) {
                            AppCompatImageView appCompatImageView2 = xVar34.f9053o;
                            c4.o a10 = c4.y.a(appCompatImageView2.getContext());
                            q4.e eVar3 = new q4.e(appCompatImageView2.getContext());
                            eVar3.f21940c = str13;
                            q4.j.d(eVar3, appCompatImageView2);
                            eVar3.f21942e = new n(predictionFragment, i132);
                            ((c4.v) a10).a(eVar3.a());
                            break;
                        }
                        break;
                    case 18:
                        Pair pair2 = (Pair) obj;
                        ec.x xVar35 = (ec.x) predictionFragment.f22459a;
                        if (xVar35 != null) {
                            PredictionCard predictionCard2 = xVar35.f9062y;
                            if (pair2 == null || (str2 = (String) pair2.f19192a) == null) {
                                str2 = "";
                            }
                            predictionCard2.setFirstTeamName(str2);
                            LastGamesNameLabel lastGamesNameLabel = xVar35.L;
                            if (pair2 == null || (str3 = (String) pair2.f19192a) == null) {
                                str3 = "";
                            }
                            lastGamesNameLabel.setName(str3);
                            if (pair2 == null || (str4 = (String) pair2.f19193b) == null) {
                                str4 = "";
                            }
                            predictionCard2.setSecondTeamName(str4);
                            LastGamesNameLabel lastGamesNameLabel2 = xVar35.K;
                            if (pair2 != null && (str5 = (String) pair2.f19193b) != null) {
                                str = str5;
                            }
                            lastGamesNameLabel2.setName(str);
                            break;
                        }
                        break;
                    case 19:
                        String str14 = (String) obj;
                        ec.x xVar36 = (ec.x) predictionFragment.f22459a;
                        if (xVar36 != null) {
                            xVar36.f9062y.setFirstTeamScore(str14 != null ? str14 : "");
                            break;
                        }
                        break;
                    case 20:
                        String str15 = (String) obj;
                        ec.x xVar37 = (ec.x) predictionFragment.f22459a;
                        if (xVar37 != null) {
                            xVar37.f9062y.setSecondTeamScore(str15 != null ? str15 : "");
                            break;
                        }
                        break;
                    case 21:
                        Pair pair3 = (Pair) obj;
                        ec.x xVar38 = (ec.x) predictionFragment.f22459a;
                        if (xVar38 != null) {
                            PredictionCard predictionCard3 = xVar38.f9062y;
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str16 = pair3 != null ? (String) pair3.f19192a : null;
                            int flagDefaultSize = predictionCard3.getFlagDefaultSize();
                            if (str16 == null || str16.length() == 0 || StringsKt.H(str16)) {
                                str16 = null;
                            }
                            if (flagDefaultSize > 10) {
                                Context context4 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                predictionFragment.R(context4, flagDefaultSize, str16);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, z5 ? 1 : 0, str16));
                            }
                            Intrinsics.checkNotNullExpressionValue(predictionCard3, "predictionCard");
                            String str17 = pair3 != null ? (String) pair3.f19193b : null;
                            int flagDefaultSize2 = predictionCard3.getFlagDefaultSize();
                            if (str17 == null || str17.length() == 0 || StringsKt.H(str17)) {
                                str17 = null;
                            }
                            if (flagDefaultSize2 > 10) {
                                Context context5 = predictionCard3.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                predictionFragment.Q(context5, flagDefaultSize2, str17);
                            } else {
                                predictionCard3.addOnLayoutChangeListener(new m(predictionFragment, i132, str17));
                            }
                            AppCompatImageView ivLogoCommandHomeCompare = xVar38.q;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
                            String str18 = pair3 != null ? (String) pair3.f19192a : null;
                            c4.o a11 = c4.y.a(ivLogoCommandHomeCompare.getContext());
                            q4.e eVar4 = new q4.e(ivLogoCommandHomeCompare.getContext());
                            eVar4.f21940c = str18;
                            q4.j.d(eVar4, ivLogoCommandHomeCompare);
                            ((c4.v) a11).a(eVar4.a());
                            AppCompatImageView ivLogoCommandGuestCompare = xVar38.f9054p;
                            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
                            r9 = pair3 != null ? (String) pair3.f19193b : null;
                            c4.o a12 = c4.y.a(ivLogoCommandGuestCompare.getContext());
                            q4.e eVar5 = new q4.e(ivLogoCommandGuestCompare.getContext());
                            eVar5.f21940c = r9;
                            q4.j.d(eVar5, ivLogoCommandGuestCompare);
                            ((c4.v) a12).a(eVar5.a());
                            break;
                        }
                        break;
                    default:
                        Pair pair4 = (Pair) obj;
                        String str19 = pair4 != null ? (String) pair4.f19193b : null;
                        boolean z7 = str19 == null || str19.length() == 0 || (charSequence2 = (CharSequence) pair4.f19193b) == null || StringsKt.H(charSequence2);
                        String str20 = pair4 != null ? (String) pair4.f19192a : null;
                        boolean z10 = str20 == null || str20.length() == 0 || (charSequence = (CharSequence) pair4.f19192a) == null || StringsKt.H(charSequence);
                        if (pair4 != null && (str7 = (String) pair4.f19193b) != null && (xVar4 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar4.f9042c.setText(str7);
                        }
                        if (pair4 != null && (str6 = (String) pair4.f19192a) != null && (xVar3 = (ec.x) predictionFragment.f22459a) != null) {
                            xVar3.f9043d.setText(str6);
                        }
                        if (z7) {
                            ec.x xVar39 = (ec.x) predictionFragment.f22459a;
                            View[] view6 = {xVar39 != null ? xVar39.f9042c : null};
                            Intrinsics.checkNotNullParameter(view6, "view");
                            View view7 = view6[0];
                            if (view7 != null) {
                                view7.setVisibility(8);
                            }
                        } else {
                            ec.x xVar40 = (ec.x) predictionFragment.f22459a;
                            View[] view8 = {xVar40 != null ? xVar40.f9042c : null};
                            Intrinsics.checkNotNullParameter(view8, "view");
                            View view9 = view8[0];
                            if (view9 != null) {
                                view9.setVisibility(0);
                            }
                        }
                        if (z10) {
                            ec.x xVar41 = (ec.x) predictionFragment.f22459a;
                            View[] view10 = {xVar41 != null ? xVar41.f9055r : null, xVar41 != null ? xVar41.C : null};
                            Intrinsics.checkNotNullParameter(view10, "view");
                            while (i132 < 2) {
                                View view11 = view10[i132];
                                if (view11 != null) {
                                    view11.setVisibility(8);
                                }
                                i132++;
                            }
                            break;
                        } else {
                            ec.x xVar42 = (ec.x) predictionFragment.f22459a;
                            View[] view12 = {xVar42 != null ? xVar42.f9055r : null, xVar42 != null ? xVar42.C : null};
                            Intrinsics.checkNotNullParameter(view12, "view");
                            for (int i142 = 0; i142 < 2; i142++) {
                                View view13 = view12[i142];
                                if (view13 != null) {
                                    view13.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static final Object H(PredictionFragment predictionFragment, List list, mf.i iVar) {
        e eVar = m0.f9201a;
        return c0.A(lg.d.f20063c, new r(list, null, 8), iVar);
    }

    public static final void I(PredictionFragment predictionFragment, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        x xVar = (x) predictionFragment.f22459a;
        if (xVar != null) {
            xVar.G.setBitmapFt(bitmap);
        }
    }

    public static final void J(PredictionFragment predictionFragment, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        x xVar = (x) predictionFragment.f22459a;
        if (xVar != null) {
            xVar.G.setBitmapSi(bitmap);
        }
    }

    public static final void K(PredictionFragment predictionFragment, c4.m mVar) {
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        x xVar = (x) predictionFragment.f22459a;
        if (xVar != null) {
            xVar.G.setBitmapTg(bitmap);
        }
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.prediction_fragment, viewGroup, false);
        int i5 = R.id.analytic_banner;
        FrameLayout frameLayout = (FrameLayout) y3.j(R.id.analytic_banner, inflate);
        if (frameLayout != null) {
            i5 = R.id.analytics;
            AnalyticsView analyticsView = (AnalyticsView) y3.j(R.id.analytics, inflate);
            if (analyticsView != null) {
                i5 = R.id.analyticsShort;
                AnalyticsShortView analyticsShortView = (AnalyticsShortView) y3.j(R.id.analyticsShort, inflate);
                if (analyticsShortView != null) {
                    i5 = R.id.btnBanner;
                    MaterialButton materialButton = (MaterialButton) y3.j(R.id.btnBanner, inflate);
                    if (materialButton != null) {
                        i5 = R.id.comparisonLastGuestGameView;
                        MeetingGameView meetingGameView = (MeetingGameView) y3.j(R.id.comparisonLastGuestGameView, inflate);
                        if (meetingGameView != null) {
                            i5 = R.id.comparisonLastHomeGameView;
                            MeetingGameView meetingGameView2 = (MeetingGameView) y3.j(R.id.comparisonLastHomeGameView, inflate);
                            if (meetingGameView2 != null) {
                                i5 = R.id.diagram1;
                                DiagramSection diagramSection = (DiagramSection) y3.j(R.id.diagram1, inflate);
                                if (diagramSection != null) {
                                    i5 = R.id.diagram2;
                                    DiagramSection diagramSection2 = (DiagramSection) y3.j(R.id.diagram2, inflate);
                                    if (diagramSection2 != null) {
                                        i5 = R.id.draw1;
                                        TextView textView = (TextView) y3.j(R.id.draw1, inflate);
                                        if (textView != null) {
                                            i5 = R.id.draw2;
                                            TextView textView2 = (TextView) y3.j(R.id.draw2, inflate);
                                            if (textView2 != null) {
                                                i5 = R.id.foreCast;
                                                LinearLayout linearLayout = (LinearLayout) y3.j(R.id.foreCast, inflate);
                                                if (linearLayout != null) {
                                                    i5 = R.id.frame_status_banner;
                                                    FrameGradientWithHead frameGradientWithHead = (FrameGradientWithHead) y3.j(R.id.frame_status_banner, inflate);
                                                    if (frameGradientWithHead != null) {
                                                        i5 = R.id.headToHeadLabel;
                                                        HeadToHeadLabelView headToHeadLabelView = (HeadToHeadLabelView) y3.j(R.id.headToHeadLabel, inflate);
                                                        if (headToHeadLabelView != null) {
                                                            i5 = R.id.image_analytic_banner;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.image_analytic_banner, inflate);
                                                            if (appCompatImageView != null) {
                                                                i5 = R.id.image_status_banner;
                                                                if (((AppCompatImageView) y3.j(R.id.image_status_banner, inflate)) != null) {
                                                                    i5 = R.id.iv_logoCommandGuest_compare;
                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.iv_logoCommandGuest_compare, inflate);
                                                                    if (appCompatImageView2 != null) {
                                                                        i5 = R.id.iv_logoCommandHome_compare;
                                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) y3.j(R.id.iv_logoCommandHome_compare, inflate);
                                                                        if (appCompatImageView3 != null) {
                                                                            i5 = R.id.labelPrediction;
                                                                            PredictionLabelView predictionLabelView = (PredictionLabelView) y3.j(R.id.labelPrediction, inflate);
                                                                            if (predictionLabelView != null) {
                                                                                i5 = R.id.loss1;
                                                                                TextView textView3 = (TextView) y3.j(R.id.loss1, inflate);
                                                                                if (textView3 != null) {
                                                                                    i5 = R.id.loss2;
                                                                                    TextView textView4 = (TextView) y3.j(R.id.loss2, inflate);
                                                                                    if (textView4 != null) {
                                                                                        i5 = R.id.matchGradientFree;
                                                                                        PredictionGradientView predictionGradientView = (PredictionGradientView) y3.j(R.id.matchGradientFree, inflate);
                                                                                        if (predictionGradientView != null) {
                                                                                            i5 = R.id.matchGradientPremium;
                                                                                            PremiumGradientView premiumGradientView = (PremiumGradientView) y3.j(R.id.matchGradientPremium, inflate);
                                                                                            if (premiumGradientView != null) {
                                                                                                i5 = R.id.match_image;
                                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) y3.j(R.id.match_image, inflate);
                                                                                                if (appCompatImageView4 != null) {
                                                                                                    i5 = R.id.meetingGameView;
                                                                                                    MeetingGameView meetingGameView3 = (MeetingGameView) y3.j(R.id.meetingGameView, inflate);
                                                                                                    if (meetingGameView3 != null) {
                                                                                                        i5 = R.id.own0;
                                                                                                        if (((TextView) y3.j(R.id.own0, inflate)) != null) {
                                                                                                            i5 = R.id.predictionCard;
                                                                                                            PredictionCard predictionCard = (PredictionCard) y3.j(R.id.predictionCard, inflate);
                                                                                                            if (predictionCard != null) {
                                                                                                                i5 = R.id.prediction_linear;
                                                                                                                if (((LinearLayout) y3.j(R.id.prediction_linear, inflate)) != null) {
                                                                                                                    i5 = R.id.responsibleGamingBtn;
                                                                                                                    ResponsibleGamingBtn responsibleGamingBtn = (ResponsibleGamingBtn) y3.j(R.id.responsibleGamingBtn, inflate);
                                                                                                                    if (responsibleGamingBtn != null) {
                                                                                                                        i5 = R.id.rootAnalytics;
                                                                                                                        if (((AnalyticsBackground) y3.j(R.id.rootAnalytics, inflate)) != null) {
                                                                                                                            i5 = R.id.root_comparison;
                                                                                                                            if (((LinearLayout) y3.j(R.id.root_comparison, inflate)) != null) {
                                                                                                                                i5 = R.id.root_forecast_0;
                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) y3.j(R.id.root_forecast_0, inflate);
                                                                                                                                if (relativeLayout != null) {
                                                                                                                                    i5 = R.id.root_scope;
                                                                                                                                    if (((LinearLayout) y3.j(R.id.root_scope, inflate)) != null) {
                                                                                                                                        i5 = R.id.root_scroll;
                                                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) y3.j(R.id.root_scroll, inflate);
                                                                                                                                        if (nestedScrollView != null) {
                                                                                                                                            i5 = R.id.shadowLayoutAnalyticsShort;
                                                                                                                                            ShadowLayoutSimple shadowLayoutSimple = (ShadowLayoutSimple) y3.j(R.id.shadowLayoutAnalyticsShort, inflate);
                                                                                                                                            if (shadowLayoutSimple != null) {
                                                                                                                                                i5 = R.id.status_banner;
                                                                                                                                                FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.status_banner, inflate);
                                                                                                                                                if (frameLayout2 != null) {
                                                                                                                                                    i5 = R.id.statusGamePrediction;
                                                                                                                                                    StateGameView stateGameView = (StateGameView) y3.j(R.id.statusGamePrediction, inflate);
                                                                                                                                                    if (stateGameView != null) {
                                                                                                                                                        i5 = R.id.swipeRefreshLayout;
                                                                                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) y3.j(R.id.swipeRefreshLayout, inflate);
                                                                                                                                                        if (swipeRefreshLayout != null) {
                                                                                                                                                            i5 = R.id.telegramBannerView;
                                                                                                                                                            TelegramBannerView telegramBannerView = (TelegramBannerView) y3.j(R.id.telegramBannerView, inflate);
                                                                                                                                                            if (telegramBannerView != null) {
                                                                                                                                                                i5 = R.id.textBanner;
                                                                                                                                                                TextView textView5 = (TextView) y3.j(R.id.textBanner, inflate);
                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                    i5 = R.id.titleBanner;
                                                                                                                                                                    if (((TextView) y3.j(R.id.titleBanner, inflate)) != null) {
                                                                                                                                                                        i5 = R.id.today_prediction_card;
                                                                                                                                                                        if (((FrameLayout) y3.j(R.id.today_prediction_card, inflate)) != null) {
                                                                                                                                                                            i5 = R.id.tv_coefficient_0;
                                                                                                                                                                            TextView textView6 = (TextView) y3.j(R.id.tv_coefficient_0, inflate);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                i5 = R.id.tv_forecast_0;
                                                                                                                                                                                TextView textView7 = (TextView) y3.j(R.id.tv_forecast_0, inflate);
                                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                                    i5 = R.id.tvNameCommandGuestCompare;
                                                                                                                                                                                    LastGamesNameLabel lastGamesNameLabel = (LastGamesNameLabel) y3.j(R.id.tvNameCommandGuestCompare, inflate);
                                                                                                                                                                                    if (lastGamesNameLabel != null) {
                                                                                                                                                                                        i5 = R.id.tvNameCommandHomeCompare;
                                                                                                                                                                                        LastGamesNameLabel lastGamesNameLabel2 = (LastGamesNameLabel) y3.j(R.id.tvNameCommandHomeCompare, inflate);
                                                                                                                                                                                        if (lastGamesNameLabel2 != null) {
                                                                                                                                                                                            i5 = R.id.win1;
                                                                                                                                                                                            TextView textView8 = (TextView) y3.j(R.id.win1, inflate);
                                                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                                                i5 = R.id.win2;
                                                                                                                                                                                                TextView textView9 = (TextView) y3.j(R.id.win2, inflate);
                                                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                                                    x xVar = new x((FrameLayout) inflate, frameLayout, analyticsView, analyticsShortView, materialButton, meetingGameView, meetingGameView2, diagramSection, diagramSection2, textView, textView2, linearLayout, frameGradientWithHead, headToHeadLabelView, appCompatImageView, appCompatImageView2, appCompatImageView3, predictionLabelView, textView3, textView4, predictionGradientView, premiumGradientView, appCompatImageView4, meetingGameView3, predictionCard, responsibleGamingBtn, relativeLayout, nestedScrollView, shadowLayoutSimple, frameLayout2, stateGameView, swipeRefreshLayout, telegramBannerView, textView5, textView6, textView7, lastGamesNameLabel, lastGamesNameLabel2, textView8, textView9);
                                                                                                                                                                                                    Intrinsics.checkNotNullExpressionValue(xVar, "inflate(...)");
                                                                                                                                                                                                    return xVar;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final void L() {
        x xVar = (x) this.f22459a;
        if (xVar != null) {
            NestedScrollView nestedScrollView = xVar.B;
            Rect rect = this.f7008y;
            nestedScrollView.getHitRect(rect);
            x xVar2 = (x) this.f22459a;
            if (xVar2 != null) {
                P().l(xVar2.f9051m.getLocalVisibleRect(rect));
            }
            x xVar3 = (x) this.f22459a;
            if (xVar3 != null) {
                FrameLayout frameLayout = xVar3.f9041b;
                me.c0 P = P();
                boolean localVisibleRect = frameLayout.getLocalVisibleRect(rect);
                AtomicBoolean atomicBoolean = P.e0;
                if (localVisibleRect && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    P.f20615c0.C(P.f20626i0);
                }
            }
        }
    }

    public void M() {
        try {
            y1.r r5 = a.a.r(this);
            s sVar = new s();
            sVar.f20679a.put("destination", "Responsible");
            Intrinsics.checkNotNullExpressionValue(sVar, "setDestination(...)");
            r5.d(sVar);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }

    public final void N(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.ball_white);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21931d;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new l(this, 0);
        ((v) y.a(context)).a(eVar.a());
    }

    public int O() {
        c navArgsClass = Reflection.getOrCreateKotlinClass(me.r.class);
        i3.i argumentProducer = new i3.i(10, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle = (Bundle) argumentProducer.invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        return ((me.r) ((y1.i) invoke)).a();
    }

    public me.c0 P() {
        return (me.c0) this.f6988c.getValue();
    }

    public final void Q(Context context, int i5, String str) {
        if (str == null || str.length() == 0 || StringsKt.H(str)) {
            S(null);
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = str;
        eVar.f21951o = r4.g.f22299b;
        eVar.c(i5, i5);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new l(this, 1);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void R(Context context, int i5, String str) {
        if (str == null || str.length() == 0 || StringsKt.H(str)) {
            T(null);
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = str;
        eVar.f21951o = r4.g.f22299b;
        eVar.c(i5, i5);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = bVar;
        eVar.f21941d = new l(this, 2);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void S(c4.m mVar) {
        PredictionCard predictionCard;
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        x xVar = (x) this.f22459a;
        if (xVar == null || (predictionCard = xVar.f9062y) == null) {
            return;
        }
        predictionCard.setFlagGuest(bitmap);
    }

    public final void T(c4.m mVar) {
        PredictionCard predictionCard;
        c4.a aVar = mVar instanceof c4.a ? (c4.a) mVar : null;
        Bitmap bitmap = aVar != null ? aVar.f3564a : null;
        x xVar = (x) this.f22459a;
        if (xVar == null || (predictionCard = xVar.f9062y) == null) {
            return;
        }
        predictionCard.setFlagHome(bitmap);
    }

    /* renamed from: U, reason: from getter */
    public boolean getF7006w() {
        return this.f7006w;
    }

    public final void V(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.sportinsider);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = q4.b.f21931d;
        eVar.f21941d = new l(this, 3);
        ((v) y.a(context)).a(eVar.a());
    }

    public final void W(Context context, int i5, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        q4.e eVar = new q4.e(context);
        eVar.f21940c = Integer.valueOf(R.drawable.tgicon);
        eVar.f21951o = r4.g.f22298a;
        eVar.c(i5, i10);
        q4.b bVar = q4.b.f21930c;
        eVar.f21946i = bVar;
        eVar.f21945h = bVar;
        eVar.j = q4.b.f21931d;
        eVar.f21941d = new l(this, 4);
        ((v) y.a(context)).a(eVar.a());
    }

    @Override // rd.b, ve.w0
    public final void k(int i5) {
        if (i5 == 4 || i5 == 5) {
            me.c0 P = P();
            P.getClass();
            u1.a i10 = d1.i(P);
            e eVar = m0.f9201a;
            c0.t(i10, lg.d.f20063c, null, new a0(P, null, 0), 2);
        }
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        x xVar = (x) this.f22459a;
        if (xVar != null) {
            AppCompatImageView matchImage = xVar.f9060w;
            Intrinsics.checkNotNullExpressionValue(matchImage, "matchImage");
            k2.x.s(matchImage).a();
            AppCompatImageView ivLogoCommandHomeCompare = xVar.q;
            Intrinsics.checkNotNullExpressionValue(ivLogoCommandHomeCompare, "ivLogoCommandHomeCompare");
            k2.x.s(ivLogoCommandHomeCompare).a();
            AppCompatImageView ivLogoCommandGuestCompare = xVar.f9054p;
            Intrinsics.checkNotNullExpressionValue(ivLogoCommandGuestCompare, "ivLogoCommandGuestCompare");
            k2.x.s(ivLogoCommandGuestCompare).a();
        }
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            xVar2.F.setRefreshing(false);
        }
        this.f7005v.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        TelegramBannerView telegramBannerView;
        FrameLayout frameLayout;
        MaterialButton materialButton;
        SwipeRefreshLayout swipeRefreshLayout;
        super.onPause();
        x xVar = (x) this.f22459a;
        if (xVar != null && (swipeRefreshLayout = xVar.F) != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            xVar2.f9063z.setOnClickListener(null);
            xVar2.f9050l.setOnClickListener(null);
        }
        x xVar3 = (x) this.f22459a;
        if (xVar3 != null && (materialButton = xVar3.f9044e) != null) {
            materialButton.setOnClickListener(null);
        }
        x xVar4 = (x) this.f22459a;
        if (xVar4 != null && (frameLayout = xVar4.f9041b) != null) {
            frameLayout.setOnClickListener(null);
        }
        x xVar5 = (x) this.f22459a;
        if (xVar5 == null || (telegramBannerView = xVar5.G) == null) {
            return;
        }
        telegramBannerView.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x xVar = (x) this.f22459a;
        if (xVar != null) {
            xVar.F.setEnabled(true);
        }
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            LinearLayout foreCast = xVar2.f9050l;
            Intrinsics.checkNotNullExpressionValue(foreCast, "foreCast");
            final int i5 = 0;
            io.sentry.config.a.y(foreCast, 600L, new Function1(this) { // from class: me.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionFragment f20653b;

                {
                    this.f20653b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
                    switch (i5) {
                        case 0:
                            PredictionFragment predictionFragment = this.f20653b;
                            Pair pair = (Pair) predictionFragment.P().A.d();
                            if (pair != null && (str = (String) pair.f19192a) != null) {
                                predictionFragment.x(str);
                            }
                            break;
                        case 1:
                            this.f20653b.M();
                            break;
                        case 2:
                            PredictionFragment predictionFragment2 = this.f20653b;
                            c0 P = predictionFragment2.P();
                            Context context = predictionFragment2.getContext();
                            if (context == null) {
                                P.getClass();
                            } else {
                                P.f20615c0.B(context, P.f20624h0, P.j0);
                            }
                            break;
                        case 3:
                            PredictionFragment predictionFragment3 = this.f20653b;
                            c0 P2 = predictionFragment3.P();
                            Context context2 = predictionFragment3.getContext();
                            if (context2 == null) {
                                P2.getClass();
                            } else {
                                P2.f20615c0.B(context2, P2.f20626i0, P2.k0);
                            }
                            break;
                        default:
                            eg.c0.t(MyApp.f6830c, null, null, new ad.a(this.f20653b, null, 16), 3);
                            new cd.d().c("open_click_tg_bot", null);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
            ResponsibleGamingBtn responsibleGamingBtn = xVar2.f9063z;
            Intrinsics.checkNotNullExpressionValue(responsibleGamingBtn, "responsibleGamingBtn");
            final int i10 = 1;
            io.sentry.config.a.y(responsibleGamingBtn, 600L, new Function1(this) { // from class: me.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionFragment f20653b;

                {
                    this.f20653b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
                    switch (i10) {
                        case 0:
                            PredictionFragment predictionFragment = this.f20653b;
                            Pair pair = (Pair) predictionFragment.P().A.d();
                            if (pair != null && (str = (String) pair.f19192a) != null) {
                                predictionFragment.x(str);
                            }
                            break;
                        case 1:
                            this.f20653b.M();
                            break;
                        case 2:
                            PredictionFragment predictionFragment2 = this.f20653b;
                            c0 P = predictionFragment2.P();
                            Context context = predictionFragment2.getContext();
                            if (context == null) {
                                P.getClass();
                            } else {
                                P.f20615c0.B(context, P.f20624h0, P.j0);
                            }
                            break;
                        case 3:
                            PredictionFragment predictionFragment3 = this.f20653b;
                            c0 P2 = predictionFragment3.P();
                            Context context2 = predictionFragment3.getContext();
                            if (context2 == null) {
                                P2.getClass();
                            } else {
                                P2.f20615c0.B(context2, P2.f20626i0, P2.k0);
                            }
                            break;
                        default:
                            eg.c0.t(MyApp.f6830c, null, null, new ad.a(this.f20653b, null, 16), 3);
                            new cd.d().c("open_click_tg_bot", null);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        x xVar3 = (x) this.f22459a;
        if (xVar3 != null) {
            final int i11 = 2;
            io.sentry.config.a.y(xVar3.f9044e, 500L, new Function1(this) { // from class: me.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionFragment f20653b;

                {
                    this.f20653b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
                    switch (i11) {
                        case 0:
                            PredictionFragment predictionFragment = this.f20653b;
                            Pair pair = (Pair) predictionFragment.P().A.d();
                            if (pair != null && (str = (String) pair.f19192a) != null) {
                                predictionFragment.x(str);
                            }
                            break;
                        case 1:
                            this.f20653b.M();
                            break;
                        case 2:
                            PredictionFragment predictionFragment2 = this.f20653b;
                            c0 P = predictionFragment2.P();
                            Context context = predictionFragment2.getContext();
                            if (context == null) {
                                P.getClass();
                            } else {
                                P.f20615c0.B(context, P.f20624h0, P.j0);
                            }
                            break;
                        case 3:
                            PredictionFragment predictionFragment3 = this.f20653b;
                            c0 P2 = predictionFragment3.P();
                            Context context2 = predictionFragment3.getContext();
                            if (context2 == null) {
                                P2.getClass();
                            } else {
                                P2.f20615c0.B(context2, P2.f20626i0, P2.k0);
                            }
                            break;
                        default:
                            eg.c0.t(MyApp.f6830c, null, null, new ad.a(this.f20653b, null, 16), 3);
                            new cd.d().c("open_click_tg_bot", null);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        x xVar4 = (x) this.f22459a;
        if (xVar4 != null) {
            final int i12 = 3;
            io.sentry.config.a.y(xVar4.f9041b, 500L, new Function1(this) { // from class: me.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionFragment f20653b;

                {
                    this.f20653b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
                    switch (i12) {
                        case 0:
                            PredictionFragment predictionFragment = this.f20653b;
                            Pair pair = (Pair) predictionFragment.P().A.d();
                            if (pair != null && (str = (String) pair.f19192a) != null) {
                                predictionFragment.x(str);
                            }
                            break;
                        case 1:
                            this.f20653b.M();
                            break;
                        case 2:
                            PredictionFragment predictionFragment2 = this.f20653b;
                            c0 P = predictionFragment2.P();
                            Context context = predictionFragment2.getContext();
                            if (context == null) {
                                P.getClass();
                            } else {
                                P.f20615c0.B(context, P.f20624h0, P.j0);
                            }
                            break;
                        case 3:
                            PredictionFragment predictionFragment3 = this.f20653b;
                            c0 P2 = predictionFragment3.P();
                            Context context2 = predictionFragment3.getContext();
                            if (context2 == null) {
                                P2.getClass();
                            } else {
                                P2.f20615c0.B(context2, P2.f20626i0, P2.k0);
                            }
                            break;
                        default:
                            eg.c0.t(MyApp.f6830c, null, null, new ad.a(this.f20653b, null, 16), 3);
                            new cd.d().c("open_click_tg_bot", null);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        x xVar5 = (x) this.f22459a;
        if (xVar5 != null) {
            final int i13 = 4;
            io.sentry.config.a.y(xVar5.G, 500L, new Function1(this) { // from class: me.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PredictionFragment f20653b;

                {
                    this.f20653b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str;
                    switch (i13) {
                        case 0:
                            PredictionFragment predictionFragment = this.f20653b;
                            Pair pair = (Pair) predictionFragment.P().A.d();
                            if (pair != null && (str = (String) pair.f19192a) != null) {
                                predictionFragment.x(str);
                            }
                            break;
                        case 1:
                            this.f20653b.M();
                            break;
                        case 2:
                            PredictionFragment predictionFragment2 = this.f20653b;
                            c0 P = predictionFragment2.P();
                            Context context = predictionFragment2.getContext();
                            if (context == null) {
                                P.getClass();
                            } else {
                                P.f20615c0.B(context, P.f20624h0, P.j0);
                            }
                            break;
                        case 3:
                            PredictionFragment predictionFragment3 = this.f20653b;
                            c0 P2 = predictionFragment3.P();
                            Context context2 = predictionFragment3.getContext();
                            if (context2 == null) {
                                P2.getClass();
                            } else {
                                P2.f20615c0.B(context2, P2.f20626i0, P2.k0);
                            }
                            break;
                        default:
                            eg.c0.t(MyApp.f6830c, null, null, new ad.a(this.f20653b, null, 16), 3);
                            new cd.d().c("open_click_tg_bot", null);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        x xVar = (x) this.f22459a;
        if (xVar != null && (viewTreeObserver = xVar.B.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        P().k(O());
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            xVar2.F.setOnRefreshListener(this);
        }
        P().j.e(getViewLifecycleOwner(), this.f6992g);
        P().f20629l0.e(getViewLifecycleOwner(), this.j);
        P().f20631m0.e(getViewLifecycleOwner(), this.f6995k);
        P().f20620f0.e(getViewLifecycleOwner(), this.f6993h);
        P().f20622g0.e(getViewLifecycleOwner(), this.f6994i);
        P().f20618e.e(getViewLifecycleOwner(), this.f6990e);
        androidx.lifecycle.i iVar = P().f20613b0;
        iVar.e(getViewLifecycleOwner(), this.f6989d);
        pd.x G = G();
        Integer num = (Integer) iVar.d();
        P().getClass();
        G.e(num == null || num.intValue() != R.drawable.ic_un_saved_24);
        P().A.e(getViewLifecycleOwner(), this.f6991f);
        P().B.e(getViewLifecycleOwner(), this.f6996l);
        P().C.e(getViewLifecycleOwner(), this.f6999o);
        P().M.e(getViewLifecycleOwner(), this.f6997m);
        P().N.e(getViewLifecycleOwner(), this.f6998n);
        P().D.e(getViewLifecycleOwner(), this.f7000p);
        P().E.e(getViewLifecycleOwner(), this.q);
        P().F.e(getViewLifecycleOwner(), this.f7001r);
        P().G.e(getViewLifecycleOwner(), this.f7002s);
        P().I.e(getViewLifecycleOwner(), this.f7003t);
        P().K.e(getViewLifecycleOwner(), this.f7004u);
        d1.a(P().R).e(getViewLifecycleOwner(), this.A);
        d1.a(P().S).e(getViewLifecycleOwner(), this.f7009z);
        d1.a(P().T).e(getViewLifecycleOwner(), this.B);
        d1.a(P().U).e(getViewLifecycleOwner(), this.C);
        d1.a(P().V).e(getViewLifecycleOwner(), this.D);
        d1.a(P().W).e(getViewLifecycleOwner(), this.E);
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStop() {
        ViewTreeObserver viewTreeObserver;
        super.onStop();
        me.c0 P = P();
        b0 b0Var = P.O;
        if (b0Var != null) {
            b0Var.cancel();
        }
        P.O = null;
        P.Q = 0L;
        t1 t1Var = P.f20623h;
        if (t1Var != null) {
            t1Var.k(null);
        }
        P.f20623h = null;
        t1 t1Var2 = P.X;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        P.X = null;
        t1 t1Var3 = P.Y;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        P.Y = null;
        x xVar = (x) this.f22459a;
        if (xVar != null && (viewTreeObserver = xVar.B.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            xVar2.F.setOnRefreshListener(null);
        }
        androidx.lifecycle.i iVar = P().j;
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        iVar.getClass();
        n0.a("removeObservers");
        Iterator it = iVar.f2211b.iterator();
        while (true) {
            p.b bVar = (p.b) it;
            if (!bVar.hasNext()) {
                P().f20613b0.i(this.f6989d);
                P().f20618e.i(this.f6990e);
                P().A.i(this.f6991f);
                P().B.i(this.f6996l);
                P().C.i(this.f6999o);
                P().M.i(this.f6997m);
                P().N.i(this.f6998n);
                P().D.i(this.f7000p);
                P().E.i(this.q);
                P().F.i(this.f7001r);
                P().G.i(this.f7002s);
                P().I.i(this.f7003t);
                P().K.i(this.f7004u);
                d1.a(P().R).i(this.A);
                d1.a(P().S).i(this.f7009z);
                d1.a(P().T).i(this.B);
                d1.a(P().U).i(this.C);
                d1.a(P().V).i(this.D);
                d1.a(P().W).i(this.E);
                P().f20620f0.i(this.f6993h);
                P().f20622g0.i(this.f6994i);
                P().f20629l0.i(this.j);
                P().f20631m0.i(this.f6995k);
                return;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            if (((androidx.lifecycle.m0) entry.getValue()).d(viewLifecycleOwner)) {
                iVar.i((q0) entry.getKey());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f7005v);
        x xVar = (x) this.f22459a;
        this.f7007x = xVar != null ? (int) (xVar.f9062y.f7769q0 * 20.0f) : io.sentry.config.a.o(20);
        x xVar2 = (x) this.f22459a;
        if (xVar2 != null) {
            PremiumGradientView premiumGradientView = xVar2.f9059v;
            PredictionGradientView predictionGradientView = xVar2.f9058u;
            xVar2.C.setShadowColor(P().h());
            AppCompatImageView matchImage = xVar2.f9060w;
            Intrinsics.checkNotNullExpressionValue(matchImage, "matchImage");
            P().getClass();
            Integer valueOf = Integer.valueOf(R.drawable.bg_prediction);
            o a7 = y.a(matchImage.getContext());
            q4.e eVar = new q4.e(matchImage.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, matchImage);
            ((v) a7).a(eVar.a());
            if (getF7006w()) {
                predictionGradientView.setVisibility(0);
                premiumGradientView.setVisibility(8);
            } else {
                predictionGradientView.setVisibility(8);
                premiumGradientView.setVisibility(0);
            }
        }
        zc.k kVar = new zc.k();
        x xVar3 = (x) this.f22459a;
        if (xVar3 != null) {
            xVar3.f9061x.e(new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 15));
            xVar3.f9046g.e(new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 16));
            xVar3.f9045f.e(new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 17));
            ResponsibleGamingBtn responsibleGamingBtn = xVar3.f9063z;
            me.d blockRegular = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 18);
            me.d blockBold = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 19);
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold, "blockBold");
            c0.t(responsibleGamingBtn.f7871n, null, null, new u0(responsibleGamingBtn, blockRegular, blockBold, (Continuation) null), 3);
            StateGameView stateGameView = xVar3.E;
            me.d blockBold2 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 20);
            Intrinsics.checkNotNullParameter(blockBold2, "blockBold");
            c0.t(stateGameView.f7942o, null, null, new f0(stateGameView, blockBold2, (Continuation) null), 3);
            HeadToHeadLabelView headToHeadLabelView = xVar3.f9052n;
            me.d blockBold3 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 21);
            Intrinsics.checkNotNullParameter(blockBold3, "blockBold");
            c0.t(headToHeadLabelView.f7511h, null, null, new f0(headToHeadLabelView, blockBold3, null, 18), 3);
            PredictionLabelView predictionLabelView = xVar3.f9055r;
            me.d blockBold4 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 22);
            Intrinsics.checkNotNullParameter(blockBold4, "blockBold");
            c0.t(predictionLabelView.f7796d, null, null, new f0(predictionLabelView, blockBold4, (Continuation) null), 3);
            AnalyticsShortView analyticsShortView = xVar3.f9043d;
            me.d blockRegular2 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 23);
            Intrinsics.checkNotNullParameter(blockRegular2, "blockRegular");
            c0.t(analyticsShortView.f7095e, null, null, new td.b(analyticsShortView, blockRegular2, (Continuation) null), 3);
            PredictionCard predictionCard = xVar3.f9062y;
            me.d blockRegular3 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 7);
            me.d blockBold5 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 8);
            Intrinsics.checkNotNullParameter(blockRegular3, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold5, "blockBold");
            c0.t(predictionCard.A0, null, null, new c1.g(predictionCard, blockRegular3, blockBold5, (Continuation) null, 8), 3);
            LastGamesNameLabel lastGamesNameLabel = xVar3.L;
            me.d blockRegular4 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 9);
            me.d blockBold6 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 10);
            Intrinsics.checkNotNullParameter(blockRegular4, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold6, "blockBold");
            c0.t(lastGamesNameLabel.f7572k, null, null, new u0(lastGamesNameLabel, blockRegular4, blockBold6, (Continuation) null), 3);
            LastGamesNameLabel lastGamesNameLabel2 = xVar3.K;
            me.d blockRegular5 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 11);
            me.d blockBold7 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 12);
            Intrinsics.checkNotNullParameter(blockRegular5, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold7, "blockBold");
            c0.t(lastGamesNameLabel2.f7572k, null, null, new u0(lastGamesNameLabel2, blockRegular5, blockBold7, (Continuation) null), 3);
            AnalyticsView analyticsView = xVar3.f9042c;
            me.d blockBold8 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 13);
            me.d blockRegular6 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 14);
            Intrinsics.checkNotNullParameter(blockBold8, "blockBold");
            Intrinsics.checkNotNullParameter(blockRegular6, "blockRegular");
            c0.t(analyticsView.f7123u, null, null, new u0(analyticsView, blockBold8, blockRegular6, (Continuation) null), 3);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public final void p() {
        P().i(true);
    }

    @Override // pe.g
    public void x(String betText) {
        Intrinsics.checkNotNullParameter(betText, "betText");
        try {
            if (betText.length() <= 0 || StringsKt.H(betText)) {
                return;
            }
            y1.r r5 = a.a.r(this);
            me.t tVar = new me.t();
            tVar.f20680a.put("searchBet", betText);
            Intrinsics.checkNotNullExpressionValue(tVar, "setSearchBet(...)");
            r5.d(tVar);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }
}
