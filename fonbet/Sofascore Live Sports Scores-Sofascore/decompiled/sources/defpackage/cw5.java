package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.BaseballAtBatData;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cw5 implements ew5 {
    public final k43 a;

    public cw5(k43 k43Var) {
        this.a = k43Var;
    }

    @Override // defpackage.ew5
    public final boolean a(Comment comment) {
        Integer atBatId;
        BaseballAtBatData baseballAtBatData;
        Boolean bool;
        comment.getClass();
        if (Intrinsics.c(comment.getType(), j43.l.a) || (atBatId = comment.getAtBatId()) == null || (baseballAtBatData = (BaseballAtBatData) this.a.invoke(atBatId)) == null) {
            return false;
        }
        Float probabilityChange = baseballAtBatData.getProbabilityChange(true);
        if (probabilityChange != null) {
            bool = Boolean.valueOf(Math.abs(probabilityChange.floatValue()) >= 10.0f);
        } else {
            bool = null;
        }
        return Intrinsics.c(bool, Boolean.TRUE);
    }

    @Override // defpackage.ew5
    public final String b(Context context, String str) {
        context.getClass();
        str.getClass();
        String string = context.getString(R.string.baseball_key_plays);
        string.getClass();
        return string;
    }

    @Override // defpackage.ew5
    public final String getKey() {
        return "baseball_key_plays";
    }
}
