package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f739c;

    public e1(TextView textView, Typeface typeface, int i5) {
        this.f737a = textView;
        this.f738b = typeface;
        this.f739c = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f737a.setTypeface(this.f738b, this.f739c);
    }
}
