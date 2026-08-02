package dh;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4074a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45278a = AtomicReferenceFieldUpdater.newUpdater(C4074a.class, Object.class, "current");

    @NotNull
    private volatile /* synthetic */ Object current = MapsKt.emptyMap();

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Map) this.current).get(key);
    }
}
