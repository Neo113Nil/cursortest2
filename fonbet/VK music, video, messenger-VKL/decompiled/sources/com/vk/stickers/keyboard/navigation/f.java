package com.vk.stickers.keyboard.navigation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.b0u0;
import xsna.bwt0;
import xsna.cn70;
import xsna.h9l0;
import xsna.iut0;
import xsna.lgy;
import xsna.mgy;
import xsna.s3q0;
import xsna.ugr;
import xsna.v53;
import xsna.vfz;

/* compiled from: KeyboardNavigationVmojiGroupHolder.kt */
/* loaded from: classes6.dex */
public final class f extends vfz<mgy> {
    public final a.InterfaceC1801a l;
    public final View m;
    public final LinearLayout n;

    public f(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_navigation_vmoji_group_holder, viewGroup);
        this.l = cVar;
        this.m = this.itemView.findViewById(R.id.selected);
        this.n = (LinearLayout) this.itemView.findViewById(R.id.packs_container);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(mgy mgyVar) {
        mgy mgyVar2 = mgyVar;
        StickerStockItem stickerStockItem = mgyVar2.f;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = -1.0f;
        LinearLayout linearLayout = this.n;
        linearLayout.removeAllViews();
        for (StickerStockItem stickerStockItem2 : mgyVar2.e) {
            FrameLayout frameLayout = new FrameLayout(this.itemView.getContext());
            VKImageView vKImageView = new VKImageView(this.itemView.getContext(), null, 6, 0);
            vKImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i = h9l0.a;
            NotificationImage notificationImage = stickerStockItem2.v;
            vKImageView.o0(notificationImage != null ? NotificationImage.Db(notificationImage, i) : null, null);
            vKImageView.setContentDescription(stickerStockItem2.d);
            vKImageView.setSelected(stickerStockItem2.equals(stickerStockItem));
            bwt0.i0(vKImageView, new v53(15, this, stickerStockItem2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(28), cn70.b(28), 17);
            int b = cn70.b(6);
            layoutParams.setMargins(b, b, b, b);
            s3q0 s3q0Var = s3q0.a;
            frameLayout.addView(vKImageView, layoutParams);
            ImageView imageView = new ImageView(this.itemView.getContext());
            imageView.setImageResource(R.drawable.ic_stickers_new_style_badge_large);
            bwt0.p0(imageView, mgyVar2.c);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388661);
            layoutParams2.topMargin = cn70.b(6);
            layoutParams2.setMarginEnd(cn70.b(10));
            frameLayout.addView(imageView, layoutParams2);
            linearLayout.addView(frameLayout);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!frameLayout.isLaidOut()) {
                frameLayout.addOnLayoutChangeListener(new lgy(stickerStockItem2, mgyVar2, ref$FloatRef, frameLayout));
            } else if (stickerStockItem2.equals(stickerStockItem)) {
                ref$FloatRef.element = frameLayout.getX();
            }
        }
        this.m.post(new ugr(1, this, ref$FloatRef));
    }
}
