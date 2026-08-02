package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u36 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public u36(int i) {
        switch (i) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream2;
                this.b = new DataOutputStream(byteArrayOutputStream2);
                break;
        }
    }

    public byte[] a(s36 s36Var) {
        DataOutputStream dataOutputStream = this.b;
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(s36Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(s36Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(s36Var.c);
            dataOutputStream.writeLong(s36Var.d);
            dataOutputStream.write(s36Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            is8.h(e);
            return null;
        }
    }
}
