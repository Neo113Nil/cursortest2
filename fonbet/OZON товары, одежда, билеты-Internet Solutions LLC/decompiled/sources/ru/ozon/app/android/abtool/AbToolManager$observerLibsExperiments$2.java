package ru.ozon.app.android.abtool;

import androidx.lifecycle.P;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/abtool/AbToolManager$observerLibsExperiments$2$1", "invoke", "()Lru/ozon/app/android/abtool/AbToolManager$observerLibsExperiments$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbToolManager$observerLibsExperiments$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ Function1<String, Unit> $onLibsAbVariantsChanged;
    final /* synthetic */ AbToolManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AbToolManager$observerLibsExperiments$2(Function1<? super String, Unit> function1, AbToolManager abToolManager) {
        super(0);
        this.$onLibsAbVariantsChanged = function1;
        this.this$0 = abToolManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.abtool.AbToolManager$observerLibsExperiments$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final Function1<String, Unit> function1 = this.$onLibsAbVariantsChanged;
        final AbToolManager abToolManager = this.this$0;
        return new W<String>() { // from class: ru.ozon.app.android.abtool.AbToolManager$observerLibsExperiments$2.1
            @Override // androidx.lifecycle.W
            public void onChanged(String value) {
                P experimentsLibsLiveData;
                if (value != null) {
                    function1.invoke(value);
                    experimentsLibsLiveData = abToolManager.getExperimentsLibsLiveData();
                    experimentsLibsLiveData.removeObserver(this);
                }
            }
        };
    }
}
