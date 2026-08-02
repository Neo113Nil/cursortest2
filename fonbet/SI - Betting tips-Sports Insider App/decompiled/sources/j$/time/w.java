package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class w extends ZoneId {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17563d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b, reason: collision with root package name */
    public final String f17564b;

    /* renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f17565c;

    public static w V(String str, boolean z5) {
        j$.time.zone.f fVar;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i5 == 0) && ((charAt < '0' || charAt > '9' || i5 == 0) && ((charAt != '~' || i5 == 0) && ((charAt != '.' || i5 == 0) && ((charAt != '_' || i5 == 0) && ((charAt != '+' || i5 == 0) && (charAt != '-' || i5 == 0))))))))) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVar = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e7) {
                if (z5) {
                    throw e7;
                }
                fVar = null;
            }
            return new w(str, fVar);
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public w(String str, j$.time.zone.f fVar) {
        this.f17564b = str;
        this.f17565c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f17564b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f Q() {
        j$.time.zone.f fVar = this.f17565c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f17564b);
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void U(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f17564b);
    }
}
