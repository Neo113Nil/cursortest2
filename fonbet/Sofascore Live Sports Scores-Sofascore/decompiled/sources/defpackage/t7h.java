package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t7h implements c6h {
    public final c8h a;

    public t7h(c8h c8hVar) {
        c8hVar.getClass();
        this.a = c8hVar;
    }

    @Override // defpackage.c6h
    public final Object getDefaultValue() {
        return new s7h(this.a.a(null), null, null);
    }

    @Override // defpackage.c6h
    public final Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            xea xeaVar = yea.d;
            String k = c.k(m6k.b0(inputStream));
            xeaVar.getClass();
            return (s7h) xeaVar.b(s7h.Companion.serializer(), k);
        } catch (Exception e) {
            throw new uu3("Cannot parse session data", e);
        }
    }

    @Override // defpackage.c6h
    public final Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        outputStream.write(c.m(yea.d.c(s7h.Companion.serializer(), (s7h) obj)));
        return Unit.a;
    }
}
