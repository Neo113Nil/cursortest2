package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kzg extends n8 {
    public final mqb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzg(String str, Context context) {
        super(str, context);
        context.getClass();
        View root = getRoot();
        TextView textView = (TextView) nq8.B(R.id.type_text, root);
        if (textView == null) {
            yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.type_text)));
            throw null;
        }
        this.e = new mqb((ConstraintLayout) root, textView, 4);
        textView.setText(str);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.tab_secondary_system_with_deselect;
    }
}
