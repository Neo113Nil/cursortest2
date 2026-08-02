package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.c1m;
import defpackage.n4m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lzm extends g5m {
    public final csl e;
    public final a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzm(@NotNull csl cslVar, @Nullable dsl dslVar, @NotNull ku3 ku3Var, @NotNull a aVar) {
        super(knm.a, ku3Var);
        cslVar.getClass();
        ku3Var.getClass();
        aVar.getClass();
        this.e = cslVar;
        this.f = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:22:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, boolean z, boolean z2, sq3 sq3Var) {
        zxm zxmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof zxm) {
            zxmVar = (zxm) sq3Var;
            int i3 = zxmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zxmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = zxmVar.t;
                Object obj2 = lu3.a;
                i2 = zxmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    zxmVar.r = z;
                    zxmVar.s = z2;
                    zxmVar.v = 1;
                    obj = q(i, zxmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = zxmVar.s;
                    z = zxmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.g(new d30(z, e0nVar, z2), new a0n(4));
                }
                return Unit.a;
            }
        }
        zxmVar = new zxm(this, sq3Var);
        Object obj3 = zxmVar.t;
        Object obj22 = lu3.a;
        i2 = zxmVar.v;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(long j, int i, sq3 sq3Var) {
        oom oomVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof oom) {
            oomVar = (oom) sq3Var;
            int i3 = oomVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oomVar.u = i3 - Integer.MIN_VALUE;
                Object obj = oomVar.s;
                Object obj2 = lu3.a;
                i2 = oomVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    oomVar.r = j;
                    oomVar.u = 1;
                    obj = q(i, oomVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = oomVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    String str = "-" + (j / 1000);
                    BlazeTextView blazeTextView = e0nVar.b.y;
                    blazeTextView.getClass();
                    e0n.b(blazeTextView, str);
                }
                return Unit.a;
            }
        }
        oomVar = new oom(this, sq3Var);
        Object obj3 = oomVar.s;
        Object obj22 = lu3.a;
        i2 = oomVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
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
    public final Object C(w0m w0mVar, int i, sq3 sq3Var) {
        a7m a7mVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof a7m) {
            a7mVar = (a7m) sq3Var;
            int i3 = a7mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a7mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = a7mVar.s;
                Object obj2 = lu3.a;
                i2 = a7mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    a7mVar.r = w0mVar;
                    a7mVar.u = 1;
                    obj = q(i, a7mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w0mVar = a7mVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.c(w0mVar);
                }
                return Unit.a;
            }
        }
        a7mVar = new a7m(this, sq3Var);
        Object obj3 = a7mVar.s;
        Object obj22 = lu3.a;
        i2 = a7mVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0054, B:17:0x0060, B:19:0x006b, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0054, B:17:0x0060, B:19:0x006b, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004c, B:16:0x0054, B:17:0x0060, B:19:0x006b, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(fqm fqmVar, int i, sq3 sq3Var) {
        ojm ojmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof ojm) {
            ojmVar = (ojm) sq3Var;
            int i3 = ojmVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ojmVar.w = i3 - Integer.MIN_VALUE;
                Object obj = ojmVar.u;
                lu3 lu3Var = lu3.a;
                i2 = ojmVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    ojmVar.r = this;
                    ojmVar.s = fqmVar;
                    ojmVar.t = i;
                    ojmVar.w = 1;
                    obj = q(i, ojmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = ojmVar.t;
                    fqmVar = ojmVar.s;
                    this = ojmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    fqmVar.getClass();
                    e0nVar.i(fqmVar);
                }
                if (i > 0) {
                    this.r(i - 1, new fsm(13));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new fsm(14));
                }
                return Unit.a;
            }
        }
        ojmVar = new ojm(this, sq3Var);
        Object obj2 = ojmVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = ojmVar.w;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        if (e0nVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
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
    public final Object E(boolean z, int i, sq3 sq3Var) {
        bnm bnmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof bnm) {
            bnmVar = (bnm) sq3Var;
            int i3 = bnmVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bnmVar.w = i3 - Integer.MIN_VALUE;
                Object obj = bnmVar.u;
                lu3 lu3Var = lu3.a;
                i2 = bnmVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    bnmVar.r = this;
                    bnmVar.s = z;
                    bnmVar.t = i;
                    bnmVar.w = 1;
                    obj = q(i, bnmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = bnmVar.t;
                    z = bnmVar.s;
                    this = bnmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.k(z);
                }
                if (i > 0) {
                    this.r(i - 1, new c31(z, 17));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new c31(z, 18));
                }
                return Unit.a;
            }
        }
        bnmVar = new bnm(this, sq3Var);
        Object obj2 = bnmVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = bnmVar.w;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        if (e0nVar != null) {
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
    public final Object F(int i, sq3 sq3Var) {
        uhm uhmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof uhm) {
            uhmVar = (uhm) sq3Var;
            int i3 = uhmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uhmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = uhmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = uhmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    uhmVar.r = this;
                    uhmVar.s = i;
                    uhmVar.v = 1;
                    obj = q(i, uhmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = uhmVar.s;
                    this = uhmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.m();
                }
                if (i > 0) {
                    this.r(i - 1, new fsm(9));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new fsm(10));
                }
                return Unit.a;
            }
        }
        uhmVar = new uhm(this, sq3Var);
        Object obj2 = uhmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = uhmVar.v;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        if (e0nVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(int i, wpm wpmVar, sq3 sq3Var) {
        ixm ixmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof ixm) {
            ixmVar = (ixm) sq3Var;
            int i3 = ixmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ixmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = ixmVar.s;
                Object obj2 = lu3.a;
                i2 = ixmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    ixmVar.r = wpmVar;
                    ixmVar.u = 1;
                    obj = q(i, ixmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wpmVar = ixmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    wpmVar.getClass();
                    e0nVar.g(new bcl(23, e0nVar, wpmVar), new yzm(e0nVar, 2));
                }
                return Unit.a;
            }
        }
        ixmVar = new ixm(this, sq3Var);
        Object obj3 = ixmVar.s;
        Object obj22 = lu3.a;
        i2 = ixmVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(long j, int i, sq3 sq3Var) {
        xpm xpmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof xpm) {
            xpmVar = (xpm) sq3Var;
            int i3 = xpmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xpmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = xpmVar.s;
                Object obj2 = lu3.a;
                i2 = xpmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    xpmVar.r = j;
                    xpmVar.u = 1;
                    obj = q(i, xpmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = xpmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    String str = "+" + (j / 1000);
                    BlazeTextView blazeTextView = e0nVar.b.B;
                    blazeTextView.getClass();
                    e0n.b(blazeTextView, str);
                }
                return Unit.a;
            }
        }
        xpmVar = new xpm(this, sq3Var);
        Object obj3 = xpmVar.s;
        Object obj22 = lu3.a;
        i2 = xpmVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(1:15)|17|18))|28|6|7|(0)(0)|11|(2:13|15)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(int i, sq3 sq3Var) {
        nlm nlmVar;
        int i2;
        e0n e0nVar;
        xyl xylVar;
        if (sq3Var instanceof nlm) {
            nlmVar = (nlm) sq3Var;
            int i3 = nlmVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nlmVar.t = i3 - Integer.MIN_VALUE;
                Object obj = nlmVar.r;
                Object obj2 = lu3.a;
                i2 = nlmVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    nlmVar.t = 1;
                    obj = q(i, nlmVar);
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
                e0nVar = (e0n) obj;
                if (e0nVar != null && (xylVar = e0nVar.i) != null) {
                    xylVar.a();
                }
                return Unit.a;
            }
        }
        nlmVar = new nlm(this, sq3Var);
        Object obj3 = nlmVar.r;
        Object obj22 = lu3.a;
        i2 = nlmVar.t;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
            xylVar.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0058, B:19:0x0063, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0058, B:19:0x0063, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0044, B:14:0x0048, B:16:0x004d, B:17:0x0058, B:19:0x0063, B:27:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i, sq3 sq3Var) {
        ctm ctmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof ctm) {
            ctmVar = (ctm) sq3Var;
            int i3 = ctmVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ctmVar.v = i3 - Integer.MIN_VALUE;
                Object obj = ctmVar.t;
                lu3 lu3Var = lu3.a;
                i2 = ctmVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    ctmVar.r = this;
                    ctmVar.s = i;
                    ctmVar.v = 1;
                    obj = q(i, ctmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = ctmVar.s;
                    this = ctmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.n();
                }
                if (i > 0) {
                    this.r(i - 1, new fsm(7));
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new fsm(8));
                }
                return Unit.a;
            }
        }
        ctmVar = new ctm(this, sq3Var);
        Object obj2 = ctmVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = ctmVar.v;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        if (e0nVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)|15|16))|27|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0028, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0024, B:11:0x003d, B:13:0x0041, B:21:0x0034), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(int i, sq3 sq3Var) {
        sym symVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof sym) {
            symVar = (sym) sq3Var;
            int i3 = symVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                symVar.t = i3 - Integer.MIN_VALUE;
                Object obj = symVar.r;
                Object obj2 = lu3.a;
                i2 = symVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    symVar.t = 1;
                    obj = q(i, symVar);
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
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    ImageView imageView = e0nVar.b.o;
                    imageView.getClass();
                    evl.animateWiggle$default(imageView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0L, 0, 15, null);
                }
                return Unit.a;
            }
        }
        symVar = new sym(this, sq3Var);
        Object obj3 = symVar.r;
        Object obj22 = lu3.a;
        i2 = symVar.t;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        String str;
        String d;
        e0n e0nVar = (e0n) uVar;
        e0nVar.getClass();
        Object o = o(i);
        o.getClass();
        n4m n4mVar = (n4m) o;
        a aVar = this.f;
        uxm uxmVar = e0nVar.b;
        try {
            e0nVar.d = n4mVar;
            e0nVar.h = aVar;
            e0n.j(uxmVar, e0nVar.a());
            e0nVar.e(n4mVar);
            n4m.a aVar2 = n4mVar.c;
            if (aVar2 instanceof n4m.a.C1353a) {
                d = ((n4m.a.C1353a) aVar2).a;
            } else {
                if (!(aVar2 instanceof n4m.a.b)) {
                    if (!(aVar2 instanceof p7m)) {
                        zzl.b();
                        return;
                    }
                    str = null;
                    ImageView imageView = uxmVar.d;
                    imageView.getClass();
                    evl.loadAndCacheImage$default(imageView, str, null, null, null, false, null, null, new ukm(n4mVar, 1), null, null, null, 1918, null);
                }
                d = ((n4m.a.b) aVar2).d();
            }
            str = d;
            ImageView imageView2 = uxmVar.d;
            imageView2.getClass();
            evl.loadAndCacheImage$default(imageView2, str, null, null, null, false, null, null, new ukm(n4mVar, 1), null, null, null, 1918, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new e0n(uxm.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_videos_player_view_holder, viewGroup, false)), this.e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(3:10|11|12)(2:25|26))(3:27|28|(1:30)(1:31))|13|(1:15)|(1:17)|18|(1:20)|22|23))|34|6|7|(0)(0)|13|(0)|(0)|18|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x002e, B:13:0x0055, B:15:0x0059, B:17:0x0070, B:18:0x007c, B:20:0x0087, B:28:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x002e, B:13:0x0055, B:15:0x0059, B:17:0x0070, B:18:0x007c, B:20:0x0087, B:28:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x002e, B:13:0x0055, B:15:0x0059, B:17:0x0070, B:18:0x007c, B:20:0x0087, B:28:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, long j, long j2, sq3 sq3Var) {
        zvm zvmVar;
        int i2;
        long j3;
        lzm lzmVar;
        int i3;
        long j4;
        e0n e0nVar;
        if (sq3Var instanceof zvm) {
            zvmVar = (zvm) sq3Var;
            int i4 = zvmVar.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zvmVar.x = i4 - Integer.MIN_VALUE;
                Object obj = zvmVar.v;
                lu3 lu3Var = lu3.a;
                i2 = zvmVar.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    zvmVar.r = this;
                    zvmVar.s = i;
                    zvmVar.t = j;
                    j3 = j2;
                    zvmVar.u = j3;
                    zvmVar.x = 1;
                    obj = q(i, zvmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    lzmVar = this;
                    i3 = i;
                    j4 = j;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j5 = zvmVar.u;
                    j4 = zvmVar.t;
                    int i5 = zvmVar.s;
                    lzm lzmVar2 = zvmVar.r;
                    y6a.M(obj);
                    j3 = j5;
                    lzmVar = lzmVar2;
                    i3 = i5;
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.g(new d0n(e0nVar, j3, j4, 0), new yzm(e0nVar, 6));
                }
                if (i3 > 0) {
                    lzmVar.r(i3 - 1, new fsm(11));
                }
                if (i3 < lzmVar.a.f.size() - 1) {
                    lzmVar.r(i3 + 1, new fsm(12));
                }
                return Unit.a;
            }
        }
        zvmVar = new zvm(this, sq3Var);
        Object obj2 = zvmVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = zvmVar.x;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        if (e0nVar != null) {
        }
        if (i3 > 0) {
        }
        if (i3 < lzmVar.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:35|36))(3:37|38|(1:40))|12|(2:25|(1:31)(1:30))|32|33))|43|6|7|(0)(0)|12|(7:14|17|20|22|25|(1:27)|31)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, long j, boolean z, sq3 sq3Var) {
        ium iumVar;
        int i2;
        e0n e0nVar;
        xyl xylVar;
        n4m n4mVar;
        eqm d;
        if (sq3Var instanceof ium) {
            iumVar = (ium) sq3Var;
            int i3 = iumVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iumVar.v = i3 - Integer.MIN_VALUE;
                Object obj = iumVar.t;
                Object obj2 = lu3.a;
                i2 = iumVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    iumVar.r = j;
                    iumVar.s = z;
                    iumVar.v = 1;
                    obj = q(i, iumVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = iumVar.s;
                    j = iumVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null && j != 0 && (xylVar = e0nVar.i) != null && (n4mVar = e0nVar.d) != null && (d = fgm.d(n4mVar)) != null) {
                    if (xylVar.c || !d.a() || z) {
                        xylVar.a();
                    } else {
                        xylVar.d();
                        xylVar.b(j / 1000.0d);
                    }
                }
                return Unit.a;
            }
        }
        iumVar = new ium(this, sq3Var);
        Object obj3 = iumVar.t;
        Object obj22 = lu3.a;
        i2 = iumVar.v;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
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
    public final Object v(int i, c1m.a aVar, sq3 sq3Var) {
        ufm ufmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof ufm) {
            ufmVar = (ufm) sq3Var;
            int i3 = ufmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ufmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = ufmVar.s;
                Object obj2 = lu3.a;
                i2 = ufmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    ufmVar.r = aVar;
                    ufmVar.u = 1;
                    obj = q(i, ufmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = ufmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.d(aVar);
                }
                return Unit.a;
            }
        }
        ufmVar = new ufm(this, sq3Var);
        Object obj3 = ufmVar.s;
        Object obj22 = lu3.a;
        i2 = ufmVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, BlazeLiveStreamEdgeState blazeLiveStreamEdgeState, sq3 sq3Var) {
        vrm vrmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof vrm) {
            vrmVar = (vrm) sq3Var;
            int i3 = vrmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vrmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = vrmVar.s;
                Object obj2 = lu3.a;
                i2 = vrmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    vrmVar.r = blazeLiveStreamEdgeState;
                    vrmVar.u = 1;
                    obj = q(i, vrmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blazeLiveStreamEdgeState = vrmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    blazeLiveStreamEdgeState.getClass();
                    e0nVar.g(new iol(blazeLiveStreamEdgeState, 18), new fsm(28));
                }
                return Unit.a;
            }
        }
        vrmVar = new vrm(this, sq3Var);
        Object obj3 = vrmVar.s;
        Object obj22 = lu3.a;
        i2 = vrmVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
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
    public final Object x(int i, s5m s5mVar, sq3 sq3Var) {
        t9m t9mVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof t9m) {
            t9mVar = (t9m) sq3Var;
            int i3 = t9mVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t9mVar.u = i3 - Integer.MIN_VALUE;
                Object obj = t9mVar.s;
                Object obj2 = lu3.a;
                i2 = t9mVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    t9mVar.r = s5mVar;
                    t9mVar.u = 1;
                    obj = q(i, t9mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s5mVar = t9mVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.f(s5mVar);
                }
                return Unit.a;
            }
        }
        t9mVar = new t9m(this, sq3Var);
        Object obj3 = t9mVar.s;
        Object obj22 = lu3.a;
        i2 = t9mVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|(1:14)|(1:16)|17|(1:19)|21|22))|32|6|7|(0)(0)|12|(0)|(0)|17|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004d, B:16:0x0053, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004d, B:16:0x0053, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x004d, B:16:0x0053, B:17:0x005d, B:19:0x0068, B:27:0x0039), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(int i, final wpm wpmVar, sq3 sq3Var) {
        fvm fvmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof fvm) {
            fvmVar = (fvm) sq3Var;
            int i3 = fvmVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fvmVar.w = i3 - Integer.MIN_VALUE;
                Object obj = fvmVar.u;
                lu3 lu3Var = lu3.a;
                i2 = fvmVar.w;
                final int i4 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    fvmVar.r = this;
                    fvmVar.s = wpmVar;
                    fvmVar.t = i;
                    fvmVar.w = 1;
                    obj = q(i, fvmVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = fvmVar.t;
                    wpmVar = fvmVar.s;
                    this = fvmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                final int i5 = 0;
                if (e0nVar != null) {
                    e0n.updatePlayerOverlayVisibility$default(e0nVar, wpmVar, false, 2, null);
                }
                if (i > 0) {
                    this.r(i - 1, new Function1() { // from class: zym
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i6 = i5;
                            wpm wpmVar2 = wpmVar;
                            e0n e0nVar2 = (e0n) obj2;
                            switch (i6) {
                                case 0:
                                    e0nVar2.getClass();
                                    e0nVar2.h(wpmVar2, true);
                                    break;
                                default:
                                    e0nVar2.getClass();
                                    e0nVar2.h(wpmVar2, true);
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                if (i < this.a.f.size() - 1) {
                    this.r(i + 1, new Function1() { // from class: zym
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i6 = i4;
                            wpm wpmVar2 = wpmVar;
                            e0n e0nVar2 = (e0n) obj2;
                            switch (i6) {
                                case 0:
                                    e0nVar2.getClass();
                                    e0nVar2.h(wpmVar2, true);
                                    break;
                                default:
                                    e0nVar2.getClass();
                                    e0nVar2.h(wpmVar2, true);
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                return Unit.a;
            }
        }
        fvmVar = new fvm(this, sq3Var);
        Object obj2 = fvmVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = fvmVar.w;
        final int i42 = 1;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj2;
        final int i52 = 0;
        if (e0nVar != null) {
        }
        if (i > 0) {
        }
        if (i < this.a.f.size() - 1) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|27|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0040, B:14:0x0044, B:22:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, boolean z, sq3 sq3Var) {
        icm icmVar;
        int i2;
        e0n e0nVar;
        if (sq3Var instanceof icm) {
            icmVar = (icm) sq3Var;
            int i3 = icmVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                icmVar.u = i3 - Integer.MIN_VALUE;
                Object obj = icmVar.s;
                Object obj2 = lu3.a;
                i2 = icmVar.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    icmVar.r = z;
                    icmVar.u = 1;
                    obj = q(i, icmVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = icmVar.r;
                    y6a.M(obj);
                }
                e0nVar = (e0n) obj;
                if (e0nVar != null) {
                    e0nVar.g(new sx0(z, e0nVar, 9), new a0n(2));
                }
                return Unit.a;
            }
        }
        icmVar = new icm(this, sq3Var);
        Object obj3 = icmVar.s;
        Object obj22 = lu3.a;
        i2 = icmVar.u;
        if (i2 != 0) {
        }
        e0nVar = (e0n) obj3;
        if (e0nVar != null) {
        }
        return Unit.a;
    }
}
