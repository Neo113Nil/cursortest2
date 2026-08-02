package k4;

import j3.C7272n;
import java.util.List;
import java.util.Objects;
import k4.o;
import m4.C8076a;
import n4.C8439a;
import o4.C8638b;
import p4.C8851a;
import r4.C9170a;
import s4.C9591a;
import t4.C9748a;

/* loaded from: classes.dex */
public final class e implements o.a {
    @Override // k4.o.a
    public final int a(C7272n c7272n) {
        String str = c7272n.f69127o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(Nk.a.b("Unsupported MIME type: ", str));
    }

    @Override // k4.o.a
    public final o b(C7272n c7272n) {
        List<byte[]> list;
        String str = c7272n.f69127o;
        if (str != null) {
            list = c7272n.f69130r;
            switch (str) {
                case "application/dvbsubs":
                    return new C8076a(list);
                case "application/pgs":
                    return new C8439a();
                case "application/x-mp4-vtt":
                    return new C9748a();
                case "text/vtt":
                    return new t4.g();
                case "application/x-quicktime-tx3g":
                    return new C9170a(list);
                case "text/x-ssa":
                    return new C8638b(list);
                case "application/vobsub":
                    return new C9591a(list);
                case "application/x-subrip":
                    return new C8851a();
                case "application/ttml+xml":
                    return new q4.d();
            }
        }
        throw new IllegalArgumentException(Nk.a.b("Unsupported MIME type: ", str));
    }

    @Override // k4.o.a
    public final boolean e(C7272n c7272n) {
        String str = c7272n.f69127o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }
}
