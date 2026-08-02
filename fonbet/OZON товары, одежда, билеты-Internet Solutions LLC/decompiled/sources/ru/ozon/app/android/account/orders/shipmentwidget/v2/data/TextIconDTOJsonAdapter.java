package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import Ak.b;
import Y9.c;
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
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/TextIconDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "horizontalPaddingAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextIconDTOJsonAdapter extends JsonAdapter<TextIconDTO> {
    public static final int $stable = 8;
    private volatile Constructor<TextIconDTO> constructorRef;

    @NotNull
    private final JsonAdapter<HorizontalPadding> horizontalPaddingAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TextIconDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "icon", "badge", "timeLeft", "common", "scrollWidgetId", "horizontalPadding", "shipmentHorizontalPadding");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "text");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "timeLeft");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.horizontalPaddingAdapter = moshi.f(HorizontalPadding.class, m11, "horizontalPadding");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(TextIconDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextIconDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        BadgeDTO badgeDTO = null;
        Integer num = null;
        CommonControlSettings commonControlSettings = null;
        Integer num2 = null;
        HorizontalPadding horizontalPadding = null;
        HorizontalPadding horizontalPadding2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 6:
                    horizontalPadding = this.horizontalPaddingAdapter.fromJson(reader);
                    if (horizontalPadding == null) {
                        throw c.q("horizontalPadding", "horizontalPadding", reader);
                    }
                    i11 &= -129;
                    break;
                case 7:
                    horizontalPadding2 = this.horizontalPaddingAdapter.fromJson(reader);
                    if (horizontalPadding2 == null) {
                        throw c.q("shipmentHorizontalPadding", "shipmentHorizontalPadding", reader);
                    }
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -449) {
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Integer num3 = num;
            BadgeDTO badgeDTO2 = badgeDTO;
            IconDTO iconDTO2 = iconDTO;
            TextDTO textDTO2 = textDTO;
            if (textDTO2 == null) {
                throw c.j("text", "text", reader);
            }
            Intrinsics.g(horizontalPadding, "null cannot be cast to non-null type ru.ozon.app.android.cscore.padding.HorizontalPadding");
            Intrinsics.g(horizontalPadding2, "null cannot be cast to non-null type ru.ozon.app.android.cscore.padding.HorizontalPadding");
            return new TextIconDTO(textDTO2, iconDTO2, badgeDTO2, num3, commonControlSettings2, null, num2, horizontalPadding, horizontalPadding2, 32, null);
        }
        HorizontalPadding horizontalPadding3 = horizontalPadding2;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        HorizontalPadding horizontalPadding4 = horizontalPadding;
        Integer num4 = num;
        Integer num5 = num2;
        BadgeDTO badgeDTO3 = badgeDTO;
        IconDTO iconDTO3 = iconDTO;
        TextDTO textDTO3 = textDTO;
        Constructor<TextIconDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TextIconDTO.class.getDeclaredConstructor(TextDTO.class, IconDTO.class, BadgeDTO.class, Integer.class, CommonControlSettings.class, CommonControlSettings.class, Integer.class, HorizontalPadding.class, HorizontalPadding.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<TextIconDTO> constructor2 = constructor;
        if (textDTO3 == null) {
            throw c.j("text", "text", reader);
        }
        TextIconDTO newInstance = constructor2.newInstance(textDTO3, iconDTO3, badgeDTO3, num4, commonControlSettings3, null, num5, horizontalPadding4, horizontalPadding3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextIconDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("timeLeft");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTimeLeft());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("scrollWidgetId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getScrollWidgetId());
        writer.w("horizontalPadding");
        this.horizontalPaddingAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("shipmentHorizontalPadding");
        this.horizontalPaddingAdapter.mo44toJson(writer, (x) value.getShipmentHorizontalPadding());
        writer.p();
    }
}
