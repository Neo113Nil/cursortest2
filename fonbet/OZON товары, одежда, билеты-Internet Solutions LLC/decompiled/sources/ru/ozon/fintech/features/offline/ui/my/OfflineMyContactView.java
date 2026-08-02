package ru.ozon.fintech.features.offline.ui.my;

import H30.z;
import Jm0.a;
import L30.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import b70.C5576d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/ui/my/OfflineMyContactView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/fintech/features/offline/ui/my/OfflineMyContactState;", "state", "", "bindState", "(Lru/ozon/fintech/features/offline/ui/my/OfflineMyContactState;)V", "Lb70/d;", "binding", "Lb70/d;", "Lru/ozon/fintech/features/offline/ui/my/OfflineMyContactState;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineMyContactView extends FrameLayout {

    @NotNull
    private final C5576d binding;
    private OfflineMyContactState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineMyContactView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(OfflineMyContactView offlineMyContactView, View view) {
        Function1<String, Unit> onClick;
        String str;
        OfflineMyContactState offlineMyContactState = offlineMyContactView.state;
        if (offlineMyContactState == null || (onClick = offlineMyContactState.getOnClick()) == null) {
            return;
        }
        OfflineMyContactState offlineMyContactState2 = offlineMyContactView.state;
        if (offlineMyContactState2 == null || (str = offlineMyContactState2.getId()) == null) {
            str = "";
        }
        onClick.invoke(str);
    }

    public final void bindState(@NotNull OfflineMyContactState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.binding.f55605c.setText(state.getName());
        this.binding.f55606d.setText(state.getNumber());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineMyContactView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OfflineMyContactView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineMyContactView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        C5576d a11 = C5576d.a(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(a11, "inflate(...)");
        this.binding = a11;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c cVar = new c(16);
        LinearLayout island = a11.f55604b;
        island.setOutlineProvider(cVar);
        island.setClipToOutline(true);
        Intrinsics.checkNotNullExpressionValue(island, "island");
        z.d(island, R.color.bg_action_secondary, null, 124);
        island.setOnClickListener(new a(this, 9));
    }
}
