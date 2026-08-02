package v1;

import android.media.MediaCodec;

/* renamed from: v1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6628s extends k1.e {

    /* renamed from: a, reason: collision with root package name */
    public final t f66983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66985c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6628s(Throwable th2, t tVar) {
        super(r0.toString(), th2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(tVar == null ? null : tVar.f66986a);
        this.f66983a = tVar;
        this.f66984b = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f66985c = a(th2);
    }

    public static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
