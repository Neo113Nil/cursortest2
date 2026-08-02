package ru.ozon.uni.atoms.generator;

import android.view.View;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzTrace;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/generator/GeneratorIdImpl;", "Lru/ozon/uni/atoms/generator/GeneratorId;", "parentPos", "", "container", "Ljava/lang/Class;", "<init>", "(ILjava/lang/Class;)V", "parent", "", "findParent", "", "generateId", "holder", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "position", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeneratorIdImpl implements GeneratorId {

    @NotNull
    private final Class<?> container;
    private String parent;
    private final int parentPos;

    public GeneratorIdImpl(int i11, @NotNull Class<?> container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.parentPos = i11;
        this.container = container;
    }

    @Override // ru.ozon.uni.atoms.generator.GeneratorId
    public void findParent() {
        OzTrace.beginTrace(null, new Pair[0]);
        if (this.parent == null) {
            String className = Thread.currentThread().getStackTrace()[this.parentPos].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            this.parent = (String) C7714v.X(h.m(className, new String[]{"."}, 0, 6));
        }
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    @Override // ru.ozon.uni.atoms.generator.GeneratorId
    @NotNull
    public String generateId(@NotNull Atom<AtomDTO, Atom.AtomConfiguration> holder, int position) {
        String automatizationId;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AtomDTO data = holder.getData();
        View containerView = holder.getContainerView();
        TestInfo testInfo = data.getTestInfo();
        if (testInfo != null && (automatizationId = testInfo.getAutomatizationId()) != null) {
            if (automatizationId.length() <= 0) {
                automatizationId = null;
            }
            if (automatizationId != null) {
                return automatizationId;
            }
        }
        return this.parent + "." + this.container.getSimpleName() + "." + containerView.getClass().getSimpleName() + "." + position;
    }
}
