package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import com.sofascore.results.R;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class m43 {
    public static final Set a = Collections.synchronizedSet(EnumSet.allOf(j43.class));

    public static j43 a(String str) {
        Object obj;
        Set set = a;
        set.getClass();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j43) obj).a.equals(str)) {
                break;
            }
        }
        return (j43) obj;
    }

    public static Drawable b(Context context, String str, String str2) {
        Function1 function1;
        context.getClass();
        str.getClass();
        Object obj = null;
        if (!j43.f.a.equals(str)) {
            j43 a2 = a(str);
            if (a2 == null || (function1 = a2.b) == null) {
                return null;
            }
            return (Drawable) function1.invoke(context);
        }
        Iterator<E> it = l43.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((l43) next).a.equals(str2)) {
                obj = next;
                break;
            }
        }
        l43 l43Var = (l43) obj;
        if (l43Var == null) {
            l43Var = l43.c;
        }
        return (Drawable) l43Var.b.invoke(context);
    }

    public static String c(Context context, Comment comment, Event event) {
        Integer num;
        context.getClass();
        comment.getClass();
        event.getClass();
        if (j43.h.a.equals(comment.getType())) {
            return context.getString(R.string.commentary_touchdown, tba.A(context, Intrinsics.c(Comment.getIsHome$default(comment, null, 1, null), Boolean.TRUE) ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null)));
        }
        if (j43.k.a.equals(comment.getType()) && comment.getPlayType() != null && comment.getYardsGained() != null) {
            return context.getString(Intrinsics.c(comment.getPlayType(), CommentKt.AMERICAN_FOOTBALL_PLAY_TYPE_RUN) ? R.string.commentary_yards_run : R.string.commentary_yards_passed, comment.getYardsGained());
        }
        if (Intrinsics.c(ok3.s(event), Sports.BASKETBALL)) {
            String goalType = comment.getGoalType();
            if (Intrinsics.c(goalType, l43.g.a)) {
                return context.getString(R.string.basketball_three_points_made);
            }
            if (Intrinsics.c(goalType, l43.f.a)) {
                return context.getString(R.string.basketball_two_points_made);
            }
            if (Intrinsics.c(goalType, l43.e.a)) {
                return context.getString(R.string.basketball_free_throw_made);
            }
        } else if (Intrinsics.c(ok3.s(event), Sports.BASEBALL) && Intrinsics.c(comment.getType(), j43.n.a)) {
            BaseballActionOutcome actionOutcome = comment.getActionOutcome();
            if (actionOutcome != null) {
                return k53.r0(actionOutcome, context);
            }
        } else {
            j43 a2 = a(comment.getType());
            if (a2 != null && (num = a2.d) != null) {
                return context.getString(num.intValue());
            }
        }
        return null;
    }
}
