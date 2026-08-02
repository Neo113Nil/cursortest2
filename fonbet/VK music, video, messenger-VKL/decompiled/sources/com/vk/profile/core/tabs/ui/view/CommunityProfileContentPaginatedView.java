package com.vk.profile.core.tabs.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.ee;
import xsna.gzs;
import xsna.n6s;
import xsna.tlo0;
import xsna.tq;
import xsna.v40;
import xsna.xa80;

/* compiled from: CommunityProfileContentPaginatedView.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileContentPaginatedView extends UsableRecyclerPaginatedView {

    /* compiled from: CommunityProfileContentPaginatedView.kt */
    public static final class a extends n6s {

        /* compiled from: CommunityProfileContentPaginatedView.kt */
        /* renamed from: com.vk.profile.core.tabs.ui.view.CommunityProfileContentPaginatedView$a$a, reason: collision with other inner class name */
        public static final class C1650a extends RecyclerView.e0 {
        }

        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            return null;
        }

        @Override // xsna.n6s
        public final RecyclerView.e0 b(Context context, ViewGroup viewGroup, xa80 xa80Var) {
            VkCell vkCell = new VkCell(context, null, 6, 0);
            vkCell.setMiddle(new VkCell.Middle.b((VkCell.Middle.e) null, new VkCell.Middle.d(tq.h(tlo0.Companion, R.string.liblists_err_text), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 13));
            vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(new tlo0.f(R.string.liblists_retry), new v40(xa80Var, 26), VkButton.Appearance.Accent, VkButton.Mode.Tertiary, null, null, null, null, 2032), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
            return new C1650a(vkCell);
        }
    }

    public CommunityProfileContentPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFooterErrorViewProvider(new a());
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView, com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return new View(context);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        return new View(context);
    }

    /* compiled from: CommunityProfileContentPaginatedView.kt */
    public static final class b extends ee {
        @Override // xsna.ee
        public final void b() {
        }

        @Override // xsna.ee
        public void setActionTitle(int i) {
        }

        @Override // xsna.ee
        public void setMessage(CharSequence charSequence) {
        }

        @Override // xsna.ee
        public void setRetryBtnVisible(boolean z) {
        }
    }
}
