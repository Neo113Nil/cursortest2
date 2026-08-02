package io.sentry.rrweb;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.w;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* renamed from: c, reason: collision with root package name */
    public b f52643c;

    public static final class a {
        public boolean a(d dVar, String str, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f52643c = (b) w.c((b) interfaceC4809q1.x0(iLogger, new b.a()), "");
            return true;
        }
    }

    public enum b implements G0 {
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

        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                return b.values()[interfaceC4809q1.nextInt()];
            }
        }

        @Override // io.sentry.G0
        public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
            interfaceC4813r1.a(ordinal());
        }
    }

    public static final class c {
        public void a(d dVar, InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
            interfaceC4813r1.d("source").j(iLogger, dVar.f52643c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f52643c = bVar;
    }
}
