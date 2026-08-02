package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import V.e;
import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import dY.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.R$plurals;
import ru.ozon.app.android.marketing.common.timer.TimerWidgetTicker;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation.BigPromoNavbarVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 52\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010+\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0011018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarView;", "mainView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTickVO;", "tick", "onTick", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTickVO;)V", "", "corners", "Landroid/graphics/drawable/ShapeDrawable;", "getRoundedBackground", "(F)Landroid/graphics/drawable/ShapeDrawable;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "cornerRadius", "F", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoNavbarViewHolder extends k<BigPromoNavbarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final float cornerRadius;

    @NotNull
    private final BigPromoNavbarView mainView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final TimerWidgetTicker<Long, BigPromoTickVO> timerTicker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarViewHolder$Companion;", "", "<init>", "()V", "TIMER_PLACEHOLDER", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoNavbarViewHolder(@NotNull BigPromoNavbarView mainView, @NotNull ComposerReferences refs, @NotNull StartupArgsService startupArgsService) {
        super(mainView);
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.mainView = mainView;
        this.refs = refs;
        this.startupArgsService = startupArgsService;
        this.cornerRadius = ResourceExtKt.toPxF(16);
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.timerTicker = new TimerWidgetTicker<>(0L, this, BigPromoNavbarViewHolder$timerTicker$1.INSTANCE, new BigPromoNavbarViewHolder$timerTicker$2(this), startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
        mainView.setOnClickListener(new d(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BigPromoNavbarViewHolder bigPromoNavbarViewHolder, View view) {
        AtomAction action;
        BigPromoNavbarVO boundedData = bigPromoNavbarViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        bigPromoNavbarViewHolder.actionHandler.invoke(action);
    }

    private final void bindTimer(BigPromoNavbarVO.TimerVO timer) {
        DrawableResource fromToken;
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer mapColor = styleParser.mapColor(getContext(), timer.getTintColor());
        int intValue = mapColor != null ? mapColor.intValue() : R$color.text_light_key;
        Integer mapColor2 = styleParser.mapColor(getContext(), timer.getBackgroundColor());
        int intValue2 = mapColor2 != null ? mapColor2.intValue() : R$color.graphic_primary_on_light;
        this.mainView.getTimerView().setTimerTextColor(a.getColor(getContext(), intValue));
        this.mainView.getTimerView().setTimerBackgroundColor(a.getColor(getContext(), intValue2));
        BigPromoTimerView timerView = this.mainView.getTimerView();
        String icon = timer.getIcon();
        Integer num = null;
        if (icon != null && (fromToken = DrawableResource.INSTANCE.fromToken(icon)) != null) {
            num = fromToken.getResId(getContext());
        }
        timerView.setTimerIcon(num);
        this.timerTicker.bind(Long.valueOf(timer.getTimestampEnd()));
    }

    private final ShapeDrawable getRoundedBackground(float corners) {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = corners;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(0);
        return shapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(BigPromoTickVO tick) {
        BigPromoNavbarVO.TimerVO timer;
        BigPromoNavbarVO boundedData = getBoundedData();
        if (boundedData == null || (timer = boundedData.getTimer()) == null) {
            return;
        }
        BigPromoTimerView timerView = this.mainView.getTimerView();
        timerView.getTimerPart1().setText((tick.getIsFinished() || tick.getDays() >= 2) ? null : e.b(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3, "%s\u2009:\u2009%s\u2009:\u2009%s", "format(...)"));
        timerView.getTimerPart2().setText(timer.getTitle());
        if (tick.getIsFinished()) {
            timerView.getTimerPart2().setText(timer.getTitleOnExpire());
            return;
        }
        if (tick.getDays() >= 2) {
            String quantityString = StringProvider.getQuantityString(R$plurals.black_friday_status_plurals_days, tick.getDays(), Integer.valueOf(tick.getDays()));
            AppCompatTextView timerPart2 = timerView.getTimerPart2();
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{quantityString, timer.getTitle()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            timerPart2.setText(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BigPromoNavbarVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BigPromoNavbarView bigPromoNavbarView = this.mainView;
        bindTimer(item.getTimer());
        bigPromoNavbarView.getTitleView().setText(item.getTitle());
        bigPromoNavbarView.getTitleView().setTextColor(a.getColor(bigPromoNavbarView.getContext(), R$color.text_light_key));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = bigPromoNavbarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundImage());
        AppCompatImageView backgroundImage = bigPromoNavbarView.getBackgroundImage();
        String backgroundImage2 = item.getBackgroundImage();
        backgroundImage.setVisibility(backgroundImage2 == null || backgroundImage2.length() == 0 ? 8 : 0);
        float f7 = item.getHasRoundedCorners() ? this.cornerRadius : 0.0f;
        if (mapColor != null) {
            bigPromoNavbarView.getBackgroundImage().setBackground(getRoundedBackground(f7));
        } else {
            ImageViewExtKt.load$default(bigPromoNavbarView.getBackgroundImage(), item.getBackgroundImage(), null, null, null, null, false, null, 126, null);
        }
        ImageViewExtKt.load$default(bigPromoNavbarView.getCornerImage(), item.getCornerImage(), null, null, null, null, false, null, 126, null);
        bigPromoNavbarView.getCornerImage().setBackground(getRoundedBackground(f7));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BigPromoNavbarVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
