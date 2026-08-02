package com.vk.poll.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollFilterParams;
import com.vk.poll.fragments.PollUserListFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ae2;
import xsna.ah50;
import xsna.b6l;
import xsna.gzs;
import xsna.itb0;
import xsna.izs;
import xsna.jai;
import xsna.kai;
import xsna.mc90;
import xsna.mut0;
import xsna.ncb;
import xsna.oz50;
import xsna.pg;
import xsna.q630;
import xsna.rg50;
import xsna.rrv0;
import xsna.s3q0;
import xsna.sbh;
import xsna.spj;
import xsna.txj0;
import xsna.wak0;
import xsna.wh50;
import xsna.wzs;
import xsna.xak0;
import xsna.y4i0;
import xsna.y6c;
import xsna.yvj;
import xsna.zak0;

/* compiled from: PollVotersFragment.kt */
/* loaded from: classes17.dex */
public final class PollVotersFragment extends BaseFragment implements PollUserListFragment.e {
    public static final /* synthetic */ int a0 = 0;
    public final rg50 S = i.a(0);
    public final ah50 T = j.a(0);
    public final wh50 U = k.b(UserId.d);
    public final wh50 V = k.b(null);
    public final wh50 W = k.b(null);
    public final wh50 X = k.b(null);
    public final wh50 Y = k.b("");
    public final wh50 Z = k.b("");

    /* compiled from: PollVotersFragment.kt */
    public static final class a extends oz50 {
        public a(int i, long j, UserId userId, String str) {
            super(PollVotersFragment.class, null, null);
            this.j.putInt("poll_id", i);
            this.j.putLong("answer_id", j);
            this.j.putParcelable("owner_ud", userId);
            this.j.putString("answer_name", str);
        }
    }

    /* compiled from: PollVotersFragment.kt */
    @b6l(c = "com.vk.poll.fragments.PollVotersFragment$PollVotersContent$1$1$onFriendsTabClick$1$1$1", f = "PollVotersFragment.kt", l = {134}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc90 mc90Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$pagerState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                this.label = 1;
                if (mc90.g(mc90Var, 1, null, this, 6) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PollVotersFragment.kt */
    @b6l(c = "com.vk.poll.fragments.PollVotersFragment$PollVotersContent$1$1$onVotersTabClick$1$1$1", f = "PollVotersFragment.kt", l = {129}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc90 mc90Var, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$pagerState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                this.label = 1;
                if (mc90.g(mc90Var, 0, null, this, 6) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    @Override // com.vk.poll.fragments.PollUserListFragment.e
    public final void T9(int i, boolean z) {
        if (z) {
            ((zak0) this.Z).setValue(getResources().getQuantityString(R.plurals.poll_friends, i, Integer.valueOf(i)));
        } else {
            ((zak0) this.Y).setValue(getResources().getQuantityString(R.plurals.poll_votes, i, Integer.valueOf(i)));
        }
    }

    public final void io(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final y4i0 y4i0Var, final boolean z) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(1562669435);
        if ((i & 6) == 0) {
            i2 = (M.J(y4i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1562669435, i2, -1, "com.vk.poll.fragments.PollVotersFragment.PollSegment (PollVotersFragment.kt:192)");
            }
            int i3 = i2 >> 6;
            y4i0Var.c(z2, gzsVar, kai.c(1232155093, new sbh(str, 2), M), null, M, (i3 & 112) | (i3 & 14) | 384 | ((i2 << 12) & 57344), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ktb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    ((Integer) obj2).intValue();
                    int i4 = PollVotersFragment.a0;
                    PollVotersFragment.this.io(ne7.I(i | 1), aVar2, str, gzsVar, y4i0Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public final void jo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-411056749);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-411056749, i2, -1, "com.vk.poll.fragments.PollVotersFragment.PollVotersContent (PollVotersFragment.kt:112)");
            }
            rrv0.d(null, null, null, null, kai.c(1600647864, new pg(this, 7), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new y6c(this, i, 11);
        }
    }

    public final void ko(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1904619765);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1904619765, i2, -1, "com.vk.poll.fragments.PollVotersFragment.VotedUserListFragment (PollVotersFragment.kt:172)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new itb0(this, z);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.jtb0
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i3 = PollVotersFragment.a0;
                    int I = ne7.I(7);
                    PollVotersFragment.this.ko(this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final String lo(int i) {
        if (i == 0) {
            return mo() == null ? getString(R.string.poll_vote_cap) : getResources().getQuantityString(R.plurals.poll_votes, mo().intValue(), mo());
        }
        if (i != 1) {
            return mo() == null ? getResources().getString(R.string.poll_vote_cap) : getResources().getQuantityString(R.plurals.poll_votes, mo().intValue(), mo());
        }
        wh50 wh50Var = this.X;
        return ((Integer) ((zak0) wh50Var).getValue()) == null ? getResources().getString(R.string.poll_friend_cap) : getResources().getQuantityString(R.plurals.poll_friends, ((Integer) ((zak0) wh50Var).getValue()).intValue(), (Integer) ((zak0) wh50Var).getValue());
    }

    public final Integer mo() {
        return (Integer) ((zak0) this.W).getValue();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ((wak0) this.S).C(arguments.getInt("poll_id"));
            ((xak0) this.T).p(arguments.getLong("answer_id"));
            UserId userId = (UserId) arguments.getParcelable("owner_ud");
            if (userId == null) {
                userId = UserId.d;
            }
            ((zak0) this.U).setValue(userId);
            ((zak0) this.V).setValue((PollFilterParams) arguments.getParcelable("filter"));
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.containsKey("votes_count")) {
            Bundle arguments3 = getArguments();
            ((zak0) this.W).setValue(arguments3 != null ? Integer.valueOf(arguments3.getInt("votes_count")) : null);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && arguments4.containsKey("friends_count")) {
            Bundle arguments5 = getArguments();
            ((zak0) this.X).setValue(arguments5 != null ? Integer.valueOf(arguments5.getInt("friends_count")) : null);
        }
        ((zak0) this.Y).setValue(lo(0));
        ((zak0) this.Z).setValue(lo(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(-268079712, new ncb(this, 13), true));
        return composeView;
    }
}
