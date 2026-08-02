package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockActionDnDReorder;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.core.view.CorrectlyMeasuringTextView;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.a390;
import xsna.ajd0;
import xsna.b25;
import xsna.be80;
import xsna.bpn0;
import xsna.buz;
import xsna.c98;
import xsna.cfi0;
import xsna.cfp0;
import xsna.d1s0;
import xsna.dhr0;
import xsna.e3m;
import xsna.efr0;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.g2c0;
import xsna.g7s0;
import xsna.g8n0;
import xsna.i1t0;
import xsna.iah0;
import xsna.j5g;
import xsna.jtc0;
import xsna.m6t0;
import xsna.msy;
import xsna.mto0;
import xsna.o25;
import xsna.pvh0;
import xsna.qc00;
import xsna.rl3;
import xsna.s290;
import xsna.tni;
import xsna.tnk;
import xsna.u4a;
import xsna.unk;
import xsna.uqm0;
import xsna.vpn0;
import xsna.w8i;
import xsna.w8s0;
import xsna.wmg;
import xsna.xuo0;
import xsna.y3l0;
import xsna.ydt0;

/* compiled from: VideoAlbumVh.kt */
/* loaded from: classes16.dex */
public final class VideoAlbumVh implements CatalogViewHolder, unk, View.OnClickListener, w8i {
    public final Object A;
    public final Object B;
    public final Object C;
    public VkImage D;
    public final Object E;
    public final Object F;
    public final bpn0 G;
    public final boolean H;
    public final boolean I;
    public final Object J;
    public final int b;
    public final int c;
    public final u4a d;
    public final g7s0 e;
    public final b25 f;
    public final VideoCatalogAlbumBottomSheet g;
    public final Float h;
    public VkText i;
    public VkImage j;
    public VkContentBadge k;
    public VkImage l;
    public VideoOverlayView m;
    public VkText n;
    public VkImage o;
    public VkImage p;
    public VkImage q;
    public VkImage r;
    public tnk s;
    public VkImage t;
    public VKAvatarView u;
    public CorrectlyMeasuringTextView v;
    public VkText w;
    public VkText x;
    public final Object y;
    public UIBlockVideoAlbum z;

