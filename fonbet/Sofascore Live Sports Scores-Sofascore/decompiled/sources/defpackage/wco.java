package defpackage;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wco {
    public final Context a;
    public final b7p b;
    public final t6o c;
    public final ddb d;

    public wco(Context context, b7p b7pVar, t6o t6oVar, ddb ddbVar) {
        this.a = context;
        this.b = b7pVar;
        this.c = t6oVar;
        this.d = ddbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [b2p] */
    public final String a() {
        u1p u1pVar = u1p.a;
        try {
            u1pVar = (b2p) this.d.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        if (!u1pVar.d()) {
            return "3";
        }
        try {
            return ((cvo) u1pVar.g()).a.s(new ObjectWrapper(this.a));
        } catch (Throwable th) {
            this.c.d(InstrumentationData.Component.SPAM_MS_PARAMETER_LOADER, InstrumentationData.Method.GET_SPAM_MS_PARAMETER_FROM_ADSHIELD, th);
            return "3";
        }
    }
}
