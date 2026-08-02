package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aql extends kul {
    public final BlazeWidgetLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aql(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        super(blazeWidgetLayout);
        blazeWidgetLayout.getClass();
        this.a = blazeWidgetLayout;
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        BlazeWidgetLayout blazeWidgetLayout = this.a;
        rect.getClass();
        qrfVar.getClass();
        try {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % blazeWidgetLayout.getUpdatedColumns();
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(view) / blazeWidgetLayout.getUpdatedColumns();
            if (lz.A(recyclerView)) {
                rect.right = childAdapterPosition == 0 ? rect.right : blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() / 2;
                rect.left = childAdapterPosition == blazeWidgetLayout.getUpdatedColumns() + (-1) ? rect.left : blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() / 2;
            } else {
                rect.left = childAdapterPosition == 0 ? rect.left : blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() / 2;
                rect.right = childAdapterPosition == blazeWidgetLayout.getUpdatedColumns() + (-1) ? rect.right : blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() / 2;
            }
            if (childAdapterPosition2 == 0) {
                rect.bottom = blazeWidgetLayout.getVerticalItemsSpacing().getToPx$blazesdk_release() / 2;
                return;
            }
            if (childAdapterPosition2 == (recyclerView.getAdapter() != null ? (int) Math.ceil(r5.getItemCount() / blazeWidgetLayout.getUpdatedColumns()) : 0)) {
                rect.top = blazeWidgetLayout.getVerticalItemsSpacing().getToPx$blazesdk_release() / 2;
            } else {
                rect.top = blazeWidgetLayout.getVerticalItemsSpacing().getToPx$blazesdk_release() / 2;
                rect.bottom = blazeWidgetLayout.getVerticalItemsSpacing().getToPx$blazesdk_release() / 2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
