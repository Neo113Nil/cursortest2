package ru.ozon.android.inAppUpdate.internal.ui;

import Sc.o;
import ej.InterfaceC6374c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.inAppUpdate.internal.ui.g;

/* loaded from: classes10.dex */
public final class h {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83913a;

        static {
            int[] iArr = new int[InterfaceC6374c.InterfaceC0981c.a.values().length];
            try {
                iArr[InterfaceC6374c.InterfaceC0981c.a.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC6374c.InterfaceC0981c.a.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83913a = iArr;
        }
    }

    @NotNull
    public static final g a(@NotNull InterfaceC6374c interfaceC6374c, @NotNull e screenType, @NotNull InterfaceC6374c.InterfaceC0981c.a store) {
        g.c cVar;
        Intrinsics.checkNotNullParameter(interfaceC6374c, "<this>");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(store, "store");
        String apkName = interfaceC6374c.getApkName();
        interfaceC6374c.getUiData();
        interfaceC6374c.getUiData();
        interfaceC6374c.getUiData();
        interfaceC6374c.getUiData();
        g.d dVar = new g.d("Ozon", null, null, null);
        int i11 = a.f83913a[store.ordinal()];
        if (i11 == 1) {
            cVar = g.c.GOOGLE_PLAY_STORE;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            cVar = g.c.OTHER_STORE;
        }
        return new g(screenType, apkName, dVar, cVar);
    }
}
