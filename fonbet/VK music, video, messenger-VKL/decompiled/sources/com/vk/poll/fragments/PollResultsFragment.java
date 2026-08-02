package com.vk.poll.fragments;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.polls.dto.PollsGetExtraAgeDto;
import com.vk.api.generated.polls.dto.PollsGetExtraSexDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollFilterParams;
import com.vk.dto.polls.PollInfo;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.log.L;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.poll.views.PollFilterBottomView;
import com.vk.superapp.api.dto.common.SearchParams;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aqb0;
import xsna.asu0;
import xsna.b8v;
import xsna.bqz0;
import xsna.bu0;
import xsna.bwt0;
import xsna.ca10;
import xsna.cvk;
import xsna.e43;
import xsna.ee;
import xsna.es00;
import xsna.f6w;
import xsna.h03;
import xsna.h3p0;
import xsna.hs00;
import xsna.iub0;
import xsna.izs;
import xsna.jkg;
import xsna.jub0;
import xsna.kn20;
import xsna.kub0;
import xsna.lr;
import xsna.nub0;
import xsna.o060;
import xsna.og;
import xsna.orb0;
import xsna.oz50;
import xsna.pey;
import xsna.pp00;
import xsna.prb0;
import xsna.qq2;
import xsna.qt5;
import xsna.r2v;
import xsna.re40;
import xsna.rsg0;
import xsna.rte0;
import xsna.s3q0;
import xsna.tfx;
import xsna.tlo0;
import xsna.tq;
import xsna.u1u0;
import xsna.up;
import xsna.xhb0;
import xsna.yfb;
import xsna.yr00;
import xsna.ysg0;
import xsna.zrb0;
import xsna.zyu;

/* compiled from: PollResultsFragment.kt */
/* loaded from: classes17.dex */
public final class PollResultsFragment extends BaseFragment {
    public static final /* synthetic */ int b0 = 0;
    public Poll S;
    public PollInfo T;
    public orb0 U;
    public Toolbar V;
    public VkRecyclerPaginatedView W;
    public PollFilterBottomView X;
    public PollFilterParams Y = new PollFilterParams();
    public final b Z = new b();
    public final d a0 = new d();

    /* compiled from: PollResultsFragment.kt */
    public static final class b implements c.l<com.vk.dto.polls.a> {

