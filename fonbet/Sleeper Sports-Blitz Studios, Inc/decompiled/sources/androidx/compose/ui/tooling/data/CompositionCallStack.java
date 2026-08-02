package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SlotTree.jvm.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0005H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0010H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\tH\u0002J\u0010\u00107\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00068"}, d2 = {"Landroidx/compose/ui/tooling/data/CompositionCallStack;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/data/SourceContext;", "factory", "Lkotlin/Function3;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "contexts", "", "", "", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/util/Map;)V", StackTraceHelper.STACK_KEY, "Lkotlin/collections/ArrayDeque;", "currentCallIndex", "", "convert", "Landroidx/compose/ui/unit/IntRect;", "group", "callIndex", "out", "", "name", "getName", "()Ljava/lang/String;", "isInline", "", "()Z", "value", "bounds", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", FirebaseAnalytics.Param.LOCATION, "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "parameters", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "()Ljava/util/List;", "depth", "getDepth", "()I", MetricTracker.Place.PUSH, "", "pop", SentryThread.JsonKeys.CURRENT, "getCurrent", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "parentGroup", "parentDepth", "contextOf", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", TtmlNode.TAG_INFORMATION, "isCall", "ui-tooling-data"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CompositionCallStack<T> implements SourceContext {
    private final Map<String, Object> contexts;
    private int currentCallIndex;
    private final Function3<CompositionGroup, SourceContext, List<? extends T>, T> factory;
    private final ArrayDeque<CompositionGroup> stack = new ArrayDeque<>();
    private IntRect bounds = SlotTreeKt.getEmptyBox();

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionCallStack(Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> function3, Map<String, Object> map) {
        this.factory = function3;
        this.contexts = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r2 = androidx.compose.ui.tooling.data.SlotTreeKt.boundsOfLayoutNode(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IntRect convert(CompositionGroup group, int callIndex, List<T> out) {
        IntRect boundsOfLayoutNode;
        ArrayList arrayList = new ArrayList();
        IntRect emptyBox = SlotTreeKt.getEmptyBox();
        push(group);
        int i = 0;
        for (CompositionGroup compositionGroup : group.getCompositionGroups()) {
            emptyBox = SlotTreeKt.union(emptyBox, convert(compositionGroup, i, arrayList));
            if (isCall(compositionGroup)) {
                i++;
            }
        }
        Object node = group.getNode();
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (layoutInfo != null && boundsOfLayoutNode != null) {
            emptyBox = boundsOfLayoutNode;
        }
        this.currentCallIndex = callIndex;
        this.bounds = emptyBox;
        T invoke = this.factory.invoke(group, this, arrayList);
        if (invoke != null) {
            out.add(invoke);
        }
        pop();
        return emptyBox;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        int i;
        String sourceInfo = getCurrent().getSourceInfo();
        if (sourceInfo == null) {
            return null;
        }
        if (!StringsKt.startsWith$default(sourceInfo, "CC(", false, 2, (Object) null)) {
            i = StringsKt.startsWith$default(sourceInfo, "C(", false, 2, (Object) null) ? 2 : 3;
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) sourceInfo, ')', 0, false, 6, (Object) null);
        if (indexOf$default > 2) {
            String substring = sourceInfo.substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String sourceInfo = getCurrent().getSourceInfo();
        return sourceInfo != null && StringsKt.startsWith$default(sourceInfo, "CC", false, 2, (Object) null);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String sourceInfo;
        SourceInformationContext contextOf;
        String sourceInfo2;
        CompositionGroup parentGroup = parentGroup(1);
        if (parentGroup == null || (sourceInfo = parentGroup.getSourceInfo()) == null || (contextOf = contextOf(sourceInfo)) == null) {
            return null;
        }
        int i = 2;
        SourceInformationContext sourceInformationContext = contextOf;
        while (i < this.stack.size()) {
            if ((sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null) != null) {
                break;
            }
            int i2 = i + 1;
            CompositionGroup parentGroup2 = parentGroup(i);
            sourceInformationContext = (parentGroup2 == null || (sourceInfo2 = parentGroup2.getSourceInfo()) == null) ? null : contextOf(sourceInfo2);
            i = i2;
        }
        return contextOf.sourceLocation(this.currentCallIndex, sourceInformationContext);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        SourceInformationContext contextOf;
        List<ParameterInformation> extractParameterInfo;
        CompositionGroup current = getCurrent();
        String sourceInfo = current.getSourceInfo();
        if (sourceInfo == null || (contextOf = contextOf(sourceInfo)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, current.getData());
        extractParameterInfo = SlotTreeKt.extractParameterInfo(arrayList, contextOf);
        return extractParameterInfo;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.size();
    }

    private final void push(CompositionGroup group) {
        this.stack.addLast(group);
    }

    private final CompositionGroup pop() {
        return this.stack.removeLast();
    }

    private final CompositionGroup getCurrent() {
        return this.stack.last();
    }

    private final CompositionGroup parentGroup(int parentDepth) {
        if (this.stack.size() <= parentDepth) {
            return null;
        }
        return this.stack.get((r0.size() - parentDepth) - 1);
    }

    private final SourceInformationContext contextOf(String information) {
        Map<String, Object> map = this.contexts;
        Object obj = map.get(information);
        if (obj == null) {
            obj = SlotTreeKt.sourceInformationContextOf$default(information, null, 2, null);
            map.put(information, obj);
        }
        if (obj instanceof SourceInformationContext) {
            return (SourceInformationContext) obj;
        }
        return null;
    }

    private final boolean isCall(CompositionGroup group) {
        String sourceInfo = group.getSourceInfo();
        if (sourceInfo != null) {
            return StringsKt.startsWith$default(sourceInfo, "C", false, 2, (Object) null);
        }
        return false;
    }
}
