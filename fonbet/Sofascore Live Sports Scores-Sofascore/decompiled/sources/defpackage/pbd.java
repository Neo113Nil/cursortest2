package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pbd extends g7 {
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbd(Context context) {
        super(context);
        context.getClass();
        this.l = ao2.s(24, context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((TvChannel) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.new_channels_dialog_item, viewGroup, false);
        if (inflate != null) {
            return new vh(this, new hcb(1, (CheckedTextView) inflate));
        }
        yhk.s("rootView");
        return null;
    }
}
