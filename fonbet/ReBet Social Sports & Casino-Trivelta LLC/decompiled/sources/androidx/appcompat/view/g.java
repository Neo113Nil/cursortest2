package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.a0;
import androidx.core.view.AbstractC2077b;
import androidx.core.view.B;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.j;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q0.InterfaceMenuC6087a;

/* loaded from: classes.dex */
public class g extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;

    /* renamed from: a, reason: collision with root package name */
    public Context f16558a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16559b;
    final Object[] mActionProviderConstructorArguments;
    final Object[] mActionViewConstructorArguments;

    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f16560a;

        /* renamed from: b, reason: collision with root package name */
        public Method f16561b;

        public a(Object obj, String str) {
            this.f16560a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f16561b = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f16561b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f16561b.invoke(this.f16560a, menuItem)).booleanValue();
                }
                this.f16561b.invoke(this.f16560a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {

        /* renamed from: A, reason: collision with root package name */
        public AbstractC2077b f16562A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f16563B;

        /* renamed from: C, reason: collision with root package name */
        public CharSequence f16564C;

        /* renamed from: D, reason: collision with root package name */
        public ColorStateList f16565D = null;

        /* renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f16566E = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f16568a;

        /* renamed from: b, reason: collision with root package name */
        public int f16569b;

        /* renamed from: c, reason: collision with root package name */
        public int f16570c;

        /* renamed from: d, reason: collision with root package name */
        public int f16571d;

        /* renamed from: e, reason: collision with root package name */
        public int f16572e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16573f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16574g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f16575h;

        /* renamed from: i, reason: collision with root package name */
        public int f16576i;

        /* renamed from: j, reason: collision with root package name */
        public int f16577j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f16578k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f16579l;

        /* renamed from: m, reason: collision with root package name */
        public int f16580m;

        /* renamed from: n, reason: collision with root package name */
        public char f16581n;

        /* renamed from: o, reason: collision with root package name */
        public int f16582o;

        /* renamed from: p, reason: collision with root package name */
        public char f16583p;

        /* renamed from: q, reason: collision with root package name */
        public int f16584q;

        /* renamed from: r, reason: collision with root package name */
        public int f16585r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f16586s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f16587t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f16588u;

        /* renamed from: v, reason: collision with root package name */
        public int f16589v;

        /* renamed from: w, reason: collision with root package name */
        public int f16590w;

        /* renamed from: x, reason: collision with root package name */
        public String f16591x;

        /* renamed from: y, reason: collision with root package name */
        public String f16592y;

        /* renamed from: z, reason: collision with root package name */
        public String f16593z;

        public b(Menu menu) {
            this.f16568a = menu;
            h();
        }

        public void a() {
            this.f16575h = true;
            i(this.f16568a.add(this.f16569b, this.f16576i, this.f16577j, this.f16578k));
        }

        public SubMenu b() {
            this.f16575h = true;
            SubMenu addSubMenu = this.f16568a.addSubMenu(this.f16569b, this.f16576i, this.f16577j, this.f16578k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f16575h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f16558a.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f16558a.obtainStyledAttributes(attributeSet, j.MenuGroup);
            this.f16569b = obtainStyledAttributes.getResourceId(j.f55251V0, 0);
            this.f16570c = obtainStyledAttributes.getInt(j.f55259X0, 0);
            this.f16571d = obtainStyledAttributes.getInt(j.f55263Y0, 0);
            this.f16572e = obtainStyledAttributes.getInt(j.f55267Z0, 0);
            this.f16573f = obtainStyledAttributes.getBoolean(j.f55255W0, true);
            this.f16574g = obtainStyledAttributes.getBoolean(j.f55247U0, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a0 u10 = a0.u(g.this.f16558a, attributeSet, j.MenuItem);
            this.f16576i = u10.n(j.f55282c1, 0);
            this.f16577j = (u10.k(j.f55297f1, this.f16570c) & (-65536)) | (u10.k(j.f55302g1, this.f16571d) & 65535);
            this.f16578k = u10.p(j.f55307h1);
            this.f16579l = u10.p(j.f55312i1);
            this.f16580m = u10.n(j.f55272a1, 0);
            this.f16581n = c(u10.o(j.f55317j1));
            this.f16582o = u10.k(j.f55352q1, 4096);
            this.f16583p = c(u10.o(j.f55322k1));
            this.f16584q = u10.k(j.f55368u1, 4096);
            if (u10.s(j.f55327l1)) {
                this.f16585r = u10.a(j.f55327l1, false) ? 1 : 0;
            } else {
                this.f16585r = this.f16572e;
            }
            this.f16586s = u10.a(j.f55287d1, false);
            this.f16587t = u10.a(j.f55292e1, this.f16573f);
            this.f16588u = u10.a(j.f55277b1, this.f16574g);
            this.f16589v = u10.k(j.f55372v1, -1);
            this.f16593z = u10.o(j.f55332m1);
            this.f16590w = u10.n(j.f55337n1, 0);
            this.f16591x = u10.o(j.f55347p1);
            String o10 = u10.o(j.f55342o1);
            this.f16592y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f16590w == 0 && this.f16591x == null) {
                this.f16562A = (AbstractC2077b) e(o10, g.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, g.this.mActionProviderConstructorArguments);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f16562A = null;
            }
            this.f16563B = u10.p(j.f55356r1);
            this.f16564C = u10.p(j.f55376w1);
            if (u10.s(j.f55364t1)) {
                this.f16566E = I.e(u10.k(j.f55364t1, -1), this.f16566E);
            } else {
                this.f16566E = null;
            }
            if (u10.s(j.f55360s1)) {
                this.f16565D = u10.c(j.f55360s1);
            } else {
                this.f16565D = null;
            }
            u10.x();
            this.f16575h = false;
        }

        public void h() {
            this.f16569b = 0;
            this.f16570c = 0;
            this.f16571d = 0;
            this.f16572e = 0;
            this.f16573f = true;
            this.f16574g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f16586s).setVisible(this.f16587t).setEnabled(this.f16588u).setCheckable(this.f16585r >= 1).setTitleCondensed(this.f16579l).setIcon(this.f16580m);
            int i10 = this.f16589v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f16593z != null) {
                if (g.this.f16558a.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f16593z));
            }
            if (this.f16585r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof r.c) {
                    ((r.c) menuItem).h(true);
                }
            }
            String str = this.f16591x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, g.this.mActionViewConstructorArguments));
                z10 = true;
            }
            int i11 = this.f16590w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC2077b abstractC2077b = this.f16562A;
            if (abstractC2077b != null) {
                B.a(menuItem, abstractC2077b);
            }
            B.c(menuItem, this.f16563B);
            B.g(menuItem, this.f16564C);
            B.b(menuItem, this.f16581n, this.f16582o);
            B.f(menuItem, this.f16583p, this.f16584q);
            PorterDuff.Mode mode = this.f16566E;
            if (mode != null) {
                B.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f16565D;
            if (colorStateList != null) {
                B.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f16558a = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    public final Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f16559b == null) {
            this.f16559b = a(this.f16558a);
        }
        return this.f16559b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals(com.twilio.voice.EventKeys.EVENT_GROUP) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f16562A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals(com.twilio.voice.EventKeys.EVENT_GROUP) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC6087a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f16558a.getResources().getLayout(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
