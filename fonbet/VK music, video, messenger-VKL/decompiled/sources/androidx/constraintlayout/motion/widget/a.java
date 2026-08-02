package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ea30;
import xsna.guo;
import xsna.i5s;
import xsna.kdy;
import xsna.n1u0;
import xsna.n2l;
import xsna.ruk0;

/* compiled from: MotionScene.java */
/* loaded from: classes11.dex */
public final class a {
    public final MotionLayout a;
    public final ruk0 b;
    public b c;
    public final ArrayList<b> d;
    public final b e;
    public final ArrayList<b> f;
    public final SparseArray<androidx.constraintlayout.widget.b> g;
    public final HashMap<String, Integer> h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public MotionLayout.g o;
    public boolean p;
    public final e q;
    public float r;
    public float s;

    /* compiled from: MotionScene.java */
    /* renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    public class InterpolatorC0018a implements Interpolator {
        public final /* synthetic */ guo a;

        public InterpolatorC0018a(guo guoVar) {
            this.a = guoVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    public a(MotionLayout motionLayout) {
        this.b = null;
        this.c = null;
        this.d = new ArrayList<>();
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new SparseArray<>();
        this.h = new HashMap<>();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        this.q = new e(motionLayout);
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        b bVar;
        if (this.o != null) {
            return false;
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i2 = next.n;
            if (i2 != 0 && ((bVar = this.c) != next || (bVar.r & 2) == 0)) {
                if (i == next.d && (i2 == 4 || i2 == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.j5();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.U4(true);
                    motionLayout.setState(MotionLayout.j.SETUP);
                    motionLayout.setState(MotionLayout.j.MOVING);
                    motionLayout.setState(jVar);
                    motionLayout.c5();
                    return true;
                }
                if (i == next.c && (i2 == 3 || i2 == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.Q4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    motionLayout.U4(true);
                    motionLayout.setState(MotionLayout.j.SETUP);
                    motionLayout.setState(MotionLayout.j.MOVING);
                    motionLayout.setState(jVar2);
                    motionLayout.c5();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.b b(int i) {
        int a;
        ruk0 ruk0Var = this.b;
        if (ruk0Var != null && (a = ruk0Var.a(i)) != -1) {
            i = a;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + n2l.c(i, this.a.getContext()) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int i;
        if (str.contains(DomExceptionUtils.SEPARATOR)) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final Interpolator d() {
        b bVar = this.c;
        int i = bVar.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new InterpolatorC0018a(guo.c(bVar.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(ea30 ea30Var) {
        b bVar = this.c;
        if (bVar != null) {
            Iterator<kdy> it = bVar.k.iterator();
            while (it.hasNext()) {
                it.next().a(ea30Var);
            }
        } else {
            b bVar2 = this.e;
            if (bVar2 != null) {
                Iterator<kdy> it2 = bVar2.k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(ea30Var);
                }
            }
        }
    }

    public final float f() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.c;
        return (bVar2 == null || (bVar = bVar2.l) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : bVar.t;
    }

    public final int g() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public final b h(int i) {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i) {
                return next;
            }
        }
        return null;
    }

    public final ArrayList i(int i) {
        int a;
        ruk0 ruk0Var = this.b;
        if (ruk0Var != null && (a = ruk0Var.a(i)) != -1) {
            i = a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == i || next.c == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int j(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.e = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i2 = c(context, attributeValue);
                    break;
                case true:
                    try {
                        bVar.c = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3317767:
                                if (attributeValue.equals(TtmlNode.LEFT)) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 108511772:
                                if (attributeValue.equals(TtmlNode.RIGHT)) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                bVar.c = 4;
                                break;
                            case true:
                                bVar.c = 2;
                                break;
                            case true:
                                bVar.c = 0;
                                break;
                            case true:
                                bVar.c = 1;
                                break;
                            case true:
                                bVar.c = 3;
                                break;
                        }
                    }
                case true:
                    i = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(i));
                    bVar.a = n2l.c(i, context);
                    break;
            }
        }
        if (i != -1) {
            int i4 = this.a.N;
            bVar.x(context, xmlResourceParser);
            if (i2 != -1) {
                this.i.put(i, i2);
            }
            this.g.put(i, bVar);
        }
        return i;
    }

    public final int k(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.A);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                k(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void n(int i, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.g;
        androidx.constraintlayout.widget.b bVar = sparseArray.get(i);
        String str = bVar.a;
        HashMap<Integer, b.a> hashMap = bVar.f;
        bVar.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            n(i2, motionLayout);
            androidx.constraintlayout.widget.b bVar2 = sparseArray.get(i2);
            if (bVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + n2l.c(i2, this.a.getContext()));
                return;
            }
            HashMap<Integer, b.a> hashMap2 = bVar2.f;
            bVar.b += DomExceptionUtils.SEPARATOR + bVar2.b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                b.a aVar = hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new b.a());
                }
                b.a aVar2 = hashMap.get(num);
                if (aVar2 != null) {
                    b.C0021b c0021b = aVar2.e;
                    if (!c0021b.b) {
                        c0021b.a(aVar.e);
                    }
                    b.d dVar = aVar2.c;
                    if (!dVar.a) {
                        b.d dVar2 = aVar.c;
                        dVar.a = dVar2.a;
                        dVar.b = dVar2.b;
                        dVar.d = dVar2.d;
                        dVar.e = dVar2.e;
                        dVar.c = dVar2.c;
                    }
                    b.e eVar = aVar2.f;
                    if (!eVar.a) {
                        eVar.a(aVar.f);
                    }
                    b.c cVar = aVar2.d;
                    if (!cVar.a) {
                        cVar.a(aVar.d);
                    }
                    for (String str2 : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(str2)) {
                            aVar2.g.put(str2, aVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            bVar.b = i5s.a(new StringBuilder(), bVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.b bVar3 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id = childAt.getId();
                if (bVar.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new b.a());
                }
                b.a aVar3 = hashMap.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    b.d dVar3 = aVar3.c;
                    b.C0021b c0021b2 = aVar3.e;
                    b.e eVar2 = aVar3.f;
                    if (!c0021b2.b) {
                        aVar3.c(id, bVar3);
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            c0021b2.j0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0021b2.o0 = barrier.getAllowsGoneWidget();
                                c0021b2.g0 = barrier.getType();
                                c0021b2.h0 = barrier.getMargin();
                            }
                        }
                        c0021b2.b = true;
                    }
                    if (!dVar3.a) {
                        dVar3.b = childAt.getVisibility();
                        dVar3.d = childAt.getAlpha();
                        dVar3.a = true;
                    }
                    if (!eVar2.a) {
                        eVar2.a = true;
                        eVar2.b = childAt.getRotation();
                        eVar2.c = childAt.getRotationX();
                        eVar2.d = childAt.getRotationY();
                        eVar2.e = childAt.getScaleX();
                        eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != ConnectivityTracker.DEFAULT_UPLINK_BITRATE || pivotY != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        eVar2.j = childAt.getTranslationX();
                        eVar2.k = childAt.getTranslationY();
                        eVar2.l = childAt.getTranslationZ();
                        if (eVar2.m) {
                            eVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (b.a aVar4 : hashMap.values()) {
            if (aVar4.h != null) {
                if (aVar4.b != null) {
                    Iterator<Integer> it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        b.a v = bVar.v(it.next().intValue());
                        String str3 = v.e.l0;
                        if (str3 != null && aVar4.b.matches(str3)) {
                            aVar4.h.e(v);
                            v.g.putAll((HashMap) aVar4.g.clone());
                        }
                    }
                } else {
                    aVar4.h.e(bVar.v(aVar4.a));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i, int i2) {
        int i3;
        int i4;
        ruk0 ruk0Var = this.b;
        if (ruk0Var != null) {
            i3 = ruk0Var.a(i);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = this.b.a(i2);
        } else {
            i3 = i;
        }
        i4 = i2;
        b bVar = this.c;
        if (bVar != null && bVar.c == i2 && bVar.d == i) {
            return;
        }
        ArrayList<b> arrayList = this.d;
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i5 = next.c;
            if ((i5 == i4 && next.d == i3) || (i5 == i2 && next.d == i)) {
                this.c = next;
                androidx.constraintlayout.motion.widget.b bVar2 = next.l;
                if (bVar2 != null) {
                    bVar2.c(this.p);
                    return;
                }
                return;
            }
        }
        Iterator<b> it2 = this.f.iterator();
        b bVar3 = this.e;
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.c == i2) {
                bVar3 = next2;
            }
        }
        b bVar4 = new b(this, bVar3);
        bVar4.d = i3;
        bVar4.c = i4;
        if (i3 != -1) {
            arrayList.add(bVar4);
        }
        this.c = bVar4;
    }

    public final boolean p() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? false : true;
    }

    public a(Context context, MotionLayout motionLayout, int i) {
        int eventType;
        b bVar;
        this.b = null;
        this.c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new SparseArray<>();
        this.h = new HashMap<>();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        this.q = new e(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            bVar = null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        while (true) {
            char c = 1;
            if (eventType != 1) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            m(context, xml);
                            break;
                        case 1:
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.c == null && !bVar.b) {
                                this.c = bVar;
                                androidx.constraintlayout.motion.widget.b bVar2 = bVar.l;
                                if (bVar2 != null) {
                                    bVar2.c(this.p);
                                }
                            }
                            if (!bVar.b) {
                                break;
                            } else {
                                if (bVar.c == -1) {
                                    this.e = bVar;
                                } else {
                                    this.f.add(bVar);
                                }
                                arrayList.remove(bVar);
                                break;
                            }
                        case 2:
                            if (bVar == null) {
                                context.getResources().getResourceEntryName(i);
                                xml.getLineNumber();
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.l = new androidx.constraintlayout.motion.widget.b(context, this.a, xml);
                                break;
                            }
                        case 3:
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.m.add(new b.ViewOnClickListenerC0019a(context, bVar, xml));
                                break;
                            }
                        case 4:
                            this.b = new ruk0(context, xml);
                            break;
                        case 5:
                            j(context, xml);
                            break;
                        case 6:
                        case 7:
                            l(context, xml);
                            break;
                        case '\b':
                            kdy kdyVar = new kdy(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.k.add(kdyVar);
                                break;
                            }
                        case '\t':
                            d dVar = new d(context, xml);
                            e eVar = this.q;
                            eVar.b.add(dVar);
                            eVar.c = null;
                            int i2 = dVar.b;
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    break;
                                } else {
                                    ConstraintLayout.getSharedValues().a(dVar.u, new n1u0());
                                    break;
                                }
                            } else {
                                ConstraintLayout.getSharedValues().a(dVar.u, new n1u0());
                                break;
                            }
                    }
                }
                eventType = xml.next();
            } else {
                this.g.put(R.id.motion_base, new androidx.constraintlayout.widget.b());
                this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        }
    }

    /* compiled from: MotionScene.java */
    public static class b {
        public final int a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public final float i;
        public final a j;
        public final ArrayList<kdy> k;
        public androidx.constraintlayout.motion.widget.b l;
        public final ArrayList<ViewOnClickListenerC0019a> m;
        public final int n;
        public boolean o;
        public int p;
        public int q;
        public final int r;

        /* compiled from: MotionScene.java */
        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0019a implements View.OnClickListener {
            public final b b;
            public final int c;
            public final int d;

            public ViewOnClickListenerC0019a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.c = -1;
                this.d = 17;
                this.b = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.r);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    } else if (index == 0) {
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i, b bVar) {
                int i2 = this.c;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i5 = this.d;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i = this.c;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                b bVar = this.b;
                a aVar = bVar.j;
                MotionLayout motionLayout = aVar.a;
                if (motionLayout.C) {
                    if (bVar.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.k5(bVar.c);
                            return;
                        }
                        b bVar2 = new b(aVar, bVar);
                        bVar2.d = currentState;
                        bVar2.c = bVar.c;
                        motionLayout.setTransition(bVar2);
                        motionLayout.j5();
                        return;
                    }
                    b bVar3 = aVar.c;
                    int i = this.d;
                    int i2 = i & 1;
                    boolean z = false;
                    boolean z2 = true;
                    boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                    int i3 = i & 16;
                    if (i3 == 0 && (i & 4096) == 0) {
                        z2 = false;
                    }
                    if (z3 && z2) {
                        if (bVar3 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z2 = false;
                        }
                        if (bVar != bVar3) {
                            int i4 = bVar.c;
                            int i5 = bVar.d;
                            if (i5 != -1) {
                                int i6 = motionLayout.y;
                                if (i6 != i5 && i6 != i4) {
                                    return;
                                }
                            } else if (motionLayout.y == i4) {
                                return;
                            }
                        }
                        if (!z && i2 != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.j5();
                            return;
                        }
                        if (!z2 && i3 != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.Q4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            return;
                        } else if (!z && (i & 256) != 0) {
                            motionLayout.setTransition(bVar);
                            motionLayout.setProgress(1.0f);
                            return;
                        } else {
                            if (z2 || (i & 4096) == 0) {
                            }
                            motionLayout.setTransition(bVar);
                            motionLayout.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            return;
                        }
                    }
                    z = z3;
                    if (bVar != bVar3) {
                    }
                    if (!z) {
                    }
                    if (!z2) {
                    }
                    if (!z) {
                    }
                    if (z2) {
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = aVar;
            this.h = aVar.j;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public final void a(kdy kdyVar) {
            this.k.add(kdyVar);
        }

        public final void b(int i) {
            this.h = Math.max(i, 8);
        }

        public final void c(int i, int i2, String str) {
            this.e = i;
            this.f = str;
            this.g = i2;
        }

        public b(int i, a aVar, int i2, int i3) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = i;
            this.j = aVar;
            this.d = i2;
            this.c = i3;
            this.h = aVar.j;
            this.q = aVar.k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            int i = aVar.j;
            SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.g;
            this.h = i;
            this.q = aVar.k;
            this.j = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.x);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        bVar.w(this.c, context);
                        sparseArray.append(this.c, bVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = aVar.k(this.c, context);
                    }
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.w(this.d, context);
                        sparseArray.append(this.d, bVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = aVar.k(this.d, context);
                    }
                } else if (index == 6) {
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                                this.g = obtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    int i4 = obtainStyledAttributes.getInt(index, this.h);
                    this.h = i4;
                    if (i4 < 8) {
                        this.h = 8;
                    }
                } else if (index == 8) {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 9) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    this.p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
