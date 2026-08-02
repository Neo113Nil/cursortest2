package bo.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class tg extends rg {

    /* renamed from: f, reason: collision with root package name */
    public HashMap f26091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        this.f26091f = new LinkedHashMap();
    }
}
