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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO_StraightCornersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeDTO_StraightCornersJsonAdapter extends JsonAdapter<BadgeDTO.StraightCorners> {
    public static final int $stable = 8;
    private volatile Constructor<BadgeDTO.StraightCorners> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final n.a options;

    public BadgeDTO_StraightCornersJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("topLeft", "topRight", "bottomLeft", "bottomRight");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.class, M.f71699a, "topLeft");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableBooleanAdapter = f7;
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(BadgeDTO.StraightCorners)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BadgeDTO.StraightCorners fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                bool3 = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                bool4 = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -9;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            return new BadgeDTO.StraightCorners(bool, bool2, bool3, bool4);
        }
        Constructor<BadgeDTO.StraightCorners> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BadgeDTO.StraightCorners.class.getDeclaredConstructor(Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        BadgeDTO.StraightCorners newInstance = constructor.newInstance(bool, bool2, bool3, bool4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BadgeDTO.StraightCorners value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topLeft");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getTopLeft());
        writer.w("topRight");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getTopRight());
        writer.w("bottomLeft");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getBottomLeft());
        writer.w("bottomRight");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getBottomRight());
        writer.p();
    }
}
