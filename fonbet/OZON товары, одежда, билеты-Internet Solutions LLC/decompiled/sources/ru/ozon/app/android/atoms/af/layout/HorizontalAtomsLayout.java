package ru.ozon.app.android.atoms.af.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.logger.trace.OzTrace;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.DecorateHelper;
import ru.ozon.uni.atoms.af.layout.DefaultAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!R&\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00000#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R.\u0010/\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "newAtoms", "", "onAdapterChanged", "(Ljava/util/List;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "Lkotlin/Pair;", "", "tag", "[Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "getAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "setAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "decorator", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "getDecorator", "()Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "setDecorator", "(Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HorizontalAtomsLayout extends LinearLayout {
    private AtomsAdapter adapter;

    @NotNull
    private final DecorateHelper decorateHelper;

    @NotNull
    private HorizontalAtomsDecorator decorator;

    @NotNull
    private final GeneratorId generator;

    @NotNull
    private final Pair<String, HorizontalAtomsLayout>[] tag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalAtomsLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> newAtoms) {
        Pair<String, HorizontalAtomsLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
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
            atom.setTestId(this.generator.generateId(atom, i11));
            LinearLayout.LayoutParams modifyHorizontalLayoutParams = this.decorator.modifyHorizontalLayoutParams(new LinearLayout.LayoutParams(-2, -2), atom.getData(), i11, z11);
            atom.onLayoutParamsChanged(modifyHorizontalLayoutParams);
            Unit unit = Unit.f71690a;
            addView(containerView, modifyHorizontalLayoutParams);
            i11 = i12;
        }
        this.decorateHelper.unLockDecoration();
        Unit unit2 = Unit.f71690a;
        OzTrace ozTrace2 = OzTrace.INSTANCE;
    }

    public final AtomsAdapter getAdapter() {
        return this.adapter;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.decorateHelper.decorate(this, canvas, this.decorator);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        Pair<String, HorizontalAtomsLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
        super.onLayout(changed, l11, t2, r11, b11);
        Unit unit = Unit.f71690a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<String, HorizontalAtomsLayout>[] pairArr = this.tag;
        OzTrace ozTrace = OzTrace.INSTANCE;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Unit unit = Unit.f71690a;
    }

    public final void setAdapter(AtomsAdapter atomsAdapter) {
        if (Intrinsics.d(this.adapter, atomsAdapter)) {
            return;
        }
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 != null) {
            atomsAdapter2.removeObserver(new HorizontalAtomsLayout$adapter$1(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.addObserver(new HorizontalAtomsLayout$adapter$2(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(this.generator);
        }
        this.adapter = atomsAdapter;
    }

    public final void setDecorator(@NotNull HorizontalAtomsDecorator horizontalAtomsDecorator) {
        Intrinsics.checkNotNullParameter(horizontalAtomsDecorator, "<set-?>");
        this.decorator = horizontalAtomsDecorator;
    }

    public /* synthetic */ HorizontalAtomsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAtomsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = new Pair[]{new Pair("layout", this)};
        this.decorateHelper = new DecorateHelper(context);
        this.generator = BxAtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.decorator = new DefaultAtomDecorator(context);
        setOrientation(0);
        setWillNotDraw(false);
    }
}