    public VideoAlbumVh(int i, int i2, u4a u4aVar, Float f, int i3) {
        g7s0 B = fxc0.B();
        b25 a = o25.a();
        f = (i3 & 64) != 0 ? null : f;
        this.b = i;
        this.c = i2;
        this.d = u4aVar;
        this.e = B;
        this.f = a;
        this.g = VideoCatalogAlbumBottomSheet.a.a;
        this.h = f;
        qc00 qc00Var = new qc00(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, qc00Var);
        this.A = msy.a(lazyThreadSafetyMode, new pvh0(this, 14));
        this.B = msy.a(lazyThreadSafetyMode, new cfi0(5));
        this.C = msy.a(lazyThreadSafetyMode, new g2c0(12));
        this.E = msy.a(lazyThreadSafetyMode, new ajd0(this, 17));
        this.F = msy.a(lazyThreadSafetyMode, new vpn0(this, 9));
        this.G = new bpn0(new g8n0(this, 9));
        this.H = B.J().Y1();
        this.I = B.J().R1();
        this.J = msy.a(lazyThreadSafetyMode, new y3l0(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ca  */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        jtc0 jtc0Var;
        VkImage vkImage;
        VkImage vkImage2;
        VkImage vkImage3;
        VkImage vkImage4;
        VkImage vkImage5;
        Object obj;
        int i;
        PrivacySetting.PrivacyRule privacyRule;
        ImageSize Cb;
        String string;
        UIBlockVideoAlbum uIBlockVideoAlbum = uIBlock instanceof UIBlockVideoAlbum ? (UIBlockVideoAlbum) uIBlock : null;
        if (uIBlockVideoAlbum == null) {
            return;
        }
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        VkText vkText = this.i;
        if (vkText == null) {
            vkText = null;
        }
        Resources resources = vkText.getResources();
        VkText vkText2 = this.i;
        if (vkText2 == null) {
            vkText2 = null;
        }
        String str = videoAlbum.d;
        List<VideoSeason> list = videoAlbum.q;
        VideoRestriction videoRestriction = videoAlbum.o;
        int i2 = videoAlbum.f;
        vkText2.setText(str);
        VkText vkText3 = this.x;
        if (vkText3 != null) {
            int i3 = videoAlbum.m;
            vkText3.setText(enj.i(resources, R.plurals.followers_count, i3, R.string.video_catalog_playlist_zero_subscribers, uqm0.f(i3)));
        }
        VkText vkText4 = this.n;
        if (vkText4 != null) {
            long millis = TimeUnit.SECONDS.toMillis(videoAlbum.g);
            xuo0.a.getClass();
            if (xuo0.a() - millis < tni.l()) {
                string = resources.getString(R.string.video_album_updated_right_now);
            } else {
                ?? r13 = this.y;
                ((StringBuffer) r13.getValue()).setLength(0);
                mto0.a(millis, (StringBuffer) r13.getValue(), mto0.a.C3369a.g);
                string = resources.getString(R.string.video_album_updated, (StringBuffer) r13.getValue());
            }
            vkText4.setText(string);
        }
        VkText vkText5 = this.w;
        if (vkText5 != null) {
            vkText5.setText(String.valueOf(i2));
        }
        if (epx.f(videoAlbum.c, this.f.c())) {
            VKAvatarView vKAvatarView = this.u;
            if (vKAvatarView != null) {
                vKAvatarView.setVisibility(8);
            }
            CorrectlyMeasuringTextView correctlyMeasuringTextView = this.v;
            if (correctlyMeasuringTextView != null) {
                correctlyMeasuringTextView.setVisibility(8);
            }
            VkImage vkImage6 = this.t;
            if (vkImage6 != null) {
                vkImage6.setVisibility(8);
            }
        } else {
            VerifyInfo verifyInfo = uIBlockVideoAlbum.D;
            VideoOverlayView videoOverlayView = this.m;
            if (videoOverlayView == null) {
                videoOverlayView = null;
            }
            int a = e3m.a(R.dimen.catalog_video_album_owner_avatar_small_size, videoOverlayView.getContext());
            Image image = uIBlockVideoAlbum.C;
            String str2 = (image == null || (Cb = image.Cb(a, false, true)) == null) ? null : Cb.d.d;
            VKAvatarView vKAvatarView2 = this.u;
            if (vKAvatarView2 != null) {
                VKAvatarView.Z0(vKAvatarView2, str2, null, ((UIBlockVideoAlbum) uIBlock).E ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
            }
            VKAvatarView vKAvatarView3 = this.u;
            if (vKAvatarView3 != null) {
                vKAvatarView3.y0(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
            }
            CorrectlyMeasuringTextView correctlyMeasuringTextView2 = this.v;
            if (correctlyMeasuringTextView2 != null) {
                correctlyMeasuringTextView2.setText(uIBlockVideoAlbum.B);
            }
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfoHelper.k(this.t, false, verifyInfo, false, false, 48);
        }
        Image image2 = videoAlbum.h;
        if (videoRestriction != null) {
            VkImage vkImage7 = this.j;
            if (vkImage7 == null) {
                vkImage7 = null;
            }
            vkImage7.setVisibility(4);
            VkImage vkImage8 = this.l;
            if (vkImage8 == null) {
                vkImage8 = null;
            }
            f4m.j(vkImage8);
            VideoOverlayView videoOverlayView2 = this.m;
            if (videoOverlayView2 == null) {
                videoOverlayView2 = null;
            }
            videoOverlayView2.setVisibility(0);
            VideoOverlayView videoOverlayView3 = this.m;
            if (videoOverlayView3 == null) {
                videoOverlayView3 = null;
            }
            videoOverlayView3.Z4((i1t0) this.A.getValue(), new VideoOverlayView.c.f(((a390) this.B.getValue()).a(videoRestriction), ((s290) this.C.getValue()).a(image2), null));
        } else {
            VkImage vkImage9 = this.j;
            if (vkImage9 == null) {
                vkImage9 = null;
            }
            vkImage9.setVisibility(0);
            VideoOverlayView videoOverlayView4 = this.m;
            if (videoOverlayView4 == null) {
                videoOverlayView4 = null;
            }
            f4m.j(videoOverlayView4);
            VkImage vkImage10 = this.j;
            if (vkImage10 == null) {
                vkImage10 = null;
            }
            if (videoAlbum.i) {
                bpn0 bpn0Var = VideoOverlayView.I;
                Object c = VideoOverlayView.b.c();
                if (c instanceof jtc0) {
                    jtc0Var = (jtc0) c;
                    vkImage10.setVkPostprocessor(jtc0Var);
                    vkImage = this.j;
                    if (vkImage == null) {
                        vkImage = null;
                    }
                    ImageSize Cb2 = image2.Cb(vkImage.getResources().getDimensionPixelSize(this.c), true, false);
                    String str3 = Cb2 == null ? Cb2.d.d : null;
                    vkImage2 = this.j;
                    if (vkImage2 == null) {
                        vkImage2 = null;
                    }
                    vkImage2.s0(str3);
                    vkImage3 = this.l;
                    if (vkImage3 == null) {
                        vkImage3 = null;
                    }
                    vkImage3.o0(null, null);
                    vkImage4 = this.l;
                    if (vkImage4 == null) {
                        vkImage4 = null;
                    }
                    vkImage4.setVisibility(8);
                    vkImage5 = this.j;
                    if (vkImage5 == null) {
                        vkImage5 = null;
                    }
                    vkImage5.setOnLoadCallback(new d1s0(this, str3));
                }
            }
            jtc0Var = null;
            vkImage10.setVkPostprocessor(jtc0Var);
            vkImage = this.j;
            if (vkImage == null) {
            }
            ImageSize Cb22 = image2.Cb(vkImage.getResources().getDimensionPixelSize(this.c), true, false);
            if (Cb22 == null) {
            }
            vkImage2 = this.j;
            if (vkImage2 == null) {
            }
            vkImage2.s0(str3);
            vkImage3 = this.l;
            if (vkImage3 == null) {
            }
            vkImage3.o0(null, null);
            vkImage4 = this.l;
            if (vkImage4 == null) {
            }
            vkImage4.setVisibility(8);
            vkImage5 = this.j;
            if (vkImage5 == null) {
            }
            vkImage5.setOnLoadCallback(new d1s0(this, str3));
        }
        if (this.H) {
            List<? extends PrivacySetting.PrivacyRule> list2 = videoAlbum.j;
            Integer a2 = list2 != null ? m6t0.a(list2) : null;
            VkImage vkImage11 = this.o;
            if (vkImage11 != null) {
                if (videoAlbum.Gb() || a2 == null) {
                    i = 8;
                } else {
                    VkImage vkImage12 = this.o;
                    if (vkImage12 != null) {
                        List<? extends PrivacySetting.PrivacyRule> list3 = videoAlbum.j;
                        vkImage12.setContentDescription((list3 == null || (privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(list3)) == null) ? null : privacyRule.Ab());
                    }
                    VkImage vkImage13 = this.o;
                    if (vkImage13 != null) {
                        vkImage13.setImageResource(a2.intValue());
                    }
                    i = 0;
                }
                vkImage11.setVisibility(i);
            }
        } else {
            VkImage vkImage14 = this.o;
            if (vkImage14 != null) {
                vkImage14.setImageResource(R.drawable.vk_icon_lock_16);
            }
            VkImage vkImage15 = this.o;
            if (vkImage15 != null) {
                vkImage15.setVisibility(!videoAlbum.Gb() ? 0 : 8);
            }
        }
        VkImage vkImage16 = this.r;
        if (vkImage16 != null) {
            vkImage16.setVisibility(((UIBlockVideoAlbum) uIBlock).A ? 0 : 8);
        }
        VkImage vkImage17 = this.q;
        if (vkImage17 != null) {
            vkImage17.setVisibility(!((UIBlockVideoAlbum) uIBlock).y.k ? 0 : 8);
        }
        this.z = uIBlockVideoAlbum;
        Iterator<T> it = uIBlock.Db().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((UIBlockDragDropAction) obj) instanceof UIBlockActionDnDReorder) {
                    break;
                }
            }
        }
        boolean z = obj != null;
        VkImage vkImage18 = this.D;
        if (vkImage18 != null) {
            vkImage18.setVisibility(z ? 0 : 8);
        }
        if (this.I) {
            VkImage vkImage19 = this.j;
            if (vkImage19 == null) {
                vkImage19 = null;
            }
            vkImage19.setForeground(null);
            VkText vkText6 = this.w;
            if (vkText6 != null) {
                vkText6.setVisibility(8);
            }
            VkImage vkImage20 = this.p;
            if (vkImage20 != null) {
                vkImage20.setVisibility(8);
            }
            VkContentBadge vkContentBadge = this.k;
            if (vkContentBadge != null) {
                vkContentBadge.setVisibility(0);
                VkText vkText7 = this.i;
                if (vkText7 == null) {
                    vkText7 = null;
                }
                Context context = vkText7.getContext();
                boolean isEmpty = list.isEmpty();
                String quantityString = context.getResources().getQuantityString(R.plurals.catalog_album_video_videos_count, i2, Integer.valueOf(i2));
                String quantityString2 = context.getResources().getQuantityString(R.plurals.catalog_album_video_seasons_count, list.size(), Integer.valueOf(list.size()));
                if (isEmpty) {
                    quantityString2 = j5g.g0(rl3.I(new String[]{isEmpty ? null : quantityString2, quantityString}), " · ", null, null, 0, null, 62);
                }
                vkContentBadge.setText(quantityString2);
            }
        }
    }

    @Override // xsna.unk
    public final void a(tnk tnkVar) {
        this.s = tnkVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.i = (VkText) inflate.findViewById(R.id.title);
        this.n = (VkText) inflate.findViewById(R.id.update_information);
        this.o = (VkImage) inflate.findViewById(R.id.privacy_icon);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.icon_play);
        VkImage vkImage2 = null;
        if (vkImage != null) {
            vkImage.setImageResource(R.drawable.vk_icon_list_play_outline_20);
        } else {
            vkImage = null;
        }
        this.p = vkImage;
        this.j = (VkImage) inflate.findViewById(R.id.preview);
        this.k = (VkContentBadge) inflate.findViewById(R.id.badge);
        this.l = (VkImage) inflate.findViewById(R.id.preview_bg);
        this.m = (VideoOverlayView) inflate.findViewById(R.id.vo_overlay);
        VkImage vkImage3 = (VkImage) inflate.findViewById(R.id.menu);
        if (vkImage3 != null) {
            vkImage3.setImageResource(R.drawable.vk_icon_more_vertical_16);
        } else {
            vkImage3 = null;
        }
        this.q = vkImage3;
        VkImage vkImage4 = (VkImage) inflate.findViewById(R.id.new_videos_indicator);
        if (vkImage4 != null) {
            vkImage4.setImageResource(R.drawable.ic_online_composite_20);
            vkImage2 = vkImage4;
        }
        this.r = vkImage2;
        this.u = (VKAvatarView) inflate.findViewById(R.id.owner_image);
        this.v = (CorrectlyMeasuringTextView) inflate.findViewById(R.id.owner_name);
        this.t = (VkImage) inflate.findViewById(R.id.icon_verify);
        this.w = (VkText) inflate.findViewById(R.id.video_count);
        this.x = (VkText) inflate.findViewById(R.id.followers_count);
        VkImage vkImage5 = this.q;
        if (vkImage5 != null) {
            vkImage5.setOnClickListener(new c98(this, 1));
        }
        inflate.setOnClickListener(new c98(this, 1));
        VkImage vkImage6 = (VkImage) inflate.findViewById(R.id.drag_icon);
        this.D = vkImage6;
        if (vkImage6 != null) {
            vkImage6.setImageResource(R.drawable.vk_icon_menu_outline_16);
        }
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockVideoAlbum uIBlockVideoAlbum;
        VideoShareComponent value;
        ImageSize Cb;
        UIBlockVideoAlbum uIBlockVideoAlbum2 = this.z;
        if (uIBlockVideoAlbum2 == null || view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockVideoAlbum = this.z) == null) {
            return;
        }
        VideoAlbum videoAlbum = uIBlockVideoAlbum.y;
        int id = view.getId();
        u4a u4aVar = this.d;
        if (id != R.id.menu) {
            VkImage vkImage = this.r;
            if (vkImage != null && vkImage.getVisibility() == 0) {
                u4aVar.b.e.b(new buz(12, new efr0(this, 2), new wmg(this, 9)), false);
            }
            tnk tnkVar = this.s;
            if (tnkVar != null) {
                tnkVar.a();
            }
            u4aVar.b.f.a(new cfp0(uIBlockVideoAlbum, new VideoAlbumAnalyticsInfo(VideoAlbumAnalyticsInfo.ClickTarget.Open, null)));
            ydt0.e(this.e.Y(), h, videoAlbum, uIBlockVideoAlbum.f, u4aVar.b.m.b(SchemeStat$EventItem.Type.VIDEO_PLAYLIST, uIBlockVideoAlbum.f, false), 8);
            return;
        }
        VideoOverlayView videoOverlayView = this.m;
        if (videoOverlayView == null) {
            videoOverlayView = null;
        }
        int a = e3m.a(R.dimen.catalog_video_album_owner_avatar_small_size, videoOverlayView.getContext());
        VideoAlbum Ab = VideoAlbum.Ab(uIBlockVideoAlbum2.y, false, null, 262143);
        Image image = uIBlockVideoAlbum2.C;
        String str = (image == null || (Cb = image.Cb(a, false, true)) == null) ? null : Cb.d.d;
        u4a.a aVar = u4aVar.b;
        w8s0 w8s0Var = new w8s0(aVar.f, uIBlockVideoAlbum2);
        Lazy<VideoShareComponent> lazy = aVar.S;
        com.vk.video.ui.share.api.b S = (lazy == null || (value = lazy.getValue()) == null) ? null : value.S();
        boolean booleanValue = ((Boolean) this.J.getValue()).booleanValue();
        bpn0 bpn0Var = this.G;
        ?? r3 = this.E;
        if (booleanValue) {
            UIBlockVideoAlbum uIBlockVideoAlbum3 = this.z;
            new VideoCatalogAlbumBottomSheetRedesign(new VideoCatalogAlbumBottomSheetRedesign.a(Ab, ((Boolean) bpn0Var.getValue()).booleanValue(), uIBlockVideoAlbum3 != null ? uIBlockVideoAlbum3.f : null, str, w8s0Var, (be80) r3.getValue(), S)).c(h);
        } else {
            UIBlockVideoAlbum uIBlockVideoAlbum4 = this.z;
            this.g.a(h, Ab, new VideoCatalogAlbumBottomSheet.b(str), S, uIBlockVideoAlbum4 != null ? uIBlockVideoAlbum4.f : null, w8s0Var, (be80) r3.getValue(), ((Boolean) bpn0Var.getValue()).booleanValue());
        }
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
