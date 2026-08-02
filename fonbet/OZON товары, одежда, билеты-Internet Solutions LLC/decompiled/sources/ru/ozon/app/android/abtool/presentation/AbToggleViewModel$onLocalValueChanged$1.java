package ru.ozon.app.android.abtool.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.presentation.features.recycler.FeatureItem;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$onLocalValueChanged$1", f = "AbToggleViewModel.kt", l = {94, 95}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToggleViewModel$onLocalValueChanged$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FeatureItem $featureItem;
    final /* synthetic */ boolean $newValue;
    int label;
    final /* synthetic */ AbToggleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleViewModel$onLocalValueChanged$1(boolean z11, FeatureItem featureItem, AbToggleViewModel abToggleViewModel, d<? super AbToggleViewModel$onLocalValueChanged$1> dVar) {
        super(2, dVar);
        this.$newValue = z11;
        this.$featureItem = featureItem;
        this.this$0 = abToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbToggleViewModel$onLocalValueChanged$1(this.$newValue, this.$featureItem, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r1.updateLocalValue$abzone_release(r4, r7, r5, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbToolImpl abToolImpl;
        AbToolNamespace abToolNamespace;
        Object requestFeaturesList;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            String valueOf = String.valueOf(this.$newValue);
            this.$featureItem.setLocalValue(valueOf);
            abToolImpl = this.this$0.abTool;
            String title = this.$featureItem.getTitle();
            abToolNamespace = this.this$0.namespace;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        AbToggleViewModel abToggleViewModel = this.this$0;
        String str = (String) abToggleViewModel.queryListener.getValue();
        this.label = 2;
        requestFeaturesList = abToggleViewModel.requestFeaturesList(str, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbToggleViewModel$onLocalValueChanged$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
