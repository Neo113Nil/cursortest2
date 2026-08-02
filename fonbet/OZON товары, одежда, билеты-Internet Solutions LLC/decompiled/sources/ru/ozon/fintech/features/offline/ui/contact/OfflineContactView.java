package ru.ozon.fintech.features.offline.ui.contact;

import C.D;
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
import b70.C5574b;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/ui/contact/OfflineContactView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/offline/ui/contact/OfflineContactState;", "state", "", "bindState", "(Lru/ozon/fintech/features/offline/ui/contact/OfflineContactState;)V", "Lb70/b;", "binding", "Lb70/b;", "Lru/ozon/fintech/features/offline/ui/contact/OfflineContactState;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineContactView extends LinearLayout {

    @NotNull
    private final C5574b binding;
    private OfflineContactState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineContactView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OfflineContactView offlineContactView, View view) {
        Function1<String, Unit> onClick;
        String str;
        OfflineContactState offlineContactState = offlineContactView.state;
        if (offlineContactState == null || (onClick = offlineContactState.getOnClick()) == null) {
            return;
        }
        OfflineContactState offlineContactState2 = offlineContactView.state;
        if (offlineContactState2 == null || (str = offlineContactState2.getId()) == null) {
            str = "";
        }
        onClick.invoke(str);
    }

    public final void bindState(@NotNull OfflineContactState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getAvatarUri() != null) {
            String avatarUri = state.getAvatarUri();
            OfflineContactState offlineContactState = this.state;
            if (!Intrinsics.d(avatarUri, offlineContactState != null ? offlineContactState.getAvatarUri() : null)) {
                ImageView image = this.binding.f55587d;
                Intrinsics.checkNotNullExpressionValue(image, "image");
                ImageViewExtKt.load$default(image, state.getAvatarUri(), C7714v.a0(new ImageTransformation.RoundedCorners(D.d(12), null, 2, null)), null, null, null, false, null, 124, null);
                ImageView image2 = this.binding.f55587d;
                Intrinsics.checkNotNullExpressionValue(image2, "image");
                ThemeExtKt.tint(image2, null);
            }
        } else if (state.getAvatarRes() != null) {
            Integer avatarRes = state.getAvatarRes();
            OfflineContactState offlineContactState2 = this.state;
            if (!Intrinsics.d(avatarRes, offlineContactState2 != null ? offlineContactState2.getAvatarRes() : null)) {
                this.binding.f55587d.setImageResource(state.getAvatarRes().intValue());
                ImageView image3 = this.binding.f55587d;
                Intrinsics.checkNotNullExpressionValue(image3, "image");
                ThemeExtKt.tint(image3, Integer.valueOf(a.getColor(getContext(), R.color.graphic_tertiary)));
            }
        } else {
            this.binding.f55587d.setImageBitmap(null);
            ImageView image4 = this.binding.f55587d;
            Intrinsics.checkNotNullExpressionValue(image4, "image");
            ThemeExtKt.tint(image4, null);
        }
        ImageView chevron = this.binding.f55586c;
        Intrinsics.checkNotNullExpressionValue(chevron, "chevron");
        chevron.setVisibility(state.getChevron() ? 0 : 8);
        this.binding.f55588e.setText(state.getName());
        this.binding.f55589f.setText(state.getNumber());
        this.binding.f55585b.setText(state.getInitials());
        this.state = state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineContactView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OfflineContactView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineContactView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C5574b a11 = C5574b.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.binding = a11;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(ResourceExtKt.toPx(66));
        z.d(this, R.color.layer_floor_1, null, 124);
        setOrientation(0);
        setGravity(16);
        setPadding(D.d(16), D.d(12), ResourceExtKt.toPx(16), ResourceExtKt.toPx(12));
        setOnClickListener(new AI.a(this, 11));
    }
}
