package com.vk.shared.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.report.api.di.ReportComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.ewy;
import xsna.fpf0;
import xsna.n5g0;
import xsna.qcy;
import xsna.x1c0;

/* compiled from: ReportComponentImpl.kt */
/* loaded from: classes5.dex */
public final class ReportComponentImpl implements ReportComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new x1c0(3));

    /* compiled from: ReportComponentImpl.kt */
    public static final class a implements b7m<ReportComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ReportComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ReportComponentImpl.class, "reportFragmentRouter", "getReportFragmentRouter()Lcom/vk/report/api/ReportFragmentRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.report.api.di.ReportComponent
    public final n5g0 d4() {
        qcy<Object> qcyVar = b[0];
        return (n5g0) this.a.c();
    }
}
