package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.predictions.adapter.NestedScrollableHost;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kf8 extends p8 {
    public final /* synthetic */ int c = 1;
    public boolean d;
    public final krk e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kf8(djf djfVar, mme mmeVar) {
        super(r1);
        LinearLayout linearLayout = (LinearLayout) djfVar.b;
        linearLayout.getClass();
        this.e = djfVar;
        this.f = mmeVar;
        this.d = true;
        this.g = b.l((v12) djfVar.c, (v12) djfVar.g, (v12) djfVar.e, (v12) djfVar.d);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3;
        int i4 = this.c;
        Object obj2 = this.g;
        int i5 = 0;
        krk krkVar = this.e;
        switch (i4) {
            case 0:
                obj.getClass();
                RecyclerView recyclerView = (RecyclerView) ((ed) krkVar).c;
                recyclerView.setRecycledViewPool((mrf) obj2);
                recyclerView.setAdapter((r9f) this.f);
                Context context = recyclerView.getContext();
                context.getClass();
                z8e.b0(recyclerView, context, false, false, null, 28);
                Context context2 = recyclerView.getContext();
                context2.getClass();
                int s = ao2.s(12, context2);
                Context context3 = recyclerView.getContext();
                context3.getClass();
                int s2 = ao2.s(12, context3);
                if (this.d) {
                    Context context4 = recyclerView.getContext();
                    context4.getClass();
                    i3 = ao2.s(16, context4);
                } else {
                    i3 = 0;
                }
                recyclerView.setPadding(s, recyclerView.getPaddingTop(), s2, i3);
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
                recyclerView.setClipToPadding(false);
                Context context5 = recyclerView.getContext();
                context5.getClass();
                recyclerView.setMinimumHeight(ao2.s(64, context5));
                recyclerView.setLayoutParams((FrameLayout.LayoutParams) layoutParams);
                recyclerView.setNestedScrollingEnabled(false);
                return;
            default:
                ((atf) obj).getClass();
                djf djfVar = (djf) krkVar;
                LinearLayout linearLayout = (LinearLayout) djfVar.b;
                linearLayout.getClass();
                sea.v(linearLayout, true, false, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                v12 v12Var = (v12) djfVar.c;
                v12Var.c.setText(R.string.referee_details_appearances);
                ((v12) djfVar.g).c.setText(R.string.referee_details_yellow_cards_per_game);
                ((v12) djfVar.e).c.setText(R.string.referee_details_red_cards);
                ((v12) djfVar.d).c.setText(R.string.referee_details_penalties);
                v12Var.b.setVisibility(8);
                kqb kqbVar = (kqb) djfVar.f;
                kqbVar.d.setText(this.b.getText(R.string.referee_career_statistics));
                ImageView imageView = kqbVar.c;
                Integer valueOf = Integer.valueOf(R.drawable.ic_info);
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf;
                vt9.f(ht9Var, imageView);
                a.a(ht9Var.a());
                imageView.setVisibility(0);
                aba.y(imageView, 0, 1);
                z8e.a0(imageView, 1000L, new ju1(imageView, 3));
                if (this.d) {
                    this.d = false;
                    d(0);
                }
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    ((v12) next).a.setOnClickListener(new l8(this, i5, 9));
                    i5 = i6;
                }
                return;
        }
    }

    public void d(int i) {
        Iterator it = ((ArrayList) this.g).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            v12 v12Var = (v12) next;
            if (i == i2) {
                v12Var.d.setVisibility(0);
                haa.G(v12Var.c);
            } else {
                v12Var.d.setVisibility(4);
                TextView textView = v12Var.c;
                textView.setTextColor(textView.getContext().getColor(R.color.n_lv_4));
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kf8(ed edVar, r9f r9fVar, mrf mrfVar, boolean z) {
        super(r0);
        r9fVar.getClass();
        mrfVar.getClass();
        NestedScrollableHost nestedScrollableHost = (NestedScrollableHost) edVar.b;
        nestedScrollableHost.getClass();
        this.e = edVar;
        this.f = r9fVar;
        this.g = mrfVar;
        this.d = z;
    }
}
