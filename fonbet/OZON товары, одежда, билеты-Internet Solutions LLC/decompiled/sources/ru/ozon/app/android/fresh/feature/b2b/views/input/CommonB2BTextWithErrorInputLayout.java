package ru.ozon.app.android.fresh.feature.b2b.views.input;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.CommonTextWithErrorInputBinding;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/views/input/CommonB2BTextWithErrorInputLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CommonTextWithErrorInputBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/CommonTextWithErrorInputBinding;", "errorBackgroundColor$delegate", "LSc/j;", "getErrorBackgroundColor", "()I", "errorBackgroundColor", "defaultBackgroundColor$delegate", "getDefaultBackgroundColor", "defaultBackgroundColor", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonB2BTextWithErrorInputLayout extends LinearLayout {

    @NotNull
    private final CommonTextWithErrorInputBinding binding;

    /* renamed from: defaultBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackgroundColor;

    /* renamed from: errorBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorBackgroundColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonB2BTextWithErrorInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CommonB2BTextWithErrorInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonB2BTextWithErrorInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.errorBackgroundColor = DelegatesKt.lazyUnsafe(new CommonB2BTextWithErrorInputLayout$errorBackgroundColor$2(context));
        this.defaultBackgroundColor = DelegatesKt.lazyUnsafe(new CommonB2BTextWithErrorInputLayout$defaultBackgroundColor$2(context));
        this.binding = CommonTextWithErrorInputBinding.inflate(LayoutInflater.from(context), this);
        setOrientation(1);
    }
}
