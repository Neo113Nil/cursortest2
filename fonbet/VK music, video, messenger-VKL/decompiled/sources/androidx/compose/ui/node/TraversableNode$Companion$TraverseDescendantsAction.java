package androidx.compose.ui.node;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TraversableNode.kt */
/* loaded from: classes11.dex */
public final class TraversableNode$Companion$TraverseDescendantsAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] $VALUES;
    public static final TraversableNode$Companion$TraverseDescendantsAction CancelTraversal;
    public static final TraversableNode$Companion$TraverseDescendantsAction ContinueTraversal;
    public static final TraversableNode$Companion$TraverseDescendantsAction SkipSubtreeAndContinueTraversal;

    static {
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = new TraversableNode$Companion$TraverseDescendantsAction("ContinueTraversal", 0);
        ContinueTraversal = traversableNode$Companion$TraverseDescendantsAction;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction2 = new TraversableNode$Companion$TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = traversableNode$Companion$TraverseDescendantsAction2;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction3 = new TraversableNode$Companion$TraverseDescendantsAction("CancelTraversal", 2);
        CancelTraversal = traversableNode$Companion$TraverseDescendantsAction3;
        TraversableNode$Companion$TraverseDescendantsAction[] traversableNode$Companion$TraverseDescendantsActionArr = {traversableNode$Companion$TraverseDescendantsAction, traversableNode$Companion$TraverseDescendantsAction2, traversableNode$Companion$TraverseDescendantsAction3};
        $VALUES = traversableNode$Companion$TraverseDescendantsActionArr;
        $ENTRIES = new asp(traversableNode$Companion$TraverseDescendantsActionArr);
    }

    public TraversableNode$Companion$TraverseDescendantsAction() {
        throw null;
    }

    public static TraversableNode$Companion$TraverseDescendantsAction valueOf(String str) {
        return (TraversableNode$Companion$TraverseDescendantsAction) Enum.valueOf(TraversableNode$Companion$TraverseDescendantsAction.class, str);
    }

    public static TraversableNode$Companion$TraverseDescendantsAction[] values() {
        return (TraversableNode$Companion$TraverseDescendantsAction[]) $VALUES.clone();
    }
}
