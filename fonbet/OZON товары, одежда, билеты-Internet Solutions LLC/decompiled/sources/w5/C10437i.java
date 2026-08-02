package w5;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: w5.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10437i extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10439k<View> f103583b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver f103584c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnPreDrawListenerC10438j f103585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10437i(InterfaceC10439k interfaceC10439k, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC10438j viewTreeObserverOnPreDrawListenerC10438j) {
        super(1);
        this.f103583b = interfaceC10439k;
        this.f103584c = viewTreeObserver;
        this.f103585d = viewTreeObserverOnPreDrawListenerC10438j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        ViewTreeObserverOnPreDrawListenerC10438j viewTreeObserverOnPreDrawListenerC10438j = this.f103585d;
        ViewTreeObserver viewTreeObserver = this.f103584c;
        InterfaceC10439k<View> interfaceC10439k = this.f103583b;
        interfaceC10439k.getClass();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10438j);
        } else {
            interfaceC10439k.getView().getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10438j);
        }
        return Unit.f71690a;
    }
}
