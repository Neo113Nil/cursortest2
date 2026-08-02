package com.sofascore.results.mma.fightNight.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.card.MaterialCardView;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import defpackage.a6;
import defpackage.a99;
import defpackage.ao2;
import defpackage.dd;
import defpackage.e92;
import defpackage.i08;
import defpackage.jlc;
import defpackage.kqb;
import defpackage.lsc;
import defpackage.nq8;
import defpackage.tnf;
import defpackage.yhk;
import defpackage.zl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010#\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001a\u0010;\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b:\u0010\u0010R\u001a\u0010>\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010\u0010R\u001a\u0010A\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\u000e\u001a\u0004\b@\u0010\u0010R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010N\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010\u000e\u001a\u0004\bO\u0010\u0010R\u001c\u0010P\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010\u000e\u001a\u0004\bQ\u0010\u0010R\u001c\u0010R\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010\u000e\u001a\u0004\bS\u0010\u0010¨\u0006T"}, d2 = {"Lcom/sofascore/results/mma/fightNight/view/MmaFightNightItem;", "La6;", "", "getLayoutId", "()I", j.b, "I", "getPrimaryTextColor", "primaryTextColor", CampaignEx.JSON_KEY_AD_K, "getSecondaryTextColor", "secondaryTextColor", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "getFirstFighterName", "()Landroid/widget/TextView;", "firstFighterName", InneractiveMediationDefs.GENDER_MALE, "getSecondFighterName", "secondFighterName", "Landroid/widget/ImageView;", C4427z5.q, "Landroid/widget/ImageView;", "getFirstFighterImage", "()Landroid/widget/ImageView;", "firstFighterImage", "o", "getSecondFighterImage", "secondFighterImage", TtmlNode.TAG_P, "getFirstFighterFlag", "firstFighterFlag", CampaignEx.JSON_KEY_AD_Q, "getSecondFighterFlag", "secondFighterFlag", "Lcom/sofascore/results/view/MmaRoundInfoView;", "r", "Lcom/sofascore/results/view/MmaRoundInfoView;", "getRoundInfoView", "()Lcom/sofascore/results/view/MmaRoundInfoView;", "roundInfoView", "Ljlc;", "s", "Ljlc;", "getMiddleText", "()Ljlc;", "middleText", "Llsc;", "t", "Llsc;", "getFirstFighterWinMarker", "()Llsc;", "firstFighterWinMarker", "u", "getSecondFighterWinMarker", "secondFighterWinMarker", "v", "getVsText", "vsText", "w", "getWeightClassText", "weightClassText", "x", "getFightEndInfoText", "fightEndInfoText", "Lcom/sofascore/results/view/BellButton;", "y", "Lcom/sofascore/results/view/BellButton;", "getBellButton", "()Lcom/sofascore/results/view/BellButton;", "bellButton", "Landroid/view/View;", "z", "Landroid/view/View;", "getBottomDivider", "()Landroid/view/View;", "bottomDivider", "liveIndicator", "getLiveIndicator", "dateText", "getDateText", "fightTypeText", "getFightTypeText", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFightNightItem extends a6 {
    public final dd i;

    /* renamed from: j, reason: from kotlin metadata */
    public final int primaryTextColor;

    /* renamed from: k, reason: from kotlin metadata */
    public final int secondaryTextColor;

    /* renamed from: l, reason: from kotlin metadata */
    public final TextView firstFighterName;

    /* renamed from: m, reason: from kotlin metadata */
    public final TextView secondFighterName;

    /* renamed from: n, reason: from kotlin metadata */
    public final ImageView firstFighterImage;

    /* renamed from: o, reason: from kotlin metadata */
    public final ImageView secondFighterImage;

    /* renamed from: p, reason: from kotlin metadata */
    public final ImageView firstFighterFlag;

    /* renamed from: q, reason: from kotlin metadata */
    public final ImageView secondFighterFlag;

    /* renamed from: r, reason: from kotlin metadata */
    public final MmaRoundInfoView roundInfoView;

    /* renamed from: s, reason: from kotlin metadata */
    public final jlc middleText;

    /* renamed from: t, reason: from kotlin metadata */
    public final lsc firstFighterWinMarker;

    /* renamed from: u, reason: from kotlin metadata */
    public final lsc secondFighterWinMarker;

    /* renamed from: v, reason: from kotlin metadata */
    public final TextView vsText;

    /* renamed from: w, reason: from kotlin metadata */
    public final TextView weightClassText;

    /* renamed from: x, reason: from kotlin metadata */
    public final TextView fightEndInfoText;

    /* renamed from: y, reason: from kotlin metadata */
    public final BellButton bellButton;

    /* renamed from: z, reason: from kotlin metadata */
    public final View bottomDivider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaFightNightItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View root = getRoot();
        int i = R.id.content;
        View B = nq8.B(R.id.content, root);
        if (B != null) {
            zl c = zl.c(B);
            View B2 = nq8.B(R.id.header, root);
            if (B2 != null) {
                int i2 = R.id.bell_button;
                BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, B2);
                if (bellButton != null) {
                    i2 = R.id.discipline_icon;
                    ImageView imageView = (ImageView) nq8.B(R.id.discipline_icon, B2);
                    if (imageView != null) {
                        i2 = R.id.text_end;
                        TextView textView = (TextView) nq8.B(R.id.text_end, B2);
                        if (textView != null) {
                            i2 = R.id.text_start;
                            TextView textView2 = (TextView) nq8.B(R.id.text_start, B2);
                            if (textView2 != null) {
                                i2 = R.id.top_label;
                                TextView textView3 = (TextView) nq8.B(R.id.top_label, B2);
                                if (textView3 != null) {
                                    this.i = new dd((LinearLayout) root, c, new kqb((ConstraintLayout) B2, bellButton, imageView, textView, textView2, textView3), 23);
                                    this.primaryTextColor = context.getColor(R.color.n_lv_1);
                                    this.secondaryTextColor = context.getColor(R.color.n_lv_3);
                                    this.firstFighterName = (TextView) c.j;
                                    this.secondFighterName = c.g;
                                    this.firstFighterImage = (ImageView) c.h;
                                    this.secondFighterImage = (ImageView) c.e;
                                    this.firstFighterFlag = (ImageView) c.d;
                                    this.secondFighterFlag = (ImageView) c.c;
                                    this.roundInfoView = (MmaRoundInfoView) c.l;
                                    this.middleText = (jlc) c.f;
                                    this.firstFighterWinMarker = (lsc) c.n;
                                    this.secondFighterWinMarker = (lsc) c.m;
                                    this.vsText = (TextView) c.k;
                                    this.weightClassText = textView2;
                                    this.fightEndInfoText = textView;
                                    this.bellButton = bellButton;
                                    this.bottomDivider = (View) c.i;
                                    return;
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i2)));
                throw null;
            }
            i = R.id.header;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.a6
    @NotNull
    public BellButton getBellButton() {
        return this.bellButton;
    }

    @Override // defpackage.a6
    @NotNull
    public View getBottomDivider() {
        return this.bottomDivider;
    }

    @Override // defpackage.a6
    @Nullable
    public TextView getDateText() {
        return null;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFightEndInfoText() {
        return this.fightEndInfoText;
    }

    @Override // defpackage.a6
    @Nullable
    public TextView getFightTypeText() {
        return null;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterFlag() {
        return this.firstFighterFlag;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterImage() {
        return this.firstFighterImage;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFirstFighterName() {
        return this.firstFighterName;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getFirstFighterWinMarker() {
        return this.firstFighterWinMarker;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_fight_night_item;
    }

    @Override // defpackage.a6
    @Nullable
    public TextView getLiveIndicator() {
        return null;
    }

    @Override // defpackage.a6
    @NotNull
    public jlc getMiddleText() {
        return this.middleText;
    }

    @Override // defpackage.a6
    public int getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    @Override // defpackage.a6
    @NotNull
    public MmaRoundInfoView getRoundInfoView() {
        return this.roundInfoView;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterFlag() {
        return this.secondFighterFlag;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterImage() {
        return this.secondFighterImage;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getSecondFighterName() {
        return this.secondFighterName;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getSecondFighterWinMarker() {
        return this.secondFighterWinMarker;
    }

    @Override // defpackage.a6
    public int getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getVsText() {
        return this.vsText;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getWeightClassText() {
        return this.weightClassText;
    }

    @Override // defpackage.a6
    public final void j(MmaEvent mmaEvent) {
        getMiddleText().c.setTextColor(getContext().getColor(R.color.n_lv_1));
        getMiddleText().b.setTextColor(getContext().getColor(R.color.n_lv_3));
        getMiddleText().a.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.surface_2)));
        super.j(mmaEvent);
        MmaRoundInfoView roundInfoView = getRoundInfoView();
        ColorStateList valueOf = ColorStateList.valueOf(roundInfoView.getContext().getColor(android.R.color.transparent));
        valueOf.getClass();
        e92 e92Var = roundInfoView.a;
        ((MaterialCardView) e92Var.e).setCardBackgroundColor(valueOf);
        ((MaterialCardView) e92Var.e).setStrokeColor(valueOf);
        Context context = getContext();
        context.getClass();
        String weightClass = mmaEvent.getWeightClass();
        if (weightClass == null) {
            weightClass = "";
        }
        String q = tnf.q(context, weightClass);
        String fightDiscipline = mmaEvent.getFightDiscipline();
        dd ddVar = this.i;
        if (fightDiscipline != null) {
            i08.d.getClass();
            i08 v = a99.v(fightDiscipline);
            Unit unit = null;
            Drawable drawable = null;
            if (v != null) {
                getWeightClassText().setText(String.format("%s %s", Arrays.copyOf(new Object[]{q, getContext().getString(v.b)}, 2)));
                ImageView imageView = ((kqb) ddVar.d).c;
                Drawable drawable2 = getContext().getDrawable(v.c);
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(getContext().getColor(R.color.n_lv_1), PorterDuff.Mode.SRC_IN));
                    drawable = drawable2;
                }
                imageView.setImageDrawable(drawable);
                ((kqb) ddVar.d).c.setVisibility(0);
                unit = Unit.a;
            }
            if (unit != null) {
                return;
            }
        }
        TextView weightClassText = getWeightClassText();
        Context context2 = getContext();
        context2.getClass();
        String weightClass2 = mmaEvent.getWeightClass();
        weightClassText.setText(tnf.q(context2, weightClass2 != null ? weightClass2 : ""));
        ((kqb) ddVar.d).c.setVisibility(8);
    }

    @Override // defpackage.a6
    public final void l(MmaEvent mmaEvent) {
        super.l(mmaEvent);
        Context context = getContext();
        context.getClass();
        int s = ao2.s(16, context);
        dd ddVar = this.i;
        ((kqb) ddVar.d).d.setVisibility(8);
        View view = (View) ((zl) ddVar.c).i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(s);
        marginLayoutParams.setMarginStart(s);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.a6
    public final boolean n() {
        return false;
    }

    public final void q(String str) {
        str.getClass();
        int length = str.length();
        dd ddVar = this.i;
        if (length == 0) {
            ((kqb) ddVar.d).d.setVisibility(8);
        } else {
            ((kqb) ddVar.d).d.setVisibility(0);
            ((kqb) ddVar.d).d.setText(str);
        }
    }
}
