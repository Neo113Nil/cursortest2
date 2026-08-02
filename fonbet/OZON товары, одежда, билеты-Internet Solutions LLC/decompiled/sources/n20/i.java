package n20;

import I0.C3173b;
import Sc.InterfaceC4008j;
import Sc.n;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Arrays;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00130\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u001fR\u0017\u0010(\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u001fR\u001b\u0010-\u001a\u00020\u00178@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0019¨\u0006."}, d2 = {"Ln20/i;", "", "", "vertical", "component", "", "versions", "<init>", "(Ljava/lang/String;Ljava/lang/String;[J)V", "Lk20/g;", "storage", "Lj20/a;", "config", "(Lk20/g;)Lj20/a;", "", "Lm20/a;", "Ll20/c;", "viewMappers", "(Lk20/g;)[Lm20/a;", "Lk20/e;", "Lhi/a;", "widgetComponent", "(Lk20/g;)[Lk20/e;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getVertical", "getComponent", "[J", "getVersions", "()[J", "key", "getKey", "widgetKey", "getWidgetKey-h2e_X-s", "hash$delegate", "LSc/j;", "getHash$composer_widget", "hash", "composer-widget"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class i {

    @NotNull
    private final String component;

    /* renamed from: hash$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hash;

    @NotNull
    private final String key;

    @NotNull
    private final long[] versions;

    @NotNull
    private final String vertical;

    @NotNull
    private final String widgetKey;

    public i(@NotNull String vertical, @NotNull String component, @NotNull long[] versions) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(versions, "versions");
        this.vertical = vertical;
        this.component = component;
        this.versions = versions;
        String value = G.g.c(vertical, ".", component);
        this.key = value;
        Intrinsics.checkNotNullParameter(value, "value");
        this.widgetKey = value;
        this.hash = Sc.k.a(n.NONE, new Function0() { // from class: n20.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int hash_delegate$lambda$0;
                hash_delegate$lambda$0 = i.hash_delegate$lambda$0(i.this);
                return Integer.valueOf(hash_delegate$lambda$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int hash_delegate$lambda$0(i iVar) {
        return Arrays.hashCode(iVar.versions) + G.g.a(iVar.vertical.hashCode() * 31, 31, iVar.component);
    }

    @NotNull
    public abstract InterfaceC7243a<? extends Object> config(@NotNull C7475g storage);

    public boolean equals(Object other) {
        return super.equals(other);
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    public final int getHash$composer_widget() {
        return ((Number) this.hash.getValue()).intValue();
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final long[] getVersions() {
        return this.versions;
    }

    @NotNull
    public final String getVertical() {
        return this.vertical;
    }

    @NotNull
    /* renamed from: getWidgetKey-h2e_X-s, reason: not valid java name and from getter */
    public final String getWidgetKey() {
        return this.widgetKey;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.vertical;
        String str2 = this.component;
        String arrays = Arrays.toString(this.versions);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        StringBuilder sb2 = new StringBuilder("WidgetFactory(vertical='");
        sb2.append(str);
        sb2.append("', component='");
        return C3173b.c(sb2, str2, "', versions=", arrays, ")");
    }

    @NotNull
    public abstract InterfaceC8046a<?, ? extends l20.c>[] viewMappers(@NotNull C7475g storage);

    @NotNull
    public abstract C7473e<? extends InterfaceC6958a>[] widgetComponent(@NotNull C7475g storage);

    public /* synthetic */ i(String str, String str2, long[] jArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? j.b() : jArr);
    }
}
