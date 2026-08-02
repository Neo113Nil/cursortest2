package com.vk.confirmaccount.api.di;

import android.content.Context;
import android.content.Intent;
import com.vk.di.component.DiUnscopedComponent;
import java.util.List;
import xsna.a3j;
import xsna.y2j;

/* compiled from: ConfirmAccountComponent.kt */
/* loaded from: classes.dex */
public interface ConfirmAccountComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: ConfirmAccountComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final ConfirmAccountComponent getSTUB() {
            return new ConfirmAccountComponent() { // from class: com.vk.confirmaccount.api.di.ConfirmAccountComponent$Companion$STUB$1
                @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
                public final y2j d2() {
                    return new y2j();
                }

                @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
                public final a3j le() {
                    return new a3j();
                }

                @Override // com.vk.confirmaccount.api.di.ConfirmAccountComponent
                public final Intent m9(Context context, String str, List<String> list) {
                    return new Intent();
                }
            };
        }
    }

    y2j d2();

    a3j le();

    Intent m9(Context context, String str, List<String> list);
}
