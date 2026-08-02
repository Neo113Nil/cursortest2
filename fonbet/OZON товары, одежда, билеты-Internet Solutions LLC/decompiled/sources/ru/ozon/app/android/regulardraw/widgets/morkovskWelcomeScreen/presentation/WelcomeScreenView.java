package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation;

import Sc.InterfaceC4008j;
import V4.C4072a;
import V4.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation.WelcomeScreenVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001b\u0010!\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateConstraints", "()V", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;", "screenInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO$ScreenInfo;Lkotlin/jvm/functions/Function1;)V", "dp12$delegate", "LSc/j;", "getDp12", "()I", "dp12", "dp16$delegate", "getDp16", "dp16", "dp24$delegate", "getDp24", "dp24", "dp30$delegate", "getDp30", "dp30", "dp110$delegate", "getDp110", "dp110", "Landroidx/appcompat/widget/AppCompatImageView;", "image", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitle", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "button", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeScreenView extends ConstraintLayout {

    @NotNull
    private final MorkovskShadowButton button;

    /* renamed from: dp110$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp110;

    /* renamed from: dp12$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp12;

    /* renamed from: dp16$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp16;

    /* renamed from: dp24$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp24;

    /* renamed from: dp30$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp30;

    @NotNull
    private final AppCompatImageView image;

    @NotNull
    private final AppCompatTextView subtitle;

    @NotNull
    private final OutlinedTextView title;

    public /* synthetic */ WelcomeScreenView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int getDp110() {
        return ((Number) this.dp110.getValue()).intValue();
    }

    private final int getDp12() {
        return ((Number) this.dp12.getValue()).intValue();
    }

    private final int getDp16() {
        return ((Number) this.dp16.getValue()).intValue();
    }

    private final int getDp24() {
        return ((Number) this.dp24.getValue()).intValue();
    }

    private final int getDp30() {
        return ((Number) this.dp30.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConstraints() {
        d dVar = new d();
        dVar.p(this);
        dVar.o(this.title.getId(), 3);
        ConstraintSetExtKt.topToBottom(dVar, this.title.getId(), this.image.getId(), getDp12());
        n.a(this, new C4072a());
        dVar.f(this);
    }

    public final void bind(@NotNull WelcomeScreenVO.ScreenInfo screenInfo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageViewExtKt.load$default(this.image, screenInfo.getImage(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation.WelcomeScreenView$bind$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                WelcomeScreenView.this.updateConstraints();
            }
        }, null, null, false, null, 122, null);
        this.title.setText(screenInfo.getTitle());
        this.subtitle.setText(screenInfo.getSubtitle());
        this.button.bind(screenInfo.getButton(), new WelcomeScreenView$bind$2(actionHandler));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeScreenView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp12 = LazyUtilsKt.unsafeLazy(WelcomeScreenView$dp12$2.INSTANCE);
        this.dp16 = LazyUtilsKt.unsafeLazy(WelcomeScreenView$dp16$2.INSTANCE);
        this.dp24 = LazyUtilsKt.unsafeLazy(WelcomeScreenView$dp24$2.INSTANCE);
        this.dp30 = LazyUtilsKt.unsafeLazy(WelcomeScreenView$dp30$2.INSTANCE);
        this.dp110 = LazyUtilsKt.unsafeLazy(WelcomeScreenView$dp110$2.INSTANCE);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(0, -2));
        appCompatImageView.setAdjustViewBounds(true);
        this.image = appCompatImageView;
        OutlinedTextView outlinedTextView = new OutlinedTextView(context, null, 0, 6, null);
        outlinedTextView.setId(View.generateViewId());
        outlinedTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        TextViewExtKt.applyStyle(outlinedTextView, context, R$style.Text_Bold);
        outlinedTextView.setTextConfig(a.getColor(context, R$color.outline_text_content_color), a.getColor(context, R$color.outline_text_border_color), UiExtKt.toPxF(1.3f));
        outlinedTextView.setTextSize(2, 24.0f);
        outlinedTextView.setLetterSpacing(0.0f);
        outlinedTextView.setTextAlignment(4);
        this.title = outlinedTextView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(0, -2));
        TextViewExtKt.applyStyle(appCompatTextView, context, R$style.Text_Body);
        appCompatTextView.setTextColor(a.getColor(context, R$color.welcome_screen_subtitle_text_color));
        appCompatTextView.setTextSize(2, 16.0f);
        appCompatTextView.setLineSpacing(0.0f, 1.22f);
        appCompatTextView.setLetterSpacing(0.0f);
        appCompatTextView.setTextAlignment(4);
        this.subtitle = appCompatTextView;
        MorkovskShadowButton morkovskShadowButton = new MorkovskShadowButton(context, null, 0, 6, null);
        morkovskShadowButton.setId(View.generateViewId());
        morkovskShadowButton.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.button = morkovskShadowButton;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.topMargin = getDp30();
        marginLayoutParams.bottomMargin = getDp16();
        setLayoutParams(marginLayoutParams);
        addView(appCompatImageView);
        addView(outlinedTextView);
        addView(appCompatTextView);
        addView(morkovskShadowButton);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop$default(dVar, appCompatImageView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart(dVar, appCompatImageView.getId(), 0, getDp110());
        ConstraintSetExtKt.endToEnd(dVar, appCompatImageView.getId(), 0, getDp110());
        ConstraintSetExtKt.topToTop$default(dVar, outlinedTextView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart(dVar, outlinedTextView.getId(), 0, getDp12());
        ConstraintSetExtKt.endToEnd(dVar, outlinedTextView.getId(), 0, getDp12());
        ConstraintSetExtKt.topToBottom(dVar, appCompatTextView.getId(), outlinedTextView.getId(), getDp12());
        ConstraintSetExtKt.startToStart(dVar, appCompatTextView.getId(), 0, getDp24());
        ConstraintSetExtKt.endToEnd(dVar, appCompatTextView.getId(), 0, getDp24());
        ConstraintSetExtKt.bottomToBottom$default(dVar, morkovskShadowButton.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart(dVar, morkovskShadowButton.getId(), 0, getDp12());
        ConstraintSetExtKt.endToEnd(dVar, morkovskShadowButton.getId(), 0, getDp12());
        dVar.f(this);
    }
}
