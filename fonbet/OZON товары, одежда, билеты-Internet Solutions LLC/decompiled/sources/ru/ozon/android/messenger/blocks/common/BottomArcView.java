package ru.ozon.android.messenger.blocks.common;

import B0.C2454a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/common/BottomArcView;", "Landroid/view/View;", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomArcView extends View {

    /* renamed from: d, reason: collision with root package name */
    private static final float f84876d = UiExtKt.toPxF(40);

    /* renamed from: e, reason: collision with root package name */
    private static final float f84877e = UiExtKt.toPxF(10);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private a f84878a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f84879b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Path f84880c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f84881a;

        /* renamed from: b, reason: collision with root package name */
        private final int f84882b;

        /* renamed from: c, reason: collision with root package name */
        private final int f84883c;

        public a(int i11) {
            int px = UiExtKt.toPx(1);
            this.f84881a = true;
            this.f84882b = px;
            this.f84883c = i11;
        }

        public final int a() {
            return this.f84883c;
        }

        public final boolean b() {
            return this.f84881a;
        }

        public final int c() {
            return this.f84882b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84881a == aVar.f84881a && this.f84882b == aVar.f84882b && this.f84883c == aVar.f84883c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84883c) + C2454a.a(this.f84882b, Boolean.hashCode(this.f84881a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(hasBottomCorners=");
            sb2.append(this.f84881a);
            sb2.append(", physicalPartHeight=");
            sb2.append(this.f84882b);
            sb2.append(", backgroundColor=");
            return K00.b.e(this.f84883c, ")", sb2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomArcView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        a aVar = new a(ThemeExtKt.themeColor(context2, R$attr.layerFloor0));
        this.f84878a = aVar;
        Paint paint = new Paint();
        paint.setColor(aVar.a());
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f84879b = paint;
        this.f84880c = new Path();
        setClickable(false);
        setFocusable(false);
        setClipToOutline(false);
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.f84880c;
        Paint paint = this.f84879b;
        canvas.drawPath(path, paint);
        if (this.f84878a.c() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), r0.c() + 0.0f, paint);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        a aVar = this.f84878a;
        int c11 = aVar.c();
        if (aVar.b()) {
            c11 += (int) f84876d;
        }
        setMeasuredDimension(i11, View.MeasureSpec.makeMeasureSpec(c11, 1073741824));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (i11 == i13 && i12 == i14) {
            return;
        }
        float f7 = i11;
        Path path = this.f84880c;
        path.reset();
        float c11 = this.f84878a.c();
        float f11 = f84876d;
        float f12 = f84877e;
        path.moveTo(f11 - f12, c11);
        float f13 = i12 - f12;
        path.quadTo(0.0f, c11, 0.0f, f13);
        path.lineTo(0.0f, c11);
        path.close();
        path.moveTo((f7 - f11) + f12, c11);
        path.quadTo(f7, c11, f7, f13);
        path.lineTo(f7, c11);
        path.close();
    }
}
