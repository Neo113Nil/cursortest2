package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ii5 extends o8 {
    public final dk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.author_text;
        TextView textView = (TextView) nq8.B(R.id.author_text, root);
        if (textView != null) {
            i = R.id.editor_author_logo;
            if (((ImageView) nq8.B(R.id.editor_author_logo, root)) != null) {
                this.d = new dk2((LinearLayout) root, textView, 3);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.editor_author_view;
    }

    public final void j(String str, Status status) {
        status.getClass();
        if (str != null) {
            this.d.c.setText(Intrinsics.c(status.getType(), StatusKt.STATUS_NOT_STARTED) ? getContext().getString(R.string.created_by, str) : getContext().getString(R.string.edited_by, str));
            setVisibility(0);
        }
    }

    public final void l(int i, String str) {
        String format;
        TextView textView = this.d.c;
        if (i == 1) {
            Context context = getContext();
            if (str == null) {
                str = "";
            }
            format = context.getString(R.string.edited_by, str);
        } else {
            Locale d = dla.d();
            String quantityString = getContext().getResources().getQuantityString(R.plurals.edited_by_more_editors, i);
            quantityString.getClass();
            format = String.format(d, quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        }
        textView.setText(format);
        setVisibility(0);
    }
}
