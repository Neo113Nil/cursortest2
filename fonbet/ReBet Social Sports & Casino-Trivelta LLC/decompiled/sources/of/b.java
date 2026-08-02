package of;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.utils.P;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5886l;
import od.p;
import od.q;
import od.t;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class b extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f61218a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f61219b;

    /* renamed from: c, reason: collision with root package name */
    public final View f61220c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatImageView f61221d;

    /* renamed from: e, reason: collision with root package name */
    public SalesIQResource.c f61222e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61223f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SalesIQResource.c.a.values().length];
            try {
                iArr[SalesIQResource.c.a.Article.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SalesIQResource.c.a.FAQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SalesIQResource.c.b.values().length];
            try {
                iArr2[SalesIQResource.c.b.Resource.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SalesIQResource.c.b.Category.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SalesIQResource.c.b.Department.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SalesIQResource.c.b.RecentlyViewed.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SalesIQResource.c.b.RecentlyViewedFromSearch.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SalesIQResource.c.b.Related.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView, Function1 onHeaderClick) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onHeaderClick, "onHeaderClick");
        this.f61218a = onHeaderClick;
        View findViewById = itemView.findViewById(q.f60574k7);
        TextView textView = (TextView) findViewById;
        textView.setTypeface(C6218a.C());
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f61219b = textView;
        View findViewById2 = itemView.findViewById(q.f60564j7);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f61221d = (AppCompatImageView) findViewById2;
        this.f61223f = true;
        View findViewById3 = itemView.findViewById(q.f60554i7);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: of.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.b(b.this, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f61220c = findViewById3;
    }

    public static void b(b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SalesIQResource.c cVar = this$0.f61222e;
        if (cVar != null) {
            Intrinsics.checkNotNull(cVar);
            if (cVar.c()) {
                SalesIQResource.c cVar2 = this$0.f61222e;
                Intrinsics.checkNotNull(cVar2);
                if (a.$EnumSwitchMapping$0[cVar2.a().ordinal()] == 1) {
                    Function1 function1 = this$0.f61218a;
                    SalesIQResource.c cVar3 = this$0.f61222e;
                    Intrinsics.checkNotNull(cVar3);
                    function1.invoke(cVar3.b());
                }
            }
        }
        boolean z10 = this$0.f61223f;
        this$0.f61223f = !z10;
        if (z10) {
            this$0.f61221d.setImageResource(p.f59948B);
        } else {
            this$0.f61221d.setImageResource(p.f59943A);
        }
    }

    public final void c(SalesIQResource.c itemHeader, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(itemHeader, "itemHeader");
        this.f61222e = itemHeader;
        this.f61223f = z10;
        if (itemHeader.c()) {
            og.p.w(this.f61221d);
            og.p.v(this.f61220c, P.e(this.itemView.getContext(), AbstractC5886l.f59827g), null, null, false, 0, 30, null);
        } else {
            this.f61220c.setBackground(new ColorDrawable(P.e(this.itemView.getContext(), AbstractC5886l.f59827g)));
            og.p.n(this.f61221d);
        }
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), i10 == 0 ? 0 : itemHeader.b() == SalesIQResource.c.b.RecentlyViewed ? C6218a.b(8.0f) : C6218a.b(16.0f), view.getPaddingRight(), view.getPaddingBottom());
        if (z10) {
            this.f61221d.setImageResource(p.f59943A);
        } else {
            this.f61221d.setImageResource(p.f59948B);
        }
        if (a.$EnumSwitchMapping$0[itemHeader.a().ordinal()] != 1) {
            return;
        }
        switch (a.$EnumSwitchMapping$1[itemHeader.b().ordinal()]) {
            case 1:
                this.f61219b.setText(t.f61045i5);
                break;
            case 2:
                this.f61219b.setText(t.f61052j5);
                break;
            case 3:
                this.f61219b.setText(t.f61084o2);
                break;
            case 4:
                this.f61219b.setText(t.f60997c);
                break;
            case 5:
                this.f61219b.setText(t.f60990b);
                break;
            case 6:
                this.f61219b.setText(t.f60989a5);
                break;
        }
    }
}
