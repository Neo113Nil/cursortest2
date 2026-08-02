package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.Streak;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hgi extends o8 {
    public final Event d;
    public final Drawable e;
    public final Drawable f;
    public final ez0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(Context context, Event event) {
        super(context, null, 0);
        context.getClass();
        this.d = event;
        Drawable drawable = context.getDrawable(R.drawable.ic_tv_channel_checkmark_16);
        if (drawable != null) {
            drawable.mutate().setTintList(ColorStateList.valueOf(context.getColor(R.color.success)));
        } else {
            drawable = null;
        }
        this.e = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.ic_tv_channel_x_16);
        if (drawable2 != null) {
            drawable2.mutate().setTintList(ColorStateList.valueOf(context.getColor(R.color.error)));
        } else {
            drawable2 = null;
        }
        this.f = drawable2;
        View root = getRoot();
        int i = R.id.featured_odds;
        FeaturedOddsView featuredOddsView = (FeaturedOddsView) nq8.B(R.id.featured_odds, root);
        if (featuredOddsView != null) {
            i = R.id.h2h_rows_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.h2h_rows_container, root);
            if (linearLayout != null) {
                i = R.id.h2h_title;
                TextView textView = (TextView) nq8.B(R.id.h2h_title, root);
                if (textView != null) {
                    this.g = new ez0((LinearLayout) root, featuredOddsView, linearLayout, textView, 13);
                    setVisibility(8);
                    o8.d(this, 0, 7);
                    featuredOddsView.setLocation(vmd.EVENT_MATCHES);
                    featuredOddsView.setBackgroundColor(qxh.n);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @NotNull
    public final Event getEvent() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.h2h_streaks_header;
    }

    public final void j(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Streak streak = (Streak) it.next();
                LinearLayout linearLayout = (LinearLayout) this.g.d;
                final Context context = getContext();
                context.getClass();
                streak.getClass();
                Event event = this.d;
                event.getClass();
                final int i = 0;
                x2j x2jVar = new x2j(context, null, 0);
                View root = x2jVar.getRoot();
                int i2 = R.id.h2h_image_first_team;
                ImageView imageView = (ImageView) nq8.B(R.id.h2h_image_first_team, root);
                if (imageView != null) {
                    i2 = R.id.h2h_image_second_team;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.h2h_image_second_team, root);
                    if (imageView2 != null) {
                        i2 = R.id.h2h_row_check_mark;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.h2h_row_check_mark, root);
                        if (imageView3 != null) {
                            i2 = R.id.h2h_row_name;
                            TextView textView = (TextView) nq8.B(R.id.h2h_row_name, root);
                            if (textView != null) {
                                i2 = R.id.h2h_row_value;
                                TextView textView2 = (TextView) nq8.B(R.id.h2h_row_value, root);
                                if (textView2 != null) {
                                    x2jVar.d = new v2j((ConstraintLayout) root, imageView, imageView2, imageView3, textView, textView2);
                                    String team = streak.getTeam();
                                    ggi[] ggiVarArr = ggi.a;
                                    if (Intrinsics.c(team, "home")) {
                                        TeamSides teamSides = TeamSides.ORIGINAL;
                                        final String p = tba.p(context, event.getHomeTeam(teamSides));
                                        as9.o(x2jVar.d.b, event.getHomeTeam(teamSides).getId());
                                        x2jVar.d.b.setOnClickListener(new View.OnClickListener() { // from class: w2j
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i3 = i;
                                                String str = p;
                                                Context context2 = context;
                                                switch (i3) {
                                                    case 0:
                                                        Calendar calendar = ke0.a;
                                                        ke0.g(context2, str, 0);
                                                        break;
                                                    case 1:
                                                        Calendar calendar2 = ke0.a;
                                                        ke0.g(context2, str, 0);
                                                        break;
                                                    case 2:
                                                        Calendar calendar3 = ke0.a;
                                                        ke0.g(context2, str, 0);
                                                        break;
                                                    default:
                                                        Calendar calendar4 = ke0.a;
                                                        ke0.g(context2, str, 0);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i3 = 1;
                                        if (Intrinsics.c(team, "away")) {
                                            TeamSides teamSides2 = TeamSides.ORIGINAL;
                                            final String p2 = tba.p(context, event.getAwayTeam(teamSides2));
                                            as9.o(x2jVar.d.b, event.getAwayTeam(teamSides2).getId());
                                            x2jVar.d.b.setOnClickListener(new View.OnClickListener() { // from class: w2j
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i3;
                                                    String str = p2;
                                                    Context context2 = context;
                                                    switch (i32) {
                                                        case 0:
                                                            Calendar calendar = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 1:
                                                            Calendar calendar2 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 2:
                                                            Calendar calendar3 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        default:
                                                            Calendar calendar4 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                    }
                                                }
                                            });
                                        } else if (Intrinsics.c(team, "both")) {
                                            final String p3 = tba.p(context, Event.getHomeTeam$default(event, null, 1, null));
                                            final String p4 = tba.p(context, Event.getAwayTeam$default(event, null, 1, null));
                                            as9.o(x2jVar.d.b, Event.getHomeTeam$default(event, null, 1, null).getId());
                                            final int i4 = 2;
                                            x2jVar.d.b.setOnClickListener(new View.OnClickListener() { // from class: w2j
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i4;
                                                    String str = p3;
                                                    Context context2 = context;
                                                    switch (i32) {
                                                        case 0:
                                                            Calendar calendar = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 1:
                                                            Calendar calendar2 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 2:
                                                            Calendar calendar3 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        default:
                                                            Calendar calendar4 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                    }
                                                }
                                            });
                                            x2jVar.d.c.setVisibility(0);
                                            as9.o(x2jVar.d.c, Event.getAwayTeam$default(event, null, 1, null).getId());
                                            final int i5 = 3;
                                            x2jVar.d.c.setOnClickListener(new View.OnClickListener() { // from class: w2j
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i32 = i5;
                                                    String str = p4;
                                                    Context context2 = context;
                                                    switch (i32) {
                                                        case 0:
                                                            Calendar calendar = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 1:
                                                            Calendar calendar2 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        case 2:
                                                            Calendar calendar3 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                        default:
                                                            Calendar calendar4 = ke0.a;
                                                            ke0.g(context2, str, 0);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    x2jVar.d.e.setText(v8a.z(context, streak.getName()));
                                    x2jVar.d.f.setText(streak.getValue());
                                    if (Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_FINISHED) && streak.getContinued() != null) {
                                        x2jVar.d.d.setVisibility(0);
                                        Boolean continued = streak.getContinued();
                                        if (continued != null) {
                                            x2jVar.d.d.setImageDrawable(continued.booleanValue() ? this.e : this.f);
                                        }
                                    }
                                    linearLayout.addView(x2jVar);
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
                return;
            }
        }
    }

    public final void l(String str, List list, List list2, boolean z) {
        str.getClass();
        ez0 ez0Var = this.g;
        TextView textView = (TextView) ez0Var.e;
        LinearLayout linearLayout = (LinearLayout) ez0Var.d;
        textView.setText(getContext().getString(z ? R.string.statistics_streaks_title : R.string.head_to_head_streaks));
        linearLayout.removeAllViews();
        setVisibility(((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) ? 8 : 0);
        j(list);
        if (list2 != null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.streaks_subheader, (ViewGroup) linearLayout, false);
            if (inflate == null) {
                yhk.s("rootView");
                return;
            }
            TextView textView2 = (TextView) inflate;
            mqi mqiVar = qhi.a;
            Context context = textView2.getContext();
            context.getClass();
            textView2.setText(qhi.b(context, 10, str));
            linearLayout.addView(textView2);
            j(list2);
        }
    }

    public final void setOdds(@NotNull xmd xmdVar) {
        xmdVar.getClass();
        ((FeaturedOddsView) this.g.c).n(xmdVar);
    }
}
