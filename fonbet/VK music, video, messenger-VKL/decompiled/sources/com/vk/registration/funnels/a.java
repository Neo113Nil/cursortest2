package com.vk.registration.funnels;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.single.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.gzs;
import xsna.i22;
import xsna.ljs;
import xsna.nj;
import xsna.oj;

/* compiled from: FunnelsExt.kt */
/* loaded from: classes5.dex */
public final class a {
    public static final b0 a(q qVar) {
        return qVar.F(new ljs(new nj(23), 1));
    }

    public static final l b(x xVar) {
        return xVar.h(new i22(new oj(27), 24));
    }

    public static final ArrayList<SchemeStatSak$RegistrationFieldItem> c(List<? extends Pair<? extends TrackingElement.Registration, ? extends gzs<String>>> list) {
        if (list == null) {
            return null;
        }
        ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            SchemeStatSak$RegistrationFieldItem.Name h = ((TrackingElement.Registration) pair.i()).h();
            RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
            RegistrationElementsTracker.InteractionTime interactionTime = RegistrationElementsTracker.b.get((TrackingElement) pair.i());
            if (interactionTime == null) {
                interactionTime = new RegistrationElementsTracker.InteractionTime(0);
            }
            String valueOf = String.valueOf(interactionTime.d());
            RegistrationElementsTracker.InteractionTime interactionTime2 = RegistrationElementsTracker.b.get((TrackingElement) pair.i());
            if (interactionTime2 == null) {
                interactionTime2 = new RegistrationElementsTracker.InteractionTime(0);
            }
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(h, valueOf, String.valueOf(interactionTime2.g()), (String) ((gzs) pair.j()).invoke()));
        }
        return arrayList;
    }

    public static final String d(View view) {
        String obj;
        if (view instanceof CheckBox) {
            return e(Boolean.valueOf(((CheckBox) view).isChecked()));
        }
        if (!(view instanceof TextView)) {
            Object tag = view.getTag(R.id.vk_tag_extra_analytics_info);
            return e(tag instanceof Boolean ? (Boolean) tag : null);
        }
        CharSequence text = ((TextView) view).getText();
        if (text != null && (obj = text.toString()) != null) {
            r1 = Boolean.valueOf(obj.length() > 0);
        }
        return e(r1);
    }

    public static final String e(Boolean bool) {
        return (bool == null || !bool.booleanValue()) ? "0" : "1";
    }

    public static final ArrayList<SchemeStatSak$RegistrationFieldItem> f(SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem) {
        ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList = new ArrayList<>();
        arrayList.add(schemeStatSak$RegistrationFieldItem);
        return arrayList;
    }
}
