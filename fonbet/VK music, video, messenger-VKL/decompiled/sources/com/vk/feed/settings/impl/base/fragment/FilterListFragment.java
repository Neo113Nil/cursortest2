package com.vk.feed.settings.impl.base.fragment;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tonicartos.superslim.a;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.SegmenterFragment;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.c2i0;
import xsna.iah0;
import xsna.j6r0;
import xsna.jx2;
import xsna.lwt;
import xsna.pfd0;
import xsna.pwk;
import xsna.rpj0;
import xsna.vif0;
import xsna.yad;

/* compiled from: FilterListFragment.kt */
/* loaded from: classes18.dex */
public abstract class FilterListFragment extends SegmenterFragment<UserProfile> {
    public static final /* synthetic */ int R0 = 0;
    public final yad M0;
    public final pwk N0;
    public ArrayList<UserProfile> O0;
    public ArrayList<UserProfile> P0;
    public final c2i0 Q0;

    /* compiled from: FilterListFragment.kt */
    public final class a extends SegmenterFragment<UserProfile>.c<UserProfile, pfd0> {
        public a() {
            super(FilterListFragment.this);
        }

        @Override // com.vkontakte.android.fragments.base.SegmenterFragment.c
        public final pfd0 A0(ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            VKAvatarView vKAvatarView = new VKAvatarView(viewGroup.getContext(), null, 6, 0);
            FilterListFragment filterListFragment = FilterListFragment.this;
            return new pfd0(vKAvatarView, context, filterListFragment.N0, filterListFragment.M0);
        }

        @Override // com.vkontakte.android.fragments.base.SegmenterFragment.c, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            super.onBindViewHolder((UsableRecyclerView.x) e0Var, i);
        }

        @Override // com.vkontakte.android.fragments.base.SegmenterFragment.c
        public final void x0(RecyclerView.e0 e0Var, a.C0366a c0366a, int i) {
            ((b) e0Var).i6(f(i));
            c0366a.f = true;
            c0366a.g = 1;
            c0366a.o = 1;
        }

        @Override // com.vkontakte.android.fragments.base.SegmenterFragment.c
        public final void y0(pfd0 pfd0Var, a.C0366a c0366a, int i) {
            super.y0(pfd0Var, c0366a, i);
            c0366a.o = 1;
        }

        @Override // com.vkontakte.android.fragments.base.SegmenterFragment.c
        public final RecyclerView.e0 z0(ViewGroup viewGroup) {
            return new b(viewGroup.getContext());
        }
    }

    /* compiled from: FilterListFragment.kt */
    public final class b extends vif0<CharSequence> {
        public final VkGroupHeader n;

        public b(Context context) {
            super(R.layout.filter_header_view_holder, context);
            VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.group_header);
            vkGroupHeader.setSize(VkGroupHeader.Size.Small);
            this.n = vkGroupHeader;
        }

        @Override // xsna.vif0
        /* renamed from: q6, reason: merged with bridge method [inline-methods] */
        public final void i6(CharSequence charSequence) {
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            this.n.setTitle(new VkGroupHeader.d(obj, null, null, null, 0, null, 510));
            this.itemView.requestLayout();
        }
    }

    /* compiled from: FilterListFragment.kt */
    public static final class c extends rpj0<lwt.a> {
        public c() {
            super(FilterListFragment.this);
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            lwt.a aVar = (lwt.a) obj;
            RandomAccess randomAccess = aVar.a;
            if (randomAccess == null) {
                randomAccess = EmptyList.b;
            }
            FilterListFragment filterListFragment = FilterListFragment.this;
            filterListFragment.O0 = (ArrayList) randomAccess;
            RandomAccess randomAccess2 = aVar.b;
            if (randomAccess2 == null) {
                randomAccess2 = EmptyList.b;
            }
            filterListFragment.P0 = (ArrayList) randomAccess2;
            filterListFragment.Oo();
            filterListFragment.q();
            filterListFragment.oo();
            filterListFragment.Eo();
        }
    }

    public FilterListFragment() {
        super(1);
        this.M0 = new yad(this, 25);
        this.N0 = new pwk(this, 11);
        this.O0 = new ArrayList<>();
        this.P0 = new ArrayList<>();
        this.Q0 = new c2i0();
    }

    @Override // com.vkontakte.android.fragments.base.SegmenterFragment
    public final a Io() {
        return new a();
    }

    @Override // com.vkontakte.android.fragments.base.SegmenterFragment
    public int Jo() {
        int i;
        int width = (this.n0.getWidth() - this.n0.getPaddingLeft()) - this.n0.getPaddingRight();
        if (this.V >= 600) {
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(160.0f);
        } else {
            i = width;
        }
        if (width * i == 0) {
            return 1;
        }
        return width / i;
    }

    @Override // com.vkontakte.android.fragments.base.SegmenterFragment
    public final c2i0 Ko() {
        return this.Q0;
    }

    public abstract lwt Mo();

    public abstract void No(UserProfile userProfile);

    public final void Oo() {
        c2i0 c2i0Var = this.Q0;
        c2i0Var.a.clear();
        c2i0Var.b.clear();
        c2i0Var.c.clear();
        c2i0Var.d.clear();
        c2i0Var.e.clear();
        c2i0Var.f = 0;
        if (this.O0.size() > 0) {
            c2i0Var.f(getString(R.string.people), this.O0);
        }
        if (this.P0.size() > 0) {
            c2i0Var.f(getString(R.string.groups), this.P0);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        setTitle(R.string.sett_news_banned);
        po();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        new jx2(Mo(), new c()).a();
    }
}
