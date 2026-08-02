package w1;

import V1.h;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6696a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6696a f67256a = new C0949a();

    /* renamed from: w1.a$a, reason: collision with other inner class name */
    public class C0949a implements InterfaceC6696a {
        @Override // w1.InterfaceC6696a
        public boolean a(androidx.media3.common.a aVar) {
            String str = aVar.f20543o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // w1.InterfaceC6696a
        public Q1.a b(androidx.media3.common.a aVar) {
            String str = aVar.f20543o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new R1.b();
                    case "application/x-icy":
                        return new U1.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new S1.b();
                    case "application/x-scte35":
                        return new X1.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(androidx.media3.common.a aVar);

    Q1.a b(androidx.media3.common.a aVar);
}
