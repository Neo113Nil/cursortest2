package defpackage;

import android.os.CancellationSignal;
import com.blaze.blazesdk.logger.local.BlazeLogLocal;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bam extends psl {
    public final k6g a;
    public final mwl b;
    public final qcm c = new qcm();

    public bam(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new mwl(this, k6gVar);
    }

    @Override // defpackage.psl
    public final Object a(int i, owl owlVar) {
        r6g e = r6g.e(1, "\n        SELECT * FROM blaze_logs \n        ORDER BY \n            is_immediate DESC,\n            CASE level \n                WHEN 'CRITICAL' THEN 1 \n                WHEN 'ERROR' THEN 2 \n                WHEN 'WARN' THEN 3 \n                WHEN 'INFO' THEN 4 \n                WHEN 'DEBUG' THEN 5 \n                ELSE 6 \n            END ASC,\n            reporting_timestamp ASC\n        LIMIT ?\n    ");
        e.q(1, i);
        return rd0.f.l(this.a, new CancellationSignal(), new f4m(this, e), owlVar);
    }

    @Override // defpackage.psl
    public final Object b(List list, rsl rslVar) {
        return rd0.f.m(this.a, true, new j7m(this, list), rslVar);
    }

    @Override // defpackage.psl
    public final Object c(BlazeLogLocal[] blazeLogLocalArr, sq3 sq3Var) {
        return rd0.f.m(this.a, true, new q0m(this, blazeLogLocalArr), sq3Var);
    }
}
