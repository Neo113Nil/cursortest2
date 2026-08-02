package ru.ozon.app.android.ui.session.biometry;

import Fb0.a;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ui.session.biometry.BiometricAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModelImpl$onBiometryAuthAccepted$1", f = "BiometricAuthViewModelImpl.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BiometricAuthViewModelImpl$onBiometryAuthAccepted$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $analyticTag;
    final /* synthetic */ String $deeplink;
    int label;
    final /* synthetic */ BiometricAuthViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricAuthViewModelImpl$onBiometryAuthAccepted$1(BiometricAuthViewModelImpl biometricAuthViewModelImpl, String str, String str2, d<? super BiometricAuthViewModelImpl$onBiometryAuthAccepted$1> dVar) {
        super(2, dVar);
        this.this$0 = biometricAuthViewModelImpl;
        this.$analyticTag = str;
        this.$deeplink = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BiometricAuthViewModelImpl$onBiometryAuthAccepted$1(this.this$0, this.$analyticTag, this.$deeplink, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.biometryAuth;
            String str = this.$analyticTag;
            this.label = 1;
            if (aVar.a(true, str, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getBiometricActions().postValue(new BiometricAction.CompleteAction(this.$deeplink));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BiometricAuthViewModelImpl$onBiometryAuthAccepted$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
