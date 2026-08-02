package ru.ozon.app.android.videomoleculecompose;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import S0.n1;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomoleculecompose.interaction.VideoMoleculeInteractionState;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.videomoleculecompose.VideoMoleculeKt$VideoMoleculeEffects$2$1", f = "VideoMolecule.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoMoleculeKt$VideoMoleculeEffects$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ VideoMoleculeInteractionState $interactionState;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.videomoleculecompose.VideoMoleculeKt$VideoMoleculeEffects$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ VideoMoleculeInteractionState $interactionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VideoMoleculeInteractionState videoMoleculeInteractionState) {
            super(0);
            this.$interactionState = videoMoleculeInteractionState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$interactionState.isScrubbing());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isScrubbing", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.videomoleculecompose.VideoMoleculeKt$VideoMoleculeEffects$2$1$2", f = "VideoMolecule.kt", l = {241}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.videomoleculecompose.VideoMoleculeKt$VideoMoleculeEffects$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        final /* synthetic */ VideoMoleculeInteractionState $interactionState;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(VideoMoleculeInteractionState videoMoleculeInteractionState, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$interactionState = videoMoleculeInteractionState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$interactionState, dVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                if (this.Z$0) {
                    this.label = 1;
                    if (Y.b(50L, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.$interactionState.showScrubbingOverlay$videomoleculecompose_prodGoogleAllVendorsRelease();
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeKt$VideoMoleculeEffects$2$1(VideoMoleculeInteractionState videoMoleculeInteractionState, d<? super VideoMoleculeKt$VideoMoleculeEffects$2$1> dVar) {
        super(2, dVar);
        this.$interactionState = videoMoleculeInteractionState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoMoleculeKt$VideoMoleculeEffects$2$1(this.$interactionState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h m11 = n1.m(new AnonymousClass1(this.$interactionState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$interactionState, null);
            this.label = 1;
            if (C2399j.h(m11, anonymousClass2, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoMoleculeKt$VideoMoleculeEffects$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
