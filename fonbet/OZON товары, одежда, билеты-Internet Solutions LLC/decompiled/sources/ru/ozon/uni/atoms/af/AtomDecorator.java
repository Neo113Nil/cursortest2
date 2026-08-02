package ru.ozon.uni.atoms.af;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.CommonAtomDecorator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/CommonAtomDecorator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "toPx", "(I)I", "Landroid/view/ViewGroup$MarginLayoutParams;", "margin", "", "setTop", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", "setBottom", "setLeft", "setRight", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/util/DisplayMetrics;", "dm$delegate", "LSc/j;", "getDm", "()Landroid/util/DisplayMetrics;", "dm", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class AtomDecorator implements CommonAtomDecorator {

    @NotNull
    private final Context context;

    /* renamed from: dm$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dm;

    public AtomDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dm = k.a(n.NONE, new AtomDecorator$dm$2(this));
    }

    private final DisplayMetrics getDm() {
        Object value = this.dm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect rect, int i11, boolean z11) {
        CommonAtomDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
    }

    @NotNull
    protected final Context getContext() {
        return this.context;
    }

    protected final void setBottom(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.bottomMargin = i11;
    }

    protected final void setLeft(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.leftMargin = i11;
    }

    protected final void setRight(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.rightMargin = i11;
    }

    protected final void setTop(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.topMargin = i11;
    }

    protected final int toPx(int i11) {
        return (int) TypedValue.applyDimension(1, i11, getDm());
    }
}
