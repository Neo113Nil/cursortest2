package pg;

import java.net.URI;
import java.net.URISyntaxException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class c {
    @NotNull
    public static C8926b a(@NotNull String jsonString) throws w6.c {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String rawValue = jSONObject.getString("appStoreId");
            Intrinsics.f(rawValue);
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            String string = jSONObject.getString("appStoreName");
            URI uri = new URI(jSONObject.getString("link"));
            Intrinsics.f(string);
            return new C8926b(rawValue, string, uri);
        } catch (Exception e11) {
            if ((e11 instanceof JSONException) || (e11 instanceof URISyntaxException)) {
                throw new w6.c(Sh.b.c("Failed to deserialize '", C8926b.class.getSimpleName(), "' from: ", jsonString), e11);
            }
            throw e11;
        }
    }
}
