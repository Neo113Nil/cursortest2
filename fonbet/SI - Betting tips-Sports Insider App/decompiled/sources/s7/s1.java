package s7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23050a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f23051b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23052c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdd f23053d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23054e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f23055f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23056g;

    public s1(Context context, zzdd zzddVar, Long l6) {
        this.f23054e = true;
        g6.v.h(context);
        Context applicationContext = context.getApplicationContext();
        g6.v.h(applicationContext);
        this.f23050a = applicationContext;
        this.f23055f = l6;
        if (zzddVar != null) {
            this.f23053d = zzddVar;
            this.f23054e = zzddVar.f5385c;
            this.f23052c = zzddVar.f5384b;
            this.f23056g = zzddVar.f5387e;
            Bundle bundle = zzddVar.f5386d;
            if (bundle != null) {
                this.f23051b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
