package ig;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
final class r extends p {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f66460d = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f66461e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final String f66462b;

    /* renamed from: c, reason: collision with root package name */
    private final transient ng.f f66463c;

    r(String str, ng.f fVar) {
        this.f66462b = str;
        this.f66463c = fVar;
    }

    static r h(String str, boolean z11) {
        ng.f fVar;
        if (str.length() < 2 || !f66460d.matcher(str).matches()) {
            throw new C7073b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        try {
            fVar = ng.i.a(str, true);
        } catch (ng.g e11) {
            if (str.equals("GMT0")) {
                q qVar = q.f66455f;
                qVar.getClass();
                fVar = ng.f.h(qVar);
            } else {
                if (z11) {
                    throw e11;
                }
                fVar = null;
            }
        }
        return new r(str, fVar);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 7, this);
    }

    @Override // ig.p
    public final String a() {
        return this.f66462b;
    }

    @Override // ig.p
    public final ng.f b() {
        ng.f fVar = this.f66463c;
        return fVar != null ? fVar : ng.i.a(this.f66462b, false);
    }

    @Override // ig.p
    final void g(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f66462b);
    }

    final void i(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f66462b);
    }
}
