package defpackage;

import com.ironsource.C4331u;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vkg implements Comparable {
    public final String a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final String f;
    public final String g;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vkg(Node node) {
        float parseFloat;
        String b;
        String b2;
        String b3;
        float parseFloat2;
        String b4;
        String b5;
        String b6;
        String b7;
        this.g = node.getTextContent().trim();
        this.a = elg.b(node, "id");
        elg.b(node, C4331u.g);
        this.b = elg.b(node, "type");
        String b8 = elg.b(node, "bitrate");
        float f = -1.0f;
        if (b8 != null) {
            try {
                parseFloat = Float.parseFloat(b8);
            } catch (NumberFormatException unused) {
            }
            this.c = parseFloat;
            b = elg.b(node, "minBitrate");
            if (b != null) {
                try {
                    Float.parseFloat(b);
                } catch (NumberFormatException unused2) {
                }
            }
            b2 = elg.b(node, "maxBitrate");
            if (b2 != null) {
                try {
                    Float.parseFloat(b2);
                } catch (NumberFormatException unused3) {
                }
            }
            b3 = elg.b(node, "width");
            if (b3 != null) {
                try {
                    parseFloat2 = Float.parseFloat(b3);
                } catch (NumberFormatException unused4) {
                }
                this.d = parseFloat2;
                b4 = elg.b(node, "height");
                if (b4 != null) {
                    try {
                        f = Float.parseFloat(b4);
                    } catch (NumberFormatException unused5) {
                    }
                }
                this.e = f;
                b5 = elg.b(node, "fileSize");
                if (b5 != null) {
                    try {
                        Float.parseFloat(b5);
                    } catch (NumberFormatException unused6) {
                    }
                }
                b6 = elg.b(node, "scalable");
                if (b6 != null) {
                    try {
                        Boolean.parseBoolean(b6);
                    } catch (NumberFormatException unused7) {
                    }
                }
                b7 = elg.b(node, "maintainAspectRatio");
                if (b7 != null) {
                    try {
                        Boolean.parseBoolean(b7);
                    } catch (NumberFormatException unused8) {
                    }
                }
                elg.b(node, "codec");
                this.f = elg.b(node, "apiFramework");
            }
            parseFloat2 = -1.0f;
            this.d = parseFloat2;
            b4 = elg.b(node, "height");
            if (b4 != null) {
            }
            this.e = f;
            b5 = elg.b(node, "fileSize");
            if (b5 != null) {
            }
            b6 = elg.b(node, "scalable");
            if (b6 != null) {
            }
            b7 = elg.b(node, "maintainAspectRatio");
            if (b7 != null) {
            }
            elg.b(node, "codec");
            this.f = elg.b(node, "apiFramework");
        }
        parseFloat = -1.0f;
        this.c = parseFloat;
        b = elg.b(node, "minBitrate");
        if (b != null) {
        }
        b2 = elg.b(node, "maxBitrate");
        if (b2 != null) {
        }
        b3 = elg.b(node, "width");
        if (b3 != null) {
        }
        parseFloat2 = -1.0f;
        this.d = parseFloat2;
        b4 = elg.b(node, "height");
        if (b4 != null) {
        }
        this.e = f;
        b5 = elg.b(node, "fileSize");
        if (b5 != null) {
        }
        b6 = elg.b(node, "scalable");
        if (b6 != null) {
        }
        b7 = elg.b(node, "maintainAspectRatio");
        if (b7 != null) {
        }
        elg.b(node, "codec");
        this.f = elg.b(node, "apiFramework");
    }

    public final boolean a() {
        String str;
        String str2 = this.g;
        if (str2 == null || str2.length() <= 0 || (str = this.b) == null) {
            return false;
        }
        if (str.equalsIgnoreCase(MimeTypes.VIDEO_MP4) || str.equalsIgnoreCase(MimeTypes.VIDEO_H263) || str.equalsIgnoreCase("video/webm") || str.equalsIgnoreCase("application/vnd.apple.mpegurl") || str.equalsIgnoreCase("application/x-mpegurl") || str.equalsIgnoreCase("video/mpegurl")) {
            return true;
        }
        return (str.equalsIgnoreCase("application/x-javascript") || str.equalsIgnoreCase("application/javascript")) && "VPAID".equals(this.f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.c, ((vkg) obj).c);
    }

    public final String toString() {
        return "Media file id : " + this.a;
    }
}
