package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import com.inmobi.media.Ha;
import com.inmobi.media.InterfaceC3317bf;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.event.media.FullScreenVideoActivity;
import com.sofascore.results.event.statistics.view.football.FootballGoalmapView;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.feedback.FeedbackActivity;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yx7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yx7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object obj2;
        Object builderGetter$lambda$0;
        Object builderGetter$lambda$1;
        Object instanceGetter$lambda$1;
        Object instanceGetter$lambda$2;
        Point2D goalPoint;
        Team awayTeam$default;
        int i;
        String format;
        String str;
        List j;
        int i2 = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i3 = 1;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                String str2 = (String) obj;
                str2.getClass();
                ((ct8) obj3).invoke(new uv7(str2), null, null);
                return Unit.a;
            case 1:
                my7 my7Var = (my7) obj3;
                ((Unit) obj).getClass();
                fdi fdiVar = my7Var.m;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, dy7.a((dy7) value, jca.U(my7Var.f), false, null, null, false, null, 1015)));
                my7Var.h();
                return Unit.a;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                fdi fdiVar2 = ((rr7) obj3).q;
                yq7.b.getClass();
                Iterator<E> it = yq7.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.c(((yq7) obj2).name(), str3)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                yq7 yq7Var = (yq7) obj2;
                if (yq7Var == null) {
                    yq7Var = yq7.c;
                }
                fdiVar2.getClass();
                fdiVar2.m(null, yq7Var);
                return Unit.a;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                int i4 = FeedbackActivity.M;
                fd M = ((FeedbackActivity) obj3).M();
                M.g.setImageBitmap(bitmap);
                M.h.setVisibility(bitmap == null ? 0 : 8);
                M.i.setVisibility(bitmap != null ? 0 : 8);
                M.j.setVisibility(bitmap == null ? 0 : 8);
                return Unit.a;
            case 4:
                builderGetter$lambda$0 = FieldBinding.getBuilderGetter$lambda$0((WireField) obj3, (Message.Builder) obj);
                return builderGetter$lambda$0;
            case 5:
                builderGetter$lambda$1 = FieldBinding.getBuilderGetter$lambda$1((Field) obj3, (Message.Builder) obj);
                return builderGetter$lambda$1;
            case 6:
                instanceGetter$lambda$1 = FieldBinding.getInstanceGetter$lambda$1((Method) obj3, (Message) obj);
                return instanceGetter$lambda$1;
            case 7:
                instanceGetter$lambda$2 = FieldBinding.getInstanceGetter$lambda$2((FieldBinding) obj3, (Message) obj);
                return instanceGetter$lambda$2;
            case 8:
                ((uu3) obj).getClass();
                return new s7h(((t7h) obj3).a.a(null), null, null);
            case 9:
                i1d i1dVar = (i1d) obj3;
                Object[] objArr = i1dVar.a;
                int i5 = i1dVar.c;
                while (r4 < i5) {
                    ((l1c) objArr[r4]).b();
                    r4++;
                }
                return Unit.a;
            case 10:
                Integer num = (Integer) obj;
                num.getClass();
                yzc yzcVar = ((FollowSubStagesViewModel) ((FollowSubStagesDialog) obj3).v.getValue()).k;
                tee teeVar = (tee) yzcVar.d();
                LinkedHashMap linkedHashMap = teeVar != null ? new LinkedHashMap(teeVar) : new LinkedHashMap();
                linkedHashMap.put(num, Boolean.valueOf(!(((Boolean) linkedHashMap.get(num)) != null ? r2.booleanValue() : false)));
                yzcVar.j(l6g.X(linkedHashMap));
                return Unit.a;
            case 11:
                f6k f6kVar = (f6k) obj;
                return ((vf8) obj3).b(new f6k(null, f6kVar.b, f6kVar.c, f6kVar.d, f6kVar.e)).getValue();
            case 12:
                int intValue = ((Integer) obj).intValue();
                int i6 = FootballShotmapView.O;
                ((dl8) obj3).d = intValue;
                return Unit.a;
            case 13:
                float floatValue = ((Float) obj).floatValue();
                int i7 = FootballShotmapView.O;
                ((yx7) obj3).invoke(Integer.valueOf(wzb.b(floatValue)));
                return Unit.a;
            case 14:
                ml8 ml8Var = (ml8) obj3;
                ik8 ik8Var = ml8Var.f;
                FootballShotmapItem footballShotmapItem = (FootballShotmapItem) obj;
                footballShotmapItem.getClass();
                x31 x31Var = (footballShotmapItem.isBlocked() || (goalPoint = footballShotmapItem.getGoalPoint()) == null) ? null : new x31(footballShotmapItem.getId(), footballShotmapItem.getShotType(), footballShotmapItem.isOwnGoal(), goalPoint);
                FootballGoalmapView footballGoalmapView = (FootballGoalmapView) ik8Var.d.c;
                vk8 vk8Var = ml8Var.l;
                vk8Var.getClass();
                footballGoalmapView.f(x31Var != null ? a.c(x31Var) : null, vk8Var);
                ml8Var.g = footballShotmapItem;
                boolean isHome = ml8Var.getSelectedShot().isHome() ^ ml8Var.getSelectedShot().isOwnGoal();
                Event event = ml8Var.d;
                if (isHome) {
                    awayTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                    i = 1;
                } else {
                    awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                    i = 2;
                }
                xk8 xk8Var = ik8Var.c;
                y2a y2aVar = (y2a) xk8Var.q;
                y2a y2aVar2 = (y2a) xk8Var.p;
                y2a y2aVar3 = (y2a) xk8Var.n;
                y2a y2aVar4 = (y2a) xk8Var.m;
                TextView textView = xk8Var.b;
                if (!Intrinsics.c(ml8Var.getSelectedShot().getSituation(), FootballShotmapItem.SITUATION_TYPE_SHOOTOUT) || ml8Var.getSelectedShot().getShootoutOrder() == null) {
                    Context context = ml8Var.getContext();
                    context.getClass();
                    int time = ml8Var.getSelectedShot().getTime();
                    Integer addedTime = ml8Var.getSelectedShot().getAddedTime();
                    if (addedTime != null) {
                        int intValue2 = addedTime.intValue();
                        Locale d = dla.d();
                        String string = context.getString(R.string.minutes_added_time_template);
                        string.getClass();
                        format = String.format(d, string, Arrays.copyOf(new Object[]{Integer.valueOf(time), Integer.valueOf(intValue2)}, 2));
                    } else {
                        Locale d2 = dla.d();
                        String string2 = context.getString(R.string.minutes_template);
                        string2.getClass();
                        format = String.format(d2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(time)}, 1));
                    }
                    str = format;
                } else {
                    str = ml8Var.getContext().getString(R.string.football_penalty_shootout_order, ml8Var.getSelectedShot().getShootoutOrder());
                }
                textView.setText(str);
                xk8Var.f.setText(tba.C(ml8Var.getSelectedShot().getPlayer()));
                as9.l((ImageView) xk8Var.e, ml8Var.getSelectedShot().getPlayer().getId(), null);
                ((View) xk8Var.l).setOnClickListener(new u5(ml8Var, i, awayTeam$default, 4));
                if (ml8Var.h) {
                    y2aVar4.c.setText(ml8Var.getContext().getString(R.string.xG));
                    TextView textView2 = y2aVar4.b;
                    Double xg = ml8Var.getSelectedShot().getXg();
                    textView2.setText(xg != null ? rei.b(2, Double.valueOf(xg.doubleValue())) : "-");
                    y2aVar3.c.setText(ml8Var.getContext().getString(R.string.xGOT));
                    TextView textView3 = y2aVar3.b;
                    Double xgot = ml8Var.getSelectedShot().getXgot();
                    textView3.setText(xgot != null ? rei.b(2, Double.valueOf(xgot.doubleValue())) : "-");
                    j = b.j((y2a) xk8Var.o, y2aVar2, y2aVar, (y2a) xk8Var.r);
                } else {
                    j = b.j(y2aVar4, y2aVar3, y2aVar2, y2aVar);
                }
                ((y2a) j.get(0)).c.setText(ml8Var.getContext().getString(R.string.shot_outcome));
                TextView textView4 = ((y2a) j.get(0)).b;
                Context context2 = ml8Var.getContext();
                context2.getClass();
                textView4.setText(tgj.L(context2, ml8Var.getSelectedShot().getShotType(), ml8Var.getSelectedShot().getGoalType()));
                if (Intrinsics.c(ml8Var.getContext().getString(R.string.football_goal), ((y2a) j.get(0)).b.getText())) {
                    haa.H(((y2a) j.get(0)).b);
                } else {
                    haa.C(((y2a) j.get(0)).b);
                }
                ((y2a) j.get(1)).c.setText(ml8Var.getContext().getString(R.string.football_shotmap_situation));
                TextView textView5 = ((y2a) j.get(1)).b;
                Context context3 = ml8Var.getContext();
                context3.getClass();
                textView5.setText(tgj.M(context3, ml8Var.getSelectedShot().getSituation()));
                ((y2a) j.get(2)).c.setText(ml8Var.getContext().getString(R.string.football_shot_type));
                TextView textView6 = ((y2a) j.get(2)).b;
                Context context4 = ml8Var.getContext();
                context4.getClass();
                textView6.setText(tgj.J(context4, ml8Var.getSelectedShot().getBodyPart()));
                ((y2a) j.get(3)).c.setText(ml8Var.getContext().getString(R.string.goal_zone));
                TextView textView7 = ((y2a) j.get(3)).b;
                Context context5 = ml8Var.getContext();
                context5.getClass();
                textView7.setText(tgj.K(context5, ml8Var.getSelectedShot().getGoalMouthLocation(), ml8Var.getSelectedShot().isBlocked()));
                return Unit.a;
            case 15:
                d6d d6dVar = (d6d) obj;
                d6dVar.getClass();
                return new ob3(i3, (ip8) obj3, d6dVar);
            case 16:
                ale aleVar = (ale) obj;
                int i8 = FullScreenVideoActivity.O;
                mqi mqiVar = ((FullScreenVideoActivity) obj3).M;
                if (((Number) mqiVar.getValue()).longValue() != 0 && aleVar != null && aleVar.getCurrentPosition() == 0) {
                    aleVar.seekTo(((Number) mqiVar.getValue()).longValue());
                }
                return Unit.a;
            case 17:
                return Ha.a((Ha) obj3, (InterfaceC3317bf) obj);
            case 18:
                rxa rxaVar = (rxa) obj;
                rxaVar.getClass();
                s26 s26Var = ((nb9) obj3).l;
                if (s26Var != null) {
                    s26Var.invoke(rxaVar);
                }
                return Unit.a;
            case 19:
                dc9 dc9Var = (dc9) obj3;
                rlj rljVar = (rlj) obj;
                rljVar.getClass();
                ((eoh) dc9Var.g).setValue(rljVar);
                dc9Var.h = rljVar;
                dc9Var.d(rljVar);
                return Unit.a;
            case 20:
                String str4 = (String) obj;
                str4.getClass();
                Context context6 = ((fe9) obj3).j;
                he9.f.getClass();
                String string3 = context6.getString(p4h.s(str4).d);
                string3.getClass();
                return string3;
            case 21:
                Integer num2 = (Integer) obj;
                num2.getClass();
                Function1 function1 = ((me9) obj3).g;
                if (function1 != null) {
                    function1.invoke(num2);
                }
                return Unit.a;
            case 22:
                ii9 ii9Var = (ii9) obj3;
                vh9 vh9Var = (vh9) obj;
                vh9Var.getClass();
                xh3 xh3Var = (xh3) vh9Var.i.a(ji9.a, new fc9(7));
                Object obj4 = vh9Var.k.b.get(ii9Var.getKey());
                obj4.getClass();
                Object l = ii9Var.l((Function1) obj4);
                ii9Var.k(l, vh9Var);
                xh3Var.e(ii9Var.getKey(), l);
                return Unit.a;
            case 23:
                ((cy) obj3).close();
                return Unit.a;
            case 24:
                smi smiVar = (smi) obj3;
                Throwable th = (Throwable) obj;
                bjb bjbVar = bk9.a;
                if (th != null) {
                    bjbVar.l("Cancelling request because engine Job failed with error: " + th);
                    bea.o(smiVar, "Engine failed", th);
                } else {
                    bjbVar.l("Cancelling request because engine Job completed");
                    smiVar.j0();
                }
                return Unit.a;
            case 25:
                ((q55) obj3).d();
                return Unit.a;
            case 26:
                Throwable th2 = (Throwable) obj;
                smi smiVar2 = ((yj9) obj3).e;
                if (th2 == null) {
                    smiVar2.j0();
                } else {
                    smiVar2.V(new eb3(th2, false));
                }
                return Unit.a;
            case 27:
                ImaPresenterActivity imaPresenterActivity = (ImaPresenterActivity) obj3;
                ((Boolean) obj).getClass();
                int i9 = ImaPresenterActivity.o;
                r4 = cnb.f(imaPresenterActivity) == 0 ? 1 : 0;
                ale player = ((wql) imaPresenterActivity.p()).b.getPlayer();
                if (player != null) {
                    if (r4 == 0) {
                        f = 1.0f;
                    }
                    player.setVolume(f);
                }
                return Unit.a;
            case 28:
                return (nr9) obj3;
            default:
                m1a m1aVar = (m1a) obj3;
                te2 te2Var = (te2) obj;
                float j2 = te2Var.j() * ((p75) m1aVar.z.d()).a;
                b20 a = e20.a();
                uah uahVar = m1aVar.y;
                if (uahVar == null) {
                    uahVar = ech.a((cch) tgj.x(m1aVar, ech.a), k28.d);
                }
                pea a2 = uahVar.a(te2Var.a.n(), te2Var.a.getLayoutDirection(), te2Var);
                if (a2 instanceof dxd) {
                    b20.b(a, ((dxd) a2).g);
                } else if (a2 instanceof exd) {
                    b20.c(a, ((exd) a2).g);
                } else {
                    if (!(a2 instanceof cxd)) {
                        zzl.b();
                        return null;
                    }
                    b20.a(a, ((cxd) a2).g);
                }
                b20 a3 = e20.a();
                float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)) - j2;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (te2Var.a.n() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L));
                tae[] taeVarArr = tae.a;
                if (Float.isNaN(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || Float.isNaN(intBitsToFloat) || Float.isNaN(intBitsToFloat2) || Float.isNaN(intBitsToFloat3)) {
                    e20.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = a3.b;
                if (rectF == null) {
                    rectF = new RectF();
                    a3.b = rectF;
                }
                rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, intBitsToFloat3);
                Path path = a3.a;
                RectF rectF2 = a3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                b20 a4 = e20.a();
                a4.h(a3, a, 1);
                return te2Var.b(new uf8(11, a4, m1aVar));
        }
    }
}
