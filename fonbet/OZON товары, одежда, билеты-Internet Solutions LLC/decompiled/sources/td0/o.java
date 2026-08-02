package td0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes3.dex */
public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ OzonTextInput f99441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f99442b;

    o(OzonTextInput ozonTextInput, h hVar) {
        this.f99441a = ozonTextInput;
        this.f99442b = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        OzonTextInput ozonTextInput = this.f99441a;
        h hVar = this.f99442b;
        ozonTextInput.setTag(ozonTextInput.getId(), null);
        ozonTextInput.getViewTreeObserver().removeOnGlobalFocusChangeListener(hVar);
    }
}
