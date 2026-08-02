package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e2m extends kul {
    public final BlazeWidgetLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2m(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        super(blazeWidgetLayout);
        blazeWidgetLayout.getClass();
        this.a = blazeWidgetLayout;
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        rect.getClass();
        qrfVar.getClass();
        try {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            l adapter = recyclerView.getAdapter();
            if (adapter != null) {
                boolean z = true;
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    z = false;
                }
                boolean A = lz.A(recyclerView);
                BlazeWidgetLayout blazeWidgetLayout = this.a;
                if (A) {
                    rect.left = z ? blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() : 0;
                } else {
                    rect.right = z ? blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release() : 0;
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
