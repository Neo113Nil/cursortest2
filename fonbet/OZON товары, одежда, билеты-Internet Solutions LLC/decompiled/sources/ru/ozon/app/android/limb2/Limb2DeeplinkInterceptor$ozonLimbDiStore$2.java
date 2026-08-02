package ru.ozon.app.android.limb2;

import Ld0.c;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.limb.Limb2ComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LLd0/c;", "invoke", "()LLd0/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class Limb2DeeplinkInterceptor$ozonLimbDiStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ Limb2DeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Limb2DeeplinkInterceptor$ozonLimbDiStore$2(Limb2DeeplinkInterceptor limb2DeeplinkInterceptor) {
        super(0);
        this.this$0 = limb2DeeplinkInterceptor;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        Context context;
        context = this.this$0.context;
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, Limb2ComponentApi.class).getDependencyStorage();
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return ((Limb2ComponentApi) dependencyStorage.b(Limb2ComponentApi.class)).getOzonLimbDiStore();
    }
}
