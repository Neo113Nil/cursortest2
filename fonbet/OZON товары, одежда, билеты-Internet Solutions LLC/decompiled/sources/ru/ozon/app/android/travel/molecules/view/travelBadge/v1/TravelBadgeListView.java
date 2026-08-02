package ru.ozon.app.android.travel.molecules.view.travelBadge.v1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v1.TravelBadgeDTO;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.adapter.BadgeAdapter;
import ru.ozon.app.android.travel.molecules.view.travelBadge.v1.adapter.ClearanceDecoration;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/travelBadge/v1/TravelBadgeListView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "badgeAdapter", "Lru/ozon/app/android/travel/molecules/view/travelBadge/v1/adapter/BadgeAdapter;", "bindOrGone", "", "items", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "setup", "orientation", "clearanceSize", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelBadgeListView extends RecyclerView {

    @NotNull
    private final BadgeAdapter badgeAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelBadgeListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setup(int orientation, int clearanceSize) {
        setLayoutManager(new LinearLayoutManager(getContext(), orientation, false));
        setAdapter(this.badgeAdapter);
        addItemDecoration(new ClearanceDecoration(clearanceSize, orientation));
    }

    public final void bindOrGone(List<TravelBadgeDTO> items) {
        List<TravelBadgeDTO> list = items;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.badgeAdapter.update(items);
        }
    }

    public /* synthetic */ TravelBadgeListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelBadgeListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.badgeAdapter = new BadgeAdapter();
        int px = ResourceExtKt.toPx(4, context);
        int i12 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TravelBadgeListView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int i13 = obtainStyledAttributes.getInt(R$styleable.TravelBadgeListView_travelBadgeListOrientation, 0);
            if (i13 != 0 && i13 == 1) {
                i12 = 1;
            }
            px = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TravelBadgeListView_travelBadgeListItemClearanceSize, px);
            Unit unit = Unit.f71690a;
            obtainStyledAttributes.recycle();
        }
        setup(i12, px);
    }
}
