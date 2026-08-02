package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rh extends o8 {
    public final vy1 d;
    public Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) root;
        this.d = new vy1(linearLayout, 1);
        setVisibility(8);
        aba.y(linearLayout, 0, 3);
    }

    public final void a(Event event) {
        int id = event.getId();
        Integer num = this.e;
        if (num != null && id == num.intValue()) {
            return;
        }
        this.e = Integer.valueOf(event.getId());
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.share_link));
        sb.append("/event/");
        sb.append(this.e);
        setVisibility(0);
        this.d.b.setOnClickListener(new qh(0, this, event, sb));
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.event_add_to_calendar_view;
    }
}
