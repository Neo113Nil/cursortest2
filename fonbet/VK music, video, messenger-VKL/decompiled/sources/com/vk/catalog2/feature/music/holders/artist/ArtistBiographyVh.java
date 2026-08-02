package com.vk.catalog2.feature.music.holders.artist;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import xsna.b5a;
import xsna.bjc;
import xsna.bwt0;
import xsna.c750;
import xsna.cw;
import xsna.dhr0;
import xsna.dw20;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.ho8;
import xsna.k840;
import xsna.oq;
import xsna.p5;
import xsna.q3a;
import xsna.r5v0;
import xsna.r8a;
import xsna.t8f0;
import xsna.tlo0;
import xsna.tq;
import xsna.u01;
import xsna.uq3;
import xsna.uqm0;
import xsna.v1v;
import xsna.w5;
import xsna.wr0;
import xsna.zc40;

/* compiled from: ArtistBiographyVh.kt */
/* loaded from: classes16.dex */
public final class ArtistBiographyVh implements CatalogViewHolder {
    public final r8a b;
    public final q3a c;
    public final c750 d;
    public final b5a e;
    public final zc40 f;
    public LinkedTextView g;
    public VkCell h;
    public boolean i;
    public UIBlockArtistBio j;
    public String k;
    public String l;
    public String m;
    public io.reactivex.rxjava3.disposables.c n;
    public io.reactivex.rxjava3.disposables.c o;
    public dw20 p;
    public Context q;
    public ValueAnimator r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public final u01 v = new u01(this, 1);

    /* compiled from: ArtistBiographyVh.kt */
    public static final class a implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: ArtistBiographyVh.kt */
    public static final class b implements VkCell.d {
        public static final VkCell.Left.Main.Size c = VkCell.Left.Main.Size.Small;
        public final VkAvatar a;
        public String b;

        public b(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                String str = cVar.a;
                if (epx.f(this.b, str)) {
                    return;
                }
                this.b = str;
                this.a.s0(str);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ArtistBiographyVh.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUrl="), this.a, ')');
        }
    }

    public ArtistBiographyVh(r8a r8aVar, q3a q3aVar, c750 c750Var, b5a b5aVar, zc40 zc40Var) {
        this.b = r8aVar;
        this.c = q3aVar;
        this.d = c750Var;
        this.e = b5aVar;
        this.f = zc40Var;
    }

