package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bc2 {
    public final CodedOutputStream a;
    public final byte[] b;

    public bc2(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = CodedOutputStream.newInstance(bArr);
    }
}
