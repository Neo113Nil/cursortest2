package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.api.NotificationsPermission;
import com.vkontakte.android.R;
import defpackage.q0;
import defpackage.w;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.b25;
import xsna.b5a;
import xsna.cnh0;
import xsna.d2y;
import xsna.dko;
import xsna.dnh0;
import xsna.eko;
import xsna.epx;
import xsna.f870;
import xsna.fnj;
import xsna.fxc0;
import xsna.g7s0;
import xsna.gko;
import xsna.gzs;
import xsna.iah0;
import xsna.jjc;
import xsna.k1u0;
import xsna.l49;
import xsna.ldo;
import xsna.mcc0;
import xsna.mi1;
import xsna.nda;
import xsna.ndu0;
import xsna.o0r0;
import xsna.o25;
import xsna.oap;
import xsna.oq;
import xsna.q3a;
import xsna.qsd0;
import xsna.sdr;
import xsna.tlo0;
import xsna.uqm0;
import xsna.x7g;
import xsna.xwk;

/* compiled from: SearchAuthorCellVh.kt */
/* loaded from: classes16.dex */
public final class SearchAuthorCellVh implements CatalogViewHolder {
    public final CatalogConfiguration b;
    public final NotificationsPermission c;
    public final g7s0 d;
    public final b25 e;
    public final o0r0 f;
    public final boolean g;
    public UIBlockSearchAuthor h;
    public VkCell i;
    public Boolean j;
    public final cnh0 k;

    /* compiled from: SearchAuthorCellVh.kt */
    public static final class a implements VkCell.d {
        public final qsd0 a;
        public final VkAvatar b;

        /* compiled from: SearchAuthorCellVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh$a$a, reason: collision with other inner class name */
        public static final class C0505a implements VkCell.e {
            public final qsd0 a;

            public C0505a(qsd0 qsd0Var) {
                this.a = qsd0Var;
            }

            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new a(context, this.a);
            }
        }

        /* compiled from: SearchAuthorCellVh.kt */
        public static abstract class b implements VkCell.f {

            /* compiled from: SearchAuthorCellVh.kt */
            /* renamed from: com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh$a$b$a, reason: collision with other inner class name */
            public static final class C0506a extends b {
                public final Group a;
                public final boolean b;

