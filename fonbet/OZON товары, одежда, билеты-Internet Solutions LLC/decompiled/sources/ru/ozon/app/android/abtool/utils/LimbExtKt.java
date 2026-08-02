package ru.ozon.app.android.abtool.utils;

import Od0.a;
import Od0.c;
import Od0.e;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOd0/e$b;", "LOd0/c;", "toOzonLimbDeeplink", "(LOd0/e$b;)LOd0/c;", "LOd0/a;", "LOd0/e$a;", "toLegacyResult", "(LOd0/a;)LOd0/e$a;", "abzone_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LimbExtKt {
    @NotNull
    public static final e.a toLegacyResult(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof a.C0408a) {
            return new e.a.C0409a();
        }
        if (!(aVar instanceof a.b)) {
            return new e.a.c();
        }
        a.b bVar = (a.b) aVar;
        return new e.a.b(bVar.a(), bVar.b());
    }

    public static final c toOzonLimbDeeplink(@NotNull e.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof e.b.C0410b) {
            Uri uri = ((e.b.C0410b) bVar).b();
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new c.b(uri);
        }
        if (!(bVar instanceof e.b.a)) {
            return null;
        }
        Intent intent = ((e.b.a) bVar).b();
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new c.a(intent);
    }
}
