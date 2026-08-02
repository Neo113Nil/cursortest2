package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.drawable.r;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside;", "Lcom/facebook/drawee/drawable/q;", "<init>", "()V", "Landroid/graphics/Matrix;", "outTransform", "Landroid/graphics/Rect;", "parentRect", "", "childWidth", "childHeight", "", "focusX", "focusY", ViewProps.SCALE_X, ViewProps.SCALE_Y, "", "getTransformImpl", "(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V", "", "toString", "()Ljava/lang/String;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScaleTypeStartInside extends q {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final r INSTANCE = new ScaleTypeStartInside();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside$Companion;", "", "<init>", "()V", "Lcom/facebook/drawee/drawable/r;", "INSTANCE", "Lcom/facebook/drawee/drawable/r;", "getINSTANCE", "()Lcom/facebook/drawee/drawable/r;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final r getINSTANCE() {
            return ScaleTypeStartInside.INSTANCE;
        }

        private Companion() {
        }
    }

    @Override // com.facebook.drawee.drawable.q
    public void getTransformImpl(@NotNull Matrix outTransform, @NotNull Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float coerceAtMost = RangesKt.coerceAtMost(Math.min(scaleX, scaleY), 1.0f);
        float f10 = parentRect.left;
        float f11 = parentRect.top;
        outTransform.setScale(coerceAtMost, coerceAtMost);
        outTransform.postTranslate(Math.round(f10), Math.round(f11));
    }

    @NotNull
    public String toString() {
        return "start_inside";
    }
}
