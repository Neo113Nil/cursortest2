package ru.ozon.app.android.atoms.af.layout;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.R$styleable;
import ru.ozon.app.android.atoms.af.extensions.AttrsExtensionKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.FrameAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.DecorateHelper;
import ru.ozon.uni.atoms.af.layout.DefaultAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/af/layout/FrameAtomsLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initAttrs", "(Landroid/util/AttributeSet;I)V", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "newAtoms", "onAdapterChanged", "(Ljava/util/List;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "getAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "setAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "decorator", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "getDecorator", "()Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "setDecorator", "(Lru/ozon/uni/atoms/af/FrameAtomsDecorator;)V", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "defaultGravity", "I", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FrameAtomsLayout extends FrameLayout {
    private AtomsAdapter adapter;

    @NotNull
    private final DecorateHelper decorateHelper;

    @NotNull
    private FrameAtomsDecorator decorator;
    private int defaultGravity;

    @NotNull
    private final GeneratorId generator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameAtomsLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initAttrs(AttributeSet attrs, int defStyleAttr) {
        if (attrs != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int[] FrameAtomsLayout = R$styleable.FrameAtomsLayout;
            Intrinsics.checkNotNullExpressionValue(FrameAtomsLayout, "FrameAtomsLayout");
            AttrsExtensionKt.obtain(attrs, context, FrameAtomsLayout, defStyleAttr, new FrameAtomsLayout$initAttrs$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> newAtoms) {
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
            FrameLayout.LayoutParams layoutParams = atom instanceof WrappedAtomHolder ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(-1, -2);
            View containerView = atom.getContainerView();
            atom.setTestId(this.generator.generateId(atom, i11));
            FrameAtomsDecorator frameAtomsDecorator = this.decorator;
            layoutParams.gravity = this.defaultGravity;
            Unit unit = Unit.f71690a;
            FrameLayout.LayoutParams modifyFrameLayoutParams = frameAtomsDecorator.modifyFrameLayoutParams(layoutParams, atom.getData(), i11, z11);
            atom.onLayoutParamsChanged(modifyFrameLayoutParams);
            addView(containerView, modifyFrameLayoutParams);
            i11 = i12;
        }
        this.decorateHelper.unLockDecoration();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.decorateHelper.decorate(this, canvas, this.decorator);
    }

    public final void setAdapter(AtomsAdapter atomsAdapter) {
        if (Intrinsics.d(this.adapter, atomsAdapter)) {
            return;
        }
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 != null) {
            atomsAdapter2.removeObserver(new FrameAtomsLayout$adapter$1(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.addObserver(new FrameAtomsLayout$adapter$2(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(this.generator);
        }
        this.adapter = atomsAdapter;
    }

    public final void setDecorator(@NotNull FrameAtomsDecorator frameAtomsDecorator) {
        Intrinsics.checkNotNullParameter(frameAtomsDecorator, "<set-?>");
        this.decorator = frameAtomsDecorator;
    }

    public /* synthetic */ FrameAtomsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameAtomsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.decorator = new DefaultAtomDecorator(context);
        this.decorateHelper = new DecorateHelper(context);
        this.generator = BxAtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        setWillNotDraw(false);
        initAttrs(attributeSet, i11);
    }
}
