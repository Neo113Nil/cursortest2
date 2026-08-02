package ag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5886l;
import og.AbstractC5892d;
import zf.C6963d;

/* renamed from: ag.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1967g extends H {

    /* renamed from: Q4, reason: collision with root package name */
    public View f15634Q4;

    /* renamed from: R4, reason: collision with root package name */
    public ConstraintLayout f15635R4;

    /* renamed from: S4, reason: collision with root package name */
    public TextView f15636S4;

    /* renamed from: T4, reason: collision with root package name */
    public ImageView f15637T4;

    /* renamed from: U4, reason: collision with root package name */
    public Group f15638U4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1967g(View itemView, ViewGroup currentMessageLayout, final cg.e eVar) {
        super(itemView, eVar);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(currentMessageLayout, "currentMessageLayout");
        K1(currentMessageLayout);
        View findViewById = itemView.findViewById(od.q.f60548i1);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, H.V0(), H.V0(), H.V0(), H.V0()};
        Context context = findViewById.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int h10 = AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59827g), 0.0f, 2, null);
        Intrinsics.checkNotNull(findViewById);
        og.p.v(findViewById, h10, fArr, null, false, 0, 28, null);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ag.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1967g.Y1(C1967g.this, eVar, view);
            }
        });
        this.f15634Q4 = findViewById;
        this.f15635R4 = (ConstraintLayout) itemView.findViewById(od.q.f60558j1);
        ImageView imageView = (ImageView) itemView.findViewById(od.q.f60516f1);
        this.f15637T4 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ag.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1967g.a2(cg.e.this, this, view);
                }
            });
        }
        this.f15636S4 = (TextView) itemView.findViewById(od.q.f60538h1);
        this.f15638U4 = (Group) itemView.findViewById(od.q.f60527g1);
    }

    public static void Y1(C1967g this$0, cg.e eVar, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Message q02 = this$0.q0();
        if (q02 == null || eVar == null) {
            return;
        }
        eVar.e(q02);
    }

    public static final void a2(cg.e eVar, C1967g this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (eVar != null) {
            eVar.M(this$0.q0());
        }
    }

    @Override // ag.H
    public void F1(SalesIQChat salesIQChat, Message message) {
        Unit unit;
        Message.Meta.DisplayCard displayCard;
        String image;
        Intrinsics.checkNotNullParameter(message, "message");
        M1(message);
        super.F1(salesIQChat, message);
        C6963d.b bVar = C6963d.f68921i;
        TextView O02 = O0();
        Intrinsics.checkNotNull(O02);
        C6963d.b.x(bVar, O02, message.getContent(), message, w1(), false, false, 48, null);
        Message.Meta meta = message.getMeta();
        if (meta == null || (displayCard = meta.getDisplayCard()) == null || (image = displayCard.getImage()) == null) {
            unit = null;
        } else {
            og.p.w(this.f15637T4);
            ImageView imageView = this.f15637T4;
            Intrinsics.checkNotNull(imageView);
            wd.d.K(imageView, image, Float.valueOf(10.0f), false, false, null, null, null, null, null, false, null, 4088, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            og.p.n(this.f15637T4);
        }
        if (salesIQChat != null && salesIQChat.getStatus() == 2 && message.isLastMessage()) {
            og.p.w(this.f15638U4);
        } else {
            og.p.n(this.f15638U4);
        }
    }
}
