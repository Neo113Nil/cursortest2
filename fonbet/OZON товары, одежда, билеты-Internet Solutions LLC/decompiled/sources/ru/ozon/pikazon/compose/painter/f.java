package ru.ozon.pikazon.compose.painter;

import B1.InterfaceC2547p;
import S0.D;
import S0.InterfaceC3967k;
import S0.Q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5239d1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7829k0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r1.C9156d;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.request.PikazonRequest;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import ru.ozon.app.android.pikazon.util.TestUtilKt;
import xe.M;

/* loaded from: classes7.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final PikazonImagePainter a(@NotNull Comparable model, InterfaceC2547p contentScale, Function1 function1, Function1 builder, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(model, "model");
        interfaceC3967k.o(1012480518);
        if ((i12 & 2) != 0) {
            contentScale = InterfaceC2547p.a.d();
        }
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(738973395);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = e.f97678b;
                interfaceC3967k.x(C11);
            }
            builder = (Function1) C11;
            interfaceC3967k.k();
        }
        if (((Boolean) interfaceC3967k.m(C5239d1.a())).booleanValue() && !Pikazon.INSTANCE.isInitialized()) {
            TestUtilKt.bindPikazonTest$default(0, null, null, 7, null);
        }
        if (model instanceof PikazonRequest) {
            b("PikazonRequest", "Use `builder` to modify");
            throw null;
        }
        if (model instanceof PikazonRequestBuilder) {
            b("PikazonRequestBuilder", "Use `builder` to modify");
            throw null;
        }
        if (model instanceof InterfaceC7829k0) {
            b("ImageBitmap", "Use compose.Image to display this type");
            throw null;
        }
        if (model instanceof C9156d) {
            b("ImageVector", "Use compose.Image to display this type");
            throw null;
        }
        if (model instanceof AbstractC8972b) {
            b("Painter", "Use compose.Image to display this type");
            throw null;
        }
        int i13 = ((i11 >> 3) & 896) | (i11 & 126);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(builder, "builder");
        interfaceC3967k.o(-1418789238);
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        interfaceC3967k.o(1017483201);
        boolean n11 = interfaceC3967k.n(context) | interfaceC3967k.n(model) | ((((i13 & 896) ^ 384) > 256 && interfaceC3967k.n(builder)) || (i13 & 384) == 256);
        Object C12 = interfaceC3967k.C();
        if (n11 || C12 == InterfaceC3967k.a.a()) {
            PikazonRequestBuilder source = new PikazonRequestBuilder(context, Drawable.class).source(model);
            builder.invoke(source);
            if (Intrinsics.d(contentScale, InterfaceC2547p.a.a())) {
                source = source.optionalCenterCrop();
            } else if (Intrinsics.d(contentScale, InterfaceC2547p.a.e()) || Intrinsics.d(contentScale, InterfaceC2547p.a.d())) {
                source = source.optionalCenterInside();
            }
            C12 = source.build();
            interfaceC3967k.x(C12);
        }
        PikazonRequest pikazonRequest = (PikazonRequest) C12;
        interfaceC3967k.k();
        interfaceC3967k.k();
        if (pikazonRequest.getTarget() != null) {
            throw new IllegalArgumentException("request.target must be null");
        }
        Context context2 = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        interfaceC3967k.o(738986764);
        boolean n12 = interfaceC3967k.n(context2);
        Object C13 = interfaceC3967k.C();
        if (n12 || C13 == InterfaceC3967k.a.a()) {
            C13 = new PikazonImagePainter(context2, pikazonRequest);
            interfaceC3967k.x(C13);
        }
        PikazonImagePainter pikazonImagePainter = (PikazonImagePainter) C13;
        interfaceC3967k.k();
        Object C14 = interfaceC3967k.C();
        if (C14 == InterfaceC3967k.a.a()) {
            Object d11 = new D(Q.j(kotlin.coroutines.g.f71771a, interfaceC3967k));
            interfaceC3967k.x(d11);
            C14 = d11;
        }
        M a11 = ((D) C14).a();
        pikazonImagePainter.getClass();
        Intrinsics.checkNotNullParameter(a11, "<set-?>");
        pikazonImagePainter.f97647l = a11;
        pikazonImagePainter.l(function1);
        pikazonImagePainter.k(contentScale);
        pikazonImagePainter.m(pikazonRequest);
        interfaceC3967k.k();
        return pikazonImagePainter;
    }

    private static final void b(String str, String str2) {
        throw new IllegalArgumentException(Sh.b.c("Unsupported type: ", str, ". ", str2));
    }
}
