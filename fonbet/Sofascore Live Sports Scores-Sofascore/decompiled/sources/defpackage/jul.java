package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.analytics.enums.ThumbnailFormat;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.ui.WidgetItemCustomView;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jul extends tbb {
    public final xxl b;
    public BlazeWidgetLayout c;
    public Map d;
    public final Function2 e;
    public final ft8 f;
    public final String g;
    public final BlazeViewType h;
    public final String i;
    public RecyclerView j;
    public int k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class a extends u {
        public static final /* synthetic */ int g = 0;
        public final xxl b;
        public final d6m c;
        public final Function2 d;
        public final ft8 e;
        public final /* synthetic */ jul f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@NotNull jul julVar, @NotNull xxl xxlVar, @NotNull d6m d6mVar, @NotNull Function2<? super ipm, ? super ThumbnailFormat, Unit> function2, ft8 ft8Var) {
            super(r0);
            xxlVar.getClass();
            d6mVar.getClass();
            function2.getClass();
            ft8Var.getClass();
            this.f = julVar;
            ConstraintLayout constraintLayout = d6mVar.a;
            WidgetItemCustomView widgetItemCustomView = d6mVar.b;
            ConstraintLayout constraintLayout2 = d6mVar.c;
            this.b = xxlVar;
            this.c = d6mVar;
            this.d = function2;
            this.e = ft8Var;
            int i = zpl.a[julVar.h.ordinal()];
            if (i == 1) {
                constraintLayout2.getLayoutParams().width = -1;
                constraintLayout2.getLayoutParams().height = -2;
                widgetItemCustomView.getLayoutParams().width = -1;
                widgetItemCustomView.getLayoutParams().height = -1;
                return;
            }
            if (i != 2) {
                zzl.b();
                throw null;
            }
            constraintLayout2.getLayoutParams().width = -2;
            constraintLayout2.getLayoutParams().height = -1;
            widgetItemCustomView.getLayoutParams().width = -2;
            widgetItemCustomView.getLayoutParams().height = -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jul(@NotNull xxl xxlVar, @NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @NotNull Function2<? super ipm, ? super ThumbnailFormat, Unit> function2, @NotNull ft8 ft8Var, @NotNull String str, @NotNull BlazeViewType blazeViewType, @NotNull String str2) {
        super(new d2m());
        xxlVar.getClass();
        blazeWidgetLayout.getClass();
        map.getClass();
        function2.getClass();
        ft8Var.getClass();
        str.getClass();
        blazeViewType.getClass();
        str2.getClass();
        this.b = xxlVar;
        this.c = blazeWidgetLayout;
        this.d = map;
        this.e = function2;
        this.f = ft8Var;
        this.g = str;
        this.h = blazeViewType;
        this.i = str2;
        this.k = -1;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.j = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        Object obj;
        BlazeWidgetItemStyleOverrides blazeWidgetItemStyleOverrides;
        a aVar = (a) uVar;
        aVar.getClass();
        Object o = o(i);
        o.getClass();
        ipm ipmVar = (ipm) o;
        d6m d6mVar = aVar.c;
        ConstraintLayout constraintLayout = d6mVar.a;
        jul julVar = aVar.f;
        constraintLayout.setOnClickListener(new glc(i, julVar, aVar, ipmVar));
        BlazeWidgetLayout blazeWidgetLayout = julVar.c;
        Map map = julVar.d;
        blazeWidgetLayout.getClass();
        map.getClass();
        Map map2 = ipmVar.g;
        map2.getClass();
        BlazeWidgetLayout blazeWidgetLayout2 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetLayout);
        Iterator it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Map.Entry entry2 = (Map.Entry) obj;
                boolean c = Intrinsics.c(((BlazeWidgetItemCustomMapping) entry2.getKey()).getKey(), str);
                boolean c2 = Intrinsics.c(((BlazeWidgetItemCustomMapping) entry2.getKey()).getValue(), str2);
                if (c && c2) {
                    break;
                }
            }
            Map.Entry entry3 = (Map.Entry) obj;
            if (entry3 != null && (blazeWidgetItemStyleOverrides = (BlazeWidgetItemStyleOverrides) entry3.getValue()) != null) {
                BlazeWidgetItemImageContainerBorderStyle imageBorder = blazeWidgetItemStyleOverrides.getImageBorder();
                if (imageBorder != null) {
                    blazeWidgetLayout2.getWidgetItemStyle().getImage().setBorder(imageBorder);
                }
                BlazeWidgetItemStatusIndicatorStyle statusIndicator = blazeWidgetItemStyleOverrides.getStatusIndicator();
                if (statusIndicator != null) {
                    blazeWidgetLayout2.getWidgetItemStyle().setStatusIndicator(statusIndicator);
                }
                BlazeWidgetItemBadgeStyle badge = blazeWidgetItemStyleOverrides.getBadge();
                if (badge != null) {
                    blazeWidgetLayout2.getWidgetItemStyle().setBadge(badge);
                }
            }
        }
        d6mVar.b.initVariables(aVar.b, ipmVar, julVar.h, blazeWidgetLayout2, aVar.e, julVar.g + '_' + i);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_item_widget, viewGroup, false);
        WidgetItemCustomView widgetItemCustomView = (WidgetItemCustomView) nq8.B(R.id.blaze_widgetCustomView, inflate);
        if (widgetItemCustomView == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.blaze_widgetCustomView)));
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        return new a(this, this.b, new d6m(constraintLayout, widgetItemCustomView, constraintLayout), this.e, this.f);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.j = null;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        a aVar = (a) uVar;
        aVar.getClass();
        super.onViewRecycled(aVar);
        aVar.c.b.stopAnimatedThumbnail();
    }
}
