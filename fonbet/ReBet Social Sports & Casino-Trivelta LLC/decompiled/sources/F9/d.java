package F9;

import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.C3195t;
import com.google.android.gms.common.internal.InterfaceC3194s;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class d extends com.google.android.gms.common.api.e implements InterfaceC3194s {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a.g f3648a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3117a.AbstractC0488a f3649b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3117a f3650c;

    static {
        C3117a.g gVar = new C3117a.g();
        f3648a = gVar;
        c cVar = new c();
        f3649b = cVar;
        f3650c = new C3117a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C3195t c3195t) {
        super(context, f3650c, c3195t, e.a.f32290c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3194s
    public final Task a(final TelemetryData telemetryData) {
        AbstractC3163x.a a10 = AbstractC3163x.a();
        a10.d(zaf.zaa);
        a10.c(false);
        a10.b(new InterfaceC3153s() { // from class: F9.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a.g gVar = d.f3648a;
                ((a) ((e) obj).getService()).c(TelemetryData.this);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(a10.a());
    }
}
