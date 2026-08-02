package ru.ozon.app.android.network.logrequests.export;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logrequests.export.HttpArchive;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive_LogJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;", "creatorAdapter", "nullableCreatorAdapter", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$HarEntry;", "listOfHarEntryAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HttpArchive_LogJsonAdapter extends JsonAdapter<HttpArchive.Log> {
    private volatile Constructor<HttpArchive.Log> constructorRef;

    @NotNull
    private final JsonAdapter<HttpArchive.Creator> creatorAdapter;

    @NotNull
    private final JsonAdapter<List<HttpArchive.HarEntry>> listOfHarEntryAdapter;

    @NotNull
    private final JsonAdapter<HttpArchive.Creator> nullableCreatorAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HttpArchive_LogJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("version", "creator", "browser", "entries");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "version");
        this.creatorAdapter = moshi.f(HttpArchive.Creator.class, m11, "creator");
        this.nullableCreatorAdapter = moshi.f(HttpArchive.Creator.class, m11, "browser");
        this.listOfHarEntryAdapter = moshi.f(D.e(List.class, HttpArchive.HarEntry.class), m11, "entries");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(HttpArchive.Log)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HttpArchive.Log fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        HttpArchive.Creator creator = null;
        HttpArchive.Creator creator2 = null;
        List<HttpArchive.HarEntry> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("version", "version", reader);
                }
                i11 = -2;
            } else if (v11 == 1) {
                creator = this.creatorAdapter.fromJson(reader);
                if (creator == null) {
                    throw c.q("creator", "creator", reader);
                }
            } else if (v11 == 2) {
                creator2 = this.nullableCreatorAdapter.fromJson(reader);
            } else if (v11 == 3 && (list = this.listOfHarEntryAdapter.fromJson(reader)) == null) {
                throw c.q("entries", "entries", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            if (creator == null) {
                throw c.j("creator", "creator", reader);
            }
            if (list != null) {
                return new HttpArchive.Log(str, creator, creator2, list);
            }
            throw c.j("entries", "entries", reader);
        }
        Constructor<HttpArchive.Log> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HttpArchive.Log.class.getDeclaredConstructor(String.class, HttpArchive.Creator.class, HttpArchive.Creator.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (creator == null) {
            throw c.j("creator", "creator", reader);
        }
        if (list == null) {
            throw c.j("entries", "entries", reader);
        }
        HttpArchive.Log newInstance = constructor.newInstance(str, creator, creator2, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HttpArchive.Log value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("version");
        this.stringAdapter.mo44toJson(writer, (x) value.getVersion());
        writer.w("creator");
        this.creatorAdapter.mo44toJson(writer, (x) value.getCreator());
        writer.w("browser");
        this.nullableCreatorAdapter.mo44toJson(writer, (x) value.getBrowser());
        writer.w("entries");
        this.listOfHarEntryAdapter.mo44toJson(writer, (x) value.getEntries());
        writer.p();
    }
}
