package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18233a;

    /* renamed from: b, reason: collision with root package name */
    public int f18234b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f18235c = -1;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f18236d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f18237e = new SparseArray();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f18238a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f18239b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f18240c;

        /* renamed from: d, reason: collision with root package name */
        public d f18241d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f18240c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18552Z5) {
                    this.f18238a = obtainStyledAttributes.getResourceId(index, this.f18238a);
                } else if (index == g.f18560a6) {
                    this.f18240c = obtainStyledAttributes.getResourceId(index, this.f18240c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18240c);
                    context.getResources().getResourceName(this.f18240c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f18241d = dVar;
                        dVar.e(context, this.f18240c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f18239b.add(bVar);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f18242a;

        /* renamed from: b, reason: collision with root package name */
        public float f18243b;

        /* renamed from: c, reason: collision with root package name */
        public float f18244c;

        /* renamed from: d, reason: collision with root package name */
        public float f18245d;

        /* renamed from: e, reason: collision with root package name */
        public int f18246e;

        /* renamed from: f, reason: collision with root package name */
        public d f18247f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f18242a = Float.NaN;
            this.f18243b = Float.NaN;
            this.f18244c = Float.NaN;
            this.f18245d = Float.NaN;
            this.f18246e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18664n6) {
                    this.f18246e = obtainStyledAttributes.getResourceId(index, this.f18246e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f18246e);
                    context.getResources().getResourceName(this.f18246e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f18247f = dVar;
                        dVar.e(context, this.f18246e);
                    }
                } else if (index == g.f18672o6) {
                    this.f18245d = obtainStyledAttributes.getDimension(index, this.f18245d);
                } else if (index == g.f18680p6) {
                    this.f18243b = obtainStyledAttributes.getDimension(index, this.f18243b);
                } else if (index == g.f18688q6) {
                    this.f18244c = obtainStyledAttributes.getDimension(index, this.f18244c);
                } else if (index == g.f18696r6) {
                    this.f18242a = obtainStyledAttributes.getDimension(index, this.f18242a);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f18233a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f18236d.put(aVar2.f18238a, aVar2);
                                aVar = aVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && StackTraceHelper.ID_KEY.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), StackTraceHelper.ID_KEY, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.r(context, xmlPullParser);
                this.f18237e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }
}
