package ru.ozon.fintech.permissions.ui;

import B90.p0;
import Dc0.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o90.C8669a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.bottom.FintechBottomSheetView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import u90.C9987a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/permissions/ui/PermissionsScreenStateView;", "Lru/ozon/fintech/ui/bottom/FintechBottomSheetView;", "fintech-permissions_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PermissionsScreenStateView extends FintechBottomSheetView {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f96633c = 0;

    /* renamed from: a, reason: collision with root package name */
    private C9987a f96634a;

    /* renamed from: b, reason: collision with root package name */
    private C8669a f96635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsScreenStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        FrameLayout bottomSheetContainer = getBottomSheetContainer();
        if (bottomSheetContainer != null) {
            this.f96635b = C8669a.a(from, bottomSheetContainer);
        }
        setClickable(true);
        setFocusable(true);
    }

    public final void c(@NotNull C9987a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f96634a = state;
        C8669a c8669a = this.f96635b;
        if (c8669a != null) {
            c8669a.f77836d.setImageResource(state.b());
        }
        if (c8669a != null) {
            c8669a.f77835c.setVisibility(state.e() != null ? 0 : 8);
        }
        if (c8669a != null) {
            c8669a.f77834b.setVisibility(state.c() != null ? 0 : 8);
        }
        if (c8669a != null) {
            c8669a.f77838f.setText(state.f());
        }
        if (c8669a != null) {
            c8669a.f77837e.setText(state.a());
        }
        FinLargeButtonState e11 = state.e();
        if (e11 != null && c8669a != null) {
            c8669a.f77835c.bindState(e11);
        }
        FinLargeButtonState c11 = state.c();
        if (c11 != null && c8669a != null) {
            c8669a.f77834b.bindState(c11);
        }
        if (c8669a != null) {
            c8669a.f77834b.setOnClickListener(new j(this, 13));
        }
        post(new p0(this, 4));
    }

    @Override // ru.ozon.fintech.ui.bottom.FintechBottomSheetView
    public final void onBottomSheetClosed() {
        Function0<Unit> d11;
        C9987a c9987a = this.f96634a;
        if (c9987a == null || (d11 = c9987a.d()) == null) {
            return;
        }
        d11.invoke();
    }
}
