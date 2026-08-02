package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j84 extends LinearLayout {
    public sc a;
    public final joa b;
    public final joa c;
    public q8g d;
    public CupTreeBlock e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j84(Context context) {
        super(context);
        context.getClass();
        c6 c6Var = new c6(context, 16);
        ysa ysaVar = ysa.c;
        this.b = ypa.a(ysaVar, c6Var);
        this.c = ypa.a(ysaVar, new h84(0, (Object) context, (Object) this));
        this.d = q8g.CARD;
    }

    private final Drawable getLogoPlaceholderDrawable() {
        return (Drawable) this.c.getValue();
    }

    private final Typeface getTypefaceMedium() {
        return (Typeface) this.b.getValue();
    }

    public final void a(CupTreeParticipant cupTreeParticipant, CupTreeParticipant cupTreeParticipant2) {
        Team team;
        Team team2;
        sc scVar = this.a;
        if (scVar == null) {
            Intrinsics.i("binding");
            throw null;
        }
        ImageView imageView = scVar.c;
        ImageView imageView2 = scVar.e;
        TextView textView = (TextView) scVar.n;
        TextView textView2 = scVar.d;
        TextView textView3 = scVar.i;
        MaterialCardView materialCardView = (MaterialCardView) scVar.o;
        materialCardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Context context = getContext();
        context.getClass();
        materialCardView.setStrokeWidth(ao2.s(1, context));
        materialCardView.setStrokeColor(getContext().getColor(R.color.n_lv_4));
        materialCardView.setCardBackgroundColor(getContext().getColor(R.color.surface_2));
        textView.setText(getContext().getString(R.string.minus));
        haa.D(textView);
        if (cupTreeParticipant == null || (team2 = cupTreeParticipant.getTeam()) == null) {
            imageView2.setImageDrawable(getLogoPlaceholderDrawable());
            textView3.setText(getContext().getString(R.string.not_available_short));
            haa.D(textView3);
        } else {
            as9.o(imageView2, team2.getId());
            textView3.setText(team2.getNameCode());
            haa.D(textView3);
        }
        if (cupTreeParticipant2 == null || (team = cupTreeParticipant2.getTeam()) == null) {
            imageView.setImageDrawable(getLogoPlaceholderDrawable());
            textView2.setText(getContext().getString(R.string.not_available_short));
            haa.D(textView2);
        } else {
            as9.o(imageView, team.getId());
            textView2.setText(team.getNameCode());
            haa.D(textView2);
        }
    }

    public final void b(Team team, String str, TextView textView, TextView textView2, ImageView imageView) {
        if (team != null) {
            as9.o(imageView, team.getId());
            textView.setTypeface(getTypefaceMedium());
            textView.setTextSize(1, 12.0f);
            textView.setText(team.getNameCode());
        }
        if (str != null) {
            Context context = textView2.getContext();
            context.getClass();
            textView2.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context, str)));
            textView2.setVisibility(0);
            Context context2 = textView2.getContext();
            context2.getClass();
            textView2.setText(uaa.q(context2, str));
        }
    }

    public final void c(CupTreeBlock cupTreeBlock, Integer num, Function1 function1) {
        j84 j84Var;
        CupTreeBlock cupTreeBlock2;
        CupTreeBlock cupTreeBlock3;
        if (cupTreeBlock != null) {
            sc scVar = this.a;
            if (scVar == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((MaterialCardView) scVar.o).setClickable(cupTreeBlock.isEnabled());
            if (cupTreeBlock.isEnabled()) {
                sc scVar2 = this.a;
                if (scVar2 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                j84Var = this;
                cupTreeBlock3 = cupTreeBlock;
                z8e.a0((MaterialCardView) scVar2.o, 1000L, new m61(cupTreeBlock, j84Var, num, function1, 3));
            } else {
                j84Var = this;
                cupTreeBlock3 = cupTreeBlock;
            }
            cupTreeBlock2 = cupTreeBlock3;
        } else {
            j84Var = this;
            cupTreeBlock2 = null;
        }
        j84Var.e = cupTreeBlock2;
    }

    public final void d(CupTreeParticipant cupTreeParticipant, CupTreeParticipant cupTreeParticipant2, String str) {
        sc scVar = this.a;
        if (scVar == null) {
            Intrinsics.i("binding");
            throw null;
        }
        TextView textView = scVar.i;
        TextView textView2 = scVar.d;
        TextView textView3 = (TextView) scVar.n;
        ((TextView) scVar.m).setText("");
        ((TextView) scVar.k).setText("");
        textView3.setTextSize(1, 14.0f);
        haa.D(textView3);
        textView3.setText(str);
        if (cupTreeParticipant.getWinner()) {
            haa.C(textView);
            haa.D(textView2);
        } else if (cupTreeParticipant2.getWinner()) {
            haa.D(textView);
            haa.C(textView2);
        } else {
            haa.C(textView);
            haa.C(textView2);
        }
    }

    public final void e(r8g r8gVar, q8g q8gVar) {
        q8gVar.getClass();
        this.d = q8gVar;
        int ordinal = r8gVar.ordinal();
        if (ordinal == 0) {
            sc scVar = this.a;
            if (scVar == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((View) scVar.p).setVisibility(8);
            sc scVar2 = this.a;
            if (scVar2 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((View) scVar2.b).setVisibility(0);
        } else if (ordinal == 1) {
            sc scVar3 = this.a;
            if (scVar3 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            scVar3.f.setVisibility(8);
            sc scVar4 = this.a;
            if (scVar4 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            scVar4.g.setVisibility(0);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                zzl.b();
                return;
            }
            sc scVar5 = this.a;
            if (scVar5 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((View) scVar5.p).setVisibility(8);
            sc scVar6 = this.a;
            if (scVar6 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((View) scVar6.b).setVisibility(0);
            sc scVar7 = this.a;
            if (scVar7 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            scVar7.f.setVisibility(8);
            sc scVar8 = this.a;
            if (scVar8 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            scVar8.g.setVisibility(0);
        }
        if (i84.a[q8gVar.ordinal()] == 1) {
            int color = getContext().getColor(q8gVar.a);
            sc scVar9 = this.a;
            if (scVar9 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            ((View) scVar9.p).setBackgroundColor(color);
            sc scVar10 = this.a;
            if (scVar10 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            scVar10.f.setBackgroundColor(color);
            sc scVar11 = this.a;
            if (scVar11 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            MaterialCardView materialCardView = (MaterialCardView) scVar11.o;
            materialCardView.setCardBackgroundColor(color);
            materialCardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
