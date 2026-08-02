package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di;

import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserViewModel;
import ru.ozon.app.android.travel.utils.lifecycle.LifecycleUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/z0$b;", "invoke", "()Landroidx/lifecycle/z0$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class IconChooserComponent$viewModelFactory$2 extends AbstractC7737t implements Function0<z0.b> {
    final /* synthetic */ IconChooserComponent this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di.IconChooserComponent$viewModelFactory$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<IconChooserViewModel> {
        final /* synthetic */ IconChooserComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IconChooserComponent iconChooserComponent) {
            super(0);
            this.this$0 = iconChooserComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IconChooserViewModel invoke() {
            return new IconChooserViewModel(this.this$0.getTravelStorageManagerHolder());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconChooserComponent$viewModelFactory$2(IconChooserComponent iconChooserComponent) {
        super(0);
        this.this$0 = iconChooserComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final z0.b invoke() {
        return LifecycleUtilsKt.genericViewModelFactory(new AnonymousClass1(this.this$0));
    }
}
