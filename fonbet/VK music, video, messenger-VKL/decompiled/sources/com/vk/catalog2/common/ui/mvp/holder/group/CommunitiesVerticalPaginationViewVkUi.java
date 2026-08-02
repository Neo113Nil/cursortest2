package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.gzs;
import xsna.sx0;
import xsna.tlo0;
import xsna.tq;
import xsna.u11;
import xsna.wog;
import xsna.xog;

/* compiled from: CommunitiesVerticalPaginationViewVkUi.kt */
/* loaded from: classes16.dex */
public final class CommunitiesVerticalPaginationViewVkUi extends CatalogRecyclerPaginatedView {

    /* compiled from: CommunitiesVerticalPaginationViewVkUi.kt */
    public static final class a extends ee {
        public final VkPlaceholder d;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
            vkPlaceholder.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.d = vkPlaceholder;
            addView(vkPlaceholder);
            b();
        }

        private final void setUpError(int i) {
            this.d.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) tq.h(tlo0.Companion, i), (gzs) new sx0(this, 22), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Medium, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
        }

        @Override // xsna.ee
        public final void b() {
            this.d.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.vk_common_network_error))));
            setUpError(R.string.vk_common_retry);
        }

        @Override // xsna.ee
        public void setActionTitle(int i) {
            setUpError(i);
        }

        @Override // xsna.ee
        public void setMessage(CharSequence charSequence) {
            this.d.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, charSequence != null ? u11.f(tlo0.Companion, charSequence) : null)));
            setUpError(R.string.vk_common_retry);
        }

        @Override // xsna.ee
        public void setRetryBtnVisible(boolean z) {
            if (z) {
                setUpError(R.string.vk_common_retry);
            } else {
                this.d.setBottom((VkPlaceholder.a) null);
            }
        }
    }

    public CommunitiesVerticalPaginationViewVkUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFooterLoadingViewProvider(new xog());
        setFooterErrorViewProvider(new wog());
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        VkSpinner vkSpinner = new VkSpinner(context, null, 6, 0);
        vkSpinner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size56);
        return vkSpinner;
    }
}
