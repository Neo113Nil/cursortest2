package com.vk.sharing.core.view;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import xsna.cvk;
import xsna.epx;
import xsna.o9r0;

/* compiled from: TargetViewHolderV2.kt */
/* loaded from: classes5.dex */
public final class i extends RecyclerView.e0 {
    public final l l;
    public final VkCell m;

    /* compiled from: TargetViewHolderV2.kt */
    public static final class a implements VkCell.d {
        public final Context a;
        public final ImAvatarView b;

        /* compiled from: TargetViewHolderV2.kt */
        /* renamed from: com.vk.sharing.core.view.i$a$a, reason: collision with other inner class name */
        public static final class C1782a implements VkCell.f {
            public Dialog a;
            public ProfilesSimpleInfo b;
        }

        public a(Context context) {
            this.a = context;
            ImAvatarView imAvatarView = new ImAvatarView(context, null, 6, 0);
            imAvatarView.setAvatarBorderConfigParamsOverride(o9r0.a(imAvatarView.getAvatarBorderConfigParamsOverride(), false, null, null, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, null, null, false, 1782));
            imAvatarView.setTag("avatar");
            this.b = imAvatarView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            C1782a c1782a = fVar instanceof C1782a ? (C1782a) fVar : null;
            if (c1782a == null) {
                return;
            }
            this.b.r1(c1782a.a, c1782a.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewController(context=" + this.a + ')';
        }
    }

    /* compiled from: TargetViewHolderV2.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    public i(f fVar, View view) {
        super(view);
        this.l = fVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.target_cell);
        vkCell.setLayoutParams(new RecyclerView.p(-1, -2));
        this.m = vkCell;
    }

    public final void V5(Target target) {
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        l.a presenter = this.l.getPresenter();
        if (presenter == null) {
            return;
        }
        if (target.g) {
            presenter.l2(target, absoluteAdapterPosition, false);
        } else if (absoluteAdapterPosition != -1) {
            if (target.zb()) {
                presenter.l2(target, absoluteAdapterPosition, true);
            } else {
                cvk.u(R.string.send_forbidden, false);
            }
        }
    }
}
