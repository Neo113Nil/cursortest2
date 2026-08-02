package androidx.transition;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.sports.insider.R;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z0 extends a0 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode = 3;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public static void g(l0 l0Var) {
        int visibility = l0Var.f2725b.getVisibility();
        HashMap hashMap = l0Var.f2724a;
        hashMap.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        hashMap.put(PROPNAME_PARENT, l0Var.f2725b.getParent());
        int[] iArr = new int[2];
        l0Var.f2725b.getLocationOnScreen(iArr);
        hashMap.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y0 h(l0 l0Var, l0 l0Var2) {
        y0 y0Var = new y0();
        y0Var.f2771a = false;
        y0Var.f2772b = false;
        if (l0Var != null) {
            HashMap hashMap = l0Var.f2724a;
            if (hashMap.containsKey(PROPNAME_VISIBILITY)) {
                y0Var.f2773c = ((Integer) hashMap.get(PROPNAME_VISIBILITY)).intValue();
                y0Var.f2775e = (ViewGroup) hashMap.get(PROPNAME_PARENT);
                if (l0Var2 != null) {
                    HashMap hashMap2 = l0Var2.f2724a;
                    if (hashMap2.containsKey(PROPNAME_VISIBILITY)) {
                        y0Var.f2774d = ((Integer) hashMap2.get(PROPNAME_VISIBILITY)).intValue();
                        y0Var.f2776f = (ViewGroup) hashMap2.get(PROPNAME_PARENT);
                        if (l0Var == null && l0Var2 != null) {
                            int i5 = y0Var.f2773c;
                            int i10 = y0Var.f2774d;
                            if (i5 != i10 || y0Var.f2775e != y0Var.f2776f) {
                                if (i5 != i10) {
                                    if (i5 == 0) {
                                        y0Var.f2772b = false;
                                        y0Var.f2771a = true;
                                        return y0Var;
                                    }
                                    if (i10 == 0) {
                                        y0Var.f2772b = true;
                                        y0Var.f2771a = true;
                                        return y0Var;
                                    }
                                } else {
                                    if (y0Var.f2776f == null) {
                                        y0Var.f2772b = false;
                                        y0Var.f2771a = true;
                                        return y0Var;
                                    }
                                    if (y0Var.f2775e == null) {
                                        y0Var.f2772b = true;
                                        y0Var.f2771a = true;
                                        return y0Var;
                                    }
                                }
                            }
                        } else {
                            if (l0Var != null && y0Var.f2774d == 0) {
                                y0Var.f2772b = true;
                                y0Var.f2771a = true;
                                return y0Var;
                            }
                            if (l0Var2 == null && y0Var.f2773c == 0) {
                                y0Var.f2772b = false;
                                y0Var.f2771a = true;
                            }
                        }
                        return y0Var;
                    }
                }
                y0Var.f2774d = -1;
                y0Var.f2776f = null;
                if (l0Var == null) {
                }
                if (l0Var != null) {
                }
                if (l0Var2 == null) {
                    y0Var.f2772b = false;
                    y0Var.f2771a = true;
                }
                return y0Var;
            }
        }
        y0Var.f2773c = -1;
        y0Var.f2775e = null;
        if (l0Var2 != null) {
        }
        y0Var.f2774d = -1;
        y0Var.f2776f = null;
        if (l0Var == null) {
        }
        if (l0Var != null) {
        }
        if (l0Var2 == null) {
        }
        return y0Var;
    }

    @Override // androidx.transition.a0
    public void captureEndValues(@NonNull l0 l0Var) {
        g(l0Var);
    }

    @Override // androidx.transition.a0
    public void captureStartValues(@NonNull l0 l0Var) {
        g(l0Var);
    }

    @Override // androidx.transition.a0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        y0 h10 = h(l0Var, l0Var2);
        if (!h10.f2771a) {
            return null;
        }
        if (h10.f2775e == null && h10.f2776f == null) {
            return null;
        }
        return h10.f2772b ? onAppear(viewGroup, l0Var, h10.f2773c, l0Var2, h10.f2774d) : onDisappear(viewGroup, l0Var, h10.f2773c, l0Var2, h10.f2774d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.a0
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.a0
    public boolean isTransitionRequired(l0 l0Var, l0 l0Var2) {
        if (l0Var == null && l0Var2 == null) {
            return false;
        }
        if (l0Var != null && l0Var2 != null && l0Var2.f2724a.containsKey(PROPNAME_VISIBILITY) != l0Var.f2724a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        y0 h10 = h(l0Var, l0Var2);
        if (h10.f2771a) {
            return h10.f2773c == 0 || h10.f2774d == 0;
        }
        return false;
    }

    public boolean isVisible(l0 l0Var) {
        if (l0Var == null) {
            return false;
        }
        HashMap hashMap = l0Var.f2724a;
        return ((Integer) hashMap.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) hashMap.get(PROPNAME_PARENT)) != null;
    }

    public abstract Animator onAppear(ViewGroup viewGroup, View view, l0 l0Var, l0 l0Var2);

    public Animator onAppear(@NonNull ViewGroup viewGroup, l0 l0Var, int i5, l0 l0Var2, int i10) {
        if ((this.mMode & 1) != 1 || l0Var2 == null) {
            return null;
        }
        if (l0Var == null) {
            View view = (View) l0Var2.f2725b.getParent();
            if (h(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f2771a) {
                return null;
            }
        }
        return onAppear(viewGroup, l0Var2.f2725b, l0Var, l0Var2);
    }

    public abstract Animator onDisappear(ViewGroup viewGroup, View view, l0 l0Var, l0 l0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cc, code lost:
    
        if (r21.mCanRemoveViews != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(@NonNull ViewGroup viewGroup, l0 l0Var, int i5, l0 l0Var2, int i10) {
        View view;
        boolean z5;
        View view2;
        char c2;
        Animator animator;
        int i11;
        View view3;
        ViewGroup viewGroup2;
        boolean z7;
        int i12;
        Bitmap bitmap;
        if ((this.mMode & 2) != 2 || l0Var == null) {
            return null;
        }
        View view4 = l0Var.f2725b;
        View view5 = l0Var2 != null ? l0Var2.f2725b : null;
        View view6 = (View) view4.getTag(R.id.save_overlay_view);
        int i13 = 1;
        if (view6 != null) {
            c2 = 1;
            animator = null;
            view3 = null;
            i11 = 0;
        } else {
            if (view5 == null || view5.getParent() == null) {
                if (view5 != null) {
                    view = null;
                    z5 = false;
                }
                z5 = true;
                view5 = null;
                view = null;
            } else {
                if (i10 == 4 || view4 == view5) {
                    view = view5;
                    view5 = null;
                    z5 = false;
                }
                z5 = true;
                view5 = null;
                view = null;
            }
            if (z5) {
                if (view4.getParent() == null) {
                    view2 = view;
                    c2 = 1;
                    animator = null;
                    i11 = 0;
                } else if (view4.getParent() instanceof View) {
                    View view7 = (View) view4.getParent();
                    if (h(getTransitionValues(view7, true), getMatchedTransitionValues(view7, true)).f2771a) {
                        view2 = view;
                        c2 = 1;
                        animator = null;
                        i11 = 0;
                        int id2 = view7.getId();
                        if (view7.getParent() == null) {
                            if (id2 != -1) {
                                if (viewGroup.findViewById(id2) != null) {
                                }
                            }
                        }
                        view6 = view5;
                        i13 = i11;
                        view3 = view2;
                    } else {
                        boolean z10 = k0.f2718a;
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                        u0 u0Var = p0.f2736a;
                        u0Var.I(view4, matrix);
                        u0Var.J(viewGroup, matrix);
                        animator = null;
                        RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                        matrix.mapRect(rectF);
                        int round = Math.round(rectF.left);
                        int round2 = Math.round(rectF.top);
                        int round3 = Math.round(rectF.right);
                        c2 = 1;
                        int round4 = Math.round(rectF.bottom);
                        i11 = 0;
                        ImageView imageView = new ImageView(view4.getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        boolean isAttachedToWindow = view4.isAttachedToWindow();
                        boolean z11 = viewGroup != null && viewGroup.isAttachedToWindow();
                        if (isAttachedToWindow) {
                            viewGroup2 = null;
                            z7 = isAttachedToWindow;
                            i12 = 0;
                        } else if (z11) {
                            ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                            int indexOfChild = viewGroup3.indexOfChild(view4);
                            viewGroup.getOverlay().add(view4);
                            z7 = isAttachedToWindow;
                            i12 = indexOfChild;
                            viewGroup2 = viewGroup3;
                        } else {
                            bitmap = null;
                            view2 = view;
                            if (bitmap != null) {
                                imageView.setImageBitmap(bitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                            imageView.layout(round, round2, round3, round4);
                            view6 = imageView;
                            i13 = i11;
                            view3 = view2;
                        }
                        view2 = view;
                        int round5 = Math.round(rectF.width());
                        int round6 = Math.round(rectF.height());
                        if (round5 <= 0 || round6 <= 0) {
                            bitmap = null;
                        } else {
                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                            int round7 = Math.round(round5 * min);
                            int round8 = Math.round(round6 * min);
                            matrix.postTranslate(-rectF.left, -rectF.top);
                            matrix.postScale(min, min);
                            if (k0.f2718a) {
                                Picture picture = new Picture();
                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                beginRecording.concat(matrix);
                                view4.draw(beginRecording);
                                picture.endRecording();
                                bitmap = j0.a(picture);
                            } else {
                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmap);
                                canvas.concat(matrix);
                                view4.draw(canvas);
                            }
                        }
                        if (!z7) {
                            viewGroup.getOverlay().remove(view4);
                            viewGroup2.addView(view4, i12);
                        }
                        if (bitmap != null) {
                        }
                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                        imageView.layout(round, round2, round3, round4);
                        view6 = imageView;
                        i13 = i11;
                        view3 = view2;
                    }
                }
                view6 = view4;
                i13 = i11;
                view3 = view2;
            }
            view2 = view;
            c2 = 1;
            animator = null;
            i11 = 0;
            view6 = view5;
            i13 = i11;
            view3 = view2;
        }
        if (view6 == null) {
            if (view3 == null) {
                return animator;
            }
            int visibility = view3.getVisibility();
            p0.b(view3, i11);
            Animator onDisappear = onDisappear(viewGroup, view3, l0Var, l0Var2);
            if (onDisappear == null) {
                p0.b(view3, visibility);
                return onDisappear;
            }
            w0 w0Var = new w0(i10, view3);
            onDisappear.addListener(w0Var);
            getRootTransition().addListener(w0Var);
            return onDisappear;
        }
        if (i13 == 0) {
            int[] iArr = (int[]) l0Var.f2724a.get(PROPNAME_SCREEN_LOCATION);
            int i14 = iArr[i11];
            int i15 = iArr[c2];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view6.offsetLeftAndRight((i14 - iArr2[i11]) - view6.getLeft());
            view6.offsetTopAndBottom((i15 - iArr2[c2]) - view6.getTop());
            viewGroup.getOverlay().add(view6);
        }
        Animator onDisappear2 = onDisappear(viewGroup, view6, l0Var, l0Var2);
        if (i13 == 0) {
            if (onDisappear2 == null) {
                viewGroup.getOverlay().remove(view6);
                return onDisappear2;
            }
            view4.setTag(R.id.save_overlay_view, view6);
            x0 x0Var = new x0(this, viewGroup, view6, view4);
            onDisappear2.addListener(x0Var);
            onDisappear2.addPauseListener(x0Var);
            getRootTransition().addListener(x0Var);
        }
        return onDisappear2;
    }

    public void setMode(int i5) {
        if ((i5 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i5;
    }
}
