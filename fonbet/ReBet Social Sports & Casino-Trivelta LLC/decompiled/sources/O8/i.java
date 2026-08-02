package O8;

import K8.c;
import com.giphy.sdk.core.models.Channel;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.core.network.response.ChannelsSearchResponse;
import com.giphy.sdk.core.network.response.TrendingSearchesResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8379d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final O8.d f8380a;

    /* renamed from: b, reason: collision with root package name */
    public final O8.c f8381b;

    /* renamed from: c, reason: collision with root package name */
    public final O8.c f8382c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Trending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.Autocomplete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.Recents.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.Channels.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c implements K8.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2 f8384b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f8385c;

        public c(Function2 function2, f fVar) {
            this.f8384b = function2;
            this.f8385c = fVar;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TrendingSearchesResponse trendingSearchesResponse, Throwable th2) {
            List<String> emptyList;
            if (trendingSearchesResponse == null || (emptyList = trendingSearchesResponse.getData()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (th2 == null) {
                i.this.f8381b.d("last", emptyList);
            }
            Function2 function2 = this.f8384b;
            List<String> list = emptyList;
            f fVar = this.f8385c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new g(fVar, (String) it.next()));
            }
            function2.invoke(arrayList, th2);
        }
    }

    public static final class d implements K8.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f8387b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2 f8388c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f8389d;

        public d(String str, Function2 function2, f fVar) {
            this.f8387b = str;
            this.f8388c = function2;
            this.f8389d = fVar;
        }

        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ChannelsSearchResponse channelsSearchResponse, Throwable th2) {
            Collection emptyList;
            List<Channel> data;
            String str;
            if (channelsSearchResponse == null || (data = channelsSearchResponse.getData()) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<Channel> list = data;
                emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Channel channel : list) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('@');
                    User user = channel.getUser();
                    if (user == null || (str = user.getUsername()) == null) {
                        str = "";
                    }
                    sb2.append(str);
                    emptyList.add(sb2.toString());
                }
            }
            if (th2 == null) {
                i.this.f8382c.d(this.f8387b, emptyList);
            }
            Function2 function2 = this.f8388c;
            Collection collection = emptyList;
            f fVar = this.f8389d;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(new g(fVar, (String) it.next()));
            }
            function2.invoke(arrayList, th2);
        }
    }

    public i(O8.d recentSearches) {
        Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
        this.f8380a = recentSearches;
        this.f8381b = new O8.c(TimeUnit.MINUTES.toMillis(15L));
        this.f8382c = new O8.c(TimeUnit.SECONDS.toMillis(30L));
    }

    @Override // O8.h
    public void a(f type, String term, boolean z10, Function2 completionHandler) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        switch (b.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
                List list = (List) this.f8381b.b("last");
                if (list == null) {
                    J8.d.f5962a.d().z(new c(completionHandler, type));
                    break;
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new g(type, (String) it.next()));
                    }
                    completionHandler.invoke(arrayList, null);
                    break;
                }
            case 3:
            case 4:
                completionHandler.invoke(CollectionsKt.emptyList(), null);
                break;
            case 5:
                List b10 = this.f8380a.b();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b10, 10));
                Iterator it2 = b10.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new g(type, (String) it2.next()));
                }
                completionHandler.invoke(arrayList2, null);
                break;
            case 6:
                List list3 = (List) this.f8382c.b(term);
                if (list3 == null) {
                    c.a.a(J8.d.f5962a.d(), term, 0, 0, new d(term, completionHandler, type), 6, null);
                    break;
                } else {
                    List list4 = list3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new g(type, (String) it3.next()));
                    }
                    completionHandler.invoke(arrayList3, null);
                    break;
                }
        }
    }
}
