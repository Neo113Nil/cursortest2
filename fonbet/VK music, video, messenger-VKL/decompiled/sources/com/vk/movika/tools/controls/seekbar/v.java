package com.vk.movika.tools.controls.seekbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.libvideo.bottomsheet.about.delegate.f0;
import com.vk.music.ui.bottomsheet.BottomNavigationGradientComposeView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stickers.keyboard.StickersView;
import com.vk.typography.FontFamily;
import java.util.List;
import xsna.aft;
import xsna.asv0;
import xsna.b1r;
import xsna.b4;
import xsna.bwt0;
import xsna.c530;
import xsna.dhr0;
import xsna.dj1;
import xsna.drm0;
import xsna.e530;
import xsna.e5p0;
import xsna.eaa;
import xsna.eto0;
import xsna.fgb0;
import xsna.fj1;
import xsna.fwl;
import xsna.go20;
import xsna.h0;
import xsna.h5h;
import xsna.h5x;
import xsna.iah0;
import xsna.izs;
import xsna.jai;
import xsna.jne;
import xsna.kne;
import xsna.kwl;
import xsna.lg90;
import xsna.lxs;
import xsna.m8v0;
import xsna.maz;
import xsna.ne7;
import xsna.p5z;
import xsna.pzu0;
import xsna.q1l0;
import xsna.q530;
import xsna.qpv0;
import xsna.rm6;
import xsna.rrv0;
import xsna.rz00;
import xsna.s0e;
import xsna.s1l0;
import xsna.s3q0;
import xsna.sq60;
import xsna.stk0;
import xsna.t8k0;
import xsna.w6e;
import xsna.wzs;
import xsna.y8c0;
import xsna.y9l0;
import xsna.ylu0;
import xsna.zak0;
import xsna.zwt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Bitmap bitmap;
        final Integer num;
        View findViewByPosition;
        int i = this.b;
        int i2 = 9;
        Integer num2 = null;
        int i3 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                ((Long) obj2).longValue();
                if (defaultSeekBarView.l) {
                    defaultSeekBarView.m();
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView = ((rm6) obj3).K;
                if (imageView != null) {
                    imageView.setActivated(booleanValue);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i4 = BottomNavigationGradientComposeView.m;
                ((BottomNavigationGradientComposeView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                maz.c(((b1r) ((w6e) obj3).c).a.e(), (Context) obj, (String) obj2, LaunchContext.A, null, null, 24);
                break;
            case 4:
                e5p0 e5p0Var = (e5p0) obj;
                View view = (View) obj2;
                kne kneVar = ((s0e) obj3).g.n;
                String str = e5p0Var.a;
                jne jneVar = new jne(str, e5p0Var.b);
                Activity a = zwt0.a(view);
                if (a != null && a.isFinishing()) {
                    i3 = 1;
                }
                if (kneVar.a.a(HintId.CLIPS_ADD_TRENDING_MUSIC_TO_YOUR_CLIP.getId()) && i3 == 0 && bwt0.K(view)) {
                    int i5 = m8v0.M;
                    m8v0.a.a(view, str, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size72, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopRight, null, new dj1(14), new fj1(i2), null, null, null, new eaa(6, kneVar, jneVar), null, 0, false, null, null, false, null, false, 16751748);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((h5h) obj3).s6(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 6:
                DeliveryPoint deliveryPoint = (DeliveryPoint) obj3;
                DeliveryPoint.PlaceMark placeMark = (DeliveryPoint.PlaceMark) obj;
                float floatValue = ((Float) obj2).floatValue();
                Image image = placeMark.d;
                Bitmap b = image != null ? fwl.b(image, floatValue) : null;
                kwl kwlVar = kwl.a;
                int a2 = stk0.a(placeMark, deliveryPoint.e);
                String str2 = placeMark.b;
                kwlVar.getClass();
                Bitmap a3 = kwl.a(b, a2, floatValue, false);
                if (drm0.N(str2)) {
                    bitmap = null;
                } else {
                    Paint paint = kwl.g;
                    paint.setTextAlign(Paint.Align.LEFT);
                    dhr0.a.getClass();
                    com.vk.typography.b.j(paint, dhr0.E(), FontFamily.REGULAR, Float.valueOf(12.0f), 8);
                    bitmap = Bitmap.createBitmap((int) paint.measureText(str2), kwl.f, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawARGB(0, 0, 0, 0);
                    float textSize = ((paint.getTextSize() / 2.0f) + (canvas.getHeight() / 2.0f)) - iah0.a(1.5f);
                    paint.setColor(kwl.d);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(iah0.b(0.5f));
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    paint.setShadowLayer(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, kwl.e);
                    canvas.drawText(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textSize, paint);
                    paint.setColor(a2);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawText(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textSize, paint);
                }
                int width = bitmap != null ? bitmap.getWidth() : 0;
                int width2 = a3.getWidth();
                if (width < width2) {
                    width = width2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, iah0.a(1) + a3.getHeight() + (bitmap != null ? bitmap.getHeight() : 0), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawARGB(0, 0, 0, 0);
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, (width / 2.0f) - (bitmap.getWidth() / 2), r4 - bitmap.getHeight(), (Paint) null);
                }
                canvas2.drawBitmap(a3, (width / 2.0f) - (a3.getWidth() / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                a3.recycle();
                if (bitmap != null) {
                    bitmap.recycle();
                    break;
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                aft.d((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((h5x) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 9:
                ((p5z) obj3).a.i0.f1((StoryViewAction) obj, (izs) obj2);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((go20) obj3).e(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((fgb0) obj3).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                final y8c0 y8c0Var = (y8c0) obj3;
                final sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = y8c0Var.A;
                if (recyclerView != null) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (sq60Var.e) {
                        num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                            i3 = findViewByPosition.getTop();
                        }
                        num2 = Integer.valueOf(i3);
                    }
                    final Integer num3 = num2;
                    final LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    y8c0Var.a().c().H0(recyclerView, new h0(3, y8c0Var, sq60Var), new Runnable() { // from class: xsna.v8c0
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Integer num4;
                            LinearLayoutManager linearLayoutManager3;
                            Integer num5 = num;
                            if (num5 != null && (num4 = num3) != null && (linearLayoutManager3 = linearLayoutManager2) != null) {
                                linearLayoutManager3.K(num5.intValue(), num4.intValue());
                            }
                            sq60 sq60Var2 = sq60Var;
                            boolean z = sq60Var2.d;
                            y8c0 y8c0Var2 = y8c0Var;
                            if (z) {
                                RecyclerView recyclerView2 = y8c0Var2.A;
                                RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                                LinearLayoutManager linearLayoutManager4 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                                if (linearLayoutManager4 != null) {
                                    linearLayoutManager4.K(0, 0);
                                }
                            }
                            ((o170) y8c0Var2.a().s.getValue()).b(y8c0Var2.A);
                            ehv ehvVar = (ehv) y8c0Var2.a().g.b;
                            if (ehvVar != null) {
                                ehvVar.r();
                            }
                            RecyclerView recyclerView3 = y8c0Var2.A;
                            if (recyclerView3 != null) {
                                List<ol60> list = sq60Var2.a;
                                l7v b2 = pla.e().b();
                                HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
                                if (b2.a(hintId.getId())) {
                                    recyclerView3.post(new w8c0(recyclerView3, list, y8c0Var2, hintId.getId(), 0));
                                }
                            }
                        }
                    }, sq60Var.a, sq60Var.c);
                    break;
                } else {
                    break;
                }
            case 13:
                ((lxs) obj3).invoke((Throwable) obj, (izs) obj2);
                break;
            case 14:
                ((Integer) obj2).getClass();
                t8k0.d(ne7.I(1), (androidx.compose.runtime.a) obj, (jai) obj3);
                break;
            case 15:
                StickersView stickersView = (StickersView) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                int i6 = stickerStockItem.b;
                if (stickerStockItem.m || stickerStockItem.n.Db() != 0) {
                    y9l0.a(new s1l0(i6));
                } else {
                    y9l0.a(new q1l0(i6));
                }
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = StickersView.O;
                stickersView.m(false);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Cell.Middle.Text.Title.a.C0751a) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 17:
                f0 f0Var = (f0) obj3;
                Good good = (Good) obj2;
                c530 b2 = e530.b(good, null);
                q530 q530Var = f0Var.b;
                ModerationRestriction a4 = q530Var.a(b2);
                if (((ProductVideoAttach) obj).b != ProductVideoAttach.StatusType.Adult || !q530Var.b(b2, a4)) {
                    f0Var.a.d(new b4.f.a(new rz00(good, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532)));
                }
                break;
            case 18:
                qpv0 qpv0Var = (qpv0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(815404928, intValue, -1, "com.vk.core.compose.component.tabs.VkTabsFixedIcon.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkTabsFixedIcon.kt:60)");
                    }
                    lg90 lg90Var = (lg90) ((zak0) qpv0Var.a).getValue();
                    aVar.K(1920094091);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().j;
                    aVar.j();
                    pzu0.b(lg90Var, null, null, j, aVar, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                asv0.b((eto0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ v(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ v(fwl fwlVar, DeliveryPoint deliveryPoint) {
        this.b = 6;
        this.c = deliveryPoint;
    }
}
