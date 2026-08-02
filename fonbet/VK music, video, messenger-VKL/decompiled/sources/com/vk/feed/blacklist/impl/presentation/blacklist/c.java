package com.vk.feed.blacklist.impl.presentation.blacklist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import xsna.a11;
import xsna.dko;
import xsna.do3;
import xsna.eko;
import xsna.epx;
import xsna.ge7;
import xsna.gko;
import xsna.gzs;
import xsna.k1u0;
import xsna.kr5;
import xsna.pw;
import xsna.t34;
import xsna.tlo0;
import xsna.u11;
import xsna.vif0;
import xsna.x7g;

/* compiled from: BlacklistItemHolder.kt */
/* loaded from: classes18.dex */
public final class c extends vif0<ge7> {
    public final VkCell n;
    public t34 o;
    public do3 p;

    /* compiled from: BlacklistItemHolder.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int k = VkCell.Left.Main.Size.Large.k(context);
            vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkAvatar.S0();
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            kr5 kr5Var;
            C1033c c1033c = fVar instanceof C1033c ? (C1033c) fVar : null;
            if (c1033c == null || (kr5Var = c1033c.a) == null) {
                return;
            }
            VkAvatar vkAvatar = this.a;
            vkAvatar.o0(kr5Var.b(vkAvatar.getWidth()), null);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: BlacklistItemHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: BlacklistItemHolder.kt */
    /* renamed from: com.vk.feed.blacklist.impl.presentation.blacklist.c$c, reason: collision with other inner class name */
    public static final class C1033c implements VkCell.f {
        public final kr5 a;

        public C1033c(kr5 kr5Var) {
            this.a = kr5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1033c) && epx.f(this.a, ((C1033c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(avatarImageConfig=" + this.a + ')';
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup, R.layout.blackilsit_item, 0);
        VkCell vkCell = (VkCell) this.itemView;
        this.n = vkCell;
        vkCell.setOnClickListener(new a11(this, 1));
        vkCell.setLeftMainAvatarController(new b());
    }

    @Override // xsna.vif0
    public final void i6(ge7 ge7Var) {
        ge7 ge7Var2 = ge7Var;
        CharSequence charSequence = ge7Var2.d;
        VerifyInfo verifyInfo = ge7Var2.f;
        Drawable h = (ge7Var2.g && verifyInfo != null && verifyInfo.Cb()) ? VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28) : null;
        tlo0.h f = u11.f(tlo0.Companion, ge7Var2.c);
        VkCell.Middle.e.b.C0817b c0817b = h != null ? new VkCell.Middle.e.b.C0817b(new eko(h), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18), (!ge7Var2.e || charSequence == null) ? null : new VkCell.Middle.d(new tlo0.h(charSequence), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12);
        VkCell vkCell = this.n;
        vkCell.setMiddle(bVar);
        vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(R.string.accessibility_unban), false, (gzs) new pw(1, this, ge7Var2), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new C1033c(ge7Var2.b), VkCell.Left.Main.Size.Medium), null));
    }
}
