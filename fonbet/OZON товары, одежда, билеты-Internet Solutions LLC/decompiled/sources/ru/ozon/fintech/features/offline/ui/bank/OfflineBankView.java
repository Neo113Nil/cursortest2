package ru.ozon.fintech.features.offline.ui.bank;

import C.D;
import DN.b;
import H30.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import b70.C5573a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/ui/bank/OfflineBankView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/offline/ui/bank/OfflineBankState;", "state", "", "bindState", "(Lru/ozon/fintech/features/offline/ui/bank/OfflineBankState;)V", "Lb70/a;", "binding", "Lb70/a;", "Lru/ozon/fintech/features/offline/ui/bank/OfflineBankState;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineBankView extends LinearLayout {

    @NotNull
    private final C5573a binding;
    private OfflineBankState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineBankView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(OfflineBankView offlineBankView, View view) {
        String id2;
        OfflineBankState offlineBankState;
        Function1<String, Unit> onClick;
        OfflineBankState offlineBankState2 = offlineBankView.state;
        if (offlineBankState2 == null || (id2 = offlineBankState2.getId()) == null || (offlineBankState = offlineBankView.state) == null || (onClick = offlineBankState.getOnClick()) == null) {
            return;
        }
        onClick.invoke(id2);
    }

    public final void bindState(@NotNull OfflineBankState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getImage() != null) {
            ImageView image = this.binding.f55582b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            ThemeExtKt.tint(image, null);
            ImageView image2 = this.binding.f55582b;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            ImageViewExtKt.load$default(image2, state.getImage(), C7714v.a0(new ImageTransformation.RoundedCorners(D.d(12), null, 2, null)), null, null, null, false, null, 124, null);
        } else if (state.getImageRes() != null) {
            ImageView image3 = this.binding.f55582b;
            Intrinsics.checkNotNullExpressionValue(image3, "image");
            ThemeExtKt.tint(image3, Integer.valueOf(a.getColor(getContext(), R.color.graphic_action_primary)));
            this.binding.f55582b.setImageResource(state.getImageRes().intValue());
        } else {
            this.binding.f55582b.setImageBitmap(null);
            ImageView image4 = this.binding.f55582b;
            Intrinsics.checkNotNullExpressionValue(image4, "image");
            ThemeExtKt.tint(image4, null);
        }
        this.binding.f55583c.setText(state.getTitle());
        this.state = state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineBankView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OfflineBankView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineBankView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C5573a a11 = C5573a.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.binding = a11;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(ResourceExtKt.toPx(64));
        z.d(this, R.color.layer_floor_1, null, 124);
        setOrientation(0);
        setGravity(16);
        setPadding(D.d(16), D.d(10), ResourceExtKt.toPx(16), ResourceExtKt.toPx(10));
        setOnClickListener(new b(this, 16));
    }
}
