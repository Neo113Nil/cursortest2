package O8;

import android.content.Context;
import android.content.SharedPreferences;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f8397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8399c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f8400d;

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8397a = "giphy_recents_file";
        this.f8398b = "recent_gif_ids";
        this.f8399c = 10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("giphy_recents_file", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…le, Context.MODE_PRIVATE)");
        this.f8400d = sharedPreferences;
    }

    public final void a(Media media) {
        Intrinsics.checkNotNullParameter(media, "media");
        if (media.getType() == MediaType.emoji) {
            return;
        }
        List c10 = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c10) {
            if (!Intrinsics.areEqual((String) obj, media.getId())) {
                arrayList.add(obj);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(0, media.getId());
        if (mutableList.size() > this.f8399c) {
            mutableList.remove(CollectionsKt.last(mutableList));
        }
        this.f8400d.edit().putString(this.f8398b, CollectionsKt.joinToString$default(mutableList, "|", null, null, 0, null, null, 62, null)).apply();
    }

    public final void b() {
        this.f8400d.edit().clear().apply();
    }

    public final List c() {
        String string = this.f8400d.getString(this.f8398b, null);
        if (string == null) {
            string = "";
        }
        String str = string;
        return str.length() == 0 ? CollectionsKt.emptyList() : StringsKt.split$default((CharSequence) str, new String[]{"|"}, false, 0, 6, (Object) null);
    }

    public final void d(String str) {
        List c10 = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c10) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        this.f8400d.edit().putString(this.f8398b, CollectionsKt.joinToString$default(CollectionsKt.toMutableList((Collection) arrayList), "|", null, null, 0, null, null, 62, null)).apply();
        if (c().isEmpty()) {
            b();
        }
    }
}
