package ag;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import od.AbstractC5886l;
import rd.C6218a;
import zf.C6963d;

/* loaded from: classes4.dex */
public class a1 extends H implements View.OnClickListener {

    /* renamed from: Q4, reason: collision with root package name */
    public cg.f f15571Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ImageView f15572R4;

    /* renamed from: S4, reason: collision with root package name */
    public cg.e f15573S4;

    /* renamed from: T4, reason: collision with root package name */
    public LinearLayout f15574T4;

    /* renamed from: U4, reason: collision with root package name */
    public TextView f15575U4;
    private ImageView[] starImageViews;
    private RelativeLayout[] starParentViews;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Message f15576a;

        public a(Message message) {
            this.f15576a = message;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a1.this.f15573S4.M(this.f15576a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15578a;

        public b(int i10) {
            this.f15578a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.f15571Q4.P(String.valueOf(this.f15578a), Message.g.WidgetStarRating, String.valueOf(this.f15578a), null);
        }
    }

    public a1(View view, ConstraintLayout constraintLayout, cg.f fVar, cg.e eVar) {
        super(view);
        this.starParentViews = new RelativeLayout[10];
        this.starImageViews = new ImageView[10];
        super.K1(constraintLayout);
        super.U1(fVar);
        this.f15571Q4 = fVar;
        this.f15573S4 = eVar;
        this.f15572R4 = (ImageView) view.findViewById(od.q.f60517f2);
        this.f15574T4 = (LinearLayout) view.findViewById(od.q.f60560j3);
        this.starParentViews[0] = (RelativeLayout) view.findViewById(od.q.f60277H7);
        this.starParentViews[1] = (RelativeLayout) view.findViewById(od.q.f60297J7);
        this.starParentViews[2] = (RelativeLayout) view.findViewById(od.q.f60317L7);
        this.starParentViews[3] = (RelativeLayout) view.findViewById(od.q.f60337N7);
        this.starParentViews[4] = (RelativeLayout) view.findViewById(od.q.f60357P7);
        this.starParentViews[5] = (RelativeLayout) view.findViewById(od.q.f60377R7);
        this.starParentViews[6] = (RelativeLayout) view.findViewById(od.q.f60397T7);
        this.starParentViews[7] = (RelativeLayout) view.findViewById(od.q.f60417V7);
        this.starParentViews[8] = (RelativeLayout) view.findViewById(od.q.f60437X7);
        this.starParentViews[9] = (RelativeLayout) view.findViewById(od.q.f60267G7);
        this.starImageViews[0] = (ImageView) view.findViewById(od.q.f60247E7);
        this.starImageViews[1] = (ImageView) view.findViewById(od.q.f60287I7);
        this.starImageViews[2] = (ImageView) view.findViewById(od.q.f60307K7);
        this.starImageViews[3] = (ImageView) view.findViewById(od.q.f60327M7);
        this.starImageViews[4] = (ImageView) view.findViewById(od.q.f60347O7);
        this.starImageViews[5] = (ImageView) view.findViewById(od.q.f60367Q7);
        this.starImageViews[6] = (ImageView) view.findViewById(od.q.f60387S7);
        this.starImageViews[7] = (ImageView) view.findViewById(od.q.f60407U7);
        this.starImageViews[8] = (ImageView) view.findViewById(od.q.f60427W7);
        this.starImageViews[9] = (ImageView) view.findViewById(od.q.f60257F7);
        TextView textView = (TextView) view.findViewById(od.q.f60447Y7);
        this.f15575U4 = textView;
        textView.setTypeface(C6218a.P());
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        super.F1(salesIQChat, message);
        boolean z10 = true;
        C6963d.y(O0(), message.getContent(), message, w1(), !message.isLastMessage());
        boolean z11 = false;
        if (message.getMeta() == null || message.getMeta().getDisplayCard() == null || message.getMeta().getDisplayCard().getImage() == null) {
            this.f15572R4.setVisibility(8);
        } else {
            this.f15572R4.setVisibility(0);
            wd.d.F(this.f15572R4, message.getMeta().getDisplayCard().getImage(), Float.valueOf(10.0f));
            z10 = false;
        }
        this.f15572R4.setOnClickListener(new a(message));
        if (message.isLastMessage() && salesIQChat != null && (salesIQChat.getStatus() == 2 || salesIQChat.getStatus() == 6 || salesIQChat.getStatus() == 5)) {
            this.f15574T4.setVisibility(0);
            int intValue = message.getMeta().getInputCard().getLevel().intValue();
            b2(intValue);
            for (int i10 = 0; i10 < intValue; i10++) {
                this.starImageViews[i10].setImageDrawable(LiveChatUtil.changeDrawableColor(this.itemView.getContext(), od.p.f59957C3, com.zoho.livechat.android.utils.P.e(this.itemView.getContext(), AbstractC5886l.f59769T)));
            }
            a2(intValue);
            for (RelativeLayout relativeLayout : this.starParentViews) {
                if (relativeLayout.getVisibility() == 0) {
                    relativeLayout.setOnClickListener(this);
                }
            }
        } else {
            this.f15574T4.setVisibility(8);
            z11 = z10;
        }
        T1(message, z11, this.f15575U4);
    }

    public final void a2(int i10) {
        int i11 = 0;
        if (i10 >= 3 && i10 <= 5) {
            while (i11 < i10) {
                ImageView imageView = this.starImageViews[i11];
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C6218a.b(27.0f), C6218a.b(27.0f));
                int b10 = C6218a.b(9.0f);
                layoutParams.setMargins(b10, b10, b10, b10);
                imageView.setLayoutParams(layoutParams);
                i11++;
            }
            return;
        }
        if (i10 == 6) {
            while (i11 < i10) {
                ImageView imageView2 = this.starImageViews[i11];
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C6218a.b(25.0f), C6218a.b(25.0f));
                int b12 = H.b1();
                layoutParams2.setMargins(b12, b12, b12, b12);
                imageView2.setLayoutParams(layoutParams2);
                i11++;
            }
            return;
        }
        if (i10 == 7) {
            while (i11 < i10) {
                ImageView imageView3 = this.starImageViews[i11];
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C6218a.b(23.0f), C6218a.b(23.0f));
                int b11 = C6218a.b(6.0f);
                layoutParams3.setMargins(b11, b11, b11, b11);
                imageView3.setLayoutParams(layoutParams3);
                i11++;
            }
            return;
        }
        if (i10 == 8) {
            while (i11 < i10) {
                ImageView imageView4 = this.starImageViews[i11];
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C6218a.b(22.0f), C6218a.b(22.0f));
                int b13 = C6218a.b(6.0f);
                layoutParams4.setMargins(b13, b13, b13, b13);
                imageView4.setLayoutParams(layoutParams4);
                i11++;
            }
            return;
        }
        if (i10 >= 9) {
            while (i11 < i10) {
                ImageView imageView5 = this.starImageViews[i11];
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(H.Y0(), H.Y0());
                int b14 = C6218a.b(3.0f);
                layoutParams5.setMargins(b14, b14, b14, b14);
                imageView5.setLayoutParams(layoutParams5);
                i11++;
            }
        }
    }

    public final void b2(int i10) {
        int i11 = 0;
        while (i11 < 10) {
            RelativeLayout relativeLayout = this.starParentViews[i11];
            i11++;
            relativeLayout.setTag(Integer.valueOf(i11));
            relativeLayout.setVisibility(8);
        }
        switch (i10) {
            case 10:
                this.starParentViews[9].setVisibility(0);
            case 9:
                this.starParentViews[8].setVisibility(0);
            case 8:
                this.starParentViews[7].setVisibility(0);
            case 7:
                this.starParentViews[6].setVisibility(0);
            case 6:
                this.starParentViews[5].setVisibility(0);
            case 5:
                this.starParentViews[4].setVisibility(0);
            case 4:
                this.starParentViews[3].setVisibility(0);
            case 3:
                this.starParentViews[2].setVisibility(0);
                this.starParentViews[1].setVisibility(0);
                this.starParentViews[0].setVisibility(0);
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() == null) {
            return;
        }
        int intValue = LiveChatUtil.getInteger(view.getTag()).intValue();
        for (int i10 = 0; i10 < intValue; i10++) {
            this.starImageViews[i10].setImageDrawable(LiveChatUtil.changeDrawableColor(this.itemView.getContext(), od.p.f59957C3, com.zoho.livechat.android.utils.P.e(this.itemView.getContext(), AbstractC5886l.f59765S)));
        }
        if (intValue != 10) {
            for (int i11 = intValue; i11 < 10; i11++) {
                this.starImageViews[i11].setImageDrawable(LiveChatUtil.changeDrawableColor(this.itemView.getContext(), od.p.f59957C3, com.zoho.livechat.android.utils.P.e(this.itemView.getContext(), AbstractC5886l.f59769T)));
            }
        }
        if (this.f15571Q4 != null) {
            new Handler().postDelayed(new b(intValue), 100L);
        }
    }
}
