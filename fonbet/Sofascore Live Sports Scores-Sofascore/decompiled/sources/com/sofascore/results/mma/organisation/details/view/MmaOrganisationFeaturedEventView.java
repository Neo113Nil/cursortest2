package com.sofascore.results.mma.organisation.details.view;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import defpackage.a6;
import defpackage.aba;
import defpackage.ao2;
import defpackage.as9;
import defpackage.au7;
import defpackage.bi4;
import defpackage.ed;
import defpackage.eq3;
import defpackage.fc6;
import defpackage.hk4;
import defpackage.jlc;
import defpackage.kqb;
import defpackage.lsc;
import defpackage.me4;
import defpackage.nq8;
import defpackage.nz0;
import defpackage.o8;
import defpackage.tba;
import defpackage.ug5;
import defpackage.yhk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0001\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001a\u00104\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u0010\tR\u001a\u00108\u001a\u00020\u00028\u0014X\u0094D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0004R\u001a\u0010;\u001a\u00020\u00028\u0014X\u0094D¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u001c\u0010C\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@R\u001c\u0010E\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@R\u001c\u0010G\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010@R\u001c\u0010I\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010@R\u001c\u0010K\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\bL\u0010@¨\u0006M"}, d2 = {"Lcom/sofascore/results/mma/organisation/details/view/MmaOrganisationFeaturedEventView;", "La6;", "", "getLayoutId", "()I", "Landroid/widget/TextView;", j.b, "Landroid/widget/TextView;", "getFirstFighterName", "()Landroid/widget/TextView;", "firstFighterName", CampaignEx.JSON_KEY_AD_K, "getSecondFighterName", "secondFighterName", "Landroid/widget/ImageView;", "l", "Landroid/widget/ImageView;", "getFirstFighterImage", "()Landroid/widget/ImageView;", "firstFighterImage", InneractiveMediationDefs.GENDER_MALE, "getSecondFighterImage", "secondFighterImage", C4427z5.q, "getFirstFighterFlag", "firstFighterFlag", "o", "getSecondFighterFlag", "secondFighterFlag", "Lcom/sofascore/results/view/MmaRoundInfoView;", TtmlNode.TAG_P, "Lcom/sofascore/results/view/MmaRoundInfoView;", "getRoundInfoView", "()Lcom/sofascore/results/view/MmaRoundInfoView;", "roundInfoView", "Ljlc;", CampaignEx.JSON_KEY_AD_Q, "Ljlc;", "getMiddleText", "()Ljlc;", "middleText", "Llsc;", "r", "Llsc;", "getFirstFighterWinMarker", "()Llsc;", "firstFighterWinMarker", "s", "getSecondFighterWinMarker", "secondFighterWinMarker", "t", "getVsText", "vsText", "u", "I", "getDefaultVsBottomMargin", "defaultVsBottomMargin", "v", "getUpcomingMatchVsBottomMargin", "upcomingMatchVsBottomMargin", "", "liveIndicator", "Ljava/lang/Void;", "getLiveIndicator", "()Ljava/lang/Void;", "dateText", "getDateText", "weightClassText", "getWeightClassText", "fightTypeText", "getFightTypeText", "fightEndInfoText", "getFightEndInfoText", "bellButton", "getBellButton", "bottomDivider", "getBottomDivider", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaOrganisationFeaturedEventView extends a6 {
    public static final /* synthetic */ int x = 0;
    public final ed i;

    /* renamed from: j, reason: from kotlin metadata */
    public final TextView firstFighterName;

    /* renamed from: k, reason: from kotlin metadata */
    public final TextView secondFighterName;

    /* renamed from: l, reason: from kotlin metadata */
    public final ImageView firstFighterImage;

    /* renamed from: m, reason: from kotlin metadata */
    public final ImageView secondFighterImage;

    /* renamed from: n, reason: from kotlin metadata */
    public final ImageView firstFighterFlag;

    /* renamed from: o, reason: from kotlin metadata */
    public final ImageView secondFighterFlag;

    /* renamed from: p, reason: from kotlin metadata */
    public final MmaRoundInfoView roundInfoView;

    /* renamed from: q, reason: from kotlin metadata */
    public final jlc middleText;

    /* renamed from: r, reason: from kotlin metadata */
    public final lsc firstFighterWinMarker;

    /* renamed from: s, reason: from kotlin metadata */
    public final lsc secondFighterWinMarker;

    /* renamed from: t, reason: from kotlin metadata */
    public final TextView vsText;

    /* renamed from: u, reason: from kotlin metadata */
    public final int defaultVsBottomMargin;

    /* renamed from: v, reason: from kotlin metadata */
    public final int upcomingMatchVsBottomMargin;
    public final boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaOrganisationFeaturedEventView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View view;
        String str;
        Throwable th;
        context.getClass();
        View root = getRoot();
        int i = R.id.event_card;
        View B = nq8.B(R.id.event_card, root);
        if (B != null) {
            int i2 = R.id.background_image;
            ImageView imageView = (ImageView) nq8.B(R.id.background_image, B);
            if (imageView != null) {
                i2 = R.id.first_fighter_country;
                ImageView imageView2 = (ImageView) nq8.B(R.id.first_fighter_country, B);
                if (imageView2 != null) {
                    i2 = R.id.first_fighter_image;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.first_fighter_image, B);
                    if (imageView3 != null) {
                        i2 = R.id.first_fighter_name;
                        TextView textView = (TextView) nq8.B(R.id.first_fighter_name, B);
                        if (textView != null) {
                            i2 = R.id.name_time;
                            TextView textView2 = (TextView) nq8.B(R.id.name_time, B);
                            if (textView2 != null) {
                                i2 = R.id.overlay;
                                View B2 = nq8.B(R.id.overlay, B);
                                if (B2 != null) {
                                    i2 = R.id.round_info;
                                    MmaRoundInfoView mmaRoundInfoView = (MmaRoundInfoView) nq8.B(R.id.round_info, B);
                                    if (mmaRoundInfoView != null) {
                                        i2 = R.id.second_fighter_country;
                                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_fighter_country, B);
                                        if (imageView4 != null) {
                                            i2 = R.id.second_fighter_image;
                                            ImageView imageView5 = (ImageView) nq8.B(R.id.second_fighter_image, B);
                                            if (imageView5 != null) {
                                                i2 = R.id.second_fighter_name;
                                                TextView textView3 = (TextView) nq8.B(R.id.second_fighter_name, B);
                                                if (textView3 != null) {
                                                    i2 = R.id.text_middle;
                                                    View B3 = nq8.B(R.id.text_middle, B);
                                                    if (B3 != null) {
                                                        jlc a = jlc.a(B3);
                                                        i2 = R.id.text_vs;
                                                        TextView textView4 = (TextView) nq8.B(R.id.text_vs, B);
                                                        if (textView4 != null) {
                                                            i2 = R.id.win_marker_away;
                                                            View B4 = nq8.B(R.id.win_marker_away, B);
                                                            if (B4 != null) {
                                                                lsc a2 = lsc.a(B4);
                                                                i2 = R.id.win_marker_home;
                                                                View B5 = nq8.B(R.id.win_marker_home, B);
                                                                if (B5 != null) {
                                                                    lsc a3 = lsc.a(B5);
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) B;
                                                                    nz0 nz0Var = new nz0(constraintLayout, imageView, imageView2, imageView3, textView, textView2, B2, mmaRoundInfoView, imageView4, imageView5, textView3, a, textView4, a2, a3);
                                                                    th = null;
                                                                    View B6 = nq8.B(R.id.title, root);
                                                                    if (B6 != null) {
                                                                        kqb a4 = kqb.a(B6);
                                                                        this.i = new ed((LinearLayout) root, nz0Var, a4, 18);
                                                                        this.firstFighterName = textView;
                                                                        this.secondFighterName = textView3;
                                                                        this.firstFighterImage = imageView3;
                                                                        this.secondFighterImage = imageView5;
                                                                        this.firstFighterFlag = imageView2;
                                                                        this.secondFighterFlag = imageView4;
                                                                        this.roundInfoView = mmaRoundInfoView;
                                                                        this.middleText = a;
                                                                        this.firstFighterWinMarker = a3;
                                                                        this.secondFighterWinMarker = a2;
                                                                        this.vsText = textView4;
                                                                        this.defaultVsBottomMargin = 8;
                                                                        this.upcomingMatchVsBottomMargin = 20;
                                                                        this.w = true;
                                                                        setVisibility(8);
                                                                        constraintLayout.setClipToOutline(true);
                                                                        aba.y(B2, 0, 3);
                                                                        a4.d.setText(context.getString(R.string.featured));
                                                                        return;
                                                                    }
                                                                    view = root;
                                                                    i = R.id.title;
                                                                    str = "Missing required view with ID: ";
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
            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
            throw null;
        }
        view = root;
        str = "Missing required view with ID: ";
        th = null;
        yhk.s(str.concat(view.getResources().getResourceName(i)));
        throw th;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ BellButton getBellButton() {
        return (BellButton) m706getBellButton();
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ View getBottomDivider() {
        return (View) m707getBottomDivider();
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getDateText() {
        return (TextView) m708getDateText();
    }

    @Override // defpackage.a6
    public int getDefaultVsBottomMargin() {
        return this.defaultVsBottomMargin;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getFightEndInfoText() {
        return (TextView) m709getFightEndInfoText();
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getFightTypeText() {
        return (TextView) m710getFightTypeText();
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
        return R.layout.organisation_featured_event_view;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getLiveIndicator() {
        return (TextView) m711getLiveIndicator();
    }

    @Override // defpackage.a6
    @NotNull
    public jlc getMiddleText() {
        return this.middleText;
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
    public int getUpcomingMatchVsBottomMargin() {
        return this.upcomingMatchVsBottomMargin;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getVsText() {
        return this.vsText;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getWeightClassText() {
        return (TextView) m712getWeightClassText();
    }

    @Override // defpackage.a6
    public final void j(MmaEvent mmaEvent) {
        getMiddleText().c.setTextColor(getContext().getColor(R.color.surface_1));
        getMiddleText().b.setTextColor(getContext().getColor(R.color.on_color_secondary));
        getMiddleText().a.setBackgroundTintList(eq3.q(R.color.darken_overlay_2, getContext()));
        super.j(mmaEvent);
    }

    @Override // defpackage.a6
    public final void l(MmaEvent mmaEvent) {
        super.l(mmaEvent);
        setVisibility(0);
        o8.d(this, 0, 7);
        View root = getRoot();
        Context context = getContext();
        context.getClass();
        root.setPaddingRelative(root.getPaddingStart(), root.getPaddingTop(), root.getPaddingEnd(), ao2.s(8, context));
        ed edVar = this.i;
        as9.j(((nz0) edVar.c).c, R.drawable.mma_featured_event_bg);
        nz0 nz0Var = (nz0) edVar.c;
        nz0Var.b.setOnClickListener(new au7(27, this, mmaEvent));
        int color = getContext().getColor(R.color.darken_overlay_2);
        getFirstFighterWinMarker().a.getBackground().setTint(color);
        getSecondFighterWinMarker().a.getBackground().setTint(color);
        String w = tba.w(mmaEvent.getTournament());
        long startTimestamp = mmaEvent.getStartTimestamp();
        Context context2 = getContext();
        context2.getClass();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context2) ? "Hm" : "hm");
        bestPattern.getClass();
        String i = fc6.i(startTimestamp, hk4.a(bestPattern));
        Integer valueOf = ug5.u(startTimestamp) ? Integer.valueOf(R.string.today) : ug5.w(startTimestamp) ? Integer.valueOf(R.string.yesterday) : ug5.v(startTimestamp) ? Integer.valueOf(R.string.tomorrow) : null;
        me4.s(new Object[]{w, valueOf != null ? String.format(Locale.getDefault(), "%s, %s", Arrays.copyOf(new Object[]{getContext().getString(valueOf.intValue()), i}, 2)) : fc6.i(startTimestamp, hk4.a(bi4.PATTERN_DAY_DMY.d()))}, 2, Locale.getDefault(), "%s | %s", nz0Var.d);
        requestLayout();
    }

    @Override // defpackage.a6
    /* renamed from: n, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Nullable
    /* renamed from: getBellButton, reason: collision with other method in class */
    public Void m706getBellButton() {
        return null;
    }

    @Nullable
    /* renamed from: getBottomDivider, reason: collision with other method in class */
    public Void m707getBottomDivider() {
        return null;
    }

    @Nullable
    /* renamed from: getDateText, reason: collision with other method in class */
    public Void m708getDateText() {
        return null;
    }

    @Nullable
    /* renamed from: getFightEndInfoText, reason: collision with other method in class */
    public Void m709getFightEndInfoText() {
        return null;
    }

    @Nullable
    /* renamed from: getFightTypeText, reason: collision with other method in class */
    public Void m710getFightTypeText() {
        return null;
    }

    @Nullable
    /* renamed from: getLiveIndicator, reason: collision with other method in class */
    public Void m711getLiveIndicator() {
        return null;
    }

    @Nullable
    /* renamed from: getWeightClassText, reason: collision with other method in class */
    public Void m712getWeightClassText() {
        return null;
    }
}
