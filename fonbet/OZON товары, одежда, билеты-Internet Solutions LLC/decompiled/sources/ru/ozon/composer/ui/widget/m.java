package ru.ozon.composer.ui.widget;

import A00.a;
import f10.AbstractC6400a;
import h20.C6787b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class m implements AbstractC6400a.InterfaceC0987a<l> {

    /* renamed from: a, reason: collision with root package name */
    private final L00.i f94886a;

    /* renamed from: b, reason: collision with root package name */
    private final C6787b f94887b;

    /* renamed from: c, reason: collision with root package name */
    private final X10.f f94888c;

    public m(L00.i iVar, C6787b c6787b, X10.f fVar) {
        this.f94886a = iVar;
        this.f94887b = c6787b;
        this.f94888c = fVar;
    }

    public final void a(@NotNull ArrayList viewItems) {
        L00.i iVar;
        A00.a aVar;
        Intrinsics.checkNotNullParameter(viewItems, "viewItems");
        C6787b c6787b = this.f94887b;
        if (c6787b == null || (iVar = this.f94886a) == null || (aVar = (A00.a) iVar.b()) == null) {
            return;
        }
        if ((aVar instanceof a.u.b) || (aVar instanceof a.u.c)) {
            c6787b.a(viewItems);
        }
    }

    public final void b(@NotNull ArrayList widgetViewItems) {
        Intrinsics.checkNotNullParameter(widgetViewItems, "widgetViewItems");
        Intrinsics.checkNotNullParameter(widgetViewItems, "widgetViewItems");
        X10.f fVar = this.f94888c;
        if (fVar != null) {
            fVar.b(widgetViewItems);
        }
    }
}
