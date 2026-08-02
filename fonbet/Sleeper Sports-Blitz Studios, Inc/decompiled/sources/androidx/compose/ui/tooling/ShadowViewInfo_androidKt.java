package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: ShadowViewInfo.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"stitchTrees", "", "Landroidx/compose/ui/tooling/ViewInfo;", "allViewInfoRoots", "ui-tooling"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShadowViewInfo_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ShadowViewInfo stitchTrees$lambda$9$lambda$7(Pair pair) {
        return (ShadowViewInfo) pair.component2();
    }

    public static final List<ViewInfo> stitchTrees(List<ViewInfo> list) {
        if (list.size() < 2) {
            return list;
        }
        List<ViewInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShadowViewInfo((ViewInfo) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList<ShadowViewInfo> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList4, ((ShadowViewInfo) it2.next()).getAllNodes());
        }
        ArrayList<ShadowViewInfo> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (ShadowViewInfo shadowViewInfo : arrayList5) {
            arrayList6.add(TuplesKt.to(shadowViewInfo.getLayoutInfo(), shadowViewInfo));
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj : arrayList6) {
            if (((Pair) obj).getFirst() != null) {
                arrayList7.add(obj);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList7) {
            LayoutInfo layoutInfo = (LayoutInfo) ((Pair) obj2).getFirst();
            Object obj3 = linkedHashMap.get(layoutInfo);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(layoutInfo, obj3);
            }
            ((List) obj3).add(obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList2);
        for (final ShadowViewInfo shadowViewInfo2 : arrayList3) {
            ShadowViewInfo shadowViewInfo3 = (ShadowViewInfo) SequencesKt.firstOrNull(SequencesKt.map(SequencesKt.filter(SequencesKt.flatMapIterable(shadowViewInfo2.getAllNodes(), new Function1() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    Iterable stitchTrees$lambda$9$lambda$5;
                    stitchTrees$lambda$9$lambda$5 = ShadowViewInfo_androidKt.stitchTrees$lambda$9$lambda$5(linkedHashMap, (ShadowViewInfo) obj4);
                    return stitchTrees$lambda$9$lambda$5;
                }
            }), new Function1() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    boolean stitchTrees$lambda$9$lambda$6;
                    stitchTrees$lambda$9$lambda$6 = ShadowViewInfo_androidKt.stitchTrees$lambda$9$lambda$6(ShadowViewInfo.this, (Pair) obj4);
                    return Boolean.valueOf(stitchTrees$lambda$9$lambda$6);
                }
            }), new Function1() { // from class: androidx.compose.ui.tooling.ShadowViewInfo_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    ShadowViewInfo stitchTrees$lambda$9$lambda$7;
                    stitchTrees$lambda$9$lambda$7 = ShadowViewInfo_androidKt.stitchTrees$lambda$9$lambda$7((Pair) obj4);
                    return stitchTrees$lambda$9$lambda$7;
                }
            }));
            if (shadowViewInfo3 != null) {
                shadowViewInfo2.setNewParent(shadowViewInfo3);
                linkedHashSet.remove(shadowViewInfo2);
            }
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet2, 10));
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            arrayList8.add(((ShadowViewInfo) it3.next()).toViewInfo());
        }
        return arrayList8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable stitchTrees$lambda$9$lambda$5(Map map, ShadowViewInfo shadowViewInfo) {
        LayoutInfo layoutInfo = shadowViewInfo.getLayoutInfo();
        List list = (List) map.get(layoutInfo != null ? layoutInfo.getParentInfo() : null);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stitchTrees$lambda$9$lambda$6(ShadowViewInfo shadowViewInfo, Pair pair) {
        return !Intrinsics.areEqual(((ShadowViewInfo) pair.getSecond()).findRoot(), shadowViewInfo);
    }
}
