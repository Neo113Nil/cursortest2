package com.vk.clips.favorites.impl.ui.folders.content.recycler;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import defpackage.h0;
import kotlin.NoWhenBranchMatchedException;
import xsna.bo;
import xsna.bwt0;
import xsna.c3e;
import xsna.cj1;
import xsna.d3m;
import xsna.dj1;
import xsna.i1t0;
import xsna.iah0;
import xsna.io3;
import xsna.izs;
import xsna.od3;
import xsna.q3d0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.vfz;
import xsna.z13;

/* compiled from: ClipsFavoriteFolderContentListClipViewHolder.kt */
/* loaded from: classes16.dex */
public final class b extends vfz<c3e> {
    public static final int s = iah0.a(32);
    public static final int t = iah0.a(6);
    public final izs<com.vk.clips.favorites.impl.ui.folders.content.a, s3q0> l;
    public final int m;
    public final ImageView n;
    public final VKImageView o;
    public final VkText p;
    public final VideoOverlayView q;
    public final q3d0 r;

    /* compiled from: ClipsFavoriteFolderContentListClipViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.values().length];
            try {
                iArr[ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ClipsFavoriteFolderContentListFragment.d dVar, int i, ViewGroup viewGroup) {
        super(R.layout.clips_favorite_folder_content_list_clip_item, viewGroup);
        this.l = dVar;
        this.m = i;
        this.n = (ImageView) this.itemView.findViewById(R.id.favorite_folder_multi_select_image);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.favorite_folder_clip_preview);
        this.o = vKImageView;
        this.p = (VkText) this.itemView.findViewById(R.id.favorite_folder_clip_title);
        VideoOverlayView videoOverlayView = (VideoOverlayView) this.itemView.findViewById(R.id.favorite_folder_restriction_overlay);
        this.q = videoOverlayView;
        this.r = new q3d0(vKImageView);
        videoOverlayView.Y4(new cj1(11));
        videoOverlayView.V4(new dj1(13));
    }

    @Override // xsna.vfz
    public final void W5(c3e c3eVar) {
        c3e c3eVar2 = c3eVar;
        VideoOverlayView.c cVar = c3eVar2.f;
        h6(c3eVar2.b);
        ImageSize Cb = c3eVar2.d.Cb(iah0.f().widthPixels / this.m, true, false);
        this.o.load(Cb != null ? Cb.d.d : null);
        this.p.setText(tlo0.b.a(c3eVar2.e, this.itemView.getContext()));
        VideoOverlayView videoOverlayView = this.q;
        if (cVar != null) {
            bwt0.p0(videoOverlayView, true);
            videoOverlayView.Z4(new i1t0(true, bo.h()), cVar);
            videoOverlayView.X4(new z13(5));
            videoOverlayView.V4(new od3(10));
            videoOverlayView.Y4(new io3(6));
        } else {
            bwt0.p0(videoOverlayView, false);
        }
        bwt0.i0(this.itemView, new h0(7, this, c3eVar2));
    }

    public final void h6(ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState) {
        int i = a.$EnumSwitchMapping$0[clipsFavoriteFolderContentListItem$MultiSelectCheckboxState.ordinal()];
        if (i == 1) {
            d3m.e(this.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        ImageView imageView = this.n;
        if (i == 2) {
            imageView.setImageResource(R.drawable.vk_icon_check_circle_shadow_40);
            d3m.c(this.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageResource(R.drawable.vk_icon_circle_outline_shadow_40);
            d3m.c(this.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
