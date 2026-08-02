package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.results.R;
import com.sofascore.results.transfers.view.TransferFilterScrollableHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dvj extends o8 {
    public final FragmentActivity d;
    public final kr9 e;
    public final mqi f;
    public final mqi g;
    public final mqi h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvj(FragmentActivity fragmentActivity, kr9 kr9Var) {
        super(fragmentActivity, null, 0);
        final int i = 0;
        this.d = fragmentActivity;
        this.e = kr9Var;
        this.f = ypa.b(new Function0(this) { // from class: cvj
            public final /* synthetic */ dvj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                dvj dvjVar = this.b;
                switch (i2) {
                    case 0:
                        View root = dvjVar.getRoot();
                        int i3 = R.id.filter_container;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.filter_container, root);
                        if (frameLayout != null) {
                            i3 = R.id.filter_icon;
                            if (((ImageView) nq8.B(R.id.filter_icon, root)) != null) {
                                i3 = R.id.filter_text;
                                TextView textView = (TextView) nq8.B(R.id.filter_text, root);
                                if (textView != null) {
                                    i3 = R.id.scrollable_view;
                                    TransferFilterScrollableHeaderView transferFilterScrollableHeaderView = (TransferFilterScrollableHeaderView) nq8.B(R.id.scrollable_view, root);
                                    if (transferFilterScrollableHeaderView != null) {
                                        i3 = R.id.transfer_filter_bottom_divider;
                                        View B = nq8.B(R.id.transfer_filter_bottom_divider, root);
                                        if (B != null) {
                                            return new evj((ConstraintLayout) root, frameLayout, textView, transferFilterScrollableHeaderView, B);
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i3)));
                        return null;
                    case 1:
                        return Float.valueOf(ao2.s(8, dvjVar.d));
                    default:
                        return Boolean.valueOf(dvjVar.getResources().getConfiguration().getLayoutDirection() == 1);
                }
            }
        });
        final int i2 = 1;
        this.g = ypa.b(new Function0(this) { // from class: cvj
            public final /* synthetic */ dvj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                dvj dvjVar = this.b;
                switch (i22) {
                    case 0:
                        View root = dvjVar.getRoot();
                        int i3 = R.id.filter_container;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.filter_container, root);
                        if (frameLayout != null) {
                            i3 = R.id.filter_icon;
                            if (((ImageView) nq8.B(R.id.filter_icon, root)) != null) {
                                i3 = R.id.filter_text;
                                TextView textView = (TextView) nq8.B(R.id.filter_text, root);
                                if (textView != null) {
                                    i3 = R.id.scrollable_view;
                                    TransferFilterScrollableHeaderView transferFilterScrollableHeaderView = (TransferFilterScrollableHeaderView) nq8.B(R.id.scrollable_view, root);
                                    if (transferFilterScrollableHeaderView != null) {
                                        i3 = R.id.transfer_filter_bottom_divider;
                                        View B = nq8.B(R.id.transfer_filter_bottom_divider, root);
                                        if (B != null) {
                                            return new evj((ConstraintLayout) root, frameLayout, textView, transferFilterScrollableHeaderView, B);
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i3)));
                        return null;
                    case 1:
                        return Float.valueOf(ao2.s(8, dvjVar.d));
                    default:
                        return Boolean.valueOf(dvjVar.getResources().getConfiguration().getLayoutDirection() == 1);
                }
            }
        });
        final int i3 = 2;
        this.h = ypa.b(new Function0(this) { // from class: cvj
            public final /* synthetic */ dvj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                dvj dvjVar = this.b;
                switch (i22) {
                    case 0:
                        View root = dvjVar.getRoot();
                        int i32 = R.id.filter_container;
                        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.filter_container, root);
                        if (frameLayout != null) {
                            i32 = R.id.filter_icon;
                            if (((ImageView) nq8.B(R.id.filter_icon, root)) != null) {
                                i32 = R.id.filter_text;
                                TextView textView = (TextView) nq8.B(R.id.filter_text, root);
                                if (textView != null) {
                                    i32 = R.id.scrollable_view;
                                    TransferFilterScrollableHeaderView transferFilterScrollableHeaderView = (TransferFilterScrollableHeaderView) nq8.B(R.id.scrollable_view, root);
                                    if (transferFilterScrollableHeaderView != null) {
                                        i32 = R.id.transfer_filter_bottom_divider;
                                        View B = nq8.B(R.id.transfer_filter_bottom_divider, root);
                                        if (B != null) {
                                            return new evj((ConstraintLayout) root, frameLayout, textView, transferFilterScrollableHeaderView, B);
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return Float.valueOf(ao2.s(8, dvjVar.d));
                    default:
                        return Boolean.valueOf(dvjVar.getResources().getConfiguration().getLayoutDirection() == 1);
                }
            }
        });
        ((HorizontalScrollView) getBinding().d.findViewById(R.id.horizontal_scroll)).setOnScrollChangeListener(new hye(this, i3));
        aba.y(getBinding().b, 0, 3);
        getBinding().b.setOnClickListener(new tii(this, 6));
    }

    private final evj getBinding() {
        return (evj) this.f.getValue();
    }

    private final float getDpToPx8() {
        return ((Number) this.g.getValue()).floatValue();
    }

    public static final void j(dvj dvjVar, int i) {
        dvjVar.getBinding().b.setElevation(i == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : dvjVar.getDpToPx8());
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.transfer_filter_header_view;
    }

    public final void setFilters(@NotNull PlayerTransferFilterData playerTransferFilterData) {
        int i;
        playerTransferFilterData.getClass();
        ArrayList<String> filterToStringList = playerTransferFilterData.filterToStringList(((Boolean) this.h.getValue()).booleanValue());
        getBinding().c.setVisibility(filterToStringList.isEmpty() ? 0 : 8);
        TransferFilterScrollableHeaderView transferFilterScrollableHeaderView = getBinding().d;
        d5k wtVar = new wt(7, playerTransferFilterData, this);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = filterToStringList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Context context = transferFilterScrollableHeaderView.getContext();
            context.getClass();
            str2.getClass();
            if (str2.equals("INCOMING")) {
                str = context.getString(R.string.incoming_transfers);
            } else if (str2.equals("OUTGOING")) {
                str = context.getString(R.string.outgoing_transfers);
            } else {
                String c = tv3.c(context, str2);
                if (!c.equals(str2)) {
                    str = c;
                }
            }
            if (str != null) {
                str2 = str;
            }
            arrayList.add(str2);
        }
        if (transferFilterScrollableHeaderView.e != null) {
            List<String> typesList = transferFilterScrollableHeaderView.getTypesList();
            Integer num = transferFilterScrollableHeaderView.d;
            String str3 = (String) CollectionsKt.a0(num != null ? num.intValue() : 0, typesList);
            if (str3 != null) {
                int indexOf = arrayList.indexOf(str3);
                Integer valueOf = indexOf >= 0 ? Integer.valueOf(indexOf) : null;
                if (valueOf != null) {
                    i = valueOf.intValue();
                    transferFilterScrollableHeaderView.d = Integer.valueOf(i);
                }
            }
            i = 0;
            transferFilterScrollableHeaderView.d = Integer.valueOf(i);
        }
        transferFilterScrollableHeaderView.setTypesList(arrayList);
        transferFilterScrollableHeaderView.setOnClickListener(wtVar);
        if (transferFilterScrollableHeaderView.getTypesList().size() == 0) {
            ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).a().setVisibility(8);
        } else if (transferFilterScrollableHeaderView.getTypesList().isEmpty()) {
            ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).a().setVisibility(8);
            transferFilterScrollableHeaderView.getTypesList().isEmpty();
        } else {
            ((mvg) ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).b.getValue()).c.removeAllViews();
            ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).a().setVisibility(0);
            ((mvg) ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).b.getValue()).b.setVisibility(0);
            int size = transferFilterScrollableHeaderView.getTypesList().size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = transferFilterScrollableHeaderView.getTypesList().get(i2);
                str4.getClass();
                Context context2 = transferFilterScrollableHeaderView.getContext();
                context2.getClass();
                kzg kzgVar = new kzg(str4, context2);
                kzgVar.setTag(transferFilterScrollableHeaderView.getTypesList().get(i2));
                ((mvg) ((kvg) transferFilterScrollableHeaderView.getLayoutProvider()).b.getValue()).c.addView(kzgVar);
                kzgVar.setOnClickListener(new l8(transferFilterScrollableHeaderView, i2, 0));
            }
            transferFilterScrollableHeaderView.j(-1);
        }
        if (filterToStringList.isEmpty()) {
            getBinding().b.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
