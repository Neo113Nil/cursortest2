package ru.ozon.uni.atoms.v3.holders.indicator;

import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "", "style", "", "applyStyle", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;I)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorHolderKt {
    public static final void applyStyle(@NotNull IndicatorView indicatorView, int i11) {
        Intrinsics.checkNotNullParameter(indicatorView, "<this>");
        TypedArray obtainStyledAttributes = indicatorView.getContext().obtainStyledAttributes(i11, R$styleable.IndicatorView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        indicatorView.setBackColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.IndicatorView_android_background, 0)));
        indicatorView.setBorderColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_borderColor, 0));
        indicatorView.setIconColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_iconColor, 0));
        indicatorView.setTextColor(obtainStyledAttributes.getColor(R$styleable.IndicatorView_android_textColor, 0));
        obtainStyledAttributes.recycle();
    }

    public static final void bind(@NotNull IndicatorView indicatorView, @NotNull IndicatorDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(indicatorView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(indicatorView, dto, new IndicatorHolderKt$bind$provider$1(indicatorView), function1);
    }

    public static /* synthetic */ void bind$default(IndicatorView indicatorView, IndicatorDTO indicatorDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(indicatorView, indicatorDTO, function1);
    }

    public static final void bindOrGone(@NotNull IndicatorView indicatorView, IndicatorDTO indicatorDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(indicatorView, "<this>");
        if (indicatorDTO == null) {
            indicatorView.setVisibility(8);
        } else {
            indicatorView.setVisibility(0);
            bind(indicatorView, indicatorDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(IndicatorView indicatorView, IndicatorDTO indicatorDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(indicatorView, indicatorDTO, function1);
    }
}
