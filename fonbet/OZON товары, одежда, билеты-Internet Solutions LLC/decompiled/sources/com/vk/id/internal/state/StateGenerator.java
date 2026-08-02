package com.vk.id.internal.state;

import com.vk.id.internal.store.InternalVKIDPrefsStore;
import java.util.ArrayList;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import kotlin.ranges.IntRange;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/state/StateGenerator;", "", "prefsStore", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "<init>", "(Lcom/vk/id/internal/store/InternalVKIDPrefsStore;)V", "regenerateState", "", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StateGenerator {

    @NotNull
    private final InternalVKIDPrefsStore prefsStore;
    public static final int $stable = 8;

    public StateGenerator(@NotNull InternalVKIDPrefsStore prefsStore) {
        Intrinsics.checkNotNullParameter(prefsStore, "prefsStore");
        this.prefsStore = prefsStore;
    }

    @NotNull
    public final String regenerateState() {
        ArrayList p02 = C7714v.p0(new b('0', '9'), C7714v.n0(new b('A', 'Z'), new b('a', 'z')));
        IntRange intRange = new IntRange(1, 32, 1);
        ArrayList arrayList = new ArrayList(C7714v.z(intRange, 10));
        C7665d it = intRange.iterator();
        while (it.hasNext()) {
            it.b();
            Character ch2 = (Character) C7714v.r0(p02, c.INSTANCE);
            ch2.getClass();
            arrayList.add(ch2);
        }
        String V11 = C7714v.V(arrayList, "", null, null, null, 62);
        this.prefsStore.setState(V11);
        return V11;
    }
}
