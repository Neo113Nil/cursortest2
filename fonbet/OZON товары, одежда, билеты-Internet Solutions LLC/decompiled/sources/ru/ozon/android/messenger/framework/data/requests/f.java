package ru.ozon.android.messenger.framework.data.requests;

import com.google.android.gms.actions.SearchIntents;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f88663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull String searchQuery, String str, String str2) {
        super(d.SEARCH_CHATS, null, 6);
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f88663c = U.l(new Pair(SearchIntents.EXTRA_QUERY, searchQuery), new Pair("chatGroupKey", str), new Pair("limit", 10), new Pair("cursor", str2));
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88663c;
    }
}
