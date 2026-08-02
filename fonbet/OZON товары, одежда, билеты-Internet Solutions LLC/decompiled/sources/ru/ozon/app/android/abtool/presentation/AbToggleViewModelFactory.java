package ru.ozon.app.android.abtool.presentation;

import He.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.mapper.ExperimentMapper;
import ru.ozon.app.android.abtool.di.DiStoreWrapper;
import xe.C10720e0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToggleViewModelFactory;", "Landroidx/lifecycle/z0$c;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "<init>", "(Lru/ozon/app/android/abtool/AbToolNamespace;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleViewModelFactory extends z0.c {

    @NotNull
    private final AbToolNamespace namespace;

    public AbToggleViewModelFactory(@NotNull AbToolNamespace namespace) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        this.namespace = namespace;
    }

    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbToolImpl abToolImpl = (AbToolImpl) DiStoreWrapper.INSTANCE.getStore().e(AbToolBaseApi.class);
        AbToolNamespace abToolNamespace = this.namespace;
        ExperimentMapper experimentMapper = new ExperimentMapper();
        C10720e0 c10720e0 = C10720e0.f105451a;
        return new AbToggleViewModel(abToolImpl, abToolNamespace, experimentMapper, b.f10879b);
    }
}
