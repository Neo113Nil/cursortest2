package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f91009b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f91010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a contentView) {
        super(contentView, -1, -1);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f91010a = m.f91008b;
        setOutsideTouchable(true);
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ru.ozon.android.messenger.framework.presentation.common.popupmenu.l
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                n.a(n.this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static void a(n nVar) {
        f91009b = null;
        nVar.f91010a.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f91010a = (AbstractC7737t) function0;
    }

    public final void e(@NotNull View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        showAtLocation(parentView, 17, 0, 0);
    }
}
