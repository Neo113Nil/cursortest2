package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 extends f0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f729d;

    public d1(j1 j1Var, int i5, int i10, WeakReference weakReference) {
        this.f729d = j1Var;
        this.f726a = i5;
        this.f727b = i10;
        this.f728c = weakReference;
    }

    @Override // f0.j
    public final void onFontRetrieved(Typeface typeface) {
        int i5;
        if (Build.VERSION.SDK_INT >= 28 && (i5 = this.f726a) != -1) {
            typeface = i1.a(typeface, i5, (this.f727b & 2) != 0);
        }
        j1 j1Var = this.f729d;
        if (j1Var.f791m) {
            j1Var.f790l = typeface;
            TextView textView = (TextView) this.f728c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new e1(textView, typeface, j1Var.j));
                } else {
                    textView.setTypeface(typeface, j1Var.j);
                }
            }
        }
    }

    @Override // f0.j
    public final void onFontRetrievalFailed(int i5) {
    }
}
