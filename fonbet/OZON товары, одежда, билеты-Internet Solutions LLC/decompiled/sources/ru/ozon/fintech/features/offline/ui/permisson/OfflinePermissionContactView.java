package ru.ozon.fintech.features.offline.ui.permisson;

import Aw.ViewOnClickListenerC2448a;
import C.D;
import H30.z;
import L30.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.core.content.a;
import b70.C5579g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.DrawableExtKt;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/ui/permisson/OfflinePermissionContactView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/offline/ui/permisson/OfflinePermissionContactState;", "state", "", "bindState", "(Lru/ozon/fintech/features/offline/ui/permisson/OfflinePermissionContactState;)V", "Lb70/g;", "binding", "Lb70/g;", "Lru/ozon/fintech/features/offline/ui/permisson/OfflinePermissionContactState;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflinePermissionContactView extends FrameLayout {

    @NotNull
    private final C5579g binding;
    private OfflinePermissionContactState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflinePermissionContactView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OfflinePermissionContactView offlinePermissionContactView, View view) {
        Function0<Unit> onClick;
        OfflinePermissionContactState offlinePermissionContactState = offlinePermissionContactView.state;
        if (offlinePermissionContactState == null || (onClick = offlinePermissionContactState.getOnClick()) == null) {
            return;
        }
        onClick.invoke();
    }

    public final void bindState(@NotNull OfflinePermissionContactState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.binding.f55644e.setText(state.getTitle());
        this.binding.f55643d.setText(state.getSubTitle());
        OfflinePermissionContactState offlinePermissionContactState = this.state;
        if (offlinePermissionContactState == null || state.getIconRes() != offlinePermissionContactState.getIconRes()) {
            Drawable drawable = a.getDrawable(getContext(), state.getIconRes());
            Bitmap bitmap = drawable != null ? DrawableExtKt.toBitmap(drawable, D.d(24)) : null;
            ImageView image = this.binding.f55641b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            ImageViewExtKt.load$default(image, bitmap, null, K.f71697a, null, 10, null);
        }
        this.state = state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflinePermissionContactView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OfflinePermissionContactView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePermissionContactView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C5579g a11 = C5579g.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.binding = a11;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c cVar = new c(16);
        LinearLayout island = a11.f55642c;
        island.setOutlineProvider(cVar);
        island.setClipToOutline(true);
        Intrinsics.checkNotNullExpressionValue(island, "island");
        z.d(island, R.color.bg_secondary, null, 124);
        island.setOnClickListener(new ViewOnClickListenerC2448a(this, 16));
    }
}
