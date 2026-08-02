package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.MmaRoundInfoView;
import com.vungle.ads.internal.protos.Sdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class coc extends a6 {
    public final ez0 i;
    public final int j;
    public final int k;
    public final TextView l;
    public final TextView m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final MmaRoundInfoView r;
    public final jlc s;
    public final lsc t;
    public final lsc u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final BellButton y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coc(Context context) {
        super(context, null);
        context.getClass();
        View root = getRoot();
        int i = R.id.content;
        View B = nq8.B(R.id.content, root);
        if (B != null) {
            zl c = zl.c(B);
            i = R.id.date_header;
            View B2 = nq8.B(R.id.date_header, root);
            if (B2 != null) {
                int i2 = R.id.bell_button;
                BellButton bellButton = (BellButton) nq8.B(R.id.bell_button, B2);
                if (bellButton != null) {
                    i2 = R.id.text_end;
                    TextView textView = (TextView) nq8.B(R.id.text_end, B2);
                    if (textView != null) {
                        i2 = R.id.text_middle;
                        if (((TextView) nq8.B(R.id.text_middle, B2)) != null) {
                            i2 = R.id.text_start;
                            TextView textView2 = (TextView) nq8.B(R.id.text_start, B2);
                            if (textView2 != null) {
                                woc wocVar = new woc((ConstraintLayout) B2, bellButton, textView, textView2);
                                i = R.id.event_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.event_container, root);
                                if (linearLayout != null) {
                                    i = R.id.league_header;
                                    View B3 = nq8.B(R.id.league_header, root);
                                    if (B3 != null) {
                                        this.i = new ez0((LinearLayout) root, c, wocVar, linearLayout, zl.d(B3));
                                        this.j = context.getColor(R.color.n_lv_1);
                                        this.k = context.getColor(R.color.n_lv_3);
                                        this.l = (TextView) c.j;
                                        this.m = c.g;
                                        this.n = (ImageView) c.h;
                                        this.o = (ImageView) c.e;
                                        this.p = (ImageView) c.d;
                                        this.q = (ImageView) c.c;
                                        this.r = (MmaRoundInfoView) c.l;
                                        this.s = (jlc) c.f;
                                        this.t = (lsc) c.n;
                                        this.u = (lsc) c.m;
                                        this.v = (TextView) c.k;
                                        this.w = textView2;
                                        this.x = textView;
                                        this.y = bellButton;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(i2)));
                throw null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.a6
    @NotNull
    public BellButton getBellButton() {
        return this.y;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ View getBottomDivider() {
        return (View) m19getBottomDivider();
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getDateText() {
        return this.w;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFightEndInfoText() {
        return this.x;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getFightTypeText() {
        return (TextView) m20getFightTypeText();
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterFlag() {
        return this.p;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getFirstFighterImage() {
        return this.n;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getFirstFighterName() {
        return this.l;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getFirstFighterWinMarker() {
        return this.t;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_fighter_matches_item;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getLiveIndicator() {
        return (TextView) m21getLiveIndicator();
    }

    @Override // defpackage.a6
    @NotNull
    public jlc getMiddleText() {
        return this.s;
    }

    @Override // defpackage.a6
    public int getPrimaryTextColor() {
        return this.j;
    }

    @Override // defpackage.a6
    @NotNull
    public MmaRoundInfoView getRoundInfoView() {
        return this.r;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterFlag() {
        return this.q;
    }

    @Override // defpackage.a6
    @NotNull
    public ImageView getSecondFighterImage() {
        return this.o;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getSecondFighterName() {
        return this.m;
    }

    @Override // defpackage.a6
    @NotNull
    public lsc getSecondFighterWinMarker() {
        return this.u;
    }

    @Override // defpackage.a6
    public int getSecondaryTextColor() {
        return this.k;
    }

    @Override // defpackage.a6
    @NotNull
    public TextView getVsText() {
        return this.v;
    }

    @Override // defpackage.a6
    public /* bridge */ /* synthetic */ TextView getWeightClassText() {
        return (TextView) m22getWeightClassText();
    }

    @Override // defpackage.a6
    public final void j(MmaEvent mmaEvent) {
        getMiddleText().c.setTextColor(getContext().getColor(R.color.n_lv_1));
        getMiddleText().b.setTextColor(getContext().getColor(R.color.n_lv_3));
        getMiddleText().a.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.surface_2)));
        super.j(mmaEvent);
        TextView dateText = getDateText();
        Context context = getContext();
        context.getClass();
        dateText.setText(rik.j(context, mmaEvent.getStartTimestamp(), bi4.PATTERN_DMY, " "));
        haa.D(getDateText());
        ez0 ez0Var = this.i;
        ((zl) ez0Var.e).g.setVisibility(8);
        zl zlVar = (zl) ez0Var.e;
        ((TextView) zlVar.b).setVisibility(0);
        ((TextView) zlVar.b).setText(tba.w(mmaEvent.getTournament()));
        ImageView imageView = (ImageView) zlVar.d;
        UniqueTournament uniqueTournament = mmaEvent.getTournament().getUniqueTournament();
        as9.q(imageView, Integer.valueOf(uniqueTournament != null ? uniqueTournament.getId() : 0), 0, null);
    }

    @Override // defpackage.a6
    public final void l(final MmaEvent mmaEvent) {
        super.l(mmaEvent);
        final int i = 0;
        o8.d(this, 0, 7);
        View root = getRoot();
        Context context = getContext();
        context.getClass();
        root.setPaddingRelative(root.getPaddingStart(), root.getPaddingTop(), root.getPaddingEnd(), ao2.s(8, context));
        MmaRoundInfoView roundInfoView = getRoundInfoView();
        ColorStateList valueOf = ColorStateList.valueOf(roundInfoView.getContext().getColor(android.R.color.transparent));
        valueOf.getClass();
        e92 e92Var = roundInfoView.a;
        ((MaterialCardView) e92Var.e).setCardBackgroundColor(valueOf);
        ((MaterialCardView) e92Var.e).setStrokeColor(valueOf);
        ez0 ez0Var = this.i;
        LinearLayout linearLayout = (LinearLayout) ((zl) ez0Var.e).f;
        linearLayout.getClass();
        aba.y(linearLayout, 0, 3);
        ((LinearLayout) ((zl) ez0Var.e).f).setOnClickListener(new View.OnClickListener(this) { // from class: boc
            public final /* synthetic */ coc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                MmaEvent mmaEvent2 = mmaEvent;
                coc cocVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = MmaFightNightActivity.R;
                        Context context2 = cocVar.getContext();
                        context2.getClass();
                        x2a.S(mmaEvent2.getTournament().getId(), context2);
                        break;
                    default:
                        wxf wxfVar = EventActivity.h0;
                        Context context3 = cocVar.getContext();
                        context3.getClass();
                        wxf.B(context3, mmaEvent2.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((LinearLayout) ez0Var.d).setOnClickListener(new View.OnClickListener(this) { // from class: boc
            public final /* synthetic */ coc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                MmaEvent mmaEvent2 = mmaEvent;
                coc cocVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = MmaFightNightActivity.R;
                        Context context2 = cocVar.getContext();
                        context2.getClass();
                        x2a.S(mmaEvent2.getTournament().getId(), context2);
                        break;
                    default:
                        wxf wxfVar = EventActivity.h0;
                        Context context3 = cocVar.getContext();
                        context3.getClass();
                        wxf.B(context3, mmaEvent2.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        break;
                }
            }
        });
        ((View) ((zl) ez0Var.c).i).setVisibility(8);
    }

    @Override // defpackage.a6
    /* renamed from: n */
    public final boolean getW() {
        return false;
    }

    @Override // defpackage.a6
    public void setInProgressState(boolean z) {
        super.setInProgressState(z);
        getDateText().setVisibility(0);
    }

    @Nullable
    /* renamed from: getBottomDivider, reason: collision with other method in class */
    public Void m19getBottomDivider() {
        return null;
    }

    @Nullable
    /* renamed from: getFightTypeText, reason: collision with other method in class */
    public Void m20getFightTypeText() {
        return null;
    }

    @Nullable
    /* renamed from: getLiveIndicator, reason: collision with other method in class */
    public Void m21getLiveIndicator() {
        return null;
    }

    @Nullable
    /* renamed from: getWeightClassText, reason: collision with other method in class */
    public Void m22getWeightClassText() {
        return null;
    }
}
