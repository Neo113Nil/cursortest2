package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {
        private final d[] mEntries;

        public c(d[] dVarArr) {
            this.mEntries = dVarArr;
        }

        public d[] a() {
            return this.mEntries;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f19020a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19021b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19022c;

        /* renamed from: d, reason: collision with root package name */
        public final String f19023d;

        /* renamed from: e, reason: collision with root package name */
        public final int f19024e;

        /* renamed from: f, reason: collision with root package name */
        public final int f19025f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f19020a = str;
            this.f19021b = i10;
            this.f19022c = z10;
            this.f19023d = str2;
            this.f19024e = i11;
            this.f19025f = i12;
        }

        public String a() {
            return this.f19020a;
        }

        public int b() {
            return this.f19025f;
        }

        public int c() {
            return this.f19024e;
        }

        public String d() {
            return this.f19023d;
        }

        public int e() {
            return this.f19021b;
        }

        public boolean f() {
            return this.f19022c;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final List f19026a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19027b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19028c;

        /* renamed from: d, reason: collision with root package name */
        public final String f19029d;

        public e(List list, int i10, int i11, String str) {
            this.f19026a = list;
            this.f19028c = i10;
            this.f19027b = i11;
            this.f19029d = str;
        }

        public int a() {
            return this.f19028c;
        }

        public List b() {
            return this.f19026a;
        }

        public String c() {
            return this.f19029d;
        }

        public int d() {
            return this.f19027b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static v0.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k0.d.FontFamilyProviderFallback);
        try {
            String string = obtainAttributes.getString(k0.d.f54094x);
            String string2 = obtainAttributes.getString(k0.d.f54095y);
            String string3 = obtainAttributes.getString(k0.d.f54096z);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            v0.e eVar = new v0.e(str, str2, string, list, string2, string3);
            androidx.core.content.res.e.a(obtainAttributes);
            return eVar;
        } catch (Throwable th2) {
            if (obtainAttributes == null) {
                throw th2;
            }
            try {
                androidx.core.content.res.e.a(obtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    public static b f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k0.d.FontFamily);
        String string = obtainAttributes.getString(k0.d.f54076f);
        String string2 = obtainAttributes.getString(k0.d.f54081k);
        String string3 = obtainAttributes.getString(k0.d.f54082l);
        String string4 = obtainAttributes.getString(k0.d.f54078h);
        int resourceId = obtainAttributes.getResourceId(k0.d.f54077g, 0);
        int integer = obtainAttributes.getInteger(k0.d.f54079i, 1);
        int integer2 = obtainAttributes.getInteger(k0.d.f54080j, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
        String string5 = obtainAttributes.getString(k0.d.f54083m);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List c10 = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, c10));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new v0.e(string, string2, string3, c10, null, null));
        if (string4 != null) {
            arrayList2.add(new v0.e(string, string2, string4, c10, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    public static d g(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k0.d.FontFamilyFont);
        int i10 = obtainAttributes.getInt(obtainAttributes.hasValue(k0.d.f54092v) ? k0.d.f54092v : k0.d.f54085o, 400);
        boolean z10 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(k0.d.f54090t) ? k0.d.f54090t : k0.d.f54086p, 0);
        int i11 = obtainAttributes.hasValue(k0.d.f54093w) ? k0.d.f54093w : k0.d.f54087q;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(k0.d.f54091u) ? k0.d.f54091u : k0.d.f54088r);
        int i12 = obtainAttributes.getInt(i11, 0);
        int i13 = obtainAttributes.hasValue(k0.d.f54089s) ? k0.d.f54089s : k0.d.f54084n;
        int resourceId = obtainAttributes.getResourceId(i13, 0);
        String string2 = obtainAttributes.getString(i13);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    public static void h(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
