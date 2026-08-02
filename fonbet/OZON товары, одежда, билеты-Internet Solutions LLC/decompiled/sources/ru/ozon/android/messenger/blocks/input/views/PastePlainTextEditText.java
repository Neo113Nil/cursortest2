package ru.ozon.android.messenger.blocks.input.views;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.c;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.d;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.e;
import ru.ozon.android.messenger.utils.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/blocks/input/views/PastePlainTextEditText;", "Landroid/widget/EditText;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes10.dex */
public final class PastePlainTextEditText extends EditText {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f85678a;

    /* renamed from: b, reason: collision with root package name */
    private Function0<Boolean> f85679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastePlainTextEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85678a = f.b(new a(this));
    }

    public final void a(Function0<Boolean> function0) {
        this.f85679b = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((b) this.f85678a.getValue()).a(e.f90775a.c(), c.f90773b, d.f90774b);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i11, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f85679b == null) {
            return super.onKeyPreIme(i11, event);
        }
        C5353y0 n11 = Y.n(getRootView());
        Boolean valueOf = n11 != null ? Boolean.valueOf(n11.p(8)) : null;
        if (i11 != 4 || !Intrinsics.d(valueOf, Boolean.TRUE)) {
            return super.onKeyPreIme(i11, event);
        }
        Function0<Boolean> function0 = this.f85679b;
        if (function0 != null ? function0.invoke().booleanValue() : true) {
            return super.onKeyPreIme(i11, event);
        }
        return true;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i11) {
        if (i11 == 16908322) {
            i11 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i11);
    }
}
