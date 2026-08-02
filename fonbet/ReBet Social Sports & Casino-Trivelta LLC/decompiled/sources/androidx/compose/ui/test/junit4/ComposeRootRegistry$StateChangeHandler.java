package androidx.compose.ui.test.junit4;

import W9.d;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.X;
import com.bumptech.glide.gifdecoder.e;
import com.google.crypto.tink.integration.android.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/compose/ui/test/junit4/ComposeRootRegistry$StateChangeHandler", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/p;", "", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", e.f29601m, "()V", b.f37029b, d.f13160a, "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "removeObserver", "ui-test-junit4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ComposeRootRegistry$StateChangeHandler implements View.OnAttachStateChangeListener, InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Function0 removeObserver;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC2185j f17707d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ComposeRootRegistry$StateChangeHandler f17708e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2185j abstractC2185j, ComposeRootRegistry$StateChangeHandler composeRootRegistry$StateChangeHandler) {
            super(0);
            this.f17707d = abstractC2185j;
            this.f17708e = composeRootRegistry$StateChangeHandler;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m49invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m49invoke() {
            this.f17707d.d(this.f17708e);
        }
    }

    public static final void c(ComposeRootRegistry$StateChangeHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d();
    }

    public final void b() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            d();
        } else {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: androidx.compose.ui.test.junit4.a
                @Override // java.lang.Runnable
                public final void run() {
                    ComposeRootRegistry$StateChangeHandler.c(ComposeRootRegistry$StateChangeHandler.this);
                }
            });
        }
    }

    public final void d() {
        Function0 function0 = this.removeObserver;
        if (function0 != null) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            this.removeObserver = null;
        }
    }

    public final void e() {
        throw null;
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC2185j.a.ON_RESUME) {
            throw null;
        }
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        AbstractC2185j lifecycle;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC2193s a10 = X.a(view);
        if (a10 == null || (lifecycle = a10.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
        this.removeObserver = new a(lifecycle, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        e();
    }
}
