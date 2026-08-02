package hk0;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;

/* renamed from: hk0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6968a extends C6969b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6968a(@NotNull e<? extends d<? extends InterfaceC7968a>, ? extends InterfaceC7968a>... delegate) {
        super((e[]) Arrays.copyOf(delegate, delegate.length));
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // hk0.C6969b
    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends InterfaceC7968a> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ((ArrayList) getItems()).clear();
        ((ArrayList) getItems()).addAll(list);
        notifyDataSetChanged();
    }
}
