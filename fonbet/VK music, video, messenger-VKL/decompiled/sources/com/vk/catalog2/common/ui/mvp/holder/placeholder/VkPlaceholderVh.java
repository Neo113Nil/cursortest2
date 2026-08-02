package com.vk.catalog2.common.ui.mvp.holder.placeholder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.bwt0;
import xsna.dyc;
import xsna.gzs;
import xsna.oq;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.u4t0;
import xsna.vlw;

/* compiled from: VkPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class VkPlaceholderVh implements CatalogViewHolder {
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public VkPlaceholder c;
    public UIBlockAction d;
    public UIBlockAction e;

    /* compiled from: VkPlaceholderVh.kt */
    public static final class a {
    }

    /* compiled from: VkPlaceholderVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkPlaceholderVh.kt */
    public static final class c extends u4t0.a {
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Context context) {
            super(context);
            this.c = z;
        }

        @Override // xsna.u4t0.a
        public final void a(int i, VkButton.Mode mode) {
            VkPlaceholder.a.b a;
            VkPlaceholderVh vkPlaceholderVh = VkPlaceholderVh.this;
            VkPlaceholder vkPlaceholder = vkPlaceholderVh.c;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            VkPlaceholder.a bottom = vkPlaceholder.getBottom();
            VkPlaceholder.a.b bVar = bottom instanceof VkPlaceholder.a.b ? (VkPlaceholder.a.b) bottom : null;
            if (bVar != null) {
                VkPlaceholder vkPlaceholder2 = vkPlaceholderVh.c;
                if (vkPlaceholder2 == null) {
                    vkPlaceholder2 = null;
                }
                if (this.c) {
                    a = VkPlaceholder.a.b.a(bVar, VkPlaceholderVh.b(bVar.a, i, mode), null, 14);
                } else {
                    VkPlaceholder.a.C0857a c0857a = bVar.b;
                    a = VkPlaceholder.a.b.a(bVar, null, c0857a != null ? VkPlaceholderVh.b(c0857a, i, mode) : null, 13);
                }
                vkPlaceholder2.setBottom(a);
            }
        }
    }

    public VkPlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar) {
        this.b = aVar;
    }

    public static final VkPlaceholder.a.C0857a b(VkPlaceholder.a.C0857a c0857a, int i, VkButton.Mode mode) {
        tlo0.f h = tq.h(tlo0.Companion, i);
        gzs<s3q0> gzsVar = c0857a.b;
        VkPlaceholder.a.C0857a.C0858a c0858a = c0857a.c;
        VkPlaceholder.a.C0857a.C0858a c0858a2 = c0857a.d;
        Integer num = c0857a.e;
        VkButton.Size size = c0857a.f;
        VkButton.Appearance appearance = c0857a.h;
        boolean z = c0857a.i;
        c0857a.getClass();
        return new VkPlaceholder.a.C0857a(h, gzsVar, c0858a, c0858a2, num, size, mode, appearance, z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.f();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkPlaceholder.a.b bVar;
        VkPlaceholder.a.C0857a a2;
        ImageSize Cb;
        String str;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            this.d = null;
            this.e = null;
            ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
            String str2 = uIBlockPlaceholder.D;
            CatalogViewType catalogViewType = uIBlockPlaceholder.d;
            for (UIBlockAction uIBlockAction : arrayList) {
                UIBlockAction uIBlockAction2 = this.d;
                com.vk.catalog2.common.ui.mvp.util.a aVar = this.b;
                if (uIBlockAction2 == null) {
                    aVar.getClass();
                    if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                        this.d = uIBlockAction;
                    }
                } else if (this.e == null) {
                    aVar.getClass();
                    if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                        this.e = uIBlockAction;
                    }
                }
            }
            VkPlaceholder vkPlaceholder = this.c;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            bwt0.p0(vkPlaceholder, true);
            int i = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            int i2 = 72;
            if (i != 1) {
                if (i == 2) {
                    i2 = 160;
                }
            } else if ((str2 != null && str2.length() != 0) || catalogViewType == CatalogViewType.PLACEHOLDER_BIG || catalogViewType == CatalogViewType.PLACEHOLDER) {
                i2 = 100;
            }
            VkPlaceholder vkPlaceholder2 = this.c;
            if (vkPlaceholder2 == null) {
                vkPlaceholder2 = null;
            }
            Image image = uIBlockPlaceholder.B;
            vkPlaceholder2.setTop((image == null || (Cb = image.Cb(i2, true, false)) == null || (str = Cb.d.d) == null) ? null : new VkPlaceholder.c.C0860c(new vlw(str, null), new Size(i2, i2), null, null, 28));
            VkPlaceholder vkPlaceholder3 = this.c;
            if (vkPlaceholder3 == null) {
                vkPlaceholder3 = null;
            }
            String str3 = uIBlockPlaceholder.A;
            if ((str2 == null || str2.length() == 0) && catalogViewType != CatalogViewType.PLACEHOLDER_BIG && catalogViewType != CatalogViewType.PLACEHOLDER) {
                str3 = null;
            }
            vkPlaceholder3.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, str3 != null ? oq.d(tlo0.Companion, str3) : null), new VkPlaceholder.b.C0859b(14, str2 != null ? oq.d(tlo0.Companion, str2) : null)));
            VkPlaceholder vkPlaceholder4 = this.c;
            if (vkPlaceholder4 == null) {
                vkPlaceholder4 = null;
            }
            UIBlockAction uIBlockAction3 = this.d;
            if (uIBlockAction3 == null || (a2 = a(uIBlockAction3, true, uIBlock)) == null) {
                bVar = null;
            } else {
                UIBlockAction uIBlockAction4 = this.e;
                bVar = new VkPlaceholder.a.b(a2, uIBlockAction4 != null ? a(uIBlockAction4, false, uIBlock) : null, null, null, 8);
            }
            vkPlaceholder4.setBottom(bVar);
            VkPlaceholder vkPlaceholder5 = this.c;
            bwt0.Q(vkPlaceholder5 != null ? vkPlaceholder5 : null, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    public final VkPlaceholder.a.C0857a a(UIBlockAction uIBlockAction, boolean z, UIBlock uIBlock) {
        VkButton.Mode mode = z ? VkButton.Mode.Primary : VkButton.Mode.Secondary;
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        VkPlaceholder vkPlaceholder = this.c;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        return com.vk.catalog2.common.ui.mvp.util.a.g(this.b, uIBlockAction, mode, appearance, false, new c(z, vkPlaceholder.getContext()), new dyc(this, uIBlock, uIBlockAction, z), 8);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkPlaceholder vkPlaceholder = new VkPlaceholder(layoutInflater.getContext(), null, 6, 0);
        bwt0.d0(vkPlaceholder, true);
        this.c = vkPlaceholder;
        return vkPlaceholder;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
