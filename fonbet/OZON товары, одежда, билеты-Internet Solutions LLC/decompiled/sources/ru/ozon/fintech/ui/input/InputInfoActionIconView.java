package ru.ozon.fintech.ui.input;

import C.D;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/ui/input/InputInfoActionIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/fintech/ui/input/InfoAction;", "action", "getAction", "()Lru/ozon/fintech/ui/input/InfoAction;", "iconColorDefault", "iconSuccessColor", "infoIconImage", "Landroid/widget/ImageView;", "progressBar", "Landroid/widget/ProgressBar;", "changeState", "", "setColorFilter", "color", "mode", "Landroid/graphics/PorterDuff$Mode;", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputInfoActionIconView extends FrameLayout {
    private static final int PROGRESSBAR_HEIGHT_WIDTH = D.d(24);

    @NotNull
    private InfoAction action;
    private final int iconColorDefault;
    private final int iconSuccessColor;

    @NotNull
    private ImageView infoIconImage;

    @NotNull
    private final ProgressBar progressBar;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoAction.values().length];
            try {
                iArr[InfoAction.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoAction.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputInfoActionIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void changeState(@NotNull InfoAction value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.action = value;
        int i11 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                Integer iconRes = this.action.getIconRes();
                if (iconRes != null) {
                    this.infoIconImage.setImageResource(iconRes.intValue());
                    this.infoIconImage.setColorFilter(this.action == InfoAction.SUCCESS ? this.iconSuccessColor : this.iconColorDefault, PorterDuff.Mode.SRC_IN);
                }
            } else {
                this.infoIconImage.setVisibility(8);
                this.progressBar.setVisibility(8);
            }
        }
        ImageView imageView = this.infoIconImage;
        InfoAction infoAction = this.action;
        InfoAction infoAction2 = InfoAction.LOADING;
        imageView.setVisibility(infoAction != infoAction2 ? 0 : 8);
        this.progressBar.setVisibility(this.action == infoAction2 ? 0 : 8);
        L80.a.a("InputView", "InputInfoActionIcon changeState " + this.action);
    }

    @NotNull
    public final InfoAction getAction() {
        return this.action;
    }

    public final void setColorFilter(int color, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.infoIconImage.setColorFilter(color, mode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputInfoActionIconView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InputInfoActionIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoActionIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.action = InfoAction.CLEAR;
        this.iconColorDefault = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.iconSuccessColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId());
        ImageView imageView = new ImageView(context);
        imageView.setVisibility(8);
        this.infoIconImage = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(context.getColor(R.color.oz_semantic_accent_primary)));
        progressBar.setVisibility(8);
        this.progressBar = progressBar;
        setId(R.id.finInputInfoIcon);
        addView(this.infoIconImage, new FrameLayout.LayoutParams(-1, -1));
        int i12 = PROGRESSBAR_HEIGHT_WIDTH;
        addView(progressBar, new FrameLayout.LayoutParams(i12, i12));
    }
}
