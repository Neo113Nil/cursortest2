package ru.ozon.app.android.tabbar.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/tabbar/data/TabConfigDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "bottomNavigationBehaviorAdapter", "nullableStringAdapter", "Lru/ozon/app/android/tabbar/data/TabConfigAnimations;", "nullableTabConfigAnimationsAdapter", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "nullableIndicatorDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigDTOJsonAdapter extends JsonAdapter<TabConfigDTO> {

    @NotNull
    private final JsonAdapter<BottomNavigationBehavior> bottomNavigationBehaviorAdapter;
    private volatile Constructor<TabConfigDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IndicatorDTO> nullableIndicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TabConfigAnimations> nullableTabConfigAnimationsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TabConfigDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "behavior", ImagesContract.URL, "longTapLink", "animation", "staticIndicator");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.bottomNavigationBehaviorAdapter = moshi.f(BottomNavigationBehavior.class, m11, "behavior");
        this.nullableStringAdapter = moshi.f(String.class, m11, "longTapLink");
        this.nullableTabConfigAnimationsAdapter = moshi.f(TabConfigAnimations.class, m11, "animation");
        this.nullableIndicatorDTOAdapter = moshi.f(IndicatorDTO.class, m11, "staticIndicator");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(TabConfigDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TabConfigDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        BottomNavigationBehavior bottomNavigationBehavior = null;
        String str3 = null;
        String str4 = null;
        TabConfigAnimations tabConfigAnimations = null;
        IndicatorDTO indicatorDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 2:
                    bottomNavigationBehavior = this.bottomNavigationBehaviorAdapter.fromJson(reader);
                    if (bottomNavigationBehavior == null) {
                        throw c.q("behavior", "behavior", reader);
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(ImagesContract.URL, ImagesContract.URL, reader);
                    }
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    tabConfigAnimations = this.nullableTabConfigAnimationsAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    indicatorDTO = this.nullableIndicatorDTOAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -113) {
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            TabConfigAnimations tabConfigAnimations2 = tabConfigAnimations;
            String str5 = str4;
            String str6 = str3;
            BottomNavigationBehavior bottomNavigationBehavior2 = bottomNavigationBehavior;
            String str7 = str2;
            String str8 = str;
            if (str8 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (str7 == null) {
                throw c.j("icon", "icon", reader);
            }
            if (bottomNavigationBehavior2 == null) {
                throw c.j("behavior", "behavior", reader);
            }
            if (str6 != null) {
                return new TabConfigDTO(str8, str7, bottomNavigationBehavior2, str6, str5, tabConfigAnimations2, indicatorDTO2);
            }
            throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
        }
        IndicatorDTO indicatorDTO3 = indicatorDTO;
        TabConfigAnimations tabConfigAnimations3 = tabConfigAnimations;
        String str9 = str4;
        String str10 = str3;
        BottomNavigationBehavior bottomNavigationBehavior3 = bottomNavigationBehavior;
        String str11 = str2;
        String str12 = str;
        Constructor<TabConfigDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TabConfigDTO.class.getDeclaredConstructor(String.class, String.class, BottomNavigationBehavior.class, String.class, String.class, TabConfigAnimations.class, IndicatorDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TabConfigDTO> constructor2 = constructor;
        if (str12 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str11 == null) {
            throw c.j("icon", "icon", reader);
        }
        if (bottomNavigationBehavior3 == null) {
            throw c.j("behavior", "behavior", reader);
        }
        if (str10 == null) {
            throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
        }
        TabConfigDTO newInstance = constructor2.newInstance(str12, str11, bottomNavigationBehavior3, str10, str9, tabConfigAnimations3, indicatorDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TabConfigDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("behavior");
        this.bottomNavigationBehaviorAdapter.mo44toJson(writer, (x) value.getBehavior());
        writer.w(ImagesContract.URL);
        this.stringAdapter.mo44toJson(writer, (x) value.getUrl());
        writer.w("longTapLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLongTapLink());
        writer.w("animation");
        this.nullableTabConfigAnimationsAdapter.mo44toJson(writer, (x) value.getAnimation());
        writer.w("staticIndicator");
        this.nullableIndicatorDTOAdapter.mo44toJson(writer, (x) value.getStaticIndicator());
        writer.p();
    }
}
