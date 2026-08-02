package ru.ozon.uni.atoms.af.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.google.android.flexbox.FlexboxLayout;
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
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.atoms.utils.OzTrace;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00000%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R.\u00101\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00108\u001a\u0002072\u0006\u00100\u001a\u0002078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "Lcom/google/android/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "applyDecorator", "()V", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "newAtoms", "onAdapterChanged", "(Ljava/util/List;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "Lkotlin/Pair;", "", "tag", "[Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generatorId", "Lru/ozon/uni/atoms/generator/GeneratorId;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "getAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "setAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "decorator", "Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "getDecorator", "()Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;", "setDecorator", "(Lru/ozon/uni/atoms/af/HorizontalFlexAtomsDecorator;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalFlexAtomsLayout extends FlexboxLayout {
    public static final int $stable = 8;
    private AtomsAdapter adapter;

    @NotNull
    private final DecorateHelper decorateHelper;

    @NotNull
    private HorizontalFlexAtomsDecorator decorator;

    @NotNull
    private final GeneratorId generatorId;

    @NotNull
    private final Pair<String, HorizontalFlexAtomsLayout>[] tag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalFlexAtomsLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyDecorator() {
        setJustifyContent(this.decorator.justifyContent());
        setShowDividerHorizontal(this.decorator.showDividerHorizontal());
        setShowDividerVertical(this.decorator.showDividerVertical());
        setDividerDrawable(a.getDrawable(getContext(), this.decorator.horizontalDividerDrawable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> newAtoms) {
        Pair<String, HorizontalFlexAtomsLayout>[] pairArr = this.tag;
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
            View containerView = atom.getContainerView();
            atom.setTestId(this.generatorId.generateId(atom, i11));
            FlexboxLayout.a modifyVerticalLayoutParams = this.decorator.modifyVerticalLayoutParams(new FlexboxLayout.a(-2, -2), atom.getData(), i11, z11);
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

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.decorateHelper.decorate(this, canvas, this.decorator);
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Pair<String, HorizontalFlexAtomsLayout>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        super.onLayout(changed, left, top, right, bottom);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<String, HorizontalFlexAtomsLayout>[] pairArr = this.tag;
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
            atomsAdapter2.removeObserver(new HorizontalFlexAtomsLayout$adapter$1(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.addObserver(new HorizontalFlexAtomsLayout$adapter$2(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(this.generatorId);
        }
        this.adapter = atomsAdapter;
    }

    public final void setDecorator(@NotNull HorizontalFlexAtomsDecorator value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.decorator = value;
        applyDecorator();
    }

    public /* synthetic */ HorizontalFlexAtomsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFlexAtomsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = new Pair[]{new Pair("layout", this)};
        this.decorateHelper = new DecorateHelper(context);
        this.generatorId = AtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.decorator = new DefaultAtomDecorator(context);
        setFlexDirection(0);
        setFlexWrap(1);
        applyDecorator();
        setWillNotDraw(false);
    }
}
