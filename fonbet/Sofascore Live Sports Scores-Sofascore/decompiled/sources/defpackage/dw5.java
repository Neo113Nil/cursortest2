package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dw5 implements ew5 {
    public static final dw5 a = new dw5();

    @Override // defpackage.ew5
    public final boolean a(Comment comment) {
        comment.getClass();
        if (Intrinsics.c(comment.isScoringPlay(), Boolean.TRUE)) {
            return true;
        }
        Set set = m43.a;
        String type = comment.getType();
        type.getClass();
        Set set2 = m43.a;
        set2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((j43) obj).c) {
                arrayList.add(obj);
            }
        }
        return arrayList.contains(m43.a(type));
    }

    @Override // defpackage.ew5
    public final String b(Context context, String str) {
        context.getClass();
        str.getClass();
        String string = context.getString(Intrinsics.c(str, Sports.BASEBALL) ? R.string.baseball_scoring_plays : R.string.commentary_key_events);
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dw5);
    }

    @Override // defpackage.ew5
    public final String getKey() {
        return "key_events";
    }

    public final int hashCode() {
        return -187079110;
    }

    public final String toString() {
        return "HighlightedEvents";
    }
}
