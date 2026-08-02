package com.vk.profile.community.chats.impl.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupChat;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.asu0;
import xsna.bvg;
import xsna.bwt0;
import xsna.cpu;
import xsna.dc6;
import xsna.dhr0;
import xsna.dvg;
import xsna.e980;
import xsna.f3p0;
import xsna.fvg;
import xsna.hg6;
import xsna.hvg;
import xsna.iah0;
import xsna.jsb;
import xsna.l980;
import xsna.lk;
import xsna.m4w;
import xsna.msy;
import xsna.mxv;
import xsna.oz50;
import xsna.p660;
import xsna.q1w;
import xsna.sxp;
import xsna.t9e;
import xsna.wm1;

/* compiled from: CommunityChatsFragment.kt */
/* loaded from: classes5.dex */
public final class CommunityChatsFragment extends BaseMvpFragment<hvg> implements dc6 {
    public static final /* synthetic */ int b0 = 0;
    public Toolbar T;
    public RecyclerPaginatedView U;
    public bvg V;
    public UserId W = UserId.d;
    public boolean X;
    public final Object Y;
    public final Object Z;
    public final Object a0;

    /* compiled from: CommunityChatsFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, int i) {
            super(CommunityChatsFragment.class, null, null);
            this.j.putParcelable("group_id", userId);
            this.j.putBoolean("is_admin", i == 3);
        }
    }

    /* compiled from: CommunityChatsFragment.kt */
    public final class b implements f<sxp> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(sxp sxpVar) {
            bvg bvgVar;
            sxp sxpVar2 = sxpVar;
            boolean z = sxpVar2 instanceof e980;
            CommunityChatsFragment communityChatsFragment = CommunityChatsFragment.this;
            if (z) {
                bvg bvgVar2 = communityChatsFragment.V;
                if (bvgVar2 != null) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    bvgVar2.K0(Peer.a.b(((e980) sxpVar2).d));
                    return;
                }
                return;
            }
            if (!(sxpVar2 instanceof l980) || (bvgVar = communityChatsFragment.V) == null) {
                return;
            }
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            bvgVar.K0(Peer.a.b(((l980) sxpVar2).c));
        }
    }

    public CommunityChatsFragment() {
        h hVar = new h(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, hVar);
        this.Z = msy.a(lazyThreadSafetyMode, new wm1(this, 24));
        this.a0 = msy.a(lazyThreadSafetyMode, new lk(12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo() {
        ((cpu) this.Y.getValue()).j(this, this.W, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "chat-create", (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
    }

    public final void ko(c cVar) {
        if (cVar != null) {
            eo(cVar);
        }
    }

    public final void lo(VKList<GroupChat> vKList, boolean z) {
        bvg bvgVar = this.V;
        if (bvgVar != null) {
            hg6<T> hg6Var = bvgVar.c;
            if (z) {
                hg6Var.clear();
                if (bvgVar.e) {
                    ((ListDataSet) hg6Var).s(new p660(2));
                }
            }
            if (!vKList.isEmpty()) {
                Iterator<GroupChat> it = vKList.iterator();
                while (it.hasNext()) {
                    ((ListDataSet) hg6Var).s(new jsb(it.next()));
                }
            }
            hg6Var.a();
        }
    }

    public final void mo() {
        RecyclerPaginatedView recyclerPaginatedView = this.U;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.g0();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("group_id")) == null) {
            userId = UserId.d;
        }
        this.W = userId;
        Bundle arguments2 = getArguments();
        this.X = arguments2 != null ? arguments2.getBoolean("is_admin") : false;
        this.S = ((Boolean) this.a0.getValue()).booleanValue() ? new dvg(this, this.W) : new fvg(this, this.W);
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        eo(a1wVar.l.a().a0(asu0.a.d()).subscribe(new b()));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MenuItem add;
        MenuItem icon;
        MenuItem onMenuItemClickListener;
        View inflate = layoutInflater.inflate(R.layout.layout_base_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) bwt0.p(inflate, R.id.toolbar, null, null, 6);
        this.T = toolbar;
        toolbar.setTitle(requireContext().getString(R.string.groups_chats));
        Toolbar toolbar2 = this.T;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        f3p0.a(toolbar2, this, new t9e(this, 4));
        if (this.X) {
            Toolbar toolbar3 = this.T;
            if (toolbar3 == null) {
                toolbar3 = null;
            }
            Menu menu = toolbar3.getMenu();
            if (menu != null && (add = menu.add(R.string.edit_group)) != null && (icon = add.setIcon(R.drawable.vk_icon_settings_outline_28)) != null && (onMenuItemClickListener = icon.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.gvg
                /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    int i = CommunityChatsFragment.b0;
                    CommunityChatsFragment communityChatsFragment = CommunityChatsFragment.this;
                    ((cpu) communityChatsFragment.Y.getValue()).j(communityChatsFragment, communityChatsFragment.W, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "chats", (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
                    return true;
                }
            })) != null) {
                onMenuItemClickListener.setShowAsAction(2);
            }
        }
        this.V = new bvg(this.X, (hvg) this.S, (cpu) this.Y.getValue(), (mxv) this.Z.getValue());
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) bwt0.p(inflate, R.id.rpb_list, null, null, 6);
        this.U = recyclerPaginatedView;
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.getRecyclerView().setPadding(recyclerPaginatedView.getRecyclerView().getPaddingLeft(), iah0.a(10.0f), recyclerPaginatedView.getRecyclerView().getPaddingRight(), iah0.a(10.0f));
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        recyclerPaginatedView.setAdapter(this.V);
        dhr0.a.e0(R.attr.vk_ui_background_content, recyclerPaginatedView);
        Toolbar toolbar4 = this.T;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.U;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
        if (recyclerView != null) {
            toolbar4.setOnClickListener(new m4w(new WeakReference(recyclerView), 4));
        }
        c.h hVar = ((Boolean) this.a0.getValue()).booleanValue() ? new c.h((c.l) this.S) : new c.h((c.m) this.S);
        hVar.c = 5;
        hVar.i = 15;
        hVar.f = this.V;
        RecyclerPaginatedView recyclerPaginatedView3 = this.U;
        com.vk.lists.f.a(hVar, recyclerPaginatedView3 != null ? recyclerPaginatedView3 : null);
        return inflate;
    }
}
