package ru.ozon.tracker.sendEvent.serializing;

import Ep.a;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/tracker/sendEvent/serializing/CellAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Companion", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellAdapterFactory implements JsonAdapter.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final ParameterizedType mapType = D.e(Map.class, String.class, Object.class);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/tracker/sendEvent/serializing/CellAdapterFactory$Companion;", "", "<init>", "()V", "mapType", "Ljava/lang/reflect/ParameterizedType;", "kotlin.jvm.PlatformType", "Ljava/lang/reflect/ParameterizedType;", "createCustomCellAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "moshi", "Lcom/squareup/moshi/Moshi;", "createCustomCellAdapter$tracker_sdk_release", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsonAdapter<Cell.CustomCell> createCustomCellAdapter$tracker_sdk_release(@NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            JsonAdapter d11 = moshi.d(CellAdapterFactory.mapType);
            Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
            return new CustomCellAdapter(d11);
        }

        private Companion() {
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class b11 = a.b(annotations, "annotations", moshi, "moshi", type);
        if (Intrinsics.d(b11, Cell.CustomCell.class)) {
            return INSTANCE.createCustomCellAdapter$tracker_sdk_release(moshi);
        }
        if (Intrinsics.d(b11, Cell.class)) {
            return new CellAdapter(moshi);
        }
        return null;
    }
}
