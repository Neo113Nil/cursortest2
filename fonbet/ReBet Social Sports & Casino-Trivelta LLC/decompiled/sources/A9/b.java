package A9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class b extends e {
    private static final C3117a.g zza;
    private static final C3117a.AbstractC0488a zzb;
    private static final C3117a zzc;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        c cVar = new c();
        zzb = cVar;
        zzc = new C3117a("SmsRetriever.API", cVar, gVar);
    }

    public b(Activity activity) {
        super(activity, zzc, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    public abstract Task startSmsRetriever();

    public b(Context context) {
        super(context, zzc, C3117a.d.f32289J4, e.a.f32290c);
    }
}
