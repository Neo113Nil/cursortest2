package ru.ozon.app.android.atoms.data.aspect;

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
import ru.ozon.app.android.atoms.data.aspect.AspectDTO;
import ru.ozon.app.android.atoms.data.common.CornerRadius;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/atoms/data/aspect/AspectDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/aspect/AspectDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/aspect/AspectDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/aspect/AspectDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/aspect/AspectDTO$AspectState;", "nullableAspectStateAdapter", "Lru/ozon/app/android/atoms/data/aspect/AspectDTO$CustomStyle;", "nullableCustomStyleAdapter", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AspectDTOJsonAdapter extends JsonAdapter<AspectDTO> {
    public static final int $stable = 8;
    private volatile Constructor<AspectDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AspectDTO.AspectState> nullableAspectStateAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AspectDTO.CustomStyle> nullableCustomStyleAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AspectDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("radius", "state", "customStyle", "common", "context");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CornerRadius> f7 = moshi.f(CornerRadius.class, m11, "radius");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCornerRadiusAdapter = f7;
        JsonAdapter<AspectDTO.AspectState> f11 = moshi.f(AspectDTO.AspectState.class, m11, "state");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAspectStateAdapter = f11;
        JsonAdapter<AspectDTO.CustomStyle> f12 = moshi.f(AspectDTO.CustomStyle.class, m11, "customStyle");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableCustomStyleAdapter = f12;
        JsonAdapter<CommonControlSettings> f13 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(AspectDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AspectDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CornerRadius cornerRadius = null;
        AspectDTO.AspectState aspectState = null;
        AspectDTO.CustomStyle customStyle = null;
        CommonControlSettings commonControlSettings = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                aspectState = this.nullableAspectStateAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                customStyle = this.nullableCustomStyleAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            String str2 = str;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return new AspectDTO(cornerRadius, aspectState, customStyle, commonControlSettings2, str2);
        }
        String str3 = str;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        AspectDTO.CustomStyle customStyle2 = customStyle;
        AspectDTO.AspectState aspectState2 = aspectState;
        CornerRadius cornerRadius2 = cornerRadius;
        Constructor<AspectDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AspectDTO.class.getDeclaredConstructor(CornerRadius.class, AspectDTO.AspectState.class, AspectDTO.CustomStyle.class, CommonControlSettings.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        AspectDTO newInstance = constructor.newInstance(cornerRadius2, aspectState2, customStyle2, commonControlSettings3, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AspectDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("radius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value_.getRadius());
        writer.w("state");
        this.nullableAspectStateAdapter.mo44toJson(writer, (x) value_.getState());
        writer.w("customStyle");
        this.nullableCustomStyleAdapter.mo44toJson(writer, (x) value_.getCustomStyle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.p();
    }
}
