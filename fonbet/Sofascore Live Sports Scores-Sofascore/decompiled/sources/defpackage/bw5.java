package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bw5 implements ew5 {
    public static final bw5 a = new bw5();

    @Override // defpackage.ew5
    public final boolean a(Comment comment) {
        comment.getClass();
        return true;
    }

    @Override // defpackage.ew5
    public final String b(Context context, String str) {
        context.getClass();
        str.getClass();
        String string = context.getString(Intrinsics.c(str, Sports.BASEBALL) ? R.string.baseball_all_plays : R.string.all);
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bw5);
    }

    @Override // defpackage.ew5
    public final String getKey() {
        return "all_events";
    }

    public final int hashCode() {
        return -209797368;
    }

    public final String toString() {
        return "AllEvents";
    }
}
