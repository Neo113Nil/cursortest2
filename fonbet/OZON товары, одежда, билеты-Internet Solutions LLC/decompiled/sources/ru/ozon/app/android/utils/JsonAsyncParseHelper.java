package ru.ozon.app.android.utils;

import Sc.InterfaceC3999a;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import xe.N;

@InterfaceC3999a
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/utils/JsonAsyncParseHelper;", "", "<init>", "()V", "T", "Lcom/squareup/moshi/n;", "jsonReader", "Lcom/squareup/moshi/JsonAdapter;", "itemJsonAdapter", "", "asyncReadJsonArray", "(Lcom/squareup/moshi/n;Lcom/squareup/moshi/JsonAdapter;Lkotlin/coroutines/d;)Ljava/lang/Object;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonAsyncParseHelper {

    @NotNull
    public static final JsonAsyncParseHelper INSTANCE = new JsonAsyncParseHelper();

    private JsonAsyncParseHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @InterfaceC3999a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object asyncReadJsonArray(@NotNull n nVar, @NotNull JsonAdapter<T> jsonAdapter, @NotNull d<? super List<? extends T>> dVar) {
        JsonAsyncParseHelper$asyncReadJsonArray$1 jsonAsyncParseHelper$asyncReadJsonArray$1;
        int i11;
        if (dVar instanceof JsonAsyncParseHelper$asyncReadJsonArray$1) {
            jsonAsyncParseHelper$asyncReadJsonArray$1 = (JsonAsyncParseHelper$asyncReadJsonArray$1) dVar;
            int i12 = jsonAsyncParseHelper$asyncReadJsonArray$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jsonAsyncParseHelper$asyncReadJsonArray$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jsonAsyncParseHelper$asyncReadJsonArray$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = jsonAsyncParseHelper$asyncReadJsonArray$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) jsonAsyncParseHelper$asyncReadJsonArray$1.L$0;
                    s.b(obj);
                    return list;
                }
                s.b(obj);
                ArrayList arrayList = new ArrayList();
                JsonAsyncParseHelper$asyncReadJsonArray$2$1 jsonAsyncParseHelper$asyncReadJsonArray$2$1 = new JsonAsyncParseHelper$asyncReadJsonArray$2$1(nVar, arrayList, jsonAdapter, null);
                jsonAsyncParseHelper$asyncReadJsonArray$1.L$0 = arrayList;
                jsonAsyncParseHelper$asyncReadJsonArray$1.label = 1;
                return N.d(jsonAsyncParseHelper$asyncReadJsonArray$2$1, jsonAsyncParseHelper$asyncReadJsonArray$1) == aVar ? aVar : arrayList;
            }
        }
        jsonAsyncParseHelper$asyncReadJsonArray$1 = new JsonAsyncParseHelper$asyncReadJsonArray$1(this, dVar);
        Object obj2 = jsonAsyncParseHelper$asyncReadJsonArray$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = jsonAsyncParseHelper$asyncReadJsonArray$1.label;
        if (i11 == 0) {
        }
    }
}
