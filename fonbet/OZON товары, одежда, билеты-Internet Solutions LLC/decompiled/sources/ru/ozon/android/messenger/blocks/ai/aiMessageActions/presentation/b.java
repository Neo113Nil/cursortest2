package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import android.view.View;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.AiMessageActionsRootKt$AiMessageActionsRoot$2$1", f = "AiMessageActionsRoot.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83980d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f83981e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f83982f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f83983a;

        a(View view) {
            this.f83983a = view;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            if (!(((h.b) obj) instanceof h.b.a)) {
                throw new o();
            }
            HapticVibrator.INSTANCE.vibrate(this.f83983a, HapticToken.MEDIUM);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(h hVar, View view, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f83981e = hVar;
        this.f83982f = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f83981e, this.f83982f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83980d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<h.b> effects = this.f83981e.getEffects();
            a aVar2 = new a(this.f83982f);
            this.f83980d = 1;
            if (effects.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
