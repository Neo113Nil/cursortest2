package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ComposeViewAdapter.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\b\u0010 \u001a\u00020\u0003H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006,"}, d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "fileName", "", "lineNumber", "", "bounds", "Landroidx/compose/ui/unit/IntRect;", FirebaseAnalytics.Param.LOCATION, "Landroidx/compose/ui/tooling/data/SourceLocation;", ViewHierarchyNode.JsonKeys.CHILDREN, "", "layoutInfo", "name", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getLineNumber", "()I", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "getChildren", "()Ljava/util/List;", "getLayoutInfo", "()Ljava/lang/Object;", "getName", "hasBounds", "", "allChildren", InAppPurchaseConstants.METHOD_TO_STRING, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ViewInfo {
    public static final int $stable = 8;
    private final IntRect bounds;
    private final List<ViewInfo> children;
    private final String fileName;
    private final Object layoutInfo;
    private final int lineNumber;
    private final SourceLocation location;
    private final String name;

    public static /* synthetic */ ViewInfo copy$default(ViewInfo viewInfo, String str, int i, IntRect intRect, SourceLocation sourceLocation, List list, Object obj, String str2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = viewInfo.fileName;
        }
        if ((i2 & 2) != 0) {
            i = viewInfo.lineNumber;
        }
        if ((i2 & 4) != 0) {
            intRect = viewInfo.bounds;
        }
        if ((i2 & 8) != 0) {
            sourceLocation = viewInfo.location;
        }
        if ((i2 & 16) != 0) {
            list = viewInfo.children;
        }
        if ((i2 & 32) != 0) {
            obj = viewInfo.layoutInfo;
        }
        if ((i2 & 64) != 0) {
            str2 = viewInfo.name;
        }
        Object obj3 = obj;
        String str3 = str2;
        List list2 = list;
        IntRect intRect2 = intRect;
        return viewInfo.copy(str, i, intRect2, sourceLocation, list2, obj3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final IntRect getBounds() {
        return this.bounds;
    }

    /* renamed from: component4, reason: from getter */
    public final SourceLocation getLocation() {
        return this.location;
    }

    public final List<ViewInfo> component5() {
        return this.children;
    }

    /* renamed from: component6, reason: from getter */
    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ViewInfo copy(String fileName, int lineNumber, IntRect bounds, SourceLocation location, List<ViewInfo> children, Object layoutInfo, String name) {
        return new ViewInfo(fileName, lineNumber, bounds, location, children, layoutInfo, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) other;
        return Intrinsics.areEqual(this.fileName, viewInfo.fileName) && this.lineNumber == viewInfo.lineNumber && Intrinsics.areEqual(this.bounds, viewInfo.bounds) && Intrinsics.areEqual(this.location, viewInfo.location) && Intrinsics.areEqual(this.children, viewInfo.children) && Intrinsics.areEqual(this.layoutInfo, viewInfo.layoutInfo) && Intrinsics.areEqual(this.name, viewInfo.name);
    }

    public int hashCode() {
        int hashCode = ((((this.fileName.hashCode() * 31) + Integer.hashCode(this.lineNumber)) * 31) + this.bounds.hashCode()) * 31;
        SourceLocation sourceLocation = this.location;
        int hashCode2 = (((hashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31) + this.children.hashCode()) * 31;
        Object obj = this.layoutInfo;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.name;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public ViewInfo(String str, int i, IntRect intRect, SourceLocation sourceLocation, List<ViewInfo> list, Object obj, String str2) {
        this.fileName = str;
        this.lineNumber = i;
        this.bounds = intRect;
        this.location = sourceLocation;
        this.children = list;
        this.layoutInfo = obj;
        this.name = str2;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final IntRect getBounds() {
        return this.bounds;
    }

    public final SourceLocation getLocation() {
        return this.location;
    }

    public final List<ViewInfo> getChildren() {
        return this.children;
    }

    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean hasBounds() {
        return (this.bounds.getBottom() == 0 || this.bounds.getRight() == 0) ? false : true;
    }

    public final List<ViewInfo> allChildren() {
        List<ViewInfo> list = this.children;
        List<ViewInfo> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ViewInfo) it.next()).allChildren());
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0057, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.fileName);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.lineNumber);
        sb.append(",\n            |bounds=(top=");
        sb.append(this.bounds.getTop());
        sb.append(", left=");
        sb.append(this.bounds.getLeft());
        sb.append(",\n            |location=");
        SourceLocation sourceLocation = this.location;
        if (sourceLocation != null) {
            str = "(" + sourceLocation.getOffset() + 'L' + sourceLocation.getLength();
        }
        str = "<none>";
        sb.append(str);
        sb.append("\n            |bottom=");
        sb.append(this.bounds.getBottom());
        sb.append(", right=");
        sb.append(this.bounds.getRight());
        sb.append("),\n            |childrenCount=");
        sb.append(this.children.size());
        sb.append(')');
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
