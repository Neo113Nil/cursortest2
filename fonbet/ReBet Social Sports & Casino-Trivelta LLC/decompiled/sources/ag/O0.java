package ag;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.flexbox.FlexboxLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.Hashtable;
import od.AbstractC5886l;
import rd.C6218a;
import ug.AbstractC6574b;
import zf.C6963d;

/* loaded from: classes4.dex */
public class O0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15422Q4;

    /* renamed from: R4, reason: collision with root package name */
    public Message.g f15423R4;

    /* renamed from: S4, reason: collision with root package name */
    public ArrayList f15424S4;

    /* renamed from: T4, reason: collision with root package name */
    public ArrayList f15425T4;

    /* renamed from: U4, reason: collision with root package name */
    public ImageView f15426U4;

    /* renamed from: V4, reason: collision with root package name */
    public ImageView f15427V4;

    /* renamed from: W4, reason: collision with root package name */
    public FlexboxLayout f15428W4;

    /* renamed from: X4, reason: collision with root package name */
    public LinearLayout f15429X4;

    /* renamed from: Y4, reason: collision with root package name */
    public final RelativeLayout f15430Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public final ConstraintLayout f15431Z4;

    /* renamed from: a5, reason: collision with root package name */
    public TextView f15432a5;

    /* renamed from: b5, reason: collision with root package name */
    public cg.e f15433b5;

    /* renamed from: c5, reason: collision with root package name */
    public boolean f15434c5;

    /* renamed from: d5, reason: collision with root package name */
    public TextView f15435d5;

    /* renamed from: e5, reason: collision with root package name */
    public int f15436e5;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15437a;

        public a(Message message) {
            this.f15437a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            O0.this.f15433b5.M(this.f15437a);
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15439a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15440b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f15441c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f15442d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f15443e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ CardView f15444f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f15445g;

        public b(String str, String str2, LinearLayout linearLayout, TextView textView, int i10, CardView cardView, int i11) {
            this.f15439a = str;
            this.f15440b = str2;
            this.f15441c = linearLayout;
            this.f15442d = textView;
            this.f15443e = i10;
            this.f15444f = cardView;
            this.f15445g = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message.g gVar = O0.this.f15423R4;
            Message.g gVar2 = Message.g.WidgetSingleSelection;
            if (gVar == gVar2) {
                if (O0.this.f15422Q4 != null) {
                    cg.f fVar = O0.this.f15422Q4;
                    String str = this.f15439a;
                    fVar.P(str, gVar2, str, this.f15440b);
                    return;
                }
                return;
            }
            if (this.f15440b == null) {
                if (O0.this.f15424S4.contains(this.f15439a)) {
                    O0.this.f15424S4.remove(this.f15439a);
                    LinearLayout linearLayout = this.f15441c;
                    linearLayout.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59745N));
                    TextView textView = this.f15442d;
                    textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59749O));
                } else if (this.f15443e == 0 || O0.this.f15424S4.size() != this.f15443e) {
                    O0.this.f15424S4.add(this.f15439a);
                    LinearLayout linearLayout2 = this.f15441c;
                    linearLayout2.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout2.getContext(), AbstractC5886l.f59737L));
                    TextView textView2 = this.f15442d;
                    textView2.setTextColor(com.zoho.livechat.android.utils.P.e(textView2.getContext(), AbstractC5886l.f59741M));
                } else {
                    Toast.makeText(this.f15444f.getContext(), od.t.f61035h2, 0).show();
                }
                if (O0.this.f15424S4.size() < this.f15445g) {
                    O0.this.f15432a5.setAlpha(0.38f);
                    return;
                } else {
                    O0.this.f15432a5.setAlpha(1.0f);
                    return;
                }
            }
            int i10 = 0;
            while (true) {
                if (i10 < O0.this.f15425T4.size()) {
                    Hashtable hashtable = (Hashtable) O0.this.f15425T4.get(i10);
                    if (hashtable != null && this.f15439a.equalsIgnoreCase(LiveChatUtil.getString(hashtable.get("text")))) {
                        O0.this.f15425T4.remove(i10);
                        LinearLayout linearLayout3 = this.f15441c;
                        linearLayout3.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout3.getContext(), AbstractC5886l.f59745N));
                        TextView textView3 = this.f15442d;
                        textView3.setTextColor(com.zoho.livechat.android.utils.P.e(textView3.getContext(), AbstractC5886l.f59749O));
                        break;
                    }
                    i10++;
                } else if (this.f15443e == 0 || O0.this.f15425T4.size() != this.f15443e) {
                    Hashtable hashtable2 = new Hashtable();
                    hashtable2.put(StackTraceHelper.ID_KEY, this.f15440b);
                    hashtable2.put("text", this.f15439a);
                    O0.this.f15425T4.add(hashtable2);
                    LinearLayout linearLayout4 = this.f15441c;
                    linearLayout4.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout4.getContext(), AbstractC5886l.f59737L));
                    TextView textView4 = this.f15442d;
                    textView4.setTextColor(com.zoho.livechat.android.utils.P.e(textView4.getContext(), AbstractC5886l.f59741M));
                } else {
                    Toast.makeText(this.f15444f.getContext(), od.t.f61035h2, 0).show();
                }
            }
            if (O0.this.f15425T4.size() < this.f15445g) {
                O0.this.f15432a5.setAlpha(0.38f);
            } else {
                O0.this.f15432a5.setAlpha(1.0f);
            }
        }
    }

    public O0(View view, ConstraintLayout constraintLayout, cg.f fVar, Message.g gVar, cg.e eVar) {
        super(view);
        this.f15424S4 = new ArrayList();
        this.f15425T4 = new ArrayList();
        this.f15434c5 = false;
        this.f15436e5 = 1;
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15422Q4 = fVar;
        this.f15423R4 = gVar;
        this.f15433b5 = eVar;
        this.f15426U4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15428W4 = (FlexboxLayout) view.findViewById(od.q.f60518f3);
        this.f15431Z4 = (ConstraintLayout) view.findViewById(od.q.f60663t6);
        this.f15430Y4 = (RelativeLayout) view.findViewById(od.q.f60612o5);
        this.f15427V4 = (ImageView) view.findViewById(od.q.f60602n5);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(od.q.f60371R1);
        this.f15429X4 = linearLayout;
        linearLayout.getBackground().setColorFilter(com.zoho.livechat.android.utils.P.e(this.f15429X4.getContext(), AbstractC5886l.f59721H), PorterDuff.Mode.SRC_ATOP);
        this.f15429X4.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(od.q.f60391T1);
        this.f15432a5 = textView;
        textView.setTypeface(C6218a.C());
        TextView textView2 = (TextView) view.findViewById(od.q.f60644r7);
        this.f15435d5 = textView2;
        textView2.setTypeface(C6218a.P());
    }

    public static /* synthetic */ void Y1(O0 o02, Message message, View view) {
        if (o02.f15433b5 == null || message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getLinkInfo() == null || message.getMeta().getDisplayCard().getLinkInfo().getUrl() == null) {
            return;
        }
        LiveChatUtil.openUrl(LiveChatUtil.getString(message.getMeta().getDisplayCard().getLinkInfo().getUrl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0242  */
    @Override // ag.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F1(SalesIQChat salesIQChat, final Message message) {
        boolean z10;
        View f22;
        super.F1(salesIQChat, message);
        this.f15424S4.clear();
        this.f15425T4.clear();
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        this.f15431Z4.setVisibility(8);
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || (message.getMeta().getDisplayCard().getImage() == null && (message.getMeta().getDisplayCard().getLinkInfo() == null || message.getMeta().getDisplayCard().getLinkInfo().getThumbnailUrl() == null))) {
            this.f15426U4.setVisibility(8);
            z10 = true;
        } else {
            String image = message.getMeta().getDisplayCard().getImage();
            if (message.getMeta().getDisplayCard().getType() == Message.g.WidgetVideo) {
                if (message.getMeta() != null && message.getMeta().getDisplayCard() != null && message.getMeta().getDisplayCard().getLinkInfo() != null) {
                    image = LiveChatUtil.getString(message.getMeta().getDisplayCard().getLinkInfo().getThumbnailUrl());
                }
                this.f15431Z4.setVisibility(0);
                this.f15427V4.setImageResource(od.p.f60134n);
                this.f15427V4.setPadding(0, 0, 0, 0);
                this.f15430Y4.setOnClickListener(new View.OnClickListener() { // from class: ag.N0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        O0.Y1(O0.this, message, view);
                    }
                });
            }
            this.f15426U4.setVisibility(0);
            wd.d.F(this.f15426U4, image, Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15426U4.setOnClickListener(new a(message));
        this.f15428W4.setVisibility(8);
        this.f15429X4.setVisibility(8);
        this.f15428W4.setPadding(0, 0, 0, 0);
        if (message.getMeta() != null && message.isLastMessage() && salesIQChat != null && ((salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) && message.getMeta().getInputCard() != null)) {
            this.f15436e5 = message.getMeta().getInputCard().getMinimumSelection();
            this.f15428W4.removeAllViews();
            com.google.gson.e c10 = message.getMeta().getInputCard().getOptions() != null ? message.getMeta().getInputCard().getOptions().c() : null;
            if (c10 != null && !c10.isEmpty()) {
                this.f15428W4.setPadding(0, 0, 0, H.U0());
                this.f15428W4.setVisibility(0);
                if (this.f15423R4 == Message.g.WidgetMultiSelect) {
                    this.f15429X4.setVisibility(0);
                    if (this.f15424S4.size() < message.getMeta().getInputCard().getMinimumSelection()) {
                        this.f15432a5.setAlpha(0.38f);
                    } else {
                        this.f15432a5.setAlpha(1.0f);
                    }
                }
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    com.google.gson.h o10 = c10.o(i10);
                    if (o10 != null && !o10.j()) {
                        if (o10.k()) {
                            this.f15434c5 = true;
                            f22 = f2(o10.e().r("text").h(), o10.e().r(StackTraceHelper.ID_KEY).h(), message.getMeta().getInputCard().getMinimumSelection(), message.getMeta().getInputCard().getMaximumSelection());
                        } else {
                            f22 = !o10.j() ? f2(o10.h(), null, message.getMeta().getInputCard().getMinimumSelection(), message.getMeta().getInputCard().getMaximumSelection()) : null;
                        }
                        if (f22 != null) {
                            this.f15428W4.addView(f22);
                        }
                    }
                }
                T1(message, z11, this.f15435d5);
                if (this.f15429X4.getVisibility() != 0) {
                    g2(4);
                    return;
                } else {
                    g2(10);
                    return;
                }
            }
        }
        z11 = z10;
        T1(message, z11, this.f15435d5);
        if (this.f15429X4.getVisibility() != 0) {
        }
    }

    public final View f2(String str, String str2, int i10, int i11) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f15428W4.getContext());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        CardView cardView = new CardView(this.f15428W4.getContext());
        cardView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        cardView.setRadius(H.Y0());
        cardView.setCardElevation(0.0f);
        cardView.setCardBackgroundColor(0);
        LinearLayout linearLayout = new LinearLayout(this.f15428W4.getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        LiveChatUtil.applySelectableItemBackground(linearLayout);
        linearLayout.setMinimumWidth(C6218a.b(42.0f));
        linearLayout.setGravity(1);
        Message.g gVar = this.f15423R4;
        Message.g gVar2 = Message.g.WidgetSingleSelection;
        if (gVar == gVar2) {
            linearLayout.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59781W));
        } else {
            linearLayout.setBackgroundColor(com.zoho.livechat.android.utils.P.e(linearLayout.getContext(), AbstractC5886l.f59745N));
        }
        linearLayout.setClickable(true);
        TextView textView = new TextView(this.f15428W4.getContext());
        textView.setTypeface(C6218a.P());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(H.W0(), H.b1(), H.W0(), H.b1());
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(2, 14.0f);
        if (this.f15423R4 == gVar2) {
            textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59777V));
        } else {
            textView.setTextColor(com.zoho.livechat.android.utils.P.e(textView.getContext(), AbstractC5886l.f59749O));
        }
        textView.setText(str);
        textView.setTypeface(C6218a.P());
        linearLayout.setOnClickListener(new b(str, str2, linearLayout, textView, i11, cardView, i10));
        linearLayout.addView(textView);
        cardView.addView(linearLayout);
        relativeLayout.addView(cardView);
        return relativeLayout;
    }

    public final void g2(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15435d5.getLayoutParams();
        marginLayoutParams.bottomMargin = C6218a.b(i10);
        this.f15435d5.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        cg.f fVar;
        if (view.getId() == this.f15429X4.getId()) {
            if (this.f15432a5.getAlpha() != 1.0f) {
                X1(this.f15436e5);
                return;
            }
            if (!this.f15434c5) {
                if (this.f15424S4.isEmpty() || (fVar = this.f15422Q4) == null) {
                    return;
                }
                fVar.P(TextUtils.join(", ", this.f15424S4), Message.g.WidgetMultiSelect, AbstractC6574b.g(this.f15424S4), null);
                return;
            }
            if (this.f15425T4.isEmpty() || this.f15422Q4 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f15425T4.size(); i10++) {
                arrayList.add((String) ((Hashtable) this.f15425T4.get(i10)).get("text"));
            }
            this.f15422Q4.P(TextUtils.join(", ", arrayList), Message.g.WidgetMultiSelect, AbstractC6574b.g(this.f15425T4), null);
        }
    }
}
