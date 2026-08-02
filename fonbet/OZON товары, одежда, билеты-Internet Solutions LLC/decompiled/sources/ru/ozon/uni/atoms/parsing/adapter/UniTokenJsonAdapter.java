package ru.ozon.uni.atoms.parsing.adapter;

import Nk.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.models.UniToken;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.core.repository.UniTokenRepository;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/parsing/adapter/UniTokenJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/core/models/UniToken;", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/core/models/UniToken;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/core/models/UniToken;)V", "Ljava/lang/Class;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniTokenJsonAdapter extends JsonAdapter<UniToken> {
    public static final int $stable = 8;

    @NotNull
    private final Class<?> clazz;

    public UniTokenJsonAdapter(@NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.clazz = clazz;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public UniToken fromJson(@NotNull n reader) {
        UniTokenRepository typographyTokens;
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.p() == n.b.NULL) {
            reader.m();
            return null;
        }
        String nextString = reader.nextString();
        Class<?> cls = this.clazz;
        if (Intrinsics.d(cls, UniColorToken.class)) {
            typographyTokens = UniTheme.INSTANCE.getColorTokens();
        } else if (Intrinsics.d(cls, UniPaddingToken.class)) {
            typographyTokens = UniTheme.INSTANCE.getPaddingTokens();
        } else if (Intrinsics.d(cls, UniRadiusToken.class)) {
            typographyTokens = UniTheme.INSTANCE.getRadiusTokens();
        } else if (Intrinsics.d(cls, UniGradientToken.class)) {
            typographyTokens = UniTheme.INSTANCE.getGradients();
        } else if (Intrinsics.d(cls, UniIconToken.class)) {
            typographyTokens = UniTheme.INSTANCE.getIconTokens();
        } else {
            if (!Intrinsics.d(cls, UniTypographyToken.class)) {
                throw new k(a.b("unknown type of token ", nextString));
            }
            typographyTokens = UniTheme.INSTANCE.getTypographyTokens();
        }
        Intrinsics.f(nextString);
        UniToken byId = typographyTokens.getById(nextString);
        if (byId != null) {
            return byId;
        }
        throw new k("unknown token ".concat(nextString));
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UniToken value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.R(value != null ? value.getId() : null);
    }
}
