package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.c1m;
import defpackage.n4m;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mpm extends g5m {
    public final grl e;
    public final BlazeMomentsPlayerStyle f;
    public final hrl g;
    public final u6b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpm(@NotNull grl grlVar, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @Nullable hrl hrlVar, @NotNull ku3 ku3Var, @NotNull u6b u6bVar) {
        super(knm.a, ku3Var);
        grlVar.getClass();
        ku3Var.getClass();
        u6bVar.getClass();
        this.e = grlVar;
        this.f = blazeMomentsPlayerStyle;
        this.g = hrlVar;
        this.h = u6bVar;
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
    public final Object A(int i, sq3 sq3Var) {
        ajm ajmVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof ajm) {
            ajmVar = (ajm) sq3Var;
            int i3 = ajmVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ajmVar.t = i3 - Integer.MIN_VALUE;
                Object obj = ajmVar.r;
                Object obj2 = lu3.a;
                i2 = ajmVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ajmVar.t = 1;
                    obj = q(i, ajmVar);
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
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    m0m m0mVar = dlmVar.m;
                    m0mVar.clearAnimation();
                    m0mVar.setVisibility(4);
                    xyl xylVar = dlmVar.n;
                    if (xylVar != null) {
                        xylVar.a();
                    }
                }
                return Unit.a;
            }
        }
        ajmVar = new ajm(this, sq3Var);
        Object obj3 = ajmVar.r;
        Object obj22 = lu3.a;
        i2 = ajmVar.t;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj3;
        if (dlmVar != null) {
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
    public final Object B(int i, sq3 sq3Var) {
        okm okmVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof okm) {
            okmVar = (okm) sq3Var;
            int i3 = okmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                okmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = okmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = okmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    okmVar.r = this;
                    okmVar.s = i;
                    okmVar.v = 1;
                    obj = q(i, okmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = okmVar.s;
                    this = okmVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    dlmVar.v();
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(11));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(13));
                }
                return Unit.a;
            }
        }
        okmVar = new okm(this, sq3Var);
        Object obj2 = okmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = okmVar.v;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj2;
        if (dlmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        BlazeMomentsPlayerButtonsStyle buttons;
        dlm dlmVar = (dlm) uVar;
        dlmVar.getClass();
        Object o = o(i);
        o.getClass();
        n4m n4mVar = (n4m) o;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.f;
        wgm wgmVar = dlmVar.b;
        try {
            dlmVar.g = n4mVar;
            dlmVar.f = blazeMomentsPlayerStyle;
            dlmVar.k(wgmVar, blazeMomentsPlayerStyle, n4mVar);
            dlmVar.i(blazeMomentsPlayerStyle);
            dlmVar.p(blazeMomentsPlayerStyle, n4mVar);
            ImageView imageView = wgmVar.z;
            FrameLayout frameLayout = wgmVar.F;
            ConstraintLayout constraintLayout = wgmVar.a;
            imageView.getClass();
            imageView.setVisibility(8);
            ImageView imageView2 = wgmVar.D;
            imageView2.getClass();
            imageView2.setVisibility(8);
            ImageView imageView3 = wgmVar.B;
            imageView3.getClass();
            imageView3.setVisibility(8);
            int i2 = 0;
            dlmVar.h = false;
            dlmVar.h(blazeMomentsPlayerStyle != null ? blazeMomentsPlayerStyle.getSeekBar() : null);
            dlmVar.r(n4mVar, blazeMomentsPlayerStyle);
            dlmVar.o(n4mVar.a());
            dlmVar.q(n4mVar, (blazeMomentsPlayerStyle == null || (buttons = blazeMomentsPlayerStyle.getButtons()) == null) ? null : buttons.getLike());
            dlmVar.j(n4mVar, blazeMomentsPlayerStyle != null ? blazeMomentsPlayerStyle.getFollowEntity() : null);
            ImageView imageView4 = wgmVar.E;
            int i3 = 2;
            if (fgm.f(n4mVar) != null && z7m.b(BlazePlayerType.MOMENTS)) {
                imageView4.setOnClickListener(new xkm(dlmVar, i3));
            }
            dlmVar.s();
            n4m n4mVar2 = dlmVar.g;
            constraintLayout.setContentDescription((n4mVar2 != null ? n4mVar2.c : null) instanceof n4m.a.b ? constraintLayout.getContext().getString(R.string.blaze_accessibility_video_player_double_tap) : null);
            constraintLayout.setImportantForAccessibility(1);
            frameLayout.getClass();
            lz.w(frameLayout, (r30 & 1) != 0 ? 0 : 0, (r30 & 2) == 0 ? 0 : 0, (r30 & 4) != 0 ? 1000 : 0, (r30 & 8) != 0 ? new ol8(10) : new zkm(dlmVar, 1), (r30 & 16) != 0 ? new zl8(26) : new wkm(dlmVar, i3), (r30 & 32) != 0 ? new zl8(27) : new wkm(dlmVar, 3), (r30 & 64) != 0 ? new zl8(28) : null, (r30 & 128) != 0 ? new zl8(29) : null, (r30 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new nl8(24) : null, (r30 & 512) != 0 ? new xt8(0) : null, (r30 & 1024) != 0 ? new xt8(1) : null, (r30 & a.o) != 0 ? new xt8(2) : null, (r30 & 4096) != 0 ? new xt8(3) : null, (r30 & 8192) != 0 ? new zl8(25) : null);
            ImageView imageView5 = wgmVar.G;
            frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView5.getClass();
            imageView5.setVisibility(0);
            evl.loadAndCacheImage$default(imageView5, fgm.i(n4mVar), null, null, null, false, null, null, new ukm(n4mVar, i2), null, null, null, 1918, null);
            BlazeDefaultTimeBar blazeDefaultTimeBar = wgmVar.C;
            blazeDefaultTimeBar.getClass();
            blazeDefaultTimeBar.setVisibility(dlm.u(blazeMomentsPlayerStyle, n4mVar) ? 0 : 8);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new dlm(wgm.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_moments_player_view_holder, viewGroup, false)), this.e, this.g, this.h);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewAttachedToWindow(u uVar) {
        dlm dlmVar = (dlm) uVar;
        dlmVar.getClass();
        super.onViewAttachedToWindow(dlmVar);
        if (dlmVar.g == null || dlmVar.f == null) {
            return;
        }
        dlmVar.s();
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        dlm dlmVar = (dlm) uVar;
        dlmVar.getClass();
        d5m d5mVar = dlmVar.i;
        if (d5mVar != null) {
            d5mVar.a();
        }
        dlmVar.i = null;
        super.onViewDetachedFromWindow(dlmVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        dlm dlmVar = (dlm) uVar;
        dlmVar.getClass();
        super.onViewRecycled(dlmVar);
        d5m d5mVar = dlmVar.i;
        if (d5mVar != null) {
            d5mVar.a();
        }
        dlmVar.i = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x005e, B:17:0x006a, B:19:0x0075, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x005e, B:17:0x006a, B:19:0x0075, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x004c, B:14:0x0050, B:16:0x005e, B:17:0x006a, B:19:0x0075, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, long j, long j2, sq3 sq3Var) {
        xnm xnmVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof xnm) {
            xnmVar = (xnm) sq3Var;
            int i3 = xnmVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xnmVar.x = i3 - Integer.MIN_VALUE;
                Object obj = xnmVar.v;
                lu3 lu3Var = lu3.a;
                i2 = xnmVar.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    xnmVar.r = this;
                    xnmVar.s = i;
                    xnmVar.t = j;
                    xnmVar.u = j2;
                    xnmVar.x = 1;
                    obj = q(i, xnmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = xnmVar.u;
                    j = xnmVar.t;
                    i = xnmVar.s;
                    this = xnmVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    wgm wgmVar = dlmVar.b;
                    wgmVar.C.setDuration(j2);
                    wgmVar.C.setPosition(j);
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(14));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(15));
                }
                return Unit.a;
            }
        }
        xnmVar = new xnm(this, sq3Var);
        Object obj2 = xnmVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = xnmVar.x;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj2;
        if (dlmVar != null) {
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
        j9m j9mVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof j9m) {
            j9mVar = (j9m) sq3Var;
            int i3 = j9mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = j9mVar.s;
                Object obj2 = lu3.a;
                i2 = j9mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    j9mVar.r = aVar;
                    j9mVar.u = 1;
                    obj = q(i, j9mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = j9mVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    wgm wgmVar = dlmVar.b;
                    aVar.getClass();
                    FrameLayout frameLayout = wgmVar.F;
                    frameLayout.getClass();
                    lz.y(frameLayout, aVar.a);
                    ImageView imageView = wgmVar.G;
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
        j9mVar = new j9m(this, sq3Var);
        Object obj3 = j9mVar.s;
        Object obj22 = lu3.a;
        i2 = j9mVar.u;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj3;
        if (dlmVar != null) {
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
    public final Object v(int i, boolean z, sq3 sq3Var) {
        k6m k6mVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof k6m) {
            k6mVar = (k6m) sq3Var;
            int i3 = k6mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k6mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = k6mVar.s;
                Object obj2 = lu3.a;
                i2 = k6mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    k6mVar.r = z;
                    k6mVar.u = 1;
                    obj = q(i, k6mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = k6mVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    ProgressBar progressBar = dlmVar.b.A;
                    progressBar.getClass();
                    progressBar.setVisibility(z ? 0 : 8);
                }
                return Unit.a;
            }
        }
        k6mVar = new k6m(this, sq3Var);
        Object obj3 = k6mVar.s;
        Object obj22 = lu3.a;
        i2 = k6mVar.u;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj3;
        if (dlmVar != null) {
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
    public final Object w(long j, int i, sq3 sq3Var) {
        lmm lmmVar;
        int i2;
        dlm dlmVar;
        xyl xylVar;
        n4m n4mVar;
        eqm d;
        if (sq3Var instanceof lmm) {
            lmmVar = (lmm) sq3Var;
            int i3 = lmmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lmmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = lmmVar.s;
                Object obj2 = lu3.a;
                i2 = lmmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    lmmVar.r = j;
                    lmmVar.u = 1;
                    obj = q(i, lmmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = lmmVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null && j != 0 && (xylVar = dlmVar.n) != null && (n4mVar = dlmVar.g) != null && (d = fgm.d(n4mVar)) != null) {
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
        lmmVar = new lmm(this, sq3Var);
        Object obj3 = lmmVar.s;
        Object obj22 = lu3.a;
        i2 = lmmVar.u;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj3;
        if (dlmVar != null) {
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
    public final Object x(w0m w0mVar, int i, sq3 sq3Var) {
        g3m g3mVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof g3m) {
            g3mVar = (g3m) sq3Var;
            int i3 = g3mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g3mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = g3mVar.s;
                Object obj2 = lu3.a;
                i2 = g3mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    g3mVar.r = w0mVar;
                    g3mVar.u = 1;
                    obj = q(i, g3mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w0mVar = g3mVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    dlmVar.f(w0mVar);
                }
                return Unit.a;
            }
        }
        g3mVar = new g3m(this, sq3Var);
        Object obj3 = g3mVar.s;
        Object obj22 = lu3.a;
        i2 = g3mVar.u;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj3;
        if (dlmVar != null) {
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
    public final Object y(fqm fqmVar, int i, sq3 sq3Var) {
        bhm bhmVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof bhm) {
            bhmVar = (bhm) sq3Var;
            int i3 = bhmVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bhmVar.w = i3 - Integer.MIN_VALUE;
                Object obj = bhmVar.u;
                lu3 lu3Var = lu3.a;
                i2 = bhmVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    bhmVar.r = this;
                    bhmVar.s = fqmVar;
                    bhmVar.t = i;
                    bhmVar.w = 1;
                    obj = q(i, bhmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = bhmVar.t;
                    fqmVar = bhmVar.s;
                    this = bhmVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    dlmVar.n(fqmVar);
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(18));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(19));
                }
                return Unit.a;
            }
        }
        bhmVar = new bhm(this, sq3Var);
        Object obj2 = bhmVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = bhmVar.w;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj2;
        if (dlmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
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
    public final Object z(int i, sq3 sq3Var) {
        vbm vbmVar;
        int i2;
        dlm dlmVar;
        if (sq3Var instanceof vbm) {
            vbmVar = (vbm) sq3Var;
            int i3 = vbmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vbmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = vbmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = vbmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    vbmVar.r = this;
                    vbmVar.s = i;
                    vbmVar.v = 1;
                    obj = q(i, vbmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = vbmVar.s;
                    this = vbmVar.r;
                    y6a.M(obj);
                }
                dlmVar = (dlm) obj;
                if (dlmVar != null) {
                    dlmVar.t();
                }
                if (i > 0) {
                    this.r(i - 1, new w5m(16));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new w5m(17));
                }
                return Unit.a;
            }
        }
        vbmVar = new vbm(this, sq3Var);
        Object obj2 = vbmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = vbmVar.v;
        if (i2 != 0) {
        }
        dlmVar = (dlm) obj2;
        if (dlmVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }
}
