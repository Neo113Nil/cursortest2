package com.vk.profile.community.impl.ui.view;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.profile.community.impl.ui.view.StatusButtonView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.bwd0;
import xsna.bwt0;
import xsna.eqd;
import xsna.j6e;
import xsna.o1e;
import xsna.o1i;
import xsna.ra;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: CommunitySettingsHeaderAdapter.kt */
/* loaded from: classes5.dex */
public final class a extends zoj0<ExtendedCommunityProfile, C1631a> {
    public final o1i e;
    public final ra f;

    /* compiled from: CommunitySettingsHeaderAdapter.kt */
    /* renamed from: com.vk.profile.community.impl.ui.view.a$a, reason: collision with other inner class name */
    public static final class C1631a extends vif0<ExtendedCommunityProfile> {
        public final StatusButtonView n;
        public final StatusButtonView o;
        public final StatusButtonView p;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C1631a(ViewGroup viewGroup) {
            super(r0);
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            this.n = q6((ViewGroup) this.itemView);
            this.o = q6((ViewGroup) this.itemView);
            this.p = q6((ViewGroup) this.itemView);
            float f = 8;
            this.itemView.setPadding((int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f), 0, (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f), 0);
        }

        public static StatusButtonView q6(ViewGroup viewGroup) {
            StatusButtonView statusButtonView = new StatusButtonView(viewGroup.getContext());
            viewGroup.addView(statusButtonView);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) statusButtonView.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return statusButtonView;
        }

        @Override // xsna.vif0
        public final void i6(ExtendedCommunityProfile extendedCommunityProfile) {
            ExtendedCommunityProfile extendedCommunityProfile2 = extendedCommunityProfile;
            if (extendedCommunityProfile2 != null) {
                boolean z = true;
                this.n.setData(new StatusButtonView.a(0, false, extendedCommunityProfile2.l ? R.drawable.vk_icon_bookmark_check_outline_28 : R.drawable.vk_icon_bookmark_outline_28, !bwd0.f(extendedCommunityProfile2), R.string.community_favorite));
                boolean z2 = extendedCommunityProfile2.j1;
                StatusButtonView.a aVar = new StatusButtonView.a(2, z2, z2 ? R.drawable.ic_notifications_on_28 : R.drawable.vk_icon_notifications_28, !bwd0.c(extendedCommunityProfile2) || extendedCommunityProfile2.G1 || extendedCommunityProfile2.d1 || extendedCommunityProfile2.h1 || z2, R.string.community_status_button_notifications);
                StatusButtonView statusButtonView = this.o;
                statusButtonView.setData(aVar);
                this.p.setData(new StatusButtonView.a(1, false, R.drawable.vk_icon_share_outline_28, true, R.string.share));
                if (extendedCommunityProfile2.g() || bwd0.c(extendedCommunityProfile2) || bwd0.f(extendedCommunityProfile2) || ((extendedCommunityProfile2.Y == 0 && extendedCommunityProfile2.Z == 0 && bwd0.b(extendedCommunityProfile2) && !extendedCommunityProfile2.j1) || (extendedCommunityProfile2.Y == 2 && bwd0.b(extendedCommunityProfile2) && !extendedCommunityProfile2.j1))) {
                    z = false;
                }
                bwt0.p0(statusButtonView, z);
            }
        }
    }

    public a(ListDataSet listDataSet, o1i o1iVar, ra raVar) {
        super(listDataSet);
        this.e = o1iVar;
        this.f = raVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        C1631a c1631a = (C1631a) e0Var;
        ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c.c(i);
        if (extendedCommunityProfile == null) {
            return;
        }
        c1631a.V5(extendedCommunityProfile);
        bwt0.i0(c1631a.p, new o1e(this, 7));
        bwt0.i0(c1631a.n, new j6e(this, 10));
        bwt0.i0(c1631a.o, new eqd(this, 9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C1631a(viewGroup);
    }
}
