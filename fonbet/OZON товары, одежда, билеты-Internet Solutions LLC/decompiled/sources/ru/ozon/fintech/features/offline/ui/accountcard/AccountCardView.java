package ru.ozon.fintech.features.offline.ui.accountcard;

import E30.f;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/offline/ui/accountcard/AccountCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Landroidx/appcompat/widget/AppCompatTextView;", "amountView", "updatedAtView", "infoIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "rightIconView", "bindState", "", "dto", "Lru/ozon/fintech/features/offline/ui/accountcard/AccountCardState;", "setupConstraints", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountCardView extends ConstraintLayout {

    @NotNull
    private final AppCompatTextView amountView;

    @NotNull
    private final AppCompatImageView infoIconView;

    @NotNull
    private final AppCompatImageView rightIconView;

    @NotNull
    private final AppCompatTextView titleView;

    @NotNull
    private final AppCompatTextView updatedAtView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupConstraints() {
        AppCompatTextView appCompatTextView = this.titleView;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41657u = this.rightIconView.getId();
        appCompatTextView.setLayoutParams(bVar);
        AppCompatImageView appCompatImageView = this.rightIconView;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(f.h(), f.h());
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        appCompatImageView.setLayoutParams(bVar2);
        AppCompatTextView appCompatTextView2 = this.amountView;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41655s = this.infoIconView.getId();
        bVar3.f41638j = this.titleView.getId();
        bVar3.f41657u = this.rightIconView.getId();
        bVar3.setMarginStart(f.i());
        appCompatTextView2.setLayoutParams(bVar3);
        AppCompatImageView appCompatImageView2 = this.infoIconView;
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(f.c(), f.c());
        bVar4.f41656t = 0;
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = f.d();
        bVar4.f41636i = this.amountView.getId();
        bVar4.f41642l = this.amountView.getId();
        appCompatImageView2.setLayoutParams(bVar4);
        AppCompatTextView appCompatTextView3 = this.updatedAtView;
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        bVar5.f41656t = 0;
        bVar5.f41638j = this.amountView.getId();
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = f.g();
        bVar5.f41657u = this.rightIconView.getId();
        bVar5.f41642l = 0;
        appCompatTextView3.setLayoutParams(bVar5);
    }

    public final void bindState(@NotNull AccountCardState dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.titleView.setText(dto.getTitle());
        this.amountView.setText(dto.getAmountText());
        this.updatedAtView.setText(dto.getUpdatedAtText());
        ImageViewExtKt.load$default(this.infoIconView, dto.getInfoIcon(), null, null, null, null, false, null, 126, null);
        ImageViewExtKt.load$default(this.rightIconView, dto.getRightIcon(), null, null, null, null, false, null, 126, null);
        AppCompatImageView appCompatImageView = this.infoIconView;
        int color = a.getColor(getContext(), UniColors.GRAPHIC_WARNING_PRIMARY.getResId());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        appCompatImageView.setColorFilter(color, mode);
        this.rightIconView.setColorFilter(a.getColor(getContext(), UniColors.TEXT_ACTION.getResId()), mode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AccountCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        TextViewExtKt.applyStyle(appCompatTextView, context, UniTextStyles.BODY_500_MEDIUM.getResId());
        UniColors uniColors = UniColors.TEXT_SECONDARY;
        appCompatTextView.setTextColor(a.getColor(context, uniColors.getResId()));
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(View.generateViewId());
        TextViewExtKt.applyStyle(appCompatTextView2, context, UniTextStyles.HEADLINE_500_MEDIUM.getResId());
        appCompatTextView2.setTextColor(a.getColor(context, uniColors.getResId()));
        this.amountView = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(View.generateViewId());
        TextViewExtKt.applyStyle(appCompatTextView3, context, UniTextStyles.BODY_300_X_SMALL.getResId());
        appCompatTextView3.setTextColor(a.getColor(context, UniColors.TEXT_WARNING.getResId()));
        this.updatedAtView = appCompatTextView3;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        appCompatImageView.setScaleType(scaleType);
        this.infoIconView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(View.generateViewId());
        appCompatImageView2.setScaleType(scaleType);
        appCompatImageView2.setBackgroundResource(R.drawable.background_rounded_primary_12);
        this.rightIconView = appCompatImageView2;
        setPadding(f.c(), f.c(), f.c(), f.c());
        setBackgroundResource(R.drawable.background_rounded_semantic_bg_secondary_16);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
        addView(appCompatImageView);
        addView(appCompatImageView2);
        appCompatImageView2.setVisibility(8);
        setupConstraints();
    }
}
