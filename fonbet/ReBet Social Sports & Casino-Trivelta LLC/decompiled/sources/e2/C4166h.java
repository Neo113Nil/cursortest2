package e2;

import e2.s;
import g2.C4318a;
import h2.C4431a;
import j2.C5090a;
import java.util.Objects;
import l2.C5395a;
import m2.C5546a;
import n2.C5663a;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4166h implements s.a {
    @Override // e2.s.a
    public boolean a(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // e2.s.a
    public int b(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
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
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // e2.s.a
    public s c(androidx.media3.common.a aVar) {
        String str = aVar.f20543o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C4318a(aVar.f20546r);
                case "application/pgs":
                    return new C4431a();
                case "application/x-mp4-vtt":
                    return new C5663a();
                case "text/vtt":
                    return new n2.g();
                case "application/x-quicktime-tx3g":
                    return new C5395a(aVar.f20546r);
                case "text/x-ssa":
                    return new i2.b(aVar.f20546r);
                case "application/vobsub":
                    return new C5546a(aVar.f20546r);
                case "application/x-subrip":
                    return new C5090a();
                case "application/ttml+xml":
                    return new k2.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
