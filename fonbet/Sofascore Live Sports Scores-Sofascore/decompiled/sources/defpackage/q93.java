package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.results.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q93 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q93(boolean z, ecd ecdVar, Context context, int i) {
        this.a = 2;
        this.b = z;
        this.e = ecdVar;
        this.c = context;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        final int i2 = this.d;
        final Context context = this.c;
        final int i3 = 0;
        Object obj = this.e;
        boolean z = this.b;
        switch (i) {
            case 0:
                final String str2 = (String) obj;
                if (z) {
                    yaa.q(i2, context);
                    nv.y(context, vu.REMOVE_NOTIFICATION, xu.UNIQUE_TOURNAMENT, i2, wu.OTHER);
                } else {
                    yaa.r(i2, context);
                    nv.y(context, vu.ADD_NOTIFICATION, xu.UNIQUE_TOURNAMENT, i2, wu.OTHER);
                    FragmentActivity K = hkg.K(context);
                    if (K != null) {
                        BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
                        if (baseActivity != null) {
                            p4h.t(baseActivity, false, new Function1() { // from class: s93
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    switch (i3) {
                                        case 0:
                                            bool.booleanValue();
                                            zic.R(context, str2, Sports.FOOTBALL, i2);
                                            break;
                                        default:
                                            bool.getClass();
                                            zic.Q(context, i2, str2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, null, 56);
                        }
                    }
                }
                break;
            case 1:
                final String str3 = (String) obj;
                if (z) {
                    v7a.m(i2, context);
                    nv.y(context, vu.REMOVE_NOTIFICATION, xu.TEAM, i2, wu.OTHER);
                } else {
                    v7a.h(i2, context);
                    nv.y(context, vu.ADD_NOTIFICATION, xu.TEAM, i2, wu.OTHER);
                    FragmentActivity K2 = hkg.K(context);
                    if (K2 != null) {
                        BaseActivity baseActivity2 = K2 instanceof BaseActivity ? (BaseActivity) K2 : null;
                        if (baseActivity2 != null) {
                            final int i4 = 1;
                            p4h.t(baseActivity2, false, new Function1() { // from class: s93
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    switch (i4) {
                                        case 0:
                                            bool.booleanValue();
                                            zic.R(context, str3, Sports.FOOTBALL, i2);
                                            break;
                                        default:
                                            bool.getClass();
                                            zic.Q(context, i2, str3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, null, 56);
                        }
                    }
                }
                break;
            default:
                ecd ecdVar = (ecd) obj;
                Context context2 = this.c;
                if (z) {
                    yu yuVar = yu.NEWS;
                    int i5 = ecdVar.a;
                    NewsProvider newsProvider = ecdVar.g;
                    if (newsProvider == null || (str = newsProvider.getName()) == null) {
                        str = "";
                    }
                    nv.g0(context2, yuVar, Integer.valueOf(i5), "featured_news", "featured", str);
                } else {
                    nv.Y(context2, ecdVar.a, kv.CLICK, this.d, null, "full_list_card", null, 80);
                }
                String str4 = ecdVar.e;
                if (str4 != null) {
                    p4h.w(context2, str4);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q93(boolean z, Context context, int i, String str, int i2) {
        this.a = i2;
        this.b = z;
        this.c = context;
        this.d = i;
        this.e = str;
    }
}
