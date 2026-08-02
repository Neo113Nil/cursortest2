package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.MissingPlayersPair;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xh extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    public final void G(MissingPlayerData missingPlayerData, View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, boolean z) {
        if (view != null) {
            view.setVisibility(missingPlayerData == null ? 4 : 0);
        }
        if (missingPlayerData != null) {
            as9.l(imageView, missingPlayerData.getPlayer().getId(), null);
            textView.setText(tba.C(missingPlayerData.getPlayer()));
            String type = missingPlayerData.getType();
            Context context = this.b;
            context.getClass();
            type.getClass();
            int color = context.getColor(type.equals("missing") ? R.color.error : R.color.alert);
            int s = wib.s(missingPlayerData.getReason());
            int t = wib.t(missingPlayerData.getReason(), R.string.injury_status_out, missingPlayerData.getType(), missingPlayerData.getDescription());
            textView2.setVisibility(0);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            Drawable drawable = context.getDrawable(s);
            if (drawable == null) {
                drawable = null;
            } else if (wib.v(missingPlayerData.getReason())) {
                v9g.K(drawable, color);
            }
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable);
            } else {
                ua5 ua5Var = ua5.a;
                Integer valueOf = Integer.valueOf(ao2.s(16, context));
                haa.K(textView2, drawable, ua5Var, valueOf, valueOf);
            }
            textView2.setText(context.getString(t));
            textView2.setTextColor(color);
            if (z) {
                if (view != null) {
                    view.setOnClickListener(new qh(1, this, imageView, missingPlayerData));
                }
            } else if (view != null) {
                view.setOnClickListener(null);
            }
        }
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 2;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 0);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof CustomizableDivider) {
            return 1;
        }
        if (obj instanceof r9k) {
            return 0;
        }
        if (obj instanceof MissingPlayerData) {
            return 2;
        }
        if (obj instanceof PlayerData) {
            return 3;
        }
        if (obj instanceof MissingPlayersPair) {
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.l;
        if (i == 0) {
            return new wh(u22.d(layoutInflater, viewGroup), (byte) 0);
        }
        if (i == 1) {
            return new wh(new SofaDivider(this.b, null, 6));
        }
        if (i == 2) {
            return new uh(this, ss9.b(layoutInflater, viewGroup), 0);
        }
        if (i == 3) {
            return new uh(this, ss9.b(layoutInflater, viewGroup), 1);
        }
        if (i != 4) {
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.box_score_missing_players_row, viewGroup, false);
        int i2 = R.id.container_first;
        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.container_first, inflate);
        if (constraintLayout != null) {
            i2 = R.id.container_second;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.container_second, inflate);
            if (constraintLayout2 != null) {
                i2 = R.id.description_first;
                TextView textView = (TextView) nq8.B(R.id.description_first, inflate);
                if (textView != null) {
                    i2 = R.id.description_second;
                    TextView textView2 = (TextView) nq8.B(R.id.description_second, inflate);
                    if (textView2 != null) {
                        i2 = R.id.image_first;
                        ImageView imageView = (ImageView) nq8.B(R.id.image_first, inflate);
                        if (imageView != null) {
                            i2 = R.id.image_second;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.image_second, inflate);
                            if (imageView2 != null) {
                                i2 = R.id.name_first;
                                TextView textView3 = (TextView) nq8.B(R.id.name_first, inflate);
                                if (textView3 != null) {
                                    i2 = R.id.name_second;
                                    TextView textView4 = (TextView) nq8.B(R.id.name_second, inflate);
                                    if (textView4 != null) {
                                        return new vh(this, new bv1((LinearLayout) inflate, constraintLayout, constraintLayout2, textView, textView2, imageView, imageView2, textView3, textView4));
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
}
