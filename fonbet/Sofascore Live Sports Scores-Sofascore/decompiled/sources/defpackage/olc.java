package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class olc extends a6 {
    public final bv1 i;
    public final boolean j;
    public final TextView k;
    public final TextView l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final MmaRoundInfoView q;
    public final jlc r;
    public final lsc s;
    public final lsc t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(Context context) {
        super(context, null);
        context.getClass();
        View root = getRoot();
        int i = R.id.draw_label;
        View B = nq8.B(R.id.draw_label, root);
        if (B != null) {
            jlc a = jlc.a(B);
            i = R.id.flag_away;
            ImageView imageView = (ImageView) nq8.B(R.id.flag_away, root);
            if (imageView != null) {
                i = R.id.flag_home;
                ImageView imageView2 = (ImageView) nq8.B(R.id.flag_home, root);
                if (imageView2 != null) {
                    i = R.id.gradient_color_overlay;
                    View B2 = nq8.B(R.id.gradient_color_overlay, root);
                    if (B2 != null) {
                        i = R.id.header_background;
                        View B3 = nq8.B(R.id.header_background, root);
                        if (B3 != null) {
                            i = R.id.image_background;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.image_background, root);
                            if (imageView3 != null) {
                                i = R.id.image_fighter_away;
                                ImageView imageView4 = (ImageView) nq8.B(R.id.image_fighter_away, root);
                                if (imageView4 != null) {
                                    i = R.id.image_fighter_home;
                                    ImageView imageView5 = (ImageView) nq8.B(R.id.image_fighter_home, root);
                                    if (imageView5 != null) {
                                        i = R.id.live_indicator_top_left;
                                        TextView textView = (TextView) nq8.B(R.id.live_indicator_top_left, root);
                                        if (textView != null) {
                                            i = R.id.logo_organisation;
                                            ImageView imageView6 = (ImageView) nq8.B(R.id.logo_organisation, root);
                                            if (imageView6 != null) {
                                                i = R.id.name_fighter_away;
                                                TextView textView2 = (TextView) nq8.B(R.id.name_fighter_away, root);
                                                if (textView2 != null) {
                                                    i = R.id.name_fighter_home;
                                                    TextView textView3 = (TextView) nq8.B(R.id.name_fighter_home, root);
                                                    if (textView3 != null) {
                                                        i = R.id.organization_header;
                                                        View B4 = nq8.B(R.id.organization_header, root);
                                                        if (B4 != null) {
                                                            ez0 d = ez0.d(B4);
                                                            i = R.id.ripple_holder;
                                                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.ripple_holder, root);
                                                            if (frameLayout != null) {
                                                                i = R.id.round_info;
                                                                MmaRoundInfoView mmaRoundInfoView = (MmaRoundInfoView) nq8.B(R.id.round_info, root);
                                                                if (mmaRoundInfoView != null) {
                                                                    i = R.id.text_fight_type;
                                                                    TextView textView4 = (TextView) nq8.B(R.id.text_fight_type, root);
                                                                    if (textView4 != null) {
                                                                        i = R.id.text_organisation_name;
                                                                        TextView textView5 = (TextView) nq8.B(R.id.text_organisation_name, root);
                                                                        if (textView5 != null) {
                                                                            i = R.id.text_top_left;
                                                                            TextView textView6 = (TextView) nq8.B(R.id.text_top_left, root);
                                                                            if (textView6 != null) {
                                                                                i = R.id.text_venue_description;
                                                                                TextView textView7 = (TextView) nq8.B(R.id.text_venue_description, root);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.vs;
                                                                                    TextView textView8 = (TextView) nq8.B(R.id.vs, root);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.win_marker_away;
                                                                                        View B5 = nq8.B(R.id.win_marker_away, root);
                                                                                        if (B5 != null) {
                                                                                            lsc a2 = lsc.a(B5);
                                                                                            i = R.id.win_marker_home;
                                                                                            View B6 = nq8.B(R.id.win_marker_home, root);
                                                                                            if (B6 != null) {
                                                                                                lsc a3 = lsc.a(B6);
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) root;
                                                                                                this.i = new bv1(constraintLayout, a, imageView, imageView2, B2, B3, imageView3, imageView4, imageView5, textView, imageView6, textView2, textView3, d, frameLayout, mmaRoundInfoView, textView4, textView5, textView6, textView7, textView8, a2, a3);
                                                                                                constraintLayout.setClipToOutline(true);
                                                                                                this.j = true;
                                                                                                this.k = textView3;
                                                                                                this.l = textView2;
                                                                                                this.m = imageView5;
                                                                                                this.n = imageView4;
                                                                                                this.o = imageView2;
                                                                                                this.p = imageView;
                                                                                                this.q = mmaRoundInfoView;
                                                                                                this.r = a;
                                                                                                this.s = a3;
                                                                                                this.t = a2;
                                                                                                this.u = textView8;
                                                                                                this.v = textView;
                                                                                                this.w = textView6;
                                                                                                this.x = textView4;
                                                                                                return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ BellButton getBellButton() {
        return (BellButton) m906getBellButton();
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ View getBottomDivider() {
        return (View) m907getBottomDivider();
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getDateText() {
        return this.w;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getFightEndInfoText() {
        return (TextView) m908getFightEndInfoText();
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFightTypeText() {
        return this.x;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterFlag() {
        return this.o;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterImage() {
        return this.m;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFirstFighterName() {
        return this.k;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getFirstFighterWinMarker() {
        return this.s;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_event_card;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getLiveIndicator() {
        return this.v;
    }

    @Override // defpackage.a6
    @NotNull
    public jlc getMiddleText() {
        return this.r;
    }

    @Override // defpackage.a6
    @NotNull
    public MmaRoundInfoView getRoundInfoView() {
        return this.q;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterFlag() {
        return this.p;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterImage() {
        return this.n;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getSecondFighterName() {
        return this.l;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getSecondFighterWinMarker() {
        return this.t;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getVsText() {
        return this.u;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getWeightClassText() {
        return (TextView) m909getWeightClassText();
    }

    @Override // defpackage.a6
    public final void j(MmaEvent mmaEvent) {
        getMiddleText().c.setTextColor(getContext().getColor(R.color.surface_1));
        getMiddleText().b.setTextColor(getContext().getColor(R.color.on_color_secondary));
        getMiddleText().a.setBackgroundTintList(eq3.q(R.color.darken_overlay_2, getContext()));
        super.j(mmaEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ac  */
    @Override // defpackage.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(MmaEvent mmaEvent) {
        int parseColor;
        String n;
        super.l(mmaEvent);
        o8.d(this, 0, 7);
        bv1 bv1Var = this.i;
        TextView textView = (TextView) bv1Var.c;
        TextView textView2 = (TextView) bv1Var.d;
        textView.setText(mmaEvent.getTournament().getName());
        ImageView imageView = (ImageView) bv1Var.f;
        UniqueTournament uniqueTournament = mmaEvent.getTournament().getUniqueTournament();
        as9.q(imageView, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), mmaEvent.getTournament().getId(), null);
        as9.j((ImageView) bv1Var.e, R.drawable.mma_event_card_bg);
        UniqueTournament uniqueTournament2 = mmaEvent.getTournament().getUniqueTournament();
        String primaryColorHex = uniqueTournament2 != null ? uniqueTournament2.getPrimaryColorHex() : null;
        if (primaryColorHex != null) {
            try {
                parseColor = Color.parseColor(primaryColorHex);
            } catch (Exception unused) {
            }
            ((View) bv1Var.i).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{parseColor, 0}));
            int color = getContext().getColor(R.color.darken_overlay_2);
            getFirstFighterWinMarker().a.getBackground().setTint(color);
            getSecondFighterWinMarker().a.getBackground().setTint(color);
            Context context = getContext();
            context.getClass();
            n = tnf.n(context, mmaEvent);
            if (n != null) {
                textView2.setVisibility(8);
                return;
            } else {
                textView2.setVisibility(0);
                textView2.setText(n);
                return;
            }
        }
        parseColor = 0;
        ((View) bv1Var.i).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{parseColor, 0}));
        int color2 = getContext().getColor(R.color.darken_overlay_2);
        getFirstFighterWinMarker().a.getBackground().setTint(color2);
        getSecondFighterWinMarker().a.getBackground().setTint(color2);
        Context context2 = getContext();
        context2.getClass();
        n = tnf.n(context2, mmaEvent);
        if (n != null) {
        }
    }

    @Override // defpackage.a6
    /* renamed from: n */
    public final boolean getW() {
        return this.j;
    }

    @Nullable
    /* renamed from: getBellButton, reason: collision with other method in class */
    public Void m906getBellButton() {
        return null;
    }

    @Nullable
    /* renamed from: getBottomDivider, reason: collision with other method in class */
    public Void m907getBottomDivider() {
        return null;
    }

    @Nullable
    /* renamed from: getFightEndInfoText, reason: collision with other method in class */
    public Void m908getFightEndInfoText() {
        return null;
    }

    @Nullable
    /* renamed from: getWeightClassText, reason: collision with other method in class */
    public Void m909getWeightClassText() {
        return null;
    }
}
