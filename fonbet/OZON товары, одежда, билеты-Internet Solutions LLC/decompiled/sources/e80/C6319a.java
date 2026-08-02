package e80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6319a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static LinkedHashMap f62039a = new LinkedHashMap();

    public static void a(@NotNull List base64Keys) {
        Intrinsics.checkNotNullParameter(base64Keys, "base64Keys");
        Iterator it = base64Keys.iterator();
        while (it.hasNext()) {
            f62039a.remove((String) it.next());
        }
    }

    public static String b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) f62039a.get(key);
    }

    @NotNull
    public static ArrayList c(@NotNull List base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : base64) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            String str = uuid + i11;
            f62039a.put(str, (String) obj);
            arrayList.add(str);
            i11 = i12;
        }
        return arrayList;
    }
}
