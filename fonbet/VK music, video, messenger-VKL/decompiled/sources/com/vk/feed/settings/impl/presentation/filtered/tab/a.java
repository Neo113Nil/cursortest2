package com.vk.feed.settings.impl.presentation.filtered.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import xsna.c98;
import xsna.e40;
import xsna.eko;
import xsna.epx;
import xsna.gzs;
import xsna.j3b;
import xsna.k1u0;
import xsna.kr5;
import xsna.tlo0;
import xsna.u11;
import xsna.v34;
import xsna.vif0;
import xsna.yer;

/* compiled from: FilteredSourceHolder.kt */
/* loaded from: classes18.dex */
public final class a extends vif0<yer> {
    public static final /* synthetic */ int q = 0;
    public final VkCell n;
    public v34 o;
    public e40 p;

    /* compiled from: FilteredSourceHolder.kt */
    /* renamed from: com.vk.feed.settings.impl.presentation.filtered.tab.a$a, reason: collision with other inner class name */
    public static final class C1060a implements VkCell.d {
        public final VKAvatarView a;

        public C1060a(Context context) {
            VKAvatarView vKAvatarView = new VKAvatarView(context, null, 6, 0);
            int i = a.q;
            int k = VkCell.Left.Main.Size.Medium.k(context);
            vKAvatarView.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            this.a = vKAvatarView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof c) {
                this.a.Y0(((c) fVar).a);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FilteredSourceHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new C1060a(context);
        }
    }

    /* compiled from: FilteredSourceHolder.kt */
    public static final class c implements VkCell.f {
        public final kr5 a;

        public c(kr5 kr5Var) {
            this.a = kr5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(avatarImageConfig=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ViewGroup viewGroup) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        VkCell vkCell2 = (VkCell) this.itemView;
        vkCell2.setOnClickListener(new c98(this, 2));
        this.n = vkCell2;
    }

    @Override // xsna.vif0
    public final void i6(yer yerVar) {
        yer yerVar2 = yerVar;
        VkCell.Left.b bVar = new VkCell.Left.b(new VkCell.Left.Main.a(new c(yerVar2.b), VkCell.Left.Main.Size.Medium), null);
        VkCell vkCell = this.n;
        vkCell.setLeft(bVar);
        VerifyInfo verifyInfo = yerVar2.f;
        Drawable h = (verifyInfo == null || !verifyInfo.Cb()) ? null : VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28);
        tlo0.h f = u11.f(tlo0.Companion, yerVar2.c);
        VkCell.Middle.e.b.C0817b c0817b = h != null ? new VkCell.Middle.e.b.C0817b(new eko(h), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18);
        CharSequence charSequence = yerVar2.d;
        vkCell.setMiddle(new VkCell.Middle.b(eVar, charSequence != null ? new VkCell.Middle.d(new tlo0.h(charSequence), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(new tlo0.f(R.string.return_to_feed), new j3b(0, this, a.class, "onActionButtonClick", "onActionButtonClick()V", 0, 2), VkButton.Appearance.Accent, VkButton.Mode.Secondary, VkButton.Size.Small, null, null, null, 2016), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }
}
