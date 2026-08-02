package androidx.compose.ui.node;

import B.InterfaceC1035j;
import J.a;
import X.j;
import X.o;
import X9.m;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.b;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import e0.k;
import i3.C4527h;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u00012\u00020\u0001:\u0004*148B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001d\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010(\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0018R.\u00100\u001a\u0004\u0018\u00010\u00002\b\u0010)\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u000bR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u001fR\u0018\u0010>\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010+R(\u0010E\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010H\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010\u000b\u001a\u0004\b4\u0010\"\"\u0004\bG\u0010$R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u001fR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u0000078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00109R\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u001fR*\u0010Y\u001a\u00020R2\u0006\u0010S\u001a\u00020R8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bT\u0010V\"\u0004\bW\u0010XR\u001a\u0010^\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010[\u001a\u0004\b\\\u0010]R*\u0010e\u001a\u00020_2\u0006\u0010S\u001a\u00020_8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\b1\u0010b\"\u0004\bc\u0010dR*\u0010k\u001a\u00020f2\u0006\u0010S\u001a\u00020f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010g\u001a\u0004\bF\u0010h\"\u0004\bi\u0010jR*\u0010s\u001a\u00020l2\u0006\u0010S\u001a\u00020l8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR*\u0010{\u001a\u00020t2\u0006\u0010S\u001a\u00020t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010\u0082\u0001\u001a\u00020|8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0004\b=\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u001f\u0010\u0089\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b`\u0010\u0088\u0001R\u001f\u0010\u008e\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\bA\u0010\u008d\u0001R%\u0010\u0091\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010\u001f\u001a\u0005\b\u008f\u0001\u0010&\"\u0005\b\u0090\u0001\u0010\u0018R3\u0010\u0099\u0001\u001a\u00030\u0092\u00012\u0007\u0010S\u001a\u00030\u0092\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u009b\u0001R\u001d\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u0000078@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u009d\u0001R\u001c\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u001cR\u0017\u0010¡\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010-R\u0016\u0010¢\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010&R\u0017\u0010¥\u0001\u001a\u00030£\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bI\u0010¤\u0001R\u001c\u0010¨\u0001\u001a\b0¦\u0001R\u00030\u008a\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bP\u0010§\u0001R\u0019\u0010«\u0001\u001a\u0004\u0018\u00010K8@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R$\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u0000078@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b¬\u0001\u0010\n\u001a\u0006\b\u0086\u0001\u0010\u009d\u0001R\u0015\u0010®\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\"R\u0015\u0010¯\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0017\u0010²\u0001\u001a\u00030°\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bN\u0010±\u0001R\u0016\u0010´\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010&R\u0015\u0010µ\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\"R\u0017\u0010¸\u0001\u001a\u00030¶\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b;\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00030¶\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010·\u0001R\u0017\u0010½\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b*\u0010¼\u0001¨\u0006¾\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "D", "()V", "I", "", "toString", "()Ljava/lang/String;", "LN/d;", "canvas", "c", "(LN/d;)V", "forceRequest", "scheduleMeasureAndLayout", "G", "(ZZ)V", "E", "(Z)V", "", "LV/f;", "q", "()Ljava/util/List;", "z", "a", "Z", com.google.crypto.tink.integration.android.b.f37029b, "getSemanticsId", "()I", "setSemanticsId", "(I)V", "C", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", W9.d.f13160a, "Landroidx/compose/ui/node/LayoutNode;", m.f13664a, "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)V", "lookaheadRoot", com.bumptech.glide.gifdecoder.e.f29601m, "virtualChildrenCount", "LX/m;", "f", "LX/m;", "_foldedChildren", "LC/a;", "g", "LC/a;", "_unfoldedChildren", C4527h.f48087o, "unfoldedVirtualChildrenListDirty", com.google.android.material.shape.i.f35755A, "_foldedParent", "Landroidx/compose/ui/node/d;", "<set-?>", "j", "Landroidx/compose/ui/node/d;", "s", "()Landroidx/compose/ui/node/d;", "owner", "k", "setDepth$ui_release", "depth", "l", "ignoreRemeasureRequests", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_collapsedSemantics", "n", "_zSortedChildren", "o", "zSortedChildrenInvalidated", "LV/e;", EventKeys.VALUE_KEY, "p", "LV/e;", "()LV/e;", "setMeasurePolicy", "(LV/e;)V", "measurePolicy", "LX/e;", "LX/e;", "getIntrinsicsPolicy$ui_release", "()LX/e;", "intrinsicsPolicy", "Le0/d;", "r", "Le0/d;", "()Le0/d;", "setDensity", "(Le0/d;)V", "density", "Le0/k;", "Le0/k;", "()Le0/k;", "setLayoutDirection", "(Le0/k;)V", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/platform/n;", "t", "Landroidx/compose/ui/platform/n;", "getViewConfiguration", "()Landroidx/compose/ui/platform/n;", "setViewConfiguration", "(Landroidx/compose/ui/platform/n;)V", "viewConfiguration", "LB/j;", "u", "LB/j;", "getCompositionLocalMap", "()LB/j;", "setCompositionLocalMap", "(LB/j;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$g;", "v", "Landroidx/compose/ui/node/LayoutNode$g;", "()Landroidx/compose/ui/node/LayoutNode$g;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$g;)V", "intrinsicsUsageByParent", "w", "previousIntrinsicsUsageByParent", "LX/n;", C5444x.f55808b, "LX/n;", "()LX/n;", "nodes", "Landroidx/compose/ui/node/b;", "y", "Landroidx/compose/ui/node/b;", "()Landroidx/compose/ui/node/b;", "layoutDelegate", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "innerLayerCoordinatorIsDirty", "LJ/a;", "A", "LJ/a;", "getModifier", "()LJ/a;", "setModifier", "(LJ/a;)V", "modifier", "", "()F", ViewProps.Z_INDEX, "()LC/a;", "_children", "getChildren$ui_release", "children", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$e;", "()Landroidx/compose/ui/node/LayoutNode$e;", "layoutState", "Landroidx/compose/ui/node/b$a;", "()Landroidx/compose/ui/node/b$a;", "measurePassDelegate", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemantics", "getZSortedChildren$annotations", "zSortedChildren", "width", "height", "LX/i;", "()LX/i;", "mDrawScope", "B", "isPlaced", "placeOrder", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "LV/a;", "()LV/a;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 14 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1461:1\n1242#1,7:1468\n1242#1,7:1540\n1067#1,2:1548\n1069#1,2:1562\n197#1:1565\n1230#1,7:1963\n197#1:2138\n197#1:2150\n197#1:2162\n1242#1,7:2174\n1182#2:1462\n1161#2,2:1463\n1182#2:1465\n1161#2,2:1466\n1182#2:1475\n1161#2,2:1476\n1182#2:1611\n1161#2,2:1612\n1182#2:1675\n1161#2,2:1676\n1182#2:1749\n1161#2,2:1750\n1182#2:1860\n1161#2,2:1861\n1182#2:1924\n1161#2,2:1925\n1182#2:2006\n1161#2,2:2007\n1182#2:2091\n1161#2,2:2092\n48#3:1478\n48#3:1513\n48#3:1528\n48#3:1550\n460#4,7:1479\n146#4:1486\n467#4,4:1487\n460#4,11:1491\n476#4,11:1502\n460#4,11:1514\n460#4,11:1529\n460#4,11:1551\n146#4:1564\n460#4,11:1566\n460#4,11:2045\n460#4,11:2139\n460#4,11:2151\n460#4,11:2163\n76#5:1525\n76#5:1527\n76#5:1547\n78#5:1577\n78#5:1640\n101#5:1714\n88#5:1788\n90#5,3:1804\n94#5:1808\n90#5:1813\n92#5,3:1815\n90#5:1821\n86#5:1888\n86#5:1908\n72#5:1970\n72#5:1990\n84#5:2056\n74#5:2125\n72#5:2126\n72#5:2130\n72#5:2132\n74#5:2133\n1#6:1526\n700#7,8:1578\n723#7,3:1586\n708#7,2:1589\n711#7,2:1634\n726#7,3:1636\n713#7:1639\n700#7,8:1641\n723#7,3:1649\n708#7,2:1652\n701#7:1654\n702#7,11:1698\n726#7,3:1709\n713#7:1712\n703#7:1713\n700#7,8:1715\n723#7,3:1723\n708#7,2:1726\n701#7:1728\n702#7,11:1772\n726#7,3:1783\n713#7:1786\n703#7:1787\n723#7,3:1810\n726#7,3:1818\n739#7,18:1822\n757#7,3:1883\n751#7:1886\n742#7:1887\n700#7,8:1889\n723#7,3:1897\n708#7,2:1900\n701#7:1902\n702#7,11:1947\n726#7,3:1958\n713#7:1961\n703#7:1962\n700#7,8:1971\n723#7,3:1979\n708#7,2:1982\n701#7:1984\n702#7,11:2029\n726#7,3:2040\n713#7:2043\n703#7:2044\n723#7,3:2127\n726#7,3:2135\n383#8,6:1591\n393#8,2:1598\n395#8,8:1603\n403#8,9:1614\n412#8,8:1626\n383#8,6:1655\n393#8,2:1662\n395#8,8:1667\n403#8,9:1678\n412#8,8:1690\n383#8,6:1729\n393#8,2:1736\n395#8,8:1741\n403#8,9:1752\n412#8,8:1764\n383#8,6:1840\n393#8,2:1847\n395#8,8:1852\n403#8,9:1863\n412#8,8:1875\n383#8,5:1903\n388#8:1909\n393#8,2:1911\n395#8,8:1916\n403#8,9:1927\n412#8,8:1939\n383#8,5:1985\n388#8:1991\n393#8,2:1993\n395#8,8:1998\n403#8,9:2009\n412#8,8:2021\n383#8,6:2071\n393#8,2:2078\n395#8,8:2083\n403#8,9:2094\n412#8,8:2106\n261#9:1597\n261#9:1661\n261#9:1735\n261#9:1814\n261#9:1846\n261#9:1910\n261#9:1992\n261#9:2077\n261#9:2131\n261#9:2134\n234#10,3:1600\n237#10,3:1623\n234#10,3:1664\n237#10,3:1687\n234#10,3:1738\n237#10,3:1761\n234#10,3:1849\n237#10,3:1872\n234#10,3:1913\n237#10,3:1936\n234#10,3:1995\n237#10,3:2018\n234#10,3:2080\n237#10,3:2103\n365#11,15:1789\n47#12:1807\n52#13:1809\n107#14:2057\n96#14,13:2058\n109#14:2114\n101#14,10:2115\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1468,7\n490#1:1540,7\n524#1:1548,2\n524#1:1562,2\n593#1:1565\n1110#1:1963,7\n1278#1:2138\n1300#1:2150\n1312#1:2162\n1348#1:2174,7\n128#1:1462\n128#1:1463,2\n539#1:1465\n539#1:1466,2\n140#1:1475\n140#1:1476,2\n656#1:1611\n656#1:1612,2\n678#1:1675\n678#1:1676,2\n690#1:1749\n690#1:1750,2\n1058#1:1860\n1058#1:1861,2\n1094#1:1924\n1094#1:1925,2\n1192#1:2006\n1192#1:2007,2\n1221#1:2091\n1221#1:2092,2\n144#1:1478\n368#1:1513\n480#1:1528\n525#1:1550\n144#1:1479,7\n146#1:1486\n144#1:1487,4\n197#1:1491,11\n199#1:1502,11\n368#1:1514,11\n480#1:1529,11\n525#1:1551,11\n555#1:1564\n593#1:1566,11\n1196#1:2045,11\n1278#1:2139,11\n1300#1:2151,11\n1312#1:2163,11\n416#1:1525\n463#1:1527\n520#1:1547\n656#1:1577\n678#1:1640\n690#1:1714\n846#1:1788\n1048#1:1804,3\n1048#1:1808\n1050#1:1813\n1050#1:1815,3\n1058#1:1821\n1094#1:1888\n1095#1:1908\n1192#1:1970\n1193#1:1990\n1221#1:2056\n1251#1:2125\n1251#1:2126\n1253#1:2130\n1254#1:2132\n1258#1:2133\n656#1:1578,8\n656#1:1586,3\n656#1:1589,2\n656#1:1634,2\n656#1:1636,3\n656#1:1639\n678#1:1641,8\n678#1:1649,3\n678#1:1652,2\n678#1:1654\n678#1:1698,11\n678#1:1709,3\n678#1:1712\n678#1:1713\n690#1:1715,8\n690#1:1723,3\n690#1:1726,2\n690#1:1728\n690#1:1772,11\n690#1:1783,3\n690#1:1786\n690#1:1787\n1049#1:1810,3\n1049#1:1818,3\n1058#1:1822,18\n1058#1:1883,3\n1058#1:1886\n1058#1:1887\n1094#1:1889,8\n1094#1:1897,3\n1094#1:1900,2\n1094#1:1902\n1094#1:1947,11\n1094#1:1958,3\n1094#1:1961\n1094#1:1962\n1192#1:1971,8\n1192#1:1979,3\n1192#1:1982,2\n1192#1:1984\n1192#1:2029,11\n1192#1:2040,3\n1192#1:2043\n1192#1:2044\n1252#1:2127,3\n1252#1:2135,3\n656#1:1591,6\n656#1:1598,2\n656#1:1603,8\n656#1:1614,9\n656#1:1626,8\n678#1:1655,6\n678#1:1662,2\n678#1:1667,8\n678#1:1678,9\n678#1:1690,8\n690#1:1729,6\n690#1:1736,2\n690#1:1741,8\n690#1:1752,9\n690#1:1764,8\n1058#1:1840,6\n1058#1:1847,2\n1058#1:1852,8\n1058#1:1863,9\n1058#1:1875,8\n1094#1:1903,5\n1094#1:1909\n1094#1:1911,2\n1094#1:1916,8\n1094#1:1927,9\n1094#1:1939,8\n1192#1:1985,5\n1192#1:1991\n1192#1:1993,2\n1192#1:1998,8\n1192#1:2009,9\n1192#1:2021,8\n1221#1:2071,6\n1221#1:2078,2\n1221#1:2083,8\n1221#1:2094,9\n1221#1:2106,8\n656#1:1597\n678#1:1661\n690#1:1735\n1050#1:1814\n1058#1:1846\n1094#1:1910\n1192#1:1992\n1221#1:2077\n1253#1:2131\n1258#1:2134\n656#1:1600,3\n656#1:1623,3\n678#1:1664,3\n678#1:1687,3\n690#1:1738,3\n690#1:1761,3\n1058#1:1849,3\n1058#1:1872,3\n1094#1:1913,3\n1094#1:1936,3\n1192#1:1995,3\n1192#1:2018,3\n1221#1:2080,3\n1221#1:2103,3\n891#1:1789,15\n1048#1:1807\n1048#1:1809\n1221#1:2057\n1221#1:2058,13\n1221#1:2114\n1221#1:2115,10\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNode {

    /* renamed from: C, reason: collision with root package name */
    public static final f f17545C = new c();

    /* renamed from: D, reason: collision with root package name */
    public static final Function0 f17546D = a.f17576d;

    /* renamed from: E, reason: collision with root package name */
    public static final n f17547E = new b();

    /* renamed from: F, reason: collision with root package name */
    public static final Comparator f17548F = new Comparator() { // from class: X.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b10;
            b10 = LayoutNode.b((LayoutNode) obj, (LayoutNode) obj2);
            return b10;
        }
    };

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public J.a modifier;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isVirtual;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int semanticsId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isVirtualLookaheadRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public LayoutNode lookaheadRoot;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int virtualChildrenCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final X.m _foldedChildren;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public C.a _unfoldedChildren;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean unfoldedVirtualChildrenListDirty;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public LayoutNode _foldedParent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public d owner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int depth;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreRemeasureRequests;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public SemanticsConfiguration _collapsedSemantics;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final C.a _zSortedChildren;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean zSortedChildrenInvalidated;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public V.e measurePolicy;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final X.e intrinsicsPolicy;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public e0.d density;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public k layoutDirection;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public n viewConfiguration;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1035j compositionLocalMap;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public g intrinsicsUsageByParent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public g previousIntrinsicsUsageByParent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final X.n nodes;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.node.b layoutDelegate;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public boolean innerLayerCoordinatorIsDirty;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f17576d = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements n {
    }

    public static final class c extends f {
        public c() {
            super("Undefined intrinsics block and it is required");
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements V.e {

        /* renamed from: a, reason: collision with root package name */
        public final String f17582a;

        public f(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f17582a = error;
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            LayoutNode.this.getLayoutDelegate().j();
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f17588e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Ref.ObjectRef objectRef) {
            super(0);
            this.f17588e = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            int b10;
            X.n nodes = LayoutNode.this.getNodes();
            int a10 = o.a(8);
            b10 = nodes.b();
            if ((b10 & a10) != 0) {
                for (a.b g10 = nodes.g(); g10 != null; g10 = g10.f()) {
                    if ((g10.e() & a10) != 0) {
                        for (a.b bVar = g10; bVar != null; bVar = X.d.b(null)) {
                            bVar.e();
                        }
                    }
                }
            }
        }
    }

    public LayoutNode(boolean z10, int i10) {
        e0.d dVar;
        this.isVirtual = z10;
        this.semanticsId = i10;
        this._foldedChildren = new X.m(new C.a(new LayoutNode[16], 0), new h());
        this._zSortedChildren = new C.a(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = f17545C;
        this.intrinsicsPolicy = new X.e(this);
        dVar = j.f13360a;
        this.density = dVar;
        this.layoutDirection = k.Ltr;
        this.viewConfiguration = f17547E;
        this.compositionLocalMap = InterfaceC1035j.f505M.a();
        g gVar = g.NotUsed;
        this.intrinsicsUsageByParent = gVar;
        this.previousIntrinsicsUsageByParent = gVar;
        this.nodes = new X.n(this);
        this.layoutDelegate = new androidx.compose.ui.node.b(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = J.a.f5865a;
    }

    public static /* synthetic */ void F(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.E(z10);
    }

    public static /* synthetic */ void H(LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        layoutNode.G(z10, z11);
    }

    public static final int b(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.w() == layoutNode2.w() ? Intrinsics.compare(layoutNode.u(), layoutNode2.u()) : Float.compare(layoutNode.w(), layoutNode2.w());
    }

    public boolean A() {
        return this.owner != null;
    }

    public boolean B() {
        return o().n();
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void D() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i10 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            C.a aVar = this._unfoldedChildren;
            if (aVar == null) {
                aVar = new C.a(new LayoutNode[16], 0);
                this._unfoldedChildren = aVar;
            }
            aVar.g();
            C.a a10 = this._foldedChildren.a();
            int l10 = a10.l();
            if (l10 > 0) {
                Object[] k10 = a10.k();
                do {
                    LayoutNode layoutNode = (LayoutNode) k10[i10];
                    if (layoutNode.isVirtual) {
                        aVar.c(aVar.l(), layoutNode.y());
                    } else {
                        aVar.b(layoutNode);
                    }
                    i10++;
                } while (i10 < l10);
            }
            this.layoutDelegate.j();
        }
    }

    public final void E(boolean forceRequest) {
        d dVar;
        if (this.isVirtual || (dVar = this.owner) == null) {
            return;
        }
        d.d(dVar, this, false, forceRequest, 2, null);
    }

    public final void G(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        d dVar;
        if (this.ignoreRemeasureRequests || this.isVirtual || (dVar = this.owner) == null) {
            return;
        }
        d.h(dVar, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        o().m(forceRequest);
    }

    public final void I() {
        if (this.virtualChildrenCount > 0) {
            D();
        }
    }

    public final void c(N.d canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().p(canvas);
    }

    public V.a d() {
        return h();
    }

    /* renamed from: e, reason: from getter */
    public e0.d getDensity() {
        return this.density;
    }

    /* renamed from: f, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public int g() {
        return this.layoutDelegate.e();
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return y().f();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (!this.nodes.h(o.a(8)) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        j.b(this).getSnapshotObserver();
        new i(objectRef);
        throw null;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.f();
    }

    public final NodeCoordinator h() {
        return this.nodes.d();
    }

    /* renamed from: i, reason: from getter */
    public final g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: j, reason: from getter */
    public final androidx.compose.ui.node.b getLayoutDelegate() {
        return this.layoutDelegate;
    }

    /* renamed from: k, reason: from getter */
    public k getLayoutDirection() {
        return this.layoutDirection;
    }

    public final e l() {
        return this.layoutDelegate.g();
    }

    /* renamed from: m, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final X.i n() {
        j.b(this).getSharedDrawScope();
        return null;
    }

    public final b.a o() {
        return this.layoutDelegate.h();
    }

    /* renamed from: p, reason: from getter */
    public V.e getMeasurePolicy() {
        return this.measurePolicy;
    }

    public List q() {
        return this.nodes.e();
    }

    /* renamed from: r, reason: from getter */
    public final X.n getNodes() {
        return this.nodes;
    }

    /* renamed from: s, reason: from getter */
    public final d getOwner() {
        return this.owner;
    }

    public final LayoutNode t() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public String toString() {
        return androidx.compose.ui.platform.i.a(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final int u() {
        return o().k();
    }

    public int v() {
        return this.layoutDelegate.i();
    }

    public final float w() {
        return o().l();
    }

    public final C.a x() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.g();
            C.a aVar = this._zSortedChildren;
            aVar.c(aVar.l(), y());
            this._zSortedChildren.u(f17548F);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final C.a y() {
        I();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.a();
        }
        C.a aVar = this._unfoldedChildren;
        Intrinsics.checkNotNull(aVar);
        return aVar;
    }

    public final void z() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        if (outerCoordinator$ui_release == h()) {
            h().w();
        } else {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            android.support.v4.media.session.b.a(outerCoordinator$ui_release);
            throw null;
        }
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? Z.d.a() : i10);
    }
}
