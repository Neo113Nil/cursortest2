package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsHandler;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerAdsRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.sofascore.results.R;
import defpackage.c1m;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class urm extends g5m {
    public final url e;
    public final BlazeStoryPlayerStyle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urm(@NotNull url urlVar, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull ku3 ku3Var) {
        super(zom.a, ku3Var);
        urlVar.getClass();
        ku3Var.getClass();
        this.e = urlVar;
        this.f = blazeStoryPlayerStyle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, sq3 sq3Var) {
        dcm dcmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof dcm) {
            dcmVar = (dcm) sq3Var;
            int i3 = dcmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dcmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = dcmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = dcmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    dcmVar.r = this;
                    dcmVar.s = i;
                    dcmVar.v = 1;
                    obj = q(i, dcmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = dcmVar.s;
                    this = dcmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    efmVar.s();
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(26));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(27));
                }
                return Unit.a;
            }
        }
        dcmVar = new dcm(this, sq3Var);
        Object obj2 = dcmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = dcmVar.v;
        if (i2 != 0) {
        }
        efmVar = (efm) obj2;
        if (efmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i, boolean z, sq3 sq3Var) {
        iom iomVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof iom) {
            iomVar = (iom) sq3Var;
            int i3 = iomVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iomVar.u = i3 - Integer.MIN_VALUE;
                Object obj = iomVar.s;
                Object obj2 = lu3.a;
                i2 = iomVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    iomVar.r = z;
                    iomVar.u = 1;
                    obj = q(i, iomVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = iomVar.r;
                    y6a.M(obj);
                }
                boolean z2 = z;
                efmVar = (efm) obj;
                if (efmVar != null) {
                    vsm vsmVar = efmVar.b;
                    n4m n4mVar = efmVar.f;
                    if (n4mVar != null) {
                        i iVar = n4mVar.i;
                        boolean s = iVar != null ? nq8.s(iVar) : false;
                        boolean z3 = (Intrinsics.c(n4mVar.u, Boolean.FALSE) || vsmVar.b.getChildCount() <= 0 || n4mVar.b.a()) ? false : true;
                        long j = z2 ? 200L : 400L;
                        ConstraintLayout constraintLayout = vsmVar.t;
                        constraintLayout.getClass();
                        evl.fadeInOrOut$default(constraintLayout, z2, j, null, null, 12, null);
                        if (s && efm.u(n4mVar)) {
                            ImageView imageView = vsmVar.s;
                            imageView.getClass();
                            evl.fadeInOrOut$default(imageView, z2, j, null, null, 12, null);
                        }
                        if (s) {
                            BlazeTextWithIconButton blazeTextWithIconButton = vsmVar.r;
                            blazeTextWithIconButton.getClass();
                            evl.fadeInOrOut$default(blazeTextWithIconButton, z2, j, null, null, 12, null);
                        }
                        if (z3) {
                            FrameLayout frameLayout = vsmVar.b;
                            frameLayout.getClass();
                            evl.fadeInOrOut$default(frameLayout, z2, j, null, null, 12, null);
                        }
                        View view = vsmVar.y;
                        view.getClass();
                        if (z2) {
                            view.setVisibility(0);
                        } else {
                            view.setVisibility(8);
                        }
                    }
                }
                return Unit.a;
            }
        }
        iomVar = new iom(this, sq3Var);
        Object obj3 = iomVar.s;
        Object obj22 = lu3.a;
        i2 = iomVar.u;
        if (i2 != 0) {
        }
        boolean z22 = z;
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(2:13|(1:15))|17|18))|28|6|7|(0)(0)|11|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0024, B:11:0x003c, B:13:0x0040, B:15:0x004d, B:23:0x0033), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(int i, sq3 sq3Var) {
        ofm ofmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof ofm) {
            ofmVar = (ofm) sq3Var;
            int i3 = ofmVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ofmVar.t = i3 - Integer.MIN_VALUE;
                Object obj = ofmVar.r;
                Object obj2 = lu3.a;
                i2 = ofmVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ofmVar.t = 1;
                    obj = q(i, ofmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    m0m m0mVar = efmVar.h;
                    m0mVar.clearAnimation();
                    m0mVar.setVisibility(4);
                    xyl xylVar = efmVar.i;
                    if (xylVar != null) {
                        xylVar.a();
                    }
                }
                return Unit.a;
            }
        }
        ofmVar = new ofm(this, sq3Var);
        Object obj3 = ofmVar.r;
        Object obj22 = lu3.a;
        i2 = ofmVar.t;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0059, B:19:0x0064, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(int i, sq3 sq3Var) {
        jjm jjmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof jjm) {
            jjmVar = (jjm) sq3Var;
            int i3 = jjmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jjmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = jjmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = jjmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    jjmVar.r = this;
                    jjmVar.s = i;
                    jjmVar.v = 1;
                    obj = q(i, jjmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = jjmVar.s;
                    this = jjmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    efmVar.t();
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(22));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(23));
                }
                return Unit.a;
            }
        }
        jjmVar = new jjm(this, sq3Var);
        Object obj2 = jjmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = jjmVar.v;
        if (i2 != 0) {
        }
        efmVar = (efm) obj2;
        if (efmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        Map map;
        Map map2;
        BlazeGAMBannerAdsRequestData asRequestData;
        View view;
        efm efmVar = (efm) uVar;
        efmVar.getClass();
        if (i > 0) {
            Object o = o(i - 1);
            o.getClass();
            map = jca.y((xlm) o);
        } else {
            map = null;
        }
        xlm xlmVar = (xlm) o(i);
        if (i < this.a.f.size() - 1) {
            Object o2 = o(i + 1);
            o2.getClass();
            map2 = jca.y((xlm) o2);
        } else {
            map2 = null;
        }
        BlazeContentExtraInfo blazeContentExtraInfo = new BlazeContentExtraInfo(map, xlmVar != null ? jca.y(xlmVar) : null, map2, null, null, 24, null);
        xlmVar.getClass();
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.f;
        vsm vsmVar = efmVar.b;
        try {
            efmVar.d = xlmVar;
            efmVar.e = blazeStoryPlayerStyle;
            n4m n4mVar = xlmVar.c;
            if (n4mVar == null) {
                n4mVar = (n4m) CollectionsKt.Y(xlmVar.b);
            }
            if (blazeStoryPlayerStyle != null) {
                efmVar.n(vsmVar, blazeStoryPlayerStyle);
            }
            BlazeBannerAdInfo blazeBannerAdInfo = xlmVar.g;
            vsmVar.b.removeAllViews();
            if (blazeBannerAdInfo != null && (asRequestData = blazeBannerAdInfo.asRequestData(blazeContentExtraInfo)) != null) {
                BlazeGAMBannerAdsHandler googleBannerAdHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleBannerAdHandler$blazesdk_release();
                if (googleBannerAdHandler$blazesdk_release != null) {
                    Context context = vsmVar.a.getContext();
                    context.getClass();
                    view = googleBannerAdHandler$blazesdk_release.createAndLoadAdBannerView(context, asRequestData, new lqj(efmVar, 28));
                } else {
                    view = null;
                }
                if (view != null) {
                    vsmVar.b.addView(view);
                }
            }
            if (fgm.f(n4mVar) != null && z7m.b(BlazePlayerType.STORIES)) {
                vsmVar.z.setOnClickListener(new zem(efmVar, 0));
            }
            efmVar.k(n4mVar, true);
            efmVar.q();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        vsm a = vsm.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_stories_player_view_holder, viewGroup, false));
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.f;
        if (blazeStoryPlayerStyle != null && blazeStoryPlayerStyle.getHeaderGradient().getIsVisible()) {
            View view = a.u;
            view.getClass();
            evl.applyGradient$default(view, b.j(Integer.valueOf(blazeStoryPlayerStyle.getHeaderGradient().getStartColor()), Integer.valueOf(blazeStoryPlayerStyle.getHeaderGradient().getStartColor()), Integer.valueOf(blazeStoryPlayerStyle.getHeaderGradient().getEndColor())), null, null, 6, null);
        }
        return new efm(a, this.e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x0055, B:17:0x0061, B:19:0x006c, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x0055, B:17:0x0061, B:19:0x006c, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x0055, B:17:0x0061, B:19:0x006c, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, long j, long j2, sq3 sq3Var) {
        uqm uqmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof uqm) {
            uqmVar = (uqm) sq3Var;
            int i3 = uqmVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uqmVar.x = i3 - Integer.MIN_VALUE;
                Object obj = uqmVar.v;
                lu3 lu3Var = lu3.a;
                i2 = uqmVar.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    uqmVar.r = this;
                    uqmVar.s = i;
                    uqmVar.t = j;
                    uqmVar.u = j2;
                    uqmVar.x = 1;
                    obj = q(i, uqmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = uqmVar.u;
                    j = uqmVar.t;
                    i = uqmVar.s;
                    this = uqmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    efmVar.a(j, j2);
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(24));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(25));
                }
                return Unit.a;
            }
        }
        uqmVar = new uqm(this, sq3Var);
        Object obj2 = uqmVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = uqmVar.x;
        if (i2 != 0) {
        }
        efmVar = (efm) obj2;
        if (efmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(2:14|(1:16)(1:17))|18|19))|29|6|7|(0)(0)|12|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:16:0x005c, B:17:0x0061, B:24:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, c1m.a aVar, sq3 sq3Var) {
        o9m o9mVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof o9m) {
            o9mVar = (o9m) sq3Var;
            int i3 = o9mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o9mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = o9mVar.s;
                Object obj2 = lu3.a;
                i2 = o9mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    o9mVar.r = aVar;
                    o9mVar.u = 1;
                    obj = q(i, o9mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = o9mVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    vsm vsmVar = efmVar.b;
                    aVar.getClass();
                    FrameLayout frameLayout = vsmVar.m;
                    frameLayout.getClass();
                    lz.y(frameLayout, aVar.a);
                    ImageView imageView = vsmVar.n;
                    imageView.getClass();
                    if (aVar.b) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(4);
                    }
                }
                return Unit.a;
            }
        }
        o9mVar = new o9m(this, sq3Var);
        Object obj3 = o9mVar.s;
        Object obj22 = lu3.a;
        i2 = o9mVar.u;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(1:36))|12|(4:14|(1:16)(1:27)|17|(3:19|(1:24)|25))|28|29))|39|6|7|(0)(0)|12|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:16:0x004b, B:17:0x004f, B:19:0x0057, B:21:0x005b, B:25:0x0067, B:34:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, n4m n4mVar, sq3 sq3Var) {
        vmm vmmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof vmm) {
            vmmVar = (vmm) sq3Var;
            int i3 = vmmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vmmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = vmmVar.s;
                Object obj2 = lu3.a;
                i2 = vmmVar.u;
                boolean z = true;
                if (i2 != 0) {
                    y6a.M(obj);
                    vmmVar.r = n4mVar;
                    vmmVar.u = 1;
                    obj = q(i, vmmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4mVar = vmmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    n4mVar.getClass();
                    n4m n4mVar2 = efmVar.f;
                    if (!Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a)) {
                        n4m n4mVar3 = efmVar.f;
                        if (n4mVar3 != null && efmVar.p(n4mVar) == efmVar.p(n4mVar3)) {
                            z = false;
                        }
                        efmVar.k(n4mVar, z);
                    }
                }
                return Unit.a;
            }
        }
        vmmVar = new vmm(this, sq3Var);
        Object obj3 = vmmVar.s;
        Object obj22 = lu3.a;
        i2 = vmmVar.u;
        boolean z2 = true;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|(3:14|(1:16)(1:19)|17)|20|21))|31|6|7|(0)(0)|12|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:17:0x0051, B:26:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, boolean z, sq3 sq3Var) {
        u6m u6mVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof u6m) {
            u6mVar = (u6m) sq3Var;
            int i3 = u6mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u6mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = u6mVar.s;
                Object obj2 = lu3.a;
                i2 = u6mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    u6mVar.r = z;
                    u6mVar.u = 1;
                    obj = q(i, u6mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = u6mVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    ProgressBar progressBar = efmVar.b.o;
                    progressBar.getClass();
                    progressBar.setVisibility(z ? 0 : 8);
                }
                return Unit.a;
            }
        }
        u6mVar = new u6m(this, sq3Var);
        Object obj3 = u6mVar.s;
        Object obj22 = lu3.a;
        i2 = u6mVar.u;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:34|35))(3:36|37|(1:39))|12|(2:25|(1:30)(1:29))|31|32))|42|6|7|(0)(0)|12|(7:14|17|20|22|25|(1:27)|30)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(long j, int i, sq3 sq3Var) {
        hlm hlmVar;
        int i2;
        efm efmVar;
        xyl xylVar;
        n4m n4mVar;
        eqm d;
        if (sq3Var instanceof hlm) {
            hlmVar = (hlm) sq3Var;
            int i3 = hlmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hlmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = hlmVar.s;
                Object obj2 = lu3.a;
                i2 = hlmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    hlmVar.r = j;
                    hlmVar.u = 1;
                    obj = q(i, hlmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = hlmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null && j != 0 && (xylVar = efmVar.i) != null && (n4mVar = efmVar.f) != null && (d = fgm.d(n4mVar)) != null) {
                    if (xylVar.c || !d.a()) {
                        xylVar.a();
                    } else {
                        xylVar.d();
                        xylVar.b(j / 1000.0d);
                    }
                }
                return Unit.a;
            }
        }
        hlmVar = new hlm(this, sq3Var);
        Object obj3 = hlmVar.s;
        Object obj22 = lu3.a;
        i2 = hlmVar.u;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
            if (xylVar.c) {
            }
            xylVar.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(w0m w0mVar, int i, sq3 sq3Var) {
        p3m p3mVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof p3m) {
            p3mVar = (p3m) sq3Var;
            int i3 = p3mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p3mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = p3mVar.s;
                Object obj2 = lu3.a;
                i2 = p3mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    p3mVar.r = w0mVar;
                    p3mVar.u = 1;
                    obj = q(i, p3mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w0mVar = p3mVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    efmVar.d(w0mVar);
                }
                return Unit.a;
            }
        }
        p3mVar = new p3m(this, sq3Var);
        Object obj3 = p3mVar.s;
        Object obj22 = lu3.a;
        i2 = p3mVar.u;
        if (i2 != 0) {
        }
        efmVar = (efm) obj3;
        if (efmVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0051, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0051, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0051, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(boolean z, int i, sq3 sq3Var) {
        phm phmVar;
        int i2;
        efm efmVar;
        if (sq3Var instanceof phm) {
            phmVar = (phm) sq3Var;
            int i3 = phmVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                phmVar.w = i3 - Integer.MIN_VALUE;
                Object obj = phmVar.u;
                lu3 lu3Var = lu3.a;
                i2 = phmVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    phmVar.r = this;
                    phmVar.s = z;
                    phmVar.t = i;
                    phmVar.w = 1;
                    obj = q(i, phmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = phmVar.t;
                    z = phmVar.s;
                    this = phmVar.r;
                    y6a.M(obj);
                }
                efmVar = (efm) obj;
                if (efmVar != null) {
                    efmVar.o(z);
                }
                if (i > 0) {
                    this.r(i - 1, new c31(z, 15));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new c31(z, 16));
                }
                return Unit.a;
            }
        }
        phmVar = new phm(this, sq3Var);
        Object obj2 = phmVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = phmVar.w;
        if (i2 != 0) {
        }
        efmVar = (efm) obj2;
        if (efmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }
}
