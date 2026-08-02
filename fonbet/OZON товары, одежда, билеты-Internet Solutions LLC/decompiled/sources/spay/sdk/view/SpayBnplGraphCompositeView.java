package spay.sdk.view;

import B1.C2548q;
import Ve.C4501oe;
import Ve.C4643tc;
import Ve.C4814zd;
import Ve.Gf;
import Ve.Vc;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lspay/sdk/view/SpayBnplGraphCompositeView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LVe/Gf;", "a", "LVe/Gf;", "getBinding", "()LVe/Gf;", "binding", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayBnplGraphCompositeView extends LinearLayoutCompat {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f98877d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Gf binding;

    /* renamed from: b, reason: collision with root package name */
    public final C4643tc f98879b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f98880c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i11, int i12) {
        if (i11 <= 0 || i11 > 8) {
            return;
        }
        this.f98880c.clear();
        int i13 = 0;
        while (i13 < i11) {
            this.f98880c.add(new Vc(i13 == i12));
            i13++;
        }
        this.f98879b.submitList(this.f98880c);
        this.f98879b.notifyDataSetChanged();
    }

    @NotNull
    public final Gf getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpayBnplGraphCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayBnplGraphCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_order_view, (ViewGroup) this, false);
        addView(inflate);
        int i12 = R.id.spay_sclbov_graph;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i12, inflate);
        if (recyclerView != null) {
            Gf gf2 = new Gf((LinearLayoutCompat) inflate);
            Intrinsics.checkNotNullExpressionValue(gf2, "inflate(\n        LayoutI… this,\n        true\n    )");
            this.binding = gf2;
            C4814zd diffUtilCallback = new C4814zd();
            Intrinsics.checkNotNullParameter(diffUtilCallback, "diffUtilCallback");
            C4643tc c4643tc = new C4643tc(null, diffUtilCallback);
            this.f98879b = c4643tc;
            this.f98880c = new ArrayList();
            recyclerView.setAdapter(c4643tc);
            int i13 = R.dimen.spay_6dp;
            Intrinsics.checkNotNullParameter(context, "<this>");
            recyclerView.addItemDecoration(new C4501oe(context.getResources().getDimensionPixelSize(i13)));
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SpayBnplGraphCompositeView, 0, 0);
                Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…GraphCompositeView, 0, 0)");
                a(obtainStyledAttributes.getInt(R.styleable.SpayBnplGraphCompositeView_spay_graph_size, 4), 0);
                obtainStyledAttributes.recycle();
                return;
            }
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
