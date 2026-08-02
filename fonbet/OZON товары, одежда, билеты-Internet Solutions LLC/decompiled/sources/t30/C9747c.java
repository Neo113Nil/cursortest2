package t30;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t30.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9747c implements Jb.e<Moshi> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t30.c$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C9747c f99057a = new C9747c();
    }

    @Override // Pc.a
    public final Object get() {
        Moshi moshi = new Moshi(new Moshi.a());
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
