package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cbf extends y6 implements vqf {
    public final boolean f;
    public final boolean g;
    public final Function2 h;
    public final Function1 i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbf(Context context, boolean z, boolean z2, Function2 function2, Function1 function1) {
        super(context, new jaf(0));
        context.getClass();
        this.f = z;
        this.g = z2;
        this.h = function2;
        this.i = function1;
        this.j = new ArrayList();
    }

    @Override // defpackage.vqf
    public final Object f(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.j;
        boolean contains = arrayList.contains(valueOf);
        pk0 pk0Var = this.b;
        if (!contains) {
            f5e f5eVar = (f5e) pk0Var.g.get();
            if ((f5eVar != null ? n9e.w(f5eVar, i) : pk0Var.h.d.b(i)) instanceof waf) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) next).intValue() <= i) {
                arrayList2.add(next);
            }
        }
        Integer num = (Integer) CollectionsKt.k0(arrayList2);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        f5e f5eVar2 = (f5e) pk0Var.g.get();
        Object w = f5eVar2 != null ? n9e.w(f5eVar2, intValue) : pk0Var.h.d.b(intValue);
        if (w instanceof waf) {
            return (waf) w;
        }
        return null;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        bbf[] bbfVarArr = bbf.a;
        LayoutInflater layoutInflater = this.e;
        if (i != 0) {
            if (i == 1) {
                return new ja9(dx5.a(layoutInflater, viewGroup));
            }
            if (i != 2) {
                a70.p(String.valueOf(i));
                return null;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) v82.g(layoutInflater, viewGroup).b;
            constraintLayout.getClass();
            return new wh(constraintLayout);
        }
        View inflate = layoutInflater.inflate(R.layout.row_profile, viewGroup, false);
        int i2 = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, inflate)) != null) {
            i2 = R.id.barrier_view;
            View B = nq8.B(R.id.barrier_view, inflate);
            if (B != null) {
                i2 = R.id.first_prediction;
                View B2 = nq8.B(R.id.first_prediction, inflate);
                if (B2 != null) {
                    m8g a = m8g.a(B2);
                    i2 = R.id.first_team_logo;
                    ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, inflate);
                    if (imageView != null) {
                        i2 = R.id.first_team_name;
                        TextView textView = (TextView) nq8.B(R.id.first_team_name, inflate);
                        if (textView != null) {
                            i2 = R.id.layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.layout, inflate);
                            if (constraintLayout2 != null) {
                                i2 = R.id.predictions_container;
                                if (((LinearLayout) nq8.B(R.id.predictions_container, inflate)) != null) {
                                    i2 = R.id.profile_start_time;
                                    TextView textView2 = (TextView) nq8.B(R.id.profile_start_time, inflate);
                                    if (textView2 != null) {
                                        i2 = R.id.second_prediction;
                                        View B3 = nq8.B(R.id.second_prediction, inflate);
                                        if (B3 != null) {
                                            m8g a2 = m8g.a(B3);
                                            i2 = R.id.second_team_logo;
                                            ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, inflate);
                                            if (imageView2 != null) {
                                                i2 = R.id.second_team_name;
                                                TextView textView3 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                if (textView3 != null) {
                                                    i2 = R.id.third_prediction;
                                                    View B4 = nq8.B(R.id.third_prediction, inflate);
                                                    if (B4 != null) {
                                                        return new maf(new p12((FrameLayout) inflate, B, a, imageView, textView, constraintLayout2, textView2, a2, imageView2, textView3, m8g.a(B4)), this.f, this.g, this.h, this.i);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.y6
    public final int q(Object obj) {
        yaf yafVar = (yaf) obj;
        if (yafVar instanceof xaf) {
            bbf[] bbfVarArr = bbf.a;
            return 0;
        }
        if (!(yafVar instanceof waf)) {
            throw new IllegalArgumentException(String.valueOf(yafVar));
        }
        bbf[] bbfVarArr2 = bbf.a;
        return 1;
    }
}
