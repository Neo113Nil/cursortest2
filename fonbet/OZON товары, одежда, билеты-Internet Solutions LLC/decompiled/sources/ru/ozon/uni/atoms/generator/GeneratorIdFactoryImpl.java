package ru.ozon.uni.atoms.generator;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.v3.containers.RecyclerContainer;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/generator/GeneratorIdFactoryImpl;", "Lru/ozon/uni/atoms/generator/GeneratorIdFactory;", "isAutoTestUser", "", "<init>", "(Z)V", "()Z", "setAutoTestUser", "create", "Lru/ozon/uni/atoms/generator/GeneratorId;", "viewGroup", "Landroid/view/ViewGroup;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GeneratorIdFactoryImpl implements GeneratorIdFactory {
    private boolean isAutoTestUser;
    public static final int $stable = 8;

    public GeneratorIdFactoryImpl(boolean z11) {
        this.isAutoTestUser = z11;
    }

    @Override // ru.ozon.uni.atoms.generator.GeneratorIdFactory
    @NotNull
    public GeneratorId create(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (getIsAutoTestUser()) {
            return new GeneratorIdImpl(((viewGroup instanceof SingleAtom) || (viewGroup instanceof RecyclerContainer)) ? 5 : 4, viewGroup.getClass());
        }
        return new GeneratorIdStub();
    }

    /* renamed from: isAutoTestUser, reason: from getter */
    public boolean getIsAutoTestUser() {
        return this.isAutoTestUser;
    }

    @Override // ru.ozon.uni.atoms.generator.GeneratorIdFactory
    public void setAutoTestUser(boolean z11) {
        this.isAutoTestUser = z11;
    }
}
