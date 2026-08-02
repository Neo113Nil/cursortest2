package com.vk.im.chat.api;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import java.util.List;
import xsna.pwj0;
import xsna.pyb;
import xsna.rdi;

/* compiled from: ChatComponent.kt */
/* loaded from: classes.dex */
public interface ChatComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ChatComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ChatComponent STUB = new ChatComponent() { // from class: com.vk.im.chat.api.ChatComponent$Companion$STUB$1

            /* compiled from: ChatComponent.kt */
            public static final class a implements pyb {
                @Override // xsna.pyb
                public final void a(Context context, Long l, long j, String str, List list, List list2, String str2, String str3, String str4, ChatAnalyticsParamsNoLogging chatAnalyticsParamsNoLogging) {
                    rdi.E();
                }
            }

            @Override // com.vk.im.chat.api.ChatComponent
            public final pyb Cf() {
                return new a();
            }
        };

        public final ChatComponent getSTUB() {
            return STUB;
        }
    }

    pyb Cf();
}
