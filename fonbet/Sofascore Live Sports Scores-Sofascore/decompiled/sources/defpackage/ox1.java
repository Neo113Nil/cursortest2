package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.blaze.blazesdk.features.moments.container.compose.BlazeMomentsPlayerContainerComposeStateHandler;
import com.blaze.blazesdk.features.moments.container.tabs.compose.BlazeMomentsPlayerContainerTabsComposeStateHandler;
import com.blaze.blazesdk.features.stories.widgets.row.BlazeStoriesWidgetRowView;
import com.blaze.blazesdk.features.videos.inline.compose.BlazeVideosInlinePlayerComposeStateHandler;
import com.blaze.blazesdk.features.videos.widgets.grid.BlazeVideosWidgetGridView;
import com.blaze.blazesdk.features.videos.widgets.row.BlazeVideosWidgetRowView;
import com.blaze.blazesdk.follow.BlazeFollowEntityView;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.FilterCategory;
import com.sofascore.model.newNetwork.FilterValue;
import com.sofascore.results.R;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.chat.ChatTranslateActivity;
import com.sofascore.results.country.CountryListBottomSheet;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ox1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ox1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x066b, code lost:
    
        if (r18 != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2, r3 != null ? java.lang.Integer.valueOf(r3.getId()) : null) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1.getPlayerName(), r0.getPlayerName()) != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0688  */
    /* JADX WARN: Type inference failed for: r1v96, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v21, types: [e28] */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean _get_visibilityEvaluator_$lambda$1$lambda$0;
        int i;
        ay1 ay1Var;
        boolean z;
        n52 n52Var;
        wj2 wj2Var;
        sx2 sx2Var;
        float f;
        float f2;
        long D;
        Unit _init_$lambda$1;
        int i2 = this.a;
        int i3 = 2;
        int i4 = 0;
        r5 = false;
        boolean z2 = false;
        int i5 = 3;
        int i6 = 1;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                BlazeStoriesWidgetRowView blazeStoriesWidgetRowView = (BlazeStoriesWidgetRowView) obj2;
                ((Context) obj).getClass();
                return blazeStoriesWidgetRowView;
            case 1:
                BlazeVideosWidgetGridView blazeVideosWidgetGridView = (BlazeVideosWidgetGridView) obj2;
                ((Context) obj).getClass();
                return blazeVideosWidgetGridView;
            case 2:
                BlazeVideosWidgetRowView blazeVideosWidgetRowView = (BlazeVideosWidgetRowView) obj2;
                ((Context) obj).getClass();
                return blazeVideosWidgetRowView;
            case 3:
                BlazeDp blazeDp = BlazeFollowEntityView.e;
                ((gq5) obj).getClass();
                ((yj1) obj2).invoke();
                return Unit.a;
            case 4:
                ((FrameLayout) obj).getClass();
                ((BlazeMomentsPlayerContainerComposeStateHandler) obj2).clean$blazesdk_release();
                return Unit.a;
            case 5:
                ((FrameLayout) obj).getClass();
                ((BlazeMomentsPlayerContainerTabsComposeStateHandler) obj2).clean$blazesdk_release();
                return Unit.a;
            case 6:
                _get_visibilityEvaluator_$lambda$1$lambda$0 = BlazePlayerCustomActionButtonParams._get_visibilityEvaluator_$lambda$1$lambda$0((BlazePlayerCustomActionButtonParams.VisibilityCondition) obj2, (Map) obj);
                return Boolean.valueOf(_get_visibilityEvaluator_$lambda$1$lambda$0);
            case 7:
                ((FrameLayout) obj).getClass();
                ((BlazeVideosInlinePlayerComposeStateHandler) obj2).clean$blazesdk_release();
                return Unit.a;
            case 8:
                nz1 nz1Var = (nz1) obj2;
                te2 te2Var = (te2) obj;
                int i7 = 27;
                if (te2Var.j() * nz1Var.r < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || njh.e(te2Var.a.n()) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return te2Var.b(new sx1(i7));
                }
                final float min = Math.min(p75.b(nz1Var.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 1.0f : (float) Math.ceil(te2Var.j() * nz1Var.r), (float) Math.ceil(njh.e(te2Var.a.n()) / 2.0f));
                final float f3 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)) - min) & 4294967295L);
                float f4 = min * 2.0f;
                boolean z3 = f4 > njh.e(te2Var.a.n());
                pea a = nz1Var.t.a(te2Var.a.n(), te2Var.a.getLayoutDirection(), te2Var);
                if (!(a instanceof cxd)) {
                    if (!(a instanceof exd)) {
                        boolean z4 = z3;
                        if (!(a instanceof dxd)) {
                            zzl.b();
                            return null;
                        }
                        final n52 n52Var2 = nz1Var.s;
                        if (z4) {
                            floatToRawIntBits = 0;
                        }
                        final long j = floatToRawIntBits;
                        if (z4) {
                            floatToRawIntBits2 = te2Var.a.n();
                        }
                        final long j2 = floatToRawIntBits2;
                        final jii jiiVar = z4 ? e28.a : new jii(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                        return te2Var.b(new Function1() { // from class: jz1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                yma ymaVar = (yma) obj3;
                                ymaVar.a();
                                ha5.g0(ymaVar, n52.this, j, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar, 0, 104);
                                return Unit.a;
                            }
                        });
                    }
                    final n52 n52Var3 = nz1Var.s;
                    e7g e7gVar = ((exd) a).g;
                    if (uaa.t(e7gVar)) {
                        final long j3 = e7gVar.e;
                        final jii jiiVar2 = new jii(min, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
                        final boolean z5 = z3;
                        return te2Var.b(new Function1() { // from class: kz1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long j4;
                                yma ymaVar = (yma) obj3;
                                ymaVar.a();
                                wj2 wj2Var2 = ymaVar.a;
                                boolean z6 = z5;
                                n52 n52Var4 = n52Var3;
                                long j5 = j3;
                                if (z6) {
                                    ha5.Y(ymaVar, n52Var4, 0L, 0L, j5, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f5 = f3;
                                    if (intBitsToFloat < f5) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (wj2Var2.n() >> 32));
                                        float f6 = min;
                                        float f7 = intBitsToFloat2 - f6;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L)) - f6;
                                        sx2 sx2Var2 = wj2Var2.b;
                                        long D2 = sx2Var2.D();
                                        sx2Var2.t().o();
                                        try {
                                            ((hpo) sx2Var2.a).q(f6, f6, f7, intBitsToFloat3, 0);
                                            j4 = D2;
                                            try {
                                                ha5.Y(ymaVar, n52Var4, 0L, 0L, j5, null, 246);
                                                mz1.v(sx2Var2, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                mz1.v(sx2Var2, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j4 = D2;
                                        }
                                    } else {
                                        ha5.Y(ymaVar, n52Var4, floatToRawIntBits, floatToRawIntBits2, yso.I(j5, f5), jiiVar2, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                                    }
                                }
                                return Unit.a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    hz1 hz1Var = nz1Var.q;
                    if (hz1Var == null) {
                        hz1Var = new hz1();
                        nz1Var.q = hz1Var;
                    }
                    b20 b20Var = hz1Var.d;
                    if (b20Var == null) {
                        b20Var = e20.a();
                        hz1Var.d = b20Var;
                    }
                    b20Var.i();
                    b20.c(b20Var, e7gVar);
                    if (!z6) {
                        b20 a2 = e20.a();
                        b20.c(a2, new e7g(min, min, (e7gVar.c - e7gVar.a) - min, (e7gVar.d - e7gVar.b) - min, yso.I(e7gVar.e, min), yso.I(e7gVar.f, min), yso.I(e7gVar.g, min), yso.I(e7gVar.h, min)));
                        b20Var.h(b20Var, a2, 0);
                    }
                    return te2Var.b(new s1(i7, b20Var, n52Var3));
                }
                n52 n52Var4 = nz1Var.s;
                cxd cxdVar = (cxd) a;
                b20 b20Var2 = cxdVar.g;
                if (z3) {
                    return te2Var.b(new s1(28, cxdVar, n52Var4));
                }
                if (n52Var4 instanceof pvh) {
                    ay1Var = new ay1(r13.c(((pvh) n52Var4).a, 1.0f), 5);
                    i = 1;
                } else {
                    i = 0;
                    ay1Var = null;
                }
                oqf e = b20Var2.e();
                float f5 = e.b;
                float f6 = e.a;
                hz1 hz1Var2 = nz1Var.q;
                if (hz1Var2 == null) {
                    hz1Var2 = new hz1();
                    nz1Var.q = hz1Var2;
                }
                b20 b20Var3 = hz1Var2.d;
                if (b20Var3 == null) {
                    b20Var3 = e20.a();
                    hz1Var2.d = b20Var3;
                }
                b20Var3.i();
                b20.b(b20Var3, e);
                b20Var3.h(b20Var3, b20Var2, 0);
                fsf fsfVar = new fsf();
                long ceil = (((int) Math.ceil(e.d - f5)) & 4294967295L) | (((int) Math.ceil(e.c - f6)) << 32);
                hz1 hz1Var3 = nz1Var.q;
                hz1Var3.getClass();
                a10 a10Var = hz1Var3.a;
                wx wxVar = hz1Var3.b;
                rr9 rr9Var = a10Var != null ? new rr9(a10Var.a()) : null;
                try {
                    try {
                        if (rr9Var == null || rr9Var.a != 0) {
                            rr9 rr9Var2 = a10Var != null ? new rr9(a10Var.a()) : null;
                            if (rr9Var2 == null || i != rr9Var2.a) {
                                z = false;
                                if (a10Var != null || wxVar == null) {
                                    n52Var = n52Var4;
                                } else {
                                    boolean z7 = z;
                                    n52Var = n52Var4;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() >> 32));
                                    Bitmap bitmap = a10Var.a;
                                    if (intBitsToFloat <= bitmap.getWidth()) {
                                        if (Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                a10Var = tgj.k((int) (ceil >> 32), (int) (ceil & 4294967295L), i, 24);
                                hz1Var3.a = a10Var;
                                wxVar = xx.a(a10Var);
                                hz1Var3.b = wxVar;
                                wj2Var = hz1Var3.c;
                                if (wj2Var == null) {
                                    wj2Var = new wj2();
                                    hz1Var3.c = wj2Var;
                                }
                                sx2Var = wj2Var.b;
                                vj2 vj2Var = wj2Var.a;
                                b20 b20Var4 = b20Var3;
                                long I = d7a.I(ceil);
                                ema layoutDirection = te2Var.a.getLayoutDirection();
                                ay1 ay1Var2 = ay1Var;
                                kx4 kx4Var = vj2Var.a;
                                wj2 wj2Var2 = wj2Var;
                                ema emaVar = vj2Var.b;
                                uj2 uj2Var = vj2Var.c;
                                a10 a10Var2 = a10Var;
                                long j4 = vj2Var.d;
                                vj2Var.a = te2Var;
                                vj2Var.b = layoutDirection;
                                vj2Var.c = wxVar;
                                vj2Var.d = I;
                                wxVar.o();
                                ha5.o0(wj2Var2, r13.b, 0L, I, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 58);
                                f = -f6;
                                f2 = -f5;
                                ((hpo) sx2Var.a).I(f, f2);
                                n52 n52Var5 = n52Var;
                                ha5.D(wj2Var2, cxdVar.g, n52Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 0, 52);
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (wj2Var2.n() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (wj2Var2.n() >> 32));
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L));
                                long O0 = wj2Var2.O0();
                                D = sx2Var.D();
                                sx2Var.t().o();
                                wx wxVar2 = wxVar;
                                ((hpo) sx2Var.a).G(intBitsToFloat2, intBitsToFloat3, O0);
                                ha5.D(wj2Var2, b20Var4, n52Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 28);
                                ((hpo) sx2Var.a).I(-f, -f2);
                                wxVar2.h();
                                vj2Var.a = kx4Var;
                                vj2Var.b = emaVar;
                                vj2Var.c = uj2Var;
                                vj2Var.d = j4;
                                a10Var2.a.prepareToDraw();
                                fsfVar.a = a10Var2;
                                return te2Var.b(new lz1(0, ceil, e, fsfVar, ay1Var2));
                            }
                        }
                        ((hpo) sx2Var.a).G(intBitsToFloat2, intBitsToFloat3, O0);
                        ha5.D(wj2Var2, b20Var4, n52Var5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 28);
                        ((hpo) sx2Var.a).I(-f, -f2);
                        wxVar2.h();
                        vj2Var.a = kx4Var;
                        vj2Var.b = emaVar;
                        vj2Var.c = uj2Var;
                        vj2Var.d = j4;
                        a10Var2.a.prepareToDraw();
                        fsfVar.a = a10Var2;
                        return te2Var.b(new lz1(0, ceil, e, fsfVar, ay1Var2));
                    } finally {
                        sx2Var.t().h();
                        sx2Var.N(D);
                    }
                    n52 n52Var52 = n52Var;
                    ha5.D(wj2Var2, cxdVar.g, n52Var52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 0, 52);
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (wj2Var2.n() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (wj2Var2.n() >> 32));
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L));
                    long O02 = wj2Var2.O0();
                    D = sx2Var.D();
                    sx2Var.t().o();
                    wx wxVar22 = wxVar;
                } catch (Throwable th) {
                    ((hpo) sx2Var.a).I(-f, -f2);
                    throw th;
                }
                z = true;
                if (a10Var != null) {
                }
                n52Var = n52Var4;
                a10Var = tgj.k((int) (ceil >> 32), (int) (ceil & 4294967295L), i, 24);
                hz1Var3.a = a10Var;
                wxVar = xx.a(a10Var);
                hz1Var3.b = wxVar;
                wj2Var = hz1Var3.c;
                if (wj2Var == null) {
                }
                sx2Var = wj2Var.b;
                vj2 vj2Var2 = wj2Var.a;
                b20 b20Var42 = b20Var3;
                long I2 = d7a.I(ceil);
                ema layoutDirection2 = te2Var.a.getLayoutDirection();
                ay1 ay1Var22 = ay1Var;
                kx4 kx4Var2 = vj2Var2.a;
                wj2 wj2Var22 = wj2Var;
                ema emaVar2 = vj2Var2.b;
                uj2 uj2Var2 = vj2Var2.c;
                a10 a10Var22 = a10Var;
                long j42 = vj2Var2.d;
                vj2Var2.a = te2Var;
                vj2Var2.b = layoutDirection2;
                vj2Var2.c = wxVar;
                vj2Var2.d = I2;
                wxVar.o();
                ha5.o0(wj2Var22, r13.b, 0L, I2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 58);
                f = -f6;
                f2 = -f5;
                ((hpo) sx2Var.a).I(f, f2);
                break;
            case 9:
                Pair pair = (Pair) obj;
                pair.getClass();
                ((o12) obj2).n.invoke(pair.a, pair.b);
                return Unit.a;
            case 10:
                BuzzerActivity buzzerActivity = (BuzzerActivity) obj2;
                mqi mqiVar = buzzerActivity.N;
                List list = (List) obj;
                int i8 = BuzzerActivity.O;
                list.getClass();
                if (!list.isEmpty()) {
                    q82 q82Var = buzzerActivity.M;
                    if (q82Var != null) {
                        q82Var.e();
                    }
                    ((p82) mqiVar.getValue()).F(list);
                    buzzerActivity.x.e = Integer.valueOf(((p82) mqiVar.getValue()).getItemCount());
                    q82 q82Var2 = buzzerActivity.M;
                    if (q82Var2 != null) {
                        q82Var2.d();
                    }
                }
                return Unit.a;
            case 11:
                k92 k92Var = (k92) obj2;
                xw3.L(un0.z(k92Var), null, null, new qu1(k92Var, ((Integer) obj).intValue(), (rq3) r8, i6), 3);
                return Unit.a;
            case 12:
                List<? extends Object> list2 = (List) obj;
                list2.getClass();
                ((d92) obj2).setBuzzerList(list2);
                return Unit.a;
            case 13:
                _init_$lambda$1 = CachedFIdDataSource._init_$lambda$1((CachedFIdDataSource) obj2, (Throwable) obj);
                return _init_$lambda$1;
            case 14:
                ((aeh) ((p03) obj2).c).b(null);
                return Unit.a;
            case 15:
                ((nhh) obj2).r(null);
                return Unit.a;
            case 16:
                ar2 ar2Var = (ar2) obj;
                ar2Var.getClass();
                String str = ar2Var.b;
                String str2 = ((tq2) ((uq2) obj2)).a;
                r8 = Intrinsics.c(str, str2) ? 0 : str2;
                gv9 gv9Var = ar2Var.a;
                String str3 = ar2Var.c;
                String str4 = ar2Var.d;
                gv9Var.getClass();
                return new ar2(gv9Var, r8, str3, str4);
            case 17:
                ChatTranslateActivity chatTranslateActivity = (ChatTranslateActivity) obj2;
                Set set = (Set) obj;
                int i9 = ChatTranslateActivity.M;
                chatTranslateActivity.R().c.removeAllViews();
                set.getClass();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(k13.r(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Locale((String) it.next()));
                }
                for (Locale locale : CollectionsKt.H0(arrayList, new qe8(25))) {
                    LayoutInflater layoutInflater = chatTranslateActivity.getLayoutInflater();
                    RadioGroup radioGroup = chatTranslateActivity.R().c;
                    View inflate = layoutInflater.inflate(R.layout.item_translate_language, (ViewGroup) radioGroup, false);
                    radioGroup.addView(inflate);
                    int i10 = R.id.button_remove;
                    ImageButton imageButton = (ImageButton) nq8.B(R.id.button_remove, inflate);
                    if (imageButton != null) {
                        i10 = R.id.language;
                        TextView textView = (TextView) nq8.B(R.id.language, inflate);
                        if (textView != null) {
                            textView.setText(locale.getDisplayName());
                            imageButton.setTag(locale.getLanguage());
                            imageButton.setOnClickListener(chatTranslateActivity);
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                    return null;
                    break;
                }
                return Unit.a;
            case 18:
                ChronologicalMatchesFragment chronologicalMatchesFragment = (ChronologicalMatchesFragment) obj2;
                chronologicalMatchesFragment.v = false;
                lu2 D2 = chronologicalMatchesFragment.D();
                D2.d = Integer.MAX_VALUE;
                D2.e = 0;
                ku2 E = chronologicalMatchesFragment.E();
                oqb oqbVar = ((qqb) obj).b;
                g9i g9iVar = E.v;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                E.o = true;
                E.m = oqbVar;
                Map map = oqbVar.e;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.c(entry.getValue(), FilterValue.ALL.getFilterValueId()) && !Intrinsics.c(entry.getKey(), FilterCategory.STATUS.getFilterCategoryId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                E.s = linkedHashMap;
                xw3.L(un0.z(E), null, null, new ip1(E, r8, i5), 3);
                return Unit.a;
            case 19:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte byteValue = b.byteValue();
                if (byteValue == 32) {
                    sb.append("%20");
                } else if (xz2.a.contains(b) || xz2.c.contains(b)) {
                    sb.append((char) byteValue);
                } else {
                    sb.append(xz2.g(byteValue));
                }
                return Unit.a;
            case 20:
                RecyclerView recyclerView = (RecyclerView) obj2;
                p33 p33Var = (p33) obj;
                p33Var.getClass();
                qfb qfbVar = p33Var.d.c;
                if ((qfbVar instanceof pfb) && qfbVar.a) {
                    n layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(0, 0);
                    }
                }
                return Unit.a;
            case 21:
                p63 p63Var = (p63) obj2;
                t83 t83Var = (t83) obj;
                t83Var.getClass();
                int id = t83Var.getId();
                p63Var.getClass();
                xw3.L(un0.z(p63Var), null, null, new qu1(p63Var, id, (rq3) r8, i5), 3);
                return Unit.a;
            case 22:
                y83 y83Var = (y83) obj;
                y83Var.getClass();
                return "season_" + ((m93) obj2).a + "_" + y83Var.a.getId();
            case 23:
                ca3 ca3Var = (ca3) obj2;
                Context context = ca3Var.b;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (booleanValue) {
                    nv.z0(context, kv.CLICK, "reorder_leagues", "main_leagues");
                }
                ca3Var.x = booleanValue;
                ArrayList arrayList2 = ca3Var.i;
                ca3Var.r.invoke(bool);
                if (!ca3Var.x) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof PinnedTournament) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(Integer.valueOf(((PinnedTournament) it3.next()).getId()));
                    }
                    Pair[] pairArr = {wv8.t(context, "ACTION", "UPDATE_PINNED_LEAGUES_ORDER"), new Pair("LEAGUE_IDS", CollectionsKt.R0(arrayList4))};
                    hpo hpoVar = new hpo(18);
                    for (int i11 = 0; i11 < 2; i11++) {
                        Pair pair2 = pairArr[i11];
                        hpoVar.B(pair2.b, (String) pair2.a);
                    }
                    md4 l = hpoVar.l();
                    vxd.h(context).b("PinnedLeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(PinnedLeagueWorker.class, l).a());
                }
                int size = ca3Var.g.size();
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i4 = -1;
                    } else if (!(it4.next() instanceof w93)) {
                        i4++;
                    }
                }
                ca3Var.notifyItemRangeChanged(size, i4);
                return Unit.a;
            case 24:
                CompetitionsFragment competitionsFragment = (CompetitionsFragment) obj2;
                ((Boolean) obj).getClass();
                krk krkVar = competitionsFragment.l;
                krkVar.getClass();
                ((oo8) krkVar).e.setEnabled(!competitionsFragment.C().x);
                competitionsFragment.e = !competitionsFragment.C().x;
                return Unit.a;
            case 25:
                evk evkVar = (evk) obj2;
                aee aeeVar = (aee) obj;
                ff5 ff5Var = pf9.a;
                aeeVar.getClass();
                View view = ((fvk) ktm.I(aeeVar, ff5Var)).a;
                while (view != null) {
                    Object tag = view.getTag(evkVar.m());
                    if (tag != null) {
                        return tag;
                    }
                    ?? r = mha.r(view);
                    view = r instanceof View ? (View) r : null;
                }
                return null;
            case 26:
                EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) obj2;
                EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj;
                incidentSuggest.getClass();
                if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                    EventSuggest.IncidentSuggest.CardSuggest cardSuggest2 = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
                    if (cardSuggest2.getId() != cardSuggest.getId() && cardSuggest2.getSide() == cardSuggest.getSide()) {
                        Player player = cardSuggest.getPlayer();
                        if ((player != null ? Integer.valueOf(player.getId()) : null) != null) {
                            Player player2 = cardSuggest2.getPlayer();
                            Integer valueOf = player2 != null ? Integer.valueOf(player2.getId()) : null;
                            Player player3 = cardSuggest.getPlayer();
                            break;
                        }
                    }
                }
                if (cardSuggest.getPlayerName() != null) {
                    break;
                }
                return Boolean.valueOf(z2);
            case 27:
                CountryListBottomSheet countryListBottomSheet = (CountryListBottomSheet) obj2;
                uv3 uv3Var = (uv3) obj;
                uv3Var.getClass();
                if (!uv3Var.equals((uv3) countryListBottomSheet.D.getValue())) {
                    ov3 ov3Var = (ov3) countryListBottomSheet.C.getValue();
                    String str5 = uv3Var.a;
                    String str6 = uv3Var.b;
                    str6.getClass();
                    if (str5 != null) {
                        SharedPreferences.Editor edit = ov3Var.e.edit();
                        edit.getClass();
                        edit.putString("PREF_FEED_COUNTRY", str6);
                        edit.apply();
                        xw3.L(un0.z(ov3Var), null, null, new g2(ov3Var, str5, str6, (rq3) null, 26), 3);
                    }
                }
                countryListBottomSheet.j();
                return Unit.a;
            case 28:
                ty3 ty3Var = (ty3) obj2;
                ex8 ex8Var = (ex8) obj;
                ex8Var.getClass();
                ty3Var.e().execute(new sy3(ty3Var, ex8Var, i6));
                return Unit.a;
            default:
                yy3 yy3Var = (yy3) obj2;
                ex8 ex8Var2 = (ex8) obj;
                ex8Var2.getClass();
                yy3Var.f().execute(new xy3(yy3Var, ex8Var2, i3));
                return Unit.a;
        }
    }
}
