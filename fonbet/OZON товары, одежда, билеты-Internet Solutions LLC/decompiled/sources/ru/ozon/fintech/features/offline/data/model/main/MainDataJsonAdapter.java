package ru.ozon.fintech.features.offline.data.model.main;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/main/MainDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/offline/data/model/main/MainData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/offline/data/model/main/MainData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/offline/data/model/main/MainData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/features/offline/data/model/main/ClientData;", "clientDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/offline/data/model/main/AccountData;", "accountDataAdapter", "stringAdapter", "", "booleanAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainDataJsonAdapter extends JsonAdapter<MainData> {

    @NotNull
    private final JsonAdapter<AccountData> accountDataAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ClientData> clientDataAdapter;
    private volatile Constructor<MainData> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MainDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("client", "mainAccount", "supportPhone", "isOfflineEnabled", "sbpEnabled", "pageLoadedTimeoutMs");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ClientData> f7 = moshi.f(ClientData.class, m11, "client");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.clientDataAdapter = f7;
        JsonAdapter<AccountData> f11 = moshi.f(AccountData.class, m11, "accountData");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.accountDataAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "supportPhone");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.TYPE, m11, "isOfflineEnabled");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.booleanAdapter = f13;
        JsonAdapter<Long> f14 = moshi.f(Long.TYPE, m11, "pageLoadedTimeoutMs");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.longAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(MainData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MainData fromJson(@NotNull n reader) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool2 = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool3 = bool2;
        ClientData clientData = null;
        AccountData accountData = null;
        String str = null;
        Boolean bool4 = null;
        Long l11 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    clientData = this.clientDataAdapter.fromJson(reader);
                    if (clientData == null) {
                        throw c.q("client", "client", reader);
                    }
                    break;
                case 1:
                    accountData = this.accountDataAdapter.fromJson(reader);
                    if (accountData == null) {
                        throw c.q("accountData", "mainAccount", reader);
                    }
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("supportPhone", "supportPhone", reader);
                    }
                    break;
                case 3:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isOfflineEnabled", "isOfflineEnabled", reader);
                    }
                    i11 = -9;
                    break;
                case 4:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("sbpEnabled", "sbpEnabled", reader);
                    }
                    break;
                case 5:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("pageLoadedTimeoutMs", "pageLoadedTimeoutMs", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            Boolean bool5 = bool4;
            if (clientData == null) {
                throw c.j("client", "client", reader);
            }
            if (accountData == null) {
                throw c.j("accountData", "mainAccount", reader);
            }
            if (str == null) {
                throw c.j("supportPhone", "supportPhone", reader);
            }
            boolean booleanValue = bool3.booleanValue();
            if (bool5 == null) {
                throw c.j("sbpEnabled", "sbpEnabled", reader);
            }
            boolean booleanValue2 = bool5.booleanValue();
            if (l11 == null) {
                throw c.j("pageLoadedTimeoutMs", "pageLoadedTimeoutMs", reader);
            }
            return new MainData(clientData, accountData, str, booleanValue, booleanValue2, l11.longValue());
        }
        Boolean bool6 = bool4;
        Constructor<MainData> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            bool = bool6;
            constructor = MainData.class.getDeclaredConstructor(ClientData.class, AccountData.class, String.class, cls2, cls2, Long.TYPE, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            bool = bool6;
        }
        Constructor<MainData> constructor2 = constructor;
        if (clientData == null) {
            throw c.j("client", "client", reader);
        }
        if (accountData == null) {
            throw c.j("accountData", "mainAccount", reader);
        }
        if (str == null) {
            throw c.j("supportPhone", "supportPhone", reader);
        }
        if (bool == null) {
            throw c.j("sbpEnabled", "sbpEnabled", reader);
        }
        if (l11 == null) {
            throw c.j("pageLoadedTimeoutMs", "pageLoadedTimeoutMs", reader);
        }
        MainData newInstance = constructor2.newInstance(clientData, accountData, str, bool3, bool, l11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MainData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("client");
        this.clientDataAdapter.mo44toJson(writer, (x) value_.getClient());
        writer.w("mainAccount");
        this.accountDataAdapter.mo44toJson(writer, (x) value_.getAccountData());
        writer.w("supportPhone");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSupportPhone());
        writer.w("isOfflineEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isOfflineEnabled()));
        writer.w("sbpEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getSbpEnabled()));
        writer.w("pageLoadedTimeoutMs");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getPageLoadedTimeoutMs()));
        writer.p();
    }
}
