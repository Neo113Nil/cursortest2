package ru.ozon.uni.atoms.v3.holders.disclaimer;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\u000f\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\r*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "customTheme", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "toUiButtonStyle", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;Landroid/content/Context;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;)Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DSDisclaimerHolderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerDTO.ButtonTheme.values().length];
            try {
                iArr[DisclaimerDTO.ButtonTheme.THEME_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void bind(@NotNull DisclaimerView disclaimerView, @NotNull DisclaimerDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclaimerView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(disclaimerView, dto, new DSDisclaimerHolderKt$bind$provider$1(disclaimerView), function1);
    }

    public static /* synthetic */ void bind$default(DisclaimerView disclaimerView, DisclaimerDTO disclaimerDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(disclaimerView, disclaimerDTO, function1);
    }

    public static final void bindOrGone(@NotNull DisclaimerView disclaimerView, DisclaimerDTO disclaimerDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(disclaimerView, "<this>");
        if (disclaimerDTO == null) {
            disclaimerView.setVisibility(8);
        } else {
            disclaimerView.setVisibility(0);
            bind(disclaimerView, disclaimerDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(DisclaimerView disclaimerView, DisclaimerDTO disclaimerDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(disclaimerView, disclaimerDTO, function1);
    }

    @NotNull
    public static final DisclaimerView.ButtonsStyle toUiButtonStyle(@NotNull DisclaimerDTO.ButtonTheme buttonTheme, @NotNull Context context, DisclaimerDTO.CustomButtonTheme customButtonTheme) {
        Intrinsics.checkNotNullParameter(buttonTheme, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = WhenMappings.$EnumSwitchMapping$0[buttonTheme.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return DisclaimerView.ButtonsStyle.Base.INSTANCE;
        }
        if (i11 == 3) {
            return DisclaimerView.ButtonsStyle.Primary.INSTANCE;
        }
        if (i11 != 4) {
            throw new o();
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        return new DisclaimerView.ButtonsStyle.Custom(styleParser.parseColor(context, customButtonTheme != null ? customButtonTheme.getBackgroundColor() : null, R$color.bg_overlap), styleParser.parseColor(context, customButtonTheme != null ? customButtonTheme.getTextColor() : null, R$color.text_primary));
    }
}
