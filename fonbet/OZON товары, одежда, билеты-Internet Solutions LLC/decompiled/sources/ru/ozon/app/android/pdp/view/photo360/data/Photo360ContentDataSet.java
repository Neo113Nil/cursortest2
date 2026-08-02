package ru.ozon.app.android.pdp.view.photo360.data;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.photo360.api.Photo360Api;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360ContentDataSet;", "", "", SearchIntents.EXTRA_QUERY, "Lru/ozon/app/android/pdp/view/photo360/api/Photo360Api;", "api", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/view/photo360/api/Photo360Api;)V", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360Response;", "loadInitialState", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/lang/String;", "Lru/ozon/app/android/pdp/view/photo360/api/Photo360Api;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360ContentDataSet {

    @NotNull
    private final Photo360Api api;

    @NotNull
    private final String query;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360ContentDataSet$Companion;", "", "<init>", "()V", "QUERY_DELIMITER", "", "VALUE_DELIMITER", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Photo360ContentDataSet(@NotNull String query, @NotNull Photo360Api api) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(api, "api");
        this.query = query;
        this.api = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadInitialState(@NotNull d<? super Result<Photo360Response>> dVar) {
        Photo360ContentDataSet$loadInitialState$1 photo360ContentDataSet$loadInitialState$1;
        int i11;
        try {
            if (dVar instanceof Photo360ContentDataSet$loadInitialState$1) {
                photo360ContentDataSet$loadInitialState$1 = (Photo360ContentDataSet$loadInitialState$1) dVar;
                int i12 = photo360ContentDataSet$loadInitialState$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    photo360ContentDataSet$loadInitialState$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = photo360ContentDataSet$loadInitialState$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = photo360ContentDataSet$loadInitialState$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        List m11 = h.m(this.query, new String[]{"&"}, 0, 6);
                        int h11 = U.h(C7714v.z(m11, 10));
                        if (h11 < 16) {
                            h11 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                        Iterator it = m11.iterator();
                        while (it.hasNext()) {
                            List m12 = h.m((String) it.next(), new String[]{"="}, 0, 6);
                            Pair pair = new Pair((String) m12.get(0), (String) m12.get(1));
                            linkedHashMap.put(pair.e(), pair.f());
                        }
                        Photo360Api photo360Api = this.api;
                        photo360ContentDataSet$loadInitialState$1.label = 1;
                        obj = photo360Api.getPhoto360(linkedHashMap, photo360ContentDataSet$loadInitialState$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success((Photo360Response) obj);
                }
            }
            if (i11 != 0) {
            }
            return new Result.Success((Photo360Response) obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        photo360ContentDataSet$loadInitialState$1 = new Photo360ContentDataSet$loadInitialState$1(this, dVar);
        Object obj2 = photo360ContentDataSet$loadInitialState$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = photo360ContentDataSet$loadInitialState$1.label;
    }
}
