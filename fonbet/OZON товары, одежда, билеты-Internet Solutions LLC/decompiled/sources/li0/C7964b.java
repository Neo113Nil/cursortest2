package li0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import li0.InterfaceC7963a;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.db.daos.v2.EventDaoV2$DefaultImpls", f = "EventDaoV2.kt", l = {75}, m = "markPending")
/* renamed from: li0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7964b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    ArrayList f73336d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f73337e;

    /* renamed from: f, reason: collision with root package name */
    int f73338f;

    C7964b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object d11;
        this.f73337e = obj;
        this.f73338f |= LinearLayoutManager.INVALID_OFFSET;
        d11 = InterfaceC7963a.C1241a.d(null, null, this);
        return d11;
    }
}
