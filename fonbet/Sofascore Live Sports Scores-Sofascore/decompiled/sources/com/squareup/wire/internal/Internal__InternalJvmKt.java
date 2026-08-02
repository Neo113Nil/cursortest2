package com.squareup.wire.internal;

import com.ironsource.L6;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"'\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"redactElements", "", "T", "list", "", L6.G1, "Lcom/squareup/wire/ProtoAdapter;", "map", "", "identityOrNull", "E", "Lcom/squareup/wire/WireEnum;", "Ljava/lang/Class;", "getIdentityOrNull", "(Ljava/lang/Class;)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
/* loaded from: classes6.dex */
final /* synthetic */ class Internal__InternalJvmKt {
    @Nullable
    public static final <E extends WireEnum> E getIdentityOrNull(@NotNull Class<E> cls) {
        E e;
        cls.getClass();
        E[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                e = null;
                break;
            }
            e = enumConstants[i];
            E e2 = e;
            e2.getClass();
            if (e2.getValue() == 0) {
                break;
            }
            i++;
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(@NotNull Map<?, T> map, @NotNull ProtoAdapter<T> protoAdapter) {
        map.getClass();
        protoAdapter.getClass();
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }

    public static final <T> void redactElements(@NotNull List<T> list, @NotNull ProtoAdapter<T> protoAdapter) {
        list.getClass();
        protoAdapter.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, protoAdapter.redact(list.get(i)));
        }
    }
}
