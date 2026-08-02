package defpackage;

import com.blaze.blazesdk.logger.local.BlazeLogLocal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mwl extends ap5 {
    public final /* synthetic */ bam d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwl(bam bamVar, k6g k6gVar) {
        super(k6gVar, 1);
        this.d = bamVar;
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR REPLACE INTO `blaze_logs` (`id`,`request`,`level`,`reporting_timestamp`,`is_immediate`,`api_scheme_version`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        BlazeLogLocal blazeLogLocal = (BlazeLogLocal) obj;
        if (blazeLogLocal.getId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, blazeLogLocal.getId());
        }
        if (blazeLogLocal.getRequest() == null) {
            mniVar.s(2);
        } else {
            mniVar.m0(2, blazeLogLocal.getRequest());
        }
        qcm qcmVar = this.d.c;
        vul level = blazeLogLocal.getLevel();
        qcmVar.getClass();
        String name = level != null ? level.name() : null;
        if (name == null) {
            mniVar.s(3);
        } else {
            mniVar.m0(3, name);
        }
        if (blazeLogLocal.getReportingTimestamp() == null) {
            mniVar.s(4);
        } else {
            mniVar.m0(4, blazeLogLocal.getReportingTimestamp());
        }
        mniVar.q(5, blazeLogLocal.isImmediate() ? 1L : 0L);
        if (blazeLogLocal.getApiSchemeVersion() == null) {
            mniVar.s(6);
        } else {
            mniVar.m0(6, blazeLogLocal.getApiSchemeVersion());
        }
    }
}
