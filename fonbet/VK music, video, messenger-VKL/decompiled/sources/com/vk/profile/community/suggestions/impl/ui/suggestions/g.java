package com.vk.profile.community.suggestions.impl.ui.suggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.awt0;
import xsna.bb;
import xsna.c98;
import xsna.cb;
import xsna.cn70;
import xsna.enj;
import xsna.eqd;
import xsna.ey0;
import xsna.f5z;
import xsna.fnj;
import xsna.gm50;
import xsna.iah0;
import xsna.jb5;
import xsna.mmf;
import xsna.p3i;
import xsna.q3i;
import xsna.u1u0;
import xsna.xtg;

/* compiled from: CommunitySuggestionsView.kt */
/* loaded from: classes5.dex */
public final class g implements gm50 {
    public final f5z b;
    public final CommunitySuggestionsFragment.e c;
    public final View d;
    public final Toolbar e;
    public final MenuItem f;
    public final xtg g;
    public final RecyclerPaginatedView h;

    /* compiled from: CommunitySuggestionsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunitySuggestionsViewState.LoadingState.values().length];
            try {
                iArr[CommunitySuggestionsViewState.LoadingState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunitySuggestionsViewState.LoadingState.FOOTER_LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g(Context context, f5z f5zVar, CommunitySuggestionsFragment.e eVar) {
        this.b = f5zVar;
        this.c = eVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.community_category_suggestions_fragment, (ViewGroup) null, false);
        this.d = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        mmf mmfVar = new mmf(this, 12);
        u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
        toolbar.setNavigationOnClickListener(new c98(mmfVar, 13));
        awt0.x(toolbar, 0, 0, cn70.b(2), 0, 11);
        this.e = toolbar;
        MenuItem add = toolbar.getMenu().add(R.string.community_category_suggestion_info_menu_item);
        add.setIcon(enj.e(R.drawable.vk_icon_info_circle_outline_28, R.attr.vk_ui_text_accent_themed, toolbar.getContext()));
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.o3i
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                com.vk.profile.community.suggestions.impl.ui.suggestions.g.this.c.invoke(a.e.b);
                return true;
            }
        });
        add.setShowAsAction(2);
        this.f = add;
        xtg xtgVar = new xtg(new jb5(this, 4), new eqd(this, 10), new p3i(this, 0));
        this.g = xtgVar;
        h hVar = new h(this);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.recycler);
        recyclerPaginatedView.setAdapter(xtgVar);
        a(recyclerPaginatedView);
        recyclerPaginatedView.setOnRefreshListener(new bb(this, 26));
        recyclerPaginatedView.setOnReloadRetryClickListener(new cb(this, 27));
        recyclerPaginatedView.setOnLoadNextRetryClickListener(new ey0(this, 23));
        recyclerPaginatedView.Om(hVar);
        this.h = recyclerPaginatedView;
    }

    public static void a(RecyclerPaginatedView recyclerPaginatedView) {
        Context context = recyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        int i = (fnj.d(context) || iah0.r(recyclerPaginatedView.getContext())) ? 3 : 2;
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.c(i);
        dVar.a();
        recyclerPaginatedView.setItemDecoration(new q3i(i));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
