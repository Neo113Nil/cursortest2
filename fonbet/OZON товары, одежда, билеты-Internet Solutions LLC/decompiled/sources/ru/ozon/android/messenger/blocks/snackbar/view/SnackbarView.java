package ru.ozon.android.messenger.blocks.snackbar.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.snackbar.IconContainer;
import ru.ozon.android.messenger.blocks.snackbar.SnackbarVO;
import ru.ozon.android.messenger.blocks.snackbar.TimerViewVO;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.utils.view.n;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MSnackbarViewBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/view/SnackbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarView extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final float f86447e = UiExtKt.toPxF(12);

    /* renamed from: f, reason: collision with root package name */
    private static final float f86448f = UiExtKt.toPxF(16);

    /* renamed from: g, reason: collision with root package name */
    private static final float f86449g = UiExtKt.toPxF(8);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final MSnackbarViewBinding f86450c;

    /* renamed from: d, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.snackbar.a f86451d;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            SnackbarView snackbarView = SnackbarView.this;
            float height = snackbarView.getHeight() - SnackbarView.f86447e;
            if (outline != null) {
                outline.setRoundRect(0, 0, snackbarView.getWidth(), (int) height, SnackbarView.f86447e);
            }
        }
    }

    private static final class b {
    }

    static final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnackbarVO f86454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SnackbarVO snackbarVO) {
            super(1);
            this.f86454c = snackbarVO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            String id2 = it.getId();
            ButtonV3Atom.SmallButton button = this.f86454c.getButton();
            SnackbarView.c(SnackbarView.this, id2, button != null ? button.getAction() : null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MSnackbarViewBinding inflate = MSnackbarViewBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f86450c = inflate;
        setOutlineProvider(new a());
        setBackgroundResource(R$drawable.m_snackbar_ripple);
        setElevation(f86448f);
    }

    public static final void c(SnackbarView snackbarView, String str, AtomActionDTO it) {
        ru.ozon.android.messenger.blocks.snackbar.a aVar;
        snackbarView.getClass();
        if (str != null) {
            if (str.equals(it != null ? it.getId() : null) && (aVar = snackbarView.f86451d) != null) {
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar = aVar.f86425a;
                ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
                ButtonV3Atom.SmallButton button = aVar.f86426b.getButton();
                c11.m(h.a(button != null ? button.getTrackingInfo() : null));
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(it));
            }
        }
    }

    public final void d(@NotNull SnackbarVO snackbar, @NotNull d.a networkConfig) {
        Intrinsics.checkNotNullParameter(snackbar, "snackbar");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        MSnackbarViewBinding mSnackbarViewBinding = this.f86450c;
        mSnackbarViewBinding.titleTv.setText(snackbar.getTitle());
        AppCompatTextView descriptionTv = mSnackbarViewBinding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        n.e(descriptionTv, snackbar.getDescription());
        TimerView timerView = mSnackbarViewBinding.timerView;
        TimerViewVO timer = snackbar.getTimer();
        timerView.c(timer != null ? Integer.valueOf((int) timer.getTtl()) : null);
        ImageView leftIconIv = mSnackbarViewBinding.leftIconIv;
        Intrinsics.checkNotNullExpressionValue(leftIconIv, "leftIconIv");
        IconContainer leftIcon = snackbar.getLeftIcon();
        ru.ozon.android.messenger.utils.image.c.c(leftIconIv, leftIcon != null ? leftIcon.getIcon() : null, networkConfig);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = f86449g;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconContainer leftIcon2 = snackbar.getLeftIcon();
        Integer parseColor = styleParser.parseColor(context, leftIcon2 != null ? leftIcon2.getBackgroundColor() : null);
        shapeDrawable.setColorFilter(parseColor != null ? new PorterDuffColorFilter(parseColor.intValue(), PorterDuff.Mode.SRC_IN) : null);
        mSnackbarViewBinding.leftIconIv.setBackground(shapeDrawable);
        SmallButtonView button = mSnackbarViewBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        WrappedButtonHolderKt.bindOrGone(button, snackbar.getButton(), new c(snackbar));
        ImageView rightIconIv = mSnackbarViewBinding.rightIconIv;
        Intrinsics.checkNotNullExpressionValue(rightIconIv, "rightIconIv");
        ru.ozon.android.messenger.utils.image.c.c(rightIconIv, snackbar.getRightIcon(), networkConfig);
    }

    public final void e(@NotNull ru.ozon.android.messenger.blocks.snackbar.a onButtonClickedCallback) {
        Intrinsics.checkNotNullParameter(onButtonClickedCallback, "onButtonClickedCallback");
        this.f86451d = onButtonClickedCallback;
    }
}
