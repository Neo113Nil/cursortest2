package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hl2 extends gl2 {
    public final gh5 b;
    public final Drawable c;
    public final /* synthetic */ il2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hl2(il2 il2Var, gh5 gh5Var) {
        super(r2);
        this.d = il2Var;
        LinearLayout linearLayout = gh5Var.b;
        linearLayout.getClass();
        this.b = gh5Var;
        Drawable foreground = linearLayout.getForeground();
        LayerDrawable layerDrawable = foreground instanceof LayerDrawable ? (LayerDrawable) foreground : null;
        this.c = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.layer_divider) : null;
    }

    @Override // defpackage.gl2
    public final void a(PickerItem pickerItem) {
        String string;
        il2 il2Var = this.d;
        PickerItem.Tournament tournament = il2Var.a;
        pickerItem.getClass();
        PickerItem.Tournament tournament2 = (PickerItem.Tournament) pickerItem;
        wk2 wk2Var = tournament2.a;
        gh5 gh5Var = this.b;
        LinearLayout linearLayout = gh5Var.b;
        Context context = linearLayout.getContext();
        TextView textView = gh5Var.d;
        UniqueTournament uniqueTournament = tournament2.b;
        if (uniqueTournament == null || (string = tba.x(uniqueTournament)) == null) {
            string = wk2Var != null ? context.getString(wk2Var.c) : null;
            if (string == null) {
                string = "";
            }
        }
        textView.setText(string);
        as9.q(gh5Var.c, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), 0, null);
        linearLayout.setOnClickListener(new cn(14, il2Var, pickerItem));
        Drawable drawable = this.c;
        if (drawable != null) {
            v9g.L(drawable, Intrinsics.c(tournament2.c, Boolean.TRUE));
        }
        if (Intrinsics.c(uniqueTournament, tournament != null ? tournament.b : null)) {
            if (wk2Var == (tournament != null ? tournament.a : null)) {
                haa.G(textView);
                linearLayout.getClass();
                aba.H(linearLayout);
                return;
            }
        }
        haa.C(textView);
        linearLayout.getClass();
        aba.I(linearLayout);
    }
}
