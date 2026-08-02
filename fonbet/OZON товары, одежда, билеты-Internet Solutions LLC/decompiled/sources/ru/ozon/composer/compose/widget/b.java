package ru.ozon.composer.compose.widget;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.n1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.AbstractC5228a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/composer/compose/widget/b;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Content", "(LS0/k;I)V", "", "isAttachedToWindow", "()Z", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "b", "(Lkotlin/jvm/functions/Function2;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "getShouldCreateCompositionOnAttachedToWindow", "a", "()V", "shouldCreateCompositionOnAttachedToWindow", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC5228a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f94609c = 8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f94610a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected static /* synthetic */ void a() {
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    public void Content(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1478412010);
        Function2 function2 = (Function2) this.f94610a.getValue();
        if (function2 != null) {
            function2.invoke(interfaceC3967k, 0);
        }
        interfaceC3967k.k();
    }

    public final void b(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f94610a.setValue(content);
        if (super.isAttachedToWindow()) {
            createComposition();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // androidx.compose.ui.platform.AbstractC5228a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (super.isAttachedToWindow()) {
            return true;
        }
        View view = this;
        while (view.getParent() instanceof View) {
            Object parent = view.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            view = (View) parent;
            if (view.isAttachedToWindow()) {
                return true;
            }
        }
        return super.isAttachedToWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C3991w0 f7;
        Intrinsics.checkNotNullParameter(context, "context");
        f7 = n1.f(null, D1.f25195a);
        this.f94610a = f7;
    }
}
