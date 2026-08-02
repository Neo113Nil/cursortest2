package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15948c;

    public /* synthetic */ a0(Object obj, View view, int i5) {
        this.f15946a = i5;
        this.f15948c = obj;
        this.f15947b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f15946a) {
            case 0:
                c0 c0Var = (c0) this.f15948c;
                Point point = c0Var.f15961h;
                WeakReference weakReference = (WeakReference) CollectionsKt.L(c0Var.f15960g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                View view2 = this.f15947b;
                if (!Intrinsics.areEqual(view2, view)) {
                    com.google.firebase.messaging.u.j(view2, this);
                    break;
                } else {
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                        com.google.firebase.messaging.u.j(view2, this);
                        if (view2.getWidth() != point.x && view2.getHeight() != point.y) {
                            point.set(view2.getWidth(), view2.getHeight());
                            c0Var.f15956c.R(view2.getWidth(), view2.getHeight());
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (!((n0.c) ((io.sentry.util.network.b) this.f15948c).f17177c).c()) {
                    this.f15947b.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                if (!((n0.c) ((n0.b) this.f15948c).f17177c).c()) {
                    this.f15947b.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
