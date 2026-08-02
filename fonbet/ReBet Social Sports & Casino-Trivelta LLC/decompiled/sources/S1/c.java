package S1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f10541a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f10542b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f10541a = byteArrayOutputStream;
        this.f10542b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f10541a.reset();
        try {
            b(this.f10542b, aVar.f10536a);
            String str = aVar.f10537b;
            if (str == null) {
                str = "";
            }
            b(this.f10542b, str);
            this.f10542b.writeLong(aVar.f10538c);
            this.f10542b.writeLong(aVar.f10539d);
            this.f10542b.write(aVar.messageData);
            this.f10542b.flush();
            return this.f10541a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
