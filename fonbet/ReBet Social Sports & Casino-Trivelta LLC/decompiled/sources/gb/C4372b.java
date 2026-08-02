package gb;

import aa.C1927a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzfb;
import eb.C4192b;
import eb.C4196f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tb.C6456a;
import tb.InterfaceC6457b;
import tb.InterfaceC6459d;

/* renamed from: gb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4372b implements InterfaceC4371a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile InterfaceC4371a f47230c;

    /* renamed from: a, reason: collision with root package name */
    public final C1927a f47231a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f47232b;

    public C4372b(C1927a c1927a) {
        AbstractC3191o.m(c1927a);
        this.f47231a = c1927a;
        this.f47232b = new ConcurrentHashMap();
    }

    public static InterfaceC4371a c(C4196f c4196f, Context context, InterfaceC6459d interfaceC6459d) {
        AbstractC3191o.m(c4196f);
        AbstractC3191o.m(context);
        AbstractC3191o.m(interfaceC6459d);
        AbstractC3191o.m(context.getApplicationContext());
        if (f47230c == null) {
            synchronized (C4372b.class) {
                try {
                    if (f47230c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c4196f.x()) {
                            interfaceC6459d.a(C4192b.class, new Executor() { // from class: gb.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC6457b() { // from class: gb.c
                                @Override // tb.InterfaceC6457b
                                public final /* synthetic */ void a(C6456a c6456a) {
                                    C4372b.d(c6456a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c4196f.w());
                        }
                        f47230c = new C4372b(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f47230c;
    }

    public static /* synthetic */ void d(C6456a c6456a) {
        boolean z10 = ((C4192b) c6456a.a()).f45868a;
        synchronized (C4372b.class) {
            ((C4372b) AbstractC3191o.m(f47230c)).f47231a.c(z10);
        }
    }

    @Override // gb.InterfaceC4371a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (hb.b.a(str) && hb.b.b(str2, bundle) && hb.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f47231a.a(str, str2, bundle);
        }
    }

    @Override // gb.InterfaceC4371a
    public void b(String str, String str2, Object obj) {
        if (hb.b.a(str) && hb.b.c(str, str2)) {
            this.f47231a.b(str, str2, obj);
        }
    }
}
