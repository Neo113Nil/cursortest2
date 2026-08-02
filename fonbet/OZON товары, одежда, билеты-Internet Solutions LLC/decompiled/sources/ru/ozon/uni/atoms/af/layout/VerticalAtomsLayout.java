package ru.ozon.uni.atoms.af.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.atoms.utils.OzTrace;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J0\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-H\u0014J\"\u0010.\u001a\u00020!2\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030100H\u0002R\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00000\f0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00064"}, d2 = {"Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tag", "", "Lkotlin/Pair;", "", "[Lkotlin/Pair;", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "generatorId", "Lru/ozon/uni/atoms/generator/GeneratorId;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "getAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "setAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "decorator", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "getDecorator", "()Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "setDecorator", "(Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onAdapterChanged", "newAtoms", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalAtomsLayout extends LinearLayout {
    public static final int $stable = 8;
    private AtomsAdapter adapter;

    @NotNull
    private final DecorateHelper decorateHelper;

    @NotNull
    private VerticalAtomsDecorator decorator;

    @NotNull
    private final GeneratorId generatorId;

    @NotNull
    private final Pair<String, VerticalAtomsLayout>[] tag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalAtomsLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> newAtoms) {
        Pair<String, VerticalAtomsLayout>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        this.decorateHelper.lockDecoration();
        removeAllViews();
        int size = newAtoms.size() - 1;
        int i11 = 0;
        for (Object obj : newAtoms) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Atom<AtomDTO, Atom.AtomConfiguration> atom = (Atom) obj;
            boolean z11 = i11 == size;
            AtomDTO data = atom.getData();
            LinearLayout.LayoutParams layoutParams = atom instanceof WrappedAtomHolder ? new LinearLayout.LayoutParams(-2, -2) : new LinearLayout.LayoutParams(-1, -2);
            View containerView = atom.getContainerView();
            atom.setTestId(this.generatorId.generateId(atom, i11));
            LinearLayout.LayoutParams modifyVerticalLayoutParams = this.decorator.modifyVerticalLayoutParams((LinearLayout.LayoutParams) this.decorateHelper.processLp(data, layoutParams), data, i11, z11);
            atom.onLayoutParamsChanged(modifyVerticalLayoutParams);
            Unit unit = Unit.f71690a;
            addView(containerView, modifyVerticalLayoutParams);
            i11 = i12;
        }
        this.decorateHelper.unLockDecoration();
        Unit unit2 = Unit.f71690a;
        OzTrace.endTrace();
    }

    public final AtomsAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final VerticalAtomsDecorator getDecorator() {
        return this.decorator;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.decorateHelper.decorate(this, canvas, this.decorator);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        Pair<String, VerticalAtomsLayout>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        super.onLayout(changed, l11, t2, r11, b11);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<String, VerticalAtomsLayout>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    public final void setAdapter(AtomsAdapter atomsAdapter) {
        if (Intrinsics.d(this.adapter, atomsAdapter)) {
            return;
        }
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 != null) {
            atomsAdapter2.removeObserver(new VerticalAtomsLayout$adapter$1(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.addObserver(new VerticalAtomsLayout$adapter$2(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(this.generatorId);
        }
        this.adapter = atomsAdapter;
    }

    public final void setDecorator(@NotNull VerticalAtomsDecorator verticalAtomsDecorator) {
        Intrinsics.checkNotNullParameter(verticalAtomsDecorator, "<set-?>");
        this.decorator = verticalAtomsDecorator;
    }

    public /* synthetic */ VerticalAtomsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalAtomsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = new Pair[]{new Pair("layout", this)};
        this.decorateHelper = new DecorateHelper(context);
        this.generatorId = AtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.decorator = new DefaultAtomDecorator(context);
        setOrientation(1);
        setWillNotDraw(false);
    }
}
