package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.features.moments.widgets.grid.BlazeMomentsWidgetGridView;
import com.blaze.blazesdk.features.moments.widgets.row.BlazeMomentsWidgetRowView;
import com.blaze.blazesdk.features.stories.widgets.grid.BlazeStoriesWidgetGridView;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.appset.AppSetIdInfo;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.dialog.BaseSuggestChangesDialog;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.event.media.FullScreenVideoActivity;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.media.BaseMediaFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.graph.BasketballShotmapGraph;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class u2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a0, code lost:
    
        if (defpackage.y05.a(r13) == false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Boolean] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List<StageSportDriverSeasonData> bySeason;
        Unit invoke$lambda$1;
        Unit invoke$lambda$12;
        Unit show$lambda$7;
        int i = this.a;
        boolean z = true;
        rq3 rq3Var = null;
        rq3Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((v2) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                tga tgaVar = (tga) obj2;
                b bVar = (b) obj;
                bVar.getClass();
                tgaVar.N((String) CollectionsKt.h0(tgaVar.a), bVar);
                return Unit.a;
            case 2:
                b5 b5Var = (b5) obj2;
                Map.Entry entry = (Map.Entry) obj;
                x4 x4Var = b5.c;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == b5Var ? "(this Map)" : String.valueOf(key));
                sb.append(C4427z5.U);
                Object value = entry.getValue();
                sb.append(value != b5Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                AbstractStageTeamCareerFragment abstractStageTeamCareerFragment = (AbstractStageTeamCareerFragment) obj2;
                joa joaVar = abstractStageTeamCareerFragment.n;
                StageTeamHistoryResponse stageTeamHistoryResponse = (StageTeamHistoryResponse) obj;
                if (stageTeamHistoryResponse != null && (bySeason = stageTeamHistoryResponse.getBySeason()) != null) {
                    rq3Var = Boolean.valueOf(!bySeason.isEmpty());
                }
                if (Intrinsics.c(rq3Var, Boolean.TRUE)) {
                    if (((k8i) joaVar.getValue()).getItemCount() == 0) {
                        r1.p(((k8i) joaVar.getValue()).g.size(), (LinearLayout) abstractStageTeamCareerFragment.o.getValue());
                        g7.o((k8i) joaVar.getValue(), (LinearLayout) abstractStageTeamCareerFragment.p.getValue(), 6);
                    }
                    ((k8i) joaVar.getValue()).F(abstractStageTeamCareerFragment.A(stageTeamHistoryResponse));
                }
                return Unit.a;
            case 4:
                invoke$lambda$1 = AdRevenueObserver.invoke$lambda$1((AdRevenueObserver) obj2, (Throwable) obj);
                return invoke$lambda$1;
            case 5:
                ph phVar = (ph) obj2;
                phVar.q.invoke((d8j) obj, tgj.x(phVar, nz.b));
                return Unit.a;
            case 6:
                AdditionalOddsFragment additionalOddsFragment = (AdditionalOddsFragment) obj2;
                ai aiVar = (ai) obj;
                aiVar.getClass();
                if (aiVar.equals(zh.a)) {
                    ((dsi) additionalOddsFragment.s.getValue()).f(rd6.d);
                } else {
                    kk kkVar = (kk) additionalOddsFragment.t.getValue();
                    if (aiVar instanceof yh) {
                        ynb.m(kkVar, new r3(kkVar, rq3Var, r2 ? 1 : 0));
                    }
                }
                return Unit.a;
            case 7:
                invoke$lambda$12 = AndroidAppSetIdDataSource.invoke$lambda$1((AndroidAppSetIdDataSource) obj2, (AppSetIdInfo) obj);
                return invoke$lambda$12;
            case 8:
                ((b4h) obj).a(f3h.a, new e3h(k69.a, ((pnd) obj2).a(), d3h.b, true));
                return Unit.a;
            case 9:
                show$lambda$7 = AndroidFullscreenWebViewAdPlayer.show$lambda$7((AndroidFullscreenWebViewAdPlayer) obj2, (Throwable) obj);
                return show$lambda$7;
            case 10:
                pk0 pk0Var = (pk0) obj2;
                p33 p33Var = (p33) obj;
                p33Var.getClass();
                fdi fdiVar = pk0Var.e;
                a8p a8pVar = pk0Var.o;
                if (((Boolean) fdiVar.getValue()).booleanValue()) {
                    Handler handler = (Handler) pk0Var.n.getValue();
                    handler.removeCallbacks(a8pVar);
                    ((AtomicReference) a8pVar.b).set(p33Var);
                    handler.post(a8pVar);
                } else {
                    Iterator it = pk0Var.l.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(p33Var);
                    }
                }
                return Unit.a;
            case 11:
                return Boolean.valueOf(Intrinsics.c(((e7d) obj).b, ((e7d) obj2).b));
            case 12:
                BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) obj2;
                r16 r16Var = (r16) obj;
                r16Var.getClass();
                r9b r9bVar = r16Var.a;
                hzd hzdVar = r9bVar.a;
                if (hzdVar != null) {
                    FragmentActivity requireActivity = baseEventLineupsFragment.requireActivity();
                    requireActivity.getClass();
                    PlayerEventStatisticsModal c = jpe.c(hzdVar, null);
                    AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                    if (appCompatActivity != null) {
                        me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                    }
                } else {
                    int i2 = PlayerActivity.Z;
                    Context requireContext = baseEventLineupsFragment.requireContext();
                    requireContext.getClass();
                    jle.q(requireContext, r9bVar.b, r9bVar.c, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                }
                return Unit.a;
            case 13:
                Enum r14 = (Enum) obj;
                r14.getClass();
                return Boolean.valueOf(r14.ordinal() == ((Enum) obj2).ordinal());
            case 14:
                zbc zbcVar = (zbc) obj;
                zbcVar.getClass();
                return zbc.a(zbcVar, 0, null, null, (gec) obj2, null, false, 55);
            case 15:
                BaseMediaFragment baseMediaFragment = (BaseMediaFragment) obj2;
                f2c f2cVar = (f2c) obj;
                f2cVar.getClass();
                if (f2cVar instanceof w1c) {
                    Context requireContext2 = baseMediaFragment.requireContext();
                    requireContext2.getClass();
                    yu yuVar = yu.HIGHLIGHTS;
                    Integer valueOf = Integer.valueOf(baseMediaFragment.D());
                    String C = baseMediaFragment.C();
                    r5c r5cVar = ((w1c) f2cVar).a;
                    Highlight highlight = r5cVar.a;
                    Highlight highlight2 = r5cVar.a;
                    nv.g0(requireContext2, yuVar, valueOf, C, U3.i.I0, rfo.s(highlight));
                    FragmentActivity requireActivity2 = baseMediaFragment.requireActivity();
                    requireActivity2.getClass();
                    Integer num = r5cVar.e;
                    int intValue = num != null ? num.intValue() : 0;
                    w41 E = baseMediaFragment.E();
                    String url = highlight2.getUrl();
                    E.getClass();
                    url.getClass();
                    mqi mqiVar = qhi.a;
                    if (qhi.c(url, false) != null || qhi.c(url, true) != null) {
                        Boolean bool = y05.a;
                        Context requireContext3 = baseMediaFragment.requireContext();
                        requireContext3.getClass();
                        break;
                    }
                    z = false;
                    uaa.y(requireActivity2, intValue, highlight2, "Event - media fragment", z);
                } else if (f2cVar instanceof e2c) {
                    Context requireContext4 = baseMediaFragment.requireContext();
                    requireContext4.getClass();
                    yu yuVar2 = yu.CLIPS;
                    Integer valueOf2 = Integer.valueOf(baseMediaFragment.D());
                    String C2 = baseMediaFragment.C();
                    zu[] zuVarArr = zu.a;
                    nv.g0(requireContext4, yuVar2, valueOf2, C2, U3.i.I0, "wsc");
                    Context requireContext5 = baseMediaFragment.requireContext();
                    requireContext5.getClass();
                    WSCStory wSCStory = ((e2c) f2cVar).a.a;
                    WSCGameData game = wSCStory.getGame();
                    nv.A0(requireContext5, game != null ? Integer.valueOf(game.getEventId()) : null, ia9.DETAILS);
                    String storyUrl = wSCStory.getStoryUrl();
                    if (storyUrl != null) {
                        Context requireContext6 = baseMediaFragment.requireContext();
                        requireContext6.getClass();
                        p4h.w(requireContext6, storyUrl);
                    }
                } else if (f2cVar instanceof a2c) {
                    Context requireContext7 = baseMediaFragment.requireContext();
                    requireContext7.getClass();
                    yu yuVar3 = yu.SOCIAL;
                    l4k l4kVar = ((a2c) f2cVar).a;
                    Integer valueOf3 = Integer.valueOf(l4kVar.b);
                    String str = l4kVar.c;
                    zu[] zuVarArr2 = zu.a;
                    nv.g0(requireContext7, yuVar3, valueOf3, str, U3.i.I0, "X");
                    Context requireContext8 = baseMediaFragment.requireContext();
                    requireContext8.getClass();
                    bea.G(requireContext8, l4kVar.i);
                } else if (f2cVar instanceof b2c) {
                    Context requireContext9 = baseMediaFragment.requireContext();
                    requireContext9.getClass();
                    yu yuVar4 = yu.SOCIAL;
                    l4k l4kVar2 = ((b2c) f2cVar).a;
                    Integer valueOf4 = Integer.valueOf(l4kVar2.b);
                    String str2 = l4kVar2.c;
                    zu[] zuVarArr3 = zu.a;
                    nv.g0(requireContext9, yuVar4, valueOf4, str2, U3.i.I0, "X");
                } else if (f2cVar instanceof c2c) {
                    int i3 = FullScreenVideoActivity.O;
                    Context requireContext10 = baseMediaFragment.requireContext();
                    requireContext10.getClass();
                    c2c c2cVar = (c2c) f2cVar;
                    String str3 = c2cVar.a;
                    String str4 = c2cVar.b;
                    long j = c2cVar.c;
                    Intent intent = new Intent(requireContext10, (Class<?>) FullScreenVideoActivity.class);
                    intent.putExtra("video_url", str3);
                    intent.putExtra("thumbnail_url", str4);
                    intent.putExtra("current_position", j);
                    requireContext10.startActivity(intent);
                } else if (f2cVar instanceof z1c) {
                    Context requireContext11 = baseMediaFragment.requireContext();
                    requireContext11.getClass();
                    nv.g0(requireContext11, yu.NEWS, Integer.valueOf(baseMediaFragment.D()), baseMediaFragment.C(), U3.i.I0, "rss");
                    String str5 = ((z1c) f2cVar).a;
                    Context requireContext12 = baseMediaFragment.requireContext();
                    requireContext12.getClass();
                    bea.G(requireContext12, str5);
                } else if (f2cVar instanceof y1c) {
                    Context requireContext13 = baseMediaFragment.requireContext();
                    requireContext13.getClass();
                    y1c y1cVar = (y1c) f2cVar;
                    nv.g0(requireContext13, yu.NEWS, Integer.valueOf(y1cVar.c), baseMediaFragment.C(), U3.i.I0, y1cVar.b);
                    String str6 = y1cVar.a;
                    if (str6 != null) {
                        Context requireContext14 = baseMediaFragment.requireContext();
                        requireContext14.getClass();
                        p4h.w(requireContext14, str6);
                    }
                } else if (f2cVar instanceof d2c) {
                    baseMediaFragment.u();
                } else if (!(f2cVar instanceof x1c)) {
                    zzl.b();
                    return null;
                }
                return Unit.a;
            case 16:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                ha5.g0(ymaVar, (o52) obj2, 0L, 0L, 0.55f, null, 24, 54);
                return Unit.a;
            case 17:
                BaseSuggestChangesDialog baseSuggestChangesDialog = (BaseSuggestChangesDialog) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Calendar calendar = ke0.a;
                    Context requireContext15 = baseSuggestChangesDialog.requireContext();
                    requireContext15.getClass();
                    ke0.f(R.string.thank_you_contribution, requireContext15);
                    baseSuggestChangesDialog.k(false, false);
                } else {
                    Calendar calendar2 = ke0.a;
                    Context requireContext16 = baseSuggestChangesDialog.requireContext();
                    requireContext16.getClass();
                    ke0.f(R.string.no_changes, requireContext16);
                }
                return Unit.a;
            case 18:
                ll1 ll1Var = (ll1) obj2;
                jl1 jl1Var = (jl1) obj;
                Class<?> cls = jl1Var != null ? jl1Var.getClass() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ll1Var);
                sb2.append(cls);
                return sb2.toString();
            case 19:
                Integer num2 = (Integer) obj;
                num2.getClass();
                Function1 function1 = ((wm1) obj2).g;
                if (function1 != null) {
                    function1.invoke(num2);
                }
                return Unit.a;
            case 20:
                return new le((ko1) obj2, 5);
            case 21:
                return new le((ykj) obj2, 7);
            case 22:
                List<ShotMapPoint> list = (List) obj;
                dd ddVar = ((jr1) obj2).e;
                if (ddVar != null) {
                    BasketballShotmapGraph basketballShotmapGraph = (BasketballShotmapGraph) ddVar.c;
                    list.getClass();
                    basketballShotmapGraph.setVisibility(list.isEmpty() ? 8 : 0);
                    basketballShotmapGraph.setShotmap(list);
                }
                return Unit.a;
            case 23:
                Context context = (Context) obj;
                context.getClass();
                ez0 f = ez0.f(LayoutInflater.from(context));
                ((SegmentedButtonsView) f.c).setVisibility(8);
                ((BasketballShotmapGraph) f.d).setShotmap(((zr1) obj2).o);
                return (LinearLayout) f.b;
            case 24:
                BellButton bellButton = (BellButton) obj2;
                ((Boolean) obj).getClass();
                int i4 = BellButton.h;
                Context context2 = bellButton.getContext();
                context2.getClass();
                if (f6a.F(context2)) {
                    Context context3 = bellButton.getContext();
                    context3.getClass();
                    zic.q(context3);
                }
                return Unit.a;
            case 25:
                int i5 = BettingTipsActivity.Q;
                ((Function0) ((BettingTipsActivity) obj2).N.getValue()).invoke();
                return Unit.a;
            case 26:
                return BlazeBaseInlinePlayerContainer.a((BlazeBaseInlinePlayerContainer) obj2, (rpl) obj);
            case 27:
                BlazeMomentsWidgetGridView blazeMomentsWidgetGridView = (BlazeMomentsWidgetGridView) obj2;
                ((Context) obj).getClass();
                return blazeMomentsWidgetGridView;
            case 28:
                BlazeMomentsWidgetRowView blazeMomentsWidgetRowView = (BlazeMomentsWidgetRowView) obj2;
                ((Context) obj).getClass();
                return blazeMomentsWidgetRowView;
            default:
                BlazeStoriesWidgetGridView blazeStoriesWidgetGridView = (BlazeStoriesWidgetGridView) obj2;
                ((Context) obj).getClass();
                return blazeStoriesWidgetGridView;
        }
    }
}
