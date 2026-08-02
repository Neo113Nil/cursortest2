package ru.ozon.fintech.features.operations.ui.actioncard;

import AI.b;
import C.D;
import G70.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/operations/ui/actioncard/ActionCardView;", "Landroid/widget/LinearLayout;", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionCardView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f96089a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f96090b;

    /* renamed from: c, reason: collision with root package name */
    private a f96091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionCardView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.action_card_layout, this);
        setOrientation(1);
        this.f96089a = (TextView) findViewById(R.id.tv_action_title);
        this.f96090b = (ImageView) findViewById(R.id.iv_icon);
        setMinimumHeight(D.c(104.0f));
        setForeground(androidx.core.content.a.getDrawable(context, R.drawable.fintech_ripple_rect_round_bluewave));
    }

    public static void a(ActionCardView actionCardView) {
        a aVar = actionCardView.f96091c;
        if (aVar != null) {
            aVar.b().invoke();
        }
    }

    public final void b(@NotNull a card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f96091c = card;
        TextView textView = this.f96089a;
        if (textView != null) {
            textView.setText(card.c());
        }
        ImageView imageView = this.f96090b;
        if (imageView != null) {
            imageView.setImageResource(card.a());
        }
        setOnClickListener(new b(this, 4));
    }
}
