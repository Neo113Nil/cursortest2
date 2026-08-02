package v50;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import v50.j;

/* loaded from: classes3.dex */
public final class o extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int f102389e = C.D.c(16.0f);

    /* renamed from: f, reason: collision with root package name */
    private static final int f102390f = C.D.c(13.0f);

    /* renamed from: g, reason: collision with root package name */
    private static final int f102391g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f102392h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f102393i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextView f102394a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f102395b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ImageView f102396c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f102397d;

    static {
        C.D.c(12.0f);
        f102391g = C.D.c(6.0f);
        f102392h = C.D.c(2.0f);
        f102393i = C.D.c(172.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.snackbar_content, this);
        setOrientation(0);
        setGravity(16);
        setPadding(C.D.c(16.0f), C.D.c(16.0f), C.D.c(16.0f), C.D.c(16.0f));
        this.f102394a = (TextView) findViewById(R.id.snackbar_content_message);
        this.f102395b = (ImageView) findViewById(R.id.snackbar_content_icon_left);
        this.f102396c = (ImageView) findViewById(R.id.snackbar_content_icon_right);
        this.f102397d = (TextView) findViewById(R.id.snackbar_content_action);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(@NotNull j.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f102394a.setText((CharSequence) null);
        this.f102395b.setVisibility(8);
        this.f102396c.setVisibility(8);
        this.f102397d.setTextColor(androidx.core.content.a.getColor(getContext(), R.color.oz_accent_primary));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        super.onMeasure(i11, i12);
        if (getOrientation() == 1) {
            return;
        }
        TextView textView = this.f102394a;
        int lineCount = textView.getLayout().getLineCount();
        TextView textView2 = this.f102397d;
        if (lineCount > 4 || textView2.getMeasuredWidth() > f102393i) {
            setOrientation(1);
            setGravity(8388611);
            boolean z11 = textView2.getVisibility() == 0;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            textView.setLayoutParams(layoutParams);
            int i14 = f102389e;
            H30.z.f(-i14, textView2);
            int i15 = f102390f;
            if (z11) {
                textView.setPaddingRelative(0, 0, 0, f102392h);
                i13 = f102391g;
            } else {
                i13 = i15;
            }
            setPaddingRelative(i14, i15, i14, i13);
            super.onMeasure(i11, i12);
        }
    }
}
