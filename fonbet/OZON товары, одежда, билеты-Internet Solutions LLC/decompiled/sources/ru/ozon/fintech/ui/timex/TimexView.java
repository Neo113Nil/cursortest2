package ru.ozon.fintech.ui.timex;

import E30.f;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/timex/TimexView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startTime", "", "getStartTime", "()J", "h", "Landroid/os/Handler;", "getH", "()Landroid/os/Handler;", "r", "Ljava/lang/Runnable;", "getR", "()Ljava/lang/Runnable;", "onDetachedFromWindow", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimexView extends AppCompatTextView {

    @NotNull
    private final Handler h;

    @NotNull
    private final Runnable r;
    private final long startTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimexView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final Handler getH() {
        return this.h;
    }

    @NotNull
    public final Runnable getR() {
        return this.r;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.removeCallbacks(this.r);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimexView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TimexView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimexView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startTime = System.currentTimeMillis();
        Handler handler = new Handler(Looper.getMainLooper());
        this.h = handler;
        Runnable runnable = new Runnable() { // from class: ru.ozon.fintech.ui.timex.TimexView$r$1
            @Override // java.lang.Runnable
            public void run() {
                TimexView.this.setText(String.valueOf(System.currentTimeMillis() - TimexView.this.getStartTime()));
                TimexView.this.getH().postDelayed(this, 1L);
            }
        };
        this.r = runnable;
        setPadding(f.i(), f.g(), f.i(), f.g());
        setTextAppearance(R.style.TextStyle_Body_M);
        setBackgroundColor(a.getColor(context, R.color.oz_red));
        setMinWidth(f.b());
        setTextColor(a.getColor(context, R.color.oz_accent_secondary));
        handler.postDelayed(runnable, 1L);
    }
}