        /* compiled from: PollResultsFragment.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.dto.polls.a, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(com.vk.dto.polls.a aVar) {
                PollResultsFragment pollResultsFragment = (PollResultsFragment) this.receiver;
                int i = PollResultsFragment.b0;
                pollResultsFragment.ko(aVar);
                return s3q0.a;
            }
        }

        /* compiled from: PollResultsFragment.kt */
        /* renamed from: com.vk.poll.fragments.PollResultsFragment$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C1521b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                Throwable th2 = th;
                PollResultsFragment pollResultsFragment = (PollResultsFragment) this.receiver;
                int i = PollResultsFragment.b0;
                pollResultsFragment.getClass();
                if (th2 instanceof VKApiExecutionException) {
                    rte0.n((VKApiExecutionException) th2, new f6w(18), prb0.b);
                } else {
                    h03.b(th2);
                }
                return s3q0.a;
            }
        }

        public b() {
        }

        @Override // com.vk.lists.c.k
        public final q<com.vk.dto.polls.a> hj(com.vk.lists.c cVar, boolean z) {
            PollResultsFragment pollResultsFragment = PollResultsFragment.this;
            return pollResultsFragment.jo(pollResultsFragment.Y);
        }

        @Override // com.vk.lists.c.l
        public final q<com.vk.dto.polls.a> ui(int i, com.vk.lists.c cVar) {
            PollResultsFragment pollResultsFragment = PollResultsFragment.this;
            return pollResultsFragment.jo(pollResultsFragment.Y);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<com.vk.dto.polls.a> qVar, boolean z, com.vk.lists.c cVar) {
            cVar.l(0);
            PollResultsFragment pollResultsFragment = PollResultsFragment.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new b8v(new a(1, pollResultsFragment, PollResultsFragment.class, "setupExtraWithCriteria", "setupExtraWithCriteria(Lcom/vk/dto/polls/PollExtraWithCriteria;)V", 0), 17), new ca10(new C1521b(1, pollResultsFragment, PollResultsFragment.class, "errorHandler", "errorHandler(Ljava/lang/Throwable;)V", 0), 10));
            if (subscribe != null) {
                pollResultsFragment.eo(subscribe);
            }
        }
    }

    /* compiled from: PollResultsFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<aqb0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(aqb0 aqb0Var) {
            aqb0 aqb0Var2 = aqb0Var;
            int i = aqb0Var2.c;
            PollResultsFragment pollResultsFragment = (PollResultsFragment) this.receiver;
            Poll poll = pollResultsFragment.S;
            if (poll != null && i != 0 && !poll.i) {
                PollVotersFragment.a i2 = nub0.a().i(poll.b, aqb0Var2.a, poll.c, aqb0Var2.b);
                Bundle bundle = i2.j;
                bundle.putInt("votes_count", i);
                bundle.putParcelable("filter", pollResultsFragment.Y);
                i2.k(pollResultsFragment.getActivity());
            }
            return s3q0.a;
        }
    }

    /* compiled from: PollResultsFragment.kt */
    public static final class d extends AbstractPaginatedView.i {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void e(ee eeVar, boolean z) {
            ((VkErrorView) eeVar).c(new com.vk.core.view.components.paging.list.a(null, new VkPlaceholder.b((tlo0) null, (tlo0) tq.h(tlo0.Companion, z ? R.string.error_access_denied_not_vote_result : R.string.liblists_err_text), (com.vk.core.compose.component.semantics.a) (0 == true ? 1 : 0), 11), !z ? new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.vk_common_retry), new pp00(eeVar, 20), null, null, null, null, null, false, null, 2044), (VkPlaceholder.a.C0854a) (0 == true ? 1 : 0), 6) : null, 1));
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void d(Throwable th) {
            VkRecyclerPaginatedView vkRecyclerPaginatedView = PollResultsFragment.this.W;
            ee errorView = vkRecyclerPaginatedView != null ? vkRecyclerPaginatedView.getErrorView() : null;
            if (errorView instanceof VkErrorView) {
                if (!(th instanceof VKApiExecutionException)) {
                    e(errorView, false);
                    return;
                }
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                VkErrorView vkErrorView = (VkErrorView) errorView;
                hs00 hs00Var = new hs00(vkErrorView, 19);
                if (vKApiExecutionException.R()) {
                    List<VKApiExecutionException> v = vKApiExecutionException.v();
                    if (v != null) {
                        Iterator<T> it = v.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) hs00Var.invoke((VKApiExecutionException) it.next())).booleanValue()) {
                                return;
                            }
                        }
                    }
                } else if (((Boolean) hs00Var.invoke(vKApiExecutionException)).booleanValue()) {
                    return;
                }
                e(vkErrorView, false);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public static final void oo(View view, boolean z) {
        if (z) {
            view.setTranslationY(PollFilterBottomView.h);
            view.setVisibility(0);
        }
        view.animate().translationY(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : PollFilterBottomView.h).setStartDelay(z ? 500L : 0L).setInterpolator(qq2.b).setDuration(225L).setListener(new e(view, z)).start();
    }

    public final boolean io() {
        if (requireArguments().getBoolean("filter_visible", true) && nub0.a().f()) {
            orb0 orb0Var = this.U;
            if (orb0Var == null) {
                orb0Var = null;
            }
            com.vk.dto.polls.a aVar = orb0Var.g;
            Poll poll = this.S;
            boolean z = (poll != null ? poll.h : 0) > 0;
            boolean z2 = (aVar != null ? aVar.b : null) != null;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m1 jo(PollFilterParams pollFilterParams) {
        PollsGetExtraAgeDto pollsGetExtraAgeDto;
        PollsGetExtraAgeDto pollsGetExtraAgeDto2;
        int i;
        PollsGetExtraSexDto pollsGetExtraSexDto;
        PollsGetExtraSexDto pollsGetExtraSexDto2;
        Integer valueOf;
        int i2;
        boolean z;
        tfx tfxVar;
        tfx tfxVar2;
        PollInfo pollInfo;
        PollInfo pollInfo2 = this.T;
        int i3 = (pollInfo2 == null ? null : pollInfo2).b;
        UserId userId = (pollInfo2 == null ? null : pollInfo2).c;
        if (pollInfo2 == null) {
            pollInfo2 = null;
        }
        boolean z2 = pollInfo2.d;
        List singletonList = Collections.singletonList("photo_base");
        int i4 = pollFilterParams.e;
        if (i4 == 2) {
            pollsGetExtraAgeDto = PollsGetExtraAgeDto.TYPE_2;
        } else {
            if (i4 != 3) {
                pollsGetExtraAgeDto2 = null;
                i = pollFilterParams.d;
                if (i != 1) {
                    pollsGetExtraSexDto = PollsGetExtraSexDto.TYPE_1;
                } else {
                    if (i != 2) {
                        pollsGetExtraSexDto2 = null;
                        int i5 = pollFilterParams.b;
                        valueOf = i5 != 0 ? Integer.valueOf(i5) : null;
                        tfx tfxVar3 = new tfx("polls.getExtra", new lr(28), new iub0(0));
                        tfx.l(tfxVar3, "poll_id", i3, 0, 0, 8);
                        if (userId != null) {
                            i2 = 3;
                            z = true;
                            tfxVar = tfxVar3;
                            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                        } else {
                            i2 = 3;
                            z = true;
                            tfxVar = tfxVar3;
                        }
                        tfxVar.j("is_board", z2);
                        tfxVar.f(5, 0, 100, "count");
                        tfxVar.i("fields", singletonList);
                        tfx.o(tfxVar, "name_case", "nom", 0, 0, 12);
                        tfxVar.j("extended", z);
                        if (pollsGetExtraAgeDto2 != null) {
                            tfxVar2 = tfxVar;
                            tfx.l(tfxVar2, "age", pollsGetExtraAgeDto2.i(), 0, 0, 12);
                        } else {
                            tfxVar2 = tfxVar;
                        }
                        if (pollsGetExtraSexDto2 != null) {
                            tfx.l(tfxVar2, "sex", pollsGetExtraSexDto2.i(), 0, 0, 12);
                        }
                        if (valueOf != null) {
                            tfx.l(tfxVar2, "city", valueOf.intValue(), 0, 0, 8);
                        }
                        l2 l0 = rsg0.l0(yfb.x(tfxVar2), null, i2);
                        kub0 kub0Var = new kub0();
                        pollInfo = this.T;
                        int i6 = (pollInfo == null ? null : pollInfo).b;
                        UserId userId2 = (pollInfo == null ? null : pollInfo).c;
                        if (pollInfo == null) {
                            pollInfo = null;
                        }
                        return q.I0(l0, rsg0.l0(yfb.x(jub0.a(kub0Var, i6, userId2, Boolean.valueOf(pollInfo.d), 96)), null, i2), new r2v(new jkg(this, 11), 11)).L(new up(new pey(17), 26), false).a0(asu0.a.d());
                    }
                    pollsGetExtraSexDto = PollsGetExtraSexDto.TYPE_2;
                }
                pollsGetExtraSexDto2 = pollsGetExtraSexDto;
                int i52 = pollFilterParams.b;
                if (i52 != 0) {
                }
                tfx tfxVar32 = new tfx("polls.getExtra", new lr(28), new iub0(0));
                tfx.l(tfxVar32, "poll_id", i3, 0, 0, 8);
                if (userId != null) {
                }
                tfxVar.j("is_board", z2);
                tfxVar.f(5, 0, 100, "count");
                tfxVar.i("fields", singletonList);
                tfx.o(tfxVar, "name_case", "nom", 0, 0, 12);
                tfxVar.j("extended", z);
                if (pollsGetExtraAgeDto2 != null) {
                }
                if (pollsGetExtraSexDto2 != null) {
                }
                if (valueOf != null) {
                }
                l2 l02 = rsg0.l0(yfb.x(tfxVar2), null, i2);
                kub0 kub0Var2 = new kub0();
                pollInfo = this.T;
                int i62 = (pollInfo == null ? null : pollInfo).b;
                UserId userId22 = (pollInfo == null ? null : pollInfo).c;
                if (pollInfo == null) {
                }
                return q.I0(l02, rsg0.l0(yfb.x(jub0.a(kub0Var2, i62, userId22, Boolean.valueOf(pollInfo.d), 96)), null, i2), new r2v(new jkg(this, 11), 11)).L(new up(new pey(17), 26), false).a0(asu0.a.d());
            }
            pollsGetExtraAgeDto = PollsGetExtraAgeDto.TYPE_3;
        }
        pollsGetExtraAgeDto2 = pollsGetExtraAgeDto;
        i = pollFilterParams.d;
        if (i != 1) {
        }
        pollsGetExtraSexDto2 = pollsGetExtraSexDto;
        int i522 = pollFilterParams.b;
        if (i522 != 0) {
        }
        tfx tfxVar322 = new tfx("polls.getExtra", new lr(28), new iub0(0));
        tfx.l(tfxVar322, "poll_id", i3, 0, 0, 8);
        if (userId != null) {
        }
        tfxVar.j("is_board", z2);
        tfxVar.f(5, 0, 100, "count");
        tfxVar.i("fields", singletonList);
        tfx.o(tfxVar, "name_case", "nom", 0, 0, 12);
        tfxVar.j("extended", z);
        if (pollsGetExtraAgeDto2 != null) {
        }
        if (pollsGetExtraSexDto2 != null) {
        }
        if (valueOf != null) {
        }
        l2 l022 = rsg0.l0(yfb.x(tfxVar2), null, i2);
        kub0 kub0Var22 = new kub0();
        pollInfo = this.T;
        int i622 = (pollInfo == null ? null : pollInfo).b;
        UserId userId222 = (pollInfo == null ? null : pollInfo).c;
        if (pollInfo == null) {
        }
        return q.I0(l022, rsg0.l0(yfb.x(jub0.a(kub0Var22, i622, userId222, Boolean.valueOf(pollInfo.d), 96)), null, i2), new r2v(new jkg(this, 11), 11)).L(new up(new pey(17), 26), false).a0(asu0.a.d());
    }

    public final void ko(com.vk.dto.polls.a aVar) {
        PollResultsFragment pollResultsFragment;
        Poll poll = aVar.c;
        this.S = poll;
        if (this.U == null) {
            pollResultsFragment = this;
            orb0 orb0Var = new orb0(poll, new c(1, pollResultsFragment, PollResultsFragment.class, "showVoters", "showVoters(Lcom/vk/dto/polls/PollExtraAnswer;)V", 0));
            pollResultsFragment.U = orb0Var;
            VkRecyclerPaginatedView vkRecyclerPaginatedView = pollResultsFragment.W;
            if (vkRecyclerPaginatedView != null) {
                vkRecyclerPaginatedView.setAdapter(orb0Var);
            }
        } else {
            pollResultsFragment = this;
        }
        orb0 orb0Var2 = pollResultsFragment.U;
        if (orb0Var2 == null) {
            orb0Var2 = null;
        }
        orb0Var2.g = aVar;
        orb0Var2.setItems(aVar.a.c);
        orb0Var2.notifyDataSetChanged();
        ysg0.b.a(new zrb0(aVar.c));
        if (io()) {
            return;
        }
        u1u0.d(this, pollResultsFragment.V);
    }

    public final void lo(PollFilterParams pollFilterParams) {
        if (!pollFilterParams.I()) {
            PollFilterParams pollFilterParams2 = new PollFilterParams();
            pollFilterParams2.b = pollFilterParams.b;
            pollFilterParams2.c = pollFilterParams.c;
            pollFilterParams2.d = pollFilterParams.d;
            pollFilterParams2.e = pollFilterParams.e;
            this.Y = pollFilterParams2;
        }
        no(PollFilterBottomView.Status.PROGRESS);
        eo(jo(pollFilterParams).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new zyu(new qt5(22, this, pollFilterParams), 19), new o060(new yr00(this, 20), 6)));
    }

    public final boolean mo() {
        com.vk.dto.polls.a aVar;
        bqz0 bqz0Var;
        orb0 orb0Var = this.U;
        if (orb0Var == null || (aVar = orb0Var.g) == null || (bqz0Var = aVar.b) == null) {
            return false;
        }
        nub0.a().e(bqz0Var, getActivity(), this.Y, getChildFragmentManager());
        return true;
    }

    public final void no(PollFilterBottomView.Status status) {
        String sb;
        Pair pair;
        PollFilterBottomView pollFilterBottomView;
        boolean I = this.Y.I();
        boolean z = !I;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.W;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.getRecyclerView().setPaddingRelative(vkRecyclerPaginatedView.getRecyclerView().getPaddingStart(), vkRecyclerPaginatedView.getRecyclerView().getPaddingTop(), vkRecyclerPaginatedView.getRecyclerView().getPaddingEnd(), !I ? PollFilterBottomView.g : 0);
        }
        PollFilterBottomView pollFilterBottomView2 = this.X;
        boolean z2 = (pollFilterBottomView2 != null ? pollFilterBottomView2.getVisibility() : -1) == 0;
        if (z != z2) {
            if (!I && !z2) {
                PollFilterBottomView pollFilterBottomView3 = this.X;
                if (pollFilterBottomView3 != null) {
                    oo(pollFilterBottomView3, true);
                }
            } else if (I && z2 && (pollFilterBottomView = this.X) != null) {
                oo(pollFilterBottomView, false);
            }
        }
        PollFilterBottomView pollFilterBottomView4 = this.X;
        if (pollFilterBottomView4 != null) {
            PollFilterParams pollFilterParams = this.Y;
            Context requireContext = requireContext();
            if (pollFilterParams.I()) {
                sb = null;
            } else {
                SearchParams.a aVar = new SearchParams.a();
                WebCity webCity = pollFilterParams.c;
                if (webCity != null) {
                    aVar.a(webCity.c);
                }
                int i = pollFilterParams.d;
                if (i == 2) {
                    aVar.a(requireContext.getString(R.string.poll_filter_gender_man_full));
                } else if (i == 1) {
                    aVar.a(requireContext.getString(R.string.poll_filter_gender_female_full));
                }
                int i2 = pollFilterParams.e;
                if (i2 == 2) {
                    aVar.a(requireContext.getString(R.string.poll_result_filter_age_18_plus));
                } else if (i2 == 3) {
                    aVar.a(requireContext.getString(R.string.poll_result_filter_age_36_plus));
                }
                sb = aVar.a.toString();
            }
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_error_circle_24);
            View view = pollFilterBottomView4.c;
            View view2 = pollFilterBottomView4.e;
            AppCompatImageView appCompatImageView = pollFilterBottomView4.d;
            if (status == PollFilterBottomView.Status.PROGRESS) {
                appCompatImageView.setVisibility(8);
                view2.setVisibility(0);
                view.setVisibility(8);
            } else {
                appCompatImageView.setVisibility(0);
                view2.setVisibility(8);
                view.setVisibility(status != PollFilterBottomView.Status.FAIL ? 8 : 0);
                int i3 = PollFilterBottomView.a.$EnumSwitchMapping$0[status.ordinal()];
                if (i3 == 1) {
                    Context context = e43.a;
                    pair = new Pair(valueOf, Integer.valueOf((context != null ? context : null).getColor(R.color.vk_red_nice)));
                } else if (i3 != 2) {
                    L.G("Incorrect status " + status);
                    Context context2 = e43.a;
                    pair = new Pair(valueOf, Integer.valueOf((context2 != null ? context2 : null).getColor(R.color.vk_red_nice)));
                } else {
                    Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_filter_24);
                    Context context3 = e43.a;
                    pair = new Pair(valueOf2, Integer.valueOf((context3 != null ? context3 : null).getColor(R.color.vk_blue_300)));
                }
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                appCompatImageView.setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_enabled}}, new int[]{intValue2, intValue2}));
                appCompatImageView.setImageResource(intValue);
            }
            pollFilterBottomView4.f.setText(sb);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.containsKey("poll_info") : false) {
            this.T = (PollInfo) requireArguments().getParcelable("poll_info");
            nub0.a().a(this, new kn20(this, 23));
        } else {
            cvk.u(R.string.error, false);
            finish();
            L.l("You can't see poll result without pollInfo");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.poll_results, menu);
        MenuItem findItem = menu.findItem(R.id.filters);
        if (findItem != null) {
            findItem.setVisible(io());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.poll_results_fragment, viewGroup, false);
        this.V = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.W = (VkRecyclerPaginatedView) inflate.findViewById(R.id.poll_result_list);
        this.X = (PollFilterBottomView) inflate.findViewById(R.id.poll_filter_bottom_view);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        this.W = null;
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = this.V;
        if (toolbar != null) {
            u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
            toolbar.setNavigationOnClickListener(new og(this, 5));
            h3p0.c(this, toolbar);
            toolbar.setTitle(R.string.poll_result_title);
            u1u0.d(this, toolbar);
            toolbar.setOnMenuItemClickListener(new xhb0(this, 1));
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.W;
        if (vkRecyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView);
            nub0.a().getClass();
            dVar.c(2);
            dVar.f = 1;
            dVar.a();
            vkRecyclerPaginatedView.setUiStateCallbacks(this.a0);
            vkRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
            c.h hVar = new c.h(this.Z);
            hVar.s = 0;
            f.a(hVar, vkRecyclerPaginatedView);
        }
        PollFilterBottomView pollFilterBottomView = this.X;
        if (pollFilterBottomView != null) {
            bwt0.i0(pollFilterBottomView, new es00(this, 21));
            pollFilterBottomView.setCancelClickListener(new bu0(24));
            pollFilterBottomView.setReplayClickListener(new re40(this, 9));
        }
    }

    /* compiled from: PollResultsFragment.kt */
    public static final class a extends oz50 {
        public a(Poll poll, boolean z) {
            this(new PollInfo(poll.b, poll.c, poll.j), z);
        }

        public a(PollInfo pollInfo, boolean z) {
            super(PollResultsFragment.class, null, null);
            this.j.putParcelable("poll_info", pollInfo);
            this.j.putBoolean("filter_visible", z);
        }
    }

    /* compiled from: PollResultsFragment.kt */
    public static final class e implements Animator.AnimatorListener {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ View c;

        public e(View view, boolean z) {
            this.b = z;
            this.c = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            View view = this.c;
            view.setVisibility(8);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
