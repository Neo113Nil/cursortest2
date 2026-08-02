package d20;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import v10.C10183a;

/* renamed from: d20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6064a<I extends l20.c> extends AbstractC6065b<I> {

    @NotNull
    private final LinearLayout parent;

    @NotNull
    private final InterfaceC4008j view$delegate;

    /* renamed from: d20.a$a, reason: collision with other inner class name */
    static final class C0939a extends AbstractC7737t implements Function0<View> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6068e<LinearLayout> f61089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6064a<I> f61090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0939a(InterfaceC6068e<LinearLayout> interfaceC6068e, AbstractC6064a<I> abstractC6064a) {
            super(0);
            this.f61089b = interfaceC6068e;
            this.f61090c = abstractC6064a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.f61089b.create(((AbstractC6064a) this.f61090c).parent);
        }
    }

    public AbstractC6064a(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.parent = C10183a.c(container.Y());
        this.view$delegate = k.b(new C0939a(viewFactory, this));
    }

    @Override // d20.AbstractC6065b
    public final void addView() {
        this.parent.addView(getView());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public final View getMetricView() {
        return getView();
    }

    @NotNull
    public final View getView() {
        return (View) this.view$delegate.getValue();
    }

    @Override // d20.AbstractC6065b
    public final void removeView() {
        this.parent.removeView(getView());
    }
}
