package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthApplicationInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthApplicationInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfIntAdapter", "Lru/ozon/fintech/analytic/models/HealthExtLib;", "nullableListOfHealthExtLibAdapter", "nullableListOfIntAdapter", "Lru/ozon/fintech/analytic/models/HealthWidget;", "nullableListOfHealthWidgetAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthApplicationInfoJsonAdapter extends JsonAdapter<HealthApplicationInfo> {
    private volatile Constructor<HealthApplicationInfo> constructorRef;

    @NotNull
    private final JsonAdapter<List<Integer>> listOfIntAdapter;

    @NotNull
    private final JsonAdapter<List<HealthExtLib>> nullableListOfHealthExtLibAdapter;

    @NotNull
    private final JsonAdapter<List<HealthWidget>> nullableListOfHealthWidgetAdapter;

    @NotNull
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HealthApplicationInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("app", "app_alias", "app_ver", "ext_libs", "lib", "lib_ver", "store", "webview_ver", "widgets");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "app");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<Integer>> f11 = moshi.f(D.e(List.class, Integer.class), m11, "appVer");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfIntAdapter = f11;
        JsonAdapter<List<HealthExtLib>> f12 = moshi.f(D.e(List.class, HealthExtLib.class), m11, "extLibs");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfHealthExtLibAdapter = f12;
        JsonAdapter<List<Integer>> f13 = moshi.f(D.e(List.class, Integer.class), m11, "webviewVer");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfIntAdapter = f13;
        JsonAdapter<List<HealthWidget>> f14 = moshi.f(D.e(List.class, HealthWidget.class), m11, "widgets");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableListOfHealthWidgetAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(HealthApplicationInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthApplicationInfo fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        List<Integer> list = null;
        List<HealthExtLib> list2 = null;
        String str3 = null;
        List<Integer> list3 = null;
        String str4 = null;
        List<Integer> list4 = null;
        List<HealthWidget> list5 = null;
        while (true) {
            String str5 = str;
            String str6 = str2;
            List<Integer> list6 = list;
            List<HealthExtLib> list7 = list2;
            String str7 = str3;
            if (!reader.hasNext()) {
                List<Integer> list8 = list3;
                reader.endObject();
                if (i12 == -265) {
                    if (str5 == null) {
                        throw c.j("app", "app", reader);
                    }
                    if (str6 == null) {
                        throw c.j("appAlias", "app_alias", reader);
                    }
                    if (list6 == null) {
                        throw c.j("appVer", "app_ver", reader);
                    }
                    if (str7 == null) {
                        throw c.j("lib", "lib", reader);
                    }
                    if (list8 == null) {
                        throw c.j("libVer", "lib_ver", reader);
                    }
                    if (str4 == null) {
                        throw c.j("store", "store", reader);
                    }
                    return new HealthApplicationInfo(str5, str6, list6, list7, str7, list8, str4, list4, list5);
                }
                Constructor<HealthApplicationInfo> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = HealthApplicationInfo.class.getDeclaredConstructor(String.class, String.class, List.class, List.class, String.class, List.class, String.class, List.class, List.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<HealthApplicationInfo> constructor2 = constructor;
                if (str5 == null) {
                    throw c.j("app", "app", reader);
                }
                if (str6 == null) {
                    throw c.j("appAlias", "app_alias", reader);
                }
                if (list6 == null) {
                    throw c.j("appVer", "app_ver", reader);
                }
                if (str7 == null) {
                    throw c.j("lib", "lib", reader);
                }
                if (list8 == null) {
                    throw c.j("libVer", "lib_ver", reader);
                }
                if (str4 == null) {
                    throw c.j("store", "store", reader);
                }
                HealthApplicationInfo newInstance = constructor2.newInstance(str5, str6, list6, list7, str7, list8, str4, list4, list5, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            List<Integer> list9 = list3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("app", "app", reader);
                    }
                    list3 = list9;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("appAlias", "app_alias", reader);
                    }
                    list3 = list9;
                    str = str5;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 2:
                    list = this.listOfIntAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("appVer", "app_ver", reader);
                    }
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list2 = list7;
                    str3 = str7;
                case 3:
                    list2 = this.nullableListOfHealthExtLibAdapter.fromJson(reader);
                    i12 &= -9;
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    str3 = str7;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("lib", "lib", reader);
                    }
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                case 5:
                    list3 = this.listOfIntAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("libVer", "lib_ver", reader);
                    }
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 6:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("store", "store", reader);
                    }
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 7:
                    list4 = this.nullableListOfIntAdapter.fromJson(reader);
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                case 8:
                    list5 = this.nullableListOfHealthWidgetAdapter.fromJson(reader);
                    i12 &= -257;
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
                default:
                    list3 = list9;
                    str = str5;
                    str2 = str6;
                    list = list6;
                    list2 = list7;
                    str3 = str7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthApplicationInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("app");
        this.stringAdapter.mo44toJson(writer, (x) value_.getApp());
        writer.w("app_alias");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppAlias());
        writer.w("app_ver");
        this.listOfIntAdapter.mo44toJson(writer, (x) value_.getAppVer());
        writer.w("ext_libs");
        this.nullableListOfHealthExtLibAdapter.mo44toJson(writer, (x) value_.getExtLibs());
        writer.w("lib");
        this.stringAdapter.mo44toJson(writer, (x) value_.getLib());
        writer.w("lib_ver");
        this.listOfIntAdapter.mo44toJson(writer, (x) value_.getLibVer());
        writer.w("store");
        this.stringAdapter.mo44toJson(writer, (x) value_.getStore());
        writer.w("webview_ver");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getWebviewVer());
        writer.w("widgets");
        this.nullableListOfHealthWidgetAdapter.mo44toJson(writer, (x) value_.getWidgets());
        writer.p();
    }
}
