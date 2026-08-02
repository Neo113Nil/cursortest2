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

/* renamed from: d20.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6067d<I extends l20.c> extends AbstractC6065b<I> {

    @NotNull
    private final LinearLayout parent;

    @NotNull
    private final InterfaceC4008j view$delegate;

    /* renamed from: d20.d$a */
    static final class a extends AbstractC7737t implements Function0<View> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6068e<LinearLayout> f61092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6067d<I> f61093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6068e<LinearLayout> interfaceC6068e, AbstractC6067d<I> abstractC6067d) {
            super(0);
            this.f61092b = interfaceC6068e;
            this.f61093c = abstractC6067d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.f61092b.create(((AbstractC6067d) this.f61093c).parent);
        }
    }

    public AbstractC6067d(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.parent = C10183a.o(container.Y());
        this.view$delegate = k.b(new a(viewFactory, this));
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
