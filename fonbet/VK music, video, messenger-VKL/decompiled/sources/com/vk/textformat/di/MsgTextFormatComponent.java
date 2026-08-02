package com.vk.textformat.di;

import com.vk.di.component.DiScopedComponent;
import xsna.p040;
import xsna.pwj0;
import xsna.r040;

/* compiled from: MsgTextFormatComponent.kt */
/* loaded from: classes11.dex */
public interface MsgTextFormatComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MsgTextFormatComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MsgTextFormatComponent STUB = new MsgTextFormatComponent() { // from class: com.vk.textformat.di.MsgTextFormatComponent$Companion$STUB$1
            public final p040 a = p040.a.a.getSTUB();
            public final r040 b = r040.a.a.getSTUB();

            @Override // com.vk.textformat.di.MsgTextFormatComponent
            public final r040 ed() {
                return this.b;
            }

            @Override // com.vk.textformat.di.MsgTextFormatComponent
            public final p040 t3() {
                return this.a;
            }
        };

        public final MsgTextFormatComponent getSTUB() {
            return STUB;
        }
    }

    r040 ed();

    p040 t3();
}
