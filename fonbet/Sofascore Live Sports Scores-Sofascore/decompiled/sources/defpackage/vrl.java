package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerProgressBarStyle;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vrl extends ConstraintLayout {
    public final czl a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrl(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_custom_single_progressbar, (ViewGroup) this, false);
        addView(inflate);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) nq8.B(R.id.blaze_linear_progressbar, inflate);
        if (linearProgressIndicator != null) {
            this.a = new czl((ConstraintLayout) inflate, linearProgressIndicator);
        } else {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.blaze_linear_progressbar)));
            throw null;
        }
    }

    public final void f(long j, long j2) {
        czl czlVar = this.a;
        if (j2 > 0) {
            czlVar.b.setMax((int) j2);
        }
        czlVar.b.c((int) j);
    }

    public final int getProgress() {
        return this.a.b.getProgress();
    }

    public final void setProgressBarColors(@Nullable BlazeStoryPlayerProgressBarStyle blazeStoryPlayerProgressBarStyle) {
        LinearProgressIndicator linearProgressIndicator = this.a.b;
        linearProgressIndicator.setIndicatorColor(blazeStoryPlayerProgressBarStyle != null ? blazeStoryPlayerProgressBarStyle.getProgressColor() : -1);
        tam tamVar = tam.a;
        Integer valueOf = Integer.valueOf(blazeStoryPlayerProgressBarStyle != null ? blazeStoryPlayerProgressBarStyle.getBackgroundColor() : -7829368);
        Context context = linearProgressIndicator.getContext();
        context.getClass();
        context.getClass();
        linearProgressIndicator.setBackground(tam.drawBorderShape$default(tamVar, valueOf, 0, context.getResources().getDisplayMetrics().density * 16.0f, 0, 8, null));
        Context context2 = linearProgressIndicator.getContext();
        context2.getClass();
        context2.getClass();
        linearProgressIndicator.setTrackCornerRadius(wzb.b(context2.getResources().getDisplayMetrics().density * 16.0f));
        Context context3 = linearProgressIndicator.getContext();
        context3.getClass();
        context3.getClass();
        linearProgressIndicator.setTrackThickness(wzb.b(context3.getResources().getDisplayMetrics().density * 4.0f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vrl(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ vrl(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vrl(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
