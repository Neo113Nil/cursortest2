package com.vk.clips.sdk.shared.item.clips_grid_block.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.design.view.component.badge.a;
import com.vk.clips.design.view.component.badge.b;
import com.vk.clips.design.view.component.badge.c;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.movika.sdk.base.ui.f;
import com.vk.mvi.MviLazyViewContainer;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.abe;
import xsna.ao50;
import xsna.bbe;
import xsna.bce;
import xsna.cce;
import xsna.dbe;
import xsna.epx;
import xsna.f1;
import xsna.f4m;
import xsna.fbe;
import xsna.ffj0;
import xsna.fi5;
import xsna.gbe;
import xsna.gm50;
import xsna.gzs;
import xsna.j5g;
import xsna.jbe;
import xsna.k1;
import xsna.kaf;
import xsna.kbe;
import xsna.kih0;
import xsna.km50;
import xsna.l1;
import xsna.mk50;
import xsna.msy;
import xsna.n0;
import xsna.nkh0;
import xsna.p40;
import xsna.qae;
import xsna.r9;
import xsna.s3q0;
import xsna.s9;
import xsna.sae;
import xsna.sbe;
import xsna.tae;
import xsna.tc10;
import xsna.tlo0;
import xsna.uej0;
import xsna.vae;
import xsna.vbe;
import xsna.vk50;
import xsna.wae;
import xsna.wbe;
import xsna.x7g;
import xsna.xn50;
import xsna.ybe;
import xsna.yej0;
import xsna.zbe;
import xsna.zej0;

