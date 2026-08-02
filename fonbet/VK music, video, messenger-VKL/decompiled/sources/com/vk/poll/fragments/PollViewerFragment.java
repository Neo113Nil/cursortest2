package com.vk.poll.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import io.reactivex.rxjava3.core.q;
import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bg0;
import xsna.cub0;
import xsna.cvk;
import xsna.etb0;
import xsna.f4m;
import xsna.h03;
import xsna.h3p0;
import xsna.izs;
import xsna.j720;
import xsna.k7;
import xsna.nub0;
import xsna.o780;
import xsna.oz50;
import xsna.rsg0;
import xsna.s3q0;
import xsna.u1u0;
import xsna.u730;
import xsna.ysg0;
import xsna.zrb0;

/* compiled from: PollViewerFragment.kt */
/* loaded from: classes17.dex */
public final class PollViewerFragment extends BaseFragment {
    public static final /* synthetic */ int d0 = 0;
    public PollAttachment S;
    public int U;
    public boolean V;
    public Toolbar X;
    public View Y;
    public boolean Z;
    public VkRecyclerPaginatedView a0;
    public etb0 b0;
    public UserId T = UserId.d;
    public String W = "poll";
    public final b c0 = new b();

    /* compiled from: PollViewerFragment.kt */
    public static final class b implements c.l<PollAttachment> {

