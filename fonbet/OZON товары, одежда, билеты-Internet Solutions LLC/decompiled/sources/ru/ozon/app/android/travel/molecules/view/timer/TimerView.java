package ru.ozon.app.android.travel.molecules.view.timer;

import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.travel.molecules.view.timer.Timer;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001c\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/timer/TimerView;", "Landroidx/cardview/widget/CardView;", "Lru/ozon/app/android/travel/molecules/view/timer/Timer$Listener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;", "theme", "mapTheme", "(Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO$ThemeType;)I", "mapTextStyle", "", "formattedTime", "", "onNextTimeFrame", "(Ljava/lang/String;)V", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "dto", "Lxe/M;", "timerScope", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Lxe/M;Lkotlin/jvm/functions/Function1;)V", "destroyTimer", "()V", "Lru/ozon/app/android/travel/molecules/view/timer/Timer;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/travel/molecules/view/timer/Timer;", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "viewAppearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "textAppearance", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerView extends CardView implements Timer.Listener {

    @NotNull
    private final StyleAppearance<AppCompatTextView> textAppearance;
    private Timer timer;

    @NotNull
    private final AppCompatTextView titleTextView;

    @NotNull
    private final StyleAppearance<TimerView> viewAppearance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimerDTO.ThemeType.values().length];
            try {
                iArr[TimerDTO.ThemeType.THEME_TYPE_XSMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimerDTO.ThemeType.THEME_TYPE_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimerDTO.ThemeType.THEME_TYPE_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimerDTO.ThemeType.THEME_TYPE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimerDTO.ThemeType.THEME_TYPE_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int mapTextStyle(TimerDTO.ThemeType theme) {
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return R$style.TextStyle_BadgeBoldAC;
            }
            if (i11 == 2 || i11 == 3) {
                return R$style.TextStyle_Body_M;
            }
            if (i11 != 4 && i11 != 5) {
                throw new o();
            }
        }
        return R$style.TextStyle_Caption_Bold;
    }

    private final int mapTheme(TimerDTO.ThemeType theme) {
        int i11 = theme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return ru.ozon.app.android.travel.ui.molecules.R$style.TimerView_XS;
            }
            if (i11 == 2) {
                return ru.ozon.app.android.travel.ui.molecules.R$style.TimerView_M;
            }
            if (i11 == 3) {
                return ru.ozon.app.android.travel.ui.molecules.R$style.TimerView_L;
            }
            if (i11 != 4 && i11 != 5) {
                throw new o();
            }
        }
        return ru.ozon.app.android.travel.ui.molecules.R$style.TimerView_S;
    }

    public final void bindOrGone(TimerDTO dto, @NotNull M timerScope, Function1<? super AtomAction, Unit> actionHandler) {
        Timer timer;
        Intrinsics.checkNotNullParameter(timerScope, "timerScope");
        setVisibility(dto != null ? 0 : 8);
        if (dto != null) {
            StyleAppearance<TimerView> styleAppearance = this.viewAppearance;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            styleAppearance.read(context, mapTheme(dto.getTheme()));
            this.viewAppearance.apply(this);
            StyleAppearance<AppCompatTextView> styleAppearance2 = this.textAppearance;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            styleAppearance2.read(context2, mapTextStyle(dto.getTheme()));
            this.textAppearance.apply(this.titleTextView);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            setCardBackgroundColor(styleParser.parseColor(context3, dto.getBackgroundColor(), R$color.text_express));
            AppCompatTextView appCompatTextView = this.titleTextView;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            appCompatTextView.setTextColor(styleParser.parseColor(context4, dto.getTextColor(), R$color.bg_light_key));
            Timer timer2 = this.timer;
            if (timer2 != null && timer2 != null && timer2.getRemainingSeconds() == dto.getTimeLeft()) {
                Timer timer3 = this.timer;
                if (!(timer3 != null ? Intrinsics.d(timer3.isRunning(), Boolean.FALSE) : false) || (timer = this.timer) == null) {
                    return;
                }
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                timer.launch(context5, this);
                return;
            }
            Timer timer4 = this.timer;
            if (timer4 != null) {
                timer4.stop();
            }
            Timer timer5 = new Timer(timerScope, dto.getTitle(), dto.getTimeLeft(), dto.getStartTime(), dto.getAction(), actionHandler);
            this.timer = timer5;
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            timer5.launch(context6, this);
        }
    }

    public final void destroyTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.stop();
        }
        this.timer = null;
    }

    @Override // ru.ozon.app.android.travel.molecules.view.timer.Timer.Listener
    public void onNextTimeFrame(@NotNull String formattedTime) {
        Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
        this.titleTextView.setText(formattedTime);
    }

    public /* synthetic */ TimerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.titleTextView = appCompatTextView;
        StyleAppearance.Companion companion = StyleAppearance.INSTANCE;
        this.viewAppearance = companion.of(new TimerViewAppearance());
        this.textAppearance = StyleAppearance.Companion.ofText$default(companion, null, 1, null);
        addView(appCompatTextView, new FrameLayout.LayoutParams(-1, -2, 17));
    }
}
