package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.feed.MediaPostFeedbackBottomSheet;
import com.sofascore.results.feed.compose.model.FeedbackType;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ex7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedFragment b;

    public /* synthetic */ ex7(FeedFragment feedFragment, int i) {
        this.a = i;
        this.b = feedFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final FeedFragment feedFragment = this.b;
        int i2 = 2;
        final int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    tol.b(khb.a.a(feedFragment), yqo.H(-1432739841, av8Var, new ex7(feedFragment, i3)), av8Var, 56);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    haa.f(yqo.H(1681885562, av8Var2, new ex7(feedFragment, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    my7 C = feedFragment.C();
                    zqb zqbVar = (zqb) feedFragment.t.getValue();
                    rr7 rr7Var = (rr7) feedFragment.s.getValue();
                    boolean i4 = av8Var3.i(feedFragment);
                    Object O = av8Var3.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        final int i5 = r1 ? 1 : 0;
                        O = new Function1() { // from class: gx7
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
                            
                                r9 = "";
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj3) {
                                String str;
                                int i6;
                                String str2;
                                String str3;
                                String str4;
                                iy7 b;
                                int i7 = i5;
                                FeedFragment feedFragment2 = feedFragment;
                                switch (i7) {
                                    case 0:
                                        gy7 gy7Var = (gy7) obj3;
                                        gy7Var.getClass();
                                        FeedbackType feedbackType = (FeedbackType) CollectionsKt.Z(gy7Var.a);
                                        if (feedbackType == null) {
                                            break;
                                        } else {
                                            int i8 = feedbackType.c;
                                            int i9 = l94.C;
                                            Context requireContext = feedFragment2.requireContext();
                                            requireContext.getClass();
                                            krk krkVar = feedFragment2.l;
                                            krkVar.getClass();
                                            View view = ((ko8) krkVar).c;
                                            String string = feedFragment2.getString(R.string.feed_not_interested_confirmation_toast);
                                            string.getClass();
                                            l94 x = wxf.x(requireContext, view, string, feedFragment2.requireContext().getColor(R.color.surface_1), feedFragment2.requireContext().getColor(R.color.surface_T), null, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, new n37(27, feedFragment2, gy7Var), 352);
                                            hp5 hp5Var = new hp5(feedFragment2, i8, x, 4);
                                            View childAt = x.i.getChildAt(0);
                                            n94 n94Var = childAt instanceof n94 ? (n94) childAt : null;
                                            if (n94Var != null) {
                                                n94Var.setActionListener(hp5Var);
                                            }
                                            krk krkVar2 = feedFragment2.l;
                                            krkVar2.getClass();
                                            x.h(((ko8) krkVar2).c);
                                            x.i();
                                            break;
                                        }
                                    default:
                                        w31 w31Var = (w31) obj3;
                                        w31Var.getClass();
                                        feedFragment2.C();
                                        Context requireContext2 = feedFragment2.requireContext();
                                        requireContext2.getClass();
                                        xbb b2 = a.b();
                                        uak uakVar = w31Var instanceof uak ? (uak) w31Var : null;
                                        String str5 = (uakVar == null || (b = uakVar.b()) == null) ? null : b.b;
                                        if (str5 == null) {
                                            bx7 h = w31Var.h();
                                            str5 = h != null ? h.e : null;
                                        }
                                        axi axiVar = w31Var instanceof axi ? (axi) w31Var : null;
                                        fy7 c = axiVar != null ? axiVar.c() : null;
                                        kre kreVar = w31Var instanceof kre ? (kre) w31Var : null;
                                        ux7 player = kreVar != null ? kreVar.getPlayer() : null;
                                        String str6 = w31Var instanceof f41 ? "stacked_card" : "non_stacked_card";
                                        String j = w31Var.j();
                                        if (j != null) {
                                            String lowerCase = wyh.c(requireContext2, j).toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            b2.add(new FeedbackType(R.string.feed_not_interested_sport, w31Var.getG(), lowerCase, str6, SearchResponseKt.SPORT_ENTITY, w31Var.f().d));
                                        }
                                        bx7 h2 = w31Var.h();
                                        String str7 = (h2 == null || (str4 = h2.d) == null) ? str5 : str4;
                                        if (str7 != null) {
                                            b2.add(new FeedbackType(R.string.feed_not_interested_league, w31Var.getG(), str7, str6, "league", w31Var.f().d));
                                        }
                                        if (c != null) {
                                            if ((i6 = c.d) != 1) {
                                                str3 = str2;
                                                break;
                                            } else {
                                                str3 = str2;
                                                break;
                                            }
                                            b2.add(new FeedbackType(i6 == 1 ? R.string.feed_not_interested_player : R.string.feed_not_interested_team, w31Var.getG(), str3, str6, "team", w31Var.f().d));
                                        }
                                        if (player != null && (str = player.b) != null) {
                                            b2.add(new FeedbackType(R.string.feed_not_interested_player, w31Var.getG(), str, str6, SearchResponseKt.PLAYER_ENTITY, w31Var.f().d));
                                        }
                                        xbb a = a.a(b2);
                                        if (!a.isEmpty() && feedFragment2.getChildFragmentManager().F("feedbackBottomSheet") == null) {
                                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a);
                                            MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet = new MediaPostFeedbackBottomSheet();
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelableArrayList("FEEDBACK_ITEMS", arrayList);
                                            mediaPostFeedbackBottomSheet.setArguments(bundle);
                                            mediaPostFeedbackBottomSheet.p(feedFragment2.getChildFragmentManager(), "feedbackBottomSheet");
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean i6 = av8Var3.i(feedFragment);
                    Object O2 = av8Var3.O();
                    if (i6 || O2 == a99Var) {
                        O2 = new Function1() { // from class: gx7
                            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
                            
                                r9 = "";
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj3) {
                                String str;
                                int i62;
                                String str2;
                                String str3;
                                String str4;
                                iy7 b;
                                int i7 = i3;
                                FeedFragment feedFragment2 = feedFragment;
                                switch (i7) {
                                    case 0:
                                        gy7 gy7Var = (gy7) obj3;
                                        gy7Var.getClass();
                                        FeedbackType feedbackType = (FeedbackType) CollectionsKt.Z(gy7Var.a);
                                        if (feedbackType == null) {
                                            break;
                                        } else {
                                            int i8 = feedbackType.c;
                                            int i9 = l94.C;
                                            Context requireContext = feedFragment2.requireContext();
                                            requireContext.getClass();
                                            krk krkVar = feedFragment2.l;
                                            krkVar.getClass();
                                            View view = ((ko8) krkVar).c;
                                            String string = feedFragment2.getString(R.string.feed_not_interested_confirmation_toast);
                                            string.getClass();
                                            l94 x = wxf.x(requireContext, view, string, feedFragment2.requireContext().getColor(R.color.surface_1), feedFragment2.requireContext().getColor(R.color.surface_T), null, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, new n37(27, feedFragment2, gy7Var), 352);
                                            hp5 hp5Var = new hp5(feedFragment2, i8, x, 4);
                                            View childAt = x.i.getChildAt(0);
                                            n94 n94Var = childAt instanceof n94 ? (n94) childAt : null;
                                            if (n94Var != null) {
                                                n94Var.setActionListener(hp5Var);
                                            }
                                            krk krkVar2 = feedFragment2.l;
                                            krkVar2.getClass();
                                            x.h(((ko8) krkVar2).c);
                                            x.i();
                                            break;
                                        }
                                    default:
                                        w31 w31Var = (w31) obj3;
                                        w31Var.getClass();
                                        feedFragment2.C();
                                        Context requireContext2 = feedFragment2.requireContext();
                                        requireContext2.getClass();
                                        xbb b2 = a.b();
                                        uak uakVar = w31Var instanceof uak ? (uak) w31Var : null;
                                        String str5 = (uakVar == null || (b = uakVar.b()) == null) ? null : b.b;
                                        if (str5 == null) {
                                            bx7 h = w31Var.h();
                                            str5 = h != null ? h.e : null;
                                        }
                                        axi axiVar = w31Var instanceof axi ? (axi) w31Var : null;
                                        fy7 c = axiVar != null ? axiVar.c() : null;
                                        kre kreVar = w31Var instanceof kre ? (kre) w31Var : null;
                                        ux7 player = kreVar != null ? kreVar.getPlayer() : null;
                                        String str6 = w31Var instanceof f41 ? "stacked_card" : "non_stacked_card";
                                        String j = w31Var.j();
                                        if (j != null) {
                                            String lowerCase = wyh.c(requireContext2, j).toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            b2.add(new FeedbackType(R.string.feed_not_interested_sport, w31Var.getG(), lowerCase, str6, SearchResponseKt.SPORT_ENTITY, w31Var.f().d));
                                        }
                                        bx7 h2 = w31Var.h();
                                        String str7 = (h2 == null || (str4 = h2.d) == null) ? str5 : str4;
                                        if (str7 != null) {
                                            b2.add(new FeedbackType(R.string.feed_not_interested_league, w31Var.getG(), str7, str6, "league", w31Var.f().d));
                                        }
                                        if (c != null) {
                                            if ((i62 = c.d) != 1) {
                                                str3 = str2;
                                                break;
                                            } else {
                                                str3 = str2;
                                                break;
                                            }
                                            b2.add(new FeedbackType(i62 == 1 ? R.string.feed_not_interested_player : R.string.feed_not_interested_team, w31Var.getG(), str3, str6, "team", w31Var.f().d));
                                        }
                                        if (player != null && (str = player.b) != null) {
                                            b2.add(new FeedbackType(R.string.feed_not_interested_player, w31Var.getG(), str, str6, SearchResponseKt.PLAYER_ENTITY, w31Var.f().d));
                                        }
                                        xbb a = a.a(b2);
                                        if (!a.isEmpty() && feedFragment2.getChildFragmentManager().F("feedbackBottomSheet") == null) {
                                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a);
                                            MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet = new MediaPostFeedbackBottomSheet();
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelableArrayList("FEEDBACK_ITEMS", arrayList);
                                            mediaPostFeedbackBottomSheet.setArguments(bundle);
                                            mediaPostFeedbackBottomSheet.p(feedFragment2.getChildFragmentManager(), "feedbackBottomSheet");
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(O2);
                    }
                    Function1 function12 = (Function1) O2;
                    boolean i7 = av8Var3.i(feedFragment);
                    Object O3 = av8Var3.O();
                    if (i7 || O3 == a99Var) {
                        O3 = new ex7(feedFragment, 3);
                        av8Var3.n0(O3);
                    }
                    Function2 function2 = (Function2) O3;
                    boolean i8 = av8Var3.i(feedFragment);
                    Object O4 = av8Var3.O();
                    if (i8 || O4 == a99Var) {
                        O4 = new fx7(feedFragment, i2);
                        av8Var3.n0(O4);
                    }
                    cy7.b(C, zqbVar, rr7Var, function1, function12, function2, (Function0) O4, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                Integer num = (Integer) obj;
                int intValue4 = num.intValue();
                Highlight highlight = (Highlight) obj2;
                highlight.getClass();
                Context requireContext = feedFragment.requireContext();
                requireContext.getClass();
                yu yuVar = yu.HIGHLIGHTS;
                zu[] zuVarArr = zu.a;
                nv.g0(requireContext, yuVar, num, "feed", "feed", "youtube");
                FragmentActivity requireActivity = feedFragment.requireActivity();
                requireActivity.getClass();
                uaa.y(requireActivity, intValue4, highlight, "Feed", true);
                break;
        }
        return Unit.a;
    }
}
