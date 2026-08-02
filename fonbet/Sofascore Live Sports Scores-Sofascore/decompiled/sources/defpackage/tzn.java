package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzhu;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tzn extends f5o {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn(gt7 gt7Var, Activity activity, zzcm zzcmVar) {
        super((zzez) gt7Var.b, true);
        this.g = activity;
        this.h = zzcmVar;
        this.f = gt7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:20|21|(1:23)|24|(11:63|64|65|27|(1:62)(1:31)|32|33|(1:35)(1:58)|36|37|(1:39)(7:41|(1:56)(1:44)|45|46|(1:48)(1:55)|49|(1:51)(1:53)))|26|27|(1:29)|62|32|33|(0)(0)|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
    
        r7.d(r0, true, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4 A[Catch: Exception -> 0x00b8, LoadingException -> 0x00e7, TRY_ENTER, TryCatch #2 {LoadingException -> 0x00e7, blocks: (B:35:0x00e4, B:36:0x00eb, B:58:0x00e9), top: B:33:0x00e2, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[Catch: Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:21:0x009d, B:23:0x00b3, B:24:0x00bb, B:27:0x00d0, B:29:0x00d7, B:35:0x00e4, B:36:0x00eb, B:37:0x00fd, B:41:0x0105, B:45:0x011e, B:51:0x0143, B:53:0x0159, B:58:0x00e9, B:61:0x00fa, B:64:0x00c7), top: B:20:0x009d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[Catch: Exception -> 0x00b8, LoadingException -> 0x00e7, TryCatch #2 {LoadingException -> 0x00e7, blocks: (B:35:0x00e4, B:36:0x00eb, B:58:0x00e9), top: B:33:0x00e2, outer: #1 }] */
    @Override // defpackage.f5o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        zzez zzezVar;
        Bundle bundle = null;
        zzcp zzcpVar = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.g;
                    Preconditions.i(context);
                    String a = zzhu.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(a)) {
                        a = zzhu.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a);
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        zzezVar = (zzez) this.f;
                        zzcpVar = zzco.asInterface(DynamiteModule.c(context, (valueOf != null || !valueOf.booleanValue()) == false ? DynamiteModule.d : DynamiteModule.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        zzezVar.g = zzcpVar;
                        if (zzezVar.g == null) {
                            int a2 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
                            int d = DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false);
                            int max = Math.max(a2, d);
                            boolean z = Boolean.TRUE.equals(valueOf) || d < a2;
                            long j = max;
                            zzezVar.h = j;
                            zzdb zzdbVar = new zzdb(161000L, j, z, (Bundle) this.h, zzhu.a(context));
                            Object[] objArr = zzezVar.h >= 169;
                            zzcp zzcpVar2 = zzezVar.g;
                            if (objArr != true) {
                                Preconditions.i(zzcpVar2);
                                zzcpVar2.initialize(new ObjectWrapper(context), zzdbVar, this.a);
                                break;
                            } else {
                                Preconditions.i(zzcpVar2);
                                zzcpVar2.initializeWithElapsedTime(new ObjectWrapper(context), zzdbVar, this.a, this.b);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    valueOf = null;
                    zzezVar = (zzez) this.f;
                    zzcpVar = zzco.asInterface(DynamiteModule.c(context, (valueOf != null || !valueOf.booleanValue()) == false ? DynamiteModule.d : DynamiteModule.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    zzezVar.g = zzcpVar;
                    if (zzezVar.g == null) {
                    }
                } catch (Exception e) {
                    ((zzez) this.f).d(e, true, false);
                    return;
                }
            case 1:
                zzcp zzcpVar3 = ((zzez) this.f).g;
                Preconditions.i(zzcpVar3);
                zzcpVar3.logHealthData(5, (String) this.g, new ObjectWrapper(this.h), new ObjectWrapper(null), new ObjectWrapper(null));
                break;
            case 2:
                zzcp zzcpVar4 = ((zzez) this.f).g;
                Preconditions.i(zzcpVar4);
                zzcpVar4.getMaxUserProperties((String) this.g, (zzcm) this.h);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                zzcp zzcpVar5 = ((zzez) ((gt7) this.f).b).g;
                Preconditions.i(zzcpVar5);
                zzcpVar5.onActivityCreatedByScionActivityInfo(zzdd.Y0((Activity) this.g), bundle, this.b);
                break;
            default:
                zzcp zzcpVar6 = ((zzez) ((gt7) this.f).b).g;
                Preconditions.i(zzcpVar6);
                zzcpVar6.onActivitySaveInstanceStateByScionActivityInfo(zzdd.Y0((Activity) this.g), (zzcm) this.h, this.b);
                break;
        }
    }

    @Override // defpackage.f5o
    public void b() {
        switch (this.e) {
            case 2:
                ((zzcm) this.h).F(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn(gt7 gt7Var, Bundle bundle, Activity activity) {
        super((zzez) gt7Var.b, true);
        this.h = bundle;
        this.g = activity;
        this.f = gt7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn(zzez zzezVar, Context context, Bundle bundle) {
        super(zzezVar, true);
        this.g = context;
        this.h = bundle;
        this.f = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn(zzez zzezVar, String str, zzcm zzcmVar) {
        super(zzezVar, true);
        this.g = str;
        this.h = zzcmVar;
        Objects.requireNonNull(zzezVar);
        this.f = zzezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn(zzez zzezVar, String str, Object obj) {
        super(zzezVar, false);
        this.g = str;
        this.h = obj;
        this.f = zzezVar;
    }
}
