package ru.ozon.app.android.pdp.widgets.curtainPrice.data;

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
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO_SettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurtainPriceDTO_SettingsDTOJsonAdapter extends JsonAdapter<CurtainPriceDTO.SettingsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CurtainPriceDTO.SettingsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CurtainPriceDTO_SettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("innerBackgroundColor", "outerBackgroundColor", "horizontalMargin", "cornerRadius");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "innerBackgroundColor");
        this.paddingsAdapter = moshi.f(Paddings.class, m11, "horizontalMargin");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(CurtainPriceDTO.SettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CurtainPriceDTO.SettingsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        Paddings paddings = null;
        CornerRadius cornerRadius = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("innerBackgroundColor", "innerBackgroundColor", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("outerBackgroundColor", "outerBackgroundColor", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                paddings = this.paddingsAdapter.fromJson(reader);
                if (paddings == null) {
                    throw c.q("horizontalMargin", "horizontalMargin", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                if (cornerRadius == null) {
                    throw c.q("cornerRadius", "cornerRadius", reader);
                }
                i11 &= -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            return new CurtainPriceDTO.SettingsDTO(str, str2, paddings, cornerRadius);
        }
        Constructor<CurtainPriceDTO.SettingsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CurtainPriceDTO.SettingsDTO.class.getDeclaredConstructor(String.class, String.class, Paddings.class, CornerRadius.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CurtainPriceDTO.SettingsDTO newInstance = constructor.newInstance(str, str2, paddings, cornerRadius, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CurtainPriceDTO.SettingsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("innerBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getInnerBackgroundColor());
        writer.w("outerBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getOuterBackgroundColor());
        writer.w("horizontalMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getHorizontalMargin());
        writer.w("cornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.p();
    }
}
