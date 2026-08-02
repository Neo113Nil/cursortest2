package androidx.appcompat.widget;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements androidx.core.view.h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f676a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f677b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f678c;

    public a(MessageDigest messageDigest, int i5) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f678c = messageDigest;
        this.f676a = i5;
    }

    @Override // androidx.core.view.h1
    public void a() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f677b = false;
    }

    @Override // androidx.core.view.h1
    public void onAnimationCancel() {
        this.f677b = true;
    }

    @Override // androidx.core.view.h1
    public void onAnimationEnd() {
        if (this.f677b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f678c;
        actionBarContextView.f576f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f676a);
    }

    public a(int i5, ArrayList arrayList, boolean z5) {
        this.f676a = i5;
        this.f678c = arrayList;
        this.f677b = z5;
    }

    public a(int i5) {
        this(i5, new ArrayList(), false);
    }

    public a(ActionBarContextView actionBarContextView) {
        this.f678c = actionBarContextView;
        this.f677b = false;
    }
}