                public C0506a(Group group, boolean z) {
                    this.a = group;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0506a)) {
                        return false;
                    }
                    C0506a c0506a = (C0506a) obj;
                    return epx.f(this.a, c0506a.a) && this.b == c0506a.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("GroupParams(group=");
                    sb.append(this.a);
                    sb.append(", hasLive=");
                    return q0.a(sb, this.b, ')');
                }
            }

            /* compiled from: SearchAuthorCellVh.kt */
            /* renamed from: com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh$a$b$b, reason: collision with other inner class name */
            public static final class C0507b extends b {
                public final UserProfile a;

                public C0507b(UserProfile userProfile) {
                    this.a = userProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0507b) && epx.f(this.a, ((C0507b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "UserParams(user=" + this.a + ')';
                }
            }
        }

        public a(Context context, qsd0 qsd0Var) {
            this.a = qsd0Var;
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            jjc.g(vkAvatar, new d2y(this, 28));
            this.b = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof b) {
                b bVar = (b) fVar;
                boolean z = bVar instanceof b.C0507b;
                VkAvatar vkAvatar = this.b;
                if (z) {
                    vkAvatar.o0(((b.C0507b) fVar).a.o(48), null);
                    vkAvatar.setBorder(null);
                } else {
                    if (!(bVar instanceof b.C0506a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.C0506a c0506a = (b.C0506a) fVar;
                    vkAvatar.o0(f870.s(c0506a.a, 48), null);
                    if (c0506a.b) {
                        vkAvatar.setBorder(new ndu0());
                        vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27));
                    } else {
                        vkAvatar.setBorder(null);
                        vkAvatar.S0();
                    }
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    public SearchAuthorCellVh(b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var, CatalogConfiguration catalogConfiguration, nda ndaVar, NotificationsPermission notificationsPermission) {
        g7s0 B = fxc0.B();
        b25 a2 = o25.a();
        o0r0 e = xwk.e();
        this.b = catalogConfiguration;
        this.c = notificationsPermission;
        this.d = B;
        this.e = a2;
        this.f = e;
        this.g = B.J().N1();
        this.k = new cnh0(q3aVar, b5aVar, catalogConfiguration, ndaVar, searchStatInfoProvider, notificationsPermission, mcc0Var, B, e, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Boolean bool;
        VkCell.f c0507b;
        Drawable h;
        int i;
        int i2;
        boolean z;
        String str;
        String str2;
        cnh0.a aVar;
        boolean z2;
        boolean d;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        VkCell vkCell = this.i;
        if (vkCell == null || (bool = this.j) == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        if (uIBlock instanceof UIBlockSearchAuthor) {
            UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
            UIBlockSearchAuthor.AuthorType authorType = uIBlockSearchAuthor.z;
            oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
            this.h = uIBlockSearchAuthor;
            Context context = vkCell.getContext();
            VkCell.Left.a aVar2 = VkCell.Left.Companion;
            boolean z3 = oapVar instanceof oap.b;
            if (z3) {
                Group group = (Group) ((oap.b) oapVar).a;
                c0507b = new a.b.C0506a(group, this.g && (groupsVideoLivesDataDto = group.x0) != null && groupsVideoLivesDataDto.e());
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0507b = new a.b.C0507b((UserProfile) ((oap.a) oapVar).a);
            }
            vkCell.setLeft(VkCell.Left.a.a(aVar2, new VkCell.Left.Main.a(c0507b, booleanValue ? 72 : 48)));
            VkCell.Right.d dVar = null;
            if (z3) {
                VerifyInfo verifyInfo = ((Group) ((oap.b) oapVar).a).y;
                Context context2 = vkCell.getContext();
                if (verifyInfo.Cb()) {
                    h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context2, VerifyInfoHelper.ColorTheme.normal, 24);
                }
                h = null;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                VerifyInfo verifyInfo2 = ((UserProfile) ((oap.a) oapVar).a).B;
                Context context3 = vkCell.getContext();
                if (verifyInfo2.Cb()) {
                    h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo2, context3, VerifyInfoHelper.ColorTheme.normal, 24);
                }
                h = null;
            }
            if (z3) {
                i = ((Group) ((oap.b) oapVar).a).v;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = ((UserProfile) ((oap.a) oapVar).a).K;
            }
            if (z3) {
                i2 = ((Group) ((oap.b) oapVar).a).d0;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = ((UserProfile) ((oap.a) oapVar).a).W;
            }
            if (authorType == UIBlockSearchAuthor.AuthorType.Clips) {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getQuantityString(R.plurals.followers_count, i, uqm0.l(i)));
                sb.append(context.getString(R.string.subtitle_separator));
                z = true;
                sb.append(uqm0.i(i2, R.plurals.clips_count, R.string.clips_count_formatted, true));
                str = sb.toString();
            } else {
                z = true;
                str = uIBlockSearchAuthor.A;
            }
            VkCell.Middle.a aVar3 = VkCell.Middle.Companion;
            tlo0.a aVar4 = tlo0.Companion;
            if (z3) {
                str2 = ((Group) ((oap.b) oapVar).a).d;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((UserProfile) ((oap.a) oapVar).a).e;
            }
            tlo0.h d2 = oq.d(aVar4, str2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar3, new VkCell.Middle.e(d2, 1, truncateAt, (VkCell.Middle.e.b) null, h != null ? new VkCell.Middle.e.b.C0817b(new eko(h), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null, 18), str != null ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 54) : null, null, 12));
            cnh0 cnh0Var = this.k;
            b25 b25Var = cnh0Var.j;
            cnh0Var.m = uIBlockSearchAuthor;
            UIBlockSearchAuthor.AuthorType authorType2 = UIBlockSearchAuthor.AuthorType.Videos;
            if (authorType == authorType2 && booleanValue && cnh0Var.l) {
                Group b2 = oapVar.b();
                if (!b25Var.b() || b2 == null) {
                    aVar = cnh0.a.AbstractC2670a.C2671a.a;
                } else if (cnh0.b(oapVar)) {
                    cnh0Var.o.getClass();
                    aVar = new cnh0.a.AbstractC2670a.c(com.vk.catalog2.common.ui.holders.c.c(b2));
                } else {
                    aVar = cnh0.a.AbstractC2670a.b.a;
                }
            } else {
                CatalogProfileLocalState catalogProfileLocalState = uIBlockSearchAuthor.C;
                boolean z4 = authorType == authorType2 ? z : false;
                if (!b25Var.b()) {
                    aVar = cnh0.a.b.C2672a.a;
                } else if (catalogProfileLocalState.b == CatalogProfileLocalState.FollowSource.InternalPending) {
                    aVar = cnh0.a.b.C2673b.a;
                } else if (cnh0.b(oapVar) && catalogProfileLocalState.b == CatalogProfileLocalState.FollowSource.Internal) {
                    aVar = cnh0.a.b.d.a;
                } else if (cnh0.b(oapVar)) {
                    if (!z4) {
                        if (z3) {
                            d = ((Group) ((oap.b) oapVar).a).t;
                        } else {
                            if (!(oapVar instanceof oap.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d = ((UserProfile) ((oap.a) oapVar).a).d();
                        }
                        if (d) {
                            z2 = z;
                            aVar = new cnh0.a.b.e(z2);
                        }
                    }
                    z2 = false;
                    aVar = new cnh0.a.b.e(z2);
                } else {
                    aVar = cnh0.a.b.c.a;
                }
            }
            if (aVar instanceof cnh0.a.b) {
                cnh0.a.b bVar = (cnh0.a.b) aVar;
                boolean z5 = oapVar.b() != null ? z : false;
                if (epx.f(bVar, cnh0.a.b.C2673b.a)) {
                    float f = 28;
                    dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(b.C0508b.a, new Size(iah0.a(f), iah0.a(f))), null, null, 29);
                } else if (bVar instanceof cnh0.a.b.c) {
                    dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(z5 ? R.drawable.vk_icon_add_square_outline_28 : R.drawable.vk_icon_user_add_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (Size) null, (tlo0) new tlo0.f(R.string.video_catalog_subscribe), false, (gzs) new sdr(this, context, uIBlockSearchAuthor, 4), 20), null, null, 29);
                } else if (epx.f(bVar, cnh0.a.b.d.a)) {
                    dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_done_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(R.string.video_catalog_subscribe), false, (gzs) new l49(this, context, uIBlockSearchAuthor, 8), 20), null, null, 29);
                } else if (bVar instanceof cnh0.a.b.e) {
                    if (((cnh0.a.b.e) bVar).a) {
                        dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_message_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (Size) null, (tlo0) new tlo0.f(R.string.video_catalog_subscribe), false, (gzs) new ldo(this, context, uIBlockSearchAuthor, oapVar, 1), 20), null, null, 29);
                    }
                } else if (!epx.f(bVar, cnh0.a.b.C2672a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!(aVar instanceof cnh0.a.AbstractC2670a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cnh0.a.AbstractC2670a abstractC2670a = (cnh0.a.AbstractC2670a) aVar;
                if (epx.f(abstractC2670a, cnh0.a.AbstractC2670a.b.a)) {
                    dVar = VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(new tlo0.f(R.string.video_catalog_subscribe), new mi1(this, context, uIBlockSearchAuthor), VkButton.Appearance.Accent, VkButton.Mode.Primary, VkButton.Size.Small, null, null, null, 2016), null, null, null, 30);
                } else if (abstractC2670a instanceof cnh0.a.AbstractC2670a.c) {
                    dVar = VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(new tlo0.f(R.string.video_catalog_subscribed), new w(this, context, uIBlockSearchAuthor, 3), VkButton.Appearance.Accent, VkButton.Mode.Secondary, VkButton.Size.Small, new VkCell.Right.a.b.c(new eko(((cnh0.a.AbstractC2670a.c) abstractC2670a).a), (Integer) null, 6), null, new VkCell.Right.a.b.c(new gko(R.drawable.vk_icon_dropdown_12), Integer.valueOf(R.attr.vk_ui_icon_accent_themed), 2), 1728), null, null, null, 30);
                } else if (!epx.f(abstractC2670a, cnh0.a.AbstractC2670a.C2671a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            vkCell.setRight(dVar);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkCell vkCell = new VkCell(layoutInflater.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        jjc.g(vkCell, new dnh0(0, this, vkCell));
        vkCell.setLeftMainAvatarController(new a.C0505a(new qsd0(2, this, vkCell)));
        vkCell.setRightExtraViewController(new b.a());
        if (this.j == null) {
            Context context = vkCell.getContext();
            HashSet hashSet = iah0.a;
            this.j = Boolean.valueOf(fnj.d(context));
        }
        this.i = vkCell;
        return vkCell;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    /* compiled from: SearchAuthorCellVh.kt */
    public static final class b implements VkCell.d {
        public final VkSpinner a;

        /* compiled from: SearchAuthorCellVh.kt */
        public static final class a implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new b(context);
            }
        }

        /* compiled from: SearchAuthorCellVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh$b$b, reason: collision with other inner class name */
        public static final class C0508b implements VkCell.f {
            public static final C0508b a = new C0508b();
        }

        public b(Context context) {
            this.a = new VkSpinner(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
