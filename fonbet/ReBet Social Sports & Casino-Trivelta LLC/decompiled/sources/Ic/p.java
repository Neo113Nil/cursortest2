package Ic;

import Ic.AbstractC1350d;
import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends AbstractC1350d {

    public static final class a extends AbstractC1350d.c {

        /* renamed from: b, reason: collision with root package name */
        public final Class f5634b = p.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5635c = "ManualGestureHandler";

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5635c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5634b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p a(Context context) {
            return new p();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.e c(p handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.e(handler);
        }
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (S() == 0) {
            p();
        }
    }
}
