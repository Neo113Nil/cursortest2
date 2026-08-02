package com.socure.docv.capturesdk.common.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.socure.docv.capturesdk.R;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomToolbar.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0010\u0010*\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020%H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020%H\u0002J\u000e\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0007J\u001e\u00101\u001a\u00020\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010%R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001c\u001a\n \u000b*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/CustomToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnBack", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "getBtnBack", "()Landroidx/appcompat/widget/AppCompatImageView;", "btnBack$delegate", "Lkotlin/Lazy;", "btnClose", "getBtnClose", "btnClose$delegate", "clToolbarView", "getClToolbarView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "clToolbarView$delegate", "tvInfoTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvInfoTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvInfoTitle$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view$delegate", "hideBack", "", "setBackContentDescription", "contentDescription", "", "setBackListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setCloseContentDescription", "setCloseListener", "setTitle", "title", "setTitleColor", "color", "setToolbarBg", "colorString", "setup", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CustomToolbar extends ConstraintLayout {

    /* renamed from: btnBack$delegate, reason: from kotlin metadata */
    private final Lazy btnBack;

    /* renamed from: btnClose$delegate, reason: from kotlin metadata */
    private final Lazy btnClose;

    /* renamed from: clToolbarView$delegate, reason: from kotlin metadata */
    private final Lazy clToolbarView;

    /* renamed from: tvInfoTitle$delegate, reason: from kotlin metadata */
    private final Lazy tvInfoTitle;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomToolbar(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.common.view.CustomToolbar$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_custom_toolbar, (ViewGroup) this, false);
            }
        });
        this.clToolbarView = LazyKt.lazy(new Function0<ConstraintLayout>() { // from class: com.socure.docv.capturesdk.common.view.CustomToolbar$clToolbarView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ConstraintLayout invoke() {
                View view;
                view = CustomToolbar.this.getView();
                return (ConstraintLayout) view.findViewById(R.id.clToolbarView);
            }
        });
        this.tvInfoTitle = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.common.view.CustomToolbar$tvInfoTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = CustomToolbar.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tvInfoTitle);
            }
        });
        this.btnClose = LazyKt.lazy(new Function0<AppCompatImageView>() { // from class: com.socure.docv.capturesdk.common.view.CustomToolbar$btnClose$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatImageView invoke() {
                View view;
                view = CustomToolbar.this.getView();
                return (AppCompatImageView) view.findViewById(R.id.btnClose);
            }
        });
        this.btnBack = LazyKt.lazy(new Function0<AppCompatImageView>() { // from class: com.socure.docv.capturesdk.common.view.CustomToolbar$btnBack$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatImageView invoke() {
                View view;
                view = CustomToolbar.this.getView();
                return (AppCompatImageView) view.findViewById(R.id.btnBack);
            }
        });
        addView(getView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final ConstraintLayout getClToolbarView() {
        Object value = this.clToolbarView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-clToolbarView>(...)");
        return (ConstraintLayout) value;
    }

    public final AppCompatTextView getTvInfoTitle() {
        Object value = this.tvInfoTitle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tvInfoTitle>(...)");
        return (AppCompatTextView) value;
    }

    private final AppCompatImageView getBtnClose() {
        return (AppCompatImageView) this.btnClose.getValue();
    }

    private final AppCompatImageView getBtnBack() {
        return (AppCompatImageView) this.btnBack.getValue();
    }

    private final void setTitle(String title) {
        getTvInfoTitle().setText(title);
    }

    private final void setTitleColor(String color) {
        getTvInfoTitle().setTextColor(Color.parseColor(color));
    }

    public final void setCloseListener(View.OnClickListener listener) {
        getBtnClose().setOnClickListener(listener);
    }

    public final void setBackListener(View.OnClickListener listener) {
        getBtnBack().setOnClickListener(listener);
    }

    public final void setBackContentDescription(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        getBtnBack().setContentDescription(contentDescription);
    }

    public final void setCloseContentDescription(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        getBtnClose().setContentDescription(contentDescription);
    }

    public final void hideBack() {
        getBtnBack().setVisibility(4);
        getBtnBack().setOnClickListener(null);
    }

    public static /* synthetic */ void setup$default(CustomToolbar customToolbar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        customToolbar.setup(str, str2);
    }

    public final void setup(String title, String color) {
        if (title != null) {
            setTitle(title);
            getTvInfoTitle().setVisibility(0);
        }
        if (color != null) {
            setTitleColor(color);
        }
    }

    public final void setToolbarBg(int colorString) {
        getClToolbarView().setBackgroundColor(colorString);
    }
}
