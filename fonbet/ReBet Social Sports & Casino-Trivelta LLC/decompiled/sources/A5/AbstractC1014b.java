package A5;

import android.util.SparseBooleanArray;
import android.widget.AbsListView;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: A5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1014b {
    public static final String c(AbsListView absListView) {
        int choiceMode = absListView.getChoiceMode();
        return choiceMode != 0 ? choiceMode != 1 ? choiceMode != 2 ? choiceMode != 3 ? "" : "CHOICE_MODE_MULTIPLE_MODAL" : "CHOICE_MODE_MULTIPLE" : "CHOICE_MODE_SINGLE" : "CHOICE_MODE_NONE";
    }

    public static final List d(SparseBooleanArray sparseBooleanArray) {
        List createListBuilder = CollectionsKt.createListBuilder();
        int size = createListBuilder.size();
        for (int i10 = 0; i10 < size; i10++) {
            createListBuilder.add(Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
