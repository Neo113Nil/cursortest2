package ru.ozon.uni.atoms.data.dsBadge;

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
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO_CustomStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "nullableCustomBackgroundAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeDTO_CustomStyleJsonAdapter extends JsonAdapter<BadgeDTO.CustomStyle> {
    public static final int $stable = 8;
    private volatile Constructor<BadgeDTO.CustomStyle> constructorRef;

    @NotNull
    private final JsonAdapter<BadgeDTO.CustomBackground> nullableCustomBackgroundAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public BadgeDTO_CustomStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("backgroundColor", "backgroundActiveColor", "textColor", "leftGraphicColor", "rightGraphicColor");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<BadgeDTO.CustomBackground> f7 = moshi.f(BadgeDTO.CustomBackground.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCustomBackgroundAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "textColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(BadgeDTO.CustomStyle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BadgeDTO.CustomStyle fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO.CustomBackground customBackground = null;
        BadgeDTO.CustomBackground customBackground2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                customBackground = this.nullableCustomBackgroundAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                customBackground2 = this.nullableCustomBackgroundAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                str3 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            String str4 = str3;
            String str5 = str2;
            return new BadgeDTO.CustomStyle(customBackground, customBackground2, str, str5, str4);
        }
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        BadgeDTO.CustomBackground customBackground3 = customBackground2;
        BadgeDTO.CustomBackground customBackground4 = customBackground;
        Constructor<BadgeDTO.CustomStyle> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BadgeDTO.CustomStyle.class.getDeclaredConstructor(BadgeDTO.CustomBackground.class, BadgeDTO.CustomBackground.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        BadgeDTO.CustomStyle newInstance = constructor.newInstance(customBackground4, customBackground3, str8, str7, str6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BadgeDTO.CustomStyle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableCustomBackgroundAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("backgroundActiveColor");
        this.nullableCustomBackgroundAdapter.mo44toJson(writer, (x) value_.getBackgroundActiveColor());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTextColor());
        writer.w("leftGraphicColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLeftGraphicColor());
        writer.w("rightGraphicColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRightGraphicColor());
        writer.p();
    }
}
