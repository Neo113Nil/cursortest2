package defpackage;

import android.view.View;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a2m implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ BlazeBaseWidget b;
    public final /* synthetic */ Function0 c;

    public a2m(View view, BlazeBaseWidget blazeBaseWidget, Function0 function0) {
        this.a = view;
        this.b = blazeBaseWidget;
        this.c = function0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        if (this.b.viewModel == null) {
            throw BlazeException.WidgetNotInitializedException.INSTANCE;
        }
        this.c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
