package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import xsna.ca30;
import xsna.ea30;
import xsna.fb30;
import xsna.guo;
import xsna.he6;
import xsna.kdy;
import xsna.m1u0;
import xsna.n2l;
import xsna.nt8;
import xsna.zcy;

/* compiled from: ViewTransition.java */
/* loaded from: classes11.dex */
public final class d {
    public int a;
    public int e;
    public final kdy f;
    public final b.a g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* compiled from: ViewTransition.java */
    public static class a {
        public final int a;
        public final int b;
        public final ea30 c;
        public final int d;
        public final e f;
        public final Interpolator g;
        public float i;
        public float j;
        public final boolean m;
        public final nt8 e = new nt8(8);
        public boolean h = false;
        public final Rect l = new Rect();
        public long k = System.nanoTime();

        public a(e eVar, ea30 ea30Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.m = false;
            this.f = eVar;
            this.c = ea30Var;
            this.d = i2;
            if (eVar.e == null) {
                eVar.e = new ArrayList<>();
            }
            eVar.e.add(this);
            this.g = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.m = true;
            }
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        public final void a() {
            boolean z = this.h;
            int i = this.b;
            int i2 = this.a;
            Interpolator interpolator = this.g;
            e eVar = this.f;
            ea30 ea30Var = this.c;
            if (!z) {
                long nanoTime = System.nanoTime();
                long j = nanoTime - this.k;
                this.k = nanoTime;
                float f = (((float) (j * 1.0E-6d)) * this.j) + this.i;
                this.i = f;
                if (f >= 1.0f) {
                    this.i = 1.0f;
                }
                boolean d = ea30Var.d(interpolator == null ? this.i : interpolator.getInterpolation(this.i), nanoTime, ea30Var.b, this.e);
                if (this.i >= 1.0f) {
                    if (i2 != -1) {
                        ea30Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        ea30Var.b.setTag(i, null);
                    }
                    if (!this.m) {
                        eVar.f.add(this);
                    }
                }
                if (this.i < 1.0f || d) {
                    eVar.a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            long j2 = nanoTime2 - this.k;
            this.k = nanoTime2;
            float f2 = this.i - (((float) (j2 * 1.0E-6d)) * this.j);
            this.i = f2;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f3 = this.i;
            if (interpolator != null) {
                f3 = interpolator.getInterpolation(f3);
            }
            boolean d2 = ea30Var.d(f3, nanoTime2, ea30Var.b, this.e);
            if (this.i <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (i2 != -1) {
                    ea30Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    ea30Var.b.setTag(i, null);
                }
                eVar.f.add(this);
            }
            if (this.i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d2) {
                eVar.a.invalidate();
            }
        }

        public final void b() {
            this.h = true;
            int i = this.d;
            if (i != -1) {
                this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f.a.invalidate();
            this.k = System.nanoTime();
        }
    }

    public d(Context context, XmlResourceParser xmlResourceParser) {
        char c;
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        d(context, xmlResourceParser);
                    } else if (c == 1) {
                        this.f = new kdy(context, xmlResourceParser);
                    } else if (c == 2) {
                        this.g = androidx.constraintlayout.widget.b.d(context, xmlResourceParser);
                    } else if (c == 3 || c == 4) {
                        ConstraintAttribute.d(context, xmlResourceParser, this.g.g);
                    } else {
                        Log.e("ViewTransition", n2l.a() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(e eVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.b bVar, View... viewArr) {
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        kdy kdyVar = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            ea30 ea30Var = new ea30(view);
            fb30 fb30Var = ea30Var.f;
            fb30Var.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            fb30Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ea30Var.H = true;
            fb30Var.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            ea30Var.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            ca30 ca30Var = ea30Var.h;
            ca30Var.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            ca30Var.b(view);
            ca30 ca30Var2 = ea30Var.i;
            ca30Var2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            ca30Var2.b(view);
            ArrayList<zcy> arrayList = kdyVar.a.get(-1);
            if (arrayList != null) {
                ea30Var.w.addAll(arrayList);
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            System.nanoTime();
            ea30Var.g(width, height);
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 == -2) {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            } else {
                if (i7 == -1) {
                    interpolator = new m1u0(guo.c(this.m));
                    new a(eVar, ea30Var, i4, i5, i6, interpolator, this.p, this.q);
                    return;
                }
                loadInterpolator = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? null : new AnticipateInterpolator() : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
            }
            interpolator = loadInterpolator;
            new a(eVar, ea30Var, i4, i5, i6, interpolator, this.p, this.q);
            return;
        }
        b.a aVar = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    androidx.constraintlayout.widget.b Z4 = motionLayout.Z4(i9);
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        b.a v = Z4.v(viewArr[i10].getId());
                        if (aVar != null) {
                            b.a.C0020a c0020a = aVar.h;
                            if (c0020a != null) {
                                c0020a.e(v);
                            }
                            v.g.putAll(aVar.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.j(bVar);
        for (View view2 : viewArr) {
            b.a v2 = bVar2.v(view2.getId());
            if (aVar != null) {
                b.a.C0020a c0020a2 = aVar.h;
                if (c0020a2 != null) {
                    c0020a2.e(v2);
                }
                v2.g.putAll(aVar.g);
            }
        }
        motionLayout.l5(i, bVar2);
        motionLayout.l5(R.id.view_transition, bVar);
        motionLayout.g5(R.id.view_transition);
        a.b bVar3 = new a.b(-1, motionLayout.t, R.id.view_transition, i);
        for (View view3 : viewArr) {
            int i11 = this.h;
            if (i11 != -1) {
                bVar3.b(i11);
            }
            bVar3.p = this.d;
            bVar3.c(this.l, this.n, this.m);
            int id = view3.getId();
            if (kdyVar != null) {
                ArrayList<zcy> arrayList2 = kdyVar.a.get(-1);
                kdy kdyVar2 = new kdy();
                Iterator<zcy> it = arrayList2.iterator();
                while (it.hasNext()) {
                    zcy clone = it.next().clone();
                    clone.b = id;
                    kdyVar2.b(clone);
                }
                bVar3.a(kdyVar2);
            }
        }
        motionLayout.setTransition(bVar3);
        he6 he6Var = new he6(6, this, viewArr);
        motionLayout.Q4(1.0f);
        motionLayout.x0 = he6Var;
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.z);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                if (MotionLayout.H0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf(DomExceptionUtils.SEPARATOR) <= 0) {
                        this.l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + n2l.c(this.a, this.o) + ")";
    }
}
