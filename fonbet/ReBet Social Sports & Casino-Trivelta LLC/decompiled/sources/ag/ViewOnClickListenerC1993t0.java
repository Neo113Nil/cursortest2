package ag;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import rd.C6218a;
import zf.C6963d;
import zf.C6966g;

/* renamed from: ag.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC1993t0 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15816Q4;

    /* renamed from: R4, reason: collision with root package name */
    public int f15817R4;

    /* renamed from: S4, reason: collision with root package name */
    public Message f15818S4;

    /* renamed from: T4, reason: collision with root package name */
    public ConstraintLayout f15819T4;

    /* renamed from: U4, reason: collision with root package name */
    public ImageView f15820U4;

    /* renamed from: V4, reason: collision with root package name */
    public cg.e f15821V4;

    /* renamed from: W4, reason: collision with root package name */
    public TextView f15822W4;

    /* renamed from: X4, reason: collision with root package name */
    public LinearLayout f15823X4;
    private final String[] level3EncodedReactions;
    private final int[] level3Reactions;
    private final int[] level3Text;
    private final String[] level5EncodedReactions;
    private final int[] level5Reactions;
    private final int[] level5Text;
    private ImageView[] levelImageViews;
    private LinearLayout[] levelParentView;
    private TextView[] levelTextViews;

    /* renamed from: ag.t0$a */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15824a;

        public a(Message message) {
            this.f15824a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewOnClickListenerC1993t0.this.f15821V4.M(this.f15824a);
        }
    }

    public ViewOnClickListenerC1993t0(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        this.levelParentView = new LinearLayout[5];
        this.levelImageViews = new ImageView[5];
        this.levelTextViews = new TextView[5];
        int i10 = od.p.f60198z3;
        int i11 = od.p.f60173u3;
        int i12 = od.p.f60168t3;
        this.level3Reactions = new int[]{i10, i11, i12};
        this.level5Reactions = new int[]{od.p.f60138n3, i10, od.p.f60193y3, i11, i12};
        int i13 = od.t.f61028g2;
        int i14 = od.t.f61014e2;
        int i15 = od.t.f61007d2;
        this.level3Text = new int[]{i13, i14, i15};
        this.level5Text = new int[]{od.t.f61000c2, i13, od.t.f61021f2, i14, i15};
        this.level3EncodedReactions = new String[]{":rating-sad:", ":rating-happy:", ":rating-excited:"};
        this.level5EncodedReactions = new String[]{":rating-angry:", ":rating-sad:", ":rating-neutral:", ":rating-happy:", ":rating-excited:"};
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15816Q4 = fVar;
        this.f15821V4 = eVar;
        this.f15819T4 = (ConstraintLayout) view.findViewById(od.q.f60680v3);
        this.f15820U4 = (ImageView) view.findViewById(od.q.f60484c2);
        this.f15823X4 = (LinearLayout) view.findViewById(od.q.f60495d2);
        this.levelParentView[0] = (LinearLayout) view.findViewById(od.q.f60252F2);
        this.levelParentView[1] = (LinearLayout) view.findViewById(od.q.f60282I2);
        this.levelParentView[2] = (LinearLayout) view.findViewById(od.q.f60312L2);
        this.levelParentView[3] = (LinearLayout) view.findViewById(od.q.f60342O2);
        this.levelParentView[4] = (LinearLayout) view.findViewById(od.q.f60372R2);
        this.levelImageViews[0] = (ImageView) view.findViewById(od.q.f60242E2);
        this.levelImageViews[1] = (ImageView) view.findViewById(od.q.f60272H2);
        this.levelImageViews[2] = (ImageView) view.findViewById(od.q.f60302K2);
        this.levelImageViews[3] = (ImageView) view.findViewById(od.q.f60332N2);
        this.levelImageViews[4] = (ImageView) view.findViewById(od.q.f60362Q2);
        this.levelTextViews[0] = (TextView) view.findViewById(od.q.f60262G2);
        this.levelTextViews[0].setTypeface(C6218a.P());
        this.levelTextViews[1] = (TextView) view.findViewById(od.q.f60292J2);
        this.levelTextViews[1].setTypeface(C6218a.P());
        this.levelTextViews[2] = (TextView) view.findViewById(od.q.f60322M2);
        this.levelTextViews[2].setTypeface(C6218a.P());
        this.levelTextViews[3] = (TextView) view.findViewById(od.q.f60352P2);
        this.levelTextViews[3].setTypeface(C6218a.P());
        this.levelTextViews[4] = (TextView) view.findViewById(od.q.f60382S2);
        this.levelTextViews[4].setTypeface(C6218a.P());
        TextView textView = (TextView) view.findViewById(od.q.f60506e2);
        this.f15822W4 = textView;
        textView.setTypeface(C6218a.P());
    }

    public static /* synthetic */ boolean Y1(TextView textView, View view) {
        if (textView.getLayout().getEllipsisCount(0) > 0) {
            androidx.appcompat.widget.f0.a(textView, textView.getText().toString());
        }
        return false;
    }

    public static int a2() {
        return MobilistenInitProvider.k().getResources().getConfiguration().orientation;
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        this.f15818S4 = message;
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15820U4.setVisibility(8);
        } else {
            this.f15820U4.setVisibility(0);
            wd.d.F(this.f15820U4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15820U4.setOnClickListener(new a(message));
        this.f15823X4.setVisibility(8);
        String formattedClientTime = message.getFormattedClientTime();
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f15819T4.getLayoutParams();
        if (z10) {
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
            this.f15819T4.setLayoutParams(bVar);
            this.f15822W4.setVisibility(8);
            R0().setVisibility(0);
            R0().setText(formattedClientTime);
        } else if (a2() == 2) {
            ((ViewGroup.MarginLayoutParams) bVar).width = (int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.9d);
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        }
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        this.f15819T4.setLayoutParams(bVar);
        if (message.isLastMessage()) {
            this.f15822W4.setVisibility(0);
            R0().setVisibility(8);
            this.f15822W4.setText(formattedClientTime);
        } else {
            this.f15822W4.setVisibility(8);
            R0().setVisibility(0);
            R0().setText(formattedClientTime);
        }
        if (salesIQChat == null || message.getMeta() == null || !message.isLastMessage()) {
            return;
        }
        if (salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5) {
            this.f15823X4.setVisibility(0);
            for (int i10 = 0; i10 < 5; i10++) {
                this.levelParentView[i10].setVisibility(8);
            }
            int intValue = (message.getMeta().getInputCard() == null || message.getMeta().getInputCard().getLevel() == null) ? -1 : message.getMeta().getInputCard().getLevel().intValue();
            this.f15817R4 = intValue;
            if (intValue == 3) {
                int i11 = 0;
                while (i11 < 3) {
                    LinearLayout linearLayout = this.levelParentView[i11];
                    TextView textView = this.levelTextViews[i11];
                    ImageView imageView = this.levelImageViews[i11];
                    linearLayout.setVisibility(0);
                    int i12 = i11 + 1;
                    linearLayout.setTag(Integer.valueOf(i12));
                    linearLayout.setOnClickListener(this);
                    linearLayout.setPadding(C6218a.b(20.0f), 0, C6218a.b(20.0f), 0);
                    b2(this.levelTextViews[i11]);
                    textView.setText(this.itemView.getContext().getResources().getString(this.level3Text[i11]));
                    textView.setTextSize(2, 15.0f);
                    imageView.setImageResource(this.level3Reactions[i11]);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.width = og.k.b(36);
                    layoutParams.height = og.k.b(36);
                    imageView.setLayoutParams(layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams2.width = -2;
                    this.levelParentView[i11].setLayoutParams(layoutParams2);
                    i11 = i12;
                }
                return;
            }
            if (intValue == 5) {
                int i13 = 0;
                while (i13 < 5) {
                    LinearLayout linearLayout2 = this.levelParentView[i13];
                    TextView textView2 = this.levelTextViews[i13];
                    ImageView imageView2 = this.levelImageViews[i13];
                    linearLayout2.setVisibility(0);
                    int i14 = i13 + 1;
                    linearLayout2.setTag(Integer.valueOf(i14));
                    linearLayout2.setOnClickListener(this);
                    linearLayout2.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                    layoutParams3.width = -2;
                    this.levelParentView[i13].setLayoutParams(layoutParams3);
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
                    layoutParams4.width = og.k.b(24);
                    layoutParams4.height = og.k.b(24);
                    imageView2.setLayoutParams(layoutParams4);
                    b2(textView2);
                    textView2.setText(this.level5Text[i13]);
                    textView2.setTextSize(2, 13.0f);
                    imageView2.setImageResource(this.level5Reactions[i13]);
                    i13 = i14;
                }
            }
        }
    }

    public final void b2(final TextView textView) {
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ag.s0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ViewOnClickListenerC1993t0.Y1(textView, view);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Message message;
        if (this.f15816Q4 == null || view.getTag() == null) {
            return;
        }
        int intValue = LiveChatUtil.getInteger(view.getTag()).intValue();
        int i10 = this.f15817R4;
        String str = i10 == 3 ? this.level3EncodedReactions[intValue - 1] : i10 == 5 ? this.level5EncodedReactions[intValue - 1] : null;
        Message.RespondedMessage respondedMessage = new Message.RespondedMessage(Message.g.WidgetHappinessRating, String.valueOf(intValue));
        if (!this.f15816Q4.P(str, respondedMessage.getType(), respondedMessage.getValue(), respondedMessage.getId()) || (message = this.f15818S4) == null) {
            return;
        }
        C6966g.H0(message.getChatId(), this.f15818S4.getId(), respondedMessage);
    }
}
