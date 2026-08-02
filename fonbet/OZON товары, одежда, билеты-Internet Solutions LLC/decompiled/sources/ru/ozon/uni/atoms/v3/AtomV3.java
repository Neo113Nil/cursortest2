package ru.ozon.uni.atoms.v3;

import android.view.View;
import androidx.core.view.Y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk0.b;
import lk0.c;
import lk0.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007B\u0019\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00028\u0000H\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0016R\u001a\u0010\b\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/AtomDTO;", "DTO", "Landroid/view/View;", "V", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "Llk0/b;", "containerView", "", "atomContext", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "Llk0/d;", "parentHolder", "(Landroid/view/View;)Llk0/d;", "", "offscreenOffsetPercent", "", "onOffscreenPositionChanged", "(F)V", "onViewInOverlapBounds", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "onViewOutOfOverlapBounds", "item", "onBind", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/v3/AtomV3;", "onRecycle", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "parent", "Llk0/d;", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "getDefaultConfigurations", "()Ljava/util/Map;", "defaultConfigurations", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class AtomV3<DTO extends AtomDTO, V extends View> extends Atom<DTO, Atom.DefaultConfigurator> implements b {

    @NotNull
    private final V containerView;
    private d parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomV3(@NotNull V containerView, String str) {
        super(containerView, str);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final d parentHolder(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        while (view2 != null) {
            Object parent2 = view2.getParent();
            ?? r02 = parent2 instanceof View ? (View) parent2 : 0;
            if (r02 instanceof c) {
                return ((c) r02).b(view2);
            }
            view2 = r02;
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public V getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public Map<Atom.ConfCondition, Atom.DefaultConfigurator> getDefaultConfigurations() {
        return U.i(new Pair(new Atom.ConfCondition(AtomDTO.class, getAtomContext()), new Atom.DefaultConfigurator(0, 0, 0, 0, 15, null)));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    protected void onBind(@NotNull DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        final V containerView = getContainerView();
        int i11 = Y.f42258g;
        if (!containerView.isAttachedToWindow()) {
            containerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.uni.atoms.v3.AtomV3$onBind$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    containerView.removeOnAttachStateChangeListener(this);
                    d parentHolder = this.parentHolder(view);
                    if (parentHolder == null) {
                        this.trackViewAnalytics();
                        return;
                    }
                    if (parentHolder.isInVisibleBounds()) {
                        this.onViewInVisibleBounds();
                    }
                    parentHolder.addChild(this);
                    this.parent = parentHolder;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }
            });
            return;
        }
        d parentHolder = parentHolder(containerView);
        if (parentHolder == null) {
            trackViewAnalytics();
            return;
        }
        if (parentHolder.isInVisibleBounds()) {
            onViewInVisibleBounds();
        }
        parentHolder.addChild(this);
        this.parent = parentHolder;
    }

    @Override // lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        d dVar = this.parent;
        if (dVar != null) {
            dVar.removeChild(this);
        }
        this.parent = null;
    }

    @Override // lk0.b
    public void onViewInOverlapBounds() {
    }

    @Override // lk0.b
    public void onViewInVisibleBounds() {
        trackViewAnalytics();
    }

    @Override // lk0.b
    public void onViewOutOfOverlapBounds() {
    }

    @Override // lk0.b
    public void onViewOutOfVisibleBounds() {
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public /* bridge */ /* synthetic */ Atom withAction(Function1 function1) {
        return withAction((Function1<? super AtomAction, Unit>) function1);
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    @NotNull
    public AtomV3<DTO, V> withAction(Function1<? super AtomAction, Unit> onAction) {
        if (onAction == null) {
            onAction = AtomV3$withAction$1.INSTANCE;
        }
        setOnAtomAction(onAction);
        return this;
    }
}
