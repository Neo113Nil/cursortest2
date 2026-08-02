package xi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: xi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6830c {

    /* renamed from: a, reason: collision with root package name */
    public static Dialog f68170a;

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f68171b;

    /* renamed from: xi.c$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f68172a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f68173b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f68174c;

        public a(Activity activity, int i10, boolean z10) {
            this.f68172a = activity;
            this.f68173b = i10;
            this.f68174c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f68172a.isFinishing()) {
                return;
            }
            AbstractC6830c.f68170a = new Dialog(this.f68172a, this.f68173b);
            AbstractC6830c.f68170a.setContentView(AbstractC6828a.f68167a);
            AbstractC6830c.f68170a.setCancelable(false);
            if (this.f68174c) {
                AbstractC6830c.e(AbstractC6830c.f68170a);
            }
            if (AbstractC6830c.f68170a.isShowing()) {
                return;
            }
            AbstractC6830c.f68170a.show();
        }
    }

    /* renamed from: xi.c$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f68175a;

        public b(Activity activity) {
            this.f68175a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC6830c.f68170a == null || !AbstractC6830c.f68170a.isShowing()) {
                return;
            }
            boolean isDestroyed = this.f68175a.isDestroyed();
            if (!this.f68175a.isFinishing() && !isDestroyed) {
                AbstractC6830c.f68170a.dismiss();
            }
            AbstractC6830c.f68170a = null;
        }
    }

    public static void d(Activity activity) {
        if (activity == null) {
            WeakReference weakReference = f68171b;
            if (weakReference == null) {
                return;
            } else {
                activity = (Activity) weakReference.get();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new b(activity));
    }

    public static void e(Dialog dialog) {
        if (Build.VERSION.SDK_INT < 28 || dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().addFlags(512);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        dialog.getWindow().setAttributes(attributes);
    }

    public static void f(Activity activity) {
        h(activity, false);
    }

    public static void g(Activity activity, int i10, boolean z10) {
        if (activity == null) {
            return;
        }
        f68171b = new WeakReference(activity);
        activity.runOnUiThread(new a(activity, i10, z10));
    }

    public static void h(Activity activity, boolean z10) {
        g(activity, z10 ? AbstractC6829b.f68168a : AbstractC6829b.f68169b, z10);
    }
}
