package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rnl extends p8 {
    public final bv1 c;
    public int d;
    public int e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rnl(bv1 bv1Var) {
        super(r0);
        MaterialCardView materialCardView = (MaterialCardView) bv1Var.b;
        materialCardView.getClass();
        this.c = bv1Var;
        this.d = -1;
        this.e = -1;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        r5c r5cVar = (r5c) obj;
        r5cVar.getClass();
        Integer num = r5cVar.e;
        boolean z = r5cVar.c;
        Highlight highlight = r5cVar.a;
        this.d = num != null ? num.intValue() : highlight.getId();
        this.e = r5cVar.d;
        bv1 bv1Var = this.c;
        LinearLayout linearLayout = (LinearLayout) bv1Var.j;
        TextView textView = (TextView) bv1Var.d;
        TextView textView2 = (TextView) bv1Var.g;
        ImageView imageView = (ImageView) bv1Var.e;
        linearLayout.setVisibility(highlight.getKeyHighlight() ? 0 : 8);
        ((LinearLayout) bv1Var.i).setVisibility(!highlight.getKeyHighlight() ? 0 : 8);
        TextView textView3 = (TextView) bv1Var.c;
        boolean z2 = r5cVar.f;
        Context context = this.b;
        textView3.setText(z2 ? context.getString(R.string.race_highlights) : context.getString(R.string.match_highlights_title));
        imageView.setClipToOutline(true);
        textView2.setTextDirection(hkg.c0(context) ? 4 : 3);
        textView2.setText(highlight.getTitle());
        textView.setTextDirection(hkg.c0(context) ? 4 : 3);
        textView.setText(highlight.getSubtitle());
        textView.setVisibility(highlight.getSubtitle().length() > 0 ? 0 : 8);
        apf a = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = null;
        vt9.f(ht9Var, imageView);
        a.a(ht9Var.a());
        if (highlight.getThumbnailUrl() != null) {
            String thumbnailUrl = highlight.getThumbnailUrl();
            apf a2 = ajh.a(imageView.getContext());
            ht9 ht9Var2 = new ht9(imageView.getContext());
            ht9Var2.c = thumbnailUrl;
            fc6.w(ht9Var2, imageView, a2);
        } else {
            Drawable d0 = td4.d0(2131232755, context);
            apf a3 = ajh.a(imageView.getContext());
            ht9 ht9Var3 = new ht9(imageView.getContext());
            ht9Var3.c = d0;
            fc6.w(ht9Var3, imageView, a3);
        }
        if (r5cVar.b) {
            textView2.setLines(2);
        }
        ((FrameLayout) bv1Var.h).setVisibility(z ? 0 : 8);
        ((ImageView) bv1Var.f).setVisibility(z ? 8 : 0);
    }
}
