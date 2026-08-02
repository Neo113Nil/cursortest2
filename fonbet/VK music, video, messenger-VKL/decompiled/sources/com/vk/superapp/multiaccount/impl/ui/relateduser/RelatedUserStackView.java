package com.vk.superapp.multiaccount.impl.ui.relateduser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.VkStackAvatarView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.awt0;
import xsna.bi80;
import xsna.biq;
import xsna.bpn0;
import xsna.c5g;
import xsna.dnp0;
import xsna.epx;
import xsna.f4m;
import xsna.iah0;
import xsna.jzq0;
import xsna.kgq0;
import xsna.kn9;
import xsna.vjo;
import xsna.vsf0;
import xsna.wmd0;
import xsna.wra;
import xsna.x1o0;
import xsna.xnn0;
import xsna.zmp0;

/* compiled from: RelatedUserStackView.kt */
/* loaded from: classes6.dex */
public final class RelatedUserStackView extends FrameLayout {
    public static final a m = new a();
    public final VkStackAvatarView<x1o0> b;
    public final TextView c;
    public final RecyclerView d;
    public final vsf0 e;
    public final View f;
    public final LinearLayout g;
    public final ArrayList h;
    public kgq0 i;
    public final bpn0 j;
    public final dnp0 k;
    public final dnp0 l;

    /* compiled from: RelatedUserStackView.kt */
    public static final class a extends m.e<xnn0.h> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(xnn0.h hVar, xnn0.h hVar2) {
            return hVar.equals(hVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(xnn0.h hVar, xnn0.h hVar2) {
            return epx.f(hVar.a.a().b, hVar2.a.a().b);
        }
    }

    public RelatedUserStackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new ArrayList();
        int a2 = iah0.a(32);
        this.j = new bpn0(new bi80(this, 11));
        LayoutInflater.from(context).inflate(R.layout.vk_auth_related_users_stack, this);
        this.g = (LinearLayout) findViewById(R.id.related_user_stack_container);
        VkStackAvatarView<x1o0> vkStackAvatarView = (VkStackAvatarView) findViewById(R.id.related_user_avatar_stack_view);
        this.b = vkStackAvatarView;
        this.c = (TextView) findViewById(R.id.related_user_count_tv);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.related_users_expanded_rv);
        this.d = recyclerView;
        this.f = findViewById(R.id.chevron);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        vsf0 vsf0Var = new vsf0(getUserResourceProvider(), new wmd0(this, 5));
        this.e = vsf0Var;
        recyclerView.setAdapter(vsf0Var);
        vkStackAvatarView.setIconSize(a2);
        setBackground(vjo.a(context, 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_CODE_INIT_FAILED));
        setOnClickListener(new kn9(this, 12));
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(new biq(1));
        dnp0Var.c(new wra().setInterpolator(new AccelerateInterpolator()));
        dnp0Var.c(new biq(2));
        dnp0Var.e(150L);
        dnp0Var.g(0);
        this.k = dnp0Var;
        dnp0 dnp0Var2 = new dnp0();
        dnp0Var2.c(new biq(1));
        dnp0Var2.c(new wra().setInterpolator(new DecelerateInterpolator()));
        dnp0Var2.c(new biq(2));
        dnp0Var2.e(150L);
        dnp0Var2.g(0);
        this.l = dnp0Var2;
    }

    private final jzq0 getUserResourceProvider() {
        return (jzq0) this.j.getValue();
    }

    public final void a() {
        zmp0.a(this, this.k);
        awt0.v(this.d, true);
        this.g.setVisibility(8);
    }

    public final void setAvatarSize(int i) {
        this.b.setIconSize(i);
    }

    public final void setContentPaddingStart(int i) {
        f4m.x(i, this.g);
        this.e.submitList(this.h);
    }

    public final void setStrokeColor(int i) {
        this.b.setStrokeColor(i);
    }

    public final void setUserSelectedCallback(kgq0 kgq0Var) {
        this.i = kgq0Var;
    }

    public final void setUsers(List<xnn0.h> list) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            zmp0.a(this, this.l);
            this.d.setVisibility(8);
            awt0.v(this.g, true);
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair(((xnn0.h) it.next()).a.a().d, x1o0.d));
            }
            this.b.c(arrayList2, 0, null);
        } else {
            a();
        }
        jzq0 userResourceProvider = getUserResourceProvider();
        arrayList.size();
        userResourceProvider.getClass();
        this.c.setText("");
        this.e.submitList(arrayList);
    }
}
