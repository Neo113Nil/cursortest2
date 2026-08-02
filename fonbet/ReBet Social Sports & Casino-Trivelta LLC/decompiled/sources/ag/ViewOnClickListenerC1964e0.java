package ag;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import l.AbstractC5335a;
import n.AbstractC5596a;
import od.AbstractC5886l;
import rd.C6218a;

/* renamed from: ag.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC1964e0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public LinearLayout f15615Q4;

    /* renamed from: R4, reason: collision with root package name */
    public TextView f15616R4;

    /* renamed from: S4, reason: collision with root package name */
    public TextView f15617S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15618T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15619U4;

    /* renamed from: V4, reason: collision with root package name */
    public TextView f15620V4;

    /* renamed from: W4, reason: collision with root package name */
    public View f15621W4;

    /* renamed from: ag.e0$b */
    public class b implements L4.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Drawable f15623a;

        public b(Drawable drawable) {
            this.f15623a = drawable;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable drawable, Object obj, M4.j jVar, com.bumptech.glide.load.a aVar, boolean z10) {
            return false;
        }

        @Override // L4.g
        public boolean k(com.bumptech.glide.load.engine.q qVar, Object obj, M4.j jVar, boolean z10) {
            ViewOnClickListenerC1964e0.this.f15618T4.setImageDrawable(this.f15623a);
            return true;
        }
    }

    public ViewOnClickListenerC1964e0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view, eVar);
        super.K1(constraintLayout);
        super.U1(fVar);
        constraintLayout.setMinWidth(F0());
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60319M);
        this.f15615Q4 = linearLayout;
        linearLayout.setOnLongClickListener(t0());
        this.f15621W4 = view.findViewById(od.q.f60502d9);
        LinearLayout linearLayout2 = this.f15615Q4;
        linearLayout2.setBackground(com.zoho.livechat.android.utils.P.d(0, com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59827g), H.W0(), 0, -1));
        TextView textView = (TextView) view.findViewById(od.q.f60309L);
        this.f15616R4 = textView;
        textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5335a.f55002q));
        this.f15616R4.setTypeface(C6218a.C());
        TextView textView2 = (TextView) view.findViewById(od.q.f60299K);
        this.f15617S4 = textView2;
        textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), R.attr.textColorPrimary));
        this.f15617S4.setTypeface(C6218a.C());
        this.f15618T4 = (ImageView) view.findViewById(od.q.f60546i);
        TextView textView3 = (TextView) view.findViewById(od.q.f60536h);
        this.f15619U4 = textView3;
        textView3.setTextColor(com.zoho.livechat.android.utils.P.e(textView3.getContext(), R.attr.textColorSecondary));
        this.f15619U4.setTypeface(C6218a.P());
        TextView textView4 = (TextView) view.findViewById(od.q.f60584l7);
        this.f15620V4 = textView4;
        textView4.setTextColor(com.zoho.livechat.android.utils.P.e(textView4.getContext(), AbstractC5886l.f59809c1));
        this.f15620V4.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f15621W4.getLayoutParams();
        if (message.getReplyTo() != null) {
            ((ViewGroup.MarginLayoutParams) bVar).height = C6218a.b(2.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).width = C6218a.b(1.0f);
        }
        this.f15621W4.setLayoutParams(bVar);
        if (message.getMeta() != null && message.getMeta().getResourceType() != null) {
            if (message.getMeta().getLastModifier() != null) {
                Message.User lastModifier = message.getMeta().getLastModifier();
                this.f15619U4.setText(lastModifier.getName());
                Z1(LiveChatUtil.getString(lastModifier.getId()));
            } else if (message.getMeta().getCreator() != null) {
                Message.User creator = message.getMeta().getCreator();
                this.f15619U4.setText(creator.getName());
                Z1(LiveChatUtil.getString(creator.getId()));
            }
            String resourceType = message.getMeta().getResourceType();
            if (resourceType != null && resourceType.equalsIgnoreCase("article")) {
                TextView textView = this.f15616R4;
                textView.setText(textView.getContext().getResources().getString(od.t.f61095q));
            }
            this.f15617S4.setText(message.getMeta().getResourceTitle());
            this.f15620V4.setText(message.getFormattedClientTime());
        }
        n0().setOnClickListener(new View.OnClickListener() { // from class: ag.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC1964e0.this.onClick(view);
            }
        });
        this.f15615Q4.setOnClickListener(new View.OnClickListener() { // from class: ag.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC1964e0.this.onClick(view);
            }
        });
    }

    public final void Z1(String str) {
        this.f15618T4.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15618T4.getContext(), AbstractC5886l.f59827g), PorterDuff.Mode.SRC_ATOP);
        Drawable b10 = "DARK".equalsIgnoreCase(com.zoho.livechat.android.utils.P.j(this.f15618T4.getContext())) ? AbstractC5596a.b(this.f15618T4.getContext(), od.p.f60127l2) : AbstractC5596a.b(this.f15618T4.getContext(), od.p.f60132m2);
        this.f15618T4.setImageDrawable(b10);
        if (str != null) {
            wd.d.I(this.f15618T4, sd.d.b(str, false), null, true, true, new b(b10), null, b10, str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (q0().getMeta() == null || q0().getMeta().getResourceId() == null) {
            return;
        }
        ZohoSalesIQ.g.m(ZohoSalesIQ.k.Articles, q0().getMeta().getResourceId(), new a());
    }

    /* renamed from: ag.e0$a */
    public class a implements OpenResourceListener {
        public a() {
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onFailure(int i10, String str) {
            MobilistenUtil mobilistenUtil = MobilistenUtil.f44407a;
            MobilistenUtil.x(ViewOnClickListenerC1964e0.this.itemView.getContext().getString(od.t.f61091p2));
        }

        @Override // com.zoho.livechat.android.modules.knowledgebase.ui.listeners.OpenResourceListener
        public void onSuccess() {
        }
    }
}
