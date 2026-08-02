package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.OffersBannerLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.view.CirclePageIndicator;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jne extends l {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public Object c;
    public Object d;
    public final /* synthetic */ FrameLayout e;

    public jne(PromotionalOffersBannerView promotionalOffersBannerView, Context context) {
        context.getClass();
        this.e = promotionalOffersBannerView;
        this.b = context;
        this.d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((String[]) obj).length;
            case 1:
                return ((ArrayList) this.d).size();
            default:
                return ((String[]) obj).length;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public long getItemId(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
            default:
                return super.getItemId(i);
            case 2:
                return i;
        }
    }

    public boolean o(int i) {
        one oneVar = (one) this.e;
        ale aleVar = oneVar.q0;
        if (aleVar == null) {
            return false;
        }
        return i != 0 ? i != 1 || (aleVar.k(30) && oneVar.q0.k(29)) : aleVar.k(13);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        int i2 = this.a;
        final int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ine ineVar = (ine) uVar;
                if (o(i)) {
                    ineVar.itemView.setLayoutParams(new hrf(-1, -2));
                } else {
                    ineVar.itemView.setLayoutParams(new hrf(0, 0));
                }
                ineVar.b.setText(((String[]) obj)[i]);
                String str = ((String[]) this.c)[i];
                TextView textView = ineVar.c;
                if (str == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                }
                Drawable drawable = ((Drawable[]) this.d)[i];
                ImageView imageView = ineVar.d;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    break;
                } else {
                    imageView.setVisibility(8);
                    break;
                }
            case 1:
                eef eefVar = (eef) uVar;
                eefVar.getClass();
                final cef cefVar = (cef) ((ArrayList) this.d).get(i);
                final jne jneVar = eefVar.c;
                PromotionalOffersBannerView promotionalOffersBannerView = (PromotionalOffersBannerView) jneVar.e;
                cefVar.getClass();
                OffersBannerLayout offersBannerLayout = cefVar.b;
                if (offersBannerLayout != null) {
                    vdf n = ((PromotionBannerView) eefVar.b.c).n(cefVar.j, promotionalOffersBannerView.f, offersBannerLayout);
                    n.j = promotionalOffersBannerView.g;
                    String str2 = cefVar.c;
                    str2.getClass();
                    n.d = str2;
                    String str3 = cefVar.d;
                    str3.getClass();
                    n.e = str3;
                    String str4 = cefVar.e;
                    str4.getClass();
                    n.f = str4;
                    n.h = cefVar.f;
                    n.k = cefVar.h;
                    n.i = cefVar.i;
                    n.l = new Function0(jneVar) { // from class: def
                        public final /* synthetic */ jne b;

                        {
                            this.b = jneVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4 = i3;
                            cef cefVar2 = cefVar;
                            jne jneVar2 = this.b;
                            switch (i4) {
                                case 0:
                                    ke0.m.add(Integer.valueOf(cefVar2.a.intValue()));
                                    int indexOf = ((ArrayList) jneVar2.d).indexOf(cefVar2);
                                    ((ArrayList) jneVar2.d).remove(cefVar2);
                                    jneVar2.notifyItemRemoved(indexOf);
                                    CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ((PromotionalOffersBannerView) jneVar2.e).d.c;
                                    circlePageIndicator.setVisibility(((ArrayList) jneVar2.d).size() > 1 ? 0 : 8);
                                    circlePageIndicator.invalidate();
                                    break;
                                default:
                                    Function1 function1 = (Function1) jneVar2.c;
                                    if (function1 != null) {
                                        function1.invoke(cefVar2.j);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    String str5 = cefVar.g;
                    if (str5 != null) {
                        n.g = str5;
                    } else {
                        final int i4 = 1;
                        n.m = new Function0(jneVar) { // from class: def
                            public final /* synthetic */ jne b;

                            {
                                this.b = jneVar;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i42 = i4;
                                cef cefVar2 = cefVar;
                                jne jneVar2 = this.b;
                                switch (i42) {
                                    case 0:
                                        ke0.m.add(Integer.valueOf(cefVar2.a.intValue()));
                                        int indexOf = ((ArrayList) jneVar2.d).indexOf(cefVar2);
                                        ((ArrayList) jneVar2.d).remove(cefVar2);
                                        jneVar2.notifyItemRemoved(indexOf);
                                        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ((PromotionalOffersBannerView) jneVar2.e).d.c;
                                        circlePageIndicator.setVisibility(((ArrayList) jneVar2.d).size() > 1 ? 0 : 8);
                                        circlePageIndicator.invalidate();
                                        break;
                                    default:
                                        Function1 function1 = (Function1) jneVar2.c;
                                        if (function1 != null) {
                                            function1.invoke(cefVar2.j);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                    }
                    n.n = cefVar.a;
                    n.a();
                    break;
                }
                break;
            default:
                yii yiiVar = (yii) uVar;
                yiiVar.b.setText(((String[]) obj)[i]);
                String str6 = ((String[]) this.c)[i];
                TextView textView2 = yiiVar.c;
                if (str6 == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str6);
                }
                Drawable drawable2 = ((Drawable[]) this.d)[i];
                ImageView imageView2 = yiiVar.d;
                if (drawable2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    break;
                } else {
                    imageView2.setVisibility(8);
                    break;
                }
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.a;
        FrameLayout frameLayout = this.e;
        switch (i2) {
            case 0:
                one oneVar = (one) frameLayout;
                return new ine(oneVar, LayoutInflater.from(oneVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
            case 1:
                viewGroup.getClass();
                View inflate = hkg.S((Context) this.b).inflate(R.layout.viewholder_featured_tournament_banner, viewGroup, false);
                PromotionBannerView promotionBannerView = (PromotionBannerView) nq8.B(R.id.banner_view, inflate);
                if (promotionBannerView != null) {
                    return new eef(this, new rvk((FrameLayout) inflate, promotionBannerView, 0));
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.banner_view)));
                return null;
            default:
                cji cjiVar = (cji) frameLayout;
                return new yii(cjiVar, LayoutInflater.from(cjiVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public jne(cji cjiVar, String[] strArr, Drawable[] drawableArr) {
        this.e = cjiVar;
        this.b = strArr;
        this.c = new String[strArr.length];
        this.d = drawableArr;
    }

    public jne(one oneVar, String[] strArr, Drawable[] drawableArr) {
        this.e = oneVar;
        this.b = strArr;
        this.c = new String[strArr.length];
        this.d = drawableArr;
    }
}
