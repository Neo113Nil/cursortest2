package m6;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l6.InterfaceC7882e;
import p6.k;
import ru.ozon.app.android.R;

/* renamed from: m6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC8091d<T extends View, Z> implements h<Z> {

    /* renamed from: a, reason: collision with root package name */
    private final a f74463a;

    /* renamed from: b, reason: collision with root package name */
    protected final T f74464b;

    /* renamed from: m6.d$a */
    static final class a {

        /* renamed from: d, reason: collision with root package name */
        static Integer f74465d;

        /* renamed from: a, reason: collision with root package name */
        private final View f74466a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f74467b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC1257a f74468c;

        /* renamed from: m6.d$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC1257a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f74469a;

            ViewTreeObserverOnPreDrawListenerC1257a(@NonNull a aVar) {
                this.f74469a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f74469a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(@NonNull View view) {
            this.f74466a = view;
        }

        private int d(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            View view = this.f74466a;
            if (view.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f74465d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                k.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f74465d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f74465d.intValue();
        }

        final void a() {
            ArrayList arrayList = this.f74467b;
            if (arrayList.isEmpty()) {
                return;
            }
            View view = this.f74466a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int d11 = d(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int d12 = d(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
            if (d11 > 0 || d11 == Integer.MIN_VALUE) {
                if (d12 > 0 || d12 == Integer.MIN_VALUE) {
                    Iterator it = new ArrayList(arrayList).iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).c(d11, d12);
                    }
                    b();
                }
            }
        }

        final void b() {
            ViewTreeObserver viewTreeObserver = this.f74466a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f74468c);
            }
            this.f74468c = null;
            this.f74467b.clear();
        }

        final void c(@NonNull g gVar) {
            View view = this.f74466a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int d11 = d(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int d12 = d(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
            if ((d11 > 0 || d11 == Integer.MIN_VALUE) && (d12 > 0 || d12 == Integer.MIN_VALUE)) {
                gVar.c(d11, d12);
                return;
            }
            ArrayList arrayList = this.f74467b;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            if (this.f74468c == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC1257a viewTreeObserverOnPreDrawListenerC1257a = new ViewTreeObserverOnPreDrawListenerC1257a(this);
                this.f74468c = viewTreeObserverOnPreDrawListenerC1257a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1257a);
            }
        }

        final void e(@NonNull g gVar) {
            this.f74467b.remove(gVar);
        }
    }

    public AbstractC8091d(@NonNull T t2) {
        k.c(t2, "Argument must not be null");
        this.f74464b = t2;
        this.f74463a = new a(t2);
    }

    @Override // m6.h
    public final InterfaceC7882e getRequest() {
        Object tag = this.f74464b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC7882e) {
            return (InterfaceC7882e) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // m6.h
    public final void getSize(@NonNull g gVar) {
        this.f74463a.c(gVar);
    }

    @Override // i6.m
    public final void onDestroy() {
    }

    @Override // m6.h
    public final void onLoadCleared(Drawable drawable) {
        this.f74463a.b();
    }

    @Override // m6.h
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // i6.m
    public final void onStart() {
    }

    @Override // i6.m
    public final void onStop() {
    }

    @Override // m6.h
    public final void removeCallback(@NonNull g gVar) {
        this.f74463a.e(gVar);
    }

    @Override // m6.h
    public final void setRequest(InterfaceC7882e interfaceC7882e) {
        this.f74464b.setTag(R.id.glide_custom_view_target_tag, interfaceC7882e);
    }

    public final String toString() {
        return "Target for: " + this.f74464b;
    }
}
