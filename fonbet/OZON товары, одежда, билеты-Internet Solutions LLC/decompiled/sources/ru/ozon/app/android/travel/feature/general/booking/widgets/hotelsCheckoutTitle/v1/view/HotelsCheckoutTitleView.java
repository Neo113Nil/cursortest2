package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.view;

import AU.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.HotelsCheckoutTitleVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/view/HotelsCheckoutTitleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;", DynamicElementDTO.TIMER, "Lorg/joda/time/DateTime;", "endTime", "", "bindOrGoneTimer", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO$CustomBadge;Lorg/joda/time/DateTime;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;Lkotlin/jvm/functions/Function1;)V", "", "prefix", "", "leftTime", "updateTimerTitle", "(Ljava/lang/String;J)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "timerText", "Landroid/graphics/drawable/GradientDrawable;", "timerBackground$delegate", "LSc/j;", "getTimerBackground", "()Landroid/graphics/drawable/GradientDrawable;", "timerBackground", "Lkotlin/text/Regex;", "regex", "Lkotlin/text/Regex;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilder", "Ljava/lang/StringBuilder;", "", "dp16", "I", "Lkotlin/jvm/functions/Function1;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsCheckoutTitleView extends LinearLayout {
    private AtomAction action;
    private final int dp16;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Regex regex;

    @NotNull
    private final StringBuilder stringBuilder;

    /* renamed from: timerBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j timerBackground;

    @NotNull
    private final TextAtomV2View timerText;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsCheckoutTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        textAtomV2View.setLayoutParams(layoutParams);
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(g11);
        this.timerText = textAtomV2View2;
        this.timerBackground = k.b(HotelsCheckoutTitleView$timerBackground$2.INSTANCE);
        this.regex = new Regex("\\$placeholder");
        this.stringBuilder = new StringBuilder();
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        setOrientation(0);
        setGravity(16);
        setPadding(px, 0, px, 0);
        textAtomV2View2.setOnClickListener(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(HotelsCheckoutTitleView hotelsCheckoutTitleView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = hotelsCheckoutTitleView.action;
        if (atomAction == null || (function1 = hotelsCheckoutTitleView.onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void bindOrGoneTimer(HotelsCheckoutTitleVO.CustomBadge timer, DateTime endTime) {
        String str;
        this.timerText.setVisibility(timer != null ? 0 : 8);
        if (timer == null) {
            return;
        }
        if (endTime == null || (str = DateExtensionsKt.toFormattedTime(endTime.getMillis() - new DateTime().getMillis())) == null) {
            str = "";
        }
        GradientDrawable gradientDrawable = null;
        TextHolderKt.bind$default(this.timerText, TextDTO.copy$default(timer.getTitle(), OzonSpannableStringKt.toOzonSpannableString(this.regex.replace(timer.getTitle().getText(), str)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, 2, null);
        TextAtomV2View textAtomV2View = this.timerText;
        if (timer.getBackgroundColor() != null) {
            gradientDrawable = getTimerBackground();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColorInt(context, timer.getBackgroundColor(), 0));
            gradientDrawable.setCornerRadius(timer.getCornerRadius());
        }
        textAtomV2View.setBackground(gradientDrawable);
    }

    private final GradientDrawable getTimerBackground() {
        return (GradientDrawable) this.timerBackground.getValue();
    }

    public final void bind(@NotNull HotelsCheckoutTitleVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.action = item.getAction();
        TextHolderKt.bind$default(this.title, item.getTitle(), null, 2, null);
        bindOrGoneTimer(item.getBadge(), item.getEndTime());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColorInt(context, item.getBackgroundColor(), 0));
    }

    public final void updateTimerTitle(String prefix, long leftTime) {
        TextAtomV2View textAtomV2View = this.timerText;
        StringBuilder sb2 = this.stringBuilder;
        h.s(sb2);
        sb2.append(String.valueOf(prefix));
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        textAtomV2View.setText(this.regex.replace(sb2, DateExtensionsKt.toFormattedTime(leftTime)));
    }
}
