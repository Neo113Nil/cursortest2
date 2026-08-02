package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.a;
import com.blaze.blazesdk.features.moments.widgets.base.BlazeBaseMomentsWidget;
import com.blaze.blazesdk.features.moments.widgets.grid.BlazeMomentsWidgetGridView;
import com.blaze.blazesdk.features.stories.widgets.base.BlazeBaseStoryWidget;
import com.blaze.blazesdk.features.stories.widgets.grid.BlazeStoriesWidgetGridView;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.widgets.base.BlazeBaseVideosWidget;
import com.blaze.blazesdk.features.videos.widgets.grid.BlazeVideosWidgetGridView;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFromKt;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ix1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ix1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Unit registerLifecycleObserver$lambda$2$lambda$1;
        int i;
        Unit unit;
        List list;
        a64 a64Var;
        int i2 = this.a;
        a aVar = null;
        zjd zjdVar = null;
        Object obj = null;
        r3 = null;
        String str = null;
        i iVar = null;
        r3 = null;
        String str2 = null;
        r3 = null;
        String str3 = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                return BlazeBaseInlinePlayerContainer.a((u6b) obj2, (gtl) obj3);
            case 1:
                BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration = (BlazeMomentsPlaybackConfiguration) obj3;
                int i3 = BlazeBaseMomentsWidget.s;
                qpm viewModel = ((BlazeBaseMomentsWidget) obj2).getViewModel();
                if (blazeMomentsPlaybackConfiguration != null) {
                    viewModel.getClass();
                    aVar = new a(blazeMomentsPlaybackConfiguration.getLoopBehavior());
                }
                viewModel.r = aVar;
                return Unit.a;
            case 2:
                BlazeBaseMomentsWidget blazeBaseMomentsWidget = (BlazeBaseMomentsWidget) obj3;
                int i4 = BlazeBaseMomentsWidget.s;
                Integer resolveIndex = BlazeWidgetPlayFromKt.resolveIndex((BlazeWidgetPlayFrom) obj2, blazeBaseMomentsWidget.getViewModel().u());
                if (resolveIndex != null) {
                    int intValue = resolveIndex.intValue();
                    List u = blazeBaseMomentsWidget.getViewModel().u();
                    ipm ipmVar = (u == null || intValue >= u.size()) ? null : (ipm) u.get(intValue);
                    if (ipmVar != null) {
                        str3 = ipmVar.a;
                    }
                }
                if (str3 != null) {
                    blazeBaseMomentsWidget.f(str3, F.WIDGET_AUTO_PLAY);
                }
                return Unit.a;
            case 3:
                BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = (BlazeMomentsPlayerStyle) obj3;
                int i5 = BlazeBaseMomentsWidget.s;
                qpm viewModel2 = ((BlazeBaseMomentsWidget) obj2).getViewModel();
                viewModel2.getClass();
                blazeMomentsPlayerStyle.getClass();
                viewModel2.q = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle);
                return Unit.a;
            case 4:
                BlazeBaseStoryWidget blazeBaseStoryWidget = (BlazeBaseStoryWidget) obj3;
                int i6 = BlazeBaseStoryWidget.s;
                Integer resolveIndex2 = BlazeWidgetPlayFromKt.resolveIndex((BlazeWidgetPlayFrom) obj2, blazeBaseStoryWidget.getViewModel().u());
                if (resolveIndex2 != null) {
                    int intValue2 = resolveIndex2.intValue();
                    List u2 = blazeBaseStoryWidget.getViewModel().u();
                    ipm ipmVar2 = (u2 == null || intValue2 >= u2.size()) ? null : (ipm) u2.get(intValue2);
                    if (ipmVar2 != null) {
                        str2 = ipmVar2.a;
                    }
                }
                if (str2 != null) {
                    blazeBaseStoryWidget.f(str2, F.WIDGET_AUTO_PLAY);
                }
                return Unit.a;
            case 5:
                BlazeStoryPlayerStyle blazeStoryPlayerStyle = (BlazeStoryPlayerStyle) obj3;
                int i7 = BlazeBaseStoryWidget.s;
                lom viewModel3 = ((BlazeBaseStoryWidget) obj2).getViewModel();
                viewModel3.getClass();
                blazeStoryPlayerStyle.getClass();
                viewModel3.q = (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeStoryPlayerStyle);
                return Unit.a;
            case 6:
                BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration = (BlazeVideosPlaybackConfiguration) obj3;
                int i8 = BlazeBaseVideosWidget.s;
                som viewModel4 = ((BlazeBaseVideosWidget) obj2).getViewModel();
                i iVar2 = blazeVideosPlaybackConfiguration != null ? new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip()) : null;
                if (iVar2 != null) {
                    viewModel4.getClass();
                    iVar = i.copy$default(iVar2, false, false, null, 7, null);
                }
                viewModel4.s = iVar;
                return Unit.a;
            case 7:
                BlazeVideosPlayerStyle blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) obj3;
                int i9 = BlazeBaseVideosWidget.s;
                som viewModel5 = ((BlazeBaseVideosWidget) obj2).getViewModel();
                viewModel5.getClass();
                blazeVideosPlayerStyle.getClass();
                viewModel5.r = (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeVideosPlayerStyle);
                return Unit.a;
            case 8:
                BlazeBaseVideosWidget blazeBaseVideosWidget = (BlazeBaseVideosWidget) obj3;
                int i10 = BlazeBaseVideosWidget.s;
                Integer resolveIndex3 = BlazeWidgetPlayFromKt.resolveIndex((BlazeWidgetPlayFrom) obj2, blazeBaseVideosWidget.getViewModel().u());
                if (resolveIndex3 != null) {
                    int intValue3 = resolveIndex3.intValue();
                    List u3 = blazeBaseVideosWidget.getViewModel().u();
                    ipm ipmVar3 = (u3 == null || intValue3 >= u3.size()) ? null : (ipm) u3.get(intValue3);
                    if (ipmVar3 != null) {
                        str = ipmVar3.a;
                    }
                }
                if (str != null) {
                    blazeBaseVideosWidget.f(str, F.WIDGET_AUTO_PLAY);
                }
                return Unit.a;
            case 9:
                return BlazeBaseWidget.d((BlazeWidgetLayout) obj3, (BlazeBaseWidget) obj2);
            case 10:
                registerLifecycleObserver$lambda$2$lambda$1 = BlazeMomentsPlayerContainer.registerLifecycleObserver$lambda$2$lambda$1((u6b) obj2, (rq4) obj3);
                return registerLifecycleObserver$lambda$2$lambda$1;
            case 11:
                int i11 = BlazeMomentsWidgetGridView.w;
                return new GridLayoutManager(((BlazeMomentsWidgetGridView) obj3).getWidgetLayout().getUpdatedColumns());
            case 12:
                int i12 = BlazeStoriesWidgetGridView.w;
                return new GridLayoutManager(((BlazeStoriesWidgetGridView) obj3).getWidgetLayout().getUpdatedColumns());
            case 13:
                int i13 = BlazeVideosWidgetGridView.w;
                return new GridLayoutManager(((BlazeVideosWidgetGridView) obj3).getWidgetLayout().getUpdatedColumns());
            case 14:
                Bundle requireArguments = ((BaseModalBottomSheetDialog) obj3).requireArguments();
                requireArguments.getClass();
                return ((Function1) obj2).invoke(requireArguments);
            case 15:
                xbl xblVar = (xbl) obj2;
                WorkDatabase workDatabase = xblVar.c;
                workDatabase.getClass();
                workDatabase.runInTransaction(new r0(25, xblVar, (UUID) obj3));
                ssg.b(xblVar.b, xblVar.c, xblVar.e);
                return Unit.a;
            case 16:
                List list2 = (List) obj2;
                il2 il2Var = (il2) obj3;
                ArrayList arrayList = new ArrayList();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (!Intrinsics.c(((UniqueTournament) it.next()).getCompetitionType(), wk2.j.a) && (i = i + 1) < 0) {
                            b.p();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i == 1) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (!Intrinsics.c(((UniqueTournament) next).getCompetitionType(), wk2.j.a)) {
                                obj = next;
                            }
                        }
                    }
                    UniqueTournament uniqueTournament = (UniqueTournament) obj;
                    if (uniqueTournament != null) {
                        arrayList.add(new PickerItem.Tournament(wk2.h, uniqueTournament, Boolean.FALSE));
                    }
                } else {
                    ArrayList arrayList2 = il2Var.d;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((wk2) next2) != wk2.j) {
                            arrayList3.add(next2);
                        }
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        wk2 wk2Var = (wk2) it4.next();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list2) {
                            if (Intrinsics.c(((UniqueTournament) obj4).getCompetitionType(), wk2Var.a)) {
                                arrayList4.add(obj4);
                            }
                        }
                        PickerItem.Category category = new PickerItem.Category(wk2Var, arrayList4, true);
                        arrayList.add(category);
                        if (category.c) {
                            arrayList.addAll((List) category.d.getValue());
                        }
                    }
                    arrayList.add(0, new PickerItem.Tournament(wk2.h, null, Boolean.TRUE));
                }
                return arrayList;
            case 17:
                ChatMessageInputView chatMessageInputView = (ChatMessageInputView) obj2;
                h1 h1Var = (h1) obj3;
                int i14 = ChatMessageInputView.x;
                Context context = chatMessageInputView.getContext();
                context.getClass();
                kv kvVar = kv.CLICK;
                String str4 = chatMessageInputView.f ? "classic_view" : null;
                if (str4 == null) {
                    str4 = "compact_view";
                }
                nv.z0(context, kvVar, str4, "chat");
                chatMessageInputView.f = !chatMessageInputView.f;
                h1Var.invoke(Boolean.FALSE);
                return Unit.a;
            case 18:
                int i15 = TeamActivity.Z;
                Context context2 = ((ImageView) obj2).getContext();
                context2.getClass();
                jle.r(context2, ((Team) obj3).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 19:
                unit = CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0((CommonInitAwaitingGetHeaderBiddingToken) obj2, (String) obj3);
                return unit;
            case 20:
                ((Function1) obj2).invoke((t83) obj3);
                return Unit.a;
            case 21:
                return kotlin.collections.a.c(new Pair((bz7) obj2, (KClass) obj3));
            case 22:
                Context context3 = (Context) obj3;
                Integer intOrNull = StringsKt.toIntOrNull((String) ((e1d) obj2).getValue());
                if (intOrNull != null) {
                    int intValue4 = intOrNull.intValue();
                    wxf wxfVar = EventActivity.h0;
                    wxf.B(context3, intValue4, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 23:
                Boolean bool = (Boolean) ((Function1) obj2).invoke((qug) obj3);
                bool.booleanValue();
                return bool;
            case 24:
                Boolean bool2 = (Boolean) ((Function1) obj2).invoke((ksa) obj3);
                bool2.booleanValue();
                return bool2;
            case 25:
                av8 av8Var = ((qg3) obj2).a;
                jlh jlhVar = av8Var.c;
                ilh m = jlhVar.m();
                int i16 = 0;
                while (i16 < jlhVar.b) {
                    try {
                        if (m.l(i16)) {
                            Object n = m.n(i16);
                            if (n != obj3) {
                                ev8 ev8Var = n instanceof ev8 ? (ev8) n : null;
                                if ((ev8Var != null ? ev8Var.a : null) == obj3) {
                                }
                            }
                            zjd zjdVar2 = new zjd(i16, null);
                            m.c();
                            zjdVar = zjdVar2;
                            if (zjdVar != null) {
                                int i17 = zjdVar.a;
                                Integer num = zjdVar.b;
                                ilh m2 = jlhVar.m();
                                try {
                                    ArrayList N = v9g.N(m2, i17, num);
                                    m2.c();
                                    list = CollectionsKt.w0(av8Var.H(), N);
                                } finally {
                                }
                            } else {
                                list = km5.a;
                            }
                            return new df3(list, av8Var.C);
                        }
                        int[] iArr = m.b;
                        int i18 = i16 + 1;
                        int d = (i18 < m.c ? iArr[(i18 * 5) + 4] : m.e) - llh.d(i16, iArr);
                        for (int i19 = 0; i19 < d; i19++) {
                            Object h = m.h(i16, i19);
                            if (h != obj3) {
                                ev8 ev8Var2 = h instanceof ev8 ? (ev8) h : null;
                                if ((ev8Var2 != null ? ev8Var2.a : null) != obj3) {
                                }
                            }
                            zjdVar = new zjd(i16, Integer.valueOf(i19));
                            if (zjdVar != null) {
                            }
                            return new df3(list, av8Var.C);
                        }
                        i16 = i18;
                    } finally {
                    }
                }
                Unit unit2 = Unit.a;
                if (zjdVar != null) {
                }
                return new df3(list, av8Var.C);
            case 26:
                ((Function1) obj2).invoke(((fsf) obj3).a);
                return Unit.a;
            case 27:
                ((Function1) obj2).invoke(((m44) obj3).c);
                return Unit.a;
            case 28:
                Function1 function1 = (Function1) obj3;
                CrowdsourcingIncidentType crowdsourcingIncidentType = ((i2h) CollectionsKt.Y(((l44) obj2).c)).a;
                if (crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card) {
                    a64Var = a64.c;
                } else {
                    if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Goal)) {
                        zzl.b();
                        return null;
                    }
                    a64Var = a64.a;
                }
                function1.invoke(a64Var);
                return Unit.a;
            default:
                CupTreeExtendedView cupTreeExtendedView = (CupTreeExtendedView) obj2;
                int i20 = CupTreeExtendedView.p;
                e1d e1dVar = cupTreeExtendedView.isExpanded;
                cupTreeExtendedView.setExpanded(!((Boolean) ((eoh) e1dVar).getValue()).booleanValue());
                Boolean bool3 = (Boolean) ((eoh) e1dVar).getValue();
                bool3.booleanValue();
                ((Function1) obj3).invoke(bool3);
                return Unit.a;
        }
    }
}
