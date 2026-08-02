package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScannerBottomLayout.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\u0006\u0010,\u001a\u00020\u0017J\u0006\u0010-\u001a\u00020\u0017R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\n \u000b*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerBottomLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnHelp", "Landroidx/appcompat/widget/AppCompatButton;", "kotlin.jvm.PlatformType", "getBtnHelp", "()Landroidx/appcompat/widget/AppCompatButton;", "btnHelp$delegate", "Lkotlin/Lazy;", "btnManual", "Landroid/widget/ImageView;", "getBtnManual", "()Landroid/widget/ImageView;", "btnManual$delegate", "helpButtonClickListener", "Lkotlin/Function0;", "", "getHelpButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setHelpButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view$delegate", "hideManualButton", "manualButtonShowing", "", "setHelpButtonContentDescription", "contentDescription", "", "setLargeHelpBtnClickListener", "setManualButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setManualButtonContentDescription", "showHelpButton", "showManualButton", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerBottomLayout extends ConstraintLayout {
    public static final int $stable = 8;

    /* renamed from: btnHelp$delegate, reason: from kotlin metadata */
    private final Lazy btnHelp;

    /* renamed from: btnManual$delegate, reason: from kotlin metadata */
    private final Lazy btnManual;
    private Function0<Unit> helpButtonClickListener;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerBottomLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerBottomLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScannerBottomLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerBottomLayout(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerBottomLayout$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_scanner_bottom_layout, (ViewGroup) this, false);
            }
        });
        this.btnHelp = LazyKt.lazy(new Function0<AppCompatButton>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerBottomLayout$btnHelp$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatButton invoke() {
                View view;
                view = ScannerBottomLayout.this.getView();
                return (AppCompatButton) view.findViewById(R.id.btn_help);
            }
        });
        this.btnManual = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerBottomLayout$btnManual$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = ScannerBottomLayout.this.getView();
                return (ImageView) view.findViewById(R.id.btn_manual);
            }
        });
        addView(getView());
        setLargeHelpBtnClickListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final AppCompatButton getBtnHelp() {
        return (AppCompatButton) this.btnHelp.getValue();
    }

    private final ImageView getBtnManual() {
        return (ImageView) this.btnManual.getValue();
    }

    public final Function0<Unit> getHelpButtonClickListener() {
        return this.helpButtonClickListener;
    }

    public final void setHelpButtonClickListener(Function0<Unit> function0) {
        this.helpButtonClickListener = function0;
    }

    public final void setManualButtonClickListener(View.OnClickListener listener) {
        getBtnManual().setOnClickListener(listener);
    }

    private final void setLargeHelpBtnClickListener() {
        getBtnHelp().setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerBottomLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScannerBottomLayout.setLargeHelpBtnClickListener$lambda$0(ScannerBottomLayout.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLargeHelpBtnClickListener$lambda$0(ScannerBottomLayout this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.helpButtonClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void showManualButton() {
        if (getBtnManual().getVisibility() != 0) {
            ImageView btnManual = getBtnManual();
            Intrinsics.checkNotNullExpressionValue(btnManual, "btnManual");
            ExtensionsKt.showWithFadeInAnimation(btnManual);
        }
    }

    public final void hideManualButton() {
        if (getBtnManual().getVisibility() == 0) {
            getBtnManual().setVisibility(8);
        }
    }

    public final boolean manualButtonShowing() {
        return getBtnManual().getVisibility() == 0;
    }

    public final void showHelpButton() {
        if (getBtnHelp().getVisibility() != 0) {
            AppCompatButton btnHelp = getBtnHelp();
            Intrinsics.checkNotNullExpressionValue(btnHelp, "btnHelp");
            ExtensionsKt.showWithFadeInAnimation(btnHelp);
        }
    }

    public final void setManualButtonContentDescription(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        getBtnManual().setContentDescription(contentDescription);
    }

    public final void setHelpButtonContentDescription(String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        getBtnHelp().setContentDescription(contentDescription);
    }
}
