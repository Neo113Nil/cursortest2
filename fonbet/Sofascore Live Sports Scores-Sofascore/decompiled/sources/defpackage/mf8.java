package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mf8 extends g7 {
    public static final List o = b.j(1, 3, 5);
    public final mrf l;
    public final List m;
    public final LayoutInflater n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf8(Context context) {
        super(context);
        context.getClass();
        this.l = new mrf();
        r9f r9fVar = new r9f(context, false);
        r9fVar.a.d = new tu5(context, 1);
        Unit unit = Unit.a;
        r9f r9fVar2 = new r9f(context, false);
        r9fVar2.a.d = new tu5(context, 2);
        r9f r9fVar3 = new r9f(context, false);
        r9fVar3.a.d = new tu5(context, 3);
        this.m = b.j(r9fVar, r9fVar2, r9fVar3);
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.n = from;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        jf8 jf8Var = (jf8) obj;
        jf8Var.getClass();
        if (jf8Var instanceof if8) {
            return 0;
        }
        if (jf8Var instanceof ff8) {
            return 1;
        }
        if (jf8Var instanceof hf8) {
            return 2;
        }
        if (jf8Var instanceof gf8) {
            return 3;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.n;
        if (i != 0) {
            mrf mrfVar = this.l;
            List list = this.m;
            if (i == 1) {
                return new kf8(ed.c(layoutInflater, viewGroup), (r9f) list.get(0), mrfVar, false);
            }
            if (i == 2) {
                return new kf8(ed.c(layoutInflater, viewGroup), (r9f) list.get(1), mrfVar, false);
            }
            if (i == 3) {
                return new kf8(ed.c(layoutInflater, viewGroup), (r9f) list.get(2), mrfVar, true);
            }
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.main_section_two_labels_with_action, viewGroup, false);
        int i2 = R.id.action_label;
        if (((TextView) nq8.B(R.id.action_label, inflate)) != null) {
            i2 = R.id.action_start_barrier;
            if (((Barrier) nq8.B(R.id.action_start_barrier, inflate)) != null) {
                i2 = R.id.dropdown_image;
                if (((ImageView) nq8.B(R.id.dropdown_image, inflate)) != null) {
                    i2 = R.id.header_subtitle;
                    if (((TextView) nq8.B(R.id.header_subtitle, inflate)) != null) {
                        i2 = R.id.header_title;
                        TextView textView = (TextView) nq8.B(R.id.header_title, inflate);
                        if (textView != null) {
                            i2 = R.id.progress_section;
                            if (((CircularProgressIndicator) nq8.B(R.id.progress_section, inflate)) != null) {
                                i2 = R.id.top_spacing;
                                if (((Space) nq8.B(R.id.top_spacing, inflate)) != null) {
                                    return new ja9(new mqb((ConstraintLayout) inflate, textView, 0));
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
}
