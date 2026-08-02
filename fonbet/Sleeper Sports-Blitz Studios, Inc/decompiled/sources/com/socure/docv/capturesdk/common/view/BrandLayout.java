package com.socure.docv.capturesdk.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.henninghall.date_picker.props.TextColorProp;
import com.socure.docv.capturesdk.R;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrandLayout.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u001e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u000b*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/BrandLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imgBrandLogo", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgBrandLogo", "()Landroid/widget/ImageView;", "imgBrandLogo$delegate", "Lkotlin/Lazy;", "tvPoweredBy", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvPoweredBy", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvPoweredBy$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view$delegate", "setImgBrandLogo", "", "resId", "setPowerByText", Constants.ScionAnalytics.PARAM_LABEL, "", TextColorProp.name, "setUpBrandView", "powerByLabel", "brandLogoId", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BrandLayout extends ConstraintLayout {
    public static final int $stable = 8;

    /* renamed from: imgBrandLogo$delegate, reason: from kotlin metadata */
    private final Lazy imgBrandLogo;

    /* renamed from: tvPoweredBy$delegate, reason: from kotlin metadata */
    private final Lazy tvPoweredBy;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BrandLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandLayout(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.common.view.BrandLayout$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_brand_layout, (ViewGroup) this, false);
            }
        });
        this.tvPoweredBy = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.common.view.BrandLayout$tvPoweredBy$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = BrandLayout.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_powered_by);
            }
        });
        this.imgBrandLogo = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.common.view.BrandLayout$imgBrandLogo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = BrandLayout.this.getView();
                return (ImageView) view.findViewById(R.id.img_brand_logo);
            }
        });
        addView(getView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final AppCompatTextView getTvPoweredBy() {
        return (AppCompatTextView) this.tvPoweredBy.getValue();
    }

    private final ImageView getImgBrandLogo() {
        return (ImageView) this.imgBrandLogo.getValue();
    }

    private final void setPowerByText(String label, int textColor) {
        getTvPoweredBy().setText(label);
        getTvPoweredBy().setTextColor(ContextCompat.getColor(getContext(), textColor));
    }

    private final void setImgBrandLogo(int resId) {
        getImgBrandLogo().setImageResource(resId);
    }

    public final void setUpBrandView(String powerByLabel, int brandLogoId, int textColor) {
        Intrinsics.checkNotNullParameter(powerByLabel, "powerByLabel");
        setPowerByText(powerByLabel, textColor);
        setImgBrandLogo(brandLogoId);
    }
}
