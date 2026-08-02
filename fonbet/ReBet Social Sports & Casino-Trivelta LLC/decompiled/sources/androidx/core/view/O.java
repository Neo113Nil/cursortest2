package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    public final d f19171a;

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f19172a;

        public b(View view) {
            this.f19172a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.O.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f19172a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // androidx.core.view.O.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f19172a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    public static class c implements d {
        public c() {
        }

        @Override // androidx.core.view.O.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // androidx.core.view.O.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    public interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f19171a = new b(view);
        } else {
            this.f19171a = new c();
        }
    }

    public static O a(View view) {
        return new O(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f19171a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f19171a.onScrollProgress(i10, i11, i12, i13);
    }
}