        /* compiled from: PollViewerFragment.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<PollAttachment, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(PollAttachment pollAttachment) {
                PollAttachment pollAttachment2 = pollAttachment;
                PollViewerFragment pollViewerFragment = (PollViewerFragment) this.receiver;
                pollViewerFragment.S = pollAttachment2;
                ysg0.b.a(new zrb0(pollAttachment2.f));
                Bundle arguments = pollViewerFragment.getArguments();
                if (arguments != null) {
                    arguments.putParcelable("poll_attachment", pollAttachment2);
                }
                Toolbar toolbar = pollViewerFragment.X;
                if (toolbar != null && toolbar.getVisibility() == 0) {
                    toolbar.getMenu().clear();
                    pollViewerFragment.onCreateOptionsMenu(toolbar.getMenu(), pollViewerFragment.kn().getMenuInflater());
                }
                etb0 etb0Var = pollViewerFragment.b0;
                if (etb0Var == null) {
                    etb0Var = null;
                }
                etb0Var.setItems(Collections.singletonList(pollAttachment2));
                return s3q0.a;
            }
        }

        /* compiled from: PollViewerFragment.kt */
        /* renamed from: com.vk.poll.fragments.PollViewerFragment$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C1522b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            public static final C1522b b = new C1522b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                h03.b(th);
                return s3q0.a;
            }
        }

        public b() {
        }

        @Override // com.vk.lists.c.k
        public final q<PollAttachment> hj(c cVar, boolean z) {
            UserId userId;
            PollViewerFragment pollViewerFragment = PollViewerFragment.this;
            PollAttachment pollAttachment = pollViewerFragment.S;
            if (pollAttachment != null && !z) {
                return q.T(pollAttachment);
            }
            if (pollAttachment == null || (userId = pollAttachment.f.c) == null) {
                userId = pollViewerFragment.T;
            }
            return rsg0.y0(new cub0(pollAttachment != null ? pollAttachment.f.b : pollViewerFragment.U, userId, pollAttachment != null ? pollAttachment.f.j : pollViewerFragment.V), null, null, 3);
        }

        @Override // com.vk.lists.c.l
        public final q<PollAttachment> ui(int i, c cVar) {
            PollViewerFragment pollViewerFragment = PollViewerFragment.this;
            PollAttachment pollAttachment = pollViewerFragment.S;
            if (pollAttachment != null) {
                return q.T(pollAttachment);
            }
            return rsg0.y0(new cub0(pollViewerFragment.U, pollViewerFragment.T, pollViewerFragment.V), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<PollAttachment> qVar, boolean z, c cVar) {
            cVar.l(0);
            PollViewerFragment pollViewerFragment = PollViewerFragment.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new j720(new a(1, pollViewerFragment, PollViewerFragment.class, "setupPoll", "setupPoll(Lcom/vkontakte/android/attachments/PollAttachment;)V", 0), 6), new o780(C1522b.b, 1));
            if (subscribe != null) {
                pollViewerFragment.eo(subscribe);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Poll poll;
        if (i2 == -1 && i == 10009 && intent != null && (poll = (Poll) intent.getParcelableExtra("poll")) != null) {
            PollAttachment pollAttachment = new PollAttachment(poll);
            etb0 etb0Var = this.b0;
            if (etb0Var == null) {
                etb0Var = null;
            }
            etb0Var.F0(this.S, pollAttachment);
            etb0 etb0Var2 = this.b0;
            (etb0Var2 != null ? etb0Var2 : null).notifyItemChanged(0);
            this.S = pollAttachment;
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putParcelable("poll_attachment", pollAttachment);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Bundle arguments;
        String str;
        Bundle arguments2;
        PollAttachment pollAttachment;
        Bundle arguments3;
        String string;
        super.onCreate(bundle);
        Bundle arguments4 = getArguments();
        boolean containsKey = arguments4 != null ? arguments4.containsKey("poll_attachment") : false;
        Bundle arguments5 = getArguments();
        this.Z = arguments5 != null ? arguments5.getBoolean("poll_disable_toolbar", false) : false;
        Bundle arguments6 = getArguments();
        if (arguments6 != null ? arguments6.containsKey("poll_id") : false) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null ? arguments7.containsKey("owner_id") : false) {
                Bundle arguments8 = getArguments();
                if (arguments8 != null ? arguments8.containsKey("is_board") : false) {
                    z = true;
                    if (containsKey && !z) {
                        cvk.u(R.string.error, false);
                        finish();
                        L.l("You can't open poll without PollAttachment or without id, ownerId and isBoard params");
                        return;
                    }
                    arguments = getArguments();
                    str = "poll";
                    if (arguments != null && (string = arguments.getString("ref", "poll")) != null) {
                        str = string;
                    }
                    this.W = str;
                    arguments2 = getArguments();
                    if (arguments2 != null || (pollAttachment = (PollAttachment) arguments2.getParcelable("poll_attachment")) == null) {
                        pollAttachment = null;
                    } else {
                        Poll poll = pollAttachment.f;
                        this.U = poll.b;
                        this.T = poll.c;
                        this.V = poll.j;
                    }
                    this.S = pollAttachment;
                    if (pollAttachment == null || (arguments3 = getArguments()) == null) {
                    }
                    this.U = arguments3.getInt("poll_id");
                    UserId userId = (UserId) arguments3.getParcelable("owner_id");
                    if (userId == null) {
                        userId = UserId.d;
                    }
                    this.T = userId;
                    this.V = arguments3.getBoolean("is_board");
                    return;
                }
            }
        }
        z = false;
        if (containsKey) {
        }
        arguments = getArguments();
        str = "poll";
        if (arguments != null) {
            str = string;
        }
        this.W = str;
        arguments2 = getArguments();
        if (arguments2 != null) {
        }
        pollAttachment = null;
        this.S = pollAttachment;
        if (pollAttachment == null) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Poll poll;
        menuInflater.inflate(R.menu.poll_viewer, menu);
        MenuItem findItem = menu.findItem(R.id.edit);
        if (findItem != null) {
            PollAttachment pollAttachment = this.S;
            findItem.setVisible((pollAttachment == null || (poll = pollAttachment.f) == null) ? false : poll.t0());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.poll_viewer_fragment, viewGroup, false);
        this.X = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.Y = inflate.findViewById(R.id.poll_viewer_appbar_shadow);
        this.a0 = (VkRecyclerPaginatedView) inflate.findViewById(R.id.poll_list);
        this.b0 = new etb0(this.W);
        if (this.Z) {
            Toolbar toolbar = this.X;
            if (toolbar != null) {
                f4m.j(toolbar);
            }
            View view = this.Y;
            if (view != null) {
                f4m.j(view);
            }
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.a0;
        if (vkRecyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView);
            nub0.a().getClass();
            dVar.c(2);
            dVar.f = 1;
            dVar.a();
            etb0 etb0Var = this.b0;
            if (etb0Var == null) {
                etb0Var = null;
            }
            vkRecyclerPaginatedView.setAdapter(etb0Var);
            c.h hVar = new c.h(this.c0);
            hVar.s = 0;
            f.a(hVar, vkRecyclerPaginatedView);
        }
        Toolbar toolbar2 = this.X;
        if (toolbar2 != null) {
            u1u0.j(toolbar2, R.drawable.vk_icon_arrow_left_outline_28);
            toolbar2.setNavigationOnClickListener(new bg0(this, 11));
            h3p0.c(this, toolbar2);
            toolbar2.setTitle(R.string.poll_viewer_title);
            u1u0.d(this, toolbar2);
            toolbar2.setOnMenuItemClickListener(new u730(this, 7));
            toolbar2.setOnMenuItemClickListener(new k7(this, 28));
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.X = null;
        this.a0 = null;
        super.onDestroyView();
    }

    /* compiled from: PollViewerFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, boolean z, boolean z2, String str, int i) {
            super(PollViewerFragment.class, null, null);
            this.j.putInt("poll_id", i);
            this.j.putParcelable("owner_id", userId);
            this.j.putBoolean("is_board", z);
            this.j.putString("ref", str);
            this.j.putBoolean("poll_disable_toolbar", z2);
        }

        public /* synthetic */ a(int i, UserId userId, String str, boolean z) {
            this(userId, z, false, str, i);
        }
    }
}
