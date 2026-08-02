package ru.ozon.fintech.exchanger.datapass;

import Xc.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2;", "", "", "cbottomId", "Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2$b;", "type", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2$b;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2$b;", "copy", "(Ljava/lang/String;Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2$b;)Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCbottomId", "Lru/ozon/fintech/exchanger/datapass/CbottomLifecycle2$b;", "getType", "Companion", "b", "a", "fintech-exchanger_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CbottomLifecycle2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String cbottomId;

    @NotNull
    private final b type;

    /* renamed from: ru.ozon.fintech.exchanger.datapass.CbottomLifecycle2$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static String a(@NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return "CbottomLifecycle2#" + uuid;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ON_CREATE;
        public static final b ON_DESTROY;
        public static final b ON_START;
        public static final b ON_STOP;

        static {
            b bVar = new b("ON_START", 0);
            ON_START = bVar;
            b bVar2 = new b("ON_STOP", 1);
            ON_STOP = bVar2;
            b bVar3 = new b("ON_CREATE", 2);
            ON_CREATE = bVar3;
            b bVar4 = new b("ON_DESTROY", 3);
            ON_DESTROY = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public CbottomLifecycle2(@i(name = "cbottomId") @NotNull String cbottomId, @NotNull b type) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.cbottomId = cbottomId;
        this.type = type;
    }

    public static /* synthetic */ CbottomLifecycle2 copy$default(CbottomLifecycle2 cbottomLifecycle2, String str, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottomLifecycle2.cbottomId;
        }
        if ((i11 & 2) != 0) {
            bVar = cbottomLifecycle2.type;
        }
        return cbottomLifecycle2.copy(str, bVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCbottomId() {
        return this.cbottomId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final b getType() {
        return this.type;
    }

    @NotNull
    public final CbottomLifecycle2 copy(@i(name = "cbottomId") @NotNull String cbottomId, @NotNull b type) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new CbottomLifecycle2(cbottomId, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomLifecycle2)) {
            return false;
        }
        CbottomLifecycle2 cbottomLifecycle2 = (CbottomLifecycle2) other;
        return Intrinsics.d(this.cbottomId, cbottomLifecycle2.cbottomId) && this.type == cbottomLifecycle2.type;
    }

    @NotNull
    public final String getCbottomId() {
        return this.cbottomId;
    }

    @NotNull
    public final b getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.cbottomId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CbottomLifecycle2(cbottomId=" + this.cbottomId + ", type=" + this.type + ")";
    }
}
