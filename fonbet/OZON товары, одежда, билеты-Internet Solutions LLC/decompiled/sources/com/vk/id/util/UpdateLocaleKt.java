package com.vk.id.util;

import Bl0.C2652m;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.id.VKID;
import com.vk.id.util.UpdateLocaleKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "", "content", "InternalVKIDWithUpdatedLocale", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UpdateLocaleKt {
    @SuppressLint({"AppBundleLocaleChanges"})
    public static final void InternalVKIDWithUpdatedLocale(@NotNull final Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(32716367);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(content) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            Locale locale = VKID.INSTANCE.getInstance().getInternalVKIDLocale().get();
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            if (createConfigurationContext != null) {
                u11.o(620052985);
                C3996z.a(AndroidCompositionLocals_androidKt.d().c(createConfigurationContext), c.c(-216471276, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.util.UpdateLocaleKt$InternalVKIDWithUpdatedLocale$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                        invoke(interfaceC3967k2, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(InterfaceC3967k interfaceC3967k2, int i13) {
                        if ((i13 & 3) == 2 && interfaceC3967k2.b()) {
                            interfaceC3967k2.j();
                        } else {
                            content.invoke(interfaceC3967k2, 0);
                        }
                    }
                }, u11), u11, 56);
                u11.k();
            } else {
                u11.o(620163500);
                content.invoke(u11, Integer.valueOf(i12 & 14));
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: Fa.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InternalVKIDWithUpdatedLocale$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    InternalVKIDWithUpdatedLocale$lambda$0 = UpdateLocaleKt.InternalVKIDWithUpdatedLocale$lambda$0(content, i11, (InterfaceC3967k) obj, intValue);
                    return InternalVKIDWithUpdatedLocale$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalVKIDWithUpdatedLocale$lambda$0(Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        InternalVKIDWithUpdatedLocale(function2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }
}
