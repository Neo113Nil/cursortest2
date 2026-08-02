package io.sentry.clientreport;

import io.sentry.C7165l;
import io.sentry.C7222x2;
import io.sentry.EnumC7161k;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.protocol.A;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f67832a = new b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2 f67833b;

    public e(@NotNull W2 w22) {
        this.f67833b = w22;
    }

    private static EnumC7161k f(H2 h22) {
        return H2.Event.equals(h22) ? EnumC7161k.Error : H2.Session.equals(h22) ? EnumC7161k.Session : H2.Transaction.equals(h22) ? EnumC7161k.Transaction : H2.UserFeedback.equals(h22) ? EnumC7161k.UserReport : H2.Feedback.equals(h22) ? EnumC7161k.Feedback : H2.Profile.equals(h22) ? EnumC7161k.Profile : H2.ProfileChunk.equals(h22) ? EnumC7161k.ProfileChunkUi : H2.Attachment.equals(h22) ? EnumC7161k.Attachment : H2.CheckIn.equals(h22) ? EnumC7161k.Monitor : H2.ReplayVideo.equals(h22) ? EnumC7161k.Replay : H2.Log.equals(h22) ? EnumC7161k.LogItem : H2.Span.equals(h22) ? EnumC7161k.Span : H2.TraceMetric.equals(h22) ? EnumC7161k.TraceMetric : EnumC7161k.Default;
    }

    private void g() {
        this.f67833b.getOnDiscard();
    }

    private void h(@NotNull String str, @NotNull String str2, @NotNull Long l11) {
        ((b) this.f67832a).a(new d(str, str2), l11);
    }

    private void i(c cVar) {
        if (cVar == null) {
            return;
        }
        Iterator it = ((ArrayList) cVar.a()).iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }

    @Override // io.sentry.clientreport.h
    public final void a(@NotNull f fVar, @NotNull EnumC7161k enumC7161k) {
        b(fVar, enumC7161k, 1L);
    }

    @Override // io.sentry.clientreport.h
    public final void b(@NotNull f fVar, @NotNull EnumC7161k enumC7161k, long j11) {
        try {
            h(fVar.getReason(), enumC7161k.getCategory(), Long.valueOf(j11));
            g();
        } catch (Throwable th2) {
            this.f67833b.getLogger().b(I2.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public final void c(@NotNull f fVar, C7222x2 c7222x2) {
        W2 w22 = this.f67833b;
        if (c7222x2 == null) {
            return;
        }
        try {
            H2 e11 = c7222x2.p().e();
            if (H2.ClientReport.equals(e11)) {
                try {
                    i(c7222x2.n(w22.getSerializer()));
                    return;
                } catch (Exception unused) {
                    w22.getLogger().c(I2.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC7161k f7 = f(e11);
            if (f7.equals(EnumC7161k.Transaction)) {
                A s11 = c7222x2.s(w22.getSerializer());
                if (s11 != null) {
                    ArrayList arrayList = (ArrayList) s11.l0();
                    h(fVar.getReason(), EnumC7161k.Span.getCategory(), Long.valueOf(arrayList.size() + 1));
                    arrayList.size();
                    g();
                }
                h(fVar.getReason(), f7.getCategory(), 1L);
                g();
                return;
            }
            if (f7.equals(EnumC7161k.LogItem)) {
                if (c7222x2.q(w22.getSerializer()) == null) {
                    w22.getLogger().c(I2.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                h(fVar.getReason(), f7.getCategory(), Long.valueOf(r3.a().size()));
                h(fVar.getReason(), EnumC7161k.LogByte.getCategory(), Long.valueOf(c7222x2.o().length));
                g();
                return;
            }
            if (!f7.equals(EnumC7161k.TraceMetric)) {
                h(fVar.getReason(), f7.getCategory(), 1L);
                g();
                return;
            }
            if (c7222x2.r(w22.getSerializer()) == null) {
                w22.getLogger().c(I2.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            h(fVar.getReason(), f7.getCategory(), Long.valueOf(r11.a().size()));
            g();
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public final void d(@NotNull f fVar, V1 v12) {
        if (v12 == null) {
            return;
        }
        try {
            Iterator<C7222x2> it = v12.b().iterator();
            while (it.hasNext()) {
                c(fVar, it.next());
            }
        } catch (Throwable th2) {
            this.f67833b.getLogger().b(I2.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    @NotNull
    public final V1 e(@NotNull V1 v12) {
        W2 w22 = this.f67833b;
        Date b11 = C7165l.b();
        ArrayList b12 = ((b) this.f67832a).b();
        c cVar = b12.isEmpty() ? null : new c(b11, b12);
        if (cVar == null) {
            return v12;
        }
        try {
            w22.getLogger().c(I2.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<C7222x2> it = v12.b().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(C7222x2.k(w22.getSerializer(), cVar));
            return new V1(v12.a(), arrayList);
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return v12;
        }
    }
}
