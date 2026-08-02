package ru.ozon.app.android.initializers.fintech;

import Ib.a;
import O30.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO30/b;", "type", "", "invoke", "(LO30/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FintechLibActionInitializer$init$1 extends AbstractC7737t implements Function1<b, Unit> {
    final /* synthetic */ FintechLibActionInitializer this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.FINANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.RKO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FintechLibActionInitializer$init$1(FintechLibActionInitializer fintechLibActionInitializer) {
        super(1);
        this.this$0 = fintechLibActionInitializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b type) {
        a aVar;
        a aVar2;
        a aVar3;
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            aVar = this.this$0.fintechBankLib;
            aVar.get();
        } else if (i11 == 2) {
            aVar2 = this.this$0.fintechRkoLib;
            aVar2.get();
        } else if (i11 != 3) {
            Unit unit = Unit.f71690a;
        } else {
            aVar3 = this.this$0.fintechPayLib;
            aVar3.get();
        }
    }
}
