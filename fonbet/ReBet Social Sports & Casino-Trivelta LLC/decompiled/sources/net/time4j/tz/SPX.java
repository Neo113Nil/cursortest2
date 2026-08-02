package net.time4j.tz;

import com.plaid.internal.EnumC3631g;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import kotlin.UByte;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* renamed from: a, reason: collision with root package name */
    public transient Object f58324a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f58325b;

    public SPX() {
    }

    private Object readResolve() {
        return this.f58324a;
    }

    public final Object a(ObjectInput objectInput, byte b10) {
        return new a((k) objectInput.readObject(), (l) objectInput.readObject());
    }

    public final Object b(ObjectInput objectInput, byte b10) {
        return p.q(objectInput.readInt(), (b10 & 15) == 1 ? objectInput.readInt() : 0);
    }

    public final Object c(byte b10) {
        int i10 = b10 & 15;
        return n.d(b.values()[i10 / 2], g.values()[i10 % 2]);
    }

    public final Object d(ObjectInput objectInput, byte b10) {
        k kVar = (k) objectInput.readObject();
        m mVar = (m) objectInput.readObject();
        o oVar = l.f58348d;
        if ((b10 & 15) == 1) {
            oVar = (o) objectInput.readObject();
        }
        return new c(kVar, mVar, oVar);
    }

    public final void e(ObjectOutput objectOutput) {
        a aVar = (a) this.f58324a;
        objectOutput.writeByte(192);
        objectOutput.writeObject(aVar.z());
        objectOutput.writeObject(aVar.R());
    }

    public final void f(ObjectOutput objectOutput) {
        p pVar = (p) this.f58324a;
        boolean z10 = pVar.i() != 0;
        objectOutput.writeByte(z10 ? EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE : EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        objectOutput.writeInt(pVar.j());
        if (z10) {
            objectOutput.writeInt(pVar.i());
        }
    }

    public final void g(ObjectOutput objectOutput) {
        objectOutput.writeByte(((n) this.f58324a).c() | 208);
    }

    public final void h(ObjectOutput objectOutput) {
        c cVar = (c) this.f58324a;
        boolean z10 = cVar.E() != l.f58348d;
        objectOutput.writeByte(z10 ? 225 : EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE);
        objectOutput.writeObject(cVar.z());
        objectOutput.writeObject(cVar.y());
        if (z10) {
            objectOutput.writeObject(cVar.E());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & UByte.MAX_VALUE) >> 4) {
            case 12:
                this.f58324a = a(objectInput, readByte);
                return;
            case 13:
                this.f58324a = c(readByte);
                return;
            case 14:
                this.f58324a = d(objectInput, readByte);
                return;
            case 15:
                this.f58324a = b(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f58325b) {
            case 12:
                e(objectOutput);
                return;
            case 13:
                g(objectOutput);
                return;
            case 14:
                h(objectOutput);
                return;
            case 15:
                f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    public SPX(Object obj, int i10) {
        this.f58324a = obj;
        this.f58325b = i10;
    }
}
