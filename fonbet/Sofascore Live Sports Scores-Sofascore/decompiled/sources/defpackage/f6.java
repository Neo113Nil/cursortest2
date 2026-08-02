package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import com.sofascore.results.tutorial.AbstractTutorialActivity;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.ui.view.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f6 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean _init_$lambda$1;
        Boolean bool;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k6.p((k6) obj, motionEvent);
                return true;
            case 1:
                _init_$lambda$1 = AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) obj, view, motionEvent);
                return _init_$lambda$1;
            case 2:
                ((CommentsChatFragment) obj).R();
                return true;
            case 3:
                ed5 ed5Var = (ed5) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - ed5Var.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        ed5Var.m = false;
                    }
                    ed5Var.t();
                    ed5Var.m = true;
                    ed5Var.o = SystemClock.uptimeMillis();
                }
                return false;
            case 4:
                FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = (FantasyGameweekHighlightsActivity) obj;
                otk otkVar = fantasyGameweekHighlightsActivity.K;
                int i2 = FantasyGameweekHighlightsActivity.Z;
                int action = motionEvent.getAction();
                if (action == 0) {
                    View V = fantasyGameweekHighlightsActivity.V(fantasyGameweekHighlightsActivity.R().f.getCurrentItem());
                    if (V != null) {
                        fantasyGameweekHighlightsActivity.pauseProgress(V);
                    }
                    fantasyGameweekHighlightsActivity.N = yaa.v();
                } else {
                    if (action != 1) {
                        return false;
                    }
                    if (yaa.v() - fantasyGameweekHighlightsActivity.N > 500) {
                        View V2 = fantasyGameweekHighlightsActivity.V(fantasyGameweekHighlightsActivity.R().f.getCurrentItem());
                        if (V2 != null) {
                            fantasyGameweekHighlightsActivity.resumeProgress(V2);
                        }
                    } else {
                        int i3 = -1;
                        if (motionEvent.getX() < fantasyGameweekHighlightsActivity.R().f.getWidth() / 2) {
                            List q = i5h.q(new tsk(fantasyGameweekHighlightsActivity.R().e));
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : q) {
                                if (obj2 instanceof LinearProgressIndicator) {
                                    arrayList.add(obj2);
                                }
                            }
                            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((LinearProgressIndicator) listIterator.previous()).getProgress() == 100) {
                                        i3 = listIterator.nextIndex();
                                    }
                                }
                            }
                            Integer valueOf = Integer.valueOf(i3);
                            if (i3 < 0) {
                                valueOf = null;
                            }
                            int intValue = valueOf != null ? valueOf.intValue() : 0;
                            List q2 = i5h.q(new tsk(fantasyGameweekHighlightsActivity.R().e));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : q2) {
                                if (obj3 instanceof LinearProgressIndicator) {
                                    arrayList2.add(obj3);
                                }
                            }
                            Iterator it = arrayList2.iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    b.q();
                                    throw null;
                                }
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) next;
                                if (i4 >= intValue) {
                                    linearProgressIndicator.setProgress(0);
                                }
                                i4 = i5;
                            }
                            AbstractTutorialActivity.Z(fantasyGameweekHighlightsActivity, intValue, i8.c);
                            ((u2k) otkVar.getValue()).k(7000L, null, fantasyGameweekHighlightsActivity);
                        } else {
                            List q3 = i5h.q(new tsk(fantasyGameweekHighlightsActivity.R().e));
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : q3) {
                                if (obj4 instanceof LinearProgressIndicator) {
                                    arrayList3.add(obj4);
                                }
                            }
                            ListIterator listIterator2 = arrayList3.listIterator(arrayList3.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    if (((LinearProgressIndicator) listIterator2.previous()).getProgress() == 100) {
                                        i3 = listIterator2.nextIndex();
                                    }
                                }
                            }
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (i3 < 0) {
                                valueOf2 = null;
                            }
                            int intValue2 = valueOf2 != null ? valueOf2.intValue() + 1 : 0;
                            if (intValue2 == ((List) fantasyGameweekHighlightsActivity.M.getValue()).size() - 1) {
                                fantasyGameweekHighlightsActivity.finish();
                            } else {
                                List q4 = i5h.q(new tsk(fantasyGameweekHighlightsActivity.R().e));
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj5 : q4) {
                                    if (obj5 instanceof LinearProgressIndicator) {
                                        arrayList4.add(obj5);
                                    }
                                }
                                Iterator it2 = arrayList4.iterator();
                                int i6 = 0;
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) next2;
                                    if (i6 == intValue2) {
                                        linearProgressIndicator2.setProgress(100);
                                    } else if (i6 > intValue2) {
                                        linearProgressIndicator2.setProgress(0);
                                    }
                                    i6 = i7;
                                }
                                AbstractTutorialActivity.Z(fantasyGameweekHighlightsActivity, intValue2 + 1, i8.b);
                                ((u2k) otkVar.getValue()).k(7000L, null, fantasyGameweekHighlightsActivity);
                            }
                        }
                    }
                }
                return true;
            case 5:
                TutorialWizardView tutorialWizardView = (TutorialWizardView) obj;
                a3k a3kVar = tutorialWizardView.highlightDrawData;
                Point2D point2D = tutorialWizardView.b;
                if (a3kVar != null) {
                    ma9 ma9Var = a3kVar.a;
                    float f = ma9Var.d;
                    float f2 = ma9Var.b;
                    float f3 = ma9Var.c;
                    float f4 = ma9Var.a;
                    if (motionEvent.getAction() == 0) {
                        point2D.setX(motionEvent.getX());
                        point2D.setY(motionEvent.getY());
                        bool = Boolean.valueOf(!tutorialWizardView.shouldOverrideClickBehaviour || motionEvent.getX() <= f4 || motionEvent.getX() >= f3 || motionEvent.getY() <= f2 || motionEvent.getY() >= f);
                    } else if (motionEvent.getAction() == 1) {
                        Set<Point2D> a0 = ph0.a0(new Point2D[]{point2D, new Point2D(motionEvent.getX(), motionEvent.getY())});
                        if (!(a0 instanceof Collection) || !a0.isEmpty()) {
                            for (Point2D point2D2 : a0) {
                                if (point2D2.getX() <= f4 || point2D2.getX() >= f3 || point2D2.getY() <= f2 || point2D2.getY() >= f) {
                                    bool = Boolean.TRUE;
                                    point2D.setX(-1.0f);
                                    point2D.setY(-1.0f);
                                }
                            }
                        }
                        if (tutorialWizardView.shouldOverrideClickBehaviour) {
                            bool = Boolean.FALSE;
                        } else {
                            View view2 = tutorialWizardView.l;
                            Boolean valueOf3 = view2 != null ? Boolean.valueOf(view2.performClick()) : null;
                            Function0 function0 = tutorialWizardView.clickCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            bool = valueOf3;
                        }
                        point2D.setX(-1.0f);
                        point2D.setY(-1.0f);
                    } else {
                        bool = Boolean.TRUE;
                    }
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                }
                return b0a.k != null;
            case 6:
                zgm zgmVar = (zgm) obj;
                int i8 = zgm.m;
                return motionEvent.getAction() == 1 && zgmVar.i;
            case 7:
                return k.a((k) obj, view, motionEvent);
            default:
                return r1.a((r1) obj, view, motionEvent);
        }
    }
}
