package pg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: pg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8925a {
    @NotNull
    public static ArrayList a(@NotNull String jsonString) throws w6.c {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(jsonString);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                Intrinsics.f(string);
                arrayList.add(c.a(string));
            }
            return arrayList;
        } catch (JSONException e11) {
            throw new w6.c(Sh.b.c("Failed to deserialize '", C8926b.class.getSimpleName(), "' list from: ", jsonString), e11);
        }
    }
}
