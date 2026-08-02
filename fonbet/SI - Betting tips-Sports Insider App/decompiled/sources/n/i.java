package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.widget.c4;
import androidx.appcompat.widget.z1;
import io.sentry.android.core.w0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f20802e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f20803f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f20804a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f20805b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20806c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20807d;

    static {
        Class[] clsArr = {Context.class};
        f20802e = clsArr;
        f20803f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f20806c = context;
        Object[] objArr = {context};
        this.f20804a = objArr;
        this.f20805b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i5;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i5 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z7 = false;
        String str = null;
        while (!z5) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i5) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z7 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z7 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i5 = 2;
                        z5 = z5;
                        z7 = z7;
                    } else if (name2.equals("group")) {
                        hVar.f20779b = 0;
                        hVar.f20780c = 0;
                        hVar.f20781d = 0;
                        hVar.f20782e = 0;
                        hVar.f20783f = true;
                        hVar.f20784g = true;
                    } else if (name2.equals("item")) {
                        if (!hVar.f20785h) {
                            q qVar = hVar.f20801z;
                            if (qVar == null || !qVar.f542b.hasSubMenu()) {
                                hVar.f20785h = true;
                                hVar.b(hVar.f20778a.add(hVar.f20779b, hVar.f20786i, hVar.j, hVar.f20787k));
                            } else {
                                hVar.f20785h = true;
                                hVar.b(hVar.f20778a.addSubMenu(hVar.f20779b, hVar.f20786i, hVar.j, hVar.f20787k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z5 = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            } else {
                if (!z7) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.f20806c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.q);
                        hVar.f20779b = obtainStyledAttributes.getResourceId(1, 0);
                        hVar.f20780c = obtainStyledAttributes.getInt(3, 0);
                        hVar.f20781d = obtainStyledAttributes.getInt(4, 0);
                        hVar.f20782e = obtainStyledAttributes.getInt(5, 0);
                        hVar.f20783f = obtainStyledAttributes.getBoolean(2, true);
                        hVar.f20784g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            c4 e7 = c4.e(context, attributeSet, i.a.f10845r);
                            TypedArray typedArray = e7.f722b;
                            hVar.f20786i = typedArray.getResourceId(2, 0);
                            hVar.j = (typedArray.getInt(5, hVar.f20780c) & (-65536)) | (typedArray.getInt(6, hVar.f20781d) & 65535);
                            hVar.f20787k = typedArray.getText(7);
                            hVar.f20788l = typedArray.getText(8);
                            hVar.f20789m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            hVar.f20790n = string == null ? (char) 0 : string.charAt(0);
                            hVar.f20791o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            hVar.f20792p = string2 == null ? (char) 0 : string2.charAt(0);
                            hVar.q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                hVar.f20793r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                hVar.f20793r = hVar.f20782e;
                            }
                            hVar.f20794s = typedArray.getBoolean(3, false);
                            hVar.f20795t = typedArray.getBoolean(4, hVar.f20783f);
                            hVar.f20796u = typedArray.getBoolean(1, hVar.f20784g);
                            hVar.f20797v = typedArray.getInt(21, -1);
                            hVar.f20800y = typedArray.getString(12);
                            hVar.f20798w = typedArray.getResourceId(13, 0);
                            hVar.f20799x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z10 = string3 != null;
                            if (z10 && hVar.f20798w == 0 && hVar.f20799x == null) {
                                hVar.f20801z = (q) hVar.a(string3, f20803f, this.f20805b);
                            } else {
                                if (z10) {
                                    w0.m("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                hVar.f20801z = null;
                            }
                            hVar.A = typedArray.getText(17);
                            hVar.B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                hVar.D = z1.c(typedArray.getInt(19, -1), hVar.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                hVar.D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                hVar.C = e7.a(18);
                            } else {
                                hVar.C = colorStateList;
                            }
                            e7.g();
                            hVar.f20785h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            hVar.f20785h = true;
                            SubMenu addSubMenu = hVar.f20778a.addSubMenu(hVar.f20779b, hVar.f20786i, hVar.j, hVar.f20787k);
                            hVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i5 = 2;
                        z5 = z5;
                        z7 = z7;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z5 = z5;
            }
            eventType = xmlPullParser2.next();
            i5 = 2;
            z5 = z5;
            z7 = z7;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i5, Menu menu) {
        if (!(menu instanceof n)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z5 = false;
        try {
            try {
                xmlResourceParser = this.f20806c.getResources().getLayout(i5);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof n) {
                    n nVar = (n) menu;
                    if (nVar.isDispatchingItemsChanged()) {
                        nVar.stopDispatchingItemsChanged();
                        z5 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z5) {
                    ((n) menu).startDispatchingItemsChanged();
                }
                xmlResourceParser.close();
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th2) {
            if (z5) {
                ((n) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
