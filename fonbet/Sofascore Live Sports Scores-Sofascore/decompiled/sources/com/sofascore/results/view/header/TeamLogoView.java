package com.sofascore.results.view.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.awj;
import defpackage.dmi;
import defpackage.ejg;
import defpackage.eq3;
import defpackage.f7a;
import defpackage.fc6;
import defpackage.hkg;
import defpackage.ht9;
import defpackage.jle;
import defpackage.joa;
import defpackage.jrg;
import defpackage.k9f;
import defpackage.m0j;
import defpackage.nt9;
import defpackage.nxi;
import defpackage.pco;
import defpackage.ph0;
import defpackage.rfo;
import defpackage.sl6;
import defpackage.st9;
import defpackage.u6h;
import defpackage.uaa;
import defpackage.urh;
import defpackage.wt9;
import defpackage.wyh;
import defpackage.x6k;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/sofascore/results/view/header/TeamLogoView;", "Landroid/view/View;", "Lm0j;", "s", "Ljoa;", "getTeamRoundListPopup", "()Lm0j;", "teamRoundListPopup", "Lwt9;", "getResult", "()Lwt9;", "result", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamLogoView extends View {
    public static final /* synthetic */ int t = 0;
    public boolean a;
    public final boolean b;
    public boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public Team i;
    public Drawable j;
    public Drawable k;
    public final Rect l;
    public final Rect m;
    public final Paint n;
    public Drawable o;
    public Drawable p;
    public Bitmap q;
    public TextView r;

    /* renamed from: s, reason: from kotlin metadata */
    public final joa teamRoundListPopup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.b = hkg.c0(context);
        this.d = ao2.s(16, context);
        this.e = ao2.s(48, context);
        this.f = ao2.s(40, context);
        this.g = ao2.s(10, context);
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Paint(1);
        this.teamRoundListPopup = ypa.a(ysa.c, new k9f(context, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(final TeamLogoView teamLogoView, Team team, String str, int i) {
        Bitmap bitmap;
        int i2;
        SubTeam subTeam1;
        Context context;
        SubTeam subTeam2;
        Context context2;
        TextView textView;
        String alpha2;
        String alpha22;
        final int i3 = 4;
        char c = (i & 4) != 0 ? (char) 3 : (char) 5;
        teamLogoView.getClass();
        team.getClass();
        final int i4 = 0;
        final int i5 = 1;
        teamLogoView.c = c == 5;
        teamLogoView.i = team;
        Sport sport = team.getSport();
        String slug = sport != null ? sport.getSlug() : null;
        teamLogoView.j = null;
        teamLogoView.k = null;
        teamLogoView.o = null;
        teamLogoView.p = null;
        teamLogoView.r = null;
        teamLogoView.q = null;
        teamLogoView.a = false;
        final int i6 = 5;
        if (Intrinsics.c(slug, Sports.TENNIS)) {
            if (!team.getNational()) {
                Country country = team.getCountry();
                String alpha23 = country != null ? country.getAlpha2() : null;
                if (alpha23 != null && alpha23.length() != 0) {
                    i2 = 1;
                    teamLogoView.a = true;
                    subTeam1 = team.getSubTeam1();
                    context = teamLogoView.getContext();
                    context.getClass();
                    if (hkg.c0(context)) {
                        subTeam1 = null;
                    }
                    if (subTeam1 == null) {
                        subTeam1 = team.getSubTeam2();
                    }
                    subTeam2 = team.getSubTeam2();
                    context2 = teamLogoView.getContext();
                    context2.getClass();
                    if (hkg.c0(context2)) {
                        subTeam2 = null;
                    }
                    if (subTeam2 == null) {
                        subTeam2 = team.getSubTeam1();
                    }
                    if (subTeam1 != null && subTeam2 != null) {
                        teamLogoView.requestLayout();
                        teamLogoView.d(subTeam1.getId(), slug, null, new Function1(teamLogoView) { // from class: oxi
                            public final /* synthetic */ TeamLogoView b;

                            {
                                this.b = teamLogoView;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i7 = i4;
                                TeamLogoView teamLogoView2 = this.b;
                                Drawable drawable = (Drawable) obj;
                                switch (i7) {
                                    case 0:
                                        teamLogoView2.j = drawable;
                                        break;
                                    case 1:
                                        teamLogoView2.k = drawable;
                                        break;
                                    case 2:
                                        teamLogoView2.o = drawable;
                                        break;
                                    case 3:
                                        teamLogoView2.p = drawable;
                                        break;
                                    case 4:
                                        teamLogoView2.j = drawable;
                                        break;
                                    default:
                                        teamLogoView2.o = drawable;
                                        break;
                                }
                                return Unit.a;
                            }
                        });
                        teamLogoView.d(subTeam2.getId(), slug, null, new Function1(teamLogoView) { // from class: oxi
                            public final /* synthetic */ TeamLogoView b;

                            {
                                this.b = teamLogoView;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i7 = i5;
                                TeamLogoView teamLogoView2 = this.b;
                                Drawable drawable = (Drawable) obj;
                                switch (i7) {
                                    case 0:
                                        teamLogoView2.j = drawable;
                                        break;
                                    case 1:
                                        teamLogoView2.k = drawable;
                                        break;
                                    case 2:
                                        teamLogoView2.o = drawable;
                                        break;
                                    case 3:
                                        teamLogoView2.p = drawable;
                                        break;
                                    case 4:
                                        teamLogoView2.j = drawable;
                                        break;
                                    default:
                                        teamLogoView2.o = drawable;
                                        break;
                                }
                                return Unit.a;
                            }
                        });
                        Country country2 = subTeam1.getCountry();
                        alpha2 = country2 == null ? country2.getAlpha2() : null;
                        if (alpha2 != null && alpha2.length() != 0) {
                            Country country3 = subTeam1.getCountry();
                            final int i7 = 2;
                            teamLogoView.c(country3 == null ? country3.getAlpha2() : null, new Function1(teamLogoView) { // from class: oxi
                                public final /* synthetic */ TeamLogoView b;

                                {
                                    this.b = teamLogoView;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i72 = i7;
                                    TeamLogoView teamLogoView2 = this.b;
                                    Drawable drawable = (Drawable) obj;
                                    switch (i72) {
                                        case 0:
                                            teamLogoView2.j = drawable;
                                            break;
                                        case 1:
                                            teamLogoView2.k = drawable;
                                            break;
                                        case 2:
                                            teamLogoView2.o = drawable;
                                            break;
                                        case 3:
                                            teamLogoView2.p = drawable;
                                            break;
                                        case 4:
                                            teamLogoView2.j = drawable;
                                            break;
                                        default:
                                            teamLogoView2.o = drawable;
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                        Country country4 = subTeam2.getCountry();
                        alpha22 = country4 == null ? country4.getAlpha2() : null;
                        if (alpha22 != null && alpha22.length() != 0) {
                            Country country5 = subTeam2.getCountry();
                            final int i8 = 3;
                            teamLogoView.c(country5 == null ? country5.getAlpha2() : null, new Function1(teamLogoView) { // from class: oxi
                                public final /* synthetic */ TeamLogoView b;

                                {
                                    this.b = teamLogoView;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i72 = i8;
                                    TeamLogoView teamLogoView2 = this.b;
                                    Drawable drawable = (Drawable) obj;
                                    switch (i72) {
                                        case 0:
                                            teamLogoView2.j = drawable;
                                            break;
                                        case 1:
                                            teamLogoView2.k = drawable;
                                            break;
                                        case 2:
                                            teamLogoView2.o = drawable;
                                            break;
                                        case 3:
                                            teamLogoView2.p = drawable;
                                            break;
                                        case 4:
                                            teamLogoView2.j = drawable;
                                            break;
                                        default:
                                            teamLogoView2.o = drawable;
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                    }
                    if (str != null) {
                        textView = null;
                    } else {
                        textView = new TextView(teamLogoView.getContext());
                        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        Context context3 = textView.getContext();
                        context3.getClass();
                        textView.setMinWidth(ao2.s(16, context3));
                        textView.setTextSize(1, 12.0f);
                        Context context4 = textView.getContext();
                        context4.getClass();
                        int s = ao2.s(5, context4);
                        Context context5 = textView.getContext();
                        context5.getClass();
                        textView.setPaddingRelative(s, textView.getPaddingTop(), ao2.s(5, context5), textView.getPaddingBottom());
                        textView.setTextAppearance((!teamLogoView.a || teamLogoView.e()) ? R.style.AssistiveDefault : R.style.AssistiveMicro);
                        textView.setTextColor(textView.getContext().getColor(R.color.surface_1));
                        textView.setBackground(textView.getContext().getDrawable(R.drawable.rounded_surface_level_3));
                        Context context6 = textView.getContext();
                        context6.getClass();
                        textView.setBackgroundTintList(ColorStateList.valueOf(uaa.o(context6, str)));
                        Context context7 = textView.getContext();
                        context7.getClass();
                        textView.setText(uaa.q(context7, str));
                        textView.setGravity(17);
                        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
                    }
                    teamLogoView.r = textView;
                    i4 = i2;
                }
            }
            i2 = 0;
            teamLogoView.a = true;
            subTeam1 = team.getSubTeam1();
            context = teamLogoView.getContext();
            context.getClass();
            if (hkg.c0(context)) {
            }
            if (subTeam1 == null) {
            }
            subTeam2 = team.getSubTeam2();
            context2 = teamLogoView.getContext();
            context2.getClass();
            if (hkg.c0(context2)) {
            }
            if (subTeam2 == null) {
            }
            if (subTeam1 != null) {
                teamLogoView.requestLayout();
                teamLogoView.d(subTeam1.getId(), slug, null, new Function1(teamLogoView) { // from class: oxi
                    public final /* synthetic */ TeamLogoView b;

                    {
                        this.b = teamLogoView;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i4;
                        TeamLogoView teamLogoView2 = this.b;
                        Drawable drawable = (Drawable) obj;
                        switch (i72) {
                            case 0:
                                teamLogoView2.j = drawable;
                                break;
                            case 1:
                                teamLogoView2.k = drawable;
                                break;
                            case 2:
                                teamLogoView2.o = drawable;
                                break;
                            case 3:
                                teamLogoView2.p = drawable;
                                break;
                            case 4:
                                teamLogoView2.j = drawable;
                                break;
                            default:
                                teamLogoView2.o = drawable;
                                break;
                        }
                        return Unit.a;
                    }
                });
                teamLogoView.d(subTeam2.getId(), slug, null, new Function1(teamLogoView) { // from class: oxi
                    public final /* synthetic */ TeamLogoView b;

                    {
                        this.b = teamLogoView;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i5;
                        TeamLogoView teamLogoView2 = this.b;
                        Drawable drawable = (Drawable) obj;
                        switch (i72) {
                            case 0:
                                teamLogoView2.j = drawable;
                                break;
                            case 1:
                                teamLogoView2.k = drawable;
                                break;
                            case 2:
                                teamLogoView2.o = drawable;
                                break;
                            case 3:
                                teamLogoView2.p = drawable;
                                break;
                            case 4:
                                teamLogoView2.j = drawable;
                                break;
                            default:
                                teamLogoView2.o = drawable;
                                break;
                        }
                        return Unit.a;
                    }
                });
                Country country22 = subTeam1.getCountry();
                if (country22 == null) {
                }
                if (alpha2 != null) {
                    Country country32 = subTeam1.getCountry();
                    final int i72 = 2;
                    teamLogoView.c(country32 == null ? country32.getAlpha2() : null, new Function1(teamLogoView) { // from class: oxi
                        public final /* synthetic */ TeamLogoView b;

                        {
                            this.b = teamLogoView;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i722 = i72;
                            TeamLogoView teamLogoView2 = this.b;
                            Drawable drawable = (Drawable) obj;
                            switch (i722) {
                                case 0:
                                    teamLogoView2.j = drawable;
                                    break;
                                case 1:
                                    teamLogoView2.k = drawable;
                                    break;
                                case 2:
                                    teamLogoView2.o = drawable;
                                    break;
                                case 3:
                                    teamLogoView2.p = drawable;
                                    break;
                                case 4:
                                    teamLogoView2.j = drawable;
                                    break;
                                default:
                                    teamLogoView2.o = drawable;
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                Country country42 = subTeam2.getCountry();
                if (country42 == null) {
                }
                if (alpha22 != null) {
                    Country country52 = subTeam2.getCountry();
                    final int i82 = 3;
                    teamLogoView.c(country52 == null ? country52.getAlpha2() : null, new Function1(teamLogoView) { // from class: oxi
                        public final /* synthetic */ TeamLogoView b;

                        {
                            this.b = teamLogoView;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i722 = i82;
                            TeamLogoView teamLogoView2 = this.b;
                            Drawable drawable = (Drawable) obj;
                            switch (i722) {
                                case 0:
                                    teamLogoView2.j = drawable;
                                    break;
                                case 1:
                                    teamLogoView2.k = drawable;
                                    break;
                                case 2:
                                    teamLogoView2.o = drawable;
                                    break;
                                case 3:
                                    teamLogoView2.p = drawable;
                                    break;
                                case 4:
                                    teamLogoView2.j = drawable;
                                    break;
                                default:
                                    teamLogoView2.o = drawable;
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
            }
            if (str != null) {
            }
            teamLogoView.r = textView;
            i4 = i2;
        } else if (Intrinsics.c(slug, Sports.MMA)) {
            Drawable drawable = teamLogoView.getContext().getDrawable(R.drawable.ic_corner);
            if (drawable != null) {
                if (c == 3) {
                    drawable.setTintList(eq3.q(R.color.red_fighter_default, teamLogoView.getContext()));
                } else if (c == 5) {
                    drawable.setTintList(eq3.q(R.color.blue_fighter_default, teamLogoView.getContext()));
                }
                bitmap = u6h.U(drawable, 0, 0, 7);
            } else {
                bitmap = null;
            }
            teamLogoView.q = bitmap;
            i4 = 1;
        }
        if (teamLogoView.e()) {
            return;
        }
        teamLogoView.p = null;
        teamLogoView.k = null;
        teamLogoView.d(team.getId(), slug, team.getGender(), new Function1(teamLogoView) { // from class: oxi
            public final /* synthetic */ TeamLogoView b;

            {
                this.b = teamLogoView;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i722 = i3;
                TeamLogoView teamLogoView2 = this.b;
                Drawable drawable2 = (Drawable) obj;
                switch (i722) {
                    case 0:
                        teamLogoView2.j = drawable2;
                        break;
                    case 1:
                        teamLogoView2.k = drawable2;
                        break;
                    case 2:
                        teamLogoView2.o = drawable2;
                        break;
                    case 3:
                        teamLogoView2.p = drawable2;
                        break;
                    case 4:
                        teamLogoView2.j = drawable2;
                        break;
                    default:
                        teamLogoView2.o = drawable2;
                        break;
                }
                return Unit.a;
            }
        });
        if (i4 != 0) {
            Country country6 = team.getCountry();
            teamLogoView.c(country6 != null ? country6.getAlpha2() : null, new Function1(teamLogoView) { // from class: oxi
                public final /* synthetic */ TeamLogoView b;

                {
                    this.b = teamLogoView;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i722 = i6;
                    TeamLogoView teamLogoView2 = this.b;
                    Drawable drawable2 = (Drawable) obj;
                    switch (i722) {
                        case 0:
                            teamLogoView2.j = drawable2;
                            break;
                        case 1:
                            teamLogoView2.k = drawable2;
                            break;
                        case 2:
                            teamLogoView2.o = drawable2;
                            break;
                        case 3:
                            teamLogoView2.p = drawable2;
                            break;
                        case 4:
                            teamLogoView2.j = drawable2;
                            break;
                        default:
                            teamLogoView2.o = drawable2;
                            break;
                    }
                    return Unit.a;
                }
            });
        }
    }

    private final wt9 getResult() {
        return rfo.I(this);
    }

    private final m0j getTeamRoundListPopup() {
        return (m0j) this.teamRoundListPopup.getValue();
    }

    public final void a(Canvas canvas) {
        int measuredWidth;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(this.l);
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            int i = this.d;
            drawable2.setBounds(0, 0, i, i);
            boolean e = e();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!e) {
                boolean z = this.c;
                if (this.b) {
                    if (!z) {
                        measuredWidth = getMeasuredWidth();
                        f = measuredWidth - i;
                    }
                } else if (z) {
                    measuredWidth = getMeasuredWidth();
                    f = measuredWidth - i;
                }
            }
            int save = canvas.save();
            try {
                canvas.translate(f, getMeasuredHeight() - i);
                drawable2.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void b(Canvas canvas) {
        if (e()) {
            Drawable drawable = this.k;
            if (drawable != null) {
                drawable.setBounds(this.m);
                drawable.draw(canvas);
            }
            Drawable drawable2 = this.p;
            if (drawable2 != null) {
                int i = this.d;
                drawable2.setBounds(0, 0, i, i);
                int save = canvas.save();
                try {
                    canvas.translate(getMeasuredWidth() - i, getMeasuredHeight() - i);
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final void c(String str, Function1 function1) {
        String str2;
        nt9 a;
        if (str != null) {
            str2 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str, "/flag");
        } else {
            str2 = null;
        }
        Context context = getContext();
        context.getClass();
        ht9 ht9Var = new ht9(context);
        ht9Var.c = str2 == null ? Integer.valueOf(R.drawable.ic_flag_placeholder) : str2;
        ht9Var.q = jrg.b;
        ht9Var.f = str2 == null ? "--" : str2;
        if (str2 == null) {
            str2 = "--";
        }
        ht9Var.c(str2);
        Context context2 = getContext();
        context2.getClass();
        wt9 result = getResult();
        z8e.Q(ht9Var, context2, R.drawable.ic_flag_placeholder, (result == null || (a = result.a()) == null) ? null : a.e, null);
        ht9Var.d = new ejg(19, function1, this, function1);
        Context context3 = getContext();
        context3.getClass();
        ajh.a(context3).a(ht9Var.a());
    }

    public final void d(int i, String str, Gender gender, Function1 function1) {
        nt9 a;
        String str2 = null;
        Integer valueOf = !Intrinsics.c(str, Sports.MMA) ? Integer.valueOf(R.color.neutral_default) : null;
        int i2 = Intrinsics.c(str, Sports.MMA) ? gender == Gender.Female ? R.drawable.mma_women_placeholder : R.drawable.mma_men_placeholder : R.drawable.team_logo_placeholder;
        Context context = getContext();
        context.getClass();
        ht9 ht9Var = new ht9(context);
        ht9Var.c = pco.R(i);
        ht9Var.q = jrg.b;
        ht9Var.f = pco.R(i);
        ht9Var.c(pco.R(i));
        Context context2 = getContext();
        context2.getClass();
        wt9 result = getResult();
        if (result != null && (a = result.a()) != null) {
            str2 = a.e;
        }
        z8e.Q(ht9Var, context2, i2, str2, valueOf);
        ht9Var.d = new x6k(20, function1, this, function1);
        if (Intrinsics.c(str, Sports.TENNIS)) {
            awj[] awjVarArr = {new urh()};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
        }
        Context context3 = getContext();
        context3.getClass();
        ajh.a(context3).a(ht9Var.a());
    }

    public final boolean e() {
        Team team = this.i;
        if (team != null) {
            Sport sport = team.getSport();
            if (Intrinsics.c(sport != null ? sport.getSlug() : null, Sports.TENNIS) && team.getSubTeam1() != null && team.getSubTeam2() != null) {
                return true;
            }
        }
        return false;
    }

    public final void f(Integer num, List list) {
        Sport sport;
        if (list != null && !list.isEmpty()) {
            if (isHapticFeedbackEnabled()) {
                performHapticFeedback(1);
            }
            Context context = getContext();
            context.getClass();
            nxi.b(list, context, this, getTeamRoundListPopup());
            return;
        }
        if (num != null) {
            if (isHapticFeedbackEnabled()) {
                performHapticFeedback(1);
            }
            Set set = wyh.a;
            Team team = this.i;
            if (Intrinsics.c((team == null || (sport = team.getSport()) == null) ? null : sport.getSlug(), Sports.MMA)) {
                int i = MmaFighterActivity.U;
                Context context2 = getContext();
                context2.getClass();
                f7a.x(num.intValue(), context2);
                return;
            }
            int i2 = TeamActivity.Z;
            Context context3 = getContext();
            context3.getClass();
            jle.r(context3, num.intValue(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Number valueOf;
        Number valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.getClass();
        Context context = getContext();
        context.getClass();
        if (hkg.c0(context)) {
            a(canvas);
            b(canvas);
        } else {
            b(canvas);
            a(canvas);
        }
        Bitmap bitmap = this.q;
        boolean z = this.b;
        if (bitmap != null) {
            boolean z2 = this.c;
            if (z) {
                if (z2) {
                    valueOf = Integer.valueOf(getMeasuredWidth() - bitmap.getWidth());
                    canvas.save();
                    canvas.scale(!valueOf.equals(valueOf2) ? -1.0f : 1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    canvas.drawBitmap(bitmap, valueOf.floatValue(), getMeasuredHeight() - bitmap.getHeight(), this.n);
                    canvas.restore();
                }
                valueOf = valueOf2;
                canvas.save();
                canvas.scale(!valueOf.equals(valueOf2) ? -1.0f : 1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                canvas.drawBitmap(bitmap, valueOf.floatValue(), getMeasuredHeight() - bitmap.getHeight(), this.n);
                canvas.restore();
            } else {
                if (!z2) {
                    valueOf = Integer.valueOf(getMeasuredWidth() - bitmap.getWidth());
                    canvas.save();
                    canvas.scale(!valueOf.equals(valueOf2) ? -1.0f : 1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    canvas.drawBitmap(bitmap, valueOf.floatValue(), getMeasuredHeight() - bitmap.getHeight(), this.n);
                    canvas.restore();
                }
                valueOf = valueOf2;
                canvas.save();
                canvas.scale(!valueOf.equals(valueOf2) ? -1.0f : 1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                canvas.drawBitmap(bitmap, valueOf.floatValue(), getMeasuredHeight() - bitmap.getHeight(), this.n);
                canvas.restore();
            }
        }
        TextView textView = this.r;
        if (textView != null) {
            canvas.save();
            int measuredWidth = getMeasuredWidth() - textView.getMeasuredWidth();
            if (e()) {
                valueOf2 = Float.valueOf((getMeasuredWidth() / 2.0f) - (textView.getMeasuredWidth() / 2.0f));
            } else {
                boolean z3 = this.c;
                if (z) {
                    if (z3) {
                        valueOf2 = Integer.valueOf(measuredWidth);
                    }
                } else if (!z3) {
                    valueOf2 = Integer.valueOf(measuredWidth);
                }
            }
            canvas.translate(valueOf2.floatValue(), getMeasuredHeight() - textView.getMeasuredHeight());
            textView.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2 = View.MeasureSpec.getMode(i2) == 1073741824 ? View.MeasureSpec.getSize(i2) : (e() || this.a) ? this.f : this.e;
        this.h = size2;
        if (e()) {
            int i3 = this.h;
            int i4 = this.g;
            this.m.set(i3 - i4, 0, (i3 * 2) - i4, i3);
            size = (this.h * 2) - i4;
        } else {
            size = View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : this.h;
        }
        Rect rect = this.l;
        int i5 = this.h;
        rect.set(0, 0, i5, i5);
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r3.isEmpty() == false) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        SubTeam subTeam1;
        SubTeam subTeam2;
        SubTeam subTeam22;
        SubTeam subTeam12;
        ArrayList arrayList;
        List<TeamLinkedRound> teamLinks;
        Team team = this.i;
        if (team != null && team.getDisabled()) {
            Team team2 = this.i;
            if (team2 == null || (teamLinks = team2.getTeamLinks()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : teamLinks) {
                    if (!(((TeamLinkedRound) obj) instanceof TeamLinkedRound.UnknownTeamLinkedRound)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList != null) {
            }
            return super.onTouchEvent(motionEvent);
        }
        if (isEnabled()) {
            if (motionEvent != null && motionEvent.getActionMasked() == 1) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                boolean e = e();
                Rect rect = this.l;
                if (e) {
                    if (rect.contains(x, y)) {
                        Team team3 = this.i;
                        Integer valueOf = (team3 == null || (subTeam12 = team3.getSubTeam1()) == null) ? null : Integer.valueOf(subTeam12.getId());
                        Context context = getContext();
                        context.getClass();
                        if (hkg.c0(context)) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            Team team4 = this.i;
                            valueOf = (team4 == null || (subTeam22 = team4.getSubTeam2()) == null) ? null : Integer.valueOf(subTeam22.getId());
                        }
                        f(valueOf, null);
                    } else if (this.m.contains(x, y)) {
                        Team team5 = this.i;
                        Integer valueOf2 = (team5 == null || (subTeam2 = team5.getSubTeam2()) == null) ? null : Integer.valueOf(subTeam2.getId());
                        Context context2 = getContext();
                        context2.getClass();
                        if (hkg.c0(context2)) {
                            valueOf2 = null;
                        }
                        if (valueOf2 == null) {
                            Team team6 = this.i;
                            valueOf2 = (team6 == null || (subTeam1 = team6.getSubTeam1()) == null) ? null : Integer.valueOf(subTeam1.getId());
                        }
                        f(valueOf2, null);
                    }
                } else if (rect.contains(x, y)) {
                    Team team7 = this.i;
                    Integer valueOf3 = team7 != null ? Integer.valueOf(team7.getId()) : null;
                    Team team8 = this.i;
                    f(valueOf3, team8 != null ? team8.getTeamLinks() : null);
                }
                super.performClick();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
