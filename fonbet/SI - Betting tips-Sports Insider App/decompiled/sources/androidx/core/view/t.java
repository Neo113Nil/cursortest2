package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1392a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1393b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f1394c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1395d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1396e;

    public t(ViewGroup viewGroup) {
        this.f1394c = viewGroup;
    }

    public final boolean a(float f6, float f10, boolean z5) {
        ViewParent e7;
        if (this.f1395d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedFling(this.f1394c, f6, f10, z5);
            } catch (AbstractMethodError e9) {
                io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedFling", e9);
            }
        }
        return false;
    }

    public final boolean b(float f6, float f10) {
        ViewParent e7;
        if (this.f1395d && (e7 = e(0)) != null) {
            try {
                return e7.onNestedPreFling(this.f1394c, f6, f10);
            } catch (AbstractMethodError e9) {
                io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreFling", e9);
            }
        }
        return false;
    }

    public final boolean c(int i5, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent e7;
        int i12;
        int i13;
        if (!this.f1395d || (e7 = e(i11)) == null) {
            return false;
        }
        if (i5 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f1394c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f1396e == null) {
                this.f1396e = new int[2];
            }
            iArr = this.f1396e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e7 instanceof u) {
            ((u) e7).onNestedPreScroll(viewGroup, i5, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e7.onNestedPreScroll(viewGroup, i5, i10, iArr3);
            } catch (AbstractMethodError e9) {
                io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedPreScroll", e9);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i5, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e7;
        int i14;
        int i15;
        int[] iArr3;
        if (this.f1395d && (e7 = e(i13)) != null) {
            if (i5 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.f1394c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1396e == null) {
                        this.f1396e = new int[2];
                    }
                    int[] iArr4 = this.f1396e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e7 instanceof v) {
                    ((v) e7).onNestedScroll(viewGroup, i5, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (e7 instanceof u) {
                        ((u) e7).onNestedScroll(viewGroup, i5, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            e7.onNestedScroll(viewGroup, i5, i10, i11, i12);
                        } catch (AbstractMethodError e9) {
                            io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onNestedScroll", e9);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
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

    public final ViewParent e(int i5) {
        if (i5 == 0) {
            return this.f1392a;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f1393b;
    }

    public final boolean f(int i5) {
        return e(i5) != null;
    }

    public final boolean g(int i5, int i10) {
        boolean onStartNestedScroll;
        if (!f(i10)) {
            if (this.f1395d) {
                View view = this.f1394c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z5 = parent instanceof u;
                    if (z5) {
                        onStartNestedScroll = ((u) parent).onStartNestedScroll(view2, view, i5, i10);
                    } else {
                        if (i10 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i5);
                            } catch (AbstractMethodError e7) {
                                io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i10 == 0) {
                            this.f1392a = parent;
                        } else if (i10 == 1) {
                            this.f1393b = parent;
                        }
                        if (z5) {
                            ((u) parent).onNestedScrollAccepted(view2, view, i5, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i5);
                            } catch (AbstractMethodError e9) {
                                io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
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

    public final void h(int i5) {
        ViewParent e7 = e(i5);
        if (e7 != null) {
            boolean z5 = e7 instanceof u;
            ViewGroup viewGroup = this.f1394c;
            if (z5) {
                ((u) e7).onStopNestedScroll(viewGroup, i5);
            } else if (i5 == 0) {
                try {
                    e7.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e9) {
                    io.sentry.android.core.w0.e("ViewParentCompat", "ViewParent " + e7 + " does not implement interface method onStopNestedScroll", e9);
                }
            }
            if (i5 == 0) {
                this.f1392a = null;
            } else {
                if (i5 != 1) {
                    return;
                }
                this.f1393b = null;
            }
        }
    }
}
