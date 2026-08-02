package u9;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import xg.o;
import xg.p;
import xg.q;
import xg.r;
import xg.s;
import xg.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f24089a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24091c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24092d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final long f24093e;

    /* renamed from: f, reason: collision with root package name */
    public final float f24094f;

    /* renamed from: g, reason: collision with root package name */
    public final float f24095g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f24096h;

    /* renamed from: i, reason: collision with root package name */
    public LinkedList f24097i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f24098k;

    /* renamed from: l, reason: collision with root package name */
    public final com.logrocket.core.graphics.f f24099l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24100m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24101n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedList f24102o;

    /* renamed from: p, reason: collision with root package name */
    public final int f24103p;

    public f(MotionEvent motionEvent, Window window, String str, com.logrocket.core.graphics.f fVar, int i5) {
        int i10;
        float f6;
        float f10;
        View peekDecorView;
        LinkedList linkedList = new LinkedList();
        this.f24096h = linkedList;
        this.f24097i = new LinkedList();
        this.f24098k = "";
        this.f24100m = false;
        this.f24101n = false;
        this.f24102o = new LinkedList();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    i10 = 3;
                } else if (actionMasked != 3) {
                    i10 = 0;
                }
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.f24091c = i10;
        this.f24099l = fVar;
        this.f24103p = i5;
        this.j = str;
        if (window == null || (peekDecorView = window.peekDecorView()) == null) {
            f6 = 0.0f;
            f10 = 0.0f;
        } else {
            int[] iArr = new int[2];
            peekDecorView.getLocationOnScreen(iArr);
            f6 = iArr[0];
            f10 = iArr[1];
            if (i10 == 1) {
                a(motionEvent.getX() + f6, motionEvent.getY() + f10, peekDecorView);
                if (!this.f24100m) {
                    t9.d dVar = (t9.d) this.f24097i.peekFirst();
                    if (dVar != null) {
                        this.f24098k = dVar.f23792d;
                    } else if (!linkedList.isEmpty()) {
                        View view = (View) linkedList.peekFirst();
                        if (view instanceof TextView) {
                            this.f24098k = ((TextView) view).getText().toString();
                        }
                    }
                }
            }
        }
        this.f24094f = f6;
        this.f24095g = f10;
        this.f24089a = motionEvent.getX() + f6;
        this.f24090b = motionEvent.getY() + f10;
        this.f24093e = motionEvent.getEventTime();
        if (i10 == 3) {
            int historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 0; i11 < historySize; i11++) {
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    this.f24092d.add(new e(motionEvent, i12, i11, this.f24094f, this.f24095g));
                }
            }
        }
    }

    public final void a(float f6, float f10, View view) {
        t9.d dVar;
        LinkedList linkedList;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        RectF rectF = new RectF(iArr[0], iArr[1], view.getWidth() + r7, view.getHeight() + iArr[1]);
        if (rectF.contains((int) f6, (int) f10) && view.getVisibility() == 0) {
            boolean z5 = this.f24100m;
            com.logrocket.core.graphics.f fVar = this.f24099l;
            if ((z5 || !this.f24101n) && fVar.e(view)) {
                this.f24100m = false;
                this.f24101n = true;
            }
            if ((!this.f24100m || this.f24101n) && fVar.f(view)) {
                this.f24100m = true;
                this.f24101n = false;
            }
            boolean z7 = this.f24100m;
            LinkedList linkedList2 = this.f24102o;
            if (z7) {
                linkedList2.add(view);
            } else {
                while (true) {
                    boolean isEmpty = linkedList2.isEmpty();
                    linkedList = this.f24096h;
                    if (isEmpty) {
                        break;
                    } else {
                        linkedList.push((View) linkedList2.remove());
                    }
                }
                linkedList.push(view);
            }
            ArrayList arrayList = fVar.f6532a;
            ArrayList arrayList2 = fVar.f6533b;
            ba.d dVar2 = t9.a.f23755a;
            LinkedList linkedList3 = new LinkedList();
            if (t9.b.f23756a == null && view.getClass().equals(t9.b.f23757b)) {
                Float valueOf = Float.valueOf(f6 - rectF.left);
                Float valueOf2 = Float.valueOf(f10 - rectF.top);
                LinkedList linkedList4 = new LinkedList();
                Boolean bool = Boolean.FALSE;
                try {
                    Object obj = t9.b.f23763h.get(view);
                    while (obj != null) {
                        t9.d c2 = t9.b.c(obj, arrayList, arrayList2);
                        if (c2 == null) {
                            dVar2.j("Could not extract LayoutNode descriptor.");
                            obj = t9.a.a(obj, valueOf, valueOf2);
                        } else {
                            if (c2.f23794f) {
                                while (!linkedList4.isEmpty()) {
                                    linkedList3.push((t9.d) linkedList4.remove());
                                }
                                bool = Boolean.TRUE;
                            }
                            if (!c2.f23793e && linkedList4.isEmpty()) {
                                linkedList3.push(c2);
                                obj = t9.a.a(obj, valueOf, valueOf2);
                            }
                            linkedList4.add(c2);
                            bool = Boolean.FALSE;
                            obj = t9.a.a(obj, valueOf, valueOf2);
                        }
                    }
                    if (!linkedList4.isEmpty()) {
                        t9.d dVar3 = new t9.d("redacted");
                        dVar3.f23793e = true;
                        dVar3.f23794f = false;
                        dVar3.f23792d = "";
                        linkedList3.push(dVar3);
                    } else if (!linkedList3.isEmpty() && bool.booleanValue() && (dVar = (t9.d) linkedList3.peekFirst()) != null && !dVar.f23793e) {
                        dVar.f23794f = true;
                    }
                } catch (Throwable th2) {
                    dVar2.e("Failed to process Jetpack Compose touch path", th2);
                }
            }
            this.f24097i = linkedList3;
            t9.d dVar4 = (t9.d) linkedList3.peekFirst();
            if (dVar4 == null) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                        a(f6, f10, viewGroup.getChildAt(i5));
                    }
                    return;
                }
                return;
            }
            if (dVar4.f23793e) {
                this.f24097i.pop();
                this.f24100m = true;
                this.f24101n = false;
            } else if (dVar4.f23794f) {
                this.f24100m = false;
                this.f24101n = true;
            }
        }
    }

    public final q b() {
        boolean z5;
        int i5 = this.f24091c;
        if (i5 == 0) {
            return null;
        }
        q E = t.E();
        E.d();
        t.r((t) E.f6816b, this.f24089a);
        E.d();
        t.v((t) E.f6816b, this.f24090b);
        E.d();
        t.s((t) E.f6816b, i5);
        double d10 = this.f24093e;
        E.d();
        t.q((t) E.f6816b, d10);
        ArrayList arrayList = this.f24092d;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                eVar.getClass();
                r t3 = s.t();
                int i10 = eVar.f24085a;
                t3.d();
                s.r((s) t3.f6816b, i10);
                float f6 = eVar.f24086b;
                t3.d();
                s.q((s) t3.f6816b, f6);
                float f10 = eVar.f24087c;
                t3.d();
                s.s((s) t3.f6816b, f10);
                double d11 = eVar.f24088d;
                t3.d();
                s.p((s) t3.f6816b, d11);
                s sVar = (s) t3.a();
                E.d();
                t.u((t) E.f6816b, sVar);
            }
        }
        String str = this.j;
        if (!str.isEmpty()) {
            E.d();
            t.t((t) E.f6816b, str);
        }
        boolean isEmpty = this.f24098k.isEmpty();
        int i11 = this.f24103p;
        if (isEmpty) {
            z5 = false;
        } else {
            if (i11 == 2 || (i11 == 1 && this.f24101n)) {
                E.d();
                t.w((t) E.f6816b, this.f24098k);
            }
            z5 = true;
        }
        LinkedList linkedList = this.f24096h;
        if (!linkedList.isEmpty() && (!z5 || i11 != 1 || this.f24101n)) {
            LinkedList<t9.d> linkedList2 = this.f24097i;
            ArrayList arrayList2 = new ArrayList();
            for (t9.d dVar : linkedList2) {
                o w10 = p.w();
                String str2 = dVar.f6582a;
                w10.d();
                p.r((p) w10.f6816b, str2);
                String str3 = dVar.f6583b;
                if (!str3.isEmpty()) {
                    w10.d();
                    p.p((p) w10.f6816b, str3);
                }
                if (!dVar.f6584c.isEmpty()) {
                    String str4 = dVar.f6584c;
                    w10.d();
                    p.q((p) w10.f6816b, str4);
                }
                arrayList2.add((p) w10.a());
            }
            arrayList2.addAll(io.sentry.config.a.j(linkedList));
            E.d();
            t.x((t) E.f6816b, arrayList2);
        }
        return E;
    }
}
