package ru.ozon.uni.atoms.v3.containers;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.FrameAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.DecorateHelper;
import ru.ozon.uni.atoms.af.layout.DefaultAtomDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.atoms.utils.OzTrace;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u00020\u000f2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f\u0018\u00010#¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\f2\b\b\u0002\u00103\u001a\u00020\u001b¢\u0006\u0004\b4\u00105R&\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "holder", "", "onAdapterChanged", "(Lru/ozon/uni/atoms/af/Atom;)V", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "(Lru/ozon/uni/atoms/af/Atom;)Landroid/widget/FrameLayout$LayoutParams;", "clearLayout", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "onRecycle", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generatorId", "setGenerator$uni_release", "(Lru/ozon/uni/atoms/generator/GeneratorId;)V", "setGenerator", "Lru/ozon/uni/atoms/AtomsFactory;", "factory", "setAtomsFactory", "(Lru/ozon/uni/atoms/AtomsFactory;)V", "dto", "forceChange", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;Z)V", "", "Lkotlin/Pair;", "", "tag", "[Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "decorator", "Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "getDecorator", "()Lru/ozon/uni/atoms/af/FrameAtomsDecorator;", "setDecorator", "(Lru/ozon/uni/atoms/af/FrameAtomsDecorator;)V", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "lastAtomDTO", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "decorateHelper", "Lru/ozon/uni/atoms/af/layout/DecorateHelper;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SingleAtom extends FrameLayout {
    public static final int $stable = 8;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final DecorateHelper decorateHelper;

    @NotNull
    private FrameAtomsDecorator decorator;

    @NotNull
    private final GeneratorId generator;
    private AtomDTO lastAtomDTO;

    @NotNull
    private final Pair<String, SingleAtom>[] tag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleAtom(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void bind$default(SingleAtom singleAtom, AtomDTO atomDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        singleAtom.bind(atomDTO, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearLayout() {
        this.decorateHelper.lockDecoration();
        if (getChildCount() > 0) {
            removeViewAt(0);
        }
        this.lastAtomDTO = null;
        this.decorateHelper.unLockDecoration();
    }

    private final FrameLayout.LayoutParams layoutParams(Atom<AtomDTO, Atom.AtomConfiguration> holder) {
        return holder instanceof WrappedAtomHolder ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(-1, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(Atom<AtomDTO, Atom.AtomConfiguration> holder) {
        Pair<String, SingleAtom>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        this.decorateHelper.lockDecoration();
        if (getChildCount() > 0) {
            removeViewAt(0);
        }
        FrameLayout.LayoutParams modifyFrameLayoutParams = this.decorator.modifyFrameLayoutParams(layoutParams(holder), holder.getData(), 0, true);
        holder.onLayoutParamsChanged(modifyFrameLayoutParams);
        holder.setTestId(this.generator.generateId(holder, 0));
        addView(holder.getContainerView(), 0, modifyFrameLayoutParams);
        this.lastAtomDTO = holder.getData();
        this.decorateHelper.unLockDecoration();
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    public final void bind(@NotNull AtomDTO dto, boolean forceChange) {
        AtomsAdapter atomsAdapter;
        AtomsAdapter atomsAdapter2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        if ((!Intrinsics.d(dto, this.lastAtomDTO) || forceChange || ((atomsAdapter2 = this.atomsAdapter) != null && atomsAdapter2.getIsRebindRequired())) && (atomsAdapter = this.atomsAdapter) != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, C7714v.a0(dto));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Pair<String, SingleAtom>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        super.onLayout(changed, left, top, right, bottom);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<String, SingleAtom>[] pairArr = this.tag;
        OzTrace.beginTrace(null, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Unit unit = Unit.f71690a;
        OzTrace.endTrace();
    }

    public final void onRecycle() {
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.onRecycle();
        }
    }

    public final void setAtomsFactory(AtomsFactory factory) {
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setFactory(factory);
        }
    }

    public final void setDecorator(@NotNull FrameAtomsDecorator frameAtomsDecorator) {
        Intrinsics.checkNotNullParameter(frameAtomsDecorator, "<set-?>");
        this.decorator = frameAtomsDecorator;
    }

    public final void setGenerator$uni_release(@NotNull GeneratorId generatorId) {
        Intrinsics.checkNotNullParameter(generatorId, "generatorId");
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(generatorId);
        }
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> onAction) {
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setOnAction(onAction);
        }
    }

    public /* synthetic */ SingleAtom(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleAtom(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = new Pair[]{new Pair("layout", this)};
        this.decorator = new DefaultAtomDecorator(context);
        GeneratorId create = AtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.generator = create;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.addObserver(new SingleAtom$atomsAdapter$1$1(this));
        atomsAdapter.setGenerator(create);
        this.atomsAdapter = atomsAdapter;
        this.decorateHelper = new DecorateHelper(context);
    }
}
