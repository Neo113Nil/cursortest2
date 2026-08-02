package io.sentry.clientreport;

import io.sentry.AbstractC4779m;
import io.sentry.C4665a3;
import io.sentry.C4815r3;
import io.sentry.C4862w3;
import io.sentry.C4866x2;
import io.sentry.EnumC4774l;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.protocol.B;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final i f51990a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final F3 f51991b;

    public e(F3 f32) {
        this.f51991b = f32;
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, EnumC4774l enumC4774l) {
        c(fVar, enumC4774l, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, C4866x2 c4866x2) {
        if (c4866x2 == null) {
            return;
        }
        try {
            Iterator it = c4866x2.c().iterator();
            while (it.hasNext()) {
                d(fVar, (C4665a3) it.next());
            }
        } catch (Throwable th2) {
            this.f51991b.getLogger().a(EnumC4788n3.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, EnumC4774l enumC4774l, long j10) {
        try {
            h(fVar.getReason(), enumC4774l.getCategory(), Long.valueOf(j10));
            g(fVar, enumC4774l, Long.valueOf(j10));
        } catch (Throwable th2) {
            this.f51991b.getLogger().a(EnumC4788n3.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(f fVar, C4665a3 c4665a3) {
        if (c4665a3 == null) {
            return;
        }
        try {
            EnumC4783m3 e10 = c4665a3.O().e();
            if (EnumC4783m3.ClientReport.equals(e10)) {
                try {
                    j(c4665a3.L(this.f51991b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f51991b.getLogger().c(EnumC4788n3.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC4774l f10 = f(e10);
            if (f10.equals(EnumC4774l.Transaction)) {
                B R10 = c4665a3.R(this.f51991b.getSerializer());
                if (R10 != null) {
                    List o02 = R10.o0();
                    String reason = fVar.getReason();
                    EnumC4774l enumC4774l = EnumC4774l.Span;
                    h(reason, enumC4774l.getCategory(), Long.valueOf(o02.size() + 1));
                    g(fVar, enumC4774l, Long.valueOf(o02.size() + 1));
                }
                h(fVar.getReason(), f10.getCategory(), 1L);
                g(fVar, f10, 1L);
                return;
            }
            if (f10.equals(EnumC4774l.LogItem)) {
                C4815r3 P10 = c4665a3.P(this.f51991b.getSerializer());
                if (P10 == null) {
                    this.f51991b.getLogger().c(EnumC4788n3.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                long size = P10.a().size();
                h(fVar.getReason(), f10.getCategory(), Long.valueOf(size));
                h(fVar.getReason(), EnumC4774l.LogByte.getCategory(), Long.valueOf(c4665a3.M().length));
                g(fVar, f10, Long.valueOf(size));
                return;
            }
            if (!f10.equals(EnumC4774l.TraceMetric)) {
                h(fVar.getReason(), f10.getCategory(), 1L);
                g(fVar, f10, 1L);
                return;
            }
            C4862w3 Q10 = c4665a3.Q(this.f51991b.getSerializer());
            if (Q10 == null) {
                this.f51991b.getLogger().c(EnumC4788n3.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            long size2 = Q10.a().size();
            h(fVar.getReason(), f10.getCategory(), Long.valueOf(size2));
            h(fVar.getReason(), EnumC4774l.TraceMetricByte.getCategory(), Long.valueOf(c4665a3.M().length));
            g(fVar, f10, Long.valueOf(size2));
        } catch (Throwable th2) {
            this.f51991b.getLogger().a(EnumC4788n3.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public C4866x2 e(C4866x2 c4866x2) {
        c i10 = i();
        if (i10 == null) {
            return c4866x2;
        }
        try {
            this.f51991b.getLogger().c(EnumC4788n3.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator it = c4866x2.c().iterator();
            while (it.hasNext()) {
                arrayList.add((C4665a3) it.next());
            }
            arrayList.add(C4665a3.D(this.f51991b.getSerializer(), i10));
            return new C4866x2(c4866x2.b(), arrayList);
        } catch (Throwable th2) {
            this.f51991b.getLogger().a(EnumC4788n3.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return c4866x2;
        }
    }

    public final EnumC4774l f(EnumC4783m3 enumC4783m3) {
        return EnumC4783m3.Event.equals(enumC4783m3) ? EnumC4774l.Error : EnumC4783m3.Session.equals(enumC4783m3) ? EnumC4774l.Session : EnumC4783m3.Transaction.equals(enumC4783m3) ? EnumC4774l.Transaction : EnumC4783m3.UserFeedback.equals(enumC4783m3) ? EnumC4774l.UserReport : EnumC4783m3.Feedback.equals(enumC4783m3) ? EnumC4774l.Feedback : EnumC4783m3.Profile.equals(enumC4783m3) ? EnumC4774l.Profile : EnumC4783m3.ProfileChunk.equals(enumC4783m3) ? EnumC4774l.ProfileChunkUi : EnumC4783m3.Attachment.equals(enumC4783m3) ? EnumC4774l.Attachment : EnumC4783m3.CheckIn.equals(enumC4783m3) ? EnumC4774l.Monitor : EnumC4783m3.ReplayVideo.equals(enumC4783m3) ? EnumC4774l.Replay : EnumC4783m3.Log.equals(enumC4783m3) ? EnumC4774l.LogItem : EnumC4783m3.Span.equals(enumC4783m3) ? EnumC4774l.Span : EnumC4783m3.TraceMetric.equals(enumC4783m3) ? EnumC4774l.TraceMetric : EnumC4774l.Default;
    }

    public final void g(f fVar, EnumC4774l enumC4774l, Long l10) {
        this.f51991b.getOnDiscard();
    }

    public final void h(String str, String str2, Long l10) {
        this.f51990a.a(new d(str, str2), l10);
    }

    public c i() {
        Date c10 = AbstractC4779m.c();
        List b10 = this.f51990a.b();
        if (b10.isEmpty()) {
            return null;
        }
        return new c(c10, b10);
    }

    public final void j(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }
}
