package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.DistributionItem;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.PeriodDistributionItem;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q09 extends o8 {
    public final Event d;
    public final mqi e;
    public final mqi f;
    public final mqi g;
    public final mqi h;
    public final mqi i;
    public final mqi j;
    public final mqi k;
    public final mqi l;
    public final mqi m;
    public final mqi n;
    public final mqi o;
    public final mqi p;
    public final mqi q;
    public final mqi r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public String w;
    public GoalDistributionsResponse x;
    public GoalDistributionsResponse y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q09(Context context, Event event) {
        super(context, null, 0);
        context.getClass();
        final int i = 0;
        this.d = event;
        this.e = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                q09 q09Var = this.b;
                switch (i2) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i3 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i3 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i3 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i3 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i3 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i3 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i3)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i2 = 11;
        this.f = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i3 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i3 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i3 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i3 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i3 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i3 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i3)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i3 = 12;
        this.g = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i4 = 13;
        this.h = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i5 = 1;
        this.i = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i6 = 2;
        this.j = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i7 = 3;
        this.k = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i8 = 4;
        this.l = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i9 = 5;
        this.m = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i10 = 6;
        this.n = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i10;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i11 = 7;
        this.o = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i11;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i12 = 8;
        this.p = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i12;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i13 = 9;
        this.q = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i13;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        final int i14 = 10;
        this.r = ypa.b(new Function0(this) { // from class: p09
            public final /* synthetic */ q09 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i14;
                q09 q09Var = this.b;
                switch (i22) {
                    case 0:
                        View root = q09Var.getRoot();
                        int i32 = R.id.description;
                        View B = nq8.B(R.id.description, root);
                        if (B != null) {
                            gh5 c = gh5.c(B);
                            i32 = R.id.first_team_conceded_row;
                            View B2 = nq8.B(R.id.first_team_conceded_row, root);
                            if (B2 != null) {
                                o09 a = o09.a(B2);
                                i32 = R.id.first_team_scored_row;
                                View B3 = nq8.B(R.id.first_team_scored_row, root);
                                if (B3 != null) {
                                    o09 a2 = o09.a(B3);
                                    i32 = R.id.goal_distribution_header;
                                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.goal_distribution_header, root);
                                    if (typeHeaderView != null) {
                                        i32 = R.id.second_team_conceded_row;
                                        View B4 = nq8.B(R.id.second_team_conceded_row, root);
                                        if (B4 != null) {
                                            o09 a3 = o09.a(B4);
                                            i32 = R.id.second_team_scored_row;
                                            View B5 = nq8.B(R.id.second_team_scored_row, root);
                                            if (B5 != null) {
                                                return new n09((LinearLayout) root, c, a, a2, typeHeaderView, a3, o09.a(B5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i32)));
                        return null;
                    case 1:
                        return q09.u(q09Var);
                    case 2:
                        return q09.y(q09Var);
                    case 3:
                        return q09.w(q09Var);
                    case 4:
                        return q09.x(q09Var);
                    case 5:
                        return q09.r(q09Var);
                    case 6:
                        return q09.p(q09Var);
                    case 7:
                        return q09.q(q09Var);
                    case 8:
                        return q09.z(q09Var);
                    case 9:
                        return q09.B(q09Var);
                    case 10:
                        return q09.C(q09Var);
                    case 11:
                        return q09.o(q09Var);
                    case 12:
                        return q09.s(q09Var);
                    default:
                        return q09.t(q09Var);
                }
            }
        });
        int color = context.getColor(R.color.success);
        this.s = color;
        int color2 = context.getColor(R.color.error);
        this.t = color2;
        this.u = context.getColor(R.color.neutral_default);
        this.v = ao2.s(4, context);
        this.w = "ALL";
        g5k g5kVar = new g5k(getBinding().e);
        List j = b.j("ALL", "HOME_AWAY");
        j.getClass();
        g5kVar.a = j;
        g5kVar.d = new uf8(1, this, context);
        g5kVar.m = new ur1(this, 8);
        g5kVar.b();
        getFirstTeamScoredRow().i.setText(context.getString(R.string.scored));
        ImageView imageView = getFirstTeamScoredRow().j;
        String R = pco.R(Event.getHomeTeam$default(event, null, 1, null).getId());
        apf a = ajh.a(imageView.getContext());
        ht9 ht9Var = new ht9(imageView.getContext());
        ht9Var.c = R;
        fc6.w(ht9Var, imageView, a);
        getFsCount().setTextColor(color);
        getSecondTeamConcededRow().i.setText(context.getString(R.string.conceded));
        ImageView imageView2 = getSecondTeamConcededRow().j;
        String R2 = pco.R(Event.getAwayTeam$default(event, null, 1, null).getId());
        apf a2 = ajh.a(imageView2.getContext());
        ht9 ht9Var2 = new ht9(imageView2.getContext());
        ht9Var2.c = R2;
        fc6.w(ht9Var2, imageView2, a2);
        getScCount().setTextColor(color2);
        getFirstTeamConcededRow().i.setText(context.getString(R.string.conceded));
        ImageView imageView3 = getFirstTeamConcededRow().j;
        String R3 = pco.R(Event.getHomeTeam$default(event, null, 1, null).getId());
        apf a3 = ajh.a(imageView3.getContext());
        ht9 ht9Var3 = new ht9(imageView3.getContext());
        ht9Var3.c = R3;
        fc6.w(ht9Var3, imageView3, a3);
        getFcCount().setTextColor(color2);
        getSecondTeamScoredRow().i.setText(context.getString(R.string.scored));
        ImageView imageView4 = getSecondTeamScoredRow().j;
        String R4 = pco.R(Event.getAwayTeam$default(event, null, 1, null).getId());
        apf a4 = ajh.a(imageView4.getContext());
        ht9 ht9Var4 = new ht9(imageView4.getContext());
        ht9Var4.c = R4;
        fc6.w(ht9Var4, imageView4, a4);
        getSsCount().setTextColor(color);
        setVisibility(8);
        o8.d(this, 0, 7);
    }

    public static final TextView B(q09 q09Var) {
        return q09Var.getSecondTeamScoredRow().b;
    }

    public static final ArrayList C(q09 q09Var) {
        return v(q09Var.getSecondTeamScoredRow());
    }

    private final n09 getBinding() {
        Object value = this.e.getValue();
        value.getClass();
        return (n09) value;
    }

    private final TextView getDescription() {
        return (TextView) this.f.getValue();
    }

    private final TextView getFcCount() {
        return (TextView) this.n.getValue();
    }

    private final List<TextView> getFcMin() {
        return (List) this.o.getValue();
    }

    private final o09 getFirstTeamConcededRow() {
        return (o09) this.m.getValue();
    }

    private final o09 getFirstTeamScoredRow() {
        return (o09) this.g.getValue();
    }

    private final TextView getFsCount() {
        return (TextView) this.h.getValue();
    }

    private final List<TextView> getFsMin() {
        return (List) this.i.getValue();
    }

    private final TextView getScCount() {
        return (TextView) this.k.getValue();
    }

    private final List<TextView> getScMin() {
        return (List) this.l.getValue();
    }

    private final o09 getSecondTeamConcededRow() {
        return (o09) this.j.getValue();
    }

    private final o09 getSecondTeamScoredRow() {
        return (o09) this.p.getValue();
    }

    private final TextView getSsCount() {
        return (TextView) this.q.getValue();
    }

    private final List<TextView> getSsMin() {
        return (List) this.r.getValue();
    }

    public static ArrayList n(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        if (i < 4) {
            o13.v(new IntRange(1, i, 1), arrayList);
            return arrayList;
        }
        int i2 = i / 4;
        int i3 = i % 4;
        for (int i4 = 1; i4 < 5; i4++) {
            for (int i5 = 0; i5 < i2; i5 = lnb.f(i4, arrayList, i5, 1)) {
            }
            if (i3 == 3 && (i4 == 1 || i4 == 2 || i4 == 3)) {
                arrayList.add(Integer.valueOf(i4));
            } else if (i3 == 2 && (i4 == 2 || i4 == 3)) {
                arrayList.add(Integer.valueOf(i4));
            } else if (i3 == 1 && i4 == 2) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        return arrayList;
    }

    public static final TextView o(q09 q09Var) {
        return q09Var.getBinding().b.d;
    }

    public static final TextView p(q09 q09Var) {
        return q09Var.getFirstTeamConcededRow().b;
    }

    public static final ArrayList q(q09 q09Var) {
        return v(q09Var.getFirstTeamConcededRow());
    }

    public static final o09 r(q09 q09Var) {
        return q09Var.getBinding().c;
    }

    public static final o09 s(q09 q09Var) {
        return q09Var.getBinding().d;
    }

    public static final TextView t(q09 q09Var) {
        return q09Var.getFirstTeamScoredRow().b;
    }

    public static final ArrayList u(q09 q09Var) {
        return v(q09Var.getFirstTeamScoredRow());
    }

    public static ArrayList v(o09 o09Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o09Var.c);
        arrayList.add(o09Var.d);
        arrayList.add(o09Var.e);
        arrayList.add(o09Var.f);
        arrayList.add(o09Var.g);
        arrayList.add(o09Var.h);
        return arrayList;
    }

    public static final TextView w(q09 q09Var) {
        return q09Var.getSecondTeamConcededRow().b;
    }

    public static final ArrayList x(q09 q09Var) {
        return v(q09Var.getSecondTeamConcededRow());
    }

    public static final o09 y(q09 q09Var) {
        return q09Var.getBinding().f;
    }

    public static final o09 z(q09 q09Var) {
        return q09Var.getBinding().g;
    }

    public final void A(TextView textView, int i, List list, boolean z, int i2) {
        int intValue = ((Number) ((i < 0 || i >= list.size()) ? 0 : list.get(i))).intValue();
        textView.setText(String.valueOf(i));
        int i3 = intValue == 0 ? this.u : z ? this.s : this.t;
        boolean z2 = getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        boolean z3 = i2 == 0;
        boolean z4 = i2 == 5;
        boolean z5 = (z3 && !z2) || (z4 && z2);
        boolean z6 = (z4 && !z2) || (z3 && z2);
        int i4 = this.v;
        Integer valueOf = Integer.valueOf(i4);
        Integer num = null;
        if (!z || !z5) {
            valueOf = null;
        }
        float intValue2 = valueOf != null ? valueOf.intValue() : 0;
        Integer valueOf2 = Integer.valueOf(i4);
        if (!z || !z6) {
            valueOf2 = null;
        }
        float intValue3 = valueOf2 != null ? valueOf2.intValue() : 0;
        Integer valueOf3 = Integer.valueOf(i4);
        if (z || !z5) {
            valueOf3 = null;
        }
        float intValue4 = valueOf3 != null ? valueOf3.intValue() : 0;
        Integer valueOf4 = Integer.valueOf(i4);
        if (!z && z6) {
            num = valueOf4;
        }
        float intValue5 = num != null ? num.intValue() : 0;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadii(new float[]{intValue2, intValue2, intValue3, intValue3, intValue5, intValue5, intValue4, intValue4});
        textView.setBackground(gradientDrawable);
        if (intValue != 0) {
            if (intValue == 1) {
                textView.setAlpha(0.35f);
                return;
            } else if (intValue == 2) {
                textView.setAlpha(0.55f);
                return;
            } else if (intValue != 3) {
                textView.setAlpha(1.0f);
                return;
            }
        }
        textView.setAlpha(0.8f);
    }

    @NotNull
    public final Event getEvent() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.goal_distribution_layout;
    }

    public final void j(List list, boolean z) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            A((TextView) obj, 0, km5.a, z, i);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if ((r3 != null ? r3.getPeriods() : null) == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str) {
        DistributionItem distributionOfType;
        DistributionItem distributionOfType2;
        Integer valueOf;
        ArrayList arrayList;
        Integer valueOf2;
        Integer valueOf3;
        ArrayList arrayList2;
        this.w = str;
        boolean c = Intrinsics.c(str, "HOME_AWAY");
        GoalDistributionsResponse goalDistributionsResponse = this.x;
        Integer num = null;
        if (c) {
            if (goalDistributionsResponse == null) {
                Intrinsics.i("goalDistributionHome");
                throw null;
            }
            distributionOfType = goalDistributionsResponse.getDistributionOfType("home");
        } else {
            if (goalDistributionsResponse == null) {
                Intrinsics.i("goalDistributionHome");
                throw null;
            }
            distributionOfType = goalDistributionsResponse.getDistributionOfType("overall");
        }
        boolean c2 = Intrinsics.c(str, "HOME_AWAY");
        GoalDistributionsResponse goalDistributionsResponse2 = this.y;
        if (c2) {
            if (goalDistributionsResponse2 == null) {
                Intrinsics.i("goalDistributionAway");
                throw null;
            }
            distributionOfType2 = goalDistributionsResponse2.getDistributionOfType("away");
        } else {
            if (goalDistributionsResponse2 == null) {
                Intrinsics.i("goalDistributionAway");
                throw null;
            }
            distributionOfType2 = goalDistributionsResponse2.getDistributionOfType("overall");
        }
        Event event = this.d;
        DistributionItem distributionItem = !event.shouldReverseTeams() ? distributionOfType : null;
        if (distributionItem == null) {
            distributionItem = distributionOfType2;
        }
        if (event.shouldReverseTeams()) {
            distributionOfType2 = null;
        }
        if (distributionOfType2 != null) {
            distributionOfType = distributionOfType2;
        }
        if ((distributionItem != null ? distributionItem.getPeriods() : null) != null) {
        }
        if (Intrinsics.c(str, "ALL")) {
            setVisibility(8);
            return;
        }
        if (distributionItem == null) {
            distributionItem = new DistributionItem();
        }
        if (distributionOfType == null) {
            distributionOfType = new DistributionItem();
        }
        DistributionItem distributionItem2 = distributionOfType;
        String w = tba.w(event.getTournament());
        Season season = event.getSeason();
        String i = wv8.i(w, " ", season != null ? season.getYear() : null);
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Context context = getContext();
        context.getClass();
        String p = tba.p(context, homeTeam$default);
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Context context2 = getContext();
        context2.getClass();
        getDescription().setText(getContext().getString(R.string.goal_distribution_h2h, p, distributionItem.getMatches(), tba.p(context2, awayTeam$default), distributionItem2.getMatches(), i));
        List<PeriodDistributionItem> periods = distributionItem.getPeriods();
        if (periods != null) {
            Iterator<T> it = periods.iterator();
            if (it.hasNext()) {
                Integer scoredGoals = ((PeriodDistributionItem) it.next()).getScoredGoals();
                valueOf2 = Integer.valueOf(scoredGoals != null ? scoredGoals.intValue() : 0);
                while (it.hasNext()) {
                    Integer scoredGoals2 = ((PeriodDistributionItem) it.next()).getScoredGoals();
                    Integer valueOf4 = Integer.valueOf(scoredGoals2 != null ? scoredGoals2.intValue() : 0);
                    if (valueOf2.compareTo(valueOf4) < 0) {
                        valueOf2 = valueOf4;
                    }
                }
            } else {
                valueOf2 = null;
            }
            ArrayList n = n(valueOf2 != null ? valueOf2.intValue() : 0);
            Iterator<T> it2 = periods.iterator();
            if (it2.hasNext()) {
                Integer concededGoals = ((PeriodDistributionItem) it2.next()).getConcededGoals();
                valueOf3 = Integer.valueOf(concededGoals != null ? concededGoals.intValue() : 0);
                while (it2.hasNext()) {
                    Integer concededGoals2 = ((PeriodDistributionItem) it2.next()).getConcededGoals();
                    Integer valueOf5 = Integer.valueOf(concededGoals2 != null ? concededGoals2.intValue() : 0);
                    if (valueOf3.compareTo(valueOf5) < 0) {
                        valueOf3 = valueOf5;
                    }
                }
            } else {
                valueOf3 = null;
            }
            ArrayList n2 = n(valueOf3 != null ? valueOf3.intValue() : 0);
            j(getFsMin(), true);
            j(getFcMin(), false);
            getFsCount().setText(String.valueOf(distributionItem.getScoredGoals()));
            getFcCount().setText(String.valueOf(distributionItem.getConcededGoals()));
            int size = periods.size();
            int i2 = 0;
            while (i2 < size) {
                PeriodDistributionItem periodDistributionItem = periods.get(i2);
                Integer scoredGoals3 = periodDistributionItem.getScoredGoals();
                if (scoredGoals3 != null) {
                    A(getFsMin().get(i2), scoredGoals3.intValue(), n, true, i2);
                }
                ArrayList arrayList3 = n;
                Integer concededGoals3 = periodDistributionItem.getConcededGoals();
                if (concededGoals3 != null) {
                    arrayList2 = n2;
                    A(getFcMin().get(i2), concededGoals3.intValue(), arrayList2, false, i2);
                } else {
                    arrayList2 = n2;
                }
                i2++;
                n2 = arrayList2;
                n = arrayList3;
            }
        }
        List<PeriodDistributionItem> periods2 = distributionItem2.getPeriods();
        if (periods2 != null) {
            Iterator<T> it3 = periods2.iterator();
            if (it3.hasNext()) {
                Integer scoredGoals4 = ((PeriodDistributionItem) it3.next()).getScoredGoals();
                valueOf = Integer.valueOf(scoredGoals4 != null ? scoredGoals4.intValue() : 0);
                while (it3.hasNext()) {
                    Integer scoredGoals5 = ((PeriodDistributionItem) it3.next()).getScoredGoals();
                    Integer valueOf6 = Integer.valueOf(scoredGoals5 != null ? scoredGoals5.intValue() : 0);
                    if (valueOf.compareTo(valueOf6) < 0) {
                        valueOf = valueOf6;
                    }
                }
            } else {
                valueOf = null;
            }
            ArrayList n3 = n(valueOf != null ? valueOf.intValue() : 0);
            Iterator<T> it4 = periods2.iterator();
            if (it4.hasNext()) {
                Integer concededGoals4 = ((PeriodDistributionItem) it4.next()).getConcededGoals();
                Integer valueOf7 = Integer.valueOf(concededGoals4 != null ? concededGoals4.intValue() : 0);
                loop3: while (true) {
                    num = valueOf7;
                    while (it4.hasNext()) {
                        Integer concededGoals5 = ((PeriodDistributionItem) it4.next()).getConcededGoals();
                        valueOf7 = Integer.valueOf(concededGoals5 != null ? concededGoals5.intValue() : 0);
                        if (num.compareTo(valueOf7) < 0) {
                            break;
                        }
                    }
                }
            }
            ArrayList n4 = n(num != null ? num.intValue() : 0);
            j(getSsMin(), true);
            j(getScMin(), false);
            getSsCount().setText(String.valueOf(distributionItem2.getScoredGoals()));
            getScCount().setText(String.valueOf(distributionItem2.getConcededGoals()));
            int size2 = periods2.size();
            int i3 = 0;
            while (i3 < size2) {
                PeriodDistributionItem periodDistributionItem2 = periods2.get(i3);
                Integer scoredGoals6 = periodDistributionItem2.getScoredGoals();
                if (scoredGoals6 != null) {
                    A(getSsMin().get(i3), scoredGoals6.intValue(), n3, true, i3);
                }
                ArrayList arrayList4 = n3;
                Integer concededGoals6 = periodDistributionItem2.getConcededGoals();
                if (concededGoals6 != null) {
                    arrayList = n4;
                    A(getScMin().get(i3), concededGoals6.intValue(), arrayList, false, i3);
                } else {
                    arrayList = n4;
                }
                i3++;
                n4 = arrayList;
                n3 = arrayList4;
            }
        }
    }
}
