package bet.prediction.response;

import d9.e;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.c;
import u3.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001&B!\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lbet/prediction/response/SportsApi;", "Lu3/d;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/SportsApi$Category;", "data", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Lv3/b;)V", "map", "()Lu3/d;", "component1", "()Ljava/util/List;", "component2", "()Lv3/b;", "copy", "(Ljava/util/List;Lv3/b;)Lbet/prediction/response/SportsApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Lv3/b;", "getHttpException", "Lu3/c;", "getMapCategory", "mapCategory", "getStatusCode", "statusCode", "Category", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsApi.kt\nbet/prediction/response/SportsApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1617#2,9:49\n1869#2:58\n1870#2:60\n1626#2:61\n1#3:59\n*S KotlinDebug\n*F\n+ 1 SportsApi.kt\nbet/prediction/response/SportsApi\n*L\n16#1:49,9\n16#1:58\n16#1:60\n16#1:61\n16#1:59\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class SportsApi extends a implements d {

    @b("data")
    @Nullable
    private final List<Category> data;

    @Nullable
    private final v3.b httpException;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Lbet/prediction/response/SportsApi$Category;", "Lu3/c;", "", "id", "", "name", "logo", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lbet/prediction/response/SportsApi$Category;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getLogo", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category implements c {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b("id")
        private final int id;

        @b("logo")
        @Nullable
        private final String logo;

        @b("name")
        @Nullable
        private final String name;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/SportsApi$Category$Companion;", "", "<init>", "()V", "Lbet/prediction/response/SportsApi$Category;", "Lu3/c;", "mapper", "(Lbet/prediction/response/SportsApi$Category;)Lu3/c;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final c mapper(@Nullable final Category category) {
                if (category == null) {
                    return null;
                }
                return new c(category) { // from class: bet.prediction.response.SportsApi$Category$Companion$mapper$1
                    private final int id;
                    private final String logo;
                    private final String name;

                    {
                        this.id = category.getId();
                        this.name = category.getName();
                        this.logo = category.getLogo();
                    }

                    @Override // u3.c
                    public int getId() {
                        return this.id;
                    }

                    @Override // u3.c
                    public String getLogo() {
                        return this.logo;
                    }

                    @Override // u3.c
                    public String getName() {
                        return this.name;
                    }
                };
            }

            private Companion() {
            }
        }

        public Category(int i5, @Nullable String str, @Nullable String str2) {
            this.id = i5;
            this.name = str;
            this.logo = str2;
        }

        public static /* synthetic */ Category copy$default(Category category, int i5, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = category.id;
            }
            if ((i10 & 2) != 0) {
                str = category.name;
            }
            if ((i10 & 4) != 0) {
                str2 = category.logo;
            }
            return category.copy(i5, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final Category copy(int id2, @Nullable String name, @Nullable String logo) {
            return new Category(id2, name, logo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return this.id == category.id && Intrinsics.areEqual(this.name, category.name) && Intrinsics.areEqual(this.logo, category.logo);
        }

        @Override // u3.c
        public int getId() {
            return this.id;
        }

        @Override // u3.c
        @Nullable
        public String getLogo() {
            return this.logo;
        }

        @Override // u3.c
        @Nullable
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int i5 = this.id * 31;
            String str = this.name;
            int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logo;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Category(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", logo=");
            return e.k(sb2, this.logo, ')');
        }
    }

    public SportsApi(@Nullable List<Category> list, @Nullable v3.b bVar) {
        this.data = list;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportsApi copy$default(SportsApi sportsApi, List list, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = sportsApi.data;
        }
        if ((i5 & 2) != 0) {
            bVar = sportsApi.httpException;
        }
        return sportsApi.copy(list, bVar);
    }

    @Nullable
    public final List<Category> component1() {
        return this.data;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final SportsApi copy(@Nullable List<Category> data, @Nullable v3.b httpException) {
        return new SportsApi(data, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsApi)) {
            return false;
        }
        SportsApi sportsApi = (SportsApi) other;
        return Intrinsics.areEqual(this.data, sportsApi.data) && Intrinsics.areEqual(this.httpException, sportsApi.httpException);
    }

    @Nullable
    public final List<Category> getData() {
        return this.data;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Override // u3.d
    @Nullable
    public List<c> getMapCategory() {
        c cVar;
        List<Category> list = this.data;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                cVar = Category.INSTANCE.mapper((Category) it.next());
            } catch (Exception unused) {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        v3.b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<Category> list = this.data;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        v3.b bVar = this.httpException;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SportsApi(data=" + this.data + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public d m72map() {
        return new d(this) { // from class: bet.prediction.response.SportsApi$map$1
            private final v3.b httpException;
            private final List<c> mapCategory;
            private final int statusCode;

            {
                this.mapCategory = this.getMapCategory();
                this.statusCode = this.getStatusCode();
                this.httpException = this.getHttpException();
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            @Override // u3.d
            public List<c> getMapCategory() {
                return this.mapCategory;
            }

            @Override // v3.e
            public int getStatusCode() {
                return this.statusCode;
            }
        };
    }
}
