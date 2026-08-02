package ze;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.widget.RelativeLayout;
import com.sports.insider.R;
import com.viewer.MultiTouchViewPager;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s7.t;
import ve.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends RelativeLayout implements i, c3.g {

    /* renamed from: a, reason: collision with root package name */
    public final View f25941a;

    /* renamed from: b, reason: collision with root package name */
    public final MultiTouchViewPager f25942b;

    /* renamed from: c, reason: collision with root package name */
    public d f25943c;

    /* renamed from: d, reason: collision with root package name */
    public final f f25944d;

    /* renamed from: e, reason: collision with root package name */
    public final ScaleGestureDetector f25945e;

    /* renamed from: f, reason: collision with root package name */
    public r7.a f25946f;

    /* renamed from: g, reason: collision with root package name */
    public final GestureDetector f25947g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f25948h;

    /* renamed from: i, reason: collision with root package name */
    public final k f25949i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public j f25950k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25951l;

    /* renamed from: m, reason: collision with root package name */
    public i f25952m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25953n;

    /* renamed from: o, reason: collision with root package name */
    public final int f25954o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25955p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        int i5;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25954o = 80;
        this.f25955p = 66;
        this.q = true;
        View.inflate(getContext(), R.layout.image_viewer, this);
        this.f25941a = findViewById(R.id.backgroundView);
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) findViewById(R.id.pager);
        this.f25942b = multiTouchViewPager;
        if (multiTouchViewPager != null) {
            multiTouchViewPager.b(this);
        }
        this.f25948h = (ViewGroup) findViewById(R.id.container);
        View swipeView = findViewById(R.id.dismissView);
        Intrinsics.checkNotNullExpressionValue(swipeView, "findViewById(...)");
        Intrinsics.checkNotNullParameter(swipeView, "swipeView");
        k kVar = new k();
        kVar.f25964a = swipeView;
        kVar.f25965b = this;
        kVar.f25966c = this;
        this.f25949i = kVar;
        ViewGroup viewGroup = this.f25948h;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(kVar);
        }
        this.f25944d = new f(this, getContext());
        this.f25945e = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
        this.f25947g = new GestureDetector(getContext(), new ve.c(7, this));
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((Activity) context).getWindowManager().getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            i5 = currentWindowMetrics.getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i5 = displayMetrics.heightPixels;
        }
        this.f25953n = i5;
        float f6 = getResources().getDisplayMetrics().density;
        this.f25954o = (int) (80 * f6);
        this.f25955p = (int) (f6 * 66);
    }

    public static final void a(g gVar, MotionEvent motionEvent) {
        View view = gVar.j;
        if (view == null || motionEvent.getY(0) <= gVar.f25955p || motionEvent.getY(0) >= gVar.f25953n - gVar.f25954o) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z5 = view.getVisibility() == 0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", z5 ? 1.0f : 0.0f, z5 ? 0.0f : 1.0f);
        ofFloat.setDuration(ViewConfiguration.getDoubleTapTimeout());
        if (z5) {
            ofFloat.addListener(new androidx.appcompat.widget.d(4, view));
        } else {
            view.setVisibility(0);
        }
        ofFloat.start();
        super.dispatchTouchEvent(motionEvent);
    }

    private final void setStartPosition(int i5) {
        MultiTouchViewPager multiTouchViewPager = this.f25942b;
        if (multiTouchViewPager != null) {
            multiTouchViewPager.setCurrentItem(i5);
        }
    }

    public final void b(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(list, "list");
        d dVar = new d();
        dVar.f25934d = list;
        dVar.f25935e = new HashSet();
        this.f25943c = dVar;
        MultiTouchViewPager multiTouchViewPager = this.f25942b;
        if (multiTouchViewPager != null) {
            multiTouchViewPager.setAdapter(dVar);
        }
        setStartPosition(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        if (r2 != 3) goto L90;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent event) {
        MultiTouchViewPager multiTouchViewPager;
        ViewGroup viewGroup;
        MultiTouchViewPager multiTouchViewPager2;
        ScaleGestureDetector scaleGestureDetector;
        k kVar;
        k kVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            ViewGroup viewGroup2 = this.f25948h;
            if (viewGroup2 != null && (kVar2 = this.f25949i) != null) {
                kVar2.onTouch(viewGroup2, event);
            }
            MultiTouchViewPager multiTouchViewPager3 = this.f25942b;
            if (multiTouchViewPager3 != null) {
                multiTouchViewPager3.dispatchTouchEvent(event);
            }
            View view = this.j;
            if (view != null && view.getVisibility() == 0) {
                View view2 = this.j;
                Intrinsics.checkNotNull(view2);
                view2.dispatchTouchEvent(event);
            }
        }
        if (event.getAction() == 0) {
            this.f25950k = null;
            this.f25951l = false;
            MultiTouchViewPager multiTouchViewPager4 = this.f25942b;
            if (multiTouchViewPager4 != null) {
                multiTouchViewPager4.dispatchTouchEvent(event);
            }
            ViewGroup viewGroup3 = this.f25948h;
            if (viewGroup3 != null && (kVar = this.f25949i) != null) {
                kVar.onTouch(viewGroup3, event);
            }
            View view3 = this.j;
            if (view3 != null && view3.getVisibility() == 0) {
                View view4 = this.j;
                Intrinsics.checkNotNull(view4);
                view4.dispatchTouchEvent(event);
            }
        }
        ScaleGestureDetector scaleGestureDetector2 = this.f25945e;
        if (scaleGestureDetector2 != null) {
            scaleGestureDetector2.onTouchEvent(event);
        }
        GestureDetector gestureDetector = this.f25947g;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(event);
        }
        if (this.f25950k != null || (((scaleGestureDetector = this.f25945e) == null || !scaleGestureDetector.isInProgress()) && event.getPointerCount() <= 1)) {
            d dVar = this.f25943c;
            if (dVar != null) {
                MultiTouchViewPager multiTouchViewPager5 = this.f25942b;
                dVar.e(multiTouchViewPager5 != null ? multiTouchViewPager5.getCurrentItem() : 0);
            }
            f fVar = this.f25944d;
            if (fVar != null) {
                g gVar = fVar.f25940e;
                Intrinsics.checkNotNullParameter(event, "event");
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (!fVar.f25939d) {
                                double x10 = event.getX(0) - fVar.f25937b;
                                double y5 = event.getY(0) - fVar.f25938c;
                                if (((float) (Math.sqrt((y5 * y5) + (x10 * x10)) + 0.0d)) > fVar.f25936a) {
                                    fVar.f25939d = true;
                                    double d10 = 180;
                                    double atan2 = ((((Math.atan2(fVar.f25938c - event.getY(), event.getX() - fVar.f25937b) + 3.141592653589793d) * d10) / 3.141592653589793d) + d10) % 360;
                                    j.f25957a.getClass();
                                    j direction = t.g(atan2, 45.0f, 135.0f) ? j.f25959c : (t.g(atan2, 0.0f, 45.0f) || t.g(atan2, 315.0f, 360.0f)) ? j.f25962f : t.g(atan2, 225.0f, 315.0f) ? j.f25960d : j.f25961e;
                                    Intrinsics.checkNotNullParameter(direction, "direction");
                                    gVar.f25950k = direction;
                                }
                            }
                        }
                    }
                    if (!fVar.f25939d) {
                        j direction2 = j.f25958b;
                        Intrinsics.checkNotNullParameter(direction2, "direction");
                        gVar.f25950k = direction2;
                    }
                    fVar.f25937b = 0.0f;
                    fVar.f25938c = 0.0f;
                    fVar.f25939d = false;
                } else {
                    fVar.f25937b = event.getX();
                    fVar.f25938c = event.getY();
                }
            }
            j jVar = this.f25950k;
            int i5 = jVar == null ? -1 : e.$EnumSwitchMapping$0[jVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                if (this.q && !this.f25951l && (multiTouchViewPager = this.f25942b) != null && multiTouchViewPager.f8074u0 && (viewGroup = this.f25948h) != null) {
                    k kVar3 = this.f25949i;
                    if (kVar3 != null) {
                        return kVar3.onTouch(viewGroup, event);
                    }
                }
            } else if ((i5 == 3 || i5 == 4) && (multiTouchViewPager2 = this.f25942b) != null) {
                return multiTouchViewPager2.dispatchTouchEvent(event);
            }
            return true;
        }
        this.f25951l = true;
        MultiTouchViewPager multiTouchViewPager6 = this.f25942b;
        if (multiTouchViewPager6 != null) {
            return multiTouchViewPager6.dispatchTouchEvent(event);
        }
        return false;
    }

    @Override // ze.i
    public final void onDismiss() {
        i iVar = this.f25952m;
        if (iVar != null) {
            iVar.onDismiss();
        }
    }

    @Override // c3.g
    public final void onPageSelected(int i5) {
        r7.a aVar = this.f25946f;
        if (aVar != null) {
            ((x) aVar.f22318b).getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        findViewById(R.id.backgroundView).setBackgroundColor(i5);
    }

    public final void setOnDismissListener(@NotNull i onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        this.f25952m = onDismissListener;
    }

    public final void setOverlayView(@Nullable View view) {
        ViewGroup viewGroup;
        this.j = view;
        if (view == null || (viewGroup = this.f25948h) == null) {
            return;
        }
        viewGroup.addView(view);
    }

    public final void setParams(@NotNull a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        params.getClass();
        setBackgroundColor(-16777216);
        setOverlayView(params.f25924c);
        b(params.f25922a);
        this.q = true;
        this.f25946f = params.f25923b;
    }

    public final void setPosition(int i5) {
        MultiTouchViewPager multiTouchViewPager = this.f25942b;
        if (multiTouchViewPager != null) {
            multiTouchViewPager.setCurrentItem(i5);
        }
    }

    @Override // c3.g
    public final void onPageScrollStateChanged(int i5) {
    }

    @Override // c3.g
    public final void onPageScrolled(int i5, float f6, int i10) {
    }
}
