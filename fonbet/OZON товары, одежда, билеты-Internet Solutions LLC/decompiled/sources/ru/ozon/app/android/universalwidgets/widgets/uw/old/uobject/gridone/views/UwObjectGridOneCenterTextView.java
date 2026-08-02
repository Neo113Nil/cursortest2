package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.uni.R$style;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneCenterTextView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textLl", "Landroid/widget/LinearLayout;", "getTextLl", "()Landroid/widget/LinearLayout;", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTv", "getSubtitleTv", "appendTextLl", "appendTitleTv", "appendSubtitleTv", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UwObjectGridOneCenterTextView extends UwObjectGridOneView {

    @NotNull
    private final AppCompatTextView subtitleTv;

    @NotNull
    private final LinearLayout textLl;

    @NotNull
    private final AppCompatTextView titleTv;

    public /* synthetic */ UwObjectGridOneCenterTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final AppCompatTextView appendSubtitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        appCompatTextView.setId(R$id.subtitleTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setTextAppearance(appCompatTextView.getContext(), R$style.TextStyle_Body_L);
        getTextLl().addView(appCompatTextView, layoutParams);
        return appCompatTextView;
    }

    private final LinearLayout appendTextLl() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = getMargin4();
        layoutParams.bottomMargin = getMargin4();
        layoutParams.leftMargin = getMargin54();
        layoutParams.rightMargin = getMargin54();
        linearLayout.setId(R$id.textLl);
        linearLayout.setOrientation(1);
        addView(linearLayout, layoutParams);
        return linearLayout;
    }

    private final AppCompatTextView appendTitleTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        appCompatTextView.setId(R$id.titleTv);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setTextAppearance(appCompatTextView.getContext(), R$style.TextStyle_Body_L_Bold);
        getTextLl().addView(appCompatTextView, layoutParams);
        return appCompatTextView;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneView
    @NotNull
    public AppCompatTextView getSubtitleTv() {
        return this.subtitleTv;
    }

    @NotNull
    public LinearLayout getTextLl() {
        return this.textLl;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views.UwObjectGridOneView
    @NotNull
    public AppCompatTextView getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UwObjectGridOneCenterTextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textLl = appendTextLl();
        this.titleTv = appendTitleTv();
        this.subtitleTv = appendSubtitleTv();
    }
}
