package Hc;

import Hc.g;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC2094j0;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4876a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int d(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        public final SvgView b(View view) {
            SvgView svgView;
            if (view instanceof VirtualView) {
                svgView = ((VirtualView) view).getSvgView();
                Intrinsics.checkNotNull(svgView);
            } else {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                svgView = (SvgView) view;
            }
            while (true) {
                ViewParent parent = svgView.getParent();
                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                if (!e(parent)) {
                    return svgView;
                }
                if (svgView.getParent() instanceof VirtualView) {
                    ViewParent parent2 = svgView.getParent();
                    Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type com.horcrux.svg.VirtualView");
                    svgView = ((VirtualView) parent2).getSvgView();
                    Intrinsics.checkNotNull(svgView);
                } else {
                    ViewParent parent3 = svgView.getParent();
                    Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type com.horcrux.svg.SvgView");
                    svgView = (SvgView) parent3;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(View view, float f10, float f11) {
            boolean z10;
            Intrinsics.checkNotNullParameter(view, "view");
            SvgView b10 = b(view);
            view.getLocationOnScreen(new int[]{0, 0});
            b10.getLocationOnScreen(new int[]{0, 0});
            int reactTagForTouch = b10.reactTagForTouch((r2[0] + f10) - r3[0], (r2[1] + f11) - r3[1]);
            boolean z11 = view.getId() == reactTagForTouch;
            double width = view.getWidth();
            double d10 = f10;
            if (0.0d <= d10 && d10 <= width) {
                double height = view.getHeight();
                double d11 = f11;
                if (0.0d <= d11 && d11 <= height) {
                    z10 = true;
                    if (view instanceof SvgView) {
                        return z11 && z10;
                    }
                    return (z11 || SequencesKt.contains(SequencesKt.map(AbstractC2094j0.a((ViewGroup) view), new Function1() { // from class: Hc.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int d12;
                            d12 = g.a.d((View) obj);
                            return Integer.valueOf(d12);
                        }
                    }), Integer.valueOf(reactTagForTouch))) && z10;
                }
            }
            z10 = false;
            if (view instanceof SvgView) {
            }
        }

        public final boolean e(Object view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (view instanceof VirtualView) || (view instanceof SvgView);
        }

        public a() {
        }
    }
}
