package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bwk extends xwj {
    public static final String[] F = {"android:visibility:visibility", "android:visibility:parent"};
    public int E = 3;

    public static void P(oxj oxjVar) {
        View view = oxjVar.b;
        int visibility = view.getVisibility();
        HashMap hashMap = oxjVar.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tyf Q(oxj oxjVar, oxj oxjVar2) {
        tyf tyfVar = new tyf();
        tyfVar.a = false;
        tyfVar.b = false;
        if (oxjVar != null) {
            HashMap hashMap = oxjVar.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                tyfVar.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                tyfVar.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (oxjVar2 != null) {
                    HashMap hashMap2 = oxjVar2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        tyfVar.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        tyfVar.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (oxjVar == null && oxjVar2 != null) {
                            int i = tyfVar.c;
                            int i2 = tyfVar.d;
                            if (i != i2 || ((ViewGroup) tyfVar.e) != ((ViewGroup) tyfVar.f)) {
                                if (i != i2) {
                                    if (i == 0) {
                                        tyfVar.b = false;
                                        tyfVar.a = true;
                                        return tyfVar;
                                    }
                                    if (i2 == 0) {
                                        tyfVar.b = true;
                                        tyfVar.a = true;
                                        return tyfVar;
                                    }
                                } else {
                                    if (((ViewGroup) tyfVar.f) == null) {
                                        tyfVar.b = false;
                                        tyfVar.a = true;
                                        return tyfVar;
                                    }
                                    if (((ViewGroup) tyfVar.e) == null) {
                                        tyfVar.b = true;
                                        tyfVar.a = true;
                                        return tyfVar;
                                    }
                                }
                            }
                        } else {
                            if (oxjVar != null && tyfVar.d == 0) {
                                tyfVar.b = true;
                                tyfVar.a = true;
                                return tyfVar;
                            }
                            if (oxjVar2 == null && tyfVar.c == 0) {
                                tyfVar.b = false;
                                tyfVar.a = true;
                            }
                        }
                        return tyfVar;
                    }
                }
                tyfVar.d = -1;
                tyfVar.f = null;
                if (oxjVar == null) {
                }
                if (oxjVar != null) {
                }
                if (oxjVar2 == null) {
                    tyfVar.b = false;
                    tyfVar.a = true;
                }
                return tyfVar;
            }
        }
        tyfVar.c = -1;
        tyfVar.e = null;
        if (oxjVar2 != null) {
        }
        tyfVar.d = -1;
        tyfVar.f = null;
        if (oxjVar == null) {
        }
        if (oxjVar != null) {
        }
        if (oxjVar2 == null) {
        }
        return tyfVar;
    }

    public abstract Animator R(ViewGroup viewGroup, View view, oxj oxjVar);

    public abstract Animator S(ViewGroup viewGroup, View view, oxj oxjVar, oxj oxjVar2);

    @Override // defpackage.xwj
    public final void d(oxj oxjVar) {
        P(oxjVar);
    }

    @Override // defpackage.xwj
    public void g(oxj oxjVar) {
        P(oxjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (Q(n(r4, false), r(r4, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7  */
    @Override // defpackage.xwj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, oxj oxjVar, oxj oxjVar2) {
        boolean z;
        View view;
        int i;
        char c;
        int i2;
        View view2;
        Animator animator;
        View view3;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        tyf Q = Q(oxjVar, oxjVar2);
        if (Q.a && (((ViewGroup) Q.e) != null || ((ViewGroup) Q.f) != null)) {
            int i4 = 1;
            if (!Q.b) {
                int i5 = Q.d;
                if ((this.E & 2) == 2 && oxjVar != null) {
                    View view4 = oxjVar.b;
                    View view5 = oxjVar2 != null ? oxjVar2.b : null;
                    View view6 = (View) view4.getTag(R.id.save_overlay_view);
                    if (view6 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view3 = null;
                        animator = null;
                    } else {
                        if (view5 == null || view5.getParent() == null) {
                            if (view5 != null) {
                                z = false;
                                view = null;
                                if (z) {
                                    if (view4.getParent() == null) {
                                        i = i5;
                                        c = 1;
                                        i4 = 0;
                                        i2 = 0;
                                        view3 = view;
                                        animator = null;
                                        view6 = view4;
                                    } else if (view4.getParent() instanceof View) {
                                        View view7 = (View) view4.getParent();
                                        if (Q(r(view7, true), n(view7, true)).a) {
                                            i = i5;
                                            c = 1;
                                            i2 = 0;
                                            view2 = view;
                                            animator = null;
                                            int id = view7.getId();
                                            if (view7.getParent() == null && id != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view6 = view5;
                                            i4 = i2;
                                            view3 = view2;
                                        } else {
                                            boolean z3 = nxj.a;
                                            Matrix matrix = new Matrix();
                                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                                            mvk mvkVar = kvk.a;
                                            mvkVar.q0(view4, matrix);
                                            mvkVar.r0(viewGroup, matrix);
                                            animator = null;
                                            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view4.getWidth(), view4.getHeight());
                                            matrix.mapRect(rectF);
                                            int round = Math.round(rectF.left);
                                            int round2 = Math.round(rectF.top);
                                            int round3 = Math.round(rectF.right);
                                            c = 1;
                                            int round4 = Math.round(rectF.bottom);
                                            i2 = 0;
                                            ImageView imageView = new ImageView(view4.getContext());
                                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                            boolean isAttachedToWindow = view4.isAttachedToWindow();
                                            boolean z4 = viewGroup != null && viewGroup.isAttachedToWindow();
                                            if (isAttachedToWindow) {
                                                z2 = isAttachedToWindow;
                                                viewGroup2 = null;
                                                i3 = 0;
                                            } else if (z4) {
                                                viewGroup2 = (ViewGroup) view4.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view4);
                                                bsk.a(viewGroup, view4);
                                                z2 = isAttachedToWindow;
                                                i3 = indexOfChild;
                                            } else {
                                                i = i5;
                                                view2 = view;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view6 = imageView;
                                                i4 = i2;
                                                view3 = view2;
                                            }
                                            view2 = view;
                                            int round5 = Math.round(rectF.width());
                                            i = i5;
                                            int round6 = Math.round(rectF.height());
                                            if (round5 <= 0 || round6 <= 0) {
                                                bitmap = null;
                                            } else {
                                                float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                                int round7 = Math.round(round5 * min);
                                                int round8 = Math.round(round6 * min);
                                                matrix.postTranslate(-rectF.left, -rectF.top);
                                                matrix.postScale(min, min);
                                                if (nxj.a) {
                                                    Picture picture = new Picture();
                                                    Canvas beginRecording = picture.beginRecording(round7, round8);
                                                    beginRecording.concat(matrix);
                                                    view4.draw(beginRecording);
                                                    picture.endRecording();
                                                    bitmap = c90.i(picture);
                                                } else {
                                                    bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                    Canvas canvas = new Canvas(bitmap);
                                                    canvas.concat(matrix);
                                                    view4.draw(canvas);
                                                }
                                            }
                                            if (!z2) {
                                                viewGroup.getOverlay().remove(view4);
                                                viewGroup2.addView(view4, i3);
                                            }
                                            if (bitmap != null) {
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            view6 = imageView;
                                            i4 = i2;
                                            view3 = view2;
                                        }
                                    }
                                }
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view;
                                animator = null;
                                view6 = view5;
                                i4 = i2;
                                view3 = view2;
                            }
                        } else if (i5 == 4 || view4 == view5) {
                            z = false;
                            view = view5;
                            view5 = null;
                            if (z) {
                            }
                            i = i5;
                            c = 1;
                            i2 = 0;
                            view2 = view;
                            animator = null;
                            view6 = view5;
                            i4 = i2;
                            view3 = view2;
                        }
                        z = true;
                        view5 = null;
                        view = null;
                        if (z) {
                        }
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view2 = view;
                        animator = null;
                        view6 = view5;
                        i4 = i2;
                        view3 = view2;
                    }
                    if (view6 == null) {
                        if (view3 == null) {
                            return animator;
                        }
                        int visibility = view3.getVisibility();
                        kvk.b(i2, view3);
                        Animator S = S(viewGroup, view3, oxjVar, oxjVar2);
                        if (S == null) {
                            kvk.b(visibility, view3);
                            return S;
                        }
                        zvk zvkVar = new zvk(i, view3);
                        S.addListener(zvkVar);
                        o().a(zvkVar);
                        return S;
                    }
                    if (i4 == 0) {
                        int[] iArr = (int[]) oxjVar.a.get("android:visibility:screenLocation");
                        int i6 = iArr[i2];
                        int i7 = iArr[c];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view6.offsetLeftAndRight((i6 - iArr2[i2]) - view6.getLeft());
                        view6.offsetTopAndBottom((i7 - iArr2[c]) - view6.getTop());
                        bsk.a(viewGroup, view6);
                    }
                    Animator S2 = S(viewGroup, view6, oxjVar, oxjVar2);
                    if (i4 == 0) {
                        if (S2 == null) {
                            viewGroup.getOverlay().remove(view6);
                            return S2;
                        }
                        view4.setTag(R.id.save_overlay_view, view6);
                        awk awkVar = new awk(this, viewGroup, view6, view4);
                        S2.addListener(awkVar);
                        S2.addPauseListener(awkVar);
                        o().a(awkVar);
                    }
                    return S2;
                }
            } else if ((this.E & 1) == 1 && oxjVar2 != null) {
                View view8 = oxjVar2.b;
                if (oxjVar == null) {
                    View view9 = (View) view8.getParent();
                }
                return R(viewGroup, view8, oxjVar);
            }
        }
        return null;
    }

    @Override // defpackage.xwj
    public final String[] q() {
        return F;
    }

    @Override // defpackage.xwj
    public final boolean u(oxj oxjVar, oxj oxjVar2) {
        if (oxjVar == null && oxjVar2 == null) {
            return false;
        }
        if (oxjVar != null && oxjVar2 != null && oxjVar2.a.containsKey("android:visibility:visibility") != oxjVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        tyf Q = Q(oxjVar, oxjVar2);
        if (Q.a) {
            return Q.c == 0 || Q.d == 0;
        }
        return false;
    }
}
