package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p9d {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public p9d(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedFling(this.c, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(e);
            }
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedPreFling(this.c, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(e);
            }
        }
        return false;
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e;
        int i4;
        int i5;
        if (!this.d || (e = e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null && (iArr = this.e) == null) {
            iArr = new int[2];
            this.e = iArr;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z = e instanceof q9d;
        View view2 = this.c;
        if (z) {
            ((q9d) e).d(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                e.onNestedPreScroll(view2, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.d && (e = e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z = e instanceof r9d;
                View view2 = this.c;
                if (z) {
                    ((r9d) e).g(view2, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (e instanceof q9d) {
                        ((q9d) e).h(view2, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            e.onNestedScroll(view2, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(e);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final void g(boolean z) {
        if (this.d) {
            WeakHashMap weakHashMap = bsk.a;
            this.c.stopNestedScroll();
        }
        this.d = z;
    }

    public final boolean h(int i, int i2) {
        boolean onStartNestedScroll;
        if (!f(i2)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof q9d;
                    if (z) {
                        onStartNestedScroll = ((q9d) parent).i(view2, view, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError unused) {
                                Objects.toString(parent);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i2 == 0) {
                            this.a = parent;
                        } else if (i2 == 1) {
                            this.b = parent;
                        }
                        if (z) {
                            ((q9d) parent).c(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i) {
        ViewParent e = e(i);
        if (e != null) {
            boolean z = e instanceof q9d;
            View view = this.c;
            if (z) {
                ((q9d) e).b(i, view);
            } else if (i == 0) {
                try {
                    e.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(e);
                }
            }
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
