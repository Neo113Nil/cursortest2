package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/p;", "", "Landroidx/lifecycle/h;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/h;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "[Landroidx/lifecycle/h;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC2191p {

    @NotNull
    private final InterfaceC2183h[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(InterfaceC2183h[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new A();
        InterfaceC2183h[] interfaceC2183hArr = this.generatedAdapters;
        if (interfaceC2183hArr.length > 0) {
            InterfaceC2183h interfaceC2183h = interfaceC2183hArr[0];
            throw null;
        }
        if (interfaceC2183hArr.length <= 0) {
            return;
        }
        InterfaceC2183h interfaceC2183h2 = interfaceC2183hArr[0];
        throw null;
    }
}
