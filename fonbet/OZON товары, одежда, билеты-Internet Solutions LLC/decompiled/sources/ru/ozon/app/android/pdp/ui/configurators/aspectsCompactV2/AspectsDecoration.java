package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/FlexBoxAspectsDecoration;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/FourColumnAspectsDecoration;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/HorizontalAspectsDecoration;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/HorizontalAspectsZeroSpaceBetweenDecoration;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/TwoColumnAspectsDecoration;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VerticalAspectsDecoration;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AspectsDecoration extends RecyclerView.n {

    @NotNull
    private final Context context;

    public /* synthetic */ AspectsDecoration(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private AspectsDecoration(Context context) {
        this.context = context;
    }
}
