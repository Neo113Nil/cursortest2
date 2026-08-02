package ru.ozon.uni.utils;

import B0.A0;
import C1.i;
import C1.m;
import D1.E0;
import I1.A;
import I1.D;
import I1.z;
import U7.d;
import androidx.compose.ui.e;
import java.lang.Enum;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u00022\u00020\u00042\u00020\u00052\u00020\u0006B1\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R4\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lru/ozon/uni/utils/UniTestTagModifierNode;", "", "", "T", "Landroidx/compose/ui/e$c;", "LC1/i;", "LD1/E0;", "tag", "", "Lru/ozon/uni/utils/UniTestTagParameter;", "", "customInfo", "packageName", "<init>", "(Ljava/lang/Enum;Ljava/util/Map;Ljava/lang/String;)V", "LI1/D;", "", "applySemantics", "(LI1/D;)V", "Ljava/lang/Enum;", "getTag", "()Ljava/lang/Enum;", "setTag", "(Ljava/lang/Enum;)V", "Ljava/util/Map;", "getCustomInfo", "()Ljava/util/Map;", "setCustomInfo", "(Ljava/util/Map;)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "", "shouldClearDescendantSemantics", "Z", "getShouldClearDescendantSemantics", "()Z", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTestTagModifierNode<T extends Enum<T>> extends e.c implements i, E0 {

    @NotNull
    private Map<UniTestTagParameter<T>, String> customInfo;

    @NotNull
    private final String packageName;
    private final boolean shouldClearDescendantSemantics;
    private final boolean shouldMergeDescendantSemantics;

    @NotNull
    private T tag;

    public UniTestTagModifierNode(@NotNull T tag, @NotNull Map<UniTestTagParameter<T>, String> customInfo, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(customInfo, "customInfo");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.tag = tag;
        this.customInfo = customInfo;
        this.packageName = packageName;
    }

    @Override // D1.E0
    public void applySemantics(@NotNull D d11) {
        m mVar;
        String V11;
        Intrinsics.checkNotNullParameter(d11, "<this>");
        if (getNode().isAttached()) {
            String simpleName = this.tag.getClass().getSimpleName();
            if (!h.A(simpleName, "TestTags", false)) {
                throw new IllegalArgumentException(A0.b("Имя класса ", this.tag.getClass().getName(), " должно заканчиваться на \"TestTags\"").toString());
            }
            String U10 = h.U(simpleName, "TestTags");
            mVar = UniTestTagsKt.ModifierLocalUniCustomTestTags;
            String str = (String) ((Map) G(mVar)).get(this.tag);
            if (str == null) {
                str = this.tag.name();
            }
            if (this.customInfo.isEmpty()) {
                V11 = "";
            } else {
                Set<Map.Entry<UniTestTagParameter<T>, String>> entrySet = this.customInfo.entrySet();
                int h11 = U.h(C7714v.z(entrySet, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                Iterator<T> it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Pair pair = new Pair(((UniTestTagParameter) entry.getKey()).getKey(), entry.getValue());
                    linkedHashMap.put(pair.e(), pair.f());
                }
                V11 = C7714v.V(linkedHashMap.entrySet(), null, "[", "]", null, 57);
            }
            UniGlobalConfig uniGlobalConfig = UniGlobalConfig.INSTANCE;
            z.t(d11, (uniGlobalConfig.getEnablePackageNamePrefixInTestTags() ? d.e(this.packageName, ":id/") : "") + U10 + "." + str + V11);
            A.a(d11, uniGlobalConfig.getTestTagsAsResourceId());
        }
    }

    @Override // D1.E0
    public boolean getShouldClearDescendantSemantics() {
        return this.shouldClearDescendantSemantics;
    }

    @Override // D1.E0
    public boolean getShouldMergeDescendantSemantics() {
        return this.shouldMergeDescendantSemantics;
    }

    public final void setCustomInfo(@NotNull Map<UniTestTagParameter<T>, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.customInfo = map;
    }

    public final void setTag(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<set-?>");
        this.tag = t2;
    }
}
