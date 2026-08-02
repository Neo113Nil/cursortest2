package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vkontakte.android.R;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b5a;
import xsna.baf0;
import xsna.bwt0;
import xsna.clu;
import xsna.cn70;
import xsna.dha;
import xsna.epx;
import xsna.izs;
import xsna.jjc;
import xsna.krv0;
import xsna.m33;
import xsna.m3a;
import xsna.mu1;
import xsna.ndu0;
import xsna.oq;
import xsna.p0w0;
import xsna.pq;
import xsna.q3a;
import xsna.sng;
import xsna.tlo0;
import xsna.u4e;
import xsna.uv6;
import xsna.zrp;

/* compiled from: GroupHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public final class GroupHorizontalListItemVh extends BaseGroupVh {
    public final Size h;
    public final boolean i;
    public final m3a j;
    public final dha k;
    public VkTile l;
    public final com.vk.catalog2.common.ui.mvp.holder.group.a m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupHorizontalListItemVh.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size MatchParent;
        public static final Size Small;

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("MatchParent", 1);
            MatchParent = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: GroupHorizontalListItemVh.kt */
    public static final class a implements VkTile.g {
        public final Size a;
        public final boolean b;
        public final FrameLayout c;
        public final VkAvatar d;
        public final VkCounter e;
        public final VkImageSimple f;

        /* compiled from: GroupHorizontalListItemVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0500a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Size.values().length];
                try {
                    iArr[Size.Small.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Size.MatchParent.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Context context, Size size, boolean z) {
            this.a = size;
            this.b = z;
            FrameLayout frameLayout = new FrameLayout(context);
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(new ColorDrawable(krv0.m(R.attr.vk_ui_background_secondary, context)));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(vkAvatar);
            this.d = vkAvatar;
            VkCounter vkCounter = new VkCounter(context, null);
            vkCounter.setVisibility(8);
            vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Neutral);
            vkCounter.setMode(VkCounter.Mode.Primary);
            vkCounter.setSize(VkCounter.Size.Medium);
            vkCounter.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
            vkCounter.setTranslationX(cn70.a() * 2.0f);
            vkCounter.setTranslationY(cn70.a() * 2.0f);
            frameLayout.addView(vkCounter);
            this.e = vkCounter;
            int dimension = (int) context.getResources().getDimension(R.dimen.vk_ui_badge_m);
            VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
            vkImageSimple.setBackgroundColor(krv0.m(R.attr.vk_ui_background_contrast_themed, context));
            vkImageSimple.setClipToOutline(true);
            vkImageSimple.setOutlineProvider(p0w0.a);
            vkImageSimple.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            vkImageSimple.setElevation(cn70.a() * 2.0f);
            vkImageSimple.setTranslationX(cn70.a() * 2.0f);
            vkImageSimple.setTranslationY(cn70.a() * 2.0f);
            vkImageSimple.setVisibility(8);
            vkImageSimple.setLayoutParams(new FrameLayout.LayoutParams(dimension, dimension, 8388693));
            frameLayout.post(new uv6(2, frameLayout, vkImageSimple));
            this.f = vkImageSimple;
            this.c = frameLayout;
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            if (hVar instanceof b) {
                b bVar = (b) hVar;
                boolean z = bVar.d;
                Drawable drawable = bVar.c;
                Integer num = bVar.b;
                VkAvatar vkAvatar = this.d;
                if (vkAvatar != null) {
                    bwt0.S(vkAvatar, new u4e(bVar, 27));
                }
                VkCounter vkCounter = this.e;
                if (vkCounter != null) {
                    bwt0.p0(vkCounter, (num == null || z) ? false : true);
                }
                if (num != null) {
                    int intValue = num.intValue();
                    VkCounter vkCounter2 = this.e;
                    if (vkCounter2 != null) {
                        vkCounter2.setCounterWithoutAnimation(intValue);
                    }
                }
                VkImageSimple vkImageSimple = this.f;
                if (vkImageSimple != null) {
                    bwt0.p0(vkImageSimple, (drawable == null || z) ? false : true);
                }
                VkImageSimple vkImageSimple2 = this.f;
                if (vkImageSimple2 != null) {
                    vkImageSimple2.setImageDrawable(drawable);
                }
                VkAvatar vkAvatar2 = this.d;
                if (vkAvatar2 != null) {
                    vkAvatar2.S0();
                    if (this.b && z) {
                        vkAvatar2.W0(new ndu0(), true);
                        vkAvatar2.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27));
                    } else {
                        vkAvatar2.W0(null, false);
                    }
                }
                int i = C0500a.$EnumSwitchMapping$0[this.a.ordinal()];
                FrameLayout frameLayout = this.c;
                if (i == 1) {
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = cn70.b(72);
                    layoutParams.height = cn70.b(72);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
                    a.p(frameLayout.getId(), -1);
                    a.n(frameLayout.getId(), 0);
                    a.C(frameLayout.getId(), "1f");
                    a.b(constraintLayout);
                }
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.c;
        }
    }

    /* compiled from: GroupHorizontalListItemVh.kt */
    public static final class b implements VkTile.h {
        public final izs<Integer, String> a;
        public final Integer b;
        public final Drawable c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super Integer, String> izsVar, Integer num, Drawable drawable, boolean z) {
            this.a = izsVar;
            this.b = num;
            this.c = drawable;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Drawable drawable = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisualContentParams(avatarUrl=");
            sb.append(this.a);
            sb.append(", counterValue=");
            sb.append(this.b);
            sb.append(", metaIcon=");
            sb.append(this.c);
            sb.append(", hasLiveBadge=");
            return q0.a(sb, this.d, ')');
        }
    }

    public GroupHorizontalListItemVh(Size size, m3a m3aVar, sng sngVar, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = size;
        this.i = true;
        this.j = m3aVar;
        this.k = sngVar;
        this.m = new com.vk.catalog2.common.ui.mvp.holder.group.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r15 > 0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        VkTile vkTile;
        Integer num;
        super.N6(uIBlock);
        if ((uIBlock instanceof UIBlockGroup) && (vkTile = this.l) != null) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            Group group = uIBlockGroup.y;
            GroupCatalogItem groupCatalogItem = uIBlockGroup.z;
            boolean z = this.i;
            if (groupCatalogItem != null) {
                int i = groupCatalogItem.d;
                num = Integer.valueOf(i);
                if (z) {
                }
            }
            num = null;
            Context context = vkTile.getContext();
            boolean z2 = group.y.b;
            baf0 baf0Var = z ? null : z2 ? new baf0(m33.a(R.drawable.vk_icon_verified_centered_16, context), krv0.m(R.attr.vk_ui_icon_accent, context)) : (!group.W || z2) ? null : new baf0(m33.a(R.drawable.vk_icon_verified_centered_16, context), krv0.m(R.attr.vk_ui_icon_secondary, context));
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            String c = VerifyInfoHelper.c(vkTile.getContext(), group.y);
            vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, group.d), 0, null, null, null, null, null, 510));
            boolean z3 = false;
            z3 = false;
            clu cluVar = new clu(group, z3 ? 1 : 0);
            GroupsVideoLivesDataDto groupsVideoLivesDataDto = group.x0;
            if ((groupsVideoLivesDataDto != null ? groupsVideoLivesDataDto.e() : false) && ((Boolean) this.f.getValue()).booleanValue()) {
                z3 = true;
            }
            vkTile.setVisualContentParams(new b(cluVar, num, baf0Var, z3));
            jjc.g(vkTile, new mu1(16, this, group));
            vkTile.setContentDescription(group.d + '\n' + c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTile vkTile = new VkTile(layoutInflater.getContext(), null, 6);
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setDecorator(this.m);
        vkTile.setVisualContentController(new a(vkTile.getContext(), this.h, ((Boolean) this.f.getValue()).booleanValue()));
        vkTile.setClipToPadding(false);
        this.l = vkTile;
        return vkTile;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
