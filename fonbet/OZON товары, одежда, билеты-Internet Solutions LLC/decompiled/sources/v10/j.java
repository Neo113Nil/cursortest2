package v10;

import Sc.InterfaceC3999a;
import Sc.r;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.t;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function1<Bitmap, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C10737n f101675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10737n c10737n) {
            super(1);
            this.f101675b = c10737n;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C10737n c10737n = this.f101675b;
            if (c10737n.isActive()) {
                r.Companion companion = r.INSTANCE;
                c10737n.resumeWith(bitmap2);
            }
            return Unit.f71690a;
        }
    }

    @InterfaceC3999a
    public static final void a(@NotNull androidx.recyclerview.widget.g gVar, @NotNull t container, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Window activityWindow = container.g().getWindow();
        Intrinsics.checkNotNullExpressionValue(activityWindow, "getWindow(...)");
        ComponentCallbacksC5392m fragment = container.h();
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(activityWindow, "activityWindow");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b(gVar, activityWindow, fragment, new i(callback));
    }

    private static final void b(View view, Window window, ComponentCallbacksC5392m componentCallbacksC5392m, final Function1<? super Bitmap, Unit> function1) {
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            function1.invoke(null);
            return;
        }
        Window d11 = d(componentCallbacksC5392m, window);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        try {
            int i11 = 0;
            int i12 = iArr[0];
            int i13 = i12 < 0 ? 0 : i12;
            int i14 = iArr[1];
            if (i14 >= 0) {
                i11 = i14;
            }
            Rect rect = new Rect(i13, i11, i12 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
            if (rect.bottom > 0 && rect.right > 0) {
                final Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                PixelCopy.request(d11, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener(function1, createBitmap) { // from class: v10.h

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ AbstractC7737t f101672a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Bitmap f101673b;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f101672a = (AbstractC7737t) function1;
                        this.f101673b = createBitmap;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i15) {
                        ?? r02 = this.f101672a;
                        if (i15 == 0) {
                            r02.invoke(this.f101673b);
                        } else {
                            r02.invoke(null);
                        }
                    }
                }, new Handler(Looper.getMainLooper()));
                return;
            }
            function1.invoke(null);
        } catch (IllegalArgumentException e11) {
            H00.c.a(e11);
            function1.invoke(null);
        }
    }

    @InterfaceC3999a
    public static final Object c(@NotNull View view, @NotNull Window window, @NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull kotlin.coroutines.d<? super Bitmap> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        b(view, window, componentCallbacksC5392m, new a(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    private static final Window d(ComponentCallbacksC5392m componentCallbacksC5392m, Window window) {
        Window window2;
        if (componentCallbacksC5392m instanceof DialogInterfaceOnCancelListenerC5390k) {
            Dialog dialog = ((DialogInterfaceOnCancelListenerC5390k) componentCallbacksC5392m).getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                return window2;
            }
        } else {
            ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m.getParentFragment();
            if (parentFragment != null) {
                return d(parentFragment, window);
            }
        }
        return window;
    }
}
