package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f23701a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f23702b;

    public abstract void a(ViewGroup viewGroup, int i10, Object obj);

    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public CharSequence f(int i10) {
        return null;
    }

    public float g(int i10) {
        return 1.0f;
    }

    public abstract Object h(ViewGroup viewGroup, int i10);

    public abstract boolean i(View view, Object obj);

    public void j() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f23702b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f23701a.notifyChanged();
    }

    public void k(DataSetObserver dataSetObserver) {
        this.f23701a.registerObserver(dataSetObserver);
    }

    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable m() {
        return null;
    }

    public abstract void n(ViewGroup viewGroup, int i10, Object obj);

    public void o(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f23702b = dataSetObserver;
        }
    }

    public void p(View view) {
    }

    public void q(ViewGroup viewGroup) {
        p(viewGroup);
    }

    public void r(DataSetObserver dataSetObserver) {
        this.f23701a.unregisterObserver(dataSetObserver);
    }
}
