package ru.ozon.android.messenger.framework.composer.network.serialization;

import Jb.e;
import com.squareup.moshi.Moshi;
import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;

/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86745a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f86746b;

    public /* synthetic */ b(Pc.a aVar, int i11) {
        this.f86745a = i11;
        this.f86746b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f86745a) {
            case 0:
                return new a((Moshi) this.f86746b.get());
            default:
                return new ru.ozon.android.messenger.framework.data.local.database.draft.a((MessengerDB) this.f86746b.get());
        }
    }
}
