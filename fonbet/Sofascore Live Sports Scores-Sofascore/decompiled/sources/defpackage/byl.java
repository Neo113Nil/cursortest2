package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.skeletons.SkeletonItemCustomView;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class byl extends tbb {
    public final xxl b;
    public BlazeWidgetLayout c;
    public final BlazeViewType d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class a extends u {
        public final xxl b;
        public final cpm c;
        public final /* synthetic */ byl d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@NotNull byl bylVar, @NotNull xxl xxlVar, cpm cpmVar) {
            super(r0);
            xxlVar.getClass();
            cpmVar.getClass();
            this.d = bylVar;
            ConstraintLayout constraintLayout = cpmVar.a;
            SkeletonItemCustomView skeletonItemCustomView = cpmVar.c;
            ConstraintLayout constraintLayout2 = cpmVar.b;
            this.b = xxlVar;
            this.c = cpmVar;
            int i = xpl.a[bylVar.d.ordinal()];
            if (i == 1) {
                constraintLayout2.getLayoutParams().width = -1;
                constraintLayout2.getLayoutParams().height = -2;
                skeletonItemCustomView.getLayoutParams().width = -1;
                skeletonItemCustomView.getLayoutParams().height = -1;
                return;
            }
            if (i != 2) {
                zzl.b();
                throw null;
            }
            constraintLayout2.getLayoutParams().width = -2;
            constraintLayout2.getLayoutParams().height = -1;
            skeletonItemCustomView.getLayoutParams().width = -2;
            skeletonItemCustomView.getLayoutParams().height = -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byl(@NotNull xxl xxlVar, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeViewType blazeViewType) {
        super(new z1m());
        xxlVar.getClass();
        blazeWidgetLayout.getClass();
        blazeViewType.getClass();
        this.b = xxlVar;
        this.c = blazeWidgetLayout;
        this.d = blazeViewType;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        a aVar = (a) uVar;
        aVar.getClass();
        try {
            SkeletonItemCustomView skeletonItemCustomView = aVar.c.c;
            xxl xxlVar = aVar.b;
            byl bylVar = aVar.d;
            skeletonItemCustomView.c(xxlVar, bylVar.c, bylVar.d);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_skeleton_item_widget, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        SkeletonItemCustomView skeletonItemCustomView = (SkeletonItemCustomView) nq8.B(R.id.blaze_skeleton_widgetCustomView, inflate);
        if (skeletonItemCustomView != null) {
            return new a(this, this.b, new cpm(constraintLayout, constraintLayout, skeletonItemCustomView));
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.blaze_skeleton_widgetCustomView)));
        return null;
    }
}
