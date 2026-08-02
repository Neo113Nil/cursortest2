package com.vk.movika.api;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.api.a;
import xsna.csm0;
import xsna.ecx;
import xsna.rcx;
import xsna.tcx;

/* compiled from: MovikaComponent.kt */
/* loaded from: classes3.dex */
public interface MovikaComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MovikaComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MovikaComponent STUB = new MovikaComponent() { // from class: com.vk.movika.api.MovikaComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: MovikaComponent.kt */
            public static final class a implements ecx {
                @Override // xsna.ecx
                public final rcx a(Context context, tcx tcxVar) {
                    return new csm0(context);
                }
            }

            @Override // com.vk.movika.api.MovikaComponent
            public final ecx U4() {
                return this.a;
            }

            @Override // com.vk.movika.api.MovikaComponent
            public final com.vk.movika.api.a pd() {
                return a.C1284a.a.getSTUB();
            }
        };

        public final MovikaComponent getSTUB() {
            return STUB;
        }
    }

    ecx U4();

    a pd();
}