    public static void a(CommonAudioStat$TypeAudioArtistClickItem.EventType eventType, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new CommonAudioStat$TypeAudioArtistClickItem(new CommonStat$TypeTrackCodeItem(str), CommonAudioStat$TypeAudioArtistClickItem.RefSource.ARTIST_BIO, eventType), 2)).q();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.o = null;
        dw20 dw20Var = this.p;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.p = null;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = null;
        this.m = null;
        zc40.b();
        this.f.d.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r6 != null) goto L49;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        LinkedTextView linkedTextView;
        String str;
        VkCell.Middle.d dVar;
        if (uIBlock instanceof UIBlockArtistBio) {
            UIBlockArtistBio uIBlockArtistBio = this.j;
            if (!epx.f(uIBlockArtistBio != null ? uIBlockArtistBio.b : null, uIBlock.b)) {
                this.i = false;
                this.s = false;
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            UIBlockArtistBio uIBlockArtistBio2 = (UIBlockArtistBio) uIBlock;
            Artist artist = uIBlockArtistBio2.y;
            this.j = uIBlockArtistBio2;
            String str2 = uIBlockArtistBio2.z;
            if (str2 != null) {
                this.k = str2;
            }
            String str3 = uIBlockArtistBio2.B;
            if (str3 != null) {
                this.l = str3;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.o;
            if (cVar != null) {
                cVar.dispose();
            }
            r5v0 r5v0Var = k840.a.h;
            if (r5v0Var == null) {
                r5v0Var = null;
            }
            this.o = new i0(r5v0Var.a.a, new com.vk.movika.sdk.base.flow.binding.c(new wr0(1), 1)).f(uq3.class).subscribe(new cw(new w5(this, 4), 2));
            int i = artist.i ? R.drawable.vk_icon_check_outline_16 : R.drawable.vk_icon_add_16;
            String str4 = artist.c;
            Integer num = artist.n;
            if (str4 == null || str4.length() == 0) {
                VkCell vkCell = this.h;
                if (vkCell != null) {
                    bwt0.p0(vkCell, false);
                }
            } else {
                VkCell vkCell2 = this.h;
                if (vkCell2 != null) {
                    bwt0.p0(vkCell2, true);
                }
                Image image = artist.f;
                if (image != null) {
                    VkCell.Left.Main.Size size = b.c;
                    Context context = this.q;
                    if (context == null) {
                        context = null;
                    }
                    ImageSize Cb = image.Cb(size.k(context), true, false);
                    if (Cb != null) {
                        str = Cb.d.d;
                    }
                }
                str = "";
                if (!epx.f(this.m, str)) {
                    VkCell vkCell3 = this.h;
                    if (vkCell3 != null) {
                        vkCell3.setLeftMainAvatarController(new a());
                    }
                    this.m = str;
                }
                VkCell vkCell4 = this.h;
                if (vkCell4 != null) {
                    vkCell4.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(str), b.c)));
                }
                VkCell vkCell5 = this.h;
                if (vkCell5 != null) {
                    VkCell.Middle.a aVar = VkCell.Middle.Companion;
                    tlo0.h d = oq.d(tlo0.Companion, artist.c);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    VkCell.Middle.e eVar = new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
                    if (num == null || num.intValue() >= 1) {
                        int intValue = num.intValue();
                        String f = uqm0.f(intValue);
                        Context context2 = this.q;
                        if (context2 == null) {
                            context2 = null;
                        }
                        Resources resources = context2.getResources();
                        dVar = new VkCell.Middle.d(new tlo0.h(v1v.a(' ', f, intValue >= 1000 ? resources.getQuantityString(R.plurals.listeners_of_artist, 1000) : resources.getQuantityString(R.plurals.listeners_of_artist, intValue))), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
                    } else {
                        dVar = null;
                    }
                    vkCell5.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, null, 12));
                }
                VkCell vkCell6 = this.h;
                if (vkCell6 != null) {
                    vkCell6.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(tq.h(tlo0.Companion, artist.i ? R.string.music_artist_is_subscribed : R.string.music_subscribe_artist), new p5(3, artist, this), VkButton.Appearance.Neutral, VkButton.Mode.Secondary, VkButton.Size.Small, new VkCell.Right.a.b.c(new gko(i), Integer.valueOf(R.attr.vk_ui_icon_primary), 2), null, null, 1984), null, null, null, 30));
                }
            }
            String str5 = artist.d;
            if (str5 == null || str5.length() == 0) {
                LinkedTextView linkedTextView2 = this.g;
                if (linkedTextView2 != null) {
                    bwt0.p0(linkedTextView2, false);
                }
            } else {
                r8a r8aVar = this.b;
                CharSequence a2 = r8aVar.a(str5);
                CharSequence b2 = r8aVar.b(a2, this.v, 0.45f);
                this.t = b2;
                this.u = a2;
                if (!this.i) {
                    a2 = b2;
                }
                LinkedTextView linkedTextView3 = this.g;
                if (!TextUtils.equals(a2, linkedTextView3 != null ? linkedTextView3.getText() : null) && (linkedTextView = this.g) != null) {
                    linkedTextView.setText(a2);
                }
                LinkedTextView linkedTextView4 = this.g;
                if (linkedTextView4 != null) {
                    bwt0.p0(linkedTextView4, true);
                }
            }
            this.f.a(this, uIBlock);
        }
    }

    public final void b(boolean z) {
        this.c.b(new t8f0(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 4), z), false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_artist_biography, viewGroup, false);
        this.q = layoutInflater.getContext();
        this.g = (LinkedTextView) viewGroup2.findViewById(R.id.text_block);
        this.h = (VkCell) viewGroup2.findViewById(R.id.artist_bio_cell);
        return viewGroup2;
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
