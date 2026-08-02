package com.sofascore.results.featuredtournament.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import defpackage.bi4;
import defpackage.e92;
import defpackage.ez0;
import defpackage.hk4;
import defpackage.nq8;
import defpackage.pv7;
import defpackage.v9g;
import defpackage.yhk;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/featuredtournament/view/FeaturedTournamentHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedTournamentHeaderView extends ConstraintLayout {
    public static final /* synthetic */ int f = 0;
    public final e92 a;
    public pv7 b;
    public e92 c;
    public ez0 d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedTournamentHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        from.inflate(R.layout.view_featured_tournament_header, this);
        int i = R.id.countdown;
        ViewStub viewStub = (ViewStub) nq8.B(R.id.countdown, this);
        if (viewStub != null) {
            i = R.id.league_league_name;
            TextView textView = (TextView) nq8.B(R.id.league_league_name, this);
            if (textView != null) {
                i = R.id.league_logo;
                if (((ImageView) nq8.B(R.id.league_logo, this)) != null) {
                    i = R.id.progress;
                    ViewStub viewStub2 = (ViewStub) nq8.B(R.id.progress, this);
                    if (viewStub2 != null) {
                        i = R.id.tournament_details_button;
                        ImageView imageView = (ImageView) nq8.B(R.id.tournament_details_button, this);
                        if (imageView != null) {
                            this.a = new e92(this, viewStub, textView, viewStub2, imageView, 26);
                            this.e = context.getColor(R.color.on_color_primary);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Integer num, Integer num2) {
        ez0 ez0Var = this.d;
        if (ez0Var == null) {
            ez0Var = ez0.c(((ViewStub) this.a.f).inflate());
            this.d = ez0Var;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        TextView textView = (TextView) ez0Var.c;
        TextView textView2 = (TextView) ez0Var.e;
        ProgressBar progressBar = (ProgressBar) ez0Var.d;
        int i = this.e;
        textView2.setTextColor(i);
        textView.setTextColor(i);
        v9g.K(progressBar.getProgressDrawable(), i);
        if (num2 == null || num == null || num2.intValue() <= num.intValue()) {
            constraintLayout.getClass();
            constraintLayout.setVisibility(0);
            return;
        }
        long intValue = num.intValue();
        bi4 bi4Var = bi4.PATTERN_DMM;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(intValue));
        format.getClass();
        textView2.setText(format);
        String format2 = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(num2.intValue()));
        format2.getClass();
        textView.setText(format2);
        progressBar.setProgress((int) ((((System.currentTimeMillis() / 1000) - num.intValue()) * 100) / (num2.intValue() - num.intValue())));
        progressBar.setVisibility(0);
        constraintLayout.getClass();
        constraintLayout.setVisibility(0);
    }
}
