package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.epx;
import xsna.hr80;
import xsna.itl;
import xsna.izs;
import xsna.jfo;
import xsna.mfo;
import xsna.npp0;
import xsna.o19;
import xsna.ony;
import xsna.q630;
import xsna.skd;
import xsna.ufo;

/* compiled from: DragAndDropNode.kt */
/* loaded from: classes11.dex */
public final class DragAndDropNode extends q630.c implements npp0, ufo, ony {
    public final o19 p;
    public DragAndDropNode q;
    public ufo r;
    public long s;

    /* compiled from: DragAndDropNode.kt */
    public static final class a extends Lambda implements izs<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction> {
        final /* synthetic */ jfo $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jfo jfoVar) {
            super(1);
            this.$event = jfoVar;
        }

        @Override // xsna.izs
        public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
            DragAndDropNode dragAndDropNode2 = dragAndDropNode;
            if (!dragAndDropNode2.b.o) {
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
            ufo ufoVar = dragAndDropNode2.r;
            if (ufoVar != null) {
                ufoVar.q0(this.$event);
            }
            dragAndDropNode2.r = null;
            dragAndDropNode2.q = null;
            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
        }
    }

    public DragAndDropNode() {
        this(null);
    }

    @Override // xsna.ufo
    public final void E0(final jfo jfoVar) {
        npp0 npp0Var;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.q;
        if (dragAndDropNode2 == null || !mfo.a(dragAndDropNode2, skd.e(jfoVar))) {
            if (this.b.o) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                hr80.K(this, new izs<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r4v1, types: [T, xsna.npp0] */
                    @Override // xsna.izs
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode3) {
                        DragAndDropNode dragAndDropNode4 = dragAndDropNode3;
                        DragAndDropNode dragAndDropNode5 = dragAndDropNode4;
                        DragAndDropNode dragAndDropNode6 = this;
                        dragAndDropNode6.getClass();
                        if (!itl.g(dragAndDropNode6).getDragAndDropManager().a(dragAndDropNode5) || !mfo.a(dragAndDropNode5, skd.e(jfoVar))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        Ref$ObjectRef.this.element = dragAndDropNode4;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                npp0Var = (npp0) ref$ObjectRef.element;
            } else {
                npp0Var = null;
            }
            dragAndDropNode = (DragAndDropNode) npp0Var;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            dragAndDropNode.P1(jfoVar);
            dragAndDropNode.E0(jfoVar);
            ufo ufoVar = this.r;
            if (ufoVar != null) {
                ufoVar.S1(jfoVar);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            ufo ufoVar2 = this.r;
            if (ufoVar2 != null) {
                ufoVar2.P1(jfoVar);
                ufoVar2.E0(jfoVar);
            }
            dragAndDropNode2.S1(jfoVar);
        } else if (!epx.f(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                dragAndDropNode.P1(jfoVar);
                dragAndDropNode.E0(jfoVar);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.S1(jfoVar);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.E0(jfoVar);
        } else {
            ufo ufoVar3 = this.r;
            if (ufoVar3 != null) {
                ufoVar3.E0(jfoVar);
            }
        }
        this.q = dragAndDropNode;
    }

    @Override // xsna.ufo
    public final void P1(jfo jfoVar) {
        ufo ufoVar = this.r;
        if (ufoVar != null) {
            ufoVar.P1(jfoVar);
            return;
        }
        DragAndDropNode dragAndDropNode = this.q;
        if (dragAndDropNode != null) {
            dragAndDropNode.P1(jfoVar);
        }
    }

    @Override // xsna.ufo
    public final void S1(jfo jfoVar) {
        ufo ufoVar = this.r;
        if (ufoVar != null) {
            ufoVar.S1(jfoVar);
        }
        DragAndDropNode dragAndDropNode = this.q;
        if (dragAndDropNode != null) {
            dragAndDropNode.S1(jfoVar);
        }
        this.q = null;
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.r = null;
        this.q = null;
    }

    @Override // xsna.ony, xsna.lp10
    public final void e(long j) {
        this.s = j;
    }

    @Override // xsna.npp0
    public final Object g0() {
        return this.p;
    }

    @Override // xsna.ufo
    public final boolean n0(jfo jfoVar) {
        DragAndDropNode dragAndDropNode = this.q;
        if (dragAndDropNode != null) {
            return dragAndDropNode.n0(jfoVar);
        }
        ufo ufoVar = this.r;
        if (ufoVar != null) {
            return ufoVar.n0(jfoVar);
        }
        return false;
    }

    @Override // xsna.ufo
    public final void q0(jfo jfoVar) {
        a aVar = new a(jfoVar);
        if (aVar.invoke(this) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        hr80.K(this, aVar);
    }

    @Override // xsna.ufo
    public final void v0(jfo jfoVar) {
        ufo ufoVar = this.r;
        if (ufoVar != null) {
            ufoVar.v0(jfoVar);
            return;
        }
        DragAndDropNode dragAndDropNode = this.q;
        if (dragAndDropNode != null) {
            dragAndDropNode.v0(jfoVar);
        }
    }

    public DragAndDropNode(Object obj) {
        this.p = o19.g;
        this.s = 0L;
    }
}
