package cd;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import j$.time.Instant;
import org.json.JSONObject;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends b0 {
    public static final JSONObject f(n nVar, int i5, String str, String str2, int i10) {
        if (i10 > Instant.now().getEpochSecond()) {
            return new JSONObject().put("id", i5).put(PredictionTable.statusColumn, str2).put("lang", str);
        }
        return null;
    }
}
