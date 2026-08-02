package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t36 extends g7a {
    @Override // defpackage.g7a
    public final Metadata s(vic vicVar, ByteBuffer byteBuffer) {
        nkk nkkVar = new nkk(byteBuffer.array(), byteBuffer.limit());
        String n = nkkVar.n();
        n.getClass();
        String n2 = nkkVar.n();
        n2.getClass();
        return new Metadata(new EventMessage(n, n2, nkkVar.m(), nkkVar.m(), Arrays.copyOfRange(nkkVar.a, nkkVar.b, nkkVar.c)));
    }
}
