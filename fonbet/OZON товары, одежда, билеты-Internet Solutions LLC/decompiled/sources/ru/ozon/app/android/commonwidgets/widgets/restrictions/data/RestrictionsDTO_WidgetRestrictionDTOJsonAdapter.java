package ru.ozon.app.android.commonwidgets.widgets.restrictions.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.RestrictionsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO_WidgetRestrictionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$WidgetRestrictionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$WidgetRestrictionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$WidgetRestrictionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "nullableActionAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "nullableProgressAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictionsDTO_WidgetRestrictionDTOJsonAdapter extends JsonAdapter<RestrictionsDTO.WidgetRestrictionDTO> {
    private volatile Constructor<RestrictionsDTO.WidgetRestrictionDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Restriction.Action> nullableActionAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Restriction.Progress> nullableProgressAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public RestrictionsDTO_WidgetRestrictionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "image", "imageTintColor", "type", "lifetime", "action", "context", "progress", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "message");
        this.nullableActionAdapter = moshi.f(Restriction.Action.class, m11, "action");
        this.nullableProgressAdapter = moshi.f(Restriction.Progress.class, m11, "progress");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(RestrictionsDTO.WidgetRestrictionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RestrictionsDTO.WidgetRestrictionDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Restriction.Action action = null;
        String str7 = null;
        Restriction.Progress progress = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("message", "message", reader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    action = this.nullableActionAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    progress = this.nullableProgressAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -1006) {
            Restriction.Progress progress2 = progress;
            String str8 = str7;
            Restriction.Action action2 = action;
            String str9 = str6;
            String str10 = str5;
            String str11 = str4;
            String str12 = str3;
            String str13 = str2;
            String str14 = str;
            if (str13 == null) {
                throw c.j("message", "message", reader);
            }
            if (str10 != null) {
                return new RestrictionsDTO.WidgetRestrictionDTO(str14, str13, str12, str11, str10, str9, action2, str8, progress2, map);
            }
            throw c.j("type", "type", reader);
        }
        Restriction.Progress progress3 = progress;
        String str15 = str7;
        Restriction.Action action3 = action;
        String str16 = str6;
        String str17 = str5;
        String str18 = str4;
        String str19 = str3;
        String str20 = str2;
        String str21 = str;
        Constructor<RestrictionsDTO.WidgetRestrictionDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = RestrictionsDTO.WidgetRestrictionDTO.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Restriction.Action.class, String.class, Restriction.Progress.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<RestrictionsDTO.WidgetRestrictionDTO> constructor2 = constructor;
        if (str20 == null) {
            throw c.j("message", "message", reader);
        }
        if (str17 == null) {
            throw c.j("type", "type", reader);
        }
        RestrictionsDTO.WidgetRestrictionDTO newInstance = constructor2.newInstance(str21, str20, str19, str18, str17, str16, action3, str15, progress3, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RestrictionsDTO.WidgetRestrictionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value.getMessage());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("imageTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImageTintColor());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("lifetime");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLifetime());
        writer.w("action");
        this.nullableActionAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.w("progress");
        this.nullableProgressAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
