package i2;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f10892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10893b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10894c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10895d;

    public i(int i5, int i10, long j, long j6) {
        this.f10892a = i5;
        this.f10893b = i10;
        this.f10894c = j;
        this.f10895d = j6;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(y4.a.m(new FileInputStream(file), file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(a.a.i(new FileOutputStream(file), file));
        try {
            dataOutputStream.writeInt(this.f10892a);
            dataOutputStream.writeInt(this.f10893b);
            dataOutputStream.writeLong(this.f10894c);
            dataOutputStream.writeLong(this.f10895d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f10893b == iVar.f10893b && this.f10894c == iVar.f10894c && this.f10892a == iVar.f10892a && this.f10895d == iVar.f10895d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10893b), Long.valueOf(this.f10894c), Integer.valueOf(this.f10892a), Long.valueOf(this.f10895d));
    }
}
