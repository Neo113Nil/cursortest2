package defpackage;

import android.database.Cursor;
import com.blaze.blazesdk.logger.local.BlazeLogLocal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f4m implements Callable {
    public final /* synthetic */ r6g a;
    public final /* synthetic */ bam b;

    public f4m(bam bamVar, r6g r6gVar) {
        this.b = bamVar;
        this.a = r6gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        bam bamVar = this.b;
        k6g k6gVar = bamVar.a;
        r6g r6gVar = this.a;
        Cursor V = gz8.V(k6gVar, r6gVar);
        try {
            int F = xw3.F(V, "id");
            int F2 = xw3.F(V, "request");
            int F3 = xw3.F(V, "level");
            int F4 = xw3.F(V, "reporting_timestamp");
            int F5 = xw3.F(V, "is_immediate");
            int F6 = xw3.F(V, "api_scheme_version");
            ArrayList arrayList = new ArrayList(V.getCount());
            while (V.moveToNext()) {
                String string = V.isNull(F) ? null : V.getString(F);
                String string2 = V.isNull(F2) ? null : V.getString(F2);
                String string3 = V.isNull(F3) ? null : V.getString(F3);
                bamVar.c.getClass();
                vul valueOf = string3 != null ? vul.valueOf(string3) : null;
                if (valueOf == null) {
                    throw new IllegalStateException("Expected non-null com.blaze.blazesdk.app_configurations.models.logger.BlazeLogLevel, but it was null.");
                }
                arrayList.add(new BlazeLogLocal(string, string2, valueOf, V.isNull(F4) ? null : V.getString(F4), V.getInt(F5) != 0, V.isNull(F6) ? null : V.getString(F6)));
            }
            V.close();
            r6gVar.release();
            return arrayList;
        } catch (Throwable th) {
            V.close();
            r6gVar.release();
            throw th;
        }
    }
}
