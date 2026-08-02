package com.vk.profile.core.tabs.ui.music;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.music.ProfileContentAudioAlbumsAdapter;
import com.vk.profile.core.tabs.ui.music.a;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.arb0;
import xsna.awt0;
import xsna.cvd0;
import xsna.d920;
import xsna.ffh;
import xsna.glh;
import xsna.hlh;
import xsna.iah0;
import xsna.izs;
import xsna.j15;
import xsna.jai;
import xsna.jz70;
import xsna.klh;
import xsna.nw6;
import xsna.r8a0;
import xsna.s3q0;
import xsna.u2b0;
import xsna.vjh;
import xsna.w6b0;
import xsna.wjh;
import xsna.x9d;
import xsna.zih;
import xsna.zoj0;

/* compiled from: ProfileContentAudioViewHolder.kt */
/* loaded from: classes5.dex */
public final class c extends wjh<j15> implements View.OnAttachStateChangeListener {
    public final zih E;
    public final ProfileContentAudioAlbumsAdapter F;
    public final glh<Playlist, ProfileContentAudioAlbumsAdapter.a> G;
    public final ffh H;
    public final com.vk.profile.core.tabs.ui.music.a I;
    public final hlh J;
    public final hlh K;
    public final w6b0<zoj0<MusicTrack, a.b>> L;

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((vjh.b) this.receiver).b(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).d(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    /* renamed from: com.vk.profile.core.tabs.ui.music.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C1649c extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).e(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).g(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CommunityProfileContentItem, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(CommunityProfileContentItem communityProfileContentItem) {
            ((vjh.b) this.receiver).f(communityProfileContentItem);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<RecyclerView.e0, klh.b> {
        @Override // xsna.izs
        public final klh.b invoke(RecyclerView.e0 e0Var) {
            return ((c) this.receiver).b6(e0Var);
        }
    }

    /* compiled from: ProfileContentAudioViewHolder.kt */
    public static final class h extends GridLayoutManager.c {
        public final /* synthetic */ j15 d;
        public final /* synthetic */ int e;

        public h(j15 j15Var, int i) {
            this.d = j15Var;
            this.e = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (!this.d.k.l() || i > 2) {
                return 1;
            }
            return this.e;
        }
    }

    public c(View view, UserId userId, String str, FragmentImpl fragmentImpl, zih zihVar, u2b0 u2b0Var, vjh.b bVar) {
        super(view, userId, fragmentImpl, new a(1, bVar, vjh.b.class, "onTabScroll", "onTabScroll(I)V", 0), new b(1, bVar, vjh.b.class, "onTabScrolledToBottom", "onTabScrolledToBottom(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new C1649c(1, bVar, vjh.b.class, "onTabLoadRetryClick", "onTabLoadRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new d(1, bVar, vjh.b.class, "onTabLoadMoreRetryClick", "onTabLoadMoreRetryClick(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), new e(1, bVar, vjh.b.class, "onTabAddClicked", "onTabAddClicked(Lcom/vk/profile/core/tabs/state/CommunityProfileContentItem;)V", 0), null);
        this.E = zihVar;
        view.getContext();
        ProfileContentAudioAlbumsAdapter profileContentAudioAlbumsAdapter = new ProfileContentAudioAlbumsAdapter(str, new arb0(this, 6));
        this.F = profileContentAudioAlbumsAdapter;
        glh<Playlist, ProfileContentAudioAlbumsAdapter.a> glhVar = new glh<>(profileContentAudioAlbumsAdapter, 116, new jz70(this, 13));
        this.G = glhVar;
        this.H = new ffh(glhVar, userId, fragmentImpl, new g(1, this, c.class, "getUiViewRecordForHolder", "getUiViewRecordForHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Lcom/vk/profile/core/tabs/stat/CommunityProfileContentUiViewTracker$Record;", 0), iah0.a(0), iah0.a(10), 0, 0, null, 448);
        com.vk.profile.core.tabs.ui.music.a aVar = new com.vk.profile.core.tabs.ui.music.a(u2b0Var, new r8a0(this, 10));
        this.I = aVar;
        this.J = new hlh(view.getContext().getString(R.string.profile_content_tab_playlists), 0, 6);
        this.K = new hlh(view.getContext().getString(R.string.profile_content_tab_music), iah0.a(2), 4);
        this.L = new w6b0<>(this.w.getRecyclerView(), u2b0Var, aVar, new x9d(5));
        this.w.getRecyclerView().setHasFixedSize(true);
        this.w.getRecyclerView().setItemAnimator(null);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.wjh
    public final void V5(j15 j15Var) {
        List list;
        List list2;
        j15 j15Var2 = j15Var;
        CommunityProfileContentItem.ContentType contentType = j15Var2.k;
        cvd0.a aVar = j15Var2.j;
        i6(j15Var2);
        super.V5(j15Var2);
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (recyclerPaginatedView.getRecyclerView().getAdapter() == null) {
            v6(j15Var2);
        }
        if (aVar == null || (list = aVar.a) == null) {
            list = EmptyList.b;
        }
        this.F.setItems(list);
        if (contentType.l()) {
            this.G.x0(j15Var2.o);
        }
        if (aVar == null || (list2 = aVar.b) == null) {
            list2 = EmptyList.b;
        }
        this.I.setItems(list2);
        if (contentType.h()) {
            CommunityProfileContentItem.State state = j15Var2.v;
            if (state == CommunityProfileContentItem.State.LOADING) {
                recyclerPaginatedView.lb();
                return;
            } else {
                if (state == CommunityProfileContentItem.State.ERROR) {
                    recyclerPaginatedView.Fe();
                    return;
                }
                return;
            }
        }
        CommunityProfileContentItem.State state2 = j15Var2.u;
        if (state2 == CommunityProfileContentItem.State.LOADING) {
            recyclerPaginatedView.lb();
        } else if (state2 == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(j15 j15Var) {
        j15 j15Var2 = j15Var;
        if (j15Var2 == null) {
            return false;
        }
        return j15Var2.k.h() ? j15Var2.o && j15Var2.v.h() : j15Var2.m && j15Var2.u.h();
    }

    @Override // xsna.wjh
    public final void a6() {
        super.a6();
        this.H.K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        CommunityProfileContentItem.ContentType contentType;
        if (!(e0Var instanceof a.b)) {
            if (!(e0Var instanceof ProfileContentAudioAlbumsAdapter.a)) {
                return null;
            }
            return new klh.b(((Playlist) r8.m).b, CommonCommunitiesStat$TypeTabContentType.AUDIOS_PLAYLISTS, ((ProfileContentAudioAlbumsAdapter.a) e0Var).getAbsoluteAdapterPosition(), null);
        }
        a.b bVar = (a.b) e0Var;
        MusicTrack musicTrack = bVar.m;
        if (musicTrack == null) {
            return null;
        }
        long j = musicTrack.b;
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType = CommonCommunitiesStat$TypeTabContentType.AUDIOS;
        int absoluteAdapterPosition = bVar.getAbsoluteAdapterPosition();
        j15 j15Var = (j15) this.t;
        return new klh.b(j, commonCommunitiesStat$TypeTabContentType, absoluteAdapterPosition - ((j15Var == null || (contentType = j15Var.k) == null || !contentType.l()) ? 0 : 3), null);
    }

    @Override // xsna.wjh
    public final void m6(j15 j15Var) {
        this.x.setContent(new jai(-337139921, new nw6(j15Var, 8), true));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.vk.profile.core.tabs.ui.music.a aVar = this.I;
        aVar.e.P0(aVar.h, true);
        w6b0<zoj0<MusicTrack, a.b>> w6b0Var = this.L;
        w6b0Var.b.P0(w6b0Var, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.vk.profile.core.tabs.ui.music.a aVar = this.I;
        aVar.e.n0(aVar.h);
        w6b0<zoj0<MusicTrack, a.b>> w6b0Var = this.L;
        w6b0Var.b.n0(w6b0Var);
    }

    @Override // xsna.wjh
    /* renamed from: t6, reason: merged with bridge method [inline-methods] */
    public final void i6(j15 j15Var) {
        j15 j15Var2 = (j15) this.t;
        if (j15Var2 == null || j15Var2.k == j15Var.k) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        awt0.x(recyclerPaginatedView.getRecyclerView(), 0, 0, 0, 0, 8);
        wjh.j6(recyclerPaginatedView.getRecyclerView());
        v6(j15Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v6(j15 j15Var) {
        int a2;
        int i;
        boolean l;
        CommunityProfileContentItem.ContentType contentType = j15Var.k;
        int i2 = contentType.k() ? 1 : 2;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.c(i2);
        dVar.e = new h(j15Var, i2);
        dVar.a();
        int a3 = contentType.h() ? iah0.a(10) : 0;
        int i3 = f.$EnumSwitchMapping$0[contentType.ordinal()];
        if (i3 == 1) {
            a2 = iah0.a(8);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
                awt0.x(recyclerPaginatedView.getRecyclerView(), a3, i, a3, 0, 8);
                recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
                d920 d920Var = new d920();
                l = contentType.l();
                com.vk.profile.core.tabs.ui.music.a aVar = this.I;
                ProfileContentAudioAlbumsAdapter profileContentAudioAlbumsAdapter = this.F;
                if (!l) {
                    profileContentAudioAlbumsAdapter.g = ProfileContentAudioAlbumsAdapter.Size.Large;
                    d920Var.x0(this.J);
                    d920Var.x0(this.H);
                    d920Var.x0(this.K);
                    d920Var.x0(aVar);
                } else if (contentType.h()) {
                    profileContentAudioAlbumsAdapter.g = ProfileContentAudioAlbumsAdapter.Size.MatchParent;
                    d920Var.x0(profileContentAudioAlbumsAdapter);
                } else {
                    d920Var.x0(aVar);
                }
                recyclerPaginatedView.setAdapter(d920Var);
            }
            a2 = iah0.a(0);
        }
        i = a2;
        awt0.x(recyclerPaginatedView.getRecyclerView(), a3, i, a3, 0, 8);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        d920 d920Var2 = new d920();
        l = contentType.l();
        com.vk.profile.core.tabs.ui.music.a aVar2 = this.I;
        ProfileContentAudioAlbumsAdapter profileContentAudioAlbumsAdapter2 = this.F;
        if (!l) {
        }
        recyclerPaginatedView.setAdapter(d920Var2);
    }
}
