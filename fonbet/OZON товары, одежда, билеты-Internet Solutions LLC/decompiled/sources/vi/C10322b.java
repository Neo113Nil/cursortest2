package vi;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* renamed from: vi.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10322b extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final int f102979d = View.generateViewId();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AppCompatTextView f102980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10322b(@NotNull Context context) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        int i11 = f102979d;
        appCompatTextView.setId(i11);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Head_L);
        appCompatTextView.setTypeface(appCompatTextView.getTypeface(), 1);
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(context, R$color.selector_oz_black_text));
        this.f102980c = appCompatTextView;
        addView(appCompatTextView);
        d dVar = new d();
        dVar.p(this);
        dVar.s(i11, 6, 0, 6);
        dVar.s(i11, 3, 0, 3);
        dVar.s(i11, 4, 0, 4);
        dVar.f(this);
        setPadding(UiExtKt.toPx(16), UiExtKt.toPx(20), UiExtKt.toPx(16), UiExtKt.toPx(8));
    }

    public final void b(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f102980c.setText(title);
    }
}
