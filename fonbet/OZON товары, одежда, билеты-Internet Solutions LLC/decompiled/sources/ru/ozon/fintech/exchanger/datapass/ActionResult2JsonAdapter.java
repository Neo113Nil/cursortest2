package ru.ozon.fintech.exchanger.datapass;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/fintech/exchanger/datapass/ActionResult2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/exchanger/datapass/ActionResult2;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableLongAdapter", "", "nullableListOfStringAdapter", "", "nullableListOfDoubleAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "nullableMapOfStringComposerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-exchanger_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionResult2JsonAdapter extends JsonAdapter<ActionResult2> {
    private volatile Constructor<ActionResult2> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, ComposerTrackingInfo>> nullableMapOfStringComposerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ActionResult2JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("cbottomId", "widgetId", "type", "text", ImagesContract.URL, "framePos", "storyPos", "fromStory", "fromFrame", "toStory", "toFrame", "previousStoryPos", "subWidgetId", "duration", "widgetIds", "bottomLeft", "bottomRight", "topLeft", "topRight", RichContentDTO.ALIGN_CENTER, "zoom", "versionStamp", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "cbottomId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "widgetId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "framePos");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<Long> f13 = moshi.f(Long.class, m11, "duration");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLongAdapter = f13;
        JsonAdapter<List<String>> f14 = moshi.f(D.e(List.class, String.class), m11, "widgetIds");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableListOfStringAdapter = f14;
        JsonAdapter<List<Double>> f15 = moshi.f(D.e(List.class, Double.class), m11, "bottomLeft");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfDoubleAdapter = f15;
        JsonAdapter<Map<String, String>> f16 = moshi.f(D.e(Map.class, String.class, String.class), m11, "composerActionParams");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f16;
        JsonAdapter<Map<String, ComposerTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, ComposerTrackingInfo.class), m11, "composerTrackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringComposerTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(ActionResult2)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionResult2 fromJson(@NotNull n reader) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i13 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str6 = null;
        Long l11 = null;
        List<String> list = null;
        List<Double> list2 = null;
        List<Double> list3 = null;
        List<Double> list4 = null;
        List<Double> list5 = null;
        List<Double> list6 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Map<String, String> map = null;
        Map<String, ComposerTrackingInfo> map2 = null;
        while (reader.hasNext()) {
            String str10 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str10;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("cbottomId", "cbottomId", reader);
                    }
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    str = str10;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("type", "type", reader);
                    }
                    str = str10;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    str = str10;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    str = str10;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 8:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 9:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 10:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 11:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    str = str10;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str = str10;
                case 13:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i13 &= -8193;
                    str = str10;
                case 14:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    i13 &= -16385;
                    str = str10;
                case 15:
                    list2 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i12 = -32769;
                    i13 &= i12;
                    str = str10;
                case 16:
                    list3 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i12 = -65537;
                    i13 &= i12;
                    str = str10;
                case 17:
                    list4 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i12 = -131073;
                    i13 &= i12;
                    str = str10;
                case 18:
                    list5 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i12 = -262145;
                    i13 &= i12;
                    str = str10;
                case 19:
                    list6 = this.nullableListOfDoubleAdapter.fromJson(reader);
                    i12 = -524289;
                    i13 &= i12;
                    str = str10;
                case 20:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -1048577;
                    i13 &= i12;
                    str = str10;
                case 21:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    i12 = -2097153;
                    i13 &= i12;
                    str = str10;
                case 22:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -4194305;
                    i13 &= i12;
                    str = str10;
                case 23:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -8388609;
                    i13 &= i12;
                    str = str10;
                case 24:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i12 = -16777217;
                    i13 &= i12;
                    str = str10;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i12 = -33554433;
                    i13 &= i12;
                    str = str10;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    map2 = this.nullableMapOfStringComposerTrackingInfoAdapter.fromJson(reader);
                    i12 = -67108865;
                    i13 &= i12;
                    str = str10;
                default:
                    str = str10;
            }
        }
        String str11 = str;
        reader.endObject();
        if (i13 == -134209537) {
            if (str11 == null) {
                throw c.j("cbottomId", "cbottomId", reader);
            }
            if (str3 == null) {
                throw c.j("type", "type", reader);
            }
            Integer num10 = num4;
            Integer num11 = num3;
            Integer num12 = num2;
            Integer num13 = num;
            String str12 = str5;
            return new ActionResult2(str11, str2, str3, str4, str12, num13, num12, num11, num10, num5, num6, num7, str6, l11, list, list2, list3, list4, list5, list6, num8, num9, str7, str8, str9, map, map2);
        }
        Constructor<ActionResult2> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i13;
            constructor = ActionResult2.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, Long.class, List.class, List.class, List.class, List.class, List.class, List.class, Integer.class, Integer.class, String.class, String.class, String.class, Map.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i13;
        }
        Constructor<ActionResult2> constructor2 = constructor;
        if (str11 == null) {
            throw c.j("cbottomId", "cbottomId", reader);
        }
        if (str3 == null) {
            throw c.j("type", "type", reader);
        }
        ActionResult2 newInstance = constructor2.newInstance(str11, str2, str3, str4, str5, num, num2, num3, num4, num5, num6, num7, str6, l11, list, list2, list3, list4, list5, list6, num8, num9, str7, str8, str9, map, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionResult2 value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("cbottomId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCbottomId());
        writer.w("widgetId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getWidgetId());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("framePos");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getFramePos());
        writer.w("storyPos");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStoryPos());
        writer.w("fromStory");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getFromStory());
        writer.w("fromFrame");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getFromFrame());
        writer.w("toStory");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getToStory());
        writer.w("toFrame");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getToFrame());
        writer.w("previousStoryPos");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getPreviousStoryPos());
        writer.w("subWidgetId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubWidgetId());
        writer.w("duration");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDuration());
        writer.w("widgetIds");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getWidgetIds());
        writer.w("bottomLeft");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getBottomLeft());
        writer.w("bottomRight");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getBottomRight());
        writer.w("topLeft");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getTopLeft());
        writer.w("topRight");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getTopRight());
        writer.w(RichContentDTO.ALIGN_CENTER);
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value_.getCenter());
        writer.w("zoom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getZoom());
        writer.w("versionStamp");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersionStamp());
        writer.w("composerActionBehavior");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionBehavior());
        writer.w("composerActionLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionLink());
        writer.w("composerActionId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerActionId());
        writer.w("composerActionParams");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getComposerActionParams());
        writer.w("composerTrackingInfo");
        this.nullableMapOfStringComposerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getComposerTrackingInfo());
        writer.p();
    }
}
