package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.di.DependencyGraphExtKt;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScannerHelpGraphic.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020 H\u0002J%\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'H\u0000¢\u0006\u0002\b(J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R#\u0010\u001c\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001d\u0010\u0018R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerHelpGraphic;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityUseCase", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityUseCase", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "accessibilityUseCase$delegate", "Lkotlin/Lazy;", "helpGraphic", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "getHelpGraphic", "()Landroidx/appcompat/widget/AppCompatImageView;", "helpGraphic$delegate", "message", "Landroidx/appcompat/widget/AppCompatTextView;", "getMessage", "()Landroidx/appcompat/widget/AppCompatTextView;", "message$delegate", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "title", "getTitle", "title$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view$delegate", "rootView", "setViews", "", "", "setViews$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerHelpGraphic extends ConstraintLayout {

    /* renamed from: accessibilityUseCase$delegate, reason: from kotlin metadata */
    private final Lazy accessibilityUseCase;

    /* renamed from: helpGraphic$delegate, reason: from kotlin metadata */
    private final Lazy helpGraphic;

    /* renamed from: message$delegate, reason: from kotlin metadata */
    private final Lazy message;
    private ScanType scanType;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Lazy title;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* compiled from: ScannerHelpGraphic.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerHelpGraphic(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerHelpGraphic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScannerHelpGraphic(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerHelpGraphic(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.accessibilityUseCase = LazyKt.lazy(new Function0<AnnounceAccessibilityMessageUseCase>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic$accessibilityUseCase$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnnounceAccessibilityMessageUseCase invoke() {
                Context applicationContext = context.getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    return DependencyGraphExtKt.obtainApplicationComponent(application).getAccessibilityAnnouncer();
                }
                return null;
            }
        });
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic$view$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                View rootView;
                rootView = ScannerHelpGraphic.this.rootView();
                return rootView;
            }
        });
        this.helpGraphic = LazyKt.lazy(new Function0<AppCompatImageView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic$helpGraphic$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatImageView invoke() {
                View view;
                view = ScannerHelpGraphic.this.getView();
                return (AppCompatImageView) view.findViewById(R.id.iv_help_graphic_view);
            }
        });
        this.title = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic$title$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = ScannerHelpGraphic.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_scan_help_title);
            }
        });
        this.message = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerHelpGraphic$message$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = ScannerHelpGraphic.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_scan_help_msg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View rootView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.socure_scanner_help_overlay, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(context)\n          …elp_overlay, this, false)");
        return inflate;
    }

    private final AnnounceAccessibilityMessageUseCase getAccessibilityUseCase() {
        return (AnnounceAccessibilityMessageUseCase) this.accessibilityUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final AppCompatImageView getHelpGraphic() {
        return (AppCompatImageView) this.helpGraphic.getValue();
    }

    public final void setViews$capturesdk_productionRelease(ScanType scanType, String title, String message) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.scanType = scanType;
        setViews(title, message);
        addView(getView());
    }

    private final AppCompatTextView getTitle() {
        return (AppCompatTextView) this.title.getValue();
    }

    private final AppCompatTextView getMessage() {
        return (AppCompatTextView) this.message.getValue();
    }

    private final void setViews(String title, String message) {
        int i;
        Utils utils = Utils.INSTANCE;
        ScanType scanType = this.scanType;
        ScanType scanType2 = null;
        if (scanType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanType");
            scanType = null;
        }
        if (utils.isSelfie$capturesdk_productionRelease(scanType)) {
            ViewGroup.LayoutParams layoutParams = getHelpGraphic().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int dimension = (int) getResources().getDimension(R.dimen.selfie_help_graphic_margin_socure);
            layoutParams2.setMarginStart(dimension);
            layoutParams2.setMarginEnd(dimension);
        }
        AppCompatImageView helpGraphic = getHelpGraphic();
        ScanType scanType3 = this.scanType;
        if (scanType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scanType");
        } else {
            scanType2 = scanType3;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[scanType2.ordinal()];
        if (i2 == 1) {
            i = R.drawable.socure_scanner_help_graphic_front;
        } else if (i2 == 2) {
            i = R.drawable.socure_scanner_help_graphic_back;
        } else if (i2 == 3) {
            i = R.drawable.socure_scanner_help_graphic_passport;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.socure_scanner_help_graphic_selfie;
        }
        helpGraphic.setImageResource(i);
        getTitle().setText(title);
        AnnounceAccessibilityMessageUseCase accessibilityUseCase = getAccessibilityUseCase();
        if (accessibilityUseCase != null) {
            AppCompatTextView title2 = getTitle();
            Intrinsics.checkNotNullExpressionValue(title2, "this.title");
            AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityUseCase, title2, title, false, 4, null);
        }
        getMessage().setText(message);
        AnnounceAccessibilityMessageUseCase accessibilityUseCase2 = getAccessibilityUseCase();
        if (accessibilityUseCase2 != null) {
            AppCompatTextView message2 = getMessage();
            Intrinsics.checkNotNullExpressionValue(message2, "this.message");
            AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityUseCase2, message2, message, false, 4, null);
        }
    }
}
