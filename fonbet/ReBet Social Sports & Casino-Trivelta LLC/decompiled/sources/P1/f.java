package P1;

import P1.c;
import b1.C2338G;
import com.google.common.collect.AbstractC3445z;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e1.AbstractC4156x;
import e1.a0;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public abstract class f {
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (C2338G | NumberFormatException | XmlPullParserException unused) {
            AbstractC4156x.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static c b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!a0.f(newPullParser, "x:xmpmeta")) {
            throw C2338G.a("Couldn't find xmp metadata", null);
        }
        AbstractC3445z t10 = AbstractC3445z.t();
        long j10 = -9223372036854775807L;
        do {
            newPullParser.next();
            if (a0.f(newPullParser, "rdf:Description")) {
                if (!d(newPullParser)) {
                    return null;
                }
                j10 = e(newPullParser);
                t10 = c(newPullParser);
            } else if (a0.f(newPullParser, "Container:Directory")) {
                t10 = f(newPullParser, "Container", "Item");
            } else if (a0.f(newPullParser, "GContainer:Directory")) {
                t10 = f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!a0.d(newPullParser, "x:xmpmeta"));
        if (t10.isEmpty()) {
            return null;
        }
        return new c(j10, t10);
    }

    public static AbstractC3445z c(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String a10 = a0.a(xmlPullParser, str);
            if (a10 != null) {
                return AbstractC3445z.v(new c.a(ClipboardModule.MIMETYPE_JPEG, "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return AbstractC3445z.t();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String a10 = a0.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String a10 = a0.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static AbstractC3445z f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC3445z.a k10 = AbstractC3445z.k();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (a0.f(xmlPullParser, str3)) {
                String a10 = a0.a(xmlPullParser, str2 + ":Mime");
                String a11 = a0.a(xmlPullParser, str2 + ":Semantic");
                String a12 = a0.a(xmlPullParser, str2 + ":Length");
                String a13 = a0.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return AbstractC3445z.t();
                }
                k10.a(new c.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
            }
        } while (!a0.d(xmlPullParser, str4));
        return k10.m();
    }
}
