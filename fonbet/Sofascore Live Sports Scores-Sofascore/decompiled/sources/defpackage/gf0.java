package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gf0 implements uv8 {
    public final /* synthetic */ int a = 1;
    public final Object b = new Object();
    public volatile tv8 c;
    public final Object d;

    public gf0(t9d t9dVar) {
        this.d = t9dVar;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public jc4 a() {
        Fragment fragment = (Fragment) this.d;
        if (fragment.getHost() == null) {
            yhk.s("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        o3a.p(fragment.getHost() instanceof vv8, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
        gc4 gc4Var = (gc4) ((ao8) fz8.Q(ao8.class, fragment.getHost()));
        return new jc4(gc4Var.a, gc4Var.b, gc4Var.c);
    }

    public kc4 b() {
        FeaturedOddsView featuredOddsView = (FeaturedOddsView) this.d;
        Context context = featuredOddsView.getContext();
        while ((context instanceof ContextWrapper) && !uv8.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application s = pd0.s(context.getApplicationContext());
        Object obj = context;
        if (context == s) {
            o3a.p(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", featuredOddsView.getClass());
            obj = null;
        }
        if (obj instanceof uv8) {
            return new kc4(((gc4) ((dsk) fz8.Q(dsk.class, (uv8) obj))).a);
        }
        throw new IllegalStateException(featuredOddsView.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    @Override // defpackage.uv8
    public final Object f() {
        switch (this.a) {
            case 0:
                if (((mc4) this.c) == null) {
                    synchronized (this.b) {
                        try {
                            if (((mc4) this.c) == null) {
                                this.c = ((t9d) this.d).e();
                            }
                        } finally {
                        }
                    }
                }
                return (mc4) this.c;
            case 1:
                if (((jc4) this.c) == null) {
                    synchronized (this.b) {
                        try {
                            if (((jc4) this.c) == null) {
                                this.c = a();
                            }
                        } finally {
                        }
                    }
                }
                return (jc4) this.c;
            default:
                if (((kc4) this.c) == null) {
                    synchronized (this.b) {
                        try {
                            if (((kc4) this.c) == null) {
                                this.c = b();
                            }
                        } finally {
                        }
                    }
                }
                return (kc4) this.c;
        }
    }

    public gf0(Fragment fragment) {
        this.d = fragment;
    }

    public gf0(FeaturedOddsView featuredOddsView) {
        this.d = featuredOddsView;
    }
}
