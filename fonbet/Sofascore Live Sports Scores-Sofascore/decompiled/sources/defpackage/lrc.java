package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lrc extends o8 {
    public final dsc d;
    public final dd e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrc(Context context, String str, dsc dscVar) {
        super(context, null, 0);
        context.getClass();
        this.d = dscVar;
        View root = getRoot();
        int i = R.id.stats_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.stats_container, root);
        if (linearLayout != null) {
            i = R.id.title_container;
            View B = nq8.B(R.id.title_container, root);
            if (B != null) {
                kqb a = kqb.a(B);
                LinearLayout linearLayout2 = (LinearLayout) root;
                this.e = new dd(linearLayout2, linearLayout, a, 25);
                this.f = true;
                linearLayout2.setClipToOutline(true);
                ImageView imageView = a.c;
                Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf;
                fc6.w(ht9Var, imageView, a2);
                setLabelByTag(str);
                setInfoTextByTag(str);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void setInfoTextByTag(String str) {
        int i;
        String string = getContext().getString(tnf.p(str));
        string.getClass();
        mqi mqiVar = qhi.a;
        Context context = getContext();
        switch (str.hashCode()) {
            case -1194214923:
                if (str.equals("significant_strikes")) {
                    i = R.string.mma_significant_strikes_info_description;
                    break;
                }
                i = R.string.undefined;
                break;
            case -1165568436:
                if (str.equals("grappling")) {
                    i = R.string.mma_grappling_description;
                    break;
                }
                i = R.string.undefined;
                break;
            case 958350060:
                if (str.equals("grappling_per_15_min")) {
                    i = R.string.mma_grappling_per_min_description;
                    break;
                }
                i = R.string.undefined;
                break;
            case 1186089465:
                if (str.equals("position_statistics")) {
                    i = R.string.mma_position_stats_description;
                    break;
                }
                i = R.string.undefined;
                break;
            case 1382297500:
                if (str.equals("striking_per_round")) {
                    i = R.string.mma_striking_per_round_info_text;
                    break;
                }
                i = R.string.undefined;
                break;
            case 1487369074:
                if (str.equals("position_statistics_live")) {
                    i = R.string.mma_position_stats_description_live;
                    break;
                }
                i = R.string.undefined;
                break;
            default:
                i = R.string.undefined;
                break;
        }
        Spanned a = qhi.a(context.getString(i));
        ImageView imageView = ((kqb) this.e.d).c;
        Integer valueOf = Integer.valueOf(R.drawable.ic_info);
        apf a2 = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = valueOf;
        vt9.f(ht9Var, imageView);
        a2.a(ht9Var.a());
        imageView.setColorFilter(imageView.getContext().getColor(R.color.n_lv_1));
        imageView.setOnClickListener(new qh(23, imageView, string, a));
    }

    private final void setLabelByTag(String str) {
        ((kqb) this.e.d).d.setText(getContext().getString(tnf.p(str)));
    }

    @NotNull
    public final List<m6> getFightStatisticsViews() {
        return i5h.q(i5h.g(pea.u((LinearLayout) this.e.c), rg2.p));
    }

    @NotNull
    public final List<r6> getFighterStatisticsViews() {
        return i5h.q(i5h.g(pea.u((LinearLayout) this.e.c), rg2.q));
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_section_layout;
    }

    @NotNull
    public final dsc getLocation() {
        return this.d;
    }

    public final void j() {
        this.f = !this.f;
        dd ddVar = this.e;
        List q = i5h.q(new tsk((LinearLayout) ddVar.c));
        Iterator it = q.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((View) it.next()).getTag() == urc.b) {
                break;
            } else {
                i++;
            }
        }
        Iterator it2 = q.subList(i + 1, q.size()).iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(this.f ? 0 : 8);
        }
        ((LinearLayout) ddVar.c).requestLayout();
    }

    public final void setMarginTop(int i) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) this.e.b).getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Context context = getContext();
            context.getClass();
            int s = ao2.s(i, context);
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i2 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = s;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i2;
        }
    }

    public final void setTextDisplayMode(@NotNull rrc rrcVar) {
        rrcVar.getClass();
        Iterator it = (this.d == dsc.a ? getFightStatisticsViews() : getFighterStatisticsViews()).iterator();
        while (it.hasNext()) {
            ((grc) it.next()).setDisplayMode(rrcVar);
        }
    }
}
