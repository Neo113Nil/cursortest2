package com.facebook.react.views.scroll;

import android.graphics.Rect;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u001c\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\bH\u0002J(\u0010$\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0'H\u0002J \u0010(\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0002J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\u0006\u0010+\u001a\u00020\u000fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u000bJ\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H\u0016J\u0016\u00101\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\b\u00104\u001a\u00020\u0015H\u0016J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0096\u0002J\u0010\u00107\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H\u0016J\u0016\u00108\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\u0016\u00109\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\u0011\u0010=\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010>\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/facebook/react/views/scroll/IntervalTree;", "", "Lcom/facebook/react/views/scroll/VirtualView;", "horizontal", "", "<init>", "(Z)V", "root", "Lcom/facebook/react/views/scroll/IntervalNode;", "idToIntervalNode", "", "", "rectToInterval", "Lcom/facebook/react/views/scroll/Interval;", "rect", "Landroid/graphics/Rect;", StackTraceHelper.ID_KEY, "height", "", "node", "updateHeight", "", "updateMax", "balanceFactor", "rotateRight", "parent", "rotateLeft", "balance", "compareIntervals", "i1", "i2", "insert", "intervalNode", "findMin", "delete", "target", "queryHelper", "interval", "results", "", "inorderTraversal", "", "query", "queryRect", "getVirtualView", "virtualViewID", "traverse", "add", "element", "addAll", "elements", "", "clear", "iterator", "", "remove", "removeAll", "retainAll", "size", "getSize", "()I", "contains", "containsAll", "isEmpty", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualViewContainerStateExperimental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/IntervalTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimentalKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,534:1\n1#2:535\n530#3,4:536\n530#3,4:540\n530#3,4:544\n530#3,4:548\n1869#4,2:552\n1869#4,2:554\n1740#4,3:556\n*S KotlinDebug\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/IntervalTree\n*L\n376#1:536,4\n413#1:540,4\n415#1:544,4\n455#1:548,4\n467#1:552,2\n499#1:554,2\n519#1:556,3\n*E\n"})
/* loaded from: classes2.dex */
public final class IntervalTree implements Collection<VirtualView>, KMutableCollection {
    private final boolean horizontal;

    @NotNull
    private final Map<String, IntervalNode> idToIntervalNode = new LinkedHashMap();

    @Nullable
    private IntervalNode root;

    public IntervalTree(boolean z10) {
        this.horizontal = z10;
    }

    private final IntervalNode balance(IntervalNode node) {
        updateHeight(node);
        updateMax(node);
        int balanceFactor = balanceFactor(node);
        if (balanceFactor > 1) {
            if (balanceFactor(node.getLeft()) < 0) {
                IntervalNode left = node.getLeft();
                if (left == null) {
                    throw new IllegalArgumentException("[IntervalTree] node.left must not be null when performing left rotation around it");
                }
                node.setLeft(rotateLeft(left));
            }
            return rotateRight(node);
        }
        if (balanceFactor >= -1) {
            return node;
        }
        if (balanceFactor(node.getRight()) > 0) {
            IntervalNode right = node.getRight();
            if (right == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when performing right rotation around it");
            }
            node.setRight(rotateRight(right));
        }
        return rotateLeft(node);
    }

    private final int balanceFactor(IntervalNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    private final int compareIntervals(Interval i12, Interval i22) {
        return i12.getStart() != i22.getStart() ? Intrinsics.compare(i12.getStart(), i22.getStart()) : i12.getEnd() != i22.getEnd() ? Intrinsics.compare(i12.getEnd(), i22.getEnd()) : i12.getId().compareTo(i22.getId());
    }

    private final IntervalNode delete(IntervalNode node, IntervalNode target) {
        if (node == null) {
            return null;
        }
        if (compareIntervals(target.getInterval(), node.getInterval()) < 0) {
            node.setLeft(delete(node.getLeft(), target));
        } else if (compareIntervals(target.getInterval(), node.getInterval()) > 0) {
            node.setRight(delete(node.getRight(), target));
        } else if (node.getLeft() == null) {
            node = node.getRight();
        } else if (node.getRight() == null) {
            node = node.getLeft();
        } else {
            IntervalNode right = node.getRight();
            if (right == null) {
                throw new IllegalArgumentException("[IntervalTree] node.right must not be null when finding node's successor");
            }
            IntervalNode findMin = findMin(right);
            node.setVirtualView(findMin.getVirtualView());
            node.setInterval(findMin.getInterval());
            node.setRight(delete(node.getRight(), findMin));
        }
        if (node == null) {
            return null;
        }
        return balance(node);
    }

    private final IntervalNode findMin(IntervalNode node) {
        IntervalNode findMin;
        IntervalNode left = node.getLeft();
        return (left == null || (findMin = findMin(left)) == null) ? node : findMin;
    }

    private final int height(IntervalNode node) {
        if (node != null) {
            return node.getHeight();
        }
        return 0;
    }

    private final void inorderTraversal(IntervalNode node, List<VirtualView> results) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.getLeft(), results);
        results.add(node.getVirtualView());
        inorderTraversal(node.getRight(), results);
    }

    private final IntervalNode insert(IntervalNode node, IntervalNode intervalNode) {
        if (node == null) {
            return intervalNode;
        }
        if (compareIntervals(intervalNode.getInterval(), node.getInterval()) < 0) {
            node.setLeft(insert(node.getLeft(), intervalNode));
        } else {
            node.setRight(insert(node.getRight(), intervalNode));
        }
        return balance(node);
    }

    private final void queryHelper(IntervalNode node, Interval interval, Set<String> results) {
        VirtualView virtualView;
        VirtualView virtualView2;
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            String str = "VirtualViewContainerStateExperimental:queryHelper";
            Rect rect = null;
            String virtualViewID = (node == null || (virtualView2 = node.getVirtualView()) == null) ? null : virtualView2.getVirtualViewID();
            if (node != null && (virtualView = node.getVirtualView()) != null) {
                rect = virtualView.getContainerRelativeRect();
            }
            E6.a.b(str, "Check node (" + virtualViewID + ", " + rect + ") against interval(" + interval.getStart() + ", " + interval.getEnd() + ")");
        }
        if (node == null || node.getMax() <= interval.getStart()) {
            return;
        }
        queryHelper(node.getLeft(), interval, results);
        if (node.getInterval().intersects(interval)) {
            results.add(node.getVirtualView().getVirtualViewID());
        }
        if (node.getInterval().getStart() < interval.getEnd()) {
            queryHelper(node.getRight(), interval, results);
        }
    }

    private final Interval rectToInterval(Rect rect, String id2) {
        if (this.horizontal) {
            int i10 = rect.left;
            int i11 = rect.right;
            if (id2 == null) {
                id2 = "";
            }
            return new Interval(i10, i11, id2);
        }
        int i12 = rect.top;
        int i13 = rect.bottom;
        if (id2 == null) {
            id2 = "";
        }
        return new Interval(i12, i13, id2);
    }

    public static /* synthetic */ Interval rectToInterval$default(IntervalTree intervalTree, Rect rect, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return intervalTree.rectToInterval(rect, str);
    }

    private final IntervalNode rotateLeft(IntervalNode parent) {
        IntervalNode right = parent.getRight();
        if (right == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's right must not be null when rotating left.");
        }
        IntervalNode left = right.getLeft();
        right.setLeft(parent);
        parent.setRight(left);
        updateHeight(parent);
        updateMax(parent);
        updateHeight(right);
        updateMax(right);
        return right;
    }

    private final IntervalNode rotateRight(IntervalNode parent) {
        IntervalNode left = parent.getLeft();
        if (left == null) {
            throw new IllegalArgumentException("[IntervalTree] AVL node's left must not be null when rotating right.");
        }
        IntervalNode right = left.getRight();
        left.setRight(parent);
        parent.setLeft(right);
        updateHeight(parent);
        updateMax(parent);
        updateHeight(left);
        updateMax(left);
        return left;
    }

    private final void updateHeight(IntervalNode node) {
        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);
    }

    private final void updateMax(IntervalNode node) {
        int end = node.getInterval().getEnd();
        IntervalNode left = node.getLeft();
        int max = left != null ? left.getMax() : Integer.MIN_VALUE;
        IntervalNode right = node.getRight();
        node.setMax(Math.max(end, Math.max(max, right != null ? right.getMax() : Integer.MIN_VALUE)));
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull Collection<? extends VirtualView> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (add((VirtualView) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public void clear() {
        this.root = null;
        this.idToIntervalNode.clear();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof VirtualView) {
            return contains((VirtualView) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.idToIntervalNode.size();
    }

    @Nullable
    public final VirtualView getVirtualView(@NotNull String virtualViewID) {
        Intrinsics.checkNotNullParameter(virtualViewID, "virtualViewID");
        IntervalNode intervalNode = this.idToIntervalNode.get(virtualViewID);
        if (intervalNode != null) {
            return intervalNode.getVirtualView();
        }
        return null;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<VirtualView> iterator() {
        ArrayList arrayList = new ArrayList();
        inorderTraversal(this.root, arrayList);
        return arrayList.iterator();
    }

    @NotNull
    public final Set<String> query(@NotNull Rect queryRect) {
        Intrinsics.checkNotNullParameter(queryRect, "queryRect");
        Interval rectToInterval$default = rectToInterval$default(this, queryRect, null, 2, null);
        HashSet hashSet = new HashSet();
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:query", "Querying tree for rect " + queryRect);
        }
        queryHelper(this.root, rectToInterval$default, hashSet);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:query", "Query results: " + hashSet);
        }
        return hashSet;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof VirtualView) {
            return remove((VirtualView) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new Error("IntervalTree does not support retainAll yet");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public final List<VirtualView> traverse() {
        ArrayList arrayList = new ArrayList();
        inorderTraversal(this.root, arrayList);
        return arrayList;
    }

    @Override // java.util.Collection
    public boolean add(@NotNull VirtualView element) {
        boolean z10;
        Intrinsics.checkNotNullParameter(element, "element");
        String virtualViewID = element.getVirtualViewID();
        IntervalNode intervalNode = this.idToIntervalNode.get(virtualViewID);
        if (intervalNode != null) {
            this.root = delete(this.root, intervalNode);
            z10 = false;
        } else {
            z10 = true;
        }
        IntervalNode intervalNode2 = new IntervalNode(rectToInterval(element.getContainerRelativeRect(), virtualViewID), element, 0, 0, null, null, 60, null);
        this.root = insert(this.root, intervalNode2);
        this.idToIntervalNode.put(virtualViewID, intervalNode2);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:IntervalTree: add", "New VirtualView: (" + element.getVirtualViewID() + ", " + element.getContainerRelativeRect() + "). Node interval " + intervalNode2.getInterval().getId());
        }
        return z10;
    }

    public boolean contains(@NotNull VirtualView element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.idToIntervalNode.containsKey(element.getVirtualViewID());
    }

    public boolean remove(@NotNull VirtualView element) {
        Intrinsics.checkNotNullParameter(element, "element");
        IntervalNode intervalNode = this.idToIntervalNode.get(element.getVirtualViewID());
        if (intervalNode == null) {
            return false;
        }
        this.root = delete(this.root, intervalNode);
        this.idToIntervalNode.remove(element.getVirtualViewID());
        return true;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
