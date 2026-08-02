package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x36 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventMmaStatisticsFragment b;

    public /* synthetic */ x36(EventMmaStatisticsFragment eventMmaStatisticsFragment, int i) {
        this.a = i;
        this.b = eventMmaStatisticsFragment;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventMmaStatisticsFragment eventMmaStatisticsFragment = this.b;
        switch (i) {
            case 0:
                rrc rrcVar = (rrc) obj;
                rrcVar.getClass();
                jnc jncVar = (jnc) eventMmaStatisticsFragment.u.getValue();
                jncVar.g = rrcVar;
                Iterator it = jncVar.b().iterator();
                while (it.hasNext()) {
                    ((lrc) it.next()).setTextDisplayMode(rrcVar);
                }
                return Unit.a;
            case 1:
                b46 b46Var = (b46) obj;
                eventMmaStatisticsFragment.n();
                b46Var.getClass();
                Map map = b46Var.a;
                if (!map.isEmpty()) {
                    jnc jncVar2 = (jnc) eventMmaStatisticsFragment.u.getValue();
                    boolean z = b46Var.b;
                    boolean z2 = b46Var.c;
                    jrc D = eventMmaStatisticsFragment.D();
                    jncVar2.getClass();
                    jncVar2.j = map;
                    jncVar2.e = z;
                    jncVar2.f = z2;
                    boolean z3 = jncVar2.h != D;
                    jncVar2.h = D;
                    if (jncVar2.c.getChildCount() == 0) {
                        jncVar2.c();
                    } else if (z3) {
                        jncVar2.a(zqc.TOTAL, false);
                    } else {
                        jncVar2.d();
                    }
                    eventMmaStatisticsFragment.E();
                    if (eventMmaStatisticsFragment.D() == jrc.c) {
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList(k13.r(keySet, 10));
                        Iterator it2 = keySet.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((zqc) it2.next()).name());
                        }
                        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList));
                        TypeHeaderView typeHeaderView = (TypeHeaderView) eventMmaStatisticsFragment.w.getValue();
                        if (typeHeaderView != null) {
                            TypeHeaderView.z(typeHeaderView, S0, null, 2);
                        }
                    }
                }
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                Set set = f5k.a;
                Context requireContext = eventMmaStatisticsFragment.requireContext();
                requireContext.getClass();
                int hashCode = str.hashCode();
                if (hashCode != 80012068) {
                    switch (hashCode) {
                        case 2103452064:
                            if (str.equals("ROUND_1")) {
                                Locale d = dla.d();
                                String string = requireContext.getString(R.string.mma_status_round);
                                string.getClass();
                                str = String.format(d, string, Arrays.copyOf(new Object[]{1}, 1));
                                break;
                            }
                            break;
                        case 2103452065:
                            if (str.equals("ROUND_2")) {
                                Locale d2 = dla.d();
                                String string2 = requireContext.getString(R.string.mma_status_round);
                                string2.getClass();
                                str = String.format(d2, string2, Arrays.copyOf(new Object[]{2}, 1));
                                break;
                            }
                            break;
                        case 2103452066:
                            if (str.equals("ROUND_3")) {
                                Locale d3 = dla.d();
                                String string3 = requireContext.getString(R.string.mma_status_round);
                                string3.getClass();
                                str = String.format(d3, string3, Arrays.copyOf(new Object[]{3}, 1));
                                break;
                            }
                            break;
                        case 2103452067:
                            if (str.equals("ROUND_4")) {
                                Locale d4 = dla.d();
                                String string4 = requireContext.getString(R.string.mma_status_round);
                                string4.getClass();
                                str = String.format(d4, string4, Arrays.copyOf(new Object[]{4}, 1));
                                break;
                            }
                            break;
                        case 2103452068:
                            if (str.equals("ROUND_5")) {
                                Locale d5 = dla.d();
                                String string5 = requireContext.getString(R.string.mma_status_round);
                                string5.getClass();
                                str = String.format(d5, string5, Arrays.copyOf(new Object[]{5}, 1));
                                break;
                            }
                            break;
                    }
                } else if (str.equals("TOTAL")) {
                    str = requireContext.getString(R.string.total);
                }
                str.getClass();
                return str;
        }
    }
}
