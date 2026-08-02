package androidx.constraintlayout.core.widgets.analyzer;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static int f17852g;

    /* renamed from: b, reason: collision with root package name */
    public int f17854b;

    /* renamed from: d, reason: collision with root package name */
    public int f17856d;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f17853a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17855c = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f17857e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f17858f = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f17859a;

        /* renamed from: b, reason: collision with root package name */
        public int f17860b;

        /* renamed from: c, reason: collision with root package name */
        public int f17861c;

        /* renamed from: d, reason: collision with root package name */
        public int f17862d;

        /* renamed from: e, reason: collision with root package name */
        public int f17863e;

        /* renamed from: f, reason: collision with root package name */
        public int f17864f;

        /* renamed from: g, reason: collision with root package name */
        public int f17865g;

        public a(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.d dVar, int i10) {
            this.f17859a = new WeakReference(eVar);
            this.f17860b = dVar.y(eVar.f17931K);
            this.f17861c = dVar.y(eVar.f17932L);
            this.f17862d = dVar.y(eVar.f17933M);
            this.f17863e = dVar.y(eVar.f17934N);
            this.f17864f = dVar.y(eVar.f17935O);
            this.f17865g = i10;
        }
    }

    public o(int i10) {
        int i11 = f17852g;
        f17852g = i11 + 1;
        this.f17854b = i11;
        this.f17856d = i10;
    }

    public boolean a(androidx.constraintlayout.core.widgets.e eVar) {
        if (this.f17853a.contains(eVar)) {
            return false;
        }
        this.f17853a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f17853a.size();
        if (this.f17858f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f17858f == oVar.f17854b) {
                    g(this.f17856d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f17854b;
    }

    public int d() {
        return this.f17856d;
    }

    public final String e() {
        int i10 = this.f17856d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public int f(androidx.constraintlayout.core.d dVar, int i10) {
        if (this.f17853a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f17853a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f17853a.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) it.next();
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.f17996y0 = oVar.c();
            } else {
                eVar.f17998z0 = oVar.c();
            }
        }
        this.f17858f = oVar.f17854b;
    }

    public void h(boolean z10) {
        this.f17855c = z10;
    }

    public void i(int i10) {
        this.f17856d = i10;
    }

    public final int j(androidx.constraintlayout.core.d dVar, ArrayList arrayList, int i10) {
        int y10;
        int y11;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) ((androidx.constraintlayout.core.widgets.e) arrayList.get(0)).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((androidx.constraintlayout.core.widgets.e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.f18013M0 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f18014N0 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f17857e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f17857e.add(new a((androidx.constraintlayout.core.widgets.e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            y10 = dVar.y(fVar.f17931K);
            y11 = dVar.y(fVar.f17933M);
            dVar.E();
        } else {
            y10 = dVar.y(fVar.f17932L);
            y11 = dVar.y(fVar.f17934N);
            dVar.E();
        }
        return y11 - y10;
    }

    public String toString() {
        String str = e() + " [" + this.f17854b + "] <";
        Iterator it = this.f17853a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((androidx.constraintlayout.core.widgets.e) it.next()).t();
        }
        return str + " >";
    }
}
