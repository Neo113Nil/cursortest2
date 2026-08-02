package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5373e = 3;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5376h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i1 i1Var, Activity activity, i0 i0Var) {
        super(i1Var.f5083a, true);
        this.f5375g = activity;
        this.f5376h = i0Var;
        this.f5374f = i1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|(1:22)|23|24|(12:55|56|57|27|(1:54)(1:31)|32|33|34|(1:36)(1:50)|37|38|(1:40)(3:42|(1:48)(1:45)|46))|26|27|(1:29)|54|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        r7.d(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: Exception -> 0x0091, b -> 0x00c4, TRY_ENTER, TryCatch #1 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: Exception -> 0x0091, b -> 0x00c4, TryCatch #1 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        j1 j1Var;
        Bundle bundle;
        switch (this.f5373e) {
            case 0:
                try {
                    Context context = (Context) this.f5375g;
                    g6.v.h(context);
                    String a7 = s7.r1.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(a7)) {
                        a7 = s7.r1.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a7);
                    l0 l0Var = null;
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        j1Var = (j1) this.f5374f;
                        boolean z5 = (valueOf == null && valueOf.booleanValue()) ? false : true;
                        j1Var.getClass();
                        l0Var = k0.asInterface(u6.f.c(context, !z5 ? u6.f.f24055c : u6.f.f24054b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        j1Var.f5095e = l0Var;
                        if (j1Var.f5095e == null) {
                            int a10 = u6.f.a(context, ModuleDescriptor.MODULE_ID);
                            zzdd zzddVar = new zzdd(133005L, Math.max(a10, r6), Boolean.TRUE.equals(valueOf) || u6.f.d(context, ModuleDescriptor.MODULE_ID, false) < a10, (Bundle) this.f5376h, s7.r1.a(context));
                            l0 l0Var2 = j1Var.f5095e;
                            g6.v.h(l0Var2);
                            l0Var2.initialize(new t6.b(context), zzddVar, this.f5052a);
                            break;
                        } else {
                            io.sentry.android.core.w0.m("FA", "Failed to connect to measurement client.");
                            break;
                        }
                    }
                    valueOf = null;
                    j1Var = (j1) this.f5374f;
                    if (valueOf == null) {
                    }
                    j1Var.getClass();
                    l0Var = k0.asInterface(u6.f.c(context, !z5 ? u6.f.f24055c : u6.f.f24054b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    j1Var.f5095e = l0Var;
                    if (j1Var.f5095e == null) {
                    }
                } catch (Exception e7) {
                    ((j1) this.f5374f).d(e7, true, false);
                    return;
                }
            case 1:
                l0 l0Var3 = ((j1) this.f5374f).f5095e;
                g6.v.h(l0Var3);
                l0Var3.getMaxUserProperties((String) this.f5375g, (i0) this.f5376h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f5376h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                l0 l0Var4 = ((i1) this.f5374f).f5083a.f5095e;
                g6.v.h(l0Var4);
                l0Var4.onActivityCreatedByScionActivityInfo(zzdf.c((Activity) this.f5375g), bundle, this.f5053b);
                break;
            default:
                l0 l0Var5 = ((i1) this.f5374f).f5083a.f5095e;
                g6.v.h(l0Var5);
                l0Var5.onActivitySaveInstanceStateByScionActivityInfo(zzdf.c((Activity) this.f5375g), (i0) this.f5376h, this.f5053b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f5373e) {
            case 1:
                ((i0) this.f5376h).b(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i1 i1Var, Bundle bundle, Activity activity) {
        super(i1Var.f5083a, true);
        this.f5376h = bundle;
        this.f5375g = activity;
        this.f5374f = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, Context context, Bundle bundle) {
        super(j1Var, true);
        this.f5375g = context;
        this.f5376h = bundle;
        this.f5374f = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, String str, i0 i0Var) {
        super(j1Var, true);
        this.f5375g = str;
        this.f5376h = i0Var;
        Objects.requireNonNull(j1Var);
        this.f5374f = j1Var;
    }
}
