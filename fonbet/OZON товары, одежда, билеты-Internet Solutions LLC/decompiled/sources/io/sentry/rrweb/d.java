package io.sentry.rrweb;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.util.p;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* renamed from: c, reason: collision with root package name */
    private b f68422c;

    /* loaded from: classes10.dex */
    public static final class a {
        public static boolean a(@NotNull d dVar, @NotNull String str, @NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            if (!str.equals("source")) {
                return false;
            }
            b bVar = (b) interfaceC7131c1.S(iLogger, new b.a());
            p.b(bVar, "");
            dVar.f68422c = bVar;
            return true;
        }
    }

    /* loaded from: classes10.dex */
    public enum b implements InterfaceC7220x0 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                return b.values()[interfaceC7131c1.nextInt()];
            }
        }

        @Override // io.sentry.InterfaceC7220x0
        public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            ((C7212v0) interfaceC7135d1).l(ordinal());
        }
    }

    /* loaded from: classes10.dex */
    public static final class c {
        public static void a(@NotNull d dVar, @NotNull C7212v0 c7212v0, @NotNull ILogger iLogger) throws IOException {
            c7212v0.g("source");
            c7212v0.m(iLogger, dVar.f68422c);
        }
    }

    public d(@NotNull b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f68422c = bVar;
    }
}
