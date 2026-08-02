package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z4f {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final a5f c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public z4f(Context context, a5f a5fVar) {
        this.a = context;
        this.c = a5fVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        HashMap hashMap = f;
        Constructor<?> constructor = (Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
            preferenceGroup.j(this.c);
            d(xmlResourceParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        long j;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.l = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.a.getResources();
                    Bundle bundle = preference.n;
                    if (bundle == null) {
                        bundle = new Bundle();
                        preference.n = bundle;
                    }
                    resources.parseBundleExtra("extra", attributeSet, bundle);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.O.contains(b)) {
                        if (b.k != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.H;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            preferenceGroup2.z(b.k);
                        }
                        int i = b.f;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.P) {
                                int i2 = preferenceGroup.Q;
                                preferenceGroup.Q = i2 + 1;
                                if (i2 != i) {
                                    b.f = i2;
                                    y4f y4fVar = b.F;
                                    if (y4fVar != null) {
                                        Handler handler = y4fVar.e;
                                        kac kacVar = y4fVar.f;
                                        handler.removeCallbacks(kacVar);
                                        handler.post(kacVar);
                                    }
                                }
                            }
                            if (b instanceof PreferenceGroup) {
                                ((PreferenceGroup) b).P = preferenceGroup.P;
                            }
                        }
                        int binarySearch = Collections.binarySearch(preferenceGroup.O, b);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * (-1)) - 1;
                        }
                        boolean w = preferenceGroup.w();
                        if (b.u == w) {
                            b.u = !w;
                            b.h(b.w());
                            b.g();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.O.add(binarySearch, b);
                        }
                        a5f a5fVar = preferenceGroup.b;
                        String str = b.k;
                        if (str == null || !preferenceGroup.M.containsKey(str)) {
                            synchronized (a5fVar) {
                                j = a5fVar.b;
                                a5fVar.b = 1 + j;
                            }
                        } else {
                            j = ((Long) preferenceGroup.M.get(str)).longValue();
                            preferenceGroup.M.remove(str);
                        }
                        b.c = j;
                        b.d = true;
                        try {
                            b.j(a5fVar);
                            b.d = false;
                            if (b.H != null) {
                                a70.r("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                                return;
                            }
                            b.H = preferenceGroup;
                            if (preferenceGroup.R) {
                                b.i();
                            }
                            y4f y4fVar2 = preferenceGroup.F;
                            if (y4fVar2 != null) {
                                Handler handler2 = y4fVar2.e;
                                kac kacVar2 = y4fVar2.f;
                                handler2.removeCallbacks(kacVar2);
                                handler2.post(kacVar2);
                            }
                        } catch (Throwable th) {
                            b.d = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, b, attributeSet);
                }
            }
        }
    }
}
