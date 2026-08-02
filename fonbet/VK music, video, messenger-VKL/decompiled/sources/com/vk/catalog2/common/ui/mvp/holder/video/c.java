package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.d1x;
import xsna.e3m;
import xsna.epx;
import xsna.f5h0;
import xsna.gpt0;
import xsna.iah0;
import xsna.m33;

/* compiled from: VideoPreviewVh.kt */
/* loaded from: classes16.dex */
public final class c {
    public final VideoItemListSettings a;
    public final VideoItemListLargeVh.a b;
    public VKImageView c;

    /* compiled from: VideoPreviewVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoItemListSettings.CornerType.values().length];
            try {
                iArr[VideoItemListSettings.CornerType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoItemListSettings.CornerType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoItemListSettings.CornerType.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(VideoItemListSettings videoItemListSettings, VideoItemListLargeVh.a aVar) {
        this.a = videoItemListSettings;
        this.b = aVar;
    }

    public final void a(VideoFile videoFile) {
        float h = ImageScreenSize.BIG.h();
        gpt0 gpt0Var = gpt0.a;
        VKImageView vKImageView = this.c;
        if (vKImageView == null) {
            vKImageView = null;
        }
        float o = gpt0.o(vKImageView.getContext()) * h;
        VKImageView vKImageView2 = this.c;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        ImageSize Cb = videoFile.getImage().Cb((int) o, true, false);
        vKImageView2.s0(Cb != null ? Cb.d.d : null);
    }

    public final VKImageView b(Context context) {
        int i;
        ImageView.ScaleType scaleType;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.preview);
        VideoItemListLargeVh.a aVar = this.b;
        vKImageView.setActualScaleType(aVar instanceof VideoItemListLargeVh.a.b ? f5h0.i.a : f5h0.f.a);
        VideoItemListSettings videoItemListSettings = this.a;
        boolean z = videoItemListSettings.g;
        VideoItemListSettings.CornerType cornerType = videoItemListSettings.h;
        if (z) {
            vKImageView.setForeground(new d1x(cornerType.h(), e3m.f(R.attr.vk_ui_transparent, context), iah0.a(1), context));
        }
        vKImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i2 = a.$EnumSwitchMapping$0[cornerType.ordinal()];
        if (i2 == 1) {
            i = R.drawable.default_placeholder;
        } else if (i2 == 2) {
            i = R.drawable.default_placeholder_8;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.default_placeholder_12;
        }
        if (epx.f(aVar, VideoItemListLargeVh.a.C0509a.a)) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else {
            if (!epx.f(aVar, VideoItemListLargeVh.a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        Drawable a2 = m33.a(i, vKImageView.getContext());
        vKImageView.setPlaceholderImage(a2);
        vKImageView.F0(a2, scaleType);
        this.c = vKImageView;
        return vKImageView;
    }
}
