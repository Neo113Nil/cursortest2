package com.vk.newsfeed.common.posting.listfriends;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vkontakte.android.R;
import java.util.List;
import xsna.anj;
import xsna.asp;
import xsna.bpn0;
import xsna.dhr0;
import xsna.sjo;
import xsna.x9;
import xsna.xjo;
import xsna.zrp;

/* compiled from: ListFriendsIconDrawable.kt */
/* loaded from: classes4.dex */
public final class ListFriendsIconDrawable extends Drawable {
    public final int a;
    public final IconSizes b;
    public final boolean c;
    public final Paint d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListFriendsIconDrawable.kt */
    public static final class IconSizes {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconSizes[] $VALUES;
        public static final IconSizes CAMERA_MINIATURES;
        public static final IconSizes FULL;
        public static final IconSizes OVERLAP_MINIATURES;
        private final float scaleSize;

        /* compiled from: ListFriendsIconDrawable.kt */
        public static final class a extends IconSizes {
            private final float posQuotientY;
            private final float scaleSize;

            public a() {
                super("CAMERA_MINIATURES", 2);
                this.posQuotientY = 2.8f;
                this.scaleSize = 0.4f;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float a(Integer num) {
                if (num.intValue() == 0) {
                    return 2.5f;
                }
                if (num.intValue() == 1) {
                    return 1.25f;
                }
                if (num.intValue() == 2) {
                    return 1.15f;
                }
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float h() {
                return this.posQuotientY;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float i() {
                return this.scaleSize;
            }
        }

        /* compiled from: ListFriendsIconDrawable.kt */
        public static final class b extends IconSizes {
            private final float posQuotientY;

            public b() {
                super("FULL", 0);
                this.posQuotientY = 2.5f;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float a(Integer num) {
                return 2.5f;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float h() {
                return this.posQuotientY;
            }
        }

        /* compiled from: ListFriendsIconDrawable.kt */
        public static final class c extends IconSizes {
            private final float posQuotientY;
            private final float scaleSize;

            public c() {
                super("OVERLAP_MINIATURES", 1);
                this.posQuotientY = 3.2f;
                this.scaleSize = 0.6f;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float a(Integer num) {
                if (num.intValue() == 0) {
                    return 3.15f;
                }
                if (num.intValue() == 1) {
                    return 1.3f;
                }
                if (num.intValue() == 2) {
                    return 1.17f;
                }
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float h() {
                return this.posQuotientY;
            }

            @Override // com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable.IconSizes
            public final float i() {
                return this.scaleSize;
            }
        }

        static {
            b bVar = new b();
            FULL = bVar;
            c cVar = new c();
            OVERLAP_MINIATURES = cVar;
            a aVar = new a();
            CAMERA_MINIATURES = aVar;
            IconSizes[] iconSizesArr = {bVar, cVar, aVar};
            $VALUES = iconSizesArr;
            $ENTRIES = new asp(iconSizesArr);
        }

        public IconSizes() {
            throw null;
        }

        public IconSizes(String str, int i) {
            this.scaleSize = 1.0f;
        }

        public static IconSizes valueOf(String str) {
            return (IconSizes) Enum.valueOf(IconSizes.class, str);
        }

        public static IconSizes[] values() {
            return (IconSizes[]) $VALUES.clone();
        }

        public abstract float a(Integer num);

        public abstract float h();

        public float i() {
            return this.scaleSize;
        }
    }

    /* compiled from: ListFriendsIconDrawable.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public /* synthetic */ ListFriendsIconDrawable(int i, IconSizes iconSizes, int i2) {
        this(i, (i2 & 2) != 0 ? IconSizes.FULL : iconSizes, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, this.d);
        IconSizes iconSizes = IconSizes.OVERLAP_MINIATURES;
        IconSizes iconSizes2 = this.b;
        Drawable a2 = dhr0.t.a(iconSizes2 == iconSizes ? R.drawable.vk_icon_users_28 : R.drawable.vk_icon_users_outline_24);
        if (a2 != null) {
            Rect bounds = a2.getBounds();
            float exactCenterX = (getBounds().exactCenterX() - bounds.exactCenterX()) / iconSizes2.a(Integer.valueOf(this.c ? this.a : 0));
            float exactCenterY = (getBounds().exactCenterY() - bounds.exactCenterY()) / iconSizes2.h();
            dhr0.a.getClass();
            sjo.b(a2, anj.b(R.color.vk_white, dhr0.E()).getDefaultColor(), PorterDuff.Mode.SRC_IN);
            canvas.drawBitmap(Bitmap.createScaledBitmap(xjo.b(a2, 0, 0, 7), (int) (iconSizes2.i() * r0.getWidth()), (int) (iconSizes2.i() * r0.getHeight()), true), exactCenterX, exactCenterY, new Paint());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ListFriendsIconDrawable(int i, IconSizes iconSizes, boolean z) {
        this.a = i;
        this.b = iconSizes;
        this.c = z;
        Paint c = x9.c(true);
        this.d = c;
        bpn0 bpn0Var = new bpn0(new l(23));
        a aVar = (a) ((List) bpn0Var.getValue()).get(i % ((List) bpn0Var.getValue()).size());
        if (iconSizes == IconSizes.OVERLAP_MINIATURES) {
            if (i == 0) {
                aVar = (a) ((List) bpn0Var.getValue()).get(2);
            } else if (i == 1) {
                aVar = (a) ((List) bpn0Var.getValue()).get(0);
            } else if (i == 2) {
                aVar = (a) ((List) bpn0Var.getValue()).get(5);
            }
        }
        c.setColor(-1);
        c.setShader(null);
        if (aVar != null) {
            c.setShader(new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, aVar.a, aVar.b, Shader.TileMode.CLAMP));
        }
        invalidateSelf();
    }
}
