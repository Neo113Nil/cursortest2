package ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage;

import FK.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageView;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageModel;", "newModel", "", "bindOrGone", "(Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageModel;)V", "", "isActive", "switchButton", "(Z)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "model", "Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageModel;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchingImageView extends AppCompatImageButton {
    private Function1<? super Boolean, Unit> listener;
    private SwitchingImageModel model;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchingImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SwitchingImageView switchingImageView, View view) {
        SwitchingImageModel switchingImageModel = switchingImageView.model;
        if (switchingImageModel != null) {
            boolean z11 = !switchingImageModel.getIsActive();
            switchingImageView.switchButton(z11);
            Function1<? super Boolean, Unit> function1 = switchingImageView.listener;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z11));
            }
        }
    }

    public final void bindOrGone(SwitchingImageModel newModel) {
        if (newModel == null) {
            this.model = newModel;
            ViewExtKt.gone(this);
            return;
        }
        ViewExtKt.show(this);
        this.model = newModel;
        if (newModel.getIsActive()) {
            setImageResource(newModel.getActiveImage());
        } else {
            setImageResource(newModel.getInActiveImage());
        }
        ThemeExtKt.tint(this, newModel.getTintColor());
    }

    public final void setListener(Function1<? super Boolean, Unit> function1) {
        this.listener = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r8 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void switchButton(boolean isActive) {
        SwitchingImageModel switchingImageModel;
        SwitchingImageModel switchingImageModel2 = this.model;
        if (switchingImageModel2 != null) {
            if (isActive) {
                setImageResource(switchingImageModel2.getActiveImage());
            } else {
                setImageResource(switchingImageModel2.getInActiveImage());
            }
            ViewExtKt.show(this);
            ThemeExtKt.tint(this, switchingImageModel2.getTintColor());
            switchingImageModel = SwitchingImageModel.copy$default(switchingImageModel2, isActive, 0, 0, null, 14, null);
        }
        ViewExtKt.gone(this);
        switchingImageModel = null;
        this.model = switchingImageModel;
    }

    public /* synthetic */ SwitchingImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchingImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOnClickListener(new a(this, 17));
    }
}
