package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: MenuPresenter.java */
/* loaded from: classes.dex */
public interface j {

    /* compiled from: MenuPresenter.java */
    /* loaded from: classes11.dex */
    public interface a {
        void a(@NonNull f fVar, boolean z);

        boolean b(@NonNull f fVar);
    }

    void a(f fVar, boolean z);

    Parcelable b();

    void c(boolean z);

    boolean d(h hVar);

    boolean e(m mVar);

    boolean f(h hVar);

    boolean g();

    int getId();

    void h(Context context, f fVar);

    void i(a aVar);

    void j(Parcelable parcelable);
}
