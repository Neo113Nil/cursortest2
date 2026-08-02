package ru.ozon.fintech.preferences.ui.themeV2;

import K90.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v90.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/preferences/ui/themeV2/FintechThemeRadioGroupV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechThemeRadioGroupV2View extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f97019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FintechThemeRadioGroupV2View(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        g a11 = g.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.f97019c = a11;
    }

    public final void b(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g gVar = this.f97019c;
        gVar.f102655b.bindState(state.a());
        gVar.f102656c.bindState(state.b());
        gVar.f102657d.bindState(state.c());
    }
}
