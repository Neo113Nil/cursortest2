package com.sports.insider.ui.prediction;

import ag.c;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
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
import com.sports.insider.ui.prediction.ExpressFragment;
import com.sports.insider.ui.views.AnalyticsBackground;
import com.sports.insider.ui.views.AnalyticsShortView;
import com.sports.insider.ui.views.AnalyticsView;
import com.sports.insider.ui.views.FrameGradientWithHead;
import com.sports.insider.ui.views.PredictionLabelView;
import com.sports.insider.ui.views.ResponsibleGamingBtn;
import com.sports.insider.ui.views.ShadowLayoutSimple;
import com.sports.insider.ui.views.StateGameView;
import e.d0;
import eg.c0;
import eg.m0;
import eg.t1;
import ge.d;
import gf.k;
import gf.t;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.x;
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
import me.h;
import pe.g;
import rd.b;
import y1.j;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/prediction/ExpressFragment;", "Lrd/b;", "Lec/b;", "Lpe/g;", "Landroidx/swiperefreshlayout/widget/i;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressFragment.kt\ncom/sports/insider/ui/prediction/ExpressFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,320:1\n42#2,3:321\n35#3,3:324\n17#3:327\n38#3,6:328\n44#3,2:335\n52#3,2:337\n35#3,3:339\n17#3:342\n38#3,6:343\n44#3,2:350\n38#4:334\n38#4:349\n*S KotlinDebug\n*F\n+ 1 ExpressFragment.kt\ncom/sports/insider/ui/prediction/ExpressFragment\n*L\n35#1:321,3\n148#1:324,3\n148#1:327\n148#1:328,6\n148#1:335,2\n283#1:337,2\n101#1:339,3\n101#1:342\n101#1:343,6\n101#1:350,2\n148#1:334\n101#1:349\n*E\n"})
/* loaded from: classes.dex */
public final class ExpressFragment extends b<ec.b> implements g, i, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final me.b f6976d;

    /* renamed from: e, reason: collision with root package name */
    public final me.b f6977e;

    /* renamed from: f, reason: collision with root package name */
    public final me.b f6978f;

    /* renamed from: g, reason: collision with root package name */
    public final me.b f6979g;

    /* renamed from: i, reason: collision with root package name */
    public final me.b f6981i;
    public final me.b j;

    /* renamed from: k, reason: collision with root package name */
    public final me.b f6982k;

    /* renamed from: l, reason: collision with root package name */
    public final me.b f6983l;

    /* renamed from: m, reason: collision with root package name */
    public final me.b f6984m;

    /* renamed from: n, reason: collision with root package name */
    public final me.b f6985n;

    /* renamed from: c, reason: collision with root package name */
    public final t f6975c = k.b(new a(0, this));

    /* renamed from: h, reason: collision with root package name */
    public final m f6980h = new m(1);

    /* renamed from: o, reason: collision with root package name */
    public final d f6986o = new d(this, 8);

    /* renamed from: p, reason: collision with root package name */
    public final Rect f6987p = new Rect();

    /* JADX WARN: Type inference failed for: r0v10, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v11, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v12, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [me.b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [me.b] */
    public ExpressFragment() {
        final int i5 = 4;
        this.f6976d = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i10 = i5;
                boolean z5 = true;
                int i11 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i10) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i12 = 0; i12 < 2; i12++) {
                                View view2 = view[i12];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i11 < 2) {
                                View view4 = view3[i11];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i11++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i11 < 2) {
                                View view10 = view9[i11];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i11++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i13 = 0; i13 < 2; i13++) {
                                View view12 = view11[i13];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 5;
        this.f6977e = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i10;
                boolean z5 = true;
                int i11 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i12 = 0; i12 < 2; i12++) {
                                View view2 = view[i12];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i11 < 2) {
                                View view4 = view3[i11];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i11++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i11 < 2) {
                                View view10 = view9[i11];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i11++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i13 = 0; i13 < 2; i13++) {
                                View view12 = view11[i13];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 6;
        this.f6978f = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i11;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i12 = 0; i12 < 2; i12++) {
                                View view2 = view[i12];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i13 = 0; i13 < 2; i13++) {
                                View view12 = view11[i13];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 7;
        this.f6979g = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i12;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i13 = 0; i13 < 2; i13++) {
                                View view12 = view11[i13];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 8;
        this.f6981i = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i13;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 9;
        this.j = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i14;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 0;
        this.f6982k = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i15;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 1;
        this.f6983l = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i16;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i17 = 2;
        this.f6984m = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i17;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
        final int i18 = 3;
        this.f6985n = new q0(this) { // from class: me.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressFragment f20606b;

            {
                this.f20606b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                String str;
                ec.b bVar;
                String str2;
                ec.b bVar2;
                String str3;
                ec.b bVar3;
                CharSequence charSequence;
                CharSequence charSequence2;
                ec.b bVar4;
                int i102 = i18;
                boolean z5 = true;
                int i112 = 0;
                ExpressFragment expressFragment = this.f20606b;
                switch (i102) {
                    case 0:
                        String str4 = (String) obj;
                        ec.b bVar5 = (ec.b) expressFragment.f22459a;
                        if (bVar5 != null) {
                            bVar5.f8864n.setStatusGame(str4);
                        }
                        if (!Intrinsics.areEqual("unknown", str4) && str4 != null) {
                            ec.b bVar6 = (ec.b) expressFragment.f22459a;
                            if (bVar6 != null) {
                                bVar6.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus1));
                            }
                            ec.b bVar7 = (ec.b) expressFragment.f22459a;
                            if (bVar7 != null) {
                                bVar7.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn1));
                                break;
                            }
                        } else {
                            ec.b bVar8 = (ec.b) expressFragment.f22459a;
                            if (bVar8 != null) {
                                bVar8.f8866p.setText(expressFragment.getString(R.string.DelayStavkaBonus));
                            }
                            ec.b bVar9 = (ec.b) expressFragment.f22459a;
                            if (bVar9 != null) {
                                bVar9.f8855d.setText(expressFragment.getString(R.string.DelayStavkaBonusBtn));
                                break;
                            }
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj;
                        ec.b bVar10 = (ec.b) expressFragment.f22459a;
                        if (bVar10 != null) {
                            bVar10.f8857f.setText(pair != null ? (String) pair.f19193b : null);
                            break;
                        }
                        break;
                    case 2:
                        if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.b bVar11 = (ec.b) expressFragment.f22459a;
                            View[] view = {bVar11 != null ? bVar11.f8867r : null, bVar11 != null ? bVar11.q : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            for (int i122 = 0; i122 < 2; i122++) {
                                View view2 = view[i122];
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                            }
                            break;
                        } else {
                            ec.b bVar12 = (ec.b) expressFragment.f22459a;
                            View[] view3 = {bVar12 != null ? bVar12.f8867r : null, bVar12 != null ? bVar12.q : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            while (i112 < 2) {
                                View view4 = view3[i112];
                                if (view4 != null) {
                                    view4.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        }
                    case 3:
                        String str5 = (String) obj;
                        ec.b bVar13 = (ec.b) expressFragment.f22459a;
                        if (bVar13 != null) {
                            TextView textView = bVar13.q;
                            if (str5 == null) {
                                str5 = "";
                            }
                            textView.setText(str5);
                            break;
                        }
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        pd.x G = expressFragment.G();
                        expressFragment.I().getClass();
                        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
                            z5 = false;
                        }
                        G.e(z5);
                        break;
                    case 5:
                        Pair pair2 = (Pair) obj;
                        ec.b bVar14 = (ec.b) expressFragment.f22459a;
                        if (bVar14 != null) {
                            TextView textView2 = bVar14.f8856e;
                            String string = textView2.getResources().getString(R.string.odds);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            StringBuilder c2 = v.f.c(string, ": ");
                            if (pair2 == null || (str = (String) pair2.f19193b) == null) {
                                str = "-";
                            }
                            c2.append(str);
                            textView2.setText(c2.toString());
                            break;
                        }
                        break;
                    case 6:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (expressFragment.isAdded() && (bVar = (ec.b) expressFragment.f22459a) != null) {
                            bVar.f8865o.setRefreshing(booleanValue);
                            break;
                        }
                        break;
                    case 7:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        ec.b bVar15 = (ec.b) expressFragment.f22459a;
                        if (bVar15 != null) {
                            bVar15.f8858g.setVisibility(booleanValue2 ? 0 : 8);
                        }
                        if (booleanValue2) {
                            expressFragment.H();
                            break;
                        }
                        break;
                    case 8:
                        Pair pair3 = (Pair) obj;
                        String str6 = pair3 != null ? (String) pair3.f19193b : null;
                        Object[] objArr = str6 == null || str6.length() == 0 || (charSequence2 = (CharSequence) pair3.f19193b) == null || StringsKt.H(charSequence2);
                        String str7 = pair3 != null ? (String) pair3.f19192a : null;
                        Object[] objArr2 = str7 == null || str7.length() == 0 || (charSequence = (CharSequence) pair3.f19192a) == null || StringsKt.H(charSequence);
                        if (pair3 != null && (str3 = (String) pair3.f19193b) != null && (bVar3 = (ec.b) expressFragment.f22459a) != null) {
                            bVar3.f8853b.setText(str3);
                        }
                        if (pair3 != null && (str2 = (String) pair3.f19192a) != null && (bVar2 = (ec.b) expressFragment.f22459a) != null) {
                            bVar2.f8854c.setText(str2);
                        }
                        if (objArr == true) {
                            ec.b bVar16 = (ec.b) expressFragment.f22459a;
                            View[] view5 = {bVar16 != null ? bVar16.f8853b : null};
                            Intrinsics.checkNotNullParameter(view5, "view");
                            View view6 = view5[0];
                            if (view6 != null) {
                                view6.setVisibility(8);
                            }
                        } else {
                            ec.b bVar17 = (ec.b) expressFragment.f22459a;
                            View[] view7 = {bVar17 != null ? bVar17.f8853b : null};
                            Intrinsics.checkNotNullParameter(view7, "view");
                            View view8 = view7[0];
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                        }
                        if (objArr2 == true) {
                            ec.b bVar18 = (ec.b) expressFragment.f22459a;
                            View[] view9 = {bVar18 != null ? bVar18.f8860i : null, bVar18 != null ? bVar18.f8863m : null};
                            Intrinsics.checkNotNullParameter(view9, "view");
                            while (i112 < 2) {
                                View view10 = view9[i112];
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                }
                                i112++;
                            }
                            break;
                        } else {
                            ec.b bVar19 = (ec.b) expressFragment.f22459a;
                            View[] view11 = {bVar19 != null ? bVar19.f8860i : null, bVar19 != null ? bVar19.f8863m : null};
                            Intrinsics.checkNotNullParameter(view11, "view");
                            for (int i132 = 0; i132 < 2; i132++) {
                                View view12 = view11[i132];
                                if (view12 != null) {
                                    view12.setVisibility(0);
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str8 = (String) obj;
                        if (str8 != null && (bVar4 = (ec.b) expressFragment.f22459a) != null) {
                            AppCompatImageView appCompatImageView = bVar4.j;
                            c4.o a7 = c4.y.a(appCompatImageView.getContext());
                            q4.e eVar = new q4.e(appCompatImageView.getContext());
                            eVar.f21940c = str8;
                            q4.j.d(eVar, appCompatImageView);
                            ((c4.v) a7).a(eVar.a());
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.express_fragment, viewGroup, false);
        int i5 = R.id.analytics;
        AnalyticsView analyticsView = (AnalyticsView) y3.j(R.id.analytics, inflate);
        if (analyticsView != null) {
            i5 = R.id.analyticsShort;
            AnalyticsShortView analyticsShortView = (AnalyticsShortView) y3.j(R.id.analyticsShort, inflate);
            if (analyticsShortView != null) {
                i5 = R.id.btnBanner;
                MaterialButton materialButton = (MaterialButton) y3.j(R.id.btnBanner, inflate);
                if (materialButton != null) {
                    i5 = R.id.exp_k;
                    TextView textView = (TextView) y3.j(R.id.exp_k, inflate);
                    if (textView != null) {
                        i5 = R.id.exp_match_day;
                        TextView textView2 = (TextView) y3.j(R.id.exp_match_day, inflate);
                        if (textView2 != null) {
                            i5 = R.id.express_banner;
                            FrameLayout frameLayout = (FrameLayout) y3.j(R.id.express_banner, inflate);
                            if (frameLayout != null) {
                                i5 = R.id.frame_express_banner;
                                FrameGradientWithHead frameGradientWithHead = (FrameGradientWithHead) y3.j(R.id.frame_express_banner, inflate);
                                if (frameGradientWithHead != null) {
                                    i5 = R.id.image_express_banner;
                                    if (((AppCompatImageView) y3.j(R.id.image_express_banner, inflate)) != null) {
                                        i5 = R.id.labelPrediction;
                                        PredictionLabelView predictionLabelView = (PredictionLabelView) y3.j(R.id.labelPrediction, inflate);
                                        if (predictionLabelView != null) {
                                            i5 = R.id.match_image;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.match_image, inflate);
                                            if (appCompatImageView != null) {
                                                i5 = R.id.prediction_linear_exp;
                                                if (((LinearLayout) y3.j(R.id.prediction_linear_exp, inflate)) != null) {
                                                    i5 = R.id.responsibleGamingBtn;
                                                    ResponsibleGamingBtn responsibleGamingBtn = (ResponsibleGamingBtn) y3.j(R.id.responsibleGamingBtn, inflate);
                                                    if (responsibleGamingBtn != null) {
                                                        i5 = R.id.rootAnalytics;
                                                        if (((AnalyticsBackground) y3.j(R.id.rootAnalytics, inflate)) != null) {
                                                            i5 = R.id.root_game_info;
                                                            if (((LinearLayout) y3.j(R.id.root_game_info, inflate)) != null) {
                                                                i5 = R.id.root_scroll;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) y3.j(R.id.root_scroll, inflate);
                                                                if (nestedScrollView != null) {
                                                                    i5 = R.id.shadowLayoutAnalyticsShort;
                                                                    ShadowLayoutSimple shadowLayoutSimple = (ShadowLayoutSimple) y3.j(R.id.shadowLayoutAnalyticsShort, inflate);
                                                                    if (shadowLayoutSimple != null) {
                                                                        i5 = R.id.statusGamePrediction;
                                                                        StateGameView stateGameView = (StateGameView) y3.j(R.id.statusGamePrediction, inflate);
                                                                        if (stateGameView != null) {
                                                                            i5 = R.id.status_layout_exp;
                                                                            if (((LinearLayout) y3.j(R.id.status_layout_exp, inflate)) != null) {
                                                                                i5 = R.id.swipeRefreshLayout;
                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) y3.j(R.id.swipeRefreshLayout, inflate);
                                                                                if (swipeRefreshLayout != null) {
                                                                                    i5 = R.id.textBanner;
                                                                                    TextView textView3 = (TextView) y3.j(R.id.textBanner, inflate);
                                                                                    if (textView3 != null) {
                                                                                        i5 = R.id.timer_str_exp;
                                                                                        TextView textView4 = (TextView) y3.j(R.id.timer_str_exp, inflate);
                                                                                        if (textView4 != null) {
                                                                                            i5 = R.id.timer_title_exp;
                                                                                            TextView textView5 = (TextView) y3.j(R.id.timer_title_exp, inflate);
                                                                                            if (textView5 != null) {
                                                                                                i5 = R.id.titleBanner;
                                                                                                if (((TextView) y3.j(R.id.titleBanner, inflate)) != null) {
                                                                                                    i5 = R.id.today_prediction_card;
                                                                                                    if (((FrameLayout) y3.j(R.id.today_prediction_card, inflate)) != null) {
                                                                                                        ec.b bVar = new ec.b((FrameLayout) inflate, analyticsView, analyticsShortView, materialButton, textView, textView2, frameLayout, frameGradientWithHead, predictionLabelView, appCompatImageView, responsibleGamingBtn, nestedScrollView, shadowLayoutSimple, stateGameView, swipeRefreshLayout, textView3, textView4, textView5);
                                                                                                        Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                                                                                        return bVar;
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

    public final void H() {
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null) {
            NestedScrollView nestedScrollView = bVar.f8862l;
            Rect rect = this.f6987p;
            nestedScrollView.getHitRect(rect);
            ec.b bVar2 = (ec.b) this.f22459a;
            if (bVar2 != null) {
                FrameGradientWithHead frameGradientWithHead = bVar2.f8859h;
                h I = I();
                boolean localVisibleRect = frameGradientWithHead.getLocalVisibleRect(rect);
                AtomicBoolean atomicBoolean = I.e0;
                if (localVisibleRect && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    I.f20615c0.C(I.f20626i0);
                }
            }
        }
    }

    public final h I() {
        return (h) this.f6975c.getValue();
    }

    @Override // rd.b, ve.w0
    public final void k(int i5) {
        if (i5 == 4 || i5 == 5) {
            h I = I();
            I.getClass();
            u1.a i10 = d1.i(I);
            e eVar = m0.f9201a;
            c0.t(i10, lg.d.f20063c, null, new a0(I, null, 0), 2);
        }
    }

    @Override // rd.a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null) {
            AppCompatImageView matchImage = bVar.j;
            Intrinsics.checkNotNullExpressionValue(matchImage, "matchImage");
            x.s(matchImage).a();
        }
        ec.b bVar2 = (ec.b) this.f22459a;
        if (bVar2 != null) {
            SwipeRefreshLayout swipeRefreshLayout = bVar2.f8865o;
            swipeRefreshLayout.setOnRefreshListener(null);
            swipeRefreshLayout.setRefreshing(false);
        }
        this.f6986o.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        MaterialButton materialButton;
        ResponsibleGamingBtn responsibleGamingBtn;
        SwipeRefreshLayout swipeRefreshLayout;
        super.onPause();
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null && (swipeRefreshLayout = bVar.f8865o) != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        ec.b bVar2 = (ec.b) this.f22459a;
        if (bVar2 != null && (responsibleGamingBtn = bVar2.f8861k) != null) {
            responsibleGamingBtn.setOnClickListener(null);
        }
        ec.b bVar3 = (ec.b) this.f22459a;
        if (bVar3 == null || (materialButton = bVar3.f8855d) == null) {
            return;
        }
        materialButton.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null) {
            bVar.f8865o.setEnabled(true);
        }
        ec.b bVar2 = (ec.b) this.f22459a;
        if (bVar2 != null) {
            final int i5 = 0;
            io.sentry.config.a.y(bVar2.f8861k, 500L, new Function1(this) { // from class: me.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ExpressFragment f20610b;

                {
                    this.f20610b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i10 = i5;
                    ExpressFragment expressFragment = this.f20610b;
                    switch (i10) {
                        case 0:
                            try {
                                y1.r r5 = a.a.r(expressFragment);
                                f fVar = new f();
                                fVar.f20648a.put("destination", "Responsible");
                                Intrinsics.checkNotNullExpressionValue(fVar, "setDestination(...)");
                                r5.d(fVar);
                            } catch (Exception ex) {
                                Intrinsics.checkNotNullParameter(ex, "ex");
                                jg.d dVar = MyApp.f6830c;
                                lg.e eVar = m0.f9201a;
                                eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
                            }
                            break;
                        default:
                            h I = expressFragment.I();
                            Context context = expressFragment.getContext();
                            if (context == null) {
                                I.getClass();
                            } else {
                                I.f20615c0.B(context, I.f20626i0, I.k0);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        ec.b bVar3 = (ec.b) this.f22459a;
        if (bVar3 != null) {
            final int i10 = 1;
            io.sentry.config.a.y(bVar3.f8855d, 500L, new Function1(this) { // from class: me.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ExpressFragment f20610b;

                {
                    this.f20610b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i102 = i10;
                    ExpressFragment expressFragment = this.f20610b;
                    switch (i102) {
                        case 0:
                            try {
                                y1.r r5 = a.a.r(expressFragment);
                                f fVar = new f();
                                fVar.f20648a.put("destination", "Responsible");
                                Intrinsics.checkNotNullExpressionValue(fVar, "setDestination(...)");
                                r5.d(fVar);
                            } catch (Exception ex) {
                                Intrinsics.checkNotNullParameter(ex, "ex");
                                jg.d dVar = MyApp.f6830c;
                                lg.e eVar = m0.f9201a;
                                eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
                            }
                            break;
                        default:
                            h I = expressFragment.I();
                            Context context = expressFragment.getContext();
                            if (context == null) {
                                I.getClass();
                            } else {
                                I.f20615c0.B(context, I.f20626i0, I.k0);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        c0.t(d1.g(this), null, null, new androidx.lifecycle.b(this, (Continuation) null, 16), 3);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        H();
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null && (viewTreeObserver = bVar.f8862l.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        h I = I();
        c navArgsClass = Reflection.getOrCreateKotlinClass(me.e.class);
        i3.i argumentProducer = new i3.i(9, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle = (Bundle) argumentProducer.invoke();
        s.e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        boolean z5 = true;
        if (method == null) {
            method = u6.h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        I.k(((me.e) ((y1.i) invoke)).a());
        ec.b bVar2 = (ec.b) this.f22459a;
        if (bVar2 != null) {
            bVar2.f8865o.setOnRefreshListener(this);
        }
        I().j.e(getViewLifecycleOwner(), this.f6978f);
        I().f20631m0.e(getViewLifecycleOwner(), this.f6980h);
        I().f20622g0.e(getViewLifecycleOwner(), this.f6979g);
        androidx.lifecycle.i iVar = I().f20613b0;
        iVar.e(getViewLifecycleOwner(), this.f6976d);
        pd.x G = G();
        Integer num = (Integer) iVar.d();
        I().getClass();
        if (num != null && num.intValue() == R.drawable.ic_un_saved_24) {
            z5 = false;
        }
        G.e(z5);
        I().A.e(getViewLifecycleOwner(), this.f6977e);
        I().D.e(getViewLifecycleOwner(), this.f6981i);
        I().F.e(getViewLifecycleOwner(), this.j);
        I().G.e(getViewLifecycleOwner(), this.f6982k);
        I().H.e(getViewLifecycleOwner(), this.f6983l);
        I().J.e(getViewLifecycleOwner(), this.f6984m);
        I().L.e(getViewLifecycleOwner(), this.f6985n);
    }

    @Override // rd.b, androidx.fragment.app.Fragment
    public final void onStop() {
        ViewTreeObserver viewTreeObserver;
        super.onStop();
        h I = I();
        b0 b0Var = I.O;
        if (b0Var != null) {
            b0Var.cancel();
        }
        I.O = null;
        I.Q = 0L;
        t1 t1Var = I.f20623h;
        if (t1Var != null) {
            t1Var.k(null);
        }
        I.f20623h = null;
        t1 t1Var2 = I.X;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        I.X = null;
        t1 t1Var3 = I.Y;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        I.Y = null;
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null && (viewTreeObserver = bVar.f8862l.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
        ec.b bVar2 = (ec.b) this.f22459a;
        if (bVar2 != null) {
            bVar2.f8865o.setOnRefreshListener(null);
        }
        I().f20613b0.i(this.f6976d);
        I().A.i(this.f6977e);
        I().D.i(this.f6981i);
        I().F.i(this.j);
        I().G.i(this.f6982k);
        I().H.i(this.f6983l);
        I().J.i(this.f6984m);
        I().L.i(this.f6985n);
        I().j.i(this.f6978f);
        I().f20622g0.i(this.f6979g);
        I().f20631m0.i(this.f6980h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6986o);
        ec.b bVar = (ec.b) this.f22459a;
        if (bVar != null) {
            bVar.f8863m.setShadowColor(I().f20651n0);
            AppCompatImageView matchImage = bVar.j;
            Intrinsics.checkNotNullExpressionValue(matchImage, "matchImage");
            I().getClass();
            Integer valueOf = Integer.valueOf(R.drawable.bg_prediction);
            o a7 = y.a(matchImage.getContext());
            q4.e eVar = new q4.e(matchImage.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, matchImage);
            ((v) a7).a(eVar.a());
            zc.k kVar = new zc.k();
            PredictionLabelView predictionLabelView = bVar.f8860i;
            me.d blockBold = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 0);
            Intrinsics.checkNotNullParameter(blockBold, "blockBold");
            c0.t(predictionLabelView.f7796d, null, null, new f0(predictionLabelView, blockBold, (Continuation) null), 3);
            AnalyticsShortView analyticsShortView = bVar.f8854c;
            me.d blockRegular = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 1);
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            c0.t(analyticsShortView.f7095e, null, null, new td.b(analyticsShortView, blockRegular, (Continuation) null), 3);
            ResponsibleGamingBtn responsibleGamingBtn = bVar.f8861k;
            me.d blockRegular2 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 2);
            me.d blockBold2 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 3);
            Intrinsics.checkNotNullParameter(blockRegular2, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold2, "blockBold");
            c0.t(responsibleGamingBtn.f7871n, null, null, new u0(responsibleGamingBtn, blockRegular2, blockBold2, (Continuation) null), 3);
            StateGameView stateGameView = bVar.f8864n;
            me.d blockBold3 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 4);
            Intrinsics.checkNotNullParameter(blockBold3, "blockBold");
            c0.t(stateGameView.f7942o, null, null, new f0(stateGameView, blockBold3, (Continuation) null), 3);
            AnalyticsView analyticsView = bVar.f8853b;
            me.d blockBold4 = new me.d(1, kVar, zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 5);
            me.d blockRegular3 = new me.d(1, kVar, zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 6);
            Intrinsics.checkNotNullParameter(blockBold4, "blockBold");
            Intrinsics.checkNotNullParameter(blockRegular3, "blockRegular");
            c0.t(analyticsView.f7123u, null, null, new u0(analyticsView, blockBold4, blockRegular3, (Continuation) null), 3);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.i
    public final void p() {
        I().i(true);
    }

    @Override // pe.g
    public final void x(String betText) {
        Intrinsics.checkNotNullParameter(betText, "betText");
        if (betText.length() <= 0 || StringsKt.H(betText)) {
            return;
        }
        try {
            r r5 = a.a.r(this);
            me.g gVar = new me.g();
            gVar.f20650a.put("searchBet", betText);
            Intrinsics.checkNotNullExpressionValue(gVar, "setSearchBet(...)");
            r5.d(gVar);
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
        }
    }
}
