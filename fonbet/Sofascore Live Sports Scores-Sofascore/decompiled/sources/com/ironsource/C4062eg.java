package com.ironsource;

import android.os.Handler;
import defpackage.bnk;
import defpackage.iy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.eg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4062eg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Handler handler, Function0 function0) {
        handler.getClass();
        function0.getClass();
        handler.post(new iy(9, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    @NotNull
    public static final InterfaceC4044dg a(@NotNull Handler handler) {
        handler.getClass();
        return new bnk(handler, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0) {
        function0.getClass();
        function0.invoke();
    }

    @NotNull
    public static final InterfaceC4044dg a(@NotNull com.ironsource.environment.thread.b bVar) {
        bVar.getClass();
        return new bnk(bVar, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.environment.thread.b bVar, Function0 function0) {
        bVar.getClass();
        function0.getClass();
        bVar.a(new iy(8, function0));
    }
}
