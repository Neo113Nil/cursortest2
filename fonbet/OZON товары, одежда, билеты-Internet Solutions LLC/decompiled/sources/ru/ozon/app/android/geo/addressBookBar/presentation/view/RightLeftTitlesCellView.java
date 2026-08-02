package ru.ozon.app.android.geo.addressBookBar.presentation.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u001a\u001a\u00020\u0007J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/view/RightLeftTitlesCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "leftTitleView", "Landroidx/appcompat/widget/AppCompatTextView;", "rightTitleView", "cellSeparatorView", "Landroid/view/View;", "setIcon", "", "icon", "", "iconTintColor", "(Ljava/lang/String;Ljava/lang/Integer;)V", "setLeftTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "setRightTitle", "setSeparatorVisibility", "show", "", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RightLeftTitlesCellView extends ConstraintLayout {

    @NotNull
    private final View cellSeparatorView;

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final AppCompatTextView leftTitleView;

    @NotNull
    private final AppCompatTextView rightTitleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp1 = ResourceExtKt.toPx(1);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp24 = ResourceExtKt.toPx(24);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp12 = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/view/RightLeftTitlesCellView$Companion;", "", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RightLeftTitlesCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void setIcon(String icon, Integer iconTintColor) {
        AppCompatImageView appCompatImageView = this.iconView;
        ImageViewExtKt.loadImageOrGone(appCompatImageView, icon);
        ThemeExtKt.tint(appCompatImageView, iconTintColor);
    }

    public final void setLeftTitle(String title, int titleColor) {
        AppCompatTextView appCompatTextView = this.leftTitleView;
        TextViewExtKt.setTextOrGone(appCompatTextView, title);
        appCompatTextView.setTextColor(titleColor);
    }

    public final void setRightTitle(@NotNull String title, int titleColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        AppCompatTextView appCompatTextView = this.rightTitleView;
        appCompatTextView.setText(title);
        appCompatTextView.setTextColor(titleColor);
    }

    public final void setSeparatorVisibility(boolean show) {
        ViewExtKt.showOrGone(this.cellSeparatorView, Boolean.valueOf(show));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightLeftTitlesCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView = appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
        appCompatImageView.setId(R$id.cellIconIv);
        int i13 = dp24;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(i13, i13));
        addView(appCompatImageView);
        this.iconView = appCompatImageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context) : appCompatTextView;
        appCompatTextView.setId(R$id.leftTitleTv);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
        addView(appCompatTextView);
        this.leftTitleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView2 = appCompatTextView2 == null ? new AppCompatTextView(context) : appCompatTextView2;
        appCompatTextView2.setId(R$id.rightTitleTv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        int i14 = dp12;
        bVar.f41594A = i14;
        appCompatTextView2.setLayoutParams(bVar);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Body_M);
        addView(appCompatTextView2);
        this.rightTitleView = appCompatTextView2;
        View view = new View(context);
        view.setId(R$id.cellSeparatorV);
        view.setLayoutParams(new ConstraintLayout.b(0, dp1));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        addView(view);
        this.cellSeparatorView = view;
        d dVar = new d();
        dVar.p(this);
        int i15 = R$id.cellIconIv;
        int i16 = dp16;
        ConstraintSetExtKt.startToStart(dVar, i15, 0, i16);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.cellIconIv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.cellIconIv, 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, R$id.disclosureIv, 0, i16);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.disclosureIv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.disclosureIv, 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd$default(dVar, R$id.rightTitleTv, R$id.leftTitleTv, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, R$id.rightTitleTv, R$id.disclosureIv, dp4);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.rightTitleTv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.rightTitleTv, 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, R$id.leftTitleTv, R$id.cellIconIv, i14);
        ConstraintSetExtKt.endToStart$default(dVar, R$id.leftTitleTv, R$id.rightTitleTv, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, R$id.leftTitleTv, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.leftTitleTv, 0, 0, 4, null);
        dVar.C(R$id.leftTitleTv, true);
        dVar.c0(0.0f, R$id.leftTitleTv);
        ConstraintSetExtKt.startToStart$default(dVar, R$id.cellSeparatorV, R$id.leftTitleTv, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, R$id.cellSeparatorV, 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, R$id.cellSeparatorV, 0, 0, 4, null);
        dVar.f(this);
    }
}
