package ru.ozon.app.android.session.auth.presentation.views;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.R$styleable;
import ru.ozon.app.android.session.databinding.SberIdButtonBinding;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/views/SberIdButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "orientation", "", "setOrientation", "(I)V", "Lru/ozon/app/android/session/databinding/SberIdButtonBinding;", "binding", "Lru/ozon/app/android/session/databinding/SberIdButtonBinding;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SberIdButton extends LinearLayout {

    @NotNull
    private SberIdButtonBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SberIdButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int orientation) {
        throw new IllegalStateException("avoid change orientation");
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.binding.sberText.setText(value);
    }

    public /* synthetic */ SberIdButton(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SberIdButton(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = SberIdButtonBinding.inflate(LayoutInflater.from(context), this);
        super.setOrientation(0);
        setGravity(17);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SberIdButton);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                r.Companion companion = r.INSTANCE;
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i13 = 0; i13 < indexCount; i13++) {
                    int index = obtainStyledAttributes.getIndex(i13);
                    if (index == R$styleable.SberIdButton_android_text) {
                        String string = obtainStyledAttributes.getString(index);
                        if (string != null) {
                            setText(string);
                        }
                    } else if (index == R$styleable.SberIdButton_android_textAppearance) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                        Integer valueOf = Integer.valueOf(resourceId);
                        if (resourceId <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            this.binding.sberText.setTextAppearance(valueOf.intValue());
                        }
                    } else if (index == R$styleable.SberIdButton_android_src && (drawable = obtainStyledAttributes.getDrawable(index)) != null) {
                        this.binding.sberImg.setImageDrawable(drawable);
                    }
                }
                Unit unit = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = r.INSTANCE;
                s.a(th2);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
