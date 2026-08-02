package ru.ozon.fintech.ui.qrcode;

import C.D;
import CG.c;
import Ca.C2732A;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/qrcode/QrCodeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "image", "Landroid/widget/ImageView;", "root", "Landroidx/constraintlayout/widget/ConstraintLayout;", "subTitle", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "state", "Lru/ozon/fintech/ui/qrcode/QrCodeState;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrCodeView extends FrameLayout {

    @NotNull
    private final ImageView image;

    @NotNull
    private final ConstraintLayout root;
    private QrCodeState state;

    @NotNull
    private final TextAtomView subTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrCodeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(QrCodeView qrCodeView, View view) {
        QrCodeState qrCodeState = qrCodeView.state;
        Function2<String, Boolean, Unit> onClick = qrCodeState != null ? qrCodeState.getOnClick() : null;
        QrCodeState qrCodeState2 = qrCodeView.state;
        g.a(new C2732A(1), onClick, qrCodeState2 != null ? qrCodeState2.getActionId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(Function2 onClick, String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.TRUE);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindState(@NotNull QrCodeState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        this.subTitle.setVisibility(state.getSubTitle() != null ? 0 : 8);
        TextAtom subTitle = state.getSubTitle();
        int i11 = 2;
        ImageTransformation.RoundedCorners.CornerType cornerType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (subTitle != null) {
            TextAtomHolderKt.bind$default(this.subTitle, subTitle, null, 2, null);
        }
        ViewGroup.LayoutParams layoutParams = this.image.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams).f41611R = state.getPercent();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        if (parseColor != null) {
            this.root.setBackgroundColor(parseColor.intValue());
        }
        if (state.getSrc() != null) {
            ImageViewExtKt.loadOriginal$default(this.image, state.getSrc(), C7714v.a0(new ImageTransformation.RoundedCorners(D.d(16), cornerType, i11, objArr3 == true ? 1 : 0)), null, null, false, null, 60, null);
            return;
        }
        if (state.getSrcBase64() == null) {
            this.image.setImageDrawable(null);
            return;
        }
        try {
            byte[] decode = Base64.decode(state.getSrcBase64(), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            ImageViewExtKt.load$default(this.image, BitmapFactory.decodeByteArray(decode, 0, decode.length), null, C7714v.a0(new ImageTransformation.RoundedCorners(D.d(16), objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0)), null, 10, null);
        } catch (IllegalArgumentException unused) {
            this.image.setImageDrawable(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QrCodeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ QrCodeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.qr_code_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = (ImageView) findViewById(R.id.fin_qr_image_view);
        this.image = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.fin_qr_root);
        this.root = constraintLayout;
        this.subTitle = (TextAtomView) findViewById(R.id.fin_qr_subtitle);
        setClickable(true);
        setFocusable(true);
        setTag("QrCodeView");
        imageView.setOnClickListener(new c(this, 15));
        constraintLayout.setClipToOutline(true);
        constraintLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.qrcode.QrCodeView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.d(20));
            }
        });
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.qrcode.QrCodeView.3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.d(16));
            }
        });
    }
}
