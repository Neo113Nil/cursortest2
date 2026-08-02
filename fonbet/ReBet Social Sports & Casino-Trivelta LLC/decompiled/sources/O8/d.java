package O8;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8364c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f8365d;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8362a = "giphy_searches_file";
        this.f8363b = "recent_searches";
        this.f8364c = 10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("giphy_searches_file", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…le, Context.MODE_PRIVATE)");
        this.f8365d = sharedPreferences;
    }

    public final void a(String term) {
        Intrinsics.checkNotNullParameter(term, "term");
        if (term.length() == 0) {
            return;
        }
        List b10 = b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b10) {
            if (!Intrinsics.areEqual((String) obj, term)) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(0, term);
        if (mutableList.size() > this.f8364c) {
            mutableList.remove(CollectionsKt.last(mutableList));
        }
        this.f8365d.edit().putString(this.f8363b, CollectionsKt.joinToString$default(mutableList, "|", null, null, 0, null, null, 62, null)).apply();
    }

    public final List b() {
        List split$default;
        String string = this.f8365d.getString(this.f8363b, null);
        return (string == null || (split$default = StringsKt.split$default((CharSequence) string, new String[]{"|"}, false, 0, 6, (Object) null)) == null) ? CollectionsKt.emptyList() : split$default;
    }
}
