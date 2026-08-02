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
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l6.InterfaceC7882e;
import p6.k;
import ru.ozon.app.android.R;

@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends AbstractC8088a<Z> {

    /* renamed from: a, reason: collision with root package name */
    protected final ImageView f74471a;

    /* renamed from: b, reason: collision with root package name */
    private final a f74472b;

    static final class a {

        /* renamed from: d, reason: collision with root package name */
        static Integer f74473d;

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f74474a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f74475b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC1258a f74476c;

        /* renamed from: m6.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC1258a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f74477a;

            ViewTreeObserverOnPreDrawListenerC1258a(@NonNull a aVar) {
                this.f74477a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f74477a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(@NonNull ImageView imageView) {
            this.f74474a = imageView;
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
            ImageView imageView = this.f74474a;
            if (imageView.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = imageView.getContext();
            if (f74473d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                k.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f74473d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f74473d.intValue();
        }

        final void a() {
            ArrayList arrayList = this.f74475b;
            if (arrayList.isEmpty()) {
                return;
            }
            ImageView imageView = this.f74474a;
            int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int d11 = d(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
            int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int d12 = d(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
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
            ViewTreeObserver viewTreeObserver = this.f74474a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f74476c);
            }
            this.f74476c = null;
            this.f74475b.clear();
        }

        final void c(@NonNull g gVar) {
            ImageView imageView = this.f74474a;
            int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int d11 = d(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
            int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int d12 = d(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
            if ((d11 > 0 || d11 == Integer.MIN_VALUE) && (d12 > 0 || d12 == Integer.MIN_VALUE)) {
                gVar.c(d11, d12);
                return;
            }
            ArrayList arrayList = this.f74475b;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            if (this.f74476c == null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC1258a viewTreeObserverOnPreDrawListenerC1258a = new ViewTreeObserverOnPreDrawListenerC1258a(this);
                this.f74476c = viewTreeObserverOnPreDrawListenerC1258a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1258a);
            }
        }

        final void e(@NonNull g gVar) {
            this.f74475b.remove(gVar);
        }
    }

    public i(@NonNull ImageView imageView) {
        k.c(imageView, "Argument must not be null");
        this.f74471a = imageView;
        this.f74472b = new a(imageView);
    }

    @NonNull
    public final T a() {
        return this.f74471a;
    }

    @Override // m6.h
    public final InterfaceC7882e getRequest() {
        Object tag = this.f74471a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC7882e) {
            return (InterfaceC7882e) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // m6.h
    public final void getSize(@NonNull g gVar) {
        this.f74472b.c(gVar);
    }

    @Override // m6.h
    public void onLoadCleared(Drawable drawable) {
        this.f74472b.b();
    }

    @Override // m6.h
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // m6.h
    public final void removeCallback(@NonNull g gVar) {
        this.f74472b.e(gVar);
    }

    @Override // m6.h
    public final void setRequest(InterfaceC7882e interfaceC7882e) {
        this.f74471a.setTag(R.id.glide_custom_view_target_tag, interfaceC7882e);
    }

    public final String toString() {
        return "Target for: " + this.f74471a;
    }
}