/* compiled from: ClipsGridBlockMviView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class b extends MviLazyViewContainer<a, cce, ClipsGridBlockAction> implements gbe {
    public final tc10 g;
    public final fbe h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public b(Context context, tc10 tc10Var, fbe fbeVar) {
        super(context);
        this.g = tc10Var;
        this.h = fbeVar;
        f1 f1Var = new f1(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, f1Var);
        this.j = msy.a(lazyThreadSafetyMode, new f(this, 21));
        this.k = msy.a(lazyThreadSafetyMode, new l1(this, 29));
        this.l = msy.a(lazyThreadSafetyMode, new kbe(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final sae getAnimationDelegate() {
        return (sae) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final dbe getClipItemsContainer() {
        return (dbe) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final sbe getOtherClipsButtonContainer() {
        return (sbe) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final bce getVideosContainer() {
        return (bce) this.j.getValue();
    }

    public static s3q0 k(b bVar, cce.f fVar) {
        VkButton vkButton = bVar.getOtherClipsButtonContainer().b;
        if (fVar instanceof cce.f.b) {
            vkButton.setVisibility(0);
            cce.f.b bVar2 = (cce.f.b) fVar;
            if (bVar2.b) {
                vkButton.setLoading(true);
                vkButton.a5(true, null);
                vkButton.setText((CharSequence) null);
            } else {
                vkButton.setLoading(false);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_refresh_outline_20));
                vkButton.setText(tlo0.b.a(bVar2.a, vkButton.getContext()));
            }
        } else {
            if (!(fVar instanceof cce.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            vkButton.setVisibility(8);
        }
        return s3q0.a;
    }

    public static s3q0 l(b bVar, cce.b bVar2) {
        kih0 kih0Var;
        kih0 kih0Var2;
        kih0 kih0Var3;
        kih0 kih0Var4;
        kih0 kih0Var5;
        VideoTextureViewAdapter videoTextureViewAdapter;
        bce videosContainer = bVar.getVideosContainer();
        tae taeVar = videosContainer.e;
        fi5 fi5Var = bVar2.b;
        fi5 fi5Var2 = bVar2.c;
        fi5 fi5Var3 = bVar2.a;
        if (bVar2.e) {
            if (!epx.f(fi5Var2, fi5Var3) && fi5Var3 != null && (kih0Var3 = fi5Var3.b) != null) {
                kih0Var3.pause();
            }
            if (fi5Var != null && (kih0Var2 = fi5Var.b) != null) {
                kih0Var2.o(taeVar);
            }
            if (fi5Var3 != null && (kih0Var = fi5Var3.b) != null) {
                kih0Var.o(taeVar);
            }
        } else if (bVar2.d) {
            if (fi5Var != null) {
                kih0 kih0Var6 = fi5Var.b;
                kih0Var6.pause();
                kih0Var6.y();
                kih0Var6.o(taeVar);
            }
            if (fi5Var3 != null) {
                kih0 kih0Var7 = fi5Var3.b;
                kih0Var7.play();
                kih0Var7.p(taeVar);
                zbe zbeVar = (zbe) j5g.b0(fi5Var3.a, videosContainer.d);
                if (zbeVar != null && (videoTextureViewAdapter = zbeVar.b) != null) {
                    VideoTextureViewAdapter.a.a(videoTextureViewAdapter, fi5Var3.b, "ClipsGridBlock", null, null, null, 28);
                }
            }
            if (!epx.f(fi5Var2 != null ? fi5Var2.b : null, fi5Var3 != null ? fi5Var3.b : null)) {
                if (fi5Var2 != null && (kih0Var5 = fi5Var2.b) != null) {
                    kih0Var5.pause();
                }
                if (fi5Var2 != null && (kih0Var4 = fi5Var2.b) != null) {
                    kih0Var4.y();
                }
            }
        } else {
            if (fi5Var != null) {
                kih0 kih0Var8 = fi5Var.b;
                kih0Var8.pause();
                kih0Var8.y();
                kih0Var8.o(taeVar);
            }
            if (fi5Var3 != null) {
                kih0 kih0Var9 = fi5Var3.b;
                kih0Var9.pause();
                kih0Var9.o(taeVar);
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r2 = r4.a(r3.getWidth());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 m(b bVar, cce.c cVar) {
        String str;
        tlo0 tlo0Var;
        dbe clipItemsContainer = bVar.getClipItemsContainer();
        clipItemsContainer.getClass();
        Iterator it = j5g.X0(cVar.a, clipItemsContainer.c).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            cce.c.a aVar = (cce.c.a) pair.d();
            abe abeVar = (abe) pair.g();
            abeVar.getClass();
            vae vaeVar = aVar.c;
            boolean z = aVar.b;
            abeVar.f.setVisibility(aVar.d ? 0 : 8);
            VkImage vkImage = abeVar.c;
            SdkImages sdkImages = aVar.a;
            vkImage.setAlpha(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            abeVar.b.setVisibility(z ? 0 : 8);
            CharSequence charSequence = null;
            if (vkImage.getHeight() == 0) {
                if (!vkImage.isLaidOut() || vkImage.isLayoutRequested()) {
                    vkImage.addOnLayoutChangeListener(new bbe(vkImage, aVar, abeVar));
                    abeVar.d.setVisibility(vaeVar != null ? 0 : 8);
                    if (vaeVar != null) {
                        ClipBadge clipBadge = abeVar.e.a;
                        clipBadge.setLeft(new a.C0568a(new Size(-2, -2), new wae.a(R.drawable.vk_icon_market_12)));
                        clipBadge.setMiddle(new b.a(vaeVar.a, new x7g(R.attr.vk_ui_text_contrast), Integer.MAX_VALUE, null));
                        tlo0 tlo0Var2 = vaeVar.b;
                        clipBadge.setRightMain(tlo0Var2 != null ? new c.b.a(new wae.b(tlo0Var2)) : null);
                    }
                    ViewGroup viewGroup = abeVar.a;
                    tlo0Var = aVar.e;
                    if (tlo0Var == null) {
                        charSequence = tlo0Var.a(viewGroup.getContext());
                    }
                    viewGroup.setContentDescription(charSequence);
                }
            }
            vkImage.o0(str, null);
            abeVar.d.setVisibility(vaeVar != null ? 0 : 8);
            if (vaeVar != null) {
            }
            ViewGroup viewGroup2 = abeVar.a;
            tlo0Var = aVar.e;
            if (tlo0Var == null) {
            }
            viewGroup2.setContentDescription(charSequence);
        }
        return s3q0.a;
    }

    public static s3q0 n(b bVar, cce.d dVar) {
        if (dVar.a) {
            sae animationDelegate = bVar.getAnimationDelegate();
            Iterator it = j5g.X0(animationDelegate.j, animationDelegate.b).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                long longValue = ((Number) pair.d()).longValue();
                View view = (View) pair.g();
                n0 n0Var = new n0(9, animationDelegate, view);
                ViewPropertyAnimator animate = view.animate();
                float f = animationDelegate.h;
                animate.scaleX(f).scaleY(f).setDuration(animationDelegate.d).setInterpolator(animationDelegate.f).setStartDelay(longValue).setListener(new qae(view, animationDelegate, n0Var)).start();
            }
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fullscreen_clips_grid_block);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        cce cceVar = (cce) ao50Var;
        f4m.m(1, this);
        setImportantForAccessibility(2);
        getContentView().setImportantForAccessibility(1);
        int paddingStart = getPaddingStart();
        gzs<Integer> c = this.h.c();
        setPaddingRelative(paddingStart, c != null ? c.invoke().intValue() : 0, getPaddingEnd(), getPaddingBottom());
        setOnClickListener(new k1(this, 7));
        gm50.a.b(this, cceVar.a, new s9(this, 24));
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        a aVar = (a) vk50Var;
        aVar.l.a(new p40(this, 29), getViewOwner());
        aVar.m.a(new r9(this, 22), getViewOwner());
    }

    @Override // xsna.gbe
    public final void d(int i, kih0 kih0Var) {
        xn50.a.c(this, new ClipsGridBlockAction.c.a(i, kih0Var));
    }

    @Override // xsna.gbe
    public final ViewGroup f(int i) {
        zbe zbeVar = (zbe) j5g.b0(i, getVideosContainer().d);
        if (zbeVar != null) {
            return zbeVar.a;
        }
        return null;
    }

    @Override // xsna.gbe
    public final Context g() {
        return getContentView().getContext();
    }

    @Override // xsna.gbe
    public final void i() {
        xn50.a.c(this, ClipsGridBlockAction.c.b.b);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size2 * 0.5625f;
        if (size2 > 0 && size > 0) {
            float f2 = size;
            if (f2 >= f) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(f2, f), 1073741824), i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        vbe vbeVar = new vbe(ybe.b.b);
        fbe fbeVar = this.h;
        nkh0 a = fbeVar.a();
        ffj0 d = fbeVar.d();
        tc10 tc10Var = this.g;
        return new a(vbeVar, new jbe(new wbe(a, d, (String) tc10Var.d, fbeVar.getDeviceInfo())), fbeVar.f(), (yej0) tc10Var.b.getValue(), (zej0) tc10Var.c.getValue(), (uej0) tc10Var.a.getValue(), kaf.a);
    }
}
