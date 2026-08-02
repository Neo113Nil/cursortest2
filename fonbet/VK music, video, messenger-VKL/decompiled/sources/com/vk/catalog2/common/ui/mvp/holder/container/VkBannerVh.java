package com.vk.catalog2.common.ui.mvp.holder.container;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.banner.BannerLocalImage;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.components.image.InteropPicture;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5a;
import xsna.brm0;
import xsna.fm4;
import xsna.h6m0;
import xsna.iah0;
import xsna.itg0;
import xsna.lqs0;
import xsna.msy;
import xsna.oq;
import xsna.pyr0;
import xsna.q3a;
import xsna.qc80;
import xsna.r8a;
import xsna.rlw;
import xsna.rsg0;
import xsna.slw;
import xsna.snx;
import xsna.tlo0;
import xsna.ulw;
import xsna.vlw;
import xsna.x2j0;
import xsna.x9l0;
import xsna.xxf0;

/* compiled from: VkBannerVh.kt */
/* loaded from: classes16.dex */
public class VkBannerVh implements CatalogViewHolder {
    public final q3a b;
    public final b5a c;
    public final r8a d;
    public final com.vk.catalog2.common.ui.mvp.util.a e;
    public final int f;
    public final BannerSize g;
    public final boolean h;
    public final boolean i;
    public VkBanner j;
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new x2j0(this, 18));
    public UIBlockPlaceholder l;
    public UIBlockAction m;
    public String n;
    public UIBlockAction o;
    public UIBlockAction p;
    public UIBlockAction q;

    /* compiled from: VkBannerVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BannerSize.values().length];
            try {
                iArr[BannerSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerSize.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BannerLocalImage.Radius.values().length];
            try {
                iArr2[BannerLocalImage.Radius.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BannerLocalImage.Radius.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BannerLocalImage.Radius.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogBannerImageMode.values().length];
            try {
                iArr3[CatalogBannerImageMode.ROUND_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CatalogBannerImageMode.ROUND_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CatalogBannerImageMode.SQUARE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CatalogBannerImageMode.SQUARE_BIG.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CatalogBannerImageMode.FULL_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public VkBannerVh(q3a q3aVar, b5a b5aVar, r8a r8aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, int i, BannerSize bannerSize, boolean z, boolean z2) {
        this.b = q3aVar;
        this.c = b5aVar;
        this.d = r8aVar;
        this.e = aVar;
        this.f = i;
        this.g = bannerSize;
        this.h = z;
        this.i = z2;
    }

    public static int b(UIBlockPlaceholder uIBlockPlaceholder) {
        BannerLocalImage bannerLocalImage;
        if (uIBlockPlaceholder.B == null && (bannerLocalImage = uIBlockPlaceholder.M) != null) {
            return iah0.a(bannerLocalImage.c);
        }
        CatalogBannerImageMode catalogBannerImageMode = uIBlockPlaceholder.H;
        int i = catalogBannerImageMode == null ? -1 : a.$EnumSwitchMapping$2[catalogBannerImageMode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? iah0.a(0) : iah0.a(400) : iah0.a(96) : iah0.a(48) : iah0.a(48) : iah0.a(28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x00d1, code lost:
    
        if (r6 == null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        com.vk.catalog2.common.ui.mvp.util.a aVar;
        rlw ulwVar;
        String str;
        VkBanner.b.c cVar;
        InteropPicture.Radius radius;
        VkBanner vkBanner;
        VkBanner vkBanner2;
        VkBanner vkBanner3;
        String str2;
        VkBanner.c cVar2;
        VkBanner vkBanner4;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null) {
            return;
        }
        this.l = uIBlockPlaceholder;
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        BannerLocalImage bannerLocalImage = uIBlockPlaceholder2.M;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder2.G;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
        UIBlockAction uIBlockAction = uIBlockPlaceholder2.F;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            aVar = this.e;
            if (i >= size) {
                break;
            }
            UIBlockAction uIBlockAction2 = arrayList.get(i);
            boolean z2 = uIBlockAction2.d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER;
            if (this.p == null && z2) {
                this.p = uIBlockAction2;
            } else {
                if (this.m == null) {
                    aVar.getClass();
                    if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction2)) {
                        this.m = uIBlockAction2;
                        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockAction2 instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlockAction2 : null;
                        this.n = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.B : null;
                    }
                }
                if (this.o == null) {
                    aVar.getClass();
                    if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction2)) {
                        this.o = uIBlockAction2;
                    }
                }
            }
            i++;
        }
        aVar.getClass();
        if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
            this.q = uIBlockAction;
        }
        CatalogBannerImageMode catalogBannerImageMode = CatalogBannerImageMode.FULL_BACKGROUND;
        CatalogBannerImageMode catalogBannerImageMode2 = uIBlockPlaceholder2.H;
        boolean z3 = catalogBannerImageMode == catalogBannerImageMode2;
        if (catalogBannerImageMode2 != CatalogBannerImageMode.NONE) {
            Image image = uIBlockPlaceholder2.B;
            if (image != null) {
                ?? r6 = this.k;
                if (((Number) r6.getValue()).intValue() > 0) {
                    ImageSize Cb = image.Cb(((Number) r6.getValue()).intValue(), false, false);
                    if (Cb != null) {
                        str = Cb.d.d;
                        ulwVar = str == null ? new vlw(str, null) : null;
                    }
                    str = null;
                    if (str == null) {
                    }
                } else {
                    ImageSize Cb2 = image.Cb(b(uIBlockPlaceholder2), true, false);
                    if (Cb2 != null) {
                        str = Cb2.d.d;
                        if (str == null) {
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                }
            }
            if (bannerLocalImage != null) {
                ulwVar = new ulw(bannerLocalImage.b);
                if (z3) {
                    VkBanner vkBanner5 = this.j;
                    if (vkBanner5 == null) {
                        vkBanner5 = null;
                    }
                    if (ulwVar != null && !(ulwVar instanceof slw)) {
                        if (ulwVar instanceof ulw) {
                            int i2 = ((ulw) ulwVar).a;
                            if (bannerLocalImage != null) {
                                int a2 = iah0.a(bannerLocalImage.c);
                                snx.b.c cVar3 = new snx.b.c(new ulw(i2), null, null, 14);
                                int i3 = a.$EnumSwitchMapping$1[bannerLocalImage.d.ordinal()];
                                if (i3 == 1) {
                                    radius = InteropPicture.Radius.Small;
                                } else if (i3 == 2) {
                                    radius = InteropPicture.Radius.Medium;
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    radius = InteropPicture.Radius.Large;
                                }
                                cVar = new VkBanner.b.c(a2, new InteropPicture(cVar3, null, radius, 6), null);
                            }
                        } else {
                            if (!(ulwVar instanceof vlw)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = new VkBanner.b.c(b(uIBlockPlaceholder2), new InteropPicture(new snx.b.c((vlw) ulwVar, null, null, 14), null, InteropPicture.Radius.Large, 6), null);
                        }
                        vkBanner5.setBefore(cVar);
                        vkBanner = this.j;
                        if (vkBanner == null) {
                            vkBanner = null;
                        }
                        vkBanner.setBackgroundMode(VkBanner.BackgroundMode.Light);
                        vkBanner2 = this.j;
                        if (vkBanner2 == null) {
                            vkBanner2 = null;
                        }
                        vkBanner2.setBackgroundImage(null);
                    }
                    cVar = null;
                    vkBanner5.setBefore(cVar);
                    vkBanner = this.j;
                    if (vkBanner == null) {
                    }
                    vkBanner.setBackgroundMode(VkBanner.BackgroundMode.Light);
                    vkBanner2 = this.j;
                    if (vkBanner2 == null) {
                    }
                    vkBanner2.setBackgroundImage(null);
                } else {
                    VkBanner vkBanner6 = this.j;
                    if (vkBanner6 == null) {
                        vkBanner6 = null;
                    }
                    vkBanner6.setBefore(null);
                    VkBanner vkBanner7 = this.j;
                    if (vkBanner7 == null) {
                        vkBanner7 = null;
                    }
                    vkBanner7.setBackgroundMode(VkBanner.BackgroundMode.Dark);
                    VkBanner vkBanner8 = this.j;
                    if (vkBanner8 == null) {
                        vkBanner8 = null;
                    }
                    vkBanner8.setBackgroundImage(ulwVar);
                }
                vkBanner3 = this.j;
                if (vkBanner3 == null) {
                    vkBanner3 = null;
                }
                if (this.h && this.i && this.o != null) {
                    z = true;
                }
                UIBlockAction uIBlockAction3 = this.m;
                UIBlockActionOpenUrl uIBlockActionOpenUrl2 = !(uIBlockAction3 instanceof UIBlockActionOpenUrl) ? (UIBlockActionOpenUrl) uIBlockAction3 : null;
                str2 = uIBlockActionOpenUrl2 == null ? uIBlockActionOpenUrl2.z : null;
                UIBlockAction uIBlockAction4 = this.o;
                UIBlockActionOpenUrl uIBlockActionOpenUrl3 = !(uIBlockAction4 instanceof UIBlockActionOpenUrl) ? (UIBlockActionOpenUrl) uIBlockAction4 : null;
                String str3 = uIBlockActionOpenUrl3 == null ? uIBlockActionOpenUrl3.z : null;
                tlo0.h d = oq.d(tlo0.Companion, uIBlockPlaceholder2.A);
                String str4 = uIBlockPlaceholder2.D;
                r8a r8aVar = this.d;
                tlo0.h hVar = str4 == null ? new tlo0.h(r8aVar.a(str4)) : null;
                String str5 = uIBlockPlaceholder2.E;
                VkBanner.e.a.b bVar = str5 == null ? new VkBanner.e.a.b(new tlo0.h(r8aVar.a(str5))) : null;
                if (str2 != null || str2.length() == 0) {
                    cVar2 = null;
                } else {
                    cVar2 = new VkBanner.c(new tlo0.h(str2), new x9l0(this, 19), VkButton.Mode.Primary, brm0.w(this.n, "accent", true) ? VkButton.Appearance.Accent : VkButton.Appearance.Overlay, null, null, null, 1008);
                }
                vkBanner3.setMiddle(new VkBanner.e(d, hVar, bVar, cVar2, (!z || str3 == null) ? null : new VkBanner.c(new tlo0.h(str3), new lqs0(this, 7), VkButton.Mode.Secondary, VkButton.Appearance.Overlay, null, null, null, 1008), null, 96));
                vkBanner4 = this.j;
                if (vkBanner4 == null) {
                    vkBanner4 = null;
                }
                vkBanner4.setAfter(this.p != null ? new VkBanner.a.b(new pyr0(this, 12), new tlo0.f(R.string.stickers_accessibility_close_notification), null, null, 12) : null);
            }
        }
        ulwVar = null;
        if (z3) {
        }
        vkBanner3 = this.j;
        if (vkBanner3 == null) {
        }
        if (this.h) {
            z = true;
        }
        UIBlockAction uIBlockAction32 = this.m;
        if (!(uIBlockAction32 instanceof UIBlockActionOpenUrl)) {
        }
        if (uIBlockActionOpenUrl2 == null) {
        }
        UIBlockAction uIBlockAction42 = this.o;
        if (!(uIBlockAction42 instanceof UIBlockActionOpenUrl)) {
        }
        if (uIBlockActionOpenUrl3 == null) {
        }
        tlo0.h d2 = oq.d(tlo0.Companion, uIBlockPlaceholder2.A);
        String str42 = uIBlockPlaceholder2.D;
        r8a r8aVar2 = this.d;
        if (str42 == null) {
        }
        String str52 = uIBlockPlaceholder2.E;
        if (str52 == null) {
        }
        if (str2 != null) {
        }
        cVar2 = null;
        vkBanner3.setMiddle(new VkBanner.e(d2, hVar, bVar, cVar2, (!z || str3 == null) ? null : new VkBanner.c(new tlo0.h(str3), new lqs0(this, 7), VkButton.Mode.Secondary, VkButton.Appearance.Overlay, null, null, null, 1008), null, 96));
        vkBanner4 = this.j;
        if (vkBanner4 == null) {
        }
        vkBanner4.setAfter(this.p != null ? new VkBanner.a.b(new pyr0(this, 12), new tlo0.f(R.string.stickers_accessibility_close_notification), null, null, 12) : null);
    }

    public final void a(UIBlockPlaceholder uIBlockPlaceholder, UIBlockAction uIBlockAction, boolean z) {
        qc80 qc80Var = new qc80(uIBlockPlaceholder, z);
        String str = uIBlockPlaceholder.z;
        this.c.a(qc80Var);
        String str2 = uIBlockAction.y;
        if (str2 != null) {
            itg0.m(rsg0.y0(new fm4(str, str2, uIBlockPlaceholder.f), null, null, 3));
            this.b.b(new xxf0(str), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        VkBanner vkBanner = (VkBanner) inflate;
        this.j = vkBanner;
        if (vkBanner == null) {
            vkBanner = null;
        }
        vkBanner.setOnClick(new h6m0(this, 21));
        return inflate;
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
